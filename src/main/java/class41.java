import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class41 extends class472 {

    @OriginalMember(owner = "client!rv", name = "l", descriptor = "Lbs;")
    public static class111 field678 = new class111(1);

    @OriginalMember(owner = "client!rv", name = "p", descriptor = "[S")
    public static short[] field682 = new short[256];

    @OriginalMember(owner = "client!rv", name = "r", descriptor = "C")
    public char field684;

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "I")
    public int field674;

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!rv", name = "j", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!rv", name = "k", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!rv", name = "n", descriptor = "I")
    public int field680;

    @OriginalMember(owner = "client!rv", name = "q", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!rv", name = "s", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "J")
    public long field671;

    @OriginalMember(owner = "client!rv", name = "o", descriptor = "Lrv;")
    public class41 field681;

    @OriginalMember(owner = "client!rv", name = "m", descriptor = "Z")
    public boolean field679;

    static {
        new class306("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(III)I", line = 3)
    public static final int method302(int arg0, int arg1, int arg2) {
        field677++;
        if (arg0 == 3) {
            return arg1 == 1 || arg1 == 3 ? class502.field7335[arg2 & 0x3] : class250.field4260[arg2 & 0x3];
        } else {
            return 109;
        }
    }

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "(I)J", line = 18)
    public final long method303(int arg0) {
        field685++;
        if (arg0 <= 67) {
            method305(-113, null, -70, 87, 49);
        }
        return this.field671;
    }

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "(I)I", line = 39)
    public final int method304(int arg0) {
        field676++;
        if (arg0 != 3155) {
            method305(-56, null, 21, -98, 103);
        }
        return this.field674;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILjava/lang/String;III)V", line = 51)
    public static final void method305(int arg0, String arg1, int arg2, int arg3, int arg4) {
        field673++;
        class68 var5 = class453.method2708(arg2, 103, arg0);
        if (var5 == null) {
            return;
        }
        if (var5.field1008 != null) {
            class483 var6 = new class483();
            var6.field7101 = var5.field1008;
            var6.field7097 = arg1;
            var6.field7100 = var5;
            var6.field7105 = arg4;
            class521.method3073(var6);
        }
        if (class32.field515 != 9) {
            return;
        }
        boolean var7 = true;
        if (var5.field1115 != 0) {
            var7 = class264.method1760(250, var5);
        }
        if (!var7 || !client.method475(var5).method1991((byte) -120, arg4 - 1)) {
            return;
        }
        if (arg4 == 1) {
            class108.field1924++;
            class265.method1775(-2, class79.field1395);
            class326.method2050(var5.field1062, arg0, arg2, false);
        }
        if (arg4 == 2) {
            class265.method1775(-2, class282.field4614);
            class500.field7319++;
            class326.method2050(var5.field1062, arg0, arg2, false);
        }
        if (arg4 == 3) {
            class265.method1775(-2, class356.field5552);
            class272.field4512++;
            class326.method2050(var5.field1062, arg0, arg2, false);
        }
        if (~arg4 == arg3) {
            class253.field4310++;
            class265.method1775(-2, class495.field7230);
            class326.method2050(var5.field1062, arg0, arg2, false);
        }
        if (arg4 == 5) {
            class265.method1775(-2, class121.field2124);
            class437.field6525++;
            class326.method2050(var5.field1062, arg0, arg2, false);
        }
        if (arg4 == 6) {
            class265.method1775(-2, class490.field7159);
            class10.field98++;
            class326.method2050(var5.field1062, arg0, arg2, false);
        }
        if (arg4 == 7) {
            class525.field7727++;
            class265.method1775(-2, class215.field3747);
            class326.method2050(var5.field1062, arg0, arg2, false);
        }
        if (arg4 == 8) {
            class298.field4792++;
            class265.method1775(arg3 + 3, class407.field6183);
            class326.method2050(var5.field1062, arg0, arg2, false);
        }
        if (arg4 == 9) {
            class265.method1775(-2, class313.field4932);
            class4.field39++;
            class326.method2050(var5.field1062, arg0, arg2, false);
        }
        if (arg4 == 10) {
            class265.method1775(arg3 + 3, class105.field1786);
            class497.field7283++;
            class326.method2050(var5.field1062, arg0, arg2, false);
        }
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)C", line = 173)
    public final char method306(int arg0) {
        field675++;
        return arg0 == 0 ? this.field684 : 'b';
    }

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "(I)V", line = 184)
    public static void method307(int arg0) {
        field678 = null;
        field682 = null;
        if (arg0 > -39) {
            field678 = null;
        }
    }

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "(I)I", line = 209)
    public final int method308(int arg0) {
        field672++;
        int var2 = -124 / ((49 - arg0) / 60);
        return this.field680;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)Z", line = 220)
    public final boolean method309(int arg0) {
        if (arg0 != 0) {
            field678 = null;
        }
        field670++;
        return this.field679;
    }
}
