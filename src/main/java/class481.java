import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class481 {

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "B")
    public byte field6923;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "S")
    public short field6919;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "Lwu;")
    public class253 field6921;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "B")
    public byte field6922;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "[Lir;")
    public static class22[] field6920 = new class22[14];

    // $FF: synthetic field
    @OriginalMember(owner = "client!gi", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field6924;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "()V")
    public static final void method2886() {
        for (int var0 = 0; var0 < class316.field4756; var0++) {
            if (!class455.field6629[var0]) {
                class396 var1 = class503.field7256[var0];
                class470 var2 = var1.field5918;
                int var3 = var1.field5920;
                int var4 = var2.method2838((byte) -90) - class5.field63;
                int var5 = (var4 * 2 >> class163.field2415) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method2835(-30143) - var4 >> class163.field2415;
                int var9 = var2.method2833((byte) 94) - var4 >> class163.field2415;
                int var10 = var2.method2833((byte) 86) + var4 >> class163.field2415;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class385.field5799) {
                    var10 = class385.field5799 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field5927[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class497.field7147) {
                        var16 = class497.field7147 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class389 var19 = class154.method1057(var3, var17, var11, field6924 == null ? (field6924 = method2888("lq")) : field6924);
                        if (var19 != null && var19.field5828 != 0) {
                            if (var19.field5828 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field5927[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field5927[var6 - 1];
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
                                    short var30 = var1.field5927[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field5927[var6 + 1];
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
                class455.field6629[var0] = true;
                class491.field7059[var3].method415(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
    public static void method2887(byte arg0) {
        field6920 = null;
        if (arg0 < 51) {
            field6920 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lwu;III)V")
    public class481(class253 arg0, int arg1, int arg2, int arg3) {
        this.field6923 = (byte) arg2;
        this.field6919 = (short) arg1;
        this.field6921 = arg0;
        this.field6922 = (byte) arg3;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2888(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
