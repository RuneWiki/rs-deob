import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class356 extends class578 {

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "Lqd;")
    private class622 field5181;

    @OriginalMember(owner = "client!ki", name = "A", descriptor = "I")
    public int field5184;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "Lml;")
    private class194 field5176;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public int field5180;

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "F")
    public float field5174;

    @OriginalMember(owner = "client!ki", name = "C", descriptor = "[I")
    private int[] field5169;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
    public int field5177;

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "I")
    public int field5175;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "Lcm;")
    private class526 field5189;

    @OriginalMember(owner = "client!ki", name = "E", descriptor = "[Ljava/lang/String;")
    private static final String[] field5191 = new String[] { method2855(method2854("%1s\u0013t")), method2855(method2854("5vs|!")), method2855(method2854(" -1>")), method2855(method2854("%1s\u001bt")), method2855(method2854("%1s\u0010t")), method2855(method2854("%1s\u0014t")), method2855(method2854("%1s\u001at")), method2855(method2854("%1s\u0016t")), method2855(method2854("%1s\u0015t")), method2855(method2854("%1s\u0017t")), method2855(method2854("%1s\u0011t")), method2855(method2854("%1sn5 1)lt")) };

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "[I")
    public static int[] field5171 = new int[4096];

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "[B")
    public static byte[] field5179 = new byte[2048];

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!ki", name = "D", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "Lso;")
    private class316 field5183;

    @OriginalMember(owner = "client!ki", name = "B", descriptor = "Ljaclib/memory/Stream;")
    private Stream field5188;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field5173;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)V", line = 5)
    public final void method2845(int arg0, int arg1) {
        try {
            this.field5188.method3196(arg0 * arg1 + 3);
            field5178++;
            this.field5188.method3203(-1);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5191[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(IB)V", line = 21)
    public final void method2846(int arg0, byte arg1) {
        try {
            this.field5188.method3199();
            if (arg1 <= -66) {
                field5186++;
                class94 var3 = this.field5176.method1617(arg0 * 4, (byte) 51, 4, false, this.field5173);
                this.field5183 = new class316(var3, 5121, 4, 0);
                this.field5188 = null;
                this.field5173 = null;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5191[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V", line = 37)
    public static void method2847(int arg0) {
        try {
            field5179 = null;
            if (arg0 != 4) {
                method2850(123, -32, 70);
            }
            field5171 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5191[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIII)V", line = 53)
    public final void method2848(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg1 == -11745) {
                this.field5169[this.field5181.field10701 * arg2 + arg3] = class10.method71(this.field5169[this.field5181.field10701 * arg2 + arg3], 0x1 << arg0);
                field5187++;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field5191[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)J", line = 65)
    public static final long method2849(int arg0, byte arg1) {
        try {
            field5190++;
            if (arg1 >= -32) {
                field5179 = null;
            }
            return (long) (arg0 + 11745) * 86400000L;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5191[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)Z", line = 79)
    public static final boolean method2850(int arg0, int arg1, int arg2) {
        try {
            field5185++;
            if (arg1 != 65280) {
                method2849(41, (byte) 16);
            }
            return class793.method5717(arg0, arg2, true) & ((arg0 & 0x2000) != 0 | class750.method5428(arg2, arg0, -123) | class798.method5757(arg2, arg0, (byte) -86));
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5191[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)V", line = 96)
    public final void method2851(int arg0, int arg1) {
        try {
            field5182++;
            this.field5173 = this.field5176.field2761.method3189(arg1 * 4, true);
            if (arg0 >= 38) {
                this.field5188 = new Stream(this.field5173);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5191[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IFIII)V", line = 109)
    public final void method2852(int arg0, float arg1, int arg2, int arg3, int arg4) {
        try {
            field5172++;
            if (this.field5184 != -1) {
                class684 var6 = this.field5176.field237.method4500(-23641, this.field5184);
                int var7 = var6.field9589 & 0xFF;
                if (var7 != 0 && var6.field9605 != 4) {
                    int var8;
                    if (arg4 < 0) {
                        var8 = 0;
                    } else if (arg4 <= 127) {
                        var8 = arg4 * 131586;
                    } else {
                        var8 = 16777215;
                    }
                    if (var7 == 256) {
                        arg2 = var8;
                    } else {
                        int var10 = 256 - var7;
                        arg2 = ((arg2 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg2 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                    }
                }
                int var11 = var6.field9602 & 0xFF;
                if (var11 != 0) {
                    var11 += 256;
                    int var12 = ((arg2 & 0xFF0000) >> 16) * var11;
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
                    arg2 = ((var12 & 0xC300FF00) << 8) + (var13 & 0xFF00) + (var14 >> 8);
                }
            }
            if ((float) arg3 != arg1) {
                int var15 = arg2 >> 16 & 0xFF;
                int var16 = (arg2 & 0xFF99) >> 8;
                int var17 = arg2 & 0xFF;
                int var18 = (int) ((float) var15 * arg1);
                int var19 = (int) ((float) var16 * arg1);
                if (var18 < 0) {
                    var18 = 0;
                } else if (var18 > 255) {
                    var18 = 255;
                }
                int var20 = (int) ((float) var17 * arg1);
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
                arg2 = var20 | var19 << 8 | var18 << 16;
            }
            this.field5188.method3196(arg0 * 4);
            this.field5188.method3203((byte) (arg2 >> 16));
            this.field5188.method3203((byte) (arg2 >> 8));
            this.field5188.method3203((byte) arg2);
        } catch (RuntimeException var22) {
            throw class665.method4799(var22, field5191[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II[I)V", line = 215)
    public final void method2853(int arg0, int arg1, int[] arg2) {
        try {
            field5170++;
            int var4 = 0;
            class318 var5 = this.field5176.field2890;
            if (arg1 != 5888) {
                this.field5188 = null;
            }
            var5.field9945 = 0;
            if (this.field5176.field2842) {
                for (int var6 = 0; var6 < arg0; var6++) {
                    int var7 = arg2[var6];
                    int var8 = this.field5169[var7];
                    short[] var9 = this.field5181.field8872[var7];
                    if (var8 != 0 && var9 != null) {
                        int var10 = 0;
                        int var11 = 0;
                        while (var11 < var9.length) {
                            if ((0x1 << var10++ & var8) == 0) {
                                var11 += 3;
                            } else {
                                var5.method5138((byte) -112, var9[var11++] & 0xFFFF);
                                var4++;
                                var5.method5138((byte) -121, var9[var11++] & 0xFFFF);
                                var4++;
                                var4++;
                                var5.method5138((byte) -124, var9[var11++] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var12 = 0; var12 < arg0; var12++) {
                    int var13 = arg2[var12];
                    short[] var14 = this.field5181.field8872[var13];
                    int var15 = this.field5169[var13];
                    if (var15 != 0 && var14 != null) {
                        int var16 = 0;
                        int var17 = 0;
                        while (var17 < var14.length) {
                            if ((var15 & 0x1 << var16++) == 0) {
                                var17 += 3;
                            } else {
                                var5.method5106(var14[var17++] & 0xFFFF, -96);
                                var4++;
                                var5.method5106(var14[var17++] & 0xFFFF, -117);
                                var4++;
                                var4++;
                                var5.method5106(var14[var17++] & 0xFFFF, -103);
                            }
                        }
                    }
                }
            }
            if (var4 > 0) {
                this.field5189.method1507(var5.field9945, -32534, 5123, var5.field9996);
                this.field5176.method1653(arg1 ^ 0xFFFFE57B, this.field5183, this.field5181.field8896, this.field5181.field8904, this.field5181.field8902);
                this.field5176.method1682((this.field5181.field8889 & 0x8) != 0, this.field5184, (this.field5181.field8889 & 0x7) != 0, 83);
                if (this.field5176.field2874) {
                    this.field5176.method141(Integer.MAX_VALUE, this.field5175, this.field5177, this.field5180);
                }
                OpenGL.glMatrixMode(5890);
                OpenGL.glPushMatrix();
                OpenGL.glScalef(1.0F / this.field5174, 1.0F / this.field5174, 1.0F);
                OpenGL.glMatrixMode(5888);
                this.field5176.method1653(-3461, this.field5183, this.field5181.field8896, this.field5181.field8904, this.field5181.field8902);
                this.field5176.method1647(0, var4, this.field5189, -53, 4);
                OpenGL.glMatrixMode(5890);
                OpenGL.glPopMatrix();
                OpenGL.glMatrixMode(5888);
            }
        } catch (RuntimeException var19) {
            throw class665.method4799(var19, field5191[3] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field5191[2] : field5191[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lqd;IIIII)V", line = 336)
    public class356(class622 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            this.field5181 = arg0;
            this.field5184 = arg1;
            this.field5176 = this.field5181.field8892;
            this.field5180 = arg5;
            this.field5174 = arg2;
            this.field5169 = new int[this.field5181.field10703 * this.field5181.field10701];
            this.field5177 = arg4;
            this.field5175 = arg3;
            this.field5189 = new class526(this.field5176, 5123, null, 1);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field5191[11] + (arg0 == null ? field5191[2] : field5191[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2854(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2855(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 78;
                    break;
                case 1:
                    var10005 = 88;
                    break;
                case 2:
                    var10005 = 93;
                    break;
                case 3:
                    var10005 = 82;
                    break;
                default:
                    var10005 = 92;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
