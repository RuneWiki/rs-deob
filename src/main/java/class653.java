import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class653 extends class314 {

    @OriginalMember(owner = "client!waa", name = "L", descriptor = "I")
    public static int field9134;

    @OriginalMember(owner = "client!waa", name = "N", descriptor = "I")
    public static int field9136;

    @OriginalMember(owner = "client!waa", name = "O", descriptor = "I")
    public static int field9137;

    @OriginalMember(owner = "client!waa", name = "P", descriptor = "I")
    public static int field9138;

    @OriginalMember(owner = "client!waa", name = "Q", descriptor = "I")
    public static int field9139;

    @OriginalMember(owner = "client!waa", name = "R", descriptor = "I")
    public static int field9140;

    @OriginalMember(owner = "client!waa", name = "S", descriptor = "I")
    public static int field9141;

    @OriginalMember(owner = "client!waa", name = "T", descriptor = "I")
    public static int field9142;

    @OriginalMember(owner = "client!waa", name = "M", descriptor = "[Lft;")
    private class4[] field9135;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(IB)[[I")
    public final int[][] method4(int arg0, byte arg1) {
        ++field9136;
        int[][] var3 = super.field4931.method1345(arg0, 0);
        if (super.field4931.field2799) {
            int var4 = class81.field1009;
            int var5 = class246.field3926;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field4931.method1343((byte) 114);
            this.method3765(var6, 27973);
            for (int var8 = 0; var8 < class246.field3926; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~var14 > ~class81.field1009; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class453.method2846(4080, var15 << 4);
                    var12[var14] = class453.method2846(var15, 65280) >> 4;
                    var11[var14] = class453.method2846(var15, 16711680) >> 12;
                }
            }
        }
        if (arg1 <= 68) {
            this.field9135 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIBI)I")
    public static final int method3760(int arg0, int arg1, byte arg2, int arg3) {
        ++field9139;
        int var4 = arg0 & 3;
        if (var4 == 0) {
            return arg3;
        } else if (~var4 == -2) {
            return arg1;
        } else if (~var4 == -3) {
            return -arg3 + 4095;
        } else {
            if (arg2 >= -113) {
                method3762(64, -28, -118);
            }
            return -arg1 + 4095;
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "()V")
    public static final void method3761() {
        for (int var0 = class453.field6807; var0 < class524.field7649; ++var0) {
            for (int var1 = 0; var1 < class43.field597; ++var1) {
                for (int var2 = 0; var2 < class541.field7896; ++var2) {
                    class252 var3 = class454.field6818[var0][var1][var2];
                    if (var3 != null) {
                        class563 var4 = var3.field4029;
                        class563 var5 = var3.field4019;
                        if (var4 != null && var4.method398((byte) -110)) {
                            class370.method2444(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method398((byte) -100)) {
                                class370.method2444(var5, var0, var1, var2, 1, 1);
                                var5.method415(0, 0, 1, class595.field8435, false, 0, var4);
                                var5.method404((byte) -102);
                            }
                            var4.method404((byte) -110);
                        }
                        for (class531 var6 = var3.field4026; var6 != null; var6 = var6.field7736) {
                            class459 var8 = var6.field7739;
                            if (var8 != null && var8.method398((byte) -112)) {
                                class370.method2444(var8, var0, var1, var2, var8.field6870 - var8.field6865 + 1, var8.field6871 - var8.field6869 + 1);
                                var8.method404((byte) -41);
                            }
                        }
                        class539 var7 = var3.field4025;
                        if (var7 != null && var7.method398((byte) -100)) {
                            class3.method15(var7, var0, var1, var2);
                            var7.method404((byte) -43);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "(III)Z")
    public static final boolean method3762(int arg0, int arg1, int arg2) {
        ++field9134;
        if (!class347.method2348((byte) 110, arg0, arg2)) {
            return false;
        } else {
            int var3 = 47 % ((arg1 - 42) / 60);
            return ~(arg0 & 36864) != -1 | class698.method3940(arg0, arg2, 1) | class70.method724(256, arg2, arg0) ? true : ~(arg2 & 55) == -1 & ((arg0 & 8192) != 0 | class71.method727(arg2, arg0, false) | class641.method3716(arg0, arg2, (byte) -125));
        }
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(B)V")
    public static final void method3763(byte arg0) {
        ++field9142;
        int var1 = class99.field1607;
        if (arg0 < -64) {
            int[] var2 = class359.field5700;
            for (int var3 = 0; var1 > var3; ++var3) {
                class304 var9 = class597.field8465[var2[var3]];
                if (var9 != null && ~var9.field4246 < -1) {
                    --var9.field4246;
                    if (var9.field4246 == 0) {
                        var9.field4182 = null;
                    }
                }
            }
            for (int var4 = 0; var4 < class283.field4523; ++var4) {
                long var5 = (long) class102.field1690[var4];
                class348 var7 = (class348) class592.field8395.method1558(var5, (byte) -93);
                if (var7 != null) {
                    class589 var8 = var7.field5577;
                    if (var8.field4246 > 0) {
                        --var8.field4246;
                        if (~var8.field4246 == -1) {
                            var8.field4182 = null;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(II)[I")
    public final int[] method6(int arg0, int arg1) {
        ++field9138;
        if (arg1 <= 109) {
            return null;
        } else {
            int[] var3 = super.field4928.method534((byte) -128, arg0);
            if (super.field4928.field618) {
                this.method3765(super.field4928.method531((byte) -106), 27973);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "()V")
    public class653() {
        super(0, true);
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(B[B)Lf;")
    public static final class702 method3764(byte arg0, byte[] arg1) {
        ++field9140;
        if (arg0 >= -73) {
            method3761();
        }
        if (arg1 == null) {
            throw new RuntimeException("");
        } else {
            while (true) {
                try {
                    Image var2 = Toolkit.getDefaultToolkit().createImage(arg1);
                    MediaTracker var3 = new MediaTracker(class157.field2684);
                    var3.addImage(var2, 0);
                    var3.waitForAll();
                    int var4 = var2.getWidth(class157.field2684);
                    int var5 = var2.getHeight(class157.field2684);
                    if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                        int[] var6 = new int[var4 * var5];
                        PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                        var7.grabPixels();
                        return class627.field8857.method306(var6, 0, var4, var4, var5);
                    }
                    throw new RuntimeException("");
                } catch (InterruptedException var8) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "([[II)V")
    private final void method3765(int[][] arg0, int arg1) {
        ++field9141;
        int var3 = class81.field1009;
        int var4 = class246.field3926;
        class91.method812(false, arg0);
        class316.method2162(0, arg1 ^ -11830, class66.field849, 0, class504.field7373);
        if (arg1 == 27973) {
            if (this.field9135 != null) {
                for (int var5 = 0; ~this.field9135.length < ~var5; ++var5) {
                    class4 var6 = this.field9135[var5];
                    int var7 = var6.field32;
                    int var8 = var6.field28;
                    if (var7 >= 0) {
                        if (var8 >= 0) {
                            var6.method22(var4, var3, (byte) -128);
                        } else {
                            var6.method19(var3, arg1 ^ 27972, var4);
                        }
                    } else if (~var8 <= -1) {
                        var6.method21(var3, 8746, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(BLie;I)V")
    public final void method5(byte arg0, class6 arg1, int arg2) {
        ++field9137;
        if (arg2 != 0) {
            if (~arg2 == -2) {
                super.field4936 = ~arg1.method70(-9059) == -2;
            }
        } else {
            this.field9135 = new class4[arg1.method70(-9059)];
            for (int var4 = 0; ~this.field9135.length < ~var4; ++var4) {
                int var5 = arg1.method70(-9059);
                if (var5 != 0) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field9135[var4] = class561.method3336(arg1, 83);
                            }
                        } else {
                            this.field9135[var4] = class371.method2450(arg1, -3);
                        }
                    } else {
                        this.field9135[var4] = class145.method1231(arg1, 1024);
                    }
                } else {
                    this.field9135[var4] = class440.method2782(arg1, 0);
                }
            }
        }
        if (arg0 >= -1) {
            this.field9135 = null;
        }
    }
}
