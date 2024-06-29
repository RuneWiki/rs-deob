import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class57 {

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "Lu;")
    private static class135 field1391 = class87.method676((byte) -101, "Friends");

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "Lu;")
    public static class135 field1392 = class87.method676((byte) -60, "Wen m-Ochten Sie der Liste hinzuf-Ugen?");

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Lu;")
    public static class135 field1390 = class87.method676((byte) -116, "");

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "Lu;")
    public static class135 field1394 = field1390;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "Lu;")
    public static class135 field1398 = field1390;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "Lu;")
    public static class135 field1397 = field1390;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "Lu;")
    public static class135 field1393 = class87.method676((byte) -86, "sch-Utteln:");

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "Lu;")
    public static class135 field1399 = field1390;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "Lu;")
    public static class135 field1395 = field1391;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "Lu;")
    public static class135 field1401 = field1390;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "Lu;")
    public static class135 field1389 = field1390;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "B")
    public static byte field1403 = 0;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "Lu;")
    private static class135 field1400 = class87.method676((byte) -60, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "Lu;")
    public static class135 field1404 = field1400;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "Le;")
    public static class29 field1396 = new class29(100);

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "Lu;")
    public static class135 field1407 = class87.method676((byte) -118, "Regelversto-8 melden");

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public static int field1406 = 0;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "Lu;")
    public static class135 field1408 = class87.method676((byte) -122, "backleft1");

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "Lu;")
    private static class135 field1410 = class87.method676((byte) -114, "Loading fonts )2 ");

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "Lu;")
    public static class135 field1409 = field1410;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILve;)Z")
    public static final boolean method436(int arg0, class146 arg1) {
        int var2 = arg1.field3601;
        field1405++;
        if (class63.field1573 == 2) {
            if (var2 == 201) {
                class42.field975 = 0;
                class113.field2735 = class113.field2742;
                class141.field3434 = 1;
                class65.field1634 = true;
                class34.field789 = true;
                class113.field2724 = class17.field385;
            }
            if (var2 == 202) {
                class65.field1634 = true;
                class34.field789 = true;
                class141.field3434 = 2;
                class42.field975 = 0;
                class113.field2735 = class113.field2742;
                class113.field2724 = class107.field2586;
            }
        }
        if (var2 == 205) {
            class26.field642 = 250;
            return true;
        }
        if (var2 == 501) {
            class42.field975 = 0;
            class65.field1634 = true;
            class113.field2724 = class5.field122;
            class141.field3434 = 4;
            class34.field789 = true;
            class113.field2735 = class113.field2742;
        }
        if (var2 == 502) {
            class141.field3434 = 5;
            class34.field789 = true;
            class65.field1634 = true;
            class113.field2735 = class113.field2742;
            class42.field975 = 0;
            class113.field2724 = client.field531;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var3 = (var2 - 300) / 2;
            int var4 = var2 & 0x1;
            class128.field3089.method202(var3, arg0 ^ 0x1CFF, var4 == 1);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var5 = (var2 - 314) / 2;
            int var6 = var2 & 0x1;
            class128.field3089.method204(var6 == 1, 104, var5);
        }
        if (var2 == 324) {
            class128.field3089.method208(arg0 ^ 0xFFFFE300, false);
        }
        if (var2 == 325) {
            class128.field3089.method208(-1, true);
        }
        if (var2 == 326) {
            class130.field3117++;
            class152.field3751.method929(171, -14044);
            class128.field3089.method207(class152.field3751, 0);
            return true;
        }
        if (var2 == 620) {
            class124.field2966 = !class124.field2966;
        }
        if (var2 >= 601 && var2 <= 613) {
            class96.method790((byte) -114);
            if (class113.field2718.method1063(arg0 ^ 0xFFFFE33F) > 0) {
                class85.field2024++;
                class152.field3751.method929(43, arg0 ^ 0xFFFFD5DB);
                class152.field3751.method461(11739, class113.field2718.method1064(arg0 - 29666));
                class152.field3751.method452(var2 - 601, arg0 + -7168);
                class152.field3751.method452(class124.field2966 ? 1 : 0, arg0 - 7168);
            }
        }
        return arg0 == 7423 ? false : false;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static void method437(int arg0) {
        field1394 = null;
        field1407 = null;
        field1393 = null;
        field1410 = null;
        field1409 = null;
        field1397 = null;
        field1400 = null;
        field1398 = null;
        field1401 = null;
        field1389 = null;
        field1395 = null;
        field1391 = null;
        if (arg0 != 202) {
            return;
        }
        field1390 = null;
        field1392 = null;
        field1404 = null;
        field1399 = null;
        field1396 = null;
        field1408 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZLg;II)[Lbc;")
    public static final class11[] method438(boolean arg0, class43 arg1, int arg2, int arg3) {
        field1402++;
        if (!arg0) {
            field1391 = null;
        }
        return class79.method626((byte) -66, arg1, arg3, arg2) ? class119.method940(-59) : null;
    }
}
