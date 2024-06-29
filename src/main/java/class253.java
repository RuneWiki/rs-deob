import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class253 extends class496 {

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    public int field3707 = 0;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "Leo;")
    private class516 field3700;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public int field3702;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public int field3698;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
    public int field3704;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "F")
    public float field3694;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "Lkw;")
    private class174 field3709;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "[I")
    private int[] field3705;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public int field3696;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "Lqu;")
    public static class364 field3690 = new class364(81, 8);

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "Ltq;")
    private class90 field3692;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "Ljaclib/memory/Stream;")
    private Stream field3691;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field3710;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
    public static void method1600(byte arg0) {
        field3690 = null;
        int var1 = -10 % ((arg0 - 71) / 49);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IBIIII)V")
    public static final void method1601(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field3693++;
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg0 * arg0;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg3 << 1) - 3) * var11;
        if (arg1 != 51) {
            method1607(null, -60, -21, -4, null);
        }
        int var19 = (var6 + 1) * var16;
        int var20 = (arg3 - 1) * var15;
        if (class483.field7334 <= arg5 && class202.field3021 >= arg5) {
            int var21 = class406.method2430(class130.field1712, arg0 + arg4, class401.field5755, 64);
            int var22 = class406.method2430(class130.field1712, arg4 - arg0, class401.field5755, arg1 ^ 0x73);
            class69.method418(arg2, class47.field558[arg5], var21, (byte) 117, var22);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var17 += var16;
                    var19 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var17 += var16;
                var19 += var16;
                var6++;
            }
            var13 += -var20;
            var14 += -var18;
            var7--;
            var20 -= var15;
            var18 -= var15;
            int var23 = arg5 - var7;
            int var24 = arg5 + var7;
            if (var24 >= class483.field7334 && var23 <= class202.field3021) {
                int var25 = class406.method2430(class130.field1712, arg4 + var6, class401.field5755, 64);
                int var26 = class406.method2430(class130.field1712, arg4 - var6, class401.field5755, 64);
                if (class483.field7334 <= var23) {
                    class69.method418(arg2, class47.field558[var23], var25, (byte) 117, var26);
                }
                if (var24 <= class202.field3021) {
                    class69.method418(arg2, class47.field558[var24], var25, (byte) 117, var26);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)V")
    public final void method1602(int arg0, byte arg1) {
        field3697++;
        this.field3691.method3329(arg0 * 4 + 3);
        this.field3691.method3330(arg1);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIB)V")
    public final void method1603(int arg0, int arg1, int arg2, byte arg3) {
        this.field3705[this.field3700.field8121 * arg0 + arg1] = class313.method1926(this.field3705[this.field3700.field8121 * arg0 + arg1], 0x1 << arg2);
        field3708++;
        this.field3707++;
        if (arg3 > -55) {
            this.field3698 = -60;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(IB)V")
    public final void method1604(int arg0, byte arg1) {
        field3701++;
        this.field3710 = this.field3709.method1112(arg0 * 4, true, (byte) 85);
        if (arg1 != -41) {
            this.field3707 = 46;
        }
        this.field3691 = new Stream(this.field3710, 0, arg0 * 4);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)V")
    public final void method1605(int arg0, int arg1) {
        this.field3691.method3332();
        field3706++;
        this.field3692 = this.field3709.method304(false, false);
        this.field3692.method408(this.field3710, arg1 * 4, 6831, 4);
        this.field3691 = null;
        this.field3710 = null;
        if (arg0 > -87) {
            this.method1605(-1, -98);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IFIII)V")
    public final void method1606(int arg0, float arg1, int arg2, int arg3, int arg4) {
        if (this.field3702 != -1) {
            class83 var6 = this.field3709.field2262.method1762(this.field3702, (byte) 45);
            int var7 = var6.field962 & 0xFF;
            if (var7 != 0 && var6.field968 != 4) {
                int var8;
                if (arg3 < 0) {
                    var8 = 0;
                } else if (arg3 <= 127) {
                    var8 = arg3 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg4 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg4 = ((arg4 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((var8 & 0xFF00) * var7 + ((arg4 & 0xFF00) * var10) & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field960 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg4 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg4 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg4 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg4 = (var14 >> 8) + (var12 << 8 & 0xFF007D) + (var13 & 0xFF00);
            }
        }
        if (arg0 != 256) {
            this.field3700 = null;
        }
        field3699++;
        this.field3691.method3329(arg2 * 4);
        if (arg1 != 1.0F) {
            int var15 = (arg4 & 0xFFCA15) >> 16;
            int var16 = arg4 >> 8 & 0xFF;
            int var17 = arg4 & 0xFF;
            int var18 = (int) ((float) var15 * arg1);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg1);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var17 * arg1);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg4 = var19 << 8 | var18 << 16 | var20;
        }
        if (this.field3709.field2639 == 0) {
            this.field3691.method3330((byte) arg4);
            this.field3691.method3330((byte) (arg4 >> 8));
            this.field3691.method3330((byte) (arg4 >> 16));
        } else {
            this.field3691.method3330((byte) (arg4 >> 16));
            this.field3691.method3330((byte) (arg4 >> 8));
            this.field3691.method3330((byte) arg4);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lk;III[Z)Z")
    public static final boolean method1607(class88 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class287.field4219 != class235.field3455) {
            int var6 = class562.field8337[arg1].method1323(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class543 var8 = class562.field8337[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method1323(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method1325(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method1322(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([III)V")
    public final void method1608(int[] arg0, int arg1, int arg2) {
        field3695++;
        class512 var4 = this.field3709.method1120(this.field3707 * 3, 27);
        Buffer var5 = var4.method410(true, (byte) -56);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field3709.method1163(var5, -4455);
        int var7 = 0;
        int var8 = 32767;
        int var9 = -32768;
        if (arg2 != -128) {
            return;
        }
        if (Stream.method3328()) {
            label100: for (int var18 = 0; var18 < arg1; var18++) {
                int var20 = arg0[var18];
                short[] var21 = this.field3700.field7655[var20];
                int var22 = this.field3705[var20];
                if (var22 != 0 && var21 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var21.length <= var24) {
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
                                    var6.method3337(var26);
                                    if (var8 > var26) {
                                        var8 = var26;
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
                int var12 = this.field3705[var11];
                short[] var13 = this.field3700.field7655[var11];
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
                                    var6.method3336(var17);
                                    if (var8 > var17) {
                                        var8 = var17;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        var6.method3332();
        if (!var4.method411(-118) || var7 <= 0) {
            return;
        }
        this.field3709.method1171((this.field3700.field7641 & 0x7) != 0, arg2 + 128, this.field3702, (this.field3700.field7641 & 0x8) != 0);
        if (this.field3709.field2563) {
            this.field3709.method979(Integer.MAX_VALUE, this.field3704, this.field3696, this.field3698);
        }
        class124 var19 = this.field3709.method1122((byte) 65);
        var19.method758((byte) 100, 1.0F / this.field3694, 1.0F, 1.0F / this.field3694);
        this.field3709.method1100(class235.field3452, -1);
        this.field3709.method326(arg2 + 171, this.field3700.field7670);
        this.field3709.method296(1, this.field3692, 113);
        this.field3709.method292(false, var4, 0, class386.field5653, var7, var8, var9 + 1 - var8);
        this.field3709.method1109(5);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)Z")
    public static final boolean method1609(int arg0, int arg1, int arg2) {
        if (arg2 != 15466) {
            field3690 = null;
        }
        field3703++;
        return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Leo;IIIII)V")
    public class253(class516 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3700 = arg0;
        this.field3702 = arg1;
        this.field3698 = arg5;
        this.field3704 = arg3;
        this.field3694 = arg2;
        this.field3709 = this.field3700.field7653;
        this.field3705 = new int[this.field3700.field8121 * this.field3700.field8118];
        this.field3696 = arg4;
    }
}
