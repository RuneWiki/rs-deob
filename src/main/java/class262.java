import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class262 implements class617 {

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "Lin;")
    private class91 field3754;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "Lnfa;")
    private class679 field3747;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "Lkn;")
    public static class737 field3749 = new class737(2, 4);

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "[[Z")
    public static boolean[][] field3753 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "Lmi;")
    private class496 field3748;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "[I")
    public static int[] field3752;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V", line = 12)
    public final void method1474(int arg0) {
        this.field3748 = class392.method2467(this.field3747.field9212, (byte) 116, this.field3754);
        if (arg0 != 10286) {
            field3753 = null;
        }
        field3755++;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lcea;I)Lgb;", line = 24)
    public static final class216 method1759(class215 arg0, int arg1) {
        if (arg1 == 0) {
            field3751++;
            return new class216(arg0.method1520(13638), arg0.method1520(13638), arg0.method1520(arg1 + 13638), arg0.method1520(13638), arg0.method1499(-1), arg0.method1499(-1), arg0.method1535(255));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BZ)V", line = 35)
    public final void method1475(byte arg0, boolean arg1) {
        field3756++;
        if (arg0 != -49) {
            method1759(null, 101);
        }
        if (!arg1) {
            return;
        }
        int var3 = class467.field6559 > class478.field6661 ? class467.field6559 : class478.field6661;
        int var4 = class22.field488 < class582.field7968 ? class582.field7968 : class22.field488;
        int var5 = this.field3748.method1618();
        int var6 = this.field3748.method1614();
        int var7 = 0;
        int var8 = var3;
        int var9 = var3 * var6 / var5;
        int var10 = (var4 - var9) / 2;
        if (var4 < var9) {
            var9 = var4;
            var8 = var4 * var5 / var6;
            var10 = 0;
            var7 = (var3 - var8) / 2;
        }
        this.field3748.method2924(var7, var10, var8, var9);
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)V", line = 75)
    public static void method1760(byte arg0) {
        if (arg0 > -13) {
            field3749 = null;
        }
        field3749 = null;
        field3752 = null;
        field3753 = null;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lin;Lnfa;)V", line = 90)
    public class262(class91 arg0, class679 arg1) {
        this.field3754 = arg0;
        this.field3747 = arg1;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)Z", line = 100)
    public final boolean method1470(byte arg0) {
        int var2 = -105 % ((25 - arg0) / 52);
        field3750++;
        return this.field3754.method874(false, this.field3747.field9212);
    }
}
