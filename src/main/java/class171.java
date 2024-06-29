import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class171 {

    @OriginalMember(owner = "client!di", name = "c", descriptor = "Leb;")
    public static class230 field3028 = class68.method589(0, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!di", name = "h", descriptor = "Leb;")
    public static class230 field3033 = class68.method589(0, "headicons_prayer");

    @OriginalMember(owner = "client!di", name = "i", descriptor = "Leb;")
    public static class230 field3034 = class68.method589(0, "null");

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    public static int field3036 = 0;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public static int field3037 = 0;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "Lkk;")
    public static class223 field3031;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "Leb;")
    public static class230 field3030;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIII)V")
    public static final void method1256(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class42.field769 = arg0;
        class15.field345 = arg1;
        class78.field1404 = arg4;
        class259.field4587 = arg2;
        field3035++;
        if (arg3 != 0) {
            method1256(-2, -57, 119, 82, 49);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1257(boolean arg0, int arg1) {
        field3038++;
        if (arg0) {
            field3034 = null;
        }
        return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILka;)Lka;")
    public static final class245 method1258(int arg0, class245 arg1) {
        field3029++;
        class245 var2 = client.method1157(arg1);
        if (arg0 != -1) {
            method1259(24);
        }
        if (var2 == null) {
            var2 = arg1.field4248;
        }
        return var2;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public static final void method1259(int arg0) {
        field3032++;
        boolean var1 = true;
        class115.method917(false, true);
        class85.field1496 = 0;
        for (int var2 = 0; var2 < class91.field1646.length; var2++) {
            if (class200.field3552[var2] != -1 && class91.field1646[var2] == null) {
                class91.field1646[var2] = class183.field3224.method1546(0, (byte) -100, class200.field3552[var2]);
                if (class91.field1646[var2] == null) {
                    var1 = false;
                    class85.field1496++;
                }
            }
            if (class200.field3558[var2] != -1 && class100.field1849[var2] == null) {
                class100.field1849[var2] = class183.field3224.method1524(true, class26.field497[var2], 0, class200.field3558[var2]);
                if (class100.field1849[var2] == null) {
                    var1 = false;
                    class85.field1496++;
                }
            }
            if (class259.field4581 != null && class236.field4086[var2] == null && class259.field4581[var2] != -1) {
                class236.field4086[var2] = class183.field3224.method1524(true, class26.field497[var2], 0, class259.field4581[var2]);
                if (class236.field4086[var2] == null) {
                    var1 = false;
                    class85.field1496++;
                }
            }
        }
        if (class236.field4087 == null) {
            if (class162.field2890 == null || !class245.field4294.method1541(class173.method1267((byte) 59, new class230[] { class162.field2890.field3321, class29.field541 }), (byte) 96)) {
                class236.field4087 = new class156(0);
            } else if (class245.field4294.method1542(class173.method1267((byte) 59, new class230[] { class162.field2890.field3321, class29.field541 }), -60)) {
                class236.field4087 = class34.method315(class173.method1267((byte) 59, new class230[] { class162.field2890.field3321, class29.field541 }), 119, class245.field4294);
            } else {
                class85.field1496++;
                var1 = false;
            }
        }
        if (!var1) {
            client.field2722 = 1;
            return;
        }
        class231.field4013 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class91.field1646.length; var4++) {
            byte[] var20 = class100.field1849[var4];
            if (var20 != null) {
                int var21 = (class13.field262[var4] >> 8) * 64 - class272.field4795;
                int var22 = (class13.field262[var4] & 0xFF) * 64 - class155.field2759;
                if (class251.field4502) {
                    var21 = 10;
                    var22 = 10;
                }
                var3 &= class103.method865(var21, -28714, var20, var22);
            }
        }
        if (!var3) {
            client.field2722 = 2;
            return;
        }
        if (client.field2722 != 0) {
            class18.method221(true, (byte) 26, class173.method1267((byte) 59, new class230[] { class6.field86, class260.field4629 }));
        }
        class154.method1175(95);
        class197.method1405(128);
        boolean var5 = false;
        class204.method1428(4, 104, 104, 25, var5);
        for (int var6 = 0; var6 < 4; var6++) {
            class112.field2007[var6].method935(1);
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var18 = 0; var18 < 104; var18++) {
                for (int var19 = 0; var19 < 104; var19++) {
                    class79.field1435[var7][var18][var19] = 0;
                }
            }
        }
        class58.method494(-1, false);
        class154.method1175(95);
        System.gc();
        class115.method917(true, true);
        class226.method1562(104, false);
        if (!class251.field4502) {
            class37.method336(-1, false);
            class115.method917(true, true);
            class96.method813(false, -109);
            if (class236.field4086 != null) {
                class196.method1394(-1718);
            }
        }
        if (class251.field4502) {
            class91.method773((byte) -111, false);
            class115.method917(true, true);
            class273.method1860(false, (byte) -116);
        }
        class197.method1405(128);
        class115.method917(true, true);
        class98.method844(class112.field2007, 1490615489, false);
        class115.method917(true, true);
        int var8 = class81.field1464;
        if (class124.field2174 < var8) {
            var8 = class124.field2174;
        }
        if ((class124.field2174 - 1) > var8) {
            int var9 = class124.field2174 - 1;
        }
        if (class179.method1302(61)) {
            class142.method1090(0);
        } else {
            class142.method1090(class81.field1464);
        }
        class95.method809(49);
        if (arg0 <= 94) {
            return;
        }
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class144.method1096(var10, -99999999, var17);
            }
        }
        class127.method999((byte) 97);
        class154.method1175(95);
        class35.method322(-11135);
        class197.method1405(128);
        if (class267.field4736 != null && class30.field556 != null && class57.field1057 == 25) {
            class153.field2747.method978(-128, 175);
            class176.field3093++;
            class153.field2747.method165(1057001181, 1380186760);
        }
        if (!class251.field4502) {
            int var11 = (class273.field4809 - 6) / 8;
            int var12 = (class273.field4809 + 6) / 8;
            int var13 = (class231.field4014 + 6) / 8;
            int var14 = (class231.field4014 - 6) / 8;
            for (int var15 = var11 - 1; var15 <= (var12 + 1); var15++) {
                for (int var16 = var14 - 1; var16 <= (var13 + 1); var16++) {
                    if (var11 > var15 || var15 > var12 || var14 > var16 || var16 > var13) {
                        class183.field3224.method1532(class173.method1267((byte) 59, new class230[] { class9.field160, class37.method340(var15, (byte) -26), class45.field802, class37.method340(var16, (byte) -26) }), 110);
                        class183.field3224.method1532(class173.method1267((byte) 59, new class230[] { class263.field4677, class37.method340(var15, (byte) -26), class45.field802, class37.method340(var16, (byte) -26) }), 99);
                    }
                }
            }
        }
        if (class57.field1057 == 28) {
            class26.method260(-11, 10);
        } else {
            class26.method260(-11, 30);
            if (class30.field556 != null) {
                class153.field2747.method978(-125, 181);
            }
        }
        class154.method1175(95);
        class219.method1507((byte) 28);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V")
    public static void method1260(byte arg0) {
        field3031 = null;
        field3034 = null;
        field3028 = null;
        field3033 = null;
        field3030 = null;
        if (arg0 != -49) {
            field3030 = null;
        }
    }
}
