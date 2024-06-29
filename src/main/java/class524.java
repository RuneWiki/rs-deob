import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class524 extends class540 {

    @OriginalMember(owner = "client!eaa", name = "A", descriptor = "I")
    public int field7478 = 0;

    @OriginalMember(owner = "client!eaa", name = "B", descriptor = "Lmg;")
    private class157 field7479;

    @OriginalMember(owner = "client!eaa", name = "t", descriptor = "I")
    public int field7471;

    @OriginalMember(owner = "client!eaa", name = "i", descriptor = "I")
    public int field7460;

    @OriginalMember(owner = "client!eaa", name = "r", descriptor = "I")
    public int field7469;

    @OriginalMember(owner = "client!eaa", name = "s", descriptor = "[I")
    private int[] field7470;

    @OriginalMember(owner = "client!eaa", name = "u", descriptor = "F")
    public float field7472;

    @OriginalMember(owner = "client!eaa", name = "w", descriptor = "I")
    public int field7474;

    @OriginalMember(owner = "client!eaa", name = "q", descriptor = "Lwk;")
    private class151 field7468;

    @OriginalMember(owner = "client!eaa", name = "j", descriptor = "I")
    public static int field7461;

    @OriginalMember(owner = "client!eaa", name = "k", descriptor = "I")
    public static int field7462;

    @OriginalMember(owner = "client!eaa", name = "m", descriptor = "I")
    public static int field7464;

    @OriginalMember(owner = "client!eaa", name = "n", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!eaa", name = "o", descriptor = "I")
    public static int field7466;

    @OriginalMember(owner = "client!eaa", name = "p", descriptor = "I")
    public static int field7467;

    @OriginalMember(owner = "client!eaa", name = "x", descriptor = "I")
    public static int field7475;

    @OriginalMember(owner = "client!eaa", name = "z", descriptor = "I")
    public static int field7477;

    @OriginalMember(owner = "client!eaa", name = "D", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!eaa", name = "y", descriptor = "Lcb;")
    public static class544 field7476;

    @OriginalMember(owner = "client!eaa", name = "v", descriptor = "Lfka;")
    private class741 field7473;

    @OriginalMember(owner = "client!eaa", name = "C", descriptor = "Ljaclib/memory/Stream;")
    private Stream field7480;

    @OriginalMember(owner = "client!eaa", name = "l", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field7463;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IBIIF)V")
    public final void method3046(int arg0, byte arg1, int arg2, int arg3, float arg4) {
        field7464++;
        if (arg1 != -51) {
            this.field7470 = null;
        }
        if (this.field7469 != -1) {
            class181 var6 = this.field7468.field883.method1263(this.field7469, (byte) 112);
            int var7 = var6.field2748 & 0xFF;
            if (var7 != 0 && var6.field2745 != 4) {
                int var8;
                if (arg2 < 0) {
                    var8 = 0;
                } else if (arg2 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg2 * 131586;
                }
                if (var7 == 256) {
                    arg3 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg3 = ((var8 & 0xFF00FF) * var7 + ((arg3 & 0xFF00FF) * var10) & 0xFF00FF00) + ((arg3 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field2739 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg3 >> 16 & 0xFF) * var11;
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
                arg3 = ((var12 & 0x5100FF00) << 8) + (var13 & 0xFF00) + (var14 >> 8);
            }
        }
        if (arg4 != 1.0F) {
            int var15 = arg3 >> 16 & 0xFF;
            int var16 = arg3 >> 8 & 0xFF;
            int var17 = arg3 & 0xFF;
            int var18 = (int) ((float) var15 * arg4);
            int var19 = (int) ((float) var16 * arg4);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var17 * arg4);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg3 = var19 << 8 | var18 << 16 | var20;
        }
        this.field7480.method3954(arg0 * 4);
        if (this.field7468.field2134 == 0) {
            this.field7480.method3951((byte) arg3);
            this.field7480.method3951((byte) (arg3 >> 8));
            this.field7480.method3951((byte) (arg3 >> 16));
        } else {
            this.field7480.method3951((byte) (arg3 >> 16));
            this.field7480.method3951((byte) (arg3 >> 8));
            this.field7480.method3951((byte) arg3);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IB[I)V")
    public final void method3047(int arg0, byte arg1, int[] arg2) {
        if (arg1 != 55) {
            this.field7480 = null;
        }
        field7467++;
        class532 var4 = this.field7468.method1153(this.field7478 * 3, arg1 - 53);
        Buffer var5 = var4.method48((byte) -31, true);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field7468.method1127(arg1 - 163, var5);
        int var7 = 0;
        int var8 = 32767;
        int var9 = -32768;
        if (Stream.method3956()) {
            label124: for (int var10 = 0; var10 < arg0; var10++) {
                int var11 = arg2[var10];
                int var12 = this.field7470[var11];
                short[] var13 = this.field7479.field2334[var11];
                if (var12 != 0 && var13 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var13.length <= var15) {
                                continue label124;
                            }
                            if ((0x1 << var14++ & var12) == 0) {
                                var15 += 3;
                            } else {
                                var7++;
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var13[var15++] & 0xFFFF;
                                    if (var8 > var17) {
                                        var8 = var17;
                                    }
                                    if (var9 < var17) {
                                        var9 = var17;
                                    }
                                    var6.method3950(var17);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            label100: for (int var18 = 0; var18 < arg0; var18++) {
                int var20 = arg2[var18];
                int var21 = this.field7470[var20];
                short[] var22 = this.field7479.field2334[var20];
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
                                    if (var8 > var26) {
                                        var8 = var26;
                                    }
                                    var6.method3962(var26);
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
        }
        var6.method3959();
        if (!var4.method49(arg1 - 11543) || var7 <= 0) {
            return;
        }
        this.field7468.method1078((this.field7479.field2312 & 0x8) != 0, (this.field7479.field2312 & 0x7) != 0, true, this.field7469);
        if (this.field7468.field2154) {
            this.field7468.method411(Integer.MAX_VALUE, this.field7474, this.field7460, this.field7471);
        }
        class468 var19 = this.field7468.method1043(false);
        var19.method2769(1.0F, 1.0F / this.field7472, 1.0F / this.field7472, -91);
        this.field7468.method1073(class505.field7237, 25216);
        this.field7468.method1091((byte) 54, 1, this.field7473);
        this.field7468.method1099(112, this.field7479.field2349);
        this.field7468.method1133(class415.field5856, var8, var4, 0, var9 + 1 - var8, var7, 6);
        this.field7468.method1048(true);
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BILsf;Lco;)V")
    public static final void method3048(byte arg0, int arg1, class547 arg2, class129 arg3) {
        field7465++;
        if (class636.field8961 >= 50) {
            return;
        }
        if (arg0 != 17) {
            method3052(null, false, 2, -83, -112);
        }
        if (arg3 == null || arg3.field1670 == null || arg3.field1670.length <= arg1 || arg3.field1670[arg1] == null) {
            return;
        }
        int var4 = arg3.field1670[arg1][0];
        int var5 = var4 >> 8;
        int var6 = (var4 & 0xF9) >> 5;
        if (arg3.field1670[arg1].length > 1) {
            int var7 = (int) ((double) arg3.field1670[arg1].length * Math.random());
            if (var7 > 0) {
                var5 = arg3.field1670[arg1][var7];
            }
        }
        int var8 = var4 & 0x1F;
        int var9 = 256;
        if (arg3.field1691 != null && arg3.field1682 != null) {
            var9 = (int) (Math.random() * (double) (arg3.field1682[arg1] - arg3.field1691[arg1])) + arg3.field1691[arg1];
        }
        int var10 = arg3.field1683 == null ? 255 : arg3.field1683[arg1];
        if (var8 == 0) {
            if (class251.field3549 == arg2) {
                if (!arg3.field1666) {
                    class490.method2864(var5, 0, true, var6, var9, var10);
                    return;
                }
                class256.method1686(var9, 0, (byte) 88, var5, false, var6, var10);
            }
        } else if (class145.field1852.field9003.method978((byte) -73) != 0) {
            int var11 = arg2.field7718 - 256 >> 9;
            int var12 = arg2.field7719 - 256 >> 9;
            int var13 = class251.field3549 == arg2 ? 0 : (var11 << 16) + (arg2.field7710 << 24) + (var12 << 8) + var8;
            class458.field6558[class636.field8961++] = new class472((byte) (arg3.field1666 ? 2 : 1), var5, var6, 0, var10, var13, var9, arg2);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(II)V")
    public final void method3049(int arg0, int arg1) {
        this.field7463 = this.field7468.method1109(1, true, arg1 * 4);
        if (arg0 > -15) {
            method3054(false);
        }
        field7461++;
        this.field7480 = new Stream(this.field7463, 0, arg1 * 4);
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "(II)V")
    public final void method3050(int arg0, int arg1) {
        field7466++;
        this.field7480.method3954(arg0 * 4 + arg1);
        this.field7480.method3951(-1);
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IZII)V")
    public final void method3051(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            this.method3051(-52, false, -17, -58);
        }
        this.field7470[this.field7479.field4420 * arg2 + arg3] = class281.method1904(this.field7470[this.field7479.field4420 * arg2 + arg3], 0x1 << arg0);
        field7462++;
        this.field7478++;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Ljava/lang/String;ZIII)V")
    public static final void method3052(String arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class325.method2111(arg0, arg2, arg1, arg3, null, (byte) -107, false);
        field7481++;
        if (arg4 >= -48) {
            field7476 = null;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V")
    public static final void method3053(int arg0) {
        if (arg0 > -21) {
            method3054(true);
        }
        for (class542 var1 = (class542) class622.field8773.method382(0); var1 != null; var1 = (class542) class622.field8773.method391(37)) {
            if (var1.field7599) {
                var1.field7599 = false;
            } else {
                class770.method4236(var1.field7594, 1);
            }
        }
        field7475++;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Z)V")
    public static void method3054(boolean arg0) {
        field7476 = null;
        if (arg0) {
            method3053(103);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IZ)V")
    public final void method3055(int arg0, boolean arg1) {
        this.field7480.method3959();
        field7477++;
        if (!arg1) {
            this.field7468 = null;
        }
        this.field7473 = this.field7468.method1139(6, false);
        this.field7473.method3455(4, 6838, arg0 * 4, this.field7463);
        this.field7463 = null;
        this.field7480 = null;
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lmg;IIIII)V")
    public class524(class157 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7479 = arg0;
        this.field7471 = arg5;
        this.field7460 = arg4;
        this.field7469 = arg1;
        this.field7470 = new int[this.field7479.field4425 * this.field7479.field4420];
        this.field7472 = arg2;
        this.field7474 = arg3;
        this.field7468 = this.field7479.field2323;
    }
}
