import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class3 {

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "J")
    public static long field14 = 0L;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "[J")
    public static long[] field16 = new long[256];

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "Lok;")
    public static class146 field20;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "Lok;")
    public static class146 field23;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static volatile int field25;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "Lok;")
    private static class146 field28;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "Lok;")
    public static class146 field26;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "Lok;")
    public static class146 field21;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "Lok;")
    public static class146 field22;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "Loh;")
    public static class15 field24;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "Lqd;")
    public static class40 field27;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BJ)Lok;", line = 5)
    public static final class146 method8(byte arg0, long arg1) {
        field18++;
        class94.field1510.setTime(new Date(arg1));
        int var3 = class94.field1510.get(7);
        int var4 = class94.field1510.get(5);
        int var5 = class94.field1510.get(2);
        int var6 = class94.field1510.get(1);
        if (arg0 != -34) {
            field21 = (class146) null;
        }
        int var7 = class94.field1510.get(11);
        int var8 = class94.field1510.get(12);
        int var9 = class94.field1510.get(13);
        return class112.method758(126, new class146[] { class119.field1931[var3 - 1], class183.field3069, class82.method585(arg0 + 14778, var4 / 10), class82.method585(14744, var4 % 10), class227.field3792, class104.field1689[var5], class227.field3792, class82.method585(14744, var6), class245.field4055, class82.method585(14744, var7 / 10), class82.method585(14744, var7 % 10), class207.field3468, class82.method585(14744, var8 / 10), class82.method585(14744, var8 % 10), class207.field3468, class82.method585(arg0 + 14778, var9 / 10), class82.method585(14744, var9 % 10), class302.field5189 });
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 35)
    public static final void method9(int arg0) {
        if (class138.field2303 != null) {
            class138.field2303.method1478(16384);
        }
        if (class142.field2369 != null) {
            class142.field2369.method1478(16384);
        }
        field17++;
        if (arg0 >= -54) {
            method9(69);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILr;)V", line = 54)
    public static final void method10(int arg0, class264 arg1) {
        field19++;
        class264 var2 = class116.method786(arg1, true);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class56.field997;
            var4 = class148.field2518;
        } else {
            var4 = var2.field4393;
            var3 = var2.field4381;
        }
        class147.method1134(false, arg1, -6, var3, var4);
        if (arg0 != 5) {
            method8((byte) 18, -98L);
        }
        class267.method1943(var3, (byte) -95, var4, arg1);
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field16[var0] = var1;
        }
        field20 = class235.method1724(-12908, " <col=ffffff>");
        field23 = class235.method1724(-12908, "blanc:");
        field25 = 0;
        field28 = class235.method1724(-12908, "purple:");
        field26 = class235.method1724(-12908, "Connexion au serveur de mise -9 jour en cours");
        field21 = field28;
        field22 = field28;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V", line = 95)
    public static void method11(int arg0) {
        field21 = null;
        field22 = null;
        field26 = null;
        field27 = null;
        field23 = null;
        field20 = null;
        if (arg0 != -28316) {
            method8((byte) 53, -28L);
        }
        field24 = null;
        field28 = null;
        field16 = null;
    }
}
