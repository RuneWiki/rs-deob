import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class72 extends class166 {

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "I")
    private int field1394 = 4096;

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "I")
    private int field1399 = 4096;

    @OriginalMember(owner = "client!gd", name = "V", descriptor = "I")
    private int field1401 = 4096;

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "Z")
    public static boolean field1395 = false;

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "I")
    public static int field1396 = 0;

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "I")
    public static int field1398 = 0;

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "Lta;")
    public static class241 field1397 = new class241(64);

    @OriginalMember(owner = "client!gd", name = "U", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!gd", name = "W", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!gd", name = "X", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lnc;ILnc;ZLha;)V")
    public static final void method506(class83 arg0, int arg1, class83 arg2, boolean arg3, class30 arg4) {
        class170.field3109 = arg0;
        ++field1403;
        class119.field2248 = arg3;
        class162.field3000 = arg2;
        int var5 = class162.field3000.method587(-17326) - arg1;
        class23.field311 = var5 * 256 + class162.field3000.method594(var5, (byte) -71);
        class139.field2600 = arg4;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)[[I")
    public final int[][] method134(int arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field1400;
            int[][] var3 = super.field3064.method320(arg1, (byte) -25);
            if (super.field3064.field979) {
                int[][] var4 = this.method1229(arg1, arg0 + 23580, 0);
                int[] var5 = var4[0];
                int[] var6 = var3[0];
                int[] var7 = var4[1];
                int[] var8 = var4[2];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class253.field4565; ++var11) {
                    int var12 = var7[var11];
                    int var13 = var5[var11];
                    int var14 = var8[var11];
                    if (~var13 == ~var14 && ~var12 == ~var14) {
                        var6[var11] = this.field1399 * var13 >> 12;
                        var9[var11] = this.field1401 * var14 >> 12;
                        var10[var11] = this.field1394 * var12 >> 12;
                    } else {
                        var6[var11] = this.field1399;
                        var9[var11] = this.field1401;
                        var10[var11] = this.field1394;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        ++field1402;
        if (arg0 != 96) {
            field1395 = true;
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field1394 = arg1.method912(-93);
                }
            } else {
                this.field1401 = arg1.method912(60);
            }
        } else {
            this.field1399 = arg1.method912(59);
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)V")
    public static void method507(byte arg0) {
        if (arg0 != -127) {
            method506((class83) null, 96, (class83) null, false, (class30) null);
        }
        field1397 = null;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
    public class72() {
        super(1, false);
    }
}
