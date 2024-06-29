import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class238 {

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    public int field3541 = 1;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public int field3548 = 2;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
    public int field3551 = 64;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "Z")
    public boolean field3540 = false;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "Z")
    public boolean field3550 = false;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
    public int field3553 = -1;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
    public int field3552 = 64;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "Luu;")
    public static class237 field3542;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pm", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field3555;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "[I")
    public static int[] field3554;

    // $FF: synthetic method
    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1611(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIILuv;)V", line = 4)
    public static final void method1604(int arg0, int arg1, int arg2, class755 arg3) {
        if (arg2 != -1653212862) {
            method1607(-30, null);
        }
        field3547++;
        class573 var4 = arg3.method4186(class129.field1802, -116);
        if (var4 == null) {
            return;
        }
        class129.field1802.method1544(arg1, arg0, arg1 + arg3.field10393, arg3.field10501 + arg0);
        if (class728.field10131 < 3) {
            class178.field2446.method1971((float) arg3.field10393 / 2.0F + (float) arg1, (float) arg3.field10501 / 2.0F + (float) arg0, 4096, (int) (-class596.field8093) & 0x3FFF << 2, var4, arg1, arg0);
        } else {
            class129.field1802.method1402(-16777216, var4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V", line = 28)
    public static void method1605(boolean arg0) {
        field3554 = null;
        field3542 = null;
        if (!arg0) {
            method1607(101, null);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IBILdc;)V", line = 47)
    private final void method1606(int arg0, byte arg1, int arg2, class63 arg3) {
        if (arg1 != -128) {
            method1609(-25, (char) 65482);
        }
        field3545++;
        if (arg2 == 1) {
            this.field3553 = arg3.method482(-772591672);
            if (this.field3553 == 65535) {
                this.field3553 = -1;
            }
        } else if (arg2 == 2) {
            this.field3552 = arg3.method482(-772591672) + 1;
            this.field3551 = arg3.method482(arg1 - 772591544) + 1;
        } else if (arg2 == 3) {
            arg3.method491(false);
        } else if (arg2 == 4) {
            this.field3548 = arg3.method505((byte) -119);
        } else if (arg2 == 5) {
            this.field3541 = arg3.method505((byte) -119);
        } else if (arg2 == 6) {
            this.field3550 = true;
            return;
        } else if (arg2 == 7) {
            this.field3540 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I[Ljava/lang/String;)V", line = 98)
    public static final void method1607(int arg0, String[] arg1) {
        field3546++;
        if (arg0 != 29017) {
            method1610(null, -99, -75, 126, 103, -40, -120, 11, -106);
        }
        if (arg1.length <= 1) {
            class445.field6173 = class445.field6173 + arg1[0];
            class507.field7045 += arg1[0].length();
            return;
        }
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (arg1[var2].startsWith("pause")) {
                int var3 = 5;
                try {
                    var3 = Integer.parseInt(arg1[var2].substring(6));
                } catch (Exception var4) {
                }
                class261.method1772((byte) -122, "Pausing for " + var3 + " seconds...");
                class236.field3487 = var2 + 1;
                class452.field6260 = arg1;
                class131.field1832 = class97.method664((byte) -50) + ((long) (var3 * 1000));
                return;
            }
            class445.field6173 = arg1[var2];
            class715.method4017((byte) 53, false);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZILdc;)V", line = 149)
    public final void method1608(boolean arg0, int arg1, class63 arg2) {
        while (true) {
            int var4 = arg2.method505((byte) -119);
            if (var4 == 0) {
                field3549++;
                if (arg0) {
                    method1605(true);
                    return;
                }
                return;
            }
            this.method1606(arg1, (byte) -128, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IC)Z", line = 175)
    public static final boolean method1609(int arg0, char arg1) {
        field3544++;
        if (arg0 != -32179) {
            method1609(-119, (char) 65463);
        }
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lha;IIIIIIII)V", line = 199)
    public static final void method1610(class548 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3543++;
        class722 var9 = (class722) class376.method2357(arg1, arg7, arg8);
        if (var9 != null) {
            class220 var10 = class20.field192.method716(6, var9.method782((byte) -87));
            int var11 = var9.method794(123) & 0x3;
            int var12 = var9.method784(-4532);
            if (var10.field2897 == -1) {
                int var13 = arg4;
                if (var10.field2948 > 0) {
                    var13 = arg2;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg0.method3254(4, var13, arg5, arg3, false);
                    } else if (var11 == 1) {
                        arg0.method3243(arg3, (byte) -27, arg5, var13, 4);
                    } else if (var11 == 2) {
                        arg0.method3254(4, var13, arg5, arg3 + 3, false);
                    } else if (var11 == 3) {
                        arg0.method3243(arg3, (byte) -27, arg5 + 3, var13, 4);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg0.method3249(arg3, -57, 1, 1, var13, arg5);
                    } else if (var11 == 1) {
                        arg0.method3249(arg3 + 3, -43, 1, 1, var13, arg5);
                    } else if (var11 == 2) {
                        arg0.method3249(arg3 + 3, arg6 + -130, 1, 1, var13, arg5 + 3);
                    } else if (var11 == 3) {
                        arg0.method3249(arg3, 126, 1, 1, var13, arg5 + 3);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg0.method3243(arg3, (byte) -27, arg5, var13, 4);
                    } else if (var11 == 1) {
                        arg0.method3254(4, var13, arg5, arg3 + 3, false);
                    } else if (var11 == 2) {
                        arg0.method3243(arg3, (byte) -27, arg5 + 3, var13, 4);
                    } else if (var11 == 3) {
                        arg0.method3254(4, var13, arg5, arg3, false);
                    }
                }
            } else {
                class156.method980(arg5, arg0, var11, arg3, -90, var10);
            }
        }
        class722 var14 = (class722) class141.method932(arg1, arg7, arg8, field3555 == null ? (field3555 = method1611("bda")) : field3555);
        if (var14 != null) {
            class220 var15 = class20.field192.method716(6, var14.method782((byte) 101));
            int var16 = var14.method794(122) & 0x3;
            int var17 = var14.method784(-4532);
            if (var15.field2897 != -1) {
                class156.method980(arg5, arg0, var16, arg3, arg6 ^ 0xFFFFFFB4, var15);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field2948 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg0.method3242(arg5, (byte) 124, arg3 + 3, arg5 + 3, arg3, var18);
                } else {
                    arg0.method3242(arg5 + 3, (byte) -110, arg3 + 3, arg5, arg3, var18);
                }
            }
        }
        class722 var19 = (class722) class134.method851(arg1, arg7, arg8);
        if (var19 != null) {
            class220 var20 = class20.field192.method716(6, var19.method782((byte) -120));
            int var21 = var19.method794(arg6 ^ 0x78) & 0x3;
            if (var20.field2897 != -1) {
                class156.method980(arg5, arg0, var21, arg3, -84, var20);
            }
        }
        if (arg6 != 2) {
            field3542 = null;
        }
    }
}
