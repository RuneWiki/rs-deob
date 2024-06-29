import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class215 {

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    private int field3817 = -1;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    private int field3819 = 0;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "Ldd;")
    private class132 field3833 = new class132();

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "Z")
    public boolean field3835 = false;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    private int field3831;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    private int field3824;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "[Lmh;")
    private class151[] field3816;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "[[I")
    private int[][] field3827;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "Lqk;")
    public static class207 field3818 = class24.method212(255, "Veuillez patienter)3)3)3");

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
    public static int field3828 = 0;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "Lqk;")
    public static class207 field3826 = class24.method212(255, "::fps ");

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "[J")
    public static long[] field3825 = new long[32];

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IBI[B)I")
    public static final int method1535(int arg0, byte arg1, int arg2, byte[] arg3) {
        field3820++;
        int var4 = -1;
        for (int var5 = arg2; var5 < arg0; var5++) {
            var4 = class129.field2263[(arg3[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        if (arg1 != -96) {
            method1535(-90, (byte) -51, 104, (byte[]) null);
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1536(int arg0, int arg1, int arg2, int arg3) {
        if (class88.method642(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class4.method27(var4 + 1, class163.field2881[arg0][arg1][arg2] + arg3, var5 + 1) && class4.method27(var4 + 128 - 1, class163.field2881[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class4.method27(var4 + 128 - 1, class163.field2881[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class4.method27(var4 + 1, class163.field2881[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static void method1537(int arg0) {
        field3825 = null;
        if (arg0 == 0) {
            field3826 = null;
            field3818 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)[I")
    public final int[] method1538(int arg0, int arg1) {
        if (arg0 < 69) {
            field3825 = null;
        }
        field3814++;
        if (this.field3831 == this.field3824) {
            this.field3835 = this.field3816[arg1] == null;
            this.field3816[arg1] = class98.field1730;
            return this.field3827[arg1];
        } else if (this.field3831 == 1) {
            this.field3835 = this.field3817 != arg1;
            this.field3817 = arg1;
            return this.field3827[0];
        } else {
            class151 var3 = this.field3816[arg1];
            if (var3 == null) {
                this.field3835 = true;
                if (this.field3831 <= this.field3819) {
                    class151 var4 = (class151) this.field3833.method930(128);
                    var3 = new class151(arg1, var4.field2649);
                    this.field3816[var4.field2652] = null;
                    var4.method1346((byte) -16);
                } else {
                    var3 = new class151(arg1, this.field3819);
                    this.field3819++;
                }
                this.field3816[arg1] = var3;
            } else {
                this.field3835 = false;
            }
            this.field3833.method932(var3, true);
            return this.field3827[var3.field2649];
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
    public final void method1539(int arg0) {
        field3822++;
        if (arg0 != -1) {
            method1535(63, (byte) 98, 28, (byte[]) null);
        }
        for (int var2 = 0; var2 < this.field3831; var2++) {
            this.field3827[var2] = null;
        }
        this.field3816 = null;
        this.field3827 = null;
        this.field3833.method924(arg0 ^ 0x7890);
        this.field3833 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)[[I")
    public final int[][] method1540(byte arg0) {
        field3832++;
        if (this.field3831 != this.field3824) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != 4) {
            method1537(31);
        }
        for (int var2 = 0; var2 < this.field3831; var2++) {
            this.field3816[var2] = class98.field1730;
        }
        return this.field3827;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lqk;I)Lta;")
    public static final class254 method1541(class207 arg0, int arg1) {
        field3830++;
        for (class254 var2 = (class254) class157.field2786.method922((byte) 69); var2 != null; var2 = (class254) class157.field2786.method928(-87)) {
            if (var2.field4557.method1436(arg0, (byte) 71)) {
                return var2;
            }
        }
        if (arg1 != 1) {
            field3828 = 90;
        }
        return null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)V")
    public static final void method1542(int arg0, int arg1, int arg2) {
        field3829++;
        if (arg1 != 128) {
            field3834 = -3;
        }
        class244 var3 = class202.method1401(arg2, 31252);
        int var4 = var3.field4423;
        int var5 = var3.field4432;
        int var6 = var3.field4433;
        int var7 = class172.field3046[var6 - var4];
        if (arg0 < 0 || var7 < arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var4;
        class252.method1765((byte) -112, class85.field1543[var5] & ~var8 | var8 & arg0 << var4, var5);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILqk;)V")
    public static final void method1543(int arg0, class207 arg1) {
        field3815++;
        class254 var2 = (class254) class157.field2786.method922((byte) 37);
        int var3 = -17 % ((38 - arg0) / 35);
        while (var2 != null) {
            if (var2.field4557.method1436(arg1, (byte) 28)) {
                class1.field5 = var2;
                return;
            }
            var2 = (class254) class157.field2786.method928(-97);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II[III)V")
    public static final void method1544(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        int var5 = 44 / ((arg4 - 40) / 35);
        field3823++;
        int var9 = arg1 - 1;
        int var6 = var9 - 7;
        arg0--;
        while (arg0 < var6) {
            int var7 = arg0 + 1;
            arg2[var7] = arg3;
            int var8 = var7 + 1;
            arg2[var8] = arg3;
            int var10 = var8 + 1;
            arg2[var10] = arg3;
            int var11 = var10 + 1;
            arg2[var11] = arg3;
            int var12 = var11 + 1;
            arg2[var12] = arg3;
            int var13 = var12 + 1;
            arg2[var13] = arg3;
            int var14 = var13 + 1;
            arg2[var14] = arg3;
            arg0 = var14 + 1;
            arg2[arg0] = arg3;
        }
        while (var9 > arg0) {
            arg0++;
            arg2[arg0] = arg3;
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(III)V")
    public class215(int arg0, int arg1, int arg2) {
        this.field3831 = arg0;
        this.field3824 = arg1;
        this.field3816 = new class151[this.field3824];
        this.field3827 = new int[this.field3831][arg2];
    }
}
