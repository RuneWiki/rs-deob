import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class77 {

    @OriginalMember(owner = "client!me", name = "h", descriptor = "Lke;")
    private static class65 field2052 = class1.method17("Invalid username or password)3", -126);

    @OriginalMember(owner = "client!me", name = "i", descriptor = "Lke;")
    public static class65 field2053 = class1.method17("Ihre Nachricht an: ", -118);

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field2054 = 0;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "Lke;")
    public static class65 field2055 = field2052;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "Lke;")
    public static class65 field2048 = class1.method17("Fallen lassen", -116);

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field2046 = -1;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "Lke;")
    public static class65 field2060 = class1.method17("Benutzen Sie bitte eine andere Welt)3", -117);

    @OriginalMember(owner = "client!me", name = "o", descriptor = "Lqd;")
    public static class100 field2059 = new class100(100);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "Ljd;")
    public static class58 field2049;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "Lpa;")
    public static class90 field2051;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "[[B")
    public static byte[][] field2050;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IZ)V", line = 8)
    public static final void method678(int arg0, boolean arg1) {
        field2058++;
        class78.field2082 = arg1;
        if (arg0 != 16) {
            return;
        }
        if (!class78.field2082) {
            int var25 = class58.field1575.method314(false);
            int var26 = class58.field1575.method326(255);
            int var27 = (class54.field1392 - class58.field1575.field998) / 16;
            class62.field1632 = new int[var27][4];
            for (int var28 = 0; var28 < var27; var28++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class62.field1632[var28][var37] = class58.field1575.method347(class117.method950(arg0, 239));
                }
            }
            int var29 = class58.field1575.method314(false);
            boolean var30 = false;
            int var31 = class58.field1575.method334(125);
            int var32 = class58.field1575.method300(126);
            class12.field244 = new byte[var27][];
            if ((var32 / 8 == 48 || var32 / 8 == 49) && var29 / 8 == 48) {
                var30 = true;
            }
            field2050 = new byte[var27][];
            if (var32 / 8 == 48 && var29 / 8 == 148) {
                var30 = true;
            }
            class46.field1193 = new int[var27];
            class43.field1129 = new int[var27];
            class74.field1975 = new int[var27];
            int var33 = 0;
            for (int var34 = (var32 - 6) / 8; var34 <= (var32 + 6) / 8; var34++) {
                for (int var35 = (var29 - 6) / 8; var35 <= (var29 + 6) / 8; var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (!var30 || var35 != 49 && var35 != 149 && var35 != 147 && var34 != 50 && (var34 != 49 || var35 != 47)) {
                        class43.field1129[var33] = var36;
                        class74.field1975[var33] = class20.field491.method490(class21.method172(arg0 - 105, new class65[] { class3.field55, class39.method320(var34, (byte) -36), class90.field2393, class39.method320(var35, (byte) -36) }), 87);
                        class46.field1193[var33] = class20.field491.method490(class21.method172(arg0 - 122, new class65[] { class111.field2742, class39.method320(var34, (byte) -36), class90.field2393, class39.method320(var35, (byte) -36) }), 95);
                        var33++;
                    }
                }
            }
            class78.method683(var26, var29, var32, var25, false, var31);
            return;
        }
        int var2 = class58.field1575.method314(false);
        int var3 = class58.field1575.method314(false);
        class58.field1575.method639(true);
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = class58.field1575.method649(72, 1);
                    if (var24 == 1) {
                        class66.field1754[var4][var22][var23] = class58.field1575.method649(55, 26);
                    } else {
                        class66.field1754[var4][var22][var23] = -1;
                    }
                }
            }
        }
        class58.field1575.method643((byte) -127);
        int var5 = (class54.field1392 - class58.field1575.field998) / 16;
        class62.field1632 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var21 = 0; var21 < 4; var21++) {
                class62.field1632[var6][var21] = class58.field1575.method306(class117.method950(arg0, -13));
            }
        }
        int var7 = class58.field1575.method314(false);
        int var8 = class58.field1575.method324(-56);
        int var9 = class58.field1575.method317(arg0 - 16);
        class46.field1193 = new int[var5];
        class43.field1129 = new int[var5];
        field2050 = new byte[var5][];
        class12.field244 = new byte[var5][];
        class74.field1975 = new int[var5];
        int var10 = 0;
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < 13; var12++) {
                for (int var13 = 0; var13 < 13; var13++) {
                    int var14 = class66.field1754[var11][var12][var13];
                    if (var14 != -1) {
                        int var15 = var14 >> 14 & 0x3FF;
                        int var16 = var14 >> 3 & 0x7FF;
                        int var17 = (var15 / 8 << 8) + var16 / 8;
                        for (int var18 = 0; var18 < var10; var18++) {
                            if (class43.field1129[var18] == var17) {
                                var17 = -1;
                                break;
                            }
                        }
                        if (var17 != -1) {
                            class43.field1129[var10] = var17;
                            int var19 = var17 & 0xFF;
                            int var20 = var17 >> 8 & 0xFF;
                            class74.field1975[var10] = class20.field491.method490(class21.method172(-59, new class65[] { class3.field55, class39.method320(var20, (byte) -36), class90.field2393, class39.method320(var19, (byte) -36) }), 54);
                            class46.field1193[var10] = class20.field491.method490(class21.method172(-102, new class65[] { class111.field2742, class39.method320(var20, (byte) -36), class90.field2393, class39.method320(var19, (byte) -36) }), class117.method950(arg0, 117));
                            var10++;
                        }
                    }
                }
            }
        }
        class78.method683(var2, var8, var3, var7, false, var9);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V", line = 230)
    public static void method679(int arg0) {
        field2055 = null;
        field2049 = null;
        field2050 = null;
        field2048 = null;
        field2060 = null;
        if (arg0 < -37) {
            field2053 = null;
            field2059 = null;
            field2052 = null;
            field2051 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljd;Ljd;BLjd;)V", line = 283)
    public static final void method680(class58 arg0, class58 arg1, byte arg2, class58 arg3) {
        class7.field145 = arg1;
        if (arg2 > -91) {
            field2053 = null;
        }
        field2045++;
        class43.field1142 = arg0;
        class17.field366 = arg3;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)[B", line = 304)
    public static final synchronized byte[] method681(int arg0, int arg1) {
        field2061++;
        if (arg0 == 100 && class126.field3064 > 0) {
            byte[] var2 = class33.field862[--class126.field3064];
            class33.field862[class126.field3064] = null;
            return var2;
        } else if (arg1 != -1) {
            return null;
        } else if (arg0 == 5000 && client.field402 > 0) {
            byte[] var3 = class100.field2612[--client.field402];
            class100.field2612[client.field402] = null;
            return var3;
        } else if (arg0 == 30000 && class10.field206 > 0) {
            byte[] var4 = class48.field1254[--class10.field206];
            class48.field1254[class10.field206] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }
}
