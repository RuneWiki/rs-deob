import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class581 extends class45 {

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "I")
    public int field7948 = 0;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "Ljba;")
    private class704 field7949;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
    public int field7939;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "Lqq;")
    private class651 field7945;

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "I")
    public int field7953;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
    public int field7937;

    @OriginalMember(owner = "client!nl", name = "F", descriptor = "I")
    public int field7955;

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "[I")
    private int[] field7942;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "F")
    public float field7951;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "Leba;")
    public static class550 field7932 = new class550(30, -1);

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
    public static int field7933;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
    public static int field7934;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "I")
    public static int field7935;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "I")
    public static int field7938;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "I")
    public static int field7940;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    public static int field7941;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "I")
    public static int field7944;

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "I")
    public static int field7950;

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "I")
    public static int field7952;

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "I")
    public static int field7954;

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "I")
    public static int field7956;

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "Lwr;")
    private class697 field7936;

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "Ljaclib/memory/Stream;")
    private Stream field7943;

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field7946;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "[[I")
    public static int[][] field7947;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILjd;)V", line = 3)
    public static final void method3200(int arg0, class537 arg1) {
        field7933++;
        arg1.method958(0, class567.field7726.method1956(-127));
        arg1.method958(0, class219.field2868.method1956(-128));
        arg1.method958(0, class82.field947.method1956(arg0 - 65663));
        arg1.method958(arg0 ^ 0xFFFF, class542.field7425.method1956(-127));
        arg1.method958(0, class3.field8.method1956(-127));
        arg1.method958(0, class543.field7433.method1956(-128));
        arg1.method958(arg0 ^ 0xFFFF, class654.field9309.method1956(-128));
        arg1.method958(arg0 - 65535, class94.field1139.method1956(-128));
        arg1.method958(0, class390.field5228.method1956(-127));
        arg1.method958(arg0 - 65535, class329.field4420.method1956(-128));
        arg1.method958(0, class13.field164.method1956(-128));
        arg1.method958(0, class165.field2366.method1956(-128));
        arg1.method958(0, class614.field8506.method1956(-128));
        arg1.method958(arg0 ^ 0xFFFF, class208.field2785.method1956(arg0 - 65663));
        arg1.method958(0, class56.field728.method1956(-127));
        arg1.method958(0, class537.field7372.method1956(-127));
        arg1.method958(arg0 ^ 0xFFFF, class361.field4786.method1956(-127));
        arg1.method958(0, class89.field1084.method1956(-127));
        arg1.method958(arg0 - 65535, class651.field9100.method1956(-127));
        arg1.method958(0, class411.field5404.method1956(-128));
        arg1.method958(0, class219.field2867.method1956(-128));
        arg1.method958(0, class630.field8722.method1956(-128));
        arg1.method958(0, class426.field5748.method1956(arg0 - 65663));
        arg1.method958(0, class688.field9713.method1956(arg0 ^ 0xFFFF007E));
        arg1.method958(arg0 - 65535, class33.field461.method1956(-128));
        arg1.method958(0, class85.field1045.method1956(-127));
        arg1.method958(arg0 ^ arg0, class200.field2708.method1956(-128));
        arg1.method958(0, class102.field1219.method1956(-127));
        arg1.method958(arg0 ^ 0xFFFF, class417.field5481.method1956(arg0 ^ 0xFFFF007E));
        arg1.method958(arg0 - 65535, class311.field4196.method1956(-128));
        arg1.method958(0, class529.field7313.method1956(-128));
        arg1.method958(0, class329.field4418.method1956(-128));
        arg1.method958(0, class424.method2402(-22556));
        arg1.method958(0, class542.method3040((byte) -16));
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V", line = 44)
    public static void method3201(int arg0) {
        field7947 = null;
        field7932 = null;
        if (arg0 != 24291) {
            field7932 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)V", line = 57)
    public final void method3202(int arg0, int arg1) {
        this.field7946 = this.field7945.method3623(true, -122, arg1 * 4);
        if (arg0 < -103) {
            field7954++;
            this.field7943 = new Stream(this.field7946, 0, arg1 * 4);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I[[BI[I[[B[I[BI)I", line = 69)
    public static final int method3203(int arg0, byte[][] arg1, int arg2, int[] arg3, byte[][] arg4, int[] arg5, byte[] arg6, int arg7) {
        field7952++;
        int var8 = arg3[arg0];
        if (arg7 != 1624159016) {
            return -55;
        }
        int var9 = arg5[arg0] + var8;
        int var10 = arg3[arg2];
        int var11 = arg5[arg2] + var10;
        int var12 = var8;
        if (var8 < var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg6[arg0] & 0xFF;
        if ((arg6[arg2] & 0xFF) < var14) {
            var14 = arg6[arg2] & 0xFF;
        }
        byte[] var15 = arg1[arg0];
        byte[] var16 = arg4[arg2];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)Z", line = 124)
    public static final boolean method3204(int arg0, int arg1, int arg2) {
        field7935++;
        return arg2 == -16711936 ? (class425.method2408((byte) -120, arg1, arg0) | class281.method1673((byte) 115, arg1, arg0) | class537.method3020(52, arg1, arg0)) & class677.method3865(arg0, arg1, 6074) : true;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIII)V", line = 135)
    public final void method3205(int arg0, int arg1, int arg2, int arg3) {
        this.field7942[this.field7949.field3524 * arg3 + arg1] = class665.method3789(this.field7942[this.field7949.field3524 * arg3 + arg1], 0x1 << arg0);
        field7938++;
        this.field7948++;
        if (arg2 != -1) {
            this.field7939 = -119;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZ)V", line = 147)
    public final void method3206(int arg0, boolean arg1) {
        field7950++;
        this.field7943.method3435(arg0 * 4 + 3);
        this.field7943.method3437(-1);
        if (!arg1) {
            this.field7945 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(IZ)V", line = 161)
    public final void method3207(int arg0, boolean arg1) {
        this.field7943.method3440();
        field7940++;
        this.field7936 = this.field7945.method1996(arg1, (byte) 112);
        this.field7936.method2568(this.field7946, 4, -19467, arg0 * 4);
        this.field7943 = null;
        this.field7946 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIZF)V", line = 182)
    public final void method3208(int arg0, int arg1, int arg2, boolean arg3, float arg4) {
        field7941++;
        if (this.field7937 != -1) {
            class105 var6 = this.field7945.field7682.method2959(86, this.field7937);
            int var7 = var6.field1244 & 0xFF;
            if (var7 != 0 && var6.field1255 != 4) {
                int var8;
                if (arg0 < 0) {
                    var8 = 0;
                } else if (arg0 <= 127) {
                    var8 = arg0 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg1 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg1 = ((arg1 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg1 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field1263 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg1 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg1 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg1 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg1 = (var13 & 0xFF00) + ((var12 & 0x2600FF00) << 8) + (var14 >> 8);
            }
        }
        if (arg3) {
            this.field7945 = null;
        }
        this.field7943.method3435(arg2 * 4);
        if (arg4 != 1.0F) {
            int var15 = arg1 >> 16 & 0xFF;
            int var16 = arg1 >> 8 & 0xFF;
            int var17 = arg1 & 0xFF;
            int var18 = (int) ((float) var15 * arg4);
            int var19 = (int) ((float) var16 * arg4);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var20 = (int) ((float) var17 * arg4);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg1 = var20 | var18 << 16 | var19 << 8;
        }
        if (this.field7945.field9262 == 0) {
            this.field7943.method3437((byte) arg1);
            this.field7943.method3437((byte) (arg1 >> 8));
            this.field7943.method3437((byte) (arg1 >> 16));
        } else {
            this.field7943.method3437((byte) (arg1 >> 16));
            this.field7943.method3437((byte) (arg1 >> 8));
            this.field7943.method3437((byte) arg1);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II[I)V", line = 307)
    public final void method3209(int arg0, int arg1, int[] arg2) {
        int var4 = 25 % ((52 - arg1) / 48);
        field7944++;
        class556 var5 = this.field7945.method3639(0, this.field7948 * 3);
        Buffer var6 = var5.method2143(true, (byte) 77);
        if (var6 == null) {
            return;
        }
        Stream var7 = this.field7945.method3614(var6, 0);
        int var8 = 0;
        int var9 = 32767;
        int var10 = -32768;
        if (Stream.method3445()) {
            label123: for (int var11 = 0; var11 < arg0; var11++) {
                int var12 = arg2[var11];
                short[] var13 = this.field7949.field9910[var12];
                int var14 = this.field7942[var12];
                if (var14 != 0 && var13 != null) {
                    int var15 = 0;
                    int var16 = 0;
                    while (true) {
                        while (true) {
                            if (var16 >= var13.length) {
                                continue label123;
                            }
                            if ((var14 & 0x1 << var15++) == 0) {
                                var16 += 3;
                            } else {
                                var8++;
                                for (int var17 = 0; var17 < 3; var17++) {
                                    int var18 = var13[var16++] & 0xFFFF;
                                    if (var18 > var10) {
                                        var10 = var18;
                                    }
                                    var7.method3433(var18);
                                    if (var18 < var9) {
                                        var9 = var18;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            label98: for (int var19 = 0; var19 < arg0; var19++) {
                int var21 = arg2[var19];
                int var22 = this.field7942[var21];
                short[] var23 = this.field7949.field9910[var21];
                if (var22 != 0 && var23 != null) {
                    int var24 = 0;
                    int var25 = 0;
                    while (true) {
                        while (true) {
                            if (var25 >= var23.length) {
                                continue label98;
                            }
                            if ((var22 & 0x1 << var24++) == 0) {
                                var25 += 3;
                            } else {
                                for (int var26 = 0; var26 < 3; var26++) {
                                    int var27 = var23[var25++] & 0xFFFF;
                                    var7.method3443(var27);
                                    if (var27 < var9) {
                                        var9 = var27;
                                    }
                                    if (var27 > var10) {
                                        var10 = var27;
                                    }
                                }
                                var8++;
                            }
                        }
                    }
                }
            }
        }
        var7.method3440();
        if (!var5.method2145(false) || var8 <= 0) {
            return;
        }
        this.field7945.method3667(this.field7937, (this.field7949.field9916 & 0x8) != 0, (this.field7949.field9916 & 0x7) != 0, 3);
        if (this.field7945.field9190) {
            this.field7945.method1064(Integer.MAX_VALUE, this.field7953, this.field7955, this.field7939);
        }
        class149 var20 = this.field7945.method3682(97);
        var20.method866(1.0F / this.field7951, 1.0F / this.field7951, 65, 1.0F);
        this.field7945.method3616(class213.field2816, false);
        this.field7945.method2020(-36, 1, this.field7936);
        this.field7945.method1994(this.field7949.field9936, 3);
        this.field7945.method2040(0, -101, var9, var5, var8, var10 + 1 - var9, class694.field9783);
        this.field7945.method3668(0);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IILbr;I)Lbm;", line = 469)
    public static final class295 method3210(int arg0, int arg1, class192 arg2, int arg3) {
        field7956++;
        int var4 = arg0 << 10 | arg2.field2654;
        class295 var5 = (class295) class153.field2098.method1390((long) var4 << 16, (byte) 78);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class614.field8506.method1946(0, class614.field8506.method1942(-115, var4));
        if (var6 == null) {
            int var8 = arg1 + 65536 << 10 | arg2.field2654;
            class295 var9 = (class295) class153.field2098.method1390((long) var8 << 16, (byte) 78);
            if (var9 != null) {
                return var9;
            }
            int var10 = 73 % ((arg3 + 40) / 36);
            byte[] var11 = class614.field8506.method1946(0, class614.field8506.method1942(-122, var8));
            if (var11 == null) {
                int var13 = arg2.field2654 | 0x3FFFC00;
                class295 var14 = (class295) class153.field2098.method1390((long) var13 << 16, (byte) 78);
                if (var14 != null) {
                    return var14;
                }
                byte[] var15 = class614.field8506.method1946(0, class614.field8506.method1942(-110, var13));
                if (var15 == null) {
                    return null;
                } else if (var15.length <= 1) {
                    return null;
                } else {
                    class295 var16 = class147.method837(2, var15);
                    var16.field3907 = arg2;
                    class153.field2098.method1393((long) var13 << 16, -91, var16);
                    return var16;
                }
            } else if (var11.length <= 1) {
                return null;
            } else {
                class295 var12 = class147.method837(2, var11);
                var12.field3907 = arg2;
                class153.field2098.method1393((long) var8 << 16, -91, var12);
                return var12;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class295 var7 = class147.method837(2, var6);
            var7.field3907 = arg2;
            class153.field2098.method1393((long) var4 << 16, -91, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIZ)I", line = 545)
    public static final int method3211(int arg0, int arg1, boolean arg2) {
        field7934++;
        int var3 = class481.method2766(arg1 + 45365, arg2, 4, arg0 + 91923) + ((class481.method2766(arg1 + 10294, arg2, 2, arg0 + 37821) - 128 >> 1) + (class481.method2766(arg1, arg2, 1, arg0) + -128 >> 2) - 128);
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Ljba;IIIII)V", line = 565)
    public class581(class704 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7949 = arg0;
        this.field7939 = arg5;
        this.field7945 = this.field7949.field9895;
        this.field7953 = arg3;
        this.field7937 = arg1;
        this.field7955 = arg4;
        this.field7942 = new int[this.field7949.field3525 * this.field7949.field3524];
        this.field7951 = arg2;
    }
}
