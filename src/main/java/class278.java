import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class278 {

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "Z")
    public static boolean field3918 = false;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "Z")
    public static boolean field3920 = false;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "Ljr;")
    public static class112 field3921 = new class112(8);

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field3922 = -1;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field3923 = -1;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILua;)V")
    public static final void method1827(int arg0, class665 arg1) {
        if (arg0 < 59) {
            method1829(-51, 64, -115, null, -96);
        }
        for (int var2 = 0; var2 < class495.field6867; var2++) {
            int var3 = class131.field2196[var2];
            class598 var4 = class49.field1040[var3];
            int var5 = arg1.method1535(255);
            if ((var5 & 0x40) != 0) {
                var5 += arg1.method1535(255) << 8;
            }
            if ((var5 & 0x4000) != 0) {
                var5 += arg1.method1535(255) << 16;
            }
            class405.method2526(arg1, var3, var5, 123, var4);
        }
        field3919++;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static void method1828(int arg0) {
        if (arg0 != 64) {
            method1827(-7, null);
        }
        field3921 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIILwm;I)V")
    public static final void method1829(int arg0, int arg1, int arg2, class564 arg3, int arg4) {
        field3917++;
        if (arg4 != -19692) {
            method1828(10);
        }
        arg3.field7778.method1539((byte) 124, arg0);
        arg3.field7778.method1485((byte) 107, arg2);
        arg3.field7778.method1485((byte) 107, arg1);
    }
}
