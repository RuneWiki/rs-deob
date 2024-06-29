import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class192 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Llc;")
    public static class143 field3522 = class66.method374("(Y<)4col>", -1);

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field3520 = 0;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "Llc;")
    public static class143 field3528 = class66.method374("Texturen geladen)3", -1);

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public static volatile int field3533 = 0;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field3525 = 0;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "Llc;")
    public static class143 field3537 = class66.method374("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", -1);

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "Z")
    public static boolean field3538 = false;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public static int field3540 = -1;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public static int field3539 = -1;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "Llc;")
    public static class143 field3523 = class66.method374("Examiner", -1);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "[S")
    public static short[] field3534;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "[[[I")
    public static int[][][] field3535;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZIZIIIIIIII)Z")
    public static final boolean method1298(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class14.field263[var12][var31] = 0;
                class268.field4808[var12][var31] = 99999999;
            }
        }
        class14.field263[arg8][arg6] = 99;
        class268.field4808[arg8][arg6] = 0;
        field3532++;
        int var13 = arg8;
        int var14 = arg6;
        byte var15 = 0;
        class221.field4000[var15] = arg8;
        int var32 = var15 + 1;
        class1.field28[var15] = arg6;
        int[][] var16 = class171.field3052[class170.field3044].field1868;
        int var17 = 0;
        boolean var18 = arg3;
        while (var32 != var17) {
            var13 = class221.field4000[var17];
            var14 = class1.field28[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg2 == var13 && arg9 == var14) {
                var18 = true;
                break;
            }
            if (arg4 != 0) {
                if ((arg4 < 5 || arg4 == 10) && class171.field3052[class170.field3044].method646(arg9, arg2, arg4 - 1, 0, arg11, 2, var13, var14)) {
                    var18 = true;
                    break;
                }
                if (arg4 < 10 && class171.field3052[class170.field3044].method631(arg9, -1, arg2, var14, arg11, arg4 - 1, var13, 2)) {
                    var18 = true;
                    break;
                }
            }
            if (arg5 != 0 && arg0 != 0 && class171.field3052[class170.field3044].method638((byte) 64, var13, arg10, arg5, arg0, var14, 2, arg2, arg9)) {
                var18 = true;
                break;
            }
            int var30 = class268.field4808[var13][var14] + 1;
            if (var13 > 0 && class14.field263[var13 - 1][var14] == 0 && (var16[var13 - 1][var14] & 0x12C010E) == 0 && (var16[var13 - 1][var14 + 1] & 0x12C0138) == 0) {
                class221.field4000[var32] = var13 - 1;
                class1.field28[var32] = var14;
                class14.field263[var13 - 1][var14] = 2;
                class268.field4808[var13 - 1][var14] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 102 && class14.field263[var13 + 1][var14] == 0 && (var16[var13 + 2][var14] & 0x12C0183) == 0 && (var16[var13 + 2][var14 + 1] & 0x12C01E0) == 0) {
                class221.field4000[var32] = var13 + 1;
                class1.field28[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class14.field263[var13 + 1][var14] = 8;
                class268.field4808[var13 + 1][var14] = var30;
            }
            if (var14 > 0 && class14.field263[var13][var14 - 1] == 0 && (var16[var13][var14 - 1] & 0x12C010E) == 0 && (var16[var13 + 1][var14 - 1] & 0x12C0183) == 0) {
                class221.field4000[var32] = var13;
                class1.field28[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class14.field263[var13][var14 - 1] = 1;
                class268.field4808[var13][var14 - 1] = var30;
            }
            if (var14 < 102 && class14.field263[var13][var14 + 1] == 0 && (var16[var13][var14 + 2] & 0x12C0138) == 0 && (var16[var13 + 1][var14 + 2] & 0x12C01E0) == 0) {
                class221.field4000[var32] = var13;
                class1.field28[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class14.field263[var13][var14 + 1] = 4;
                class268.field4808[var13][var14 + 1] = var30;
            }
            if (var13 > 0 && var14 > 0 && class14.field263[var13 - 1][var14 - 1] == 0 && (var16[var13 - 1][var14] & 0x12C0138) == 0 && (var16[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var16[var13][var14 - 1] & 0x12C0183) == 0) {
                class221.field4000[var32] = var13 - 1;
                class1.field28[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class14.field263[var13 - 1][var14 - 1] = 3;
                class268.field4808[var13 - 1][var14 - 1] = var30;
            }
            if (var13 < 102 && var14 > 0 && class14.field263[var13 + 1][var14 - 1] == 0 && (var16[var13 + 1][var14 - 1] & 0x12C010E) == 0 && (var16[var13 + 2][var14 - 1] & 0x12C0183) == 0 && (var16[var13 + 2][var14] & 0x12C01E0) == 0) {
                class221.field4000[var32] = var13 + 1;
                class1.field28[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class14.field263[var13 + 1][var14 - 1] = 9;
                class268.field4808[var13 + 1][var14 - 1] = var30;
            }
            if (var13 > 0 && var14 < 102 && class14.field263[var13 - 1][var14 + 1] == 0 && (var16[var13 - 1][var14 + 1] & 0x12C010E) == 0 && (var16[var13 - 1][var14 + 2] & 0x12C0138) == 0 && (var16[var13][var14 + 2] & 0x12C01E0) == 0) {
                class221.field4000[var32] = var13 - 1;
                class1.field28[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class14.field263[var13 - 1][var14 + 1] = 6;
                class268.field4808[var13 - 1][var14 + 1] = var30;
            }
            if (var13 < 102 && var14 < 102 && class14.field263[var13 + 1][var14 + 1] == 0 && (var16[var13 + 1][var14 + 2] & 0x12C0138) == 0 && (var16[var13 + 2][var14 + 2] & 0x12C01E0) == 0 && (var16[var13 + 2][var14 + 1] & 0x12C0183) == 0) {
                class221.field4000[var32] = var13 + 1;
                class1.field28[var32] = var14 + 1;
                class14.field263[var13 + 1][var14 + 1] = 12;
                var32 = var32 + 1 & 0xFFF;
                class268.field4808[var13 + 1][var14 + 1] = var30;
            }
        }
        class15.field267 = 0;
        if (!var18) {
            if (!arg1) {
                return false;
            }
            int var19 = 100;
            int var20 = 1000;
            byte var21 = 10;
            for (int var22 = arg2 - var21; var22 <= arg2 + var21; var22++) {
                for (int var23 = arg9 - var21; var23 <= (arg9 + var21); var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class268.field4808[var22][var23] < 100) {
                        int var24 = 0;
                        if (var22 < arg2) {
                            var24 = arg2 - var22;
                        } else if ((arg5 + arg2 - 1) < var22) {
                            var24 = 1 - arg5 - (arg2 - var22);
                        }
                        int var25 = 0;
                        if (arg9 > var23) {
                            var25 = arg9 - var23;
                        } else if (var23 > (arg9 + arg0 - 1)) {
                            var25 = -arg0 - (arg9 - (var23 + 1));
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var26 < var20 || var20 == var26 && class268.field4808[var22][var23] < var19) {
                            var13 = var22;
                            var20 = var26;
                            var19 = class268.field4808[var22][var23];
                            var14 = var23;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg8 == var13 && arg6 == var14) {
                return false;
            }
            class15.field267 = 1;
        }
        byte var27 = 0;
        class221.field4000[var27] = var13;
        int var33 = var27 + 1;
        class1.field28[var27] = var14;
        int var28;
        int var29 = var28 = class14.field263[var13][var14];
        while (arg8 != var13 || arg6 != var14) {
            if (var28 != var29) {
                class221.field4000[var33] = var13;
                class1.field28[var33++] = var14;
                var28 = var29;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            if ((var29 & 0x1) != 0) {
                var14++;
            } else if ((var29 & 0x4) != 0) {
                var14--;
            }
            var29 = class14.field263[var13][var14];
        }
        if (var33 > 0) {
            class13.method107(var33, 0, arg7);
            return true;
        } else if (arg7 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static final void method1299(int arg0) {
        if (arg0 != -1) {
            method1301(7);
        }
        field3531++;
        int[] var1 = new int[class112.field1967];
        int var2 = 0;
        for (int var3 = 0; var3 < class112.field1967; var3++) {
            class148 var5 = class262.method1743(var3, 17366);
            if (var5.field2734 >= 0 || var5.field2731 >= 0) {
                var1[var2++] = var3;
            }
        }
        class239.field4316 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class239.field4316[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!tb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class229.field4189 != null) {
            class134.field2353 = -1;
        }
        field3526++;
    }

    @OriginalMember(owner = "client!tb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field3519++;
        if (class229.field4189 != null) {
            int var2 = class16.method119(12959, arg0);
            if (var2 >= 0) {
                int var3 = class255.field4578 + 1 & 0x7F;
                if (class31.field493 != var3) {
                    class91.field1637[class255.field4578] = -1;
                    class113.field1979[class255.field4578] = var2;
                    class255.field4578 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!tb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class229.field4189 != null) {
            class33.field558 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class21.field334.length) {
                var3 = class21.field334[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class134.field2353 >= 0 && var3 >= 0) {
                class254.field4563[class134.field2353] = var3;
                class134.field2353 = class134.field2353 + 1 & 0x7F;
                if (class7.field145 == class134.field2353) {
                    class134.field2353 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class255.field4578 + 1 & 0x7F;
                if (class31.field493 != var4) {
                    class91.field1637[class255.field4578] = var3;
                    class113.field1979[class255.field4578] = -1;
                    class255.field4578 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field3527++;
    }

    @OriginalMember(owner = "client!tb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field3521++;
        if (class229.field4189 != null) {
            class33.field558 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class21.field334.length > var2) {
                var3 = class21.field334[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class134.field2353 >= 0 && var3 >= 0) {
                class254.field4563[class134.field2353] = ~var3;
                class134.field2353 = class134.field2353 + 1 & 0x7F;
                if (class7.field145 == class134.field2353) {
                    class134.field2353 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1300(int arg0, int arg1, int arg2, long arg3) {
        class120 var5 = class7.field122[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field2131 != null && var5.field2131.field1096 == arg3) {
            return true;
        } else if (var5.field2124 != null && var5.field2124.field1191 == arg3) {
            return true;
        } else if (var5.field2129 != null && var5.field2129.field2437 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field2134; var6++) {
                if (var5.field2144[var6].field3928 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
    public static void method1301(int arg0) {
        field3528 = null;
        field3534 = null;
        field3537 = null;
        field3535 = null;
        if (arg0 != 11592) {
            method1302(-80);
        }
        field3523 = null;
        field3522 = null;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
    public static final void method1302(int arg0) {
        field3541++;
        if (class165.field2966 != null || class50.field996 != null) {
            return;
        }
        if (arg0 != 1) {
            field3538 = true;
        }
        int var1 = class92.field1653;
        if (class139.field2415) {
            if (var1 != 1) {
                int var2 = class235.field4292;
                int var3 = class158.field2859;
                if (class128.field2271 - 10 > var2 || class128.field2271 + class52.field1023 + 10 < var2 || (class24.field417 - 10) > var3 || var3 > (class24.field417 + class176.field3167 + 10)) {
                    class139.field2415 = false;
                    class235.method1588(90, class24.field417, class52.field1023, class128.field2271, class176.field3167);
                }
            }
            if (var1 == 1) {
                int var4 = class24.field417;
                int var5 = class128.field2271;
                int var6 = class52.field1023;
                int var7 = class31.field499;
                int var8 = -1;
                int var9 = class67.field1279;
                for (int var10 = 0; var10 < class257.field4625; var10++) {
                    int var11 = (class257.field4625 - var10 - 1) * 15 + var4 + 31;
                    if (var5 < var7 && var5 + var6 > var7 && var11 - 13 < var9 && (var11 + 3) > var9) {
                        var8 = var10;
                    }
                }
                if (var8 != -1) {
                    class23.method162((byte) -87, var8);
                }
                class139.field2415 = false;
                class235.method1588(104, class24.field417, class52.field1023, class128.field2271, class176.field3167);
                return;
            }
            return;
        }
        if (var1 == 1 && class257.field4625 > 0) {
            short var12 = class122.field2147[class257.field4625 - 1];
            if (var12 == 29 || var12 == 39 || var12 == 34 || var12 == 16 || var12 == 21 || var12 == 2 || var12 == 6 || var12 == 42 || var12 == 11 || var12 == 13 || var12 == 57 || var12 == 1006) {
                int var13 = class128.field2269[class257.field4625 - 1];
                int var14 = class168.field3006[class257.field4625 - 1];
                class43 var15 = class27.method186(1341, var14);
                if (class246.method1632((byte) 63, client.method1514(var15)) || class194.method1340((byte) 57, client.method1514(var15))) {
                    class258.field4634 = false;
                    class71.field1342 = 0;
                    if (class165.field2966 != null) {
                        class141.method844((byte) 88, class165.field2966);
                    }
                    class165.field2966 = class27.method186(1341, var14);
                    class56.field1085 = class31.field499;
                    class15.field269 = var13;
                    class40.field685 = class67.field1279;
                    class141.method844((byte) -51, class165.field2966);
                    return;
                }
            }
        }
        if (var1 == 1 && (class141.field2457 == 1 && class257.field4625 > 2 || class64.method366(true, class257.field4625 - 1))) {
            var1 = 2;
        }
        if (var1 == 2 && class257.field4625 > 0 || class112.field1974 == 1) {
            class113.method676(-119);
        }
        if ((var1 != 1 || class257.field4625 <= 0) && class112.field1974 != 2) {
            return;
        }
        class287.method1881((byte) 73);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lh;IB)Llc;")
    public static final class143 method1303(class190 arg0, int arg1, byte arg2) {
        field3530++;
        try {
            int var3 = -122 % ((arg2 - 37) / 42);
            class143 var4 = new class143();
            var4.field2548 = arg0.method1257((byte) 108);
            if (arg1 < var4.field2548) {
                var4.field2548 = arg1;
            }
            var4.field2503 = new byte[var4.field2548];
            arg0.field3487 += class246.field4421.method1110(var4.field2503, (byte) -2, var4.field2548, arg0.field3487, arg0.field3465, 0);
            return var4;
        } catch (Exception var5) {
            return class200.field3656;
        }
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)Lek;")
    public static final class160 method1304(int arg0) {
        int var1 = class41.field697[0] * class153.field2766[0];
        field3536++;
        if (arg0 != 1) {
            method1299(73);
        }
        byte[] var2 = class282.field4961[0];
        class160 var6;
        if (class44.field900[0]) {
            int[] var3 = new int[var1];
            byte[] var4 = class32.field546[0];
            for (int var5 = 0; var5 < var1; var5++) {
                var3[var5] = class119.method729(class111.field1961[class129.method777(255, var2[var5])], class129.method777(255, var4[var5]) << 24);
            }
            var6 = new class253(class257.field4628, class70.field1332, class126.field2226[0], class32.field536[0], class41.field697[0], class153.field2766[0], var3);
        } else {
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class111.field1961[class129.method777(255, var2[var8])];
            }
            var6 = new class160(class257.field4628, class70.field1332, class126.field2226[0], class32.field536[0], class41.field697[0], class153.field2766[0], var7);
        }
        class258.method1708(0);
        return var6;
    }

    @OriginalMember(owner = "client!tb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3542++;
    }
}
