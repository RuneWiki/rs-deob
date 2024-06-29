import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class88 extends class60 {

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    private int field1373;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    private int field1382;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    private int field1374;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    private int field1376;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "[I")
    public static int[] field1379 = new int[100];

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    public static int field1380 = 0;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "[Lsr;")
    public static class351[] field1375 = new class351[32768];

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "Z")
    public static volatile boolean field1378 = true;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
    public static int field1383;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ie", name = "v", descriptor = "Ljava/lang/Class;")
    public static Class field1384;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)V")
    public final void method429(int arg0, int arg1, int arg2) {
        if (arg0 != -201) {
            method689();
        }
        ++field1377;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(IIIIII)V")
    public class88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1373 = arg2;
        this.field1382 = arg0;
        this.field1374 = arg3;
        this.field1376 = arg1;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
    public static void method688(byte arg0) {
        if (arg0 > -10) {
            method689();
        }
        field1375 = null;
        field1379 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "()V")
    public static final void method689() {
        for (int var0 = 0; var0 < class309.field4634; ++var0) {
            if (!class120.field1839[var0]) {
                class466 var1 = class486.field7238[var0];
                class531 var2 = var1.field6794;
                int var3 = var1.field6784;
                int var4 = var2.method3156(-77) - class280.field4230;
                int var5 = (var4 * 2 >> class9.field75) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method3157(-119) - var4 >> class9.field75;
                int var9 = var2.method3150((byte) 107) - var4 >> class9.field75;
                int var10 = var2.method3150((byte) 107) + var4 >> class9.field75;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class167.field2473) {
                    var10 = class167.field2473 - 1;
                }
                for (int var11 = var9; var11 <= var10; ++var11) {
                    short var12 = var1.field6787[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 255) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class445.field6562) {
                        var16 = class445.field6562 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; ++var17) {
                        byte var18 = 1;
                        class522 var19 = class534.method3160(var3, var17, var11, field1384 != null ? field1384 : (field1384 = method690("mv")));
                        if (var19 != null && var19.field7682 != 0) {
                            if (var19.field7682 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field6787[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 255) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field6787[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 255) + var26;
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
                                    short var30 = var1.field6787[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 255) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field6787[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 255) + var34;
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
                    ++var6;
                }
                class120.field1839[var0] = true;
                class249.field3405[var3].method715(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(III)V")
    public final void method431(int arg0, int arg1, int arg2) {
        if (arg1 != -76) {
            this.method429(77, -124, 57);
        }
        ++field1381;
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(III)V")
    public final void method432(int arg0, int arg1, int arg2) {
        ++field1372;
        int var4 = this.field1382 * arg1 >> 12;
        if (arg0 != 25878) {
            this.method432(74, 11, -88);
        }
        int var5 = this.field1373 * arg1 >> 12;
        int var6 = this.field1376 * arg2 >> 12;
        int var7 = this.field1374 * arg2 >> 12;
        class29.method267(var5, super.field820, (byte) -28, var6, var7, var4);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method690(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
