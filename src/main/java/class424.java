import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hja")
public class class424 extends class111 {

    @OriginalMember(owner = "client!hja", name = "J", descriptor = "Lke;")
    public static class622 field5978 = new class622(113, 10);

    @OriginalMember(owner = "client!hja", name = "L", descriptor = "Ljo;")
    public static class351 field5980 = new class351(43, 8);

    @OriginalMember(owner = "client!hja", name = "M", descriptor = "F")
    public static float field5981 = 1.0F;

    @OriginalMember(owner = "client!hja", name = "G", descriptor = "I")
    public static int field5975;

    @OriginalMember(owner = "client!hja", name = "H", descriptor = "I")
    public static int field5976;

    @OriginalMember(owner = "client!hja", name = "I", descriptor = "I")
    public static int field5977;

    @OriginalMember(owner = "client!hja", name = "K", descriptor = "I")
    public static int field5979;

    @OriginalMember(owner = "client!hja", name = "F", descriptor = "[B")
    private byte[] field5974;

    @OriginalMember(owner = "client!hja", name = "c", descriptor = "(B)V", line = 4)
    public static void method2527(byte arg0) {
        if (arg0 != -70) {
            field5980 = null;
        }
        field5978 = null;
        field5980 = null;
    }

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(IBI)V", line = 15)
    public final void method776(int arg0, byte arg1, int arg2) {
        field5979++;
        int var4 = arg2 * 2;
        int var5 = arg1 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field5974[var10001] = -1;
        if (arg0 == -1737357460) {
            this.field5974[var6] = (byte) (var5 * 3 >> 5);
        }
    }

