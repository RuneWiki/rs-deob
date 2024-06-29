import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public class class164 extends class627 {

    @OriginalMember(owner = "client!pga", name = "q", descriptor = "Lqh;")
    private class74 field2093;

    @OriginalMember(owner = "client!pga", name = "o", descriptor = "[I")
    private int[] field2091;

    @OriginalMember(owner = "client!pga", name = "p", descriptor = "I")
    public int field2092;

    @OriginalMember(owner = "client!pga", name = "B", descriptor = "I")
    public int field2104;

    @OriginalMember(owner = "client!pga", name = "s", descriptor = "I")
    public int field2095;

    @OriginalMember(owner = "client!pga", name = "l", descriptor = "Leq;")
    private class357 field2088;

    @OriginalMember(owner = "client!pga", name = "j", descriptor = "F")
    public float field2086;

    @OriginalMember(owner = "client!pga", name = "t", descriptor = "I")
    public int field2096;

    @OriginalMember(owner = "client!pga", name = "u", descriptor = "Ldn;")
    private class584 field2097;

    @OriginalMember(owner = "client!pga", name = "m", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!pga", name = "r", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!pga", name = "v", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!pga", name = "w", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!pga", name = "y", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!pga", name = "z", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!pga", name = "A", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!pga", name = "n", descriptor = "Lqe;")
    private class88 field2090;

    @OriginalMember(owner = "client!pga", name = "k", descriptor = "Ljaclib/memory/Stream;")
    private Stream field2087;

    @OriginalMember(owner = "client!pga", name = "x", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field2100;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IZ)V", line = 3)
    public final void method1008(int arg0, boolean arg1) {
        this.field2087.method2234(arg0 * 4 + 3);
        if (arg1) {
            method1011(-67, 0.56185025F, -1.033355F, null, -120, -14, 89, 119, 103, 67, false, null);
        }
        field2099++;
        this.field2087.method2227(-1);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(ZIII)V", line = 24)
    public final void method1009(boolean arg0, int arg1, int arg2, int arg3) {
        field2094++;
        this.field2091[this.field2093.field5569 * arg2 + arg1] = class216.method1308(this.field2091[this.field2093.field5569 * arg2 + arg1], 0x1 << arg3);
        if (!arg0) {
            method1011(-4, -0.5829857F, -1.4468929F, null, 61, -63, -6, -29, 115, -98, true, null);
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(FZIII)V", line = 35)
    public final void method1010(float arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field2103++;
        if (this.field2096 != -1) {
            class91 var6 = this.field2088.field6364.method389(9559, this.field2096);
            int var7 = var6.field1156 & 0xFF;
            if (var7 != 0 && var6.field1149 != 4) {
                int var8;
                if (arg4 < 0) {
                    var8 = 0;
                } else if (arg4 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg4 * 131586;
                }
                if (var7 == 256) {
                    arg2 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg2 = ((arg2 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg2 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field1166 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg2 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg2 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg2 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg2 = ((var12 & 0xB800FF00) << 8) + (var14 >> 8) + (var13 & 0xFF00);
            }
        }
        if (arg0 != 1.0F) {
            int var15 = (arg2 & 0xFF1803) >> 16;
            int var16 = arg2 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg0);
            int var18 = arg2 & 0xFF;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var19 = (int) ((float) var16 * arg0);
            int var20 = (int) ((float) var18 * arg0);
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
            arg2 = var20 | var19 << 8 | var17 << 16;
        }
        if (arg1) {
            this.method1008(-128, false);
        }
        this.field2087.method2234(arg3 * 4);
        this.field2087.method2227((byte) (arg2 >> 16));
        this.field2087.method2227((byte) (arg2 >> 8));
        this.field2087.method2227((byte) arg2);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IFF[FIIIIIIZ[F)V", line = 145)
    public static final void method1011(int arg0, float arg1, float arg2, float[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, float[] arg11) {
        int var12 = arg8 - arg4;
        int var13 = arg7 - arg5;
        int var14 = arg0 - arg6;
        if (arg10) {
            return;
        }
        field2101++;
        float var15 = arg3[2] * (float) var13 + arg3[1] * (float) var14 + arg3[0] * (float) var12;
        float var16 = arg3[5] * (float) var13 + arg3[4] * (float) var14 + arg3[3] * (float) var12;
        float var17 = arg3[8] * (float) var13 + arg3[6] * (float) var12 + arg3[7] * (float) var14;
        float var18 = (float) Math.atan2((double) var15, (double) var17) / 6.2831855F + 0.5F;
        if (arg1 != 1.0F) {
            var18 = arg1 * var18;
        }
        float var19 = var16 + arg2 + 0.5F;
        if (arg9 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg9 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg9 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        arg11[1] = var19;
        arg11[0] = var18;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(II)V", line = 199)
    public final void method1012(int arg0, int arg1) {
        field2089++;
        this.field2087.method2223();
        class355 var3 = this.field2088.method2144(4, arg0 * 4, this.field2100, false, (byte) -91);
        this.field2090 = new class88(var3, 5121, 4, 0);
        this.field2087 = null;
        if (arg1 != 10944) {
            this.method1010(1.1735226F, true, 10, 85, 40);
        }
        this.field2100 = null;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(II[I)V", line = 222)
    public final void method1013(int arg0, int arg1, int[] arg2) {
        field2102++;
        int var4 = 0;
        class552 var5 = this.field2088.field5044;
        var5.field2354 = 0;
        if (this.field2088.field5025) {
            for (int var6 = 0; var6 < arg1; var6++) {
                int var7 = arg2[var6];
                int var8 = this.field2091[var7];
                short[] var9 = this.field2093.field983[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var9.length > var11) {
                        if ((0x1 << var10++ & var8) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method1157(var9[var11++] & 0xFFFF, (byte) 120);
                            var5.method1157(var9[var11++] & 0xFFFF, (byte) 121);
                            var4++;
                            var4++;
                            var5.method1157(var9[var11++] & 0xFFFF, (byte) 124);
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg1; var12++) {
                int var13 = arg2[var12];
                short[] var14 = this.field2093.field983[var13];
                int var15 = this.field2091[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var14.length) {
                        if ((var15 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method1098(var14[var17++] & 0xFFFF, (byte) -7);
                            var5.method1098(var14[var17++] & 0xFFFF, (byte) -72);
                            var4++;
                            var4++;
                            var5.method1098(var14[var17++] & 0xFFFF, (byte) -83);
                        }
                    }
                }
            }
        }
        if (var4 > 0) {
            this.field2097.method2406(5123, -13184, var5.field2325, var5.field2354);
            this.field2088.method2181(this.field2093.field1021, this.field2093.field1015, this.field2090, this.field2093.field1011, 15063);
            this.field2088.method2137(-26379, this.field2096, (this.field2093.field978 & 0x8) != 0, (this.field2093.field978 & 0x7) != 0);
            if (this.field2088.field5048) {
                this.field2088.method78(Integer.MAX_VALUE, this.field2104, this.field2095, this.field2092);
            }
            OpenGL.glMatrixMode(5890);
            OpenGL.glPushMatrix();
            OpenGL.glScalef(1.0F / this.field2086, 1.0F / this.field2086, 1.0F);
            OpenGL.glMatrixMode(5888);
            this.field2088.method2181(this.field2093.field1021, this.field2093.field1015, this.field2090, this.field2093.field1011, 15063);
            this.field2088.method2183(var4, 0, -30308, 4, this.field2097);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
        if (arg0 >= -105) {
            this.field2092 = 7;
        }
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(IZ)V", line = 348)
    public final void method1014(int arg0, boolean arg1) {
        if (!arg1) {
            this.field2100 = this.field2088.field4955.method2221(arg0 * 4, true);
            field2098++;
            this.field2087 = new Stream(this.field2100);
        }
    }

    @OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Lqh;IIIII)V", line = 362)
    public class164(class74 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2093 = arg0;
        this.field2091 = new int[this.field2093.field5569 * this.field2093.field5562];
        this.field2092 = arg5;
        this.field2104 = arg3;
        this.field2095 = arg4;
        this.field2088 = this.field2093.field984;
        this.field2086 = arg2;
        this.field2096 = arg1;
        this.field2097 = new class584(this.field2088, 5123, null, 1);
    }
}
