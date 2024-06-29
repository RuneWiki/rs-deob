import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class116 extends class4 {

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "Z")
    public static boolean field1673 = false;

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "Z")
    public static boolean field1677 = true;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
    public static volatile int field1670 = 0;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "Lhj;")
    public class116 field1676;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "Lhj;")
    public class116 field1679;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "Lti;")
    public static class146 field1671;

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "Llh;")
    public static class58 field1675;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "Ljava/awt/Font;")
    public static Font field1672;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "Z")
    public static boolean field1668;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILnh;)V")
    public static final void method741(int arg0, class305 arg1) {
        if (arg0 != 2) {
            method745(36);
        }
        class43.field641 = arg1;
        field1674++;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V")
    public final void method742(byte arg0) {
        if (arg0 >= -68) {
            method743(-101);
        }
        field1669++;
        if (this.field1676 != null) {
            this.field1676.field1679 = this.field1679;
            this.field1679.field1676 = this.field1676;
            this.field1676 = null;
            this.field1679 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
    public static final void method743(int arg0) {
        field1680++;
        if (class300.field4766 == -1 || class80.field1107 == -1) {
            return;
        }
        int var1 = ((class82.field1124 - class267.field4287) * class305.field4912 >> 16) + class267.field4287;
        class305.field4912 += var1;
        if (class305.field4912 < 65535) {
            class99.field1438 = false;
            field1673 = false;
        } else {
            if (class99.field1438) {
                field1673 = false;
            } else {
                field1673 = true;
            }
            class305.field4912 = 65535;
            class99.field1438 = true;
        }
        float var2 = (float) class305.field4912 / 65535.0F;
        int var3 = class178.field2572 * 2;
        float[] var4 = new float[3];
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class228.field3568[class300.field4766][var3][var5] * 3;
            int var22 = (class228.field3568[class300.field4766][var3 + 2][var5] + class228.field3568[class300.field4766][var3 + 2][var5] - class228.field3568[class300.field4766][var3 + 3][var5]) * 3;
            int var23 = class228.field3568[class300.field4766][var3][var5];
            int var24 = class228.field3568[class300.field4766][var3 + 1][var5] * 3;
            int var25 = var22 + var21 - (var24 * 2);
            int var26 = var24 - var21;
            int var27 = class228.field3568[class300.field4766][var3 + 2][var5] + var24 - var22 - var23;
            var4[var5] = (((float) var27 * var2 + (float) var25) * var2 + (float) var26) * var2 + (float) var23;
        }
        class27.field423 = (int) var4[1] * -1;
        class188.field2848 = (int) var4[2] - class170.field2421 * 128;
        float[] var6 = new float[3];
        class178.field2603 = (int) var4[0] - (class228.field3570 * 128);
        int var7 = class21.field347 * 2;
        if (arg0 <= 16) {
            method741(114, (class305) null);
        }
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class228.field3568[class80.field1107][var7][var8] * 3;
            int var15 = class228.field3568[class80.field1107][var7 + 1][var8] * 3;
            int var16 = (class228.field3568[class80.field1107][var7 + 2][var8] + class228.field3568[class80.field1107][var7 + 2][var8] - class228.field3568[class80.field1107][var7 + 3][var8]) * 3;
            int var17 = class228.field3568[class80.field1107][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = class228.field3568[class80.field1107][var7 + 2][var8] + var15 - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var4[0];
        float var10 = (var6[1] - var4[1]) * -1.0F;
        float var11 = var6[2] - var4[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class163.field2310 = (float) Math.atan2((double) var10, var12);
        class312.field5016 = -((float) Math.atan2((double) var9, (double) var11));
        class277.field4407 = (int) ((double) class163.field2310 * 325.949D) & 0x7FF;
        class246.field3870 = (int) ((double) class312.field5016 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(Z)V")
    public static void method744(boolean arg0) {
        field1671 = null;
        field1672 = null;
        if (!arg0) {
            field1675 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)Lee;")
    public static final class74 method745(int arg0) {
        field1678++;
        if (arg0 != 2) {
            field1671 = null;
        }
        class74 var1 = new class74(class242.field3805, class70.field1021, class275.field4376[0], class96.field1381[0], class137.field1869[0], class112.field1613[0], class134.field1847[0], class298.field4748);
        class282.method1840(true);
        return var1;
    }
}
