import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class64 {

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "Lec;")
    public static class28 field1415 = class28.method210(-46, "yesterday");

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "Lec;")
    public static class28 field1419 = class28.method210(-46, "Oct");

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "Lec;")
    public static class28 field1428 = class28.method210(-46, "mapmarker");

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Lec;")
    public static class28 field1416 = null;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "[I")
    public static int[] field1429 = new int[16384];

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public static int field1430 = 0;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "Lec;")
    public static class28 field1422 = class28.method210(-46, "Ok");

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "Lec;")
    public static class28 field1418 = class28.method210(-46, "K @whi@(X");

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public static int field1427 = 0;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "[I")
    public static int[] field1426 = new int[128];

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "J")
    public static volatile long field1425 = 0L;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public static void method512(byte arg0) {
        field1429 = null;
        field1419 = null;
        field1418 = null;
        if (arg0 >= -21) {
            field1423 = 19;
        }
        field1422 = null;
        field1416 = null;
        field1426 = null;
        field1415 = null;
        field1428 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZLjava/awt/Graphics;)V")
    public static final void method513(boolean arg0, Graphics arg1) {
        class22.field513.method91(553, arg1, 11675, 205);
        if (!arg0) {
            field1420++;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static final void method514(int arg0) {
        field1431++;
        if (client.field381 > 0) {
            class87.method646(arg0 + 23296);
        } else {
            class74.method574(arg0 ^ arg0, 40);
            class112.field2419 = class106.field2239;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIB)Z")
    public static final boolean method515(int arg0, int arg1, byte arg2) {
        field1424++;
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        class45 var3 = class72.method566(arg0, 84);
        if (arg2 > -53) {
            field1427 = -88;
        }
        return var3.method354(arg1, false);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
    public static final void method516(int arg0) {
        class76.method581(false);
        field1432++;
        if (class114.field2444 != 10) {
            return;
        }
        int var1 = class40.field868;
        if (arg0 != -947) {
            method517(-6, 66);
        }
        int var2 = class96.field2143 - 202;
        int var3 = class32.field680 - 171;
        if (class53.field1230 == 0) {
            byte var12 = 100;
            byte var13 = 120;
            if (var1 == 1 && var12 - 75 <= var2 && var2 <= var12 + 75 && var13 - 20 <= var3 && var3 <= var13 + 20) {
                class53.field1230 = 3;
                class43.field924 = 0;
            }
            short var14 = 260;
            if (var1 == 1 && var14 - 75 <= var2 && var2 <= var14 + 75 && var13 - 20 <= var3 && var3 <= var13 + 20) {
                class43.field924 = 0;
                class21.field465 = class70.field1571;
                class53.field1230 = 2;
                class21.field475 = class21.field453;
            }
        } else if (class53.field1230 == 2) {
            byte var6 = 100;
            short var7 = 150;
            byte var8 = 60;
            int var15 = var8 + 30;
            if (var1 == 1 && var3 >= var15 - 15 && var15 > var3) {
                class43.field924 = 0;
            }
            var15 += 15;
            if (var1 == 1 && var15 - 15 <= var3 && var3 < var15) {
                class43.field924 = 1;
            }
            var15 += 15;
            if (var1 == 1 && var6 - 75 <= var2 && var2 <= var6 + 75 && var7 - 20 <= var3 && var3 <= var7 + 20) {
                class21.field459 = class21.field459.method211((byte) 71).method212((byte) 124);
                class25.method175(class21.field453, class25.field536, arg0 + 820);
                class74.method574(0, 20);
                return;
            }
            short var9 = 260;
            if (var1 == 1 && var2 >= var9 - 75 && var2 <= var9 + 75 && var7 - 20 <= var3 && var7 + 20 >= var3) {
                class53.field1230 = 0;
                class21.field477 = class21.field453;
                class21.field459 = class21.field453;
            }
            while (true) {
                boolean var10;
                label149: do {
                    while (class7.method40(4625)) {
                        var10 = false;
                        for (int var11 = 0; var11 < class75.field1653.method214(127); var11++) {
                            if (class78.field1820 == class75.field1653.method216(var11, (byte) 123)) {
                                var10 = true;
                                break;
                            }
                        }
                        if (class43.field924 != 0) {
                            continue label149;
                        }
                        if (class117.field2497 == 85 && class21.field459.method214(arg0 + 1062) > 0) {
                            class21.field459 = class21.field459.method228(class21.field459.method214(119) - 1, true, 0);
                        }
                        if (class117.field2497 == 84 || class117.field2497 == 80) {
                            class43.field924 = 1;
                        }
                        if (var10 && class21.field459.method214(-100) < 12) {
                            class21.field459 = class21.field459.method236(class78.field1820, 12);
                        }
                    }
                    return;
                } while (class43.field924 != 1);
                if (class117.field2497 == 85 && class21.field477.method214(arg0 + 1068) > 0) {
                    class21.field477 = class21.field477.method228(class21.field477.method214(-27) - 1, true, 0);
                }
                if (class117.field2497 == 84 || class117.field2497 == 80) {
                    class43.field924 = 0;
                }
                if (var10 && class21.field477.method214(123) < 20) {
                    class21.field477 = class21.field477.method236(class78.field1820, 122);
                }
            }
        } else if (class53.field1230 == 3) {
            short var4 = 180;
            short var5 = 150;
            if (var1 == 1 && var2 >= var4 - 75 && var4 + 75 >= var2 && var5 - 20 <= var3 && var5 + 20 >= var3) {
                class53.field1230 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)V")
    public static final void method517(int arg0, int arg1) {
        field1417++;
        if (!class37.method305(-1, arg1)) {
            return;
        }
        if (arg0 >= -41) {
            method515(59, -79, (byte) -70);
        }
        class78[] var2 = class18.field372[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class78 var4 = var2[var3];
            if (var4 != null) {
                var4.field1762 = 0;
                var4.field1786 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
    public static final void method518(int arg0) {
        if (arg0 != 75) {
            method513(true, null);
        }
        if (class40.field868 == 1) {
            if (class96.field2143 >= 6 && class96.field2143 <= 106 && class32.field680 >= 467 && class32.field680 <= 499) {
                class13.field240++;
                class95.field2092 = true;
                class51.field1196 = true;
                class16.field317 = (class16.field317 + 1) % 4;
                class5.field85.method161((byte) 113, 132);
                class5.field85.method888(class16.field317, arg0 ^ 0x37);
                class5.field85.method888(class126.field2735, 49);
                class5.field85.method888(class112.field2418, 114);
            }
            if (class96.field2143 >= 135 && class96.field2143 <= 235 && class32.field680 >= 467 && class32.field680 <= 499) {
                class126.field2735 = (class126.field2735 + 1) % 3;
                class13.field240++;
                class51.field1196 = true;
                class95.field2092 = true;
                class5.field85.method161((byte) 78, 132);
                class5.field85.method888(class16.field317, 76);
                class5.field85.method888(class126.field2735, arg0 + 11);
                class5.field85.method888(class112.field2418, -90);
            }
            if (class96.field2143 >= 273 && class96.field2143 <= 373 && class32.field680 >= 467 && class32.field680 <= 499) {
                class13.field240++;
                class51.field1196 = true;
                class112.field2418 = (class112.field2418 + 1) % 3;
                class95.field2092 = true;
                class5.field85.method161((byte) 123, 132);
                class5.field85.method888(class16.field317, 85);
                class5.field85.method888(class126.field2735, 63);
                class5.field85.method888(class112.field2418, 55);
            }
            if (class96.field2143 >= 412 && class96.field2143 <= 512 && class32.field680 >= 467 && class32.field680 <= 499) {
                if (class40.field860 == -1) {
                    class117.method836(29);
                    if (class63.field1393 != -1) {
                        class57.field1311 = class40.field860 = class63.field1393;
                        class125.field2719 = class125.field2721;
                        class88.field1957 = false;
                    }
                } else {
                    class87.method645(arg0 ^ 0x3F, class90.field1977, class125.field2721, 0);
                }
            }
        }
        field1421++;
    }
}
