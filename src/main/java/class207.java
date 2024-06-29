import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class207 extends class321 {

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Lde;")
    public static class10 field2966 = new class10(2, 4, 4, 0);

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field2968 = 0;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZI)V")
    public static final void method1323(boolean arg0, int arg1) {
        class334.field4873 = 0;
        int var2 = 58 % ((26 - arg1) / 37);
        class496.field7242 = 0;
        field2967++;
        class224.method1391(3);
        class391.method2318(45056, arg0);
        class372.method2220(-13036);
        boolean var3 = false;
        for (int var4 = 0; var4 < class334.field4873; var4++) {
            int var6 = class251.field3435[var4];
            class326 var7 = (class326) class281.field3826.method1592((byte) -25, (long) var6);
            class209 var8 = var7.field4455;
            if (class526.field7677 && class39.method273(var6, -90)) {
                class140.method985((byte) -78);
            }
            if (class28.field417 != var8.field208) {
                if (var8.field2976.method654(-1)) {
                    class134.method971(var8, true);
                }
                var8.method1330(null, false);
                var7.method2791((byte) 112);
                var3 = true;
            }
        }
        if (var3) {
            class534.field7854 = class281.field3826.method1585((byte) 82);
            class281.field3826.method1589(class496.field7261, (byte) 103);
        }
        if (class399.field5722 != class508.field7414.field4360) {
            throw new RuntimeException("gnp1 pos:" + class508.field7414.field4360 + " psize:" + class399.field5722);
        }
        for (int var5 = 0; var5 < class273.field3692; var5++) {
            if (class281.field3826.method1592((byte) -25, (long) class159.field2416[var5]) == null) {
                throw new RuntimeException("gnp2 pos:" + var5 + " size:" + class273.field3692);
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static final void method1324(int arg0) {
        field2969++;
        int var1 = class508.field7414.method1889(-125);
        int var2 = class508.field7414.method1837((byte) -18);
        class374.field5376 = class508.field7414.method1889(84);
        boolean var3 = class508.field7414.method1869(-72) == 1;
        int var4 = class508.field7414.method1865(-90);
        class409.method2398(0);
        class2.method15(var1, -49);
        class508.field7414.method191((byte) 36);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var21 = 0; var21 < (class9.field111 >> 3); var21++) {
                for (int var22 = 0; var22 < class192.field2809 >> 3; var22++) {
                    int var23 = class508.field7414.method194(1, -15886);
                    if (var23 == 1) {
                        class93.field1520[var5][var21][var22] = class508.field7414.method194(26, -15886);
                    } else {
                        class93.field1520[var5][var21][var22] = -1;
                    }
                }
            }
        }
        class508.field7414.method196(30365);
        int var6 = (class399.field5722 - class508.field7414.field4360) / 16;
        class44.field633 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var20 = 0; var20 < 4; var20++) {
                class44.field633[var7][var20] = class508.field7414.method1863(-1);
            }
        }
        class278.field3779 = new int[var6];
        class94.field1536 = new byte[var6][];
        class236.field3273 = new byte[var6][];
        class98.field1560 = new int[var6];
        class100.field1585 = null;
        class397.field5706 = new byte[var6][];
        int var8 = 34 / ((arg0 + 26) / 59);
        class142.field2119 = null;
        class196.field2873 = new int[var6];
        class463.field6689 = new int[var6];
        class302.field4119 = new int[var6];
        class137.field2065 = new byte[var6][];
        int var9 = 0;
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < class9.field111 >> 3; var11++) {
                for (int var12 = 0; var12 < (class192.field2809 >> 3); var12++) {
                    int var13 = class93.field1520[var10][var11][var12];
                    if (var13 != -1) {
                        int var14 = var13 >> 14 & 0x3FF;
                        int var15 = (var13 & 0x3FFF) >> 3;
                        int var16 = (var14 / 8 << 8) + var15 / 8;
                        for (int var17 = 0; var17 < var9; var17++) {
                            if (class463.field6689[var17] == var16) {
                                var16 = -1;
                                break;
                            }
                        }
                        if (var16 != -1) {
                            class463.field6689[var9] = var16;
                            int var18 = (var16 & 0xFFE6) >> 8;
                            int var19 = var16 & 0xFF;
                            class196.field2873[var9] = class103.field1618.method2488("m" + var18 + "_" + var19, false);
                            class98.field1560[var9] = class103.field1618.method2488("l" + var18 + "_" + var19, false);
                            class302.field4119[var9] = class103.field1618.method2488("um" + var18 + "_" + var19, false);
                            class278.field3779[var9] = class103.field1618.method2488("ul" + var18 + "_" + var19, false);
                            var9++;
                        }
                    }
                }
            }
        }
        class219.method1369(10, var4, var3, var2, -94);
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
    public static void method1325(int arg0) {
        if (arg0 < 50) {
            method1326(39, 10, 65, 86, 63, -109);
        }
        field2966 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class496.field7269[arg0][var8][var14] == -class484.field6969) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class295.field3991) + 1;
            int var10 = (arg3 << class295.field3991) + 2;
            int var11 = class492.field7122[arg0].method85(arg1, arg3) + arg5;
            if (!class24.method150(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class295.field3991) - 1;
            if (!class24.method150(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class295.field3991) - 1;
            if (!class24.method150(var9, var11, var13)) {
                return false;
            } else if (class24.method150(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class491.method2908(arg0, arg1, arg3)) {
            int var6 = arg1 << class295.field3991;
            int var7 = arg3 << class295.field3991;
            return class24.method150(var6 + 1, class492.field7122[arg0].method85(arg1, arg3) + arg5, var7 + 1) && class24.method150(class117.field1845 + var6 - 1, class492.field7122[arg0].method85(arg1 + 1, arg3) + arg5, var7 + 1) && class24.method150(class117.field1845 + var6 - 1, class492.field7122[arg0].method85(arg1 + 1, arg3 + 1) + arg5, class117.field1845 + var7 - 1) && class24.method150(var6 + 1, class492.field7122[arg0].method85(arg1, arg3 + 1) + arg5, class117.field1845 + var7 - 1);
        } else {
            return false;
        }
    }
}
