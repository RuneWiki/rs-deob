import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ba")
public class class4 {

    @OriginalMember(owner = "mapview!ba", name = "k", descriptor = "I")
    private int field44;

    @OriginalMember(owner = "mapview!ba", name = "p", descriptor = "[Ln;")
    private class26[] field49;

    @OriginalMember(owner = "mapview!ba", name = "g", descriptor = "Ld;")
    public static class7 field40 = class38.method251((byte) -102, "(U");

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "Ld;")
    public static class7 field35 = class38.method251((byte) 107, "Loom");

    @OriginalMember(owner = "mapview!ba", name = "e", descriptor = "I")
    public static volatile int field38 = 0;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "Ld;")
    public static class7 field34 = class38.method251((byte) 59, "Find");

    @OriginalMember(owner = "mapview!ba", name = "j", descriptor = "I")
    public static int field43 = 0;

    @OriginalMember(owner = "mapview!ba", name = "l", descriptor = "Ld;")
    public static class7 field45 = class38.method251((byte) -63, "Loading ");

    @OriginalMember(owner = "mapview!ba", name = "m", descriptor = "Ld;")
    public static class7 field46 = class38.method251((byte) 103, "Agility Training");

    @OriginalMember(owner = "mapview!ba", name = "f", descriptor = "Ld;")
    public static class7 field39 = class38.method251((byte) -94, "download");

    @OriginalMember(owner = "mapview!ba", name = "n", descriptor = "I")
    public static volatile int field47 = 0;

    @OriginalMember(owner = "mapview!ba", name = "d", descriptor = "Ld;")
    public static class7 field37 = class38.method251((byte) 64, "Requesting");

    @OriginalMember(owner = "mapview!ba", name = "r", descriptor = "Ld;")
    public static class7 field51 = class38.method251((byte) 127, "Farming shop");

    @OriginalMember(owner = "mapview!ba", name = "h", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "mapview!ba", name = "q", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "mapview!ba", name = "c", descriptor = "J")
    private long field36;

    @OriginalMember(owner = "mapview!ba", name = "i", descriptor = "Lga;")
    public static class14 field42;

    @OriginalMember(owner = "mapview!ba", name = "o", descriptor = "Ln;")
    private class26 field48;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(BJ)Ln;", line = 6)
    public final class26 method22(byte arg0, long arg1) {
        this.field36 = arg1;
        class26 var4 = this.field49[(int) ((long) (this.field44 - 1) & arg1)];
        for (this.field48 = var4.field369; this.field48 != var4; this.field48 = this.field48.field369) {
            if (this.field48.field374 == arg1) {
                class26 var5 = this.field48;
                this.field48 = this.field48.field369;
                return var5;
            }
        }
        if (arg0 > -25) {
            return (class26) null;
        } else {
            this.field48 = null;
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(Ld;BLk;Ld;)[Le;", line = 54)
    public static final class9[] method23(class7 arg0, byte arg1, class20 arg2, class7 arg3) {
        if (arg1 >= -23) {
            field40 = null;
        }
        int var4 = arg2.method145((byte) 70, arg0);
        int var5 = arg2.method141(true, var4, arg3);
        return class37.method238(arg2, var5, false, var4);
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "([BIB)I", line = 73)
    public static final int method24(byte[] arg0, int arg1, byte arg2) {
        return arg2 == -1 ? class17.method125(arg0, 0, (byte) 63, arg1) : -81;
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(Ln;JI)V", line = 92)
    public final void method25(class26 arg0, long arg1, int arg2) {
        if (arg0.field370 != null) {
            arg0.method198((byte) -64);
        }
        class26 var5 = this.field49[(int) (arg1 & (long) (this.field44 - 1))];
        arg0.field370 = var5.field370;
        if (arg2 >= -59) {
            this.field36 = -31L;
        }
        arg0.field374 = arg1;
        arg0.field369 = var5;
        arg0.field370.field369 = arg0;
        arg0.field369.field370 = arg0;
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(I)V", line = 152)
    public static void method26(int arg0) {
        if (arg0 != 1480) {
            method24(null, 84, (byte) 116);
        }
        field51 = null;
        field37 = null;
        field35 = null;
        field46 = null;
        field45 = null;
        field40 = null;
        field42 = null;
        field39 = null;
        field34 = null;
    }

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "(I)Ln;", line = 180)
    public final class26 method27(int arg0) {
        if (this.field48 == null) {
            return null;
        }
        if (arg0 != 3230) {
            method26(-47);
        }
        class26 var2 = this.field49[(int) (this.field36 & (long) (this.field44 - 1))];
        while (this.field48 != var2) {
            if (this.field48.field374 == this.field36) {
                class26 var3 = this.field48;
                this.field48 = this.field48.field369;
                return var3;
            }
            this.field48 = this.field48.field369;
        }
        this.field48 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!ba", name = "<init>", descriptor = "(I)V", line = 230)
    public class4(int arg0) {
        this.field44 = arg0;
        this.field49 = new class26[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class26 var3 = this.field49[var2] = new class26();
            var3.field370 = var3;
            var3.field369 = var3;
        }
    }
}
