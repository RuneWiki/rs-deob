import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class74 extends class418 {

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1041 = " ";

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "Lwh;")
    public static class288 field1035;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "Ll;")
    public class315 field1037;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "Z")
    public boolean field1042;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ltj;Lir;BLir;)V")
    public static final void method599(class298 arg0, class185 arg1, byte arg2, class185 arg3) {
        class276.field4054 = class290.method1970(class340.field5019, 0, -1, arg1);
        field1036++;
        class237.field3304 = arg0.method446(class276.field4054, class10.method75(arg3, class340.field5019, 0), true);
        class298.field4504 = class290.method1970(class409.field5942, 0, -1, arg1);
        if (arg2 <= 124) {
            method602((byte) 90);
        }
        class41.field630 = arg0.method446(class298.field4504, class10.method75(arg3, class409.field5942, 0), true);
        class233.field3232 = class290.method1970(class387.field5668, 0, -1, arg1);
        class199.field2756 = arg0.method446(class233.field3232, class10.method75(arg3, class387.field5668, 0), true);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)I")
    public static final int method600(int arg0, byte arg1) {
        field1040++;
        if (arg0 == 16711935) {
            return -1;
        } else {
            int var2 = -8 / ((arg1 - 33) / 62);
            return class335.method2188((byte) -95, arg0);
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public static void method601(int arg0) {
        field1041 = null;
        field1035 = null;
        if (arg0 > -31) {
            method602((byte) -86);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public static final void method602(byte arg0) {
        field1039++;
        int var1 = 0;
        if (arg0 != 108) {
            return;
        }
        if (class273.field4015) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        class170.method1139(arg0 ^ 0xFFFFFF93, var1);
        class227.method1477(1, var1);
        class422.method2657((byte) 126, var1);
        class237.method1537((byte) 67, var1);
        class173.method1152(-122, var1);
        class143.method993((byte) 80, var1);
        class154.method1038(var1, (byte) -57);
        class143.method988(arg0 ^ 0x3418, var1);
        class290.method1974((byte) -119, var1);
        if (class381.field5579 == 10) {
            class63.method558(28, true);
        } else if (class381.field5579 == 30) {
            class63.method558(25, true);
        }
    }
}
