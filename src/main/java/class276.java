import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class276 {

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "Lvm;")
    private class589 field3869 = new class589();

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    private int field3875;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    private int field3868;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "Llb;")
    private class465 field3865;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "Llb;")
    public static class465 field3879 = new class465(16);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "[I")
    public static int[] field3882;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lnba;B)Ljava/lang/Object;", line = 3)
    public final Object method1723(class249 arg0, byte arg1) {
        if (arg1 != -127) {
            this.field3868 = -18;
        }
        field3866++;
        long var3 = arg0.method1581(false);
        for (class415 var5 = (class415) this.field3865.method2799(var3, true); var5 != null; var5 = (class415) this.field3865.method2801(-116)) {
            if (var5.field5631.method1582(arg0, -16648)) {
                Object var6 = var5.method2446(-10061);
                if (var6 != null) {
                    if (var5.method2447(28)) {
                        class474 var7 = new class474(arg0, var6, var5.field5629);
                        this.field3865.method2797(arg1 - 4107, var7, var5.field5651);
                        this.field3869.method3500(var7, false);
                        var7.field7109 = 0L;
                        var5.method2457(-8422);
                        var5.method2987(-1);
                    } else {
                        this.field3869.method3500(var5, false);
                        var5.field7109 = 0L;
                    }
                    return var6;
                }
                var5.method2457(arg1 ^ 0x209B);
                var5.method2987(-1);
                this.field3875 += var5.field5629;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Laa;B)V", line = 58)
    private final void method1724(class415 arg0, byte arg1) {
        field3878++;
        if (arg1 != 123) {
            this.method1729(114);
        }
        if (arg0 != null) {
            arg0.method2457(arg1 ^ 0xFFFFDF61);
            arg0.method2987(-1);
            this.field3875 += arg0.field5629;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)I", line = 76)
    public final int method1725(int arg0) {
        field3871++;
        return arg0 >= -77 ? -60 : this.field3868;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)I", line = 87)
    public final int method1726(byte arg0) {
        if (arg0 == -34) {
            field3877++;
            return this.field3875;
        } else {
            return -127;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lnba;ZLjava/lang/Object;)V", line = 102)
    public final void method1727(class249 arg0, boolean arg1, Object arg2) {
        field3873++;
        if (arg1) {
            this.field3875 = -4;
        }
        this.method1728((byte) -57, arg2, arg0, 1);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BLjava/lang/Object;Lnba;I)V", line = 113)
    private final void method1728(byte arg0, Object arg1, class249 arg2, int arg3) {
        field3870++;
        if (arg0 != -57) {
            field3879 = null;
        }
        if (arg3 > this.field3868) {
            throw new IllegalStateException("s>cs");
        }
        this.method1731(arg2, (byte) -103);
        this.field3875 -= arg3;
        while (this.field3875 < 0) {
            class415 var6 = (class415) this.field3869.method3506(0);
            this.method1724(var6, (byte) 123);
        }
        class474 var5 = new class474(arg2, arg1, arg3);
        this.field3865.method2797(-4234, var5, arg2.method1581(false));
        this.field3869.method3500(var5, false);
        var5.field7109 = 0L;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V", line = 146)
    public final void method1729(int arg0) {
        for (class415 var2 = (class415) this.field3869.method3505(-4); var2 != null; var2 = (class415) this.field3869.method3501((byte) 63)) {
            if (var2.method2447(28)) {
                var2.method2457(-8422);
                var2.method2987(-1);
                this.field3875 += var2.field5629;
            }
        }
        if (arg0 < -7) {
            field3872++;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZLjava/lang/String;I)Z", line = 173)
    public static final boolean method1730(int arg0, boolean arg1, String arg2, int arg3) {
        field3876++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        if (arg3 != -1) {
            field3882 = null;
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (var11 >= arg0) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var6 + var11;
            if ((var10 / arg0) != var6) {
                return false;
            }
            var5 = true;
            var6 = var10;
        }
        return var5;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(Lnba;B)V", line = 250)
    private final void method1731(class249 arg0, byte arg1) {
        if (arg1 >= -24) {
            return;
        }
        field3880++;
        long var3 = arg0.method1581(false);
        for (class415 var5 = (class415) this.field3865.method2799(var3, true); var5 != null; var5 = (class415) this.field3865.method2801(-115)) {
            if (var5.field5631.method1582(arg0, -16648)) {
                this.method1724(var5, (byte) 123);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V", line = 275)
    public final void method1732(boolean arg0) {
        this.field3869.method3504((byte) 86);
        field3867++;
        if (arg0) {
            this.field3869 = null;
        }
        this.field3865.method2800(0);
        this.field3875 = this.field3868;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIBI)V", line = 295)
    public static final void method1733(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        for (class432 var7 = (class432) class626.field9219.method2233(true); var7 != null; var7 = (class432) class626.field9219.method2240(16772)) {
            if (var7.field5791 <= class617.field9123) {
                var7.method1783((byte) -116);
            } else {
                class270.method1703(-1, arg6 >> 1, var7.field5783 * 2, (var7.field5784 << 7) + 64, arg1, arg0 >> 1, arg4, (var7.field5789 << 7) + 64, var7.field5788);
                class114.field1608.method734(class524.field7487[1] + arg3, var7.field5786, 127, var7.field5781 | 0xFF000000, class524.field7487[0] + arg2, 0);
            }
        }
        if (arg5 < 68) {
            field3879 = null;
        }
        field3874++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V", line = 322)
    public final void method1734(int arg0, int arg1) {
        if (class404.field5530 != null) {
            for (class415 var3 = (class415) this.field3869.method3505(-84); var3 != null; var3 = (class415) this.field3869.method3501((byte) 16)) {
                if (var3.method2447(28)) {
                    if (var3.method2446(-10061) == null) {
                        var3.method2457(-8422);
                        var3.method2987(-1);
                        this.field3875 += var3.field5629;
                    }
                } else if (((long) arg1) < (++var3.field7109)) {
                    class415 var4 = class404.field5530.method1663(var3, arg0 ^ 0x6E92);
                    this.field3865.method2797(arg0 - 32616, var4, var3.field5651);
                    class324.method1947(var4, (byte) 28, var3);
                    var3.method2457(arg0 ^ 0xFFFFB1C4);
                    var3.method2987(-1);
                }
            }
        }
        if (arg0 != 28382) {
            this.field3869 = null;
        }
        field3864++;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(I)V", line = 380)
    public class276(int arg0) {
        this.field3875 = arg0;
        this.field3868 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3865 = new class465(var2);
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)V", line = 396)
    public static void method1735(byte arg0) {
        field3879 = null;
        if (arg0 <= 52) {
            method1730(-76, false, null, -13);
        }
        field3882 = null;
    }
}
