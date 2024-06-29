import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class26 extends class96 {

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "I")
    public int field745;

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "I")
    private int field742;

    @OriginalMember(owner = "client!ea", name = "J", descriptor = "[I")
    public int[] field746;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "[[I")
    public int[][] field739;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "Lwb;")
    private static class130 field737 = method212("Please wait 1 minute and try again)3", -32376);

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "Z")
    public static boolean field740 = false;

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "Lwb;")
    public static class130 field741 = method212(" zuerst von Ihrer Freunde)2Liste(Q", -32376);

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
    public static int field736 = 0;

    @OriginalMember(owner = "client!ea", name = "U", descriptor = "I")
    public static int field757 = 0;

    @OriginalMember(owner = "client!ea", name = "L", descriptor = "Lwb;")
    public static class130 field748 = method212("Der Server wird gerade aktualisiert)3", -32376);

    @OriginalMember(owner = "client!ea", name = "Y", descriptor = "Lwb;")
    public static class130 field761 = field737;

    @OriginalMember(owner = "client!ea", name = "P", descriptor = "[I")
    public static int[] field752 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ea", name = "db", descriptor = "[Lfb;")
    public static class33[] field766 = new class33[32768];

    @OriginalMember(owner = "client!ea", name = "fb", descriptor = "Lwb;")
    public static class130 field768 = method212("headicons_pk", -32376);

    @OriginalMember(owner = "client!ea", name = "O", descriptor = "Lwb;")
    public static class130 field751 = method212("Lade Spiel)2Fenster )2 ", -32376);

    @OriginalMember(owner = "client!ea", name = "ab", descriptor = "Lwb;")
    public static class130 field763 = method212("Lade Eingabe)2Steuerungsprogramm)3)3)3", -32376);

    @OriginalMember(owner = "client!ea", name = "S", descriptor = "Lwb;")
    public static class130 field755 = field737;

    @OriginalMember(owner = "client!ea", name = "M", descriptor = "I")
    public static int field749 = 0;

    @OriginalMember(owner = "client!ea", name = "cb", descriptor = "Lwb;")
    public static class130 field765 = field737;

    @OriginalMember(owner = "client!ea", name = "X", descriptor = "I")
    public static int field760 = 0;

    @OriginalMember(owner = "client!ea", name = "T", descriptor = "Lwb;")
    private static class130 field756 = method212("Unable to connect)3", -32376);

    @OriginalMember(owner = "client!ea", name = "N", descriptor = "Lwb;")
    public static class130 field750 = field756;

    @OriginalMember(owner = "client!ea", name = "W", descriptor = "Lwb;")
    public static class130 field759 = field756;

    @OriginalMember(owner = "client!ea", name = "hb", descriptor = "[I")
    public static int[] field770 = new int[2048];

    @OriginalMember(owner = "client!ea", name = "gb", descriptor = "I")
    public static int field769 = 0;

    @OriginalMember(owner = "client!ea", name = "ib", descriptor = "Lwb;")
    public static class130 field771 = method212("Keine Antwort vom Server)3", -32376);

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!ea", name = "K", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!ea", name = "R", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!ea", name = "Z", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!ea", name = "bb", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!ea", name = "jb", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!ea", name = "kb", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "Lqd;")
    public static class100 field738;

    @OriginalMember(owner = "client!ea", name = "eb", descriptor = "Lqd;")
    public static class100 field767;

    @OriginalMember(owner = "client!ea", name = "Q", descriptor = "Lec;")
    public static class28 field753;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ea", name = "lb", descriptor = "Ljava/lang/Class;")
    public static Class field774;

    @OriginalMember(owner = "client!ea", name = "V", descriptor = "[I")
    public static int[] field758;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method218(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IBI)I", line = 7)
    public static final int method211(int arg0, byte arg1, int arg2) {
        int var3 = 24 % ((arg1 + 61) / 42);
        field772++;
        if (arg2 < arg0) {
            int var4 = arg2;
            arg2 = arg0;
            arg0 = var4;
        }
        while (arg0 != 0) {
            int var5 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var5;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/lang/String;I)Lwb;", line = 43)
    public static final class130 method212(String arg0, int arg1) {
        byte[] var2 = arg0.getBytes();
        if (arg1 != -32376) {
            return null;
        }
        field744++;
        int var3 = var2.length;
        class130 var4 = new class130();
        var4.field3081 = new byte[var3];
        int var5 = 0;
        while (var3 > var5) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field3081[var4.field3079++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var4.field3081[var4.field3079++] = (byte) var6;
            }
        }
        var4.method972(arg1 ^ 0xFFFF8188);
        return var4.method959(true);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BJ)Lwb;", line = 100)
    public static final class130 method213(byte arg0, long arg1) {
        field764++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            if (arg0 <= 8) {
                method213((byte) -55, -28L);
            }
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var3--;
                var6[var3] = class67.field1709[(int) (var8 - arg1 * 37L)];
            }
            class130 var7 = new class130();
            var7.field3081 = var6;
            var7.field3079 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(I[B)V", line = 151)
    public class26(int arg0, byte[] arg1) {
        this.field745 = arg0;
        class36 var3 = new class36(arg1);
        this.field742 = var3.method365((byte) -127);
        this.field746 = new int[this.field742];
        this.field739 = new int[this.field742][];
        for (int var4 = 0; var4 < this.field742; var4++) {
            this.field746[var4] = var3.method365((byte) -125);
        }
        for (int var5 = 0; var5 < this.field742; var5++) {
            this.field739[var5] = new int[var3.method365((byte) -128)];
        }
        for (int var6 = 0; var6 < this.field742; var6++) {
            for (int var7 = 0; var7 < this.field739[var6].length; var7++) {
                this.field739[var6][var7] = var3.method365((byte) -125);
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)V", line = 197)
    public static void method214(byte arg0) {
        field768 = null;
        field763 = null;
        field758 = null;
        field752 = null;
        field761 = null;
        field770 = null;
        field737 = null;
        field741 = null;
        field748 = null;
        field759 = null;
        field771 = null;
        field753 = null;
        field750 = null;
        if (arg0 >= -114) {
            field766 = null;
        }
        field765 = null;
        field767 = null;
        field738 = null;
        field766 = null;
        field755 = null;
        field751 = null;
        field756 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILec;II)V", line = 226)
    public static final void method215(int arg0, class28 arg1, int arg2, int arg3) {
        field773++;
        if (arg1 == null) {
            return;
        }
        int var4 = class85.field2041 + class3.field80 & 0x7FF;
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (arg0 >= -88) {
            field748 = null;
        }
        if (var5 > 6400) {
            return;
        }
        int var6 = class102.field2502[var4];
        int var7 = var6 * 256 / (class115.field2825 + 256);
        int var8 = class102.field2514[var4];
        int var9 = var8 * 256 / (class115.field2825 + 256);
        int var10 = arg2 * var9 + arg3 * var7 >> 16;
        int var11 = arg3 * var9 - arg2 * var7 >> 16;
        if (var5 <= 2500) {
            arg1.method233(var10 + 94 + 4 - arg1.field792 / 2, -var11 + 83 + -(arg1.field795 / 2) + -4);
        } else {
            arg1.method232(class75.field1871, var10 + 94 + 4 - arg1.field792 / 2, -(arg1.field795 / 2) + 83 + -var11 + -4);
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V", line = 266)
    public static final void method216(int arg0) {
        field754++;
        if (class81.field1934 == null) {
            return;
        }
        long var1 = class90.method668(false);
        if (var1 <= class120.field2934) {
            return;
        }
        class81.field1934.method649(var1);
        int var3 = (int) (var1 - class120.field2934);
        class120.field2934 = var1;
        if (arg0 != 0) {
            return;
        }
        synchronized (field774 == null ? (field774 = method218("sc")) : field774) {
            class109.field2650 += class48.field1298 * var3;
            int var5 = (class109.field2650 - class48.field1298 * 2000) / 1000;
            if (var5 > 0) {
                if (class68.field1761 != null) {
                    class68.field1761.method383(var5);
                }
                class109.field2650 -= var5 * 1000;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(B)V", line = 380)
    public static final void method217(byte arg0) {
        field747++;
        class3.method20(-29461);
        if (field749 == 2) {
            byte[] var1 = class75.field1871.field2412;
            int[] var2 = class49.field1308;
            int var3 = var1.length;
            for (int var4 = 0; var4 < var3; var4++) {
                if (var1[var4] == 0) {
                    var2[var4] = 0;
                }
            }
            field753.method231(0, 0, 33, 33, 25, 25, class3.field80, 256, class112.field2762, class60.field1539);
            class30.method242(14425);
            return;
        }
        int var5 = class3.field80 + class85.field2041 & 0x7FF;
        if (arg0 != -64) {
            return;
        }
        int var6 = class42.field1179.field2071 / 32 + 48;
        int var7 = 464 - class42.field1179.field2128 / 32;
        class106.field2566.method231(25, 5, 146, 151, var6, var7, var5, class115.field2825 + 256, class35.field1013, class48.field1279);
        for (int var8 = 0; var8 < class10.field331; var8++) {
            int var38 = class90.field2177[var8] * 4 + 2 - class42.field1179.field2071 / 32;
            int var39 = class120.field2945[var8] * 4 + 2 - class42.field1179.field2128 / 32;
            method215(arg0 ^ 0x63, class18.field513[var8], var38, var39);
        }
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var34 = 0; var34 < 104; var34++) {
                class108 var35 = class23.field674[class71.field1818][var9][var34];
                if (var35 != null) {
                    int var36 = var34 * 4 + 2 - class42.field1179.field2128 / 32;
                    int var37 = var9 * 4 + 2 - class42.field1179.field2071 / 32;
                    method215(-108, class3.field134[0], var37, var36);
                }
            }
        }
        for (int var10 = 0; var10 < class58.field1466; var10++) {
            class33 var30 = field766[class24.field716[var10]];
            if (var30 != null && var30.method259(false)) {
                class84 var31 = var30.field913;
                if (var31.field1987 != null) {
                    var31 = var31.method629(0);
                }
                if (var31 != null && var31.field1985 && var31.field1994) {
                    int var32 = var30.field2071 / 32 - class42.field1179.field2071 / 32;
                    int var33 = var30.field2128 / 32 - class42.field1179.field2128 / 32;
                    method215(arg0 ^ 0x40, class3.field134[1], var32, var33);
                }
            }
        }
        for (int var11 = 0; var11 < class61.field1582; var11++) {
            class59 var22 = class105.field2550[field770[var11]];
            if (var22 != null && var22.method259(false)) {
                int var23 = var22.field2128 / 32 - class42.field1179.field2128 / 32;
                int var24 = var22.field2071 / 32 - class42.field1179.field2071 / 32;
                boolean var25 = false;
                long var26 = var22.field1515.method988(-50);
                for (int var28 = 0; var28 < class35.field993; var28++) {
                    if (class4.field164[var28] == var26 && class14.field410[var28] != 0) {
                        var25 = true;
                        break;
                    }
                }
                boolean var29 = false;
                if (class42.field1179.field1505 != 0 && var22.field1505 != 0 && class42.field1179.field1505 == var22.field1505) {
                    var29 = true;
                }
                if (var25) {
                    method215(arg0 - 36, class3.field134[3], var24, var23);
                } else if (var29) {
                    method215(-103, class3.field134[4], var24, var23);
                } else {
                    method215(-95, class3.field134[2], var24, var23);
                }
            }
        }
        if (class130.field3065 != 0 && class130.field3128 % 20 < 10) {
            if (class130.field3065 == 1 && class116.field2861 >= 0 && class116.field2861 < field766.length) {
                class33 var12 = field766[class116.field2861];
                if (var12 != null) {
                    int var13 = var12.field2128 / 32 - class42.field1179.field2128 / 32;
                    int var14 = var12.field2071 / 32 - class42.field1179.field2071 / 32;
                    class97.method724(var14, arg0 ^ 0xFFFFFFFD, class2.field24[1], var13);
                }
            }
            if (class130.field3065 == 2) {
                int var15 = (class63.field1611 - class129.field3045) * 4 + 2 - class42.field1179.field2071 / 32;
                int var16 = (class92.field2216 - class42.field1172) * 4 + 2 - class42.field1179.field2128 / 32;
                class97.method724(var15, -111, class2.field24[1], var16);
            }
            if (class130.field3065 == 10 && class27.field784 >= 0 && class27.field784 < class105.field2550.length) {
                class59 var17 = class105.field2550[class27.field784];
                if (var17 != null) {
                    int var18 = var17.field2128 / 32 - class42.field1179.field2128 / 32;
                    int var19 = var17.field2071 / 32 - class42.field1179.field2071 / 32;
                    class97.method724(var19, 9, class2.field24[1], var18);
                }
            }
        }
        if (class116.field2850 != 0) {
            int var20 = class116.field2850 * 4 + 2 - class42.field1179.field2071 / 32;
            int var21 = class61.field1583 * 4 + 2 - class42.field1179.field2128 / 32;
            method215(-116, class2.field24[0], var20, var21);
        }
        class49.method440(97, 78, 3, 3, 16777215);
        field753.method231(0, 0, 33, 33, 25, 25, class3.field80, 256, class112.field2762, class60.field1539);
        class30.method242(14425);
    }
}
