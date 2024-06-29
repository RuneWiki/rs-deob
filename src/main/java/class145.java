import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class145 extends class44 {

    @OriginalMember(owner = "client!q", name = "u", descriptor = "I")
    public int field2827;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "I")
    public int field2828;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "[Lqf;")
    public static class151[] field2822 = new class151[4];

    @OriginalMember(owner = "client!q", name = "r", descriptor = "Lkb;")
    public static class93 field2824 = class76.method390("Sie befinden sich in einem Mitglieder)2Gebiet(Q", 0);

    @OriginalMember(owner = "client!q", name = "t", descriptor = "Lkb;")
    public static class93 field2826 = class76.method390("nicht hergestellt werden)3", 0);

    @OriginalMember(owner = "client!q", name = "w", descriptor = "Lkb;")
    private static class93 field2829 = class76.method390("Login", 0);

    @OriginalMember(owner = "client!q", name = "n", descriptor = "Lkb;")
    public static class93 field2820 = field2829;

    @OriginalMember(owner = "client!q", name = "x", descriptor = "Z")
    public static boolean field2830 = false;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "Lnb;")
    public static class120 field2821 = new class120(500);

    @OriginalMember(owner = "client!q", name = "y", descriptor = "[Z")
    public static boolean[] field2831 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "Lob;")
    public static class129 field2825;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "Lh;")
    public static class65 field2823;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)Z")
    public static final boolean method900(int arg0) {
        field2819++;
        try {
            if (arg0 != 2569) {
                method900(44);
            }
            if (class24.field365 == 2) {
                if (class178.field3542 == null) {
                    class178.field3542 = class164.method1110(class101.field1852, class188.field3692, class64.field1032);
                    if (class178.field3542 == null) {
                        return false;
                    }
                }
                if (class23.field351 == null) {
                    class23.field351 = new class133(class83.field1532, class15.field272);
                }
                if (class142.field2784.method965(class115.field2169, class23.field351, true, 22050, class178.field3542)) {
                    class142.field2784.method956(0);
                    class142.field2784.method986(16384, class88.field1593);
                    class142.field2784.method967(class178.field3542, class166.field3327, 32128);
                    class178.field3542 = null;
                    class24.field365 = 0;
                    class101.field1852 = null;
                    class23.field351 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class142.field2784.method981((byte) -92);
            class24.field365 = 0;
            class101.field1852 = null;
            class23.field351 = null;
            class178.field3542 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(II)V")
    public class145(int arg0, int arg1) {
        this.field2827 = arg0;
        this.field2828 = arg1;
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V")
    public static void method901(int arg0) {
        field2829 = null;
        field2822 = null;
        field2821 = null;
        field2820 = null;
        field2823 = null;
        field2825 = null;
        field2824 = null;
        if (arg0 != -31658) {
            method901(-48);
        }
        field2826 = null;
        field2831 = null;
    }
}
