import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class225 {

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "Z")
    public boolean field3968 = true;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
    public int field3974 = 0;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    public int field3977 = -1;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public int field3966 = -1;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public static int field3969 = 0;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "Loh;")
    public static class263 field3965 = class253.method1681(-128, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "Loh;")
    public static class263 field3972 = class253.method1681(-123, "Wordpack geladen)3");

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "Loh;")
    public static class263 field3976 = class253.method1681(-122, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "[I")
    public static int[] field3971 = new int[5];

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "[Lff;")
    public static class18[] field3970;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
    public static void method1530(byte arg0) {
        field3972 = null;
        field3970 = null;
        field3965 = null;
        if (arg0 > -90) {
            method1530((byte) -71);
        }
        field3976 = null;
        field3971 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BLsi;I)V")
    public final void method1531(byte arg0, class194 arg1, int arg2) {
        if (arg0 != 5) {
            method1533((byte) 80, (class188) null);
        }
        field3973++;
        while (true) {
            int var4 = arg1.method1301(-8317);
            if (var4 == 0) {
                return;
            }
            this.method1534(arg1, (byte) 33, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZLpc;I)V")
    public static final void method1532(boolean arg0, class21 arg1, int arg2) {
        field3962++;
        int var3 = ~arg1.field520 == arg2 ? arg1.field539 : arg1.field520;
        int var4 = arg1.field503 == 0 ? arg1.field479 : arg1.field503;
        class50.method323(arg0, var3, arg2 + 128, arg1.field537, class164.field2974[arg1.field537 >> 16], var4);
        if (arg1.field589 != null) {
            class50.method323(arg0, var3, 127, arg1.field537, arg1.field589, var4);
        }
        class266 var5 = (class266) class212.field3797.method31(-32665, (long) arg1.field537);
        if (var5 != null) {
            class99.method678(arg0, 4, var4, var5.field4641, var3);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BLgg;)V")
    public static final void method1533(byte arg0, class188 arg1) {
        if (arg0 == 116) {
            field3963++;
            class24.field686 = arg1;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lsi;BII)V")
    private final void method1534(class194 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 33) {
            field3969 = -7;
        }
        if (arg3 == 1) {
            this.field3974 = class226.method1536(arg0.method1277((byte) -112), (byte) 121);
        } else if (arg3 == 2) {
            this.field3966 = arg0.method1301(-8317);
        } else if (arg3 == 3) {
            this.field3966 = arg0.method1294((byte) 3);
            if (this.field3966 == 65535) {
                this.field3966 = -1;
            }
        } else if (arg3 == 5) {
            this.field3968 = false;
        } else if (arg3 == 7) {
            this.field3977 = class226.method1536(arg0.method1277((byte) -123), (byte) 125);
        } else if (arg3 == 8) {
            class54.field1150 = arg2;
        } else if (arg3 == 9) {
            arg0.method1294((byte) 3);
        } else if (arg3 != 10) {
            if (arg3 == 11) {
                arg0.method1301(-8317);
            } else if (arg3 != 12) {
                if (arg3 == 13) {
                    arg0.method1277((byte) 84);
                } else if (arg3 == 14) {
                    arg0.method1301(-8317);
                }
            }
        }
        field3967++;
    }
}
