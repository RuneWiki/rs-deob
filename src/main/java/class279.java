import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class279 {

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "Lwa;")
    private static class75 field4832 = class66.method560("Loaded sprites", false);

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "Lwa;")
    private static class75 field4833 = class66.method560("Loading config )2 ", false);

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Lwa;")
    public static class75 field4829 = class66.method560("<br>", false);

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "Lwa;")
    public static class75 field4837 = field4832;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "Z")
    public static boolean field4838 = true;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "Lwa;")
    public static class75 field4835 = field4833;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "Lwa;")
    private static class75 field4839 = class66.method560("Loading fonts )2 ", false);

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Lwa;")
    public static class75 field4830 = field4839;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public static int field4842 = -1;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "Lml;")
    public static class125 field4841;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Lwc;")
    public static class96 field4831;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZIII)V", line = 18)
    public static final void method1989(boolean arg0, int arg1, int arg2, int arg3) {
        field4828++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        } else if (arg2 == 0) {
            class180.field3023 = arg1;
            class26.field348 = arg0;
            class99.field1644 = arg3;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V", line = 47)
    public static void method1990(boolean arg0) {
        if (arg0) {
            method1990(false);
        }
        field4829 = null;
        field4832 = null;
        field4841 = null;
        field4839 = null;
        field4831 = null;
        field4833 = null;
        field4830 = null;
        field4835 = null;
        field4837 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IB)V", line = 103)
    public static final void method1991(int arg0, byte arg1) {
        field4834++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class99.field1646[arg0];
        if (arg1 <= 3) {
            method1989(false, 106, 116, -116);
        }
        int var3 = class16.field216[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        int var4 = (int) class86.field1417[arg0];
        long var5 = class86.field1417[arg0];
        int var7 = class171.field2884[arg0];
        if (var2 == 9) {
            class253.field4265++;
            boolean var8 = class112.method870(0, field4831.field3236[0], (byte) 107, 0, false, 0, 2, 0, var7, 0, field4831.field3205[0], var3);
            if (!var8) {
                class112.method870(0, field4831.field3236[0], (byte) 118, 1, false, 0, 2, 1, var7, 0, field4831.field3205[0], var3);
            }
            class213.field3624 = class39.field595;
            class99.field1642 = 2;
            class89.field1468 = 0;
            class213.field3625 = class271.field4685;
            class89.field1470.method87(65280, 65);
            class89.field1470.method480((byte) -50, var4);
            class89.field1470.method503(-597878072, class275.field4737 + var7);
            class89.field1470.method513((byte) -5, class175.field2939 + var3);
        }
        if (var2 == 39) {
            class295 var10 = class35.field521[var4];
            if (var10 != null) {
                class112.method870(0, field4831.field3236[0], (byte) 126, 1, false, 0, 2, 1, var10.field3236[0], 0, field4831.field3205[0], var10.field3205[0]);
                class89.field1468 = 0;
                class29.field413++;
                class213.field3625 = class271.field4685;
                class213.field3624 = class39.field595;
                class99.field1642 = 2;
                class89.field1470.method87(65280, 243);
                class89.field1470.method493(var4, (byte) 83);
            }
        }
        if (var2 == 59) {
            boolean var11 = class112.method870(0, field4831.field3236[0], (byte) 121, 0, false, 0, 2, 0, var7, 0, field4831.field3205[0], var3);
            class195.field3282++;
            if (!var11) {
                class112.method870(0, field4831.field3236[0], (byte) 111, 1, false, 0, 2, 1, var7, 0, field4831.field3205[0], var3);
            }
            class89.field1468 = 0;
            class99.field1642 = 2;
            class213.field3624 = class39.field595;
            class213.field3625 = class271.field4685;
            class89.field1470.method87(65280, 94);
            class89.field1470.method480((byte) -50, class175.field2939 + var3);
            class89.field1470.method480((byte) -50, var4);
            class89.field1470.method493(class275.field4737 + var7, (byte) 75);
        }
        if (var2 == 3) {
            class262 var49 = class161.method1208(var3, var7, (byte) 29);
            if (var49 != null) {
                class189.method1428((byte) -82);
                class53.method389(class133.method1035(7127, client.method1734(var49)), -107, var3, var7);
                class13.field176 = 0;
                class197.field3307 = class48.method348(114, var49);
                if (class197.field3307 == null) {
                    class197.field3307 = class121.field2035;
                }
                if (var49.field4540) {
                    class215.field3673 = class66.method562((byte) -53, new class75[] { var49.field4524, class216.field3702 });
                } else {
                    class215.field3673 = class66.method562((byte) 120, new class75[] { class194.field3241, var49.field4498, class216.field3702 });
                }
            }
            return;
        }
        if (var2 == 49 && class64.method550(var3, var7, var5, -6980)) {
            class186.field3116++;
            class89.field1470.method87(65280, 45);
            class89.field1470.method480((byte) -50, var7 + class275.field4737);
            class89.field1470.method486((byte) 123, class158.field2715);
            class89.field1470.method513((byte) -128, class281.field4846);
            class89.field1470.method493(class50.field803, (byte) 96);
            class89.field1470.method480((byte) -50, class175.field2939 + var3);
            class89.field1470.method493((int) (var5 >>> 32) & Integer.MAX_VALUE, (byte) 123);
        }
        if (var2 == 48) {
            class295 var13 = class35.field521[var4];
            if (var13 != null) {
                class112.method870(0, field4831.field3236[0], (byte) 118, 1, false, 0, 2, 1, var13.field3236[0], 0, field4831.field3205[0], var13.field3205[0]);
                class213.field3625 = class271.field4685;
                class213.field3624 = class39.field595;
                class89.field1468 = 0;
                class166.field2799++;
                class99.field1642 = 2;
                class89.field1470.method87(65280, 66);
                class89.field1470.method493(var4, (byte) 100);
            }
        }
        if (var2 == 47) {
            class64.method550(var3, var7, var5, -6980);
            class89.field1470.method87(65280, 227);
            class89.field1470.method480((byte) -50, (int) (var5 >>> 32) & Integer.MAX_VALUE);
            class43.field710++;
            class89.field1470.method513((byte) -116, class275.field4737 + var7);
            class89.field1470.method480((byte) -50, var3 + class175.field2939);
        }
        if (var2 == 1002) {
            class262 var14 = class51.method374(-67, var3);
            if (var14 == null || var14.field4496[var7] < 100000) {
                class295.field5069++;
                class89.field1470.method87(65280, 189);
                class89.field1470.method513((byte) 3, var4);
            } else {
                class162.method1216((byte) 38, 0, class66.method562((byte) 119, new class75[] { class67.method565(107, var14.field4496[var7]), class200.field3386, class199.method1475(var4, (byte) -109).field4770 }), class121.field2037);
            }
            class170.field2867 = 0;
            class54.field896 = class51.method374(-56, var3);
            class310.field5291 = var7;
        }
        if (var2 == 26) {
            class96 var15 = class169.field2842[var4];
            if (var15 != null) {
                class112.method870(0, field4831.field3236[0], (byte) 123, 1, false, 0, 2, 1, var15.field3236[0], 0, field4831.field3205[0], var15.field3205[0]);
                class213.field3625 = class271.field4685;
                class89.field1468 = 0;
                class187.field3119++;
                class99.field1642 = 2;
                class213.field3624 = class39.field595;
                class89.field1470.method87(65280, 250);
                class89.field1470.method480((byte) -50, var4);
            }
        }
        if (var2 == 35) {
            class274.method1955(83);
        }
        if (var2 == 25) {
            class295 var16 = class35.field521[var4];
            if (var16 != null) {
                class152.field2615++;
                class112.method870(0, field4831.field3236[0], (byte) 105, 1, false, 0, 2, 1, var16.field3236[0], 0, field4831.field3205[0], var16.field3205[0]);
                class99.field1642 = 2;
                class89.field1468 = 0;
                class213.field3624 = class39.field595;
                class213.field3625 = class271.field4685;
                class89.field1470.method87(65280, 185);
                class89.field1470.method480((byte) -50, var4);
            }
        }
        if (var2 == 33) {
            class273.field4710++;
            class89.field1470.method87(65280, 98);
            class89.field1470.method486((byte) 124, var3);
            class89.field1470.method493(var7, (byte) 79);
            class89.field1470.method513((byte) -127, var4);
            class170.field2867 = 0;
            class54.field896 = class51.method374(2, var3);
            class310.field5291 = var7;
        }
        if (var2 == 28) {
            class89.field1470.method87(65280, 188);
            class89.field1470.method510(var3, 100);
            class250.field4203++;
            class262 var17 = class51.method374(98, var3);
            if (var17.field4394 != null && var17.field4394[0][0] == 5) {
                int var18 = var17.field4394[0][1];
                if (class286.field4920[var18] != var17.field4409[0]) {
                    class286.field4920[var18] = var17.field4409[0];
                    class17.method98(var18, (byte) 108);
                }
            }
        }
        if (var2 == 32) {
            class87.field1451++;
            class89.field1470.method87(65280, 122);
            class89.field1470.method509(var3, 112);
            class89.field1470.method513((byte) 57, var7);
            class89.field1470.method493(var4, (byte) 113);
            class170.field2867 = 0;
            class54.field896 = class51.method374(-86, var3);
            class310.field5291 = var7;
        }
        if (var2 == 36) {
            class233.method1704(class67.field1174, var7, var3);
        }
        if (var2 == 57) {
            class144.field2480 = true;
            class233.method1704(class67.field1174, var7, var3);
        }
        if (var2 == 37) {
            class295 var19 = class35.field521[var4];
            if (var19 != null) {
                class112.method870(0, field4831.field3236[0], (byte) 121, 1, false, 0, 2, 1, var19.field3236[0], 0, field4831.field3205[0], var19.field3205[0]);
                class213.field3624 = class39.field595;
                class213.field3625 = class271.field4685;
                class19.field249++;
                class99.field1642 = 2;
                class89.field1468 = 0;
                class89.field1470.method87(65280, 255);
                class89.field1470.method493(var4, (byte) 110);
            }
        }
        if (var2 == 42) {
            class96 var20 = class169.field2842[var4];
            if (var20 != null) {
                class112.method870(0, field4831.field3236[0], (byte) 125, 1, false, 0, 2, 1, var20.field3236[0], 0, field4831.field3205[0], var20.field3205[0]);
                class89.field1468 = 0;
                class213.field3625 = class271.field4685;
                class99.field1642 = 2;
                class213.field3624 = class39.field595;
                class10.field125++;
                class89.field1470.method87(65280, 152);
                class89.field1470.method513((byte) -127, var4);
            }
        }
        if (var2 == 38) {
            class189.method1428((byte) -53);
            class262 var21 = class51.method374(-75, var3);
            class13.field176 = 1;
            class50.field803 = var4;
            class158.field2715 = var3;
            class281.field4846 = var7;
            class291.method2027(var21, 14580);
            class237.field3994 = class66.method562((byte) 114, new class75[] { class98.field1631, class199.method1475(var4, (byte) -119).field4770, class216.field3702 });
            if (class237.field3994 == null) {
                class237.field3994 = class290.field4976;
            }
            return;
        }
        if (var2 == 1005) {
            class295.field5069++;
            class99.field1642 = 2;
            class213.field3625 = class271.field4685;
            class89.field1468 = 0;
            class213.field3624 = class39.field595;
            class89.field1470.method87(65280, 189);
            class89.field1470.method513((byte) 19, var4);
        }
        if (var2 == 18) {
            class89.field1470.method87(65280, 214);
            class304.field5194++;
            class89.field1470.method509(var3, 102);
            class89.field1470.method503(-597878072, var4);
            class89.field1470.method480((byte) -50, var7);
            class170.field2867 = 0;
            class54.field896 = class51.method374(-127, var3);
            class310.field5291 = var7;
        }
        if (var2 == 40) {
            class89.field1470.method87(65280, 178);
            class89.field1470.method513((byte) 87, var4);
            class41.field647++;
            class89.field1470.method509(var3, 107);
            class89.field1470.method493(var7, (byte) 92);
            class170.field2867 = 0;
            class54.field896 = class51.method374(125, var3);
            class310.field5291 = var7;
        }
        if (var2 == 4) {
            class96 var22 = class169.field2842[var4];
            if (var22 != null) {
                class130.field2250++;
                class112.method870(0, field4831.field3236[0], (byte) 127, 1, false, 0, 2, 1, var22.field3236[0], 0, field4831.field3205[0], var22.field3205[0]);
                class213.field3624 = class39.field595;
                class213.field3625 = class271.field4685;
                class99.field1642 = 2;
                class89.field1468 = 0;
                class89.field1470.method87(65280, 112);
                class89.field1470.method503(-597878072, var4);
            }
        }
        if (var2 == 11) {
            class89.field1470.method87(65280, 239);
            class89.field1470.method513((byte) 19, var4);
            class103.field1745++;
            class89.field1470.method527(34, var3);
            class89.field1470.method493(var7, (byte) 105);
            class170.field2867 = 0;
            class54.field896 = class51.method374(127, var3);
            class310.field5291 = var7;
        }
        if (var2 == 23) {
            class202.field3415++;
            class89.field1470.method87(65280, 170);
            class89.field1470.method480((byte) -50, class206.field3482);
            class89.field1470.method509(class29.field405, 59);
            class89.field1470.method510(var3, 123);
            class89.field1470.method503(-597878072, var7);
        }
        if (var2 == 43) {
            class221.field3767++;
            boolean var23 = class112.method870(0, field4831.field3236[0], (byte) 106, 0, false, 0, 2, 0, var7, 0, field4831.field3205[0], var3);
            if (!var23) {
                class112.method870(0, field4831.field3236[0], (byte) 118, 1, false, 0, 2, 1, var7, 0, field4831.field3205[0], var3);
            }
            class89.field1468 = 0;
            class99.field1642 = 2;
            class213.field3624 = class39.field595;
            class213.field3625 = class271.field4685;
            class89.field1470.method87(65280, 63);
            class89.field1470.method493(class275.field4737 + var7, (byte) 112);
            class89.field1470.method513((byte) 71, var4);
            class89.field1470.method480((byte) -50, var3 + class175.field2939);
        }
        if (var2 == 45) {
            class295 var25 = class35.field521[var4];
            if (var25 != null) {
                class95.field1543++;
                class112.method870(0, field4831.field3236[0], (byte) 127, 1, false, 0, 2, 1, var25.field3236[0], 0, field4831.field3205[0], var25.field3205[0]);
                class213.field3625 = class271.field4685;
                class89.field1468 = 0;
                class213.field3624 = class39.field595;
                class99.field1642 = 2;
                class89.field1470.method87(65280, 177);
                class89.field1470.method510(class29.field405, 71);
                class89.field1470.method513((byte) 97, class206.field3482);
                class89.field1470.method480((byte) -50, var4);
            }
        }
        if (var2 == 30) {
            class133.field2302++;
            class89.field1470.method87(65280, 211);
            class89.field1470.method509(var3, 34);
            class89.field1470.method510(class29.field405, -53);
            class89.field1470.method503(-597878072, var4);
            class89.field1470.method513((byte) 90, class206.field3482);
            class89.field1470.method513((byte) 47, var7);
            class170.field2867 = 0;
            class54.field896 = class51.method374(-46, var3);
            class310.field5291 = var7;
        }
        if (var2 == 31) {
            class64.method550(var3, var7, var5, -6980);
            class249.field4195++;
            class89.field1470.method87(65280, 43);
            class89.field1470.method503(-597878072, class275.field4737 + var7);
            class89.field1470.method493(class175.field2939 + var3, (byte) 106);
            class89.field1470.method503(-597878072, (int) (var5 >>> 32) & Integer.MAX_VALUE);
        }
        if (var2 == 19) {
            class96 var26 = class169.field2842[var4];
            if (var26 != null) {
                class6.field78++;
                class112.method870(0, field4831.field3236[0], (byte) 109, 1, false, 0, 2, 1, var26.field3236[0], 0, field4831.field3205[0], var26.field3205[0]);
                class213.field3624 = class39.field595;
                class99.field1642 = 2;
                class213.field3625 = class271.field4685;
                class89.field1468 = 0;
                class89.field1470.method87(65280, 104);
                class89.field1470.method509(class29.field405, 63);
                class89.field1470.method503(-597878072, class206.field3482);
                class89.field1470.method503(-597878072, var4);
            }
        }
        if (var2 == 46) {
            class96 var27 = class169.field2842[var4];
            if (var27 != null) {
                class287.field4945++;
                class112.method870(0, field4831.field3236[0], (byte) 109, 1, false, 0, 2, 1, var27.field3236[0], 0, field4831.field3205[0], var27.field3205[0]);
                class213.field3624 = class39.field595;
                class89.field1468 = 0;
                class99.field1642 = 2;
                class213.field3625 = class271.field4685;
                class89.field1470.method87(65280, 175);
                class89.field1470.method503(-597878072, var4);
                class89.field1470.method493(class281.field4846, (byte) 123);
                class89.field1470.method509(class158.field2715, 80);
                class89.field1470.method493(class50.field803, (byte) 109);
            }
        }
        if (var2 == 8) {
            class96 var28 = class169.field2842[var4];
            if (var28 != null) {
                class112.method870(0, field4831.field3236[0], (byte) 107, 1, false, 0, 2, 1, var28.field3236[0], 0, field4831.field3205[0], var28.field3205[0]);
                class213.field3625 = class271.field4685;
                class213.field3624 = class39.field595;
                class306.field5229++;
                class99.field1642 = 2;
                class89.field1468 = 0;
                class89.field1470.method87(65280, 233);
                class89.field1470.method493(var4, (byte) 83);
            }
        }
        if (var2 == 29) {
            class89.field1470.method87(65280, 166);
            class89.field1470.method503(-597878072, var4);
            class102.field1721++;
            class89.field1470.method527(28, var3);
            class89.field1470.method480((byte) -50, var7);
            class170.field2867 = 0;
            class54.field896 = class51.method374(-114, var3);
            class310.field5291 = var7;
        }
        if (var2 == 50) {
            class262 var29 = class51.method374(-15, var3);
            boolean var30 = true;
            if (var29.field4462 > 0) {
                var30 = class74.method607(var29, (byte) -126);
            }
            if (var30) {
                class250.field4203++;
                class89.field1470.method87(65280, 188);
                class89.field1470.method510(var3, -86);
            }
        }
        if (var2 == 22 || var2 == 1007) {
            class31.method209(var4, class94.field1521[arg0], 25014, var7, var3);
        }
        if (var2 == 15) {
            class130.field2251++;
            boolean var31 = class112.method870(0, field4831.field3236[0], (byte) 113, 0, false, 0, 2, 0, var7, 0, field4831.field3205[0], var3);
            if (!var31) {
                class112.method870(0, field4831.field3236[0], (byte) 116, 1, false, 0, 2, 1, var7, 0, field4831.field3205[0], var3);
            }
            class99.field1642 = 2;
            class213.field3624 = class39.field595;
            class89.field1468 = 0;
            class213.field3625 = class271.field4685;
            class89.field1470.method87(65280, 148);
            class89.field1470.method480((byte) -50, var4);
            class89.field1470.method513((byte) 71, class50.field803);
            class89.field1470.method480((byte) -50, class281.field4846);
            class89.field1470.method493(class175.field2939 + var3, (byte) 78);
            class89.field1470.method480((byte) -50, class275.field4737 + var7);
            class89.field1470.method509(class158.field2715, 62);
        }
        if (var2 == 14) {
            class205.field3471++;
            class89.field1470.method87(65280, 164);
            class89.field1470.method503(-597878072, var4);
            class89.field1470.method509(var3, 86);
            class89.field1470.method513((byte) 126, var7);
            class170.field2867 = 0;
            class54.field896 = class51.method374(-30, var3);
            class310.field5291 = var7;
        }
        if (var2 == 5) {
            class132.field2277++;
            boolean var33 = class112.method870(0, field4831.field3236[0], (byte) 110, 0, false, 0, 2, 0, var7, 0, field4831.field3205[0], var3);
            if (!var33) {
                class112.method870(0, field4831.field3236[0], (byte) 119, 1, false, 0, 2, 1, var7, 0, field4831.field3205[0], var3);
            }
            class99.field1642 = 2;
            class213.field3624 = class39.field595;
            class213.field3625 = class271.field4685;
            class89.field1468 = 0;
            class89.field1470.method87(65280, 5);
            class89.field1470.method513((byte) 64, var4);
            class89.field1470.method513((byte) 102, class275.field4737 + var7);
            class89.field1470.method503(-597878072, class175.field2939 + var3);
        }
        if (var2 == 1003) {
            class99.field1642 = 2;
            class213.field3624 = class39.field595;
            class89.field1468 = 0;
            class43.field708++;
            class213.field3625 = class271.field4685;
            class89.field1470.method87(65280, 48);
            class89.field1470.method480((byte) -50, var4);
        }
        if (var2 == 10) {
            class70.field1197++;
            class64.method550(var3, var7, var5, -6980);
            class89.field1470.method87(65280, 89);
            class89.field1470.method503(-597878072, var7 + class275.field4737);
            class89.field1470.method503(-597878072, class175.field2939 + var3);
            class89.field1470.method493(Integer.MAX_VALUE & (int) (var5 >>> 32), (byte) 90);
        }
        if (var2 == 16) {
            class89.field1470.method87(65280, 188);
            class89.field1470.method510(var3, -122);
            class262 var35 = class51.method374(-90, var3);
            class250.field4203++;
            if (var35.field4394 != null && var35.field4394[0][0] == 5) {
                int var36 = var35.field4394[0][1];
                class286.field4920[var36] = 1 - class286.field4920[var36];
                class17.method98(var36, (byte) 108);
            }
        }
        if (var2 == 24) {
            class65.field1127++;
            class89.field1470.method87(65280, 95);
            class89.field1470.method493(var7, (byte) 75);
            class89.field1470.method480((byte) -50, var4);
            class89.field1470.method527(68, var3);
            class170.field2867 = 0;
            class54.field896 = class51.method374(111, var3);
            class310.field5291 = var7;
        }
        if (var2 == 20) {
            class123.field2053++;
            class89.field1470.method87(65280, 1);
            class89.field1470.method510(var3, -108);
            class89.field1470.method503(-597878072, var4);
            class89.field1470.method493(var7, (byte) 109);
            class170.field2867 = 0;
            class54.field896 = class51.method374(-37, var3);
            class310.field5291 = var7;
        }
        if (var2 == 13) {
            class255.field4273++;
            boolean var37 = class112.method870(0, field4831.field3236[0], (byte) 117, 0, false, 0, 2, 0, var7, 0, field4831.field3205[0], var3);
            if (!var37) {
                class112.method870(0, field4831.field3236[0], (byte) 106, 1, false, 0, 2, 1, var7, 0, field4831.field3205[0], var3);
            }
            class213.field3624 = class39.field595;
            class89.field1468 = 0;
            class99.field1642 = 2;
            class213.field3625 = class271.field4685;
            class89.field1470.method87(65280, 90);
            class89.field1470.method503(-597878072, var4);
            class89.field1470.method527(95, class29.field405);
            class89.field1470.method480((byte) -50, class206.field3482);
            class89.field1470.method493(var7 + class275.field4737, (byte) 104);
            class89.field1470.method513((byte) -126, class175.field2939 + var3);
        }
        if (var2 == 34) {
            class96 var39 = class169.field2842[var4];
            if (var39 != null) {
                class112.method870(0, field4831.field3236[0], (byte) 114, 1, false, 0, 2, 1, var39.field3236[0], 0, field4831.field3205[0], var39.field3205[0]);
                class89.field1468 = 0;
                class267.field4600++;
                class213.field3624 = class39.field595;
                class213.field3625 = class271.field4685;
                class99.field1642 = 2;
                class89.field1470.method87(65280, 180);
                class89.field1470.method513((byte) 11, var4);
            }
        }
        if (var2 == 17 && class64.method550(var3, var7, var5, -6980)) {
            class233.field3942++;
            class89.field1470.method87(65280, 209);
            class89.field1470.method513((byte) 115, var7 + class275.field4737);
            class89.field1470.method503(-597878072, class206.field3482);
            class89.field1470.method480((byte) -50, class175.field2939 + var3);
            class89.field1470.method480((byte) -50, Integer.MAX_VALUE & (int) (var5 >>> 32));
            class89.field1470.method510(class29.field405, -34);
        }
        if (var2 == 1004) {
            class250.field4204++;
            class64.method550(var3, var7, var5, -6980);
            class89.field1470.method87(65280, 213);
            class89.field1470.method503(-597878072, class275.field4737 + var7);
            class89.field1470.method480((byte) -50, class175.field2939 + var3);
            class89.field1470.method513((byte) 86, Integer.MAX_VALUE & (int) (var5 >>> 32));
        }
        if (var2 == 6) {
            class96 var40 = class169.field2842[var4];
            if (var40 != null) {
                class292.field5005++;
                class112.method870(0, field4831.field3236[0], (byte) 111, 1, false, 0, 2, 1, var40.field3236[0], 0, field4831.field3205[0], var40.field3205[0]);
                class89.field1468 = 0;
                class213.field3625 = class271.field4685;
                class213.field3624 = class39.field595;
                class99.field1642 = 2;
                class89.field1470.method87(65280, 157);
                class89.field1470.method480((byte) -50, var4);
            }
        }
        if (var2 == 51) {
            class96 var41 = class169.field2842[var4];
            if (var41 != null) {
                class283.field4881++;
                class112.method870(0, field4831.field3236[0], (byte) 118, 1, false, 0, 2, 1, var41.field3236[0], 0, field4831.field3205[0], var41.field3205[0]);
                class213.field3624 = class39.field595;
                class213.field3625 = class271.field4685;
                class99.field1642 = 2;
                class89.field1468 = 0;
                class89.field1470.method87(65280, 215);
                class89.field1470.method480((byte) -50, var4);
            }
        }
        if (var2 == 1001) {
            class89.field1468 = 0;
            class213.field3625 = class271.field4685;
            class213.field3624 = class39.field595;
            class99.field1642 = 2;
            class295 var42 = class35.field521[var4];
            if (var42 != null) {
                class229 var43 = var42.field5070;
                if (var43.field3868 != null) {
                    var43 = var43.method1673(false);
                }
                if (var43 != null) {
                    class161.field2728++;
                    class89.field1470.method87(65280, 242);
                    class89.field1470.method503(-597878072, var43.field3838);
                }
            }
        }
        if (var2 == 41) {
            class295 var44 = class35.field521[var4];
            if (var44 != null) {
                class112.method870(0, field4831.field3236[0], (byte) 108, 1, false, 0, 2, 1, var44.field3236[0], 0, field4831.field3205[0], var44.field3205[0]);
                class99.field1642 = 2;
                class213.field3625 = class271.field4685;
                class213.field3624 = class39.field595;
                class89.field1468 = 0;
                class177.field2977++;
                class89.field1470.method87(65280, 73);
                class89.field1470.method513((byte) 33, class50.field803);
                class89.field1470.method527(67, class158.field2715);
                class89.field1470.method493(class281.field4846, (byte) 103);
                class89.field1470.method493(var4, (byte) 100);
            }
        }
        if (var2 == 2) {
            class156.field2671++;
            boolean var45 = class112.method870(0, field4831.field3236[0], (byte) 122, 0, false, 0, 2, 0, var7, 0, field4831.field3205[0], var3);
            if (!var45) {
                class112.method870(0, field4831.field3236[0], (byte) 127, 1, false, 0, 2, 1, var7, 0, field4831.field3205[0], var3);
            }
            class89.field1468 = 0;
            class213.field3624 = class39.field595;
            class99.field1642 = 2;
            class213.field3625 = class271.field4685;
            class89.field1470.method87(65280, 131);
            class89.field1470.method480((byte) -50, var3 + class175.field2939);
            class89.field1470.method493(var7 + class275.field4737, (byte) 89);
            class89.field1470.method503(-597878072, var4);
        }
        if (var2 == 7) {
            class89.field1470.method87(65280, 141);
            class89.field1470.method510(var3, -67);
            class134.field2304++;
            class89.field1470.method480((byte) -50, var4);
            class89.field1470.method503(-597878072, var7);
            class170.field2867 = 0;
            class54.field896 = class51.method374(118, var3);
            class310.field5291 = var7;
        }
        if (var2 == 21 && class286.field4929 == null) {
            class67.method568(var3, (byte) 59, var7);
            class286.field4929 = class161.method1208(var3, var7, (byte) 112);
            class291.method2027(class286.field4929, 14580);
        }
        if (var2 == 44) {
            class295 var47 = class35.field521[var4];
            if (var47 != null) {
                class112.method870(0, field4831.field3236[0], (byte) 115, 1, false, 0, 2, 1, var47.field3236[0], 0, field4831.field3205[0], var47.field3205[0]);
                class64.field1114++;
                class213.field3625 = class271.field4685;
                class99.field1642 = 2;
                class89.field1468 = 0;
                class213.field3624 = class39.field595;
                class89.field1470.method87(65280, 80);
                class89.field1470.method503(-597878072, var4);
            }
        }
        if (var2 == 1) {
            class96 var48 = class169.field2842[var4];
            if (var48 != null) {
                class303.field5190++;
                class112.method870(0, field4831.field3236[0], (byte) 115, 1, false, 0, 2, 1, var48.field3236[0], 0, field4831.field3205[0], var48.field3205[0]);
                class99.field1642 = 2;
                class89.field1468 = 0;
                class213.field3625 = class271.field4685;
                class213.field3624 = class39.field595;
                class89.field1470.method87(65280, 205);
                class89.field1470.method493(var4, (byte) 89);
            }
        }
        if (var2 == 12) {
            class89.field1470.method87(65280, 32);
            class89.field1470.method509(class158.field2715, 121);
            class9.field122++;
            class89.field1470.method513((byte) -1, class50.field803);
            class89.field1470.method493(class281.field4846, (byte) 98);
            class89.field1470.method510(var3, 126);
            class89.field1470.method480((byte) -50, var7);
            class89.field1470.method480((byte) -50, var4);
            class170.field2867 = 0;
            class54.field896 = class51.method374(112, var3);
            class310.field5291 = var7;
        }
        if (var2 == 58) {
            class64.method550(var3, var7, var5, -6980);
            class110.field1888++;
            class89.field1470.method87(65280, 105);
            class89.field1470.method503(-597878072, var7 + class275.field4737);
            class89.field1470.method513((byte) -1, Integer.MAX_VALUE & (int) (var5 >>> 32));
            class89.field1470.method480((byte) -50, class175.field2939 + var3);
        }
        if (class13.field176 != 0) {
            class13.field176 = 0;
            class291.method2027(class51.method374(98, class158.field2715), 14580);
        }
        if (class161.field2738) {
            class189.method1428((byte) -119);
        }
        if (class54.field896 != null && class170.field2867 == 0) {
            class291.method2027(class54.field896, 14580);
        }
    }
}
