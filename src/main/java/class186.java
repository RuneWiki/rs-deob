import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class186 extends class146 {

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
    public int field3051;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "Lsb;")
    public static class124 field3052;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(Z)V")
    public static final void method1291(boolean arg0) {
        class191 var1 = class229.field3651;
        synchronized (class229.field3651) {
            class77.field1286 = class181.field3009;
            class6.field73++;
            if (!arg0) {
                return;
            }
            if (class104.field1593 >= 0) {
                while (class189.field3080 != class104.field1593) {
                    int var2 = class152.field2480[class189.field3080];
                    class189.field3080 = class189.field3080 + 1 & 0x7F;
                    if (var2 >= 0) {
                        class13.field184[var2] = true;
                    } else {
                        class13.field184[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class13.field184[var3] = false;
                }
                class104.field1593 = class189.field3080;
            }
            class181.field3009 = class249.field3972;
        }
        field3049++;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public static void method1292(int arg0) {
        if (arg0 == 1) {
            field3052 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lkj;I)Ljava/lang/String;")
    public static final String method1293(class114 arg0, int arg1) {
        field3047++;
        if (~client.method1916(arg0).method1686(arg1 + 123) == arg1) {
            return null;
        } else if (arg0.field1826 == null || arg0.field1826.trim().length() == 0) {
            return class199.field3247 ? "Hidden-use" : null;
        } else {
            return arg0.field1826;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILig;)Ljc;")
    public static final class268 method1294(int arg0, class136 arg1) {
        field3050++;
        if (arg0 != 0) {
            field3052 = null;
        }
        return new class268(arg1.method1027((byte) 64), arg1.method1027((byte) 64), arg1.method1027((byte) 64), arg1.method1027((byte) 64), arg1.method1009(115), arg1.method1009(arg0 + 94), arg1.method1012(4));
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
    public class186() {
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(I)V")
    public class186(int arg0) {
        this.field3051 = arg0;
    }
}
