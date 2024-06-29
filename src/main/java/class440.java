import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class440 extends class168 {

    @OriginalMember(owner = "client!io", name = "l", descriptor = "I")
    public int field5845 = 0;

    @OriginalMember(owner = "client!io", name = "n", descriptor = "Llp;")
    private class395 field5847;

    @OriginalMember(owner = "client!io", name = "o", descriptor = "F")
    public float field5848;

    @OriginalMember(owner = "client!io", name = "v", descriptor = "[I")
    private int[] field5855;

    @OriginalMember(owner = "client!io", name = "j", descriptor = "I")
    public int field5843;

    @OriginalMember(owner = "client!io", name = "y", descriptor = "Lij;")
    private class424 field5858;

    @OriginalMember(owner = "client!io", name = "k", descriptor = "I")
    public int field5844;

    @OriginalMember(owner = "client!io", name = "s", descriptor = "I")
    public int field5852;

    @OriginalMember(owner = "client!io", name = "x", descriptor = "I")
    public int field5857;

    @OriginalMember(owner = "client!io", name = "D", descriptor = "Lhg;")
    public static class693 field5863 = new class693(7, 6);

    @OriginalMember(owner = "client!io", name = "F", descriptor = "I")
    public static int field5865 = 0;

    @OriginalMember(owner = "client!io", name = "G", descriptor = "Lhg;")
    public static class693 field5866 = new class693(64, -1);

    @OriginalMember(owner = "client!io", name = "I", descriptor = "I")
    public static int field5868 = 0;

    @OriginalMember(owner = "client!io", name = "m", descriptor = "I")
    public static int field5846;

    @OriginalMember(owner = "client!io", name = "p", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!io", name = "q", descriptor = "I")
    public static int field5850;

    @OriginalMember(owner = "client!io", name = "r", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!io", name = "u", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!io", name = "z", descriptor = "I")
    public static int field5859;

    @OriginalMember(owner = "client!io", name = "A", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!io", name = "B", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!io", name = "C", descriptor = "I")
    public static int field5862;

    @OriginalMember(owner = "client!io", name = "H", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!io", name = "t", descriptor = "Lia;")
    private class591 field5853;

    @OriginalMember(owner = "client!io", name = "E", descriptor = "Ljaclib/memory/Stream;")
    private Stream field5864;

    @OriginalMember(owner = "client!io", name = "w", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field5856;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIFII)V", line = 4)
    public final void method2495(int arg0, int arg1, float arg2, int arg3, int arg4) {
        if (arg4 >= -23) {
            return;
        }
        field5850++;
        if (this.field5852 != -1) {
            class537 var6 = this.field5858.field830.method1072(this.field5852, true);
            int var7 = var6.field7438 & 0xFF;
            if (var7 != 0 && var6.field7443 != 4) {
                int var8;
                if (arg0 < 0) {
                    var8 = 0;
                } else if (arg0 <= 127) {
                    var8 = arg0 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg1 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg1 = ((var8 & 0xFF00FF) * var7 + ((arg1 & 0xFF00FF) * var10) & 0xFF00FF00) + ((arg1 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field7437 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg1 >> 16 & 0xFF) * var11;
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
                arg1 = (var14 >> 8) + (var12 << 8 & 0xFF0017) + (var13 & 0xFF00);
            }
        }
        this.field5864.method3797(arg3 * 4);
        if (arg2 != 1.0F) {
            int var15 = arg1 >> 16 & 0xFF;
            int var16 = arg1 >> 8 & 0xFF;
            int var17 = arg1 & 0xFF;
            int var18 = (int) ((float) var15 * arg2);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg2);
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
            arg1 = var18 << 16 | var19 << 8 | var20;
        }
        if (this.field5858.field5682 == 0) {
            this.field5864.method3792((byte) arg1);
            this.field5864.method3792((byte) (arg1 >> 8));
            this.field5864.method3792((byte) (arg1 >> 16));
        } else {
            this.field5864.method3792((byte) (arg1 >> 16));
            this.field5864.method3792((byte) (arg1 >> 8));
            this.field5864.method3792((byte) arg1);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BI[I)V", line = 127)
    public final void method2496(byte arg0, int arg1, int[] arg2) {
        field5849++;
        class497 var4 = this.field5858.method2428(2, this.field5845 * 3);
        Buffer var5 = var4.method1369(arg0 ^ 0x61AA, true);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field5858.method2409((byte) 112, var5);
        int var7 = 0;
        if (arg0 != -119) {
            this.field5864 = null;
        }
        int var8 = 32767;
        int var9 = -32768;
        if (Stream.method3798()) {
            label100: for (int var18 = 0; var18 < arg1; var18++) {
                int var20 = arg2[var18];
                int var21 = this.field5855[var20];
                short[] var22 = this.field5847.field5019[var20];
                if (var21 != 0 && var22 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var22.length <= var24) {
                                continue label100;
                            }
                            if ((var21 & 0x1 << var23++) == 0) {
                                var24 += 3;
                            } else {
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var22[var24++] & 0xFFFF;
                                    if (var26 < var8) {
                                        var8 = var26;
                                    }
                                    if (var26 > var9) {
                                        var9 = var26;
                                    }
                                    var6.method3785(var26);
                                }
                                var7++;
                            }
                        }
                    }
                }
            }
        } else {
            label124: for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = arg2[var10];
                short[] var12 = this.field5847.field5019[var11];
                int var13 = this.field5855[var11];
                if (var13 != 0 && var12 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var12.length <= var15) {
                                continue label124;
                            }
                            if ((var13 & 0x1 << var14++) == 0) {
                                var15 += 3;
                            } else {
                                var7++;
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var12[var15++] & 0xFFFF;
                                    if (var17 < var8) {
                                        var8 = var17;
                                    }
                                    if (var9 < var17) {
                                        var9 = var17;
                                    }
                                    var6.method3795(var17);
                                }
                            }
                        }
                    }
                }
            }
        }
        var6.method3793();
        if (!var4.method1368(true) || var7 <= 0) {
            return;
        }
        this.field5858.method2410((this.field5847.field5021 & 0x8) != 0, (this.field5847.field5021 & 0x7) != 0, (byte) 87, this.field5852);
        if (this.field5858.field5631) {
            this.field5858.method453(Integer.MAX_VALUE, this.field5857, this.field5843, this.field5844);
        }
        class477 var19 = this.field5858.method2364((byte) -127);
        var19.method2747(-16363, 1.0F / this.field5848, 1.0F / this.field5848, 1.0F);
        this.field5858.method2384(arg0 ^ 0xFFFFFF8B, class1.field2);
        this.field5858.method2041(1, this.field5853, (byte) 73);
        this.field5858.method2033(arg0 ^ 0xFFFFBD24, this.field5847.field5038);
        this.field5858.method2030(var8, var9 + 1 - var8, class662.field9281, var4, false, var7, 0);
        this.field5858.method2418(arg0 + 11151);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V", line = 287)
    public static void method2497(byte arg0) {
        field5863 = null;
        field5866 = null;
        int var1 = -68 % ((12 - arg0) / 50);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V", line = 297)
    public static final void method2498(int arg0) {
        class705.field9776 = null;
        class55.field761 = null;
        class565.field7943 = null;
        class542.field7499 = -1;
        class313.field4093 = null;
        class713.field9903 = -1;
        class277.field3474 = null;
        class259.field3281 = -1;
        class584.field8164 = null;
        class353.field4537 = null;
        class289.field3788 = -1;
        field5862++;
        if (arg0 != 65280) {
            method2498(-125);
        }
        class407.field5164.method3603(-14913);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(II)V", line = 319)
    public final void method2499(int arg0, int arg1) {
        field5846++;
        this.field5864.method3793();
        this.field5853 = this.field5858.method2042(false, false);
        this.field5853.method298(4, -99, arg0 * arg1, this.field5856);
        this.field5864 = null;
        this.field5856 = null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IBII)V", line = 332)
    public final void method2500(int arg0, byte arg1, int arg2, int arg3) {
        this.field5855[this.field5847.field3561 * arg2 + arg0] = class683.method3840(this.field5855[this.field5847.field3561 * arg2 + arg0], 0x1 << arg3);
        field5851++;
        this.field5845++;
        if (arg1 >= -71) {
            this.method2501(-54, (byte) -34);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IB)V", line = 350)
    public final void method2501(int arg0, byte arg1) {
        field5861++;
        this.field5856 = this.field5858.method2359(arg0 * 4, true, 0);
        if (arg1 != -5) {
            method2504(114);
        }
        this.field5864 = new Stream(this.field5856, 0, arg0 * 4);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Leca;", line = 366)
    public static final class759 method2502(Throwable arg0, String arg1) {
        field5860++;
        class759 var2;
        if ((arg0 instanceof class759)) {
            var2 = (class759) arg0;
            var2.field10595 = var2.field10595 + ' ' + arg1;
        } else {
            var2 = new class759(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Llp;IIIII)V", line = 419)
    public class440(class395 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5847 = arg0;
        this.field5848 = arg2;
        this.field5855 = new int[this.field5847.field3561 * this.field5847.field3555];
        this.field5843 = arg4;
        this.field5858 = this.field5847.field5008;
        this.field5844 = arg5;
        this.field5852 = arg1;
        this.field5857 = arg3;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(II)V", line = 392)
    public final void method2503(int arg0, int arg1) {
        this.field5864.method3797(arg0 * arg1 + 3);
        field5854++;
        this.field5864.method3792(-1);
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(I)I", line = 401)
    public static final int method2504(int arg0) {
        field5859++;
        if (class628.field8647 == null) {
            return 0;
        } else {
            if (arg0 > -92) {
                field5868 = -113;
            }
            return class628.field8647.length * 2;
        }
    }
}
