import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class197 extends class112 {

    @OriginalMember(owner = "client!ag", name = "E", descriptor = "Lfk;")
    public class50 field3222;

    @OriginalMember(owner = "client!ag", name = "H", descriptor = "I")
    public static int field3225 = 0;

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!ag", name = "C", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!ag", name = "D", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!ag", name = "F", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!ag", name = "B", descriptor = "Lsb;")
    public static class124 field3219;

    @OriginalMember(owner = "client!ag", name = "G", descriptor = "[I")
    public static int[] field3224;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II[Lkj;)V")
    public static final void method1342(int arg0, int arg1, class114[] arg2) {
        field3218++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class114 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field1898 == 0) {
                    if (var4.field1820 != null) {
                        method1342(56, arg1, var4.field1820);
                    }
                    class167 var5 = (class167) class91.field1434.method1063((byte) -69, (long) var4.field1789);
                    if (var5 != null) {
                        class165.method1196(arg1, var5.field2756, (byte) -100);
                    }
                }
                if (arg1 == 0 && var4.field1805 != null) {
                    class196 var6 = new class196();
                    var6.field3205 = var4.field1805;
                    var6.field3213 = var4;
                    class129.method938(-48, var6);
                }
                if (arg1 == 1 && var4.field1927 != null) {
                    if (var4.field1916 >= 0) {
                        class114 var7 = class8.method43(var4.field1789, (byte) 24);
                        if (var7 == null || var7.field1820 == null || var7.field1820.length <= var4.field1916 || var7.field1820[var4.field1916] != var4) {
                            continue;
                        }
                    }
                    class196 var8 = new class196();
                    var8.field3205 = var4.field1927;
                    var8.field3213 = var4;
                    class129.method938(-44, var8);
                }
            }
        }
        if (arg0 <= 35) {
            field3224 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static final void method1343(int arg0) {
        field3221++;
        if (class152.field2484 == null) {
            return;
        }
        if (class5.field63 < 10) {
            if (!class170.field2776.method902(class152.field2484.field2015, (byte) 37)) {
                class5.field63 = class184.field3035.method886((byte) -78, class152.field2484.field2015) / 10;
                return;
            }
            class229.method1524(0);
            class5.field63 = 10;
        }
        if (class5.field63 == 10) {
            class253.field4030 = class152.field2484.field2005 >> 6 << 6;
            class31.field524 = (class152.field2484.field1999 >> 6 << 6) + 64 - class253.field4030;
            class285.field4524 = class152.field2484.field2009 >> 6 << 6;
            int var1 = -1;
            int var2 = -1;
            class159.field2574 = (class152.field2484.field1998 >> 6 << 6) + 64 - class285.field4524;
            int[] var3 = class152.field2484.method869((class48.field878.field2887 >> 7) + class170.field2787, (class48.field878.field2849 >> 7) + class256.field4082, class92.field1448, (byte) -87);
            if (var3 != null) {
                var2 = class31.field524 - var3[2] - (1 - class253.field4030);
                var1 = var3[1] - class285.field4524;
            }
            if (var1 >= 0 && var1 < class159.field2574 && var2 >= 0 && var2 < class31.field524) {
                int var4 = var2 + (int) (Math.random() * 10.0D) - 5;
                int var5 = var1 + ((int) (Math.random() * 10.0D) - 5);
                class22.field343 = var4;
                class94.field1462 = var5;
            } else if (class82.field1367 == -1 || class9.field124 == -1) {
                int[] var7 = class152.field2484.method873(class152.field2484.field2007 & 0x3FFF, -121, (class152.field2484.field2007 & 0xFFFF558) >> 14);
                class22.field343 = class253.field4030 + class31.field524 - var7[2] - 1;
                class94.field1462 = var7[1] - class285.field4524;
            } else {
                int[] var6 = class152.field2484.method873(class9.field124, 74, class82.field1367);
                if (var6 != null) {
                    class94.field1462 = var6[1] - class285.field4524;
                    class22.field343 = -var6[2] - (1 - class253.field4030 - class31.field524);
                }
                class9.field124 = -1;
                class82.field1367 = -1;
            }
            if (class152.field2484.field1997 == 37) {
                class170.field2791 = 3.0F;
                class199.field3249 = 3.0F;
            } else if (class152.field2484.field1997 == 50) {
                class170.field2791 = 4.0F;
                class199.field3249 = 4.0F;
            } else if (class152.field2484.field1997 == 75) {
                class170.field2791 = 6.0F;
                class199.field3249 = 6.0F;
            } else if (class152.field2484.field1997 == 100) {
                class170.field2791 = 8.0F;
                class199.field3249 = 8.0F;
            } else if (class152.field2484.field1997 == 200) {
                class170.field2791 = 16.0F;
                class199.field3249 = 16.0F;
            } else {
                class170.field2791 = 8.0F;
                class199.field3249 = 8.0F;
            }
            class11.method72(false);
            int var8 = class159.field2574 >> 6;
            int var9 = class18.field262 >> 2 << 10;
            int var10 = class119.field2016 >> 1;
            int var11 = class31.field524 >> 6;
            class35.field597 = new int[var8][var11][];
            class81.field1333 = new byte[var8][var11][];
            class292.field4635 = new int[class206.field3318 + 1];
            class246.field3876 = new byte[var8][var11][];
            class149.field2446 = new int[var8][var11][];
            class213.field3419 = new byte[var8][var11][];
            class137.field2299 = new byte[var8][var11][];
            class172.field2911 = new int[var8][var11][];
            class106.field1623 = new byte[var8][var11][];
            class60.method461(var10, var9, (byte) 12);
            class5.field63 = 20;
        } else if (class5.field63 == 20) {
            class60.method463(new class136(class170.field2776.method906("underlay", class152.field2484.field2015, (byte) -111)), (byte) 99);
            class5.field63 = 30;
            class204.method1377(true, -93);
            class151.method1099(120);
        } else if (class5.field63 == 30) {
            class167.method1203(arg0 - 8837, new class136(class170.field2776.method906("overlay", class152.field2484.field2015, (byte) -50)));
            class5.field63 = 40;
            class151.method1099(104);
        } else if (class5.field63 == 40) {
            class154.method1114(arg0 ^ 0xFFFFA4E5, new class136(class170.field2776.method906("overlay2", class152.field2484.field2015, (byte) -89)));
            class5.field63 = 50;
            class151.method1099(100);
        } else if (class5.field63 == 50) {
            class289.method1944(new class136(class170.field2776.method906("loc", class152.field2484.field2015, (byte) -109)), -89);
            class5.field63 = 60;
            class204.method1377(true, -41);
            class151.method1099(110);
        } else if (class5.field63 == 60) {
            if (class170.field2776.method901(class152.field2484.field2015 + "_labels", (byte) 6)) {
                if (!class170.field2776.method902(class152.field2484.field2015 + "_labels", (byte) 34)) {
                    return;
                }
                class143.field2358 = class87.method685(0, class152.field2484.field2015 + "_labels", class170.field2776);
            } else {
                class143.field2358 = new class254(0);
            }
            class5.field63 = 70;
            class151.method1099(113);
        } else if (arg0 == 23399) {
            if (class5.field63 == 70) {
                class296.field4685 = new class203(11, true, class22.field340);
                class5.field63 = 73;
                class204.method1377(true, arg0 ^ 0xFFFFA487);
                class151.method1099(103);
            } else if (class5.field63 == 73) {
                class81.field1343 = new class203(12, true, class22.field340);
                class5.field63 = 76;
                class204.method1377(true, arg0 - 23426);
                class151.method1099(98);
            } else if (class5.field63 == 76) {
                class22.field335 = new class203(14, true, class22.field340);
                class5.field63 = 79;
                class204.method1377(true, -101);
                class151.method1099(arg0 - 23288);
            } else if (class5.field63 == 79) {
                class116.field1956 = new class203(17, true, class22.field340);
                class5.field63 = 82;
                class204.method1377(true, -94);
                class151.method1099(117);
            } else if (class5.field63 == 82) {
                class258.field4113 = new class203(19, true, class22.field340);
                class5.field63 = 85;
                class204.method1377(true, -127);
                class151.method1099(103);
            } else if (class5.field63 == 85) {
                class108.field1649 = new class203(22, true, class22.field340);
                class5.field63 = 88;
                class204.method1377(true, -81);
                class151.method1099(104);
            } else if (class5.field63 == 88) {
                class297.field4700 = new class203(26, true, class22.field340);
                class5.field63 = 91;
                class204.method1377(true, arg0 - 23452);
                class151.method1099(113);
            } else {
                class8.field91 = new class203(30, true, class22.field340);
                class5.field63 = 100;
                class204.method1377(true, arg0 - 23425);
                class151.method1099(arg0 - 23295);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lfk;)V")
    public class197(class50 arg0) {
        this.field3222 = arg0;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
    public static void method1344(int arg0) {
        field3224 = null;
        field3219 = null;
        int var1 = 10 % ((arg0 - 44) / 32);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1345(Component arg0, int arg1) {
        if (arg1 != -26187) {
            method1345((Component) null, -80);
        }
        field3223++;
        arg0.addMouseListener(class210.field3374);
        arg0.addMouseMotionListener(class210.field3374);
        arg0.addFocusListener(class210.field3374);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZBILjava/lang/String;)I")
    public static final int method1346(boolean arg0, byte arg1, int arg2, String arg3) {
        field3220++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        } else if (arg1 == 70) {
            boolean var4 = false;
            int var5 = arg3.length();
            boolean var6 = false;
            int var7 = 0;
            for (int var8 = 0; var8 < var5; var8++) {
                char var9 = arg3.charAt(var8);
                if (var8 == 0) {
                    if (var9 == '-') {
                        var4 = true;
                        continue;
                    }
                    if (var9 == '+' && arg0) {
                        continue;
                    }
                }
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else if (var9 >= 'a' && var9 <= 'z') {
                    var11 = var9 - 'W';
                } else {
                    throw new NumberFormatException();
                }
                if (arg2 <= var11) {
                    throw new NumberFormatException();
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg2 * var7 + var11;
                if (var10 / arg2 != var7) {
                    throw new NumberFormatException();
                }
                var7 = var10;
                var6 = true;
            }
            if (!var6) {
                throw new NumberFormatException();
            }
            return var7;
        } else {
            return -100;
        }
    }
}
