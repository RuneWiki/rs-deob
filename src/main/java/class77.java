import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class77 extends class171 {

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "[Lgj;")
    public class35[] field1434;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "Lha;")
    public static class46 field1435 = class271.method1828("_labels", -46);

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "Lha;")
    public static class46 field1436 = class271.method1828("l", -46);

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "Lpi;")
    public static class181 field1428;

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "Lpi;")
    public static class181 field1431;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZLwe;)V")
    public static final void method611(boolean arg0, class75 arg1) {
        while (arg1.field1368.length > arg1.field1380) {
            int var2 = 0;
            boolean var3 = false;
            int var4 = 0;
            if (arg1.method558(1) == 1) {
                var3 = true;
                var4 = arg1.method558(1);
                var2 = arg1.method558(1);
            }
            int var5 = arg1.method558(1);
            int var6 = arg1.method558(1);
            int var7 = var5 * 64 - class194.field3493;
            int var8 = class49.field836 - (var6 * 64 + -class232.field4039) - 1;
            if (var7 >= 0 && var8 - 63 >= 0 && (var7 + 63) < class137.field2474 && var8 < class49.field836) {
                int var9 = var8 >> 6;
                int var10 = var7 >> 6;
                for (int var11 = 0; var11 < 64; var11++) {
                    for (int var12 = 0; var12 < 64; var12++) {
                        if (!var3 || var11 >= (var4 * 8) && (var4 * 8 + 8) > var11 && var12 >= var2 * 8 && (var2 * 8 + 8) > var12) {
                            byte var13 = arg1.method569((byte) -110);
                            if (var13 != 0) {
                                if (class113.field2146[var10][var9] == null) {
                                    class113.field2146[var10][var9] = new byte[4096];
                                }
                                class113.field2146[var10][var9][(63 - var12 << 6) + var11] = var13;
                                byte var14 = arg1.method569((byte) -110);
                                if (class210.field3760[var10][var9] == null) {
                                    class210.field3760[var10][var9] = new byte[4096];
                                }
                                class210.field3760[var10][var9][(63 - var12 << 6) + var11] = var14;
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < (var3 ? 64 : 4096); var15++) {
                    byte var16 = arg1.method569((byte) -110);
                    if (var16 != 0) {
                        arg1.field1380++;
                    }
                }
            }
        }
        field1437++;
        if (arg0) {
            field1435 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(B)V")
    public static final void method612(byte arg0) {
        for (class28 var1 = (class28) class40.field696.method264(-121); var1 != null; var1 = (class28) class40.field696.method269((byte) 7)) {
            class226 var2 = var1.field553;
            if (class135.field2450 != var2.field3967 || var2.field3957) {
                var1.method501(0);
            } else if (var2.field3953 <= class157.field2803) {
                var2.method1546(true, class237.field4202);
                if (var2.field3957) {
                    var1.method501(0);
                } else {
                    class24.method166(var2.field3967, var2.field3943, var2.field3954, var2.field3956, 60, var2, 0, -1L, false);
                }
            }
        }
        field1429++;
        if (arg0 < 24) {
            method615(-28);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lae;")
    public static final class14 method613(Throwable arg0, String arg1) {
        field1433++;
        class14 var2;
        if (arg0 instanceof class14) {
            var2 = (class14) arg0;
            var2.field214 = var2.field214 + ' ' + arg1;
        } else {
            var2 = new class14(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)Z")
    public final boolean method614(int arg0, int arg1) {
        if (arg1 < 110) {
            field1435 = null;
        }
        field1430++;
        return this.field1434[arg0].field642;
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)V")
    public static void method615(int arg0) {
        field1431 = null;
        field1435 = null;
        field1428 = null;
        field1436 = null;
        if (arg0 > -84) {
            method612((byte) -37);
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lpi;Lpi;IZ)V")
    public class77(class181 arg0, class181 arg1, int arg2, boolean arg3) {
        class39 var5 = new class39();
        int var6 = arg0.method1327(false, arg2);
        this.field1434 = new class35[var6];
        int[] var7 = arg0.method1318(5, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            class131 var9 = null;
            byte[] var10 = arg0.method1293(var7[var8], arg2, (byte) -108);
            int var11 = var10[0] & 0xFF << 8 | var10[1] & 0xFF;
            for (class131 var12 = (class131) var5.method264(-96); var12 != null; var12 = (class131) var5.method269((byte) 7)) {
                if (var12.field2399 == var11) {
                    var9 = var12;
                    break;
                }
            }
            if (var9 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1309(0, var11, (byte) 39);
                } else {
                    var13 = arg1.method1309(var11, 0, (byte) 39);
                }
                var9 = new class131(var11, var13);
                var5.method265(var9, -501);
            }
            this.field1434[var7[var8]] = new class35(var10, var9);
        }
    }
}
