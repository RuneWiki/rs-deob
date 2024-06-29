import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class91 {

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "Lae;")
    public static class6 field2168 = class64.method474(119, "Bitte versuchen Sie es in ");

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field2174 = -1;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field2171 = -1;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "Lae;")
    public static class6 field2172 = class64.method474(127, "");

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Lae;")
    public static class6 field2162 = class64.method474(116, "null");

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "Lae;")
    public static class6 field2173 = class64.method474(103, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public int field2163;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public int field2164;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public int field2169;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    public int field2175;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V", line = 12)
    public static void method761(byte arg0) {
        field2162 = null;
        field2173 = null;
        field2168 = null;
        if (arg0 != -121) {
            method762(null, (byte) 123);
        }
        field2172 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lte;B)Z", line = 42)
    public static final boolean method762(class121 arg0, byte arg1) {
        int var2 = arg0.field2953;
        if (arg1 != -36) {
            return true;
        }
        field2165++;
        if (class20.field414 == 2) {
            if (var2 == 201) {
                class24.field608 = 1;
                class125.field3048 = true;
                class133.field3247 = class133.field3262;
                class76.field1765 = 0;
                class20.field427 = true;
                class133.field3242 = class30.field708;
            }
            if (var2 == 202) {
                class24.field608 = 2;
                class125.field3048 = true;
                class20.field427 = true;
                class76.field1765 = 0;
                class133.field3242 = class69.field1531;
                class133.field3247 = class133.field3262;
            }
        }
        if (var2 == 205) {
            class32.field775 = 250;
            return true;
        }
        if (var2 == 501) {
            class133.field3247 = class133.field3262;
            class133.field3242 = class125.field3056;
            class125.field3048 = true;
            class24.field608 = 4;
            class20.field427 = true;
            class76.field1765 = 0;
        }
        if (var2 == 502) {
            class133.field3247 = class133.field3262;
            class133.field3242 = class56.field1234;
            class24.field608 = 5;
            class125.field3048 = true;
            class76.field1765 = 0;
            class20.field427 = true;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var3 = (var2 - 300) / 2;
            int var4 = var2 & 0x1;
            class32.field793.method698(0, var4 == 1, var3);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var5 = var2 & 0x1;
            int var6 = (var2 - 314) / 2;
            class32.field793.method710(var5 == 1, 7961, var6);
        }
        if (var2 == 324) {
            class32.field793.method697(-22411, false);
        }
        if (var2 == 325) {
            class32.field793.method697(-22411, true);
        }
        if (var2 == 326) {
            class111.field2660.method938((byte) 63, 118);
            class21.field487++;
            class32.field793.method700(class111.field2660, -72);
            return true;
        }
        if (var2 == 620) {
            class125.field3046 = !class125.field3046;
        }
        if (var2 >= 601 && var2 <= 613) {
            class108.method911(31121);
            if (class133.field3260.method41(-8521) > 0) {
                class54.field1204++;
                class111.field2660.method938((byte) 63, 119);
                class111.field2660.method639(true, class133.field3260.method43((byte) -56));
                class111.field2660.method641((byte) -28, var2 - 601);
                class111.field2660.method641((byte) -28, class125.field3046 ? 1 : 0);
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/awt/Component;ILbf;)V", line = 168)
    public static final void method763(Component arg0, int arg1, class14 arg2) {
        field2166++;
        if (class72.field1639) {
            return;
        }
        class82.field2016 = class96.method802((byte) -79, arg2, class103.field2424, class54.field1187);
        class26.field663 = class96.method802((byte) -79, arg2, class79.field1908, class54.field1187);
        class88.field2107 = class96.method802((byte) -79, arg2, class60.field1312, class54.field1187);
        class102.field2407 = class96.method802((byte) -79, arg2, class116.field2731, class54.field1187);
        class135.field3297 = class96.method802((byte) -79, arg2, class54.field1202, class54.field1187);
        class105.field2483 = class96.method802((byte) -79, arg2, class12.field226, class54.field1187);
        class47.field1063 = class105.method890(arg0, 479, 96, (byte) -111);
        class26.field663.method1036(0, 0);
        class138.field3350 = class105.method890(arg0, 172, 156, (byte) -127);
        class74.method590();
        class88.field2107.method1036(0, 0);
        class65.field1419 = class105.method890(arg0, 190, 261, (byte) -110);
        class82.field2016.method1036(0, 0);
        class37.field852 = class105.method890(arg0, 512, 334, (byte) -104);
        class74.method590();
        class134.field3279 = class105.method890(arg0, 496, 50, (byte) -116);
        class26.field657 = class105.method890(arg0, 269, 37, (byte) -122);
        class100.field2344 = class105.method890(arg0, 249, 45, (byte) -124);
        class101 var3 = class64.method467(class117.field2788, -12078, class54.field1187, arg2);
        if (arg1 != -35) {
            field2162 = null;
        }
        class111.field2675 = class105.method890(arg0, var3.field2380, var3.field2376, (byte) -124);
        var3.method857(0, 0);
        class101 var4 = class64.method467(class137.field3324, arg1 - 12043, class54.field1187, arg2);
        class108.field2586 = class105.method890(arg0, var4.field2380, var4.field2376, (byte) -126);
        var4.method857(0, 0);
        class101 var5 = class64.method467(class26.field660, -12078, class54.field1187, arg2);
        class92.field2188 = class105.method890(arg0, var5.field2380, var5.field2376, (byte) -120);
        var5.method857(0, 0);
        class101 var6 = class64.method467(class70.field1553, -12078, class54.field1187, arg2);
        class15.field311 = class105.method890(arg0, var6.field2380, var6.field2376, (byte) -127);
        var6.method857(0, 0);
        class101 var7 = class64.method467(class102.field2398, -12078, class54.field1187, arg2);
        class79.field1920 = class105.method890(arg0, var7.field2380, var7.field2376, (byte) -120);
        var7.method857(0, 0);
        class101 var8 = class64.method467(class134.field3274, -12078, class54.field1187, arg2);
        class123.field3029 = class105.method890(arg0, var8.field2380, var8.field2376, (byte) -104);
        var8.method857(0, 0);
        class101 var9 = class64.method467(class52.field1185, -12078, class54.field1187, arg2);
        class47.field1066 = class105.method890(arg0, var9.field2380, var9.field2376, (byte) -125);
        var9.method857(0, 0);
        class101 var10 = class64.method467(class79.field1931, -12078, class54.field1187, arg2);
        class121.field2995 = class105.method890(arg0, var10.field2380, var10.field2376, (byte) -103);
        var10.method857(0, 0);
        class101 var11 = class64.method467(class117.field2769, -12078, class54.field1187, arg2);
        class105.field2496 = class105.method890(arg0, var11.field2380, var11.field2376, (byte) -119);
        var11.method857(0, 0);
        class135.field3296 = class96.method802((byte) -79, arg2, class2.field5, class54.field1187);
        class107.field2520 = class96.method802((byte) -79, arg2, class107.field2533, class54.field1187);
        class2.field22 = class96.method802((byte) -79, arg2, class111.field2665, class54.field1187);
        class61.field1344 = class135.field3296.method1033();
        class61.field1344.method1032();
        class130.field3165 = class107.field2520.method1033();
        class130.field3165.method1032();
        class7.field144 = class135.field3296.method1033();
        class7.field144.method1035();
        class118.field2815 = class107.field2520.method1033();
        class118.field2815.method1035();
        class60.field1308 = class2.field22.method1033();
        class60.field1308.method1035();
        class54.field1196 = class135.field3296.method1033();
        class54.field1196.method1032();
        class54.field1196.method1035();
        class125.field3054 = class107.field2520.method1033();
        class125.field3054.method1032();
        class125.field3054.method1035();
        class108.field2578 = class90.method760((byte) 83, arg2, class54.field1187, class138.field3355);
        class26.field655 = new int[151];
        class58.field1271 = new int[33];
        class56.field1228 = new int[151];
        class121.field2990 = new int[33];
        for (int var12 = 0; var12 < 33; var12++) {
            int var17 = 999;
            int var18 = 0;
            for (int var19 = 0; var19 < 34; var19++) {
                if (class88.field2107.field3109[var19 + class88.field2107.field3103 * var12] == 0) {
                    if (var17 == 999) {
                        var17 = var19;
                    }
                } else if (var17 != 999) {
                    var18 = var19;
                    break;
                }
            }
            class58.field1271[var12] = var17;
            class121.field2990[var12] = var18 - var17;
        }
        for (int var13 = 5; var13 < 156; var13++) {
            int var14 = 999;
            int var15 = 0;
            for (int var16 = 25; var16 < 172; var16++) {
                if (class88.field2107.field3109[var16 + class88.field2107.field3103 * var13] == 0 && (var16 > 34 || var13 > 34)) {
                    if (var14 == 999) {
                        var14 = var16;
                    }
                } else if (var14 != 999) {
                    var15 = var16;
                    break;
                }
            }
            class26.field655[var13 - 5] = var14 - 25;
            class56.field1228[var13 - 5] = var15 - var14;
        }
        class72.field1639 = true;
    }
}
