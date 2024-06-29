import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class161 {

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "F")
    public static float field2413 = 0.0F;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "B")
    public byte field2403;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "B")
    public byte field2404;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "B")
    public byte field2410;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "B")
    public byte field2412;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "B")
    public byte field2417;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "B")
    public byte field2418;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "B")
    public byte field2419;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public int field2411;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
    public int field2425;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qg", name = "z", descriptor = "Ljava/lang/Class;")
    public static Class field2426;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "S")
    public short field2409;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "Z")
    public boolean field2402;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "Z")
    public boolean field2405;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "Z")
    public boolean field2407;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "Z")
    public boolean field2415;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "Z")
    public boolean field2416;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "Z")
    public boolean field2420;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "Z")
    public boolean field2421;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "Z")
    public boolean field2422;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "Z")
    public boolean field2424;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBIIIILya;II)V")
    public static final void method1138(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, class11 arg6, int arg7, int arg8) {
        field2406++;
        int var9 = -108 / ((arg1 + 53) / 60);
        class401 var10 = (class401) class222.method1406(arg3, arg5, arg2);
        if (var10 != null) {
            class486 var11 = class119.field1824.method248(var10.method240(-15578), 30);
            int var12 = var10.method223(-19634) & 0x3;
            int var13 = var10.method222((byte) -105);
            if (var11.field7169 == -1) {
                int var14 = arg7;
                if (var11.field7230 > 0) {
                    var14 = arg8;
                }
                if (var13 == 0 || var13 == 2) {
                    if (var12 == 0) {
                        arg6.method121(arg0, 4, (byte) 50, var14, arg4);
                    } else if (var12 == 1) {
                        arg6.method107(arg4, var14, (byte) -90, arg0, 4);
                    } else if (var12 == 2) {
                        arg6.method121(arg0, 4, (byte) 16, var14, arg4 + 3);
                    } else if (var12 == 3) {
                        arg6.method107(arg4, var14, (byte) -90, arg0 + 3, 4);
                    }
                }
                if (var13 == 3) {
                    if (var12 == 0) {
                        arg6.method67(103, 1, var14, arg4, 1, arg0);
                    } else if (var12 == 1) {
                        arg6.method67(88, 1, var14, arg4 + 3, 1, arg0);
                    } else if (var12 == 2) {
                        arg6.method67(76, 1, var14, arg4 + 3, 1, arg0 + 3);
                    } else if (var12 == 3) {
                        arg6.method67(98, 1, var14, arg4, 1, arg0 + 3);
                    }
                }
                if (var13 == 2) {
                    if (var12 == 0) {
                        arg6.method107(arg4, var14, (byte) -90, arg0, 4);
                    } else if (var12 == 1) {
                        arg6.method121(arg0, 4, (byte) 23, var14, arg4 + 3);
                    } else if (var12 == 2) {
                        arg6.method107(arg4, var14, (byte) -90, arg0 + 3, 4);
                    } else if (var12 == 3) {
                        arg6.method121(arg0, 4, (byte) 89, var14, arg4);
                    }
                }
            } else {
                class93.method732(false, arg0, arg6, var12, arg4, var11);
            }
        }
        class401 var15 = (class401) class534.method3160(arg3, arg5, arg2, field2426 == null ? (field2426 = method1141("gf")) : field2426);
        if (var15 != null) {
            class486 var16 = class119.field1824.method248(var15.method240(-15578), 30);
            int var17 = var15.method223(-19634) & 0x3;
            int var18 = var15.method222((byte) -117);
            if (var16.field7169 != -1) {
                class93.method732(false, arg0, arg6, var17, arg4, var16);
            } else if (var18 == 9) {
                int var19 = -1118482;
                if (var16.field7230 > 0) {
                    var19 = -1179648;
                }
                if (var17 == 0 || var17 == 2) {
                    arg6.method93(arg4 + 3, arg4, arg0 + 3, var19, arg0, false);
                } else {
                    arg6.method93(arg4 + 3, arg4, arg0, var19, arg0 + 3, false);
                }
            }
        }
        class401 var20 = (class401) class341.method2081(arg3, arg5, arg2);
        if (var20 == null) {
            return;
        }
        class486 var21 = class119.field1824.method248(var20.method240(-15578), 30);
        int var22 = var20.method223(-19634) & 0x3;
        if (var21.field7169 != -1) {
            class93.method732(false, arg0, arg6, var22, arg4, var21);
            return;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)I")
    public static final int method1139(int arg0, byte arg1) {
        field2408++;
        if (arg1 >= -91) {
            return -116;
        }
        int var2 = ((arg0 & 0xAAAAAAAA) >>> 1) + (arg0 & 0x55555555);
        int var3 = (var2 >>> 2 & 0x33333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLgf;)Z")
    public static final boolean method1140(byte arg0, class401 arg1) {
        field2423++;
        class486 var2 = class119.field1824.method248(arg1.method240(-15578), 30);
        int var3 = 119 / ((39 - arg0) / 52);
        if (var2.field7169 == -1) {
            return true;
        } else {
            class409 var4 = class274.field4086.method344((byte) -21, var2.field7169);
            return var4.field6168 == -1 ? true : var4.method2454(0);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1141(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
