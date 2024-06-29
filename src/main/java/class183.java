import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public abstract class class183 implements class733 {

    @OriginalMember(owner = "client!qga", name = "n", descriptor = "Leq;")
    public class209 field2621;

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "Lpd;")
    public class256 field2610;

    @OriginalMember(owner = "client!qga", name = "d", descriptor = "Leq;")
    private class209 field2611;

    @OriginalMember(owner = "client!qga", name = "e", descriptor = "I")
    public static int field2612 = 1339;

    @OriginalMember(owner = "client!qga", name = "p", descriptor = "[I")
    public static int[] field2623 = new int[25];

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!qga", name = "f", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!qga", name = "g", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!qga", name = "h", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!qga", name = "i", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!qga", name = "k", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!qga", name = "m", descriptor = "I")
    private int field2620;

    @OriginalMember(owner = "client!qga", name = "o", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!qga", name = "j", descriptor = "J")
    private long field2617;

    @OriginalMember(owner = "client!qga", name = "l", descriptor = "Lda;")
    private class59 field2619;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)Z", line = 3)
    public boolean method1176(byte arg0) {
        field2615++;
        boolean var2 = true;
        if (!this.field2621.method1472(-25711, this.field2610.field3709)) {
            var2 = false;
        }
        if (!this.field2611.method1472(-25711, this.field2610.field3709)) {
            var2 = false;
        }
        if (arg0 < 124) {
            this.field2611 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)V", line = 25)
    public void method1173(int arg0) {
        field2618++;
        class323 var2 = class251.method1709(this.field2611, 1, this.field2610.field3709);
        this.field2619 = class359.field5046.method632(var2, class55.method505(this.field2621, this.field2610.field3709), true);
        if (arg0 > -105) {
            this.method1313(125, 1, true, -71);
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(Z)I", line = 45)
    public final int method1307(boolean arg0) {
        field2613++;
        int var2 = class750.field10477.method2260(arg0);
        int var3 = var2 * 100;
        if (this.field2620 == var2 && var2 != 0) {
            int var4 = class750.field10477.method2261((byte) -67);
            if (var4 > var2) {
                long var5 = this.field2617 - class750.field10477.method2264(true);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class742.method4128(1) - this.field2617) * 10000L;
                    if (var7 <= var9) {
                        var3 = var4 * 100;
                    } else {
                        var3 = (int) ((long) (var4 - var2) * 100L * var9 / var7 + (long) (var2 * 100));
                    }
                }
            }
        } else {
            this.field2620 = var2;
            this.field2617 = class742.method4128(1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(I)[Lee;", line = 91)
    public static final class673[] method1308(int arg0) {
        field2614++;
        return arg0 == 2 ? new class673[] { class231.field3294, class322.field4582, class23.field296, class315.field4464, class611.field8843, class303.field4243 } : null;
    }

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "(I)V", line = 113)
    public static final void method1310(int arg0) {
        field2622++;
        for (int var1 = 0; var1 < class359.field5033.length; var1++) {
            for (int var2 = 0; var2 < class359.field5033[var1].length; var2++) {
                class359.field5033[var1][var2] = class692.field9743;
            }
        }
        if (arg0 != 3) {
            field2623 = null;
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(ZI)V", line = 142)
    public final void method1172(boolean arg0, int arg1) {
        field2609++;
        int var3 = this.field2610.field3713.method2152(class57.field1064, this.field2610.field3705, -95) + this.field2610.field3710;
        int var4 = this.field2610.field3711.method3892(this.field2610.field3701, class477.field6814, 4) + this.field2610.field3702;
        this.method1313(var4, 0, arg0, var3);
        this.method1309(var3, (byte) -106, arg0, var4);
        int var5 = -39 / (arg1 / 39);
        String var6 = class750.field10477.method2259(-56);
        if (class742.method4128(1) - this.field2617 > 10000L) {
            var6 = var6 + " (" + class750.field10477.method2270(247668248).method2440(-30381) + ")";
        }
        this.field2619.method651(this.field2610.field3705 / 2 + var3, this.field2610.field3701 / 2 - -4 + var4 + this.field2610.field3714, var6, this.field2610.field3715, (byte) 115, -1);
    }

    @OriginalMember(owner = "client!qga", name = "d", descriptor = "(I)V", line = 165)
    public static void method1311(int arg0) {
        if (arg0 > -27) {
            field2612 = -56;
        }
        field2623 = null;
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(B)V", line = 176)
    public static final void method1312(byte arg0) {
        field2616++;
        if (class412.field5695 != null) {
            return;
        }
        class412.field5695 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) ((var3 & 0xFCA6) >> 10) / 64.0D + 0.0078125D;
            double var6 = (double) ((var3 & 0x39E) >> 7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if (var8 < 0.5D) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - var6 * var8;
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if ((var4 * 6.0D < 1.0D)) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if (var4 * 2.0D < 1.0D) {
                    var12 = var16;
                } else if (var4 * 3.0D < 2.0D) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var20 * 6.0D < 1.0D) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if (var20 * 2.0D < 1.0D) {
                    var10 = var16;
                } else if ((var20 * 3.0D < 2.0D)) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if (var24 * 6.0D < 1.0D) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if (var24 * 2.0D < 1.0D) {
                    var14 = var16;
                } else if (var24 * 3.0D < 2.0D) {
                    var14 = (0.6666666666666666D - var24) * (var16 - var18) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var32 << 16) + (var33 << 8) + var34;
            class412.field5695[var3] = var35;
        }
        if (arg0 > -11) {
            method1308(38);
        }
    }

    @OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(Leq;Leq;Lpd;)V", line = 292)
    public class183(class209 arg0, class209 arg1, class256 arg2) {
        this.field2621 = arg0;
        this.field2610 = arg2;
        this.field2611 = arg1;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(IBZI)V")
    public abstract void method1309(int arg0, byte arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(IIZI)V")
    public abstract void method1313(int arg0, int arg1, boolean arg2, int arg3);
}
