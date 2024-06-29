import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class10 {

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
    public static int field267 = 0;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "J")
    public static long field268 = -1L;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lr;IIIIIIZZ)V", line = 6)
    public static final void method72(class98 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class503.field7110 = arg0;
        class281.field3735 = arg1;
        class96.field1479 = class281.field3735 > 1 && class503.field7110.method654();
        class125.field1831 = arg2;
        class263.field3412 = 0x1 << class125.field1831;
        class41.field615 = class263.field3412 >> 1;
        Math.sqrt((double) (class41.field615 * class41.field615 + class41.field615 * class41.field615));
        class555.field8157 = arg3;
        class91.field1390 = arg4;
        class575.field8372 = arg5;
        class176.field2466 = arg6;
        class549.field8093 = class239.method1470(2);
        class516.method2905(126);
        class39.field585 = new class44[arg3][class91.field1390][class575.field8372];
        class262.field3404 = new class682[arg3];
        if (arg7) {
            class697.field9813 = new int[class91.field1390][class575.field8372];
            class319.field4644 = new byte[class91.field1390][class575.field8372];
            class267.field3482 = new short[class91.field1390][class575.field8372];
            class591.field8590 = new class44[1][class91.field1390][class575.field8372];
            class383.field5753 = new class682[1];
        } else {
            class697.field9813 = null;
            class319.field4644 = null;
            class267.field3482 = null;
            class591.field8590 = null;
            class383.field5753 = null;
        }
        if (arg8) {
            class267.field3487 = new long[arg3][arg4][arg5];
            class324.field4707 = new class471[65535];
            class638.field9172 = new boolean[65535];
            class291.field4276 = 0;
        } else {
            class267.field3487 = null;
            class324.field4707 = null;
            class638.field9172 = null;
            class291.field4276 = 0;
        }
        class243.method1491(false);
        class313.field4591 = new class538[2][];
        class313.field4591[0] = new class538[class141.field2037[0]];
        class313.field4591[1] = new class538[class141.field2037[1]];
        class311.field4576 = new int[2];
        class403.field6051 = new class538[2][];
        class403.field6051[0] = new class538[class589.field8576[0]];
        class403.field6051[1] = new class538[class589.field8576[1]];
        class48.field760 = new int[2];
        class153.field2152 = new class538[2][];
        class153.field2152[0] = new class538[class314.field4601[0]];
        class153.field2152[1] = new class538[class314.field4601[1]];
        class464.field6700 = new int[2];
        class258.field3351 = new class538[10000];
        class129.field1862 = 0;
        class249.field3275 = new class538[5000];
        class141.field2035 = 0;
        class117.field1753 = new class293[5000];
        class296.field4366 = 0;
        class406.field6066 = new boolean[class176.field2466 + class176.field2466 + 1][class176.field2466 + class176.field2466 + 1];
        class501.field7093 = new boolean[class176.field2466 + class176.field2466 + 2][class176.field2466 + class176.field2466 + 2];
        if (class96.field1479) {
            class60.field964 = new boolean[arg3][class176.field2466 + class176.field2466 + 1][class176.field2466 + class176.field2466 + 1];
            class297.field4370 = new boolean[arg3][][];
            if (class466.field6718 != null) {
                class492.method2814();
            }
            class466.field6718 = new class706[class281.field3735];
            class503.field7110.method626(class466.field6718.length + 1);
            class503.field7110.method665(0);
            for (int var9 = 0; var9 < class466.field6718.length; var9++) {
                class466.field6718[var9] = new class706(var9 + 1, class503.field7110);
                (new Thread(class466.field6718[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class281.field3735 == 2) {
                var10 = 4;
                class346.field5108 = 2;
            } else if (class281.field3735 == 3) {
                var10 = 6;
                class346.field5108 = 3;
            } else {
                var10 = 8;
                class346.field5108 = 4;
            }
            class78.field1283 = new class486[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                class78.field1283[var11] = new class486(class418.field6177[class281.field3735 - 2][var11]);
            }
        } else {
            class346.field5108 = 1;
        }
        class347.field5150 = new int[class346.field5108 - 1];
        class6.field207 = new int[class346.field5108 - 1];
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 132)
    public static final int method73(String arg0, int arg1) {
        field266++;
        int var2 = arg0.length();
        if (arg1 > -77) {
            return -74;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 <= '\u007F') {
                var3++;
            } else if (var5 > '߿') {
                var3 += 3;
            } else {
                var3 += 2;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)V", line = 177)
    public static final void method74(int arg0, int arg1) {
        class425 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class682 var4 = class262.field3404[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class575.field8372; var5++) {
                    for (int var6 = 0; var6 < class91.field1390; var6++) {
                        var2 = var4.method2171(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class125.field1831;
                            int var8 = var5 << class125.field1831;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class682 var10 = class262.field3404[var9];
                                if (var10 != null) {
                                    int var11 = var4.method3822(var5, var6, 0) - var10.method3822(var5, var6, 0);
                                    int var12 = var4.method3822(var5, var6 + 1, 0) - var10.method3822(var5, var6 + 1, 0);
                                    int var13 = var4.method3822(var5 + 1, var6 + 1, 0) - var10.method3822(var5 + 1, var6 + 1, 0);
                                    int var14 = var4.method3822(var5 + 1, var6, 0) - var10.method3822(var5 + 1, var6, 0);
                                    var10.method2173(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
