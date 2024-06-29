import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class47 {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public int field632;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
    public static int field648 = 0;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "Lkf;")
    public static class193 field639 = new class193(64);

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    public int field645;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "I")
    public int field649;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
    public int field650;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "Lpg;")
    public class78 field644;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "[I")
    public int[] field633;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "[I")
    public int[] field635;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "[I")
    public int[] field642;

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "[I")
    public int[] field651;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "[I")
    public int[] field652;

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "[I")
    public int[] field653;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "[Lpg;")
    public class78[] field641;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "[[I")
    public int[][] field646;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "[[I")
    public int[][] field647;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z[B)V")
    private final void method291(boolean arg0, byte[] arg1) {
        field643++;
        class202 var3 = new class202(class195.method1353(arg0, arg1));
        int var4 = var3.method1420((byte) 0);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field649 = 0;
        } else {
            this.field649 = var3.method1440(20404);
        }
        int var5 = var3.method1420((byte) 0);
        this.field650 = var3.method1419(103);
        this.field633 = new int[this.field650];
        int var6 = -1;
        int var7 = 0;
        for (int var8 = 0; var8 < this.field650; var8++) {
            this.field633[var8] = var7 += var3.method1419(66);
            if (this.field633[var8] > var6) {
                var6 = this.field633[var8];
            }
        }
        this.field645 = var6 + 1;
        this.field653 = new int[this.field645];
        this.field651 = new int[this.field645];
        this.field635 = new int[this.field645];
        this.field652 = new int[this.field645];
        this.field646 = new int[this.field645][];
        if (var5 != 0) {
            this.field642 = new int[this.field645];
            for (int var9 = 0; var9 < this.field645; var9++) {
                this.field642[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field650; var10++) {
                this.field642[this.field633[var10]] = var3.method1440(20404);
            }
            this.field644 = new class78(this.field642);
        }
        for (int var11 = 0; var11 < this.field650; var11++) {
            this.field635[this.field633[var11]] = var3.method1440(20404);
        }
        for (int var12 = 0; var12 < this.field650; var12++) {
            this.field652[this.field633[var12]] = var3.method1440(20404);
        }
        for (int var13 = 0; var13 < this.field650; var13++) {
            this.field651[this.field633[var13]] = var3.method1419(82);
        }
        if (arg0) {
            this.field653 = null;
        }
        for (int var14 = 0; var14 < this.field650; var14++) {
            int var21 = 0;
            int var22 = this.field633[var14];
            int var23 = -1;
            int var24 = this.field651[var22];
            this.field646[var22] = new int[var24];
            for (int var25 = 0; var25 < var24; var25++) {
                int var26 = this.field646[var22][var25] = var21 += var3.method1419(127);
                if (var26 > var23) {
                    var23 = var26;
                }
            }
            this.field653[var22] = var23 + 1;
            if (var23 + 1 == var24) {
                this.field646[var22] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field647 = new int[var6 + 1][];
        this.field641 = new class78[var6 + 1];
        for (int var15 = 0; var15 < this.field650; var15++) {
            int var16 = this.field633[var15];
            int var17 = this.field651[var16];
            this.field647[var16] = new int[this.field653[var16]];
            for (int var18 = 0; var18 < this.field653[var16]; var18++) {
                this.field647[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field646[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field646[var16][var19];
                }
                this.field647[var16][var20] = var3.method1440(20404);
            }
            this.field641[var16] = new class78(this.field647[var16]);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)V")
    public static void method292(boolean arg0) {
        if (arg0) {
            method294(-60);
        }
        field639 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)Lnd;")
    public static final class286 method293(int arg0, int arg1, int arg2) {
        class154 var3 = class27.field346[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class286 var4 = var3.field2419;
            var3.field2419 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)Z")
    public static final boolean method294(int arg0) {
        if (arg0 != -16349) {
            return false;
        }
        field634++;
        if (class119.field1836) {
            try {
                if ((Boolean) class291.method2038("showingVideoAd", 20042, class259.field4254.field4211)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V")
    public static final void method295(int arg0, int arg1) {
        field640++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class283.field4737[arg0];
        int var3 = class175.field2739[arg0];
        int var4 = class70.field1016[arg0];
        int var5 = (int) class280.field4637[arg0];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        long var6 = class280.field4637[arg0];
        if (var4 == 47) {
            class35 var8 = class76.field1188[var5];
            if (var8 != null) {
                field648 = class199.field3158;
                class229.field3657 = 2;
                class156.field2474 = class218.field3483;
                class280.field4639 = 0;
                class306.field4979++;
                class276.field4572.method1391(arg1, 218);
                class276.field4572.method1427(true, var5);
                class276.field4572.method1433(class268.field4398, (byte) 113);
                class276.field4572.method1400((byte) -104, class3.field26[82] ? 1 : 0);
                class276.field4572.method1451(class84.field1334, -127);
                class105.method678(class309.field5006.field849[0], var8.method362(25892), true, var8.method362(arg1 ^ 0x6524), 0, (byte) 127, 0, class309.field5006.field804[0], var3, var2, 0);
            }
        }
        if (var4 == 32) {
            class208 var9 = class300.field4925[var5];
            if (var9 != null) {
                class276.field4565++;
                class280.field4639 = 0;
                class229.field3657 = 2;
                field648 = class199.field3158;
                class156.field2474 = class218.field3483;
                class276.field4572.method1391(0, 127);
                class276.field4572.method1438(class3.field26[82] ? 1 : 0, -95);
                class276.field4572.method1433(var5, (byte) -97);
                class105.method678(class309.field5006.field849[0], var9.method362(25892), true, var9.method362(25892), 0, (byte) 127, 0, class309.field5006.field804[0], var3, var2, 0);
            }
        }
        if (var4 == 9) {
            class276.field4572.method1391(0, 213);
            class313.field5042++;
            class276.field4572.method1425(var3, (byte) -128);
            class254 var10 = class80.method534(115, var3);
            if (var10.field4145 != null && var10.field4145[0][0] == 5) {
                int var11 = var10.field4145[0][1];
                if (class209.field3356[var11] != var10.field4192[0]) {
                    class209.field3356[var11] = var10.field4192[0];
                    class265.method1828(var11, true);
                }
            }
        }
        if (var4 == 58) {
            class35 var12 = class76.field1188[var5];
            if (var12 != null) {
                class156.field2474 = class218.field3483;
                class280.field4639 = 0;
                class24.field314++;
                field648 = class199.field3158;
                class229.field3657 = 2;
                class276.field4572.method1391(0, 187);
                class276.field4572.method1400((byte) -99, class3.field26[82] ? 1 : 0);
                class276.field4572.method1433(var5, (byte) -38);
                class105.method678(class309.field5006.field849[0], var12.method362(25892), true, var12.method362(25892), 0, (byte) 127, 0, class309.field5006.field804[0], var3, var2, 0);
            }
        }
        if (var4 == 26) {
            if (var5 == 0) {
                class183.field2849 = 1;
                class75.method492(class165.field2600, var2, var3);
            } else if (var5 == 1) {
                class276.field4572.method1391(0, 195);
                class294.field4828++;
                class276.field4572.method1433(class268.field4398, (byte) 13);
                class276.field4572.method1452(-10615, class254.field4063 + var3);
                class276.field4572.method1435(112, class84.field1334);
                class276.field4572.method1412(class101.field1517 + var2, false);
            }
        }
        if (var4 == 36 || var4 == 1011) {
            class117.method763(true, var5, class156.field2472[arg0], var2, var3);
        }
        if (var4 == 10) {
            class4.field44++;
            class276.field4572.method1391(0, 88);
            class276.field4572.method1433(var5, (byte) -74);
            class276.field4572.method1433(var2, (byte) 122);
            class276.field4572.method1425(var3, (byte) -125);
            class310.field5011 = 0;
            class74.field1175 = class80.method534(101, var3);
            class146.field2302 = var2;
        }
        if (var4 == 3) {
            class184.field2866++;
            class276.field4572.method1391(arg1, 175);
            class276.field4572.method1412(var5, false);
            class276.field4572.method1412(var2, false);
            class276.field4572.method1448(var3, (byte) -91);
            class310.field5011 = 0;
            class74.field1175 = class80.method534(-79, var3);
            class146.field2302 = var2;
        }
        if (var4 == 30) {
            class254 var13 = class80.method534(arg1 - 100, var3);
            boolean var14 = true;
            if (var13.field4060 > 0) {
                var14 = class109.method708(var13, true);
            }
            if (var14) {
                class276.field4572.method1391(0, 213);
                class313.field5042++;
                class276.field4572.method1425(var3, (byte) -112);
            }
        }
        if (var4 == 13) {
            class208 var15 = class300.field4925[var5];
            if (var15 != null) {
                class299.field4917++;
                class156.field2474 = class218.field3483;
                class280.field4639 = 0;
                field648 = class199.field3158;
                class229.field3657 = 2;
                class276.field4572.method1391(0, 227);
                class276.field4572.method1452(-10615, var5);
                class276.field4572.method1407(class3.field26[82] ? 1 : 0, false);
                class105.method678(class309.field5006.field849[0], var15.method362(25892), true, var15.method362(arg1 + 25892), 0, (byte) 127, 0, class309.field5006.field804[0], var3, var2, 0);
            }
        }
        if (var4 == 28) {
            class208 var16 = class300.field4925[var5];
            if (var16 != null) {
                class156.field2474 = class218.field3483;
                class229.field3657 = 2;
                field648 = class199.field3158;
                class280.field4639 = 0;
                class227.field3592++;
                class276.field4572.method1391(0, 180);
                class276.field4572.method1412(var5, false);
                class276.field4572.method1407(class3.field26[82] ? 1 : 0, false);
                class105.method678(class309.field5006.field849[0], var16.method362(25892), true, var16.method362(25892), 0, (byte) 127, 0, class309.field5006.field804[0], var3, var2, 0);
            }
        }
        if (var4 == 40) {
            class208 var17 = class300.field4925[var5];
            if (var17 != null) {
                class229.field3657 = 2;
                field648 = class199.field3158;
                class280.field4639 = 0;
                class29.field371++;
                class156.field2474 = class218.field3483;
                class276.field4572.method1391(0, 166);
                class276.field4572.method1433(var5, (byte) 117);
                class276.field4572.method1407(class3.field26[82] ? 1 : 0, false);
                class105.method678(class309.field5006.field849[0], var17.method362(arg1 ^ 0x6524), true, var17.method362(25892), 0, (byte) 127, 0, class309.field5006.field804[0], var3, var2, 0);
            }
        }
        if (var4 == 16) {
            class208 var18 = class300.field4925[var5];
            if (var18 != null) {
                class280.field4639 = 0;
                class229.field3657 = 2;
                class156.field2474 = class218.field3483;
                class182.field2812++;
                field648 = class199.field3158;
                class276.field4572.method1391(0, 142);
                class276.field4572.method1433(var5, (byte) 127);
                class276.field4572.method1446((byte) 100, class3.field26[82] ? 1 : 0);
                class105.method678(class309.field5006.field849[0], var18.method362(25892), true, var18.method362(25892), 0, (byte) 127, 0, class309.field5006.field804[0], var3, var2, 0);
            }
        }
        if (var4 == 31) {
            class36.field467++;
            class276.field4572.method1391(0, 91);
            class276.field4572.method1435(99, var3);
            class276.field4572.method1433(var5, (byte) -81);
            class276.field4572.method1427(true, var2);
            class310.field5011 = 0;
            class74.field1175 = class80.method534(-92, var3);
            class146.field2302 = var2;
        }
        if (var4 == 5) {
            class276.field4572.method1391(0, 74);
            class189.field2920++;
            class276.field4572.method1435(-124, var3);
            class276.field4572.method1433(var5, (byte) 117);
            class276.field4572.method1452(-10615, var2);
            class310.field5011 = 0;
            class74.field1175 = class80.method534(-64, var3);
            class146.field2302 = var2;
        }
        if (var4 == 42) {
            class254 var19 = class79.method529(var3, 31, var2);
            if (var19 != null) {
                class173.method1151((byte) -90);
                class237 var20 = client.method1085(var19);
                class99.method640(var19.field4067, arg1, var20.method1646((byte) 126), var2, var19.field4102, var20.field3758, var3);
                class29.field367 = 0;
                class70.field1019 = class239.method1664(897034860, var19);
                if (var19.field4181) {
                    class265.field4368 = var19.field4146 + "<col=ffffff>";
                } else {
                    class265.field4368 = "<col=00ff00>" + var19.field4096 + "<col=ffffff>";
                }
                if (class70.field1019 == null) {
                    class70.field1019 = "Null";
                }
            }
            return;
        }
        if (var4 == 60) {
            class276.field4572.method1391(0, 61);
            class63.field946++;
            class276.field4572.method1427(true, var5);
            class276.field4572.method1412(class268.field4398, false);
            class276.field4572.method1451(var3, -126);
            class276.field4572.method1435(arg1 ^ 0xFFFFFFF8, class84.field1334);
            class276.field4572.method1427(true, var2);
            class310.field5011 = 0;
            class74.field1175 = class80.method534(97, var3);
            class146.field2302 = var2;
        }
        if (var4 == 7) {
            class236.field3732++;
            class229.field3657 = 2;
            field648 = class199.field3158;
            class280.field4639 = 0;
            class156.field2474 = class218.field3483;
            class276.field4572.method1391(0, 217);
            class276.field4572.method1452(-10615, class152.field2360);
            class276.field4572.method1452(-10615, var5);
            class276.field4572.method1412(class101.field1517 + var2, false);
            class276.field4572.method1427(true, class254.field4063 + var3);
            class276.field4572.method1448(class50.field685, (byte) -61);
            class276.field4572.method1446((byte) 105, class3.field26[82] ? 1 : 0);
            class276.field4572.method1433(class141.field2166, (byte) -80);
            class105.method678(class309.field5006.field849[0], 0, true, 0, 0, (byte) 127, 0, class309.field5006.field804[0], var3, var2, 0);
        }
        if (var4 == 11) {
            class35 var21 = class76.field1188[var5];
            if (var21 != null) {
                class156.field2474 = class218.field3483;
                field648 = class199.field3158;
                class20.field269++;
                class229.field3657 = 2;
                class280.field4639 = 0;
                class276.field4572.method1391(0, 152);
                class276.field4572.method1427(true, var5);
                class276.field4572.method1438(class3.field26[82] ? 1 : 0, -85);
                class105.method678(class309.field5006.field849[0], var21.method362(arg1 ^ 0x6524), true, var21.method362(25892), 0, (byte) 127, 0, class309.field5006.field804[0], var3, var2, 0);
            }
        }
        if (var4 == 1003) {
            class130.field1989++;
            class156.field2474 = class218.field3483;
            class229.field3657 = 2;
            class280.field4639 = 0;
            field648 = class199.field3158;
            class276.field4572.method1391(arg1, 124);
            class276.field4572.method1412(var5, false);
        }
        if (var4 == 1004) {
            class254 var22 = class80.method534(-106, var3);
            if (var22 == null || var22.field4021[var2] < 100000) {
                class130.field1989++;
                class276.field4572.method1391(0, 124);
                class276.field4572.method1412(var5, false);
            } else {
                class286.method2013((byte) -107, var22.field4021[var2] + " x " + class14.method92(var5, false).field2071);
            }
            class310.field5011 = 0;
            class74.field1175 = class80.method534(arg1 ^ 0xFFFFFF80, var3);
            class146.field2302 = var2;
        }
        if (var4 == 59) {
            class276.field4572.method1391(0, 174);
            class79.field1256++;
            class276.field4572.method1452(arg1 ^ 0xFFFFD689, var5);
            class276.field4572.method1448(var3, (byte) -66);
            class276.field4572.method1452(-10615, var2);
            class310.field5011 = 0;
            class74.field1175 = class80.method534(121, var3);
            class146.field2302 = var2;
        }
        if (var4 == 25) {
            class156.field2474 = class218.field3483;
            class229.field3657 = 2;
            class55.field743++;
            class280.field4639 = 0;
            field648 = class199.field3158;
            class276.field4572.method1391(0, 140);
            class276.field4572.method1412(var5, false);
            class276.field4572.method1407(class3.field26[82] ? 1 : 0, false);
            class276.field4572.method1427(true, class101.field1517 + var2);
            class276.field4572.method1435(99, class84.field1334);
            class276.field4572.method1452(-10615, var3 + class254.field4063);
            class276.field4572.method1452(-10615, class268.field4398);
            class105.method678(class309.field5006.field849[0], 0, true, 0, 0, (byte) 127, 0, class309.field5006.field804[0], var3, var2, 0);
        }
        if (var4 == 1010 || var4 == 1001 || var4 == 1012 || var4 == 1002 || var4 == 1007) {
            class79.method531(var4, var2, arg1 ^ 0x32, var5);
        }
        if (var4 == 12) {
            class276.field4572.method1391(arg1, 31);
            class304.field4966++;
            class276.field4572.method1448(var3, (byte) 79);
            class276.field4572.method1427(true, var5);
            class276.field4572.method1452(-10615, var2);
            class310.field5011 = 0;
            class74.field1175 = class80.method534(-67, var3);
            class146.field2302 = var2;
        }
        if (var4 == 39) {
            class156.field2474 = class218.field3483;
            field648 = class199.field3158;
            class280.field4639 = 0;
            class45.field621++;
            class229.field3657 = 2;
            class276.field4572.method1391(0, 169);
            class276.field4572.method1427(true, class101.field1517 + var2);
            class276.field4572.method1438(class3.field26[82] ? 1 : 0, -78);
            class276.field4572.method1412(var3 + class254.field4063, false);
            class276.field4572.method1433(var5, (byte) 114);
            class105.method678(class309.field5006.field849[0], 0, true, 0, 0, (byte) 127, 0, class309.field5006.field804[0], var3, var2, 0);
        }
        if (var4 == 6) {
            class280.field4639 = 0;
            class156.field2474 = class218.field3483;
            field648 = class199.field3158;
            class180.field2799++;
            class229.field3657 = 2;
            class276.field4572.method1391(0, 252);
            class276.field4572.method1452(-10615, class254.field4063 + var3);
            class276.field4572.method1433(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) 116);
            class276.field4572.method1433(class101.field1517 + var2, (byte) -19);
            class276.field4572.method1438(class3.field26[82] ? 1 : 0, -95);
            class274.method1912(var3, ~arg1, var2, var6);
        }
        if (var4 == 20 && class296.field4862 == null) {
            class106.method681(9002, var3, var2);
            class296.field4862 = class79.method529(var3, 46, var2);
            class58.method354(true, class296.field4862);
        }
        if (var4 == 21) {
            class229.field3657 = 2;
            class156.field2474 = class218.field3483;
            class102.field1541++;
            field648 = class199.field3158;
            class280.field4639 = 0;
            class276.field4572.method1391(0, 137);
            class276.field4572.method1452(-10615, class254.field4063 + var3);
            class276.field4572.method1427(true, var5);
            class276.field4572.method1412(class101.field1517 + var2, false);
            class276.field4572.method1446((byte) 45, class3.field26[82] ? 1 : 0);
            class105.method678(class309.field5006.field849[0], 0, true, 0, 0, (byte) 127, 0, class309.field5006.field804[0], var3, var2, 0);
        }
        if (var4 == 37) {
            class276.field4572.method1391(0, 157);
            class194.field3072++;
            class276.field4572.method1433(var5, (byte) -128);
            class276.field4572.method1412(var2, false);
            class276.field4572.method1435(119, var3);
            class310.field5011 = 0;
            class74.field1175 = class80.method534(arg1 ^ 0xFFFFFFD1, var3);
            class146.field2302 = var2;
        }
        if (var4 == 14) {
            class37.field478++;
            class276.field4572.method1391(arg1, 188);
            class276.field4572.method1433(var5, (byte) -46);
            class276.field4572.method1427(true, var2);
            class276.field4572.method1425(var3, (byte) -113);
            class310.field5011 = 0;
            class74.field1175 = class80.method534(-52, var3);
            class146.field2302 = var2;
        }
        if (var4 == 33) {
            class229.field3657 = 2;
            class156.field2474 = class218.field3483;
            class280.field4639 = 0;
            field648 = class199.field3158;
            class22.field284++;
            class276.field4572.method1391(0, 108);
            class276.field4572.method1412(var5, false);
            class276.field4572.method1452(arg1 ^ 0xFFFFD689, class254.field4063 + var3);
            class276.field4572.method1412(class101.field1517 + var2, false);
            class276.field4572.method1400((byte) 89, class3.field26[82] ? 1 : 0);
            class105.method678(class309.field5006.field849[0], 0, true, 0, 0, (byte) 127, 0, class309.field5006.field804[0], var3, var2, 0);
        }
        if (var4 == 29) {
            class208 var23 = class300.field4925[var5];
            if (var23 != null) {
                class229.field3657 = 2;
                class74.field1101++;
                class156.field2474 = class218.field3483;
                field648 = class199.field3158;
                class280.field4639 = 0;
                class276.field4572.method1391(arg1, 40);
                class276.field4572.method1433(var5, (byte) -32);
                class276.field4572.method1446((byte) 118, class3.field26[82] ? 1 : 0);
                class105.method678(class309.field5006.field849[0], var23.method362(25892), true, var23.method362(arg1 ^ 0x6524), 0, (byte) 127, 0, class309.field5006.field804[0], var3, var2, 0);
            }
        }
        if (var4 == 4) {
            class208 var24 = class300.field4925[var5];
            if (var24 != null) {
                class156.field2474 = class218.field3483;
                field648 = class199.field3158;
                class280.field4639 = 0;
                class229.field3657 = 2;
                class276.field4572.method1391(arg1, 248);
                class115.field1740++;
                class276.field4572.method1451(class84.field1334, arg1 ^ 0xFFFFFF82);
                class276.field4572.method1427(true, var5);
                class276.field4572.method1438(class3.field26[82] ? 1 : 0, -82);
                class276.field4572.method1433(class268.field4398, (byte) 120);
                class105.method678(class309.field5006.field849[0], var24.method362(25892), true, var24.method362(25892), 0, (byte) 127, 0, class309.field5006.field804[0], var3, var2, 0);
            }
        }
        if (var4 == 49) {
            class35 var25 = class76.field1188[var5];
            if (var25 != null) {
                class229.field3657 = 2;
                class192.field3030++;
                class156.field2474 = class218.field3483;
                field648 = class199.field3158;
                class280.field4639 = 0;
                class276.field4572.method1391(0, 53);
                class276.field4572.method1407(class3.field26[82] ? 1 : 0, false);
                class276.field4572.method1427(true, var5);
                class105.method678(class309.field5006.field849[0], var25.method362(25892), true, var25.method362(25892), 0, (byte) 127, 0, class309.field5006.field804[0], var3, var2, 0);
            }
        }
        if (var4 == 1006) {
            field648 = class199.field3158;
            class229.field3657 = 2;
            class281.field4644++;
            class156.field2474 = class218.field3483;
            class280.field4639 = 0;
            class276.field4572.method1391(0, 50);
            class276.field4572.method1433(var5, (byte) -41);
        }
        if (var4 == 19) {
            class276.field4572.method1391(0, 34);
            class131.field2020++;
            class276.field4572.method1425(var3, (byte) -106);
            class276.field4572.method1452(-10615, var5);
            class276.field4572.method1433(class152.field2360, (byte) 111);
            class276.field4572.method1412(class141.field2166, false);
            class276.field4572.method1433(var2, (byte) -37);
            class276.field4572.method1425(class50.field685, (byte) -107);
            class310.field5011 = 0;
            class74.field1175 = class80.method534(arg1 ^ 0x6E, var3);
            class146.field2302 = var2;
        }
        if (var4 == 1008) {
            class182.field2825++;
            class280.field4639 = 0;
            class156.field2474 = class218.field3483;
            class229.field3657 = 2;
            field648 = class199.field3158;
            class276.field4572.method1391(arg1, 179);
            class276.field4572.method1446((byte) 73, class3.field26[82] ? 1 : 0);
            class276.field4572.method1452(-10615, class101.field1517 + var2);
            class276.field4572.method1433((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) 115);
            class276.field4572.method1427(true, class254.field4063 + var3);
            class274.method1912(var3, -1, var2, var6);
        }
        if (var4 == 46) {
            class156.field2474 = class218.field3483;
            class229.field3657 = 2;
            field648 = class199.field3158;
            class182.field2808++;
            class280.field4639 = 0;
            class276.field4572.method1391(0, 230);
            class276.field4572.method1400((byte) -95, class3.field26[82] ? 1 : 0);
            class276.field4572.method1412(Integer.MAX_VALUE & (int) (var6 >>> 32), false);
            class276.field4572.method1427(true, class268.field4398);
            class276.field4572.method1435(-108, class84.field1334);
            class276.field4572.method1427(true, class254.field4063 + var3);
            class276.field4572.method1427(true, class101.field1517 + var2);
            class274.method1912(var3, -1, var2, var6);
        }
        if (var4 == 1) {
            class208 var26 = class300.field4925[var5];
            if (var26 != null) {
                class229.field3657 = 2;
                class280.field4639 = 0;
                field648 = class199.field3158;
                class209.field3362++;
                class156.field2474 = class218.field3483;
                class276.field4572.method1391(0, 190);
                class276.field4572.method1433(var5, (byte) -8);
                class276.field4572.method1407(class3.field26[82] ? 1 : 0, false);
                class105.method678(class309.field5006.field849[0], var26.method362(25892), true, var26.method362(25892), 0, (byte) 127, 0, class309.field5006.field804[0], var3, var2, 0);
            }
        }
        if (var4 == 51) {
            field648 = class199.field3158;
            class280.field4639 = 0;
            class156.field2474 = class218.field3483;
            class309.field5009++;
            class229.field3657 = 2;
            class276.field4572.method1391(0, 181);
            class276.field4572.method1427(true, class254.field4063 + var3);
            class276.field4572.method1412(var5, false);
            class276.field4572.method1412(class101.field1517 + var2, false);
            class276.field4572.method1407(class3.field26[82] ? 1 : 0, false);
            class105.method678(class309.field5006.field849[0], 0, true, 0, 0, (byte) 127, 0, class309.field5006.field804[0], var3, var2, 0);
        }
        if (var4 == 8) {
            class65.field966++;
            field648 = class199.field3158;
            class156.field2474 = class218.field3483;
            class229.field3657 = 2;
            class280.field4639 = 0;
            class276.field4572.method1391(0, 99);
            class276.field4572.method1452(-10615, class101.field1517 + var2);
            class276.field4572.method1438(class3.field26[82] ? 1 : 0, -126);
            class276.field4572.method1412((int) (var6 >>> 32) & Integer.MAX_VALUE, false);
            class276.field4572.method1412(class254.field4063 + var3, false);
            class274.method1912(var3, -1, var2, var6);
        }
        if (var4 == 43) {
            class173.method1151((byte) -93);
            class254 var27 = class80.method534(arg1 + 107, var3);
            class50.field685 = var3;
            class152.field2360 = var5;
            class29.field367 = 1;
            class141.field2166 = var2;
            class58.method354(true, var27);
            class43.field602 = "<col=ff9040>" + class14.method92(var5, false).field2071 + "<col=ffffff>";
            if (class43.field602 == null) {
                class43.field602 = "null";
            }
            return;
        }
        if (var4 == 15) {
            if (var5 == 0) {
                class301.field4937 = 1;
                class75.method492(class165.field2600, var2, var3);
            } else if (class37.field484 > 0 && class3.field26[82] && class3.field26[81]) {
                class209.method1482(class101.field1517 + var2, class165.field2600, 63, class254.field4063 + var3);
            } else {
                class182.field2824++;
                class276.field4572.method1391(0, 105);
                class276.field4572.method1433(class101.field1517 + var2, (byte) -74);
                class276.field4572.method1412(class254.field4063 + var3, false);
            }
        }
        if (var4 == 2) {
            field648 = class199.field3158;
            class156.field2474 = class218.field3483;
            class229.field3657 = 2;
            class138.field2139++;
            class280.field4639 = 0;
            class276.field4572.method1391(0, 29);
            class276.field4572.method1400((byte) 88, class3.field26[82] ? 1 : 0);
            class276.field4572.method1412(Integer.MAX_VALUE & (int) (var6 >>> 32), false);
            class276.field4572.method1412(class254.field4063 + var3, false);
            class276.field4572.method1412(class101.field1517 + var2, false);
            class274.method1912(var3, -1, var2, var6);
        }
        if (var4 == 23) {
            class35 var28 = class76.field1188[var5];
            if (var28 != null) {
                class229.field3657 = 2;
                class280.field4639 = 0;
                field648 = class199.field3158;
                class109.field1665++;
                class156.field2474 = class218.field3483;
                class276.field4572.method1391(arg1, 106);
                class276.field4572.method1433(class141.field2166, (byte) 12);
                class276.field4572.method1448(class50.field685, (byte) 66);
                class276.field4572.method1400((byte) -122, class3.field26[82] ? 1 : 0);
                class276.field4572.method1412(class152.field2360, false);
                class276.field4572.method1452(-10615, var5);
                class105.method678(class309.field5006.field849[0], var28.method362(arg1 + 25892), true, var28.method362(25892), 0, (byte) 127, 0, class309.field5006.field804[0], var3, var2, 0);
            }
        }
        if (var4 == 44) {
            if (var5 == 0) {
                class75.method492(class165.field2600, var2, var3);
            } else if (var5 == 1) {
                if (class37.field484 > 0 && class3.field26[82] && class3.field26[81]) {
                    class209.method1482(class101.field1517 + var2, class165.field2600, 63, class254.field4063 + var3);
                } else {
                    class86.method572(1, (byte) 79, var3, var2);
                    class276.field4572.method1446((byte) 49, class36.field456);
                    class276.field4572.method1446((byte) 97, class242.field3831);
                    class276.field4572.method1412((int) class202.field3253, false);
                    class276.field4572.method1446((byte) 45, 57);
                    if (class92.field1402 == 4) {
                        class276.field4572.method1446((byte) 55, 0);
                        class276.field4572.method1446((byte) 100, 0);
                    } else {
                        class276.field4572.method1446((byte) 38, class262.field4330);
                        class276.field4572.method1446((byte) 113, class265.field4365);
                    }
                    class276.field4572.method1446((byte) 62, 89);
                    class276.field4572.method1412(class309.field5006.field836, false);
                    class276.field4572.method1412(class309.field5006.field850, false);
                    class276.field4572.method1446((byte) 50, class184.field2863);
                    class276.field4572.method1446((byte) 105, 63);
                    class105.method678(class309.field5006.field849[0], 0, true, 0, 0, (byte) 127, 0, class309.field5006.field804[0], var3, var2, 0);
                }
            }
        }
        if (var4 == 45) {
            class278.method1940(2);
        }
        if (var4 == 48) {
            class280.field4639 = 0;
            class229.field3657 = 2;
            class156.field2474 = class218.field3483;
            field648 = class199.field3158;
            class276.field4572.method1391(arg1, 194);
            class36.field463++;
            class276.field4572.method1452(-10615, var2 + class101.field1517);
            class276.field4572.method1412(var5, false);
            class276.field4572.method1400((byte) -126, class3.field26[82] ? 1 : 0);
            class276.field4572.method1427(true, var3 + class254.field4063);
            class105.method678(class309.field5006.field849[0], 0, true, 0, 0, (byte) 127, 0, class309.field5006.field804[0], var3, var2, 0);
        }
        if (var4 == 57) {
            class208 var29 = class300.field4925[var5];
            if (var29 != null) {
                field648 = class199.field3158;
                class229.field3657 = 2;
                class156.field2474 = class218.field3483;
                class280.field4639 = 0;
                class37.field477++;
                class276.field4572.method1391(arg1, 36);
                class276.field4572.method1435(-66, class50.field685);
                class276.field4572.method1446((byte) 47, class3.field26[82] ? 1 : 0);
                class276.field4572.method1452(arg1 ^ 0xFFFFD689, var5);
                class276.field4572.method1452(arg1 ^ 0xFFFFD689, class141.field2166);
                class276.field4572.method1412(class152.field2360, false);
                class105.method678(class309.field5006.field849[0], var29.method362(arg1 ^ 0x6524), true, var29.method362(arg1 + 25892), 0, (byte) 127, 0, class309.field5006.field804[0], var3, var2, 0);
            }
        }
        if (var4 == 1009) {
            field648 = class199.field3158;
            class280.field4639 = 0;
            class229.field3657 = 2;
            class156.field2474 = class218.field3483;
            class35 var30 = class76.field1188[var5];
            if (var30 != null) {
                class106 var31 = var30.field442;
                if (var31.field1630 != null) {
                    var31 = var31.method685(-1);
                }
                if (var31 != null) {
                    class146.field2299++;
                    class276.field4572.method1391(0, 116);
                    class276.field4572.method1452(-10615, var31.field1581);
                }
            }
        }
        if (var4 == 41) {
            class208 var32 = class300.field4925[var5];
            if (var32 != null) {
                class156.field2474 = class218.field3483;
                field648 = class199.field3158;
                class113.field1704++;
                class280.field4639 = 0;
                class229.field3657 = 2;
                class276.field4572.method1391(0, 186);
                class276.field4572.method1438(class3.field26[82] ? 1 : 0, arg1 - 102);
                class276.field4572.method1412(var5, false);
                class105.method678(class309.field5006.field849[0], var32.method362(25892), true, var32.method362(25892), 0, (byte) 127, 0, class309.field5006.field804[0], var3, var2, 0);
            }
        }
        if (var4 == 50) {
            class276.field4572.method1391(0, 25);
            class276.field4572.method1452(-10615, var2);
            class20.field267++;
            class276.field4572.method1452(-10615, var5);
            class276.field4572.method1435(86, var3);
            class310.field5011 = 0;
            class74.field1175 = class80.method534(-98, var3);
            class146.field2302 = var2;
        }
        if (var4 == 18) {
            class156.field2474 = class218.field3483;
            class280.field4639 = 0;
            field648 = class199.field3158;
            class306.field4980++;
            class229.field3657 = 2;
            class276.field4572.method1391(arg1, 117);
            class276.field4572.method1433(class152.field2360, (byte) -41);
            class276.field4572.method1433(class254.field4063 + var3, (byte) 114);
            class276.field4572.method1412(class101.field1517 + var2, false);
            class276.field4572.method1433((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) -27);
            class276.field4572.method1446((byte) 94, class3.field26[82] ? 1 : 0);
            class276.field4572.method1452(-10615, class141.field2166);
            class276.field4572.method1425(class50.field685, (byte) -119);
            class274.method1912(var3, arg1 - 1, var2, var6);
        }
        if (var4 == 38) {
            class177.field2760++;
            class276.field4572.method1391(0, 121);
            class276.field4572.method1412(var2, false);
            class276.field4572.method1448(var3, (byte) -77);
            class276.field4572.method1427(true, var5);
            class310.field5011 = 0;
            class74.field1175 = class80.method534(-83, var3);
            class146.field2302 = var2;
        }
        if (var4 == 17) {
            class35 var33 = class76.field1188[var5];
            if (var33 != null) {
                class280.field4639 = 0;
                class229.field3657 = 2;
                class275.field4554++;
                field648 = class199.field3158;
                class156.field2474 = class218.field3483;
                class276.field4572.method1391(0, 229);
                class276.field4572.method1452(-10615, var5);
                class276.field4572.method1438(class3.field26[82] ? 1 : 0, -77);
                class105.method678(class309.field5006.field849[0], var33.method362(25892), true, var33.method362(25892), 0, (byte) 127, 0, class309.field5006.field804[0], var3, var2, 0);
            }
        }
        if (var4 == 22) {
            class35 var34 = class76.field1188[var5];
            if (var34 != null) {
                class156.field2474 = class218.field3483;
                class229.field3657 = 2;
                class66.field972++;
                class280.field4639 = 0;
                field648 = class199.field3158;
                class276.field4572.method1391(0, 163);
                class276.field4572.method1452(arg1 ^ 0xFFFFD689, var5);
                class276.field4572.method1407(class3.field26[82] ? 1 : 0, false);
                class105.method678(class309.field5006.field849[0], var34.method362(25892), true, var34.method362(25892), 0, (byte) 127, 0, class309.field5006.field804[0], var3, var2, 0);
            }
        }
        if (var4 == 34) {
            field648 = class199.field3158;
            class156.field2474 = class218.field3483;
            class43.field598++;
            class229.field3657 = 2;
            class280.field4639 = 0;
            class276.field4572.method1391(arg1, 249);
            class276.field4572.method1452(-10615, class254.field4063 + var3);
            class276.field4572.method1452(-10615, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class276.field4572.method1412(class101.field1517 + var2, false);
            class276.field4572.method1446((byte) 30, class3.field26[82] ? 1 : 0);
            class274.method1912(var3, -1, var2, var6);
        }
        if (var4 == 24) {
            class314.field5061++;
            class276.field4572.method1391(0, 170);
            class276.field4572.method1435(arg1 ^ 0xFFFFFFB4, class84.field1334);
            class276.field4572.method1425(var3, (byte) -98);
            class276.field4572.method1427(true, var2);
            class276.field4572.method1452(arg1 - 10615, class268.field4398);
        }
        if (var4 == 35) {
            class313.field5042++;
            class276.field4572.method1391(arg1, 213);
            class276.field4572.method1425(var3, (byte) -106);
            class254 var35 = class80.method534(91, var3);
            if (var35.field4145 != null && var35.field4145[0][0] == 5) {
                int var36 = var35.field4145[0][1];
                class209.field3356[var36] = 1 - class209.field3356[var36];
                class265.method1828(var36, true);
            }
        }
        if (class29.field367 != 0) {
            class29.field367 = 0;
            class58.method354(true, class80.method534(107, class50.field685));
        }
        if (arg1 != 0) {
            field639 = null;
        }
        if (class70.field1017) {
            class173.method1151((byte) 39);
        }
        if (class74.field1175 != null && class310.field5011 == 0) {
            class58.method354(true, class74.field1175);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BIII)I")
    public static final int method296(byte arg0, int arg1, int arg2, int arg3) {
        field636++;
        if (arg0 <= 125) {
            field648 = -34;
        }
        if (arg2 > 243) {
            arg3 >>= 0x4;
        } else if (arg2 > 217) {
            arg3 >>= 0x3;
        } else if (arg2 > 192) {
            arg3 >>= 0x2;
        } else if (arg2 > 179) {
            arg3 >>= 0x1;
        }
        return (arg1 >> 2 << 10) + (arg3 >> 5 << 7) + (arg2 >> 1);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIBI)V")
    public static final void method297(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field637++;
        if (arg3 == -107 && class53.field711 <= arg4 && arg4 <= class87.field1356) {
            int var5 = class245.method1720(class63.field941, -41, arg2, class75.field1180);
            int var6 = class245.method1720(class63.field941, -86, arg1, class75.field1180);
            class142.method957(var5, arg4, 32, arg0, var6);
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "([BI)V")
    public class47(byte[] arg0, int arg1) {
        this.field632 = class89.method578(arg0, arg0.length, 0);
        if (this.field632 != arg1) {
            throw new RuntimeException();
        }
        this.method291(false, arg0);
    }
}
