import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class216 implements Runnable {

    @OriginalMember(owner = "client!th", name = "e", descriptor = "[Lcb;")
    public volatile class25[] field3921 = new class25[2];

    @OriginalMember(owner = "client!th", name = "a", descriptor = "Z")
    public volatile boolean field3917 = false;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "Z")
    public volatile boolean field3920 = false;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3918 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!th", name = "m", descriptor = "Lkh;")
    private static class117 field3929 = class224.method1450((byte) 117, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!th", name = "n", descriptor = "Lkh;")
    public static class117 field3930 = class224.method1450((byte) 121, "<col=ffff00>");

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    public static int field3933 = 0;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "Lkh;")
    public static class117 field3934 = class224.method1450((byte) 121, "Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!th", name = "p", descriptor = "Lkh;")
    public static class117 field3932 = class224.method1450((byte) 107, "Diese Betatest)2Welt ist nur f-Ur eingeladene");

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field3928 = 0;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "Lkh;")
    public static class117 field3927 = field3929;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field3931 = 0;

    @OriginalMember(owner = "client!th", name = "u", descriptor = "Lkh;")
    public static class117 field3937 = class224.method1450((byte) 116, "weiss:");

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "Lmc;")
    public class134 field3919;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "Lvb;")
    public static class232 field3935;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "[I")
    public static int[] field3936;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZLkh;Lnc;)I")
    public static final int method1418(boolean arg0, class117 arg1, class145 arg2) {
        if (!arg0) {
            return -102;
        }
        field3926++;
        int var3 = arg2.field2643;
        arg2.method996(arg1.field2213, -66);
        arg2.field2643 += class11.field378.method1455(arg2.field2613, arg2.field2643, 10313, 0, arg1.field2196, arg1.field2213);
        return arg2.field2643 - var3;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)Lsd;")
    public static final class201 method1419(byte arg0, int arg1) {
        field3923++;
        class201 var2 = (class201) class10.field350.method506(1, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 126) {
            field3933 = 102;
        }
        byte[] var3 = class139.field2542.method104(-72, 26, arg1);
        class201 var4 = new class201();
        if (var3 != null) {
            var4.method1340(new class145(var3), false);
        }
        class10.field350.method497((long) arg1, var4, -114);
        return var4;
    }

    @OriginalMember(owner = "client!th", name = "run", descriptor = "()V")
    public final void run() {
        this.field3920 = true;
        field3922++;
        try {
            while (!this.field3917) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class25 var2 = this.field3921[var1];
                    if (var2 != null) {
                        var2.method219((byte) -63);
                    }
                }
                class165.method1167(-22942, 10L);
                class157.method1115(null, -2228, this.field3919);
            }
        } catch (Exception var9) {
            class147.method1055(6678, null, var9);
        } finally {
            Object var6 = null;
            this.field3920 = false;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
    public static void method1420(byte arg0) {
        field3930 = null;
        field3932 = null;
        field3929 = null;
        field3935 = null;
        field3936 = null;
        field3937 = null;
        field3934 = null;
        field3927 = null;
        int var1 = 46 % ((arg0 - 61) / 49);
        field3918 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V")
    public static final void method1421(int arg0, int arg1) {
        class86.method599((byte) 56);
        class247.method1617(false);
        field3924++;
        int var2 = class246.method1615((byte) 72, arg0).field430;
        if (var2 == 0) {
            return;
        }
        if (arg1 != 96) {
            method1421(-66, -62);
        }
        int var3 = class141.field2561[arg0];
        if (var2 == 1) {
            class48.field1000 = var3;
            if (class48.field1000 == 1) {
                class89.method609(0.9F);
            }
            if (class48.field1000 == 2) {
                class89.method609(0.8F);
            }
            if (class48.field1000 == 3) {
                class89.method609(0.7F);
            }
            if (class48.field1000 == 4) {
                class89.method609(0.6F);
            }
            class117.method812((byte) -127);
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class175.field3161 != var4) {
                if (class175.field3161 == 0 && class184.field3304 != -1) {
                    class93.method641(class184.field3304, 0, false, var4, class117.field2187, 16419);
                    class115.field2137 = false;
                } else if (var4 == 0) {
                    class248.method1622(true);
                    class115.field2137 = false;
                } else {
                    class80.method554(var4, -1);
                }
                class175.field3161 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class74.field1406 = 127;
            }
            if (var3 == 1) {
                class74.field1406 = 96;
            }
            if (var3 == 2) {
                class74.field1406 = 64;
            }
            if (var3 == 3) {
                class74.field1406 = 32;
            }
            if (var3 == 4) {
                class74.field1406 = 0;
            }
        }
        if (var2 == 5) {
            class196.field3493 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class86.field1617 = 127;
            }
            if (var3 == 1) {
                class86.field1617 = 96;
            }
            if (var3 == 2) {
                class86.field1617 = 64;
            }
            if (var3 == 3) {
                class86.field1617 = 32;
            }
            if (var3 == 4) {
                class86.field1617 = 0;
            }
        }
        if (var2 == 9) {
            class179.field3245 = var3;
        }
        if (var2 == 6) {
            class62.field1249 = var3;
        }
    }
}
