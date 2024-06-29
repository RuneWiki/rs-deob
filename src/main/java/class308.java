import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class308 {

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "[I")
    public static int[] field4172 = new int[13];

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "Lgr;")
    public static class530 field4171 = new class530(77, 1);

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field4177 = 0;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "Lgr;")
    public static class530 field4176 = new class530(12, 18);

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "[Lfw;")
    public static class215[] field4178 = new class215[5];

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field4179 = 0;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IB)V")
    public static final void method1923(int arg0, byte arg1) {
        field4174++;
        class503 var2 = class512.method3112(3, arg0, 0);
        if (arg1 != -32) {
            field4172 = null;
        }
        var2.method3074(-116);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)V")
    public static void method1924(boolean arg0) {
        if (arg0) {
            field4172 = null;
            field4171 = null;
            field4178 = null;
            field4176 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4173++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static final void method1925(int arg0) {
        class100.field1440.method2220(false);
        field4175++;
        if (arg0 != 5) {
            method1923(-56, (byte) 125);
        }
    }

    static {
        for (int var0 = 0; var0 < field4178.length; var0++) {
            field4178[var0] = new class215();
        }
    }
}
