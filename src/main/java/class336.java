import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public abstract class class336 {

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "[Lwk;")
    public static class85[] field4536 = new class85[50];

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "Lmc;")
    public static class78 field4533 = new class78(52, 12);

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "Lgd;")
    public static class206 field4537 = new class206("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "[Z")
    public static boolean[] field4539 = new boolean[100];

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field4538 = -1;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)Z", line = 8)
    public final boolean method1917(byte arg0) {
        field4534++;
        if (arg0 == 94) {
            return this.method1923(arg0 + 6) || this.method1921((byte) 101) || this.method1915(arg0 - 25311);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V", line = 19)
    public static void method1918(int arg0) {
        field4537 = null;
        field4536 = null;
        field4533 = null;
        field4539 = null;
        if (arg0 != 0) {
            field4540 = 114;
        }
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(I)Z", line = 37)
    public static final boolean method1922(int arg0) {
        if (arg0 >= -24) {
            method1922(-22);
        }
        field4535++;
        try {
            if (class148.field2106 == 2) {
                if (class422.field5735 == null) {
                    class422.field5735 = class292.method1638(class409.field5607, class4.field55, class410.field5618);
                    if (class422.field5735 == null) {
                        return false;
                    }
                }
                if (class162.field2264 == null) {
                    class162.field2264 = new class231(class40.field577, class390.field5403);
                }
                if (class491.field6866.method1759(class162.field2264, class422.field5735, class462.field6261, 22050, 88)) {
                    class491.field6866.method1749(-100);
                    class491.field6866.method1756(class165.field2285, 256);
                    class491.field6866.method1751(class422.field5735, class90.field1315, 1);
                    class422.field5735 = null;
                    class409.field5607 = null;
                    class162.field2264 = null;
                    class148.field2106 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class491.field6866.method1752((byte) -37);
            class148.field2106 = 0;
            class162.field2264 = null;
            class409.field5607 = null;
            class422.field5735 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)Z")
    public abstract boolean method1915(int arg0);

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)I")
    public abstract int method1916(byte arg0);

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V")
    public abstract void method1919(int arg0);

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)Llm;")
    public abstract class317 method1920(int arg0);

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)Z")
    public abstract boolean method1921(byte arg0);

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)Z")
    public abstract boolean method1923(int arg0);

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "(I)V")
    public abstract void method1924(int arg0);

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "(I)I")
    public abstract int method1925(int arg0);
}
