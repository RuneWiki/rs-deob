import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class210 extends class17 {

    @OriginalMember(owner = "client!o", name = "nb", descriptor = "I")
    private int field3758;

    @OriginalMember(owner = "client!o", name = "db", descriptor = "[I")
    public static int[] field3748 = new int[32];

    @OriginalMember(owner = "client!o", name = "eb", descriptor = "Lsf;")
    public static class108 field3749 = class140.method973(255, "runes");

    @OriginalMember(owner = "client!o", name = "ib", descriptor = "Lsf;")
    public static class108 field3753 = class140.method973(255, "(U0a )2 in: ");

    @OriginalMember(owner = "client!o", name = "gb", descriptor = "Lsf;")
    public static class108 field3751 = class140.method973(255, "Liste der Welten geladen");

    @OriginalMember(owner = "client!o", name = "jb", descriptor = "Lsf;")
    private static class108 field3754 = class140.method973(255, "Connecting to update server");

    @OriginalMember(owner = "client!o", name = "ab", descriptor = "Lsf;")
    public static class108 field3745 = field3754;

    @OriginalMember(owner = "client!o", name = "pb", descriptor = "[[I")
    public static int[][] field3760 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!o", name = "fb", descriptor = "Lsf;")
    public static class108 field3750 = class140.method973(255, "mapflag");

    @OriginalMember(owner = "client!o", name = "qb", descriptor = "Lsf;")
    public static class108 field3761 = class140.method973(255, "b12_full");

    @OriginalMember(owner = "client!o", name = "bb", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!o", name = "cb", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!o", name = "hb", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!o", name = "kb", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!o", name = "lb", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!o", name = "mb", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!o", name = "ob", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!o", name = "rb", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!o", name = "sb", descriptor = "Lik;")
    public static class262 field3763;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BLrm;I)V", line = 4)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        field3756++;
        if (arg0 != -114) {
            field3761 = (class108) null;
        }
        if (arg2 == 0) {
            this.field3758 = (arg1.method1731(true) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V", line = 42)
    public class210() {
        this(4096);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)Lsf;", line = 50)
    public static final class108 method1453(byte arg0, int arg1) {
        field3757++;
        if (arg0 > -107) {
            method1453((byte) -122, 78);
        }
        return class317.field5454[arg1].method776(0) > 0 ? class117.method833(new class108[] { class186.field3411[arg1], class198.field3565, class317.field5454[arg1] }, false) : class186.field3411[arg1];
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(II)[I", line = 75)
    public final int[] method120(int arg0, int arg1) {
        field3747++;
        int[] var3 = this.field217.method1698(121, arg1);
        if (arg0 >= -95) {
            method1457(48, 60);
        }
        if (this.field217.field4295) {
            class23.method155(var3, 0, class116.field2008, this.field3758);
        }
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(BI)V", line = 104)
    public static final void method1454(byte arg0, int arg1) {
        class10.field127.method637(arg1, 121);
        class177.field3226.method637(arg1, 116);
        if (arg0 != 72) {
            field3751 = (class108) null;
        }
        field3759++;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(I)V", line = 115)
    private class210(int arg0) {
        super(0, true);
        this.field3758 = 4096;
        this.field3758 = arg0;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V", line = 126)
    public static void method1455(byte arg0) {
        field3750 = null;
        if (arg0 != 48) {
            method1454((byte) 54, -98);
        }
        field3749 = null;
        field3745 = null;
        field3748 = null;
        field3753 = null;
        field3754 = null;
        field3763 = null;
        field3761 = null;
        field3760 = (int[][]) null;
        field3751 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lsf;IILsf;)V", line = 155)
    public static final void method1456(class108 arg0, int arg1, int arg2, class108 arg3) {
        if (arg2 < -21) {
            class177.method1257(-1, (class108) null, (byte) -109, arg1, arg0, arg3);
            field3762++;
        }
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(II)Ld;", line = 186)
    public static final class143 method1457(int arg0, int arg1) {
        field3746++;
        class143 var2 = (class143) class261.field4598.method466((long) arg1, 1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class54.field799.method1868(12236, arg0, arg1);
        class143 var4 = new class143();
        if (var3 != null) {
            var4.method989(arg0 ^ 0xFFFFA350, new class249(var3));
        }
        class261.field4598.method468((long) arg1, (byte) -111, var4);
        return var4;
    }
}
