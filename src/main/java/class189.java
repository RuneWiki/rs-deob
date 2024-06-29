import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public abstract class class189 {

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "[I")
    public static int[] field2947 = new int[256];

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public int field2945;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public int field2946;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public int field2948;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public int field2949;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public int field2951;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public int field2952;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "Z")
    public static boolean field2953;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)V")
    public abstract void method621(int arg0, int arg1);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)V")
    public abstract void method611(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZLvl;)V")
    public static final void method1320(boolean arg0, class73 arg1) {
        field2950++;
        class299.field4769 = class56.method364(arg1, 0, (byte) -87, class263.field4277);
        class192.field3063 = class56.method364(arg1, 0, (byte) -87, class45.field543);
        class5.field76 = class56.method364(arg1, 0, (byte) -87, class233.field3760);
        class27.field311 = class56.method364(arg1, 0, (byte) -87, class165.field2556);
        class111.field1608 = class56.method364(arg1, 0, (byte) -87, class115.field1676);
        class255.field4161 = class56.method364(arg1, 0, (byte) -87, class130.field1870);
        class307.field4955 = class95.method647(arg0, class166.field2564, 0, arg1);
        class61.field886 = class191.method1344(arg1, class210.field3282, 0, 0);
        class287.field4636 = class191.method1344(arg1, class77.field1174, 0, 0);
        class112.field1624 = class3.method18(class236.field3806, 0, -4449, arg1);
        class76.field1146 = class3.method18(class158.field2357, 0, -4449, arg1);
        class178.field2788.method1468(class76.field1146, (int[]) null);
        class183.field2880.method1468(class76.field1146, (int[]) null);
        class306.field4885.method1468(class76.field1146, (int[]) null);
        class48 var2 = class62.method400((byte) 121, 0, class231.field3701, arg1);
        var2.method295();
        class216.field3380 = var2;
        class48[] var3 = class243.method1728(class152.field2271, 0, (byte) -78, arg1);
        for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4].method295();
        }
        if (arg0) {
            class226.field3516 = var3;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method1321(int arg0) {
        if (arg0 < -9) {
            field2947 = null;
        }
    }
}
