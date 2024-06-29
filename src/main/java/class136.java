import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class136 {

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "[B")
    private byte[] field2945;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "[I")
    private int[] field2943;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "[I")
    private int[] field2947;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Lgg;")
    public static class63 field2935 = class116.method911(43, "rect_debug=");

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field2932 = 0;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field2933 = 0;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "[I")
    public static int[] field2948 = new int[50];

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "Lgg;")
    private static class63 field2940 = class116.method911(43, " seconds)3");

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "Lgg;")
    public static class63 field2949 = field2940;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "[Lrc;")
    public static class156[] field2936;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLeh;)V")
    public static final void method986(byte arg0, class47 arg1) {
        field2946++;
        if (class173.field3571 == arg1.field1140 || arg1.field1167 == -1 || arg1.field1152 != 0 || arg1.field1121 + 1 > class49.method480(1000, arg1.field1167).field201[arg1.field1097]) {
            int var2 = arg1.field1140 - arg1.field1126;
            int var3 = class173.field3571 - arg1.field1126;
            int var4 = arg1.field1098 * 128 + arg1.field1123 * 64;
            int var5 = arg1.field1153 * 128 + arg1.field1123 * 64;
            int var6 = arg1.field1158 * 128 + arg1.field1123 * 64;
            arg1.field1141 = ((var2 - var3) * var5 + var3 * var6) / var2;
            int var7 = arg1.field1123 * 64 + arg1.field1107 * 128;
            arg1.field1144 = ((var2 - var3) * var4 + var3 * var7) / var2;
        }
        if (arg1.field1166 == 0) {
            arg1.field1129 = 1024;
        }
        if (arg0 != 55) {
            return;
        }
        if (arg1.field1166 == 1) {
            arg1.field1129 = 1536;
        }
        arg1.field1148 = 0;
        if (arg1.field1166 == 2) {
            arg1.field1129 = 0;
        }
        if (arg1.field1166 == 3) {
            arg1.field1129 = 512;
        }
        arg1.field1104 = arg1.field1129;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static final void method987(int arg0) {
        field2938++;
        class174.field3575.method282((byte) -59);
        if (arg0 != 64) {
            method995(0, (byte) -18, -92);
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
    public static void method988(int arg0) {
        field2935 = null;
        field2936 = null;
        if (arg0 > 28) {
            field2948 = null;
            field2940 = null;
            field2949 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([BB[BIII)I")
    public final int method989(byte[] arg0, byte arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        int var7 = 92 % ((arg1 + 68) / 47);
        int var8 = 0;
        int var9 = arg3 + arg5;
        int var10 = arg4 << 3;
        field2950++;
        while (var9 > arg3) {
            int var11 = arg0[arg3] & 0xFF;
            int var12 = this.field2947[var11];
            byte var13 = this.field2945[var11];
            if (var13 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var10 & 0x7;
            int var15 = var10 >> 3;
            int var16 = var8 & -var14 >> 31;
            var10 += var13;
            int var17 = (var14 + var13 - 1 >> 3) + var15;
            int var18 = var14 + 24;
            arg2[var15] = (byte) (var8 = class202.method1332(var16, var12 >>> var18));
            if (var15 < var17) {
                var14 = var18 - 8;
                var15++;
                arg2[var15] = (byte) (var8 = var12 >>> var14);
                if (var15 < var17) {
                    var15++;
                    var14 -= 8;
                    arg2[var15] = (byte) (var8 = var12 >>> var14);
                    if (var17 > var15) {
                        var15++;
                        var14 -= 8;
                        arg2[var15] = (byte) (var8 = var12 >>> var14);
                        if (var17 > var15) {
                            var15++;
                            var14 -= 8;
                            arg2[var15] = (byte) (var8 = var12 << -var14);
                        }
                    }
                }
            }
            arg3++;
        }
        return (var10 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)Z")
    public static final boolean method990(int arg0, int arg1) {
        int var2 = 68 % ((arg0 + 31) / 41);
        field2937++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BIILjc;)Lwb;")
    public static final class200 method991(byte arg0, int arg1, int arg2, class85 arg3) {
        int var4 = 18 % ((32 - arg0) / 41);
        field2944++;
        return class117.method917(arg3, arg2, arg1, -20878) ? class69.method635(-9448) : null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lka;IIIII)V")
    public static final void method992(class92 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class168.field3469 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class199.field3979) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class13.field298 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class96 var14 = class148.field3117[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class97.field2310[var11][var12 + 1][var13] + class97.field2310[var11][var12][var13] + class97.field2310[var11][var12][var13 + 1] + class97.field2310[var11][var12 + 1][var13 + 1]) / 4 - (class97.field2310[arg1][arg2 + 1][arg3] + class97.field2310[arg1][arg2][arg3] + class97.field2310[arg1][arg2][arg3 + 1] + class97.field2310[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class116 var16 = var14.field2277;
                                    if (var16 != null) {
                                        if (var16.field2603 instanceof class92) {
                                            class92 var17 = (class92) var16.field2603;
                                            class92.method797(arg0, var17, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field2594 instanceof class92) {
                                            class92 var18 = (class92) var16.field2594;
                                            class92.method797(arg0, var18, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var19 = 0; var19 < var14.field2272; var19++) {
                                        class98 var20 = var14.field2284[var19];
                                        if (var20 != null && var20.field2316 instanceof class92) {
                                            class92 var21 = (class92) var20.field2316;
                                            int var22 = var20.field2324 + 1 - var20.field2330;
                                            int var23 = var20.field2321 + 1 - var20.field2325;
                                            class92.method797(arg0, var21, (var20.field2330 - arg2) * 128 + (var22 - arg4) * 64, var15, (var20.field2325 - arg3) * 128 + (var23 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lgg;Ljc;IILgg;ZI)V")
    public static final void method993(class63 arg0, class85 arg1, int arg2, int arg3, class63 arg4, boolean arg5, int arg6) {
        field2939++;
        if (arg3 != 64) {
            method988(-26);
        }
        int var7 = arg1.method751(arg3 ^ 0xFFFF8D15, arg4);
        int var8 = arg1.method748(0, arg0, var7);
        class104.method862(var7, -23216, arg5, var8, arg2, arg6, arg1);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III[BB[B)I")
    public final int method994(int arg0, int arg1, int arg2, byte[] arg3, byte arg4, byte[] arg5) {
        field2942++;
        if (arg1 == 0) {
            return 0;
        }
        int var7 = arg0 + arg1;
        int var8 = 0;
        int var9 = -111 % ((-arg4 - 44) / 63);
        int var10 = arg2;
        while (true) {
            byte var11 = arg3[var10];
            if (var11 >= 0) {
                var8++;
            } else {
                var8 = this.field2943[var8];
            }
            int var12;
            if ((var12 = this.field2943[var8]) < 0) {
                arg5[arg0++] = (byte) ~var12;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field2943[var8];
            }
            int var13;
            if ((var13 = this.field2943[var8]) < 0) {
                arg5[arg0++] = (byte) ~var13;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field2943[var8];
            }
            int var14;
            if ((var14 = this.field2943[var8]) < 0) {
                arg5[arg0++] = (byte) ~var14;
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field2943[var8];
            }
            int var15;
            if ((var15 = this.field2943[var8]) < 0) {
                arg5[arg0++] = (byte) ~var15;
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field2943[var8];
            }
            int var16;
            if ((var16 = this.field2943[var8]) < 0) {
                arg5[arg0++] = (byte) ~var16;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field2943[var8];
            }
            int var17;
            if ((var17 = this.field2943[var8]) < 0) {
                arg5[arg0++] = (byte) ~var17;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field2943[var8];
            }
            int var18;
            if ((var18 = this.field2943[var8]) < 0) {
                arg5[arg0++] = (byte) ~var18;
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field2943[var8];
            }
            int var19;
            if ((var19 = this.field2943[var8]) < 0) {
                arg5[arg0++] = (byte) ~var19;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            var10++;
        }
        return var10 + 1 - arg2;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "([B)V")
    public class136(byte[] arg0) {
        int var2 = arg0.length;
        int[] var3 = new int[33];
        this.field2945 = arg0;
        int var4 = 0;
        this.field2943 = new int[8];
        this.field2947 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field2947[var5] = var8;
                int var12;
                if ((var7 & var8) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var10 & var11) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class202.method1332(var11, var10);
                    }
                    var12 = var7 | var8;
                } else {
                    var12 = var3[var6 - 1];
                }
                var3[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field2943[var14] == 0) {
                            this.field2943[var14] = var4;
                        }
                        var14 = this.field2943[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field2943.length <= var14) {
                        int[] var18 = new int[this.field2943.length * 2];
                        for (int var19 = 0; var19 < this.field2943.length; var19++) {
                            var18[var19] = this.field2943[var19];
                        }
                        this.field2943 = var18;
                    }
                }
                this.field2943[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBI)V")
    public static final void method995(int arg0, byte arg1, int arg2) {
        if (arg1 <= 24) {
            method993(null, null, -31, -48, null, true, 94);
        }
        class141.field3031.method854(73, true);
        class141.field3031.method53(arg0, 1623728984);
        class195.field3916++;
        class141.field3031.method24(arg2, 127);
        field2941++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/Object;ILqe;)V")
    public static final void method996(Object arg0, int arg1, class149 arg2) {
        field2934++;
        if (arg2.field3139 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field3139.peekEvent() != null; var3++) {
            class196.method1281((byte) -8, 1L);
        }
        if (arg1 != -964) {
            field2936 = null;
        }
        if (arg0 != null) {
            arg2.field3139.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }
}
