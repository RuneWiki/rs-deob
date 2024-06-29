import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gka")
public class class391 {

    @OriginalMember(owner = "client!gka", name = "b", descriptor = "Lbu;")
    public static class21 field5382 = new class21(32, 4);

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "I")
    public int field5381;

    @OriginalMember(owner = "client!gka", name = "c", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!gka", name = "d", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!gka", name = "e", descriptor = "I")
    public int field5385;

    @OriginalMember(owner = "client!gka", name = "f", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!gka", name = "g", descriptor = "I")
    public int field5387;

    @OriginalMember(owner = "client!gka", name = "h", descriptor = "[Llaa;")
    public static class130[] field5388;

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(Z[BI)V")
    public static final void method2421(boolean arg0, byte[] arg1, int arg2) {
        if (class353.field4966 == null) {
            class353.field4966 = new class494(20000);
        }
        if (arg2 != 26603) {
            field5382 = null;
        }
        field5386++;
        class353.field4966.method2936(9278, 0, arg1, arg1.length);
        if (!arg0) {
            return;
        }
        class278.method1808(arg2 ^ 0x67FB, class353.field4966.field7050);
        class386.field5355 = new class204[class637.field8944];
        int var3 = 0;
        for (int var4 = class693.field9664; var4 <= class734.field10151; var4++) {
            class204 var5 = class577.method3390(2, var4);
            if (var5 != null) {
                class386.field5355[var3++] = var5;
            }
        }
        class368.field5110 = false;
        class693.field9668 = class459.method2731(118);
        class353.field4966 = null;
    }

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(Z)V")
    public static void method2422(boolean arg0) {
        field5382 = null;
        field5388 = null;
        if (!arg0) {
            field5382 = null;
        }
    }

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(Ljc;I)Ljc;")
    public static final class462 method2423(class462 arg0, int arg1) {
        field5383++;
        class462 var2 = arg0 == null ? new class462() : new class462(arg0);
        var2.method2755(128, 9, (byte) -93);
        if (arg1 != 13955) {
            field5382 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(B)[Lin;")
    public static final class97[] method2424(byte arg0) {
        if (arg0 >= -37) {
            field5382 = null;
        }
        field5384++;
        return new class97[] { class651.field9092, class21.field350, class159.field2543 };
    }
}
