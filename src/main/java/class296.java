import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public abstract class class296 extends class321 {

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "[S")
    public static short[] field4664 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
    public static int field4665 = 0;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "S")
    public static short field4666 = 256;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "Ljava/lang/String;")
    public static String field4668 = "";

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V")
    public static final void method1990(byte arg0) {
        field4669++;
        if (arg0 != 99) {
            field4665 = 112;
        }
        for (class140 var1 = (class140) class392.field5958.method2123(79); var1 != null; var1 = (class140) class392.field5958.method2126((byte) 61)) {
            if (class46.method341((byte) 118, var1.field1894)) {
                class62.method456(-106, var1);
            }
        }
        if (class501.field7514 == 1) {
            class94.method643(15831);
            return;
        }
        class346.method2292(class201.field3054, arg0 ^ 0x63, class521.field7715, class64.field1007, field4670);
        int var2 = class306.field4807.method2252(class340.field5312.method1583(115, class12.field131), arg0 - 99);
        for (class140 var3 = (class140) class392.field5958.method2123(86); var3 != null; var3 = (class140) class392.field5958.method2126((byte) 61)) {
            int var4 = class540.method3191(var3, (byte) -115);
            if (var2 < var4) {
                var2 = var4;
            }
        }
        class201.field3054 = var2 + 8;
        class64.field1007 = (class377.field5794 ? 26 : 22) + class501.field7514 * 16;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V")
    public static void method1991(int arg0) {
        field4664 = null;
        field4668 = null;
        if (arg0 != -4160) {
            method1990((byte) 36);
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)Lea;")
    public abstract class15 method1080(byte arg0);
}
