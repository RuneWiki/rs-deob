import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class17 {

    @OriginalMember(owner = "client!be", name = "b", descriptor = "Lkh;")
    public static class117 field499 = class224.method1450((byte) -120, "runes");

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field506 = 0;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "Lkh;")
    public static class117 field504 = class224.method1450((byte) 124, "http:)4)4www)3runescape)3com)4l=");

    @OriginalMember(owner = "client!be", name = "h", descriptor = "Lkh;")
    public static class117 field505 = class224.method1450((byte) 125, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!be", name = "a", descriptor = "[Z")
    public static boolean[] field498 = new boolean[100];

    @OriginalMember(owner = "client!be", name = "c", descriptor = "[Lme;")
    public static class136[] field500 = new class136[27];

    @OriginalMember(owner = "client!be", name = "j", descriptor = "Lkh;")
    private static class117 field507 = class224.method1450((byte) 117, "Could not complete login)3");

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Lkh;")
    public static class117 field502 = field507;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "Z")
    public static boolean field508;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public static void method166(int arg0) {
        field505 = null;
        field499 = null;
        if (arg0 != -30319) {
            method167(-120, 94, 32, -36, null, 119, -79);
        }
        field502 = null;
        field500 = null;
        field504 = null;
        field507 = null;
        field498 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIILah;II)V")
    public static final void method167(int arg0, int arg1, int arg2, int arg3, class9 arg4, int arg5, int arg6) {
        field501++;
        int var7 = arg1 * arg1 + arg6 * arg6;
        if (arg2 != -22783 || var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg4.field256 / 2, arg4.field207 / 2);
        if (var7 <= var8 * var8) {
            class248.method1621(arg4, arg3, arg6, false, class191.field3406[arg0], arg1, arg5);
            return;
        }
        var8 -= 10;
        int var9 = client.field776 + class13.field427 & 0x7FF;
        int var10 = class89.field1650[var9];
        int var11 = var10 * 256 / (class174.field3151 + 256);
        int var12 = class89.field1646[var9];
        int var13 = var12 * 256 / (class174.field3151 + 256);
        int var14 = arg1 * var13 + arg6 * var11 >> 16;
        int var15 = arg6 * var13 - arg1 * var11 >> 16;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) (Math.sin(var16) * (double) var8);
        int var19 = (int) ((double) var8 * Math.cos(var16));
        ((class144) class177.field3216[arg0]).method983(arg4.field256 / 2 + arg5 + var18 - 10, arg4.field207 / 2 + arg3 - (var19 + 10), 20, 20, 15, 15, var16, 256);
    }
}
