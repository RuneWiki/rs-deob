import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class244 extends class147 {

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "J")
    public long field3327;

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "Lec;")
    public static class40 field3326 = new class40("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!ds", name = "y", descriptor = "I")
    public static int field3334 = -50;

    @OriginalMember(owner = "client!ds", name = "x", descriptor = "I")
    public static int field3333 = 0;

    @OriginalMember(owner = "client!ds", name = "v", descriptor = "Lsd;")
    public static class74 field3331 = new class74(33, 5);

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!ds", name = "s", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!ds", name = "t", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!ds", name = "u", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!ds", name = "w", descriptor = "Lg;")
    public static class470 field3332;

    static {
        new class40("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)V", line = 3)
    public static void method1328(int arg0) {
        field3332 = null;
        field3326 = null;
        if (arg0 != 32) {
            method1328(102);
        }
        field3331 = null;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IILcj;I)V", line = 15)
    public static final void method1329(int arg0, int arg1, class198 arg2, int arg3) {
        if (arg2.field2449 == arg0 && arg0 != -1) {
            class207 var4 = class175.field2103.method1267(-114, arg0);
            int var5 = var4.field2848;
            if (var5 == 1) {
                arg2.field2498 = 0;
                arg2.field2507 = 0;
                arg2.field2450 = 0;
                arg2.field2495 = arg3;
                arg2.field2518 = 1;
                class126.method602(var4, class19.field258 == arg2, arg2.field1008, arg2.field2498, arg2.field1005, false, arg2.field994);
            }
            if (var5 == 2) {
                arg2.field2507 = 0;
            }
        } else if (arg0 == -1 || arg2.field2449 == -1 || class175.field2103.method1267(arg1 - 122, arg0).field2860 >= class175.field2103.method1267(-38, arg2.field2449).field2860) {
            arg2.field2537 = arg2.field2538;
            arg2.field2518 = 1;
            arg2.field2449 = arg0;
            arg2.field2498 = 0;
            arg2.field2495 = arg3;
            arg2.field2507 = 0;
            arg2.field2450 = 0;
            if (arg2.field2449 != -1) {
                class126.method602(class175.field2103.method1267(-76, arg2.field2449), class19.field258 == arg2, arg2.field1008, arg2.field2498, arg2.field1005, false, arg2.field994);
            }
        }
        field3328++;
        if (arg1 != 0) {
            method1331(127);
        }
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(B)V", line = 67)
    public static final void method1330(byte arg0) {
        field3324++;
        int var1 = 0;
        if (class27.field359) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        class153.method738(var1, arg0 + 109);
        class173.field2084.method2290(var1, 4169);
        class422.field6096.method112((byte) 103, var1);
        class390.field5575.method2505(var1, -8164);
        class234.field3258.method2453(var1, -24565);
        class283.method1775((byte) -112, var1);
        class24.method139(var1, (byte) -1);
        class482.method2843(var1, arg0 ^ 0xFFFFEFCA);
        class352.method2141(var1, arg0);
        if (class453.field6415 == 10) {
            class404.method2413(false, 28);
        } else if (class453.field6415 == 30) {
            class404.method2413(false, 25);
            return;
        }
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(I)V", line = 102)
    public static final void method1331(int arg0) {
        field3330++;
        class413.field5876.method384(119);
        class127.field1573.method2489(13494);
        class19.field254.method618(18);
        class173.field2084.method2298(-82);
        class390.field5575.method2508(false);
        class422.field6096.method111((byte) -125);
        class175.field2103.method1266(87);
        class234.field3258.method2449(16383);
        class269.field3860.method989(0);
        class75.field907.method2122(16);
        class415.field6001.method1928(true);
        class44.field568.method1310((byte) 57);
        class47.field611.method1897((byte) -116);
        class424.field6126.method1901((byte) -101);
        class422.field6084.method2073((byte) -119);
        class128.field1576.method1323(29);
        class459.field6482.method1234((byte) -16);
        class312.field4557.method734((byte) -12);
        int var1 = 112 % ((-arg0 - 37) / 39);
        class319.field4642.method1828(false);
        class64.field811.method659((byte) 126);
        class234.method1295((byte) 116);
        class347.method2104(-122);
        class312.method1935((byte) 63);
        class82.method415(false);
        class122.field1520.method1169(1076);
        class362.field5213.method1169(1076);
        class319.field4636.method1169(1076);
        class173.field2079.method1169(1076);
        class396.field5624.method1169(1076);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(BLpn;)V", line = 141)
    public static final void method1332(byte arg0, class72 arg1) {
        int var2 = -59 % ((arg0 - 61) / 63);
        field3329++;
        class230.field3185.method2008(arg1.method369((byte) 125), (byte) -2);
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "()V", line = 153)
    public class244() {
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(J)V", line = 162)
    public class244(long arg0) {
        this.field3327 = arg0;
    }
}
