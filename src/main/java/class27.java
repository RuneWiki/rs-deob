import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public abstract class class27 {

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Lec;")
    public static class28 field575 = class28.method210(-46, "*6nYou have not yet set any recovery questions)3*6nIt is @lre@strongly@yel@ recommended that you do so)3*6n*6nIf you don(Wt you will be @lre@unable to recover your*6n@lre@password@yel@ if you forget it)1 or it is stolen)3");

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "Lec;")
    public static class28 field581 = class28.method210(-46, "Loaded textures");

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "Z")
    public static boolean field577 = false;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "Lec;")
    public static class28 field579 = class28.method210(-46, "@yel@Classic");

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "Lec;")
    public static class28 field583 = class28.method210(-46, "Examine @cya@");

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "Lec;")
    public static class28 field570 = class28.method210(-46, "Drop @lre@");

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public static int field585 = 0;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "Lec;")
    public static class28 field584 = class28.method210(-46, "compass");

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "Lec;")
    public static class28 field589 = class28.method210(-46, "Checking for updates )2 ");

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "Lwc;")
    public static class128 field572;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "[I")
    public static int[] field573;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
    public abstract void method171(byte arg0);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public static void method194(int arg0) {
        field572 = null;
        field581 = null;
        field570 = null;
        int var1 = -49 / ((53 - arg0) / 57);
        field589 = null;
        field575 = null;
        field583 = null;
        field573 = null;
        field579 = null;
        field584 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V")
    public abstract void method170(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)V")
    public abstract void method178(byte arg0);

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
    public abstract void method177(int arg0);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BJ)V")
    public static final void method195(byte arg0, long arg1) {
        field571++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0 != -107) {
            field581 = null;
        }
        for (int var3 = 0; var3 < class69.field1546; var3++) {
            if (class5.field92[var3] == arg1) {
                client.field375++;
                class69.field1546--;
                class30.field646 = true;
                for (int var4 = var3; var4 < class69.field1546; var4++) {
                    class5.field92[var4] = class5.field92[var4 + 1];
                }
                class5.field85.method161((byte) 116, 168);
                class5.field85.method854(false, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)V")
    public static final void method196(byte arg0) {
        int var1 = 87 / ((35 - arg0) / 33);
        if (class49.field1133 != null) {
            class110 var2 = class49.field1133;
            synchronized (class49.field1133) {
                class49.field1133 = null;
            }
        }
        field586++;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILsa;IIB)V")
    public static final void method197(int arg0, class106 arg1, int arg2, int arg3, byte arg4) {
        field574++;
        if (class114.field2435 >= 400) {
            return;
        }
        if (arg1.field2245 != null) {
            arg1 = arg1.method736(false);
        }
        int var5 = -6 % ((arg4 + 48) / 61);
        if (arg1 == null || !arg1.field2244) {
            return;
        }
        class28 var6 = arg1.field2242;
        if (arg1.field2238 != 0) {
            var6 = class68.method537(1, new class28[] { var6, class42.method335(626, class37.field848.field927, arg1.field2238), client.field401, class5.method25(6366, arg1.field2238), class78.field1821 });
        }
        if (class76.field1691 == 1) {
            class124.field2693++;
            client.method124(-7765, class68.method537(1, new class28[] { class43.field918, class1.field6, class16.field314, var6 }), arg3, arg0, 40, arg2);
        } else if (class95.field2097 != 1) {
            class18.field341++;
            class28[] var7 = arg1.field2265;
            if (class20.field451) {
                var7 = class83.method632(false, var7);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && !var7[var8].method206(class72.field1598, true)) {
                        class14.field263++;
                        byte var9 = 0;
                        if (var8 == 0) {
                            var9 = 12;
                        }
                        if (var8 == 1) {
                            var9 = 55;
                        }
                        if (var8 == 2) {
                            var9 = 49;
                        }
                        if (var8 == 3) {
                            var9 = 37;
                        }
                        if (var8 == 4) {
                            var9 = 14;
                        }
                        client.method124(-7765, class68.method537(1, new class28[] { var7[var8], class65.field1460, var6 }), arg3, arg0, var9, arg2);
                    }
                }
            }
            if (var7 != null) {
                for (int var10 = 4; var10 >= 0; var10--) {
                    if (var7[var10] != null && var7[var10].method206(class72.field1598, true)) {
                        class61.field1366++;
                        int var11 = 0;
                        short var12 = 0;
                        if (class37.field848.field927 < arg1.field2238) {
                            var12 = 2000;
                        }
                        if (var10 == 0) {
                            var11 = var12 + 12;
                        }
                        if (var10 == 1) {
                            var11 = var12 + 55;
                        }
                        if (var10 == 2) {
                            var11 = var12 + 49;
                        }
                        if (var10 == 3) {
                            var11 = var12 + 37;
                        }
                        if (var10 == 4) {
                            var11 = var12 + 14;
                        }
                        client.method124(-7765, class68.method537(1, new class28[] { var7[var10], class65.field1460, var6 }), arg3, arg0, var11, arg2);
                    }
                }
            }
            client.method124(-7765, class68.method537(1, new class28[] { class92.field2027, var6 }), arg3, arg0, 1005, arg2);
        } else if ((class79.field1824 & 0x2) == 2) {
            client.method124(-7765, class68.method537(1, new class28[] { class37.field843, class65.field1460, var6 }), arg3, arg0, 19, arg2);
            class105.field2212++;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(III)Z")
    public static final boolean method198(int arg0, int arg1, int arg2) {
        field587++;
        if (arg2 == 0 && class17.field331 == arg0) {
            return true;
        }
        if (arg1 != 463) {
            field573 = null;
        }
        if (arg2 == 1 && class106.field2247 == arg0) {
            return true;
        } else {
            return (arg2 == 2 || arg2 == 3) && class69.field1550 == arg0;
        }
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
    public static final void method199(int arg0) {
        field578++;
        if (class117.field2492) {
            class117.field2492 = false;
            class110.method756(true, class117.field2493);
            class51.field1196 = true;
            class95.field2092 = true;
            class30.field646 = true;
            class112.field2422 = true;
        }
        class46.method372(-9951);
        if (class13.field243 && class75.field1671 == 1) {
            class30.field646 = true;
        }
        if (class57.field1307 != -1) {
            boolean var1 = class129.method985(true, class57.field1307);
            if (var1) {
                class30.field646 = true;
            }
        }
        if (class69.field1545 == 2) {
            class30.field646 = true;
        }
        if (class79.field1839 == 2) {
            class30.field646 = true;
        }
        if (class30.field646) {
            class30.field646 = false;
            class92.method671(true);
        }
        if (class110.field2325 == -1) {
            class55.field1259.field1742 = class69.field1551 - class21.field476 - 77;
            if (class23.field530 > 448 && class23.field530 < 560 && class88.field1960 > 332) {
                class16.method89(-1, class23.field530 - 17, 463, true, 0, class55.field1259, 77, class88.field1960 - 357, class69.field1551);
            }
            int var2 = class69.field1551 - class55.field1259.field1742 - 77;
            if (var2 < 0) {
                var2 = 0;
            }
            if (var2 > class69.field1551 - 77) {
                var2 = class69.field1551 - 77;
            }
            if (class21.field476 != var2) {
                class21.field476 = var2;
                class95.field2092 = true;
            }
        }
        if (class110.field2325 == -1 && class23.field515 == 3) {
            class55.field1259.field1742 = class64.field1427;
            int var3 = class21.field455 * 14 + 7;
            if (class23.field530 > 448 && class23.field530 < 560 && class88.field1960 > 332) {
                class16.method89(-1, class23.field530 - 17, 463, true, 0, class55.field1259, 77, class88.field1960 - 357, var3);
            }
            int var4 = class55.field1259.field1742;
            if (var4 < 0) {
                var4 = 0;
            }
            if (var4 > var3 - 77) {
                var4 = var3 - 77;
            }
            if (class64.field1427 != var4) {
                class64.field1427 = var4;
                class95.field2092 = true;
            }
        }
        if (class110.field2325 != -1) {
            boolean var5 = class129.method985(true, class110.field2325);
            if (var5) {
                class95.field2092 = true;
            }
        }
        if (class69.field1545 == 3) {
            class95.field2092 = true;
        }
        if (class79.field1839 == 3) {
            class95.field2092 = true;
        }
        if (class64.field1416 != null) {
            class95.field2092 = true;
        }
        if (class13.field243 && class75.field1671 == 2) {
            class95.field2092 = true;
        }
        if (class95.field2092) {
            class95.field2092 = false;
            class12.method65(64);
        }
        class95.method681((byte) 31);
        int var6 = -49 % ((-arg0 - 49) / 53);
        if (class51.field1181 != -1) {
            class112.field2422 = true;
        }
        if (class112.field2422) {
            if (class51.field1181 != -1 && class7.field120 == class51.field1181) {
                class37.field846++;
                class51.field1181 = -1;
                class5.field85.method161((byte) 78, 145);
                class5.field85.method888(class7.field120, -125);
            }
            class112.field2422 = false;
            class78.field1817 = true;
            class50.method405(class117.field2493, 2, class7.field120, class83.field1888 % 20 >= 10 ? class51.field1181 : -1, class57.field1307 == -1, class127.field2743);
        }
        if (class51.field1196) {
            class78.field1817 = true;
            class51.field1196 = false;
            class103.method723(class16.field317, class112.field2418, class117.field2493, -17962, class126.field2735, class124.field2697);
        }
        class12.field197 = 0;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLec;)Z")
    public static final boolean method200(byte arg0, class28 arg1) {
        field580++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class36.field829; var2++) {
            if (arg1.method206(class93.field2048[var2], true)) {
                return true;
            }
        }
        if (arg1.method206(class37.field848.field919, true)) {
            return true;
        } else {
            if (arg0 != 25) {
                method199(-23);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZ[BZ)V")
    public abstract void method180(int arg0, boolean arg1, byte[] arg2, boolean arg3);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lvb;Lvb;Lvb;I)V")
    public static final void method201(class122 arg0, class122 arg1, class122 arg2, int arg3) {
        class91.field2000 = arg0;
        class17.field321 = arg1;
        field582++;
        class92.field2028 = arg2;
        if (arg3 != 25153) {
            method198(94, -90, -118);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/awt/Graphics;Lj;Lj;B)V")
    public static final void method202(Graphics arg0, class54 arg1, class54 arg2, byte arg3) {
        class90.field1983.method92((byte) -4);
        if (class114.field2444 == 0 || class114.field2444 == 5) {
            byte var4 = 20;
            arg1.method435(class93.field2042, 180, 74 - var4, 16777215);
            int var5 = 82 - var4;
            class120.method911(28, var5, 304, 34, 9179409);
            class120.method911(29, var5 + 1, 302, 32, 0);
            class120.method915(30, var5 + 2, class68.field1530 * 3, 30, 9179409);
            class120.method915(class68.field1530 * 3 + 30, var5 + 2, 300 - class68.field1530 * 3, 30, 0);
            arg1.method435(class93.field2055, 180, 105 - var4, 16777215);
            class90.field1983.method91(202, arg0, 11675, 171);
        }
        field588++;
        if (class114.field2444 == 20) {
            class68.field1528.method977(0, 0);
            byte var6 = 60;
            int var18;
            if (class21.field475.method214(127) > 0) {
                arg1.method433(class21.field475, 180, var6 - 15, 16776960, true);
                arg1.method433(class21.field465, 180, var6, 16776960, true);
                var18 = var6 + 30;
            } else {
                arg1.method433(class21.field465, 180, var6 - 7, 16776960, true);
                var18 = var6 + 30;
            }
            arg1.method441(class68.method537(1, new class28[] { class98.field2169, class21.field459 }), 90, var18, 16777215, true);
            var18 += 15;
            arg1.method441(class68.method537(arg3 + 31, new class28[] { class61.field1375, class21.field477.method223(0) }), 92, var18, 16777215, true);
            var18 += 15;
        }
        if (arg3 != -30) {
            method202(null, null, null, (byte) 49);
        }
        if (class114.field2444 == 10) {
            class68.field1528.method977(0, 0);
            if (class53.field1230 == 0) {
                byte var14 = 80;
                arg1.method433(class70.field1562, 180, var14, 16776960, true);
                byte var15 = 120;
                int var24 = var14 + 30;
                byte var16 = 100;
                class49.field1146.method977(var16 - 73, var15 - 20);
                arg1.method433(class68.field1532, var16, var15 + 5, 16777215, true);
                short var17 = 260;
                class49.field1146.method977(var17 - 73, var15 + -20);
                arg1.method433(class90.field1974, var17, var15 + 5, 16777215, true);
            } else if (class53.field1230 == 2) {
                byte var10 = 60;
                int var23;
                if (class21.field475.method214(-22) <= 0) {
                    arg1.method433(class21.field465, 180, var10 - 7, 16776960, true);
                    var23 = var10 + 30;
                } else {
                    arg1.method433(class21.field475, 180, var10 - 15, 16776960, true);
                    arg1.method433(class21.field465, 180, var10, 16776960, true);
                    var23 = var10 + 30;
                }
                arg1.method441(class68.method537(1, new class28[] { class98.field2169, class21.field459, class43.field924 == 0 & class83.field1888 % 40 < 20 ? class61.field1351 : class21.field453 }), 90, var23, 16777215, true);
                var23 += 15;
                short var11 = 150;
                arg1.method441(class68.method537(1, new class28[] { class61.field1375, class21.field477.method223(0), class43.field924 == 1 & class83.field1888 % 40 < 20 ? class61.field1351 : class21.field453 }), 92, var23, 16777215, true);
                var23 += 15;
                byte var12 = 100;
                class49.field1146.method977(var12 - 73, var11 - 20);
                arg1.method433(class53.field1229, var12, var11 + 5, 16777215, true);
                short var13 = 260;
                class49.field1146.method977(var13 - 73, var11 + -20);
                arg1.method433(class69.field1554, var13, var11 + 5, 16777215, true);
            } else if (class53.field1230 == 3) {
                arg1.method433(class8.field140, 180, 40, 16776960, true);
                byte var7 = 65;
                arg1.method433(class110.field2312, 180, var7, 16777215, true);
                int var19 = var7 + 15;
                arg1.method433(class30.field649, 180, var19, 16777215, true);
                int var20 = var19 + 15;
                arg1.method433(class30.field653, 180, var20, 16777215, true);
                int var21 = var20 + 15;
                arg1.method433(class69.field1549, 180, var21, 16777215, true);
                int var22 = var21 + 15;
                short var8 = 150;
                short var9 = 180;
                class49.field1146.method977(var9 - 73, var8 + -20);
                arg1.method433(class69.field1554, var9, var8 + 5, 16777215, true);
            }
        }
        class90.field1983.method91(202, arg0, 11675, 171);
        class3.method20(arg3 ^ 0x1D);
        class61.field1367.method91(0, arg0, 11675, 0);
        class86.field1910.method91(637, arg0, 11675, 0);
        if (!class117.field2492) {
            return;
        }
        class117.field2492 = false;
        class74.field1633.method91(128, arg0, 11675, 0);
        class31.field658.method91(202, arg0, 11675, 371);
        class74.field1645.method91(0, arg0, 11675, 265);
        class12.field194.method91(562, arg0, 11675, 265);
        class14.field257.method91(128, arg0, 11675, 171);
        class110.field2324.method91(562, arg0, 11675, 171);
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)V")
    public abstract void method174(byte arg0);
}
