import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class82 extends class445 {

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
    public static int field1084 = -1;

    @OriginalMember(owner = "client!fn", name = "D", descriptor = "Z")
    public static boolean field1094 = true;

    @OriginalMember(owner = "client!fn", name = "v", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!fn", name = "w", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!fn", name = "x", descriptor = "I")
    public int field1089;

    @OriginalMember(owner = "client!fn", name = "y", descriptor = "I")
    public int field1090;

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "I")
    public int field1091;

    @OriginalMember(owner = "client!fn", name = "B", descriptor = "I")
    public int field1092;

    @OriginalMember(owner = "client!fn", name = "E", descriptor = "I")
    public int field1095;

    @OriginalMember(owner = "client!fn", name = "u", descriptor = "Lnk;")
    public class464 field1086;

    @OriginalMember(owner = "client!fn", name = "C", descriptor = "Lnk;")
    public class464 field1093;

    @OriginalMember(owner = "client!fn", name = "G", descriptor = "Ljava/lang/String;")
    public String field1096;

    @OriginalMember(owner = "client!fn", name = "H", descriptor = "Z")
    public boolean field1097;

    @OriginalMember(owner = "client!fn", name = "t", descriptor = "[Ljava/lang/Object;")
    public Object[] field1085;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIILmr;I)V")
    public static final void method528(int arg0, int arg1, int arg2, class86 arg3, int arg4) {
        if (arg4 != -20491) {
            method529((class296) null, (byte) -36);
        }
        field1088++;
        class280 var5 = arg3.method549(-112);
        int var6 = arg3.field1159 - arg3.field1143.field6472 & 0x3FFF;
        if (arg2 == -1) {
            if (var6 != 0 || arg3.field1148 > 25) {
                arg3.field1111 = false;
                if (arg0 < 0 && var5.field3746 != -1) {
                    arg3.field1122 = var5.field3746;
                } else if (arg0 <= 0 || var5.field3728 == -1) {
                    arg3.field1122 = var5.field3725;
                } else {
                    arg3.field1122 = var5.field3728;
                }
            } else if (!arg3.field1111 || !var5.method1581(104, arg3.field1122)) {
                arg3.field1122 = var5.method1585((byte) -43);
                arg3.field1111 = arg3.field1122 != -1;
            }
        } else if (arg3.field1154 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = class446.field6062[arg1] - arg3.field1143.field6472 & 0x3FFF;
            if (arg2 == 2 && var5.field3717 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field3763 != -1) {
                    arg3.field1122 = var5.field3763;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field3726 != -1) {
                    arg3.field1122 = var5.field3726;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field3753 == -1) {
                    arg3.field1122 = var5.field3717;
                } else {
                    arg3.field1122 = var5.field3753;
                }
            } else if (arg2 == 0 && var5.field3719 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field3722 != -1) {
                    arg3.field1122 = var5.field3722;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field3741 != -1) {
                    arg3.field1122 = var5.field3741;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field3761 == -1) {
                    arg3.field1122 = var5.field3719;
                } else {
                    arg3.field1122 = var5.field3761;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field3758 != -1) {
                arg3.field1122 = var5.field3758;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field3723 != -1) {
                arg3.field1122 = var5.field3723;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field3755 == -1) {
                arg3.field1122 = var5.field3725;
            } else {
                arg3.field1122 = var5.field3755;
            }
            arg3.field1111 = false;
        } else if (var6 == 0 && arg3.field1148 <= 25) {
            if (arg2 == 2 && var5.field3717 != -1) {
                arg3.field1122 = var5.field3717;
            } else if (arg2 == 0 && var5.field3719 != -1) {
                arg3.field1122 = var5.field3719;
            } else {
                arg3.field1122 = var5.field3725;
            }
            arg3.field1111 = false;
        } else {
            if (arg2 == 2 && var5.field3717 != -1) {
                if (arg0 < 0 && var5.field3718 != -1) {
                    arg3.field1122 = var5.field3718;
                } else if (arg0 <= 0 || var5.field3730 == -1) {
                    arg3.field1122 = var5.field3717;
                } else {
                    arg3.field1122 = var5.field3730;
                }
            } else if (arg2 == 0 && var5.field3719 != -1) {
                if (arg0 < 0 && var5.field3759 != -1) {
                    arg3.field1122 = var5.field3759;
                } else if (arg0 <= 0 || var5.field3757 == -1) {
                    arg3.field1122 = var5.field3719;
                } else {
                    arg3.field1122 = var5.field3757;
                }
            } else if (arg0 < 0 && var5.field3733 != -1) {
                arg3.field1122 = var5.field3733;
            } else if (arg0 <= 0 || var5.field3739 == -1) {
                arg3.field1122 = var5.field3725;
            } else {
                arg3.field1122 = var5.field3739;
            }
            arg3.field1111 = false;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lqg;B)I")
    public static final int method529(class296 arg0, byte arg1) {
        field1087++;
        int var2 = arg0.method1664((byte) -13, 2);
        if (arg1 != 34) {
            return -7;
        }
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg0.method1664((byte) -13, 5);
        } else if (var2 == 2) {
            var3 = arg0.method1664((byte) -13, 8);
        } else {
            var3 = arg0.method1664((byte) -13, 11);
        }
        return var3;
    }
}
