import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public abstract class class132 implements class590 {

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "Lmv;")
    public class295 field1923;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "Lpv;")
    public class167 field1909;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "Lmv;")
    private class295 field1915;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "Lvg;")
    public static class622 field1914 = new class622(76, -1);

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "Loba;")
    public static class324 field1919 = new class324();

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "[I")
    public static int[] field1921 = new int[3];

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "Lsea;")
    public static class373 field1922 = new class373("stellardawn", 1);

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "I")
    public static int field1924 = -1;

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "[I")
    public static int[] field1925 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 };

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    private int field1910;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "J")
    private long field1917;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "Lla;")
    private class393 field1912;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 7)
    public void method940(int arg0) {
        if (arg0 == -32557) {
            field1913++;
            class606 var2 = class40.method230(this.field1915, this.field1909.field2333, 9);
            this.field1912 = class332.field4821.method684(var2, class616.method3518(this.field1923, this.field1909.field2333), true);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)Z", line = 22)
    public boolean method941(byte arg0) {
        field1920++;
        if (arg0 >= -15) {
            return false;
        }
        boolean var2 = true;
        if (!this.field1923.method1818(this.field1909.field2333, 4)) {
            var2 = false;
        }
        if (!this.field1915.method1818(this.field1909.field2333, 4)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)I", line = 42)
    public final int method942(int arg0) {
        field1916++;
        if (arg0 != 17686) {
            this.method942(-63);
        }
        int var2 = class199.field2714.method3312(true);
        int var3 = var2 * 100;
        if (this.field1910 == var2 && var2 != 0) {
            int var4 = class199.field2714.method3306(46);
            if (var2 < var4) {
                long var5 = this.field1917 - class199.field2714.method3308(-1);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class60.method371(false) - this.field1917) * 10000L;
                    if (var7 <= var9) {
                        var3 = var4 * 100;
                    } else {
                        var3 = (int) (var9 * 100L * (long) (var4 - var2) / var7 + ((long) (var2 * 100)));
                    }
                }
            }
        } else {
            this.field1910 = var2;
            this.field1917 = class60.method371(false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)V", line = 91)
    public static void method943(boolean arg0) {
        field1914 = null;
        field1922 = null;
        field1919 = null;
        field1925 = null;
        if (arg0) {
            method943(false);
        }
        field1921 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZ)V", line = 109)
    public final void method944(int arg0, boolean arg1) {
        field1911++;
        int var3 = this.field1909.field2330.method3193(-30796, class677.field9591, this.field1909.field2337) + this.field1909.field2334;
        int var4 = this.field1909.field2336.method1916((byte) -103, class619.field8966, this.field1909.field2332) + this.field1909.field2335;
        this.method945(arg1, var3, arg0 ^ 0x7C52, var4);
        this.method939(arg0 ^ 0xFFFFE3DE, arg1, var4, var3);
        if (arg0 != -31764) {
            this.method944(64, true);
        }
        String var5 = class199.field2714.method3310((byte) -77);
        if ((class60.method371(false) - this.field1917) > 10000L) {
            var5 = var5 + " (" + class199.field2714.method3318((byte) -126).method3331((byte) -113) + ")";
        }
        this.field1912.method2448((byte) 118, this.field1909.field2329, -1, var5, this.field1909.field2332 / 2 + var4 + this.field1909.field2338 + 4, var3 - -(this.field1909.field2337 / 2));
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lmv;Lmv;Lpv;)V", line = 150)
    public class132(class295 arg0, class295 arg1, class167 arg2) {
        this.field1923 = arg0;
        this.field1909 = arg2;
        this.field1915 = arg1;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZII)V")
    public abstract void method939(int arg0, boolean arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZIII)V")
    public abstract void method945(boolean arg0, int arg1, int arg2, int arg3);
}
