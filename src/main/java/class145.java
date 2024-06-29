import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class145 {

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public int field2207 = -1;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field2206 = 0;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field2210 = 0;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public static int field2209 = 0;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "Lna;")
    public static class26 field2201 = class69.method505("underlay", (byte) -123);

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "Lna;")
    public static class26 field2200 = class69.method505("Kampfstufe: ", (byte) -123);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public int field2198;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public int field2199;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public int field2202;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public int field2203;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public int field2205;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public int field2208;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public int field2212;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
    public int field2213;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLwa;)V", line = 6)
    public static final void method961(byte arg0, class82 arg1) {
        field2211++;
        while (true) {
            while (arg1.field1280.length > arg1.field1301) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method642((byte) -29) == 1) {
                    var3 = arg1.method642((byte) -73);
                    var2 = true;
                    var4 = arg1.method642((byte) -61);
                }
                int var5 = arg1.method642((byte) -101);
                int var6 = arg1.method642((byte) -109);
                int var7 = var5 * 64 - class135.field2057;
                int var8 = class317.field5436 - (var6 * 64) - (1 - class9.field111);
                if (var7 >= 0 && var8 - 63 >= 0 && class38.field623 > var7 + 63 && var8 < class317.field5436) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || (var3 * 8) <= var11 && var11 < (var3 * 8 + 8) && var12 >= (var4 * 8) && var12 < var4 * 8 + 8) {
                                int var13 = arg1.method642((byte) -118);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg1.method642((byte) -23);
                                        if (class260.field4257[var9][var10] == null) {
                                            class260.field4257[var9][var10] = new byte[4096];
                                        }
                                        class260.field4257[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg1.method633((byte) 85);
                                        if (class167.field2588[var9][var10] == null) {
                                            class167.field2588[var9][var10] = new int[4096];
                                        }
                                        class167.field2588[var9][var10][(63 - var12 << 6) + var11] = var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = arg1.method633((byte) 117);
                                        if (class229.field3631[var9][var10] == null) {
                                            class229.field3631[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class78 var17 = class104.method750(4, var16);
                                        if (var17.field1222 != null) {
                                            var17 = var17.method552(0);
                                            if (var17 == null || var17.field1174 == -1) {
                                                continue;
                                            }
                                        }
                                        class229.field3631[var9][var10][(63 - var12 << 6) + var11] = var17.field1226 + 1;
                                        class323 var18 = new class323();
                                        var18.field5549 = var17.field1174;
                                        var18.field5548 = var7;
                                        var18.field5558 = var8;
                                        class124.field1925.method257(true, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg1.method642((byte) -28);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg1.field1301++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg1.field1301 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg1.field1301 += 3;
                            }
                        }
                    }
                }
            }
            int var21 = -58 % ((arg0 - 42) / 32);
            return;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V", line = 152)
    public static void method962(byte arg0) {
        if (arg0 <= 38) {
            method962((byte) -126);
        }
        field2201 = null;
        field2200 = null;
    }
}
