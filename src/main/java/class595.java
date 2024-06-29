import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class595 {

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "Lmv;")
    private class295 field8613;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "Lmv;")
    private class295 field8620;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "[Lofa;")
    public static class128[] field8611 = new class128[14];

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "Lvg;")
    public static class622 field8614 = new class622(10, -1);

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
    public static int field8621 = -1;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field8609;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field8610;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field8612;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field8615;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field8617;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public static int field8619;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "Lmv;")
    public static class295 field8616;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "Lsc;")
    private class38 field8618;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIB)I", line = 5)
    public static final int method3384(int arg0, int arg1, byte arg2) {
        field8609++;
        double var3 = Math.log((double) arg1) / Math.log(2.0D);
        if (arg2 >= -96) {
            field8621 = -32;
        }
        double var5 = Math.log((double) arg0) / Math.log(2.0D);
        double var7 = Math.random() * (var3 - var5) + var5;
        return (int) (Math.pow(2.0D, var7) + 0.5D);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)Lsc;", line = 23)
    private final class38 method3385(int arg0) {
        field8615++;
        int var2 = 82 % ((-arg0 - 6) / 56);
        if (this.field8618 == null) {
            this.field8618 = new class38();
        }
        return this.field8618;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIII)V", line = 37)
    public static final void method3386(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != -11356) {
            method3384(-60, -22, (byte) 59);
        }
        if (class335.field4872.field9495 != 0 && arg5 != 0 && class380.field5732 < 50 && arg6 != -1) {
            class141.field2038[class380.field5732++] = new class268((byte) 1, arg6, arg5, arg3, arg0, arg1, arg2, null);
        }
        field8610++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILhh;ILhi;ZLr;)Z", line = 56)
    public static final boolean method3387(int arg0, class168 arg1, int arg2, class415 arg3, boolean arg4, class98 arg5) {
        field8617++;
        int var6 = Integer.MAX_VALUE;
        if (arg4) {
            return true;
        }
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg1.field2361 != null) {
            var9 = class55.field854 - ((arg1.field2374 + arg3.field6145 - class55.field853) * (class55.field854 - class55.field867) / (class55.field849 - class55.field853));
            var7 = (arg1.field2344 + arg3.field6143 - class55.field864) * (class55.field862 - class55.field858) / (class55.field852 - class55.field864) + class55.field858;
            var8 = class55.field854 - ((class55.field854 - class55.field867) * (arg1.field2355 + arg3.field6145 - class55.field853) / (class55.field849 - class55.field853));
            var6 = (arg1.field2373 + arg3.field6143 - class55.field864) * (class55.field862 - class55.field858) / (class55.field852 - class55.field864) + class55.field858;
        }
        class256 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg1.field2379 != -1) {
            if (arg3.field6140 && arg1.field2357 != -1) {
                var10 = arg1.method1175(true, -112, arg5);
            } else {
                var10 = arg1.method1175(false, -112, arg5);
            }
            if (var10 != null) {
                var11 = arg3.field6139 - (var10.method50() + 1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                var12 = arg3.field6139 + (var10.method50() + 1 >> 1);
                var13 = arg3.field6146 - (var10.method43() + 1 >> 1);
                if (var12 > var7) {
                    var7 = var12;
                }
                var14 = arg3.field6146 + (var10.method43() + 1 >> 1);
                if (var13 < var8) {
                    var8 = var13;
                }
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class421 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg1.field2372 != null) {
            var15 = class457.method2676(!arg4, arg1.field2370);
            if (var15 != null) {
                var16 = class446.field6477.method3459(null, class194.field2605, null, arg1.field2372, -72);
                int var23 = arg3.field6146;
                if (var10 == null) {
                    var17 = var23 - var16 * var15.method2547() / 2;
                } else {
                    var17 = var23 - ((var10.method43() >> 1) + (var16 * var15.method2549()));
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class194.field2605[var24];
                    if (var24 < (var16 - 1)) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method2545(var25);
                    if (var18 < var26) {
                        var18 = var26;
                    }
                }
                var19 = arg3.field6139 + arg2 - var18 / 2;
                if (var19 < var6) {
                    var6 = var19;
                }
                var20 = arg3.field6139 + arg2 + (var18 / 2);
                var21 = arg0 + var17;
                if (var7 < var20) {
                    var7 = var20;
                }
                var22 = var17 + var15.method2549() * var16 + arg0;
                if (var8 > var21) {
                    var8 = var21;
                }
                if (var9 < var22) {
                    var9 = var22;
                }
            }
        }
        if (class55.field858 > var7 || var6 > class55.field862 || var9 < class55.field867 || var8 > class55.field854) {
            return true;
        }
        if (arg1.field2361 != null) {
            int[] var27 = new int[arg1.field2361.length];
            for (int var28 = 0; var28 < (var27.length / 2); var28++) {
                int var30 = arg1.field2361[var28 * 2] + arg3.field6143;
                int var31 = arg1.field2361[var28 * 2 + 1] + arg3.field6145;
                var27[var28 * 2] = (var30 - class55.field864) * (class55.field862 - class55.field858) / (class55.field852 - class55.field864) + class55.field858;
                var27[var28 * 2 + 1] = class55.field854 - ((class55.field854 - class55.field867) * (var31 - class55.field853) / (class55.field849 - class55.field853));
            }
            class156.method1119(arg5, var27, arg1.field2364);
            for (int var29 = 0; var29 < (var27.length / 2 - 1); var29++) {
                arg5.method664(var27[var29 * 2], var27[var29 * 2 + 3], 1, var27[var29 * 2 + 1], var27[var29 * 2 + 2], arg1.field2365);
            }
            arg5.method664(var27[var27.length - 2], var27[1], 1, var27[var27.length - 1], var27[0], arg1.field2365);
        }
        if (var10 != null) {
            if (class606.field8764 > 0 && (class164.field2305 != -1 && class164.field2305 == arg3.field6142 || class280.field3710 != -1 && class280.field3710 == arg1.field2380)) {
                int var32;
                if (class405.field6057 > 50) {
                    var32 = 200 - (class405.field6057 * 2);
                } else {
                    var32 = class405.field6057 * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg5.method678(arg3.field6146, var10.method48() / 2 + 7, arg3.field6139, 1, var33);
                arg5.method678(arg3.field6146, var10.method48() / 2 + 5, arg3.field6139, 1, var33);
                arg5.method678(arg3.field6146, var10.method48() / 2 + 3, arg3.field6139, 1, var33);
                arg5.method678(arg3.field6146, var10.method48() / 2 + 1, arg3.field6139, 1, var33);
                arg5.method678(arg3.field6146, var10.method48() / 2, arg3.field6139, 1, var33);
            }
            var10.method1534(arg3.field6139 - (var10.method50() >> 1), arg3.field6146 - (var10.method43() >> 1));
        }
        if (arg1.field2372 != null && var15 != null) {
            class571.method3281(var16, -19480, arg5, var17, var18, arg3, var15, arg1);
        }
        if (arg1.field2379 != -1 || arg1.field2372 != null) {
            class51 var34 = new class51(arg3);
            var34.field789 = var13;
            var34.field794 = var11;
            var34.field786 = var12;
            var34.field792 = var20;
            var34.field799 = var22;
            var34.field795 = var21;
            var34.field800 = var19;
            var34.field793 = var14;
            class507.field7162.method1909(var34, (byte) -81);
        }
        return false;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V", line = 267)
    public static void method3388(int arg0) {
        field8614 = null;
        field8616 = null;
        int var1 = 17 / ((arg0 - 22) / 50);
        field8611 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILnda;)Ljt;", line = 279)
    public final class590 method3389(int arg0, class655 arg1) {
        field8619++;
        if (arg1 == null) {
            return null;
        }
        class139 var3 = arg1.method599(arg0 ^ 0xFFFFFF8B);
        if (class20.field385 == var3) {
            return new class631((class505) arg1);
        } else if (class350.field5178 == var3) {
            return new class556(this.method3385(-114), (class441) arg1);
        } else if (class625.field9042 == var3) {
            return new class478(this.field8613, (class231) arg1);
        } else {
            if (arg0 != -1) {
                this.method3385(-86);
            }
            if (class498.field7042 == var3) {
                return new class223(this.field8613, (class403) arg1);
            } else if (class125.field1826 == var3) {
                return new class357(this.field8613, this.field8620, (class100) arg1);
            } else if (class338.field4916 == var3) {
                return new class283(this.field8613, this.field8620, (class508) arg1);
            } else if (class639.field9182 == var3) {
                return new class701(this.field8613, this.field8620, (class251) arg1);
            } else if (class538.field7897 == var3) {
                return new class477(this.field8613, this.field8620, (class96) arg1);
            } else if (class460.field6627 == var3) {
                return new class378(this.field8613, (class145) arg1);
            } else if (class285.field3809 == var3) {
                return new class660(this.field8613, this.field8620, (class683) arg1);
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BIIIIIII)V", line = 329)
    public static final void method3390(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8612++;
        int var8 = 0;
        int var9 = arg7;
        int var10 = 0;
        int var11 = arg2 - arg3;
        int var12 = arg7 - arg3;
        int var13 = arg2 * arg2;
        int var14 = arg7 * arg7;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg7 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        if (arg0 <= 42) {
            return;
        }
        int var26 = var16 - (var22 - 1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg7 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        if (arg6 >= class323.field4704 && class148.field2106 >= arg6) {
            int[] var39 = class565.field8253[arg6];
            int var40 = class79.method461((byte) 126, class375.field5631, arg5 - arg2, class175.field2455);
            int var41 = class79.method461((byte) 59, class375.field5631, arg2 + arg5, class175.field2455);
            int var42 = class79.method461((byte) 96, class375.field5631, arg5 - var11, class175.field2455);
            int var43 = class79.method461((byte) 67, class375.field5631, arg5 + var11, class175.field2455);
            class41.method235(var40, var39, 0, var42, arg1);
            class41.method235(var42, var39, 0, var43, arg4);
            class41.method235(var43, var39, 0, var41, arg1);
        }
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var35 += var28;
                    var8++;
                    var31 += var28;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        var33 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var33 += var30;
                    var10++;
                    var37 += var30;
                }
                var25 += -var38;
                var26 += -var34;
                var34 -= var29;
                var38 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var35 += var28;
                var31 += var28;
                var8++;
            }
            var23 += -var36;
            var24 += -var32;
            var9--;
            var32 -= var27;
            var36 -= var27;
            int var45 = arg6 - var9;
            int var46 = arg6 + var9;
            if (var46 >= class323.field4704 && var45 <= class148.field2106) {
                int var47 = class79.method461((byte) 114, class375.field5631, arg5 + var8, class175.field2455);
                int var48 = class79.method461((byte) 93, class375.field5631, arg5 - var8, class175.field2455);
                if (var44) {
                    int var49 = class79.method461((byte) 121, class375.field5631, arg5 + var10, class175.field2455);
                    int var50 = class79.method461((byte) 94, class375.field5631, arg5 - var10, class175.field2455);
                    if (var45 >= class323.field4704) {
                        int[] var51 = class565.field8253[var45];
                        class41.method235(var48, var51, 0, var50, arg1);
                        class41.method235(var50, var51, 0, var49, arg4);
                        class41.method235(var49, var51, 0, var47, arg1);
                    }
                    if (var46 <= class148.field2106) {
                        int[] var52 = class565.field8253[var46];
                        class41.method235(var48, var52, 0, var50, arg1);
                        class41.method235(var50, var52, 0, var49, arg4);
                        class41.method235(var49, var52, 0, var47, arg1);
                    }
                } else {
                    if (var45 >= class323.field4704) {
                        class41.method235(var48, class565.field8253[var45], 0, var47, arg1);
                    }
                    if (var46 <= class148.field2106) {
                        class41.method235(var48, class565.field8253[var46], 0, var47, arg1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lmv;Lmv;)V", line = 546)
    public class595(class295 arg0, class295 arg1) {
        this.field8613 = arg0;
        this.field8620 = arg1;
    }
}
