import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class58 {

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "Lvh;")
    private class276 field977 = new class276();

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "Z")
    public static boolean field968 = true;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field976 = 0;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public static int field981 = 0;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "Loa;")
    public static class99 field969 = class221.method1463(2844, "<col=ffffff>");

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "B")
    public static byte field979;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "Lqk;")
    public static class209 field975;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "Lvh;")
    private class276 field982;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static void method390(int arg0) {
        if (arg0 != 0) {
            field978 = -26;
        }
        field975 = null;
        field969 = null;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)Lvh;")
    public final class276 method391(int arg0) {
        if (arg0 < 105) {
            field976 = 83;
        }
        class276 var2 = this.field982;
        field972++;
        if (this.field977 == var2) {
            this.field982 = null;
            return null;
        } else {
            this.field982 = var2.field4851;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)I")
    public final int method392(byte arg0) {
        int var2 = 0;
        class276 var3 = this.field977.field4851;
        field980++;
        while (this.field977 != var3) {
            var3 = var3.field4851;
            var2++;
        }
        return arg0 < 47 ? 123 : var2;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)Lvh;")
    public final class276 method393(byte arg0) {
        field974++;
        class276 var2 = this.field977.field4851;
        if (this.field977 == var2) {
            this.field982 = null;
            return null;
        } else {
            int var3 = 77 % ((-arg0 - 47) / 34);
            this.field982 = var2.field4851;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)V")
    public static final void method394(int arg0, int arg1) {
        field970++;
        if (arg0 > -14) {
            method394(102, 87);
        }
        class34.field608.method1809(arg1, (byte) -128);
        class21.field249.method1809(arg1, (byte) 125);
        class51.field835.method1809(arg1, (byte) -32);
        class156.field2792.method1809(arg1, (byte) -35);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BLvh;)V")
    public final void method395(byte arg0, class276 arg1) {
        field967++;
        if (arg1.field4854 != null) {
            arg1.method1828(-1072);
        }
        arg1.field4854 = this.field977.field4854;
        arg1.field4851 = this.field977;
        arg1.field4854.field4851 = arg1;
        arg1.field4851.field4854 = arg1;
        if (arg0 < 10) {
            field981 = -46;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BIII)I")
    public static final int method396(byte arg0, int arg1, int arg2, int arg3) {
        field971++;
        int var4 = 2 / ((arg0 + 79) / 35);
        if ((class230.field3973[arg2][arg1][arg3] & 0x8) == 0) {
            return arg2 <= 0 || (class230.field3973[1][arg1][arg3] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
    public class58() {
        this.field977.field4854 = this.field977;
        this.field977.field4851 = this.field977;
    }
}
