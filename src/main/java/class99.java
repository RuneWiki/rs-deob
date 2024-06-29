import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class99 extends class430 {

    @OriginalMember(owner = "client!ct", name = "A", descriptor = "Lmt;")
    private class410 field1427;

    @OriginalMember(owner = "client!ct", name = "B", descriptor = "I")
    public int field1428;

    @OriginalMember(owner = "client!ct", name = "z", descriptor = "[I")
    private int[] field1426;

    @OriginalMember(owner = "client!ct", name = "v", descriptor = "Lkw;")
    private class346 field1422;

    @OriginalMember(owner = "client!ct", name = "C", descriptor = "F")
    public float field1429;

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "I")
    public int field1407;

    @OriginalMember(owner = "client!ct", name = "y", descriptor = "I")
    public int field1425;

    @OriginalMember(owner = "client!ct", name = "r", descriptor = "I")
    public int field1418;

    @OriginalMember(owner = "client!ct", name = "k", descriptor = "Ljs;")
    private class171 field1411;

    @OriginalMember(owner = "client!ct", name = "s", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1419 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ct", name = "E", descriptor = "[[S")
    private static short[][] field1431 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

    @OriginalMember(owner = "client!ct", name = "F", descriptor = "I")
    public static int field1432 = 1;

    @OriginalMember(owner = "client!ct", name = "H", descriptor = "[[S")
    private static short[][] field1434 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ct", name = "J", descriptor = "[[S")
    private static short[][] field1436 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ct", name = "G", descriptor = "[[[S")
    public static short[][][] field1433 = new short[][][] { field1431, field1436, field1434 };

    @OriginalMember(owner = "client!ct", name = "I", descriptor = "Llc;")
    public static class435 field1435 = new class435(41, -1);

    @OriginalMember(owner = "client!ct", name = "K", descriptor = "[Lon;")
    public static class504[] field1437 = new class504[8];

    @OriginalMember(owner = "client!ct", name = "L", descriptor = "Lmr;")
    public static class611 field1438 = new class611();

    @OriginalMember(owner = "client!ct", name = "i", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!ct", name = "j", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!ct", name = "l", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!ct", name = "m", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!ct", name = "o", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!ct", name = "q", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!ct", name = "t", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!ct", name = "u", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!ct", name = "w", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!ct", name = "x", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!ct", name = "D", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!ct", name = "p", descriptor = "Ljaa;")
    private class745 field1416;

    @OriginalMember(owner = "client!ct", name = "n", descriptor = "Ljaclib/memory/Stream;")
    private Stream field1414;

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field1408;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(III)Z", line = 6)
    public static final boolean method741(int arg0, int arg1, int arg2) {
        field1423++;
        if (arg1 < 12) {
            field1433 = null;
        }
        return class87.method688(arg2, arg0, (byte) 34) || class584.method3437(arg0, arg2, -113);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IBI)Z", line = 22)
    public static final boolean method742(int arg0, byte arg1, int arg2) {
        field1410++;
        if ((class369.method2318((byte) -109, arg0, arg2) | (arg2 & 0x10000) != 0) || class750.method4181(arg2, false, arg0)) {
            return true;
        } else {
            if (arg1 != -54) {
                field1437 = null;
            }
            return (arg0 & 0x37) == 0 && class584.method3437(arg0, arg2, arg1 ^ 0x67);
        }
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(II)V", line = 45)
    public final void method743(int arg0, int arg1) {
        field1424++;
        this.field1408 = this.field1422.field4972.method2568(arg0 * arg1, true);
        this.field1414 = new Stream(this.field1408);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIII)V", line = 54)
    public final void method744(int arg0, int arg1, int arg2, int arg3) {
        field1412++;
        this.field1426[this.field1427.field4679 * arg0 + arg2] = class430.method2658(this.field1426[this.field1427.field4679 * arg0 + arg2], arg1 << arg3);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "([III)V", line = 62)
    public final void method745(int[] arg0, int arg1, int arg2) {
        field1415++;
        int var4 = 0;
        class212 var5 = this.field1422.field5093;
        var5.field6864 = 0;
        int var6 = -43 % ((arg2 + 38) / 45);
        if (this.field1422.field5047) {
            for (int var13 = 0; var13 < arg1; var13++) {
                int var14 = arg0[var13];
                short[] var15 = this.field1427.field5844[var14];
                int var16 = this.field1426[var14];
                if (var16 != 0 && var15 != null) {
                    int var17 = 0;
                    int var18 = 0;
                    while (var15.length > var18) {
                        if ((0x1 << var17++ & var16) == 0) {
                            var18 += 3;
                        } else {
                            var4++;
                            var5.method2862(var15[var18++] & 0xFFFF, -1166933656);
                            var5.method2862(var15[var18++] & 0xFFFF, -1166933656);
                            var4++;
                            var5.method2862(var15[var18++] & 0xFFFF, -1166933656);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var7 = 0; var7 < arg1; var7++) {
                int var8 = arg0[var7];
                short[] var9 = this.field1427.field5844[var8];
                int var10 = this.field1426[var8];
                if (var10 != 0 && var9 != null) {
                    int var11 = 0;
                    int var12 = 0;
                    while (var9.length > var12) {
                        if ((0x1 << var11++ & var10) == 0) {
                            var12 += 3;
                        } else {
                            var5.method2918(var9[var12++] & 0xFFFF, (byte) 86);
                            var4++;
                            var5.method2918(var9[var12++] & 0xFFFF, (byte) 91);
                            var4++;
                            var4++;
                            var5.method2918(var9[var12++] & 0xFFFF, (byte) 101);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field1411.method821(var5.field6864, 5123, var5.field6800, (byte) -64);
        this.field1422.method2134(this.field1427.field5853, this.field1416, this.field1427.field5862, this.field1427.field5858, 32888);
        this.field1422.method2173(97, (this.field1427.field5828 & 0x8) != 0, (this.field1427.field5828 & 0x7) != 0, this.field1418);
        if (this.field1422.field5114) {
            this.field1422.method206(Integer.MAX_VALUE, this.field1428, this.field1407, this.field1425);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field1429, 1.0F / this.field1429, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field1422.method2134(this.field1427.field5853, this.field1416, this.field1427.field5862, this.field1427.field5858, 32888);
        this.field1422.method2135(4, this.field1411, 0, var4, -123);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)V", line = 185)
    public static void method746(byte arg0) {
        field1436 = null;
        field1431 = null;
        field1437 = null;
        if (arg0 >= -125) {
            field1432 = 127;
        }
        field1419 = null;
        field1434 = null;
        field1438 = null;
        field1435 = null;
        field1433 = null;
    }

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "(II)V", line = 205)
    public final void method747(int arg0, int arg1) {
        this.field1414.method2553(arg1 * 4 + 3);
        if (arg0 != 26879) {
            method746((byte) -107);
        }
        field1413++;
        this.field1414.method2555(-1);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IBFII)V", line = 221)
    public final void method748(int arg0, byte arg1, float arg2, int arg3, int arg4) {
        field1417++;
        if (this.field1418 != -1) {
            class679 var6 = this.field1422.field7881.method962(this.field1418, 2904);
            int var7 = var6.field9637 & 0xFF;
            if (var7 != 0 && var6.field9648 != 4) {
                int var8;
                if (arg4 < 0) {
                    var8 = 0;
                } else if (arg4 <= 127) {
                    var8 = arg4 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg0 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg0 = ((arg0 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg0 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field9651 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg0 >> 16 & 0xFF) * var11;
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
                arg0 = (var13 & 0xFF00) + (((var12 & 0xF500FF00) << 8) + (var14 >> 8));
            }
        }
        this.field1414.method2553(arg3 * 4);
        if (arg2 != 1.0F) {
            int var15 = (arg0 & 0xFF74FF) >> 16;
            int var16 = arg0 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg2);
            int var18 = arg0 & 0xFF;
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
            arg0 = var20 | var17 << 16 | var19 << 8;
        }
        this.field1414.method2555((byte) (arg0 >> 16));
        this.field1414.method2555((byte) (arg0 >> 8));
        if (arg1 <= -31) {
            this.field1414.method2555((byte) arg0);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IB)V", line = 333)
    public final void method749(int arg0, byte arg1) {
        field1430++;
        this.field1414.method2554();
        int var3 = 110 % ((28 - arg1) / 49);
        class52 var4 = this.field1422.method2168(4, false, (byte) 71, arg0 * 4, this.field1408);
        this.field1416 = new class745(var4, 5121, 4, 0);
        this.field1414 = null;
        this.field1408 = null;
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lmt;IIIII)V", line = 349)
    public class99(class410 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1427 = arg0;
        this.field1428 = arg3;
        this.field1426 = new int[this.field1427.field4679 * this.field1427.field4672];
        this.field1422 = this.field1427.field5819;
        this.field1429 = arg2;
        this.field1407 = arg4;
        this.field1425 = arg5;
        this.field1418 = arg1;
        this.field1411 = new class171(this.field1422, 5123, null, 1);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZII)V", line = 365)
    public static final void method750(boolean arg0, int arg1, int arg2) {
        field1421++;
        class37 var3 = class582.method3429(arg0, (byte) -106, arg2);
        if (var3 != null) {
            var3.method2656((byte) 125);
            if (arg1 < 70) {
                method741(-124, 95, 69);
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V", line = 383)
    public static final void method751(int arg0) {
        field1420++;
        class233.method1630((byte) 79, 22050, 2, class243.field3580.field7987.method1092(false) == 1);
        class375.field5435 = class405.method2460(0, class345.field4749, class95.field1383, (byte) 92, 22050);
        class726.method4056(true, class647.method3738(null, arg0 ^ 0xFFFF9C98), 512);
        class224.field3310 = class405.method2460(1, class345.field4749, class95.field1383, (byte) 50, arg0);
        class593.field8429 = new class636();
        class224.field3310.method2231((byte) 88, class593.field8429);
        class695.field9833 = new class415(22050, class132.field1821);
        class303.method1894(0);
    }
}
