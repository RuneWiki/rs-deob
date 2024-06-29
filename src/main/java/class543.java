import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public abstract class class543 {

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "Lkq;")
    public static class345 field7539 = new class345();

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "I")
    public static int field7538;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bea", name = "c", descriptor = "Ljava/lang/Class;")
    public static Class field7540;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)J")
    public abstract long method2444(int arg0);

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Z)J")
    public abstract long method2445(boolean arg0);

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(JB)I")
    public final int method3210(long arg0, byte arg1) {
        field7538++;
        long var4 = this.method2445(true);
        int var6 = 36 % ((arg1 - 22) / 61);
        if (var4 > 0L) {
            class688.method3874(var4, -7375);
        }
        return this.method2446(23122, arg0);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IJ)I")
    public abstract int method2446(int arg0, long arg1);

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(I)V")
    public static void method3211(int arg0) {
        field7539 = null;
        if (arg0 != 4) {
            field7539 = null;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "()V")
    public static final void method3212() {
        for (int var0 = 0; var0 < class486.field6796; var0++) {
            if (!class325.field4491[var0]) {
                class131 var1 = class532.field7385[var0];
                class687 var2 = var1.field1842;
                int var3 = var1.field1836;
                int var4 = var2.method3866((byte) -53) - class292.field4190;
                int var5 = (var4 * 2 >> class371.field5241) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method3873((byte) -7) - var4 >> class371.field5241;
                int var9 = var2.method3870(120) - var4 >> class371.field5241;
                int var10 = var2.method3870(114) + var4 >> class371.field5241;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class713.field9959) {
                    var10 = class713.field9959 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field1838[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class61.field877) {
                        var16 = class61.field877 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class395 var19 = class141.method932(var3, var17, var11, field7540 == null ? (field7540 = method3213("ht")) : field7540);
                        if (var19 != null && var19.field5678 != 0) {
                            if (var19.field5678 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field1838[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field1838[var6 - 1];
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
                                    short var30 = var1.field1838[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field1838[var6 + 1];
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
                class325.field4491[var0] = true;
                class433.field6043[var3].method1036(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "(I)V")
    public abstract void method2448(int arg0);

    // $FF: synthetic method
    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3213(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
