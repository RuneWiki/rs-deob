import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class233 {

    @OriginalMember(owner = "client!d", name = "b", descriptor = "[I")
    public static int[] field4057 = new int[32];

    @OriginalMember(owner = "client!d", name = "h", descriptor = "Lp;")
    public static class280 field4063 = class18.method140((byte) -126, "<)4col> x");

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "Ltg;")
    public static class180 field4056;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "[I")
    public static int[] field4060;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)I")
    public static final int method1566(int arg0) {
        if (arg0 != 4065) {
            method1567((byte) 38);
        }
        field4058++;
        return 6;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
    public static void method1567(byte arg0) {
        field4063 = null;
        field4057 = null;
        if (arg0 != -25) {
            field4063 = null;
        }
        field4060 = null;
        field4056 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I[Lpk;I[BZI)V")
    public static final void method1568(int arg0, class99[] arg1, int arg2, byte[] arg3, boolean arg4, int arg5) {
        class25 var6 = new class25(arg3);
        field4061++;
        int var7 = -1;
        if (arg0 != 4083) {
            return;
        }
        while (true) {
            int var8 = var6.method190(arg0 ^ 0x700C);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method210(65536);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = (var9 & 0xFE1) >> 6;
                int var13 = var9 >> 12;
                int var14 = var6.method189((byte) -103);
                int var15 = var14 & 0x3;
                int var16 = var14 >> 2;
                int var17 = arg2 + var12;
                int var18 = arg5 + var11;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    class99 var19 = null;
                    if (!arg4) {
                        int var20 = var13;
                        if ((class259.field4598[1][var17][var18] & 0x2) == 2) {
                            var20 = var13 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg1[var20];
                        }
                    }
                    class17.method131(var16, !arg4, var13, var13, arg4, var19, var7, var15, var18, var17, 951286498);
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Lua;")
    public static final class113 method1569(int arg0, int arg1) {
        int var2 = arg1 >> 16;
        field4062++;
        int var3 = arg0 & arg1;
        if (class251.field4394[var2] == null || class251.field4394[var2][var3] == null) {
            boolean var4 = class48.method356(-664, var2);
            if (!var4) {
                return null;
            }
        }
        return class251.field4394[var2][var3];
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Llj;I)V")
    public static final void method1570(class25 arg0, int arg1) {
        field4064++;
        if (arg1 > -126) {
            field4060 = null;
        }
        while (true) {
            while (arg0.field481 < arg0.field475.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method189((byte) -103) == 1) {
                    var3 = arg0.method189((byte) -103);
                    var2 = true;
                    var4 = arg0.method189((byte) -103);
                }
                int var5 = arg0.method189((byte) -103);
                int var6 = arg0.method189((byte) -103);
                int var7 = var5 * 64 - class113.field2023;
                int var8 = class243.field4268 + class74.field1222 - (var6 * 64) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && var7 + 63 < class47.field779 && var8 < class74.field1222) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= (var3 * 8) && var11 < var3 * 8 + 8 && var4 * 8 <= var12 && var4 * 8 + 8 > var12) {
                                byte var13 = arg0.method200(32768);
                                if (var13 != 0) {
                                    if (class80.field1313[var9][var10] == null) {
                                        class80.field1313[var9][var10] = new byte[4096];
                                    }
                                    class80.field1313[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method200(32768);
                                    if (class55.field906[var9][var10] == null) {
                                        class55.field906[var9][var10] = new byte[4096];
                                    }
                                    class55.field906[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method200(32768);
                        if (var16 != 0) {
                            arg0.field481++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)I")
    public static final int method1571(boolean arg0) {
        if (!arg0) {
            method1569(6, 9);
        }
        field4059++;
        return class134.field2377;
    }
}
