import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class371 {

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "[I")
    public static int[] field5134 = new int[2];

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static volatile int field5137 = -1;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field5139 = 0;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "Ldha;")
    public static class83 field5135 = new class83();

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Lbu;")
    public static class21 field5140 = new class21(66, -1);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V")
    public static final void method2308(boolean arg0) {
        field5133++;
        int[] var1 = new int[class313.field4456.field3769];
        if (!arg0) {
            method2308(false);
        }
        int var2 = 0;
        for (int var3 = 0; var3 < class313.field4456.field3769; var3++) {
            class689 var5 = class313.field4456.method1681(var3, 93);
            if (var5.field9612 >= 0 || var5.field9586 >= 0) {
                var1[var2++] = var3;
            }
        }
        class176.field2738 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class176.field2738[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
    public static void method2309(byte arg0) {
        field5135 = null;
        field5140 = null;
        if (arg0 == 41) {
            field5134 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method2310(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method2310(-19, 22, true);
        }
        field5136++;
        return (arg0 & 0x22) != 0;
    }
}
