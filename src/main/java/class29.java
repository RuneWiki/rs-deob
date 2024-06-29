import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class29 extends class5 {

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
    private int field525 = -1;

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "I")
    private int field527 = 0;

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "Led;")
    public static class43 field518 = class191.method1219("Schrifts-=tze geladen)3", false);

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "Lff;")
    public static class54 field522 = new class54(5000);

    @OriginalMember(owner = "client!ch", name = "bb", descriptor = "Led;")
    public static class43 field534 = null;

    @OriginalMember(owner = "client!ch", name = "Y", descriptor = "Led;")
    private static class43 field531 = class191.method1219("and choose the (Wcreate account(W", false);

    @OriginalMember(owner = "client!ch", name = "ab", descriptor = "Led;")
    private static class43 field533 = class191.method1219("World", false);

    @OriginalMember(owner = "client!ch", name = "X", descriptor = "Led;")
    public static class43 field530 = field533;

    @OriginalMember(owner = "client!ch", name = "Z", descriptor = "Led;")
    public static class43 field532 = field531;

    @OriginalMember(owner = "client!ch", name = "fb", descriptor = "Led;")
    private static class43 field538 = class191.method1219("Too many incorrect logins from your address)3", false);

    @OriginalMember(owner = "client!ch", name = "gb", descriptor = "Led;")
    public static class43 field539 = field538;

    @OriginalMember(owner = "client!ch", name = "cb", descriptor = "Led;")
    public static class43 field535 = field533;

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "I")
    public int field516;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "I")
    public int field520;

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!ch", name = "V", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!ch", name = "W", descriptor = "I")
    public int field529;

    @OriginalMember(owner = "client!ch", name = "db", descriptor = "I")
    public int field536;

    @OriginalMember(owner = "client!ch", name = "eb", descriptor = "Ltg;")
    public static class179 field537;

    @OriginalMember(owner = "client!ch", name = "hb", descriptor = "[I")
    public static int[] field540;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)Z")
    public static final boolean method139(byte arg0, int arg1) {
        if (arg0 > -94) {
            return true;
        } else {
            field526++;
            return (arg1 >> 20 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)V")
    private final void method140(int arg0, int arg1) {
        field523++;
        double var3 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var9 = var7;
        if (arg0 != -32003) {
            field534 = null;
        }
        if (var7 < var3) {
            var9 = var3;
        }
        double var11 = 0.0D;
        if (var5 > var9) {
            var9 = var5;
        }
        double var13 = var7;
        double var15 = 0.0D;
        if (var7 > var3) {
            var13 = var3;
        }
        if (var13 > var5) {
            var13 = var5;
        }
        double var17 = (var9 + var13) / 2.0D;
        this.field516 = (int) (var17 * 256.0D);
        if (var9 != var13) {
            if (var17 < 0.5D) {
                var15 = (var9 - var13) / (var9 + var13);
            }
            if (var7 == var9) {
                var11 = (var3 - var5) / (var9 - var13);
            } else if (var3 == var9) {
                var11 = (var5 - var7) / (var9 - var13) + 2.0D;
            } else if (var5 == var9) {
                var11 = (var7 - var3) / (-var13 + var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var9 - var13) / (2.0D - var9 - var13);
            }
        }
        this.field536 = (int) (var15 * 256.0D);
        if (this.field536 < 0) {
            this.field536 = 0;
        } else if (this.field536 > 255) {
            this.field536 = 255;
        }
        if (this.field516 < 0) {
            this.field516 = 0;
        } else if (this.field516 > 255) {
            this.field516 = 255;
        }
        double var19 = var11 / 6.0D;
        if (var17 > 0.5D) {
            this.field520 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field520 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field520 < 1) {
            this.field520 = 1;
        }
        this.field529 = (int) ((double) this.field520 * var19);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILjg;I)V")
    private final void method141(int arg0, int arg1, class89 arg2, int arg3) {
        if (arg1 == 1) {
            this.field527 = arg2.method565(3);
            this.method140(-32003, this.field527);
        } else if (arg1 == 2) {
            this.field525 = arg2.method555(-1113627096);
            if (this.field525 == 65535) {
                this.field525 = -1;
            }
        } else if (arg1 == 3) {
            arg2.method555(-1113627096);
        }
        field519++;
        if (arg0 != -3) {
            method145(-89, -103);
        }
    }

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "(I)V")
    public static void method142(int arg0) {
        field530 = null;
        field539 = null;
        if (arg0 != -1) {
            return;
        }
        field540 = null;
        field534 = null;
        field537 = null;
        field533 = null;
        field535 = null;
        field518 = null;
        field532 = null;
        field538 = null;
        field522 = null;
        field531 = null;
    }

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "(I)V")
    public static final void method143(int arg0) {
        class55.field1102.method1108((byte) -90);
        if (arg0 == 255) {
            field528++;
        }
    }

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "(I)V")
    public static final void method144(int arg0) {
        class9.field163 = true;
        field524++;
        class177.field3512 = true;
        if (arg0 != 1) {
            method143(79);
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)Led;")
    public static final class43 method145(int arg0, int arg1) {
        int var2 = -56 % ((-arg0 - 64) / 58);
        field521++;
        return class167.method1036(new class43[] { class30.method161(arg1 >> 24 & 0xFF, 10), class184.field3623, class30.method161(arg1 >> 16 & 0xFF, 10), class184.field3623, class30.method161(arg1 >> 8 & 0xFF, 10), class184.field3623, class30.method161(arg1 & 0xFF, 10) }, true);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljg;IB)V")
    public final void method146(class89 arg0, int arg1, byte arg2) {
        while (true) {
            int var4 = arg0.method538((byte) -61);
            if (var4 == 0) {
                int var5 = 116 % ((arg2 + 79) / 44);
                field517++;
                return;
            }
            this.method141(-3, var4, arg0, arg1);
        }
    }
}
