import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public abstract class class11 extends class439 {

    @OriginalMember(owner = "client!vl", name = "C", descriptor = "Lqg;")
    public class321 field190;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "I")
    public static int field179 = 50;

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "I")
    public static int field175 = 2;

    @OriginalMember(owner = "client!vl", name = "s", descriptor = "[I")
    public static int[] field180 = new int[field179];

    @OriginalMember(owner = "client!vl", name = "v", descriptor = "[I")
    public static int[] field183 = new int[field179];

    @OriginalMember(owner = "client!vl", name = "y", descriptor = "[I")
    public static int[] field186 = new int[field179];

    @OriginalMember(owner = "client!vl", name = "t", descriptor = "[I")
    public static int[] field181 = new int[field179];

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "[B")
    public static byte[] field187 = new byte[520];

    @OriginalMember(owner = "client!vl", name = "A", descriptor = "[I")
    public static int[] field188 = new int[field179];

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field177 = new String[field179];

    @OriginalMember(owner = "client!vl", name = "F", descriptor = "[I")
    public static int[] field193 = new int[field179];

    @OriginalMember(owner = "client!vl", name = "E", descriptor = "Lko;")
    public static class348 field192 = new class348();

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!vl", name = "u", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!vl", name = "w", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!vl", name = "x", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!vl", name = "D", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!vl", name = "B", descriptor = "Z")
    public boolean field189;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)I", line = 6)
    public int method88(int arg0) {
        field185++;
        if (arg0 != 24448) {
            this.method91(null, 113, null, 23);
        }
        return 0;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)Z", line = 21)
    public final boolean method89(byte arg0) {
        if (arg0 != 107) {
            this.field190 = null;
        }
        field178++;
        return this.field189;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)Z", line = 54)
    public final boolean method93(boolean arg0) {
        if (arg0) {
            this.method92(100);
        }
        field184++;
        return false;
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(Z)I", line = 65)
    public final int method94(boolean arg0) {
        field182++;
        return arg0 ? -105 : 1;
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(B)V", line = 77)
    public static void method96(byte arg0) {
        field181 = null;
        field192 = null;
        field187 = null;
        field180 = null;
        field186 = null;
        field183 = null;
        field188 = null;
        if (arg0 == -97) {
            field177 = null;
            field193 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lqg;)V", line = 121)
    public class11(class321 arg0) {
        this.field190 = arg0;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IBI)V")
    public abstract void method86(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V")
    public abstract void method87(int arg0, int arg1);

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)Z")
    public abstract boolean method90(int arg0);

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljp;ILjp;I)V")
    public abstract void method91(class236 arg0, int arg1, class236 arg2, int arg3);

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "(I)Z")
    public abstract boolean method92(int arg0);

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "(I)V")
    public abstract void method95(int arg0);
}
