import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class174 {

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
    private int field2674;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "F")
    public static float field2668 = 0.0F;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "Z")
    public static boolean field2673 = false;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "I")
    public static int field2675;

    static {
        new class342(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IILbu;IIZI)V", line = 8)
    public static final void method1252(int arg0, int arg1, class17 arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class289.field4118 = 1;
        class406.field6095 = arg4;
        if (arg3 != 6) {
            field2668 = -0.3493265F;
        }
        class488.field7226 = arg2;
        class281.field4024 = arg0;
        class102.field1693 = arg6;
        field2675++;
        class219.field3158 = arg5;
        class431.field6417 = class315.field4741.method2792(117) / arg1;
        if (class431.field6417 < 1) {
            class431.field6417 = 1;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)I", line = 30)
    public final int method1253(byte arg0) {
        int var2 = -6 % ((arg0 - 56) / 57);
        field2667++;
        return this.field2674;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(JI)V", line = 43)
    public static final void method1254(long arg0, int arg1) {
        field2669++;
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        if (arg1 != -13939) {
            method1252(8, -33, null, 74, -51, false, -74);
        }
    }

    @OriginalMember(owner = "client!rn", name = "toString", descriptor = "()Ljava/lang/String;", line = 60)
    public final String toString() {
        field2671++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IC)Z", line = 73)
    public static final boolean method1255(int arg0, char arg1) {
        field2672++;
        if (arg0 <= 2) {
            field2673 = false;
        }
        return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(II)V", line = 83)
    public class174(int arg0, int arg1) {
        this.field2674 = arg0;
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)V", line = 103)
    public static final void method1256(byte arg0) {
        field2670++;
        if (class441.field6587 != null) {
            return;
        }
        class441.field6587 = new int[65536];
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var6 = (double) ((var3 & 0x3E4) >> 7) / 8.0D + 0.0625D;
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
                if ((var4 * 6.0D < 1.0D)) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if (var4 * 2.0D < 1.0D) {
                    var12 = var16;
                } else if ((var4 * 3.0D < 2.0D)) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if ((var20 * 6.0D < 1.0D)) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if ((var20 * 2.0D < 1.0D)) {
                    var10 = var16;
                } else if ((var20 * 3.0D < 2.0D)) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var24 * 6.0D < 1.0D) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if (var24 * 2.0D < 1.0D) {
                    var14 = var16;
                } else if ((var24 * 3.0D < 2.0D)) {
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
            int var35 = (var33 << 8) + (var32 << 16) + var34;
            class441.field6587[var3] = var35;
        }
        if (arg0 < 28) {
            method1252(33, 56, null, 21, -43, true, -51);
        }
    }
}
