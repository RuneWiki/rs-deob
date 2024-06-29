import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class351 {

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "[B")
    private byte[] field4595;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "[I")
    private int[] field4597;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "[I")
    private int[] field4602;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field4598 = new Hashtable();

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    public static int field4601 = 0;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "[[B")
    public static byte[][] field4603;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1945(int arg0) {
        field4604++;
        class21[] var1 = class169.field2023;
        synchronized (class169.field2023) {
            for (int var2 = arg0; var2 < class169.field2023.length; var2++) {
                class169.field2023[var2] = new class21();
                class144.field1620[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I[BIII[B)I", line = 38)
    public final int method1946(int arg0, byte[] arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field4596++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = arg3 + arg4;
        int var8 = 0;
        if (arg0 != -29856) {
            method1949(null, -32);
        }
        int var9 = arg2;
        while (true) {
            byte var10 = arg1[var9];
            if (var10 < 0) {
                var8 = this.field4602[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field4602[var8]) < 0) {
                arg5[arg3++] = (byte) (~var11);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field4602[var8];
            }
            int var12;
            if ((var12 = this.field4602[var8]) < 0) {
                arg5[arg3++] = (byte) (~var12);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field4602[var8];
            }
            int var13;
            if ((var13 = this.field4602[var8]) < 0) {
                arg5[arg3++] = (byte) (~var13);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field4602[var8];
            }
            int var14;
            if ((var14 = this.field4602[var8]) < 0) {
                arg5[arg3++] = (byte) (~var14);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field4602[var8];
            }
            int var15;
            if ((var15 = this.field4602[var8]) < 0) {
                arg5[arg3++] = (byte) (~var15);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field4602[var8];
            }
            int var16;
            if ((var16 = this.field4602[var8]) < 0) {
                arg5[arg3++] = (byte) (~var16);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field4602[var8];
            }
            int var17;
            if ((var17 = this.field4602[var8]) < 0) {
                arg5[arg3++] = (byte) (~var17);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field4602[var8];
            }
            int var18;
            if ((var18 = this.field4602[var8]) < 0) {
                arg5[arg3++] = (byte) (~var18);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg2;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "([Lep;IIIIIIIBI)V", line = 188)
    public static final void method1947(class382[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        field4593++;
        class453.field6284.method314(arg3, arg4, arg5, arg7);
        int var10 = 0;
        if (arg8 < 69) {
            return;
        }
        while (var10 < arg0.length) {
            class382 var11 = arg0[var10];
            if (var11 != null && (var11.field5108 == arg6 || arg6 == -1412584499 && class464.field6446 == var11)) {
                int var12;
                if (arg9 == -1) {
                    class382.field5060[class675.field9572].setBounds(var11.field4996 + arg1, var11.field4987 + arg2, var11.field5035, var11.field4958);
                    var12 = class675.field9572++;
                } else {
                    var12 = arg9;
                }
                var11.field5005 = class469.field6549;
                var11.field5011 = var12;
                if (!client.method1526(var11)) {
                    label590: {
                        if (var11.field5091 != 0) {
                            class301.method1702(var11, 0);
                        }
                        int var13 = var11.field4996 + arg1;
                        int var14 = var11.field4987 + arg2;
                        int var15 = var11.field4998;
                        if (class87.field933 && (client.method1530(var11).field3339 != 0 || var11.field5112 == 0) && var15 > 127) {
                            var15 = 127;
                        }
                        if (class464.field6446 == var11) {
                            if (arg6 != -1412584499 && (class1.field6 == var11.field5105 || class627.field8905 == var11.field5105)) {
                                class326.field4241 = arg2;
                                class29.field344 = arg0;
                                class227.field2905 = arg1;
                                break label590;
                            }
                            if (class682.field9687 && class492.field7142) {
                                int var16 = class407.field5419.method162(-26561);
                                int var17 = class407.field5419.method161(31285);
                                int var18 = var17 - class453.field6279;
                                int var19 = var16 - class422.field5614;
                                if (var19 < class485.field7063) {
                                    var19 = class485.field7063;
                                }
                                if (class485.field7063 + class66.field694.field5035 < var19 - -var11.field5035) {
                                    var19 = class66.field694.field5035 + class485.field7063 - var11.field5035;
                                }
                                if (class168.field2013 > var18) {
                                    var18 = class168.field2013;
                                }
                                var13 = var19;
                                if (var11.field4958 + var18 > class168.field2013 + class66.field694.field4958) {
                                    var18 = class168.field2013 + class66.field694.field4958 - var11.field4958;
                                }
                                var14 = var18;
                            }
                            if (class627.field8905 == var11.field5105) {
                                var15 = 128;
                            }
                        }
                        int var22;
                        int var23;
                        int var24;
                        int var25;
                        if (var11.field5112 == 2) {
                            var25 = arg5;
                            var22 = arg3;
                            var24 = arg7;
                            var23 = arg4;
                        } else {
                            int var20 = var11.field5035 + var13;
                            int var21 = var11.field4958 + var14;
                            var22 = arg3 >= var13 ? arg3 : var13;
                            var23 = arg4 < var14 ? var14 : arg4;
                            if (var11.field5112 == 9) {
                                var21++;
                                var20++;
                            }
                            var24 = var21 < arg7 ? var21 : arg7;
                            var25 = arg5 <= var20 ? arg5 : var20;
                        }
                        if (var22 < var25 && var23 < var24) {
                            label616: {
                                if (var11.field5091 != 0) {
                                    if (class44.field495 == var11.field5091 || class651.field9314 == var11.field5091) {
                                        class309.method1758(var11.field4958, var11.field5035, (byte) -71, class651.field9314 == var11.field5091, var14, var13);
                                        class406.field5409[var12] = true;
                                        class453.field6284.method314(arg3, arg4, arg5, arg7);
                                        break label616;
                                    }
                                    if (class215.field2610 == var11.field5091) {
                                        if (var11.method2091((byte) -83, class453.field6284) != null) {
                                            class73.method470((byte) 84);
                                            class189.method1097(class453.field6284, var13, var11, var14, false);
                                            class663.field9429[var12] = true;
                                            class453.field6284.method314(arg3, arg4, arg5, arg7);
                                        }
                                        break label616;
                                    }
                                    if (class404.field5398 == var11.field5091) {
                                        if (var11.method2091((byte) -83, class453.field6284) != null) {
                                            class239.method1375(var11, var14, true, var13);
                                            class663.field9429[var12] = true;
                                            class453.field6284.method314(arg3, arg4, arg5, arg7);
                                        }
                                        break label616;
                                    }
                                    if (class57.field594 == var11.field5091) {
                                        class490.method2833(var11.field5035, var13, class453.field6284, var11.field4958, (byte) 77, var14, class209.field2545);
                                        class406.field5409[var12] = true;
                                        class453.field6284.method314(arg3, arg4, arg5, arg7);
                                        break label616;
                                    }
                                    if (class306.field3993 == var11.field5091) {
                                        class506.method2913(var13, var11.field5035, var11.field4958, (byte) -82, var14, class453.field6284);
                                        class406.field5409[var12] = true;
                                        class453.field6284.method314(arg3, arg4, arg5, arg7);
                                        break label616;
                                    }
                                    if (class381.field4950 == var11.field5091) {
                                        if (!class75.field787 && !class54.field553) {
                                            break label616;
                                        }
                                        int var26 = var11.field5035 + var13;
                                        int var27 = var14 + 15;
                                        if (class75.field787) {
                                            int var28 = -256;
                                            if (class502.field7228 < 20) {
                                                var28 = -65536;
                                            }
                                            class404.field5386.method1129(var26, -1, "Fps:" + class502.field7228, (byte) 127, var28, var27);
                                            var27 += 15;
                                            Runtime var29 = Runtime.getRuntime();
                                            int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                            int var31 = -256;
                                            if (var30 > 65536) {
                                                var31 = -65536;
                                                if (class170.field2046) {
                                                    class601.method3357(118);
                                                    for (int var32 = 0; var32 < 10; var32++) {
                                                        System.gc();
                                                    }
                                                    var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                                    if (var30 > 65536) {
                                                        class638.method3593(true, 4, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
                                                    }
                                                }
                                            }
                                            class404.field5386.method1129(var26, -1, "Mem:" + var30 + "k", (byte) 124, var31, var27);
                                            var27 += 15;
                                            class404.field5386.method1129(var26, -1, "In:" + class162.field1926 + "B/s Out:" + class215.field2614 + "B/s", (byte) 126, -256, var27);
                                            var27 += 15;
                                            int var33 = class453.field6284.method302() / 1024;
                                            class404.field5386.method1129(var26, -1, "Offheap:" + var33 + "k", (byte) 127, var33 > 65536 ? -65536 : -256, var27);
                                            var27 += 15;
                                            int var34 = 0;
                                            int var35 = 0;
                                            int var36 = 0;
                                            for (int var37 = 0; var37 < 34; var37++) {
                                                var34 += class294.field3864[var37].method1215(20);
                                                var35 += class294.field3864[var37].method1207(-1);
                                                var36 += class294.field3864[var37].method1213(0);
                                            }
                                            int var38 = var36 * 100 / var34;
                                            int var39 = var35 * 10000 / var34;
                                            String var40 = "Cache:" + class679.method3795((long) var39, 0, (byte) -43, 2, true) + "% (" + var38 + "%)";
                                            class419.field5573.method1129(var26, -1, var40, (byte) 124, -256, var27);
                                            var27 += 12;
                                        }
                                        if (class43.field452 > 0) {
                                            class419.field5573.method1129(var26, -1, "Particles: " + class396.field5283 + " / " + class43.field452, (byte) 125, -256, var27);
                                        }
                                        var27 += 12;
                                        if (class54.field553) {
                                            class419.field5573.method1129(var26, -1, "Polys: " + class453.field6284.method345() + " Models: " + class453.field6284.method385(), (byte) 127, -256, var27);
                                            var27 += 12;
                                            class419.field5573.method1129(var26, -1, "Ls: " + class491.field7120 + " La: " + class140.field1606 + " NPC: " + class593.field8430 + " Pl: " + class574.field8156, (byte) 126, -256, var27);
                                            class309.method1759(-122);
                                            var27 += 12;
                                        }
                                        class406.field5409[var12] = true;
                                        break label616;
                                    }
                                }
                                if (var11.field5112 == 0) {
                                    if (class200.field2440 == var11.field5091 && class453.field6284.method310()) {
                                        class453.field6284.method296(var13, var14, var11.field5035, var11.field4958);
                                    }
                                    method1947(arg0, var13 - var11.field5008, -var11.field5051 + var14, var22, var23, var25, var11.field5055, var24, (byte) 83, var12);
                                    if (var11.field4989 != null) {
                                        method1947(var11.field4989, var13 - var11.field5008, -var11.field5051 + var14, var22, var23, var25, var11.field5055, var24, (byte) 122, var12);
                                    }
                                    class454 var41 = (class454) class234.field2982.method3234((byte) -51, (long) var11.field5055);
                                    if (var41 != null) {
                                        class136.method761(-29365, var22, var14, var13, var12, var24, var41.field6291, var23, var25);
                                    }
                                    if (class200.field2440 == var11.field5091 && class453.field6284.method310()) {
                                        class453.field6284.method324();
                                        class234.field2983 = true;
                                    }
                                    class453.field6284.method314(arg3, arg4, arg5, arg7);
                                }
                                if (class576.field8221[var12] || class268.field3380 > 1) {
                                    if (var11.field5112 == 3) {
                                        if (var15 == 0) {
                                            if (var11.field5076) {
                                                class453.field6284.method286(var13, var14, var11.field5035, var11.field4958, var11.field5109, 0);
                                            } else {
                                                class453.field6284.method334(var13, var14, var11.field5035, var11.field4958, var11.field5109, 0);
                                            }
                                        } else if (var11.field5076) {
                                            class453.field6284.method286(var13, var14, var11.field5035, var11.field4958, 255 - (var15 & 0xFF) << 24 | var11.field5109 & 0xFFFFFF, 1);
                                        } else {
                                            class453.field6284.method334(var13, var14, var11.field5035, var11.field4958, var11.field5109 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                        }
                                    } else if (var11.field5112 == 4) {
                                        class195 var42 = var11.method2094(-1, class453.field6284);
                                        if (var42 != null) {
                                            int var43 = var11.field5109;
                                            String var44 = var11.field5068;
                                            if (var11.field5110 != -1) {
                                                class537 var45 = class472.field6588.method1903(var11.field5110, (byte) -113);
                                                var44 = var45.field7677;
                                                if (var44 == null) {
                                                    var44 = "null";
                                                }
                                                if ((var45.field7741 == 1 || var11.field4963 != 1) && var11.field4963 != -1) {
                                                    var44 = "<col=ff9040>" + var44 + "</col> x" + class625.method3504(var11.field4963, -101);
                                                }
                                            }
                                            if (class418.field5557 == var11) {
                                                var44 = class221.field2750.method1296(class226.field2899, (byte) -116);
                                                var43 = var11.field5109;
                                            }
                                            if (class641.field9076) {
                                                class453.field6284.method330(var13, var14, var11.field5035 + var13, var11.field4958 + var14);
                                            }
                                            var42.method1121(0, null, 0, class387.field5169, var11.field5017, var11.field5010, var11.field5070, null, var11.field5046, var11.field4958, var43 | 255 - (var15 & 0xFF) << 24, var44, var14, var11.field5034 ? 255 - (var15 & 0xFF) << 24 : -1, var13, var11.field5035, 2);
                                            if (class641.field9076) {
                                                class453.field6284.method314(arg3, arg4, arg5, arg7);
                                            }
                                        } else if (class689.field9734) {
                                            class567.method3207((byte) -69, var11);
                                        }
                                    } else if (var11.field5112 == 5) {
                                        if (var11.field5116 < 0) {
                                            class458 var47;
                                            if (var11.field5110 == -1) {
                                                var47 = var11.method2095(class453.field6284, 79);
                                            } else {
                                                class223 var46 = var11.field4965 ? class377.field4914.field6309 : null;
                                                var47 = class472.field6588.method1913(var11.field4963, class453.field6284, var11.field5110, var11.field4967, -1, var46, var11.field5049 | 0xFF000000, var11.field4981);
                                            }
                                            if (var47 != null) {
                                                int var48 = var47.method418();
                                                int var49 = var47.method408();
                                                int var50 = 255 - (var15 & 0xFF) << 24 | (var11.field5109 == 0 ? 16777215 : var11.field5109 & 0xFFFFFF);
                                                if (var11.field5111) {
                                                    class453.field6284.method330(var13, var14, var11.field5035 + var13, var14 - -var11.field4958);
                                                    if (var11.field5025 != 0) {
                                                        int var51 = (var11.field5035 + var48 - 1) / var48;
                                                        int var52 = (-(-var49 - var11.field4958) - 1) / var49;
                                                        for (int var53 = 0; var53 < var51; var53++) {
                                                            for (int var54 = 0; var54 < var52; var54++) {
                                                                if (var11.field5109 == 0) {
                                                                    var47.method2609((float) var48 / 2.0F + (float) (var13 + (var48 * var53)), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field5025);
                                                                } else {
                                                                    var47.method2614((float) var48 / 2.0F + (float) (var48 * var53 + var13), (float) var49 / 2.0F + (float) (var14 - -(var49 * var54)), 4096, var11.field5025, 0, var50, 1);
                                                                }
                                                            }
                                                        }
                                                    } else if (var11.field5109 == 0 && var15 == 0) {
                                                        var47.method2608(var13, var14, var11.field5035, var11.field4958);
                                                    } else {
                                                        var47.method420(var13, var14, var11.field5035, var11.field4958, 0, var50, 1);
                                                    }
                                                    class453.field6284.method314(arg3, arg4, arg5, arg7);
                                                } else if (var11.field5109 == 0 && var15 == 0) {
                                                    if (var11.field5025 != 0) {
                                                        var47.method2609((float) var11.field5035 / 2.0F + (float) var13, (float) var11.field4958 / 2.0F + (float) var14, var11.field5035 * 4096 / var48, var11.field5025);
                                                    } else if (var11.field5035 == var48 && var11.field4958 == var49) {
                                                        var47.method2612(var13, var14);
                                                    } else {
                                                        var47.method2611(var13, var14, var11.field5035, var11.field4958);
                                                    }
                                                } else if (var11.field5025 != 0) {
                                                    var47.method2614((float) var11.field5035 / 2.0F + (float) var13, (float) var11.field4958 / 2.0F + (float) var14, var11.field5035 * 4096 / var48, var11.field5025, 0, var50, 1);
                                                } else if (var11.field5035 == var48 && var11.field4958 == var49) {
                                                    var47.method416(var13, var14, 0, var50, 1);
                                                } else {
                                                    var47.method413(var13, var14, var11.field5035, var11.field4958, 0, var50, 1);
                                                }
                                            } else if (class689.field9734) {
                                                class567.method3207((byte) -69, var11);
                                            }
                                        } else {
                                            var11.method2089(class246.field3174, class196.field2366, 14455).method2198(var14, var13, 0, var11.field5059 << 3, -112, var11.field5035, 0, class453.field6284, var11.field4958, var11.field5125 << 3);
                                        }
                                    } else if (var11.field5112 == 6) {
                                        class416.method2246(-89);
                                        class350 var55 = null;
                                        int var56 = 0;
                                        if (var11.field5110 != -1) {
                                            class537 var57 = class472.field6588.method1903(var11.field5110, (byte) -124);
                                            if (var57 != null) {
                                                class537 var58 = var57.method3051(var11.field4963, (byte) -124);
                                                class576 var59 = var11.field5048 == -1 ? null : class618.field8696.method124(24006, var11.field5048);
                                                class223 var60 = var11.field4965 ? class377.field4914.field6309 : null;
                                                var55 = var58.method3064(var11.field4956, 1, 2048, var59, 128, class453.field6284, var60, var11.field5061, var11.field5027);
                                                if (var55 == null) {
                                                    class567.method3207((byte) -69, var11);
                                                } else {
                                                    var56 = -var55.method864() >> 1;
                                                }
                                            }
                                        } else if (var11.field5038 == 5) {
                                            int var65 = var11.field5072;
                                            if (var65 >= 0 && var65 < 2048) {
                                                class455 var66 = class362.field4726[var65];
                                                class576 var67 = var11.field5048 == -1 ? null : class618.field8696.method124(24006, var11.field5048);
                                                if (var66 != null && (class90.field1038 == var65 || class116.method706(var66.field6324, (byte) 66) == var11.field5028)) {
                                                    var55 = var66.field6309.method1313(true, 0, class608.field8585, var11.field4956, class491.field7127, var11.field5027, 2048, class618.field8696, -1, class422.field5623, null, var67, class453.field6284, var11.field5061, null, -1, 0, class209.field2546, class472.field6588);
                                                }
                                            }
                                        } else if (var11.field5038 == 8 || var11.field5038 == 9) {
                                            class472 var62 = class236.method1367(var11.field5072, true, false);
                                            class576 var63 = var11.field5048 == -1 ? null : class618.field8696.method124(24006, var11.field5048);
                                            if (var62 != null) {
                                                class223 var64 = var11.field4965 ? class377.field4914.field6309 : null;
                                                var55 = var62.method2680(var11.field4956, class453.field6284, false, var11.field5027, 2048, var11.field5028, var11.field5061, var63, var11.field5038 == 9, var64);
                                            }
                                        } else if (var11.field5048 == -1) {
                                            var55 = var11.method2093(0, class491.field7127, -127, class608.field8585, null, class209.field2546, 2048, class377.field4914.field6309, class422.field5623, class618.field8696, -1, -1, class453.field6284, class472.field6588);
                                            if (var55 == null && class689.field9734) {
                                                class567.method3207((byte) -69, var11);
                                            }
                                        } else {
                                            class576 var61 = class618.field8696.method124(24006, var11.field5048);
                                            var55 = var11.method2093(var11.field4956, class491.field7127, -128, class608.field8585, var61, class209.field2546, 2048, class377.field4914.field6309, class422.field5623, class618.field8696, var11.field5027, var11.field5061, class453.field6284, class472.field6588);
                                            if (var55 == null && class689.field9734) {
                                                class567.method3207((byte) -69, var11);
                                            }
                                        }
                                        if (var55 != null) {
                                            int var68;
                                            if (var11.field5085 <= 0) {
                                                var68 = 512;
                                            } else {
                                                var68 = (var11.field5035 << 9) / var11.field5085;
                                            }
                                            int var69;
                                            if (var11.field5069 <= 0) {
                                                var69 = 512;
                                            } else {
                                                var69 = (var11.field4958 << 9) / var11.field5069;
                                            }
                                            int var70 = (var11.field5003 * var68 >> 9) + var13 + (var11.field5035 / 2);
                                            int var71 = var11.field4958 / 2 + (var14 + (var11.field5083 * var69 >> 9));
                                            class139.field1593.method232();
                                            class453.field6284.method311(class139.field1593);
                                            class453.field6284.method306(var70, var71, var68, var69);
                                            class453.field6284.method366((float) (var11.field5094 << 2), var11.field4959 ? (float) (var11.field5067 << 2) : (float) (var11.field5067 << 2) * 1.5F);
                                            if (arg6 == -1412584499 || class234.field2983) {
                                                class453.field6284.method378();
                                                class453.field6284.method358();
                                                class453.field6284.method314(arg3, arg4, arg5, arg7);
                                                class234.field2983 = false;
                                            }
                                            if (var11.field4964) {
                                                class453.field6284.method329(false);
                                            }
                                            int var72 = (var11.field5066 << 2) * class285.field3655[var11.field5004 << 3] >> 14;
                                            int var73 = (var11.field5066 << 2) * class285.field3656[var11.field5004 << 3] >> 14;
                                            class617.field8679.method231(-var11.field5099 << 3);
                                            class617.field8679.method237(var11.field5043 << 3);
                                            class617.field8679.method235(var11.field5095 << 2, (var11.field4997 << 2) + var72 + var56, (var11.field4997 << 2) + var73);
                                            class617.field8679.method229(var11.field5004 << 3);
                                            var11.method2090(class617.field8679, -11409, var55, class453.field6284, class469.field6549);
                                            if (class641.field9076) {
                                                class453.field6284.method330(var13, var14, var13 + var11.field5035, var11.field4958 + var14);
                                            }
                                            if (var11.field4959) {
                                                var55.method871(class617.field8679, null, var11.field5066 << 2, 1);
                                            } else if (var11.field4962 == null) {
                                                var55.method904(class617.field8679, null, 1);
                                            } else {
                                                class453.field6284.method301(var55, var11.field4962.method1234(), class617.field8679, null, 1);
                                            }
                                            if (class641.field9076) {
                                                class453.field6284.method314(arg3, arg4, arg5, arg7);
                                            }
                                            if (var11.field4964) {
                                                class453.field6284.method329(true);
                                            }
                                            class453.field6284.method366(0.0F, 0.0F);
                                        }
                                    } else if (var11.field5112 == 9) {
                                        int var74;
                                        int var75;
                                        int var76;
                                        int var77;
                                        if (var11.field5081) {
                                            var76 = var14 + var11.field4958;
                                            var74 = var11.field5035 + var13;
                                            var77 = var13;
                                            var75 = var14;
                                        } else {
                                            var74 = var11.field5035 + var13;
                                            var75 = var14 + var11.field4958;
                                            var76 = var14;
                                            var77 = var13;
                                        }
                                        if (var11.field5057 == 1) {
                                            class453.field6284.method353(var77, var76, var74, var75, var11.field5109, 0);
                                        } else {
                                            class453.field6284.method354(var77, var76, var74, var75, var11.field5109, var11.field5057, 0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var10++;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I[BI[BII)I", line = 879)
    public final int method1948(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field4600++;
        if (arg5 != 8) {
            this.field4595 = null;
        }
        int var7 = 0;
        int var8 = arg4 << 3;
        int var9 = arg0 + arg2;
        while (arg0 < var9) {
            int var10 = arg3[arg0] & 0xFF;
            int var11 = this.field4597[var10];
            byte var12 = this.field4595[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var7 = class139.method776(var15, var11 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg1[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg1[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg1[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg1[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var8 += var12;
            arg0++;
        }
        return (var8 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lpi;I)I", line = 949)
    public static final int method1949(class455 arg0, int arg1) {
        if (arg1 != 25758) {
            field4599 = -104;
        }
        field4594++;
        int var2 = arg0.field6332;
        class468 var3 = arg0.method1653(1);
        if (arg0.field3779) {
            var2 = arg0.field6335;
        } else if (arg0.field3782 == var3.field6507 || arg0.field3782 == var3.field6504 || arg0.field3782 == var3.field6489 || arg0.field3782 == var3.field6520) {
            var2 = arg0.field6320;
        } else if (arg0.field3782 == var3.field6486 || arg0.field3782 == var3.field6485 || arg0.field3782 == var3.field6491 || arg0.field3782 == var3.field6523) {
            var2 = arg0.field6307;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V", line = 976)
    public static void method1950(int arg0) {
        field4598 = null;
        if (arg0 != 0) {
            method1945(121);
        }
        field4603 = null;
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "([B)V", line = 989)
    public class351(byte[] arg0) {
        int var2 = arg0.length;
        this.field4595 = arg0;
        this.field4597 = new int[var2];
        this.field4602 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field4597[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var8 | var7;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class139.method776(var11, var12);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field4602[var14] == 0) {
                            this.field4602[var14] = var4;
                        }
                        var14 = this.field4602[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field4602.length) {
                        int[] var18 = new int[this.field4602.length * 2];
                        for (int var19 = 0; var19 < this.field4602.length; var19++) {
                            var18[var19] = this.field4602[var19];
                        }
                        this.field4602 = var18;
                    }
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field4602[var14] = ~var5;
            }
        }
    }
}
