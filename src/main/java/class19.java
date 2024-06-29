import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class19 {

    @OriginalMember(owner = "client!he", name = "b", descriptor = "Lcf;")
    private static class93 field246 = class147.method1066("Loading interfaces )2 ", -48);

    @OriginalMember(owner = "client!he", name = "a", descriptor = "Lcf;")
    public static class93 field245 = field246;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "Lcf;")
    public static class93 field250 = class147.method1066("Stufe: ", -48);

    @OriginalMember(owner = "client!he", name = "m", descriptor = "Lcf;")
    private static class93 field257 = class147.method1066("slide:", -48);

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Lcf;")
    public static class93 field253 = field257;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "Lcf;")
    public static class93 field249 = field257;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "Lcf;")
    public static class93 field260 = class147.method1066(" )2>", -48);

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Lcf;")
    public static class93 field248 = class147.method1066("Annuler", -48);

    @OriginalMember(owner = "client!he", name = "o", descriptor = "Z")
    public static boolean field259 = false;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "Lcf;")
    private static class93 field251 = class147.method1066("cyan:", -48);

    @OriginalMember(owner = "client!he", name = "c", descriptor = "Lcf;")
    public static class93 field247 = field251;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "Lcf;")
    public static class93 field255 = field251;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "Lmd;")
    public static class221 field262;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "[B")
    public static byte[] field263;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
    public static final void method86(byte arg0) {
        field256++;
        if (arg0 > -114) {
            field247 = null;
        }
        for (int var1 = 0; var1 < class29.field364; var1++) {
            class34 var2 = class4.method16(-18960, var1);
            if (var2 != null && var2.field531 == 0) {
                class47.field754[var1] = 0;
                class176.field3061[var1] = 0;
            }
        }
        class208.field3722 = new class25(16);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method87(int arg0) {
        field248 = null;
        field245 = null;
        field246 = null;
        field260 = null;
        if (arg0 != -1295262521) {
            method87(76);
        }
        field249 = null;
        field255 = null;
        field251 = null;
        field263 = null;
        field250 = null;
        field257 = null;
        field262 = null;
        field247 = null;
        field253 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)V")
    public static final void method88(int arg0, boolean arg1) {
        field252++;
        if (class199.field3609 == arg0) {
            return;
        }
        if (arg1) {
            method89((byte) -22);
        }
        if (class199.field3609 == 0) {
            class18.method83((byte) 71);
        }
        if (arg0 == 40) {
            class110.method787(-1);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (arg0 != 40 && class127.field2243 != null) {
            class127.field2243.method947((byte) 25);
            class127.field2243 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class181.field3359 = 0;
            class72.field1302 = 0;
            class32.field505 = 1;
            class8.field111 = 0;
            class148.field2610 = 1;
            class131.method960((byte) -28, true);
        }
        if (arg0 == 25 || arg0 == 10) {
            class240.method1641((byte) -127);
        }
        if (arg0 == 5) {
            class251.method1704(5802, class246.field4436);
        } else {
            class183.method1342(1);
        }
        boolean var3 = class199.field3609 == 5 || class199.field3609 == 10 || class199.field3609 == 28;
        if (var2 != var3) {
            if (var2) {
                class164.field2894 = class255.field4617;
                if (class195.field3552 == 0) {
                    class92.method634(3, 2);
                } else {
                    class37.method217(2, class189.field3468, class255.field4617, false, 25097, 255, 0);
                }
                class26.field345.method1394(false, false);
            } else {
                class92.method634(101, 2);
                class26.field345.method1394(arg1, true);
            }
        }
        class199.field3609 = arg0;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
    public static final void method89(byte arg0) {
        field254++;
        int var1 = class47.field755 >> 7;
        if (class211.field3875 < 128) {
            class211.field3875 = 128;
        }
        if (class211.field3875 > 383) {
            class211.field3875 = 383;
        }
        if (arg0 < 96) {
            field247 = null;
        }
        class50.field825 &= 0x7FF;
        int var2 = class78.field1456 >> 7;
        int var3 = class13.method56(class78.field1456, class47.field755, (byte) 85, class138.field2405);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class138.field2405;
                    if (var7 < 3 && (class4.field53[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var3 + ((class134.field2350[var7][var5][var6] & 0xFF) * 8) - class233.field4151[var7][var5][var6];
                    if (var8 > var4) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 > class161.field2836) {
            class161.field2836 += (var9 - class161.field2836) / 24;
        } else if (var9 < class161.field2836) {
            class161.field2836 += (var9 - class161.field2836) / 80;
        }
    }
}
