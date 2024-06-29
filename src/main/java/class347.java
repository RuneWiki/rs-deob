import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class347 {

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIIIZ)V", line = 5)
    public static final void method2068(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field5007++;
        if (class658.field9266 == null) {
            class630.field8790.method3558((byte) 102, arg2, -16777216, arg4, arg0, arg3);
        } else if (class253.field3576.field509 >= 0 && class86.field1185 * 512 > class253.field3576.field509 && class253.field3576.field514 >= 0 && class253.field3576.field514 < class526.field7212 * 512) {
            class460.field6516++;
            if (arg1 > 52) {
                if (class253.field3576 != null && (class253.field3576.field509 - ((class253.field3576.method1722((byte) -120) - 1) * 256) >> 9) == class247.field3508 && (class253.field3576.field514 + 256 - (class253.field3576.method1722((byte) -128) * 256) >> 9) == class178.field2636) {
                    class178.field2636 = -1;
                    class247.field3508 = -1;
                    class589.method3273(31050);
                }
                class179.method1213((byte) -121);
                if (!arg5) {
                    class63.method513(-1191);
                }
                class417.method2383((byte) -111);
                class663.method3673(arg4, arg2, true, -20189, arg3, arg0);
                int var6 = class440.field6200;
                int var7 = class486.field6752;
                int var8 = class689.field9696;
                int var9 = class633.field8864;
                if (class670.field9445 == 1) {
                    int var12 = (int) class249.field3516;
                    if (var12 < class21.field289 >> 8) {
                        var12 = class21.field289 >> 8;
                    }
                    if (class459.field6496[4] && class399.field5544[4] + 128 > var12) {
                        var12 = class399.field5544[4] + 128;
                    }
                    int var13 = (int) class646.field9167 + class520.field7077 & 0x3FFF;
                    class274.method1667(class652.field9218, var12, class203.method1355(class253.field3576.field514, class253.field3576.field509, 4, class233.field3305) - 200, class581.field8108, -1, (var12 >> 3) * 3 + 600 << 2, var6, var13);
                } else if (class670.field9445 == 4) {
                    int var10 = (int) class249.field3516;
                    if (class21.field289 >> 8 > var10) {
                        var10 = class21.field289 >> 8;
                    }
                    if (class459.field6496[4] && class399.field5544[4] + 128 > var10) {
                        var10 = class399.field5544[4] + 128;
                    }
                    int var11 = (int) class646.field9167 & 0x3FFF;
                    class274.method1667(class652.field9218, var10, class203.method1355(class30.field363, class264.field3734, 4, class233.field3305) - 200, class581.field8108, -1, (var10 >> 3) * 3 + 600 << 2, var6, var11);
                } else if (class670.field9445 == 5) {
                    class629.method3495(var6, 4);
                }
                int var14 = class172.field2572;
                int var15 = class628.field8762;
                int var16 = class117.field1563;
                int var17 = class492.field6794;
                int var18 = class591.field8245;
                for (int var19 = 0; var19 < 5; var19++) {
                    if (class459.field6496[var19]) {
                        int var22 = (int) ((double) (-class506.field6925[var19]) + (double) (class506.field6925[var19] * 2 + 1) * Math.random() + Math.sin((double) class348.field5018[var19] / 100.0D * (double) class628.field8770[var19]) * (double) class399.field5544[var19]);
                        if (var19 == 3) {
                            class591.field8245 = class591.field8245 + var22 & 0x3FFF;
                        }
                        if (var19 == 2) {
                            class117.field1563 += var22 << 2;
                        }
                        if (var19 == 1) {
                            class628.field8762 += var22 << 2;
                        }
                        if (var19 == 0) {
                            class172.field2572 += var22 << 2;
                        }
                        if (var19 == 4) {
                            class492.field6794 += var22;
                            if (class492.field6794 < 1024) {
                                class492.field6794 = 1024;
                            } else if (class492.field6794 > 3072) {
                                class492.field6794 = 3072;
                            }
                        }
                    }
                }
                if (class172.field2572 < 0) {
                    class172.field2572 = 0;
                }
                if (class172.field2572 > ((class137.field1931 << 9) - 1)) {
                    class172.field2572 = (class137.field1931 << 9) - 1;
                }
                if (class117.field1563 < 0) {
                    class117.field1563 = 0;
                }
                if (class117.field1563 > ((class22.field308 << 9) - 1)) {
                    class117.field1563 = (class22.field308 << 9) - 1;
                }
                class643.method3583((byte) -57);
                class172.method1174((byte) -128);
                class630.field8790.method442(var9, var7, var8 + var9, var6 + var7);
                class630.field8790.method344();
                int var20 = class269.field3826;
                if (class127.field1765 == null) {
                    class630.field8790.method310(var20);
                } else {
                    class127.field1765.method2517(var7, var6, class492.field6794, var20, var9, var8, class448.field6272 << 3, class591.field8245, class630.field8790, (byte) 91);
                }
                class74.method592(0);
                class37.field500.method1290(class172.field2572, class628.field8762, class117.field1563, -class492.field6794 & 0x3FFF, -class591.field8245 & 0x3FFF, -class263.field3732 & 0x3FFF);
                class630.field8790.method446(class37.field500);
                class630.field8790.method404(var9 + (var8 / 2), var6 / 2 + var7, class474.field6610 << 1, class474.field6610 << 1);
                class429.method2431((byte) 48, class474.field6610 << 1, var6 / 2 + var7, class474.field6610 << 1, var8 / 2 + var9);
                class367.method2149(-class492.field6794 & 0x3FFF, class172.field2572, class117.field1563, 126, -class263.field3732 & 0x3FFF, -class591.field8245 & 0x3FFF, class628.field8762);
                byte var21 = class274.field3872.method2440((byte) -106, class429.field6020) == 2 ? (byte) class460.field6516 : 1;
                class455.method2618(class630.field8790, class239.field3440, class201.field2961, class37.field500, class172.field2572, class628.field8762, class117.field1563, class446.field6246, class363.field5181, class551.field7457, class57.field802, class245.field3496, class166.field2516, class253.field3576.field520 + 1, var21, class253.field3576.field509 >> 9, class253.field3576.field514 >> 9, !class274.field3872.field900);
                class74.method592(0);
                if (class340.field4947 == 10) {
                    class679.method3746(var9, 256, var6, var8, 256, false, var7);
                    class383.method2207(var8, 256, var9, var7, 256, 23604, var6);
                    class429.method2432(var7, var6, var9, -12, 256, 256, var8);
                    class307.method1885(var8, 100, var7, var9, var6);
                }
                class572.method3152();
                class492.field6794 = var17;
                class628.field8762 = var15;
                class172.field2572 = var14;
                class117.field1563 = var16;
                class591.field8245 = var18;
                if (class688.field9678 && class232.field3302.method2805(0) == 0) {
                    class688.field9678 = false;
                }
                if (class688.field9678) {
                    class630.field8790.method3558((byte) 68, var7, -16777216, var8, var6, var9);
                    class364.method2133(class9.field99.method42(class666.field9377, 19572), 0, class668.field9418, false);
                }
            }
        } else {
            class630.field8790.method3558((byte) 30, arg2, -16777216, arg4, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIIIIIZII)V", line = 196)
    public static final void method2069(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        field5006++;
        if (!class474.method2690(arg4, -256197904) || arg7) {
            return;
        }
        if (class24.field321[arg4] == null) {
            client.method1656(class676.field9545[arg4], -1, arg2, arg0, arg8, arg5, arg3, arg1, arg9, arg6);
        } else {
            client.method1656(class24.field321[arg4], -1, arg2, arg0, arg8, arg5, arg3, arg1, arg9, arg6);
        }
    }
}
