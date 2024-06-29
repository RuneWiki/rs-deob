import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class476 extends class180 {

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "S")
    public short field6734;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public static int field6733;

    // $FF: synthetic field
    @OriginalMember(owner = "client!oi", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field6735;

    // $FF: synthetic method
    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2801(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZZ)V", line = 4)
    public static final void method2799(int arg0, boolean arg1, boolean arg2) {
        field6733++;
        if (arg1) {
            class319.field4370++;
            class334.method1984((byte) 106);
        }
        if (arg0 != 22226) {
            method2799(125, true, false);
        }
        if (arg2) {
            class289.field3968++;
            class8.method93((byte) -120);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "()V", line = 31)
    public static final void method2800() {
        for (int var0 = 0; var0 < class19.field321; var0++) {
            if (!class225.field3191[var0]) {
                class270 var1 = class488.field6890[var0];
                int var2 = var1.field3743;
                int var3 = var1.field6878 - class411.field5703;
                int var4 = (var3 * 2 >> class259.field3616) + 1;
                int var5 = 0;
                int[] var6 = new int[var4 * var4];
                int var7 = var1.field6883 - var3 >> class259.field3616;
                int var8 = var1.field6879 - var3 >> class259.field3616;
                int var9 = var1.field6879 + var3 >> class259.field3616;
                if (var8 < 0) {
                    var5 -= var8;
                    var8 = 0;
                }
                if (var9 >= class205.field2946) {
                    var9 = class205.field2946 - 1;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var1.field3745[var5];
                    int var12 = var11 >>> 8;
                    int var13 = var4 * var5 + var12;
                    int var14 = (var11 >>> 8) + var7;
                    int var15 = (var11 & 0xFF) + var14 - 1;
                    if (var14 < 0) {
                        var13 -= var14;
                        var14 = 0;
                    }
                    if (var15 >= class456.field6299) {
                        var15 = class456.field6299 - 1;
                    }
                    for (int var16 = var14; var16 <= var15; var16++) {
                        byte var17 = 1;
                        class478 var18 = class75.method518(var2, var16, var10, field6735 == null ? (field6735 = method2801("tq")) : field6735);
                        if (var18 != null && var18.field6761 != 0) {
                            if (var18.field6761 == 1) {
                                boolean var19 = var16 - 1 >= var14;
                                boolean var20 = var16 + 1 <= var15;
                                if (!var19 && var10 + 1 <= var9) {
                                    short var21 = var1.field3745[var5 + 1];
                                    int var22 = (var21 >>> 8) + var7;
                                    int var23 = (var21 & 0xFF) + var22;
                                    var19 = var16 > var22 && var16 < var23;
                                }
                                if (!var20 && var10 - 1 >= var8) {
                                    short var24 = var1.field3745[var5 - 1];
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
                                    short var29 = var1.field3745[var5 - 1];
                                    int var30 = (var29 >>> 8) + var7;
                                    int var31 = (var29 & 0xFF) + var30;
                                    var27 = var16 > var30 && var16 < var31;
                                }
                                if (!var28 && var10 + 1 <= var9) {
                                    short var32 = var1.field3745[var5 + 1];
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
                class225.field3191[var0] = true;
                class317.field4306[var2].method713(var1, var6);
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V", line = 204)
    public class476() {
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(S)V", line = 207)
    public class476(short arg0) {
        this.field6734 = arg0;
    }
}
