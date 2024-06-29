import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class166 {

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "[I")
    private int[] field2665;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "[B")
    private byte[] field2666;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "[I")
    private int[] field2658;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field2668 = 0;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "Luf;")
    public static class168 field2667 = class148.method1019(-1720, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Lk;")
    public static class36 field2659 = new class36(64);

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "Luf;")
    public static class168 field2669 = class148.method1019(-1720, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2670 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "Lch;")
    public static class95 field2671 = new class95(5000);

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "Luf;")
    private static class168 field2672 = class148.method1019(-1720, "skill)2");

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "Luf;")
    public static class168 field2673 = field2672;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "[S")
    public static short[] field2674;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([Lgk;B[Lha;[Lgk;Ldk;[Lgk;[Lgk;)V", line = 6)
    public static final void method1155(class265[] arg0, byte arg1, class49[] arg2, class265[] arg3, class241 arg4, class265[] arg5, class265[] arg6) {
        class78.field1084 = arg6;
        class229.field3697 = arg2;
        class195.field3163 = arg0;
        class139.field2147 = arg5;
        if (arg1 != 76) {
            field2667 = (class168) null;
        }
        class156.field2460 = arg4;
        class22.field277 = arg3;
        class140.field2163.method453(255);
        field2664++;
        int var7 = class156.field2460.method1646(arg1 ^ 0xFFFF95DC, class242.field4046);
        int[] var8 = class156.field2460.method1635(var7, true);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class140.field2163.method451(arg1 ^ 0xFA8C877C, class110.method819((byte) -28, new class153(class156.field2460.method1647(var7, (byte) 124, var8[var9]))));
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lcg;IIIIII)V", line = 46)
    public static final void method1156(class253 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != 23990) {
            return;
        }
        long var7 = 0L;
        field2662++;
        boolean var9 = true;
        if (arg2 == 0) {
            var7 = class295.method2026(arg5, arg6, arg3);
        } else if (arg2 == 1) {
            var7 = class118.method851(arg5, arg6, arg3);
        } else if (arg2 == 2) {
            var7 = class87.method597(arg5, arg6, arg3);
        } else if (arg2 == 3) {
            var7 = class91.method648(arg5, arg6, arg3);
        }
        int var10 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        boolean var11 = false;
        int var12 = ((int) var7 & 0x7E30A) >> 14;
        boolean var13 = false;
        int var14 = ((int) var7 & 0x323E25) >> 20;
        class161 var15 = class15.method64(var10, false);
        if (var15.method1132(0)) {
            class283.method1951(arg6, arg5, (byte) -111, arg3, var15);
        }
        if (var7 == 0L) {
            return;
        }
        class231 var16 = null;
        class231 var17 = null;
        if (arg2 == 0) {
            class28 var18 = class180.method1291(arg5, arg6, arg3);
            if (var18 != null) {
                var17 = var18.field361;
                var16 = var18.field358;
            }
            if (var15.field2571 != 0) {
                arg0.method1744(var12, 0, var14, var15.field2568, arg3, arg6);
            }
        } else if (arg2 == 1) {
            class40 var21 = class79.method486(arg5, arg6, arg3);
            if (var21 != null) {
                var17 = var21.field499;
                var16 = var21.field494;
            }
        } else if (arg2 == 2) {
            class91 var20 = class82.method549(arg5, arg6, arg3);
            if (var20 != null) {
                var16 = var20.field1408;
            }
            if (var15.field2571 != 0 && arg6 + var15.field2558 < 104 && var15.field2558 + arg3 < 104 && (var15.field2559 + arg6) < 104 && (var15.field2559 + arg3) < 104) {
                arg0.method1729(var15.field2558, arg3, var14, var15.field2568, arg6, (byte) -126, var15.field2559);
            }
        } else if (arg2 == 3) {
            class292 var19 = class91.method644(arg5, arg6, arg3);
            if (var19 != null) {
                var16 = var19.field4919;
            }
            if (var15.field2571 == 1) {
                arg0.method1740(arg6, arg3, -23607);
            }
        }
        if (!var15.field2557) {
            return;
        }
        if (var12 == 2) {
            if ((var16 instanceof class132)) {
                ((class132) var16).method924((byte) -85);
            } else {
                class211.method1475(arg3, arg1 ^ 0xFFFFA266, arg6, var15, arg4, var12, 0, 0, var14 + 4);
            }
            if (var17 instanceof class132) {
                ((class132) var17).method924((byte) -69);
            } else {
                class211.method1475(arg3, -37, arg6, var15, arg4, var12, 0, 0, var14 + 1 & 0x3);
            }
        } else if (var12 == 5) {
            if (var16 instanceof class132) {
                ((class132) var16).method924((byte) -123);
            } else {
                class211.method1475(arg3, -93, arg6, var15, arg4, 4, class206.field3389[var14] * 8, class289.field4862[var14] * 8, var14);
            }
        } else if (var12 == 6) {
            if (var16 instanceof class132) {
                ((class132) var16).method924((byte) -67);
            } else {
                class211.method1475(arg3, arg1 - 24054, arg6, var15, arg4, 4, class262.field4454[var14] * 8, class139.field2143[var14] * 8, var14 + 4);
            }
        } else if (var12 == 7) {
            if ((var16 instanceof class132)) {
                ((class132) var16).method924((byte) -127);
            } else {
                class211.method1475(arg3, -90, arg6, var15, arg4, 4, 0, 0, (var14 + 2 & 0x3) + 4);
            }
        } else if (var12 == 8) {
            if ((var16 instanceof class132)) {
                ((class132) var16).method924((byte) -117);
            } else {
                class211.method1475(arg3, arg1 ^ 0xFFFFA22F, arg6, var15, arg4, 4, class262.field4454[var14] * 8, class139.field2143[var14] * 8, var14 + 4);
            }
            if ((var17 instanceof class132)) {
                ((class132) var17).method924((byte) -85);
            } else {
                class211.method1475(arg3, -40, arg6, var15, arg4, 4, class262.field4454[var14] * 8, class139.field2143[var14] * 8, (var14 + 2 & 0x3) + 4);
            }
        } else if (var12 == 11) {
            if (var16 instanceof class132) {
                ((class132) var16).method924((byte) -92);
            } else {
                class211.method1475(arg3, -96, arg6, var15, arg4, 10, 0, 0, var14 + 4);
            }
        } else if ((var16 instanceof class132)) {
            ((class132) var16).method924((byte) -126);
        } else {
            class211.method1475(arg3, arg1 - 24100, arg6, var15, arg4, var12, 0, 0, var14);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([BII[BIB)I", line = 237)
    public final int method1157(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, byte arg5) {
        int var7 = arg1 + arg2;
        int var8 = 0;
        int var9 = arg4 << 3;
        field2663++;
        while (var7 > arg1) {
            int var10 = arg3[arg1] & 0xFF;
            int var11 = this.field2665[var10];
            byte var12 = this.field2666[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 & 0x7;
            int var14 = var9 >> 3;
            var9 += var12;
            int var15 = var14 + (var12 + var13 - 1 >> 3);
            int var16 = var8 & -var13 >> 31;
            int var17 = var13 + 24;
            arg0[var14] = (byte) (var8 = class80.method492(var16, var11 >>> var17));
            if (var14 < var15) {
                var13 = var17 - 8;
                var14++;
                arg0[var14] = (byte) (var8 = var11 >>> var13);
                if (var15 > var14) {
                    var13 -= 8;
                    var14++;
                    arg0[var14] = (byte) (var8 = var11 >>> var13);
                    if (var15 > var14) {
                        var14++;
                        var13 -= 8;
                        arg0[var14] = (byte) (var8 = var11 >>> var13);
                        if (var15 > var14) {
                            var14++;
                            var13 -= 8;
                            arg0[var14] = (byte) (var8 = var11 << -var13);
                        }
                    }
                }
            }
            arg1++;
        }
        if (arg5 != -113) {
            method1156((class253) null, -47, 101, -26, 106, 17, 46);
        }
        return (var9 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B[B[BIII)I", line = 316)
    public final int method1158(byte arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field2660++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = arg3 + arg5;
        int var8 = 0;
        if (arg0 < 67) {
            method1155((class265[]) null, (byte) -106, (class49[]) null, (class265[]) null, (class241) null, (class265[]) null, (class265[]) null);
        }
        int var9 = arg4;
        while (true) {
            byte var10 = arg1[var9];
            if (var10 < 0) {
                var8 = this.field2658[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field2658[var8]) < 0) {
                arg2[arg5++] = (byte) (~var11);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field2658[var8];
            }
            int var12;
            if ((var12 = this.field2658[var8]) < 0) {
                arg2[arg5++] = (byte) (~var12);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field2658[var8];
            }
            int var13;
            if ((var13 = this.field2658[var8]) < 0) {
                arg2[arg5++] = (byte) (~var13);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field2658[var8];
            }
            int var14;
            if ((var14 = this.field2658[var8]) < 0) {
                arg2[arg5++] = (byte) (~var14);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field2658[var8];
            }
            int var15;
            if ((var15 = this.field2658[var8]) < 0) {
                arg2[arg5++] = (byte) (~var15);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field2658[var8];
            }
            int var16;
            if ((var16 = this.field2658[var8]) < 0) {
                arg2[arg5++] = (byte) (~var16);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field2658[var8];
            }
            int var17;
            if ((var17 = this.field2658[var8]) < 0) {
                arg2[arg5++] = (byte) (~var17);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field2658[var8];
            }
            int var18;
            if ((var18 = this.field2658[var8]) < 0) {
                arg2[arg5++] = (byte) (~var18);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg4;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V", line = 473)
    public static void method1159(byte arg0) {
        field2673 = null;
        int var1 = -117 / ((arg0 - 75) / 40);
        field2667 = null;
        field2671 = null;
        field2672 = null;
        field2674 = null;
        field2659 = null;
        field2670 = null;
        field2669 = null;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "([B)V", line = 498)
    public class166(byte[] arg0) {
        int var2 = arg0.length;
        this.field2665 = new int[var2];
        int[] var3 = new int[33];
        this.field2666 = arg0;
        this.field2658 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field2665[var5] = var8;
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
                        var3[var10] = class80.method492(var12, var11);
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
                        if (this.field2658[var14] == 0) {
                            this.field2658[var14] = var4;
                        }
                        var14 = this.field2658[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field2658.length) {
                        int[] var18 = new int[this.field2658.length * 2];
                        for (int var19 = 0; var19 < this.field2658.length; var19++) {
                            var18[var19] = this.field2658[var19];
                        }
                        this.field2658 = var18;
                    }
                }
                this.field2658[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
