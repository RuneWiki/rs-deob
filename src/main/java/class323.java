import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class323 extends class329 {

    @OriginalMember(owner = "client!bl", name = "z", descriptor = "I")
    public int field4148 = 0;

    @OriginalMember(owner = "client!bl", name = "C", descriptor = "Ldaa;")
    private class260 field4151;

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "Len;")
    private class478 field4146;

    @OriginalMember(owner = "client!bl", name = "D", descriptor = "I")
    public int field4152;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "I")
    public int field4136;

    @OriginalMember(owner = "client!bl", name = "A", descriptor = "I")
    public int field4149;

    @OriginalMember(owner = "client!bl", name = "F", descriptor = "F")
    public float field4154;

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "I")
    public int field4142;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "[I")
    private int[] field4135;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public static int field4133 = -50;

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "Ltb;")
    public static class450 field4144 = new class450(10);

    @OriginalMember(owner = "client!bl", name = "G", descriptor = "Lwp;")
    public static class453 field4155 = new class453(106, 6);

    @OriginalMember(owner = "client!bl", name = "H", descriptor = "Lrga;")
    public static class280 field4156 = new class280(10, 4);

    @OriginalMember(owner = "client!bl", name = "J", descriptor = "F")
    public static float field4158 = 0.25F;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!bl", name = "y", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!bl", name = "B", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "Lnba;")
    private class401 field4141;

    @OriginalMember(owner = "client!bl", name = "I", descriptor = "Luaa;")
    public static class436 field4157;

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "Ljaclib/memory/Stream;")
    private Stream field4145;

    @OriginalMember(owner = "client!bl", name = "E", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field4153;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIZ)V")
    public final void method1846(int arg0, int arg1, int arg2, boolean arg3) {
        this.field4135[this.field4151.field3441 * arg1 + arg2] = class444.method2376(this.field4135[this.field4151.field3441 * arg1 + arg2], 0x1 << arg0);
        if (!arg3) {
            this.field4152 = 13;
        }
        field4138++;
        this.field4148++;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)V")
    public final void method1847(int arg0, int arg1) {
        field4140++;
        this.field4145.method3421(arg1 * 4 + 3);
        this.field4145.method3426(-1);
        int var3 = 109 % ((arg0 + 69) / 41);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lpl;I)I")
    public static final int method1848(class612 arg0, int arg1) {
        field4143++;
        int var2 = 0;
        if (arg1 != 65280) {
            return -118;
        }
        if (arg0.method3368(1912, class152.field1947)) {
            var2++;
        }
        if (arg0.method3368(1912, class13.field236)) {
            var2++;
        }
        if (arg0.method3368(1912, class138.field1796)) {
            var2++;
        }
        if (arg0.method3368(1912, class145.field1876)) {
            var2++;
        }
        if (arg0.method3368(arg1 ^ 0xF878, class26.field389)) {
            var2++;
        }
        if (arg0.method3368(arg1 - 63368, class622.field8707)) {
            var2++;
        }
        if (arg0.method3368(1912, class387.field4867)) {
            var2++;
        }
        if (arg0.method3368(arg1 - 63368, class677.field9506)) {
            var2++;
        }
        if (arg0.method3368(arg1 ^ 0xF878, class487.field6449)) {
            var2++;
        }
        if (arg0.method3368(arg1 - 63368, class20.field316)) {
            var2++;
        }
        if (arg0.method3368(1912, class257.field3135)) {
            var2++;
        }
        if (arg0.method3368(1912, class183.field2334)) {
            var2++;
        }
        if (arg0.method3368(1912, class135.field1755)) {
            var2++;
        }
        if (arg0.method3368(arg1 - 63368, class207.field2626)) {
            var2++;
        }
        if (arg0.method3368(1912, class462.field5891)) {
            var2++;
        }
        if (arg0.method3368(arg1 ^ 0xF878, class594.field8351)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)V")
    public final void method1849(int arg0, int arg1) {
        field4134++;
        this.field4153 = this.field4146.method2542(arg0 * arg1, (byte) 78, true);
        this.field4145 = new Stream(this.field4153, 0, arg0 * 4);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIBFI)V")
    public final void method1850(int arg0, int arg1, byte arg2, float arg3, int arg4) {
        if (this.field4136 != -1) {
            class13 var6 = this.field4146.field7898.method2486(this.field4136, (byte) 86);
            int var7 = var6.field242 & 0xFF;
            if (var7 != 0 && var6.field234 != 4) {
                int var8;
                if (arg1 < 0) {
                    var8 = 0;
                } else if (arg1 <= 127) {
                    var8 = arg1 * 131586;
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
            int var11 = var6.field231 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg0 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg0 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg0 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg0 = (var12 << 8 & 0xFF002D) - (-(var14 >> 8) - (var13 & 0xFF00));
            }
        }
        field4139++;
        if (arg2 >= -33) {
            this.method1852((byte) 106, 8);
        }
        this.field4145.method3421(arg4 * 4);
        if (arg3 != 1.0F) {
            int var15 = (arg0 & 0xFF6818) >> 16;
            int var16 = arg0 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg3);
            int var18 = arg0 & 0xFF;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var19 = (int) ((float) var16 * arg3);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var18 * arg3);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg0 = var19 << 8 | var17 << 16 | var20;
        }
        if (this.field4146.field6326 == 0) {
            this.field4145.method3426((byte) arg0);
            this.field4145.method3426((byte) (arg0 >> 8));
            this.field4145.method3426((byte) (arg0 >> 16));
        } else {
            this.field4145.method3426((byte) (arg0 >> 16));
            this.field4145.method3426((byte) (arg0 >> 8));
            this.field4145.method3426((byte) arg0);
        }
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(II)Z")
    public static final boolean method1851(int arg0, int arg1) {
        field4150++;
        if (arg1 < 30) {
            method1851(-39, -128);
        }
        return arg0 == 60 || arg0 == 45 || arg0 == 1011 || arg0 == 57 || arg0 == 50;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BI)V")
    public final void method1852(byte arg0, int arg1) {
        if (arg0 <= 11) {
            this.method1847(42, -80);
        }
        field4147++;
        this.field4145.method3424();
        this.field4141 = this.field4146.method1716(false, false);
        this.field4141.method326(this.field4153, 4, arg1 * 4, (byte) 92);
        this.field4153 = null;
        this.field4145 = null;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "([III)V")
    public final void method1853(int[] arg0, int arg1, int arg2) {
        field4137++;
        class666 var4 = this.field4146.method2548(-116, this.field4148 * 3);
        Buffer var5 = var4.method1486((byte) -88, true);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field4146.method2573(var5, 96);
        int var7 = 0;
        int var8 = 32767;
        int var9 = -32768;
        if (arg1 != 1602853160) {
            this.method1850(-30, -55, (byte) 69, -1.690743F, 115);
        }
        if (Stream.method3420()) {
            label98: for (int var18 = 0; var18 < arg2; var18++) {
                int var20 = arg0[var18];
                short[] var21 = this.field4151.field3201[var20];
                int var22 = this.field4135[var20];
                if (var22 != 0 && var21 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var24 >= var21.length) {
                                continue label98;
                            }
                            if ((var22 & 0x1 << var23++) == 0) {
                                var24 += 3;
                            } else {
                                var7++;
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var21[var24++] & 0xFFFF;
                                    if (var26 < var8) {
                                        var8 = var26;
                                    }
                                    var6.method3422(var26);
                                    if (var26 > var9) {
                                        var9 = var26;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            label124: for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = arg0[var10];
                short[] var12 = this.field4151.field3201[var11];
                int var13 = this.field4135[var11];
                if (var13 != 0 && var12 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var15 >= var12.length) {
                                continue label124;
                            }
                            if ((var13 & 0x1 << var14++) == 0) {
                                var15 += 3;
                            } else {
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var12[var15++] & 0xFFFF;
                                    if (var17 > var9) {
                                        var9 = var17;
                                    }
                                    var6.method3430(var17);
                                    if (var17 < var8) {
                                        var8 = var17;
                                    }
                                }
                                var7++;
                            }
                        }
                    }
                }
            }
        }
        var6.method3424();
        if (!var4.method1485((byte) 42) || var7 <= 0) {
            return;
        }
        this.field4146.method2526(0, this.field4136, (this.field4151.field3200 & 0x7) != 0, (this.field4151.field3200 & 0x8) != 0);
        if (this.field4146.field6289) {
            this.field4146.method984(Integer.MAX_VALUE, this.field4149, this.field4152, this.field4142);
        }
        class691 var19 = this.field4146.method2562(126);
        var19.method3893(1.0F / this.field4154, 18543, 1.0F / this.field4154, 1.0F);
        this.field4146.method2524(112, class587.field8253);
        this.field4146.method1695((byte) -16, this.field4141, 1);
        this.field4146.method1709(true, this.field4151.field3222);
        this.field4146.method1700(var9 + 1 - var8, class365.field4648, 0, 12896, var7, var8, var4);
        this.field4146.method2554((byte) -70);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
    public static void method1854(int arg0) {
        field4144 = null;
        field4157 = null;
        if (arg0 > -86) {
            method1854(81);
        }
        field4156 = null;
        field4155 = null;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Ldaa;IIIII)V")
    public class323(class260 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4151 = arg0;
        this.field4146 = this.field4151.field3190;
        this.field4152 = arg4;
        this.field4136 = arg1;
        this.field4149 = arg3;
        this.field4154 = arg2;
        this.field4142 = arg5;
        this.field4135 = new int[this.field4151.field3441 * this.field4151.field3440];
    }
}
