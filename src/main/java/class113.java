import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public abstract class class113 extends class539 {

    @OriginalMember(owner = "client!qea", name = "m", descriptor = "[I")
    public static int[] field1531 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!qea", name = "o", descriptor = "Luc;")
    public static class27 field1533 = new class27(15, 8);

    @OriginalMember(owner = "client!qea", name = "q", descriptor = "Lfc;")
    public static class235 field1535 = new class235(101, -1);

    @OriginalMember(owner = "client!qea", name = "n", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!qea", name = "p", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!qea", name = "r", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)I")
    public abstract int method840(int arg0);

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(B)V")
    public static void method841(byte arg0) {
        field1533 = null;
        int var1 = 64 % ((arg0 - 33) / 45);
        field1531 = null;
        field1535 = null;
    }

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(I)I")
    public abstract int method842(int arg0);

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(B)J")
    public abstract long method843(byte arg0);

    @OriginalMember(owner = "client!qea", name = "f", descriptor = "(I)I")
    public abstract int method844(int arg0);

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(III)Z")
    public static final boolean method845(int arg0, int arg1, int arg2) {
        field1536++;
        if (arg1 != -28460) {
            field1531 = null;
        }
        return class469.method2670(arg2, (byte) -112, arg0) | (arg0 & 0x70000) != 0 || class513.method2846(arg0, arg2, (byte) 122);
    }

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(Z)V")
    public static final void method846(boolean arg0) {
        field1534++;
        if (!arg0) {
            method846(true);
        }
        if (!class91.field1211) {
            return;
        }
        while (true) {
            while (class515.field7038 < class182.field2690.length) {
                class233 var1 = class182.field2690[class515.field7038];
                if (var1 != null && var1.field3307 == -1) {
                    if (class363.field5180 == null) {
                        class363.field5180 = class486.field6740.method1226(var1.field3308, (byte) -121);
                    }
                    int var2 = class363.field5180.field5096;
                    if (var2 == -1) {
                        return;
                    }
                    var1.field3307 = var2;
                    class363.field5180 = null;
                    class515.field7038++;
                } else {
                    class515.field7038++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!qea", name = "g", descriptor = "(I)I")
    public abstract int method847(int arg0);
}
