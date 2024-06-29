import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class752 {

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "Z")
    private boolean field10371 = false;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    public int field10373 = 443;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    public int field10372 = 43594;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "Z")
    private boolean field10370 = true;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
    public static int field10378 = -50;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public static int field10365;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    public static int field10367;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public static int field10368;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public static int field10369;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
    public int field10374;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    public static int field10375;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
    public static int field10376;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "I")
    public static int field10377;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "I")
    public static int field10379;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "Ljava/lang/String;")
    public String field10366;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V", line = 3)
    public static final void method4167(int arg0) {
        field10376++;
        if (class424.field5802 != null) {
            return;
        }
        class424.field5802 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var6 = (double) (var3 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if (var8 < 0.5D) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - (var6 * var8);
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if (var4 * 6.0D < 1.0D) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if ((var4 * 2.0D < 1.0D)) {
                    var12 = var16;
                } else if (var4 * 3.0D < 2.0D) {
                    var12 = (0.6666666666666666D - var4) * (var16 - var18) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if ((var20 * 6.0D < 1.0D)) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if (var20 * 2.0D < 1.0D) {
                    var10 = var16;
                } else if (var20 * 3.0D < 2.0D) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var24 * 6.0D < 1.0D) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if ((var24 * 2.0D < 1.0D)) {
                    var14 = var16;
                } else if (var24 * 3.0D < 2.0D) {
                    var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
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
            class424.field5802[var3] = var35;
        }
        if (arg0 != -17941) {
            method4167(3);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Llu;B)Lfo;", line = 116)
    public final class545 method4168(class742 arg0, byte arg1) {
        if (arg1 >= -85) {
            this.method4169(null, (byte) 15);
        }
        field10379++;
        return arg0.method4105((byte) 109, this.field10370 ? this.field10373 : this.field10372, this.field10366, this.field10371);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lhn;B)Z", line = 128)
    public final boolean method4169(class752 arg0, byte arg1) {
        if (arg1 <= 5) {
            field10378 = 77;
        }
        field10368++;
        if (arg0 == null) {
            return false;
        } else {
            return this.field10374 == arg0.field10374 && this.field10366.equals(arg0.field10366);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(III)Z", line = 150)
    public static final boolean method4170(int arg0, int arg1, int arg2) {
        if (arg0 == 64964) {
            field10369++;
            return (arg2 & 0x10000) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V", line = 161)
    public final void method4171(int arg0) {
        if (!this.field10370) {
            this.field10370 = true;
            this.field10371 = true;
        } else if (this.field10371) {
            this.field10371 = false;
        } else {
            this.field10370 = false;
        }
        int var2 = 126 % ((arg0 - 22) / 63);
        field10375++;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)S", line = 201)
    public static final short method4172(int arg0, int arg1) {
        field10367++;
        int var2 = (arg0 & 0xFDC4) >> 10;
        int var3 = (arg0 & 0x382) >> 3;
        int var4 = arg0 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        if (arg1 != 1474149255) {
            method4172(-60, 65);
        }
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var6 | var7 >> 4 << 7 | var2 << 10);
    }
}
