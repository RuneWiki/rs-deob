import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class207 extends IOException {

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1320(int arg0) {
        for (int var1 = 0; var1 < class293.field4304; var1++) {
            class381.field5451[var1] = null;
        }
        if (arg0 > -24) {
            return;
        }
        field2896++;
        class293.field4304 = 0;
        for (int var2 = 0; var2 < class266.field3869; var2++) {
            for (int var42 = 0; var42 < class414.field5796; var42++) {
                for (int var43 = 0; var43 < class704.field9799; var43++) {
                    class472 var44 = class59.field688[var2][var43][var42];
                    if (var44 != null) {
                        if (var44.field6545 > 0) {
                            var44.field6545 = (short) (var44.field6545 * -1);
                        }
                        if (var44.field6550 > 0) {
                            var44.field6550 = (short) (var44.field6550 * -1);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < class266.field3869; var3++) {
            for (int var4 = 0; var4 < class414.field5796; var4++) {
                for (int var5 = 0; var5 < class704.field9799; var5++) {
                    class472 var6 = class59.field688[var3][var5][var4];
                    if (var6 != null) {
                        boolean var7 = class59.field688[0][var5][var4] != null && class59.field688[0][var5][var4].field6549 != null;
                        if (var6.field6545 < 0) {
                            int var8 = var4;
                            int var9 = var4;
                            int var11 = var3;
                            class472 var12 = class59.field688[var3][var5][var4 - 1];
                            int var13 = class95.field1115[var3].method2525(var5, var4, (byte) 114);
                            while (var8 > 0 && var12 != null && var12.field6545 < 0 && var6.field6545 == var12.field6545 && var6.field6552 == var12.field6552 && var13 == class95.field1115[var3].method2525(var5, var8 - 1, (byte) 114) && (var8 - 1 <= 0 || var13 == class95.field1115[var3].method2525(var5, var8 - 2, (byte) 114))) {
                                var8--;
                                var12 = class59.field688[var3][var5][var8 - 1];
                            }
                            for (class472 var14 = class59.field688[var3][var5][var4 + 1]; var9 < class704.field9799 && var14 != null && var14.field6545 < 0 && var6.field6545 == var14.field6545 && var6.field6552 == var14.field6552 && var13 == class95.field1115[var3].method2525(var5, var9 + 1, (byte) 114) && ((var9 + 1) >= class704.field9799 || class95.field1115[var3].method2525(var5, var9 + 2, (byte) 114) == var13); var14 = class59.field688[var3][var5][var9 + 1]) {
                                var9++;
                            }
                            int var15 = var3 + 1 - var3;
                            int var16 = class95.field1115[var7 ? var3 + 1 : var3].method2525(var5, var8, (byte) 114);
                            int var17 = var6.field6545 * var15 + var16;
                            int var18 = class95.field1115[var7 ? var3 + 1 : var3].method2525(var5, var9 + 1, (byte) 114);
                            int var19 = var6.field6545 * var15 + var18;
                            int var20 = var5 << class732.field10110;
                            int var21 = var8 << class732.field10110;
                            int var22 = (var9 << class732.field10110) + class179.field2263;
                            class381.field5451[class293.field4304++] = new class532(1, var3, var20 + var6.field6552, var6.field6552 + var20, var6.field6552 + var20, var6.field6552 + var20, var16, var18, var19, var17, var21, var22, var22, var21);
                            for (int var23 = var3; var23 <= var11; var23++) {
                                for (int var24 = var8; var24 <= var9; var24++) {
                                    class59.field688[var23][var5][var24].field6545 = (short) (class59.field688[var23][var5][var24].field6545 * -1);
                                }
                            }
                        }
                        if (var6.field6550 < 0) {
                            int var25 = var5;
                            int var26 = var5;
                            int var28 = var3;
                            class472 var29 = class59.field688[var3][var5 - 1][var4];
                            int var30 = class95.field1115[var3].method2525(var5, var4, (byte) 114);
                            while (var25 > 0 && var29 != null && var29.field6550 < 0 && var6.field6550 == var29.field6550 && var6.field6539 == var29.field6539 && class95.field1115[var3].method2525(var25 - 1, var4, (byte) 114) == var30 && ((var25 - 1) <= 0 || class95.field1115[var3].method2525(var25 - 2, var4, (byte) 114) == var30)) {
                                var25--;
                                var29 = class59.field688[var3][var25 - 1][var4];
                            }
                            for (class472 var31 = class59.field688[var3][var5 + 1][var4]; class414.field5796 > var26 && var31 != null && var31.field6550 < 0 && var6.field6550 == var31.field6550 && var6.field6539 == var31.field6539 && class95.field1115[var3].method2525(var26 + 1, var4, (byte) 114) == var30 && (class414.field5796 <= (var26 + 1) || var30 == class95.field1115[var3].method2525(var26 + 2, var4, (byte) 114)); var31 = class59.field688[var3][var26 + 1][var4]) {
                                var26++;
                            }
                            int var32 = var3 + 1 - var3;
                            int var33 = class95.field1115[var7 ? var3 + 1 : var3].method2525(var25, var4, (byte) 114);
                            int var34 = var33 + (var6.field6550 * var32);
                            int var35 = class95.field1115[var7 ? var3 + 1 : var3].method2525(var26 + 1, var4, (byte) 114);
                            int var36 = var6.field6550 * var32 + var35;
                            int var37 = var25 << class732.field10110;
                            int var38 = (var26 << class732.field10110) + class179.field2263;
                            int var39 = var4 << class732.field10110;
                            class381.field5451[class293.field4304++] = new class532(2, var3, var37, var38, var38, var37, var33, var35, var36, var34, var6.field6539 + var39, var6.field6539 + var39, var6.field6539 + var39, var39 - -var6.field6539);
                            for (int var40 = var3; var40 <= var28; var40++) {
                                for (int var41 = var25; var41 <= var26; var41++) {
                                    class59.field688[var40][var41][var4].field6550 = (short) (class59.field688[var40][var41][var4].field6550 * -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        class635.field8861 = true;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 229)
    public class207(String arg0) {
        super(arg0);
    }
}
