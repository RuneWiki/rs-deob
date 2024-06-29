import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class315 extends class60 {

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
    public static int field4971 = 0;

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "I")
    public static int field4974 = 0;

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "I")
    public static int field4973 = 0;

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "Z")
    public static boolean field4977 = false;

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "B")
    public byte field4972;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "I")
    public int field4978;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "Ljava/awt/Image;")
    public static Image field4969;

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "Ljava/lang/String;")
    public String field4976;

    @OriginalMember(owner = "client!qh", name = "A", descriptor = "Ljava/lang/String;")
    public String field4979;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V", line = 7)
    public static final void method2225(int arg0) {
        field4967++;
        if (arg0 != 128) {
            return;
        }
        while (true) {
            class83 var1;
            class294 var3;
            do {
                var1 = (class83) class146.field2361.method275(arg0 ^ 0xFFFFFF7F);
                if (var1 == null) {
                    return;
                }
                if (var1.field1293 < 0) {
                    int var2 = -var1.field1293 - 1;
                    if (class75.field1146 == var2) {
                        var3 = class345.field5363;
                    } else {
                        var3 = class74.field1140[var2];
                    }
                } else {
                    int var4 = var1.field1293 - 1;
                    var3 = class197.field3029[var4];
                }
            } while (var3 == null);
            class101 var5 = class288.method2025(var1.field1286, -1);
            int var6;
            int var7;
            if (var1.field1300 == 1 || var1.field1300 == 3) {
                var6 = var5.field1623;
                var7 = var5.field1626;
            } else {
                var6 = var5.field1626;
                var7 = var5.field1623;
            }
            if (class75.field1153 < 3) {
            }
            int var8 = (var6 >> 1) + var1.field1299;
            int var9 = (var6 + 1 >> 1) + var1.field1299;
            int var10 = (var7 >> 1) + var1.field1282;
            int var11 = var1.field1282 + (var7 + 1 >> 1);
            int[][] var12 = class85.field1374[class75.field1153];
            int var13 = var12[var8][var10] + var12[var9][var10] + var12[var8][var11] + var12[var9][var11] >> 2;
            class179 var14 = null;
            int var15 = class113.field1830[var1.field1283];
            if (var15 == 0) {
                class105 var16 = class155.method1157(class75.field1153, var1.field1299, var1.field1282);
                if (var16 != null) {
                    var14 = var16.field1723;
                }
            } else if (var15 == 1) {
                class293 var19 = class1.method38(class75.field1153, var1.field1299, var1.field1282);
                if (var19 != null) {
                    var14 = var19.field4593;
                }
            } else if (var15 == 2) {
                class144 var18 = class36.method321(class75.field1153, var1.field1299, var1.field1282);
                if (var18 != null) {
                    var14 = var18.field2346;
                }
            } else if (var15 == 3) {
                class241 var17 = class241.method1705(class75.field1153, var1.field1299, var1.field1282);
                if (var17 != null) {
                    var14 = var17.field3609;
                }
            }
            if (var14 != null) {
                class128.method999(class75.field1153, var1.field1299, var15, var1.field1296 + 1, -1, 0, 0, var1.field1297 + 1, var1.field1282, (byte) -64);
                var3.field4711 = var14;
                var3.field4618 = class307.field4869 + var1.field1296;
                var3.field4665 = var1.field1282 * 128 + var7 * 64;
                var3.field4661 = var1.field1297 + class307.field4869;
                var3.field4642 = var1.field1299 * 128 + var6 * 64;
                int var20 = var1.field1292;
                int var21 = var1.field1301;
                int var22 = var1.field1289;
                if (var20 > var21) {
                    int var23 = var20;
                    var20 = var21;
                    var21 = var23;
                }
                var3.field4662 = var1.field1299 + var20;
                int var24 = var1.field1291;
                var3.field4696 = var1.field1299 + var21;
                var3.field4710 = var13;
                if (var22 > var24) {
                    int var25 = var22;
                    var22 = var24;
                    var24 = var25;
                }
                var3.field4624 = var1.field1282 + var22;
                var3.field4629 = var1.field1282 + var24;
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILtk;)Ltk;", line = 180)
    public static final class266 method2226(int arg0, class266 arg1) {
        field4966++;
        if (arg1.field3926 != -1) {
            return class171.method1276(arg1.field3926, (byte) 68);
        }
        int var2 = arg1.field4088 >>> 16;
        if (arg0 != -1) {
            field4971 = 120;
        }
        class167 var3 = new class167(class158.field2584);
        for (class24 var4 = (class24) var3.method1246(arg0 ^ 0xFFFFFF8F); var4 != null; var4 = (class24) var3.method1245(true)) {
            if (var4.field417 == var2) {
                return class171.method1276((int) var4.field879, (byte) 78);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V", line = 214)
    public static void method2227(int arg0) {
        field4969 = null;
        if (arg0 != -1) {
            field4971 = 37;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)I", line = 230)
    public static final int method2228(int arg0, byte arg1) {
        int var2 = -29 % ((arg1 - 49) / 43);
        field4970++;
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIB)I", line = 251)
    public static final int method2229(int arg0, int arg1, byte arg2) {
        field4975++;
        class307 var3 = (class307) class340.field5253.method79((long) arg1, (byte) 0);
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && var3.field4871.length > arg0) {
            return arg2 == 35 ? var3.field4871[arg0] : -40;
        } else {
            return -1;
        }
    }
}
