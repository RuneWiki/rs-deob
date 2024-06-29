import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class682 extends class65 {

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
    public int field9648 = 0;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "Lvha;")
    private class63 field9637;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "F")
    public float field9646;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
    public int field9642;

    @OriginalMember(owner = "client!oh", name = "B", descriptor = "I")
    public int field9651;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
    public int field9644;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "[I")
    private int[] field9638;

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "Lpj;")
    private class38 field9650;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
    public int field9645;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "Leo;")
    public static class321 field9636 = new class321();

    @OriginalMember(owner = "client!oh", name = "E", descriptor = "Lbea;")
    public static class539 field9654 = new class539();

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field9634;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public static int field9640;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public static int field9641;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    public static int field9643;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "I")
    public static int field9649;

    @OriginalMember(owner = "client!oh", name = "C", descriptor = "I")
    public static int field9652;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "Lfb;")
    private class669 field9635;

    @OriginalMember(owner = "client!oh", name = "D", descriptor = "Lfc;")
    public static class731 field9653;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "Ljaclib/memory/Stream;")
    private Stream field9647;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field9639;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIII)V")
    public final void method3802(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == -7117) {
            field9641++;
            this.field9638[this.field9637.field4956 * arg0 + arg1] = class112.method903(this.field9638[this.field9637.field4956 * arg0 + arg1], 0x1 << arg3);
            this.field9648++;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BFIII)V")
    public final void method3803(byte arg0, float arg1, int arg2, int arg3, int arg4) {
        int var6 = 21 % ((-arg0 - 13) / 33);
        field9652++;
        if (this.field9645 != -1) {
            class569 var7 = this.field9650.field7764.method1774(93, this.field9645);
            int var8 = var7.field8069 & 0xFF;
            if (var8 != 0 && var7.field8079 != 4) {
                int var9;
                if (arg2 < 0) {
                    var9 = 0;
                } else if (arg2 <= 127) {
                    var9 = arg2 * 131586;
                } else {
                    var9 = 16777215;
                }
                if (var8 == 256) {
                    arg4 = var9;
                } else {
                    int var11 = 256 - var8;
                    arg4 = ((arg4 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) >> 8;
                }
            }
            int var12 = var7.field8077 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = ((arg4 & 0xFF0000) >> 16) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = ((arg4 & 0xFF00) >> 8) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (arg4 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                arg4 = (var15 >> 8) + ((var13 & 0x2400FF00) << 8) + (var14 & 0xFF00);
            }
        }
        this.field9647.method2581(arg3 * 4);
        if (arg1 != 1.0F) {
            int var16 = arg4 >> 16 & 0xFF;
            int var17 = (arg4 & 0xFF45) >> 8;
            int var18 = (int) ((float) var16 * arg1);
            int var19 = arg4 & 0xFF;
            int var20 = (int) ((float) var17 * arg1);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            int var21 = (int) ((float) var19 * arg1);
            if (var21 < 0) {
                var21 = 0;
            } else if (var21 > 255) {
                var21 = 255;
            }
            arg4 = var21 | var20 << 8 | var18 << 16;
        }
        if (this.field9650.field628 == 0) {
            this.field9647.method2574((byte) arg4);
            this.field9647.method2574((byte) (arg4 >> 8));
            this.field9647.method2574((byte) (arg4 >> 16));
        } else {
            this.field9647.method2574((byte) (arg4 >> 16));
            this.field9647.method2574((byte) (arg4 >> 8));
            this.field9647.method2574((byte) arg4);
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(II)V")
    public final void method3804(int arg0, int arg1) {
        this.field9647.method2581(arg0 * arg1 + 3);
        field9649++;
        this.field9647.method2574(-1);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BI)V")
    public final void method3805(byte arg0, int arg1) {
        int var3 = 108 % ((arg0 - 61) / 35);
        field9634++;
        this.field9639 = this.field9650.method426(true, arg1 * 4, 32);
        this.field9647 = new Stream(this.field9639, 0, arg1 * 4);
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(II)V")
    public final void method3806(int arg0, int arg1) {
        field9643++;
        if (arg0 != 32767) {
            this.field9650 = null;
        }
        this.field9647.method2573();
        this.field9635 = this.field9650.method293(false, 6);
        this.field9635.method698(-114, this.field9639, 4, arg1 * 4);
        this.field9639 = null;
        this.field9647 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
    public static void method3807(byte arg0) {
        field9654 = null;
        field9636 = null;
        if (arg0 >= -46) {
            method3807((byte) 41);
        }
        field9653 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I[IB)V")
    public final void method3808(int arg0, int[] arg1, byte arg2) {
        field9640++;
        class743 var4 = this.field9650.method221(this.field9648 * 3, 112);
        Buffer var5 = var4.method926(true, -29944);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field9650.method368((byte) -121, var5);
        int var7 = 0;
        int var8 = 32767;
        if (arg2 <= 65) {
            this.method3804(-65, 38);
        }
        int var9 = -32768;
        if (Stream.method2572()) {
            label100: for (int var18 = 0; var18 < arg0; var18++) {
                int var20 = arg1[var18];
                short[] var21 = this.field9637.field1016[var20];
                int var22 = this.field9638[var20];
                if (var22 != 0 && var21 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var24 >= var21.length) {
                                continue label100;
                            }
                            if ((0x1 << var23++ & var22) == 0) {
                                var24 += 3;
                            } else {
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var21[var24++] & 0xFFFF;
                                    if (var9 < var26) {
                                        var9 = var26;
                                    }
                                    if (var26 < var8) {
                                        var8 = var26;
                                    }
                                    var6.method2585(var26);
                                }
                                var7++;
                            }
                        }
                    }
                }
            }
        } else {
            label126: for (int var10 = 0; var10 < arg0; var10++) {
                int var11 = arg1[var10];
                short[] var12 = this.field9637.field1016[var11];
                int var13 = this.field9638[var11];
                if (var13 != 0 && var12 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var15 >= var12.length) {
                                continue label126;
                            }
                            if ((0x1 << var14++ & var13) == 0) {
                                var15 += 3;
                            } else {
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var12[var15++] & 0xFFFF;
                                    var6.method2584(var17);
                                    if (var8 > var17) {
                                        var8 = var17;
                                    }
                                    if (var17 > var9) {
                                        var9 = var17;
                                    }
                                }
                                var7++;
                            }
                        }
                    }
                }
            }
        }
        var6.method2573();
        if (!var4.method925((byte) 115) || var7 <= 0) {
            return;
        }
        this.field9650.method421((this.field9637.field1005 & 0x8) != 0, 15, this.field9645, (this.field9637.field1005 & 0x7) != 0);
        if (this.field9650.field595) {
            this.field9650.method355(Integer.MAX_VALUE, this.field9651, this.field9644, this.field9642);
        }
        class341 var19 = this.field9650.method269(1);
        var19.method2179(1.0F / this.field9646, 1.0F, true, 1.0F / this.field9646);
        this.field9650.method342((byte) -121, class673.field9518);
        this.field9650.method327(this.field9635, 0, 1);
        this.field9650.method330(19661, this.field9637.field1019);
        this.field9650.method289(var7, var9 + 1 - var8, var8, var4, 0, class386.field5775, 0);
        this.field9650.method250(73);
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lvha;IIIII)V")
    public class682(class63 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field9637 = arg0;
        this.field9646 = arg2;
        this.field9642 = arg5;
        this.field9651 = arg3;
        this.field9644 = arg4;
        this.field9638 = new int[this.field9637.field4960 * this.field9637.field4956];
        this.field9650 = this.field9637.field1007;
        this.field9645 = arg1;
    }
}
