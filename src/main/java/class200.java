import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class200 extends class195 {

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "Lli;")
    public static class185 field3670 = class245.method1649("Moteur son pr-Bpar-B", 123);

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "Lli;")
    public static class185 field3668 = class245.method1649("Untersuchen", -48);

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "[I")
    public static int[] field3666 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "I")
    public static int field3671 = 0;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "Lli;")
    public static class185 field3664 = class245.method1649("Module texte charg-B", -106);

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "Lli;")
    private static class185 field3669 = class245.method1649("wave:", 127);

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "Lli;")
    public static class185 field3673 = field3669;

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "I")
    public static int field3674 = 0;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "Z")
    public static boolean field3675 = false;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "Lli;")
    public static class185 field3667 = field3669;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "[Ldd;")
    public static class211[] field3672;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IB)V")
    public static final void method1431(int arg0, byte arg1) {
        field3665++;
        if (arg1 <= -52) {
            class174 var2 = class249.method1671(9, arg0, (byte) -1);
            var2.method1234((byte) -17);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)Lb;")
    public static final class49 method1432(int arg0, int arg1, int arg2) {
        class198 var3 = class153.field2896[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3627; var4++) {
            class49 var5 = var3.field3646[var4];
            if ((var5.field802 >> 29 & 0x3L) == 2L && var5.field816 == arg1 && var5.field796 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
    public static void method1433(int arg0) {
        field3670 = null;
        field3669 = null;
        field3673 = null;
        if (arg0 != 2) {
            method1433(12);
        }
        field3666 = null;
        field3667 = null;
        field3664 = null;
        field3672 = null;
        field3668 = null;
    }
}
