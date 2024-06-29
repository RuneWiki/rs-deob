import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class352 extends class290 {

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "[I")
    private int[] field5484 = new int[this.field4582];

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "Z")
    public static boolean field5485 = false;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
    public static int field5479 = 0;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "[Lsj;")
    public static class284[] field5488 = new class284[4];

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "[S")
    public static short[] field5481 = new short[256];

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
    private int field5480;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    private int field5483;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "[B")
    private byte[] field5490;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BII)V")
    public void method1578(byte arg0, int arg1, int arg2) {
        this.field5490[this.field5483++] = (byte) (class272.method1842(arg0 >> 1, 127) + 127);
        ++field5487;
        if (arg2 != 16080) {
            this.method863(10);
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V")
    public final void method860(int arg0) {
        ++field5486;
        this.field5480 = Math.abs(this.field5480);
        if (this.field5480 >= 4096) {
            this.field5480 = 4095;
        }
        this.method1578((byte) (this.field5480 >> 4), this.field5483++, 16080);
        this.field5480 = 0;
        if (arg0 != 28094) {
            field5485 = false;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
    public final void method863(int arg0) {
        this.field5483 = 0;
        ++field5478;
        this.field5480 = 0;
        if (arg0 != 255) {
            field5481 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V")
    public final void method859(int arg0, int arg1, int arg2) {
        if (arg0 != -15289) {
            field5485 = false;
        }
        this.field5480 += this.field5484[arg2] * arg1 >> 12;
        ++field5482;
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V")
    public static void method2334(int arg0) {
        field5488 = null;
        if (arg0 != 128) {
            method2334(-27);
        }
        field5481 = null;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(IIIIIF)V")
    public class352(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; super.field4582 > var7; ++var7) {
            this.field5484[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V")
    public static final void method2335(int arg0) {
        ++field5491;
        int var1 = class203.field3094 * 128 + 64;
        int var2 = class296.field4667 * 128 - -64;
        int var3 = class532.method3165(class201.field3057, var1, false, var2) + -class322.field5016;
        if (class418.field6341 >= 100) {
            class163.field2367 = class203.field3094 * 128 - -64;
            class98.field1404 = class296.field4667 * 128 + 64;
            class371.field5703 = class532.method3165(class201.field3057, class163.field2367, false, class98.field1404) - class322.field5016;
        } else {
            if (class163.field2367 < var1) {
                class163.field2367 += class500.field7505 - -((-class163.field2367 + var1) * class418.field6341 / 1000);
                if (~class163.field2367 < ~var1) {
                    class163.field2367 = var1;
                }
            }
            if (~class163.field2367 < ~var1) {
                class163.field2367 -= class500.field7505 - -((-var1 + class163.field2367) * class418.field6341 / 1000);
                if (class163.field2367 < var1) {
                    class163.field2367 = var1;
                }
            }
            if (var3 > class371.field5703) {
                class371.field5703 += class500.field7505 - -((-class371.field5703 + var3) * class418.field6341 / 1000);
                if (var3 < class371.field5703) {
                    class371.field5703 = var3;
                }
            }
            if (var2 > class98.field1404) {
                class98.field1404 += (-class98.field1404 + var2) * class418.field6341 / 1000 + class500.field7505;
                if (class98.field1404 > var2) {
                    class98.field1404 = var2;
                }
            }
            if (~var3 > ~class371.field5703) {
                class371.field5703 -= (-var3 + class371.field5703) * class418.field6341 / 1000 + class500.field7505;
                if (~var3 < ~class371.field5703) {
                    class371.field5703 = var3;
                }
            }
            if (~class98.field1404 < ~var2) {
                class98.field1404 -= (-var2 + class98.field1404) * class418.field6341 / 1000 + class500.field7505;
                if (~class98.field1404 > ~var2) {
                    class98.field1404 = var2;
                }
            }
        }
        int var4 = class71.field1076 * 128 + 64;
        int var5 = class259.field4185 * 128 - arg0;
        int var6 = class532.method3165(class201.field3057, var5, false, var4) - class46.field604;
        int var7 = var5 - class163.field2367;
        int var8 = -class371.field5703 + var6;
        int var9 = -class98.field1404 + var4;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = 16383 & (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D);
        int var12 = 16383 & (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D);
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (class220.field3723 < var11) {
            class220.field3723 += class460.field7101 - -((-class220.field3723 + var11 >> 3) * class240.field3913 / 1000) << 3;
            if (~class220.field3723 < ~var11) {
                class220.field3723 = var11;
            }
        }
        if (var11 < class220.field3723) {
            class220.field3723 -= class460.field7101 - -((class220.field3723 - var11 >> 3) * class240.field3913 / 1000) << 3;
            if (~var11 < ~class220.field3723) {
                class220.field3723 = var11;
            }
        }
        int var13 = -class387.field5912 + var12;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class387.field5912 += class240.field3913 * var14 / 1000 + class460.field7101 << 3;
            class387.field5912 &= 16383;
        }
        if (~var14 > -1) {
            class387.field5912 -= -var14 * class240.field3913 / 1000 + class460.field7101 << 3;
            class387.field5912 &= 16383;
        }
        int var15 = -class387.field5912 + var12;
        if (~var15 < -8193) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && ~var14 > -1) {
            class387.field5912 = var12;
        }
        class253.field4106 = 0;
    }
}
