import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class225 {

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "Z")
    public boolean field3125 = true;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    private int field3124 = 0;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public int field3123 = -1;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public int field3129 = 128;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public int field3122;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public int field3126;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public int field3127;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public int field3128;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "([BIBIII)Z")
    public static final boolean method1239(byte[] arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field3120++;
        int var6 = 75 / ((arg2 - 49) / 32);
        boolean var7 = true;
        class179 var8 = new class179(arg0);
        int var9 = -1;
        label54: while (true) {
            int var10 = var8.method915((byte) 77);
            if (var10 == 0) {
                return var7;
            }
            var9 += var10;
            int var11 = 0;
            boolean var12 = false;
            while (true) {
                while (!var12) {
                    int var14 = var8.method885(true);
                    if (var14 == 0) {
                        continue label54;
                    }
                    var11 += var14 - 1;
                    int var15 = var11 & 0x3F;
                    int var16 = (var11 & 0xFCD) >> 6;
                    int var17 = var8.method895((byte) -96) >> 2;
                    int var18 = arg4 + var16;
                    int var19 = arg5 + var15;
                    if (var18 > 0 && var19 > 0 && (arg1 - 1) > var18 && var19 < arg3 - 1) {
                        class415 var20 = class173.field2084.method2297(50, var9);
                        if (var17 != 22 || class119.field1484 || var20.field5990 != 0 || var20.field5970 == 1 || var20.field5928) {
                            var12 = true;
                            if (!var20.method2467(0)) {
                                var7 = false;
                                class262.field3774++;
                            }
                        }
                    }
                }
                int var13 = var8.method885(true);
                if (var13 == 0) {
                    break;
                }
                var8.method895((byte) -111);
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILvt;I)V")
    private final void method1240(int arg0, class179 arg1, int arg2) {
        field3119++;
        if (arg0 != -3) {
            this.method1243((class179) null, 109);
        }
        if (arg2 == 1) {
            this.field3124 = arg1.method899((byte) 112);
            this.method1241((byte) -88, this.field3124);
        } else if (arg2 == 2) {
            this.field3123 = arg1.method916(21933);
            if (this.field3123 == 65535) {
                this.field3123 = -1;
                return;
            }
        } else if (arg2 == 3) {
            this.field3129 = arg1.method916(21933);
        } else if (arg2 == 4) {
            this.field3125 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BI)V")
    private final void method1241(byte arg0, int arg1) {
        field3115++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg1 & 0xFF88) >> 8) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        this.field3122 = (int) (var17 * 256.0D);
        this.field3126 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field3122 < 0) {
            this.field3122 = 0;
        } else if (this.field3122 > 255) {
            this.field3122 = 255;
        }
        if (arg0 != -88) {
            this.field3122 = -73;
        }
        if (this.field3126 < 0) {
            this.field3126 = 0;
        } else if (this.field3126 > 255) {
            this.field3126 = 255;
        }
        if (var17 > 0.5D) {
            this.field3127 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field3127 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field3127 < 1) {
            this.field3127 = 1;
        }
        this.field3128 = (int) ((double) this.field3127 * var19);
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(BI)V")
    public static final void method1242(byte arg0, int arg1) {
        class457.method2691(-1);
        field3118++;
        int var2 = class75.field907.method2124(16, arg1).field2761;
        if (var2 == 0) {
            return;
        }
        int var3 = -3 % ((6 - arg0) / 35);
        int var4 = class75.field909.field6490[arg1];
        if (var2 == 6) {
            class56.field713 = var4;
        }
        if (var2 == 5) {
            class381.field5402 = var4;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lvt;I)V")
    public final void method1243(class179 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method895((byte) -120);
            if (var3 == 0) {
                field3117++;
                if (arg1 != -27311) {
                    this.method1241((byte) 63, 37);
                    return;
                }
                return;
            }
            this.method1240(-3, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZIIIII)V")
    public static final void method1244(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3121++;
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var6 = arg3 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        if (arg4 != 5172) {
            method1244(true, 81, 114, 80, -58, -65);
        }
        int var7 = class349.field5017 + ((class94.field1174 - class349.field5017) * var6 / 100);
        if (class438.field6285 > var7) {
            var7 = class438.field6285;
        } else if (class172.field2078 < var7) {
            var7 = class172.field2078;
        }
        int var8 = var7 * 512 * arg3 / (arg2 * 334);
        if (class337.field4852 > var8) {
            short var9 = class337.field4852;
            var7 = arg2 * var9 * 334 / (arg3 * 512);
            if (class172.field2078 < var7) {
                var7 = class172.field2078;
                int var10 = var7 * 512 * arg3 / (var9 * 334);
                int var11 = (arg2 - var10) / 2;
                if (arg0) {
                    class231.field3205.method1352();
                    class231.field3205.method1759(-6923, arg3, var11, arg1, -16777216, arg5);
                    class231.field3205.method1759(arg4 - 12095, arg3, var11, arg1, -16777216, arg5 + arg2 - var11);
                }
                arg5 += var11;
                arg2 -= var11 * 2;
            }
        } else if (var8 > class406.field5778) {
            short var12 = class406.field5778;
            var7 = arg2 * 334 * var12 / (arg3 * 512);
            if (class438.field6285 > var7) {
                var7 = class438.field6285;
                int var13 = arg2 * var12 * 334 / (var7 * 512);
                int var14 = (arg3 - var13) / 2;
                if (arg0) {
                    class231.field3205.method1352();
                    class231.field3205.method1759(-6923, var14, arg2, arg1, -16777216, arg5);
                    class231.field3205.method1759(arg4 - 12095, var14, arg2, arg1 + arg3 - var14, -16777216, arg5);
                }
                arg1 += var14;
                arg3 -= var14 * 2;
            }
        }
        class118.field1460 = (short) arg3;
        class191.field2622 = arg3 * var7 / 334;
        class324.field4678 = arg5;
        class280.field4080 = arg1;
        class61.field766 = (short) arg2;
    }
}
