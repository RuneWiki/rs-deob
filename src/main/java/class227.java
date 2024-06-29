import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class227 extends class123 {

    @OriginalMember(owner = "client!d", name = "ab", descriptor = "I")
    private int field3912 = 0;

    @OriginalMember(owner = "client!d", name = "X", descriptor = "I")
    private int field3909 = 1365;

    @OriginalMember(owner = "client!d", name = "Z", descriptor = "I")
    private int field3911 = 0;

    @OriginalMember(owner = "client!d", name = "kb", descriptor = "I")
    private int field3922 = 20;

    @OriginalMember(owner = "client!d", name = "gb", descriptor = "I")
    public static int field3918 = 0;

    @OriginalMember(owner = "client!d", name = "fb", descriptor = "I")
    public static int field3917 = 0;

    @OriginalMember(owner = "client!d", name = "hb", descriptor = "Lha;")
    public static class30 field3919 = new class30(64);

    @OriginalMember(owner = "client!d", name = "jb", descriptor = "Lv;")
    public static class147 field3921 = new class147(50);

    @OriginalMember(owner = "client!d", name = "Y", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!d", name = "bb", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!d", name = "cb", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!d", name = "db", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!d", name = "eb", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!d", name = "ib", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Leb;BILeb;)V")
    public static final void method1565(class230 arg0, byte arg1, int arg2, class230 arg3) {
        class167.method1236(arg3, (byte) 58, arg0, (class230) null, -1, arg2);
        if (arg1 < 6) {
            method1566(-59);
        }
        ++field3916;
    }

    @OriginalMember(owner = "client!d", name = "g", descriptor = "(I)Ldc;")
    public static final class226 method1566(int arg0) {
        ++field3914;
        try {
            if (arg0 != -22992) {
                method1566(66);
            }
            return (class226) Class.forName("fe").newInstance();
        } catch (Throwable var1) {
            return new class268();
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIBIII)V")
    public static final void method1567(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (arg3 <= -115) {
            class177[] var7 = class45.field793;
            for (int var8 = 0; ~var8 > ~var7.length; ++var8) {
                class177 var9 = var7[var8];
                if (var9 != null && var9.field3107 == 2) {
                    class27.method264((-class155.field2759 + var9.field3118 << 7) + var9.field3111, arg5 >> 1, arg4, (-class272.field4795 + var9.field3109 << 7) + var9.field3114, arg0 >> 1, var9.field3102 * 2, arg2, -46);
                    if (~class47.field840 < 0 && ~(class259.field4584 % 20) > -11) {
                        class162.field2894[var9.field3108].method106(class47.field840 + -12 + arg1, class106.field1924 + arg6 + -28);
                    }
                }
            }
            ++field3913;
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V")
    public class227() {
        super(0, true);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)[I")
    public final int[] method4(int arg0, byte arg1) {
        int var3 = -89 / ((-24 - arg1) / 57);
        ++field3920;
        int[] var4 = super.field2160.method1323((byte) 89, arg0);
        if (super.field2160.field3243) {
            for (int var5 = 0; ~var5 > ~class140.field2505; ++var5) {
                int var6 = (class214.field3705[var5] << 12) / this.field3909 - -this.field3912;
                int var7 = (class154.field2753[arg0] << 12) / this.field3909 + this.field3911;
                int var8 = var6;
                int var9 = var7;
                int var10 = var6;
                int var11 = var7;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                int var14 = var7 * var7 >> 12;
                while (var12 + var14 < 16384 && ~var13 > ~this.field3922) {
                    var9 = (var9 * var10 >> 12) * 2 - -var11;
                    var10 = var8 + var12 - var14;
                    var14 = var9 * var9 >> 12;
                    var12 = var10 * var10 >> 12;
                    ++var13;
                }
                var4[var5] = var13 >= this.field3922 + -1 ? 0 : (var13 << 12) / this.field3922;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Leb;B)I")
    public static final int method1568(class230 arg0, byte arg1) {
        ++field3915;
        if (class124.field2172 != null && ~arg0.method1635(-115) != -1) {
            if (arg1 != -2) {
                return -83;
            } else {
                for (int var2 = 0; ~class124.field2172.field2775 < ~var2; ++var2) {
                    if (class124.field2172.field2777[var2].method1627(class183.field3223, (byte) -39, class61.field1172).method1630(arg0, (byte) -125)) {
                        return var2;
                    }
                }
                return -1;
            }
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIILhj;IJZ)Z")
    public static final boolean method1569(int arg0, int arg1, int arg2, int arg3, int arg4, class70 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        } else {
            int var10 = arg1 - arg4;
            int var11 = arg2 - arg4;
            int var12 = arg1 + arg4;
            int var13 = arg2 + arg4;
            if (arg8) {
                if (arg6 > 640 && arg6 < 1408) {
                    var13 += 128;
                }
                if (arg6 > 1152 && arg6 < 1920) {
                    var12 += 128;
                }
                if (arg6 > 1664 || arg6 < 384) {
                    var11 -= 128;
                }
                if (arg6 > 128 && arg6 < 896) {
                    var10 -= 128;
                }
            }
            int var14 = var10 / 128;
            int var15 = var11 / 128;
            int var16 = var12 / 128;
            int var17 = var13 / 128;
            return class150.method1134(arg0, var14, var15, var16 - var14 + 1, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        if (arg2 != 1876195788) {
            field3921 = null;
        }
        ++field3910;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 == -4) {
                        this.field3911 = arg1.method161(4);
                    }
                } else {
                    this.field3912 = arg1.method161(4);
                }
            } else {
                this.field3922 = arg1.method161(4);
            }
        } else {
            this.field3909 = arg1.method161(arg2 ^ 1876195784);
        }
    }

    @OriginalMember(owner = "client!d", name = "h", descriptor = "(I)V")
    public static void method1570(int arg0) {
        field3919 = null;
        int var1 = -36 % ((arg0 - -9) / 45);
        field3921 = null;
    }
}
