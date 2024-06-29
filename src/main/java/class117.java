import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class117 {

    @OriginalMember(owner = "client!me", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field1732;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "[I")
    public static int[] field1731;

    static {
        new class206("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
        field1732 = new String[200];
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V", line = 5)
    public static void method735(int arg0) {
        if (arg0 != 4096) {
            field1732 = null;
        }
        field1732 = null;
        field1731 = null;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)Ljg;", line = 16)
    public static final class205 method736(int arg0) {
        field1730++;
        if (class55.field736 == null || class409.field5603 == null) {
            return null;
        }
        class409.field5603.method1465(class55.field736, 19067);
        class205 var1 = (class205) class409.field5603.method1466((byte) 117);
        if (var1 == null) {
            return null;
        }
        if (arg0 != 60) {
            field1732 = null;
        }
        class313 var2 = class55.field735.method2710(26, var1.field2775);
        return var2 != null && var2.field4117 && var2.method1714(class55.field728, (byte) 66) ? var1 : class456.method2681(2);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILwm;Lci;)V", line = 47)
    public static final void method737(int arg0, class364 arg1, class287 arg2) {
        field1729++;
        if (arg0 >= -60) {
            field1731 = null;
        }
        if (class55.field727 == null) {
            return;
        }
        if (class373.field5100 < 10) {
            if (!class55.field733.method685(class55.field727.field3783, (byte) -116)) {
                class373.field5100 = class484.field6701.method698(class55.field727.field3783, (byte) 93) / 10;
                return;
            }
            class247.method1384(true);
            class373.field5100 = 10;
        }
        if (class373.field5100 == 10) {
            class55.field757 = class55.field727.field3776 >> 6 << 6;
            class55.field754 = class55.field727.field3767 >> 6 << 6;
            class55.field756 = (class55.field727.field3772 >> 6 << 6) + 64 - class55.field757;
            class55.field750 = (class55.field727.field3780 >> 6 << 6) + 64 - class55.field754;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class55.field727.method1587(class233.field3103.field6502, 32765, var3, class162.field2260 + (class233.field3103.field6501 >> 7), (class233.field3103.field6507 >> 7) + class266.field3511)) {
                var4 = var3[1] - class55.field757;
                var5 = var3[2] - class55.field754;
            }
            if (!class52.field700 && var4 >= 0 && class55.field756 > var4 && var5 >= 0 && class55.field750 > var5) {
                int var6 = var5 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var4 + (int) (Math.random() * 10.0D) - 5;
                class432.field5889 = var6;
                class370.field5065 = var7;
            } else if (class216.field2913 == -1 || class200.field2700 == -1) {
                class55.field727.method1593(true, (class55.field727.field3778 & 0xFFFD73D) >> 14, class55.field727.field3778 & 0x3FFF, var3);
                class432.field5889 = var3[2] - class55.field754;
                class370.field5065 = var3[1] - class55.field757;
            } else {
                class55.field727.method1593(true, class216.field2913, class200.field2700, var3);
                class200.field2700 = -1;
                class216.field2913 = -1;
                class52.field700 = false;
                if (var3 != null) {
                    class432.field5889 = var3[2] - class55.field754;
                    class370.field5065 = var3[1] - class55.field757;
                }
            }
            if (class55.field727.field3782 == 37) {
                class55.field739 = 3.0F;
                class55.field744 = 3.0F;
            } else if (class55.field727.field3782 == 50) {
                class55.field739 = 4.0F;
                class55.field744 = 4.0F;
            } else if (class55.field727.field3782 == 75) {
                class55.field739 = 6.0F;
                class55.field744 = 6.0F;
            } else if (class55.field727.field3782 == 100) {
                class55.field739 = 8.0F;
                class55.field744 = 8.0F;
            } else if (class55.field727.field3782 == 200) {
                class55.field739 = 16.0F;
                class55.field744 = 16.0F;
            } else {
                class55.field739 = 8.0F;
                class55.field744 = 8.0F;
            }
            class55.field737 = (int) class55.field739 >> 1;
            class55.field741 = class282.method1598(class55.field737, 123);
            class346.method2132(0);
            class55.method394();
            class271.field3611 = new class105();
            class55.field738 += (int) (Math.random() * 5.0D) - 2;
            if (class55.field738 < -8) {
                class55.field738 = -8;
            }
            class55.field740 += (int) (Math.random() * 5.0D) - 2;
            if (class55.field738 > 8) {
                class55.field738 = 8;
            }
            if (class55.field740 < -16) {
                class55.field740 = -16;
            }
            if (class55.field740 > 16) {
                class55.field740 = 16;
            }
            class55.method403(arg2, class55.field738 >> 2 << 10, class55.field740 >> 1);
            class55.field735.method2708(256, 1024, -2);
            class55.field730.method2192(256, true, 256);
            class55.field729.method933(4096, (byte) 63);
            class302.field4021.method1224(256, 10);
            class373.field5100 = 20;
        } else if (class373.field5100 == 20) {
            class205.method1173((byte) -107, true);
            class55.method396(arg1, class55.field738, class55.field740);
            class373.field5100 = 60;
            class205.method1173((byte) -122, true);
            class383.method2351((byte) 123);
        } else if (class373.field5100 == 60) {
            if (class55.field733.method714(-1, class55.field727.field3783 + "_staticelements")) {
                if (!class55.field733.method685(class55.field727.field3783 + "_staticelements", (byte) -104)) {
                    return;
                }
                class55.field743 = class48.method347(class55.field733, class55.field727.field3783 + "_staticelements", class158.field2174, -2);
            } else {
                class55.field743 = new class455(0);
            }
            class55.method386();
            class373.field5100 = 70;
            class205.method1173((byte) -70, true);
            class383.method2351((byte) 123);
        } else if (class373.field5100 == 70) {
            class441.field5947 = new class253(arg1, 11, true, class28.field378);
            class373.field5100 = 73;
            class205.method1173((byte) -115, true);
            class383.method2351((byte) 123);
        } else if (class373.field5100 == 73) {
            class97.field1418 = new class253(arg1, 12, true, class28.field378);
            class373.field5100 = 76;
            class205.method1173((byte) -106, true);
            class383.method2351((byte) 123);
        } else if (class373.field5100 == 76) {
            class310.field4096 = new class253(arg1, 14, true, class28.field378);
            class373.field5100 = 79;
            class205.method1173((byte) -93, true);
            class383.method2351((byte) 123);
        } else if (class373.field5100 == 79) {
            class77.field1041 = new class253(arg1, 17, true, class28.field378);
            class373.field5100 = 82;
            class205.method1173((byte) -58, true);
            class383.method2351((byte) 123);
        } else if (class373.field5100 == 82) {
            class404.field5544 = new class253(arg1, 19, true, class28.field378);
            class373.field5100 = 85;
            class205.method1173((byte) -100, true);
            class383.method2351((byte) 123);
        } else if (class373.field5100 == 85) {
            class473.field6528 = new class253(arg1, 22, true, class28.field378);
            class373.field5100 = 88;
            class205.method1173((byte) -56, true);
            class383.method2351((byte) 123);
        } else if (class373.field5100 == 88) {
            class231.field3072 = new class253(arg1, 26, true, class28.field378);
            class373.field5100 = 91;
            class205.method1173((byte) -62, true);
            class383.method2351((byte) 123);
        } else {
            class446.field6063 = new class253(arg1, 30, true, class28.field378);
            class373.field5100 = 100;
            class205.method1173((byte) -78, true);
            class383.method2351((byte) 123);
            System.gc();
        }
    }
}
