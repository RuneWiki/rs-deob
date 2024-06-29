import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class115 {

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "Lph;")
    public static class229 field1950 = class266.method1858("Hierhin gehen", 0);

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "Lph;")
    public static class229 field1949 = class266.method1858("Starte 3D)2Softwarebibliothek)3", 0);

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field1954 = 0;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field1953 = 0;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Lsi;")
    public static class66 field1952;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "Ljava/awt/Font;")
    public static Font field1955;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V", line = 17)
    public static void method871(byte arg0) {
        field1950 = null;
        field1952 = null;
        field1949 = null;
        if (arg0 != 49) {
            field1952 = (class66) null;
        }
        field1955 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIII)I", line = 33)
    public static final int method872(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1951++;
        if (class218.field3591) {
            class218.field3591 = false;
            arg4 = 1000000;
        }
        class139 var5 = class313.field5311[arg0][arg2];
        float var6 = ((float) arg3 * 0.1F + 0.7F) * var5.field2258;
        if (arg1 < 88) {
            method873(57);
        }
        float var7 = var5.field2250;
        int var8 = var5.field2263;
        int var9 = var5.field2243;
        int var10 = var5.field2245;
        float var11 = var5.field2254;
        if (!class215.field3545) {
            var9 = 0;
        }
        if (class244.field4029 != var10 || class24.field307 != var6 || class232.field3839 != var7 || class281.field4665 != var11 || class265.field4458 != var8 || class287.field4712 != var9) {
            class281.field4665 = var11;
            class265.field4458 = var8;
            class24.field306 = class271.field4544;
            class304.field5083 = class230.field3823;
            class12.field167 = class85.field1462;
            class24.field307 = var6;
            class12.field168 = class111.field1883;
            class287.field4712 = var9;
            class224.field3680 = class238.field3933;
            class232.field3839 = var7;
            class187.field3041 = class235.field3875;
            class244.field4029 = var10;
            class229.field3804 = 0;
        }
        if (class229.field3804 < 65536) {
            class229.field3804 += arg4 * 250;
            if (class229.field3804 >= 65536) {
                class229.field3804 = 65536;
            }
            int var12 = 65536 - class229.field3804 >> 8;
            int var13 = class229.field3804 >> 8;
            class111.field1883 = ((class265.field4458 & 0xFF00FF) * var13 + (class12.field168 & 0xFF00FF) * var12 & 0xFF00FF00) + ((class265.field4458 & 0xFF00) * var13 + (class12.field168 & 0xFF00) * var12 & 0xFF0000) >> 8;
            class271.field4544 = ((class244.field4029 & 0xFF00) * var13 + (class24.field306 & 0xFF00) * var12 & 0xFF0000) + ((class244.field4029 & 0xFF00FF) * var13 + (class24.field306 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
            class230.field3823 = class304.field5083 * var12 + class287.field4712 * var13 >> 8;
            float var14 = (float) (65536 - class229.field3804) / 65536.0F;
            float var15 = (float) class229.field3804 / 65536.0F;
            class235.field3875 = class232.field3839 * var15 + class187.field3041 * var14;
            class85.field1462 = class24.field307 * var15 + class12.field167 * var14;
            class238.field3933 = class281.field4665 * var15 + class224.field3680 * var14;
        }
        class117.method880(class271.field4544, class85.field1462, class235.field3875, class238.field3933);
        class117.method889(class111.field1883, class230.field3823);
        class117.method884((float) class105.field1788, (float) class131.field2129, (float) class148.field2388);
        class117.method883();
        return class111.field1883;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 120)
    public static final void method873(int arg0) {
        if (arg0 != -23965) {
            method872(-61, 118, 76, 84, 14);
        }
        field1948++;
        class166.field2713.method1415(-18218);
        class142.field2298.method1415(arg0 ^ 0x1AB5);
        class107.field1806.method1415(-18218);
        class168.field2756.method1415(-18218);
    }
}
