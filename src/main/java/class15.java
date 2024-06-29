import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class15 extends class29 {

    @OriginalMember(owner = "client!cb", name = "nb", descriptor = "I")
    public int field431 = 0;

    @OriginalMember(owner = "client!cb", name = "qb", descriptor = "Z")
    public boolean field434 = true;

    @OriginalMember(owner = "client!cb", name = "lb", descriptor = "I")
    public int field429 = -1;

    @OriginalMember(owner = "client!cb", name = "ob", descriptor = "I")
    public int field432 = -1;

    @OriginalMember(owner = "client!cb", name = "eb", descriptor = "I")
    public static int field422 = 0;

    @OriginalMember(owner = "client!cb", name = "db", descriptor = "Z")
    public static boolean field421 = false;

    @OriginalMember(owner = "client!cb", name = "bb", descriptor = "Ls;")
    public static class108 field419 = new class108();

    @OriginalMember(owner = "client!cb", name = "vb", descriptor = "Lwb;")
    public static class130 field439 = class26.method212("Spiel)2Engine wird gestartet)3)3)3", -32376);

    @OriginalMember(owner = "client!cb", name = "ub", descriptor = "Lbc;")
    public static class10 field438 = new class10(4096);

    @OriginalMember(owner = "client!cb", name = "xb", descriptor = "Lwb;")
    public static class130 field441 = class26.method212(":", -32376);

    @OriginalMember(owner = "client!cb", name = "yb", descriptor = "Lwb;")
    public static class130 field442 = class26.method212("Fehler beim Laden Ihres Charakter)2Profils", -32376);

    @OriginalMember(owner = "client!cb", name = "zb", descriptor = "Lwb;")
    public static class130 field443 = class26.method212("null", -32376);

    @OriginalMember(owner = "client!cb", name = "wb", descriptor = "Lge;")
    public static class41 field440 = new class41(10);

    @OriginalMember(owner = "client!cb", name = "Y", descriptor = "I")
    public int field416;

    @OriginalMember(owner = "client!cb", name = "Z", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!cb", name = "ab", descriptor = "I")
    public int field418;

    @OriginalMember(owner = "client!cb", name = "cb", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!cb", name = "fb", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!cb", name = "gb", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!cb", name = "hb", descriptor = "I")
    public int field425;

    @OriginalMember(owner = "client!cb", name = "ib", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!cb", name = "jb", descriptor = "I")
    public int field427;

    @OriginalMember(owner = "client!cb", name = "kb", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!cb", name = "mb", descriptor = "I")
    public int field430;

    @OriginalMember(owner = "client!cb", name = "pb", descriptor = "I")
    public int field433;

    @OriginalMember(owner = "client!cb", name = "rb", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!cb", name = "sb", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!cb", name = "tb", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!cb", name = "Ab", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZI)Z", line = 12)
    public static final boolean method110(boolean arg0, int arg1) {
        field417++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else if (arg1 >= 48 && arg1 <= 57) {
            return true;
        } else if (arg0) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)V", line = 41)
    public static void method111(int arg0) {
        if (arg0 != -58) {
            method112(-26);
        }
        field442 = null;
        field439 = null;
        field443 = null;
        field440 = null;
        field441 = null;
        field419 = null;
        field438 = null;
    }

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "(I)V", line = 60)
    public static final void method112(int arg0) {
        class129.method951(0, null, false, false);
        field423++;
        if (arg0 != -16146) {
            method112(-83);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLfe;I)V", line = 71)
    public final void method113(byte arg0, class36 arg1, int arg2) {
        int var4 = -94 % ((arg0 - 4) / 61);
        while (true) {
            int var5 = arg1.method365((byte) -125);
            if (var5 == 0) {
                field426++;
                return;
            }
            this.method117(var5, -127, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([Lwb;I)Lwb;", line = 97)
    public static final class130 method114(class130[] arg0, int arg1) {
        field420++;
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        if (arg1 != -20349) {
            method112(-54);
        }
        return class24.method205(0, arg0.length, arg0, arg1 ^ 0xFFFFB0FC);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V", line = 119)
    private final void method115(int arg0, int arg1) {
        double var3 = (double) (arg1 >> 16 & arg0) / 256.0D;
        field436++;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = var3;
        double var9 = (double) (arg1 & 0xFF) / 256.0D;
        double var11 = 0.0D;
        double var13 = var3;
        if (var5 > var3) {
            var13 = var5;
        }
        if (var5 < var3) {
            var7 = var5;
        }
        if (var7 > var9) {
            var7 = var9;
        }
        if (var13 < var9) {
            var13 = var9;
        }
        double var15 = (var7 + var13) / 2.0D;
        double var17 = 0.0D;
        this.field433 = (int) (var15 * 256.0D);
        if (this.field433 < 0) {
            this.field433 = 0;
        } else if (this.field433 > 255) {
            this.field433 = 255;
        }
        if (var7 != var13) {
            if (var3 == var13) {
                var11 = (var5 - var9) / (-var7 + var13);
            } else if (var5 == var13) {
                var11 = (var9 - var3) / (-var7 + var13) + 2.0D;
            } else if (var9 == var13) {
                var11 = (var3 - var5) / (-var7 + var13) + 4.0D;
            }
            if (var15 < 0.5D) {
                var17 = (var13 - var7) / (var7 + var13);
            }
            if (var15 >= 0.5D) {
                var17 = (var13 - var7) / (2.0D - var13 - var7);
            }
        }
        this.field425 = (int) (var17 * 256.0D);
        if (this.field425 < 0) {
            this.field425 = 0;
        } else if (this.field425 > 255) {
            this.field425 = 255;
        }
        double var19 = var11 / 6.0D;
        this.field416 = (int) (var19 * 256.0D);
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(B)V", line = 198)
    public static final void method116(byte arg0) {
        class26.field758 = null;
        field424++;
        client.field548 = null;
        if (arg0 != -55) {
            method114(null, 26);
        }
        class115.field2839 = null;
        class31.field876 = null;
        class119.field2920 = null;
        class31.field869 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIILfe;)V", line = 258)
    private final void method117(int arg0, int arg1, int arg2, class36 arg3) {
        field428++;
        if (arg0 == 1) {
            this.field431 = arg3.method343((byte) 5);
        } else if (arg0 == 2) {
            this.field432 = arg3.method365((byte) -121);
        } else if (arg0 == 5) {
            this.field434 = false;
        } else if (arg0 == 7) {
            this.field429 = arg3.method343((byte) 5);
        }
        if (arg1 > -116) {
            this.field425 = -97;
        }
    }

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "(I)V", line = 301)
    public final void method118(int arg0) {
        if (this.field429 != -1) {
            this.method115(255, this.field429);
            this.field418 = this.field433;
            this.field427 = this.field425;
            this.field430 = this.field416;
        }
        this.method115(255, this.field431);
        field435++;
        if (arg0 != 28345) {
            method110(true, -47);
        }
    }
}
