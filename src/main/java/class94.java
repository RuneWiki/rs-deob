import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class94 extends class79 {

    @OriginalMember(owner = "client!e", name = "N", descriptor = "I")
    public int field1458;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "I")
    public int field1452;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "Lck;")
    public static class119 field1451 = class298.method1987((byte) 111, "sl_flags");

    @OriginalMember(owner = "client!e", name = "w", descriptor = "I")
    public static int field1446 = -1;

    @OriginalMember(owner = "client!e", name = "G", descriptor = "Lck;")
    public static class119 field1453 = class298.method1987((byte) 119, "chrome");

    @OriginalMember(owner = "client!e", name = "H", descriptor = "Lck;")
    public static class119 field1454 = class298.method1987((byte) 97, "_");

    @OriginalMember(owner = "client!e", name = "K", descriptor = "I")
    public static int field1456 = 1;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "Lck;")
    public static class119 field1455 = class298.method1987((byte) 106, "Welt");

    @OriginalMember(owner = "client!e", name = "x", descriptor = "Z")
    public static boolean field1447 = false;

    @OriginalMember(owner = "client!e", name = "P", descriptor = "I")
    public static int field1460 = 0;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!e", name = "B", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!e", name = "M", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!e", name = "O", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIZIII)V", line = 5)
    public static final void method639(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (!arg2) {
            for (int var6 = arg3; var6 <= arg0; var6++) {
                class36.method282(arg1, arg5, arg4, class256.field4113[var6], 26175);
            }
            field1459++;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZZ)V", line = 32)
    public static final void method640(boolean arg0, boolean arg1) {
        class202.field3209 = new int[104];
        class268.field4416 = new int[104];
        class95.field1464 = new int[104];
        class241.field3867 = new int[104];
        if (!arg1) {
            return;
        }
        class88.field1354 = 99;
        class182.field2886 = new int[104];
        field1445++;
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class220.field3525 = new byte[var2][104][104];
        class273.field4487 = new byte[var2][104][104];
        client.field1392 = new byte[var2][104][104];
        class291.field4780 = new int[var2][105][105];
        class135.field2190 = new byte[var2][104][104];
        class289.field4752 = new byte[var2][105][105];
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(Z)V", line = 60)
    public static final void method641(boolean arg0) {
        if (arg0) {
            field1449++;
            class178.method1134();
            class178.method1143();
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V", line = 77)
    public static void method642(int arg0) {
        field1451 = null;
        field1453 = null;
        if (arg0 <= 117) {
            field1455 = (class119) null;
        }
        field1454 = null;
        field1455 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([Lnc;IIIZ[BIIIII)V", line = 96)
    public static final void method643(class266[] arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg9 != -22180) {
            field1451 = (class119) null;
        }
        field1457++;
        if (!arg4) {
            for (int var11 = 0; var11 < 8; var11++) {
                for (int var12 = 0; var12 < 8; var12++) {
                    if ((arg10 + var11) > 0 && arg10 + var11 < 103 && arg7 + var12 > 0 && (arg7 + var12) < 103) {
                        arg0[arg3].field4356[arg10 + var11][arg7 + var12] = class19.method151(arg0[arg3].field4356[arg10 + var11][arg7 + var12], -16777217);
                    }
                }
            }
        }
        byte var13;
        if (arg4) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        class3 var14 = new class3(arg5);
        for (int var15 = 0; var15 < var13; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg6 == var15 && arg2 <= var16 && arg2 + 8 > var16 && var17 >= arg1 && var17 < (arg1 + 8)) {
                        class100.method668(class244.method1593(var17 & 0x7, (byte) 123, arg8, var16 & 0x7) + arg10, var14, 0, arg3, class174.method1121((byte) 32, arg8, var16 & 0x7, var17 & 0x7) + arg7, arg9 + 22231, 0, arg4, arg8);
                    } else {
                        class100.method668(-1, var14, 0, 0, -1, 98, 0, arg4, 0);
                    }
                }
            }
        }
        if (arg4) {
            return;
        }
        class176 var18 = null;
        while (true) {
            int var20;
            label99: do {
                while (var14.field101.length > var14.field44) {
                    int var19 = var14.method64((byte) 28);
                    if (var19 != 0) {
                        if (var19 != 1) {
                            throw new IllegalStateException();
                        }
                        var20 = var14.method64((byte) 49);
                        continue label99;
                    }
                    var18 = new class176(var14);
                }
                if (var18 == null) {
                    var18 = new class176();
                }
                class198.field3165[arg10 >> 3][arg7 >> 3] = var18;
                return;
            } while (var20 <= 0);
            for (int var21 = 0; var21 < var20; var21++) {
                class243 var22 = new class243(var14);
                int var23 = var22.field3929 >> 7;
                int var24 = var22.field3906 >> 7;
                if (var22.field3928 == arg6 && arg2 <= var23 && var23 < arg2 + 8 && arg1 <= var24 && var24 < (arg1 + 8)) {
                    int var25 = (arg10 << 7) + class72.method515(var22.field3906 & 0x3FF, var22.field3929 & 0x3FF, -1, arg8);
                    int var26 = class10.method102(-120, var22.field3906 & 0x3FF, var22.field3929 & 0x3FF, arg8) + (arg7 << 7);
                    var22.field3906 = var26;
                    var22.field3929 = var25;
                    int var27 = var22.field3906 >> 7;
                    int var28 = var22.field3929 >> 7;
                    if (var28 >= 0 && var27 >= 0 && var28 < 104 && var27 < 104) {
                        var22.field3903 = class57.field926[var22.field3928][var28][var27] - var22.field3903;
                        class125.method835(var22);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)I", line = 250)
    public static final int method644(int arg0, int arg1, int arg2, int arg3) {
        field1448++;
        if (arg0 == arg2) {
            return arg2;
        }
        int var4 = 128 - arg3;
        if (arg1 != 809465831) {
            method642(-83);
        }
        int var5 = (arg0 & 0xFF00FF) * arg3 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00;
        int var6 = ((-16711936 & arg2) >>> 7) * var4 + (((-16711936 & arg0) >>> 7) * arg3) & 0xFF00FF00;
        return (var5 >> 7) + var6;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)I", line = 277)
    public static final int method645(int arg0) {
        field1450++;
        if (arg0 != 1023) {
            field1455 = (class119) null;
        }
        return class266.field4354;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(II)V", line = 290)
    public class94(int arg0, int arg1) {
        this.field1458 = arg1;
        this.field1452 = arg0;
    }
}
