import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class193 extends class568 {

    @OriginalMember(owner = "client!efa", name = "F", descriptor = "Ldl;")
    private class67 field3030;

    @OriginalMember(owner = "client!efa", name = "I", descriptor = "F")
    public float field3027;

    @OriginalMember(owner = "client!efa", name = "v", descriptor = "I")
    public int field3024;

    @OriginalMember(owner = "client!efa", name = "q", descriptor = "Lvf;")
    private class159 field3029;

    @OriginalMember(owner = "client!efa", name = "m", descriptor = "I")
    public int field3040;

    @OriginalMember(owner = "client!efa", name = "s", descriptor = "[I")
    private int[] field3034;

    @OriginalMember(owner = "client!efa", name = "z", descriptor = "I")
    public int field3036;

    @OriginalMember(owner = "client!efa", name = "n", descriptor = "I")
    public int field3045;

    @OriginalMember(owner = "client!efa", name = "J", descriptor = "Ltb;")
    private class422 field3043;

    @OriginalMember(owner = "client!efa", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field3049 = new String[] { method1792(method1791("4^6Y0y")), method1792(method1791("?M;\u001b")), method1792(method1791("*\u0016yY\u0004")), method1792(method1791("4^6YE8V>\u0003Gy")), method1792(method1791("4^6Y;y")), method1792(method1791("4^6Y<y")), method1792(method1791("4^6Y8y")), method1792(method1791("4^6Y?y")), method1792(method1791("4^6Y:y")), method1792(method1791("4^6Y>y")), method1792(method1791("4^6Y=y")), method1792(method1791("4^6Y1y")) };

    @OriginalMember(owner = "client!efa", name = "w", descriptor = "I")
    public static int field3026 = 4;

    @OriginalMember(owner = "client!efa", name = "p", descriptor = "I")
    public static int field3038 = 0;

    @OriginalMember(owner = "client!efa", name = "H", descriptor = "Lhl;")
    public static class556 field3025 = new class556(111, 7);

    @OriginalMember(owner = "client!efa", name = "y", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!efa", name = "E", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!efa", name = "G", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!efa", name = "D", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!efa", name = "B", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!efa", name = "t", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!efa", name = "u", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!efa", name = "K", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!efa", name = "r", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!efa", name = "o", descriptor = "Lkn;")
    private class774 field3032;

    @OriginalMember(owner = "client!efa", name = "L", descriptor = "Ljaclib/memory/Stream;")
    private Stream field3031;

    @OriginalMember(owner = "client!efa", name = "x", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field3037;

    @OriginalMember(owner = "client!efa", name = "l", descriptor = "[Lhk;")
    public static class107[] field3046;

    @OriginalMember(owner = "client!efa", name = "A", descriptor = "[[I")
    public static int[][] field3047;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method1782(int arg0, int arg1, int arg2) {
        try {
            if (arg2 == 0) {
                field3044++;
                return class517.method3878(arg1, arg0, -72) | (arg0 & 0x40000) != 0 || class157.method1412(arg0, arg1, (byte) 126);
            } else {
                return true;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3049[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(IIBI)V", line = 14)
    public final void method1783(int arg0, int arg1, byte arg2, int arg3) {
        try {
            this.field3034[this.field3030.field4704 * arg0 + arg1] = class553.method4099(this.field3034[this.field3030.field4704 * arg0 + arg1], 0x1 << arg3);
            field3042++;
            int var5 = 69 % ((13 - arg2) / 53);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field3049[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)V", line = 25)
    public static void method1784(int arg0) {
        try {
            if (arg0 == 16711935) {
                field3046 = null;
                field3047 = null;
                field3025 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3049[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(Z)Lwea;", line = 41)
    public static final class164 method1785(boolean arg0) {
        try {
            field3039++;
            return class592.method4342(arg0, class315.field5127) ? class185.field2943 : class185.field2948;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3049[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "(II)V", line = 57)
    public final void method1786(int arg0, int arg1) {
        try {
            field3028++;
            this.field3031.method5097();
            class450 var3 = this.field3029.method1448(93, arg0 * arg1, 4, this.field3037, false);
            this.field3032 = new class774(var3, 5121, 4, 0);
            this.field3037 = null;
            this.field3031 = null;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3049[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(II[I)V", line = 72)
    public final void method1787(int arg0, int arg1, int[] arg2) {
        try {
            field3033++;
            int var4 = 0;
            class647 var5 = this.field3029.field2453;
            if (arg0 != -3551) {
                this.field3034 = null;
            }
            var5.field2799 = 0;
            if (this.field3029.field2500) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    int var7 = arg2[var6];
                    int var8 = this.field3034[var7];
                    short[] var9 = this.field3030.field918[var7];
                    if (var8 != 0 && var9 != null) {
                        int var10 = 0;
                        int var11 = 0;
                        while (var9.length > var11) {
                            if ((var8 & 0x1 << var10++) == 0) {
                                var11 += 3;
                            } else {
                                var5.method1650((byte) -95, var9[var11++] & 0xFFFF);
                                var4++;
                                var5.method1650((byte) -95, var9[var11++] & 0xFFFF);
                                var4++;
                                var5.method1650((byte) -95, var9[var11++] & 0xFFFF);
                                var4++;
                            }
                        }
                    }
                }
            } else {
                for (int var12 = 0; var12 < arg1; var12++) {
                    int var13 = arg2[var12];
                    short[] var14 = this.field3030.field918[var13];
                    int var15 = this.field3034[var13];
                    if (var15 != 0 && var14 != null) {
                        int var16 = 0;
                        int var17 = 0;
                        while (var17 < var14.length) {
                            if ((0x1 << var16++ & var15) == 0) {
                                var17 += 3;
                            } else {
                                var4++;
                                var5.method1633(var14[var17++] & 0xFFFF, -24955);
                                var5.method1633(var14[var17++] & 0xFFFF, -24955);
                                var4++;
                                var5.method1633(var14[var17++] & 0xFFFF, -24955);
                                var4++;
                            }
                        }
                    }
                }
            }
            if (var4 > 0) {
                this.field3043.method623(5123, var5.field2799, false, var5.field2805);
                this.field3029.method1481(this.field3032, this.field3030.field948, (byte) -78, this.field3030.field944, this.field3030.field946);
                this.field3029.method1491(this.field3040, (byte) -128, (this.field3030.field927 & 0x8) != 0, (this.field3030.field927 & 0x7) != 0);
                if (this.field3029.field2469) {
                    this.field3029.method214(Integer.MAX_VALUE, this.field3024, this.field3045, this.field3036);
                }
                OpenGL.glMatrixMode(5890);
                OpenGL.glPushMatrix();
                OpenGL.glScalef(1.0F / this.field3027, 1.0F / this.field3027, 1.0F);
                OpenGL.glMatrixMode(5888);
                this.field3029.method1481(this.field3032, this.field3030.field948, (byte) -115, this.field3030.field944, this.field3030.field946);
                this.field3029.method1461((byte) -15, this.field3043, 0, var4, 4);
                OpenGL.glMatrixMode(5890);
                OpenGL.glPopMatrix();
                OpenGL.glMatrixMode(5888);
            }
        } catch (RuntimeException var19) {
            throw class590.method4333(var19, field3049[5] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field3049[1] : field3049[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(BI)V", line = 195)
    public final void method1788(byte arg0, int arg1) {
        try {
            this.field3031.method5103(arg1 * 4 + 3);
            field3041++;
            if (arg0 != 94) {
                this.method1790(105, -42);
            }
            this.field3031.method5105(-1);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3049[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(IFIII)V", line = 209)
    public final void method1789(int arg0, float arg1, int arg2, int arg3, int arg4) {
        try {
            field3035++;
            if (this.field3040 != -1) {
                class304 var6 = this.field3029.field864.method1419(this.field3040, -88);
                int var7 = var6.field4893 & 0xFF;
                if (var7 != 0 && var6.field4913 != 4) {
                    int var8;
                    if (arg3 < 0) {
                        var8 = 0;
                    } else if (arg3 <= 127) {
                        var8 = arg3 * 131586;
                    } else {
                        var8 = 16777215;
                    }
                    if (var7 == 256) {
                        arg0 = var8;
                    } else {
                        int var10 = 256 - var7;
                        arg0 = ((arg0 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg0 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                    }
                }
                int var11 = var6.field4905 & 0xFF;
                if (var11 != 0) {
                    var11 += 256;
                    int var12 = ((arg0 & 0xFF0000) >> 16) * var11;
                    if (var12 > 65535) {
                        var12 = 65535;
                    }
                    int var13 = (arg0 >> 8 & 0xFF) * var11;
                    if (var13 > 65535) {
                        var13 = 65535;
                    }
                    int var14 = (arg0 & 0xFF) * var11;
                    if (var14 > 65535) {
                        var14 = 65535;
                    }
                    arg0 = (var14 >> 8) + (var12 << 8 & 0xFF0002) + (var13 & 0xFF00);
                }
            }
            if (arg1 != 1.0F) {
                int var15 = (arg0 & 0xFFD61A) >> 16;
                int var16 = arg0 >> 8 & 0xFF;
                int var17 = arg0 & 0xFF;
                int var18 = (int) ((float) var15 * arg1);
                if (var18 < 0) {
                    var18 = 0;
                } else if (var18 > 255) {
                    var18 = 255;
                }
                int var19 = (int) ((float) var16 * arg1);
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
                arg0 = var18 << 16 | var19 << 8 | var20;
            }
            this.field3031.method5103(arg2 * 4);
            this.field3031.method5105((byte) (arg0 >> 16));
            if (arg4 > 96) {
                this.field3031.method5105((byte) (arg0 >> 8));
                this.field3031.method5105((byte) arg0);
            }
        } catch (RuntimeException var22) {
            throw class590.method4333(var22, field3049[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(Ldl;IIIII)V", line = 339)
    public class193(class67 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            this.field3030 = arg0;
            this.field3027 = arg2;
            this.field3024 = arg3;
            this.field3029 = this.field3030.field928;
            this.field3040 = arg1;
            this.field3034 = new int[this.field3030.field4704 * this.field3030.field4697];
            this.field3036 = arg5;
            this.field3045 = arg4;
            this.field3043 = new class422(this.field3029, 5123, null, 1);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field3049[3] + (arg0 == null ? field3049[1] : field3049[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "(II)V", line = 356)
    public final void method1790(int arg0, int arg1) {
        try {
            field3023++;
            this.field3037 = this.field3029.field2392.method5095(arg1 * 4, true);
            this.field3031 = new Stream(this.field3037);
            if (arg0 != 7621) {
                method1782(-105, -110, -69);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3049[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!efa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1791(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x79);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!efa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1792(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 81;
                    break;
                case 1:
                    var10005 = 56;
                    break;
                case 2:
                    var10005 = 87;
                    break;
                case 3:
                    var10005 = 119;
                    break;
                default:
                    var10005 = 121;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
