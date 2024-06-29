import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class497 extends class83 implements class596 {

    @OriginalMember(owner = "client!ap", name = "E", descriptor = "Ljn;")
    public static class134 field6821 = new class134(12, 4);

    @OriginalMember(owner = "client!ap", name = "G", descriptor = "Lqk;")
    public static class1 field6823 = new class1(10, 16);

    @OriginalMember(owner = "client!ap", name = "H", descriptor = "I")
    public static int field6824 = 0;

    @OriginalMember(owner = "client!ap", name = "B", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!ap", name = "C", descriptor = "I")
    public static int field6819;

    @OriginalMember(owner = "client!ap", name = "D", descriptor = "I")
    public static int field6820;

    @OriginalMember(owner = "client!ap", name = "F", descriptor = "I")
    public static int field6822;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)V", line = 3)
    public static final void method2920(byte arg0) {
        if (arg0 <= 53) {
            field6822 = 43;
        }
        if (class405.field5707 != null) {
            for (int var1 = 0; var1 < class405.field5707.length; ++var1) {
                for (int var2 = 0; ~var2 > ~class405.field5707[var1].length; ++var2) {
                    class405.field5707[var1][var2] = class461.field6453;
                }
            }
        }
        ++field6820;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)V", line = 37)
    public static void method2921(boolean arg0) {
        field6823 = null;
        field6821 = null;
        if (!arg0) {
            method2923((byte) -101, (class472[][][]) null);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Laaa;Z)Z", line = 49)
    public static final boolean method2922(class253 arg0, boolean arg1) {
        boolean var2 = class661.field9303 == class594.field8355;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method79(false);
        if (arg0.field3745 >= 0 && arg0.field3758 >= 0 && arg0.field3754 < class414.field5796 && arg0.field3755 < class704.field9799) {
            short var6 = 0;
            for (int var7 = arg0.field3745; var7 <= arg0.field3754; ++var7) {
                for (int var11 = arg0.field3758; var11 <= arg0.field3755; ++var11) {
                    class472 var12 = class646.method3699(arg0.field3467, var7, var11);
                    if (var12 != null) {
                        class44 var13 = class459.method2760(0, arg0);
                        class44 var14 = var12.field6551;
                        if (var14 == null) {
                            var12.field6551 = var13;
                        } else {
                            while (var14.field466 != null) {
                                var14 = var14.field466;
                            }
                            var14.field466 = var13;
                        }
                        if (var2 && (class120.field1598[var7][var11] & -16777216) != 0) {
                            var3 = class120.field1598[var7][var11];
                            var4 = class57.field668[var7][var11];
                            var5 = class516.field7086[var7][var11];
                        }
                        if (!arg1 && var12.field6540 != null && var12.field6540.field10059 > var6) {
                            var6 = var12.field6540.field10059;
                        }
                    }
                }
            }
            if (var2 && (var3 & -16777216) != 0) {
                for (int var8 = arg0.field3745; var8 <= arg0.field3754; ++var8) {
                    for (int var9 = arg0.field3758; var9 <= arg0.field3755; ++var9) {
                        if ((class120.field1598[var8][var9] & -16777216) == 0) {
                            class120.field1598[var8][var9] = var3;
                            class57.field668[var8][var9] = var4;
                            class516.field7086[var8][var9] = var5;
                        }
                    }
                }
            }
            if (arg1) {
                class313.field4484[class586.field8275++] = arg0;
            } else {
                int var10 = class661.field9303 == class594.field8355 ? 1 : 0;
                if (arg0.method77(25833)) {
                    if (arg0.method80(70)) {
                        arg0.field3455 = class689.field9618[var10];
                        class689.field9618[var10] = arg0;
                    } else {
                        arg0.field3455 = class226.field3436[var10];
                        class226.field3436[var10] = arg0;
                        class282.field4043 = true;
                    }
                } else {
                    arg0.field3455 = class289.field4265[var10];
                    class289.field4265[var10] = arg0;
                }
            }
            if (arg1) {
                arg0.field3464 -= var6;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(B[[[Lug;)V", line = 174)
    public static final void method2923(byte arg0, class472[][][] arg1) {
        ++field6819;
        if (arg0 <= 126) {
            method2922((class253) null, true);
        }
        for (int var2 = 0; arg1.length > var2; ++var2) {
            class472[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; ++var4) {
                for (int var5 = 0; var5 < var3[var4].length; ++var5) {
                    class472 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field6540 instanceof class466) {
                            ((class466) var6.field6540).method754(false);
                        }
                        if (var6.field6542 instanceof class466) {
                            ((class466) var6.field6542).method754(false);
                        }
                        if (var6.field6541 instanceof class466) {
                            ((class466) var6.field6541).method754(false);
                        }
                        if (var6.field6548 instanceof class466) {
                            ((class466) var6.field6548).method754(false);
                        }
                        if (var6.field6544 instanceof class466) {
                            ((class466) var6.field6544).method754(false);
                        }
                        for (class44 var7 = var6.field6551; var7 != null; var7 = var7.field466) {
                            class253 var8 = var7.field465;
                            if (var8 instanceof class466) {
                                ((class466) var8).method754(false);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)I", line = 245)
    public static final int method2924(int arg0, int arg1) {
        return class57.field668 != null ? class57.field668[arg0][arg1] & 65535 : 0;
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Loaa;IZ[[I)V", line = 252)
    public class497(class556 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class75.field837, class612.field8616, arg1 * 6 * arg1, arg2);
        super.field1006.method1492(this, 2);
        if (arg2) {
            for (int var5 = 0; ~var5 > -7; ++var5) {
                this.method628(-16908, arg1, var5 + 34069, arg3[var5], arg1);
            }
        } else {
            for (int var6 = 0; var6 < 6; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, this.method631(118), arg1, arg1, 0, class723.method4029(39, super.field994), super.field1006.field7816, arg3[var6], 0);
            }
        }
    }
}
