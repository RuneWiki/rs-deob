import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class83 {

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "Lgi;")
    public static class164 field1334;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "Z")
    public static boolean field1332;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BLhd;)I")
    public static final int method595(byte arg0, class12 arg1) {
        field1331++;
        if (arg0 != -29) {
            return 74;
        }
        int var2 = arg1.field227;
        class254 var3 = arg1.method403((byte) 106);
        if (arg1.field947 == var3.field4180) {
            var2 = arg1.field239;
        } else if (arg1.field947 == var3.field4183 || arg1.field947 == var3.field4174 || arg1.field947 == var3.field4196 || arg1.field947 == var3.field4195) {
            var2 = arg1.field250;
        } else if (arg1.field947 == var3.field4176 || arg1.field947 == var3.field4194 || arg1.field947 == var3.field4175 || arg1.field947 == var3.field4168) {
            var2 = arg1.field218;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public static void method596(byte arg0) {
        field1334 = null;
        if (arg0 != 23) {
            field1332 = false;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)I")
    public static final int method597(int arg0) {
        if (arg0 != 38) {
            method598(-9, 49L);
        }
        field1330++;
        return class106.field1652.method1881(true);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IJ)V")
    public static final void method598(int arg0, long arg1) {
        field1333++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class146.field2345 < 100 || class89.field1396) || class146.field2345 >= 200) {
            class74.method536(class68.field1085, "", (byte) -69, 0);
            return;
        }
        String var3 = class125.method857(arg1, (byte) -105);
        for (int var4 = 0; var4 < class146.field2345; var4++) {
            if (class44.field651[var4] == arg1) {
                class74.method536(var3 + class247.field3887, "", (byte) -93, 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class34.field562; var5++) {
            if (class161.field2634[var5] == arg1) {
                class74.method536(class287.field4643 + var3 + class66.field1073, "", (byte) -83, 0);
                return;
            }
        }
        if (var3.equals(class217.field3408.field222)) {
            class74.method536(class140.field2279, "", (byte) -66, 0);
            return;
        }
        class291.field4759++;
        class240.field3748[class146.field2345] = var3;
        class44.field651[class146.field2345] = arg1;
        class135.field2186[class146.field2345] = arg0;
        class6.field128[class146.field2345] = "";
        class210.field3359[class146.field2345] = 0;
        class112.field1721[class146.field2345] = false;
        class146.field2345++;
        class24.field439 = class68.field1083;
        class311.field5027.method2081(false, 38);
        class311.field5027.method1840((byte) 47, arg1);
    }
}
