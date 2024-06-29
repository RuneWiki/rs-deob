import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class40 {

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field547 = 0;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static volatile int field549 = 0;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field542 = 0;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "Z")
    public static boolean field550 = true;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "Laf;")
    public static class68 field545;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "[[B")
    public static byte[][] field551;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public static final void method313(int arg0) {
        field543++;
        if (class111.field1680 == 5) {
            if (arg0 > -22) {
                method313(-41);
            }
            class111.field1680 = 6;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)V")
    public static final void method314(int arg0, int arg1, int arg2) {
        if (class262.field4231 > 0) {
            class198.method1370(class262.field4231, 0);
            class262.field4231 = 0;
        }
        field541++;
        int var3 = 0;
        short var4 = 256;
        int var5 = class127.field1873 * arg1;
        int var6 = 0;
        if (arg2 != 18) {
            field550 = true;
        }
        for (int var7 = 1; var7 < (var4 - 1); var7++) {
            int var8 = (var4 - var7) * class8.field122[var7] / var4;
            if (var8 < 0) {
                var8 = 0;
            }
            var3 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class229.field3711[var3++];
                int var12 = class127.field1875[var5++ + arg0];
                if (var11 == 0) {
                    class22.field264.field152[var6++] = var12;
                } else {
                    int var13 = var11 + 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = 256 - (var11 + 18);
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    int var15 = class162.field2522[var11];
                    class22.field264.field152[var6++] = class224.method1526(16711680, var13 * class224.method1526(var15, 65280) + class224.method1526(var12, 65280) * var14) + class224.method1526(-16711936, class224.method1526(16711935, var12) * var14 + class224.method1526(16711935, var15) * var13) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class22.field264.field152[var6++] = class127.field1875[var5++ + arg0];
            }
            var5 += class127.field1873 - 128;
        }
        class22.field264.method69(arg0, arg1);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lhi;III)V")
    public static final void method315(class219 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class158.field2433) {
            class49 var4 = class90.field1382[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field635 != null && var4.field635.field203.method1089()) {
                arg0.method1080(var4.field635.field203, 128, 0, 0, true);
            }
        }
        if (arg3 < class158.field2433) {
            class49 var5 = class90.field1382[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field635 != null && var5.field635.field203.method1089()) {
                arg0.method1080(var5.field635.field203, 0, 0, 128, true);
            }
        }
        if (arg2 < class158.field2433 && arg3 < class54.field749) {
            class49 var6 = class90.field1382[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field635 != null && var6.field635.field203.method1089()) {
                arg0.method1080(var6.field635.field203, 128, 0, 128, true);
            }
        }
        if (arg2 < class158.field2433 && arg3 > 0) {
            class49 var7 = class90.field1382[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field635 != null && var7.field635.field203.method1089()) {
                arg0.method1080(var7.field635.field203, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V")
    public static void method316(int arg0) {
        field545 = null;
        if (arg0 > 74) {
            field551 = null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
    public static final void method317(byte arg0) {
        if (arg0 != -60) {
            method314(62, 3, 54);
        }
        field544++;
        int var1 = class41.field556 + class149.field2227.field1226;
        int var2 = class149.field2227.field1273 + class194.field3049;
        if (class250.field4000 - var1 < -500 || class250.field4000 - var1 > 500 || class269.field4288 - var2 < -500 || (class269.field4288 - var2) > 500) {
            class269.field4288 = var2;
            class250.field4000 = var1;
        }
        if (class250.field4000 != var1) {
            class250.field4000 += (var1 - class250.field4000) / 16;
        }
        if (class269.field4288 != var2) {
            class269.field4288 += (var2 - class269.field4288) / 16;
        }
        if (class264.field4251) {
            for (int var3 = 0; var3 < class52.field724; var3++) {
                int var4 = class278.field4412[var3];
                if (var4 == 98) {
                    class39.field530 = class39.field530 + 47 & 0xFFFFFFF0;
                } else if (var4 == 99) {
                    class39.field530 = class39.field530 - 17 & 0xFFFFFFF0;
                } else if (var4 == 96) {
                    class29.field392 = class29.field392 - 65 & 0xFFFFFF80;
                } else if (var4 == 97) {
                    class29.field392 = class29.field392 + 191 & 0xFFFFFF80;
                }
            }
        } else {
            if (class123.field1844[96]) {
                class154.field2294 += (-class154.field2294 - 24) / 2;
            } else if (class123.field1844[97]) {
                class154.field2294 += (24 - class154.field2294) / 2;
            } else {
                class154.field2294 /= 2;
            }
            if (class123.field1844[98]) {
                class209.field3259 += (12 - class209.field3259) / 2;
            } else if (class123.field1844[99]) {
                class209.field3259 += (-class209.field3259 - 12) / 2;
            } else {
                class209.field3259 /= 2;
            }
            class39.field530 += class209.field3259 / 2;
            class29.field392 += class154.field2294 / 2;
        }
        class236.method1599((byte) -37);
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)V")
    public static final void method318(byte arg0) {
        class23.field290.method1430(-1);
        class286.field4537.method1430(-1);
        field548++;
        if (arg0 < 26) {
            method318((byte) -53);
        }
        class182.field2886.method1430(-1);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(JB)V")
    public static final void method319(long arg0, byte arg1) {
        field552++;
        if (arg1 != 53 || arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class228.field3692; var3++) {
            if (class143.field2101[var3] == arg0) {
                class228.field3692--;
                class286.field4532++;
                for (int var4 = var3; var4 < class228.field3692; var4++) {
                    class94.field1464[var4] = class94.field1464[var4 + 1];
                    class143.field2096[var4] = class143.field2096[var4 + 1];
                    class190.field3013[var4] = class190.field3013[var4 + 1];
                    class143.field2101[var4] = class143.field2101[var4 + 1];
                    class7.field104[var4] = class7.field104[var4 + 1];
                    class229.field3710[var4] = class229.field3710[var4 + 1];
                }
                class111.field1681 = class141.field2067;
                class13.field165.method892(44, (byte) -111);
                class13.field165.method206(-5061, arg0);
                return;
            }
        }
    }
}
