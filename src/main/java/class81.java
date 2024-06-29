import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class81 extends class297 {

    @OriginalMember(owner = "client!je", name = "M", descriptor = "Z")
    private boolean field1260 = true;

    @OriginalMember(owner = "client!je", name = "J", descriptor = "Z")
    private boolean field1257 = true;

    @OriginalMember(owner = "client!je", name = "I", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!je", name = "K", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!je", name = "L", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!je", name = "N", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!je", name = "O", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!je", name = "Q", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!je", name = "R", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!je", name = "P", descriptor = "[B")
    public static byte[] field1263;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IILaj;)V", line = 5)
    public final void method169(int arg0, int arg1, class1 arg2) {
        field1261++;
        if (arg0 == 0) {
            this.field1260 = arg2.method15((byte) 77) == 1;
        } else if (arg0 == 1) {
            this.field1257 = arg2.method15((byte) 120) == 1;
        } else if (arg0 == 2) {
            this.field4762 = arg2.method15((byte) -61) == 1;
        }
        if (arg1 != 255) {
            method634(-94);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ldl;I)V", line = 50)
    public static final void method632(class43 arg0, int arg1) {
        field1256++;
        long var2 = 0L;
        if (arg0.field680 == 0) {
            var2 = class55.method470(arg0.field687, arg0.field686, arg0.field688);
        }
        if (arg0.field680 == 1) {
            var2 = class91.method721(arg0.field687, arg0.field686, arg0.field688);
        }
        if (arg0.field680 == 2) {
            var2 = class122.method973(arg0.field687, arg0.field686, arg0.field688);
        }
        if (arg0.field680 == 3) {
            var2 = class110.method865(arg0.field687, arg0.field686, arg0.field688);
        }
        int var4 = 0;
        int var5 = -1;
        int var6 = 0;
        if (var2 != 0L) {
            var5 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
            var6 = ((int) var2 & 0x39CBED) >> 20;
            var4 = ((int) var2 & 0x7F71C) >> 14;
        }
        arg0.field689 = var4;
        arg0.field679 = var6;
        if (arg1 != -28284) {
            field1263 = (byte[]) null;
        }
        arg0.field684 = var5;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BZI)Ljava/lang/String;", line = 93)
    public static final String method633(byte arg0, boolean arg1, int arg2) {
        field1258++;
        if (arg0 > -8) {
            return (String) null;
        } else if (arg1 && arg2 >= 0) {
            return class103.method833(arg1, 267735788, arg2, 10);
        } else {
            return Integer.toString(arg2);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IZ)[I", line = 115)
    public final int[] method173(int arg0, boolean arg1) {
        field1265++;
        int[] var3 = this.field4760.method215(arg0, 19142);
        if (!arg1) {
            this.field1257 = true;
        }
        if (this.field4760.field388) {
            int[] var4 = this.method2109(this.field1257 ? class175.field2801 - arg0 : arg0, (byte) 63, 0);
            if (this.field1260) {
                for (int var5 = 0; var5 < class31.field491; var5++) {
                    var3[var5] = var4[class257.field3813 - var5];
                }
            } else {
                class330.method2307(var4, 0, var3, 0, class31.field491);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)[[I", line = 151)
    public final int[][] method172(int arg0, byte arg1) {
        field1262++;
        int[][] var3 = this.field4767.method1141(arg1 ^ 0xFFFFF94C, arg0);
        if (arg1 != 63) {
            return (int[][]) ((int[][]) null);
        }
        if (this.field4767.field2480) {
            int[][] var4 = this.method2105(this.field1257 ? class175.field2801 - arg0 : arg0, 2, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var4[1];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field1260) {
                for (int var11 = 0; var11 < class31.field491; var11++) {
                    var7[var11] = var5[class257.field3813 - var11];
                    var9[var11] = var8[class257.field3813 - var11];
                    var10[var11] = var6[class257.field3813 - var11];
                }
            } else {
                for (int var12 = 0; var12 < class31.field491; var12++) {
                    var7[var12] = var5[var12];
                    var9[var12] = var8[var12];
                    var10[var12] = var6[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V", line = 220)
    public class81() {
        super(1, false);
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(I)V", line = 225)
    public static void method634(int arg0) {
        field1263 = null;
        if (arg0 != 3787757) {
            method633((byte) 65, false, 63);
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(BII)V", line = 237)
    public static final void method635(byte arg0, int arg1, int arg2) {
        if (arg0 > -11) {
            return;
        }
        field1264++;
        class18 var3 = class151.method1139(arg1, 0);
        int var4 = var3.field341;
        int var5 = var3.field346;
        int var6 = var3.field345;
        int var7 = class169.field2720[var6 - var5];
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class232.method1677((byte) -94, var4, arg2 << var5 & var8 | ~var8 & class93.field1518[var4]);
    }
}
