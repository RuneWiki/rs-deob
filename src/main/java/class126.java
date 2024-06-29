import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class126 {

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "Z")
    public static boolean field2198 = false;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field2199 = 0;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field2205 = -1;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "Z")
    public static boolean field2204 = false;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field2207 = 2301979;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "Lpj;")
    public static class237 field2208 = class33.method353("Suche nach Updates )2 ", 68);

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "[I")
    public static int[] field2202 = new int[2048];

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZB)V")
    public static final void method893(boolean arg0, byte arg1) {
        if (arg0) {
            if (class84.field1573 != -1) {
                class269.method1788((byte) 84, class84.field1573);
            }
            for (class58 var2 = (class58) class164.field2915.method566(0); var2 != null; var2 = (class58) class164.field2915.method565(-35)) {
                class210.method1405(19337, var2, true);
            }
            class84.field1573 = -1;
            class164.field2915 = new class69(8);
            class96.method721(23936);
            class84.field1573 = class269.field4605;
            class101.method769((byte) -106, false);
            class178.method1233((byte) 122);
            class15.method136(class84.field1573, 126);
        }
        field2200++;
        class229.field3911 = new class271();
        class229.field3911.field3710 = 3000;
        if (arg1 < 107) {
            method895(-57);
        }
        class229.field3911.field3700 = 3000;
        class143.method985(class76.field1440, 0);
        class79.method610(10, (byte) 118);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static void method894(int arg0) {
        field2208 = null;
        if (arg0 != 0) {
            field2199 = 18;
        }
        field2202 = null;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
    public static final void method895(int arg0) {
        int var1 = 0;
        if (arg0 != 104) {
            return;
        }
        field2203++;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class235.method1574(true, var1, var2, 4095, var3, class274.field4775)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }
}
