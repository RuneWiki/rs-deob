import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class311 {

    @OriginalMember(owner = "client!so", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4447 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!so", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4446 = "Opened title screen";

    @OriginalMember(owner = "client!so", name = "c", descriptor = "I")
    public static int field4445 = 0;

    @OriginalMember(owner = "client!so", name = "g", descriptor = "Lsa;")
    public static class410 field4449 = null;

    @OriginalMember(owner = "client!so", name = "j", descriptor = "[I")
    public static int[] field4452 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!so", name = "h", descriptor = "B")
    public byte field4450;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!so", name = "f", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!so", name = "l", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!so", name = "m", descriptor = "I")
    public int field4455;

    @OriginalMember(owner = "client!so", name = "n", descriptor = "Ldr;")
    public static class213 field4456;

    @OriginalMember(owner = "client!so", name = "k", descriptor = "Lqj;")
    public static class238 field4453;

    // $FF: synthetic field
    @OriginalMember(owner = "client!so", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field4458;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "Ljava/lang/String;")
    public String field4443;

    @OriginalMember(owner = "client!so", name = "i", descriptor = "Ljava/lang/String;")
    public String field4451;

    @OriginalMember(owner = "client!so", name = "o", descriptor = "Ljava/lang/String;")
    public String field4457;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(BLfg;)V")
    public static final void method1938(byte arg0, class18 arg1) {
        field4444++;
        if (arg0 != 80) {
            return;
        }
        boolean var2 = false;
        if (class50.field698 == arg1.field220 || arg1.field222 == -1 || arg1.field231 != 0) {
            var2 = true;
        } else {
            class15 var3 = class391.method2551(arg1.field222, (byte) -126);
            if (var3.field170 || var3.field164[arg1.field223] < (arg1.field212 + 1)) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg1.field220 - arg1.field281;
            int var5 = class50.field698 - arg1.field281;
            int var6 = arg1.field256 * 128 + arg1.method130((byte) -61) * 64;
            int var7 = arg1.field224 * 128 + (arg1.method130((byte) -50) * 64);
            int var8 = arg1.field246 * 128 + (arg1.method130((byte) -52) * 64);
            int var9 = arg1.field241 * 128 + arg1.method130((byte) -48) * 64;
            arg1.field5298 = ((var4 - var5) * var7 + var5 * var9) / var4;
            arg1.field5284 = ((var4 - var5) * var6 + var5 * var8) / var4;
        }
        arg1.field296 = 0;
        if (arg1.field242 == 0) {
            arg1.method133(-108, 8192);
        }
        if (arg1.field242 == 1) {
            arg1.method133(arg0 - 177, 12288);
        }
        if (arg1.field242 == 2) {
            arg1.method133(-82, 0);
        }
        if (arg1.field242 == 3) {
            arg1.method133(-108, 4096);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
    public static void method1939(int arg0) {
        field4452 = null;
        field4449 = null;
        field4453 = null;
        if (arg0 == 0) {
            field4446 = null;
            field4456 = null;
            field4447 = null;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lqj;Z)V")
    public static final void method1940(class238 arg0, boolean arg1) {
        class307.field4396 = arg0;
        field4448++;
        if (!arg1) {
            field4456 = null;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "()V")
    public static final void method1941() {
        for (int var0 = 0; var0 < class134.field1789; var0++) {
            if (!class333.field4915[var0]) {
                class413 var1 = class74.field997[var0];
                int var2 = var1.field6171;
                int var3 = var1.field5991 - 64;
                int var4 = (var3 * 2 >> 7) + 1;
                int var5 = 0;
                int[] var6 = new int[var4 * var4];
                int var7 = var1.field5994 - var3 >> 7;
                int var8 = var1.field5990 - var3 >> 7;
                int var9 = var1.field5990 + var3 >> 7;
                if (var8 < 0) {
                    var5 -= var8;
                    var8 = 0;
                }
                if (var9 >= class413.field6175) {
                    var9 = class413.field6175 - 1;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var1.field6180[var5];
                    int var12 = var11 >>> 8;
                    int var13 = var4 * var5 + var12;
                    int var14 = (var11 >>> 8) + var7;
                    int var15 = (var11 & 0xFF) + var14 - 1;
                    if (var14 < 0) {
                        var13 -= var14;
                        var14 = 0;
                    }
                    if (var15 >= class308.field4403) {
                        var15 = class308.field4403 - 1;
                    }
                    for (int var16 = var14; var16 <= var15; var16++) {
                        byte var17 = 1;
                        class361 var18 = class312.method1947(var2, var16, var10, field4458 == null ? (field4458 = method1942("me")) : field4458);
                        if (var18 != null && var18.field5292 != 0) {
                            if (var18.field5292 == 1) {
                                boolean var19 = var16 - 1 >= var14;
                                boolean var20 = var16 + 1 <= var15;
                                if (!var19 && var10 + 1 <= var9) {
                                    short var21 = var1.field6180[var5 + 1];
                                    int var22 = (var21 >>> 8) + var7;
                                    int var23 = (var21 & 0xFF) + var22;
                                    var19 = var16 > var22 && var16 < var23;
                                }
                                if (!var20 && var10 - 1 >= var8) {
                                    short var24 = var1.field6180[var5 - 1];
                                    int var25 = (var24 >>> 8) + var7;
                                    int var26 = (var24 & 0xFF) + var25;
                                    var20 = var16 > var25 && var16 < var26;
                                }
                                if (var19 && !var20) {
                                    var17 = 4;
                                } else if (var20 && !var19) {
                                    var17 = 2;
                                }
                            } else {
                                boolean var27 = var16 - 1 >= var14;
                                boolean var28 = var16 + 1 <= var15;
                                if (!var27 && var10 - 1 >= var8) {
                                    short var29 = var1.field6180[var5 - 1];
                                    int var30 = (var29 >>> 8) + var7;
                                    int var31 = (var29 & 0xFF) + var30;
                                    var27 = var16 > var30 && var16 < var31;
                                }
                                if (!var28 && var10 + 1 <= var9) {
                                    short var32 = var1.field6180[var5 + 1];
                                    int var33 = (var32 >>> 8) + var7;
                                    int var34 = (var32 & 0xFF) + var33;
                                    var28 = var16 > var33 && var16 < var34;
                                }
                                if (var27 && !var28) {
                                    var17 = 3;
                                } else if (var28 && !var27) {
                                    var17 = 5;
                                }
                            }
                        }
                        var6[var13++] = var17;
                    }
                    var5++;
                }
                class333.field4915[var0] = true;
                class88.field1226[var2].method795(var1, var6);
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1942(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
