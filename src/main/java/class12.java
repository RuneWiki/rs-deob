import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class12 extends class243 {

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "I")
    private int field75 = 4096;

    @OriginalMember(owner = "client!ma", name = "G", descriptor = "Z")
    private boolean field73 = true;

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "Lea;")
    public static class547 field70 = new class547(52, 4);

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "Lea;")
    public static class547 field76 = new class547(2, 2);

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "[Z")
    public static boolean[] field78 = new boolean[100];

    @OriginalMember(owner = "client!ma", name = "M", descriptor = "I")
    public static int field79 = 0;

    @OriginalMember(owner = "client!ma", name = "E", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ma", name = "F", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!ma", name = "K", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V", line = 3)
    public class12() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILbi;)V", line = 8)
    public static final void method44(int arg0, int arg1, class481 arg2) {
        ++field74;
        boolean var3 = arg2.method2702((byte) -110, 1) == 1;
        if (var3) {
            class488.field6689[class729.field10172++] = arg0;
        }
        int var4 = arg2.method2702((byte) -48, 2);
        class83 var5 = class361.field4793[arg0];
        if (var4 == 0) {
            if (var3) {
                var5.field1139 = false;
            } else if (~class247.field3207 == ~arg0) {
                throw new RuntimeException("s:lr");
            } else {
                class169 var6 = class635.field8830[arg0] = new class169();
                var6.field2112 = (var5.field2175 << 28) + (var5.field898[0] + class99.field1313 >> 6 << 14) + (var5.field899[0] + class133.field1704 >> 6);
                if (var5.field1112 != -1) {
                    var6.field2108 = var5.field1112;
                } else {
                    var6.field2108 = var5.field854.method3756((byte) 116);
                }
                var6.field2111 = var5.field1142;
                var6.field2113 = var5.field809;
                if (~var5.field1129 < -1) {
                    class462.method2568(true, var5);
                }
                class361.field4793[arg0] = null;
                if (arg2.method2702((byte) -105, 1) != 0) {
                    class363.method2076(arg1 + -14, arg0, arg2);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg2.method2702((byte) -46, 3);
            int var8 = var5.field898[0];
            int var9 = var5.field899[0];
            if (var7 == 0) {
                --var8;
                --var9;
            } else if (~var7 != -2) {
                if (~var7 != -3) {
                    if (var7 == 3) {
                        --var8;
                    } else if (var7 == 4) {
                        ++var8;
                    } else if (~var7 == -6) {
                        ++var9;
                        --var8;
                    } else if (~var7 != -7) {
                        if (~var7 == -8) {
                            ++var8;
                            ++var9;
                        }
                    } else {
                        ++var9;
                    }
                } else {
                    --var9;
                    ++var8;
                }
            } else {
                --var9;
            }
            if (!var3) {
                var5.method609(var8, var9, class422.field5906[arg0], arg1 ^ -13);
            } else {
                var5.field1158 = var9;
                var5.field1139 = true;
                var5.field1124 = var8;
            }
        } else if (var4 == 2) {
            int var10 = arg2.method2702((byte) -85, 4);
            int var11 = var5.field898[0];
            int var12 = var5.field899[0];
            if (var10 != 0) {
                if (var10 != 1) {
                    if (~var10 == -3) {
                        var12 -= 2;
                    } else if (~var10 != -4) {
                        if (~var10 != -5) {
                            if (var10 != 5) {
                                if (var10 != 6) {
                                    if (var10 == 7) {
                                        var11 -= 2;
                                    } else if (~var10 == -9) {
                                        var11 += 2;
                                    } else if (var10 != 9) {
                                        if (var10 == 10) {
                                            var11 += 2;
                                            ++var12;
                                        } else if (~var10 != -12) {
                                            if (var10 != 12) {
                                                if (~var10 != -14) {
                                                    if (~var10 != -15) {
                                                        if (~var10 == -16) {
                                                            var11 += 2;
                                                            var12 += 2;
                                                        }
                                                    } else {
                                                        ++var11;
                                                        var12 += 2;
                                                    }
                                                } else {
                                                    var12 += 2;
                                                }
                                            } else {
                                                --var11;
                                                var12 += 2;
                                            }
                                        } else {
                                            var12 += 2;
                                            var11 -= 2;
                                        }
                                    } else {
                                        ++var12;
                                        var11 -= 2;
                                    }
                                } else {
                                    var11 += 2;
                                    --var12;
                                }
                            } else {
                                var11 -= 2;
                                --var12;
                            }
                        } else {
                            var11 += 2;
                            var12 -= 2;
                        }
                    } else {
                        ++var11;
                        var12 -= 2;
                    }
                } else {
                    var12 -= 2;
                    --var11;
                }
            } else {
                var11 -= 2;
                var12 -= 2;
            }
            if (!var3) {
                var5.method609(var11, var12, class422.field5906[arg0], arg1 + -13);
            } else {
                var5.field1158 = var12;
                var5.field1139 = true;
                var5.field1124 = var11;
            }
        } else {
            int var13 = arg2.method2702((byte) -53, 1);
            if (var13 == 0) {
                int var14 = arg2.method2702((byte) -102, 12);
                int var15 = var14 >> 10;
                int var16 = (var14 & 992) >> 5;
                if (~var16 < -16) {
                    var16 -= 32;
                }
                int var17 = var14 & 31;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field898[0] + var16;
                int var19 = var5.field899[0] - -var17;
                if (var3) {
                    var5.field1124 = var18;
                    var5.field1139 = true;
                    var5.field1158 = var19;
                } else {
                    var5.method609(var18, var19, class422.field5906[arg0], -1);
                }
                var5.field2175 = var5.field2167 = (byte) (3 & var5.field2175 + var15);
                if (class669.method3767(var19, (byte) -102, var18)) {
                    ++var5.field2167;
                }
                if (class247.field3207 == arg0) {
                    if (class61.field677 != var5.field2175) {
                        class315.field4252 = true;
                    }
                    class61.field677 = var5.field2175;
                }
            } else {
                int var20 = arg2.method2702((byte) -103, 30);
                int var21 = var20 >> 28;
                int var22 = 16383 & var20 >> 14;
                int var23 = 16383 & var20;
                int var24 = (class99.field1313 - -var22 + var5.field898[0] & 16383) + -class99.field1313;
                int var25 = (var5.field899[0] + class133.field1704 + var23 & 16383) + -class133.field1704;
                if (var3) {
                    var5.field1158 = var25;
                    var5.field1124 = var24;
                    var5.field1139 = true;
                } else {
                    var5.method609(var24, var25, class422.field5906[arg0], -1);
                }
                var5.field2175 = var5.field2167 = (byte) (3 & var5.field2175 + var21);
                if (class669.method3767(var25, (byte) -95, var24)) {
                    ++var5.field2167;
                }
                if (class247.field3207 == arg0) {
                    class61.field677 = var5.field2175;
                }
                if (arg1 != 12) {
                    field70 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILji;B)V", line = 332)
    public final void method1(int arg0, class611 arg1, byte arg2) {
        ++field72;
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field73 = ~arg1.method3428((byte) 81) == -2;
            }
        } else {
            this.field75 = arg1.method3402((byte) 127);
        }
        if (arg2 > -92) {
            this.method1(124, (class611) null, (byte) 77);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIILjava/lang/Object;)[B", line = 366)
    public static final byte[] method45(int arg0, int arg1, int arg2, Object arg3) {
        ++field77;
        if (arg3 == null) {
            return null;
        } else if (arg3 instanceof byte[]) {
            byte[] var4 = (byte[]) arg3;
            return class617.method3476(arg1, arg2, var4, (byte) 50);
        } else {
            if (arg0 != 2) {
                method45(-113, -64, 86, (Object) null);
            }
            if (arg3 instanceof class198) {
                class198 var5 = (class198) arg3;
                return var5.method1098(arg2, arg1, false);
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)[[I", line = 397)
    public final int[][] method2(int arg0, int arg1) {
        ++field71;
        if (arg0 > -76) {
            return null;
        } else {
            int[][] var3 = super.field3156.method3306(arg1, 0);
            if (super.field3156.field8335) {
                int[] var4 = this.method1462(arg1 + -1 & class625.field8744, 0, 0);
                int[] var5 = this.method1462(arg1, 0, 0);
                int[] var6 = this.method1462(class625.field8744 & arg1 + 1, 0, 0);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                for (int var10 = 0; var10 < class687.field9628; ++var10) {
                    int var11 = (var6[var10] - var4[var10]) * this.field75;
                    int var12 = (var5[var10 + 1 & class28.field206] + -var5[var10 - 1 & class28.field206]) * this.field75;
                    int var13 = var12 >> 12;
                    int var14 = var11 >> 12;
                    int var15 = var13 * var13 >> 12;
                    int var16 = var14 * var14 >> 12;
                    int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                    int var18;
                    int var19;
                    int var20;
                    if (var17 != 0) {
                        var18 = var12 / var17;
                        var19 = 16777216 / var17;
                        var20 = var11 / var17;
                    } else {
                        var19 = 0;
                        var18 = 0;
                        var20 = 0;
                    }
                    if (this.field73) {
                        var18 = 2048 - -(var18 >> 1);
                        var20 = (var20 >> 1) + 2048;
                        var19 = (var19 >> 1) + 2048;
                    }
                    var7[var10] = var18;
                    var8[var10] = var20;
                    var9[var10] = var19;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V", line = 492)
    public static void method46(int arg0) {
        field70 = null;
        field78 = null;
        field76 = null;
        if (arg0 != 0) {
            method46(97);
        }
    }
}
