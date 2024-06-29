import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class116 {

    @OriginalMember(owner = "client!s", name = "g", descriptor = "Lke;")
    public static class256 field2037 = class316.method2202("(U0a )2 non)2existant gosub script)2num: ", 27626);

    @OriginalMember(owner = "client!s", name = "c", descriptor = "Lke;")
    public static class256 field2033 = class316.method2202("scape main", 27626);

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field2039 = 0;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Lij;")
    public static class175 field2031 = new class175();

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "[Lel;")
    public static class232[] field2035;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILra;)V", line = 4)
    public static final void method791(int arg0, class41 arg1) {
        field2034++;
        if (arg0 < 93) {
            field2036 = -26;
        }
        while (true) {
            while (arg1.field772.length > arg1.field738) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method357(false) == 1) {
                    var3 = arg1.method357(false);
                    var2 = true;
                    var4 = arg1.method357(false);
                }
                int var5 = arg1.method357(false);
                int var6 = arg1.method357(false);
                int var7 = class154.field2753 + class8.field133 - var6 * 64 - 1;
                int var8 = var5 * 64 - class313.field5383;
                if (var8 >= 0 && (var7 - 63) >= 0 && var8 + 63 < class40.field731 && class154.field2753 > var7) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || (var3 * 8) <= var11 && var3 * 8 + 8 > var11 && var4 * 8 <= var12 && var12 < (var4 * 8 + 8)) {
                                int var13 = arg1.method357(false);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg1.method357(false);
                                        if (class313.field5396[var9][var10] == null) {
                                            class313.field5396[var9][var10] = new byte[4096];
                                        }
                                        class313.field5396[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg1.method346(-16);
                                        if (class80.field1492[var9][var10] == null) {
                                            class80.field1492[var9][var10] = new short[4096];
                                        }
                                        class80.field1492[var9][var10][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = ((arg1.method357(false) & 0xFF) << 16) + ((arg1.method357(false) & 0xFF) << 8) + (arg1.method357(false) & 0xFF);
                                        if (class305.field5269[var9][var10] == null) {
                                            class305.field5269[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class273 var17 = class271.method1871(122, var16);
                                        if (var17.field4664 != null) {
                                            var17 = var17.method1887(-73);
                                            if (var17 == null || var17.field4692 == -1) {
                                                continue;
                                            }
                                        }
                                        class305.field5269[var9][var10][(63 - var12 << 6) + var11] = var17.field4684 + 1;
                                        class80 var18 = new class80();
                                        var18.field1494 = var17.field4692;
                                        var18.field1485 = var7;
                                        var18.field1484 = var8;
                                        class247.field4211.method1269(false, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg1.method357(false);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg1.field738++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg1.field738 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg1.field738 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 154)
    public static void method792(int arg0) {
        field2033 = null;
        if (arg0 != 64) {
            field2036 = 101;
        }
        field2031 = null;
        field2035 = null;
        field2037 = null;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V", line = 172)
    public static final void method793(int arg0) {
        int var1 = class13.field178.length;
        for (int var2 = arg0; var2 < var1; var2++) {
            if (class13.field178[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class240.field4099; var4++) {
                    if (class44.field829[var2] == class34.field540[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class34.field540[class240.field4099] = class44.field829[var2];
                    var3 = class240.field4099++;
                }
                class41 var5 = new class41(class13.field178[var2]);
                int var6 = 0;
                while (var5.field738 < class13.field178[var2].length && var6 < 511) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method346(-16);
                    int var9 = var8 >> 14;
                    int var10 = var8 & 0x3F;
                    int var11 = var8 >> 7 & 0x3F;
                    int var12 = (class44.field829[var2] >> 8) * 64 + var11 - class134.field2336;
                    int var13 = (class44.field829[var2] & 0xFF) * 64 + var10 - class10.field147;
                    class74 var14 = class321.method2230(var5.method346(-16), (byte) -49);
                    if (class187.field3281[var7] == null && (var14.field1362 & 0x1) > 0 && class7.field110 == var9 && var12 >= 0 && var14.field1418 + var12 < 104 && var13 >= 0 && (var14.field1418 + var13) < 104) {
                        class187.field3281[var7] = new class279();
                        class279 var15 = class187.field3281[var7];
                        class141.field2480[class311.field5357++] = var7;
                        var15.field1199 = class45.field840;
                        var15.method1960(-1403, var14);
                        var15.method510(0, var15.field4860.field1418);
                        var15.field1213 = var15.field1191 = class203.field3686[var15.field4860.field1421];
                        var15.field1194 = var15.field4860.field1356;
                        var15.field1251 = var15.field4860.field1399;
                        var15.field1249 = var15.field4860.field1369;
                        var15.field1232 = var15.field4860.field1354;
                        var15.field1238 = var15.field4860.field1405;
                        var15.field1205 = var15.field4860.field1370;
                        var15.field1220 = var15.field4860.field1403;
                        var15.field1198 = var15.field4860.field1413;
                        if (var15.field1205 == 0) {
                            var15.field1191 = 0;
                        }
                        var15.method512(-734, var15.method515(5373952), var13, true, var12);
                    }
                }
            }
        }
        field2032++;
    }
}
