import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!s")
public class class34 {

    @OriginalMember(owner = "mapview!s", name = "h", descriptor = "[Lga;")
    private class14[] field414;

    @OriginalMember(owner = "mapview!s", name = "j", descriptor = "I")
    private int field416;

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "Ln;")
    public static class26 field407 = class9.method82(255, "Mace Shop");

    @OriginalMember(owner = "mapview!s", name = "c", descriptor = "Ln;")
    public static class26 field409 = class9.method82(255, "37(U");

    @OriginalMember(owner = "mapview!s", name = "i", descriptor = "Ln;")
    public static class26 field415 = class9.method82(255, "world");

    @OriginalMember(owner = "mapview!s", name = "b", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "mapview!s", name = "e", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "mapview!s", name = "k", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "mapview!s", name = "f", descriptor = "J")
    private long field412;

    @OriginalMember(owner = "mapview!s", name = "g", descriptor = "Lga;")
    private class14 field413;

    @OriginalMember(owner = "mapview!s", name = "d", descriptor = "[B")
    public static byte[] field410;

    @OriginalMember(owner = "mapview!s", name = "l", descriptor = "[I")
    public static int[] field418;

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(I)V", line = 12)
    public static void method230(int arg0) {
        if (arg0 != -24205) {
            field408 = -14;
        }
        field418 = null;
        field415 = null;
        field410 = null;
        field409 = null;
        field407 = null;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(B)Lga;", line = 42)
    public final class14 method231(byte arg0) {
        if (arg0 >= -86) {
            return (class14) null;
        } else if (this.field413 == null) {
            return null;
        } else {
            class14 var2 = this.field414[(int) (this.field412 & (long) (this.field416 - 1))];
            while (this.field413 != var2) {
                if (this.field413.field227 == this.field412) {
                    class14 var3 = this.field413;
                    this.field413 = this.field413.field226;
                    return var3;
                }
                this.field413 = this.field413.field226;
            }
            this.field413 = null;
            return null;
        }
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "([Ln;I)Ln;", line = 97)
    public static final class26 method232(class26[] arg0, int arg1) {
        int var2 = -59 / ((-arg1 - 81) / 33);
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class28.method206(0, arg0.length, arg0, false);
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(IIZ)B", line = 126)
    public static final byte method233(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method233(-60, -110, true);
        }
        int var3 = arg0 >> 6;
        int var4 = arg1 >> 6;
        if (class29.field376[var3][var4] == null) {
            return 0;
        } else if (class29.field376[var3][var4].field187 == null) {
            return class29.field376[var3][var4].field186;
        } else {
            return class29.field376[var3][var4].field187[(arg0 & 0xFC0) + arg1 & 0x3F];
        }
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(JI)Lga;", line = 153)
    public final class14 method234(long arg0, int arg1) {
        this.field412 = arg0;
        if (arg1 <= 102) {
            field417 = -32;
        }
        class14 var4 = this.field414[(int) (arg0 & (long) (this.field416 - 1))];
        for (this.field413 = var4.field226; this.field413 != var4; this.field413 = this.field413.field226) {
            if (this.field413.field227 == arg0) {
                class14 var5 = this.field413;
                this.field413 = this.field413.field226;
                return var5;
            }
        }
        this.field413 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(JLga;B)V", line = 181)
    public final void method235(long arg0, class14 arg1, byte arg2) {
        if (arg1.field224 != null) {
            arg1.method110((byte) 80);
        }
        class14 var5 = this.field414[(int) (arg0 & (long) (this.field416 - 1))];
        arg1.field224 = var5.field224;
        arg1.field226 = var5;
        arg1.field227 = arg0;
        arg1.field224.field226 = arg1;
        arg1.field226.field224 = arg1;
        int var6 = 8 % ((arg2 - 6) / 60);
    }

    @OriginalMember(owner = "mapview!s", name = "<init>", descriptor = "(I)V", line = 201)
    public class34(int arg0) {
        this.field414 = new class14[arg0];
        this.field416 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class14 var3 = this.field414[var2] = new class14();
            var3.field224 = var3;
            var3.field226 = var3;
        }
    }
}
