import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class43 extends class430 {

    @OriginalMember(owner = "client!mv", name = "x", descriptor = "I")
    public int field728 = 0;

    @OriginalMember(owner = "client!mv", name = "w", descriptor = "Lcj;")
    private class443 field727;

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "I")
    public int field712;

    @OriginalMember(owner = "client!mv", name = "q", descriptor = "Lch;")
    private class38 field721;

    @OriginalMember(owner = "client!mv", name = "p", descriptor = "I")
    public int field720;

    @OriginalMember(owner = "client!mv", name = "j", descriptor = "I")
    public int field714;

    @OriginalMember(owner = "client!mv", name = "o", descriptor = "F")
    public float field719;

    @OriginalMember(owner = "client!mv", name = "B", descriptor = "[I")
    private int[] field732;

    @OriginalMember(owner = "client!mv", name = "A", descriptor = "I")
    public int field731;

    @OriginalMember(owner = "client!mv", name = "u", descriptor = "[I")
    public static int[] field725 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!mv", name = "k", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!mv", name = "m", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!mv", name = "n", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!mv", name = "r", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!mv", name = "s", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!mv", name = "v", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!mv", name = "y", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!mv", name = "z", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!mv", name = "t", descriptor = "Lfg;")
    private class436 field724;

    @OriginalMember(owner = "client!mv", name = "l", descriptor = "Lsl;")
    public static class479 field716;

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "Ljaclib/memory/Stream;")
    private Stream field711;

    @OriginalMember(owner = "client!mv", name = "i", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field713;

    @OriginalMember(owner = "client!mv", name = "C", descriptor = "[Lsia;")
    public static class151[] field733;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "([III)V")
    public final void method436(int[] arg0, int arg1, int arg2) {
        field729++;
        class33 var4 = this.field721.method361(-56, this.field728 * 3);
        Buffer var5 = var4.method177(true, (byte) -115);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field721.method325((byte) -120, var5);
        int var7 = arg2;
        int var8 = 32767;
        int var9 = -32768;
        if (Stream.method2551()) {
            label98: for (int var18 = 0; var18 < arg1; var18++) {
                int var20 = arg0[var18];
                short[] var21 = this.field727.field6306[var20];
                int var22 = this.field732[var20];
                if (var22 != 0 && var21 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var21.length <= var24) {
                                continue label98;
                            }
                            if ((var22 & 0x1 << var23++) == 0) {
                                var24 += 3;
                            } else {
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var21[var24++] & 0xFFFF;
                                    var6.method2561(var26);
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
            label124: for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = arg0[var10];
                int var12 = this.field732[var11];
                short[] var13 = this.field727.field6306[var11];
                if (var12 != 0 && var13 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var13.length <= var15) {
                                continue label124;
                            }
                            if ((var12 & 0x1 << var14++) == 0) {
                                var15 += 3;
                            } else {
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var13[var15++] & 0xFFFF;
                                    var6.method2560(var17);
                                    if (var17 > var9) {
                                        var9 = var17;
                                    }
                                    if (var8 > var17) {
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
        var6.method2554();
        if (!var4.method178((byte) -113) || var7 <= 0) {
            return;
        }
        this.field721.method223((this.field727.field6313 & 0x8) != 0, (this.field727.field6313 & 0x7) != 0, false, this.field714);
        if (this.field721.field602) {
            this.field721.method206(Integer.MAX_VALUE, this.field720, this.field712, this.field731);
        }
        class417 var19 = this.field721.method381((byte) 42);
        var19.method2522(1.0F / this.field719, 1.0F, 124, 1.0F / this.field719);
        this.field721.method238(113, class549.field7982);
        this.field721.method405(this.field724, 1, (byte) 11);
        this.field721.method265(this.field727.field6336, (byte) -86);
        this.field721.method354(class262.field3771, var8, arg2 ^ 0xFFFFFFEE, var9 + 1 - var8, var4, var7, 0);
        this.field721.method389((byte) -2);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IB)V")
    public final void method437(int arg0, byte arg1) {
        field718++;
        this.field711.method2554();
        this.field724 = this.field721.method327(false, false);
        this.field724.method1102(arg0 * 4, this.field713, -117, 4);
        if (arg1 >= -53) {
            this.field731 = -115;
        }
        this.field713 = null;
        this.field711 = null;
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(II)V")
    public final void method438(int arg0, int arg1) {
        field726++;
        this.field713 = this.field721.method351(true, arg0 * 4, 114);
        this.field711 = new Stream(this.field713, arg1, arg0 * 4);
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(IB)V")
    public final void method439(int arg0, byte arg1) {
        if (arg1 != 80) {
            this.method436(null, -82, 1);
        }
        this.field711.method2553(arg0 * 4 + 3);
        field715++;
        this.field711.method2555(-1);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "([BII)I")
    public static final int method440(byte[] arg0, int arg1, int arg2) {
        field722++;
        int var3 = 16 % ((25 - arg2) / 35);
        return class488.method2973(arg0, (byte) -38, 0, arg1);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V")
    public static void method441(int arg0) {
        if (arg0 == 14194) {
            field733 = null;
            field716 = null;
            field725 = null;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIIIF)V")
    public final void method442(int arg0, int arg1, int arg2, int arg3, float arg4) {
        if (this.field714 != -1) {
            class679 var6 = this.field721.field7881.method962(this.field714, 2904);
            int var7 = var6.field9637 & 0xFF;
            if (var7 != 0 && var6.field9648 != 4) {
                int var8;
                if (arg0 < 0) {
                    var8 = 0;
                } else if (arg0 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg0 * 131586;
                }
                if (var7 == 256) {
                    arg1 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg1 = ((var8 & 0xFF00FF) * var7 + ((arg1 & 0xFF00FF) * var10) & 0xFF00FF00) + ((arg1 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field9651 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg1 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg1 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg1 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg1 = (var12 << 8 & 0xFF009A) + (var13 & 0xFF00) + (var14 >> 8);
            }
        }
        field730++;
        this.field711.method2553(arg3 * 4);
        if (arg4 != 1.0F) {
            int var15 = (arg1 & 0xFF5B09) >> 16;
            int var16 = arg1 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg4);
            int var18 = arg1 & 0xFF;
            int var19 = (int) ((float) var16 * arg4);
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
            int var20 = (int) ((float) var18 * arg4);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg1 = var17 << 16 | var19 << 8 | var20;
        }
        if (arg2 < 34) {
            this.method438(-77, -3);
        }
        if (this.field721.field605 == 0) {
            this.field711.method2555((byte) arg1);
            this.field711.method2555((byte) (arg1 >> 8));
            this.field711.method2555((byte) (arg1 >> 16));
        } else {
            this.field711.method2555((byte) (arg1 >> 16));
            this.field711.method2555((byte) (arg1 >> 8));
            this.field711.method2555((byte) arg1);
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIII)V")
    public final void method443(int arg0, int arg1, int arg2, int arg3) {
        field723++;
        this.field732[this.field727.field4679 * arg2 + arg0] = class430.method2658(this.field732[this.field727.field4679 * arg2 + arg0], arg3 << arg1);
        this.field728++;
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lcj;IIIII)V")
    public class43(class443 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field727 = arg0;
        this.field712 = arg4;
        this.field721 = this.field727.field6304;
        this.field720 = arg3;
        this.field714 = arg1;
        this.field719 = arg2;
        this.field732 = new int[this.field727.field4679 * this.field727.field4672];
        this.field731 = arg5;
    }
}
