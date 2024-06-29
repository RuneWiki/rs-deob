import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class108 extends class513 {

    @OriginalMember(owner = "client!ut", name = "s", descriptor = "Lsm;")
    private class257 field1405;

    @OriginalMember(owner = "client!ut", name = "k", descriptor = "I")
    public int field1397;

    @OriginalMember(owner = "client!ut", name = "E", descriptor = "[I")
    private int[] field1417;

    @OriginalMember(owner = "client!ut", name = "p", descriptor = "I")
    public int field1402;

    @OriginalMember(owner = "client!ut", name = "q", descriptor = "F")
    public float field1403;

    @OriginalMember(owner = "client!ut", name = "B", descriptor = "Lkga;")
    private class506 field1414;

    @OriginalMember(owner = "client!ut", name = "n", descriptor = "I")
    public int field1400;

    @OriginalMember(owner = "client!ut", name = "r", descriptor = "I")
    public int field1404;

    @OriginalMember(owner = "client!ut", name = "y", descriptor = "Ltf;")
    private class267 field1411;

    @OriginalMember(owner = "client!ut", name = "C", descriptor = "I")
    public static int field1415 = 0;

    @OriginalMember(owner = "client!ut", name = "w", descriptor = "Lwo;")
    public static class690 field1409 = new class690(24, 8);

    @OriginalMember(owner = "client!ut", name = "l", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!ut", name = "m", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!ut", name = "o", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!ut", name = "u", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!ut", name = "v", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!ut", name = "x", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!ut", name = "z", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!ut", name = "A", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!ut", name = "F", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!ut", name = "D", descriptor = "Lrba;")
    private class399 field1416;

    @OriginalMember(owner = "client!ut", name = "t", descriptor = "Ljaclib/memory/Stream;")
    private Stream field1406;

    @OriginalMember(owner = "client!ut", name = "j", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field1396;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V", line = 3)
    public static void method783(int arg0) {
        if (arg0 != -29727) {
            method783(-85);
        }
        field1409 = null;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(BI)V", line = 16)
    public final void method784(byte arg0, int arg1) {
        field1407++;
        this.field1406.method3574(arg1 * 4 + 3);
        if (arg0 != 63) {
            this.method786(-77, -33, false, 0.35304248F, 43);
        }
        this.field1406.method3576(-1);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIII)V", line = 29)
    public final void method785(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -1) {
            this.method788(-92, null, 124);
        }
        this.field1417[this.field1405.field702 * arg1 + arg2] = class242.method1474(this.field1417[this.field1405.field702 * arg1 + arg2], 0x1 << arg0);
        field1418++;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIZFI)V", line = 43)
    public final void method786(int arg0, int arg1, boolean arg2, float arg3, int arg4) {
        if (!arg2) {
            field1399 = -64;
        }
        field1410++;
        if (this.field1400 != -1) {
            class352 var6 = this.field1414.field2023.method397(this.field1400, (byte) 18);
            int var7 = var6.field4703 & 0xFF;
            if (var7 != 0 && var6.field4707 != 4) {
                int var8;
                if (arg0 < 0) {
                    var8 = 0;
                } else if (arg0 <= 127) {
                    var8 = arg0 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg4 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg4 = ((var8 & 0xFF00FF) * var7 + ((arg4 & 0xFF00FF) * var10) & 0xFF00FF00) + ((arg4 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field4704 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg4 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg4 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg4 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg4 = (var14 >> 8) + ((var12 << 8 & 0xFF0069) + (var13 & 0xFF00));
            }
        }
        this.field1406.method3574(arg1 * 4);
        if (arg3 != 1.0F) {
            int var15 = (arg4 & 0xFFBB76) >> 16;
            int var16 = arg4 >> 8 & 0xFF;
            int var17 = arg4 & 0xFF;
            int var18 = (int) ((float) var15 * arg3);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg3);
            int var20 = (int) ((float) var17 * arg3);
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
            arg4 = var19 << 8 | var18 << 16 | var20;
        }
        this.field1406.method3576((byte) (arg4 >> 16));
        this.field1406.method3576((byte) (arg4 >> 8));
        this.field1406.method3576((byte) arg4);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lr;B)V", line = 152)
    public static final void method787(class165 arg0, byte arg1) {
        field1398++;
        if (class420.field5949.method1142(-22382) == 0) {
            return;
        }
        if (class375.field5039 == 0) {
            for (class511 var4 = (class511) class420.field5949.method1132((byte) -93); var4 != null; var4 = (class511) class420.field5949.method1134(8446)) {
                class65.field1021.method185(arg0, var4.field7469, var4.field7474, var4.field7472, var4.field7468, (byte) -74, var4.field7467, false, var4.field7471 ? class206.field2472.field8824 : null, arg0, false, class242.field3330);
                var4.method3045(true);
            }
            class100.method747(false);
        } else {
            if (class621.field8893 == null) {
                Canvas var2 = new Canvas();
                var2.setSize(36, 32);
                class621.field8893 = class165.method1040(0, class206.field2483, -4, var2, 0, class561.field8099);
                class554.field8037 = class621.field8893.method258(class419.method2530(class420.field5953, class336.field4467, 0, -34), class495.method2877(class692.field9847, class336.field4467, 0), true);
            }
            for (class511 var3 = (class511) class420.field5949.method1132((byte) -126); var3 != null; var3 = (class511) class420.field5949.method1134(8446)) {
                class65.field1021.method185(arg0, var3.field7469, var3.field7474, var3.field7472, var3.field7468, (byte) -74, var3.field7467, false, var3.field7471 ? class206.field2472.field8824 : null, class621.field8893, false, class554.field8037);
                var3.method3045(true);
            }
        }
        if (arg1 != 5) {
            method790((byte) 87, 106, -86);
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I[II)V", line = 204)
    public final void method788(int arg0, int[] arg1, int arg2) {
        field1401++;
        int var4 = 0;
        class226 var5 = this.field1414.field7352;
        var5.field5195 = 0;
        if (this.field1414.field7353) {
            for (int var6 = 0; var6 < arg2; var6++) {
                int var7 = arg1[var6];
                short[] var8 = this.field1405.field3486[var7];
                int var9 = this.field1417[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var8.length > var11) {
                        if ((0x1 << var10++ & var9) == 0) {
                            var11 += 3;
                        } else {
                            var5.method2261((byte) 51, var8[var11++] & 0xFFFF);
                            var4++;
                            var5.method2261((byte) 70, var8[var11++] & 0xFFFF);
                            var4++;
                            var5.method2261((byte) 87, var8[var11++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg2; var12++) {
                int var13 = arg1[var12];
                short[] var14 = this.field1405.field3486[var13];
                int var15 = this.field1417[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var14.length > var17) {
                        if ((0x1 << var16++ & var15) == 0) {
                            var17 += 3;
                        } else {
                            var5.method2236(var14[var17++] & 0xFFFF, 95);
                            var4++;
                            var4++;
                            var5.method2236(var14[var17++] & 0xFFFF, 52);
                            var5.method2236(var14[var17++] & 0xFFFF, 117);
                            var4++;
                        }
                    }
                }
            }
        }
        if (~var4 >= arg0) {
            return;
        }
        this.field1411.method938(var5.field5205, 5123, 32290, var5.field5195);
        this.field1414.method2960(this.field1405.field3523, this.field1405.field3526, 0, this.field1405.field3519, this.field1416);
        this.field1414.method3008((this.field1405.field3516 & 0x7) != 0, this.field1400, (this.field1405.field3516 & 0x8) != 0, (byte) -97);
        if (this.field1414.field7377) {
            this.field1414.method261(Integer.MAX_VALUE, this.field1402, this.field1404, this.field1397);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field1403, 1.0F / this.field1403, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field1414.method2960(this.field1405.field3523, this.field1405.field3526, 0, this.field1405.field3519, this.field1416);
        this.field1414.method2984(var4, 0, 4, this.field1411, 512);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)V", line = 328)
    public final void method789(int arg0, int arg1) {
        field1408++;
        this.field1396 = this.field1414.field7262.method3569(arg0 * 4, true);
        if (arg1 != 0) {
            this.method788(-90, null, 4);
        }
        this.field1406 = new Stream(this.field1396);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(BII)Z", line = 342)
    public static final boolean method790(byte arg0, int arg1, int arg2) {
        field1413++;
        int var3 = -36 % ((arg0 + 68) / 41);
        return class561.method3276(arg1, arg2, -94) & class404.method2434(true, arg2, arg1);
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(BI)V", line = 361)
    public final void method791(byte arg0, int arg1) {
        if (arg0 != -13) {
            this.method788(-80, null, 6);
        }
        this.field1406.method3578();
        field1412++;
        class458 var3 = this.field1414.method2934(arg1 * 4, 4, this.field1396, false, true);
        this.field1416 = new class399(var3, 5121, 4, 0);
        this.field1406 = null;
        this.field1396 = null;
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lsm;IIIII)V", line = 378)
    public class108(class257 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1405 = arg0;
        this.field1397 = arg5;
        this.field1417 = new int[this.field1405.field706 * this.field1405.field702];
        this.field1402 = arg3;
        this.field1403 = arg2;
        this.field1414 = this.field1405.field3502;
        this.field1400 = arg1;
        this.field1404 = arg4;
        this.field1411 = new class267(this.field1414, 5123, null, 1);
    }
}
