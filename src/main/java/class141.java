import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class141 {

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "[I")
    public static int[] field2151 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public static int field2155 = 0;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)Lme;")
    public static final class229 method948(int arg0) {
        if (arg0 != 18518) {
            return null;
        }
        field2153++;
        try {
            return (class229) Class.forName("rg").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public static void method949(byte arg0) {
        field2151 = null;
        if (arg0 != 92) {
            field2152 = 119;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)I")
    public static final int method950(int arg0, int arg1) {
        field2156++;
        if (arg1 != 255) {
            method949((byte) 35);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZ)V")
    public static final void method951(int arg0, boolean arg1) {
        if (class243.field3963 == null || class243.field3963.length < arg0) {
            class243.field3963 = new int[arg0];
        }
        field2149++;
        if (arg1) {
            method949((byte) 95);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lai;B)V")
    public static final void method952(class88 arg0, byte arg1) {
        field2147++;
        if (arg1 < 46) {
            field2148 = -106;
        }
        while (true) {
            while (arg0.field1471.length > arg0.field1535) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method633(118) == 1) {
                    var2 = true;
                    var3 = arg0.method633(102);
                    var4 = arg0.method633(52);
                }
                int var5 = arg0.method633(54);
                int var6 = arg0.method633(98);
                int var7 = var5 * 64 - class101.field1697;
                int var8 = class164.field2584 + class191.field2970 - (var6 * 64) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && (var7 + 63) < class85.field1431 && var8 < class191.field2970) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= (var3 * 8) && var11 < (var3 * 8 + 8) && var12 >= (var4 * 8) && var12 < var4 * 8 + 8) {
                                int var13 = arg0.method633(124);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method633(92);
                                        if (class267.field4267[var9][var10] == null) {
                                            class267.field4267[var9][var10] = new byte[4096];
                                        }
                                        class267.field4267[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method671(105);
                                        if (class90.field1569[var9][var10] == null) {
                                            class90.field1569[var9][var10] = new int[4096];
                                        }
                                        class90.field1569[var9][var10][(63 - var12 << 6) + var11] = var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = arg0.method671(121);
                                        if (class187.field2899[var9][var10] == null) {
                                            class187.field2899[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class193 var17 = class69.method501(0, var16);
                                        if (var17.field2997 != null) {
                                            var17 = var17.method1297(false);
                                            if (var17 == null || var17.field3040 == -1) {
                                                continue;
                                            }
                                        }
                                        class187.field2899[var9][var10][(63 - var12 << 6) + var11] = var17.field3024 + 1;
                                        class297 var18 = new class297();
                                        var18.field4694 = var7;
                                        var18.field4698 = var17.field3040;
                                        var18.field4696 = var8;
                                        class263.field4181.method1219(false, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg0.method633(88);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg0.field1535++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg0.field1535 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg0.field1535 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILai;B)V")
    public static final void method953(int arg0, class88 arg1, byte arg2) {
        field2154++;
        if (class157.field2452 != null) {
            try {
                class157.field2452.method424(0L, 0);
                class157.field2452.method421(-1, arg1.field1471, 24, arg0);
            } catch (Exception var3) {
            }
        }
        if (arg2 > -126) {
            field2148 = 73;
        }
    }
}
