import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class100 extends class261 {

    @OriginalMember(owner = "client!ct", name = "k", descriptor = "I")
    public int field1923;

    @OriginalMember(owner = "client!ct", name = "n", descriptor = "[I")
    public static int[] field1926 = new int[6];

    @OriginalMember(owner = "client!ct", name = "l", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!ct", name = "m", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!ct", name = "q", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!ct", name = "p", descriptor = "Lvp;")
    public static class126 field1928;

    @OriginalMember(owner = "client!ct", name = "o", descriptor = "Lph;")
    public static class459 field1927;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(CI)Z")
    public static final boolean method889(char arg0, int arg1) {
        field1925++;
        if (arg1 != -123) {
            field1928 = null;
        }
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(Z)V")
    public static void method890(boolean arg0) {
        field1927 = null;
        field1926 = null;
        field1928 = null;
        if (!arg0) {
            method890(false);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V")
    public static final void method891(int arg0) {
        field1924++;
        int var1 = -20 % ((-arg0 - 69) / 55);
        if (class389.field5851 < 0) {
            return;
        }
        long var2 = class423.method2578(-19698);
        class389.field5851 = (int) ((long) class389.field5851 - (var2 - class25.field375));
        if (class389.field5851 > 0) {
            int var4 = (class389.field5851 << 8) / class473.field7023;
            int var5 = 255 - var4;
            float var6 = (float) var4 / 255.0F;
            class439.field6519 = ((class296.field4498 & 0xFF00FF) * var4 + (class260.field3970.field6958 & 0xFF00FF) * var5 & 0xFF00FF00) + ((class296.field4498 & 0xFF00) * var4 + (class260.field3970.field6958 & 0xFF00) * var5 & 0xFF0000) >>> 8;
            float var7 = 1.0F - var6;
            class151.field2494 = (class260.field3970.field6947 - class236.field3630) * var7 + class236.field3630;
            class390.field5856 = (class260.field3970.field6949 - class1.field42) * var7 + class1.field42;
            class91.field1818 = ((class484.field7128 & 0xFF00FF) * var4 + (class260.field3970.field6944 & 0xFF00FF) * var5 & 0xFF00FF00) + ((class484.field7128 & 0xFF00) * var4 + (class260.field3970.field6944 & 0xFF00) * var5 & 0xFF0000) >>> 8;
            class175.field2855 = (class260.field3970.field6957 - class265.field4037) * var7 + class265.field4037;
            class329.field4996 = (class260.field3970.field6953 - class87.field1785) * var7 + class87.field1785;
            class362.field5295 = (class260.field3970.field6946 - class271.field4115) * var7 + class271.field4115;
            class461.field6861 = (class260.field3970.field6942 - class459.field6823) * var7 + class459.field6823;
            class498.field7316 = class470.field6979 * var4 + class260.field3970.field6943 * var5 >> 8;
            if (class308.field4676 != class260.field3970.field6950) {
                class296.field4491 = client.field3213.method293(class308.field4676, class260.field3970.field6950, var7, class296.field4491);
            }
        } else {
            class498.field7316 = class260.field3970.field6943;
            class390.field5856 = class260.field3970.field6949;
            class439.field6519 = class260.field3970.field6958;
            class389.field5851 = -1;
            class362.field5295 = class260.field3970.field6946;
            class296.field4491 = class260.field3970.field6950;
            class329.field4996 = class260.field3970.field6953;
            class91.field1818 = class260.field3970.field6944;
            class461.field6861 = class260.field3970.field6942;
            class175.field2855 = class260.field3970.field6957;
            class151.field2494 = class260.field3970.field6947;
        }
        class25.field375 = var2;
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "()V")
    public class100() {
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(I)V")
    public class100(int arg0) {
        this.field1923 = arg0;
    }
}
