import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class407 extends class5 {

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "Le;")
    private class376 field6178;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "[I")
    private int[] field6167;

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "I")
    public int field6183;

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "I")
    public int field6177;

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "I")
    public int field6176;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "Lnq;")
    private class325 field6166;

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "F")
    public float field6184;

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "I")
    public int field6185;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "Lli;")
    private class300 field6169;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "[B")
    public static byte[] field6172 = new byte[520];

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "Ljava/lang/String;")
    public static String field6188 = null;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
    public static int field6170;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "I")
    public static int field6179;

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!hj", name = "D", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "I")
    public static int field6187;

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "Lm;")
    private class129 field6182;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "Laa;")
    public static class341 field6168;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field6174;

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "Ljaggl/memory/NativeStream;")
    private NativeStream field6175;

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "[Laa;")
    public static class341[] field6181;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IB)V")
    public final void method2511(int arg0, byte arg1) {
        this.field6175.method2728();
        field6186++;
        class541 var3 = this.field6166.method2036((byte) 117, 4, false, this.field6174, arg0 * 4);
        this.field6182 = new class129(var3, 5121, 4, 0);
        if (arg1 != -125) {
            this.method2516((byte) 127, 110, null);
        }
        this.field6175 = null;
        this.field6174 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIZ)I")
    public static final int method2512(int arg0, int arg1, int arg2, boolean arg3) {
        field6171++;
        int var4 = arg0 / arg1;
        int var5 = arg0 & arg1 - 1;
        int var6 = arg2 / arg1;
        if (!arg3) {
            method2517(-96);
        }
        int var7 = arg1 - 1 & arg2;
        int var8 = class221.method1488(var6, 87, var4);
        int var9 = class221.method1488(var6, 77, var4 + 1);
        int var10 = class221.method1488(var6 + 1, 92, var4);
        int var11 = class221.method1488(var6 + 1, 92, var4 + 1);
        int var12 = class279.method1792(var8, arg1, var9, (byte) 74, var5);
        int var13 = class279.method1792(var10, arg1, var11, (byte) 49, var5);
        return class279.method1792(var12, arg1, var13, (byte) 78, var7);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)V")
    public final void method2513(int arg0, int arg1) {
        this.field6175.method2729(arg1 * 4 + 3);
        field6170++;
        this.field6175.method2726(-1);
        int var3 = 60 / ((arg0 + 7) / 57);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIII)V")
    public final void method2514(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            method2517(28);
        }
        this.field6167[this.field6178.field340 * arg0 + arg2] = class311.method1956(this.field6167[this.field6178.field340 * arg0 + arg2], 0x1 << arg3);
        field6187++;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIFII)V")
    public final void method2515(int arg0, int arg1, float arg2, int arg3, int arg4) {
        if (this.field6185 != -1) {
            class107 var6 = this.field6166.field2235.method157((byte) 118, this.field6185);
            int var7 = var6.field1518 & 0xFF;
            if (var7 != 0 && var6.field1506 != 4) {
                int var8;
                if (arg1 < 0) {
                    var8 = 0;
                } else if (arg1 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg1 * 131586;
                }
                if (var7 == 256) {
                    arg3 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg3 = ((arg3 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg3 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field1505 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg3 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg3 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg3 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg3 = (var13 & 0xFF00) + (((var12 & 0x6800FF00) << 8) + (var14 >> 8));
            }
        }
        field6180++;
        if (arg4 >= -35) {
            this.field6174 = null;
        }
        if (arg2 != 1.0F) {
            int var15 = arg3 >> 16 & 0xFF;
            int var16 = arg3 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg2);
            int var18 = arg3 & 0xFF;
            int var19 = (int) ((float) var16 * arg2);
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
            int var20 = (int) ((float) var18 * arg2);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg3 = var20 | var19 << 8 | var17 << 16;
        }
        this.field6175.method2729(arg0 * 4);
        this.field6175.method2726((byte) (arg3 >> 16));
        this.field6175.method2726((byte) (arg3 >> 8));
        this.field6175.method2726((byte) arg3);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BI[I)V")
    public final void method2516(byte arg0, int arg1, int[] arg2) {
        field6179++;
        int var4 = 0;
        int var5 = 83 / ((-arg0 - 69) / 32);
        class283 var6 = this.field6166.field4943;
        var6.field2185 = 0;
        if (this.field6166.field4974) {
            for (int var7 = 0; var7 < arg1; var7++) {
                int var8 = arg2[var7];
                int var9 = this.field6167[var8];
                short[] var10 = this.field6178.field5734[var8];
                if (var9 != 0 && var10 != null) {
                    int var11 = 0;
                    int var12 = 0;
                    while (var10.length > var12) {
                        if ((var9 & 0x1 << var11++) == 0) {
                            var12 += 3;
                        } else {
                            var4++;
                            var6.method1114(var10[var12++] & 0xFFFF, 106);
                            var6.method1114(var10[var12++] & 0xFFFF, 90);
                            var4++;
                            var6.method1114(var10[var12++] & 0xFFFF, 92);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var13 = 0; var13 < arg1; var13++) {
                int var14 = arg2[var13];
                int var15 = this.field6167[var14];
                short[] var16 = this.field6178.field5734[var14];
                if (var15 != 0 && var16 != null) {
                    int var17 = 0;
                    int var18 = 0;
                    while (var18 < var16.length) {
                        if ((0x1 << var17++ & var15) == 0) {
                            var18 += 3;
                        } else {
                            var4++;
                            var6.method1111(var16[var18++] & 0xFFFF, 21251);
                            var4++;
                            var6.method1111(var16[var18++] & 0xFFFF, 21251);
                            var4++;
                            var6.method1111(var16[var18++] & 0xFFFF, 21251);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field6169.method675((byte) 56, var6.field2185, var6.field2219, 5123);
        this.field6166.method2092(this.field6178.field5747, this.field6178.field5745, this.field6178.field5746, this.field6182, 18504);
        this.field6166.method2034(this.field6185, (this.field6178.field5717 & 0x8) != 0, (this.field6178.field5717 & 0x7) != 0, (byte) -128);
        if (this.field6166.field4931) {
            this.field6166.method754(Integer.MAX_VALUE, this.field6183, this.field6177, this.field6176);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field6184, 1.0F / this.field6184, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field6166.method2092(this.field6178.field5747, this.field6178.field5745, this.field6178.field5746, this.field6182, 18504);
        this.field6166.method2065(4, 0, var4, this.field6169, 94);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
    public static void method2517(int arg0) {
        field6188 = null;
        field6168 = null;
        field6181 = null;
        if (arg0 > 91) {
            field6172 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Le;IIIII)V")
    public class407(class376 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6178 = arg0;
        this.field6167 = new int[this.field6178.field340 * this.field6178.field337];
        this.field6183 = arg3;
        this.field6177 = arg4;
        this.field6176 = arg5;
        this.field6166 = this.field6178.field5738;
        this.field6184 = arg2;
        this.field6185 = arg1;
        this.field6169 = new class300(this.field6166, 5123, null, 1);
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)V")
    public final void method2518(int arg0, int arg1) {
        this.field6174 = this.field6166.field4896.method2734(arg0 * 4);
        field6173++;
        this.field6175 = new NativeStream(this.field6174);
        if (arg1 != -24852) {
            this.field6185 = -74;
        }
    }
}
