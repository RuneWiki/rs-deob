import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class83 extends class60 {

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "[I")
    public static int[] field1295 = new int[] { 0, 0, 0, 0, 0, 2, 0, 12, 12, 4, 0, 3, 0, 0, 0, 14, -2, 0, 0, 0, 0, 0, -1, 0, 0, 0, 17, 0, -1, 3, 0, 0, 0, 0, -1, 0, 0, 12, 3, 0, 0, 6, 0, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, -1, 0, 5, 0, -1, 10, -1, 4, 7, 0, 0, 4, 3, 12, 0, 0, 3, 0, 0, 0, 0, 2, 0, 0, 0, 0, -2, 0, 0, -1, 0, 0, 0, 0, 0, 0, 15, -2, 0, 8, -2, 0, 0, 0, 0, 0, 6, -2, 0, 28, 2, 8, -2, 0, 0, 3, 0, 8, 0, 8, 3, -1, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 5, 6, 0, 14, 8, 0, 5, 5, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 1, 0, -1, 0, 0, 10, 7, 0, 0, 0, 2, 0, 0, 0, 11, 0, 20, 1, 0, 8, 0, 1, 0, 0, 0, 2, 6, 0, 0, 0, 0, 0, -1, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 8, 0, -1, 0, 7, -2, 0, 6, 6, 0, 0, 0, 0, 6, 0, 0, 0, 6, -2, -2, -2, -2, 8, 6, 6, 0, 0, 0, -1, 0, 0, -1, 0, 1, 0, 15, 0, 0, 0, 0, 9, 0, 7, 0, 2, 0, 8, 0, 3, 0, -1, 0, 2, 0, 0, 6, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
    public static int field1290 = 0;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public int field1282;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public int field1283;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public int field1286;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
    public int field1289;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public int field1291;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public int field1292;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public int field1293;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
    public int field1296;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    public int field1297;

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
    public int field1299;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "I")
    public int field1300;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "I")
    public int field1301;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "Lpk;")
    public static class120 field1294;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "Lpk;")
    public static class120 field1298;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "[I")
    public static int[] field1288;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V", line = 14)
    public static final void method654(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class343.field5331; var3++) {
            for (int var4 = 0; var4 < class91.field1449; var4++) {
                for (int var5 = 0; var5 < class327.field5110; var5++) {
                    class42 var6 = class34.field521[var3][var4][var5];
                    if (var6 != null) {
                        class105 var7 = var6.field665;
                        if (var7 != null && var7.field1723.method115()) {
                            class68.method538(var7.field1723, var3, var4, var5, 1, 1);
                            if (var7.field1724 != null && var7.field1724.method115()) {
                                class68.method538(var7.field1724, var3, var4, var5, 1, 1);
                                var7.field1723.method104(var7.field1724, 0, 0, 0, false);
                                var7.field1724 = var7.field1724.method114(arg0, arg1, arg2);
                            }
                            var7.field1723 = var7.field1723.method114(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field672; var8++) {
                            class144 var9 = var6.field659[var8];
                            if (var9 != null && var9.field2346.method115()) {
                                class68.method538(var9.field2346, var3, var4, var5, var9.field2334 + 1 - var9.field2345, var9.field2337 - var9.field2339 + 1);
                                var9.field2346 = var9.field2346.method114(arg0, arg1, arg2);
                            }
                        }
                        class241 var10 = var6.field655;
                        if (var10 != null && var10.field3609.method115()) {
                            class316.method2233(var10.field3609, var3, var4, var5);
                            var10.field3609 = var10.field3609.method114(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)V", line = 87)
    public static final void method655(boolean arg0, int arg1) {
        if (!arg0) {
            field1287++;
            class311.field4915.method2285(arg1, (byte) 97);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BII)V", line = 102)
    public static final void method656(byte arg0, int arg1, int arg2) {
        if (arg0 >= -72) {
            return;
        }
        int var3 = class80.field1253 * arg1 >> 8;
        field1284++;
        if (arg2 == -1 && !class188.field2957) {
            class340.method2355((byte) -53);
        } else if (arg2 != -1 && (class118.field1906 != arg2 || !class14.method182(116)) && var3 != 0 && !class188.field2957) {
            class237.method1695(arg2, false, 2, class79.field1232, (byte) -64, 0, var3);
        }
        class118.field1906 = arg2;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V", line = 129)
    public static void method657(int arg0) {
        field1295 = null;
        field1288 = null;
        int var1 = 12 % ((arg0 - 51) / 61);
        field1298 = null;
        field1294 = null;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(III)Lre;", line = 142)
    public static final class293 method658(int arg0, int arg1, int arg2) {
        class42 var3 = class34.field521[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class293 var4 = var3.field666;
            var3.field666 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)Z", line = 159)
    public static final boolean method659(int arg0, byte arg1) {
        field1285++;
        if (class266.field3943 == arg0) {
            return false;
        }
        class171.field2755 = new int[104][104];
        class174.field2795 = new int[4][13][13];
        for (int var2 = 0; var2 < 4; var2++) {
            class166.field2686[var2] = new class53(104, 104);
        }
        class332.field5184 = new byte[4][104][104];
        class316.field4985 = new class30[4][104][104];
        class242.field3621 = new byte[4][104][104];
        if (class162.field2623) {
            class219.method1584(4, 104, 104);
            class295.method2072(104, 104);
            class155.field2520 = new class75[13][13];
        }
        int var3 = 105 / ((arg1 + 7) / 59);
        class266.field3943 = arg0;
        return true;
    }
}
