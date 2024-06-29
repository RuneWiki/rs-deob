import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class399 {

    @OriginalMember(owner = "client!mt", name = "g", descriptor = "Lff;")
    public class9 field5651 = null;

    @OriginalMember(owner = "client!mt", name = "j", descriptor = "[Ljs;")
    public class334[] field5654 = null;

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "Lff;")
    public class9 field5648 = null;

    @OriginalMember(owner = "client!mt", name = "m", descriptor = "[Ljs;")
    private class334[] field5657 = null;

    @OriginalMember(owner = "client!mt", name = "l", descriptor = "Luv;")
    private class367 field5656;

    @OriginalMember(owner = "client!mt", name = "h", descriptor = "Z")
    public boolean field5652;

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "[I")
    public static int[] field5646 = new int[16];

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
    public static int field5645;

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "I")
    public static int field5647;

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!mt", name = "k", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!mt", name = "n", descriptor = "I")
    public static int field5658;

    @OriginalMember(owner = "client!mt", name = "o", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!mt", name = "i", descriptor = "Lofa;")
    public static class332 field5653;

    @OriginalMember(owner = "client!mt", name = "f", descriptor = "Lda;")
    public static class61 field5650;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)Z", line = 8)
    public final boolean method2309(int arg0) {
        field5645++;
        if (arg0 != -22382) {
            return false;
        } else if (this.field5652) {
            return this.field5648 != null;
        } else {
            return this.field5654 != null;
        }
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(I)V", line = 19)
    public static void method2310(int arg0) {
        field5653 = null;
        if (arg0 != 26845) {
            method2310(22);
        }
        field5646 = null;
        field5650 = null;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIIB)Z", line = 31)
    public static final boolean method2311(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 > -94) {
            method2312(-60);
        }
        field5647++;
        if (!class314.field4236 || !class232.field2988) {
            return false;
        } else if (class51.field536 < 100) {
            return false;
        } else if (class161.method954((byte) 72, arg0, arg1, arg2)) {
            int var5 = arg2 << class443.field6172;
            int var6 = arg1 << class443.field6172;
            if (class257.method1531(class25.field188[arg0].method1685(arg1, -12639, arg2), class601.field8373, arg3, class601.field8373, (byte) 16, var6, var5)) {
                class460.field6373++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "(I)Z", line = 75)
    public static final boolean method2312(int arg0) {
        if (arg0 > -84) {
            field5653 = null;
        }
        field5655++;
        if (class584.field8175) {
            try {
                class679.method3851("showVideoAd", class144.field1868, -26978);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIZ)Z", line = 96)
    public static final boolean method2313(int arg0, int arg1, boolean arg2) {
        field5649++;
        if (arg2) {
            method2310(-61);
        }
        return (arg0 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "(I)Z", line = 111)
    public final boolean method2314(int arg0) {
        field5659++;
        int var2 = 5 / ((-arg0 - 66) / 48);
        if (this.field5651 == null) {
            if (class286.field3819 == null) {
                byte[] var3 = class492.method2756(-31633, 16.0F, 0.5F, 0.6F, 16, 8, 128, new class546(419684), 4.0F, 4.0F, 128);
                class286.field3819 = class41.method248(2, var3, false);
            }
            byte[] var4 = class688.method3894(false, class286.field3819, false);
            byte[] var5 = new byte[var4.length * 4];
            int var6 = 0;
            for (int var7 = 0; var7 < 16; var7++) {
                int var8 = var7 * 128 * 128;
                int var9 = var8;
                for (int var10 = 0; var10 < 128; var10++) {
                    int var11 = var10 * 128 + var9;
                    int var12 = var9 + ((var10 - 1 & 0x7F) * 128);
                    int var13 = (var10 + 1 & 0x7F) * 128 + var9;
                    for (int var14 = 0; var14 < 128; var14++) {
                        float var15 = (float) ((var4[var12 + var14] & 0xFF) - (var4[var13 + var14] & 0xFF));
                        float var16 = (float) ((var4[(var14 - 1 & 0x7F) + var11] & 0xFF) - (var4[(var14 + 1 & 0x7F) + var11] & 0xFF));
                        float var17 = (float) (128.0D / Math.sqrt((double) (var15 * var15 + var16 * var16 + 16384.0F)));
                        var5[var6++] = (byte) ((int) (var16 * var17 + 127.0F));
                        var5[var6++] = (byte) ((int) (var17 * 128.0F + 127.0F));
                        var5[var6++] = (byte) ((int) (var15 * var17 + 127.0F));
                        var5[var6++] = var4[var8++];
                    }
                }
            }
            this.field5651 = this.field5656.method1336(-81, class758.field10567, var5, 128, 128, 16);
        }
        return this.field5651 != null;
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Luv;)V", line = 198)
    public class399(class367 arg0) {
        this.field5656 = arg0;
        this.field5652 = this.field5656.field5080;
        if (this.field5652 && !this.field5656.method1293(class594.field8277, true, class423.field5926)) {
            this.field5652 = false;
        }
        if (this.field5652 || this.field5656.method1315(0, class423.field5926, class594.field8277)) {
            class101.method695(false);
            if (this.field5652) {
                byte[] var6 = class688.method3894(false, class610.field8514, false);
                this.field5648 = this.field5656.method1336(95, class423.field5926, var6, 128, 128, 16);
                byte[] var7 = class688.method3894(false, class210.field2521, false);
                this.field5656.method1336(125, class423.field5926, var7, 128, 128, 16);
            } else {
                this.field5654 = new class334[16];
                for (int var2 = 0; var2 < 16; var2++) {
                    byte[] var5 = class12.method45(2, 32768, var2 * 128 * 128 * 2, class610.field8514);
                    this.field5654[var2] = this.field5656.method2176(128, class423.field5926, (byte) 87, var5, true, 128);
                }
                this.field5657 = new class334[16];
                for (int var3 = 0; var3 < 16; var3++) {
                    byte[] var4 = class12.method45(2, 32768, var3 * 16384 * 2, class210.field2521);
                    this.field5657[var3] = this.field5656.method2176(128, class423.field5926, (byte) 87, var4, true, 128);
                }
            }
        }
    }
}
