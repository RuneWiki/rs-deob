import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class57 extends class665 {

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
    public int field1099;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    public int field1098;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "[I")
    public static int[] field1101 = new int[2048];

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "F")
    public static float field1100;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIB[B[BIII)V", line = 3)
    public static final void method618(int arg0, int arg1, int arg2, byte arg3, byte[] arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        field1104++;
        int var9 = -(arg0 >> 2);
        if (arg3 != -20) {
            method621(true, -124, -29, (byte) 73, -55, -124, -80);
        }
        int var10 = -(arg0 & 0x3);
        for (int var11 = -arg2; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg6++;
                arg5[var10001] += arg4[arg7++];
                int var14 = arg6++;
                arg5[var14] += arg4[arg7++];
                int var15 = arg6++;
                arg5[var15] += arg4[arg7++];
                int var16 = arg6++;
                arg5[var16] += arg4[arg7++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg6++;
                arg5[var10001] += arg4[arg7++];
            }
            arg6 += arg8;
            arg7 += arg1;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V", line = 48)
    public static void method619(byte arg0) {
        field1101 = null;
        if (arg0 != 122) {
            field1097 = 92;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 62)
    public static final void method620(int arg0) {
        if (class412.field6003 == null) {
            class412.field6003 = class229.method1584(104);
            class572.field8054 = class412.field6003[0];
            class600.field8484 = class490.method2840(true);
        }
        field1102++;
        if (class27.field400 == null) {
            class420.method2525(-100);
        }
        class229 var1 = class572.field8054;
        if (arg0 != 3338) {
            return;
        }
        int var2 = class667.method3697(arg0 ^ 0xFFFFF291);
        if (class572.field8054 == var1) {
            class558.field7882 = class572.field8054.field3561.method1804(arg0 ^ 0x110D, class512.field7203);
            if (class572.field8054.field3570) {
                class516.field7286 = (class572.field8054.field3564 - class572.field8054.field3560) * var2 / 100 + class572.field8054.field3560;
            }
            if (class572.field8054.field3567) {
                class558.field7882 = class558.field7882 + class516.field7286 + "%";
            }
        } else if (class572.field8054 == class229.field3592) {
            class27.field400 = null;
            class112.method868(3, (byte) -109);
        } else {
            class558.field7882 = var1.field3571.method1804(7175, class512.field7203);
            class516.field7286 = var1.field3564;
            if (class572.field8054.field3567) {
                class558.field7882 = class558.field7882 + var1.field3564 + "%";
            }
            if (class572.field8054.field3570 || var1.field3570) {
                class600.field8484 = class490.method2840(true);
            }
        }
        if (class27.field400 == null) {
            return;
        }
        class27.field400.method3388(class600.field8484, class558.field7882, class516.field7286, class572.field8054, 0);
        if (class666.field9407 == null) {
            return;
        }
        for (int var3 = class3.field21 + 1; var3 < class666.field9407.length; var3++) {
            if (class666.field9407[var3].method701(127) >= 100 && (var3 - 1) == class3.field21 && class420.field6113 >= 1 && class27.field400.method3375(-1)) {
                try {
                    class666.field9407[var3].method702(-88);
                } catch (Exception var4) {
                    class666.field9407 = null;
                    return;
                }
                class27.field400.method3377(121, class666.field9407[var3]);
                class3.field21++;
                if (class3.field21 >= (class666.field9407.length - 1) && class666.field9407.length > 1) {
                    class3.field21 = class386.field5433.method2630(-106) ? 0 : -1;
                }
            }
        }
        return;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZIIBIII)V", line = 159)
    public static final void method621(boolean arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if ((arg0 ? class287.field4270.field3691 : class287.field4270.field3697) != 0 && arg4 != 0 && class8.field83 < 50 && arg6 != -1) {
            class106.field1642[class8.field83++] = new class603((byte) (arg0 ? 3 : 2), arg6, arg4, arg2, arg5, arg1);
        }
        if (arg3 > 59) {
            field1103++;
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(II)V", line = 176)
    public class57(int arg0, int arg1) {
        this.field1099 = arg1;
        this.field1098 = arg0;
    }
}
