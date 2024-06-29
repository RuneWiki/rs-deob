import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kja")
public class class684 extends class206 {

    @OriginalMember(owner = "client!kja", name = "t", descriptor = "I")
    public int field9928 = 0;

    @OriginalMember(owner = "client!kja", name = "v", descriptor = "Lim;")
    private class597 field9915;

    @OriginalMember(owner = "client!kja", name = "o", descriptor = "I")
    public int field9908;

    @OriginalMember(owner = "client!kja", name = "s", descriptor = "I")
    public int field9927;

    @OriginalMember(owner = "client!kja", name = "r", descriptor = "F")
    public float field9910;

    @OriginalMember(owner = "client!kja", name = "D", descriptor = "Lkd;")
    private class296 field9917;

    @OriginalMember(owner = "client!kja", name = "F", descriptor = "I")
    public int field9921;

    @OriginalMember(owner = "client!kja", name = "C", descriptor = "[I")
    private int[] field9912;

    @OriginalMember(owner = "client!kja", name = "B", descriptor = "I")
    public int field9930;

    @OriginalMember(owner = "client!kja", name = "G", descriptor = "[Ljava/lang/String;")
    private static final String[] field9931 = new String[] { method5022(method5021("Y\u0004%nS\u001a")), method5022(method5021("\\\u001b(,")), method5022(method5021("Y\u0004%nT\u001a")), method5022(method5021("I@jnm")), method5022(method5021("Y\u0004%nV\u001a")), method5022(method5021("Y\u0004%nU\u001a")), method5022(method5021("Y\u0004%nX\u001a")), method5022(method5021("Y\u0004%nR\u001a")), method5022(method5021("Y\u0004%nW\u001a")), method5022(method5021("Y\u0004%n,[\u0000-4.\u001a")), method5022(method5021("Y\u0004%nQ\u001a")) };

    @OriginalMember(owner = "client!kja", name = "n", descriptor = "I")
    public static int field9918 = -2;

    @OriginalMember(owner = "client!kja", name = "m", descriptor = "Lbda;")
    public static class531 field9909 = new class531();

    @OriginalMember(owner = "client!kja", name = "z", descriptor = "I")
    public static int field9914;

    @OriginalMember(owner = "client!kja", name = "l", descriptor = "I")
    public static int field9916;

    @OriginalMember(owner = "client!kja", name = "u", descriptor = "I")
    public static int field9919;

    @OriginalMember(owner = "client!kja", name = "j", descriptor = "I")
    public static int field9920;

    @OriginalMember(owner = "client!kja", name = "k", descriptor = "I")
    public static int field9922;

    @OriginalMember(owner = "client!kja", name = "x", descriptor = "I")
    public static int field9923;

    @OriginalMember(owner = "client!kja", name = "y", descriptor = "I")
    public static int field9925;

    @OriginalMember(owner = "client!kja", name = "E", descriptor = "I")
    public static int field9926;

    @OriginalMember(owner = "client!kja", name = "A", descriptor = "I")
    public static int field9929;

    @OriginalMember(owner = "client!kja", name = "w", descriptor = "Lsfa;")
    private class723 field9924;

    @OriginalMember(owner = "client!kja", name = "p", descriptor = "Ljaclib/memory/Stream;")
    private Stream field9913;

