import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class253 extends class232 {

    @OriginalMember(owner = "client!bj", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field3867 = new String[] { method2147(method2146("q\u0015\u0018\u001a\u000e")), method2147(method2146("q\u0015\u0018\u0016\u000e")), method2147(method2146("q\u0015\u0018\u001d\u000e")), method2147(method2146("hQ\u0018v[")), method2147(method2146("}\nZ4")), method2147(method2146("q\u0015\u0018\u0014\u000e")), method2147(method2146("q\u0015\u0018\u0015\u000e")), method2147(method2146("q\u0015\u0018\u0013\u000e")) };

    @OriginalMember(owner = "client!bj", name = "O", descriptor = "F")
    public static float field3863;

    @OriginalMember(owner = "client!bj", name = "G", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!bj", name = "J", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!bj", name = "I", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!bj", name = "K", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!bj", name = "N", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!bj", name = "L", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!bj", name = "M", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
    public static final void method2143(String arg0, int arg1, String arg2) {
        try {
            class193.field3048 = 1;
            ++field3862;
            class42.field477 = -1;
            if (arg1 != 23247) {
                method2144(-17);
            }
            class683.field9892 = class185.field2943;
            class442.method3466(false, arg0, 2116, false, arg2);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3867[6] + (arg0 != null ? field3867[3] : field3867[4]) + ',' + arg1 + ',' + (arg2 != null ? field3867[3] : field3867[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
    public class253() {
        super(3, false);
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(II)[[I")
    public final int[][] method122(int arg0, int arg1) {
        try {
            ++field3865;
            if (arg0 != -3093) {
                this.method63(115, (class176) null, 14);
            }
            int[][] var3 = super.field3599.method1580(arg1, (byte) -106);
            if (super.field3599.field2743) {
                int[] var4 = this.method2022(arg1, 2, 0);
                int[][] var5 = this.method2023((byte) 94, arg1, 0);
                int[][] var6 = this.method2023((byte) 121, arg1, 1);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                int[] var10 = var5[0];
                int[] var11 = var5[1];
                int[] var12 = var5[2];
                int[] var13 = var6[0];
                int[] var14 = var6[1];
                int[] var15 = var6[2];
                for (int var16 = 0; ~class449.field6969 < ~var16; ++var16) {
                    int var17 = var4[var16];
                    if (~var17 != -4097) {
                        if (var17 != 0) {
                            int var18 = -var17 + 4096;
                            var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                            var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                            var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                        } else {
                            var7[var16] = var13[var16];
                            var8[var16] = var14[var16];
                            var9[var16] = var15[var16];
                        }
                    } else {
                        var7[var16] = var10[var16];
                        var8[var16] = var11[var16];
                        var9[var16] = var12[var16];
                    }
                }
            }
            return var3;
        } catch (RuntimeException var20) {
            throw class590.method4333(var20, field3867[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)V")
    public static final void method2144(int arg0) {
        try {
            ++field3864;
            if (class594.field8589 == null) {
                class594.field8589 = class678.method4935(6);
                class492.field7416 = class594.field8589[0];
                class662.field9438 = class712.method5167(-2334);
            }
            if (class355.field5711 == null) {
                class410.method3291(0);
            }
            class678 var1 = class492.field7416;
            int var2 = class302.method2599(false);
            if (class492.field7416 != var1) {
                if (class678.field9641 == class492.field7416) {
                    class355.field5711 = null;
                    class302.method2598(3, -3);
                } else {
                    class728.field10656 = var1.field9620.method5154(class795.field11624, (byte) 65);
                    class498.field7475 = var1.field9621;
                    if (class492.field7416.field9617) {
                        class728.field10656 = class728.field10656 + var1.field9621 + "%";
                    }
                    if (class492.field7416.field9612 || var1.field9612) {
                        class662.field9438 = class712.method5167(-2334);
                    }
                }
            } else {
                class728.field10656 = class492.field7416.field9615.method5154(class795.field11624, (byte) 65);
                if (class492.field7416.field9612) {
                    class498.field7475 = (-class492.field7416.field9611 + class492.field7416.field9621) * var2 / 100 + class492.field7416.field9611;
                }
                if (class492.field7416.field9617) {
                    class728.field10656 = class728.field10656 + class498.field7475 + "%";
                }
            }
            if (class355.field5711 != null) {
                class355.field5711.method4923(class498.field7475, (byte) 120, class662.field9438, class728.field10656, class492.field7416);
                if (class432.field6781 != null) {
                    for (int var3 = class728.field10658 + 1; var3 < class432.field6781.length; ++var3) {
                        if (~class432.field6781[var3].method2358(107) <= -101 && ~(var3 + -1) == ~class728.field10658 && class315.field5127 >= 1 && class355.field5711.method4924(arg0 + -20617)) {
                            try {
                                class432.field6781[var3].method2356(-128);
                            } catch (Exception var5) {
                                class432.field6781 = null;
                                break;
                            }
                            class355.field5711.method4927((byte) -8, class432.field6781[var3]);
                            ++class728.field10658;
                            if (~(class432.field6781.length + -1) >= ~class728.field10658 && ~class432.field6781.length < -2) {
                                class728.field10658 = class625.field9004.method4346(1) ? 0 : -1;
                            }
                        }
                    }
                }
            }
            if (arg0 != 20617) {
                method2145((byte) 42, (byte[]) null);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field3867[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        try {
            ++field3860;
            int[] var3 = super.field3601.method3467(arg0, (byte) -61);
            if (arg1 != 123) {
                return null;
            } else {
                if (super.field3601.field6907) {
                    int[] var4 = this.method2022(arg0, 0, 0);
                    int[] var5 = this.method2022(arg0, 1, 0);
                    int[] var6 = this.method2022(arg0, 2, arg1 ^ 123);
                    for (int var7 = 0; var7 < class449.field6969; ++var7) {
                        int var8 = var6[var7];
                        if (var8 == 4096) {
                            var3[var7] = var4[var7];
                        } else if (~var8 == -1) {
                            var3[var7] = var5[var7];
                        } else {
                            var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                        }
                    }
                }
                return var3;
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field3867[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILwq;I)V")
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            ++field3859;
            if (~arg2 == -1) {
                super.field3605 = arg1.method1645((byte) -81) == 1;
            }
            if (arg0 < 96) {
                method2145((byte) -17, (byte[]) null);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3867[2] + arg0 + ',' + (arg1 != null ? field3867[3] : field3867[4]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B[B)V")
    public static final void method2145(byte arg0, byte[] arg1) {
        try {
            ++field3861;
            class176 var2 = new class176(arg1);
            boolean var3 = false;
            while (true) {
                while (true) {
                    int var4 = var2.method1645((byte) -81);
                    if (var4 == 0) {
                        if (arg0 < 33) {
                            method2144(114);
                        }
                        if (var3) {
                            return;
                        }
                        if (class605.field8720 == null) {
                            class187.field2967 = new int[4];
                            class605.field8720 = new int[4];
                            class46.field521 = 4;
                        }
                        for (int var6 = 0; class605.field8720.length > var6; ++var6) {
                            class605.field8720[var6] = 0;
                            class187.field2967[var6] = var6 * 20;
                        }
                        return;
                    }
                    if (var4 != 1) {
                        if (var4 != 2) {
                            if (~var4 == -4) {
                                class46.field521 = var2.method1645((byte) -98);
                                class605.field8720 = new int[class46.field521];
                                class187.field2967 = new int[class46.field521];
                            } else if (var4 == 5) {
                                class36.field419 = var2.method1685(false);
                            } else if (var4 == 6) {
                                class586.field8498 = var2.method1685(false);
                            }
                        } else {
                            class623.field8988 = var2.method1687((byte) -85);
                        }
                    } else {
                        if (class605.field8720 == null) {
                            class605.field8720 = new int[4];
                            class187.field2967 = new int[4];
                            class46.field521 = 4;
                        }
                        for (int var5 = 0; class605.field8720.length > var5; ++var5) {
                            class605.field8720[var5] = var2.method1657(118);
                            class187.field2967[var5] = var2.method1657(70);
                        }
                        var3 = true;
                    }
                }
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field3867[7] + arg0 + ',' + (arg1 != null ? field3867[3] : field3867[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2146(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 38);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2147(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 19;
                    break;
                case 1:
                    var10005 = 127;
                    break;
                case 2:
                    var10005 = 54;
                    break;
                case 3:
                    var10005 = 88;
                    break;
                default:
                    var10005 = 38;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
