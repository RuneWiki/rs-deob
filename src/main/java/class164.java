import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class164 extends class195 {

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "[I")
    public int[] field2173;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "[I")
    public int[] field2164;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "F")
    public static float field2166 = 0.0F;

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "I")
    public static int field2172 = 0;

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "I")
    public static int field2169 = 0;

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!sm", name = "w", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILfp;)V", line = 7)
    public static final void method1085(int arg0, class9 arg1) {
        field2168++;
        if (class421.field6094.method2483((byte) -127) == 0) {
            return;
        }
        if (class118.field1594 == arg0) {
            for (class76 var4 = (class76) class421.field6094.method2478(1603); var4 != null; var4 = (class76) class421.field6094.method2486((byte) -82)) {
                class157.field2119.method175(arg1, var4.field963, var4.field962, false, class55.field675, var4.field973 ? class187.field2619.field5556 : null, var4.field964, arg1, false, var4.field976, var4.field965, false);
                var4.method1820(arg0 - 25246);
            }
            class51.method400(-84);
            return;
        }
        if (class157.field2120 == null) {
            Canvas var2 = new Canvas();
            var2.setSize(36, 32);
            class157.field2120 = class9.method151(0, 0, arg0 + 65535, class259.field3819, class267.field3963, var2);
            class370.field5412 = class157.field2120.method122(class378.method2393(class385.field5628, (byte) 88, 0, class93.field1157), class144.method993(class257.field3813, class93.field1157, 0), true);
        }
        for (class76 var3 = (class76) class421.field6094.method2478(arg0 + 1603); var3 != null; var3 = (class76) class421.field6094.method2486((byte) -82)) {
            class157.field2119.method175(arg1, var3.field963, var3.field962, false, class370.field5412, var3.field973 ? class187.field2619.field5556 : null, var3.field964, class157.field2120, false, var3.field976, var3.field965, false);
            var3.method1820(-25246);
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)V", line = 56)
    public static final void method1086(byte arg0) {
        field2167++;
        if (class72.field933 != null) {
            class72.field933.method2695(0);
            class72.field933 = null;
        }
        if (arg0 < 32) {
            return;
        }
        class446.method2748(-109);
        class359.method2285();
        for (int var1 = 0; var1 < 4; var1++) {
            class382.field5610[var1].method1221((byte) -49);
        }
        class188.method1285((byte) 109, false);
        System.gc();
        class88.method593((byte) 48, 2);
        class29.field408 = false;
        class343.field5048 = -1;
        class387.method2443(-1066, true);
        class388.field5663 = false;
        class28.field399 = 0;
        class134.field1846 = 0;
        class92.field1147 = 0;
        class135.field1854 = 0;
        for (int var2 = 0; var2 < class331.field4910.length; var2++) {
            class331.field4910[var2] = null;
        }
        class458.method2831((byte) -28);
        for (int var3 = 0; var3 < 2048; var3++) {
            class455.field6731[var3] = null;
        }
        class14.field231 = 0;
        for (int var4 = 0; var4 < 32768; var4++) {
            class364.field5260[var4] = null;
        }
        class200.field2828.method600(-73);
        class137.method912(1);
        class458.field6776 = 0;
        class256.method1711((byte) 84);
        class195.method1356(-111);
        class377.method2386((byte) 92);
        class227.method1554(true, -87);
        try {
            class73.method521(true, class267.field3963.field5023, "loggedout");
        } catch (Throwable var5) {
        }
        class408.field5874 = null;
        class167.field2198 = 0L;
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(II)I", line = 136)
    public static final int method1087(int arg0, int arg1) {
        field2170++;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = -13 / ((72 - arg1) / 33);
        int var8 = var6 | var6 >>> 16;
        return arg0 & ~var8;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILkg;)V", line = 159)
    public static final void method1088(int arg0, class223 arg1) {
        field2165++;
        if (!class147.field1993) {
            return;
        }
        class257.method1773((byte) -10, class419.field6073);
        class147.field1995++;
        if (arg0 >= -92) {
            return;
        }
        class159.field2132.method1721(25153, arg1.field3223);
        class159.field2132.method1744((byte) -108, arg1.field3363);
        class159.field2132.method1756(class243.field3605, (byte) 90);
        class159.field2132.method1707(arg1.field3270, -67);
        class159.field2132.method1750((byte) 0, class74.field949);
        class159.field2132.method1750((byte) 0, class155.field2092);
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(II[I[I)V", line = 181)
    public class164(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field2173 = arg2;
        this.field2164 = arg3;
    }
}
