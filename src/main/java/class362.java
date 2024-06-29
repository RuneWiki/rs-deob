import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class362 extends class42 {

    @OriginalMember(owner = "client!um", name = "E", descriptor = "Lui;")
    private class151 field4897;

    @OriginalMember(owner = "client!um", name = "s", descriptor = "I")
    public int field4885;

    @OriginalMember(owner = "client!um", name = "I", descriptor = "I")
    public int field4901;

    @OriginalMember(owner = "client!um", name = "B", descriptor = "[I")
    private int[] field4894;

    @OriginalMember(owner = "client!um", name = "u", descriptor = "Lbo;")
    private class511 field4887;

    @OriginalMember(owner = "client!um", name = "C", descriptor = "F")
    public float field4895;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "I")
    public int field4881;

    @OriginalMember(owner = "client!um", name = "y", descriptor = "I")
    public int field4891;

    @OriginalMember(owner = "client!um", name = "v", descriptor = "Lhl;")
    private class366 field4888;

    @OriginalMember(owner = "client!um", name = "q", descriptor = "Lrb;")
    public static class234 field4883 = new class234("runescape", 0);

    @OriginalMember(owner = "client!um", name = "D", descriptor = "Lvj;")
    public static class304 field4896 = new class304("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!um", name = "H", descriptor = "Z")
    public static boolean field4900 = false;

    @OriginalMember(owner = "client!um", name = "p", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!um", name = "r", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!um", name = "w", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!um", name = "x", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!um", name = "z", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!um", name = "A", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!um", name = "G", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!um", name = "J", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!um", name = "t", descriptor = "Lgs;")
    private class34 field4886;

    @OriginalMember(owner = "client!um", name = "F", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field4898;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "Ljaggl/memory/NativeStream;")
    private NativeStream field4880;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "([III)V")
    public final void method2104(int[] arg0, int arg1, int arg2) {
        if (arg1 != -128) {
            return;
        }
        field4902++;
        int var4 = 0;
        class379 var5 = class109.field1579;
        var5.field5173 = 0;
        if (this.field4887.field7493) {
            for (int var6 = 0; var6 < arg2; var6++) {
                int var7 = arg0[var6];
                int var8 = this.field4894[var7];
                short[] var9 = this.field4897.field2152[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var9.length) {
                        if ((var8 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var5.method2246(var9[var11++] & 0xFFFF, (byte) -114);
                            var4++;
                            var4++;
                            var5.method2246(var9[var11++] & 0xFFFF, (byte) -118);
                            var4++;
                            var5.method2246(var9[var11++] & 0xFFFF, (byte) -125);
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg2; var12++) {
                int var13 = arg0[var12];
                short[] var14 = this.field4897.field2152[var13];
                int var15 = this.field4894[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var14.length > var17) {
                        if ((var15 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method2215(var14[var17++] & 0xFFFF, (byte) 62);
                            var5.method2215(var14[var17++] & 0xFFFF, (byte) 20);
                            var4++;
                            var4++;
                            var5.method2215(var14[var17++] & 0xFFFF, (byte) 121);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field4888.method996(var5.field5152, arg1 - 30704, var5.field5173, 5123);
        this.field4887.method2975(this.field4897.field2178, this.field4897.field2189, this.field4897.field2180, this.field4886, -127);
        this.field4887.method2959(this.field4885, (this.field4897.field2173 & 0x8) != 0, -8, ~(this.field4897.field2173 & 0x7) != -1);
        if (this.field4887.field7451) {
            this.field4887.method540(Integer.MAX_VALUE, this.field4881, this.field4891, this.field4901);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field4895, 1.0F / this.field4895, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field4887.method2975(this.field4897.field2178, this.field4897.field2189, this.field4897.field2180, this.field4886, 68);
        this.field4887.method2971(0, var4, this.field4888, arg1 ^ 0xFFFFE24D, 4);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZZ)Z")
    public static final boolean method2105(boolean arg0, boolean arg1) {
        field4889++;
        boolean var2 = class370.field4984.method581();
        if (!arg0) {
            return true;
        } else if (arg1 == var2) {
            return true;
        } else {
            if (!arg1) {
                class370.field4984.method621();
            } else if (!class370.field4984.method587()) {
                arg1 = false;
            }
            if (arg1 == var2) {
                return false;
            } else {
                class154.field2244.field7755 = arg1;
                class154.field2244.method1852(class389.field5281, (byte) 13);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II)V")
    public final void method2106(int arg0, int arg1) {
        field4884++;
        if (arg1 >= -53) {
            method2109(-75);
        }
        this.field4880.method2524(arg0 * 4 + 3);
        this.field4880.method2528(-1);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
    public static final void method2107(int arg0) {
        field4892++;
        class412.field5693 = 0;
        class415.field5733.method1670((byte) -104);
        if (arg0 == 4) {
            class379.field5189 = false;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIF)V")
    public final void method2108(int arg0, int arg1, int arg2, int arg3, float arg4) {
        if (this.field4885 != -1) {
            class278 var6 = this.field4887.field2375.method677(2459, this.field4885);
            int var7 = var6.field3649 & 0xFF;
            if (var7 != 0 && var6.field3651 != 4) {
                int var8;
                if (arg0 < 0) {
                    var8 = 0;
                } else if (arg0 <= 127) {
                    var8 = arg0 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg2 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg2 = ((arg2 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg2 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field3640 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg2 >> 16 & 0xFF) * var11;
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
                arg2 = (var14 >> 8) + (var12 << 8 & 0xFF000F) + (var13 & 0xFF00);
            }
        }
        if (arg3 != 65280) {
            this.method2108(-68, -109, -20, -124, 1.2650636F);
        }
        field4899++;
        this.field4880.method2524(arg1 * 4);
        if (arg4 != 1.0F) {
            int var15 = (arg2 & 0xFF54C4) >> 16;
            int var16 = arg2 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg4);
            int var18 = arg2 & 0xFF;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var19 = (int) ((float) var16 * arg4);
            int var20 = (int) ((float) var18 * arg4);
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
            arg2 = var19 << 8 | var17 << 16 | var20;
        }
        this.field4880.method2528((byte) (arg2 >> 16));
        this.field4880.method2528((byte) (arg2 >> 8));
        this.field4880.method2528((byte) arg2);
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(I)V")
    public static void method2109(int arg0) {
        field4883 = null;
        if (arg0 != -2382) {
            method2105(false, false);
        }
        field4896 = null;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(II)V")
    public final void method2110(int arg0, int arg1) {
        field4893++;
        this.field4898 = this.field4887.field7402.method2531(arg0 * 4);
        if (arg1 == 65535) {
            this.field4880 = new NativeStream(this.field4898);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIB)V")
    public final void method2111(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = 71 % ((65 - arg3) / 48);
        field4882++;
        this.field4894[this.field4897.field557 * arg1 + arg0] = class191.method1230(this.field4894[this.field4897.field557 * arg1 + arg0], 0x1 << arg2);
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(II)V")
    public final void method2112(int arg0, int arg1) {
        this.field4880.method2525();
        field4890++;
        class453 var3 = this.field4887.method2955(34165, arg0 * 4, false, arg1, this.field4898);
        this.field4886 = new class34(this.field4887, var3, 5121, 4, 0);
        this.field4898 = null;
        this.field4880 = null;
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lui;IIIII)V")
    public class362(class151 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4897 = arg0;
        this.field4885 = arg1;
        this.field4901 = arg5;
        this.field4894 = new int[this.field4897.field559 * this.field4897.field557];
        this.field4887 = this.field4897.field2176;
        this.field4895 = arg2;
        this.field4881 = arg3;
        this.field4891 = arg4;
        this.field4888 = new class366(this.field4887, 5123, null, 1);
    }
}
