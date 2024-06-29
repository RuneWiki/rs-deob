import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 {

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "Lfc;")
    public static class39 field172 = class90.method774("scrollen:", -108);

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "J")
    public static long field169 = 0L;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "[I")
    public static int[] field165 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "Lfc;")
    public static class39 field180 = class90.method774(" )2> <col=ffffff>", -111);

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "Lfc;")
    private static class39 field166 = class90.method774("Login server offline)3", -85);

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Lfc;")
    private static class39 field174 = class90.method774("wishes to trade with you)3", -115);

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "Lfc;")
    public static class39 field171 = class90.method774("Hidden)2", -95);

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "Lfc;")
    public static class39 field181 = field166;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "Lfc;")
    public static class39 field184 = class90.method774("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1", -93);

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
    public static int field183 = -1;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public static int field178 = 0;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Lfc;")
    public static class39 field163 = field174;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public int field164;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public int field175;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public int field177;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public int field182;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    public int field186;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Lqb;")
    public class113 field167;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Lqb;")
    public class113 field168;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "Lqb;")
    public class113 field185;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BII)Z", line = 5)
    public static final boolean method81(byte arg0, int arg1, int arg2) {
        if (arg0 == 22) {
            field176++;
            return (arg1 >> arg2 + 1 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V", line = 59)
    public static final void method82(byte arg0) {
        field173++;
        if (arg0 > -25) {
            field172 = null;
        }
        for (class128 var1 = (class128) class140.field3529.method8(-1); var1 != null; var1 = (class128) class140.field3529.method9(1)) {
            if (class24.field661 != var1.field3282 || class70.field1654 > var1.field3281) {
                var1.method1170(13);
            } else if (var1.field3268 <= class70.field1654) {
                if (var1.field3256 > 0) {
                    class121 var2 = class118.field3092[var1.field3256 - 1];
                    if (var2 != null && var2.field2916 >= 0 && var2.field2916 < 13312 && var2.field2909 >= 0 && var2.field2909 < 13312) {
                        var1.method1060(var2.field2909, class153.method1225(128, var2.field2909, var1.field3282, var2.field2916) - var1.field3252, var2.field2916, class70.field1654, (byte) 103);
                    }
                }
                if (var1.field3256 < 0) {
                    int var3 = -var1.field3256 - 1;
                    class142 var4;
                    if (class53.field1323 == var3) {
                        var4 = class94.field2197;
                    } else {
                        var4 = class101.field2525[var3];
                    }
                    if (var4 != null && var4.field2916 >= 0 && var4.field2916 < 13312 && var4.field2909 >= 0 && var4.field2909 < 13312) {
                        var1.method1060(var4.field2909, class153.method1225(128, var4.field2909, var1.field3282, var4.field2916) - var1.field3252, var4.field2916, class70.field1654, (byte) 121);
                    }
                }
                var1.method1062(client.field547, -13439);
                class139.field3503.method52(class24.field661, (int) var1.field3262, (int) var1.field3285, (int) var1.field3255, 60, var1, var1.field3247, -1, false);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 138)
    public static final void method83(int arg0) {
        if (arg0 != 0) {
            method83(98);
        }
        field179++;
        if (client.field563 != null) {
            client.field563.method1145(5073);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V", line = 159)
    public static final void method84(int arg0, int arg1, int arg2) {
        field170++;
        if (class37.field998 != 0 && arg2 != -1) {
            class75.method672(arg2, 0, false, class142.field3580, false, class37.field998);
            class9.field255 = true;
        }
        if (arg1 != -22466) {
            field184 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V", line = 178)
    public static void method85(byte arg0) {
        field174 = null;
        field171 = null;
        field172 = null;
        field165 = null;
        field184 = null;
        if (arg0 <= 44) {
            field183 = -5;
        }
        field180 = null;
        field181 = null;
        field166 = null;
        field163 = null;
    }
}
