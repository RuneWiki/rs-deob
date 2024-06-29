import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public abstract class class93 {

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "[I")
    public static int[] field1485 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "Lsf;")
    public static class108 field1482 = class140.method973(255, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "Lpg;")
    public static class205 field1489;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "Lca;")
    public static class98 field1488;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "[I")
    public static int[] field1481;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V", line = 17)
    public static final void method628(int arg0) {
        field1484++;
        class186 var1 = new class186();
        for (int var2 = arg0; var2 < 13; var2++) {
            for (int var3 = 0; var3 < 13; var3++) {
                class123.field2094[var2][var3] = var1;
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIIIIIII)V", line = 43)
    public static final void method629(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field1487++;
        int var11 = arg5 - arg0;
        int var12 = arg9 - arg6;
        boolean var13;
        if (class286.field5011 > 0 && class286.field5011 % 10 < 5) {
            var13 = true;
        } else {
            var13 = false;
        }
        int var14 = 983040 / arg1;
        int var15 = arg7 / arg8;
        for (int var16 = -var14; var16 < (var11 + var14); var16++) {
            int var17 = arg3 + (arg1 * var16) >> 16;
            int var18 = (var16 + 1) * arg1 + arg3 >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                int var20 = arg4 + var17;
                int var10000 = arg4 + var18;
                int var22 = var16 + arg0 >> 6;
                if (var22 >= 0 && var22 <= class280.field4905.length - 1) {
                    int[][] var23 = class280.field4905[var22];
                    for (int var24 = -var15; var24 < var12 + var15; var24++) {
                        int var25 = arg8 * var24 + arg2 >> 16;
                        int var26 = (var24 + 1) * arg8 + arg2 >> 16;
                        int var27 = var26 - var25;
                        if (var27 > 0) {
                            var10000 = arg10 + var26;
                            int var29 = arg10 + var25;
                            int var30 = arg6 + var24 >> 6;
                            if (var30 >= 0 && var23.length - 1 >= var30 && var23[var30] != null) {
                                int var31 = (arg6 + var24 & 0x3F << 6) + (arg0 + var16 & 0x3F);
                                int var32 = var23[var30][var31];
                                if (var32 != 0) {
                                    class60 var33 = class201.method1424(var32 - 1, (byte) 93);
                                    if (!class194.field3486[var33.field933]) {
                                        if (var13 && class145.field2620 == var33.field933) {
                                            class176 var34 = new class176();
                                            var34.field3208 = var29;
                                            var34.field3199 = var20;
                                            var34.field3201 = var33.field933;
                                            class265.field4666.method5(var34, (byte) 64);
                                        } else {
                                            class95.field1521[var33.field933].method81(var20 - 7, var29 - 7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class176 var35 = (class176) class265.field4666.method13(arg7 ^ 0xF0000); var35 != null; var35 = (class176) class265.field4666.method15((byte) 47)) {
            class95.field1521[var35.field3201].method81(var35.field3199 - 7, var35.field3208 + -7);
            class28.method199(var35.field3199, var35.field3208, 15, 16776960, 128);
            class28.method199(var35.field3199, var35.field3208, 7, 16777215, 256);
        }
        class265.field4666.method9((byte) -123);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZB)V", line = 158)
    public static final void method630(boolean arg0, byte arg1) {
        class183.field3367 = arg0;
        int var2 = -76 % ((3 - arg1) / 33);
        class152.field2763 = !class251.method1774(903);
        field1490++;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIB)V", line = 189)
    public static final void method633(int arg0, int arg1, byte arg2) {
        field1486++;
        class261.field4594[arg0] = arg1;
        if (arg2 != -97) {
            return;
        }
        class83 var3 = (class83) class155.field2792.method1676((long) arg0, (byte) -128);
        if (var3 == null) {
            class83 var4 = new class83(class118.method835(-1272) + 500L);
            class155.field2792.method1681(arg2 ^ 0xFFFFFF9E, var4, (long) arg0);
        } else {
            var3.field1292 = class118.method835(-1272) + 500L;
        }
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V", line = 219)
    public static void method634(int arg0) {
        field1489 = null;
        field1482 = null;
        field1488 = null;
        field1481 = null;
        int var1 = -64 / ((arg0 - 50) / 55);
        field1485 = null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BI)[B")
    public abstract byte[] method627(byte arg0, int arg1);

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(BI)I")
    public abstract int method631(byte arg0, int arg1);

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)Lml;")
    public abstract class134 method632(int arg0);

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V")
    public abstract void method635(int arg0, int arg1);
}
