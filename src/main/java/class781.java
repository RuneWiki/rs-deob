import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class781 extends class101 {

    @OriginalMember(owner = "client!hda", name = "K", descriptor = "I")
    public int field10721 = 0;

    @OriginalMember(owner = "client!hda", name = "o", descriptor = "Lew;")
    private class520 field10699;

    @OriginalMember(owner = "client!hda", name = "s", descriptor = "I")
    public int field10703;

    @OriginalMember(owner = "client!hda", name = "B", descriptor = "[I")
    private int[] field10712;

    @OriginalMember(owner = "client!hda", name = "y", descriptor = "I")
    public int field10709;

    @OriginalMember(owner = "client!hda", name = "p", descriptor = "I")
    public int field10700;

    @OriginalMember(owner = "client!hda", name = "I", descriptor = "Lai;")
    private class626 field10719;

    @OriginalMember(owner = "client!hda", name = "u", descriptor = "F")
    public float field10705;

    @OriginalMember(owner = "client!hda", name = "N", descriptor = "I")
    public int field10724;

    @OriginalMember(owner = "client!hda", name = "x", descriptor = "[Lbs;")
    public static class717[] field10708 = new class717[14];

    @OriginalMember(owner = "client!hda", name = "t", descriptor = "I")
    public static int field10704 = 50;

    @OriginalMember(owner = "client!hda", name = "A", descriptor = "[I")
    public static int[] field10711 = new int[field10704];

    @OriginalMember(owner = "client!hda", name = "z", descriptor = "[I")
    public static int[] field10710 = new int[field10704];

    @OriginalMember(owner = "client!hda", name = "D", descriptor = "Z")
    public static boolean field10714 = false;

    @OriginalMember(owner = "client!hda", name = "n", descriptor = "[I")
    public static int[] field10698 = new int[field10704];

    @OriginalMember(owner = "client!hda", name = "q", descriptor = "[I")
    public static int[] field10701 = new int[field10704];

    @OriginalMember(owner = "client!hda", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field10706 = new String[field10704];

    @OriginalMember(owner = "client!hda", name = "P", descriptor = "Lor;")
    public static class668 field10726 = null;

    @OriginalMember(owner = "client!hda", name = "H", descriptor = "[I")
    public static int[] field10718 = new int[field10704];

    @OriginalMember(owner = "client!hda", name = "L", descriptor = "[I")
    public static int[] field10722 = new int[field10704];

    @OriginalMember(owner = "client!hda", name = "r", descriptor = "I")
    public static int field10702;

    @OriginalMember(owner = "client!hda", name = "w", descriptor = "I")
    public static int field10707;

    @OriginalMember(owner = "client!hda", name = "C", descriptor = "I")
    public static int field10713;

    @OriginalMember(owner = "client!hda", name = "E", descriptor = "I")
    public static int field10715;

    @OriginalMember(owner = "client!hda", name = "G", descriptor = "I")
    public static int field10717;

    @OriginalMember(owner = "client!hda", name = "J", descriptor = "I")
    public static int field10720;

    @OriginalMember(owner = "client!hda", name = "M", descriptor = "I")
    public static int field10723;

    @OriginalMember(owner = "client!hda", name = "O", descriptor = "I")
    public static int field10725;

    @OriginalMember(owner = "client!hda", name = "S", descriptor = "I")
    public static int field10729;

    @OriginalMember(owner = "client!hda", name = "F", descriptor = "Laj;")
    public static class333 field10716;

    @OriginalMember(owner = "client!hda", name = "Q", descriptor = "Lid;")
    private class612 field10727;

    @OriginalMember(owner = "client!hda", name = "R", descriptor = "Ljaclib/memory/Stream;")
    private Stream field10728;

    @OriginalMember(owner = "client!hda", name = "T", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field10730;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(I[II)V")
    public final void method4308(int arg0, int[] arg1, int arg2) {
        field10715++;
        if (arg0 != -31861) {
            field10726 = null;
        }
        class427 var4 = this.field10719.method3492((byte) 31, this.field10721 * 3);
        Buffer var5 = var4.method2613(true, 3754);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field10719.method3445(9, var5);
        int var7 = 0;
        int var8 = 32767;
        int var9 = -32768;
        if (Stream.method3926()) {
            label98: for (int var18 = 0; var18 < arg2; var18++) {
                int var20 = arg1[var18];
                int var21 = this.field10712[var20];
                short[] var22 = this.field10699.field7119[var20];
                if (var21 != 0 && var22 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var24 >= var22.length) {
                                continue label98;
                            }
                            if ((var21 & 0x1 << var23++) == 0) {
                                var24 += 3;
                            } else {
                                var7++;
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var22[var24++] & 0xFFFF;
                                    var6.method3918(var26);
                                    if (var26 < var8) {
                                        var8 = var26;
                                    }
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
                int var11 = arg1[var10];
                int var12 = this.field10712[var11];
                short[] var13 = this.field10699.field7119[var11];
                if (var12 != 0 && var13 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var15 >= var13.length) {
                                continue label124;
                            }
                            if ((var12 & 0x1 << var14++) == 0) {
                                var15 += 3;
                            } else {
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var13[var15++] & 0xFFFF;
                                    if (var17 > var9) {
                                        var9 = var17;
                                    }
                                    if (var17 < var8) {
                                        var8 = var17;
                                    }
                                    var6.method3921(var17);
                                }
                                var7++;
                            }
                        }
                    }
                }
            }
        }
        var6.method3922();
        if (!var4.method2611(26937) || var7 <= 0) {
            return;
        }
        this.field10719.method3502((this.field10699.field7108 & 0x8) != 0, this.field10703, (this.field10699.field7108 & 0x7) != 0, (byte) -112);
        if (this.field10719.field8645) {
            this.field10719.method557(Integer.MAX_VALUE, this.field10709, this.field10724, this.field10700);
        }
        class754 var19 = this.field10719.method3506((byte) -108);
        var19.method4197((byte) 108, 1.0F / this.field10705, 1.0F, 1.0F / this.field10705);
        this.field10719.method3471(arg0 + 31905, class413.field5937);
        this.field10719.method883(this.field10727, 1, 36);
        this.field10719.method913(this.field10699.field7145, (byte) -63);
        this.field10719.method864(var7, 0, var4, var8, var9 + 1 - var8, true, class235.field3174);
        this.field10719.method3504((byte) -57);
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(B)Z")
    public static final boolean method4309(byte arg0) {
        if (arg0 != 90) {
            field10706 = null;
        }
        field10713++;
        return class458.field6355 >= 1;
    }

    @OriginalMember(owner = "client!hda", name = "d", descriptor = "(B)V")
    public static void method4310(byte arg0) {
        field10718 = null;
        field10722 = null;
        field10698 = null;
        field10711 = null;
        if (arg0 >= -30) {
            return;
        }
        field10710 = null;
        field10708 = null;
        field10706 = null;
        field10716 = null;
        field10726 = null;
        field10701 = null;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(II)V")
    public final void method4311(int arg0, int arg1) {
        if (arg0 < 41) {
            this.method4313(-103, 64);
        }
        this.field10730 = this.field10719.method3473(true, 12, arg1 * 4);
        field10720++;
        this.field10728 = new Stream(this.field10730, 0, arg1 * 4);
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(II)V")
    public final void method4312(int arg0, int arg1) {
        this.field10728.method3922();
        field10725++;
        this.field10727 = this.field10719.method902(0, false);
        this.field10727.method2639(arg1 * 4, arg0, -959, this.field10730);
        this.field10728 = null;
        this.field10730 = null;
    }

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "(II)V")
    public final void method4313(int arg0, int arg1) {
        field10729++;
        this.field10728.method3925(arg1 * 4 + 3);
        int var3 = -24 / ((51 - arg0) / 59);
        this.field10728.method3917(-1);
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(IIII)V")
    public final void method4314(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= 23) {
            field10702++;
            this.field10712[this.field10699.field4301 * arg0 + arg3] = class213.method1409(this.field10712[this.field10699.field4301 * arg0 + arg3], 0x1 << arg2);
            this.field10721++;
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)V")
    public static final void method4315(int arg0) {
        field10717++;
        class385 var1 = (class385) class765.field10575.method2551((byte) -108);
        if (arg0 != 0) {
            return;
        }
        while (var1 != null) {
            class31 var2 = var1.field5624;
            if (class100.field1401 > var2.field486) {
                var1.method792((byte) -100);
                var2.method227((byte) 55);
            } else if (class100.field1401 >= var2.field501) {
                var2.method222(0);
                if (var2.field497 > 0) {
                    class174 var3 = (class174) class234.field3169.method3953((long) (var2.field497 - 1), arg0 + 14);
                    if (var3 != null) {
                        class192 var4 = var3.field2336;
                        if (var4.field2257 >= 0 && class597.field8132 * 512 > var4.field2257 && var4.field2259 >= 0 && class628.field8800 * 512 > var4.field2259) {
                            var2.method221(class100.field1401, (byte) -4, var4.field2257, class783.method4338(var2.field2250, var4.field2257, arg0 - 12040, var4.field2259) - var2.field504, var4.field2259);
                        }
                    }
                }
                if (var2.field497 < 0) {
                    int var5 = -var2.field497 - 1;
                    class73 var6;
                    if (class363.field5292 == var5) {
                        var6 = class551.field7456;
                    } else {
                        var6 = class599.field8149[var5];
                    }
                    if (var6 != null && var6.field2257 >= 0 && class597.field8132 * 512 > var6.field2257 && var6.field2259 >= 0 && (class628.field8800 * 512) > var6.field2259) {
                        var2.method221(class100.field1401, (byte) -4, var6.field2257, class783.method4338(var2.field2250, var6.field2257, -12040, var6.field2259) - var2.field504, var6.field2259);
                    }
                }
                var2.method223(16383, class303.field4368);
                class356.method2242(var2, true);
            }
            var1 = (class385) class765.field10575.method2542(-96);
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(FIIII)V")
    public final void method4316(float arg0, int arg1, int arg2, int arg3, int arg4) {
        field10723++;
        if (this.field10703 != -1) {
            class662 var6 = this.field10719.field912.method1174(this.field10703, true);
            int var7 = var6.field9146 & 0xFF;
            if (var7 != 0 && var6.field9140 != 4) {
                int var8;
                if (arg1 < 0) {
                    var8 = 0;
                } else if (arg1 <= 127) {
                    var8 = arg1 * 131586;
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
            int var11 = var6.field9133 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg2 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg2 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg2 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg2 = (var14 >> 8) + ((var12 & 0x7200FF00) << 8) + (var13 & 0xFF00);
            }
        }
        this.field10728.method3925(arg4 * 4);
        if (arg0 != 1.0F) {
            int var15 = arg2 >> 16 & 0xFF;
            int var16 = (arg2 & 0xFF65) >> 8;
            int var17 = arg2 & 0xFF;
            int var18 = (int) ((float) var15 * arg0);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg0);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var17 * arg0);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg2 = var20 | var19 << 8 | var18 << 16;
        }
        if (arg3 != 0) {
            this.field10724 = -115;
        }
        if (this.field10719.field8716 == 0) {
            this.field10728.method3917((byte) arg2);
            this.field10728.method3917((byte) (arg2 >> 8));
            this.field10728.method3917((byte) (arg2 >> 16));
        } else {
            this.field10728.method3917((byte) (arg2 >> 16));
            this.field10728.method3917((byte) (arg2 >> 8));
            this.field10728.method3917((byte) arg2);
        }
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Lew;IIIII)V")
    public class781(class520 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field10699 = arg0;
        this.field10703 = arg1;
        this.field10712 = new int[this.field10699.field4301 * this.field10699.field4300];
        this.field10709 = arg3;
        this.field10700 = arg5;
        this.field10719 = this.field10699.field7101;
        this.field10705 = arg2;
        this.field10724 = arg4;
    }
}
