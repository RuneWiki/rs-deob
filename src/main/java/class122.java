import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class122 {

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "Lr;")
    public static class118 field2810 = class153.method1136(104, "Benutzen");

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "[Lr;")
    public static class118[] field2824 = new class118[100];

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public static int field2823 = 0;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "Lr;")
    public static class118 field2825 = class153.method1136(104, "leuchten1:");

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "Z")
    public static boolean field2822 = false;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "Lr;")
    public static class118 field2816 = class153.method1136(109, "me");

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public int field2811;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public int field2812;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public int field2820;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    public int field2821;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    public int field2828;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "Lmf;")
    public class89 field2814;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "Lmf;")
    public class89 field2815;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "Lmf;")
    public class89 field2817;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static final void method957(int arg0) {
        field2818++;
        try {
            if (class65.field1486 == 1) {
                int var1 = class131.field2991.method125(-1);
                if (var1 > 0 && class131.field2991.method104((byte) 26)) {
                    int var2 = var1 - class118.field2767;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class131.field2991.method113(var2, (byte) -20);
                    return;
                }
                class131.field2991.method108(123);
                class131.field2991.method129(-20324);
                class35.field878 = null;
                class106.field2474 = null;
                if (class112.field2615 == null) {
                    class65.field1486 = 0;
                } else {
                    class65.field1486 = 2;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class131.field2991.method108(125);
            class35.field878 = null;
            class65.field1486 = 0;
            class112.field2615 = null;
            class106.field2474 = null;
        }
        if (arg0 >= -119) {
            field2825 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    public static void method958(int arg0) {
        field2810 = null;
        field2825 = null;
        field2816 = null;
        if (arg0 == -8) {
            field2824 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Lr;")
    public static final class118 method959(int arg0, int arg1) {
        field2827++;
        class118 var2 = class43.method359(arg0, (byte) -122);
        for (int var3 = var2.method935(-125) - 3; var3 > 0; var3 -= 3) {
            var2 = class144.method1066(true, new class118[] { var2.method932(var3, (byte) 121, 0), class74.field1834, var2.method926(var3, (byte) 117) });
        }
        if (var2.method935(-85) > 9) {
            return class144.method1066(true, new class118[] { class20.field494, var2.method932(var2.method935(-72) - 8, (byte) -108, 0), class142.field3208, class39.field943, var2, class51.field1221 });
        } else if (arg1 > ~var2.method935(-124)) {
            return class144.method1066(true, new class118[] { class112.field2613, var2.method932(var2.method935(arg1 ^ 0x50) - 4, (byte) 123, 0), class101.field2352, class39.field943, var2, class51.field1221 });
        } else {
            return class144.method1066(true, new class118[] { class114.field2657, var2, class63.field1444 });
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method960(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2819++;
        if (class126.field2896 == arg4 && class105.field2456 == arg0 && (class62.field1441 == arg2 || !class68.field1582)) {
            return;
        }
        class105.field2456 = arg0;
        class126.field2896 = arg4;
        class62.field1441 = arg2;
        if (!class68.field1582) {
            class62.field1441 = 0;
        }
        class39.method326(22077, 25);
        class35.method292(class20.field481, true, (byte) -92);
        int var6 = class27.field646;
        class27.field646 = arg0 * 8 - 48;
        int var7 = client.field524;
        client.field524 = arg4 * 8 - 48;
        int var8 = client.field524 - var7;
        int var9 = class27.field646 - var6;
        int var10 = class27.field646;
        int var11 = client.field524;
        for (int var12 = 0; var12 < 32768; var12++) {
            class83 var28 = class74.field1833[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field710[var29] -= var8;
                    var28.field755[var29] -= var9;
                }
                var28.field760 -= var8 * 128;
                var28.field712 -= var9 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class132 var26 = class108.field2526[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field710[var27] -= var8;
                    var26.field755[var27] -= var9;
                }
                var26.field760 -= var8 * 128;
                var26.field712 -= var9 * 128;
            }
        }
        class106.field2468 = arg2;
        class89.field2150.method255(arg3, arg1, -20149, arg5);
        byte var14 = 104;
        byte var15 = 0;
        byte var16 = 1;
        if (var8 < 0) {
            var16 = -1;
            var14 = -1;
            var15 = 103;
        }
        byte var17 = 0;
        byte var18 = 1;
        byte var19 = 104;
        if (var9 < 0) {
            var18 = -1;
            var17 = 103;
            var19 = -1;
        }
        for (int var20 = var15; var20 != var14; var20 += var16) {
            for (int var22 = var17; var22 != var19; var22 += var18) {
                int var23 = var9 + var22;
                int var24 = var8 + var20;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var24 >= 0 && var23 >= 0 && var24 < 104 && var23 < 104) {
                        class84.field2022[var25][var20][var22] = class84.field2022[var25][var24][var23];
                    } else {
                        class84.field2022[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class13 var21 = (class13) class112.field2607.method889(120); var21 != null; var21 = (class13) class112.field2607.method884(true)) {
            var21.field282 -= var8;
            var21.field279 -= var9;
            if (var21.field282 < 0 || var21.field279 < 0 || var21.field282 >= 104 || var21.field279 >= 104) {
                var21.method768(-1);
            }
        }
        class1.field31 = -1;
        class24.field575 = false;
        class108.field2525 = 0;
        if (class110.field2561 != 0) {
            field2823 -= var9;
            class110.field2561 -= var8;
        }
        class99.field2289.method888(19014);
        class140.field3186.method888(19014);
    }
}
