import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class166 extends class35 {

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
    public int field2682;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
    public static int field2678 = 7759444;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public static int field2676 = 0;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "Ljava/lang/String;")
    public static String field2677 = "Please remove ";

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "Lbm;")
    public static class307 field2679;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILag;)V", line = 12)
    public static final void method1059(int arg0, class202 arg1) {
        field2681++;
        if (arg0 != -65) {
            field2679 = (class307) null;
        }
        while (true) {
            while (arg1.field3273.length > arg1.field3249) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1317((byte) -106) == 1) {
                    var2 = true;
                    var3 = arg1.method1317((byte) -90);
                    var4 = arg1.method1317((byte) -84);
                }
                int var5 = arg1.method1317((byte) -70);
                int var6 = arg1.method1317((byte) -94);
                int var7 = class9.field199 + class17.field322 - ((var6 * 64) + 1);
                int var8 = var5 * 64 - class38.field734;
                if (var8 >= 0 && var7 - 63 >= 0 && var8 + 63 < class163.field2629 && class9.field199 > var7) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var3 * 8 <= var11 && var11 < (var3 * 8 + 8) && var4 * 8 <= var12 && var12 < (var4 * 8 + 8)) {
                                int var13 = arg1.method1317((byte) -107);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg1.method1317((byte) -85);
                                        if (class103.field1781[var9][var10] == null) {
                                            class103.field1781[var9][var10] = new byte[4096];
                                        }
                                        class103.field1781[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg1.method1352((byte) 127);
                                        if (class190.field3085[var9][var10] == null) {
                                            class190.field3085[var9][var10] = new int[4096];
                                        }
                                        class190.field3085[var9][var10][(63 - var12 << 6) + var11] = var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = arg1.method1352((byte) -75);
                                        if (class183.field2927[var9][var10] == null) {
                                            class183.field2927[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class31 var17 = class277.method1864(var16, 0);
                                        if (var17.field597 != null) {
                                            var17 = var17.method250((byte) -87);
                                            if (var17 == null || var17.field578 == -1) {
                                                continue;
                                            }
                                        }
                                        class183.field2927[var9][var10][(63 - var12 << 6) + var11] = var17.field596 + 1;
                                        class119 var18 = new class119();
                                        var18.field2070 = var17.field578;
                                        var18.field2076 = var7;
                                        var18.field2081 = var8;
                                        class46.field943.method427((byte) -104, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg1.method1317((byte) -74);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg1.field3249++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg1.field3249 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg1.field3249 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(B)V", line = 160)
    public static void method1060(byte arg0) {
        field2677 = null;
        if (arg0 != 123) {
            field2675 = -20;
        }
        field2679 = null;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V", line = 183)
    public class166() {
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(I)V", line = 185)
    public class166(int arg0) {
        this.field2682 = arg0;
    }
}
