import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class229 extends class748 {

    @OriginalMember(owner = "client!gj", name = "L", descriptor = "I")
    private int field3187 = 4096;

    @OriginalMember(owner = "client!gj", name = "P", descriptor = "Z")
    private boolean field3191 = true;

    @OriginalMember(owner = "client!gj", name = "J", descriptor = "Z")
    public static boolean field3185 = false;

    @OriginalMember(owner = "client!gj", name = "N", descriptor = "Z")
    public static boolean field3189 = false;

    @OriginalMember(owner = "client!gj", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field3186 = new String[100];

    @OriginalMember(owner = "client!gj", name = "H", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!gj", name = "I", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!gj", name = "M", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!gj", name = "O", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZLvj;)V")
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        if (!arg1) {
            ++field3188;
            if (~arg0 != -1) {
                if (~arg0 == -2) {
                    this.field3191 = arg2.method194((byte) 119) == 1;
                }
            } else {
                this.field3187 = arg2.method193(2);
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
    public static final void method1478(String arg0, int arg1, String arg2) {
        class33.field488 = arg1;
        ++field3184;
        class93.field1268 = 1;
        class308.method1810(false, arg2, arg0, 0);
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)[[I")
    public final int[][] method445(int arg0, int arg1) {
        ++field3190;
        if (arg1 != 0) {
            this.field3187 = -85;
        }
        int[][] var3 = super.field10420.method930(29784, arg0);
        if (super.field10420.field1979) {
            int[] var4 = this.method4157(0, (byte) -114, class150.field2077 & arg0 + -1);
            int[] var5 = this.method4157(0, (byte) 56, arg0);
            int[] var6 = this.method4157(0, (byte) 29, arg0 + 1 & class150.field2077);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~var10 > ~class424.field5889; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field3187;
                int var12 = (var5[class354.field4552 & var10 + 1] + -var5[class354.field4552 & var10 + -1]) * this.field3187;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 + 4096 + var15) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var19 = var11 / var17;
                    var18 = 16777216 / var17;
                    var20 = var12 / var17;
                }
                if (this.field3191) {
                    var18 = 2048 - -(var18 >> 1);
                    var20 = 2048 - -(var20 >> 1);
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var20;
                var8[var10] = var19;
                var9[var10] = var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "(I)V")
    public static final void method1479(int arg0) {
        if (arg0 != -1814991167) {
            method1478((String) null, -35, (String) null);
        }
        class400.field5545 = true;
        ++field3183;
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(B)V")
    public static void method1480(byte arg0) {
        field3186 = null;
        if (arg0 <= 2) {
            field3186 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
    public class229() {
        super(1, false);
    }
}
