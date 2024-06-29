import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class525 {

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "[I")
    public static int[] field7711 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public static int field7712 = 0;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "J")
    public static long field7714 = 0L;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "Lof;")
    public static class446 field7713 = new class446("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public static int field7709;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public static int field7710;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lhi;Z)Z", line = 5)
    public static final boolean method3110(class140 arg0, boolean arg1) {
        boolean var2 = class71.field988 == class306.field4447;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method938((byte) -47);
        if (arg0.field1868 < 0 || arg0.field1863 < 0 || arg0.field1871 >= class533.field7842 || arg0.field1874 >= class475.field7051) {
            return false;
        }
        for (int var6 = arg0.field1868; var6 <= arg0.field1871; var6++) {
            for (int var9 = arg0.field1863; var9 <= arg0.field1874; var9++) {
                class452 var10 = class2.method8(arg0.field1866, var6, var9);
                if (var10 != null) {
                    int var11 = 0;
                    if (var6 > arg0.field1868) {
                        var11++;
                    }
                    if (var6 < arg0.field1871) {
                        var11 += 4;
                    }
                    if (var9 > arg0.field1863) {
                        var11 += 8;
                    }
                    if (var9 < arg0.field1874) {
                        var11 += 2;
                    }
                    class384 var12 = class71.method493((byte) 21, arg0, var11);
                    class384 var13 = var10.field6814;
                    if (var13 == null) {
                        var10.field6814 = var12;
                    } else {
                        while (var13.field5834 != null) {
                            var13 = var13.field5834;
                        }
                        var13.field5834 = var12;
                    }
                    var10.field6798 = (byte) (var10.field6798 | var11);
                    if (var2 && (class374.field5693[var6][var9] & 0xFF000000) != 0) {
                        var3 = class374.field5693[var6][var9];
                        var4 = class236.field3344[var6][var9];
                        var5 = class113.field1574[var6][var9];
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var7 = arg0.field1868; var7 <= arg0.field1871; var7++) {
                for (int var8 = arg0.field1863; var8 <= arg0.field1874; var8++) {
                    if ((class374.field5693[var7][var8] & 0xFF000000) == 0) {
                        class374.field5693[var7][var8] = var3;
                        class236.field3344[var7][var8] = var4;
                        class113.field1574[var7][var8] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class1.field8[class527.field7728++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;I)V", line = 113)
    public static final void method3111(String arg0, String arg1, int arg2, String arg3, int arg4, int arg5, String arg6, int arg7) {
        if (arg5 != 28353) {
            return;
        }
        for (int var8 = 99; var8 > 0; var8--) {
            class33.field503[var8] = class33.field503[var8 - 1];
            class221.field3080[var8] = class221.field3080[var8 - 1];
            class313.field4577[var8] = class313.field4577[var8 - 1];
            class514.field7555[var8] = class514.field7555[var8 - 1];
            class208.field2884[var8] = class208.field2884[var8 - 1];
            class149.field1963[var8] = class149.field1963[var8 - 1];
            class230.field3290[var8] = class230.field3290[var8 - 1];
        }
        field7710++;
        class33.field503[0] = arg2;
        class313.field4577[0] = arg3;
        class221.field3080[0] = arg7;
        class514.field7555[0] = arg6;
        class208.field2884[0] = arg0;
        class149.field1963[0] = arg1;
        class139.field1854 = class145.field1932;
        class230.field3290[0] = arg4;
        class490.field7241++;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V", line = 147)
    public static void method3112(int arg0) {
        field7713 = null;
        if (arg0 <= -9) {
            field7711 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILga;)V", line = 158)
    public static final void method3113(int arg0, class282 arg1) {
        field7709++;
        class282 var2 = class357.method2291(arg1, -1);
        int var3 = 17 % ((arg0 - 23) / 34);
        int var4;
        int var5;
        if (var2 == null) {
            var4 = class147.field1961;
            var5 = class107.field1525;
        } else {
            var4 = var2.field3991;
            var5 = var2.field4043;
        }
        class13.method137(var5, false, var4, (byte) 96, arg1);
        class22.method204(1160694670, var4, arg1, var5);
    }
}
