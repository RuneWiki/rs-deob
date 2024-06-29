import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class76 extends class122 {

    @OriginalMember(owner = "client!wa", name = "V", descriptor = "[Lkf;")
    public class215[] field1311;

    @OriginalMember(owner = "client!wa", name = "Q", descriptor = "Lqd;")
    private static class40 field1306 = class147.method1106("glow3:", (byte) -45);

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "Lqd;")
    public static class40 field1307 = field1306;

    @OriginalMember(owner = "client!wa", name = "T", descriptor = "Lqd;")
    public static class40 field1309 = field1306;

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "I")
    public static int field1308 = 0;

    @OriginalMember(owner = "client!wa", name = "U", descriptor = "I")
    public static volatile int field1310 = 0;

    @OriginalMember(owner = "client!wa", name = "Y", descriptor = "I")
    public static int field1314 = 0;

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!wa", name = "W", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lfm;I)I", line = 14)
    public static final int method560(class42 arg0, int arg1) {
        field1305++;
        if (arg1 != -1) {
            method565(-60L, 115, true, -54, -108);
        }
        class121 var2 = arg0.field796;
        if (var2.field2098 != null) {
            var2 = var2.method918(-1);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field2083;
        if (arg0.field1533 == arg0.field1514) {
            var3 = var2.field2065;
        } else if (arg0.field1514 == arg0.field1511) {
            var3 = var2.field2092;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(III)Z", line = 46)
    public static final boolean method561(int arg0, int arg1, int arg2) {
        if (arg0 <= 35) {
            method565(-92L, 87, true, 60, -119);
        }
        field1304++;
        return (arg2 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)Z", line = 77)
    public final boolean method562(byte arg0, int arg1) {
        if (arg0 > -100) {
            field1306 = (class40) null;
        }
        field1312++;
        return this.field1311[arg1].field3596;
    }

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "(I)V", line = 104)
    public static void method563(int arg0) {
        field1307 = null;
        field1309 = null;
        if (arg0 != -1) {
            method561(-52, 71, 119);
        }
        field1306 = null;
    }

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "(I)V", line = 118)
    public static final void method564(int arg0) {
        int var1 = 0;
        if (arg0 != 4401) {
            return;
        }
        while (var1 < class227.field3747) {
            int var10002 = class307.field5146[var1]--;
            if (class307.field5146[var1] >= -10) {
                label89: {
                    class137 var3 = class162.field2693[var1];
                    if (var3 == null) {
                        var3 = class137.method1012(class156.field2612, class78.field1324[var1], 0);
                        if (var3 == null) {
                            break label89;
                        }
                        class307.field5146[var1] += var3.method1013();
                        class162.field2693[var1] = var3;
                    }
                    if (class307.field5146[var1] < 0) {
                        label92: {
                            int var4;
                            if (class116.field1990[var1] == 0) {
                                var4 = class94.field1698;
                            } else {
                                int var5 = (class116.field1990[var1] & 0xFF) * 128;
                                int var6 = (class116.field1990[var1] & 0xFF0960) >> 16;
                                int var7 = var6 * 128 + (64 - class255.field4233.field1531);
                                if (var7 < 0) {
                                    var7 = -var7;
                                }
                                int var8 = class116.field1990[var1] >> 8 & 0xFF;
                                int var9 = var8 * 128 + 64 - class255.field4233.field1497;
                                if (var9 < 0) {
                                    var9 = -var9;
                                }
                                int var10 = var7 + var9 - 128;
                                if (var10 > var5) {
                                    class307.field5146[var1] = -100;
                                    break label92;
                                }
                                if (var10 < 0) {
                                    var10 = 0;
                                }
                                var4 = (var5 - var10) * class105.field1854 / var5;
                            }
                            if (var4 > 0) {
                                class64 var11 = var3.method1011().method519(class252.field4181);
                                class145 var12 = class145.method1069(var11, 100, var4);
                                var12.method1090(class59.field1129[var1] - 1);
                                class89.field1610.method1331(var12);
                            }
                            class307.field5146[var1] = -100;
                        }
                    }
                }
            } else {
                class227.field3747--;
                for (int var2 = var1; var2 < class227.field3747; var2++) {
                    class78.field1324[var2] = class78.field1324[var2 + 1];
                    class162.field2693[var2] = class162.field2693[var2 + 1];
                    class59.field1129[var2] = class59.field1129[var2 + 1];
                    class307.field5146[var2] = class307.field5146[var2 + 1];
                    class116.field1990[var2] = class116.field1990[var2 + 1];
                }
                var1--;
            }
            var1++;
        }
        field1315++;
        if (class101.field1775 && !class134.method994((byte) -93)) {
            if (class90.field1636 != 0 && class217.field3611 != -1) {
                class150.method1127(false, 0, class199.field3189, (byte) 125, class90.field1636, class217.field3611);
            }
            class101.field1775 = false;
        } else if (class90.field1636 != 0 && class217.field3611 != -1 && !class134.method994((byte) -93)) {
            class19.field295.method1464(19, arg0 ^ 0x1131);
            class250.field4146++;
            class19.field295.method239((byte) 109, class217.field3611);
            class217.field3611 = -1;
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lce;Lce;IZ)V", line = 240)
    public class76(class239 arg0, class239 arg1, int arg2, boolean arg3) {
        class282 var5 = new class282();
        int var6 = arg0.method1664(arg2, (byte) 30);
        this.field1311 = new class215[var6];
        int[] var7 = arg0.method1673((byte) -125, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1651(arg2, var7[var8], -1);
            class110 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class110 var12 = (class110) var5.method1971(100); var12 != null; var12 = (class110) var5.method1967(100)) {
                if (var12.field1925 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1662(var11, 68, 0);
                } else {
                    var13 = arg1.method1662(0, 90, var11);
                }
                var10 = new class110(var11, var13);
                var5.method1972(var10, 3);
            }
            this.field1311[var7[var8]] = new class215(var9, var10);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(JIZII)Lqd;", line = 303)
    public static final class40 method565(long arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field1303++;
        if (arg1 <= 90) {
            method560((class42) null, -73);
        }
        class40 var6 = class29.method274((byte) -118, 0);
        if (arg0 < 0L) {
            arg0 = -arg0;
            var6.method334(class87.field1569, false);
        }
        class40 var7 = class148.field2496;
        class40 var8 = class134.field2270;
        if (arg4 == 1) {
            var7 = class134.field2270;
            var8 = class148.field2496;
        }
        if (arg4 == 2) {
            var7 = class134.field2270;
            var8 = class80.field1414;
        }
        class40 var9 = class29.method274((byte) -118, 0);
        class40 var10 = class29.method274((byte) -118, 0);
        for (int var11 = 0; var11 < arg3; var11++) {
            var10.method334(class276.method1927((byte) -79, (int) (arg0 % 10L)), false);
            arg0 /= 10L;
        }
        int var12 = 0;
        if (arg0 == 0L) {
            var9 = class133.field2263;
        }
        while (arg0 > 0L) {
            if (arg2 && var12 != 0 && (var12 % 3) == 0) {
                var9.method334(var8, false);
            }
            var9.method334(class276.method1927((byte) -98, (int) (arg0 % 10L)), false);
            var12++;
            arg0 /= 10L;
        }
        if (var10.method350(true) > 0) {
            var10.method334(var7, false);
        }
        return class153.method1192(new class40[] { var6, var9.method335(0), var10.method335(0) }, (byte) -124);
    }
}
