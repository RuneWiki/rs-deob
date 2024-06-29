import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 extends class260 {

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    public static int field107 = 0;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "[F")
    public static float[] field112 = new float[4];

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
    public static int field111 = -1;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "[[Z")
    public static boolean[][] field109 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "Lwj;")
    public static class270 field110 = new class270(86, 0);

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "J")
    public long field115;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "Lie;")
    public class6 field106;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "Lie;")
    public class6 field108;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V", line = 5)
    public static void method35(int arg0) {
        if (arg0 != 32437) {
            field112 = null;
        }
        field110 = null;
        field109 = null;
        field112 = null;
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V", line = 18)
    public final void method36(int arg0) {
        field113++;
        if (this.field106 == null) {
            return;
        }
        this.field106.field108 = this.field108;
        if (arg0 != 0) {
            field107 = -62;
        }
        this.field108.field106 = this.field106;
        this.field106 = null;
        this.field108 = null;
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)Z", line = 43)
    public final boolean method37(int arg0) {
        field117++;
        if (this.field106 == null) {
            return false;
        } else {
            if (arg0 != 0) {
                this.field106 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLjava/lang/String;)V", line = 58)
    public static final void method38(byte arg0, String arg1) {
        field116++;
        if (arg0 <= 24) {
            method38((byte) -62, null);
        }
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIBII)Z", line = 87)
    public static final boolean method39(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field114++;
        if ((class267.field3700[0][arg4][arg3] & 0x2) != 0) {
            return true;
        }
        if (arg2 != -107) {
            field111 = 26;
        }
        if ((class267.field3700[arg1][arg4][arg3] & 0x10) == 0) {
            return class195.method1213(arg4, arg2 + 20917, arg3, arg1) == arg0;
        } else {
            return false;
        }
    }
}
