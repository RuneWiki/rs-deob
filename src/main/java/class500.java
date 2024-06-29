import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import java.awt.Container;
import java.awt.Insets;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class500 extends class337 {

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    public int field6421 = 0;

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "Lrd;")
    private class574 field6430;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public int field6409;

    @OriginalMember(owner = "client!ea", name = "J", descriptor = "I")
    public int field6433;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    public int field6419;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "[I")
    private int[] field6416;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "Lgd;")
    private class696 field6425;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "F")
    public float field6420;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public int field6417;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public static int field6414 = 2;

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "Lie;")
    public static class204 field6432 = null;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field6412;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field6413;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field6415;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
    public static int field6422;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
    public static int field6424;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "I")
    public static int field6429;

    @OriginalMember(owner = "client!ea", name = "H", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "Lcq;")
    private class233 field6428;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "Ljaclib/memory/Stream;")
    private Stream field6418;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field6423;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([IZI)V", line = 3)
    public final void method2772(int[] arg0, boolean arg1, int arg2) {
        field6413++;
        class688 var4 = this.field6425.method3735((byte) -5, this.field6421 * 3);
        Buffer var5 = var4.method2014(true, true);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field6425.method3773(var5, (byte) -82);
        int var7 = 0;
        if (arg1) {
            this.method2780(67, (byte) 57);
        }
        int var8 = 32767;
        int var9 = -32768;
        if (Stream.method2528()) {
            label126: for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = arg0[var10];
                short[] var12 = this.field6430.field7288[var11];
                int var13 = this.field6416[var11];
                if (var13 != 0 && var12 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var12.length <= var15) {
                                continue label126;
                            }
                            if ((var13 & 0x1 << var14++) == 0) {
                                var15 += 3;
                            } else {
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var12[var15++] & 0xFFFF;
                                    if (var17 < var8) {
                                        var8 = var17;
                                    }
                                    var6.method2525(var17);
                                    if (var9 < var17) {
                                        var9 = var17;
                                    }
                                }
                                var7++;
                            }
                        }
                    }
                }
            }
        } else {
            label100: for (int var18 = 0; var18 < arg2; var18++) {
                int var20 = arg0[var18];
                short[] var21 = this.field6430.field7288[var20];
                int var22 = this.field6416[var20];
                if (var22 != 0 && var21 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var24 >= var21.length) {
                                continue label100;
                            }
                            if ((var22 & 0x1 << var23++) == 0) {
                                var24 += 3;
                            } else {
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var21[var24++] & 0xFFFF;
                                    var6.method2516(var26);
                                    if (var26 > var9) {
                                        var9 = var26;
                                    }
                                    if (var26 < var8) {
                                        var8 = var26;
                                    }
                                }
                                var7++;
                            }
                        }
                    }
                }
            }
        }
        var6.method2519();
        if (!var4.method2017(28359) || var7 <= 0) {
            return;
        }
        this.field6425.method3767((this.field6430.field7276 & 0x8) != 0, this.field6417, (this.field6430.field7276 & 0x7) != 0, (byte) 86);
        if (this.field6425.field9190) {
            this.field6425.method971(Integer.MAX_VALUE, this.field6433, this.field6419, this.field6409);
        }
        class588 var19 = this.field6425.method3763(1);
        var19.method3158(11663, 1.0F / this.field6420, 1.0F, 1.0F / this.field6420);
        this.field6425.method3744(74, class627.field7959);
        this.field6425.method1200((byte) -105, 1, this.field6428);
        this.field6425.method1150(this.field6430.field7296, 0);
        this.field6425.method1151(0, var9 + 1 - var8, var8, class279.field3624, false, var4, var7);
        this.field6425.method3754(false);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLjava/io/File;)[B", line = 173)
    public static final byte[] method2773(byte arg0, File arg1) {
        if (arg0 < 50) {
            return null;
        } else {
            field6426++;
            return class734.method3995(arg1, (byte) 126, (int) arg1.length());
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIILuaa;)V", line = 184)
    public static final void method2774(int arg0, int arg1, int arg2, class391 arg3) {
        class299.field3789 = arg2;
        class400.field5291 = arg0;
        if (arg1 != -26279) {
            method2775(null, -3, -40, 94, 95, -10);
        }
        field6427++;
        class559.field7107 = arg3;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Llq;IIIII)V", line = 198)
    public static final void method2775(class210 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class78.field1121 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class330.field4039) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class559.field7102 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class766 var14 = class28.field252[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class116.field1542[var11].method2060(var13, -126, var12) + class116.field1542[var11].method2060(var13, -96, var12 + 1) + class116.field1542[var11].method2060(var13 + 1, -117, var12) + class116.field1542[var11].method2060(var13 + 1, -119, var12 + 1)) / 4 - (class116.field1542[arg1].method2060(arg3, -128, arg2) + class116.field1542[arg1].method2060(arg3, -123, arg2 + 1) + class116.field1542[arg1].method2060(arg3 + 1, -118, arg2) + class116.field1542[arg1].method2060(arg3 + 1, -99, arg2 + 1)) / 4;
                                    class721 var16 = var14.field10433;
                                    class721 var17 = var14.field10423;
                                    if (var16 != null && var16.method171(-119)) {
                                        arg0.method174(var6, (var12 - arg2) * class722.field9480 + (1 - arg4) * class686.field8834, (byte) -126, var16, class398.field5275, var15, (var13 - arg3) * class722.field9480 + (1 - arg5) * class686.field8834);
                                    }
                                    if (var17 != null && var17.method171(-102)) {
                                        arg0.method174(var6, (var12 - arg2) * class722.field9480 + (1 - arg4) * class686.field8834, (byte) -126, var17, class398.field5275, var15, (var13 - arg3) * class722.field9480 + (1 - arg5) * class686.field8834);
                                    }
                                    for (class569 var18 = var14.field10431; var18 != null; var18 = var18.field7189) {
                                        class620 var19 = var18.field7193;
                                        if (var19 != null && var19.method171(-122) && (var19.field7852 == var12 || var7 == var12) && (var19.field7844 == var13 || var9 == var13)) {
                                            int var20 = var19.field7849 + 1 - var19.field7852;
                                            int var21 = var19.field7850 + 1 - var19.field7844;
                                            arg0.method174(var6, (var19.field7852 - arg2) * class722.field9480 + (var20 - arg4) * class686.field8834, (byte) -126, var19, class398.field5275, var15, (var19.field7844 - arg3) * class722.field9480 + (var21 - arg5) * class686.field8834);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V", line = 286)
    public static void method2776(byte arg0) {
        if (arg0 != 119) {
            method2779(null, 82);
        }
        field6432 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)V", line = 297)
    public final void method2777(int arg0, int arg1, int arg2, int arg3) {
        this.field6416[this.field6430.field4366 * arg1 + arg0] = class77.method473(this.field6416[this.field6430.field4366 * arg1 + arg0], arg3 << arg2);
        field6411++;
        this.field6421++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZIIIII)V", line = 307)
    public static final void method2778(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class9.field80 != null && (arg1 != 3 || class365.field4461 != arg2 || class90.field1232 != arg4)) {
            class578.method3101(class740.field10014, class9.field80, -31);
            class9.field80 = null;
        }
        field6431++;
        if (arg1 == 3 && class9.field80 == null) {
            class9.field80 = class607.method3262(0, 124, arg4, 0, class740.field10014, arg2);
            if (class9.field80 != null) {
                class365.field4461 = arg2;
                class90.field1232 = arg4;
                class627.method3356(78);
            }
        }
        if (arg1 == 3 && class9.field80 == null) {
            method2778(true, class485.field6252.field6935.method643(false), -1, arg3, -1, -90);
            return;
        }
        if (arg5 >= -78) {
            method2776((byte) 14);
        }
        Container var6;
        if (class9.field80 != null) {
            var6 = class9.field80;
            class773.field10518 = arg2;
            class310.field3886 = arg4;
        } else if (class340.field4176 == null) {
            if (class80.field1134 == null) {
                var6 = class29.field265;
            } else {
                var6 = class80.field1134;
            }
            class773.field10518 = var6.getSize().width;
            class310.field3886 = var6.getSize().height;
        } else {
            Insets var7 = class340.field4176.getInsets();
            class773.field10518 = class340.field4176.getSize().width - var7.right - var7.left;
            class310.field3886 = class340.field4176.getSize().height - var7.top - var7.bottom;
            var6 = class340.field4176;
        }
        if (arg1 == 1) {
            class372.field4550 = class719.field9443;
            class483.field6237 = (class773.field10518 - class719.field9443) / 2;
            class257.field3477 = 0;
            class463.field6021 = class398.field5240;
        } else {
            class757.method4125((byte) 28);
        }
        if (class611.field7718 != class290.field3701) {
            boolean var10000;
            if (class372.field4550 < 1024 && class463.field6021 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg0) {
            class793.method4339((byte) -38);
        } else {
            class678.field8763.setSize(class372.field4550, class463.field6021);
            if (class602.field7657) {
                class249.method1622(class678.field8763, false);
            } else {
                class576.field7320.method881(class678.field8763, class372.field4550, class463.field6021);
            }
            if (class340.field4176 == var6) {
                Insets var8 = class340.field4176.getInsets();
                class678.field8763.setLocation(class483.field6237 + var8.left, class257.field3477 + var8.top);
            } else {
                class678.field8763.setLocation(class483.field6237, class257.field3477);
            }
        }
        if (arg1 >= 2) {
            class317.field3950 = true;
        } else {
            class317.field3950 = false;
        }
        if (client.field6070 != -1) {
            class575.method3093(true, (byte) 110);
        }
        if (class252.field3437 != null && class553.method3008(-22038, class332.field4052)) {
            class446.method2556(0);
        }
        for (int var9 = 0; var9 < 100; var9++) {
            class454.field5919[var9] = true;
        }
        class192.field2684 = true;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lmc;I)V", line = 443)
    public static final void method2779(class234 arg0, int arg1) {
        field6415++;
        int var2 = arg0.method1505((byte) -6);
        class397.field5237 = new class408[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class397.field5237[var3] = new class408();
            class397.field5237[var3].field5420 = arg0.method1505((byte) -6);
            class397.field5237[var3].field5419 = arg0.method1506(1188375600);
        }
        class157.field2031 = arg0.method1505((byte) -6);
        class410.field5446 = arg0.method1505((byte) -6);
        class759.field10342 = arg0.method1505((byte) -6);
        class425.field5588 = new class230[class410.field5446 + 1 - class157.field2031];
        if (arg1 != 3) {
            field6414 = 34;
        }
        for (int var4 = 0; var4 < class759.field10342; var4++) {
            int var5 = arg0.method1505((byte) -6);
            class230 var6 = class425.field5588[var5] = new class230();
            var6.field2473 = arg0.method1509(true);
            var6.field2472 = arg0.method1497((byte) 125);
            var6.field3102 = class157.field2031 + var5;
            var6.field3100 = arg0.method1506(arg1 + 1188375597);
            var6.field3101 = arg0.method1506(1188375600);
        }
        field6424 = arg0.method1497((byte) 116);
        class310.field3881 = true;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lrd;IIIII)V", line = 658)
    public class500(class574 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6430 = arg0;
        this.field6409 = arg5;
        this.field6433 = arg3;
        this.field6419 = arg4;
        this.field6416 = new int[this.field6430.field4371 * this.field6430.field4366];
        this.field6425 = this.field6430.field7275;
        this.field6420 = arg2;
        this.field6417 = arg1;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)V", line = 494)
    public final void method2780(int arg0, byte arg1) {
        this.field6423 = this.field6425.method3790(true, (byte) 20, arg0 * 4);
        field6422++;
        if (arg1 <= 121) {
            this.field6420 = -0.14905639F;
        }
        this.field6418 = new Stream(this.field6423, 0, arg0 * 4);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIFI)V", line = 509)
    public final void method2781(int arg0, int arg1, int arg2, float arg3, int arg4) {
        if (arg0 != 23076) {
            method2776((byte) -25);
        }
        if (this.field6417 != -1) {
            class191 var6 = this.field6425.field7199.method1732((byte) -106, this.field6417);
            int var7 = var6.field2672 & 0xFF;
            if (var7 != 0 && var6.field2678 != 4) {
                int var8;
                if (arg1 < 0) {
                    var8 = 0;
                } else if (arg1 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg1 * 131586;
                }
                if (var7 == 256) {
                    arg4 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg4 = ((var8 & 0xFF00) * var7 + ((arg4 & 0xFF00) * var10) & 0xFF0000) + ((arg4 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field2661 & 0xFF;
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
                arg4 = ((var12 & 0x8D00FF00) << 8) + (var14 >> 8) + (var13 & 0xFF00);
            }
        }
        field6410++;
        this.field6418.method2523(arg2 * 4);
        if (arg3 != 1.0F) {
            int var15 = arg4 >> 16 & 0xFF;
            int var16 = arg4 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg3);
            int var18 = arg4 & 0xFF;
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
            arg4 = var20 | var17 << 16 | var19 << 8;
        }
        if (this.field6425.field9155 == 0) {
            this.field6418.method2527((byte) arg4);
            this.field6418.method2527((byte) (arg4 >> 8));
            this.field6418.method2527((byte) (arg4 >> 16));
        } else {
            this.field6418.method2527((byte) (arg4 >> 16));
            this.field6418.method2527((byte) (arg4 >> 8));
            this.field6418.method2527((byte) arg4);
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)V", line = 632)
    public final void method2782(int arg0, int arg1) {
        field6412++;
        this.field6418.method2519();
        this.field6428 = this.field6425.method1162((byte) 31, false);
        this.field6428.method285(arg0 * arg1, (byte) 105, 4, this.field6423);
        this.field6418 = null;
        this.field6423 = null;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(IB)V", line = 644)
    public final void method2783(int arg0, byte arg1) {
        if (arg1 >= -22) {
            method2776((byte) 25);
        }
        this.field6418.method2523(arg0 * 4 + 3);
        field6429++;
        this.field6418.method2527(-1);
    }
}
