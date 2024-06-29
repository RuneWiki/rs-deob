import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class416 {

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Ljm;")
    private class162 field5762;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "Lhc;")
    public static class368 field5765 = new class368("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "Z")
    public static boolean field5766 = false;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "Z")
    public static volatile boolean field5768 = true;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "Lka;")
    public static class408 field5767 = new class408(4);

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field5757;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "Lvi;")
    private class311 field5759;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZLjm;)V", line = 6)
    public final void method2567(boolean arg0, class162 arg1) {
        this.field5762 = arg1;
        if (!arg0) {
            this.method2572(-117);
        }
        field5758++;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V", line = 17)
    public static final void method2568(int arg0) {
        if (arg0 != -403) {
            field5765 = null;
        }
        field5764++;
        class438.field6181 = 0;
        int var1 = (class359.field4970.field40 >> 7) + class6.field65;
        int var2 = (class359.field4970.field44 >> 7) + class371.field5148;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class438.field6181 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class438.field6181 = 1;
        }
        if (class438.field6181 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class438.field6181 = 0;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V", line = 42)
    public static void method2569(byte arg0) {
        if (arg0 > -33) {
            field5765 = null;
        }
        field5765 = null;
        field5767 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(CI)C", line = 53)
    public static final char method2570(char arg0, int arg1) {
        field5763++;
        if (arg1 == 32021) {
            return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
        } else {
            return (char) 65487;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V", line = 67)
    public static final void method2571(int arg0) {
        field5757++;
        class149.field2171 = arg0;
        class451.field6491.method1168(126);
        class451.field6491.method1162(113, class174.field2483);
        class149.field2171++;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V", line = 88)
    public class416() {
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Ljm;)V", line = 91)
    public class416(class162 arg0) {
        this.field5762 = arg0;
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)Lvi;", line = 101)
    public final class311 method2572(int arg0) {
        field5761++;
        if (arg0 < 49) {
            method2571(55);
        }
        class311 var2 = this.field5762.field2296.field4223;
        if (this.field5762.field2296 == var2) {
            this.field5759 = null;
            return null;
        } else {
            this.field5759 = var2.field4223;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)Lvi;", line = 122)
    public final class311 method2573(int arg0) {
        field5760++;
        class311 var2 = this.field5759;
        if (this.field5762.field2296 == var2) {
            this.field5759 = null;
            return null;
        } else {
            this.field5759 = var2.field4223;
            return arg0 > -122 ? null : var2;
        }
    }
}
