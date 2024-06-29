import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class699 extends class377 {

    @OriginalMember(owner = "client!fv", name = "v", descriptor = "I")
    private int field9805;

    @OriginalMember(owner = "client!fv", name = "w", descriptor = "I")
    public static int field9806;

    @OriginalMember(owner = "client!fv", name = "x", descriptor = "I")
    public static int field9807;

    @OriginalMember(owner = "client!fv", name = "y", descriptor = "I")
    public static int field9808;

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Llea;II[BI)V", line = 6)
    public class699(class573 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field9805 = arg2;
        super.field5288.method3384(this, (byte) 114);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field5298, 0, super.field5289, this.field9805, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2266(61, true);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ZB)V", line = 20)
    public final void method3918(boolean arg0, byte arg1) {
        super.field5288.method3384(this, (byte) 62);
        ++field9808;
        if (arg1 <= 32) {
            this.field9805 = 22;
        }
        OpenGL.glTexParameteri(super.field5298, 10242, arg0 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V", line = 32)
    public final void method1359(int arg0) {
        if (arg0 == 3314) {
            ++field9806;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lgh;IZ)V", line = 45)
    public static final void method3919(class506 arg0, int arg1, boolean arg2) {
        ++field9807;
        if (~class624.field8863 > -401) {
            class179 var3 = arg0.field6964;
            String var4 = arg0.field6953;
            if (var3.field2683 != null) {
                var3 = var3.method1304(class578.field8328, -25917);
                if (var3 == null) {
                    return;
                }
                var4 = var3.field2714;
            }
            if (var3.field2720) {
                if (~arg0.field6952 != -1) {
                    String var5 = class429.field5944 == class113.field1647 ? class563.field7828.method3281(class423.field5892, -1) : class563.field7826.method3281(class423.field5892, -1);
                    var4 = var4 + class735.method4064(82, arg0.field6952, class719.field10041.field249) + " (" + var5 + arg0.field6952 + ")";
                }
                if (class295.field4298 && !arg2) {
                    class93 var6 = ~class626.field8893 != 0 ? class498.field6854.method3434(class626.field8893, arg1 + 6842) : null;
                    if ((2 & class345.field4896) != 0 && (var6 == null || var3.method1308(125, var6.field1331, class626.field8893) != var6.field1331)) {
                        ++class769.field10608;
                        class526.method3076(-1, false, (long) arg0.field4051, arg1 ^ 3983, class460.field6275 + " -> <col=ffff00>" + var4, 0, 0, false, true, class745.field10364, (long) arg0.field4051, 17, class470.field6405);
                    }
                }
                if (!arg2) {
                    String[] var7 = var3.field2729;
                    if (class623.field8826) {
                        var7 = class39.method296(arg1 ^ 3710, var7);
                    }
                    if (var7 != null) {
                        for (int var8 = 4; var8 >= 0; --var8) {
                            if (var7[var8] != null && (~var3.field2731 == -1 || !var7[var8].equalsIgnoreCase(class563.field7821.method3281(class423.field5892, -1)))) {
                                byte var9 = 0;
                                if (var8 == 0) {
                                    var9 = 9;
                                }
                                int var10 = class28.field297;
                                if (var8 == 1) {
                                    var9 = 20;
                                }
                                if (~var8 == -3) {
                                    var9 = 58;
                                }
                                if (~var8 == -4) {
                                    var9 = 30;
                                }
                                if (var8 == 4) {
                                    var9 = 21;
                                }
                                if (var3.field2696 == var8) {
                                    var10 = var3.field2686;
                                }
                                if (var3.field2723 == var8) {
                                    var10 = var3.field2722;
                                }
                                class526.method3076(-1, false, (long) arg0.field4051, 500, "<col=ffff00>" + var4, 0, 0, false, true, var7[var8].equalsIgnoreCase(class563.field7821.method3281(class423.field5892, -1)) ? var3.field2702 : var10, (long) arg0.field4051, var9, var7[var8]);
                                ++class272.field3826;
                            }
                        }
                    }
                    if (~var3.field2731 == -2 && var7 != null) {
                        for (int var11 = 4; var11 >= 0; --var11) {
                            if (var7[var11] != null && var7[var11].equalsIgnoreCase(class563.field7821.method3281(class423.field5892, -1))) {
                                short var12 = 0;
                                if (arg0.field6952 > class719.field10041.field249) {
                                    var12 = 2000;
                                }
                                short var13 = 0;
                                if (var11 == 0) {
                                    var13 = 9;
                                }
                                if (var11 == 1) {
                                    var13 = 20;
                                }
                                if (var11 == 2) {
                                    var13 = 58;
                                }
                                if (~var11 == -4) {
                                    var13 = 30;
                                }
                                if (~var11 == -5) {
                                    var13 = 21;
                                }
                                if (~var13 != -1) {
                                    var13 += var12;
                                }
                                ++class414.field5680;
                                class526.method3076(-1, false, (long) arg0.field4051, 500, "<col=ffff00>" + var4, 0, 0, false, true, var3.field2702, (long) arg0.field4051, var13, var7[var11]);
                            }
                        }
                    }
                }
                ++class169.field2567;
                if (arg1 == 3707) {
                    class526.method3076(-1, false, (long) arg0.field4051, 500, "<col=ffff00>" + var4, 0, 0, arg2, true, class645.field9176, (long) arg0.field4051, 1009, class563.field7820.method3281(class423.field5892, -1));
                }
            }
        }
    }
}
