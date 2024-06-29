import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class14 extends class132 {

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "Ltg;")
    public static class184 field266 = class135.method812("Lade Benutzeroberfl-=che )2 ", 3);

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
    public static int field261 = -1;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
    public static int field259 = 0;

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "Ltg;")
    public static class184 field270 = null;

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "Lnd;")
    public static class127 field275 = new class127(260);

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "Ltg;")
    private static class184 field277 = class135.method812("Press (Wchange your password(W on front page)3", 3);

    @OriginalMember(owner = "client!bc", name = "O", descriptor = "Ltg;")
    public static class184 field280 = field277;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public int field252;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public int field254;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    public int field255;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    public int field256;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
    public int field257;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
    public int field260;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
    public int field265;

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
    public int field268;

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "I")
    public int field271;

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "I")
    public int field272;

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "Lrf;")
    public class165 field264;

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "Lrf;")
    public class165 field269;

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "Lud;")
    public static class190 field279;

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "Lvb;")
    public static class197 field276;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "Lfh;")
    public class58 field262;

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "[I")
    public int[] field274;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)I")
    public static final int method87(int arg0, int arg1) {
        field251++;
        if (arg1 != -1) {
            method89(98);
        }
        return arg0 >> 11 & 0x3F;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(II)Lfh;")
    public static final class58 method88(int arg0, int arg1) {
        int var2 = 55 % ((-arg0 - 36) / 35);
        field258++;
        class58 var3 = (class58) class108.field1945.method773((long) arg1, 1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class18.field350.method1249((byte) -98, arg1, 6);
        class58 var5 = new class58();
        var5.field1052 = arg1;
        if (var4 != null) {
            var5.method314(-18, new class97(var4));
        }
        var5.method312((byte) -107);
        if (var5.field1078) {
            var5.field1047 = false;
            var5.field1060 = 0;
        }
        class108.field1945.method776(var5, (long) arg1, (byte) -47);
        return var5;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
    public static void method89(int arg0) {
        field277 = null;
        field275 = null;
        field279 = null;
        if (arg0 == 0) {
            field270 = null;
            field280 = null;
            field266 = null;
            field276 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(Z)V")
    public final void method90(boolean arg0) {
        field273++;
        int var2 = this.field272;
        class58 var3 = this.field262.method316(-1);
        if (arg0) {
            return;
        }
        if (var3 == null) {
            this.field252 = 0;
            this.field274 = null;
            this.field272 = -1;
            this.field257 = 0;
            this.field271 = 0;
        } else {
            this.field252 = var3.field1080;
            this.field257 = var3.field1070 * 128;
            this.field274 = var3.field1029;
            this.field271 = var3.field1079;
            this.field272 = var3.field1045;
        }
        if (this.field272 != var2 && this.field269 != null) {
            class26.field467.method141(this.field269);
            this.field269 = null;
        }
    }
}
