import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class344 extends class499 {

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    public volatile int field4733 = -1;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "Ljava/lang/String;")
    public volatile String field4735;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4734 = null;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "Ljm;")
    public static class485 field4736 = new class485(75, 4);

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "Lfg;")
    public static class83 field4739 = new class83("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "[I")
    public static int[] field4743 = new int[100];

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "Lqa;")
    public static class162 field4741;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "[I")
    public static int[] field4744;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "[Lf;")
    public static class529[] field4742;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "[S")
    public static short[] field4740;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
    public static void method1915(int arg0) {
        if (arg0 <= 81) {
            return;
        }
        field4740 = null;
        field4736 = null;
        field4743 = null;
        field4741 = null;
        field4739 = null;
        field4744 = null;
        field4734 = null;
        field4742 = null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lm;Lqa;B)V")
    public static final void method1916(class126 arg0, class162 arg1, byte arg2) {
        int var3 = 52 % ((22 - arg2) / 44);
        field4732++;
        if (class481.field7034 == null) {
            return;
        }
        if (class374.field5277 < 10) {
            if (!class481.field7028.method1400(-126, class481.field7034.field6296)) {
                class374.field5277 = class87.field1193.method1408((byte) 43, class481.field7034.field6296) / 10;
                return;
            }
            class51.method314(0);
            class374.field5277 = 10;
        }
        if (class374.field5277 == 10) {
            class481.field7046 = class481.field7034.field6312 >> 6 << 6;
            class481.field7066 = class481.field7034.field6294 >> 6 << 6;
            class481.field7051 = (class481.field7034.field6295 >> 6 << 6) + 64 - class481.field7046;
            class481.field7056 = (class481.field7034.field6300 >> 6 << 6) + 64 - class481.field7066;
            int[] var4 = new int[3];
            int var5 = -1;
            int var6 = -1;
            if (class481.field7034.method2588(class75.field1089.field464, class79.field1134 + (class75.field1089.field461 >> 7), (class75.field1089.field466 >> 7) + class215.field3059, 0, var4)) {
                var5 = var4[1] - class481.field7046;
                var6 = var4[2] - class481.field7066;
            }
            if (!class346.field4746 && var5 >= 0 && class481.field7051 > var5 && var6 >= 0 && class481.field7056 > var6) {
                int var7 = var5 + (int) (Math.random() * 10.0D) - 5;
                int var8 = var6 + ((int) (Math.random() * 10.0D) - 5);
                class201.field2872 = var7;
                class137.field1956 = var8;
            } else if (class380.field5371 == -1 || class403.field5595 == -1) {
                class481.field7034.method2583(class481.field7034.field6297 >> 14 & 0x3FFF, var4, (byte) -113, class481.field7034.field6297 & 0x3FFF);
                class201.field2872 = var4[1] - class481.field7046;
                class137.field1956 = var4[2] - class481.field7066;
            } else {
                class481.field7034.method2583(class380.field5371, var4, (byte) -113, class403.field5595);
                class346.field4746 = false;
                if (var4 != null) {
                    class201.field2872 = var4[1] - class481.field7046;
                    class137.field1956 = var4[2] - class481.field7066;
                }
                class403.field5595 = -1;
                class380.field5371 = -1;
            }
            if (class481.field7034.field6305 == 37) {
                class481.field7044 = 3.0F;
                class481.field7041 = 3.0F;
            } else if (class481.field7034.field6305 == 50) {
                class481.field7044 = 4.0F;
                class481.field7041 = 4.0F;
            } else if (class481.field7034.field6305 == 75) {
                class481.field7044 = 6.0F;
                class481.field7041 = 6.0F;
            } else if (class481.field7034.field6305 == 100) {
                class481.field7044 = 8.0F;
                class481.field7041 = 8.0F;
            } else if (class481.field7034.field6305 == 200) {
                class481.field7044 = 16.0F;
                class481.field7041 = 16.0F;
            } else {
                class481.field7044 = 8.0F;
                class481.field7041 = 8.0F;
            }
            class481.field7038 = (int) class481.field7044 >> 1;
            class481.field7039 = class341.method1902(class481.field7038, (byte) 5);
            class510.method2997((byte) 105);
            class481.method2841();
            class496.field7297 = new class522();
            class481.field7040 += (int) (Math.random() * 5.0D) - 2;
            if (class481.field7040 < -8) {
                class481.field7040 = -8;
            }
            if (class481.field7040 > 8) {
                class481.field7040 = 8;
            }
            class481.field7035 += (int) (Math.random() * 5.0D) - 2;
            if (class481.field7035 < -16) {
                class481.field7035 = -16;
            }
            if (class481.field7035 > 16) {
                class481.field7035 = 16;
            }
            class481.method2837(arg0, class481.field7040 >> 2 << 10, class481.field7035 >> 1);
            class481.field7031.method852(256, 1024, -51);
            class481.field7026.method1563(0, 256, 256);
            class481.field7029.method2126(30, 4096);
            class389.field5456.method1876(256, -116);
            class374.field5277 = 20;
        } else if (class374.field5277 == 20) {
            class270.method1545((byte) 100, true);
            class481.method2838(arg1, class481.field7040, class481.field7035);
            class374.field5277 = 60;
            class270.method1545((byte) -57, true);
            class109.method704(-7033);
        } else if (class374.field5277 == 60) {
            if (class481.field7028.method1406(class481.field7034.field6296 + "_staticelements", 122)) {
                if (!class481.field7028.method1400(-59, class481.field7034.field6296 + "_staticelements")) {
                    return;
                }
                class481.field7042 = class210.method1275((byte) -83, class481.field7034.field6296 + "_staticelements", class123.field1689, class481.field7028);
            } else {
                class481.field7042 = new class435(0);
            }
            class481.method2826();
            class374.field5277 = 70;
            class270.method1545((byte) -128, true);
            class109.method704(-7033);
        } else if (class374.field5277 == 70) {
            class33.field473 = new class462(arg1, 11, true, class474.field6924);
            class374.field5277 = 73;
            class270.method1545((byte) -40, true);
            class109.method704(-7033);
        } else if (class374.field5277 == 73) {
            class352.field4804 = new class462(arg1, 12, true, class474.field6924);
            class374.field5277 = 76;
            class270.method1545((byte) 125, true);
            class109.method704(-7033);
        } else if (class374.field5277 == 76) {
            class451.field6507 = new class462(arg1, 14, true, class474.field6924);
            class374.field5277 = 79;
            class270.method1545((byte) 97, true);
            class109.method704(-7033);
        } else if (class374.field5277 == 79) {
            class35.field500 = new class462(arg1, 17, true, class474.field6924);
            class374.field5277 = 82;
            class270.method1545((byte) 98, true);
            class109.method704(-7033);
        } else if (class374.field5277 == 82) {
            class152.field2135 = new class462(arg1, 19, true, class474.field6924);
            class374.field5277 = 85;
            class270.method1545((byte) -70, true);
            class109.method704(-7033);
        } else if (class374.field5277 == 85) {
            class101.field1373 = new class462(arg1, 22, true, class474.field6924);
            class374.field5277 = 88;
            class270.method1545((byte) 119, true);
            class109.method704(-7033);
        } else if (class374.field5277 == 88) {
            class380.field5363 = new class462(arg1, 26, true, class474.field6924);
            class374.field5277 = 91;
            class270.method1545((byte) 115, true);
            class109.method704(-7033);
        } else {
            class54.field752 = new class462(arg1, 30, true, class474.field6924);
            class374.field5277 = 100;
            class270.method1545((byte) 104, true);
            class109.method704(-7033);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)I")
    public static final int method1917(int arg0, int arg1, int arg2) {
        if (arg2 > -80) {
            return -128;
        }
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        field4737++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class344(String arg0) {
        this.field4735 = arg0;
    }
}
