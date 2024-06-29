import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class63 {

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "[I")
    public static int[] field869 = new int[256];

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "Lbe;")
    public static class283 field871 = class153.method941(17, "(U (X");

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "Lbe;")
    public static class283 field875;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "Lbe;")
    public static class283 field874;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "Lbe;")
    public static class283 field877;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "Lek;")
    public static class172 field878;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "[[B")
    public static byte[][] field872;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(JI)V", line = 5)
    public static final void method405(long arg0, int arg1) {
        if (arg1 != 2042819304) {
            return;
        }
        field868++;
        class228.field3831.field3905 = 0;
        class228.field3831.method1499(true, 245);
        class228.field3831.method1544((byte) 8, arg0);
        class62.field862 = 0;
        class166.field2773 = 0;
        class194.field3316 = 1;
        class2.field20 = -3;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 37)
    public static void method406(int arg0) {
        field878 = null;
        field871 = null;
        field877 = null;
        field875 = null;
        field874 = null;
        field869 = null;
        if (arg0 != 0) {
            field872 = (byte[][]) ((byte[][]) null);
        }
        field872 = (byte[][]) null;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field869[var0] = var1;
        }
        field875 = class153.method941(127, " zuerst von Ihrer Freunde)2Liste(Q");
        field874 = class153.method941(126, "<img=0>");
        field877 = class153.method941(126, ")3runescape)3com)4l=");
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZI)V", line = 127)
    public static final void method407(boolean arg0, int arg1) {
        class183.field3158 = arg0;
        if (class183.field3158) {
            int var15 = class262.field4462.method1522((byte) 43);
            int var16 = class262.field4462.method1496(true);
            class262.field4462.method624(true);
            for (int var17 = 0; var17 < 4; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    for (int var19 = 0; var19 < 13; var19++) {
                        int var20 = class262.field4462.method617((byte) -21, 1);
                        if (var20 == 1) {
                            class18.field208[var17][var18][var19] = class262.field4462.method617((byte) -21, 26);
                        } else {
                            class18.field208[var17][var18][var19] = -1;
                        }
                    }
                }
            }
            class262.field4462.method620(true);
            int var21 = (class260.field4419 - class262.field4462.field3905) / 16;
            class1.field10 = new int[var21][4];
            for (int var22 = 0; var22 < var21; var22++) {
                for (int var23 = 0; var23 < 4; var23++) {
                    class1.field10[var22][var23] = class262.field4462.method1508((byte) -112);
                }
            }
            int var24 = class262.field4462.method1525(arg1 ^ 0x63);
            int var25 = class262.field4462.method1537(2);
            int var26 = class262.field4462.method1496(true);
            class103.field1761 = new int[var21];
            class177.field3039 = new int[var21];
            class259.field4396 = new int[var21];
            class254.field4296 = new byte[var21][];
            class113.field1903 = new byte[var21][];
            class221.field3715 = null;
            class85.field1443 = (byte[][]) null;
            class14.field147 = new byte[var21][];
            field872 = new byte[var21][];
            class62.field865 = new int[var21];
            class222.field3737 = new int[var21];
            int var27 = 0;
            for (int var28 = 0; var28 < 4; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    for (int var30 = 0; var30 < 13; var30++) {
                        int var31 = class18.field208[var28][var29][var30];
                        if (var31 != -1) {
                            int var32 = (var31 & 0xFFD341) >> 14;
                            int var33 = (var31 & 0x3FFA) >> 3;
                            int var34 = (var32 / 8 << 8) + (var33 / 8);
                            for (int var35 = 0; var35 < var27; var35++) {
                                if (class177.field3039[var35] == var34) {
                                    var34 = -1;
                                    break;
                                }
                            }
                            if (var34 != -1) {
                                int var36 = (var34 & 0xFF5E) >> 8;
                                class177.field3039[var27] = var34;
                                int var37 = var34 & 0xFF;
                                class259.field4396[var27] = class61.field849.method1097(class299.method2022(new class283[] { class259.field4414, class296.method2012(var36, (byte) 107), class299.field5061, class296.method2012(var37, (byte) -33) }, (byte) 61), 0);
                                class103.field1761[var27] = class61.field849.method1097(class299.method2022(new class283[] { class66.field922, class296.method2012(var36, (byte) 124), class299.field5061, class296.method2012(var37, (byte) 113) }, (byte) 22), class281.method1877(arg1, 8));
                                class62.field865[var27] = class61.field849.method1097(class299.method2022(new class283[] { class115.field1940, class296.method2012(var36, (byte) 121), class299.field5061, class296.method2012(var37, (byte) -89) }, (byte) 47), 0);
                                class222.field3737[var27] = class61.field849.method1097(class299.method2022(new class283[] { class24.field364, class296.method2012(var36, (byte) 109), class299.field5061, class296.method2012(var37, (byte) 117) }, (byte) 44), class281.method1877(arg1, 8));
                                var27++;
                            }
                        }
                    }
                }
            }
            class54.method342(false, var26, -15993, var25, var16, var15, var24);
        } else {
            int var2 = class262.field4462.method1522((byte) 43);
            int var3 = class262.field4462.method1537(2);
            int var4 = class262.field4462.method1541((byte) -127);
            int var5 = class262.field4462.method1543(255);
            int var6 = class262.field4462.method1541((byte) -127);
            int var7 = (class260.field4419 - class262.field4462.field3905) / 16;
            class1.field10 = new int[var7][4];
            for (int var8 = 0; var8 < var7; var8++) {
                for (int var9 = 0; var9 < 4; var9++) {
                    class1.field10[var8][var9] = class262.field4462.method1534(false);
                }
            }
            class221.field3715 = null;
            class254.field4296 = new byte[var7][];
            class259.field4396 = new int[var7];
            class103.field1761 = new int[var7];
            boolean var10 = false;
            class113.field1903 = new byte[var7][];
            class222.field3737 = new int[var7];
            class62.field865 = new int[var7];
            field872 = new byte[var7][];
            class14.field147 = new byte[var7][];
            class177.field3039 = new int[var7];
            class85.field1443 = (byte[][]) null;
            int var11 = 0;
            if ((var2 / 8 == 48 || var2 / 8 == 49) && (var6 / 8) == 48) {
                var10 = true;
            }
            if (var2 / 8 == 48 && var6 / 8 == 148) {
                var10 = true;
            }
            for (int var12 = (var2 - 6) / 8; var12 <= ((var2 + 6) / 8); var12++) {
                for (int var13 = (var6 - 6) / 8; var13 <= ((var6 + 6) / 8); var13++) {
                    int var14 = (var12 << 8) + var13;
                    if (var10 && var13 == 49 || var13 == 149 || var13 == 147 || var12 == 50 || !(var12 != 49 || var13 != 47)) {
                        class177.field3039[var11] = var14;
                        class259.field4396[var11] = -1;
                        class103.field1761[var11] = -1;
                        class62.field865[var11] = -1;
                        class222.field3737[var11] = -1;
                    } else {
                        class177.field3039[var11] = var14;
                        class259.field4396[var11] = class61.field849.method1097(class299.method2022(new class283[] { class259.field4414, class296.method2012(var12, (byte) -72), class299.field5061, class296.method2012(var13, (byte) 118) }, (byte) 114), 0);
                        class103.field1761[var11] = class61.field849.method1097(class299.method2022(new class283[] { class66.field922, class296.method2012(var12, (byte) -33), class299.field5061, class296.method2012(var13, (byte) -111) }, (byte) 69), 0);
                        class62.field865[var11] = class61.field849.method1097(class299.method2022(new class283[] { class115.field1940, class296.method2012(var12, (byte) 116), class299.field5061, class296.method2012(var13, (byte) -22) }, (byte) 70), 0);
                        class222.field3737[var11] = class61.field849.method1097(class299.method2022(new class283[] { class24.field364, class296.method2012(var12, (byte) 109), class299.field5061, class296.method2012(var13, (byte) -79) }, (byte) 52), 0);
                    }
                    var11++;
                }
            }
            class54.method342(false, var4, -15993, var2, var6, var3, var5);
        }
        if (arg1 != 8) {
            field872 = (byte[][]) ((byte[][]) null);
        }
        field873++;
    }
}
