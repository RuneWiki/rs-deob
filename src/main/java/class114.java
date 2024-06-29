import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class114 {

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "[I")
    private int[] field2143;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "[I")
    private int[] field2137;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "[B")
    private byte[] field2132;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "Lqe;")
    public static class179 field2139 = null;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "[Lpd;")
    public static class167[] field2141 = new class167[100];

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "Lqe;")
    public static class179 field2138 = class206.method1380("Fps:", (byte) -127);

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "Lsg;")
    public static class201 field2140 = new class201(260);

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "Lqe;")
    public static class179 field2144 = class206.method1380(": ", (byte) -126);

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
    public static void method731(byte arg0) {
        field2139 = null;
        field2141 = null;
        field2140 = null;
        field2138 = null;
        if (arg0 >= 118) {
            field2144 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIBII)V")
    public static final void method732(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != -60) {
            method734(110, -11, -13);
        }
        if (arg1 <= arg0) {
            class23.method161(arg0, arg2 ^ 0x3B, arg3, arg1, class14.field331[arg4]);
        } else {
            class23.method161(arg1, arg2 ^ 0x3B, arg3, arg0, class14.field331[arg4]);
        }
        field2131++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II[Lp;I)V")
    public static final void method733(int arg0, int arg1, class163[] arg2, int arg3) {
        if (arg3 < arg0) {
            int var4 = arg3 - 1;
            int var5 = arg0 + 1;
            int var6 = (arg3 + arg0) / 2;
            class163 var7 = arg2[var6];
            arg2[var6] = arg2[arg3];
            arg2[arg3] = var7;
            while (var5 > var4) {
                boolean var8 = true;
                do {
                    var5--;
                    for (int var9 = 0; var9 < 4; var9++) {
                        int var10;
                        int var11;
                        if (class227.field4204[var9] == 2) {
                            var10 = var7.field2936;
                            var11 = arg2[var5].field2936;
                        } else if (class227.field4204[var9] == 1) {
                            var10 = var7.field2937;
                            var11 = arg2[var5].field2937;
                            if (var11 == -1 && class171.field3071[var9] == 1) {
                                var11 = 2001;
                            }
                            if (var10 == -1 && class171.field3071[var9] == 1) {
                                var10 = 2001;
                            }
                        } else if (class227.field4204[var9] == 3) {
                            var11 = arg2[var5].field2943 ? 1 : 0;
                            var10 = var7.field2943 ? 1 : 0;
                        } else {
                            var11 = arg2[var5].field2942;
                            var10 = var7.field2942;
                        }
                        if (var10 != var11) {
                            if ((class171.field3071[var9] != 1 || var11 <= var10) && (class171.field3071[var9] != 0 || var10 <= var11)) {
                                var8 = false;
                            }
                            break;
                        }
                        if (var9 == 3) {
                            var8 = false;
                        }
                    }
                } while (var8);
                boolean var12 = true;
                do {
                    var4++;
                    for (int var13 = 0; var13 < 4; var13++) {
                        int var14;
                        int var15;
                        if (class227.field4204[var13] == 2) {
                            var15 = var7.field2936;
                            var14 = arg2[var4].field2936;
                        } else if (class227.field4204[var13] == 1) {
                            var14 = arg2[var4].field2937;
                            var15 = var7.field2937;
                            if (var14 == -1 && class171.field3071[var13] == 1) {
                                var14 = 2001;
                            }
                            if (var15 == -1 && class171.field3071[var13] == 1) {
                                var15 = 2001;
                            }
                        } else if (class227.field4204[var13] == 3) {
                            var14 = arg2[var4].field2943 ? 1 : 0;
                            var15 = var7.field2943 ? 1 : 0;
                        } else {
                            var14 = arg2[var4].field2942;
                            var15 = var7.field2942;
                        }
                        if (var14 != var15) {
                            if ((class171.field3071[var13] != 1 || var14 >= var15) && (class171.field3071[var13] != 0 || var14 <= var15)) {
                                var12 = false;
                            }
                            break;
                        }
                        if (var13 == 3) {
                            var12 = false;
                        }
                    }
                } while (var12);
                if (var4 < var5) {
                    class163 var16 = arg2[var4];
                    arg2[var4] = arg2[var5];
                    arg2[var5] = var16;
                }
            }
            method733(var5, -111, arg2, arg3);
            method733(arg0, -114, arg2, var5 + 1);
        }
        if (arg1 >= -108) {
            field2140 = null;
        }
        field2142++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)Lwc;")
    public static final class237 method734(int arg0, int arg1, int arg2) {
        class197 var3 = class229.field4232[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3680;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BI)Lmd;")
    public static final class134 method735(byte arg0, int arg1) {
        field2136++;
        class134 var2 = (class134) class16.field434.method1299((byte) -127, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class90.field1708.method342(class18.method134((byte) 98, arg1), class217.method1421(arg1, arg0 + 163), (byte) -51);
        class134 var4 = new class134();
        var4.field2461 = arg1;
        if (var3 != null) {
            var4.method861(arg0 ^ 0xFFFF9907, new class185(var3));
        }
        if (arg0 != -77) {
            return null;
        }
        var4.method862(65);
        if (!class95.field1795 && var4.field2455) {
            var4.field2454 = null;
        }
        if (var4.field2472) {
            var4.field2443 = 0;
            var4.field2477 = false;
        }
        class16.field434.method1303(var4, (long) arg1, (byte) -122);
        return var4;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([BIIIB[B)I")
    public final int method736(byte[] arg0, int arg1, int arg2, int arg3, byte arg4, byte[] arg5) {
        int var7 = arg2 + arg3;
        field2134++;
        if (arg4 != 116) {
            return 79;
        }
        int var8 = 0;
        int var9 = arg1 << 3;
        while (arg3 < var7) {
            int var10 = arg0[arg3] & 0xFF;
            int var11 = this.field2137[var10];
            byte var12 = this.field2132[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var8 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            var9 += var12;
            int var17 = var14 + 24;
            arg5[var13] = (byte) (var8 = class125.method790(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg5[var13] = (byte) (var8 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg5[var13] = (byte) (var8 = var11 >>> var14);
                    if (var16 > var13) {
                        var14 -= 8;
                        var13++;
                        arg5[var13] = (byte) (var8 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg5[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg3++;
        }
        return (var9 + 7 >> 3) - arg1;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I[BIII[B)I")
    public final int method737(int arg0, byte[] arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field2133++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg0 + arg3;
        int var9 = arg4;
        if (arg2 != 9158) {
            this.field2143 = null;
        }
        while (true) {
            byte var10 = arg5[var9];
            if (var10 >= 0) {
                var7++;
            } else {
                var7 = this.field2143[var7];
            }
            int var11;
            if ((var11 = this.field2143[var7]) < 0) {
                arg1[arg0++] = (byte) ~var11;
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field2143[var7];
            }
            int var12;
            if ((var12 = this.field2143[var7]) < 0) {
                arg1[arg0++] = (byte) ~var12;
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field2143[var7];
            }
            int var13;
            if ((var13 = this.field2143[var7]) < 0) {
                arg1[arg0++] = (byte) ~var13;
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field2143[var7];
            }
            int var14;
            if ((var14 = this.field2143[var7]) < 0) {
                arg1[arg0++] = (byte) ~var14;
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field2143[var7];
            }
            int var15;
            if ((var15 = this.field2143[var7]) < 0) {
                arg1[arg0++] = (byte) ~var15;
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field2143[var7];
            }
            int var16;
            if ((var16 = this.field2143[var7]) < 0) {
                arg1[arg0++] = (byte) ~var16;
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field2143[var7];
            }
            int var17;
            if ((var17 = this.field2143[var7]) < 0) {
                arg1[arg0++] = (byte) ~var17;
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field2143[var7];
            }
            int var18;
            if ((var18 = this.field2143[var7]) < 0) {
                arg1[arg0++] = (byte) ~var18;
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg4;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "([B)V")
    public class114(byte[] arg0) {
        int var2 = arg0.length;
        this.field2143 = new int[8];
        this.field2137 = new int[var2];
        this.field2132 = arg0;
        int var3 = 0;
        int[] var4 = new int[33];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field2137[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var8 | var7;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var4[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var4[var10] = var4[var10 - 1];
                            break;
                        }
                        var4[var10] = class125.method790(var12, var11);
                    }
                } else {
                    var9 = var4[var6 - 1];
                }
                var4[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field2143[var14] == 0) {
                            this.field2143[var14] = var3;
                        }
                        var14 = this.field2143[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field2143.length) {
                        int[] var18 = new int[this.field2143.length * 2];
                        for (int var19 = 0; var19 < this.field2143.length; var19++) {
                            var18[var19] = this.field2143[var19];
                        }
                        this.field2143 = var18;
                    }
                }
                if (var3 <= var14) {
                    var3 = var14 + 1;
                }
                this.field2143[var14] = ~var5;
            }
        }
    }
}
