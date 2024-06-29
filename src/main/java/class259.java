import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class259 {

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    private int field4504 = 0;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "Z")
    public boolean field4514 = true;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    public int field4513 = -1;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public int field4511 = 128;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public static int field4501 = 0;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "Loh;")
    public static class258 field4499 = class153.method1046("Titelbild geladen)3", 125);

    @OriginalMember(owner = "client!il", name = "m", descriptor = "Lmb;")
    public static class172 field4509 = new class172(64);

    @OriginalMember(owner = "client!il", name = "u", descriptor = "S")
    public static short field4517 = 256;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public int field4500;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public int field4506;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public int field4508;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public int field4510;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "Lgb;")
    public static class213 field4515;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BI)V", line = 11)
    private final void method1823(byte arg0, int arg1) {
        field4507++;
        double var3 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) ((arg1 & 0xFF20FC) >> 16) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var5;
        if (var3 > var5) {
            var9 = var3;
        }
        double var11 = var5;
        if (var7 > var9) {
            var9 = var7;
        }
        double var13 = 0.0D;
        if (var5 > var3) {
            var11 = var3;
        }
        if (var11 > var7) {
            var11 = var7;
        }
        double var15 = (var9 + var11) / 2.0D;
        double var17 = 0.0D;
        this.field4500 = (int) (var15 * 256.0D);
        if (var9 != var11) {
            if (var15 < 0.5D) {
                var17 = (var9 - var11) / (var9 + var11);
            }
            if (var15 >= 0.5D) {
                var17 = (var9 - var11) / (2.0D - var9 - var11);
            }
            if (var5 == var9) {
                var13 = (var3 - var7) / (var9 - var11);
            } else if (var3 == var9) {
                var13 = (var7 - var5) / (var9 - var11) + 2.0D;
            } else if (var7 == var9) {
                var13 = (var5 - var3) / (var9 - var11) + 4.0D;
            }
        }
        double var19 = var13 / 6.0D;
        if ((var15 > 0.5D)) {
            this.field4508 = (int) ((1.0D - var15) * var17 * 512.0D);
        } else {
            this.field4508 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field4500 < 0) {
            this.field4500 = 0;
        } else if (this.field4500 > 255) {
            this.field4500 = 255;
        }
        if (this.field4508 < 1) {
            this.field4508 = 1;
        }
        this.field4510 = (int) ((double) this.field4508 * var19);
        this.field4506 = (int) (var17 * 256.0D);
        if (this.field4506 < 0) {
            this.field4506 = 0;
        } else if (this.field4506 > 255) {
            this.field4506 = 255;
        }
        int var21 = -53 % ((arg0 - 11) / 54);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)V", line = 99)
    public static final void method1824(int arg0, int arg1) {
        field4512++;
        if (arg1 == 255) {
            class286 var2 = class48.method389(arg0, 4, 10738);
            var2.method2010((byte) -38);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lva;II)V", line = 116)
    public final void method1825(class235 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method1589(51);
            if (var4 == 0) {
                field4503++;
                if (arg1 != 0) {
                    this.field4514 = false;
                }
                return;
            }
            this.method1829(arg2, var4, arg0, 128);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V", line = 135)
    public static void method1826(int arg0) {
        if (arg0 <= 35) {
            field4515 = (class213) null;
        }
        field4509 = null;
        field4515 = null;
        field4499 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IBI)V", line = 154)
    public static final void method1827(int arg0, byte arg1, int arg2) {
        field4498++;
        class12 var3 = class82.field1386[class272.field4704][arg0][arg2];
        if (var3 == null) {
            class179.method1228(class272.field4704, arg0, arg2);
            return;
        }
        int var4 = -99999999;
        class232 var5 = null;
        for (class232 var6 = (class232) var3.method83(-48); var6 != null; var6 = (class232) var3.method87((byte) -80)) {
            class61 var7 = class186.method1256((byte) 118, var6.field4024.field663);
            int var8 = var7.field1010;
            if (var7.field1049 == 1) {
                var8 = (var6.field4024.field660 + 1) * var8;
            }
            if (var4 < var8) {
                var5 = var6;
                var4 = var8;
            }
        }
        if (var5 == null) {
            class179.method1228(class272.field4704, arg0, arg2);
            return;
        }
        var3.method79(var5, 88);
        if (arg1 < 46) {
            method1827(-26, (byte) -98, -52);
        }
        class44 var9 = null;
        class44 var10 = null;
        for (class232 var11 = (class232) var3.method83(-93); var11 != null; var11 = (class232) var3.method87((byte) -80)) {
            class44 var12 = var11.field4024;
            if (var5.field4024.field663 != var12.field663) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field663 != var12.field663 && var9 == null) {
                    var9 = var12;
                }
            }
        }
        long var13 = (long) ((arg2 << 7) + arg0 + 1610612736);
        class311.method2161(class272.field4704, arg0, arg2, class228.method1525(true, class272.field4704, arg2 * 128 + 64, arg0 * 128 - -64), var5.field4024, var13, var10, var9);
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)Lnc;", line = 246)
    public static final class94 method1828(int arg0) {
        field4505++;
        try {
            if (arg0 != 2) {
                field4499 = (class258) null;
            }
            return (class94) Class.forName("k").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IILva;I)V", line = 277)
    private final void method1829(int arg0, int arg1, class235 arg2, int arg3) {
        if (arg1 == 1) {
            this.field4504 = arg2.method1602(18160);
            this.method1823((byte) 72, this.field4504);
        } else if (arg1 == 2) {
            this.field4513 = arg2.method1615(arg3 - 249);
            if (this.field4513 == 65535) {
                this.field4513 = -1;
            }
        } else if (arg1 == 3) {
            this.field4511 = arg2.method1615(25);
        } else if (arg1 == 4) {
            this.field4514 = false;
        }
        if (arg3 != 128) {
            this.method1829(97, -53, (class235) null, 119);
        }
        field4502++;
    }
}
