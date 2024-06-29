import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class294 extends class108 {

    @OriginalMember(owner = "client!hl", name = "C", descriptor = "Lvh;")
    private class247 field4246;

    @OriginalMember(owner = "client!hl", name = "A", descriptor = "I")
    public int field4244;

    @OriginalMember(owner = "client!hl", name = "B", descriptor = "Ljj;")
    private class66 field4245;

    @OriginalMember(owner = "client!hl", name = "y", descriptor = "I")
    public int field4242;

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
    public int field4237;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "[I")
    private int[] field4234;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
    public int field4232;

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "F")
    public float field4236;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "Lrca;")
    private class34 field4228;

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "Liu;")
    public static class517 field4240 = new class517(49, 6);

    @OriginalMember(owner = "client!hl", name = "I", descriptor = "I")
    public static int field4252 = 52;

    @OriginalMember(owner = "client!hl", name = "H", descriptor = "Lmo;")
    public static class333 field4251 = new class333();

    @OriginalMember(owner = "client!hl", name = "J", descriptor = "Liu;")
    public static class517 field4253 = new class517(26, 4);

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!hl", name = "x", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!hl", name = "D", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!hl", name = "E", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "Las;")
    private class25 field4243;

    @OriginalMember(owner = "client!hl", name = "G", descriptor = "Ljaclib/memory/Stream;")
    private Stream field4250;

    @OriginalMember(owner = "client!hl", name = "F", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field4249;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 3)
    public static void method1847(int arg0) {
        field4251 = null;
        field4253 = null;
        field4240 = null;
        if (arg0 != -1) {
            method1851((byte) 103);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIII)V", line = 16)
    public final void method1848(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == -9966) {
            field4238++;
            this.field4234[this.field4246.field7541 * arg0 + arg3] = class188.method1258(this.field4234[this.field4246.field7541 * arg0 + arg3], 0x1 << arg2);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)V", line = 30)
    public final void method1849(byte arg0, int arg1) {
        this.field4250.method3246();
        field4247++;
        class423 var3 = this.field4245.method596(this.field4249, 4, false, true, arg1 * 4);
        this.field4243 = new class25(var3, 5121, 4, 0);
        this.field4250 = null;
        this.field4249 = null;
        if (arg0 != 49) {
            method1847(-24);
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(BI)V", line = 52)
    public final void method1850(byte arg0, int arg1) {
        if (arg0 <= -49) {
            this.field4249 = this.field4245.field1133.method3233(arg1 * 4, true);
            field4230++;
            this.field4250 = new Stream(this.field4249);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V", line = 66)
    public static final void method1851(byte arg0) {
        if (arg0 != -13) {
            method1847(124);
        }
        class266.field3887 = 0;
        class623.field8789 = 0;
        class537.field7496 = 0;
        class565.field8082 = 0;
        field4231++;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IB)V", line = 86)
    public final void method1852(int arg0, byte arg1) {
        this.field4250.method3241(arg0 * 4 + 3);
        field4239++;
        this.field4250.method3242(arg1);
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V", line = 96)
    public static final void method1853(int arg0) {
        field4229++;
        if (!class90.field1620) {
            return;
        }
        class549 var1 = class547.method3061(4096, class388.field5795, class293.field4224);
        if (var1 != null && var1.field7697 != null) {
            class526 var2 = new class526();
            var2.field7314 = var1.field7697;
            var2.field7315 = var1;
            class30.method277(var2);
        }
        class90.field1620 = false;
        class185.field2692 = -1;
        if (arg0 != 49) {
            method1854(-6, 0, -19, 98, null, -15L, null, 26, -66);
        }
        class68.field1296 = -1;
        if (var1 != null) {
            class412.method2497(var1, 87);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIILoh;JLpa;II)V", line = 131)
    public static final void method1854(int arg0, int arg1, int arg2, int arg3, class549 arg4, long arg5, class593 arg6, int arg7, int arg8) {
        int var10 = -64 / ((arg1 + 83) / 35);
        field4235++;
        int var11 = arg8 * arg8 + (arg7 * arg7);
        if (((long) var11) > arg5) {
            return;
        }
        int var12 = Math.min(arg4.field7678 / 2, arg4.field7776 / 2);
        if (var11 <= var12 * var12) {
            class638.method3684(arg8, arg4, false, arg7, arg6, class561.field8025[arg3], arg0, arg2);
            return;
        }
        var12 -= 10;
        int var13;
        if (class377.field5547 == 4) {
            var13 = (int) class523.field7256 & 0x3FFF;
        } else {
            var13 = (int) class523.field7256 + class495.field6941 & 0x3FFF;
        }
        int var14 = class285.field4154[var13];
        int var15 = class285.field4152[var13];
        if (class377.field5547 != 4) {
            var15 = var15 * 256 / (class353.field5042 + 256);
            var14 = var14 * 256 / (class353.field5042 + 256);
        }
        int var16 = arg7 * var14 + (arg8 * var15) >> 15;
        int var17 = arg7 * var15 - arg8 * var14 >> 15;
        double var18 = Math.atan2((double) var16, (double) var17);
        int var20 = (int) ((double) var12 * Math.sin(var18));
        int var21 = (int) (Math.cos(var18) * (double) var12);
        class172.field2496[arg3].method965((float) arg4.field7678 / 2.0F + (float) arg0 + (float) var20, (float) arg4.field7776 / 2.0F + (float) arg2 + (float) (-var21), 4096, (int) (-var18 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II[I)V", line = 182)
    public final void method1855(int arg0, int arg1, int[] arg2) {
        field4233++;
        int var4 = 0;
        class583 var5 = this.field4245.field1220;
        var5.field3913 = 0;
        if (arg0 >= -61) {
            return;
        }
        if (this.field4245.field1187) {
            for (int var6 = 0; var6 < arg1; var6++) {
                int var7 = arg2[var6];
                short[] var8 = this.field4246.field3559[var7];
                int var9 = this.field4234[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var8.length > var11) {
                        if ((0x1 << var10++ & var9) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method1699(true, var8[var11++] & 0xFFFF);
                            var5.method1699(true, var8[var11++] & 0xFFFF);
                            var4++;
                            var5.method1699(true, var8[var11++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg1; var12++) {
                int var13 = arg2[var12];
                int var14 = this.field4234[var13];
                short[] var15 = this.field4246.field3559[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var15.length) {
                        if ((0x1 << var16++ & var14) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method1713((byte) 110, var15[var17++] & 0xFFFF);
                            var4++;
                            var5.method1713((byte) -27, var15[var17++] & 0xFFFF);
                            var4++;
                            var5.method1713((byte) 2, var15[var17++] & 0xFFFF);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field4228.method310((byte) 53, 5123, var5.field3913, var5.field3952);
        this.field4245.method636(this.field4246.field3598, false, this.field4246.field3600, this.field4243, this.field4246.field3594);
        this.field4245.method588(true, (this.field4246.field3576 & 0x8) != 0, (this.field4246.field3576 & 0x7) != 0, this.field4232);
        if (this.field4245.field1238) {
            this.field4245.method572(Integer.MAX_VALUE, this.field4237, this.field4242, this.field4244);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field4236, 1.0F / this.field4236, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field4245.method636(this.field4246.field3598, false, this.field4246.field3600, this.field4243, this.field4246.field3594);
        this.field4245.method523((byte) 61, this.field4228, 4, 0, var4);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lvh;IIIII)V", line = 305)
    public class294(class247 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4246 = arg0;
        this.field4244 = arg5;
        this.field4245 = this.field4246.field3588;
        this.field4242 = arg4;
        this.field4237 = arg3;
        this.field4234 = new int[this.field4246.field7541 * this.field4246.field7539];
        this.field4232 = arg1;
        this.field4236 = arg2;
        this.field4228 = new class34(this.field4245, 5123, null, 1);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZFII)V", line = 329)
    public final void method1856(int arg0, boolean arg1, float arg2, int arg3, int arg4) {
        if (!arg1) {
            this.field4243 = null;
        }
        if (this.field4232 != -1) {
            class576 var6 = this.field4245.field2443.method2387((byte) 127, this.field4232);
            int var7 = var6.field8212 & 0xFF;
            if (var7 != 0 && var6.field8203 != 4) {
                int var8;
                if (arg0 < 0) {
                    var8 = 0;
                } else if (arg0 <= 127) {
                    var8 = arg0 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg3 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg3 = ((arg3 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg3 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field8216 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg3 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg3 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg3 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg3 = (var12 << 8 & 0xFF0030) + (var13 & 0xFF00) + (var14 >> 8);
            }
        }
        field4248++;
        if (arg2 != 1.0F) {
            int var15 = arg3 >> 16 & 0xFF;
            int var16 = (arg3 & 0xFF4F) >> 8;
            int var17 = arg3 & 0xFF;
            int var18 = (int) ((float) var15 * arg2);
            int var19 = (int) ((float) var16 * arg2);
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
            int var20 = (int) ((float) var17 * arg2);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg3 = var18 << 16 | var19 << 8 | var20;
        }
        this.field4250.method3241(arg4 * 4);
        this.field4250.method3242((byte) (arg3 >> 16));
        this.field4250.method3242((byte) (arg3 >> 8));
        this.field4250.method3242((byte) arg3);
    }
}
