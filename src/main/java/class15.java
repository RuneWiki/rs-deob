import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public abstract class class15 {

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Lcm;")
    public static class449 field247 = new class449(51, -1);

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "[I")
    public static int[] field249 = new int[1000];

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "Ler;")
    public static class157 field250 = new class157(4);

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "[Z")
    public static boolean[] field252 = new boolean[100];

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Lht;")
    public static class80 field251;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 6)
    public static void method129(int arg0) {
        field251 = null;
        field249 = null;
        if (arg0 >= 116) {
            field252 = null;
            field247 = null;
            field250 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V", line = 21)
    public static final void method130(int arg0) {
        if (arg0 != 0) {
            return;
        }
        if (class97.field1410 <= 0) {
            class350.field5444 = "";
        } else {
            int var1 = 0;
            for (int var2 = 0; var2 < class341.field5382.length; var2++) {
                if (class341.field5382[var2].startsWith("--> ")) {
                    var1++;
                    if (class97.field1410 == var1) {
                        class350.field5444 = class341.field5382[var2].substring(4);
                        break;
                    }
                }
            }
        }
        field246++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)I", line = 58)
    public static final int method131(int arg0, byte arg1) {
        int var2 = 121 / ((12 - arg1) / 36);
        field248++;
        return arg0 >>> 8;
    }
}
