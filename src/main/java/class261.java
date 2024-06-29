import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class261 extends class513 {

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "Lqk;")
    public static class148 field3561 = new class148(54, 3);

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "[[Z")
    public static boolean[][] field3562 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field3563 = new String[5];

    @OriginalMember(owner = "client!ve", name = "J", descriptor = "Lju;")
    public static class102 field3564 = new class102(20, 8);

    @OriginalMember(owner = "client!ve", name = "M", descriptor = "I")
    public static int field3567 = 0;

    @OriginalMember(owner = "client!ve", name = "N", descriptor = "Z")
    public static boolean field3568 = false;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public int field3539;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public int field3540;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public int field3541;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public int field3542;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public int field3543;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public int field3544;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public int field3545;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    public int field3546;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    public int field3547;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    public int field3550;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
    public int field3553;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
    public int field3554;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
    public int field3555;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
    public int field3557;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
    public int field3558;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
    public int field3560;

    @OriginalMember(owner = "client!ve", name = "K", descriptor = "I")
    public int field3565;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "Lue;")
    public class191 field3548;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "Llu;")
    public class194 field3549;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "Laaa;")
    public class25 field3551;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "Lgh;")
    public class49 field3556;

    @OriginalMember(owner = "client!ve", name = "L", descriptor = "[[Lig;")
    public static class674[][] field3566;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/String;BC)I", line = 8)
    public static final int method1619(String arg0, byte arg1, char arg2) {
        field3559++;
        if (arg1 < 40) {
            return -48;
        }
        int var3 = 0;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg0.charAt(var5) == arg2) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V", line = 52)
    public final void method1620(boolean arg0) {
        this.field3549 = null;
        this.field3551 = null;
        if (arg0) {
            this.method1620(false);
        }
        this.field3548 = null;
        this.field3556 = null;
        field3552++;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V", line = 85)
    public static void method1621(byte arg0) {
        field3564 = null;
        field3561 = null;
        field3563 = null;
        if (arg0 != 12) {
            method1621((byte) 29);
        }
        field3566 = null;
        field3562 = null;
    }
}
