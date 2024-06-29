import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class145 {

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public int field2526 = 1;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "Lqfa;")
    public static class85 field2520 = new class85(116, 6);

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "C")
    public char field2524;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "Lom;")
    public static class344 field2523;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
    public static void method1158(byte arg0) {
        field2523 = null;
        field2520 = null;
        if (arg0 != 13) {
            field2520 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lqh;I)V")
    public final void method1159(class61 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method732(-559537960);
            if (var3 == 0) {
                field2521++;
                if (arg1 != 6) {
                    this.field2524 = '8';
                    return;
                }
                return;
            }
            this.method1160(arg0, var3, -63);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lqh;II)V")
    private final void method1160(class61 arg0, int arg1, int arg2) {
        if (arg2 >= -29) {
            return;
        }
        if (arg1 == 1) {
            this.field2524 = class370.method2344(-7588, arg0.method710((byte) 43));
        } else if (arg1 == 2) {
            this.field2526 = 0;
        }
        field2525++;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)Ljava/lang/String;")
    public static final String method1161(int arg0) {
        field2527++;
        if (arg0 != 2) {
            method1162(-15, -23, (byte) 97);
        }
        String var1 = "www";
        if (class625.field9027 == class585.field8446) {
            var1 = "www-wtrc";
        } else if (class643.field9240 == class625.field9027) {
            var1 = "www-wtqa";
        } else if (class72.field1495 == class625.field9027) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class422.field6110 != null) {
            var2 = "/p=" + class422.field6110;
        }
        return "http://" + var1 + "." + class78.field1573.field5799 + ".com/l=" + class140.field2466 + "/a=" + class292.field4385 + var2 + "/";
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIB)B")
    public static final byte method1162(int arg0, int arg1, byte arg2) {
        field2522++;
        if (arg0 == 9) {
            if (arg2 != 106) {
                field2520 = null;
            }
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }
}
