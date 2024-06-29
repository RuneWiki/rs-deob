import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class51 {

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
    public static int field1042 = 0;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field1043 = null;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "Lih;")
    public static class39 field1038 = new class39(5000);

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "Ldj;")
    public static class361 field1041;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)V", line = 5)
    public static final void method448(byte arg0) {
        field1040++;
        if (class213.method1469(false) != 2) {
            return;
        }
        byte var1 = (byte) (class223.field3692 - 4 & 0xFF);
        int var2 = class223.field3692 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class306.field4975[var3][var2][var4] = var1;
            }
        }
        if (class276.field4506 == 3) {
            return;
        }
        if (arg0 < 41) {
            field1038 = (class39) null;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class144.field2421[var5] = -1000000;
            class56.field1111[var5] = 1000000;
            class235.field3849[var5] = 0;
            class280.field4577[var5] = 1000000;
            class359.field5725[var5] = 0;
        }
        if (class69.field1280 != 1) {
            int var6 = class21.method189((byte) -64, class16.field462, class223.field3693, class276.field4506);
            if (var6 - class141.field2380 < 800 && (class282.field4615[class276.field4506][class223.field3693 >> 7][class16.field462 >> 7] & 0x4) != 0) {
                class6.method46(1, class353.field5644, class223.field3693 >> 7, false, false, class16.field462 >> 7);
            }
            return;
        }
        if ((class282.field4615[class276.field4506][class96.field1750.field199 >> 7][class96.field1750.field213 >> 7] & 0x4) != 0) {
            class6.method46(0, class353.field5644, class96.field1750.field199 >> 7, false, false, class96.field1750.field213 >> 7);
        }
        if (class298.field4847 >= 310) {
            return;
        }
        int var7 = class223.field3693 >> 7;
        int var8 = class96.field1750.field213 >> 7;
        int var9 = class96.field1750.field199 >> 7;
        int var10;
        if (var9 > var7) {
            var10 = var9 - var7;
        } else {
            var10 = var7 - var9;
        }
        int var11 = class16.field462 >> 7;
        int var12;
        if (var8 > var11) {
            var12 = var8 - var11;
        } else {
            var12 = var11 - var8;
        }
        if (var10 == 0 && var12 == 0 || var10 <= -104 || var10 >= 104 || var12 <= -104 || var12 >= 104) {
            class348.method2493(-26700, (Throwable) null, "RC: " + var7 + "," + var11 + " " + var9 + "," + var8 + " " + class272.field4426 + "," + class21.field543);
            return;
        }
        if (var10 > var12) {
            int var15 = var12 * 65536 / var10;
            int var16 = 32768;
            while (var7 != var9) {
                if (var9 > var7) {
                    var7++;
                } else if (var9 < var7) {
                    var7--;
                }
                if ((class282.field4615[class276.field4506][var7][var11] & 0x4) != 0) {
                    class6.method46(1, class353.field5644, var7, false, false, var11);
                    break;
                }
                var16 += var15;
                if (var16 >= 65536) {
                    if (var11 < var8) {
                        var11++;
                    } else if (var8 < var11) {
                        var11--;
                    }
                    var16 -= 65536;
                    if ((class282.field4615[class276.field4506][var7][var11] & 0x4) != 0) {
                        class6.method46(1, class353.field5644, var7, false, false, var11);
                        break;
                    }
                }
            }
            return;
        }
        int var13 = var10 * 65536 / var12;
        int var14 = 32768;
        while (var8 != var11) {
            if (var8 > var11) {
                var11++;
            } else if (var8 < var11) {
                var11--;
            }
            if ((class282.field4615[class276.field4506][var7][var11] & 0x4) != 0) {
                class6.method46(1, class353.field5644, var7, false, false, var11);
                break;
            }
            var14 += var13;
            if (var14 >= 65536) {
                var14 -= 65536;
                if (var7 < var9) {
                    var7++;
                } else if (var9 < var7) {
                    var7--;
                }
                if ((class282.field4615[class276.field4506][var7][var11] & 0x4) != 0) {
                    class6.method46(1, class353.field5644, var7, false, false, var11);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V", line = 200)
    public static void method449(int arg0) {
        field1041 = null;
        field1043 = null;
        if (arg0 != -1) {
            field1041 = (class361) null;
        }
        field1038 = null;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z)V", line = 214)
    public static final void method450(boolean arg0) {
        if (arg0) {
            class353.field5644 = class253.field4154;
            class144.field2427 = class55.field1085;
            class197.field3294 = class23.field572;
        } else {
            class353.field5644 = class37.field814;
            class144.field2427 = class123.field2166;
            class197.field3294 = class341.field5399;
        }
        class138.field2345 = class353.field5644.length;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)V", line = 243)
    public static final void method451(int arg0, int arg1) {
        field1039++;
        class137.field2343--;
        if (arg1 <= 61) {
            field1043 = (String[]) null;
        }
        if (class137.field2343 == arg0) {
            return;
        }
        class89.method691(class317.field5173, arg0 + 1, class317.field5173, arg0, class137.field2343 - arg0);
        class89.method691(class300.field4889, arg0 + 1, class300.field4889, arg0, class137.field2343 - arg0);
        class89.method685(class73.field1327, arg0 + 1, class73.field1327, arg0, class137.field2343 - arg0);
        class89.method690(class107.field1938, arg0 + 1, class107.field1938, arg0, class137.field2343 - arg0);
        class89.method686(class177.field2926, arg0 + 1, class177.field2926, arg0, class137.field2343 - arg0);
        class89.method685(class206.field3450, arg0 + 1, class206.field3450, arg0, class137.field2343 - arg0);
        class89.method685(class317.field5172, arg0 + 1, class317.field5172, arg0, class137.field2343 - arg0);
    }
}
