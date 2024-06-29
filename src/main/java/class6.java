import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public abstract class class6 {

    @OriginalMember(owner = "client!er", name = "d", descriptor = "[I")
    public static int[] field60 = new int[3];

    @OriginalMember(owner = "client!er", name = "c", descriptor = "Z")
    public static boolean field59 = true;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "Leba;")
    public static class550 field57 = new class550(71, 0);

    @OriginalMember(owner = "client!er", name = "i", descriptor = "I")
    public static int field65 = -1;

    @OriginalMember(owner = "client!er", name = "h", descriptor = "Ltt;")
    public static class338 field64 = new class338(37, 7);

    @OriginalMember(owner = "client!er", name = "j", descriptor = "I")
    public static int field66 = 0;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!er", name = "e", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "Lga;")
    public static class332 field62;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILio;)Ljp;", line = 3)
    public static final class77 method40(int arg0, class157 arg1) {
        field58++;
        class689 var2 = class423.method2389(arg1, 1);
        int var3 = arg1.method963(-121);
        int var4 = arg1.method963(-126);
        int var5 = arg1.method963(-122);
        int var6 = arg1.method963(-120);
        int var7 = arg1.method963(-121);
        if (arg0 != -18254) {
            method40(11, null);
        }
        int var8 = arg1.method963(arg0 + 18129);
        return new class77(var2.field9726, var2.field9729, var2.field9731, var2.field9736, var2.field9733, var2.field9743, var2.field9744, var2.field9727, var2.field9740, var3, var4, var5, var6, var7, var8);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V", line = 29)
    public static void method41(int arg0) {
        field62 = null;
        field60 = null;
        field64 = null;
        if (arg0 != 7) {
            method41(115);
        }
        field57 = null;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lok;B)Lok;")
    public abstract class99 method42(class99 arg0, byte arg1);
}
