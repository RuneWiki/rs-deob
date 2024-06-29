import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class26 extends class176 {

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "I")
    public int field482 = 5;

    @OriginalMember(owner = "client!ce", name = "M", descriptor = "I")
    public int field486 = -1;

    @OriginalMember(owner = "client!ce", name = "V", descriptor = "I")
    public int field495 = -1;

    @OriginalMember(owner = "client!ce", name = "cb", descriptor = "Z")
    public boolean field502 = false;

    @OriginalMember(owner = "client!ce", name = "U", descriptor = "I")
    public int field494 = -1;

    @OriginalMember(owner = "client!ce", name = "eb", descriptor = "I")
    public int field504 = 99;

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "I")
    public int field493 = 2;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "I")
    public int field484 = -1;

    @OriginalMember(owner = "client!ce", name = "Y", descriptor = "I")
    public int field498 = -1;

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "I")
    public static int field481 = 0;

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "[[S")
    public static short[][] field491 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "Lob;")
    public static class141 field479 = class175.method1195(40, "<col=80ff00>");

    @OriginalMember(owner = "client!ce", name = "bb", descriptor = "Lob;")
    public static class141 field501 = class175.method1195(40, "");

    @OriginalMember(owner = "client!ce", name = "hb", descriptor = "I")
    public static int field507 = 0;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!ce", name = "L", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!ce", name = "X", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!ce", name = "ab", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!ce", name = "db", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!ce", name = "fb", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "[I")
    private int[] field489;

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "[I")
    public int[] field492;

    @OriginalMember(owner = "client!ce", name = "W", descriptor = "[I")
    public int[] field496;

    @OriginalMember(owner = "client!ce", name = "Z", descriptor = "[I")
    public int[] field499;

    @OriginalMember(owner = "client!ce", name = "gb", descriptor = "[I")
    private int[] field506;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILog;)V")
    public final void method179(int arg0, class146 arg1) {
        if (arg0 != 0) {
            this.field502 = true;
        }
        while (true) {
            int var3 = arg1.method991(255);
            if (var3 == 0) {
                field497++;
                return;
            }
            this.method187(arg1, var3, -68);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lra;I)I")
    public static final int method180(class170 arg0, int arg1) {
        if (arg1 != 18125) {
            field507 = -99;
        }
        field485++;
        class110 var2 = (class110) class195.field3729.method792(((long) arg0.field3396 << 32) + (long) arg0.field3357, 22346);
        return var2 == null ? arg0.field3283 : var2.field2114;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IBILfe;)Lfe;")
    public final class56 method181(int arg0, byte arg1, int arg2, class56 arg3) {
        field503++;
        int var5 = this.field499[arg2];
        class78 var6 = class152.method1051(0, var5 >> 16);
        int var7 = 107 / ((arg1 + 77) / 44);
        int var8 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg3.method377(true);
        }
        int var9 = arg0 & 0x3;
        class56 var10 = arg3.method377(!var6.method539(-30419, var8));
        if (var9 == 1) {
            var10.method374();
        } else if (var9 == 2) {
            var10.method382();
        } else if (var9 == 3) {
            var10.method379();
        }
        var10.method375(var6, var8);
        if (var9 == 1) {
            var10.method379();
        } else if (var9 == 2) {
            var10.method382();
        } else if (var9 == 3) {
            var10.method374();
        }
        return var10;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(II)I")
    public static final int method182(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "(I)V")
    public final void method183(int arg0) {
        if (this.field495 == -1) {
            if (this.field506 == null) {
                this.field495 = 0;
            } else {
                this.field495 = 2;
            }
        }
        field505++;
        if (this.field498 == -1) {
            if (this.field506 == null) {
                this.field498 = 0;
            } else {
                this.field498 = 2;
            }
        }
        if (arg0 <= 94) {
            this.method183(-91);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILi;Li;)V")
    public static final void method184(int arg0, class80 arg1, class80 arg2) {
        field490++;
        int var3 = -44 % ((38 - arg0) / 42);
        if (class57.field1115 == null) {
            class57.field1115 = class85.method581(class54.field1039, 36, 0, class109.field2108);
        }
        if (class83.field1662 == null) {
            class83.field1662 = class150.method1043(class142.field2754, class109.field2108, 0, 865);
        }
        if (class47.field897 == null) {
            class47.field897 = class150.method1043(class218.field4138, class109.field2108, 0, 865);
        }
        if (class92.field1838 == null) {
            class92.field1838 = class150.method1043(class128.field2444, class109.field2108, 0, 865);
        }
        class148.method1030(0, 23, 765, 480, 0);
        class148.method1035(0, 0, 125, 23, 12425273, 9135624);
        class148.method1035(125, 0, 640, 23, 5197647, 2697513);
        arg2.method873(class76.field1558, 62, 15, 0, -1);
        if (class92.field1838 != null) {
            class92.field1838[1].method349(140, 1);
            arg1.method866(class79.field1589, 152, 10, 16777215, -1);
            class92.field1838[0].method349(140, 12);
            arg1.method866(class162.field3147, 152, 21, 16777215, -1);
        }
        if (class47.field897 != null) {
            short var4 = 280;
            short var5 = 390;
            short var6 = 610;
            if (class47.field903[0] == 0 && class24.field450[0] == 0) {
                class47.field897[2].method349(var4, 4);
            } else {
                class47.field897[0].method349(var4, 4);
            }
            if (class47.field903[0] == 0 && class24.field450[0] == 1) {
                class47.field897[3].method349(var4 + 15, 4);
            } else {
                class47.field897[1].method349(var4 + 15, 4);
            }
            arg2.method866(class60.field1180, var4 + 32, 17, 16777215, -1);
            short var7 = 500;
            if (class47.field903[0] == 1 && class24.field450[0] == 0) {
                class47.field897[2].method349(var5, 4);
            } else {
                class47.field897[0].method349(var5, 4);
            }
            if (class47.field903[0] == 1 && class24.field450[0] == 1) {
                class47.field897[3].method349(var5 + 15, 4);
            } else {
                class47.field897[1].method349(var5 + 15, 4);
            }
            arg2.method866(class223.field4209, var5 + 32, 17, 16777215, -1);
            if (class47.field903[0] == 2 && class24.field450[0] == 0) {
                class47.field897[2].method349(var7, 4);
            } else {
                class47.field897[0].method349(var7, 4);
            }
            if (class47.field903[0] == 2 && class24.field450[0] == 1) {
                class47.field897[3].method349(var7 + 15, 4);
            } else {
                class47.field897[1].method349(var7 + 15, 4);
            }
            arg2.method866(class184.field3586, var7 + 32, 17, 16777215, -1);
            if (class47.field903[0] == 3 && class24.field450[0] == 0) {
                class47.field897[2].method349(var6, 4);
            } else {
                class47.field897[0].method349(var6, 4);
            }
            if (class47.field903[0] == 3 && class24.field450[0] == 1) {
                class47.field897[3].method349(var6 + 15, 4);
            } else {
                class47.field897[1].method349(var6 + 15, 4);
            }
            arg2.method866(class126.field2420, var6 + 32, 17, 16777215, -1);
        }
        class148.method1030(708, 4, 50, 16, 0);
        arg1.method873(class42.field819, 733, 16, 16777215, -1);
        class132.field2520 = -1;
        if (class57.field1115 == null) {
            return;
        }
        byte var8 = 88;
        byte var9 = 19;
        int var10 = 765 / (var8 + 1);
        int var11 = 480 / (var9 + 1);
        int var12;
        int var13;
        do {
            var12 = var11;
            var13 = var10;
            if ((var10 - 1) * var11 >= class35.field707) {
                var10--;
            }
            if (class35.field707 <= (var11 - 1) * var10) {
                var11--;
            }
            if ((var11 - 1) * var10 >= class35.field707) {
                var11--;
            }
        } while (var11 != var12 || var10 != var13);
        int var14 = (765 - var8 * var10) / (var10 + 1);
        if (var14 > 5) {
            var14 = 5;
        }
        int var15 = (765 - (var10 - 1) * var14 - var8 * var10) / 2;
        int var16 = (480 - var9 * var11) / (var11 - -1);
        if (var16 > 5) {
            var16 = 5;
        }
        int var17 = (480 - (var11 - 1) * var16 - var9 * var11) / 2;
        int var18 = var15;
        int var19 = var17 + 23;
        int var20 = 0;
        for (int var21 = 0; var21 < class35.field707; var21++) {
            boolean var22 = true;
            class25 var23 = class42.field827[var21];
            class141 var24 = class78.method543((byte) 93, var23.field469);
            if (var23.field469 == -1) {
                var22 = false;
                var24 = client.field601;
            } else if (var23.field469 > 1980) {
                var24 = class161.field3129;
                var22 = false;
            }
            if (class146.field2794 >= var18 && class174.field3452 >= var19 && class146.field2794 < var18 + var8 && class174.field3452 < var9 + var19 && var22) {
                class132.field2520 = var21;
                class57.field1115[var23.field468 ? 1 : 0].method682(var18, var19, 128, 16777215);
            } else {
                class57.field1115[var23.field468 ? 1 : 0].method681(var18, var19);
            }
            if (class83.field1662 != null) {
                class83.field1662[var23.field473 + (var23.field468 ? 8 : 0)].method349(var18 + 29, var19);
            }
            arg2.method873(class78.method543((byte) 93, var23.field475), var18 + 15, var9 / 2 + var19 + 5, 0, -1);
            arg1.method873(var24, var18 + 60, var19 - -(var9 / 2) + 5, 268435455, -1);
            var19 += var9 + var16;
            var20++;
            if (var20 >= var11) {
                var19 = var17 + 23;
                var18 += var8 + var14;
                var20 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "(I)V")
    public static void method185(int arg0) {
        field491 = null;
        field501 = null;
        field479 = null;
        if (arg0 <= 33) {
            method184(63, null, null);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lfe;BI)Lfe;")
    public final class56 method186(class56 arg0, byte arg1, int arg2) {
        if (arg1 != -121) {
            return null;
        }
        int var4 = this.field499[arg2];
        field480++;
        class78 var5 = class152.method1051(0, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method381(true);
        } else {
            class56 var7 = arg0.method381(!var5.method539(-30419, var6));
            var7.method375(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Log;II)V")
    private final void method187(class146 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            int var11 = arg0.method1007(105);
            this.field496 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field496[var12] = arg0.method1007(88);
            }
            this.field499 = new int[var11];
            for (int var13 = 0; var13 < var11; var13++) {
                this.field499[var13] = arg0.method1007(66);
            }
            for (int var14 = 0; var14 < var11; var14++) {
                this.field499[var14] = (arg0.method1007(77) << 16) + this.field499[var14];
            }
        } else if (arg1 == 2) {
            this.field494 = arg0.method1007(112);
        } else if (arg1 == 3) {
            int var4 = arg0.method991(255);
            this.field506 = new int[var4 + 1];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field506[var5] = arg0.method991(255);
            }
            this.field506[var4] = 9999999;
        } else if (arg1 == 4) {
            this.field502 = true;
        } else if (arg1 == 5) {
            this.field482 = arg0.method991(255);
        } else if (arg1 == 6) {
            this.field484 = arg0.method1007(118);
        } else if (arg1 == 7) {
            this.field486 = arg0.method1007(84);
        } else if (arg1 == 8) {
            this.field504 = arg0.method991(255);
        } else if (arg1 == 9) {
            this.field495 = arg0.method991(255);
        } else if (arg1 == 10) {
            this.field498 = arg0.method991(255);
        } else if (arg1 == 11) {
            this.field493 = arg0.method991(255);
        } else if (arg1 == 12) {
            int var8 = arg0.method991(255);
            this.field489 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field489[var9] = arg0.method1007(123);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field489[var10] += arg0.method1007(74) << 16;
            }
        } else if (arg1 == 13) {
            int var6 = arg0.method991(255);
            this.field492 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field492[var7] = arg0.method1012(71);
            }
        }
        int var15 = 30 % ((21 - arg2) / 40);
        field483++;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lfe;II)Lfe;")
    public final class56 method188(class56 arg0, int arg1, int arg2) {
        int var4 = this.field499[arg1];
        field500++;
        class78 var5 = class152.method1051(0, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        int var7 = 49 / ((-arg2 - 62) / 52);
        if (var5 == null) {
            return arg0.method377(true);
        } else {
            class56 var8 = arg0.method377(!var5.method539(-30419, var6));
            var8.method375(var5, var6);
            return var8;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lfe;IZ)Lfe;")
    public final class56 method189(class56 arg0, int arg1, boolean arg2) {
        field488++;
        int var4 = this.field499[arg1];
        class78 var5 = class152.method1051(0, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method377(true);
        }
        class78 var7 = null;
        int var8 = 0;
        if (this.field489 != null && this.field489.length > arg1) {
            int var9 = this.field489[arg1];
            var7 = class152.method1051(0, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (!arg2) {
            method185(31);
        }
        if (var7 == null || var8 == 65535) {
            class56 var11 = arg0.method377(!var5.method539(-30419, var6));
            var11.method375(var5, var6);
            return var11;
        } else {
            class56 var10 = arg0.method377(!var5.method539(-30419, var6) & !var7.method539(-30419, var8));
            var10.method375(var5, var6);
            var10.method375(var7, var8);
            return var10;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lfe;ILce;II)Lfe;")
    public final class56 method190(class56 arg0, int arg1, class26 arg2, int arg3, int arg4) {
        int var6 = this.field499[arg4];
        field487++;
        class78 var7 = class152.method1051(arg1 + 18112, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg2.method188(arg0, arg3, -118);
        }
        int var9 = arg2.field499[arg3];
        class78 var10 = class152.method1051(0, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (arg1 != -18112) {
            this.field493 = -20;
        }
        if (var10 == null) {
            class56 var12 = arg0.method377(!var7.method539(arg1 - 12307, var8));
            var12.method375(var7, var8);
            return var12;
        } else {
            class56 var13 = arg0.method377(!var7.method539(arg1 - 12307, var8) & !var10.method539(-30419, var11));
            var13.method385(var7, var8, var10, var11, this.field506);
            return var13;
        }
    }
}
