import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class37 extends class136 {

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
    public int field951 = 0;

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
    public int field963 = -1;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "[I")
    public static int[] field953 = new int[2000];

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "Z")
    public static boolean field955 = false;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "[Z")
    public static boolean[] field957 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "I")
    public static int field966 = 0;

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "Lpd;")
    public static class94 field970 = class28.method249(-94, "Regeln versto-8en hat)3");

    @OriginalMember(owner = "client!ga", name = "M", descriptor = "Z")
    public static boolean field965 = false;

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "I")
    public static int field968 = 0;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "I")
    public static int field954 = 0;

    @OriginalMember(owner = "client!ga", name = "ab", descriptor = "Lpd;")
    private static class94 field978 = class28.method249(82, "Enter object name");

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "I")
    public static int field969 = 0;

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "Lpd;")
    public static class94 field975 = field978;

    @OriginalMember(owner = "client!ga", name = "Z", descriptor = "Lpd;")
    private static class94 field977 = class28.method249(-48, "Close");

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "Lpd;")
    public static class94 field973 = field977;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "I")
    public int field952;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
    public int field956;

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "I")
    public int field959;

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "I")
    public int field961;

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
    public int field962;

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
    public int field964;

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "I")
    public int field967;

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!ga", name = "V", descriptor = "I")
    public int field974;

    @OriginalMember(owner = "client!ga", name = "Y", descriptor = "I")
    public int field976;

    @OriginalMember(owner = "client!ga", name = "bb", descriptor = "I")
    public int field979;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V", line = 4)
    public static final void method287(boolean arg0) {
        class63.field1532 = true;
        field958++;
        class75.method560(0);
        if (class79.field1995) {
            class115.field2913.method120(class8.field227, 239, 40, 0);
            class115.field2913.method120(class4.method20(new class94[] { class8.field226, class81.field2070 }, true), 239, 60, 128);
        } else if (class110.field2741 == 1) {
            class115.field2913.method120(class30.field866, 239, 40, 0);
            class115.field2913.method120(class4.method20(new class94[] { class8.field232, class81.field2070 }, !arg0), 239, 60, 128);
        } else if (class110.field2741 == 2) {
            class115.field2913.method120(class54.field1357, 239, 40, 0);
            class115.field2913.method120(class4.method20(new class94[] { class8.field232, class81.field2070 }, true), 239, 60, 128);
        } else if (class110.field2741 == 3) {
            if (class8.field234 != class8.field232) {
                class76.method571(-1, class8.field232);
                class8.field234 = class8.field232;
            }
            class16 var17 = class112.field2835;
            class130.method1019(0, 0, 463, 77);
            for (int var18 = 0; var18 < class126.field3162; var18++) {
                int var19 = var18 * 14 + 18 - client.field502;
                if (var19 > 0 && var19 < 110) {
                    var17.method120(class13.field322[var18], 239, var19, 0);
                }
            }
            class130.method1030();
            if (class126.field3162 > 5) {
                class31.method265(class126.field3162 * 14 + 7, 77, client.field502, 463, -8, 0);
            }
            if (class8.field232.method710(-123) == 0) {
                class115.field2913.method120(field975, 239, 40, 255);
            } else if (class126.field3162 == 0) {
                class115.field2913.method120(class84.field2124, 239, 40, 0);
            }
            var17.method120(class4.method20(new class94[] { class8.field232, class81.field2070 }, true), 239, 90, 0);
            class130.method1020(0, 77, 479, 0);
        } else if (class76.field1855 != null) {
            class115.field2913.method121(class76.field1855, 10, 20, 459, 40, 0, false, 1, 1, 0);
            class115.field2913.method120(class63.field1556, 239, 80, 128);
        } else if (class115.field2925 != -1) {
            boolean var1 = class113.method838(0, 479, 0, 52, 96, class115.field2925, 2);
            if (!var1) {
                class73.field1781 = true;
            }
        } else if (class75.field1837 == -1) {
            int var2 = 0;
            class16 var3 = class112.field2835;
            class130.method1019(0, 0, 463, 77);
            for (int var4 = 0; var4 < 100; var4++) {
                if (class55.field1410[var4] != null) {
                    int var6 = class82.field2110[var4];
                    int var7 = class92.field2362 + 70 - var2 * 14;
                    class94 var8 = class42.field1067[var4];
                    byte var9 = 0;
                    if (var8 != null && var8.method686(-103, class17.field445)) {
                        var8 = var8.method687(5, -123);
                        var9 = 1;
                    }
                    if (var8 != null && var8.method686(-124, class46.field1122)) {
                        var8 = var8.method687(5, -123);
                        var9 = 2;
                    }
                    if (var6 == 0) {
                        if (var7 > 0 && var7 < 110) {
                            var3.method115(class55.field1410[var4], 4, var7, 0);
                        }
                        var2++;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || class97.field2473 == 0 || class97.field2473 == 1 && class2.method9(false, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                class89.field2308[0].method33(var10, var7 - 12);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                class89.field2308[1].method33(var10, var7 - 12);
                                var10 += 14;
                            }
                            var3.method115(class4.method20(new class94[] { var8, class54.field1369 }, !arg0), var10, var7, 0);
                            int var11 = var10 + var3.method118(var8) + 8;
                            var3.method115(class55.field1410[var4], var11, var7, 255);
                        }
                        var2++;
                    }
                    if ((var6 == 3 || var6 == 7) && class4.field94 == 0 && (var6 == 7 || class102.field2569 == 0 || class102.field2569 == 1 && class2.method9(false, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var3.method115(class20.field533, var12, var7, 0);
                            int var13 = var12 + var3.method118(class20.field533);
                            int var14 = var13 + var3.method122(32);
                            if (var9 == 1) {
                                class89.field2308[0].method33(var14, var7 - 12);
                                var14 += 14;
                            }
                            if (var9 == 2) {
                                class89.field2308[1].method33(var14, var7 - 12);
                                var14 += 14;
                            }
                            var3.method115(class4.method20(new class94[] { var8, class54.field1369 }, true), var14, var7, 0);
                            int var15 = var14 + var3.method118(var8) + 8;
                            var3.method115(class55.field1410[var4], var15, var7, 8388608);
                        }
                        var2++;
                    }
                    if (var6 == 4 && (class2.field58 == 0 || class2.field58 == 1 && class2.method9(false, var8))) {
                        var2++;
                        if (var7 > 0 && var7 < 110) {
                            var3.method115(class4.method20(new class94[] { var8, class76.field1859, class55.field1410[var4] }, true), 4, var7, 8388736);
                        }
                    }
                    if (var6 == 5 && class4.field94 == 0 && class102.field2569 < 2) {
                        var2++;
                        if (var7 > 0 && var7 < 110) {
                            var3.method115(class55.field1410[var4], 4, var7, 8388608);
                        }
                    }
                    if (var6 == 6 && class4.field94 == 0 && class102.field2569 < 2) {
                        var2++;
                        if (var7 > 0 && var7 < 110) {
                            var3.method115(class4.method20(new class94[] { class101.field2552, class76.field1859, var8, class54.field1369 }, !arg0), 4, var7, 0);
                            var3.method115(class55.field1410[var4], var3.method118(class4.method20(new class94[] { class101.field2552, class76.field1859, var8 }, true)) + 12, var7, 8388608);
                        }
                    }
                    if (var6 == 8 && (class2.field58 == 0 || class2.field58 == 1 && class2.method9(arg0, var8))) {
                        var2++;
                        if (var7 > 0 && var7 < 110) {
                            var3.method115(class4.method20(new class94[] { var8, class76.field1859, class55.field1410[var4] }, true), 4, var7, 8270336);
                        }
                    }
                }
            }
            class130.method1030();
            class46.field1138 = var2 * 14 + 7;
            if (class46.field1138 < 78) {
                class46.field1138 = 78;
            }
            class31.method265(class46.field1138, 77, class46.field1138 - class92.field2362 - 77, 463, -102, 0);
            class94 var5;
            if (class80.field2044 == null || class80.field2044.field2295 == null) {
                var5 = client.field499;
            } else {
                var5 = class80.field2044.field2295;
            }
            var3.method115(class4.method20(new class94[] { var5, class54.field1369 }, !arg0), 4, 90, 0);
            var3.method115(class4.method20(new class94[] { class8.field225, class81.field2070 }, true), var3.method118(class4.method20(new class94[] { var5, class77.field1929 }, !arg0)) + 6, 90, 255);
            class130.method1020(0, 77, 479, 0);
        } else {
            boolean var16 = class113.method838(0, 479, 0, 32, 96, class75.field1837, 3);
            if (!var16) {
                class73.field1781 = true;
            }
        }
        if (class62.field1516 && class40.field1035 == 2) {
            class4.method27((byte) -16);
        }
        class87.method638((byte) 93);
        if (arg0) {
            method290(null, null, 79, (byte) -59);
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)V", line = 338)
    public static void method288(byte arg0) {
        if (arg0 >= -125) {
            return;
        }
        field977 = null;
        field957 = null;
        field970 = null;
        field953 = null;
        field975 = null;
        field978 = null;
        field973 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZIZIZ)Lmb;", line = 356)
    public static final class73 method289(boolean arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        field972++;
        if (arg1 != -1) {
            method287(false);
        }
        class50 var5 = null;
        if (class99.field2519 != null) {
            var5 = new class50(arg3, class99.field2519, class55.field1399[arg3], 1000000);
        }
        return new class73(var5, class92.field2365, arg3, arg0, arg2, arg4);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lpd;Ljava/awt/Color;IB)V", line = 428)
    public static final void method290(class94 arg0, Color arg1, int arg2, byte arg3) {
        field960++;
        try {
            Graphics var4 = class128.field3218.getGraphics();
            if (class66.field1614 == null) {
                class66.field1614 = new Font("Helvetica", 1, 13);
                class121.field3023 = class128.field3218.getFontMetrics(class66.field1614);
            }
            if (class9.field249) {
                class9.field249 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class36.field948, class14.field367);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            if (arg3 <= -47) {
                try {
                    if (class102.field2572 == null) {
                        class102.field2572 = class128.field3218.createImage(304, 34);
                    }
                    Graphics var5 = class102.field2572.getGraphics();
                    var5.setColor(arg1);
                    var5.drawRect(0, 0, 303, 33);
                    var5.fillRect(2, 2, arg2 * 3, 30);
                    var5.setColor(Color.black);
                    var5.drawRect(1, 1, 301, 31);
                    var5.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
                    var5.setFont(class66.field1614);
                    var5.setColor(Color.white);
                    arg0.method719(0, (304 - arg0.method724(0, class121.field3023)) / 2, var5, 22);
                    var4.drawImage(class102.field2572, class36.field948 / 2 - 152, class14.field367 / 2 + -18, null);
                } catch (Exception var8) {
                    int var6 = class36.field948 / 2 - 152;
                    int var7 = class14.field367 / 2 - 18;
                    var4.setColor(arg1);
                    var4.drawRect(var6, var7, 303, 33);
                    var4.fillRect(var6 + 2, var7 - -2, arg2 * 3, 30);
                    var4.setColor(Color.black);
                    var4.drawRect(var6 + 1, var7 + 1, 301, 31);
                    var4.fillRect(arg2 * 3 + var6 + 2, var7 + 2, 300 - arg2 * 3, 30);
                    var4.setFont(class66.field1614);
                    var4.setColor(Color.white);
                    arg0.method719(0, var6 + (304 - arg0.method724(0, class121.field3023)) / 2, var4, var7 + 22);
                }
            }
        } catch (Exception var9) {
            class128.field3218.repaint();
        }
    }
}
