import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class87 extends class32 {

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Z")
    public boolean field1668 = false;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "Lij;")
    private static class50 field1672 = class78.method578(121, " from your friend list first)3");

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "Lij;")
    public static class50 field1669 = field1672;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "I")
    public static int field1682 = 0;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "Lkj;")
    public static class56 field1677 = new class56(16);

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
    public static int field1683 = 0;

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "[I")
    public static int[] field1687 = new int[5];

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
    public static int field1688 = 0;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "I")
    public static int field1689 = 0;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "I")
    public static int field1684 = 0;

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "[I")
    public static int[] field1690 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "I")
    public static int field1685 = 0;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public int field1676;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
    public int field1678;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "Lwi;")
    public static class21 field1675;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "[Ljd;")
    public static class85[] field1679;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lce;I)V")
    public static final void method691(class10 arg0, int arg1) {
        field1673++;
        int var2 = arg0.field259;
        if (var2 == 324) {
            if (class63.field1204 == -1) {
                class244.field4248 = arg0.field220;
                class63.field1204 = arg0.field225;
            }
            if (class75.field1427.field697) {
                arg0.field225 = class63.field1204;
            } else {
                arg0.field225 = class244.field4248;
            }
            return;
        }
        if (arg1 != 0) {
            method693(71, -95, 114, 59, -103);
        }
        if (var2 == 325) {
            if (class63.field1204 == -1) {
                class244.field4248 = arg0.field220;
                class63.field1204 = arg0.field225;
            }
            if (class75.field1427.field697) {
                arg0.field225 = class244.field4248;
            } else {
                arg0.field225 = class63.field1204;
            }
        } else if (var2 == 327) {
            arg0.field183 = 150;
            arg0.field276 = (int) (Math.sin((double) class244.field4245 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field159 = -1;
            arg0.field232 = 5;
        } else if (var2 == 328) {
            if (class239.field4067.field3097 == null) {
                arg0.field159 = 0;
            } else {
                arg0.field183 = 150;
                arg0.field276 = (int) (Math.sin((double) class244.field4245 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field232 = 5;
                arg0.field159 = ((int) class239.field4067.field3097.method368((byte) -103) << 11) + 2047;
                arg0.field200 = class239.field4067.field3996;
                arg0.field237 = class239.field4067.field3982;
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
    public static void method692(int arg0) {
        field1669 = null;
        field1675 = null;
        if (arg0 >= -116) {
            return;
        }
        field1687 = null;
        field1679 = null;
        field1672 = null;
        field1690 = null;
        field1677 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIII)I")
    public static final int method693(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 == 29067) {
            int var5 = 65536 - class13.field311[arg2 * 1024 / arg0] >> 1;
            field1671++;
            return ((65536 - var5) * arg1 >> 16) + (arg4 * var5 >> 16);
        } else {
            return -114;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lda;I)V")
    public static final void method694(class22 arg0, int arg1) {
        class121.field2134 = arg0;
        field1680++;
        if (arg1 != 2047) {
            field1684 = 46;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)Z")
    public static final boolean method695(int arg0, int arg1) {
        field1681++;
        if (arg1 == -14718) {
            return arg0 >= 48 && arg0 <= 57;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)V")
    public static final void method696(int arg0) {
        if (arg0 == 5) {
            class99.field1821.method763(0);
            field1674++;
        }
    }
}