    @OriginalMember(owner = "client!kja", name = "q", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field9911;

    @OriginalMember(owner = "client!kja", name = "b", descriptor = "(IB)V")
    public final void method5013(int arg0, byte arg1) {
        try {
            this.field9911 = this.field9917.method2421(true, arg0 * 4, 109);
            if (arg1 > -66) {
                this.method5020(44, (byte) -44, null);
            }
            field9923++;
            this.field9913 = new Stream(this.field9911, 0, arg0 * 4);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9931[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(II)V")
    public final void method5014(int arg0, int arg1) {
        try {
            this.field9913.method5103();
            field9919++;
            this.field9924 = this.field9917.method850(false, 0);
            this.field9924.method169(4, arg0 * arg1, this.field9911, 116);
            this.field9911 = null;
            this.field9913 = null;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9931[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(I)V")
    public static void method5015(int arg0) {
        try {
            field9909 = null;
            if (arg0 != 29653) {
                field9916 = -90;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9931[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(IIBI)V")
    public final void method5016(int arg0, int arg1, byte arg2, int arg3) {
        try {
            if (arg2 == -89) {
                field9922++;
                this.field9912[this.field9915.field4337 * arg3 + arg0] = class544.method4107(this.field9912[this.field9915.field4337 * arg3 + arg0], 0x1 << arg1);
                this.field9928++;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9931[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(IB)V")
    public final void method5017(int arg0, byte arg1) {
        try {
            this.field9913.method5110(arg0 * 4 + 3);
            field9926++;
            this.field9913.method5106(arg1);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9931[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(IIIFB)V")
    public final void method5018(int arg0, int arg1, int arg2, float arg3, byte arg4) {
        try {
            if (this.field9908 != -1) {
                class439 var6 = this.field9917.field679.method1366((byte) -123, this.field9908);
                int var7 = var6.field6476 & 0xFF;
                if (var7 != 0 && var6.field6467 != 4) {
                    int var8;
                    if (arg1 < 0) {
                        var8 = 0;
                    } else if (arg1 > 127) {
                        var8 = 16777215;
                    } else {
                        var8 = arg1 * 131586;
                    }
                    if (var7 == 256) {
                        arg2 = var8;
                    } else {
                        int var10 = 256 - var7;
                        arg2 = ((arg2 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((var8 & 0xFF00) * var7 + ((arg2 & 0xFF00) * var10) & 0xFF0000) >> 8;
                    }
                }
                int var11 = var6.field6480 & 0xFF;
                if (var11 != 0) {
                    var11 += 256;
                    int var12 = (arg2 >> 16 & 0xFF) * var11;
                    if (var12 > 65535) {
                        var12 = 65535;
                    }
                    int var13 = ((arg2 & 0xFF00) >> 8) * var11;
                    if (var13 > 65535) {
                        var13 = 65535;
                    }
                    int var14 = (arg2 & 0xFF) * var11;
                    if (var14 > 65535) {
                        var14 = 65535;
                    }
                    arg2 = ((var12 & 0x9200FF00) << 8) + (var14 >> 8) + (var13 & 0xFF00);
                }
            }
            field9920++;
            if (arg3 != 1.0F) {
                int var15 = arg2 >> 16 & 0xFF;
                int var16 = arg2 >> 8 & 0xFF;
                int var17 = arg2 & 0xFF;
                int var18 = (int) ((float) var15 * arg3);
                int var19 = (int) ((float) var16 * arg3);
                if (var18 < 0) {
                    var18 = 0;
                } else if (var18 > 255) {
                    var18 = 255;
                }
                if (var19 < 0) {
                    var19 = 0;
                } else if (var19 > 255) {
                    var19 = 255;
                }
                int var20 = (int) ((float) var17 * arg3);
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                arg2 = var20 | var19 << 8 | var18 << 16;
            }
            this.field9913.method5110(arg0 * 4);
            if (arg4 == 49) {
                if (this.field9917.field4595 == 0) {
                    this.field9913.method5106((byte) arg2);
                    this.field9913.method5106((byte) (arg2 >> 8));
                    this.field9913.method5106((byte) (arg2 >> 16));
                } else {
                    this.field9913.method5106((byte) (arg2 >> 16));
                    this.field9913.method5106((byte) (arg2 >> 8));
                    this.field9913.method5106((byte) arg2);
                }
            }
        } catch (RuntimeException var22) {
            throw class759.method5498(var22, field9931[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(B)Ltia;")
    public static final class280 method5019(byte arg0) {
        try {
            if (arg0 <= 77) {
                field9909 = null;
            }
            field9929++;
            return class22.field267 == 0 ? new class280() : class385.field5825[--class22.field267];
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9931[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(IB[I)V")
    public final void method5020(int arg0, byte arg1, int[] arg2) {
        try {
            if (arg1 == 101) {
                field9914++;
                class421 var4 = this.field9917.method2439(true, this.field9928 * 3);
                Buffer var5 = var4.method3256(true, (byte) -89);
                if (var5 != null) {
                    Stream var6 = this.field9917.method2476(var5, (byte) -3);
                    int var7 = 0;
                    int var8 = 32767;
                    int var9 = -32768;
                    if (Stream.method5102()) {
                        label119: for (int var18 = 0; var18 < arg0; var18++) {
                            int var19 = arg2[var18];
                            short[] var20 = this.field9915.field8756[var19];
                            int var21 = this.field9912[var19];
                            if (var21 != 0 && var20 != null) {
                                int var22 = 0;
                                int var23 = 0;
                                while (true) {
                                    while (true) {
                                        if (var23 >= var20.length) {
                                            continue label119;
                                        }
                                        if ((var21 & 0x1 << var22++) == 0) {
                                            var23 += 3;
                                        } else {
                                            var7++;
                                            for (int var24 = 0; var24 < 3; var24++) {
                                                int var25 = var20[var23++] & 0xFFFF;
                                                if (var25 > var9) {
                                                    var9 = var25;
                                                }
                                                var6.method5100(var25);
                                                if (var25 < var8) {
                                                    var8 = var25;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        label144: for (int var10 = 0; var10 < arg0; var10++) {
                            int var11 = arg2[var10];
                            short[] var12 = this.field9915.field8756[var11];
                            int var13 = this.field9912[var11];
                            if (var13 != 0 && var12 != null) {
                                int var14 = 0;
                                int var15 = 0;
                                while (true) {
                                    while (true) {
                                        if (var12.length <= var15) {
                                            continue label144;
                                        }
                                        if ((0x1 << var14++ & var13) == 0) {
                                            var15 += 3;
                                        } else {
                                            var7++;
                                            for (int var16 = 0; var16 < 3; var16++) {
                                                int var17 = var12[var15++] & 0xFFFF;
                                                var6.method5108(var17);
                                                if (var8 > var17) {
                                                    var8 = var17;
                                                }
                                                if (var9 < var17) {
                                                    var9 = var17;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    var6.method5103();
                    if (var4.method3257(-3841) && var7 > 0) {
                        this.field9917.method2477(0, (this.field9915.field8785 & 0x8) != 0, this.field9908, (this.field9915.field8785 & 0x7) != 0);
                        if (this.field9917.field4638) {
                            this.field9917.method480(Integer.MAX_VALUE, this.field9921, this.field9927, this.field9930);
                        }
                        class770 var26 = this.field9917.method2479(-1);
                        var26.method5558(1.0F / this.field9910, 0, 1.0F, 1.0F / this.field9910);
                        this.field9917.method2474(2, class398.field5941);
                        this.field9917.method856(1, this.field9924, true);
                        this.field9917.method868(false, this.field9915.field8791);
                        this.field9917.method877(var9 + 1 - var8, var4, var8, 0, class769.field11134, var7, (byte) -118);
                        this.field9917.method2489(0);
                    }
                }
            }
        } catch (RuntimeException var28) {
            throw class759.method5498(var28, field9931[2] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field9931[1] : field9931[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!kja", name = "<init>", descriptor = "(Lim;IIIII)V")
    public class684(class597 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            this.field9915 = arg0;
            this.field9908 = arg1;
            this.field9927 = arg4;
            this.field9910 = arg2;
            this.field9917 = this.field9915.field8761;
            this.field9921 = arg3;
            this.field9912 = new int[this.field9915.field4337 * this.field9915.field4336];
            this.field9930 = arg5;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field9931[9] + (arg0 == null ? field9931[1] : field9931[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!kja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5021(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x10);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5022(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 50;
                    break;
                case 1:
                    var10005 = 110;
                    break;
                case 2:
                    var10005 = 68;
                    break;
                case 3:
                    var10005 = 64;
                    break;
                default:
                    var10005 = 16;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
