import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class115 extends class69 {

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "[B")
    public byte[] field2170;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "Lha;")
    public static class46 field2166 = class271.method1828(")2", -46);

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "Lha;")
    public static class46 field2167 = class271.method1828("(U4", -46);

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "Lha;")
    public static class46 field2165 = class271.method1828(")1", -46);

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
    public static int field2171 = 0;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "Lha;")
    public static class46 field2173 = class271.method1828("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", -46);

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "Lha;")
    public static class46 field2169 = class271.method1828(" weitere Optionen", -46);

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLwe;)V")
    public static final void method928(byte arg0, class75 arg1) {
        field2168++;
        int var2 = -105 / ((arg0 - 65) / 45);
        while (true) {
            while (arg1.field1380 < arg1.field1368.length) {
                boolean var3 = false;
                int var4 = 0;
                int var5 = 0;
                if (arg1.method558(1) == 1) {
                    var3 = true;
                    var4 = arg1.method558(1);
                    var5 = arg1.method558(1);
                }
                int var6 = arg1.method558(1);
                int var7 = arg1.method558(1);
                int var8 = var6 * 64 - class194.field3493;
                int var9 = class49.field836 + class232.field4039 - var7 * 64 - 1;
                if (var8 >= 0 && var9 - 63 >= 0 && var8 + 63 < class137.field2474 && class49.field836 > var9) {
                    int var10 = var8 >> 6;
                    int var11 = var9 >> 6;
                    for (int var12 = 0; var12 < 64; var12++) {
                        for (int var13 = 0; var13 < 64; var13++) {
                            if (!var3 || (var4 * 8) <= var12 && var4 * 8 + 8 > var12 && var5 * 8 <= var13 && var13 < (var5 * 8 + 8)) {
                                byte var14 = arg1.method569((byte) -110);
                                if (var14 != 0) {
                                    if (class218.field3852[var10][var11] == null) {
                                        class218.field3852[var10][var11] = new byte[4096];
                                    }
                                    class218.field3852[var10][var11][(63 - var13 << 6) + var12] = var14;
                                    byte var15 = arg1.method569((byte) -110);
                                    if (class214.field3797[var10][var11] == null) {
                                        class214.field3797[var10][var11] = new byte[4096];
                                    }
                                    class214.field3797[var10][var11][(63 - var13 << 6) + var12] = var15;
                                }
                            }
                        }
                    }
                } else {
                    for (int var16 = 0; var16 < (var3 ? 64 : 4096); var16++) {
                        byte var17 = arg1.method569((byte) -110);
                        if (var17 != 0) {
                            arg1.field1380++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BB)V")
    public static final void method929(byte arg0, byte arg1) {
        if (class60.field1001 == null) {
            class60.field1001 = new byte[4][104][104];
        }
        field2176++;
        if (arg1 != 21) {
            field2167 = null;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class60.field1001[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)Lok;")
    public static final class37 method930(int arg0, int arg1) {
        class37 var2 = (class37) class194.field3487.method1364((long) arg1, -21987);
        field2164++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class236.field4120.method1293(class130.method1011((byte) 43, arg1), class234.method1587(-50, arg1), (byte) 70);
        class37 var4 = new class37();
        if (var3 != null) {
            var4.method244(new class75(var3), -118);
        }
        class194.field3487.method1366(true, var4, (long) arg1);
        if (arg0 != 8) {
            field2177 = -35;
        }
        return var4;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    public static void method931(int arg0) {
        field2165 = null;
        if (arg0 == 0) {
            field2167 = null;
            field2169 = null;
            field2166 = null;
            field2173 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "([B)V")
    public class115(byte[] arg0) {
        this.field2170 = arg0;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZI)Lha;")
    public static final class46 method932(boolean arg0, int arg1) {
        field2175++;
        if (arg0) {
            field2177 = -75;
        }
        return class2.method5(10, true, false, arg1);
    }
}
