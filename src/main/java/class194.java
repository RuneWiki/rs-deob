import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class194 extends class162 {

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "Lsb;")
    public class245 field3068;

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "Ljava/lang/String;")
    public static String field3069 = "Loaded world list data";

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field3066 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "[J")
    public static long[] field3070 = new long[32];

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!tg", name = "H", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!tg", name = "J", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "Lwa;")
    public static class281 field3071;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)J")
    public static final long method1344(int arg0, int arg1, int arg2) {
        class154 var3 = class27.field346[arg0][arg1][arg2];
        return var3 == null || var3.field2411 == null ? 0L : var3.field2411.field2635;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lsb;)V")
    public class194(class245 arg0) {
        this.field3068 = arg0;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I[BIZ[Lwi;I)V")
    public static final void method1345(int arg0, byte[] arg1, int arg2, boolean arg3, class142[] arg4, int arg5) {
        if (arg2 <= 109) {
            return;
        }
        field3073++;
        class202 var6 = new class202(arg1);
        int var7 = -1;
        while (true) {
            int var8 = var6.method1458((byte) 125);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method1450(-88);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = (var9 & 0xFDF) >> 6;
                int var13 = var6.method1420((byte) 0);
                int var14 = var13 >> 2;
                int var15 = var9 >> 12;
                int var16 = var13 & 0x3;
                int var17 = arg0 + var12;
                int var18 = arg5 + var11;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    class142 var19 = null;
                    if (!arg3) {
                        int var20 = var15;
                        if ((class128.field1972[1][var17][var18] & 0x2) == 2) {
                            var20 = var15 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg4[var20];
                        }
                    }
                    class51.method309(var7, var19, var18, 27371, var17, var16, var14, var15, arg3, !arg3, var15);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "(I)V")
    public static void method1346(int arg0) {
        field3070 = null;
        if (arg0 <= 114) {
            method1348((class273) null, (byte) -114, (class273) null);
        }
        field3071 = null;
        field3069 = null;
        field3066 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IB)V")
    public static final void method1347(int arg0, byte arg1) {
        field3074++;
        class120.field1849 = -1;
        if (arg0 == 37) {
            class13.field174 = 3.0F;
        } else if (arg0 == 50) {
            class13.field174 = 4.0F;
        } else if (arg0 == 75) {
            class13.field174 = 6.0F;
        } else if (arg0 == 100) {
            class13.field174 = 8.0F;
        } else if (arg0 == 200) {
            class13.field174 = 16.0F;
        }
        class120.field1849 = -1;
        if (arg1 < 80) {
            method1346(-86);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lfa;BLfa;)V")
    public static final void method1348(class273 arg0, byte arg1, class273 arg2) {
        class45.field616 = arg0;
        field3067++;
        int var3 = (int) (Math.random() * 21.0D) - 10;
        int var4 = (int) (Math.random() * 21.0D) - 10;
        class31.field388 = arg2;
        class31.field388.method1890(true, 34);
        int var5 = (int) (Math.random() * 21.0D) - 10;
        if (arg1 != 35) {
            field3066 = null;
        }
        int var6 = (int) (Math.random() * 41.0D) - 20;
        class179.field2791 = var4 + var6;
        class55.field728 = var3 + var6;
        class159.field2514 = var5 + var6;
    }
}
