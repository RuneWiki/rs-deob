import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class739 {

    @OriginalMember(owner = "client!au", name = "b", descriptor = "Lhda;")
    public static class752 field10202 = new class752(41, 12);

    @OriginalMember(owner = "client!au", name = "e", descriptor = "[Lfk;")
    public static class654[] field10205 = new class654[100];

    @OriginalMember(owner = "client!au", name = "c", descriptor = "I")
    public static int field10203;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "Ltj;")
    public static class198 field10201;

    @OriginalMember(owner = "client!au", name = "f", descriptor = "Lrc;")
    public static class539 field10206;

    @OriginalMember(owner = "client!au", name = "d", descriptor = "[I")
    public static int[] field10204;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V")
    public static final void method4121(int arg0) {
        if (arg0 < 100) {
            field10205 = null;
        }
        field10203++;
        class694.field9657 = 0;
        class102.field1421 = -1;
        class359.field5044 = -1;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(I)V")
    public static void method4122(int arg0) {
        field10201 = null;
        field10206 = null;
        field10205 = null;
        field10202 = null;
        field10204 = null;
        int var1 = -17 / ((arg0 + 4) / 59);
    }
}
