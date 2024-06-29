import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class619 extends class145 {

    @OriginalMember(owner = "client!nea", name = "E", descriptor = "[I")
    public static int[] field8977 = new int[8];

    @OriginalMember(owner = "client!nea", name = "F", descriptor = "I")
    public static int field8978;

    @OriginalMember(owner = "client!nea", name = "G", descriptor = "I")
    public static int field8979;

    @OriginalMember(owner = "client!nea", name = "H", descriptor = "I")
    public static int field8980;

    @OriginalMember(owner = "client!nea", name = "I", descriptor = "I")
    public static int field8981;

    @OriginalMember(owner = "client!nea", name = "J", descriptor = "I")
    public static int field8982;

    @OriginalMember(owner = "client!nea", name = "K", descriptor = "I")
    public static int field8983;

    @OriginalMember(owner = "client!nea", name = "L", descriptor = "I")
    public static int field8984;

    @OriginalMember(owner = "client!nea", name = "M", descriptor = "I")
    public static int field8985;

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(II)V")
    public static final void method3560(int arg0, int arg1) {
        class253.field3576 = arg1;
        ++field8985;
        class414.field6279 = arg0;
        long var2 = 0L;
        if (class19.field195 != null) {
            class194 var4 = new class194(class61.method437((byte) 123, class468.method2869(class19.field195, (byte) 92)));
            long var5 = var4.method1184(arg1 + 43);
            class527.field7641 = var4.method1184(arg1 ^ 37);
            class237.method1589(true, 8, "", class113.method697((byte) -24, var5));
        } else {
            class453.method2799(126, 35);
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(Lqf;III)V")
    public static final void method3561(class593 arg0, int arg1, int arg2, int arg3) {
        ++field8981;
        class360.field5104 = arg0;
        if (arg1 != 4096) {
            field8980 = 61;
        }
        class13.field115 = arg3;
        class515.field7508 = arg2;
    }

    @OriginalMember(owner = "client!nea", name = "<init>", descriptor = "()V")
    public class619() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(IZII)I")
    public static final int method3562(int arg0, boolean arg1, int arg2, int arg3) {
        ++field8984;
        if (class123.field1537 < 100) {
            return -2;
        } else {
            int var4 = -2;
            int var5 = Integer.MAX_VALUE;
            int var6 = -class182.field2273 + arg0;
            int var7 = arg2 - class182.field2267;
            for (class480 var8 = (class480) class182.field2258.method719(arg1); var8 != null; var8 = (class480) class182.field2258.method716(14)) {
                if (var8.field7060 == arg3) {
                    int var9 = var8.field7059;
                    int var10 = var8.field7057;
                    int var11 = class182.field2273 + var9 << 14 | class182.field2267 + var10;
                    int var12 = (var7 - var10) * (-var10 + var7) + (-var9 + var6) * (-var9 + var6);
                    if (var4 < 0 || ~var5 < ~var12) {
                        var5 = var12;
                        var4 = var11;
                    }
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(B)V")
    public static void method3563(byte arg0) {
        if (arg0 != 62) {
            method3562(96, false, -68, -2);
        }
        field8977 = null;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(BI)[[I")
    public final int[][] method75(byte arg0, int arg1) {
        ++field8979;
        if (arg0 >= -28) {
            method3561((class593) null, 90, -95, -61);
        }
        int[][] var3 = super.field1792.method1826(arg1, -16486);
        if (super.field1792.field3917) {
            int[][] var4 = this.method866(0, arg1, (byte) -99);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class647.field9368 > var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = 4096 - var7[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nea", name = "i", descriptor = "(I)V")
    public static final void method3564(int arg0) {
        ++field8982;
        class224.field3145.method2491(8192);
        class568.field8160 = arg0;
        class195.field2647 = null;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(IILrt;)V")
    public final void method28(int arg0, int arg1, class194 arg2) {
        if (~arg0 == -1) {
            super.field1790 = ~arg2.method1177(255) == -2;
        }
        ++field8983;
        if (arg1 > -67) {
            field8980 = -125;
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(ZI)[I")
    public final int[] method27(boolean arg0, int arg1) {
        ++field8978;
        int[] var3 = super.field1779.method2069(-2, arg1);
        if (arg0) {
            field8977 = null;
        }
        if (super.field1779.field4602) {
            int[] var4 = this.method865(0, arg1, (byte) 119);
            for (int var5 = 0; var5 < class647.field9368; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }
}
