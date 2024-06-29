import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class274 {

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field4810 = 0;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "Ljd;")
    public static class86 field4811 = class122.method868("Lade Texturen )2 ", true);

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "[I")
    public static int[] field4809;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lqk;I)V")
    public static final void method1866(class200 arg0, int arg1) {
        field4813++;
        if (arg1 != -1) {
            field4808 = -7;
        }
        while (true) {
            while (arg0.field3547.length > arg0.field3565) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method1408((byte) -25) == 1) {
                    var3 = arg0.method1408((byte) -105);
                    var4 = arg0.method1408((byte) -16);
                    var2 = true;
                }
                int var5 = arg0.method1408((byte) -41);
                int var6 = arg0.method1408((byte) -98);
                int var7 = class38.field894 - (1 - (class238.field4289 - (var6 * 64)));
                int var8 = var5 * 64 - class90.field1847;
                if (var8 >= 0 && var7 - 63 >= 0 && class263.field4668 > var8 + 63 && var7 < class38.field894) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var3 * 8 <= var11 && var11 < var3 * 8 + 8 && var4 * 8 <= var12 && var12 < var4 * 8 + 8) {
                                int var13 = arg0.method1408((byte) -76);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method1408((byte) -98);
                                        if (class87.field1734[var9][var10] == null) {
                                            class87.field1734[var9][var10] = new byte[4096];
                                        }
                                        class87.field1734[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method1410(arg1 - 76);
                                        if (class69.field1398[var9][var10] == null) {
                                            class69.field1398[var9][var10] = new short[4096];
                                        }
                                        class69.field1398[var9][var10][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = (arg0.method1408((byte) -23) & 0xFF << 16) + (arg0.method1408((byte) -94) & 0xFF << 8) + (arg0.method1408((byte) -45) & 0xFF);
                                        if (class177.field3211[var9][var10] == null) {
                                            class177.field3211[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class117 var17 = class268.method1845(var16, (byte) -64);
                                        if (var17.field2295 != null) {
                                            var17 = var17.method840(-1);
                                            if (var17 == null || var17.field2287 == -1) {
                                                continue;
                                            }
                                        }
                                        class177.field3211[var9][var10][(63 - var12 << 6) + var11] = var17.field2261 + 1;
                                        class220 var18 = new class220();
                                        var18.field3957 = var7;
                                        var18.field3953 = var17.field2287;
                                        var18.field3952 = var8;
                                        class218.field3919.method1731(-81, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg0.method1408((byte) -18);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg0.field3565++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg0.field3565 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg0.field3565 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)V")
    public static final void method1867(int arg0, int arg1, int arg2) {
        field4816++;
        class273.field4805[arg2] = arg0;
        if (arg1 != -1252116442) {
            return;
        }
        class92 var3 = (class92) class136.field2600.method1698((long) arg2, (byte) 118);
        if (var3 == null) {
            class92 var4 = new class92(class253.method1711((byte) -103) + 500L);
            class136.field2600.method1699(-28407, var4, (long) arg2);
        } else {
            var3.field1868 = class253.method1711((byte) -70) + 500L;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)V")
    public static void method1868(boolean arg0) {
        field4811 = null;
        field4809 = null;
        if (!arg0) {
            field4814 = 77;
        }
    }
}
