import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class768 implements class403 {

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "Ltca;")
    private class184 field10587 = new class184(128);

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "[I")
    private int[] field10580 = new int[class2.field14.field10855];

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "[I")
    public int[] field10579 = new int[class2.field14.field10855];

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field10578;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field10582;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field10583;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field10584;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field10585;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field10586;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field10588;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field10589;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public static int field10590;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "Luq;")
    public static class172 field10581;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZI)I", line = 4)
    public final int method4227(boolean arg0, int arg1) {
        int var3 = 76 / ((62 - arg1) / 63);
        field10590++;
        long var4 = class401.method2440(false);
        for (class137 var6 = arg0 ? (class137) this.field10587.method1249((byte) -109) : (class137) this.field10587.method1246(true); var6 != null; var6 = (class137) this.field10587.method1246(true)) {
            if ((var6.field1846 & 0x3FFFFFFFFFFFFFFFL) < var4) {
                if ((var6.field1846 & 0x4000000000000000L) != 0L) {
                    int var7 = (int) var6.field2146;
                    this.field10579[var7] = this.field10580[var7];
                    var6.method1102((byte) 77);
                    return var7;
                }
                var6.method1102((byte) 98);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 43)
    public static void method4228(int arg0) {
        field10581 = null;
        if (arg0 > -61) {
            method4233(true);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)I", line = 53)
    public final int method2442(int arg0, int arg1) {
        field10588++;
        return arg1 <= 23 ? -65 : this.field10579[arg0];
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V", line = 67)
    public final void method4229(int arg0, int arg1, int arg2) {
        if (arg2 < 42) {
            return;
        }
        field10584++;
        class554 var4 = class547.field7563.method3719(0, arg1);
        int var5 = var4.field7643;
        int var6 = var4.field7640;
        int var7 = var4.field7642;
        int var8 = class559.field7664[var7 - var6];
        if (arg0 < 0 || arg0 > var8) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method4230(var9 & arg0 << var6 | ~var9 & this.field10580[var5], -110, var5);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(III)V", line = 96)
    public final void method4230(int arg0, int arg1, int arg2) {
        if (arg1 > -99) {
            this.field10587 = null;
        }
        field10585++;
        this.field10580[arg2] = arg0;
        class137 var4 = (class137) this.field10587.method1248(124, (long) arg2);
        if (var4 == null) {
            class137 var5 = new class137(4611686018427387905L);
            this.field10587.method1247(4070, (long) arg2, var5);
        } else if (var4.field1846 != 4611686018427387905L) {
            var4.field1846 = class401.method2440(false) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(III)V", line = 127)
    public final void method4231(int arg0, int arg1, int arg2) {
        field10589++;
        this.field10579[arg2] = arg0;
        class137 var4 = (class137) this.field10587.method1248(arg1 ^ 0x6B, (long) arg2);
        if (arg1 != 0) {
            this.method2443(-60, 105);
        }
        if (var4 == null) {
            class137 var5 = new class137(class401.method2440(false) + 500L);
            this.field10587.method1247(4070, (long) arg2, var5);
        } else {
            var4.field1846 = class401.method2440(false) + 500L;
        }
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(III)V", line = 150)
    public final void method4232(int arg0, int arg1, int arg2) {
        field10578++;
        class554 var4 = class547.field7563.method3719(0, arg0);
        int var5 = var4.field7643;
        int var6 = var4.field7640;
        int var7 = var4.field7642;
        int var8 = class559.field7664[var7 - var6];
        if (arg1 < 0 || var8 < arg1) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        int var10 = 50 / ((66 - arg2) / 36);
        this.method4231(this.field10579[var5] & ~var9 | var9 & arg1 << var6, 0, var5);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)I", line = 179)
    public final int method2443(int arg0, int arg1) {
        field10583++;
        class554 var3 = class547.field7563.method3719(arg0 ^ arg0, arg1);
        int var4 = var3.field7643;
        int var5 = var3.field7640;
        int var6 = var3.field7642;
        int var7 = class559.field7664[var6 - var5];
        return var7 & this.field10579[var4] >> var5;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)Lc;", line = 199)
    public static final class199 method4233(boolean arg0) {
        if (arg0) {
            field10581 = null;
        }
        field10582++;
        return class752.field10158;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V", line = 213)
    public final void method4234(byte arg0) {
        int var2 = 44 / ((35 - arg0) / 47);
        for (int var3 = 0; var3 < class2.field14.field10855; var3++) {
            class729 var4 = class2.field14.method4323((byte) -120, var3);
            if (var4 != null && var4.field9893 == 0) {
                this.field10580[var3] = 0;
                this.field10579[var3] = 0;
            }
        }
        field10586++;
        this.field10587 = new class184(128);
    }
}
