import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class273 extends class115 {

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "Lne;")
    private class138 field4072;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    public int field4069;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
    public int field4070;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "[I")
    private int[] field4065;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "F")
    public float field4067;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
    public int field4071;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "Lvd;")
    private class258 field4076;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public int field4064;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "Lev;")
    private class448 field4066;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "Z")
    public static boolean field4068 = true;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "Lft;")
    private class426 field4079;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field4073;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "Ljaggl/memory/NativeStream;")
    private NativeStream field4080;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZ)V", line = 3)
    public final void method1699(int arg0, boolean arg1) {
        if (!arg1) {
            this.method1704(36, 65);
        }
        this.field4073 = this.field4076.field3700.method2850(arg0 * 4);
        field4081++;
        this.field4080 = new NativeStream(this.field4073);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIFI)V", line = 17)
    public final void method1700(int arg0, int arg1, int arg2, float arg3, int arg4) {
        field4074++;
        if (this.field4071 != -1) {
            class161 var6 = this.field4076.field101.method1480(this.field4071, 14270);
            int var7 = var6.field2419 & 0xFF;
            if (var7 != 0 && var6.field2412 != 4) {
                int var8;
                if (arg2 < 0) {
                    var8 = 0;
                } else if (arg2 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg2 * 131586;
                }
                if (var7 == 256) {
                    arg1 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg1 = ((arg1 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg1 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field2404 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg1 >> 16 & 0xFF) * var11;
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
                arg1 = (var14 >> 8) + ((var12 << 8 & 0xFF0070) + (var13 & 0xFF00));
            }
        }
        if (arg0 != -256) {
            return;
        }
        this.field4080.method2856(arg4 * 4);
        if (arg3 != 1.0F) {
            int var15 = (arg1 & 0xFFDC77) >> 16;
            int var16 = (arg1 & 0xFFEB) >> 8;
            int var17 = (int) ((float) var15 * arg3);
            int var18 = arg1 & 0xFF;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var19 = (int) ((float) var16 * arg3);
            int var20 = (int) ((float) var18 * arg3);
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
            arg1 = var20 | var17 << 16 | var19 << 8;
        }
        this.field4080.method2852((byte) (arg1 >> 16));
        this.field4080.method2852((byte) (arg1 >> 8));
        this.field4080.method2852((byte) arg1);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(IZ)V", line = 126)
    public final void method1701(int arg0, boolean arg1) {
        this.field4080.method2855();
        field4077++;
        class246 var3 = this.field4076.method1558(this.field4073, arg1, arg0 * 4, 4, 8960);
        this.field4079 = new class426(var3, 5121, 4, 0);
        this.field4080 = null;
        this.field4073 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;BIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", line = 156)
    public static final void method1702(String arg0, byte arg1, int arg2, int arg3, String arg4, int arg5, String arg6, String arg7) {
        for (int var8 = 99; var8 > 0; var8--) {
            class283.field4271[var8] = class283.field4271[var8 - 1];
            class88.field1379[var8] = class88.field1379[var8 - 1];
            class93.field1446[var8] = class93.field1446[var8 - 1];
            class125.field1893[var8] = class125.field1893[var8 - 1];
            class330.field5142[var8] = class330.field5142[var8 - 1];
            class187.field2748[var8] = class187.field2748[var8 - 1];
            class113.field1721[var8] = class113.field1721[var8 - 1];
        }
        field4075++;
        class283.field4271[0] = arg2;
        class93.field1446[0] = arg7;
        int var9 = -24 % ((-arg1 - 14) / 55);
        class88.field1379[0] = arg3;
        class125.field1893[0] = arg0;
        class330.field5142[0] = arg4;
        class187.field2748[0] = arg6;
        class306.field4572 = class264.field3939;
        class113.field1721[0] = arg5;
        class159.field2396++;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II[I)V", line = 190)
    public final void method1703(int arg0, int arg1, int[] arg2) {
        field4063++;
        int var4 = 0;
        if (arg1 != 983793672) {
            method1702(null, (byte) 9, 113, 92, null, 85, null, null);
        }
        class299 var5 = this.field4076.field3733;
        var5.field6830 = 0;
        if (this.field4076.field3821) {
            for (int var12 = 0; var12 < arg0; var12++) {
                int var13 = arg2[var12];
                int var14 = this.field4065[var13];
                short[] var15 = this.field4072.field2088[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var15.length > var17) {
                        if ((var14 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method2777((byte) 74, var15[var17++] & 0xFFFF);
                            var4++;
                            var5.method2777((byte) 74, var15[var17++] & 0xFFFF);
                            var4++;
                            var5.method2777((byte) 74, var15[var17++] & 0xFFFF);
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0; var6++) {
                int var7 = arg2[var6];
                short[] var8 = this.field4072.field2088[var7];
                int var9 = this.field4065[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var8.length) {
                        if ((var9 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method2760(true, var8[var11++] & 0xFFFF);
                            var5.method2760(true, var8[var11++] & 0xFFFF);
                            var4++;
                            var5.method2760(true, var8[var11++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field4066.method1201((byte) -102, 5123, var5.field6830, var5.field6868);
        this.field4076.method1597(this.field4072.field2093, this.field4079, -1, this.field4072.field2098, this.field4072.field2095);
        this.field4076.method1539((this.field4072.field2068 & 0x7) != 0, this.field4071, 100, (this.field4072.field2068 & 0x8) != 0);
        if (this.field4076.field3767) {
            this.field4076.method140(Integer.MAX_VALUE, this.field4069, this.field4070, this.field4064);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field4067, 1.0F / this.field4067, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field4076.method1597(this.field4072.field2093, this.field4079, arg1 - 983793673, this.field4072.field2098, this.field4072.field2095);
        this.field4076.method1547(23988, 4, this.field4066, 0, var4);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V", line = 314)
    public final void method1704(int arg0, int arg1) {
        field4078++;
        this.field4080.method2856(arg1 * 4 + 3);
        this.field4080.method2852(-1);
        if (arg0 != 30626) {
            method1702(null, (byte) 66, 40, -50, null, 75, null, null);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)V", line = 327)
    public final void method1705(int arg0, int arg1, int arg2, int arg3) {
        this.field4065[this.field4072.field5198 * arg3 + arg2] = class390.method2340(this.field4065[this.field4072.field5198 * arg3 + arg2], 0x1 << arg1);
        field4062++;
        if (arg0 != -11255) {
            this.method1699(-127, false);
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lne;IIIII)V", line = 339)
    public class273(class138 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4072 = arg0;
        this.field4069 = arg3;
        this.field4070 = arg4;
        this.field4065 = new int[this.field4072.field5200 * this.field4072.field5198];
        this.field4067 = arg2;
        this.field4071 = arg1;
        this.field4076 = this.field4072.field2084;
        this.field4064 = arg5;
        this.field4066 = new class448(this.field4076, 5123, null, 1);
    }
}
