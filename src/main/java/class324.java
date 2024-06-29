import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class324 {

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    private int field4105 = 0;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public int field4110 = -1;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public int field4106 = 128;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "Z")
    public boolean field4113 = true;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "[Z")
    public static boolean[] field4108 = new boolean[100];

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "Lni;")
    public static class363 field4107 = new class363("LIVE", 0);

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public int field4115;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public int field4116;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public int field4117;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
    public int field4121;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
    public static void method1895(byte arg0) {
        field4108 = null;
        if (arg0 >= -100) {
            field4108 = null;
        }
        field4107 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)V")
    private final void method1896(int arg0, int arg1) {
        field4112++;
        double var3 = (double) ((arg0 & 0xFFCFAF) >> 16) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        double var19 = var13 / 6.0D;
        this.field4121 = (int) (var15 * 256.0D);
        this.field4117 = (int) ((double) arg1 * var17);
        if (this.field4117 < 0) {
            this.field4117 = 0;
        } else if (this.field4117 > 255) {
            this.field4117 = 255;
        }
        if (this.field4121 < 0) {
            this.field4121 = 0;
        } else if (this.field4121 > 255) {
            this.field4121 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field4116 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field4116 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field4116 < 1) {
            this.field4116 = 1;
        }
        this.field4115 = (int) ((double) this.field4116 * var19);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method1897(String arg0, byte arg1, String arg2, String arg3) {
        field4120++;
        for (int var4 = arg3.indexOf(arg0); var4 != -1; var4 = arg3.indexOf(arg0, var4 + arg2.length())) {
            arg3 = arg3.substring(0, var4) + arg2 + arg3.substring(arg0.length() + var4);
        }
        if (arg1 >= -16) {
            field4107 = null;
        }
        return arg3;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BII)V")
    public static final void method1898(byte arg0, int arg1, int arg2) {
        field4109++;
        int var3 = class274.field3437.method1757((byte) -124, class128.field1699.method1936(arg0 ^ 0xFFFF9870, class11.field177));
        for (class520 var4 = (class520) class201.field2616.method153(0); var4 != null; var4 = (class520) class201.field2616.method161(-104)) {
            int var8 = class113.method818(123, var4);
            if (var3 < var8) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class2.field24 * 16 + 21;
        if (arg0 != 37) {
            method1900(62, -6, true, 63, 38);
        }
        int var6 = arg1 - (var3 / 2);
        if ((var6 + var3) > class174.field2262) {
            var6 = class174.field2262 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg2;
        if (class390.field5236 < var5 + arg2) {
            var7 = class390.field5236 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        class325.field4128 = var6;
        class117.field1580 = var3;
        class122.field1646 = true;
        class14.field229 = var7;
        class337.field4242 = class2.field24 * 16 + (class163.field2075 ? 26 : 22);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILfh;)V")
    public final void method1899(int arg0, class463 arg1) {
        while (true) {
            int var3 = arg1.method2737(false);
            if (var3 == 0) {
                field4111++;
                if (arg0 != 0) {
                    method1900(51, -70, false, -37, -24);
                    return;
                }
                return;
            }
            this.method1901((byte) -106, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIZII)I")
    public static final int method1900(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field4114++;
        int var5 = 65536 - class36.field478[arg1 * 8192 / arg4] >> 1;
        return arg2 ? ((65536 - var5) * arg3 >> 16) + (arg0 * var5 >> 16) : -46;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLfh;I)V")
    private final void method1901(byte arg0, class463 arg1, int arg2) {
        if (arg2 == 1) {
            this.field4105 = arg1.method2738(-115);
            this.method1896(this.field4105, arg0 ^ 0xFFFFFE96);
        } else if (arg2 == 2) {
            this.field4110 = arg1.method2758((byte) 99);
            if (this.field4110 == 65535) {
                this.field4110 = -1;
            }
        } else if (arg2 == 3) {
            this.field4106 = arg1.method2758((byte) 87) << 0;
        } else if (arg2 == 4) {
            this.field4113 = false;
        }
        field4119++;
        if (arg0 != -106) {
            this.field4121 = 122;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)V")
    public static final void method1902(byte arg0) {
        field4118++;
        for (class433 var1 = (class433) class144.field1850.method153(0); var1 != null; var1 = (class433) class144.field1850.method161(-126)) {
            if (var1.field6131) {
                var1.method2539((byte) 35);
            }
        }
        if (arg0 < 85) {
            method1898((byte) 53, -101, -125);
        }
        for (class433 var2 = (class433) class149.field1884.method153(0); var2 != null; var2 = (class433) class149.field1884.method161(-41)) {
            if (var2.field6131) {
                var2.method2539((byte) 35);
            }
        }
    }
}
