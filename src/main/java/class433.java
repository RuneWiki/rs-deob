import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class433 extends class491 {

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "Lof;")
    public static class446 field6578 = new class446("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "Lla;")
    public static class319 field6580 = new class319(78, 2);

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "Lni;")
    public static class367 field6582;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
    public static int field6583;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gl", name = "u", descriptor = "Ljava/lang/Class;")
    public static Class field6584;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "Z")
    public static boolean field6577;

    // $FF: synthetic method
    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2643(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class446("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
        field6582 = new class367(38, 12);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "()V", line = 6)
    public static final void method2640() {
        for (int var0 = 0; var0 < class401.field6115; var0++) {
            if (!class375.field5703[var0]) {
                class189 var1 = class514.field7556[var0];
                class28 var2 = var1.field2518;
                int var3 = var1.field2519;
                int var4 = var2.method252(116) - class251.field3501;
                int var5 = (var4 * 2 >> class10.field179) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method257(-100) - var4 >> class10.field179;
                int var9 = var2.method255(-7164) - var4 >> class10.field179;
                int var10 = var2.method255(-7164) + var4 >> class10.field179;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class475.field7051) {
                    var10 = class475.field7051 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field2526[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class533.field7842) {
                        var16 = class533.field7842 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class140 var19 = class172.method1169(var3, var17, var11, field6584 == null ? (field6584 = method2643("hi")) : field6584);
                        if (var19 != null && var19.field1860 != 0) {
                            if (var19.field1860 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field2526[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field2526[var6 - 1];
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
                                    short var30 = var1.field2526[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field2526[var6 + 1];
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
                class375.field5703[var0] = true;
                class306.field4447[var3].method217(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)V", line = 184)
    public static final void method2641(int arg0) {
        class224.field3112.method2127((byte) -60);
        if (arg0 >= -66) {
            method2641(-70);
        }
        field6579++;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)V", line = 196)
    public static void method2642(byte arg0) {
        field6578 = null;
        field6582 = null;
        if (arg0 <= -127) {
            field6580 = null;
        }
    }
}
