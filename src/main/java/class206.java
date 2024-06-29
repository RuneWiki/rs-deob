import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class206 extends class204 {

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "I")
    public static int field3560 = 0;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
    public static int field3557 = 0;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "Ls;")
    public static class171 field3558 = null;

    @OriginalMember(owner = "client!dj", name = "C", descriptor = "I")
    public static int field3562 = 100;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!dj", name = "D", descriptor = "Lg;")
    public static class62 field3563;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BI)V", line = 11)
    public static final void method1362(byte arg0, int arg1) {
        class166.field2816.method1156(arg1, 0);
        field3561++;
        int var2 = 86 / ((arg0 - 6) / 43);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILoh;)V", line = 22)
    public static final void method1363(int arg0, class258 arg1) {
        field3559++;
        class70.field1210 = arg1;
        if (class297.field5086.field5061 == null) {
            return;
        }
        try {
            class258 var2 = class120.field2111.method1814(class297.field5086.field5061, (byte) 65);
            class258 var3 = class102.field1868.method1814(class297.field5086.field5061, (byte) 89);
            class258 var4 = class100.method755(-6, new class258[] { var2, class82.field1382, arg1, class125.field2236, var3 });
            class258 var5;
            if (arg1.method1816(false) == 0) {
                var5 = class100.method755(-6, new class258[] { var4, class264.field4600 });
            } else {
                var5 = class100.method755(-6, new class258[] { var4, class193.field3406, class128.method925(class25.method197(-3418) + 94608000000L, 10), class240.field4176, class152.method1041((byte) 126, 94608000L) });
            }
            if (arg0 != -24261) {
                return;
            }
            class100.method755(-6, new class258[] { class192.field3396, var5, class210.field3616 }).method1772(false, class297.field5086.field5061);
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)V", line = 68)
    public static void method1364(int arg0) {
        field3563 = null;
        field3558 = null;
        if (arg0 != 21054) {
            method1364(100);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lva;I)V", line = 89)
    public static final void method1365(class235 arg0, int arg1) {
        field3556++;
        if (arg1 >= -73) {
            field3563 = (class62) null;
        }
        while (true) {
            while (arg0.field4051 < arg0.field4066.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method1589(114) == 1) {
                    var4 = arg0.method1589(85);
                    var3 = arg0.method1589(78);
                    var2 = true;
                }
                int var5 = arg0.method1589(109);
                int var6 = arg0.method1589(100);
                int var7 = var5 * 64 - class49.field735;
                int var8 = class225.field3870 + class317.field5348 - var6 * 64 - 1;
                if (var7 >= 0 && (var8 - 63) >= 0 && (var7 + 63) < class57.field907 && var8 < class225.field3870) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= (var4 * 8) && var11 < var4 * 8 + 8 && var3 * 8 <= var12 && var12 < (var3 * 8 + 8)) {
                                byte var13 = arg0.method1617((byte) -117);
                                if (var13 != 0) {
                                    if (class64.field1122[var9][var10] == null) {
                                        class64.field1122[var9][var10] = new byte[4096];
                                    }
                                    class64.field1122[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method1617((byte) -117);
                                    if (class167.field2836[var9][var10] == null) {
                                        class167.field2836[var9][var10] = new byte[4096];
                                    }
                                    class167.field2836[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method1617((byte) -117);
                        if (var16 != 0) {
                            arg0.field4051++;
                        }
                    }
                }
            }
            return;
        }
    }
}
