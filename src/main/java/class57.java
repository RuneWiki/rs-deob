import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class57 extends class71 {

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field969 = new String[1000];

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "[I")
    public static int[] field973 = new int[2048];

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "Lqh;")
    public static class201 field971;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)Lkh;")
    public static final class45 method423(int arg0, byte arg1) {
        field968++;
        if (arg1 <= 89) {
            field969 = null;
        }
        class45 var2 = (class45) class72.field1185.method480((long) arg0, 85);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class10.field150.method1357(arg0, 4, -1);
        class45 var4 = new class45();
        if (var3 != null) {
            var4.method367(arg0, true, new class221(var3));
        }
        class72.field1185.method474((long) arg0, (byte) 117, var4);
        return var4;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBIII)V")
    public static final void method424(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field972++;
        class259 var5 = class213.method1464((byte) -105, arg3, 10);
        if (arg1 >= -119) {
            method423(115, (byte) -107);
        }
        var5.method1766(0);
        var5.field4114 = arg4;
        var5.field4128 = arg0;
        var5.field4113 = arg2;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)Lji;")
    public static final class42 method425(int arg0, int arg1, int arg2) {
        class134 var3 = class288.field4563[arg0][arg1][arg2];
        return var3 == null || var3.field2140 == null ? null : var3.field2140;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V")
    public static void method426(int arg0) {
        field973 = null;
        field969 = null;
        field971 = null;
        if (arg0 != 104) {
            method424(-10, (byte) 65, 123, -68, -75);
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(IB)Z")
    public static final boolean method427(int arg0, byte arg1) {
        field970++;
        byte var2 = 0;
        byte var3 = 0;
        if (class196.field3129 == null) {
            if (class152.field2459 == null) {
                class196.field3129 = new class37(512, 512);
            } else {
                class196.field3129 = (class37) class152.field2459;
            }
            int[] var4 = class196.field3129.field723;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var2 + 1; var7 < (104 - var2 - 1); var7++) {
                int var21 = ((var2 + 103 - var7) * 512 * 4) + 24628;
                for (int var22 = var3 + 1; var22 < (104 - var3 - 1); var22++) {
                    if ((class201.field3198[arg0][var22][var7] & 0x18) == 0) {
                        class226.method1593(var4, var21, 512, arg0, var22, var7);
                    }
                    if (arg0 < 3 && (class201.field3198[arg0 + 1][var22][var7] & 0x8) != 0) {
                        class226.method1593(var4, var21, 512, arg0 + 1, var22, var7);
                    }
                    var21 += 4;
                }
            }
            class75.field1213 = 0;
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var9 = 0; var9 < 104; var9++) {
                    long var10 = class124.method896(class250.field3980, var8 + var3, var9 - -var2);
                    if (var10 != 0L) {
                        class135 var12 = class209.method1447((int) (var10 >>> 32) & Integer.MAX_VALUE, -6653);
                        int var13 = var12.field2187;
                        if (var12.field2209 != null) {
                            for (int var14 = 0; var14 < var12.field2209.length; var14++) {
                                if (var12.field2209[var14] != -1) {
                                    class135 var15 = class209.method1447(var12.field2209[var14], -6653);
                                    if (var15.field2187 >= 0) {
                                        var13 = var15.field2187;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var13 >= 0) {
                            int var16 = var3 + var8;
                            int var17 = var2 + var9;
                            if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                                int[][] var18 = class167.field2657[class250.field3980].field371;
                                for (int var19 = 0; var19 < 10; var19++) {
                                    int var20 = (int) (Math.random() * 4.0D);
                                    if (var20 == 0 && var16 > 0 && var16 > (var8 - 3) && (var18[var16 - 1][var17] & 0x12C0108) == 0) {
                                        var16--;
                                    }
                                    if (var20 == 1 && var16 < 103 && var16 < var8 + 3 && (var18[var16 + 1][var17] & 0x12C0180) == 0) {
                                        var16++;
                                    }
                                    if (var20 == 2 && var17 > 0 && var9 - 3 < var17 && (var18[var16][var17 - 1] & 0x12C0102) == 0) {
                                        var17--;
                                    }
                                    if (var20 == 3 && var17 < 103 && var17 < (var9 + 3) && (var18[var16][var17 + 1] & 0x12C0120) == 0) {
                                        var17++;
                                    }
                                }
                            }
                            class71.field1166[class75.field1213] = var12.field2173;
                            class224.field3714[class75.field1213] = var16 - var3;
                            class51.field898[class75.field1213] = var17 - var2;
                            class75.field1213++;
                        }
                    }
                }
            }
        }
        class196.field3129.method328();
        int var23 = (((int) (Math.random() * 20.0D)) + 228 << 16) + (((int) (Math.random() * 20.0D)) + 228 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
        int var24 = ((int) (Math.random() * 20.0D)) + 228 << 16;
        for (int var25 = 1; var25 < 103; var25++) {
            for (int var27 = 1; var27 < 103; var27++) {
                if ((class201.field3198[arg0][var3 + var27][var2 + var25] & 0x18) == 0 && !class229.method1610((byte) 123, var2, var24, var3, var25, var23, arg0, var27)) {
                    class79.field1263.method1580(16043);
                    return false;
                }
                if (arg0 < 3 && (class201.field3198[arg0 + 1][var3 + var27][var2 + var25] & 0x8) != 0 && !class229.method1610((byte) 123, var2, var24, var3, var25, var23, arg0 + 1, var27)) {
                    class79.field1263.method1580(16043);
                    return false;
                }
            }
        }
        class152.field2459 = class196.field3129;
        int var26 = 27 / ((arg1 + 68) / 56);
        class79.field1263.method1580(16043);
        class196.field3129 = null;
        return true;
    }
}
