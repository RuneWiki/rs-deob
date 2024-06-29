import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class260 extends class28 {

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "Lkk;")
    public class198 field4484;

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!ha", name = "O", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "[I")
    public static int[] field4485;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "[Loe;")
    public static class108[] field4481;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILng;)V")
    public static final void method1728(int arg0, class135 arg1) {
        int var2 = -9 / ((84 - arg0) / 42);
        field4488++;
        while (true) {
            while (arg1.field2449 < arg1.field2483.length) {
                int var3 = 0;
                boolean var4 = false;
                int var5 = 0;
                if (arg1.method920((byte) 97) == 1) {
                    var3 = arg1.method920((byte) 23);
                    var5 = arg1.method920((byte) 107);
                    var4 = true;
                }
                int var6 = arg1.method920((byte) 70);
                int var7 = arg1.method920((byte) 77);
                int var8 = var6 * 64 - class269.field4796;
                int var9 = class176.field3141 + class155.field2871 - (var7 * 64) - 1;
                if (var8 >= 0 && var9 - 63 >= 0 && class213.field3824 > var8 + 63 && class155.field2871 > var9) {
                    int var10 = var9 >> 6;
                    int var11 = var8 >> 6;
                    for (int var12 = 0; var12 < 64; var12++) {
                        for (int var13 = 0; var13 < 64; var13++) {
                            if (!var4 || (var3 * 8) <= var12 && var3 * 8 + 8 > var12 && var13 >= (var5 * 8) && var13 < var5 * 8 + 8) {
                                byte var14 = arg1.method929((byte) -3);
                                if (var14 != 0) {
                                    if (class72.field1369[var11][var10] == null) {
                                        class72.field1369[var11][var10] = new byte[4096];
                                    }
                                    class72.field1369[var11][var10][(63 - var13 << 6) + var12] = var14;
                                    byte var15 = arg1.method929((byte) -3);
                                    if (class166.field3007[var11][var10] == null) {
                                        class166.field3007[var11][var10] = new byte[4096];
                                    }
                                    class166.field3007[var11][var10][(63 - var13 << 6) + var12] = var15;
                                }
                            }
                        }
                    }
                } else {
                    for (int var16 = 0; var16 < (var4 ? 64 : 4096); var16++) {
                        byte var17 = arg1.method929((byte) -3);
                        if (var17 != 0) {
                            arg1.field2449++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1729(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4486++;
        if (class202.method1390(2, arg7)) {
            client.method1470(class178.field3174[arg7], arg0, arg2, arg6, arg3, arg4, arg1, arg5);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public static final void method1730(boolean arg0) {
        class237.method1579(4, 5);
        field4487++;
        class26.method235(5, (byte) -37);
        class110.method726(5, (byte) -109);
        class8.method57(18506, 5);
        class73.method522(5, 127);
        class275.method1883((byte) -128, 5);
        class219.method1506(true, 5);
        class1.method2(!arg0, 5);
        class19.method137((byte) -120, 5);
        class233.method1572(5, 789221);
        class45.method374(5, 44);
        class147.method1014(2103, 5);
        class267.method1818(50, -2586);
        class105.method704(5, arg0);
        class259.method1711(5, -3);
        class100.field1753.method1891(-23549, 5);
        class82.field1538.method1891(-23549, 5);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method1731(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field4482++;
        if (arg6 < 128 || arg7 < 128 || arg6 > 13056 || arg7 > 13056) {
            class113.field1994 = -1;
            class214.field3835 = -1;
            return;
        }
        int var8 = class67.method483(arg7, -116, arg6, class216.field3902) - arg1;
        int var9 = arg7 - class69.field1309;
        int var10 = var8 - class17.field475;
        int var11 = class247.field4289[class202.field3613];
        int var12 = arg6 - class112.field1976;
        int var13 = class247.field4298[class202.field3613];
        int var14 = class247.field4289[class8.field272];
        int var15 = 40 / ((arg5 - 68) / 48);
        int var16 = class247.field4298[class8.field272];
        int var17 = var9 * var14 + var12 * var16 >> 16;
        int var18 = var9 * var16 - var12 * var14 >> 16;
        int var20 = var10 * var13 - (var11 * var18) >> 16;
        int var21 = var10 * var11 + (var13 * var18) >> 16;
        if (var21 >= 50) {
            class214.field3835 = (var20 << 9) / var21 + arg0;
            class113.field1994 = (var17 << 9) / var21 + arg4;
        } else {
            class113.field1994 = -1;
            class214.field3835 = -1;
        }
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(B)V")
    public static void method1732(byte arg0) {
        if (arg0 != -96) {
            field4480 = -32;
        }
        field4481 = null;
        field4485 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V")
    public static final void method1733(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4483++;
        if (arg0 >= class81.field1521 && class205.field3681 >= arg0) {
            int var5 = class219.method1507(class79.field1510, class107.field1890, arg3, 0);
            int var6 = class219.method1507(class79.field1510, class107.field1890, arg4, arg2 + 1);
            class117.method790(var6, (byte) 61, var5, arg1, arg0);
        }
        if (arg2 != -1) {
            field4481 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lkk;)V")
    public class260(class198 arg0) {
        this.field4484 = arg0;
    }
}
