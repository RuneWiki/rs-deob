import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class106 {

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field1528 = -1;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1527 = "glow3:";

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "Lke;")
    public static class162 field1530;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hj", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field1532;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IC)Z")
    public static final boolean method712(int arg0, char arg1) {
        int var2 = 25 / ((arg0 + 60) / 36);
        field1531++;
        return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)V")
    public static void method713(boolean arg0) {
        field1527 = null;
        field1530 = null;
        if (!arg0) {
            field1530 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "()V")
    public static final void method714() {
        for (int var0 = 0; var0 < class339.field4888; var0++) {
            if (!class177.field2338[var0]) {
                class227 var1 = class75.field1078[var0];
                int var2 = var1.field2987;
                int var3 = var1.field5303 - 64;
                int var4 = (var3 * 2 >> 7) + 1;
                int var5 = 0;
                int[] var6 = new int[var4 * var4];
                int var7 = var1.field5308 - var3 >> 7;
                int var8 = var1.field5310 - var3 >> 7;
                int var9 = var1.field5310 + var3 >> 7;
                if (var8 < 0) {
                    var5 -= var8;
                    var8 = 0;
                }
                if (var9 >= class214.field2858) {
                    var9 = class214.field2858 - 1;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var1.field2983[var5];
                    int var12 = var11 >>> 8;
                    int var13 = var4 * var5 + var12;
                    int var14 = (var11 >>> 8) + var7;
                    int var15 = (var11 & 0xFF) + var14 - 1;
                    if (var14 < 0) {
                        var13 -= var14;
                        var14 = 0;
                    }
                    if (var15 >= class104.field1436) {
                        var15 = class104.field1436 - 1;
                    }
                    for (int var16 = var14; var16 <= var15; var16++) {
                        byte var17 = 1;
                        class55 var18 = class243.method1460(var2, var16, var10, field1532 == null ? (field1532 = method716("va")) : field1532);
                        if (var18 != null && var18.field736 != 0) {
                            if (var18.field736 == 1) {
                                boolean var19 = var16 - 1 >= var14;
                                boolean var20 = var16 + 1 <= var15;
                                if (!var19 && var10 + 1 <= var9) {
                                    short var21 = var1.field2983[var5 + 1];
                                    int var22 = (var21 >>> 8) + var7;
                                    int var23 = (var21 & 0xFF) + var22;
                                    var19 = var16 > var22 && var16 < var23;
                                }
                                if (!var20 && var10 - 1 >= var8) {
                                    short var24 = var1.field2983[var5 - 1];
                                    int var25 = (var24 >>> 8) + var7;
                                    int var26 = (var24 & 0xFF) + var25;
                                    var20 = var16 > var25 && var16 < var26;
                                }
                                if (var19 && !var20) {
                                    var17 = 4;
                                } else if (var20 && !var19) {
                                    var17 = 2;
                                }
                            } else {
                                boolean var27 = var16 - 1 >= var14;
                                boolean var28 = var16 + 1 <= var15;
                                if (!var27 && var10 - 1 >= var8) {
                                    short var29 = var1.field2983[var5 - 1];
                                    int var30 = (var29 >>> 8) + var7;
                                    int var31 = (var29 & 0xFF) + var30;
                                    var27 = var16 > var30 && var16 < var31;
                                }
                                if (!var28 && var10 + 1 <= var9) {
                                    short var32 = var1.field2983[var5 + 1];
                                    int var33 = (var32 >>> 8) + var7;
                                    int var34 = (var32 & 0xFF) + var33;
                                    var28 = var16 > var33 && var16 < var34;
                                }
                                if (var27 && !var28) {
                                    var17 = 3;
                                } else if (var28 && !var27) {
                                    var17 = 5;
                                }
                            }
                        }
                        var6[var13++] = var17;
                    }
                    var5++;
                }
                class177.field2338[var0] = true;
                class12.field205[var2].method738(var1, var6);
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lii;IIB)V")
    public static final void method715(class405 arg0, int arg1, int arg2, byte arg3) {
        class69.field894 = arg0;
        field1529++;
        class315.field4611 = new class438[arg2][arg1];
        if (class56.field748 != null) {
            class369.field5336 = class68.method456(class56.field748[3], class56.field748[4], class56.field748[1], class56.field748[0], class56.field748[5], false, class56.field748[2]);
        }
        if (arg3 == 0) {
            class382.field5544 = new class438();
            class244.method1465(-98);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method716(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
