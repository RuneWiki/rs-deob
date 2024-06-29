import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class510 extends class435 {

    @OriginalMember(owner = "client!sv", name = "G", descriptor = "I")
    public int field7593 = 0;

    @OriginalMember(owner = "client!sv", name = "t", descriptor = "Lsq;")
    private class194 field7580;

    @OriginalMember(owner = "client!sv", name = "C", descriptor = "I")
    public int field7589;

    @OriginalMember(owner = "client!sv", name = "z", descriptor = "F")
    public float field7586;

    @OriginalMember(owner = "client!sv", name = "w", descriptor = "I")
    public int field7583;

    @OriginalMember(owner = "client!sv", name = "q", descriptor = "I")
    public int field7577;

    @OriginalMember(owner = "client!sv", name = "K", descriptor = "I")
    public int field7597;

    @OriginalMember(owner = "client!sv", name = "D", descriptor = "[I")
    private int[] field7590;

    @OriginalMember(owner = "client!sv", name = "J", descriptor = "Lnh;")
    private class495 field7596;

    @OriginalMember(owner = "client!sv", name = "F", descriptor = "I")
    public static int field7592 = 0;

    @OriginalMember(owner = "client!sv", name = "r", descriptor = "I")
    public static int field7578;

    @OriginalMember(owner = "client!sv", name = "u", descriptor = "I")
    public static int field7581;

    @OriginalMember(owner = "client!sv", name = "v", descriptor = "I")
    public static int field7582;

    @OriginalMember(owner = "client!sv", name = "x", descriptor = "I")
    public static int field7584;

    @OriginalMember(owner = "client!sv", name = "y", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!sv", name = "E", descriptor = "I")
    public static int field7591;

    @OriginalMember(owner = "client!sv", name = "H", descriptor = "I")
    public static int field7594;

    @OriginalMember(owner = "client!sv", name = "I", descriptor = "I")
    public static int field7595;

    @OriginalMember(owner = "client!sv", name = "L", descriptor = "I")
    public static int field7598;

    @OriginalMember(owner = "client!sv", name = "A", descriptor = "Lwf;")
    private class483 field7587;

    @OriginalMember(owner = "client!sv", name = "B", descriptor = "Ljaclib/memory/Stream;")
    private Stream field7588;

    @OriginalMember(owner = "client!sv", name = "s", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field7579;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIB)V")
    public final void method3032(int arg0, int arg1, int arg2, byte arg3) {
        field7585++;
        this.field7590[this.field7580.field9706 * arg1 + arg0] = class460.method2676(this.field7590[this.field7580.field9706 * arg1 + arg0], 0x1 << arg2);
        this.field7593++;
        int var5 = 6 / ((-arg3 - 51) / 37);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(II[I)V")
    public final void method3033(int arg0, int arg1, int[] arg2) {
        field7591++;
        class175 var4 = this.field7596.method2966(arg0, this.field7593 * 3);
        Buffer var5 = var4.method1283((byte) 0, true);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field7596.method2912(91, var5);
        int var7 = arg0;
        int var8 = 32767;
        int var9 = -32768;
        if (Stream.method2042()) {
            label123: for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = arg2[var10];
                short[] var12 = this.field7580.field3015[var11];
                int var13 = this.field7590[var11];
                if (var13 != 0 && var12 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var15 >= var12.length) {
                                continue label123;
                            }
                            if ((0x1 << var14++ & var13) == 0) {
                                var15 += 3;
                            } else {
                                var7++;
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var12[var15++] & 0xFFFF;
                                    var6.method2036(var17);
                                    if (var17 > var9) {
                                        var9 = var17;
                                    }
                                    if (var8 > var17) {
                                        var8 = var17;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            label98: for (int var18 = 0; var18 < arg1; var18++) {
                int var20 = arg2[var18];
                int var21 = this.field7590[var20];
                short[] var22 = this.field7580.field3015[var20];
                if (var21 != 0 && var22 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var22.length <= var24) {
                                continue label98;
                            }
                            if ((0x1 << var23++ & var21) == 0) {
                                var24 += 3;
                            } else {
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var22[var24++] & 0xFFFF;
                                    if (var8 > var26) {
                                        var8 = var26;
                                    }
                                    if (var9 < var26) {
                                        var9 = var26;
                                    }
                                    var6.method2038(var26);
                                }
                                var7++;
                            }
                        }
                    }
                }
            }
        }
        var6.method2034();
        if (!var4.method1284(-28439) || var7 <= 0) {
            return;
        }
        this.field7596.method2922(this.field7589, -27382, ~(this.field7580.field3007 & 0x8) != -1, (this.field7580.field3007 & 0x7) != 0);
        if (this.field7596.field7359) {
            this.field7596.method809(Integer.MAX_VALUE, this.field7597, this.field7577, this.field7583);
        }
        class14 var19 = this.field7596.method2946((byte) -124);
        var19.method190(-114, 1.0F, 1.0F / this.field7586, 1.0F / this.field7586);
        this.field7596.method2949(class303.field4244, (byte) -123);
        this.field7596.method131(3438, this.field7587, 1);
        this.field7596.method98((byte) 121, this.field7580.field3045);
        this.field7596.method116(var7, 0, var9 + 1 - var8, var4, class334.field4660, (byte) -50, var8);
        this.field7596.method2954((byte) 96);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IFBII)V")
    public final void method3034(int arg0, float arg1, byte arg2, int arg3, int arg4) {
        field7582++;
        int var6 = -68 % ((-arg2 - 51) / 58);
        if (this.field7589 != -1) {
            class377 var7 = this.field7596.field1459.method2359(-125, this.field7589);
            int var8 = var7.field5227 & 0xFF;
            if (var8 != 0 && var7.field5217 != 4) {
                int var9;
                if (arg0 < 0) {
                    var9 = 0;
                } else if (arg0 > 127) {
                    var9 = 16777215;
                } else {
                    var9 = arg0 * 131586;
                }
                if (var8 == 256) {
                    arg3 = var9;
                } else {
                    int var11 = 256 - var8;
                    arg3 = ((var9 & 0xFF00) * var8 + ((arg3 & 0xFF00) * var11) & 0xFF0000) + ((arg3 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field5233 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = ((arg3 & 0xFF0000) >> 16) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = ((arg3 & 0xFF00) >> 8) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (arg3 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                arg3 = (var14 & 0xFF00) + ((var13 & 0xB300FF00) << 8) + (var15 >> 8);
            }
        }
        this.field7588.method2031(arg4 * 4);
        if (arg1 != 1.0F) {
            int var16 = (arg3 & 0xFF7D9B) >> 16;
            int var17 = arg3 >> 8 & 0xFF;
            int var18 = arg3 & 0xFF;
            int var19 = (int) ((float) var16 * arg1);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var17 * arg1);
            int var21 = (int) ((float) var18 * arg1);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            if (var21 < 0) {
                var21 = 0;
            } else if (var21 > 255) {
                var21 = 255;
            }
            arg3 = var21 | var19 << 16 | var20 << 8;
        }
        if (this.field7596.field7304 == 0) {
            this.field7588.method2029((byte) arg3);
            this.field7588.method2029((byte) (arg3 >> 8));
            this.field7588.method2029((byte) (arg3 >> 16));
        } else {
            this.field7588.method2029((byte) (arg3 >> 16));
            this.field7588.method2029((byte) (arg3 >> 8));
            this.field7588.method2029((byte) arg3);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)Loda;")
    public static final class653 method3035(int arg0) {
        field7584++;
        return arg0 == 1 ? class105.method882(arg0 + 1, 1) : null;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(III)Z")
    public static final boolean method3036(int arg0, int arg1, int arg2) {
        if (arg2 == 256) {
            field7598++;
            return (arg0 & 0x100) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZI)V")
    public final void method3037(boolean arg0, int arg1) {
        this.field7588.method2034();
        field7595++;
        this.field7587 = this.field7596.method119(arg0, 0);
        this.field7587.method534(4, this.field7579, arg1 * 4, (byte) -102);
        this.field7579 = null;
        this.field7588 = null;
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(IB)V")
    public final void method3038(int arg0, byte arg1) {
        this.field7588.method2031(arg0 * 4 + 3);
        if (arg1 == 40) {
            field7594++;
            this.field7588.method2029(-1);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)V")
    public final void method3039(int arg0, int arg1) {
        field7578++;
        this.field7579 = this.field7596.method2945((byte) -127, arg0 * 4, true);
        this.field7588 = new Stream(this.field7579, 0, arg0 * 4);
        if (arg1 > -81) {
            this.method3033(-37, 9, null);
        }
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lsq;IIIII)V")
    public class510(class194 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7580 = arg0;
        this.field7589 = arg1;
        this.field7586 = arg2;
        this.field7583 = arg5;
        this.field7577 = arg4;
        this.field7597 = arg3;
        this.field7590 = new int[this.field7580.field9706 * this.field7580.field9703];
        this.field7596 = this.field7580.field3003;
    }
}
