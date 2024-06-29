import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public abstract class class198 {

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field3122 = 0;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "Luk;")
    public static class100 field3120 = new class100(16);

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "[[B")
    public static byte[][] field3123;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public static final void method1346(byte arg0) {
        field3117++;
        class244.field3966.method1888(0);
        class235.field3773.method1888(110);
        if (arg0 <= 118) {
            method1347(-124, -90, true);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLud;)Lud;")
    public abstract class2 method532(byte arg0, class2 arg1);

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIZ)V")
    public static final void method1347(int arg0, int arg1, boolean arg2) {
        field3118++;
        class217 var3 = class164.method1110(-90, arg0);
        if (arg2) {
            method1346((byte) -45);
        }
        int var4 = var3.field3357;
        int var5 = var3.field3361;
        int var6 = var3.field3359;
        int var7 = class62.field1065[var6 - var4];
        if (arg1 < 0 || var7 < arg1) {
            arg1 = 0;
        }
        int var8 = var7 << var4;
        class80.method577(arg1 << var4 & var8 | class31.field462[var5] & ~var8, 2, var5);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public static final int method1348(boolean arg0, String arg1) {
        field3121++;
        if (class93.field1596 == null || arg1.length() == 0) {
            return -1;
        }
        if (!arg0) {
            method1349((byte) 126);
        }
        for (int var2 = 0; var2 < class93.field1596.field3233; var2++) {
            if (class50.method376(" ", 0, class93.field1596.field3242[var2], "<br>").equals(arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V")
    public static void method1349(byte arg0) {
        field3123 = null;
        field3120 = null;
        if (arg0 != -25) {
            field3120 = null;
        }
    }
}
