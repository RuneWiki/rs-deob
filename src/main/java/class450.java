import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class450 {

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "Z")
    public boolean field6193 = true;

    @OriginalMember(owner = "client!ew", name = "j", descriptor = "Lpr;")
    public static class407 field6200 = new class407(28, 2);

    @OriginalMember(owner = "client!ew", name = "i", descriptor = "C")
    private char field6199;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
    public static int field6192;

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!ew", name = "f", descriptor = "I")
    public static int field6196;

    @OriginalMember(owner = "client!ew", name = "h", descriptor = "I")
    public int field6198;

    @OriginalMember(owner = "client!ew", name = "k", descriptor = "Luba;")
    public static class392 field6201;

    @OriginalMember(owner = "client!ew", name = "g", descriptor = "Ljava/lang/String;")
    public String field6197;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
    public static void method2499(int arg0) {
        field6201 = null;
        if (arg0 != -4115) {
            method2499(85);
        }
        field6200 = null;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Z)Z")
    public final boolean method2500(boolean arg0) {
        field6194++;
        if (!arg0) {
            this.method2500(false);
        }
        return this.field6199 == 's';
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(II)V")
    public static final void method2501(int arg0, int arg1) {
        field6191++;
        class315.method1781(true);
        int var2 = class692.field9748.method1996(16, arg1).field5404;
        if (arg0 >= -116 || var2 == 0) {
            return;
        }
        int var3 = class491.field7127.field3020[arg1];
        if (var2 == 6) {
            class134.field1515 = var3;
        }
        if (var2 == 5) {
            class438.field6096 = var3;
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Liaa;I)V")
    public final void method2502(class452 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2541(35);
            if (var3 == 0) {
                if (arg1 <= 5) {
                    method2499(11);
                }
                field6192++;
                return;
            }
            this.method2504((byte) -7, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(II)V")
    public static final void method2503(int arg0, int arg1) {
        int var2 = 78 / ((arg0 - 10) / 42);
        field6196++;
        class530 var3 = class242.method1402(-103, 3, arg1);
        var3.method3027((byte) -101);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(BILiaa;)V")
    private final void method2504(byte arg0, int arg1, class452 arg2) {
        field6195++;
        if (arg0 != -7) {
            return;
        }
        if (arg1 == 1) {
            this.field6199 = class278.method1589(arg2.method2547(true), false);
        } else if (arg1 == 2) {
            this.field6198 = arg2.method2575((byte) -48);
        } else if (arg1 == 4) {
            this.field6193 = false;
        } else if (arg1 == 5) {
            this.field6197 = arg2.method2516(84);
            return;
        }
    }
}
