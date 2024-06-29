import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class491 {

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "Los;")
    public static class309 field7193 = new class309("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "Lwm;")
    public static class399 field7197 = new class399(4);

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "[I")
    public static int[] field7199 = new int[1000];

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public static int field7198 = 0;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    public static int field7200 = 0;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public static int field7194;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field7195;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "[Ldu;")
    public static class240[] field7196;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2964(boolean arg0) {
        field7196 = null;
        field7199 = null;
        field7193 = null;
        if (arg0) {
            field7199 = null;
        }
        field7197 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V", line = 23)
    public static final void method2965(int arg0) {
        field7195++;
        client.field3213.method448(class91.field1818, class186.field2990.field2533 ? class498.field7316 + 256 << 0 : -1, 256);
        if (arg0 != 14968) {
            field7198 = 8;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)Z", line = 34)
    public static final boolean method2966(int arg0, int arg1, int arg2) {
        field7194++;
        if (arg0 != 0) {
            field7198 = -39;
        }
        return (class71.method611(arg1, arg2, -119) | (arg1 & 0x2000) != 0 | class307.method1967(arg2, (byte) 102, arg1)) & class362.method2219((byte) 32, arg2, arg1);
    }
}
