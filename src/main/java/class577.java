import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class577 {

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "I")
    public static int field8099 = 0;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
    public static int field8094;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "I")
    public static int field8096;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "I")
    public static int field8097;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "Lni;")
    public static class522 field8095;

    // $FF: synthetic field
    @OriginalMember(owner = "client!uo", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field8100;

    // $FF: synthetic field
    @OriginalMember(owner = "client!uo", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field8101;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "[Lufa;")
    public static class680[] field8098;

    // $FF: synthetic method
    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3235(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Loi;I)V", line = 3)
    public static final void method3231(class74 arg0, int arg1) {
        if (arg1 != -28111) {
            field8098 = null;
        }
        field8096++;
        if (arg0.field837 != -1) {
            class300 var2 = class460.field6365.method1090(arg0.field837, 16383);
            if (var2 == null || var2.field4042 == null) {
                arg0.field803 = false;
                arg0.field837 = -1;
            } else {
                label365: {
                    arg0.field866++;
                    if (arg0.field790 < var2.field4042.length && arg0.field866 > var2.field4033[arg0.field790]) {
                        arg0.field866 = 1;
                        arg0.field790++;
                        arg0.field878++;
                        if (!arg0.field819) {
                            class153.method930((byte) -128, arg0, arg0.field790, var2);
                        }
                    }
                    if (var2.field4042.length <= arg0.field790) {
                        arg0.field790 = 0;
                        arg0.field866 = 0;
                        if (arg0.field803) {
                            arg0.field837 = arg0.method548(1).method2039(arg1 + 28148);
                            if (arg0.field837 == -1) {
                                arg0.field803 = false;
                                break label365;
                            }
                            var2 = class460.field6365.method1090(arg0.field837, arg1 + 44494);
                        }
                        if (!arg0.field819) {
                            class153.method930((byte) -126, arg0, arg0.field790, var2);
                        }
                    }
                    arg0.field878 = arg0.field790 + 1;
                    if (var2.field4042 == null) {
                        arg0.field803 = false;
                        arg0.field837 = -1;
                    } else if (arg0.field878 >= var2.field4042.length) {
                        arg0.field878 = 0;
                    }
                }
            }
        }
        if (arg0.field829 != -1 && arg0.field844 <= class406.field5732) {
            class49 var3 = class303.field4090.method3521(2, arg0.field829);
            int var4 = var3.field497;
            if (var4 == -1) {
                arg0.field829 = -1;
            } else {
                label366: {
                    class300 var5 = class460.field6365.method1090(var4, 16383);
                    if (var3.field496) {
                        if (var5.field4045 == 3) {
                            if (arg0.field897 > 0 && arg0.field843 <= class406.field5732 && class406.field5732 > arg0.field883) {
                                arg0.field829 = -1;
                                break label366;
                            }
                        } else if (var5.field4045 == 1 && arg0.field897 > 0 && arg0.field843 <= class406.field5732 && class406.field5732 > arg0.field883) {
                            arg0.field844 = class406.field5732 + 1;
                            break label366;
                        }
                    }
                    if (var5 == null || var5.field4042 == null) {
                        arg0.field829 = -1;
                    } else {
                        if (arg0.field824 < 0) {
                            arg0.field824 = 0;
                            if (!arg0.field819) {
                                class153.method930((byte) -126, arg0, 0, var5);
                            }
                        }
                        arg0.field850++;
                        if (var5.field4042.length > arg0.field824 && arg0.field850 > var5.field4033[arg0.field824]) {
                            arg0.field824++;
                            arg0.field850 = 1;
                            if (!arg0.field819) {
                                class153.method930((byte) -127, arg0, arg0.field824, var5);
                            }
                        }
                        if (var5.field4042.length <= arg0.field824) {
                            if (var3.field496) {
                                arg0.field800++;
                                arg0.field824 -= var5.field4055;
                                if (var5.field4026 <= arg0.field800) {
                                    arg0.field829 = -1;
                                } else if (arg0.field824 < 0 || var5.field4042.length <= arg0.field824) {
                                    arg0.field829 = -1;
                                } else if (!arg0.field819) {
                                    class153.method930((byte) -127, arg0, arg0.field824, var5);
                                }
                            } else {
                                arg0.field829 = -1;
                            }
                        }
                        arg0.field813 = arg0.field824 + 1;
                        if (arg0.field813 >= var5.field4042.length) {
                            if (var3.field496) {
                                arg0.field813 -= var5.field4055;
                                if (var5.field4026 <= (arg0.field800 + 1)) {
                                    arg0.field813 = -1;
                                } else if (arg0.field813 < 0 || var5.field4042.length <= arg0.field813) {
                                    arg0.field813 = -1;
                                }
                            } else {
                                arg0.field813 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field810 != -1 && class406.field5732 >= arg0.field885) {
            class49 var6 = class303.field4090.method3521(2, arg0.field810);
            int var7 = var6.field497;
            if (var7 == -1) {
                arg0.field810 = -1;
            } else {
                label369: {
                    class300 var8 = class460.field6365.method1090(var7, 16383);
                    if (var6.field496) {
                        if (var8.field4045 == 3) {
                            if (arg0.field897 > 0 && class406.field5732 >= arg0.field843 && class406.field5732 > arg0.field883) {
                                arg0.field810 = -1;
                                break label369;
                            }
                        } else if (var8.field4045 == 1 && arg0.field897 > 0 && class406.field5732 >= arg0.field843 && class406.field5732 > arg0.field883) {
                            arg0.field885 = class406.field5732 + 1;
                            break label369;
                        }
                    }
                    if (var8 == null || var8.field4042 == null) {
                        arg0.field810 = -1;
                    } else {
                        if (arg0.field889 < 0) {
                            arg0.field889 = 0;
                            if (!arg0.field819) {
                                class153.method930((byte) -127, arg0, 0, var8);
                            }
                        }
                        arg0.field886++;
                        if (var8.field4042.length > arg0.field889 && var8.field4033[arg0.field889] < arg0.field886) {
                            arg0.field889++;
                            arg0.field886 = 1;
                            if (!arg0.field819) {
                                class153.method930((byte) -126, arg0, arg0.field889, var8);
                            }
                        }
                        if (arg0.field889 >= var8.field4042.length) {
                            if (var6.field496) {
                                arg0.field831++;
                                arg0.field889 -= var8.field4055;
                                if (var8.field4026 <= arg0.field831) {
                                    arg0.field810 = -1;
                                } else if (arg0.field889 < 0 || var8.field4042.length <= arg0.field889) {
                                    arg0.field810 = -1;
                                } else if (!arg0.field819) {
                                    class153.method930((byte) -128, arg0, arg0.field889, var8);
                                }
                            } else {
                                arg0.field810 = -1;
                            }
                        }
                        arg0.field880 = arg0.field889 + 1;
                        if (arg0.field880 >= var8.field4042.length) {
                            if (var6.field496) {
                                arg0.field880 -= var8.field4055;
                                if (var8.field4026 <= (arg0.field831 + 1)) {
                                    arg0.field880 = -1;
                                } else if (arg0.field880 < 0 || var8.field4042.length <= arg0.field880) {
                                    arg0.field880 = -1;
                                }
                            } else {
                                arg0.field880 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field871 != -1 && arg0.field855 <= 1) {
            class300 var9 = class460.field6365.method1090(arg0.field871, 16383);
            if (var9.field4045 == 3) {
                if (arg0.field897 > 0 && class406.field5732 >= arg0.field843 && arg0.field883 < class406.field5732) {
                    arg0.field821 = null;
                    arg0.field871 = -1;
                }
            } else if (var9.field4045 == 1 && arg0.field897 > 0 && arg0.field843 <= class406.field5732 && arg0.field883 < class406.field5732) {
                arg0.field855 = 2;
            }
        }
        if (arg0.field871 != -1 && arg0.field855 == 0) {
            class300 var10 = class460.field6365.method1090(arg0.field871, 16383);
            if (var10 == null || var10.field4042 == null) {
                arg0.field821 = null;
                arg0.field871 = -1;
            } else {
                arg0.field811++;
                if (var10.field4042.length > arg0.field846 && var10.field4033[arg0.field846] < arg0.field811) {
                    arg0.field811 = 1;
                    arg0.field846++;
                    if (!arg0.field819) {
                        class153.method930((byte) -126, arg0, arg0.field846, var10);
                    }
                }
                if (arg0.field846 >= var10.field4042.length) {
                    arg0.field862++;
                    arg0.field846 -= var10.field4055;
                    if (var10.field4026 <= arg0.field862) {
                        arg0.field821 = null;
                        arg0.field871 = -1;
                    } else if (arg0.field846 < 0 || var10.field4042.length <= arg0.field846) {
                        arg0.field871 = -1;
                        arg0.field821 = null;
                    } else if (!arg0.field819) {
                        class153.method930((byte) -128, arg0, arg0.field846, var10);
                    }
                }
                arg0.field806 = arg0.field846 + 1;
                if (arg0.field806 >= var10.field4042.length) {
                    arg0.field806 -= var10.field4055;
                    if (var10.field4026 <= (arg0.field862 + 1)) {
                        arg0.field806 = -1;
                    } else if (arg0.field806 < 0 || arg0.field806 >= var10.field4042.length) {
                        arg0.field806 = -1;
                    }
                }
            }
        }
        if (arg0.field855 > 0) {
            arg0.field855--;
        }
        for (int var11 = 0; var11 < arg0.field839.length; var11++) {
            class474 var12 = arg0.field839[var11];
            if (var12 != null) {
                if (var12.field6560 > 0) {
                    var12.field6560--;
                } else {
                    class300 var13 = class460.field6365.method1090(var12.field6557, arg1 + 44494);
                    if (var13 == null || var13.field4042 == null) {
                        arg0.field839[var11] = null;
                    } else {
                        var12.field6564++;
                        if (var12.field6559 < var13.field4042.length && var13.field4033[var12.field6559] < var12.field6564) {
                            var12.field6564 = 1;
                            var12.field6559++;
                            if (!arg0.field819) {
                                class153.method930((byte) -128, arg0, var12.field6559, var13);
                            }
                        }
                        if (var13.field4042.length <= var12.field6559) {
                            var12.field6561++;
                            var12.field6559 -= var13.field4055;
                            if (var13.field4026 <= var12.field6561) {
                                arg0.field839[var11] = null;
                            } else if (var12.field6559 < 0 || var13.field4042.length <= var12.field6559) {
                                arg0.field839[var11] = null;
                            } else if (!arg0.field819) {
                                class153.method930((byte) -127, arg0, var12.field6559, var13);
                            }
                        }
                        var12.field6558 = var12.field6559 + 1;
                        if (var13.field4042.length <= var12.field6558) {
                            var12.field6558 -= var13.field4055;
                            if ((var12.field6561 + 1) >= var13.field4026) {
                                var12.field6558 = -1;
                            } else if (var12.field6558 < 0 || var13.field4042.length <= var12.field6558) {
                                var12.field6558 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lha;IB)V", line = 480)
    public static final void method3232(class60 arg0, int arg1, byte arg2) {
        if (arg2 != -59) {
            field8098 = null;
        }
        field8094++;
        if (!class314.field4236 || !class232.field2988) {
            class501.field6815 = 0;
            return;
        }
        if (class424.field5944) {
            class101.field1331 = class169.field2110.method2060((byte) 69);
        }
        class460.field6373 = 0;
        class735.field10252 = 0;
        class426.field6010 = 0;
        int[] var3 = arg0.method453();
        class729.field10177 = (int) ((float) var3[2] / 3.0F);
        class449.field6273 = (int) ((float) var3[3] / 3.0F);
        arg0.method420(class464.field6425);
        if ((int) ((float) class464.field6425[0] / 3.0F) != class38.field394 || ((int) ((float) class464.field6425[1] / 3.0F)) != class547.field7720) {
            class547.field7720 = (int) ((float) class464.field6425[1] / 3.0F);
            class38.field394 = (int) ((float) class464.field6425[0] / 3.0F);
            class648.field9025 = new int[class547.field7720 * class38.field394];
            class427.field6030 = class38.field394 >> 1;
            class593.field8261 = class547.field7720 >> 1;
        }
        class194.field2324 = arg0.method357();
        class501.field6815 = 0;
        for (int var4 = 0; var4 < class282.field3738; var4++) {
            class636.method3584(3, arg1, arg0, class743.field10333[var4]);
        }
        for (int var5 = 0; var5 < class387.field5458; var5++) {
            class636.method3584(3, arg1, arg0, class431.field6085[var5]);
        }
        for (int var6 = 0; var6 < class60.field631; var6++) {
            class636.method3584(3, arg1, arg0, class393.field5575[var6]);
        }
        class51.field536 = 0;
        if (class501.field6815 > 0) {
            int var7 = class648.field9025.length;
            int var8 = var7 - var7 & 0x7;
            int var9 = 0;
            while (var9 < var8) {
                class648.field9025[var9++] = Integer.MAX_VALUE;
                class648.field9025[var9++] = Integer.MAX_VALUE;
                class648.field9025[var9++] = Integer.MAX_VALUE;
                class648.field9025[var9++] = Integer.MAX_VALUE;
                class648.field9025[var9++] = Integer.MAX_VALUE;
                class648.field9025[var9++] = Integer.MAX_VALUE;
                class648.field9025[var9++] = Integer.MAX_VALUE;
                class648.field9025[var9++] = Integer.MAX_VALUE;
            }
            while (var7 > var9) {
                class648.field9025[var9++] = Integer.MAX_VALUE;
            }
            class354.field4725 = 1;
            for (int var10 = 0; var10 < class501.field6815; var10++) {
                class620 var11 = class462.field6395[var10];
                class146.method902(var11.field8698[1], var11.field8698[0], (byte) 85, var11.field8686[1], var11.field8687[3], var11.field8687[0], var11.field8698[3], var11.field8687[1], var11.field8686[0], var11.field8686[3]);
                class146.method902(var11.field8698[2], var11.field8698[1], (byte) 81, var11.field8686[2], var11.field8687[3], var11.field8687[1], var11.field8698[3], var11.field8687[2], var11.field8686[1], var11.field8686[3]);
            }
            class354.field4725 = 2;
        }
        if (class424.field5944) {
            class199.field2360 = class169.field2110.method2060((byte) 69) - class101.field1331;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Z)V", line = 588)
    public static final synchronized void method3233(boolean arg0) {
        field8097++;
        if (arg0 || class418.field5880 != null) {
            return;
        }
        try {
            Class var1 = Class.forName("java.lang.management.ManagementFactory");
            Method var2 = var1.getDeclaredMethod("getPlatformMBeanServer", null);
            Object var3 = var2.invoke(null, (Object[]) null);
            Method var4 = var1.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field8100 == null ? (field8100 = method3235("java.lang.String")) : field8100, field8101 == null ? (field8101 = method3235("java.lang.Class")) : field8101);
            class418.field5880 = var4.invoke(null, var3, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
        } catch (Exception var6) {
            System.out.println("HeapDump setup error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V", line = 619)
    public static void method3234(byte arg0) {
        field8098 = null;
        if (arg0 == -71) {
            field8095 = null;
        }
    }
}
