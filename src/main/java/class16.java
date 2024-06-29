import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class16 {

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "[B")
    private byte[] field300;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "[I")
    private int[] field301;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "[I")
    private int[] field306;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "Lsc;")
    public static class181 field291 = class149.method967(255, ")3");

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "Lsc;")
    public static class181 field294 = class149.method967(255, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "Lsc;")
    public static class181 field304 = class149.method967(255, " )2> ");

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "Lsc;")
    public static class181 field305 = class149.method967(255, "headicons_prayer");

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "Lfh;")
    public static class241 field299;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lvf;B)Ld;")
    public static final class120 method135(class230 arg0, byte arg1) {
        field303++;
        class120 var2 = new class120(arg0.method1549(arg1 ^ 0xFFFFFFCD), arg0.method1549(112), arg0.method1535(arg1 + 66), arg0.method1535(2), arg0.method1529(-32494), arg0.method1516((byte) 82) == 1);
        int var3 = arg0.method1516((byte) 82);
        int var4 = 0;
        if (arg1 != -64) {
            method135((class230) null, (byte) -122);
        }
        while (var4 < var3) {
            var2.field1965.method1689(new class30(arg0.method1535(2), arg0.method1535(2), arg0.method1535(2), arg0.method1535(2)), 122);
            var4++;
        }
        var2.method787(0);
        return var2;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V")
    public static void method136(byte arg0) {
        if (arg0 < 126) {
            return;
        }
        field299 = null;
        field294 = null;
        field304 = null;
        field291 = null;
        field305 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I[BII[BI)I")
    public final int method137(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field295++;
        if (arg0 != -8854) {
            field291 = null;
        }
        int var7 = arg2 + arg3;
        int var8 = 0;
        int var9 = arg5 << 3;
        while (arg2 < var7) {
            int var10 = arg4[arg2] & 0xFF;
            byte var11 = this.field300[var10];
            int var12 = this.field301[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            var9 += var11;
            int var15 = (var14 + var11 - 1 >> 3) + var13;
            int var16 = var8 & -var14 >> 31;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var8 = class185.method1291(var16, var12 >>> var17));
            if (var15 > var13) {
                var14 = var17 - 8;
                var13++;
                arg1[var13] = (byte) (var8 = var12 >>> var14);
                if (var13 < var15) {
                    var13++;
                    var14 -= 8;
                    arg1[var13] = (byte) (var8 = var12 >>> var14);
                    if (var13 < var15) {
                        var13++;
                        var14 -= 8;
                        arg1[var13] = (byte) (var8 = var12 >>> var14);
                        if (var15 > var13) {
                            var13++;
                            var14 -= 8;
                            arg1[var13] = (byte) (var8 = var12 << -var14);
                        }
                    }
                }
            }
            arg2++;
        }
        return (var9 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILjb;II)[Lpd;")
    public static final class48[] method138(int arg0, class11 arg1, int arg2, int arg3) {
        field296++;
        if (arg0 == 0) {
            return class242.method1646(arg3, (byte) -64, arg1, arg2) ? class209.method1387(110) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BLsc;)I")
    public static final int method139(byte arg0, class181 arg1) {
        field302++;
        if (arg0 > -86) {
            field294 = null;
        }
        if (arg1.method1226(-458531486) == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class242.field4214.field3717; var2++) {
            if (class242.field4214.field3732[var2].method1224(arg1, -90)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILo;)Lo;")
    public static final class175 method140(int arg0, class175 arg1) {
        field293++;
        class175 var2 = client.method1062(arg1);
        if (var2 == null) {
            var2 = arg1.field3019;
        }
        return arg0 == -218659743 ? var2 : null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILed;)V")
    public static final void method141(int arg0, class116 arg1) {
        field292++;
        class264 var2 = (class264) class123.field2014.method1424(true, arg1.field1883.method1197(arg0 - 21488));
        if (arg0 != 21363) {
            method138(40, (class11) null, -89, -123);
        }
        if (var2 == null) {
            class76.method531(9522, arg1, (class178) null, (class148) null, 0, arg1.field2672[0], class38.field581, arg1.field2623[0]);
        } else {
            var2.method1787((byte) 91);
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)V")
    public static final void method142(byte arg0) {
        class242.field4210 = null;
        class109.field1787 = 0;
        field298++;
        class262.field4563 = null;
        class52.field816 = null;
        class113.field1841 = null;
        class162.field2757 = null;
        class160.field2736 = null;
        class126.field2095 = null;
        class23.field407 = null;
        class212.field3661 = null;
        class83.field1327 = null;
        class217.field3737 = null;
        class98.field1581.method1682(-78);
        class100.field1674 = null;
        class73.field1167 = null;
        class86.field1366 = null;
        class219.field3770 = null;
        class2.field63 = null;
        class196.field3414 = null;
        class186.field3297 = null;
        class140.field2262 = null;
        class242.field4214 = null;
        class224.field3866 = null;
        int var1 = 98 / ((18 - arg0) / 60);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I[BI[BII)I")
    public final int method143(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field290++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = arg0 + arg2;
        if (arg4 >= -57) {
            return 123;
        }
        int var8 = 0;
        int var9 = arg5;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 < 0) {
                var8 = this.field306[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field306[var8]) < 0) {
                arg1[arg2++] = (byte) (~var11);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field306[var8];
            }
            int var12;
            if ((var12 = this.field306[var8]) < 0) {
                arg1[arg2++] = (byte) (~var12);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field306[var8];
            }
            int var13;
            if ((var13 = this.field306[var8]) < 0) {
                arg1[arg2++] = (byte) (~var13);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field306[var8];
            }
            int var14;
            if ((var14 = this.field306[var8]) < 0) {
                arg1[arg2++] = (byte) (~var14);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field306[var8];
            }
            int var15;
            if ((var15 = this.field306[var8]) < 0) {
                arg1[arg2++] = (byte) (~var15);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field306[var8];
            }
            int var16;
            if ((var16 = this.field306[var8]) < 0) {
                arg1[arg2++] = (byte) (~var16);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field306[var8];
            }
            int var17;
            if ((var17 = this.field306[var8]) < 0) {
                arg1[arg2++] = (byte) (~var17);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field306[var8];
            }
            int var18;
            if ((var18 = this.field306[var8]) < 0) {
                arg1[arg2++] = (byte) (~var18);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "([B)V")
    public class16(byte[] arg0) {
        int var2 = arg0.length;
        this.field300 = arg0;
        this.field301 = new int[var2];
        this.field306 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field301[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
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
                        var3[var10] = class185.method1291(var12, var11);
                    }
                    var9 = var7 | var8;
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
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field306[var14] == 0) {
                            this.field306[var14] = var4;
                        }
                        var14 = this.field306[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field306.length <= var14) {
                        int[] var18 = new int[this.field306.length * 2];
                        for (int var19 = 0; var19 < this.field306.length; var19++) {
                            var18[var19] = this.field306[var19];
                        }
                        this.field306 = var18;
                    }
                }
                this.field306[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
