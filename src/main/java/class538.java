import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class538 extends class578 {

    @OriginalMember(owner = "client!nfa", name = "p", descriptor = "I")
    public int field7897 = 0;

    @OriginalMember(owner = "client!nfa", name = "B", descriptor = "Leh;")
    private class544 field7903;

    @OriginalMember(owner = "client!nfa", name = "s", descriptor = "Ljj;")
    private class334 field7908;

    @OriginalMember(owner = "client!nfa", name = "l", descriptor = "I")
    public int field7907;

    @OriginalMember(owner = "client!nfa", name = "k", descriptor = "I")
    public int field7904;

    @OriginalMember(owner = "client!nfa", name = "z", descriptor = "[I")
    private int[] field7905;

    @OriginalMember(owner = "client!nfa", name = "m", descriptor = "I")
    public int field7917;

    @OriginalMember(owner = "client!nfa", name = "t", descriptor = "I")
    public int field7899;

    @OriginalMember(owner = "client!nfa", name = "C", descriptor = "F")
    public float field7906;

    @OriginalMember(owner = "client!nfa", name = "D", descriptor = "[Ljava/lang/String;")
    private static final String[] field7918 = new String[] { method4083(method4082("S4\u0003\u0014`")), method4083(method4082("F|L\u0014!AtDN#\u0000")), method4083(method4082("FoAV")), method4083(method4082("F|L\u0014Z\u0000")), method4083(method4082("F|L\u0014[\u0000")), method4083(method4082("F|L\u0014X\u0000")), method4083(method4082("F|L\u0014\\\u0000")), method4083(method4082("F|L\u0014_\u0000")), method4083(method4082("F|L\u0014Y\u0000")), method4083(method4082("F|L\u0014^\u0000")) };

    @OriginalMember(owner = "client!nfa", name = "n", descriptor = "I")
    public static int field7898;

    @OriginalMember(owner = "client!nfa", name = "j", descriptor = "I")
    public static int field7900;

    @OriginalMember(owner = "client!nfa", name = "u", descriptor = "I")
    public static int field7901;

    @OriginalMember(owner = "client!nfa", name = "q", descriptor = "I")
    public static int field7902;

    @OriginalMember(owner = "client!nfa", name = "v", descriptor = "I")
    public static int field7913;

    @OriginalMember(owner = "client!nfa", name = "A", descriptor = "I")
    public static int field7914;

    @OriginalMember(owner = "client!nfa", name = "o", descriptor = "I")
    public static int field7915;

    @OriginalMember(owner = "client!nfa", name = "y", descriptor = "I")
    public static int field7916;

    @OriginalMember(owner = "client!nfa", name = "x", descriptor = "Lbl;")
    private class719 field7911;

    @OriginalMember(owner = "client!nfa", name = "r", descriptor = "Ljaclib/memory/Stream;")
    private Stream field7910;

    @OriginalMember(owner = "client!nfa", name = "w", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field7909;

    @OriginalMember(owner = "client!nfa", name = "i", descriptor = "[I")
    public static int[] field7912;

    @OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(Leh;IIIII)V", line = 365)
    public class538(class544 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            this.field7903 = arg0;
            this.field7908 = this.field7903.field7976;
            this.field7907 = arg3;
            this.field7904 = arg5;
            this.field7905 = new int[this.field7903.field10703 * this.field7903.field10701];
            this.field7917 = arg4;
            this.field7899 = arg1;
            this.field7906 = arg2;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field7918[1] + (arg0 == null ? field7918[2] : field7918[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ZI)V", line = 14)
    public final void method4075(boolean arg0, int arg1) {
        try {
            if (!arg0) {
                this.field7897 = -120;
            }
            field7898++;
            this.field7910.method3199();
            this.field7911 = this.field7908.method2117(false, 16);
            this.field7911.method2404((byte) 32, this.field7909, 4, arg1 * 4);
            this.field7910 = null;
            this.field7909 = null;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7918[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "([III)V", line = 34)
    public final void method4076(int[] arg0, int arg1, int arg2) {
        try {
            field7900++;
            class517 var4 = this.field7908.method2689(this.field7897 * 3, false);
            Buffer var5 = var4.method2343((byte) 54, true);
            if (var5 != null) {
                Stream var6 = this.field7908.method2651(var5, 16);
                if (arg2 == 12502) {
                    int var7 = 0;
                    int var8 = 32767;
                    int var9 = -32768;
                    if (Stream.method3200()) {
                        label118: for (int var18 = 0; var18 < arg1; var18++) {
                            int var19 = arg0[var18];
                            short[] var20 = this.field7903.field7966[var19];
                            int var21 = this.field7905[var19];
                            if (var21 != 0 && var20 != null) {
                                int var22 = 0;
                                int var23 = 0;
                                while (true) {
                                    while (true) {
                                        if (var20.length <= var23) {
                                            continue label118;
                                        }
                                        if ((0x1 << var22++ & var21) == 0) {
                                            var23 += 3;
                                        } else {
                                            var7++;
                                            for (int var24 = 0; var24 < 3; var24++) {
                                                int var25 = var20[var23++] & 0xFFFF;
                                                var6.method3195(var25);
                                                if (var25 > var9) {
                                                    var9 = var25;
                                                }
                                                if (var8 > var25) {
                                                    var8 = var25;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        label142: for (int var10 = 0; var10 < arg1; var10++) {
                            int var11 = arg0[var10];
                            int var12 = this.field7905[var11];
                            short[] var13 = this.field7903.field7966[var11];
                            if (var12 != 0 && var13 != null) {
                                int var14 = 0;
                                int var15 = 0;
                                while (true) {
                                    while (true) {
                                        if (var15 >= var13.length) {
                                            continue label142;
                                        }
                                        if ((0x1 << var14++ & var12) == 0) {
                                            var15 += 3;
                                        } else {
                                            var7++;
                                            for (int var16 = 0; var16 < 3; var16++) {
                                                int var17 = var13[var15++] & 0xFFFF;
                                                if (var17 < var8) {
                                                    var8 = var17;
                                                }
                                                if (var17 > var9) {
                                                    var9 = var17;
                                                }
                                                var6.method3198(var17);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    var6.method3199();
                    if (var4.method2339(true) && var7 > 0) {
                        this.field7908.method2664((this.field7903.field7977 & 0x8) != 0, (this.field7903.field7977 & 0x7) != 0, 16, this.field7899);
                        if (this.field7908.field4723) {
                            this.field7908.method141(Integer.MAX_VALUE, this.field7907, this.field7917, this.field7904);
                        }
                        class639 var26 = this.field7908.method2642(true);
                        var26.method4664(1.0F / this.field7906, 22931, 1.0F, 1.0F / this.field7906);
                        this.field7908.method2650(class467.field6818, 79);
                        this.field7908.method2088(this.field7911, 1, false);
                        this.field7908.method2120(this.field7903.field7986, -1);
                        this.field7908.method2074(class12.field163, var8, var9 + 1 - var8, var4, 0, var7, arg2 - 12470);
                        this.field7908.method2625(arg2 + 2147471145);
                    }
                }
            }
        } catch (RuntimeException var28) {
            throw class665.method4799(var28, field7918[5] + (arg0 == null ? field7918[2] : field7918[0]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(II)V", line = 191)
    public final void method4077(int arg0, int arg1) {
        try {
            field7902++;
            this.field7910.method3196(arg1 * 4 + 3);
            this.field7910.method3203(-1);
            if (arg0 != 19239) {
                this.field7909 = null;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7918[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIB)V", line = 205)
    public final void method4078(int arg0, int arg1, int arg2, byte arg3) {
        try {
            field7915++;
            this.field7905[this.field7903.field10701 * arg2 + arg1] = class10.method71(this.field7905[this.field7903.field10701 * arg2 + arg1], 0x1 << arg0);
            this.field7897++;
            if (arg3 != 53) {
                this.method4077(121, 32);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field7918[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IB)V", line = 218)
    public final void method4079(int arg0, byte arg1) {
        try {
            this.field7909 = this.field7908.method2672(0, true, arg0 * 4);
            field7916++;
            this.field7910 = new Stream(this.field7909, 0, arg0 * 4);
            if (arg1 != -102) {
                this.method4078(12, 18, 93, (byte) -50);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7918[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIBF)V", line = 234)
    public final void method4080(int arg0, int arg1, int arg2, byte arg3, float arg4) {
        try {
            field7913++;
            if (this.field7899 != -1) {
                class684 var6 = this.field7908.field237.method4500(-23641, this.field7899);
                int var7 = var6.field9589 & 0xFF;
                if (var7 != 0 && var6.field9605 != 4) {
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
                        arg1 = ((var8 & 0xFF00FF) * var7 + ((arg1 & 0xFF00FF) * var10) & 0xFF00FF00) + ((arg1 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                    }
                }
                int var11 = var6.field9602 & 0xFF;
                if (var11 != 0) {
                    var11 += 256;
                    int var12 = ((arg1 & 0xFF0000) >> 16) * var11;
                    if (var12 > 65535) {
                        var12 = 65535;
                    }
                    int var13 = ((arg1 & 0xFF00) >> 8) * var11;
                    if (var13 > 65535) {
                        var13 = 65535;
                    }
                    int var14 = (arg1 & 0xFF) * var11;
                    if (var14 > 65535) {
                        var14 = 65535;
                    }
                    arg1 = (var14 >> 8) + ((var12 & 0x8F00FF00) << 8) + (var13 & 0xFF00);
                }
            }
            this.field7910.method3196(arg2 * 4);
            if (arg4 != 1.0F) {
                int var15 = (arg1 & 0xFF2F5F) >> 16;
                int var16 = arg1 >> 8 & 0xFF;
                int var17 = (int) ((float) var15 * arg4);
                int var18 = arg1 & 0xFF;
                int var19 = (int) ((float) var16 * arg4);
                if (var17 < 0) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                if (var19 < 0) {
                    var19 = 0;
                } else if (var19 > 255) {
                    var19 = 255;
                }
                int var20 = (int) ((float) var18 * arg4);
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                arg1 = var20 | var17 << 16 | var19 << 8;
            }
            if (arg3 <= -41) {
                if (this.field7908.field4775 == 0) {
                    this.field7910.method3203((byte) arg1);
                    this.field7910.method3203((byte) (arg1 >> 8));
                    this.field7910.method3203((byte) (arg1 >> 16));
                } else {
                    this.field7910.method3203((byte) (arg1 >> 16));
                    this.field7910.method3203((byte) (arg1 >> 8));
                    this.field7910.method3203((byte) arg1);
                }
            }
        } catch (RuntimeException var22) {
            throw class665.method4799(var22, field7918[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(B)V", line = 354)
    public static void method4081(byte arg0) {
        try {
            field7912 = null;
            if (arg0 != -116) {
                method4081((byte) -99);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7918[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4082(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4083(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 40;
                    break;
                case 1:
                    var10005 = 26;
                    break;
                case 2:
                    var10005 = 45;
                    break;
                case 3:
                    var10005 = 58;
                    break;
                default:
                    var10005 = 29;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
