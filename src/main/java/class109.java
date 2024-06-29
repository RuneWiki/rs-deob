import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class109 {

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "[S")
    public static short[] field1552 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "Lqj;")
    public static class196 field1553 = class80.method502(")1", -48);

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "[[I")
    public static int[][] field1555 = new int[104][104];

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "[[I")
    public static int[][] field1558 = new int[104][104];

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field1560 = 0;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "Lqj;")
    public static class196 field1559 = class80.method502(" loggt sich ein)3", -48);

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V")
    public static void method654(boolean arg0) {
        if (!arg0) {
            return;
        }
        field1553 = null;
        field1558 = null;
        field1555 = null;
        field1559 = null;
        field1552 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method655(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 != -17258) {
            field1555 = null;
        }
        if (arg0 >= 0 && arg2 >= 0 && arg0 < 103 && arg2 < 103) {
            if (arg5 == 0) {
                class221 var8 = class24.method137(arg6, arg0, arg2);
                if (var8 != null) {
                    int var9 = (int) (var8.field3978 >>> 32) & Integer.MAX_VALUE;
                    if (arg7 == 2) {
                        var8.field3992 = new class151(var9, 2, arg3 + 4, arg6, arg0, arg2, arg4, false, var8.field3992);
                        var8.field3979 = new class151(var9, 2, arg3 + 1 & 0x3, arg6, arg0, arg2, arg4, false, var8.field3979);
                    } else {
                        var8.field3992 = new class151(var9, arg7, arg3, arg6, arg0, arg2, arg4, false, var8.field3992);
                    }
                }
            }
            if (arg5 == 1) {
                class7 var10 = class71.method454(arg6, arg0, arg2);
                if (var10 != null) {
                    int var11 = (int) (var10.field73 >>> 32) & Integer.MAX_VALUE;
                    if (arg7 == 4 || arg7 == 5) {
                        var10.field59 = new class151(var11, 4, arg3, arg6, arg0, arg2, arg4, false, var10.field59);
                    } else if (arg7 == 6) {
                        var10.field59 = new class151(var11, 4, arg3 + 4, arg6, arg0, arg2, arg4, false, var10.field59);
                    } else if (arg7 == 7) {
                        var10.field59 = new class151(var11, 4, (arg3 + 2 & 0x3) + 4, arg6, arg0, arg2, arg4, false, var10.field59);
                    } else if (arg7 == 8) {
                        var10.field59 = new class151(var11, 4, arg3 + 4, arg6, arg0, arg2, arg4, false, var10.field59);
                        var10.field63 = new class151(var11, 4, (arg3 + 2 & 0x3) + 4, arg6, arg0, arg2, arg4, false, var10.field63);
                    }
                }
            }
            if (arg5 == 2) {
                if (arg7 == 11) {
                    arg7 = 10;
                }
                class200 var12 = class243.method1655(arg6, arg0, arg2);
                if (var12 != null) {
                    var12.field3544 = new class151((int) (var12.field3554 >>> 32) & Integer.MAX_VALUE, arg7, arg3, arg6, arg0, arg2, arg4, false, var12.field3544);
                }
            }
            if (arg5 == 3) {
                class116 var13 = class256.method1722(arg6, arg0, arg2);
                if (var13 != null) {
                    var13.field1681 = new class151(Integer.MAX_VALUE & (int) (var13.field1671 >>> 32), 22, arg3, arg6, arg0, arg2, arg4, false, var13.field1681);
                }
            }
        }
        field1554++;
    }
}
