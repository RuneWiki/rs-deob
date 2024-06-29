import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class368 {

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "J")
    public static long field4705 = 0L;

    @OriginalMember(owner = "client!bfa", name = "c", descriptor = "[I")
    public static int[] field4706 = new int[2];

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "I")
    public static int field4704;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bfa", name = "d", descriptor = "Ljava/lang/Class;")
    public static Class field4707;

    // $FF: synthetic method
    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2148(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(B)V", line = 12)
    public static void method2145(byte arg0) {
        if (arg0 != 27) {
            field4705 = 114L;
        }
        field4706 = null;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "()V", line = 24)
    public static final void method2146() {
        for (int var0 = 0; var0 < class275.field3367; var0++) {
            if (!class284.field3450[var0]) {
                class614 var1 = class745.field10409[var0];
                class163 var2 = var1.field8785;
                int var3 = var1.field8793;
                int var4 = var2.method1007(-108) - class598.field8523;
                int var5 = (var4 * 2 >> class748.field10430) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method1012((byte) 127) - var4 >> class748.field10430;
                int var9 = var2.method1013(9179409) - var4 >> class748.field10430;
                int var10 = var2.method1013(9179409) + var4 >> class748.field10430;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class151.field1664) {
                    var10 = class151.field1664 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field8795[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class284.field3473) {
                        var16 = class284.field3473 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class340 var19 = class229.method1330(var3, var17, var11, field4707 == null ? (field4707 = method2148("cs")) : field4707);
                        if (var19 != null && var19.field4394 != 0) {
                            if (var19.field4394 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field8795[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field8795[var6 - 1];
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
                                    short var30 = var1.field8795[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field8795[var6 + 1];
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
                class284.field3450[var0] = true;
                class504.field7120[var3].method1668(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(III)Z", line = 206)
    public static final boolean method2147(int arg0, int arg1, int arg2) {
        field4704++;
        if (arg1 != 63) {
            method2145((byte) -36);
        }
        return (arg2 & 0x20) != 0;
    }
}
