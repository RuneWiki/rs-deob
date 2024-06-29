import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 {

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "[B")
    private byte[] field107;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "[I")
    private int[] field91;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "[I")
    private int[] field92;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field90 = 1;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field99 = 0;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "[I")
    public static int[] field94 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "Lb;")
    public static class8 field105 = new class8(8);

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public static volatile int field106 = 0;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "Ln;")
    public static class90 field110 = new class90(64);

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "Loa;")
    public static class98 field113 = class38.method349(255, "Fps:");

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "Lsb;")
    public static class124 field111 = new class124();

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "Z")
    public static boolean field114 = false;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "Lmd;")
    public static class87 field108;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "[Loc;")
    public static class100[] field103;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "[Lid;")
    public static class60[] field109;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "[[B")
    public static byte[][] field98;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)V")
    public static final void method27(int arg0, int arg1, int arg2) {
        class63 var3 = class10.field207[class114.field2572][arg1][arg2];
        field100++;
        if (var3 == null) {
            class138.field3373.method250(class114.field2572, arg1, arg2);
            return;
        }
        int var4 = 53 % ((arg0 + 36) / 33);
        class25 var5 = null;
        int var6 = -99999999;
        for (class25 var7 = (class25) var3.method512(-96); var7 != null; var7 = (class25) var3.method513(-110)) {
            class74 var12 = class15.method152(30, var7.field600);
            int var13 = var12.field1578;
            if (var12.field1544 == 1) {
                var13 = (var7.field618 + 1) * var13;
            }
            if (var6 < var13) {
                var5 = var7;
                var6 = var13;
            }
        }
        if (var5 == null) {
            class138.field3373.method250(class114.field2572, arg1, arg2);
            return;
        }
        var3.method514(var5, 0);
        class25 var8 = (class25) var3.method512(-97);
        class25 var9 = null;
        int var10 = arg1 + (arg2 << 7) + 1610612736;
        class25 var11 = null;
        while (var8 != null) {
            if (var5.field600 != var8.field600) {
                if (var9 == null) {
                    var9 = var8;
                }
                if (var8.field600 != var9.field600 && var11 == null) {
                    var11 = var8;
                }
            }
            var8 = (class25) var3.method513(-110);
        }
        class138.field3373.method220(class114.field2572, arg1, arg2, class31.method305(-115, arg2 * 128 + 64, class114.field2572, arg1 * 128 + 64), var5, var10, var9, var11);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I[BI[BII)I")
    public final int method28(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        int var7 = arg0 + arg4;
        field102++;
        int var8 = 0;
        int var9 = arg5 << 3;
        while (var7 > arg0) {
            int var10 = arg1[arg0] & 0xFF;
            int var11 = this.field91[var10];
            byte var12 = this.field107[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 & 0x7;
            int var14 = var8 & -var13 >> 31;
            int var15 = var9 >> 3;
            int var16 = var15 + (var12 + var13 - 1 >> 3);
            var9 += var12;
            int var17 = var13 + 24;
            arg3[var15] = (byte) (var8 = class94.method751(var14, var11 >>> var17));
            if (var16 > var15) {
                var15++;
                var13 = var17 - 8;
                arg3[var15] = (byte) (var8 = var11 >>> var13);
                if (var16 > var15) {
                    var13 -= 8;
                    var15++;
                    arg3[var15] = (byte) (var8 = var11 >>> var13);
                    if (var15 < var16) {
                        var13 -= 8;
                        var15++;
                        arg3[var15] = (byte) (var8 = var11 >>> var13);
                        if (var16 > var15) {
                            var13 -= 8;
                            var15++;
                            arg3[var15] = (byte) (var8 = var11 << -var13);
                        }
                    }
                }
            }
            arg0++;
        }
        if (arg2 != 64) {
            field111 = null;
        }
        return (var9 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
    public static final void method29(boolean arg0) {
        field88++;
        try {
            Graphics var1 = class73.field1506.getGraphics();
            class36.field887.method406(32, 205, 553, var1);
            if (arg0) {
                field109 = null;
            }
        } catch (Exception var2) {
            class73.field1506.repaint();
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)V")
    public static void method30(boolean arg0) {
        field108 = null;
        if (arg0) {
            method31(-127, -27, 123);
        }
        field94 = null;
        field111 = null;
        field113 = null;
        field109 = null;
        field103 = null;
        field105 = null;
        field98 = null;
        field110 = null;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(III)I")
    public static final int method31(int arg0, int arg1, int arg2) {
        field101++;
        long var3 = (long) ((arg0 << 16) + arg2);
        int var5 = 126 / ((40 - arg1) / 54);
        return class62.field1317 != null && class62.field1317.field2729 == var3 ? class79.field1741.field182 * 99 / (class79.field1741.field132.length - class62.field1317.field2632) + 1 : 0;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)Loa;")
    public static final class98 method32(int arg0, byte arg1) {
        field95++;
        if (arg0 < 999999999) {
            return class132.method1074(arg0, (byte) -118);
        } else {
            if (arg1 != 73) {
                field111 = null;
            }
            return class57.field1267;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
    public static final void method33(byte arg0) {
        class16 var1 = class141.field3436;
        synchronized (class141.field3436) {
            if (arg0 != -86) {
                method27(75, 4, 14);
            }
            class30.field697 = class15.field315;
            if (class15.field319 >= 0) {
                while (class71.field1476 != class15.field319) {
                    int var2 = class52.field1158[class71.field1476];
                    class71.field1476 = class71.field1476 + 1 & 0x7F;
                    if (var2 >= 0) {
                        class86.field1978[var2] = true;
                    } else {
                        class86.field1978[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class86.field1978[var3] = false;
                }
                class15.field319 = class71.field1476;
            }
            class15.field315 = class135.field3289;
        }
        field89++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I[BII[BI)I")
    public final int method34(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field104++;
        if (arg0 == 0) {
            return 0;
        } else if (arg2 >= -88) {
            return 52;
        } else {
            int var7 = arg0 + arg3;
            int var8 = 0;
            int var9 = arg5;
            while (true) {
                byte var10 = arg1[var9];
                if (var10 >= 0) {
                    var8++;
                } else {
                    var8 = this.field92[var8];
                }
                int var11;
                if ((var11 = this.field92[var8]) < 0) {
                    arg4[arg3++] = (byte) ~var11;
                    if (var7 <= arg3) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x40) == 0) {
                    var8++;
                } else {
                    var8 = this.field92[var8];
                }
                int var12;
                if ((var12 = this.field92[var8]) < 0) {
                    arg4[arg3++] = (byte) ~var12;
                    if (arg3 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x20) == 0) {
                    var8++;
                } else {
                    var8 = this.field92[var8];
                }
                int var13;
                if ((var13 = this.field92[var8]) < 0) {
                    arg4[arg3++] = (byte) ~var13;
                    if (var7 <= arg3) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x10) == 0) {
                    var8++;
                } else {
                    var8 = this.field92[var8];
                }
                int var14;
                if ((var14 = this.field92[var8]) < 0) {
                    arg4[arg3++] = (byte) ~var14;
                    if (var7 <= arg3) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x8) == 0) {
                    var8++;
                } else {
                    var8 = this.field92[var8];
                }
                int var15;
                if ((var15 = this.field92[var8]) < 0) {
                    arg4[arg3++] = (byte) ~var15;
                    if (arg3 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x4) == 0) {
                    var8++;
                } else {
                    var8 = this.field92[var8];
                }
                int var16;
                if ((var16 = this.field92[var8]) < 0) {
                    arg4[arg3++] = (byte) ~var16;
                    if (var7 <= arg3) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x2) == 0) {
                    var8++;
                } else {
                    var8 = this.field92[var8];
                }
                int var17;
                if ((var17 = this.field92[var8]) < 0) {
                    arg4[arg3++] = (byte) ~var17;
                    if (var7 <= arg3) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x1) == 0) {
                    var8++;
                } else {
                    var8 = this.field92[var8];
                }
                int var18;
                if ((var18 = this.field92[var8]) < 0) {
                    arg4[arg3++] = (byte) ~var18;
                    if (var7 <= arg3) {
                        break;
                    }
                    var8 = 0;
                }
                var9++;
            }
            return var9 + 1 - arg5;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILkc;BLjava/awt/Component;I)Lle;")
    public static final class81 method35(int arg0, class72 arg1, byte arg2, Component arg3, int arg4) {
        field96++;
        if (class8.field194 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class81 var5 = (class81) Class.forName("df").getDeclaredConstructor().newInstance();
                var5.field1804 = new int[(class32.field782 ? 2 : 1) * 256];
                var5.field1827 = arg4;
                var5.method291(arg3);
                var5.field1819 = (arg4 & 0xFFFFFC00) + 1024;
                if (var5.field1819 > 16384) {
                    var5.field1819 = 16384;
                }
                var5.method290(var5.field1819);
                if (class74.field1549 > 0 && class120.field2701 == null) {
                    class120.field2701 = new class11();
                    arg1.method581(class74.field1549, 25093, class120.field2701);
                }
                if (class120.field2701 != null) {
                    if (class120.field2701.field231[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class120.field2701.field231[arg0] = var5;
                }
                return var5;
            } catch (Throwable var9) {
                try {
                    class103 var6 = new class103(arg1, arg0);
                    int var7 = -101 / ((44 - arg2) / 32);
                    var6.field1827 = arg4;
                    var6.field1804 = new int[(class32.field782 ? 2 : 1) * 256];
                    var6.method291(arg3);
                    var6.field1819 = 16384;
                    var6.method290(var6.field1819);
                    if (class74.field1549 > 0 && class120.field2701 == null) {
                        class120.field2701 = new class11();
                        arg1.method581(class74.field1549, 25093, class120.field2701);
                    }
                    if (class120.field2701 != null) {
                        if (class120.field2701.field231[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class120.field2701.field231[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var8) {
                    return new class81();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "([B)V")
    public class6(byte[] arg0) {
        int var2 = arg0.length;
        this.field107 = arg0;
        this.field91 = new int[var2];
        int[] var3 = new int[33];
        this.field92 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field91[var5] = var8;
                int var12;
                if ((var8 & var7) == 0) {
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
                        var3[var9] = class94.method751(var11, var10);
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
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field92[var14] == 0) {
                            this.field92[var14] = var4;
                        }
                        var14 = this.field92[var14];
                    }
                    if (this.field92.length <= var14) {
                        int[] var17 = new int[this.field92.length * 2];
                        for (int var18 = 0; var18 < this.field92.length; var18++) {
                            var17[var18] = this.field92[var18];
                        }
                        this.field92 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field92[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/Component;Ltb;B)V")
    public static final void method36(Component arg0, class130 arg1, byte arg2) {
        field93++;
        if (class141.field3453) {
            return;
        }
        class73.field1516 = class20.method188(class63.field1338, arg1, (byte) -108, class75.field1612);
        class137.field3348 = class20.method188(class79.field1734, arg1, (byte) -121, class75.field1612);
        class46.field1068 = class20.method188(class46.field1073, arg1, (byte) -57, class75.field1612);
        class15.field301 = class20.method188(class94.field2135, arg1, (byte) -56, class75.field1612);
        class26.field637 = class20.method188(class115.field2600, arg1, (byte) -59, class75.field1612);
        class78.field1708 = class20.method188(class53.field1177, arg1, (byte) -123, class75.field1612);
        class126.field2792 = class14.method148(96, arg0, 479, -27261);
        class137.field3348.method830(0, 0);
        class97.field2244 = class14.method148(156, arg0, 172, -27261);
        class7.method40();
        class46.field1068.method830(0, 0);
        class36.field887 = class14.method148(261, arg0, 190, -27261);
        class73.field1516.method830(0, 0);
        class3.field40 = class14.method148(334, arg0, 512, -27261);
        class7.method40();
        class19.field425 = class14.method148(50, arg0, 496, -27261);
        class132.field3161 = class14.method148(37, arg0, 269, -27261);
        field108 = class14.method148(45, arg0, 249, -27261);
        class60 var3 = class130.method1071(class75.field1612, arg1, (byte) 126, class24.field592);
        class91.field2109 = class14.method148(var3.field1312, arg0, var3.field1313, -27261);
        var3.method486(0, 0);
        class60 var4 = class130.method1071(class75.field1612, arg1, (byte) 127, class24.field588);
        class115.field2590 = class14.method148(var4.field1312, arg0, var4.field1313, -27261);
        var4.method486(0, 0);
        class60 var5 = class130.method1071(class75.field1612, arg1, (byte) 127, class91.field2106);
        class5.field75 = class14.method148(var5.field1312, arg0, var5.field1313, -27261);
        var5.method486(0, 0);
        class60 var6 = class130.method1071(class75.field1612, arg1, (byte) 126, class127.field2855);
        class79.field1735 = class14.method148(var6.field1312, arg0, var6.field1313, -27261);
        var6.method486(0, 0);
        class60 var7 = class130.method1071(class75.field1612, arg1, (byte) 126, class36.field888);
        class38.field936 = class14.method148(var7.field1312, arg0, var7.field1313, -27261);
        var7.method486(0, 0);
        class60 var8 = class130.method1071(class75.field1612, arg1, (byte) 126, class135.field3296);
        class52.field1157 = class14.method148(var8.field1312, arg0, var8.field1313, -27261);
        var8.method486(0, 0);
        class60 var9 = class130.method1071(class75.field1612, arg1, (byte) 127, class148.field3649);
        class112.field2514 = class14.method148(var9.field1312, arg0, var9.field1313, -27261);
        var9.method486(0, 0);
        class60 var10 = class130.method1071(class75.field1612, arg1, (byte) 127, class14.field291);
        class71.field1468 = class14.method148(var10.field1312, arg0, var10.field1313, -27261);
        var10.method486(0, 0);
        class60 var11 = class130.method1071(class75.field1612, arg1, (byte) 126, class71.field1478);
        class150.field3712 = class14.method148(var11.field1312, arg0, var11.field1313, -27261);
        var11.method486(0, 0);
        class113.field2558 = class20.method188(class118.field2643, arg1, (byte) -74, class75.field1612);
        class123.field2747 = class20.method188(class42.field989, arg1, (byte) -122, class75.field1612);
        class102.field2359 = class20.method188(class21.field464, arg1, (byte) -63, class75.field1612);
        class105.field2417 = class113.field2558.method832();
        class105.field2417.method827();
        class83.field1924 = class123.field2747.method832();
        class83.field1924.method827();
        class82.field1903 = class113.field2558.method832();
        class82.field1903.method826();
        class83.field1922 = class123.field2747.method832();
        class83.field1922.method826();
        class48.field1089 = class102.field2359.method832();
        class48.field1089.method826();
        class134.field3285 = class113.field2558.method832();
        class134.field3285.method827();
        class134.field3285.method826();
        class127.field2852 = class123.field2747.method832();
        class127.field2852.method827();
        class127.field2852.method826();
        class97.field2241 = class147.method1175(arg1, class75.field1612, class86.field1981, false);
        class83.field1925 = new int[151];
        class58.field1291 = new int[33];
        class79.field1730 = new int[151];
        class80.field1763 = new int[33];
        for (int var12 = 0; var12 < 33; var12++) {
            int var17 = 999;
            int var18 = 0;
            for (int var19 = 0; var19 < 34; var19++) {
                if (class46.field1068.field2326[class46.field1068.field2325 * var12 + var19] == 0) {
                    if (var17 == 999) {
                        var17 = var19;
                    }
                } else if (var17 != 999) {
                    var18 = var19;
                    break;
                }
            }
            class58.field1291[var12] = var17;
            class80.field1763[var12] = var18 - var17;
        }
        if (arg2 >= -61) {
            field105 = null;
        }
        for (int var13 = 5; var13 < 156; var13++) {
            int var14 = 999;
            int var15 = 0;
            for (int var16 = 25; var16 < 172; var16++) {
                if (class46.field1068.field2326[class46.field1068.field2325 * var13 + var16] == 0 && (var16 > 34 || var13 > 34)) {
                    if (var14 == 999) {
                        var14 = var16;
                    }
                } else if (var14 != 999) {
                    var15 = var16;
                    break;
                }
            }
            class79.field1730[var13 - 5] = var14 - 25;
            class83.field1925[var13 - 5] = var15 - var14;
        }
        class141.field3453 = true;
    }
}
