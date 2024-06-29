import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class227 {

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field3406 = 0;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3409 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3408 = "wave2:";

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZILha;)I")
    public static final int method1483(boolean arg0, int arg1, class267 arg2) {
        field3407++;
        if (arg2.field4158 == null || arg1 >= arg2.field4158.length) {
            return -2;
        }
        try {
            int var3 = 0;
            if (!arg0) {
                method1484(-76);
            }
            int[] var4 = arg2.field4158[arg1];
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                byte var7 = 0;
                int var8 = 0;
                int var9 = var4[var5++];
                if (var9 == 0) {
                    return var3;
                }
                if (var9 == 1) {
                    var8 = class70.field1093[var4[var5++]];
                }
                if (var9 == 2) {
                    var8 = class274.field4400[var4[var5++]];
                }
                if (var9 == 15) {
                    var7 = 1;
                }
                if (var9 == 16) {
                    var7 = 2;
                }
                if (var9 == 3) {
                    var8 = class180.field2571[var4[var5++]];
                }
                if (var9 == 17) {
                    var7 = 3;
                }
                if (var9 == 4) {
                    int var10 = var4[var5++] << 16;
                    int var11 = var10 + var4[var5++];
                    class267 var12 = class282.method1897(var11, 64);
                    int var13 = var4[var5++];
                    if (var13 != -1 && (!class259.method1735(var13, -14667).field4344 || class77.field1186)) {
                        for (int var14 = 0; var14 < var12.field4107.length; var14++) {
                            if ((var13 + 1) == var12.field4107[var14]) {
                                var8 += var12.field4172[var14];
                            }
                        }
                    }
                }
                if (var9 == 5) {
                    var8 = class20.field276[var4[var5++]];
                }
                if (var9 == 6) {
                    var8 = class31.field462[class274.field4400[var4[var5++]] - 1];
                }
                if (var9 == 7) {
                    var8 = class20.field276[var4[var5++]] * 100 / 46875;
                }
                if (var9 == 8) {
                    var8 = class55.field847.field764;
                }
                if (var9 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class254.field3863[var15]) {
                            var8 += class274.field4400[var15];
                        }
                    }
                }
                if (var9 == 10) {
                    int var16 = var4[var5++] << 16;
                    int var17 = var16 + var4[var5++];
                    class267 var18 = class282.method1897(var17, 110);
                    int var19 = var4[var5++];
                    if (var19 != -1 && (!class259.method1735(var19, -14667).field4344 || class77.field1186)) {
                        for (int var20 = 0; var20 < var18.field4107.length; var20++) {
                            if (var19 + 1 == var18.field4107[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var9 == 11) {
                    var8 = class221.field3277;
                }
                if (var9 == 12) {
                    var8 = class118.field1735;
                }
                if (var9 == 13) {
                    int var21 = class20.field276[var4[var5++]];
                    int var22 = var4[var5++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var9 == 14) {
                    int var23 = var4[var5++];
                    var8 = class1.method2(var23, 128);
                }
                if (var9 == 18) {
                    var8 = (class55.field847.field45 >> 7) + class113.field1615;
                }
                if (var9 == 19) {
                    var8 = (class55.field847.field94 >> 7) + class95.field1445;
                }
                if (var9 == 20) {
                    var8 = var4[var5++];
                }
                if (var7 == 0) {
                    if (var6 == 0) {
                        var3 += var8;
                    }
                    if (var6 == 1) {
                        var3 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var3 /= var8;
                    }
                    if (var6 == 3) {
                        var3 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var7;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method1484(int arg0) {
        field3409 = null;
        if (arg0 > -5) {
            field3408 = null;
        }
        field3408 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method1485(int arg0, int arg1) {
        field3405++;
        if (arg0 != -1) {
            return null;
        }
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class55.field845 + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class66.field1034 + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }
}
