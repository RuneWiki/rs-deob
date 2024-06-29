import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class80 {

    @OriginalMember(owner = "client!md", name = "a", descriptor = "Lij;")
    public static class50 field1457 = class78.method578(122, "sl_stars");

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public int field1463;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "Lab;")
    public class191 field1465;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "[I")
    public int[] field1459;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "[I")
    public static int[] field1466;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)I")
    public static final int method585(int arg0, int arg1) {
        field1464++;
        return arg0 == -28002 ? arg1 & 0xFF : -20;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IZ)V")
    public static final void method586(int arg0, boolean arg1) {
        field1462++;
        byte[][] var2 = class148.field2548;
        byte var3 = 4;
        for (int var4 = arg0; var4 < var3; var4++) {
            class244.method1665(0);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class76.field1437[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg1 || var8 == 0) {
                            int var9 = (var7 & 0xFFD520) >> 14;
                            int var10 = var7 >> 1 & 0x3;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var9 / 8 << 8) + (var11 / 8);
                            for (int var13 = 0; var13 < class252.field4371.length; var13++) {
                                if (class252.field4371[var13] == var12 && var2[var13] != null) {
                                    class120.method869(var6 * 8, class45.field826, -26, var10, var4, arg1, (var11 & 0x7) * 8, var5 * 8, var8, var2[var13], (var9 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static final void method587(int arg0) {
        field1458++;
        if (class7.field97 != null || class206.field3413 != null) {
            return;
        }
        int var1 = class193.field3200;
        if (arg0 != 15) {
            field1466 = null;
        }
        if (class205.field3406) {
            if (var1 != 1) {
                int var2 = class69.field1297;
                int var3 = class173.field2904;
                if (var2 < (class129.field2267 - 10) || (class244.field4247 + class129.field2267 + 10) < var2 || class231.field3864 - 10 > var3 || class231.field3864 + class70.field1339 + 10 < var3) {
                    class205.field3406 = false;
                    class2.method12(class70.field1339, arg0 ^ 0xFFFFFFA3, class129.field2267, class231.field3864, class244.field4247);
                }
            }
            if (var1 == 1) {
                int var4 = class129.field2267;
                int var5 = class231.field3864;
                int var6 = class56.field1000;
                int var7 = class244.field4247;
                int var8 = class52.field950;
                int var9 = -1;
                for (int var10 = 0; var10 < class136.field2368; var10++) {
                    int var11 = (class136.field2368 - var10 - 1) * 15 + var5 + 31;
                    if (var4 < var6 && var6 < (var4 + var7) && var8 > (var11 - 13) && var11 + 3 > var8) {
                        var9 = var10;
                    }
                }
                if (var9 != -1) {
                    class250.method1695(var9, arg0 - 36);
                }
                class205.field3406 = false;
                class2.method12(class70.field1339, -114, class129.field2267, class231.field3864, class244.field4247);
                return;
            }
            return;
        }
        if (var1 == 1 && class136.field2368 > 0) {
            short var12 = class17.field379[class136.field2368 - 1];
            if (var12 == 36 || var12 == 40 || var12 == 41 || var12 == 31 || var12 == 33 || var12 == 21 || var12 == 51 || var12 == 19 || var12 == 47 || var12 == 4 || var12 == 38 || var12 == 1005) {
                int var13 = class41.field755[class136.field2368 - 1];
                int var14 = class206.field3423[class136.field2368 - 1];
                class10 var15 = class89.method698(var14, (byte) 94);
                if (class206.method1389(-1, client.method605(var15)) || class86.method686(-123, client.method605(var15))) {
                    class82.field1469 = 0;
                    class66.field1271 = false;
                    if (class7.field97 != null) {
                        class140.method979((byte) 85, class7.field97);
                    }
                    class7.field97 = class89.method698(var14, (byte) 94);
                    class258.field4496 = var13;
                    class155.field2699 = class52.field950;
                    class203.field3377 = class56.field1000;
                    class140.method979((byte) 50, class7.field97);
                    return;
                }
            }
        }
        if (var1 == 1 && (class231.field3888 == 1 && class136.field2368 > 2 || class86.method685((byte) -126, class136.field2368 - 1))) {
            var1 = 2;
        }
        if (var1 == 1 && class136.field2368 > 0) {
            class250.method1695(class136.field2368 - 1, arg0 + -50);
        }
        if (var1 != 2 || class136.field2368 <= 0) {
            return;
        }
        class119.method863(-28459);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class206.field3416[arg0][var8][var14] == -class124.field2168) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class245.field4257[arg0][arg1][arg3] + arg5;
            if (!class20.method149(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class20.method149(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class20.method149(var9, var11, var13)) {
                return false;
            } else if (class20.method149(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class56.method439(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class20.method149(var6 + 1, class245.field4257[arg0][arg1][arg3] + arg5, var7 + 1) && class20.method149(var6 + 128 - 1, class245.field4257[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class20.method149(var6 + 128 - 1, class245.field4257[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class20.method149(var6 + 1, class245.field4257[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([Lij;I)Lij;")
    public static final class50 method589(class50[] arg0, int arg1) {
        field1460++;
        if (arg1 != 28743) {
            return null;
        } else if (arg0.length < 2) {
            throw new IllegalArgumentException();
        } else {
            return class45.method344(0, (byte) -106, arg0, arg0.length);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public static void method590(byte arg0) {
        field1466 = null;
        if (arg0 <= 33) {
            field1466 = null;
        }
        field1457 = null;
    }
}
