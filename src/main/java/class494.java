import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public abstract class class494 extends class404 {

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "Z")
    public boolean field6829;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "S")
    public short field6835;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "B")
    public byte field6833;

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "S")
    public short field6839;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "S")
    public short field6838;

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "S")
    public short field6831;

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "Luh;")
    public static class168 field6832 = new class168();

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "Lmu;")
    public static class303 field6844 = new class303(107, 6);

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
    public static int field6827;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
    public static int field6828;

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
    public static int field6830;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
    public static int field6836;

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
    public static int field6837;

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "I")
    public static int field6840;

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "I")
    public static int field6841;

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "I")
    public static int field6842;

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "Lin;")
    public static class91 field6843;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "(I)Z")
    public final boolean method939(int arg0) {
        ++field6828;
        if (arg0 != 0) {
            this.field6835 = -75;
        }
        for (int var2 = this.field6831; var2 <= this.field6839; ++var2) {
            for (int var3 = this.field6838; ~this.field6835 <= ~var3; ++var3) {
                int var4 = -class134.field2256 + var2 + class708.field9611;
                if (~var4 <= -1 && ~var4 > ~class196.field2890.length) {
                    int var5 = var3 - class492.field6813 + class708.field9611;
                    if (var5 >= 0 && ~var5 > ~class196.field2890.length && class196.field2890[var4][var5]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)Z")
    public final boolean method937(byte arg0) {
        ++field6836;
        return arg0 > -51 ? true : class42.method539(super.field5921, this.field6835, this.field6838, this.method38(true), this.field6831, (byte) 116, this.field6839);
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(B)I")
    public static final int method2904(byte arg0) {
        ++field6842;
        int var1 = -71 % ((-2 - arg0) / 44);
        return class314.field4353++;
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(B)V")
    public void method46(byte arg0) {
        if (arg0 <= -109) {
            ++field6834;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BII)Z")
    public static final boolean method2905(byte arg0, int arg1, int arg2) {
        ++field6840;
        if (arg0 >= -21) {
            return true;
        } else if (!class311.field4321) {
            return false;
        } else {
            int var3 = arg2 >> 16;
            int var4 = arg2 & 65535;
            if (class396.field5798[var3] != null && class396.field5798[var3][var4] != null) {
                class378 var5 = class396.field5798[var3][var4];
                if (arg1 == -1 && var5.field5450 == 0) {
                    for (class324 var6 = (class324) class528.field7301.method1269(4); var6 != null; var6 = (class324) class528.field7301.method1264((byte) 56)) {
                        if (~var6.field4505 == -7 || ~var6.field4505 == -1012 || var6.field4505 == 13 || var6.field4505 == 18 || var6.field4505 == 16) {
                            for (class378 var7 = class60.method633(1512932720, var6.field4504); var7 != null; var7 = class254.method1732(var7, 3)) {
                                if (var5.field5506 == var7.field5506) {
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    for (class324 var8 = (class324) class528.field7301.method1269(4); var8 != null; var8 = (class324) class528.field7301.method1264((byte) 93)) {
                        if (var8.field4499 == arg1 && var5.field5506 == var8.field4504 && (~var8.field4505 == -7 || ~var8.field4505 == -1012 || ~var8.field4505 == -14 || ~var8.field4505 == -19 || ~var8.field4505 == -17)) {
                            return true;
                        }
                    }
                }
                return false;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
    public class494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        super.field5927 = arg3;
        this.field6829 = arg9;
        this.field6835 = (short) arg8;
        super.field5922 = arg2;
        this.field6833 = arg10;
        this.field6839 = (short) arg6;
        super.field5933 = arg4;
        super.field5926 = (byte) arg0;
        this.field6838 = (short) arg7;
        this.field6831 = (short) arg5;
        super.field5921 = (byte) arg1;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lbf;I)I")
    public static final int method2906(class536 arg0, int arg1) {
        ++field6830;
        if (class599.field8216 == arg0) {
            return 9216;
        } else if (class589.field8030 == arg0) {
            return 34065;
        } else if (class210.field2988 == arg0) {
            return 34066;
        } else {
            if (arg1 != 25602) {
                method2908(-121, (class665) null);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(Z)V")
    public static void method2907(boolean arg0) {
        field6843 = null;
        field6844 = null;
        field6832 = null;
        if (!arg0) {
            method2904((byte) -121);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([Lab;I)I")
    public final int method935(class669[] arg0, int arg1) {
        ++field6841;
        int var3 = 0;
        label114: for (int var4 = this.field6831; ~this.field6839 <= ~var4; ++var4) {
            label112: for (int var5 = this.field6838; this.field6835 >= var5; ++var5) {
                long var6 = class582.field7967[super.field5926][var4][var5];
                long var8 = 0L;
                while (true) {
                    label107: while (true) {
                        if (var8 > 48L) {
                            continue label112;
                        }
                        int var10 = (int) (var6 >>> (int) var8 & 65535L);
                        if (~var10 >= -1) {
                            continue label112;
                        }
                        class2 var11 = class394.field5788[var10 + -1];
                        for (int var12 = 0; var3 > var12; ++var12) {
                            if (arg0[var12] == var11.field18) {
                                var8 += 16L;
                                continue label107;
                            }
                        }
                        arg0[var3++] = var11.field18;
                        if (~var3 == -5) {
                            break label114;
                        }
                        var8 += 16L;
                    }
                }
            }
        }
        int var13 = 17 % ((arg1 - -14) / 61);
        for (int var14 = var3; ~var14 > -5; ++var14) {
            arg0[var14] = null;
        }
        if (this.field6833 != 0) {
            int var15 = -class134.field2256 + this.field6831;
            int var16 = -class492.field6813 + this.field6838;
            short var17;
            short var18;
            int var19;
            int var20;
            if (~this.field6833 == -2) {
                if (var15 >= var16) {
                    var17 = this.field6831;
                    var18 = this.field6838;
                    var19 = this.field6838 - -1;
                    var20 = this.field6831 - 1;
                } else {
                    var18 = this.field6838;
                    var19 = this.field6838 + -1;
                    var17 = this.field6831;
                    var20 = this.field6831 + 1;
                }
            } else if (~var16 < ~(-var15)) {
                var20 = this.field6831 + -1;
                var18 = this.field6838;
                var19 = this.field6838 + -1;
                var17 = this.field6831;
            } else {
                var19 = this.field6838 + 1;
                var17 = this.field6831;
                var18 = this.field6838;
                var20 = this.field6831 + 1;
            }
            label78: for (int var21 = 0; ~var21 > ~var3; ++var21) {
                long var22 = class582.field7967[super.field5926][var17][var19];
                while (var22 != 0L) {
                    class2 var28 = class394.field5788[(int) ((var22 & 65535L) + -1L)];
                    var22 >>>= 16;
                    if (arg0[var21] == var28.field18) {
                        continue label78;
                    }
                }
                long var24 = class582.field7967[super.field5926][var20][var18];
                while (~var24 != -1L) {
                    class2 var27 = class394.field5788[(int) ((65535L & var24) + -1L)];
                    var24 >>>= 16;
                    if (arg0[var21] == var27.field18) {
                        continue label78;
                    }
                }
                for (int var26 = var21; var26 < var3 - 1; ++var26) {
                    arg0[var26] = arg0[var26 - -1];
                }
                --var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILua;)I")
    public static final int method2908(int arg0, class665 arg1) {
        ++field6837;
        int var2 = arg1.method3733((byte) -24, 2);
        if (arg0 != 1) {
            field6832 = null;
        }
        int var3;
        if (var2 != 0) {
            if (var2 == 1) {
                var3 = arg1.method3733((byte) -24, 5);
            } else if (~var2 != -3) {
                var3 = arg1.method3733((byte) -24, 11);
            } else {
                var3 = arg1.method3733((byte) -24, 8);
            }
        } else {
            var3 = 0;
        }
        return var3;
    }
}