    @OriginalMember(owner = "client!hja", name = "b", descriptor = "(Z)V", line = 33)
    public static final void method2528(boolean arg0) {
        field5975++;
        for (int var1 = 0; var1 < class115.field1451; var1++) {
            class498.field7080[var1] = null;
        }
        class115.field1451 = 0;
        for (int var2 = 0; var2 < class456.field6545; var2++) {
            for (int var42 = 0; var42 < class151.field2074; var42++) {
                for (int var43 = 0; var43 < class12.field249; var43++) {
                    class379 var44 = class378.field5427[var2][var43][var42];
                    if (var44 != null) {
                        if (var44.field5445 > 0) {
                            var44.field5445 = (short) (var44.field5445 * -1);
                        }
                        if (var44.field5436 > 0) {
                            var44.field5436 = (short) (var44.field5436 * -1);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < class456.field6545; var3++) {
            for (int var4 = 0; var4 < class151.field2074; var4++) {
                for (int var5 = 0; var5 < class12.field249; var5++) {
                    class379 var6 = class378.field5427[var3][var5][var4];
                    if (var6 != null) {
                        boolean var7 = class378.field5427[0][var5][var4] != null && class378.field5427[0][var5][var4].field5431 != null;
                        if (var6.field5436 < 0) {
                            int var8 = var4;
                            int var9 = var4;
                            int var11 = var3;
                            class379 var12 = class378.field5427[var3][var5][var4 - 1];
                            int var13 = class750.field10395[var3].method1976(var5, -1, var4);
                            while (var8 > 0 && var12 != null && var12.field5436 < 0 && var6.field5436 == var12.field5436 && var6.field5434 == var12.field5434 && class750.field10395[var3].method1976(var5, -1, var8 - 1) == var13 && (var8 - 1 <= 0 || class750.field10395[var3].method1976(var5, -1, var8 - 2) == var13)) {
                                var8--;
                                var12 = class378.field5427[var3][var5][var8 - 1];
                            }
                            for (class379 var14 = class378.field5427[var3][var5][var4 + 1]; var9 < class12.field249 && var14 != null && var14.field5436 < 0 && var6.field5436 == var14.field5436 && var6.field5434 == var14.field5434 && var13 == class750.field10395[var3].method1976(var5, -1, var9 + 1) && ((var9 + 1) >= class12.field249 || var13 == class750.field10395[var3].method1976(var5, -1, var9 + 2)); var14 = class378.field5427[var3][var5][var9 + 1]) {
                                var9++;
                            }
                            int var15 = var3 + 1 - var3;
                            int var16 = class750.field10395[var7 ? var3 + 1 : var3].method1976(var5, -1, var8);
                            int var17 = var6.field5436 * var15 + var16;
                            int var18 = class750.field10395[var7 ? var3 + 1 : var3].method1976(var5, -1, var9 + 1);
                            int var19 = var6.field5436 * var15 + var18;
                            int var20 = var5 << class310.field4616;
                            int var21 = var8 << class310.field4616;
                            int var22 = (var9 << class310.field4616) + class13.field254;
                            class498.field7080[class115.field1451++] = new class302(1, var3, var20 + var6.field5434, var6.field5434 + var20, var6.field5434 + var20, var6.field5434 + var20, var16, var18, var19, var17, var21, var22, var22, var21);
                            for (int var23 = var3; var23 <= var11; var23++) {
                                for (int var24 = var8; var24 <= var9; var24++) {
                                    class378.field5427[var23][var5][var24].field5436 = (short) (class378.field5427[var23][var5][var24].field5436 * -1);
                                }
                            }
                        }
                        if (var6.field5445 < 0) {
                            int var25 = var5;
                            int var26 = var5;
                            int var28 = var3;
                            class379 var29 = class378.field5427[var3][var5 - 1][var4];
                            int var30 = class750.field10395[var3].method1976(var5, -1, var4);
                            while (var25 > 0 && var29 != null && var29.field5445 < 0 && var6.field5445 == var29.field5445 && var6.field5435 == var29.field5435 && class750.field10395[var3].method1976(var25 - 1, -1, var4) == var30 && ((var25 - 1) <= 0 || class750.field10395[var3].method1976(var25 - 2, -1, var4) == var30)) {
                                var25--;
                                var29 = class378.field5427[var3][var25 - 1][var4];
                            }
                            for (class379 var31 = class378.field5427[var3][var5 + 1][var4]; class151.field2074 > var26 && var31 != null && var31.field5445 < 0 && var6.field5445 == var31.field5445 && var6.field5435 == var31.field5435 && var30 == class750.field10395[var3].method1976(var26 + 1, -1, var4) && (class151.field2074 <= var26 + 1 || var30 == class750.field10395[var3].method1976(var26 + 2, -1, var4)); var31 = class378.field5427[var3][var26 + 1][var4]) {
                                var26++;
                            }
                            int var32 = var3 + 1 - var3;
                            int var33 = class750.field10395[var7 ? var3 + 1 : var3].method1976(var25, -1, var4);
                            int var34 = var6.field5445 * var32 + var33;
                            int var35 = class750.field10395[var7 ? var3 + 1 : var3].method1976(var26 + 1, -1, var4);
                            int var36 = var6.field5445 * var32 + var35;
                            int var37 = var25 << class310.field4616;
                            int var38 = (var26 << class310.field4616) + class13.field254;
                            int var39 = var4 << class310.field4616;
                            class498.field7080[class115.field1451++] = new class302(2, var3, var37, var38, var38, var37, var33, var35, var36, var34, var6.field5435 + var39, var6.field5435 + var39, var6.field5435 + var39, var6.field5435 + var39);
                            for (int var40 = var3; var40 <= var28; var40++) {
                                for (int var41 = var25; var41 <= var26; var41++) {
                                    class378.field5427[var40][var41][var4].field5445 = (short) (class378.field5427[var40][var41][var4].field5445 * -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        class663.field9303 = arg0;
    }

    @OriginalMember(owner = "client!hja", name = "<init>", descriptor = "()V", line = 251)
    public class424() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(IIIB)[B", line = 267)
    public final byte[] method2529(int arg0, int arg1, int arg2, byte arg3) {
        field5977++;
        int var5 = 84 / ((arg3 + 16) / 43);
        this.field5974 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1626(arg0, arg2, -102, arg1);
        return this.field5974;
    }
}
