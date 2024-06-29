import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class121 {

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public int field1855;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "Lal;")
    public static class121 field1856 = new class121(1);

    @OriginalMember(owner = "client!al", name = "f", descriptor = "Lal;")
    public static class121 field1857 = new class121(2);

    @OriginalMember(owner = "client!al", name = "g", descriptor = "Lal;")
    public static class121 field1858 = new class121(4);

    @OriginalMember(owner = "client!al", name = "h", descriptor = "Lal;")
    public static class121 field1859 = new class121(1);

    @OriginalMember(owner = "client!al", name = "i", descriptor = "Lal;")
    public static class121 field1860 = new class121(2);

    @OriginalMember(owner = "client!al", name = "j", descriptor = "Lal;")
    public static class121 field1861 = new class121(4);

    @OriginalMember(owner = "client!al", name = "k", descriptor = "Lal;")
    public static class121 field1862 = new class121(2);

    @OriginalMember(owner = "client!al", name = "l", descriptor = "Lal;")
    public static class121 field1863 = new class121(4);

    @OriginalMember(owner = "client!al", name = "m", descriptor = "Llw;")
    public static class233 field1864 = new class233(3);

    @OriginalMember(owner = "client!al", name = "q", descriptor = "[I")
    public static int[] field1868 = new int[8];

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "[Ls;")
    public static class339[] field1867;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "[[Lcd;")
    public static class22[][] field1865;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILofa;)Ljava/lang/String;", line = 3)
    public static final String method950(int arg0, class301 arg1) {
        if (arg0 == 32767) {
            field1853++;
            return class41.method448(arg1, (byte) -23, 32767);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V", line = 17)
    public static void method951(byte arg0) {
        field1865 = null;
        field1859 = null;
        field1856 = null;
        field1862 = null;
        field1860 = null;
        field1858 = null;
        field1863 = null;
        field1857 = null;
        field1861 = null;
        if (arg0 <= 65) {
            method952(3L, (byte) 113);
        }
        field1868 = null;
        field1867 = null;
        field1864 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(JB)V", line = 39)
    public static final void method952(long arg0, byte arg1) {
        field1854++;
        if (arg1 != -30) {
            field1861 = null;
        }
        int var3 = class603.field8533 + class145.field2251.field9477;
        int var4 = class563.field7974 + class145.field2251.field9475;
        if ((class701.field9907 - var3) < -2000 || (class701.field9907 - var3) > 2000 || (class141.field2213 - var4) < -2000 || (class141.field2213 - var4) > 2000) {
            class701.field9907 = var3;
            class141.field2213 = var4;
        }
        if (class701.field9907 != var3) {
            int var5 = var3 - class701.field9907;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var5 < var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var6 < var5) {
                var6 = var5;
            }
            class701.field9907 += var6;
        }
        if (class141.field2213 != var4) {
            int var7 = var4 - class141.field2213;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class141.field2213 += var8;
        }
        class261.field4064 += (float) arg0 * class285.field4394 / 6.0F;
        class490.field7077 += (float) arg0 * class393.field5872 / 6.0F;
        class632.method3582((byte) 83);
    }

    @OriginalMember(owner = "client!al", name = "toString", descriptor = "()Ljava/lang/String;", line = 126)
    public final String toString() {
        field1852++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(I)V", line = 139)
    private class121(int arg0) {
        this.field1855 = arg0;
    }
}
