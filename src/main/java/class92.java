import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class92 {

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "Lpu;")
    public static class179 field1485;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "[C")
    public static char[] field1486;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIII)I")
    public static final int method784(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field1483++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 1023 - arg2;
        } else {
            if (arg0 > -75) {
                method786(89);
            }
            return var4 == 2 ? 1023 - arg1 : arg2;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IILza;Lae;ILcl;)Z")
    public static final boolean method785(int arg0, int arg1, class299 arg2, class30 arg3, int arg4, class53 arg5) {
        field1484++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg3.field371 != null) {
            var9 = class362.field5360 - ((arg3.field326 + arg5.field809 - class362.field5343) * (class362.field5360 - class362.field5358) / (class362.field5351 - class362.field5343));
            var6 = class362.field5344 + ((arg3.field348 + arg5.field816 - class362.field5359) * (class362.field5346 - class362.field5344) / (class362.field5347 - class362.field5359));
            var7 = class362.field5344 + ((arg3.field350 + arg5.field816 - class362.field5359) * (class362.field5346 - class362.field5344) / (class362.field5347 - class362.field5359));
            var8 = class362.field5360 - ((arg3.field329 - (class362.field5343 - arg5.field809)) * (class362.field5360 - class362.field5358) / (class362.field5351 - class362.field5343));
        }
        int var10 = -8 / ((54 - arg4) / 38);
        class363 var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        if (arg3.field331 != -1) {
            if (arg5.field815 && arg3.field366 != -1) {
                var11 = arg3.method176(true, 0, arg2);
            } else {
                var11 = arg3.method176(false, 0, arg2);
            }
            if (var11 != null) {
                var12 = arg5.field820 - (var11.method394() + 1 >> 1);
                if (var6 > var12) {
                    var6 = var12;
                }
                var13 = arg5.field820 + (var11.method394() + 1 >> 1);
                var14 = arg5.field823 - (var11.method396() + 1 >> 1);
                if (var13 > var7) {
                    var7 = var13;
                }
                if (var14 < var8) {
                    var8 = var14;
                }
                var15 = arg5.field823 + (var11.method396() + 1 >> 1);
                if (var9 < var15) {
                    var9 = var15;
                }
            }
        }
        class177 var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        if (arg3.field337 != null) {
            var16 = class512.method3050(13968, arg3.field351);
            if (var16 != null) {
                var17 = class258.field4149.method166(null, null, arg3.field337, class185.field2842, 5256);
                int var24 = arg5.field823;
                if (var11 == null) {
                    var18 = var24 - var16.method1251() * var17 / 2;
                } else {
                    var18 = var24 - ((var11.method396() >> 1) + var17 * var16.method1253());
                }
                for (int var25 = 0; var25 < var17; var25++) {
                    String var26 = class185.field2842[var25];
                    if (var17 - 1 > var25) {
                        var26 = var26.substring(0, var26.length() - 4);
                    }
                    int var27 = var16.method1254(var26);
                    if (var19 < var27) {
                        var19 = var27;
                    }
                }
                var20 = arg5.field820 + arg1 - var19 / 2;
                if (var6 > var20) {
                    var6 = var20;
                }
                var21 = var19 / 2 + arg1 + arg5.field820;
                if (var21 > var7) {
                    var7 = var21;
                }
                var22 = arg0 + var18;
                var23 = var18 - (-(var17 * var16.method1253()) - arg0);
                if (var22 < var8) {
                    var8 = var22;
                }
                if (var23 > var9) {
                    var9 = var23;
                }
            }
        }
        if (class362.field5344 > var7 || class362.field5346 < var6 || var9 < class362.field5358 || class362.field5360 < var8) {
            return true;
        }
        if (arg3.field371 != null) {
            int[] var28 = new int[arg3.field371.length];
            for (int var29 = 0; var29 < var28.length / 2; var29++) {
                int var31 = arg3.field371[var29 * 2] + arg5.field816;
                int var32 = arg3.field371[var29 * 2 + 1] + arg5.field809;
                var28[var29 * 2] = class362.field5344 + ((var31 - class362.field5359) * (class362.field5346 - class362.field5344) / (class362.field5347 - class362.field5359));
                var28[var29 * 2 + 1] = class362.field5360 - (class362.field5360 - class362.field5358) * (var32 - class362.field5343) / (class362.field5351 - class362.field5343);
            }
            class137.method1008(arg2, var28, arg3.field353);
            for (int var30 = 0; var30 < (var28.length / 2 - 1); var30++) {
                arg2.method1996(var28[(var30 + 1) * 2 + 1], var28[var30 * 2 + 1], var28[var30 * 2 + 2], var28[var30 * 2], arg3.field335, 6853);
            }
            arg2.method1996(var28[1], var28[var28.length - 1], var28[0], var28[var28.length - 2], arg3.field335, 6853);
        }
        if (var11 != null) {
            if (class178.field2722 > 0 && (class53.field810 != -1 && class53.field810 == arg5.field824 || class237.field3569 != -1 && class237.field3569 == arg3.field368)) {
                int var33;
                if (class287.field4472 <= 50) {
                    var33 = class287.field4472 * 2;
                } else {
                    var33 = (100 - class287.field4472) * 2;
                }
                int var34 = var33 << 24 | 0xFFFF00;
                arg2.method1989(arg5.field823, arg5.field820, var11.method398() / 2 + 7, var34, -84);
                arg2.method1989(arg5.field823, arg5.field820, var11.method398() / 2 + 5, var34, -103);
                arg2.method1989(arg5.field823, arg5.field820, var11.method398() / 2 + 3, var34, -76);
                arg2.method1989(arg5.field823, arg5.field820, var11.method398() / 2 + 1, var34, -98);
                arg2.method1989(arg5.field823, arg5.field820, var11.method398() / 2, var34, -82);
            }
            var11.method2316(arg5.field820 - (var11.method394() >> 1), arg5.field823 - (var11.method396() >> 1));
        }
        if (arg3.field337 != null && var16 != null) {
            class467.method2846(var18, var16, arg5, var19, var17, arg2, 4, arg3);
        }
        if (arg3.field331 != -1 || arg3.field337 != null) {
            class377 var35 = new class377(arg5);
            var35.field5565 = var20;
            var35.field5562 = var21;
            var35.field5564 = var23;
            var35.field5568 = var15;
            var35.field5561 = var22;
            var35.field5563 = var12;
            var35.field5569 = var13;
            var35.field5560 = var14;
            class328.field4965.method292((byte) 121, var35);
        }
        return false;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    public static void method786(int arg0) {
        field1485 = null;
        if (arg0 != -25520) {
            method786(31);
        }
        field1486 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method787(String arg0, byte arg1) {
        field1481++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class35.method215(arg0, -113);
        int var3 = 116 % ((-arg1 - 36) / 35);
        if (var2 == null) {
            return;
        }
        for (int var4 = 0; var4 < class324.field4920; var4++) {
            String var5 = class8.field95[var4];
            if (var5.startsWith("*")) {
                var5 = var5.substring(1);
            }
            String var6 = class35.method215(var5, -101);
            if (var6 != null && var6.equals(var2)) {
                class324.field4920--;
                for (int var7 = var4; var7 < class324.field4920; var7++) {
                    class8.field95[var7] = class8.field95[var7 + 1];
                    class271.field4283[var7] = class271.field4283[var7 + 1];
                    class484.field7094[var7] = class484.field7094[var7 + 1];
                    class280.field4362[var7] = class280.field4362[var7 + 1];
                    class5.field68[var7] = class5.field68[var7 + 1];
                }
                class221.field3314 = class348.field5194;
                class53.field818++;
                class110.method857(4095, class97.field1520);
                class312.field4752.method1381(class447.method2755(arg0, (byte) -115), (byte) 83);
                class312.field4752.method1343(arg0, (byte) -14);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lue;I)I")
    public static final int method788(class376 arg0, int arg1) {
        field1482++;
        String var2 = class354.method2259((byte) -123, arg0);
        int[] var3 = null;
        if (class349.method2246((byte) 124, arg0.field5546)) {
            var3 = class300.field4608.method2088((int) arg0.field5553, 108).field3331;
        } else if (arg0.field5552 != -1) {
            var3 = class300.field4608.method2088(arg0.field5552, 112).field3331;
        } else if (class33.method197(arg0.field5546, 79)) {
            class5 var4 = (class5) class366.field5398.method358((byte) -128, (long) ((int) arg0.field5553));
            if (var4 != null) {
                class46 var5 = var4.field65;
                class171 var6 = var5.field718;
                if (var6.field2611 != null) {
                    var6 = var6.method1221(class288.field4476, 0);
                }
                if (var6 != null) {
                    var3 = var6.field2623;
                }
            }
        } else if (class299.method1993(true, arg0.field5546)) {
            Object var7 = null;
            class395 var8;
            if (arg0.field5546 == 1003) {
                var8 = class247.field3693.method2281((int) arg0.field5553, -9380);
            } else {
                var8 = class247.field3693.method2281((int) (arg0.field5553 >>> 32 & 0x7FFFFFFFL), -9380);
            }
            if (var8.field5825 != null) {
                var8 = var8.method2485(class288.field4476, 125);
            }
            if (var8 != null) {
                var3 = var8.field5768;
            }
        }
        if (var3 != null) {
            var2 = var2 + class477.method2879(var3, (byte) -67);
        }
        int var9 = class447.field6643.method170(0, class397.field5855, var2);
        if (arg1 > -64) {
            method785(-83, 33, null, null, 39, null);
        }
        if (arg0.field5548) {
            var9 += class540.field7910.method398() + 4;
        }
        return var9;
    }

    static {
        new class179("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
        field1485 = new class179("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");
        field1486 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };
    }
}
