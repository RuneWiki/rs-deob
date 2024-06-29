import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class152 {

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "Luk;")
    public static class96 field2873 = new class96(4);

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field2875 = -1;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "Ljd;")
    public static class86 field2877 = class122.method868("(U3", true);

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "Lmg;")
    public static class252 field2876 = new class252(32);

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field2879 = 127;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "Ljd;")
    public static class86 field2878 = class122.method868("<col=ffffff> )4 ", true);

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)V")
    public static final void method1115(byte arg0, int arg1) {
        class206.field3743.method693(6, arg1);
        if (arg0 != 60) {
            field2875 = -19;
        }
        field2872++;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(BI)Z")
    public static final boolean method1116(byte arg0, int arg1) {
        field2871++;
        if (arg0 != -64) {
            method1116((byte) 80, 43);
        }
        if (class84.field1643 != arg1) {
            return false;
        }
        class84.field1643++;
        class229.field4149 = true;
        if (class84.field1643 > 65535) {
            class84.field1643 = 0;
        }
        return true;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
    public static void method1117(int arg0) {
        if (arg0 != 12746) {
            field2873 = null;
        }
        field2873 = null;
        field2877 = null;
        field2878 = null;
        field2876 = null;
    }
}
