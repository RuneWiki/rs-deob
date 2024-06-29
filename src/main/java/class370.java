import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class370 {

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
    public int field4979 = -1;

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "Ljp;")
    public static class236 field4981 = new class236(4);

    @OriginalMember(owner = "client!tp", name = "n", descriptor = "[Ldr;")
    public static class504[] field4986 = new class504[14];

    @OriginalMember(owner = "client!tp", name = "o", descriptor = "I")
    public static int field4987 = 0;

    @OriginalMember(owner = "client!tp", name = "k", descriptor = "Lvj;")
    public static class304 field4983 = new class304("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
    public int field4973;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
    public int field4974;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
    public int field4976;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
    public int field4977;

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "I")
    public int field4978;

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "I")
    public int field4980;

    @OriginalMember(owner = "client!tp", name = "j", descriptor = "I")
    public int field4982;

    @OriginalMember(owner = "client!tp", name = "m", descriptor = "I")
    public int field4985;

    @OriginalMember(owner = "client!tp", name = "l", descriptor = "Lqa;")
    public static class162 field4984;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tp", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field4989;

    @OriginalMember(owner = "client!tp", name = "p", descriptor = "Ljava/lang/Object;")
    public static Object field4988;

    // $FF: synthetic method
    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2143(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V", line = 3)
    public static void method2140(int arg0) {
        field4981 = null;
        field4986 = null;
        field4984 = null;
        field4988 = null;
        field4983 = null;
        if (arg0 != 8) {
            field4981 = null;
        }
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)V", line = 19)
    public static final void method2141(int arg0) {
        field4975++;
        class516.field7655.method1135(8);
        class310.field4072.method385((byte) -69);
        class204.field2828.method2539(-88);
        class402.field5388.method1999(1);
        class206.field2849.method2549((byte) 58);
        class127.field1852.method2400(114);
        class423.field5791.method1608(0);
        class441.field6049.method724(14238);
        class185.field2626.method2259((byte) 57);
        class206.field2850.method422(76);
        class291.field3825.method133(64);
        class466.field6434.method375(126);
        class267.field3522.method1012(true);
        class159.field2353.method1408((byte) -6);
        class270.field3546.method694(6);
        class389.field5280.method656(117);
        class520.field7700.method2365(true);
        class201.field2792.method2834(21063);
        class31.field513.method2338(true);
        client.field2731.method930(-127);
        class513.method3019(true);
        class75.method481(20357);
        class135.method954(-322);
        class383.method2272((byte) -128);
        class167.field2417.method1459(19088);
        class506.field6965.method1459(19088);
        if (arg0 <= 45) {
            method2142();
        }
        class176.field2561.method1459(19088);
        class401.field5380.method1459(19088);
        class122.field1802.method1459(19088);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "()V", line = 69)
    public static final void method2142() {
        for (int var0 = 0; var0 < class249.field3300; var0++) {
            if (!class118.field1709[var0]) {
                class360 var1 = class37.field586[var0];
                class451 var2 = var1.field4867;
                int var3 = var1.field4850;
                int var4 = var2.method2578(22477) - class497.field6892;
                int var5 = (var4 * 2 >> class530.field7813) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method2577((byte) -76) - var4 >> class530.field7813;
                int var9 = var2.method2582((byte) 70) - var4 >> class530.field7813;
                int var10 = var2.method2582((byte) 70) + var4 >> class530.field7813;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class318.field4170) {
                    var10 = class318.field4170 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field4868[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class439.field6036) {
                        var16 = class439.field6036 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class37 var19 = class504.method2874(var3, var17, var11, field4989 == null ? (field4989 = method2143("dm")) : field4989);
                        if (var19 != null && var19.field570 != 0) {
                            if (var19.field570 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field4868[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field4868[var6 - 1];
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
                                    short var30 = var1.field4868[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field4868[var6 + 1];
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
                class118.field1709[var0] = true;
                class141.field2049[var3].method271(var2, var7);
            }
        }
    }
}
