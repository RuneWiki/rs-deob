import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class725 {

    @OriginalMember(owner = "client!sea", name = "c", descriptor = "I")
    public static int field10029 = 0;

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "I")
    public static int field10027;

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "I")
    public static int field10028;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sea", name = "d", descriptor = "Ljava/lang/Class;")
    public static Class field10030;

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "()V")
    public static final void method4063() {
        for (int var0 = 0; var0 < class97.field1103; var0++) {
            if (!class204.field3176[var0]) {
                class456 var1 = class603.field8444[var0];
                class154 var2 = var1.field6391;
                int var3 = var1.field6387;
                int var4 = var2.method1051((byte) -105) - class556.field7931;
                int var5 = (var4 * 2 >> class645.field9018) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method1059(-6131) - var4 >> class645.field9018;
                int var9 = var2.method1058(79) - var4 >> class645.field9018;
                int var10 = var2.method1058(123) + var4 >> class645.field9018;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class48.field615) {
                    var10 = class48.field615 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field6379[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class81.field902) {
                        var16 = class81.field902 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class672 var19 = class537.method3227(var3, var17, var11, field10030 == null ? (field10030 = method4064("it")) : field10030);
                        if (var19 != null && var19.field9370 != 0) {
                            if (var19.field9370 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field6379[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field6379[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field6379[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field6379[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class204.field3176[var0] = true;
                class208.field3219[var3].method1907(var2, var7);
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method4064(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
