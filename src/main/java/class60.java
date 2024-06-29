import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class60 {

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public int field1257 = 0;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "Lud;")
    private static class279 field1256 = class130.method1024(" ", 255);

    @OriginalMember(owner = "client!b", name = "e", descriptor = "Lud;")
    public static class279 field1258 = field1256;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "Ldg;")
    public static class317 field1263 = new class317();

    @OriginalMember(owner = "client!b", name = "l", descriptor = "Lud;")
    public static class279 field1265 = class130.method1024("", 255);

    @OriginalMember(owner = "client!b", name = "n", descriptor = "Lud;")
    public static class279 field1267 = field1265;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "Lud;")
    public static class279 field1266 = class130.method1024(")1", 255);

    @OriginalMember(owner = "client!b", name = "o", descriptor = "Lud;")
    public static class279 field1268 = class130.method1024("Vous ne pouvez pas ajouter votre nom -9 votre liste noire)3", 255);

    @OriginalMember(owner = "client!b", name = "k", descriptor = "Lud;")
    public static class279 field1264 = field1265;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lkk;Lcd;I)Lvk;", line = 9)
    public static final class168 method535(class231 arg0, class69 arg1, int arg2) {
        if (arg2 != 1789864520) {
            field1258 = (class279) null;
        }
        field1259++;
        long var3 = ((long) arg0.field4039 << 56) + ((long) arg0.field4034 << 32) + (long) ((arg0.field4035 - -1 << 16) - -arg0.field4047);
        class168 var5 = (class168) arg1.method610(var3, -1);
        if (var5 == null) {
            var5 = new class168(arg0.field4035, (float) arg0.field4047, true, false, arg0.field4034);
            arg1.method612(false, var5, var3);
        }
        return var5;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lvh;B)V", line = 39)
    public final void method536(class53 arg0, byte arg1) {
        field1254++;
        if (arg1 <= 119) {
            method535((class231) null, (class69) null, 42);
        }
        while (true) {
            int var3 = arg0.method483(-126);
            if (var3 == 0) {
                return;
            }
            this.method539(false, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V", line = 64)
    public static void method537(byte arg0) {
        field1267 = null;
        field1256 = null;
        if (arg0 != 5) {
            field1266 = (class279) null;
        }
        field1263 = null;
        field1264 = null;
        field1265 = null;
        field1266 = null;
        field1258 = null;
        field1268 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([BI)Z", line = 85)
    public static final boolean method538(byte[] arg0, int arg1) {
        field1262++;
        class53 var2 = new class53(arg0);
        int var3 = var2.method483(-111);
        if (var3 != 1) {
            return false;
        } else if (arg1 >= -31) {
            return true;
        } else {
            boolean var4 = var2.method483(-123) == 1;
            if (var4) {
                class142.method1091(var2, 20661);
            }
            class90.method771(var2, true);
            return true;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZLvh;I)V", line = 112)
    private final void method539(boolean arg0, class53 arg1, int arg2) {
        field1261++;
        if (!arg0 && arg2 == 5) {
            this.field1257 = arg1.method468(28214);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IZ)V", line = 134)
    public static final void method540(int arg0, boolean arg1) {
        if (arg0 != -26242) {
            return;
        }
        field1255++;
        class255.field4554 = arg1;
        if (!class255.field4554) {
            int var2 = class287.field5106.method491(arg0 + 24974);
            int var3 = (class264.field4741 - class287.field5106.field1142) / 16;
            class102.field1911 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    class102.field1911[var4][var5] = class287.field5106.method450((byte) 116);
                }
            }
            int var6 = class287.field5106.method475(-110);
            boolean var7 = false;
            int var8 = class287.field5106.method475(-73);
            int var9 = class287.field5106.method468(28214);
            int var10 = class287.field5106.method483(-127);
            class309.field5488 = new int[var3];
            class297.field5280 = new byte[var3][];
            class7.field147 = new byte[var3][];
            class62.field1270 = new int[var3];
            class237.field4133 = new byte[var3][];
            class74.field1468 = new int[var3];
            if ((var6 / 8 == 48 || (var6 / 8) == 49) && var9 / 8 == 48) {
                var7 = true;
            }
            class28.field676 = new int[var3];
            class238.field4170 = (byte[][]) null;
            class226.field3976 = null;
            class122.field2204 = new byte[var3][];
            if (var6 / 8 == 48 && var9 / 8 == 148) {
                var7 = true;
            }
            class77.field1493 = new int[var3];
            int var11 = 0;
            for (int var12 = (var6 - 6) / 8; var12 <= ((var6 + 6) / 8); var12++) {
                for (int var13 = (var9 - 6) / 8; var13 <= ((var9 + 6) / 8); var13++) {
                    int var14 = (var12 << 8) + var13;
                    if (var7 && (var13 == 49 || var13 == 149 || var13 == 147 || var12 == 50 || var12 == 49 && var13 == 47)) {
                        class77.field1493[var11] = var14;
                        class74.field1468[var11] = -1;
                        class28.field676[var11] = -1;
                        class309.field5488[var11] = -1;
                        class62.field1270[var11] = -1;
                    } else {
                        class77.field1493[var11] = var14;
                        class74.field1468[var11] = class295.field5259.method1167(class115.method929(new class279[] { class84.field1598, class191.method1447(5, var12), class229.field3987, class191.method1447(5, var13) }, (byte) 60), 108);
                        class28.field676[var11] = class295.field5259.method1167(class115.method929(new class279[] { class265.field4780, class191.method1447(5, var12), class229.field3987, class191.method1447(5, var13) }, (byte) 60), 110);
                        class309.field5488[var11] = class295.field5259.method1167(class115.method929(new class279[] { class304.field5392, class191.method1447(5, var12), class229.field3987, class191.method1447(5, var13) }, (byte) 60), 112);
                        class62.field1270[var11] = class295.field5259.method1167(class115.method929(new class279[] { class18.field565, class191.method1447(5, var12), class229.field3987, class191.method1447(5, var13) }, (byte) 60), 126);
                    }
                    var11++;
                }
            }
            class72.method629(var10, var2, -28589, false, var9, var6, var8);
            return;
        }
        int var15 = class287.field5106.method468(arg0 ^ 0xFFFFF748);
        int var16 = class287.field5106.method475(-77);
        class287.field5106.method1625(8);
        for (int var17 = 0; var17 < 4; var17++) {
            for (int var18 = 0; var18 < 13; var18++) {
                for (int var19 = 0; var19 < 13; var19++) {
                    int var20 = class287.field5106.method1628(arg0 ^ 0x66FA, 1);
                    if (var20 == 1) {
                        class41.field872[var17][var18][var19] = class287.field5106.method1628(86, 26);
                    } else {
                        class41.field872[var17][var18][var19] = -1;
                    }
                }
            }
        }
        class287.field5106.method1635(true);
        int var21 = (class264.field4741 - class287.field5106.field1142) / 16;
        class102.field1911 = new int[var21][4];
        for (int var22 = 0; var22 < var21; var22++) {
            for (int var23 = 0; var23 < 4; var23++) {
                class102.field1911[var22][var23] = class287.field5106.method456((byte) -119);
            }
        }
        int var24 = class287.field5106.method488((byte) 120);
        int var25 = class287.field5106.method468(28214);
        int var26 = class287.field5106.method491(arg0 ^ 0x6272);
        class74.field1468 = new int[var21];
        class122.field2204 = new byte[var21][];
        class297.field5280 = new byte[var21][];
        class28.field676 = new int[var21];
        class237.field4133 = new byte[var21][];
        class62.field1270 = new int[var21];
        class309.field5488 = new int[var21];
        class238.field4170 = (byte[][]) null;
        class7.field147 = new byte[var21][];
        class77.field1493 = new int[var21];
        int var27 = 0;
        class226.field3976 = null;
        for (int var28 = 0; var28 < 4; var28++) {
            for (int var29 = 0; var29 < 13; var29++) {
                for (int var30 = 0; var30 < 13; var30++) {
                    int var31 = class41.field872[var28][var29][var30];
                    if (var31 != -1) {
                        int var32 = var31 >> 14 & 0x3FF;
                        int var33 = var31 >> 3 & 0x7FF;
                        int var34 = (var32 / 8 << 8) + var33 / 8;
                        for (int var35 = 0; var35 < var27; var35++) {
                            if (class77.field1493[var35] == var34) {
                                var34 = -1;
                                break;
                            }
                        }
                        if (var34 != -1) {
                            class77.field1493[var27] = var34;
                            int var36 = var34 >> 8 & 0xFF;
                            int var37 = var34 & 0xFF;
                            class74.field1468[var27] = class295.field5259.method1167(class115.method929(new class279[] { class84.field1598, class191.method1447(5, var36), class229.field3987, class191.method1447(arg0 + 26247, var37) }, (byte) 60), 119);
                            class28.field676[var27] = class295.field5259.method1167(class115.method929(new class279[] { class265.field4780, class191.method1447(5, var36), class229.field3987, class191.method1447(class13.method92(arg0, -26245), var37) }, (byte) 60), arg0 + 26337);
                            class309.field5488[var27] = class295.field5259.method1167(class115.method929(new class279[] { class304.field5392, class191.method1447(5, var36), class229.field3987, class191.method1447(5, var37) }, (byte) 60), 94);
                            class62.field1270[var27] = class295.field5259.method1167(class115.method929(new class279[] { class18.field565, class191.method1447(5, var36), class229.field3987, class191.method1447(5, var37) }, (byte) 60), 110);
                            var27++;
                        }
                    }
                }
            }
        }
        class72.method629(var24, var25, -28589, false, var26, var15, var16);
    }
}
