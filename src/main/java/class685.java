import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class685 extends class159 {

    @OriginalMember(owner = "client!sv", name = "G", descriptor = "Lbja;")
    private class34 field9172;

    @OriginalMember(owner = "client!sv", name = "y", descriptor = "Llf;")
    private class250 field9164;

    @OriginalMember(owner = "client!sv", name = "x", descriptor = "I")
    public int field9163;

    @OriginalMember(owner = "client!sv", name = "k", descriptor = "I")
    public int field9150;

    @OriginalMember(owner = "client!sv", name = "t", descriptor = "[I")
    private int[] field9159;

    @OriginalMember(owner = "client!sv", name = "o", descriptor = "F")
    public float field9154;

    @OriginalMember(owner = "client!sv", name = "H", descriptor = "I")
    public int field9173;

    @OriginalMember(owner = "client!sv", name = "v", descriptor = "I")
    public int field9161;

    @OriginalMember(owner = "client!sv", name = "C", descriptor = "Lts;")
    private class561 field9168;

    @OriginalMember(owner = "client!sv", name = "w", descriptor = "I")
    public static int field9162 = 0;

    @OriginalMember(owner = "client!sv", name = "z", descriptor = "Lqj;")
    public static class535 field9165 = new class535(10);

    @OriginalMember(owner = "client!sv", name = "l", descriptor = "I")
    public static int field9151;

    @OriginalMember(owner = "client!sv", name = "m", descriptor = "I")
    public static int field9152;

    @OriginalMember(owner = "client!sv", name = "p", descriptor = "I")
    public static int field9155;

    @OriginalMember(owner = "client!sv", name = "s", descriptor = "I")
    public static int field9158;

    @OriginalMember(owner = "client!sv", name = "u", descriptor = "I")
    public static int field9160;

    @OriginalMember(owner = "client!sv", name = "A", descriptor = "I")
    public static int field9166;

    @OriginalMember(owner = "client!sv", name = "B", descriptor = "I")
    public static int field9167;

    @OriginalMember(owner = "client!sv", name = "D", descriptor = "I")
    public static int field9169;

    @OriginalMember(owner = "client!sv", name = "E", descriptor = "I")
    public static int field9170;

    @OriginalMember(owner = "client!sv", name = "J", descriptor = "I")
    public static int field9175;

    @OriginalMember(owner = "client!sv", name = "K", descriptor = "I")
    public static int field9176;

    @OriginalMember(owner = "client!sv", name = "L", descriptor = "I")
    public static int field9177;

    @OriginalMember(owner = "client!sv", name = "n", descriptor = "Lal;")
    public static class109 field9153;

    @OriginalMember(owner = "client!sv", name = "q", descriptor = "Lut;")
    private class135 field9156;

    @OriginalMember(owner = "client!sv", name = "F", descriptor = "Lha;")
    public static class66 field9171;

    @OriginalMember(owner = "client!sv", name = "I", descriptor = "Ljaclib/memory/Stream;")
    private Stream field9174;

    @OriginalMember(owner = "client!sv", name = "r", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field9157;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method3752(String arg0, int arg1, int arg2) {
        class66.field911++;
        field9155++;
        class43 var3 = class492.method2903(class91.field1283, 0, class73.field983);
        var3.field457.method1725(class525.method3045(91, arg0) + 1, 90);
        if (arg2 >= -100) {
            field9165 = null;
        }
        var3.field457.method1725(arg1, 44);
        var3.field457.method1678(arg0, (byte) 95);
        class409.method2457((byte) -100, var3);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)V")
    public final void method3753(int arg0, int arg1) {
        field9152++;
        this.field9174.method3797();
        if (arg0 != 10) {
            method3757(-107, -125, 68);
        }
        class615 var3 = this.field9164.method1619(arg1 * 4, this.field9157, 4, false, (byte) -49);
        this.field9156 = new class135(var3, 5121, 4, 0);
        this.field9157 = null;
        this.field9174 = null;
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(II)V")
    public final void method3754(int arg0, int arg1) {
        this.field9174.method3802(arg0 * 4 + 3);
        field9151++;
        if (arg1 <= 102) {
            field9171 = null;
        }
        this.field9174.method3799(-1);
    }

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "(II)V")
    public final void method3755(int arg0, int arg1) {
        if (arg1 != 14285) {
            this.field9174 = null;
        }
        this.field9157 = this.field9164.field3518.method3794(arg0 * 4, true);
        field9158++;
        this.field9174 = new Stream(this.field9157);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIB)V")
    public final void method3756(int arg0, int arg1, int arg2, byte arg3) {
        field9167++;
        this.field9159[this.field9172.field4174 * arg1 + arg0] = class670.method3699(this.field9159[this.field9172.field4174 * arg1 + arg0], 0x1 << arg2);
        if (arg3 < 44) {
            this.field9168 = null;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(III)V")
    public static final void method3757(int arg0, int arg1, int arg2) {
        field9170++;
        if (arg0 != -5975) {
            field9153 = null;
        }
        if (class598.field8136 != arg1) {
            class693.field9221 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class693.field9221[var3] = (var3 << 12) / arg1;
            }
            class598.field8136 = arg1;
            class412.field5896 = arg1 - 1;
            class328.field4668 = arg1 * 32;
        }
        if (class561.field7687 == arg2) {
            return;
        }
        if (class598.field8136 == arg2) {
            class456.field6536 = class693.field9221;
        } else {
            class456.field6536 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class456.field6536[var4] = (var4 << 12) / arg2;
            }
        }
        class698.field9254 = arg2 - 1;
        class561.field7687 = arg2;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)V")
    public static void method3758(byte arg0) {
        field9165 = null;
        field9153 = null;
        field9171 = null;
        if (arg0 >= -44) {
            method3759(true, 47, 73, null, null);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZIILjava/lang/String;Ljava/lang/String;)V")
    public static final void method3759(boolean arg0, int arg1, int arg2, String arg3, String arg4) {
        field9169++;
        class43 var5 = class711.method3943((byte) 17);
        var5.field457.method1725(class377.field5501.field5208, arg2 ^ 0xFFFFA6B2);
        var5.field457.method1733(0, -32466);
        int var6 = var5.field457.field3725;
        var5.field457.method1733(645, -32466);
        int[] var7 = class577.method3271(-11416, var5);
        int var8 = var5.field457.field3725;
        var5.field457.method1678(arg3, (byte) 35);
        var5.field457.method1733(class416.field6007, -32466);
        var5.field457.method1678(arg4, (byte) 108);
        var5.field457.method1670(46, class786.field10799);
        var5.field457.method1725(class55.field647, arg2 + 22903);
        if (arg2 != -22845) {
            method3757(-69, -116, 17);
        }
        var5.field457.method1725(class426.field6204.field3879, 88);
        class139.method962(var5.field457, 24);
        String var9 = class628.field8500;
        var5.field457.method1725(var9 == null ? 0 : 1, 113);
        if (var9 != null) {
            var5.field457.method1678(var9, (byte) 118);
        }
        var5.field457.method1725(arg1, 106);
        var5.field457.method1725(arg0 ? 1 : 0, 27);
        var5.field457.field3725 += 7;
        var5.field457.method1717(var5.field457.field3725, arg2 ^ 0xFFFF9826, var7, var8);
        var5.field457.method1700(var5.field457.field3725 - var6, 68);
        class409.method2457((byte) -100, var5);
        class23.field232 = 0;
        class353.field5128 = 0;
        class597.field8132 = 1;
        class537.field7446 = -3;
        if (arg1 < 13) {
            class643.field8660 = true;
            class351.method2242((byte) 65);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "([III)V")
    public final void method3760(int[] arg0, int arg1, int arg2) {
        field9176++;
        int var4 = 0;
        class453 var5 = this.field9164.field3623;
        var5.field3725 = 0;
        if (arg1 <= 2) {
            this.method3754(82, 69);
        }
        if (this.field9164.field3561) {
            for (int var12 = 0; var12 < arg2; var12++) {
                int var13 = arg0[var12];
                int var14 = this.field9159[var13];
                short[] var15 = this.field9172.field326[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var15.length) {
                        if ((var14 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method1733(var15[var17++] & 0xFFFF, -32466);
                            var4++;
                            var5.method1733(var15[var17++] & 0xFFFF, -32466);
                            var4++;
                            var5.method1733(var15[var17++] & 0xFFFF, -32466);
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg2; var6++) {
                int var7 = arg0[var6];
                short[] var8 = this.field9172.field326[var7];
                int var9 = this.field9159[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var8.length) {
                        if ((var9 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var5.method1719(125, var8[var11++] & 0xFFFF);
                            var4++;
                            var5.method1719(125, var8[var11++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method1719(126, var8[var11++] & 0xFFFF);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field9168.method1762(var5.field3725, var5.field3789, (byte) 112, 5123);
        this.field9164.method1634(this.field9172.field362, this.field9172.field366, this.field9156, this.field9172.field361, (byte) 11);
        this.field9164.method1608(this.field9150, (this.field9172.field349 & 0x8) != 0, 0, (this.field9172.field349 & 0x7) != 0);
        if (this.field9164.field3638) {
            this.field9164.method456(Integer.MAX_VALUE, this.field9161, this.field9173, this.field9163);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field9154, 1.0F / this.field9154, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field9164.method1634(this.field9172.field362, this.field9172.field366, this.field9156, this.field9172.field361, (byte) 11);
        this.field9164.method1568(false, 0, 4, var4, this.field9168);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IZ)V")
    public static final void method3761(int arg0, boolean arg1) {
        if (class289.field4115 == 0) {
            class311.field4406.method400((byte) 63, arg0);
        } else {
            class460.field6563 = arg0;
        }
        field9160++;
        if (!arg1) {
            method3757(-82, -45, -76);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Ldt;I)Lbd;")
    public static final class68 method3762(class254 arg0, int arg1) {
        field9175++;
        class333 var2 = class206.method1349(arg0, 7402);
        int var3 = arg0.method1728((byte) 5);
        int var4 = arg0.method1728((byte) 22);
        int var5 = arg0.method1728((byte) 14);
        int var6 = arg0.method1728((byte) 111);
        int var7 = arg0.method1728((byte) 27);
        if (arg1 != 1) {
            method3762(null, 64);
        }
        int var8 = arg0.method1728((byte) 16);
        return new class68(var2.field4711, var2.field4715, var2.field4713, var2.field4709, var2.field4708, var2.field4710, var2.field4712, var2.field4706, var2.field4707, var3, var4, var5, var6, var7, var8);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZFIII)V")
    public final void method3763(boolean arg0, float arg1, int arg2, int arg3, int arg4) {
        if (this.field9150 != -1) {
            class577 var6 = this.field9164.field913.method1114(this.field9150, -98);
            int var7 = var6.field7865 & 0xFF;
            if (var7 != 0 && var6.field7855 != 4) {
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
                    arg2 = ((arg2 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg2 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field7857 & 0xFF;
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
                arg2 = ((var12 & 0xB800FF00) << 8) - (-(var13 & 0xFF00) - (var14 >> 8));
            }
        }
        field9166++;
        if (arg1 != 1.0F) {
            int var15 = (arg2 & 0xFF5DC1) >> 16;
            int var16 = arg2 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg1);
            int var18 = arg2 & 0xFF;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var19 = (int) ((float) var16 * arg1);
            int var20 = (int) ((float) var18 * arg1);
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
        this.field9174.method3802(arg3 * 4);
        if (arg0) {
            this.field9174.method3799((byte) (arg2 >> 16));
            this.field9174.method3799((byte) (arg2 >> 8));
            this.field9174.method3799((byte) arg2);
        }
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lbja;IIIII)V")
    public class685(class34 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field9172 = arg0;
        this.field9164 = this.field9172.field322;
        this.field9163 = arg5;
        this.field9150 = arg1;
        this.field9159 = new int[this.field9172.field4174 * this.field9172.field4173];
        this.field9154 = arg2;
        this.field9173 = arg4;
        this.field9161 = arg3;
        this.field9168 = new class561(this.field9164, 5123, null, 1);
    }
}
