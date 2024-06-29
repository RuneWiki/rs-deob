import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class148 extends class18 {

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2195 = "wishes to trade with you.";

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2196 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field2198;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)V")
    public static final void method989(byte arg0, int arg1) {
        if (class149.field2227.field1226 - ((class149.field2227.method565((byte) 0) - 1) * 64) >> 7 == class79.field1142 && class149.field2227.field1273 - ((class149.field2227.method565((byte) 0) - 1) * 64) >> 7 == class203.field3171) {
            class79.field1142 = 0;
        }
        field2197++;
        int var2 = class73.field1040;
        if (arg1 == 0) {
            var2 = 1;
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class186 var20;
            if (arg1 == 0) {
                var20 = class149.field2227;
            } else {
                var20 = class153.field2277[class8.field117[var3]];
            }
            if (var20 != null && var20.method409(0)) {
                int var21 = var20.method565((byte) 0);
                if (arg1 == 0 || arg1 == var21) {
                    if (var21 == 1) {
                        if ((var20.field1226 & 0x7F) == 64 && (var20.field1273 & 0x7F) == 64) {
                            int var22 = var20.field1226 >> 7;
                            int var23 = var20.field1273 >> 7;
                            if (var22 >= 0 && var22 < 104 && var23 >= 0 && var23 < 104) {
                                var10002 = class262.field4232[var22][var23]++;
                            }
                        }
                    } else if (((var21 & 0x1) != 0 || (var20.field1226 & 0x7F) == 0 && (var20.field1273 & 0x7F) == 0) && ((var21 & 0x1) != 1 || (var20.field1226 & 0x7F) == 64 && (var20.field1273 & 0x7F) == 64)) {
                        int var24 = var20.field1226 - var21 * 64 >> 7;
                        int var25 = var20.field1273 - (var21 * 64) >> 7;
                        int var26 = var20.method565((byte) 0) + var24;
                        int var27 = var25 + var20.method565((byte) 0);
                        if (var27 > 104) {
                            var27 = 104;
                        }
                        if (var24 < 0) {
                            var24 = 0;
                        }
                        if (var25 < 0) {
                            var25 = 0;
                        }
                        if (var26 > 104) {
                            var26 = 104;
                        }
                        for (int var28 = var24; var28 < var26; var28++) {
                            for (int var29 = var25; var29 < var27; var29++) {
                                var10002 = class262.field4232[var28][var29]++;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 <= 88) {
            field2198 = null;
        }
        label223: for (int var4 = 0; var4 < var2; var4++) {
            class186 var5;
            long var6;
            if (arg1 == 0) {
                var6 = 8791798054912L;
                var5 = class149.field2227;
            } else {
                var5 = class153.field2277[class8.field117[var4]];
                var6 = (long) class8.field117[var4] << 32;
            }
            if (var5 != null && var5.method409(0)) {
                int var8 = var5.method565((byte) 0);
                if (arg1 == 0 || arg1 == var8) {
                    var5.field2923 = false;
                    var5.field1248 = true;
                    if ((class195.field3073 && class73.field1040 > 200 || class73.field1040 > 50) && arg1 != 0 && var5.field1196 == var5.method564(126).field1319) {
                        var5.field2923 = true;
                    }
                    if (var8 == 1) {
                        if ((var5.field1226 & 0x7F) == 64 && (var5.field1273 & 0x7F) == 64) {
                            int var9 = var5.field1226 >> 7;
                            int var10 = var5.field1273 >> 7;
                            if (var9 < 0 || var9 >= 104 || var10 < 0 || var10 >= 104) {
                                continue;
                            }
                            if (class262.field4232[var9][var10] > 1) {
                                var10002 = class262.field4232[var9][var10]--;
                                continue;
                            }
                        }
                    } else if ((var8 & 0x1) == 0 && (var5.field1226 & 0x7F) == 0 && (var5.field1273 & 0x7F) == 0 || (var8 & 0x1) == 1 && (var5.field1226 & 0x7F) == 64 && (var5.field1273 & 0x7F) == 0) {
                        int var11 = var5.field1226 - var8 * 64 >> 7;
                        int var12 = var11 + var8;
                        if (var11 < 0) {
                            var11 = 0;
                        }
                        boolean var13 = true;
                        if (var12 > 104) {
                            var12 = 104;
                        }
                        int var14 = var5.field1273 - (var8 * 64) >> 7;
                        int var15 = var8 + var14;
                        if (var15 > 104) {
                            var15 = 104;
                        }
                        if (var14 < 0) {
                            var14 = 0;
                        }
                        for (int var16 = var11; var16 < var12; var16++) {
                            for (int var19 = var14; var19 < var15; var19++) {
                                if (class262.field4232[var16][var19] <= 1) {
                                    var13 = false;
                                    break;
                                }
                            }
                        }
                        if (var13) {
                            int var17 = var11;
                            while (true) {
                                if (var17 >= var12) {
                                    continue label223;
                                }
                                for (int var18 = var14; var18 < var15; var18++) {
                                    var10002 = class262.field4232[var17][var18]--;
                                }
                                var17++;
                            }
                        }
                    }
                    if (var5.field1269 == null || class111.field1684 < var5.field1251 || var5.field1259 <= class111.field1684) {
                        var5.field1248 = false;
                        var5.field1198 = class99.method658(var5.field1273, class276.field4398, var5.field1226, -7185);
                        class143.method952(class276.field4398, var5.field1226, var5.field1273, var5.field1198, var8 * 64 + 60 - 64, var5, var5.field1222, var6, var5.field1207);
                    } else {
                        var5.field2923 = false;
                        var5.field1248 = false;
                        var5.field1198 = class99.method658(var5.field1273, class276.field4398, var5.field1226, -7185);
                        class104.method687(class276.field4398, var5.field1226, var5.field1273, var5.field1198, var5, var5.field1222, var6, var5.field1294, var5.field1293, var5.field1193, var5.field1295);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static void method990(int arg0) {
        field2196 = null;
        field2195 = null;
        if (arg0 > -6) {
            method989((byte) -92, -39);
        }
        field2198 = null;
    }
}
