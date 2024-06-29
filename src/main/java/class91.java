import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class91 {

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Z")
    public static boolean field1417 = false;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "S")
    public static short field1424 = 256;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "Z")
    public static boolean field1425 = false;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field1421 = -1;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "Lub;")
    public static class92 field1419;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V")
    public static final void method690(String arg0, int arg1, String arg2, int arg3) {
        class129.field1922 = arg0;
        class76.field1174 = arg2;
        field1426++;
        class20.field289 = arg3;
        if (class76.field1174.equals("") || class129.field1922.equals("")) {
            class129.field1921 = 3;
        } else if (class49.field807 == arg1) {
            class298.field4806 = 0;
            class129.field1921 = -3;
            class233.field3686 = 1;
            class170.field2581 = 0;
            class31 var4 = new class31(128);
            var4.method305(10, true);
            var4.method258((int) (Math.random() * 9.9999999E7D), -1527329320);
            var4.method313(-6968, class170.method1223(true, class76.field1174));
            var4.method258((int) (Math.random() * 9.9999999E7D), -1527329320);
            var4.method288(class129.field1922, (byte) -43);
            var4.method258((int) (Math.random() * 9.9999999E7D), arg1 ^ 0x5B093227);
            var4.method270(-26120, class283.field4456, class79.field1198);
            class240.field3826.field541 = 0;
            class240.field3826.method305(24, true);
            class240.field3826.method305(var4.field541 + 2, true);
            class240.field3826.method281((byte) -117, 546);
            class240.field3826.method302(var4.field541, 6103, 0, var4.field560);
        } else {
            class137.method1019(75);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILfh;)I")
    public static final int method691(int arg0, class136 arg1) {
        if (arg0 != 21272) {
            field1417 = false;
        }
        field1422++;
        int var2 = arg1.field2058;
        class241 var3 = arg1.method1982((byte) 116);
        if (arg1.field4736 == var3.field3872) {
            var2 = arg1.field2032;
        } else if (arg1.field4736 == var3.field3844 || arg1.field4736 == var3.field3855 || arg1.field4736 == var3.field3843 || arg1.field4736 == var3.field3842) {
            var2 = arg1.field2036;
        } else if (arg1.field4736 == var3.field3835 || arg1.field4736 == var3.field3840 || arg1.field4736 == var3.field3837 || arg1.field4736 == var3.field3834) {
            var2 = arg1.field2062;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public static final void method692(byte arg0) {
        if (arg0 != -67) {
            field1425 = true;
        }
        class98.field1571.method1172((byte) 112);
        field1420++;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V")
    public static void method693(byte arg0) {
        field1419 = null;
        int var1 = -106 % ((-arg0 - 6) / 57);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIII)V")
    public static final void method694(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != -14078) {
            return;
        }
        if (class184.field2914 <= (arg2 - arg1) && arg1 + arg2 <= class2.field42 && arg4 - arg1 >= class112.field1727 && (arg1 + arg4) <= class278.field4410) {
            class174.method1245(arg0, arg2, arg1, arg6, arg4, (byte) 75, arg3);
        } else {
            class226.method1560(arg4, (byte) 119, arg6, arg1, arg0, arg2, arg3);
        }
        field1418++;
    }
}
