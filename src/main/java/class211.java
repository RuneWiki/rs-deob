import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class211 {

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "Ltj;")
    private class180 field3338 = null;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "Z")
    private boolean field3331;

    @OriginalMember(owner = "client!lb", name = "O", descriptor = "Lih;")
    private class32 field3357;

    @OriginalMember(owner = "client!lb", name = "J", descriptor = "Z")
    private boolean field3352;

    @OriginalMember(owner = "client!lb", name = "D", descriptor = "J")
    public static long field3347 = 0L;

    @OriginalMember(owner = "client!lb", name = "I", descriptor = "Ljava/lang/String;")
    public static String field3351 = null;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
    public static int field3342 = -1;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!lb", name = "F", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!lb", name = "G", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!lb", name = "K", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!lb", name = "L", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!lb", name = "M", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!lb", name = "N", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!lb", name = "P", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!lb", name = "R", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!lb", name = "Q", descriptor = "[Ljava/lang/Object;")
    private Object[] field3359;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field3341;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLjava/lang/String;)I", line = 5)
    public final int method1499(byte arg0, String arg1) {
        field3356++;
        if (!this.method1527((byte) -80)) {
            return 0;
        } else if (arg0 == -67) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field3338.field2704.method2242(-16536, class126.method956((byte) 2, var3));
            return this.method1500(var4, 25715);
        } else {
            return -106;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)I", line = 22)
    private final int method1500(int arg0, int arg1) {
        field3324++;
        if (arg1 != 25715) {
            this.method1512((String) null, -24);
        }
        if (this.method1515(0, arg0)) {
            return this.field3359[arg0] == null ? this.field3357.method229(arg0, (byte) 0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 41)
    public final void method1501(int arg0) {
        if (arg0 != -1) {
            this.field3341 = (Object[][]) ((Object[][]) null);
        }
        if (this.field3341 != null) {
            for (int var2 = 0; var2 < this.field3341.length; var2++) {
                this.field3341[var2] = null;
            }
        }
        field3360++;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)V", line = 62)
    private final void method1502(int arg0, int arg1) {
        field3339++;
        if (arg0 != -1) {
            field3342 = -53;
        }
        this.field3357.method223(arg1, 4);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIIII)V", line = 75)
    public static final void method1503(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3346++;
        int var8 = class257.method1784((byte) 91, arg0, class34.field432, class75.field1064);
        int var9 = class257.method1784((byte) 91, arg6, class34.field432, class75.field1064);
        int var10 = class257.method1784((byte) 91, arg3, class298.field4667, class327.field5072);
        int var11 = class257.method1784((byte) 91, arg7, class298.field4667, class327.field5072);
        int var12 = class257.method1784((byte) 91, arg0 + arg1, class34.field432, class75.field1064);
        int var13 = class257.method1784((byte) 91, arg6 - arg1, class34.field432, class75.field1064);
        if (arg4 != 0) {
            return;
        }
        for (int var14 = var8; var14 < var12; var14++) {
            class138.method1047(arg5, var11, var10, 7, class320.field4990[var14]);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class138.method1047(arg5, var11, var10, 7, class320.field4990[var15]);
        }
        int var16 = class257.method1784((byte) 91, arg1 + arg3, class298.field4667, class327.field5072);
        int var17 = class257.method1784((byte) 91, arg7 - arg1, class298.field4667, class327.field5072);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class320.field4990[var18];
            class138.method1047(arg5, var16, var10, 7, var19);
            class138.method1047(arg2, var17, var16, 7, var19);
            class138.method1047(arg5, var11, var17, 7, var19);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)[B", line = 129)
    public final byte[] method1504(int arg0, int arg1, int arg2) {
        field3334++;
        if (!this.method1528(arg1, arg2, arg0)) {
            return null;
        }
        if (this.field3341[arg0] == null || this.field3341[arg0][arg1] == null) {
            boolean var4 = this.method1522((int[]) null, arg0, false);
            if (!var4) {
                this.method1517(false, arg0);
                boolean var5 = this.method1522((int[]) null, arg0, false);
                if (!var5) {
                    return null;
                }
            }
        }
        return class12.method92(this.field3341[arg0][arg1], false, (byte) -120);
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(II)[B", line = 160)
    public final byte[] method1505(int arg0, int arg1) {
        field3350++;
        if (!this.method1527((byte) -88)) {
            return null;
        } else if (this.field3338.field2711.length == 1) {
            return this.method1507(arg1, (byte) -126, 0);
        } else {
            int var3 = 122 / ((-arg0 - 51) / 43);
            if (!this.method1515(0, arg1)) {
                return null;
            } else if (this.field3338.field2711[arg1] == 1) {
                return this.method1507(0, (byte) -128, arg1);
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(III)Z", line = 193)
    public final boolean method1506(int arg0, int arg1, int arg2) {
        field3330++;
        if (arg0 >= -102) {
            this.field3357 = (class32) null;
        }
        if (!this.method1528(arg2, 0, arg1)) {
            return false;
        } else if (this.field3341[arg1] != null && this.field3341[arg1][arg2] != null) {
            return true;
        } else if (this.field3359[arg1] == null) {
            this.method1517(false, arg1);
            return this.field3359[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBI)[B", line = 223)
    public final byte[] method1507(int arg0, byte arg1, int arg2) {
        field3358++;
        int var4 = 96 / ((arg1 + 64) / 62);
        return this.method1511((int[]) null, -121, arg2, arg0);
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(II)[I", line = 234)
    public final int[] method1508(int arg0, int arg1) {
        field3336++;
        if (!this.method1515(arg0, arg1)) {
            return null;
        }
        int[] var3 = this.field3338.field2694[arg1];
        if (var3 == null) {
            var3 = new int[this.field3338.field2712[arg1]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)I", line = 263)
    public final int method1509(boolean arg0) {
        field3343++;
        if (arg0) {
            field3351 = (String) null;
        }
        if (!this.method1527((byte) -13)) {
            throw new IllegalStateException("");
        }
        return this.field3338.field2709;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)Z", line = 281)
    public static final boolean method1510(boolean arg0) throws IOException {
        field3335++;
        if (class297.field4661 == null) {
            return false;
        }
        int var1 = class297.field4661.method915(0);
        if (var1 == 0) {
            return false;
        }
        if (class138.field2146 == -1) {
            var1--;
            class297.field4661.method919(1, class88.field1293.field437, 10224, 0);
            class88.field1293.field455 = 0;
            class138.field2146 = class88.field1293.method67(true);
            class79.field1112 = class44.field692[class138.field2146];
        }
        if (class79.field1112 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class297.field4661.method919(1, class88.field1293.field437, 10224, 0);
            class79.field1112 = class88.field1293.field437[0] & 0xFF;
        }
        if (class79.field1112 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class297.field4661.method919(2, class88.field1293.field437, 10224, 0);
            class88.field1293.field455 = 0;
            class79.field1112 = class88.field1293.method300(-1394191632);
            var1 -= 2;
        }
        if (var1 < class79.field1112) {
            return false;
        }
        class88.field1293.field455 = 0;
        class297.field4661.method919(class79.field1112, class88.field1293.field437, 10224, 0);
        class270.field4083 = class320.field4983;
        class320.field4983 = class290.field4566;
        class109.field1705 = 0;
        class290.field4566 = class138.field2146;
        if (class138.field2146 == 35) {
            int var371 = class88.field1293.method300(-1394191632);
            int var372 = class88.field1293.method282(95);
            int var373 = class88.field1293.method258(437);
            if (class209.method1489(20, var373)) {
                class294.method2073(var371, var372, 1);
            }
            class138.field2146 = -1;
            return true;
        } else if (class138.field2146 == 121) {
            long var2 = class88.field1293.method289((byte) 126);
            String var4 = class48.method437(class59.method529(class294.method2072((byte) 81, class88.field1293), arg0));
            class38.method352(false, 6, var4, class188.method1358(95, var2));
            class138.field2146 = -1;
            return true;
        } else if (class138.field2146 == 14) {
            class20.method142(0);
            class138.field2146 = -1;
            return true;
        } else if (class138.field2146 == 232) {
            class274.method1907(21516);
            class75.field1061 = class88.field1293.method260((byte) 110);
            class138.field2146 = -1;
            class199.field3153 = class319.field4980;
            return true;
        } else if (class138.field2146 == 6) {
            class88.field1293.field455 += 28;
            if (class88.field1293.method255(40)) {
                class54.method481(class88.field1293, 126, class88.field1293.field455 - 28);
            }
            class138.field2146 = -1;
            return true;
        } else if (class138.field2146 == 205) {
            int var5 = class88.field1293.method300(-1394191632);
            if (var5 == 65535) {
                var5 = -1;
            }
            int var6 = class88.field1293.method286(-866);
            int var7 = var6 >> 2;
            int var8 = var6 & 0x3;
            int var9 = class27.field304[var7];
            int var10 = class88.field1293.method299(-116);
            int var11 = var10 >> 14 & 0x3FFF;
            int var12 = (var10 & 0x3C109CFE) >> 28;
            int var13 = var11 - class302.field4735;
            int var14 = var10 & 0x3FFF;
            int var15 = var14 - class110.field1744;
            class96.method763(var15, -3, var5, var12, var13, var9, var7, var8);
            class138.field2146 = -1;
            return true;
        } else if (class138.field2146 == 20) {
            int var366 = class88.field1293.method252((byte) 118);
            int var367 = class88.field1293.method282(-103);
            int var368 = class88.field1293.method258(437);
            int var369 = class88.field1293.method300(-1394191632);
            int var370 = class88.field1293.method252((byte) 127);
            if (class209.method1489(20, var366)) {
                class182.method1311(var369, 24161, var367, var370 | var368 << 16, 7);
            }
            class138.field2146 = -1;
            return true;
        } else if (class138.field2146 == 33) {
            int var16 = class88.field1293.method258(437);
            int var17 = class88.field1293.method245(-38);
            int var18 = class88.field1293.method252((byte) 123);
            if (class209.method1489(20, var18)) {
                class80.field1125 = var16;
                class136.field2125 = var17;
                if (class78.field1104 == 2) {
                    class203.field3227 = class136.field2125;
                    class89.field1299 = class80.field1125;
                }
                class150.method1110((byte) 123);
            }
            class138.field2146 = -1;
            return true;
        } else if (class138.field2146 == 145) {
            int var362 = class88.field1293.method252((byte) 115);
            int var363 = class88.field1293.method245(-117);
            int var364 = class88.field1293.method240((byte) -52);
            class45 var365 = class161.field2394[var362];
            if (var365 != null) {
                class40.method360(0, var363, var364, var365);
            }
            class138.field2146 = -1;
            return true;
        } else if (class138.field2146 == 184) {
            int var19 = class88.field1293.method300(-1394191632);
            if (class209.method1489(20, var19)) {
                class323.method2211((byte) -37);
            }
            class138.field2146 = -1;
            return true;
        } else if (class138.field2146 == 49) {
            int var359 = class88.field1293.method266(19439);
            int var360 = class88.field1293.method288(-99);
            int var361 = class88.field1293.method245(-56);
            if (class209.method1489(20, var361)) {
                class188.method1354(var359, 2, var360);
            }
            class138.field2146 = -1;
            return true;
        } else if (class138.field2146 == 191) {
            int var354 = class88.field1293.method300(-1394191632);
            int var355 = class88.field1293.method291(123);
            int var356 = class88.field1293.method245(-59);
            int var357 = class88.field1293.method252((byte) 121);
            int var358 = class88.field1293.method245(-32);
            if (class209.method1489(20, var356)) {
                class263.method1814(var355, -32462, var358, var357, var354);
            }
            class138.field2146 = -1;
            return true;
        } else if (class138.field2146 == 60) {
            int var353 = class88.field1293.method291(123);
            class297.field4662 = class301.field4715.method164(var353, -50);
            class138.field2146 = -1;
            return true;
        } else if (class138.field2146 == 224) {
            String var349 = class88.field1293.method279(87);
            int var350 = class88.field1293.method273(65280);
            int var351 = class88.field1293.method246(-18967);
            int var352 = class88.field1293.method300(-1394191632);
            if (var352 == 65535) {
                var352 = -1;
            }
            if (var351 >= 1 && var351 <= 8) {
                if (var349.equalsIgnoreCase("null")) {
                    var349 = null;
                }
                class10.field95[var351 - 1] = var349;
                class126.field2000[var351 - 1] = var352;
                class60.field893[var351 - 1] = var350 == 0;
            }
            class138.field2146 = -1;
            return true;
        } else if (class138.field2146 == 16) {
            class235.field3599 = class319.field4980;
            long var20 = class88.field1293.method289((byte) 126);
            if (var20 == 0L) {
                field3351 = null;
                class138.field2146 = -1;
                class317.field4927 = null;
                class51.field795 = null;
                class78.field1098 = 0;
                return true;
            }
            long var22 = class88.field1293.method289((byte) 126);
            class51.field795 = class92.method730(var22, -20313);
            field3351 = class92.method730(var20, -20313);
            class149.field2254 = class88.field1293.method242((byte) -93);
            int var24 = class88.field1293.method273(65280);
            if (var24 == 255) {
                class138.field2146 = -1;
                return true;
            }
            class175[] var25 = new class175[100];
            class78.field1098 = var24;
            for (int var26 = 0; var26 < class78.field1098; var26++) {
                var25[var26] = new class175();
                var25[var26].field3418 = class88.field1293.method289((byte) 126);
                var25[var26].field2587 = class92.method730(var25[var26].field3418, -20313);
                var25[var26].field2591 = class88.field1293.method300(-1394191632);
                var25[var26].field2590 = class88.field1293.method242((byte) -93);
                var25[var26].field2586 = class88.field1293.method279(121);
                if (class141.field2182 == var25[var26].field3418) {
                    class312.field4848 = var25[var26].field2590;
                }
            }
            boolean var27 = false;
            int var28 = class78.field1098;
            while (var28 > 0) {
                var28--;
                boolean var29 = true;
                for (int var30 = 0; var30 < var28; var30++) {
                    if (var25[var30].field2587.compareTo(var25[var30 + 1].field2587) > 0) {
                        var29 = false;
                        class175 var31 = var25[var30];
                        var25[var30] = var25[var30 + 1];
                        var25[var30 + 1] = var31;
                    }
                }
                if (var29) {
                    break;
                }
            }
            class317.field4927 = var25;
            class138.field2146 = -1;
            return true;
        } else if (class138.field2146 == 253) {
            int var347 = class88.field1293.method252((byte) 126);
            int var348 = class88.field1293.method240((byte) -83);
            class187.method1351(var348, var347, 21867);
            class138.field2146 = -1;
            return true;
        } else if (class138.field2146 == 40) {
            int var32 = class88.field1293.method282(119);
            int var33 = class88.field1293.method245(-96);
            int var34 = class88.field1293.method291(-54);
            if (class209.method1489(20, var33)) {
                class111 var35 = (class111) client.field3794.method203(1710, (long) var32);
                class111 var36 = (class111) client.field3794.method203(1710, (long) var34);
                if (var36 != null) {
                    class163.method1170((byte) 82, var36, var35 == null || var35.field1750 != var36.field1750);
                }
                if (var35 != null) {
                    var35.method1554((byte) -90);
                    client.field3794.method208(var35, (long) var34, 0);
                }
                class184 var37 = class100.method781((byte) 48, var32);
                if (var37 != null) {
                    class133.method1007(var37, 85);
                }
                class184 var38 = class100.method781((byte) 48, var34);
                if (var38 != null) {
                    class133.method1007(var38, 126);
                    class184.method1339(var38, true, (byte) -125);
                }
                if (class319.field4972 != -1) {
                    class243.method1685(1, -12359, class319.field4972);
                }
            }
            class138.field2146 = -1;
            return true;
        } else if (class138.field2146 == 113) {
            class291.field4577 = class79.field1112 / 8;
            for (int var39 = 0; var39 < class291.field4577; var39++) {
                class302.field4742[var39] = class88.field1293.method289((byte) 126);
                class190.field3041[var39] = class176.method1272((byte) -75, class302.field4742[var39]);
            }
            class271.field4090 = class319.field4980;
            class138.field2146 = -1;
            return true;
        } else if (class138.field2146 == 203) {
            class205.method1471((byte) -116);
            class138.field2146 = -1;
            return false;
        } else {
            if (!arg0) {
                field3347 = -28L;
            }
            if (class138.field2146 == 109) {
                long var331 = class88.field1293.method289((byte) 126);
                class88.field1293.method242((byte) -93);
                long var333 = class88.field1293.method289((byte) 126);
                long var335 = (long) class88.field1293.method300(-1394191632);
                long var337 = (long) class88.field1293.method269(false);
                int var339 = class88.field1293.method273(65280);
                long var340 = (var335 << 32) + var337;
                int var342 = class88.field1293.method300(-1394191632);
                boolean var343 = false;
                int var344 = 0;
                label1722: while (true) {
                    if (var344 >= 100) {
                        if (var339 <= 1) {
                            for (int var345 = 0; var345 < class291.field4577; var345++) {
                                if (class302.field4742[var345] == var331) {
                                    var343 = true;
                                    break label1722;
                                }
                            }
                        }
                        break;
                    }
                    if (class323.field5040[var344] == var340) {
                        var343 = true;
                        break;
                    }
                    var344++;
                }
                if (!var343 && class118.field1861 == 0) {
                    class323.field5040[class3.field9] = var340;
                    class3.field9 = (class3.field9 + 1) % 100;
                    String var346 = class69.method579(var342, -32761).method1689(80, class88.field1293);
                    if (var339 == 2 || var339 == 3) {
                        class320.method2190(class188.method1358(95, var333), var342, var346, "<img=1>" + class188.method1358(95, var331), 20, !arg0);
                    } else if (var339 == 1) {
                        class320.method2190(class188.method1358(95, var333), var342, var346, "<img=0>" + class188.method1358(95, var331), 20, !arg0);
                    } else {
                        class320.method2190(class188.method1358(95, var333), var342, var346, class188.method1358(95, var331), 20, false);
                    }
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 138) {
                int var40 = class88.field1293.method240((byte) 122);
                int var41 = class88.field1293.method291(123);
                int var42 = class88.field1293.method245(-30);
                if (class209.method1489(20, var42)) {
                    class291.method2055(var41, 7, var40);
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 64) {
                class261.field3864 = class88.field1293.method246(-18967);
                class72.field1043 = class88.field1293.method246(-18967);
                for (int var43 = class72.field1043; var43 < class72.field1043 + 8; var43++) {
                    for (int var44 = class261.field3864; var44 < (class261.field3864 + 8); var44++) {
                        if (class281.field4336[class50.field775][var43][var44] != null) {
                            class281.field4336[class50.field775][var43][var44] = null;
                            class182.method1313(var43, 1376312589, var44);
                        }
                    }
                }
                for (class152 var45 = (class152) class310.field4833.method986(!arg0); var45 != null; var45 = (class152) class310.field4833.method982(14877)) {
                    if (var45.field2288 >= class72.field1043 && (class72.field1043 + 8) > var45.field2288 && class261.field3864 <= var45.field2285 && (class261.field3864 + 8) > var45.field2285 && class50.field775 == var45.field2297) {
                        var45.field2284 = 0;
                    }
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 94) {
                int var326 = class88.field1293.method300(-1394191632);
                String var327 = class88.field1293.method279(79);
                Object[] var328 = new Object[var327.length() + 1];
                for (int var329 = var327.length() - 1; var329 >= 0; var329--) {
                    if (var327.charAt(var329) == 's') {
                        var328[var329 + 1] = class88.field1293.method279(98);
                    } else {
                        var328[var329 + 1] = Integer.valueOf(class88.field1293.method299(-113));
                    }
                }
                var328[0] = Integer.valueOf(class88.field1293.method299(-80));
                if (class209.method1489(20, var326)) {
                    class167 var330 = new class167();
                    var330.field2510 = var328;
                    class272.method1889(1, var330);
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 156) {
                String var46 = class88.field1293.method279(53);
                if (var46.endsWith(":tradereq:")) {
                    String var82 = var46.substring(0, var46.indexOf(":"));
                    long var83 = class224.method1597(arg0, var82);
                    boolean var85 = false;
                    for (int var86 = 0; var86 < class291.field4577; var86++) {
                        if (class302.field4742[var86] == var83) {
                            var85 = true;
                            break;
                        }
                    }
                    if (!var85 && class118.field1861 == 0) {
                        class38.method352(!arg0, 4, class277.field4249, var82);
                    }
                } else if (var46.endsWith(":chalreq:")) {
                    String var47 = var46.substring(0, var46.indexOf(":"));
                    long var48 = class224.method1597(true, var47);
                    boolean var50 = false;
                    for (int var51 = 0; var51 < class291.field4577; var51++) {
                        if (class302.field4742[var51] == var48) {
                            var50 = true;
                            break;
                        }
                    }
                    if (!var50 && class118.field1861 == 0) {
                        String var52 = var46.substring(var46.indexOf(":") + 1, var46.length() + -9);
                        class38.method352(false, 8, var52, var47);
                    }
                } else if (var46.endsWith(":assistreq:")) {
                    boolean var53 = false;
                    String var54 = var46.substring(0, var46.indexOf(":"));
                    long var55 = class224.method1597(true, var54);
                    for (int var57 = 0; var57 < class291.field4577; var57++) {
                        if (class302.field4742[var57] == var55) {
                            var53 = true;
                            break;
                        }
                    }
                    if (!var53 && class118.field1861 == 0) {
                        class38.method352(false, 10, "", var54);
                    }
                } else if (var46.endsWith(":clan:")) {
                    String var58 = var46.substring(0, var46.indexOf(":clan:"));
                    class38.method352(false, 11, var58, "");
                } else if (var46.endsWith(":trade:")) {
                    String var81 = var46.substring(0, var46.indexOf(":trade:"));
                    if (class118.field1861 == 0) {
                        class38.method352(false, 12, var81, "");
                    }
                } else if (var46.endsWith(":assist:")) {
                    String var59 = var46.substring(0, var46.indexOf(":assist:"));
                    if (class118.field1861 == 0) {
                        class38.method352(false, 13, var59, "");
                    }
                } else if (var46.endsWith(":duelstake:")) {
                    String var60 = var46.substring(0, var46.indexOf(":"));
                    long var61 = class224.method1597(true, var60);
                    boolean var63 = false;
                    for (int var64 = 0; var64 < class291.field4577; var64++) {
                        if (class302.field4742[var64] == var61) {
                            var63 = true;
                            break;
                        }
                    }
                    if (!var63 && class118.field1861 == 0) {
                        class38.method352(false, 14, "", var60);
                    }
                } else if (var46.endsWith(":duelfriend:")) {
                    String var76 = var46.substring(0, var46.indexOf(":"));
                    long var77 = class224.method1597(true, var76);
                    boolean var79 = false;
                    for (int var80 = 0; var80 < class291.field4577; var80++) {
                        if (class302.field4742[var80] == var77) {
                            var79 = true;
                            break;
                        }
                    }
                    if (!var79 && class118.field1861 == 0) {
                        class38.method352(false, 15, "", var76);
                    }
                } else if (var46.endsWith(":clanreq:")) {
                    String var65 = var46.substring(0, var46.indexOf(":"));
                    long var66 = class224.method1597(true, var65);
                    boolean var68 = false;
                    for (int var69 = 0; var69 < class291.field4577; var69++) {
                        if (class302.field4742[var69] == var66) {
                            var68 = true;
                            break;
                        }
                    }
                    if (!var68 && class118.field1861 == 0) {
                        class38.method352(false, 16, "", var65);
                    }
                } else if (var46.endsWith(":allyreq:")) {
                    String var70 = var46.substring(0, var46.indexOf(":"));
                    long var71 = class224.method1597(arg0, var70);
                    boolean var73 = false;
                    for (int var74 = 0; var74 < class291.field4577; var74++) {
                        if (class302.field4742[var74] == var71) {
                            var73 = true;
                            break;
                        }
                    }
                    if (!var73 && class118.field1861 == 0) {
                        String var75 = var46.substring(var46.indexOf(":") + 1, var46.length() + -9);
                        class38.method352(false, 21, var75, var70);
                    }
                } else {
                    class38.method352(false, 0, var46, "");
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 221) {
                class72.field1043 = class88.field1293.method273(65280);
                class261.field3864 = class88.field1293.method286(-866);
                while (class79.field1112 > class88.field1293.field455) {
                    class138.field2146 = class88.field1293.method273(65280);
                    class325.method2233(84);
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 37) {
                if (class79.field1112 == 0) {
                    class298.field4664 = class155.field2339;
                } else {
                    class298.field4664 = class88.field1293.method279(30);
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 24) {
                class32.method225(class301.field4715, -87, class88.field1293, class79.field1112);
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 110) {
                class274.method1907(21516);
                int var87 = class88.field1293.method240((byte) 83);
                int var88 = class88.field1293.method299(-69);
                int var89 = class88.field1293.method273(65280);
                class76.field1076[var87] = var88;
                class49.field755[var87] = var89;
                class118.field1859[var87] = 1;
                for (int var90 = 0; var90 < 98; var90++) {
                    if (var88 >= class257.field3835[var90]) {
                        class118.field1859[var87] = var90 + 2;
                    }
                }
                class252.field3770[class142.method1078(class79.field1113++, 31)] = var87;
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 198) {
                int var322 = class88.field1293.method245(-108);
                int var323 = class88.field1293.method273(65280);
                int var324 = class88.field1293.method258(437);
                if (class209.method1489(20, var322)) {
                    if (var323 == 2) {
                        class49.method453(-3);
                    }
                    class319.field4972 = var324;
                    class281.method1979(-5, var324);
                    class324.method2227(false, true);
                    class321.method2193(class319.field4972, 0);
                    for (int var325 = 0; var325 < 100; var325++) {
                        class40.field597[var325] = true;
                    }
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 231) {
                int var319 = class88.field1293.method299(-119);
                class184 var320 = class100.method781((byte) 48, var319);
                for (int var321 = 0; var321 < var320.field2903.length; var321++) {
                    var320.field2903[var321] = -1;
                    var320.field2903[var321] = 0;
                }
                class133.method1007(var320, 83);
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 5) {
                int var318 = class88.field1293.method258(437);
                class267.method1848(false, var318);
                class73.field1055[class142.method1078(31, class301.field4714++)] = class142.method1078(var318, 32767);
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 255) {
                if (class63.field951 != null) {
                    class94.method743(class6.field63, -1, 117, -1, false);
                }
                byte[] var316 = new byte[class79.field1112];
                class88.field1293.method62((byte) -52, class79.field1112, 0, var316);
                String var317 = class282.method1986(0, var316, -47, class79.field1112);
                if (class184.field2857 == null && class26.field298 == 3 || !class26.field294.startsWith("win") || class92.field1339) {
                    class80.method631(var317, true, (byte) 118);
                } else {
                    class137.field2134 = var317;
                    class45.field700 = true;
                    class138.field2159 = class301.field4715.method159(0, var317);
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 22) {
                class267.method1860((byte) 70);
                class274.method1907(21516);
                class297.field4663 += 32;
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 195) {
                int var313 = class88.field1293.method300(-1394191632);
                if (var313 == 65535) {
                    var313 = -1;
                }
                int var314 = class88.field1293.method273(65280);
                int var315 = class88.field1293.method300(-1394191632);
                class193.method1397(var314, var315, -87, var313);
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 182) {
                long var299 = class88.field1293.method289((byte) 126);
                long var301 = (long) class88.field1293.method300(-1394191632);
                boolean var303 = false;
                long var304 = (long) class88.field1293.method269(!arg0);
                int var306 = class88.field1293.method273(65280);
                long var307 = (var301 << 32) + var304;
                int var309 = class88.field1293.method300(-1394191632);
                int var310 = 0;
                label1619: while (true) {
                    if (var310 >= 100) {
                        if (var306 <= 1) {
                            for (int var311 = 0; var311 < class291.field4577; var311++) {
                                if (class302.field4742[var311] == var299) {
                                    var303 = true;
                                    break label1619;
                                }
                            }
                        }
                        break;
                    }
                    if (class323.field5040[var310] == var307) {
                        var303 = true;
                        break;
                    }
                    var310++;
                }
                if (!var303 && class118.field1861 == 0) {
                    class323.field5040[class3.field9] = var307;
                    class3.field9 = (class3.field9 + 1) % 100;
                    String var312 = class69.method579(var309, -32761).method1689(80, class88.field1293);
                    if (var306 == 2) {
                        class320.method2190((String) null, var309, var312, "<img=1>" + class188.method1358(95, var299), 18, false);
                    } else if (var306 == 1) {
                        class320.method2190((String) null, var309, var312, "<img=0>" + class188.method1358(95, var299), 18, false);
                    } else {
                        class320.method2190((String) null, var309, var312, class188.method1358(95, var299), 18, false);
                    }
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 30) {
                int var296 = class88.field1293.method252((byte) 115);
                int var297 = class88.field1293.method273(65280);
                int var298 = class88.field1293.method245(-113);
                if (class209.method1489(20, var298)) {
                    class213.method1541(var296, -16969, var297);
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 216) {
                class274.method1907(21516);
                class271.field4092 = class88.field1293.method273(65280);
                class138.field2146 = -1;
                class199.field3153 = class319.field4980;
                return true;
            } else if (class138.field2146 == 171) {
                int var91 = class88.field1293.method258(437);
                int var92 = class88.field1293.method240((byte) -119);
                if (class209.method1489(20, var91)) {
                    class190.field3038 = var92;
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 124) {
                int var93 = class88.field1293.method300(-1394191632);
                int var94 = class88.field1293.method273(65280);
                int var95 = class88.field1293.method273(65280);
                int var96 = class88.field1293.method300(-1394191632);
                int var97 = class88.field1293.method273(65280);
                int var98 = class88.field1293.method273(65280);
                if (class209.method1489(20, var93)) {
                    class222.method1582(var96, var97, var95, 16, var98, true, var94);
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 31) {
                class327.field5075 = 0;
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 66) {
                long var277 = class88.field1293.method289((byte) 126);
                int var279 = class88.field1293.method300(-1394191632);
                int var280 = class88.field1293.method273(65280);
                boolean var281 = true;
                if (var277 < 0L) {
                    var277 &= Long.MAX_VALUE;
                    var281 = false;
                }
                String var282 = "";
                if (var279 > 0) {
                    var282 = class88.field1293.method279(73);
                }
                String var283 = class188.method1358(95, var277);
                for (int var284 = 0; var284 < class314.field4873; var284++) {
                    if (class37.field549[var284] == var277) {
                        if (class299.field4709[var284] != var279) {
                            class299.field4709[var284] = var279;
                            if (var279 > 0) {
                                class38.method352(false, 5, var283 + class77.field1083, "");
                            }
                            if (var279 == 0) {
                                class38.method352(!arg0, 5, var283 + class261.field3865, "");
                            }
                        }
                        class34.field430[var284] = var282;
                        class171.field2541[var284] = var280;
                        class270.field4077[var284] = var281;
                        var283 = null;
                        break;
                    }
                }
                if (var283 != null && class314.field4873 < 200) {
                    class37.field549[class314.field4873] = var277;
                    class119.field1874[class314.field4873] = var283;
                    class299.field4709[class314.field4873] = var279;
                    class34.field430[class314.field4873] = var282;
                    class171.field2541[class314.field4873] = var280;
                    class270.field4077[class314.field4873] = var281;
                    class314.field4873++;
                }
                int var285 = class314.field4873;
                class271.field4090 = class319.field4980;
                boolean var286 = false;
                while (var285 > 0) {
                    boolean var287 = true;
                    var285--;
                    for (int var288 = 0; var288 < var285; var288++) {
                        if (class299.field4709[var288] != class73.field1051 && class299.field4709[var288 + 1] == class73.field1051 || class299.field4709[var288] == 0 && class299.field4709[var288 + 1] != 0) {
                            int var289 = class299.field4709[var288];
                            var287 = false;
                            class299.field4709[var288] = class299.field4709[var288 + 1];
                            class299.field4709[var288 + 1] = var289;
                            String var290 = class34.field430[var288];
                            class34.field430[var288] = class34.field430[var288 + 1];
                            class34.field430[var288 + 1] = var290;
                            String var291 = class119.field1874[var288];
                            class119.field1874[var288] = class119.field1874[var288 + 1];
                            class119.field1874[var288 + 1] = var291;
                            long var292 = class37.field549[var288];
                            class37.field549[var288] = class37.field549[var288 + 1];
                            class37.field549[var288 + 1] = var292;
                            int var294 = class171.field2541[var288];
                            class171.field2541[var288] = class171.field2541[var288 + 1];
                            class171.field2541[var288 + 1] = var294;
                            boolean var295 = class270.field4077[var288];
                            class270.field4077[var288] = class270.field4077[var288 + 1];
                            class270.field4077[var288 + 1] = var295;
                        }
                    }
                    if (var287) {
                        break;
                    }
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 241) {
                long var264 = class88.field1293.method289((byte) 126);
                boolean var266 = false;
                long var267 = (long) class88.field1293.method300(-1394191632);
                long var269 = (long) class88.field1293.method269(!arg0);
                int var271 = class88.field1293.method273(65280);
                long var272 = (var267 << 32) + var269;
                int var274 = 0;
                label1560: while (true) {
                    if (var274 < 100) {
                        if (class323.field5040[var274] != var272) {
                            var274++;
                            continue;
                        }
                        var266 = true;
                        break;
                    }
                    if (var271 <= 1) {
                        if ((!class319.field4965 || class209.field3295) && !class238.field3622) {
                            for (int var275 = 0; var275 < class291.field4577; var275++) {
                                if (class302.field4742[var275] == var264) {
                                    var266 = true;
                                    break label1560;
                                }
                            }
                        } else {
                            var266 = true;
                        }
                    }
                    break;
                }
                if (!var266 && class118.field1861 == 0) {
                    class323.field5040[class3.field9] = var272;
                    class3.field9 = (class3.field9 + 1) % 100;
                    String var276 = class48.method437(class59.method529(class294.method2072((byte) 81, class88.field1293), true));
                    if (var271 == 2 || var271 == 3) {
                        class38.method352(false, 7, var276, "<img=1>" + class188.method1358(95, var264));
                    } else if (var271 == 1) {
                        class38.method352(false, 7, var276, "<img=0>" + class188.method1358(95, var264));
                    } else {
                        class38.method352(false, 3, var276, class188.method1358(95, var264));
                    }
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 169) {
                int var261 = class88.field1293.method291(121);
                int var262 = class88.field1293.method300(-1394191632);
                if (var262 == 65535) {
                    var262 = -1;
                }
                int var263 = class88.field1293.method252((byte) 121);
                if (class209.method1489(20, var263)) {
                    class182.method1311(-1, 24161, var261, var262, 1);
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 176) {
                int var255 = class88.field1293.method300(-1394191632);
                int var256 = class88.field1293.method273(65280);
                int var257 = class88.field1293.method273(65280);
                int var258 = class88.field1293.method273(65280);
                int var259 = class88.field1293.method273(65280);
                int var260 = class88.field1293.method300(-1394191632);
                if (class209.method1489(20, var255)) {
                    class268.field4041[var256] = true;
                    class235.field3604[var256] = var257;
                    class152.field2291[var256] = var258;
                    class230.field3552[var256] = var259;
                    class71.field1033[var256] = var260;
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 206) {
                int var99 = class88.field1293.method246(-18967);
                int var100 = class88.field1293.method240((byte) 76);
                int var101 = class88.field1293.method240((byte) -126);
                class50.field775 = var100 >> 1;
                class235.field3602.method932((byte) 72, var101, var99, (var100 & 0x1) == 1);
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 148) {
                int var102 = class88.field1293.method300(-1394191632);
                int var103 = class88.field1293.method273(65280);
                int var104 = class88.field1293.method273(65280);
                int var105 = class88.field1293.method300(-1394191632);
                int var106 = class88.field1293.method273(65280);
                int var107 = class88.field1293.method273(65280);
                if (class209.method1489(20, var102)) {
                    class208.method1484(var107, -109, var104, var105, var103, var106);
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 237) {
                long var108 = class88.field1293.method289((byte) 126);
                int var110 = class88.field1293.method300(-1394191632);
                String var111 = class69.method579(var110, -32761).method1689(80, class88.field1293);
                class320.method2190((String) null, var110, var111, class188.method1358(95, var108), 19, false);
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 39) {
                int var253 = class88.field1293.method300(-1394191632);
                byte var254 = class88.field1293.method294(84);
                class309.method2144(-377, var254, var253);
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 181) {
                int var250 = class88.field1293.method245(-93);
                int var251 = class88.field1293.method252((byte) 122);
                int var252 = class88.field1293.method291(127);
                if (class209.method1489(20, var250)) {
                    class288.method2032(var251, var252, -125);
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 193) {
                class3.field14 = class88.field1293.method273(65280);
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 120) {
                int var112 = class88.field1293.method245(-124);
                if (var112 == 65535) {
                    var112 = -1;
                }
                class276.method1931(2, var112);
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 116) {
                int var113 = class88.field1293.method300(-1394191632);
                if (var113 == 65535) {
                    var113 = -1;
                }
                int var114 = class88.field1293.method239(-854568060);
                class69.method577(0, var114, var113);
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 143) {
                int var242 = class88.field1293.method299(-109);
                int var243 = class88.field1293.method300(-1394191632);
                class184 var244;
                if (var242 < 0) {
                    var244 = null;
                } else {
                    var244 = class100.method781((byte) 48, var242);
                }
                if (var244 != null) {
                    for (int var245 = 0; var245 < var244.field2903.length; var245++) {
                        var244.field2903[var245] = 0;
                        var244.field2856[var245] = 0;
                    }
                }
                if (var242 < -70000) {
                    var243 += 32768;
                }
                class173.method1260(33, var243);
                int var246 = class88.field1293.method300(-1394191632);
                for (int var247 = 0; var247 < var246; var247++) {
                    int var248 = class88.field1293.method245(-17);
                    int var249 = class88.field1293.method273(65280);
                    if (var249 == 255) {
                        var249 = class88.field1293.method288(-95);
                    }
                    if (var244 != null && var247 < var244.field2903.length) {
                        var244.field2903[var247] = var248;
                        var244.field2856[var247] = var249;
                    }
                    class277.method1948(var248 - 1, var247, (byte) 45, var249, var243);
                }
                if (var244 != null) {
                    class133.method1007(var244, 122);
                }
                class274.method1907(21516);
                class73.field1055[class142.method1078(31, class301.field4714++)] = class142.method1078(var243, 32767);
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 249) {
                class81.method635(true, true);
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 1) {
                long var227 = class88.field1293.method289((byte) 127);
                class88.field1293.method242((byte) -93);
                long var229 = class88.field1293.method289((byte) 127);
                long var231 = (long) class88.field1293.method300(-1394191632);
                long var233 = (long) class88.field1293.method269(!arg0);
                long var235 = (var231 << 32) + var233;
                int var237 = class88.field1293.method273(65280);
                boolean var238 = false;
                int var239 = 0;
                label1503: while (true) {
                    if (var239 < 100) {
                        if (class323.field5040[var239] != var235) {
                            var239++;
                            continue;
                        }
                        var238 = true;
                        break;
                    }
                    if (var237 <= 1) {
                        if ((!class319.field4965 || class209.field3295) && !class238.field3622) {
                            for (int var240 = 0; var240 < class291.field4577; var240++) {
                                if (class302.field4742[var240] == var227) {
                                    var238 = true;
                                    break label1503;
                                }
                            }
                        } else {
                            var238 = true;
                        }
                    }
                    break;
                }
                if (!var238 && class118.field1861 == 0) {
                    class323.field5040[class3.field9] = var235;
                    class3.field9 = (class3.field9 + 1) % 100;
                    String var241 = class48.method437(class59.method529(class294.method2072((byte) 81, class88.field1293), true));
                    if (var237 == 2 || var237 == 3) {
                        class38.method353(class188.method1358(95, var229), var241, 9, (byte) -97, "<img=1>" + class188.method1358(95, var227));
                    } else if (var237 == 1) {
                        class38.method353(class188.method1358(95, var229), var241, 9, (byte) -122, "<img=0>" + class188.method1358(95, var227));
                    } else {
                        class38.method353(class188.method1358(95, var229), var241, 9, (byte) -119, class188.method1358(95, var227));
                    }
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 12) {
                if (class319.field4972 != -1) {
                    class243.method1685(0, -12359, class319.field4972);
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 239) {
                class32.field406 = class88.field1293.method258(437) * 30;
                class138.field2146 = -1;
                class199.field3153 = class319.field4980;
                return true;
            } else if (class138.field2146 == 99) {
                int var217 = class88.field1293.method300(-1394191632);
                int var218 = class88.field1293.method291(123);
                if (var217 == 65535) {
                    var217 = -1;
                }
                int var219 = class88.field1293.method288(-89);
                int var220 = class88.field1293.method252((byte) 116);
                int var221 = class88.field1293.method245(-99);
                if (var220 == 65535) {
                    var220 = -1;
                }
                if (class209.method1489(20, var221)) {
                    for (int var222 = var220; var222 <= var217; var222++) {
                        long var223 = ((long) var219 << 32) + (long) var222;
                        class276 var225 = (class276) class76.field1074.method203(1710, var223);
                        class276 var226;
                        if (var225 != null) {
                            var226 = new class276(var218, var225.field4237);
                            var225.method1554((byte) -120);
                        } else if (var222 == -1) {
                            var226 = new class276(var218, class100.method781((byte) 48, var219).field2833.field4237);
                        } else {
                            var226 = new class276(var218, -1);
                        }
                        class76.field1074.method208(var226, var223, 0);
                    }
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 41) {
                class265.method1833(class88.field1293.method279(73), 95);
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 132 || class138.field2146 == 98 || class138.field2146 == 53 || class138.field2146 == 52 || class138.field2146 == 56 || class138.field2146 == 29 || class138.field2146 == 210 || class138.field2146 == 101 || class138.field2146 == 18 || class138.field2146 == 61 || class138.field2146 == 88 || class138.field2146 == 165 || class138.field2146 == 70) {
                class325.method2233(127);
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 230) {
                int var115 = class88.field1293.method299(-79);
                int var116 = class88.field1293.method300(-1394191632);
                if (var115 < -70000) {
                    var116 += 32768;
                }
                class184 var117;
                if (var115 < 0) {
                    var117 = null;
                } else {
                    var117 = class100.method781((byte) 48, var115);
                }
                while (class88.field1293.field455 < class79.field1112) {
                    int var118 = class88.field1293.method241(0);
                    int var119 = class88.field1293.method300(-1394191632);
                    int var120 = 0;
                    if (var119 != 0) {
                        var120 = class88.field1293.method273(65280);
                        if (var120 == 255) {
                            var120 = class88.field1293.method299(-101);
                        }
                    }
                    if (var117 != null && var118 >= 0 && var117.field2903.length > var118) {
                        var117.field2903[var118] = var119;
                        var117.field2856[var118] = var120;
                    }
                    class277.method1948(var119 - 1, var118, (byte) 45, var120, var116);
                }
                if (var117 != null) {
                    class133.method1007(var117, 119);
                }
                class274.method1907(21516);
                class73.field1055[class142.method1078(31, class301.field4714++)] = class142.method1078(var116, 32767);
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 164) {
                int var214 = class88.field1293.method300(-1394191632);
                String var215 = class88.field1293.method279(50);
                int var216 = class88.field1293.method245(-62);
                if (class209.method1489(20, var216)) {
                    class109.method848(var215, var214, 2);
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 141) {
                String var211 = class88.field1293.method279(65);
                int var212 = class88.field1293.method245(-123);
                int var213 = class88.field1293.method282(-128);
                if (class209.method1489(20, var212)) {
                    class322.method2197(116, var213, var211);
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 177) {
                int var210 = class88.field1293.method273(65280);
                if (class88.field1293.method273(65280) == 0) {
                    class37.field552[var210] = new class304();
                } else {
                    class88.field1293.field455--;
                    class37.field552[var210] = new class304(class88.field1293);
                }
                class138.field2146 = -1;
                class245.field3693 = class319.field4980;
                return true;
            } else if (class138.field2146 == 192) {
                int var208 = class88.field1293.method245(-28);
                int var209 = class88.field1293.method282(109);
                class187.method1351(var209, var208, 21867);
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 170) {
                class323.method2207(0);
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 2) {
                int var204 = class88.field1293.method282(-42);
                int var205 = class88.field1293.method258(437);
                int var206 = class88.field1293.method258(437);
                int var207 = class88.field1293.method245(-88);
                if (class209.method1489(20, var206)) {
                    class12.method93((var205 << 16) + var207, -110, var204);
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 167) {
                int var121 = class88.field1293.method300(-1394191632);
                int var122 = class88.field1293.method282(-74);
                int var123 = class88.field1293.method245(-118);
                if (var123 == 65535) {
                    var123 = -1;
                }
                if (class209.method1489(20, var121)) {
                    class182.method1311(-1, 24161, var122, var123, 2);
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 27) {
                int var124 = class88.field1293.method245(-30);
                int var125 = class88.field1293.method300(-1394191632);
                int var126 = class88.field1293.method282(-96);
                int var127 = class88.field1293.method245(-79);
                if ((var126 >> 30) != 0) {
                    int var138 = var126 >> 28 & 0x3;
                    int var139 = (var126 >> 14 & 0x3FFF) - class302.field4735;
                    int var140 = (var126 & 0x3FFF) - class110.field1744;
                    if (var139 >= 0 && var140 >= 0 && var139 < 104 && var140 < 104) {
                        int var141 = var140 * 128 + 64;
                        int var142 = var139 * 128 + 64;
                        class67 var143 = new class67(var127, var138, var142, var141, class294.method2080(899, var141, var142, var138) - var125, var124, class312.field4852);
                        class159.field2376.method977(4, new class156(var143));
                    }
                } else if ((var126 >> 29) != 0) {
                    int var133 = var126 & 0xFFFF;
                    class45 var134 = class161.field2394[var133];
                    if (var134 != null) {
                        boolean var135 = true;
                        if (var127 == 65535) {
                            var127 = -1;
                        }
                        if (var127 != -1 && var134.field4526 != -1 && class173.method1259((byte) 119, class99.method778(20951, var127).field4050).field2405 < class173.method1259((byte) 119, class99.method778(20951, var134.field4526).field4050).field2405) {
                            var135 = false;
                        }
                        if (var135) {
                            var134.field4509 = var125;
                            var134.field4482 = 0;
                            var134.field4466 = class312.field4852 + var124;
                            if (class312.field4852 < var134.field4466) {
                                var134.field4482 = -1;
                            }
                            var134.field4526 = var127;
                            var134.field4533 = 0;
                            var134.field4480 = 1;
                            if (var134.field4526 != -1 && class312.field4852 == var134.field4466) {
                                int var136 = class99.method778(20951, var134.field4526).field4050;
                                if (var136 != -1) {
                                    class162 var137 = class173.method1259((byte) 119, var136);
                                    if (var137 != null && var137.field2401 != null) {
                                        class158.method1143(var134.field4496, 88, var134.field4507, var137, false, 0);
                                    }
                                }
                            }
                        }
                    }
                } else if (var126 >> 28 != 0) {
                    int var128 = var126 & 0xFFFF;
                    class121 var129;
                    if (class196.field3111 == var128) {
                        var129 = class235.field3602;
                    } else {
                        var129 = class319.field4964[var128];
                    }
                    if (var129 != null) {
                        if (var127 == 65535) {
                            var127 = -1;
                        }
                        boolean var130 = true;
                        if (var127 != -1 && var129.field4526 != -1 && class173.method1259((byte) 119, class99.method778(20951, var127).field4050).field2405 < class173.method1259((byte) 119, class99.method778(20951, var129.field4526).field4050).field2405) {
                            var130 = false;
                        }
                        if (var130) {
                            var129.field4480 = 1;
                            var129.field4526 = var127;
                            var129.field4482 = 0;
                            var129.field4509 = var125;
                            var129.field4533 = 0;
                            var129.field4466 = class312.field4852 + var124;
                            if (class312.field4852 < var129.field4466) {
                                var129.field4482 = -1;
                            }
                            if (var129.field4526 == 65535) {
                                var129.field4526 = -1;
                            }
                            if (var129.field4526 != -1 && class312.field4852 == var129.field4466) {
                                int var131 = class99.method778(20951, var129.field4526).field4050;
                                if (var131 != -1) {
                                    class162 var132 = class173.method1259((byte) 119, var131);
                                    if (var132 != null && var132.field2401 != null) {
                                        class158.method1143(var129.field4496, 125, var129.field4507, var132, class235.field3602 == var129, 0);
                                    }
                                }
                            }
                        }
                    }
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 179) {
                int var201 = class88.field1293.method300(-1394191632);
                int var202 = class88.field1293.method299(-70);
                if (class209.method1489(20, var201)) {
                    class111 var203 = (class111) client.field3794.method203(1710, (long) var202);
                    if (var203 != null) {
                        class163.method1170((byte) 84, var203, true);
                    }
                    if (class20.field227 != null) {
                        class133.method1007(class20.field227, 64);
                        class20.field227 = null;
                    }
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 50) {
                for (int var144 = 0; var144 < class319.field4964.length; var144++) {
                    if (class319.field4964[var144] != null) {
                        class319.field4964[var144].field4439 = -1;
                    }
                }
                for (int var145 = 0; var145 < class161.field2394.length; var145++) {
                    if (class161.field2394[var145] != null) {
                        class161.field2394[var145].field4439 = -1;
                    }
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 3) {
                int var146 = class88.field1293.method282(-80);
                int var147 = class88.field1293.method300(-1394191632);
                int var148 = class88.field1293.method272(255);
                int var149 = class88.field1293.method260((byte) -33);
                if (class209.method1489(20, var147)) {
                    class96.method765(var146, var148, 24834, var149);
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 218) {
                class64.field955 = class88.field1293.method273(65280);
                class271.field4090 = class319.field4980;
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 126) {
                int var150 = class88.field1293.method300(-1394191632);
                if (var150 == 65535) {
                    var150 = -1;
                }
                int var151 = class88.field1293.method258(437);
                if (var151 == 65535) {
                    var151 = -1;
                }
                int var152 = class88.field1293.method245(-62);
                int var153 = class88.field1293.method291(124);
                int var154 = class88.field1293.method258(437);
                if (class209.method1489(20, var152)) {
                    for (int var155 = var151; var155 <= var150; var155++) {
                        long var156 = ((long) var153 << 32) + (long) var155;
                        class276 var158 = (class276) class76.field1074.method203(1710, var156);
                        class276 var159;
                        if (var158 != null) {
                            var159 = new class276(var158.field4234, var154);
                            var158.method1554((byte) -24);
                        } else if (var155 == -1) {
                            var159 = new class276(class100.method781((byte) 48, var153).field2833.field4234, var154);
                        } else {
                            var159 = new class276(0, var154);
                        }
                        class76.field1074.method208(var159, var156, 0);
                    }
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 103) {
                int var160 = class88.field1293.method300(-1394191632);
                int var161 = class88.field1293.method299(-100);
                int var162 = class88.field1293.method258(437);
                if (var162 == 65535) {
                    var162 = -1;
                }
                int var163 = class88.field1293.method299(-85);
                if (class209.method1489(20, var160)) {
                    class184 var164 = class100.method781((byte) 48, var161);
                    if (var164.field2802) {
                        class319.method2187(9, var163, var162, var161);
                        class274 var166 = class225.method1603(var162, 0);
                        class263.method1814(var161, -32462, var166.field4167, var166.field4210, var166.field4201);
                        class158.method1141(10, var161, var166.field4185, var166.field4196, var166.field4154);
                    } else if (var162 == -1) {
                        class138.field2146 = -1;
                        var164.field2930 = 0;
                        return true;
                    } else {
                        class274 var165 = class225.method1603(var162, 0);
                        var164.field2879 = var165.field4210 * 100 / var163;
                        var164.field2941 = var165.field4201;
                        var164.field2930 = 4;
                        var164.field2878 = var165.field4167;
                        var164.field2798 = var162;
                        class133.method1007(var164, 109);
                    }
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 244) {
                String var167 = class88.field1293.method279(61);
                int var168 = class88.field1293.method258(437);
                int var169 = class88.field1293.method258(437);
                if (class209.method1489(20, var169)) {
                    class109.method848(var167, var168, 2);
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 36) {
                class72.field1043 = class88.field1293.method286(-866);
                class261.field3864 = class88.field1293.method286(-866);
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 226) {
                int var170 = class88.field1293.method245(-118);
                int var171 = class88.field1293.method291(-118);
                class309.method2144(-377, var171, var170);
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 58) {
                int var172 = class88.field1293.method273(65280);
                int var173 = var172 >> 6;
                class273 var174 = new class273();
                var174.field4132 = var172 & 0x3F;
                var174.field4127 = class88.field1293.method273(65280);
                if (var174.field4127 >= 0 && var174.field4127 < class163.field2432.length) {
                    if (var174.field4132 == 1 || var174.field4132 == 10) {
                        var174.field4136 = class88.field1293.method300(-1394191632);
                        class88.field1293.field455 += 3;
                    } else if (var174.field4132 >= 2 && var174.field4132 <= 6) {
                        if (var174.field4132 == 2) {
                            var174.field4142 = 64;
                            var174.field4131 = 64;
                        }
                        if (var174.field4132 == 3) {
                            var174.field4142 = 64;
                            var174.field4131 = 0;
                        }
                        if (var174.field4132 == 4) {
                            var174.field4131 = 128;
                            var174.field4142 = 64;
                        }
                        if (var174.field4132 == 5) {
                            var174.field4142 = 0;
                            var174.field4131 = 64;
                        }
                        if (var174.field4132 == 6) {
                            var174.field4142 = 128;
                            var174.field4131 = 64;
                        }
                        var174.field4132 = 2;
                        var174.field4139 = class88.field1293.method300(-1394191632);
                        var174.field4140 = class88.field1293.method300(-1394191632);
                        var174.field4134 = class88.field1293.method273(65280);
                    }
                    var174.field4135 = class88.field1293.method300(-1394191632);
                    if (var174.field4135 == 65535) {
                        var174.field4135 = -1;
                    }
                    class141.field2185[var173] = var174;
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 160) {
                int var196 = class88.field1293.method291(-5);
                int var197 = class88.field1293.method258(437);
                int var198 = class88.field1293.method245(-26);
                int var199 = class88.field1293.method273(65280);
                if (class209.method1489(20, var198)) {
                    class111 var200 = (class111) client.field3794.method203(1710, (long) var196);
                    if (var200 != null) {
                        class163.method1170((byte) 98, var200, var200.field1750 != var197);
                    }
                    class242.method1673(var196, var197, -94, var199);
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 89) {
                int var193 = class88.field1293.method245(-85);
                int var194 = class88.field1293.method299(-81);
                if (class209.method1489(20, var193)) {
                    int var195 = 0;
                    if (class235.field3602.field1914 != null) {
                        var195 = class235.field3602.field1914.method1635(128);
                    }
                    class182.method1311(-1, 24161, var194, var195, 3);
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 28) {
                class299.field4697 = class88.field1293.method273(65280);
                class298.field4666 = class88.field1293.method273(65280);
                class45.field708 = class88.field1293.method273(65280);
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 90) {
                int var190 = class88.field1293.method300(-1394191632);
                int var191 = class88.field1293.method299(-108);
                int var192 = class88.field1293.method258(437);
                if (class209.method1489(20, var190)) {
                    class213.method1541(var192, -16969, var191);
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 152) {
                class81.method635(false, true);
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 209) {
                for (int var175 = 0; var175 < class199.field3158.length; var175++) {
                    if (class45.field706[var175] != class199.field3158[var175]) {
                        class199.field3158[var175] = class45.field706[var175];
                        class268.method1864(var175, 373310787);
                        class58.field866[class142.method1078(31, class297.field4663++)] = var175;
                    }
                }
                class138.field2146 = -1;
                return true;
            } else if (class138.field2146 == 112) {
                long var176 = class88.field1293.method289((byte) 126);
                int var178 = class88.field1293.method300(-1394191632);
                boolean var179 = false;
                if ((Long.MIN_VALUE & var176) != 0L) {
                    var179 = true;
                }
                byte var180 = class88.field1293.method242((byte) -93);
                if (var179) {
                    if (class78.field1098 == 0) {
                        class138.field2146 = -1;
                        return true;
                    }
                    long var181 = var176 & Long.MAX_VALUE;
                    boolean var183 = false;
                    int var184;
                    for (var184 = 0; var184 < class78.field1098 && (class317.field4927[var184].field3418 != var181 || class317.field4927[var184].field2591 != var178); var184++) {
                    }
                    if (var184 < class78.field1098) {
                        while (var184 < class78.field1098 - 1) {
                            class317.field4927[var184] = class317.field4927[var184 + 1];
                            var184++;
                        }
                        class78.field1098--;
                        class317.field4927[class78.field1098] = null;
                    }
                } else {
                    String var185 = class88.field1293.method279(104);
                    class175 var186 = new class175();
                    var186.field3418 = var176;
                    var186.field2587 = class92.method730(var186.field3418, -20313);
                    var186.field2590 = var180;
                    var186.field2591 = var178;
                    var186.field2586 = var185;
                    int var187;
                    for (var187 = class78.field1098 - 1; var187 >= 0; var187--) {
                        int var188 = class317.field4927[var187].field2587.compareTo(var186.field2587);
                        if (var188 == 0) {
                            class317.field4927[var187].field2591 = var178;
                            class317.field4927[var187].field2590 = var180;
                            class317.field4927[var187].field2586 = var185;
                            if (class141.field2182 == var176) {
                                class312.field4848 = var180;
                            }
                            class235.field3599 = class319.field4980;
                            class138.field2146 = -1;
                            return true;
                        }
                        if (var188 < 0) {
                            break;
                        }
                    }
                    if (class78.field1098 >= class317.field4927.length) {
                        class138.field2146 = -1;
                        return true;
                    }
                    for (int var189 = class78.field1098 - 1; var189 > var187; var189--) {
                        class317.field4927[var189 + 1] = class317.field4927[var189];
                    }
                    if (class78.field1098 == 0) {
                        class317.field4927 = new class175[100];
                    }
                    class317.field4927[var187 + 1] = var186;
                    class78.field1098++;
                    if (class141.field2182 == var176) {
                        class312.field4848 = var180;
                    }
                }
                class235.field3599 = class319.field4980;
                class138.field2146 = -1;
                return true;
            } else {
                class50.method464((byte) 45, "T1 - " + class138.field2146 + "," + class320.field4983 + "," + class270.field4083 + " - " + class79.field1112, (Throwable) null);
                class205.method1471((byte) 30);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([IIII)[B", line = 3054)
    public final byte[] method1511(int[] arg0, int arg1, int arg2, int arg3) {
        field3332++;
        if (!this.method1528(arg3, arg1 + 121, arg2)) {
            return null;
        }
        if (this.field3341[arg2] == null || this.field3341[arg2][arg3] == null) {
            boolean var5 = this.method1522(arg0, arg2, false);
            if (!var5) {
                this.method1517(false, arg2);
                boolean var6 = this.method1522(arg0, arg2, false);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class12.method92(this.field3341[arg2][arg3], false, (byte) -28);
        if (arg1 != -121) {
            this.field3331 = true;
        }
        if (this.field3352) {
            this.field3341[arg2][arg3] = null;
            if (this.field3338.field2711[arg2] == 1) {
                this.field3341[arg2] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 3096)
    public final boolean method1512(String arg0, int arg1) {
        field3321++;
        if (this.method1527((byte) -121)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field3338.field2704.method2242(-16536, class126.method956((byte) 2, var3));
            return arg1 <= var4;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)I", line = 3114)
    public final int method1513(int arg0) {
        field3322++;
        if (arg0 <= 104) {
            this.method1502(-44, 78);
        }
        return this.method1527((byte) -49) ? this.field3338.field2711.length : -1;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)Z", line = 3132)
    public final boolean method1514(byte arg0) {
        field3353++;
        if (!this.method1527((byte) -123)) {
            return false;
        }
        boolean var2 = true;
        int var3 = 0;
        int var4 = 84 / ((arg0 + 64) / 52);
        while (this.field3338.field2693.length > var3) {
            int var5 = this.field3338.field2693[var3];
            if (this.field3359[var5] == null) {
                this.method1517(false, var5);
                if (this.field3359[var5] == null) {
                    var2 = false;
                }
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "(II)Z", line = 3168)
    private final boolean method1515(int arg0, int arg1) {
        field3327++;
        if (!this.method1527((byte) -106)) {
            return false;
        } else if (arg1 >= 0 && this.field3338.field2711.length > arg1 && this.field3338.field2711[arg1] != 0) {
            return arg0 == 0 ? true : true;
        } else if (class13.field152) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V", line = 3194)
    public static void method1516(byte arg0) {
        field3351 = null;
        if (arg0 <= 82) {
            method1526(84, 124);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)V", line = 3206)
    private final void method1517(boolean arg0, int arg1) {
        if (arg0) {
            this.method1525(-60, -15);
        }
        if (this.field3331) {
            this.field3359[arg1] = this.field3357.method222(-105, arg1);
        } else {
            this.field3359[arg1] = class11.method84(false, -82, this.field3357.method222(-127, arg1));
        }
        field3333++;
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)I", line = 3226)
    public final int method1518(int arg0) {
        field3319++;
        if (!this.method1527((byte) -97)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        if (arg0 != -29040) {
            return 1;
        }
        for (int var4 = 0; var4 < this.field3359.length; var4++) {
            if (this.field3338.field2712[var4] > 0) {
                var2 += 100;
                var3 += this.method1500(var4, 25715);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(BLjava/lang/String;)I", line = 3266)
    public final int method1519(byte arg0, String arg1) {
        field3326++;
        if (arg0 != 16) {
            this.method1504(74, 91, -108);
        }
        if (this.method1527((byte) -23)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field3338.field2704.method2242(-16536, class126.method956((byte) 2, var3));
            return this.method1515(arg0 ^ 0x10, var4) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "(II)V", line = 3289)
    public final void method1520(int arg0, int arg1) {
        field3340++;
        if (!this.method1515(arg0 - 141, arg1)) {
            return;
        }
        if (arg0 != 141) {
            this.field3357 = (class32) null;
        }
        if (this.field3341 != null) {
            this.field3341[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZZ)V", line = 3307)
    public final void method1521(int arg0, boolean arg1, boolean arg2) {
        field3344++;
        if (arg0 > -13) {
            this.method1528(43, -97, 58);
        }
        if (!this.method1527((byte) -40)) {
            return;
        }
        if (arg1) {
            this.field3338.field2697 = (int[][]) null;
            this.field3338.field2698 = null;
        }
        if (arg2) {
            this.field3338.field2702 = null;
            this.field3338.field2704 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([IIZ)Z", line = 3340)
    private final boolean method1522(int[] arg0, int arg1, boolean arg2) {
        field3323++;
        if (!this.method1515(0, arg1)) {
            return false;
        } else if (this.field3359[arg1] == null) {
            return false;
        } else {
            int var4 = this.field3338.field2712[arg1];
            if (arg2) {
                this.method1499((byte) -71, (String) null);
            }
            int[] var5 = this.field3338.field2694[arg1];
            if (this.field3341[arg1] == null) {
                this.field3341[arg1] = new Object[this.field3338.field2711[arg1]];
            }
            boolean var6 = true;
            Object[] var7 = this.field3341[arg1];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var5 == null) {
                    var9 = var8;
                } else {
                    var9 = var5[var8];
                }
                if (var7[var9] == null) {
                    var6 = false;
                    break;
                }
            }
            if (var6) {
                return true;
            }
            byte[] var10;
            if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
                var10 = class12.method92(this.field3359[arg1], false, (byte) -94);
            } else {
                var10 = class12.method92(this.field3359[arg1], true, (byte) -42);
                class35 var11 = new class35(var10);
                var11.method265(var11.field437.length, arg0, -120, 5);
            }
            byte[] var12;
            try {
                var12 = class321.method2195(var10, 6248);
            } catch (RuntimeException var31) {
                throw class277.method1943(var31, "T3 - " + (arg0 != null) + "," + arg1 + "," + var10.length + "," + class16.method123(var10.length, true, var10) + "," + class16.method123(var10.length - 2, !arg2, var10) + "," + this.field3338.field2706[arg1] + "," + this.field3338.field2709);
            }
            if (this.field3331) {
                this.field3359[arg1] = null;
            }
            if (var4 > 1) {
                int var14 = var12.length;
                int var32 = var14 - 1;
                int var15 = var12[var32] & 0xFF;
                int[] var16 = new int[var4];
                class35 var17 = new class35(var12);
                int var18 = var32 - var4 * 4 * var15;
                var17.field455 = var18;
                for (int var19 = 0; var19 < var15; var19++) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < var4; var21++) {
                        var20 += var17.method299(-106);
                        var16[var21] += var20;
                        if (var5 != null) {
                        }
                    }
                }
                byte[][] var22 = new byte[var4][];
                for (int var23 = 0; var23 < var4; var23++) {
                    var22[var23] = new byte[var16[var23]];
                    var16[var23] = 0;
                }
                var17.field455 = var18;
                int var24 = 0;
                for (int var25 = 0; var25 < var15; var25++) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < var4; var27++) {
                        var26 += var17.method299(-87);
                        class151.method1117(var12, var24, var22[var27], var16[var27], var26);
                        var24 += var26;
                        var16[var27] += var26;
                    }
                }
                for (int var28 = 0; var28 < var4; var28++) {
                    int var29;
                    if (var5 == null) {
                        var29 = var28;
                    } else {
                        var29 = var5[var28];
                    }
                    if (this.field3352) {
                        var7[var29] = var22[var28];
                    } else {
                        var7[var29] = class11.method84(false, -102, var22[var28]);
                    }
                }
            } else {
                int var30;
                if (var5 == null) {
                    var30 = 0;
                } else {
                    var30 = var5[0];
                }
                if (this.field3352) {
                    var7[var30] = var12;
                } else {
                    var7[var30] = class11.method84(false, 1, var12);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lih;ZZ)V", line = 3765)
    public class211(class32 arg0, boolean arg1, boolean arg2) {
        this.field3331 = arg1;
        this.field3357 = arg0;
        this.field3352 = arg2;
    }

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "(II)I", line = 3541)
    public final int method1523(int arg0, int arg1) {
        field3354++;
        if (arg0 != 9271) {
            this.method1524(-124, (String) null);
        }
        return this.method1515(0, arg1) ? this.field3338.field2711[arg1] : 0;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 3557)
    public final boolean method1524(int arg0, String arg1) {
        field3325++;
        if (this.method1527((byte) -93)) {
            int var3 = 96 % ((76 - arg0) / 47);
            String var4 = arg1.toLowerCase();
            int var5 = this.field3338.field2704.method2242(-16536, class126.method956((byte) 2, var4));
            return this.method1525(var5, 119);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "(II)Z", line = 3578)
    public final boolean method1525(int arg0, int arg1) {
        field3328++;
        if (!this.method1515(0, arg0)) {
            return false;
        } else if (this.field3359[arg0] == null) {
            this.method1517(false, arg0);
            int var3 = 32 / ((arg1 - 17) / 54);
            return this.field3359[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "(II)V", line = 3601)
    public static final void method1526(int arg0, int arg1) {
        class41.field616 = 1;
        class128.field2024 = -1;
        class6.field60 = false;
        field3345++;
        class96.field1428 = 0;
        class276.field4244 = null;
        class133.field2099 = arg1;
        class178.field2660 = arg0;
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)Z", line = 3617)
    private final boolean method1527(byte arg0) {
        field3348++;
        if (arg0 >= -4) {
            this.method1512((String) null, -108);
        }
        if (this.field3338 == null) {
            this.field3338 = this.field3357.method224((byte) -122);
            if (this.field3338 == null) {
                return false;
            }
            this.field3359 = new Object[this.field3338.field2699];
            this.field3341 = new Object[this.field3338.field2699][];
        }
        return true;
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(III)Z", line = 3639)
    private final boolean method1528(int arg0, int arg1, int arg2) {
        field3349++;
        if (!this.method1527((byte) -121)) {
            return false;
        } else if (arg2 >= arg1 && arg0 >= 0 && arg2 < this.field3338.field2711.length && arg0 < this.field3338.field2711[arg2]) {
            return true;
        } else if (class13.field152) {
            throw new IllegalArgumentException(arg2 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B", line = 3664)
    public final byte[] method1529(String arg0, int arg1, String arg2) {
        field3320++;
        if (!this.method1527((byte) -102)) {
            return null;
        }
        if (arg1 != -1) {
            this.method1500(19, 6);
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field3338.field2704.method2242(-16536, class126.method956((byte) 2, var4));
        if (this.method1515(0, var6)) {
            int var7 = this.field3338.field2698[var6].method2242(-16536, class126.method956((byte) 2, var5));
            return this.method1507(var7, (byte) -126, var6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z", line = 3693)
    public final boolean method1530(String arg0, String arg1, byte arg2) {
        field3337++;
        if (!this.method1527((byte) -6)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field3338.field2704.method2242(-16536, class126.method956((byte) 2, var4));
        if (arg2 >= -109) {
            return false;
        } else if (this.method1515(0, var6)) {
            int var7 = this.field3338.field2698[var6].method2242(-16536, class126.method956((byte) 2, var5));
            return this.method1506(-105, var6, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "(II)Z", line = 3721)
    public final boolean method1531(int arg0, int arg1) {
        field3329++;
        if (!this.method1527((byte) -28)) {
            return false;
        } else if (this.field3338.field2711.length == 1) {
            return this.method1506(-113, 0, arg1);
        } else if (!this.method1515(0, arg1)) {
            return false;
        } else if (this.field3338.field2711[arg1] == 1) {
            return this.method1506(-104, arg1, 0);
        } else {
            if (arg0 <= 76) {
                this.field3357 = (class32) null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(Ljava/lang/String;I)V", line = 3748)
    public final void method1532(String arg0, int arg1) {
        field3318++;
        if (!this.method1527((byte) -111)) {
            return;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 < 53) {
            this.field3359 = (Object[]) null;
        }
        int var4 = this.field3338.field2704.method2242(-16536, class126.method956((byte) 2, var3));
        this.method1502(-1, var4);
    }
}
