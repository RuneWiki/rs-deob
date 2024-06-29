import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class431 extends class55 {

    @OriginalMember(owner = "client!li", name = "G", descriptor = "I")
    public int field6083 = 0;

    @OriginalMember(owner = "client!li", name = "F", descriptor = "Lsi;")
    private class560 field6082;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "I")
    public int field6071;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public int field6061;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "I")
    public int field6070;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "Luv;")
    private class367 field6066;

    @OriginalMember(owner = "client!li", name = "D", descriptor = "[I")
    private int[] field6080;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    public int field6064;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "F")
    public float field6072;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "Lkt;")
    public static class159 field6067 = new class159(1);

    @OriginalMember(owner = "client!li", name = "E", descriptor = "[F")
    public static float[] field6081 = new float[16];

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "I")
    public static int field6069;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!li", name = "y", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!li", name = "z", descriptor = "I")
    public static int field6076;

    @OriginalMember(owner = "client!li", name = "B", descriptor = "I")
    public static int field6078;

    @OriginalMember(owner = "client!li", name = "C", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!li", name = "H", descriptor = "I")
    public static int field6084;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "Ltea;")
    private class241 field6062;

    @OriginalMember(owner = "client!li", name = "A", descriptor = "Lea;")
    public static class547 field6077;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "Ljaclib/memory/Stream;")
    private Stream field6073;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field6068;

    // $FF: synthetic field
    @OriginalMember(owner = "client!li", name = "J", descriptor = "Ljava/lang/Class;")
    public static Class field6086;

    @OriginalMember(owner = "client!li", name = "I", descriptor = "[Lkia;")
    public static class620[] field6085;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZZLgv;)V")
    public static final void method2457(boolean arg0, boolean arg1, class83 arg2) {
        field6084++;
        if (class43.field470 >= 400) {
            return;
        }
        if (class653.field9086 == arg2) {
            if (class595.field8291 && (class372.field5190 & 0x10) != 0) {
                class415.field5860++;
                class218.method1237(false, true, 0L, class387.field5461, 0, class719.field10067 + " -> <col=ffffff>" + class755.field10517.method4201(class723.field10095, (byte) 25), false, 0, 57, (long) arg2.field817, -1, false, class702.field9857);
            }
        } else if (arg1) {
            String var7;
            if (arg2.field1150 == 0) {
                boolean var3 = true;
                if (class653.field9086.field1143 != -1 && arg2.field1143 != -1) {
                    int var4 = class653.field9086.field1143 >= arg2.field1143 ? arg2.field1143 : class653.field9086.field1143;
                    int var5 = class653.field9086.field1122 - arg2.field1122;
                    if (var5 < 0) {
                        var5 = -var5;
                    }
                    if (var5 > var4) {
                        var3 = false;
                    }
                }
                String var6 = class639.field8868 == class51.field541 ? class755.field10510.method4201(class723.field10095, (byte) 25) : class755.field10508.method4201(class723.field10095, (byte) 25);
                if (arg2.field1122 < arg2.field1162) {
                    var7 = arg2.method615(0, true) + (var3 ? class45.method274(class653.field9086.field1122, arg2.field1122, 16383) : "<col=ffffff>") + " (" + var6 + arg2.field1122 + "+" + (arg2.field1162 - arg2.field1122) + ")";
                } else {
                    var7 = arg2.method615(0, true) + (var3 ? class45.method274(class653.field9086.field1122, arg2.field1122, 16383) : "<col=ffffff>") + " (" + var6 + arg2.field1122 + ")";
                }
            } else if (arg2.field1150 == -1) {
                var7 = arg2.method615(0, true);
            } else {
                var7 = arg2.method615(0, true) + " (" + class755.field10509.method4201(class723.field10095, (byte) 25) + arg2.field1150 + ")";
            }
            if (class595.field8291 && !arg0 && (class372.field5190 & 0x8) != 0) {
                class669.field9294++;
                class218.method1237(false, true, (long) arg2.field817, class387.field5461, 0, class719.field10067 + " -> <col=ffffff>" + var7, false, 0, 5, (long) arg2.field817, -1, false, class702.field9857);
            }
            if (arg0) {
                class218.method1237(false, false, 0L, -1, 0, "", false, 0, -1, (long) arg2.field817, 0, true, "<col=cccccc>" + var7);
            } else {
                for (int var8 = 7; var8 >= 0; var8--) {
                    if (class476.field6573[var8] != null) {
                        short var9 = 0;
                        if (class51.field541 == class257.field3338 && class476.field6573[var8].equalsIgnoreCase(class755.field10503.method4201(class723.field10095, (byte) 25))) {
                            if (class653.field9086.field1122 < arg2.field1122) {
                                var9 = 2000;
                            }
                            if (class653.field9086.field1133 != 0 && arg2.field1133 != 0) {
                                if (class653.field9086.field1133 == arg2.field1133) {
                                    var9 = 2000;
                                } else {
                                    var9 = 0;
                                }
                            }
                        } else if (class381.field5272[var8]) {
                            var9 = 2000;
                        }
                        short var10 = (short) (class37.field384[var8] + var9);
                        int var11 = class361.field4774[var8] == -1 ? class457.field6330 : class361.field4774[var8];
                        class218.method1237(false, true, (long) arg2.field817, var11, 0, "<col=ffffff>" + var7, false, 0, var10, (long) arg2.field817, -1, false, class476.field6573[var8]);
                        class701.field9848++;
                    }
                }
            }
            if (!arg0) {
                for (class227 var12 = (class227) class139.field1783.method724(32); var12 != null; var12 = (class227) class139.field1783.method723(102)) {
                    if (var12.field2948 == 6) {
                        var12.field2943 = "<col=ffffff>" + var7;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IZ)V")
    public final void method2458(int arg0, boolean arg1) {
        this.field6073.method3783(arg0 * 4 + 3);
        field6063++;
        if (!arg1) {
            this.method2459(108, (byte) 47);
        }
        this.field6073.method3793(-1);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)V")
    public final void method2459(int arg0, byte arg1) {
        field6075++;
        this.field6073.method3795();
        this.field6062 = this.field6066.method1292(false, 68);
        this.field6062.method1449((byte) -113, arg0 * 4, 4, this.field6068);
        this.field6068 = null;
        if (arg1 <= 18) {
            method2457(true, false, null);
        }
        this.field6073 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "([III)V")
    public final void method2460(int[] arg0, int arg1, int arg2) {
        field6065++;
        class562 var4 = this.field6066.method2123(62, this.field6083 * 3);
        Buffer var5 = var4.method179(true, -112);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field6066.method2170(24022, var5);
        int var7 = 0;
        if (arg2 != 32736) {
            this.method2461(-55, 122, 111, -45);
        }
        int var8 = 32767;
        int var9 = -32768;
        if (Stream.method3786()) {
            label100: for (int var18 = 0; var18 < arg1; var18++) {
                int var20 = arg0[var18];
                int var21 = this.field6080[var20];
                short[] var22 = this.field6082.field7883[var20];
                if (var21 != 0 && var22 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var24 >= var22.length) {
                                continue label100;
                            }
                            if ((var21 & 0x1 << var23++) == 0) {
                                var24 += 3;
                            } else {
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var22[var24++] & 0xFFFF;
                                    var6.method3791(var26);
                                    if (var8 > var26) {
                                        var8 = var26;
                                    }
                                    if (var9 < var26) {
                                        var9 = var26;
                                    }
                                }
                                var7++;
                            }
                        }
                    }
                }
            }
        } else {
            label125: for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = arg0[var10];
                int var12 = this.field6080[var11];
                short[] var13 = this.field6082.field7883[var11];
                if (var12 != 0 && var13 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var15 >= var13.length) {
                                continue label125;
                            }
                            if ((var12 & 0x1 << var14++) == 0) {
                                var15 += 3;
                            } else {
                                var7++;
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var13[var15++] & 0xFFFF;
                                    if (var17 > var9) {
                                        var9 = var17;
                                    }
                                    var6.method3792(var17);
                                    if (var17 < var8) {
                                        var8 = var17;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        var6.method3795();
        if (!var4.method178((byte) 60) || var7 <= 0) {
            return;
        }
        this.field6066.method2167((this.field6082.field7890 & 0x8) != 0, arg2 - 32736, this.field6061, (this.field6082.field7890 & 0x7) != 0);
        if (this.field6066.field5055) {
            this.field6066.method427(Integer.MAX_VALUE, this.field6071, this.field6070, this.field6064);
        }
        class648 var19 = this.field6066.method2119((byte) -128);
        var19.method3665(1.0F / this.field6072, (byte) -122, 1.0F / this.field6072, 1.0F);
        this.field6066.method2149(class536.field7270, (byte) 36);
        this.field6066.method1325(1, true, this.field6062);
        this.field6066.method1330(this.field6082.field7917, (byte) 67);
        this.field6066.method1304(class387.field5460, var9 + 1 - var8, 0, 26810, var4, var8, var7);
        this.field6066.method2135(2);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIII)V")
    public final void method2461(int arg0, int arg1, int arg2, int arg3) {
        this.field6080[this.field6082.field3727 * arg3 + arg2] = class344.method2020(this.field6080[this.field6082.field3727 * arg3 + arg2], 0x1 << arg0);
        field6078++;
        if (arg1 != -20787) {
            this.method2461(22, -33, -30, -8);
        }
        this.field6083++;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)V")
    public final void method2462(int arg0, int arg1) {
        field6074++;
        this.field6068 = this.field6066.method2111(arg0 * arg1, true, 0);
        this.field6073 = new Stream(this.field6068, 0, arg0 * 4);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIF)V")
    public final void method2463(int arg0, int arg1, int arg2, int arg3, float arg4) {
        field6069++;
        if (this.field6061 != arg2) {
            class335 var6 = this.field6066.field636.method925(this.field6061, -28755);
            int var7 = var6.field4534 & 0xFF;
            if (var7 != 0 && var6.field4522 != 4) {
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
            int var11 = var6.field4533 & 0xFF;
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
                arg3 = (var14 >> 8) + ((var12 & 0x7000FF00) << 8) + (var13 & 0xFF00);
            }
        }
        this.field6073.method3783(arg0 * 4);
        if (arg4 != 1.0F) {
            int var15 = (arg3 & 0xFF9FC6) >> 16;
            int var16 = arg3 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg4);
            int var18 = arg3 & 0xFF;
            int var19 = (int) ((float) var16 * arg4);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
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
            arg3 = var17 << 16 | var19 << 8 | var20;
        }
        if (this.field6066.field5072 == 0) {
            this.field6073.method3793((byte) arg3);
            this.field6073.method3793((byte) (arg3 >> 8));
            this.field6073.method3793((byte) (arg3 >> 16));
        } else {
            this.field6073.method3793((byte) (arg3 >> 16));
            this.field6073.method3793((byte) (arg3 >> 8));
            this.field6073.method3793((byte) arg3);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
    public static void method2464(int arg0) {
        field6067 = null;
        field6081 = null;
        field6077 = null;
        field6085 = null;
        int var1 = -86 / ((arg0 - 53) / 37);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjava/io/File;Z)V")
    public static final void method2465(int arg0, File arg1, boolean arg2) {
        field6079++;
        if (class418.field5880 == null) {
            class577.method3233(false);
        }
        try {
            Class var3 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
            if (arg0 == 0) {
                Method var4 = var3.getDeclaredMethod("dumpHeap", field6086 == null ? (field6086 = method2466("java.lang.String")) : field6086, Boolean.TYPE);
                var4.invoke(class418.field5880, arg1.getAbsolutePath(), Boolean.valueOf(arg2));
            }
        } catch (Exception var6) {
            System.out.println("HeapDump error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lsi;IIIII)V")
    public class431(class560 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6082 = arg0;
        this.field6071 = arg3;
        this.field6061 = arg1;
        this.field6070 = arg4;
        this.field6066 = this.field6082.field7876;
        this.field6080 = new int[this.field6082.field3728 * this.field6082.field3727];
        this.field6064 = arg5;
        this.field6072 = arg2;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2466(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
