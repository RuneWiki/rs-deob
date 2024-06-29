import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 {

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field63 = new String[200];

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field62 = -1;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "Lvb;")
    public static class131 field61;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static final void method27(int arg0) {
        if (arg0 >= -116) {
            field63 = null;
        }
        field64++;
        if (class75.field1231 != null || class6.field76 != null) {
            return;
        }
        int var1 = class100.field1717;
        if (!class248.field4074) {
            if (var1 == 1 && class275.field4399 > 0) {
                short var13 = class101.field1788[class275.field4399 - 1];
                if (var13 == 40 || var13 == 48 || var13 == 29 || var13 == 13 || var13 == 25 || var13 == 4 || var13 == 9 || var13 == 44 || var13 == 24 || var13 == 39 || var13 == 46 || var13 == 1007) {
                    int var14 = class60.field1052[class275.field4399 - 1];
                    int var15 = class145.field2477[class275.field4399 - 1];
                    class46 var16 = class108.method760(-29533, var15);
                    class192 var17 = client.method1922(var16);
                    if (var17.method1253(18483) || var17.method1261(124)) {
                        class192.field3111 = false;
                        class170.field2808 = 0;
                        if (class75.field1231 != null) {
                            class79.method516(-373, class75.field1231);
                        }
                        class75.field1231 = class108.method760(-29533, var15);
                        class3.field37 = var14;
                        class59.field1024 = class115.field2069;
                        class178.field2929 = class160.field2668;
                        class79.method516(-373, class75.field1231);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class172.field2823 == 1 && class275.field4399 > 2 || class141.method985(class275.field4399 - 1, (byte) 91))) {
                var1 = 2;
            }
            if (var1 == 2 && class275.field4399 > 0 || class21.field334 == 1) {
                class126.method858((byte) -28);
            }
            if ((var1 != 1 || class275.field4399 <= 0) && class21.field334 != 2) {
                return;
            }
            class241.method1593(false);
            return;
        }
        if (var1 != 1) {
            int var2 = class256.field4182;
            int var3 = class48.field839;
            if (var3 < (class144.field2469 - 10) || var3 > class144.field2469 + class95.field1641 + 10 || var2 < (class22.field340 - 10) || var2 > class22.field340 + class127.field2244 + 10) {
                class248.field4074 = false;
                class264.method1750(class127.field2244, class95.field1641, class144.field2469, class22.field340, (byte) 98);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var4 = class144.field2469;
        int var5 = class22.field340;
        int var6 = class95.field1641;
        int var7 = class115.field2069;
        int var8 = class160.field2668;
        int var9 = -1;
        for (int var10 = 0; var10 < class275.field4399; var10++) {
            if (class60.field1050) {
                int var12 = var5 - (-((class275.field4399 - var10 - 1) * 15) - 33);
                if (var4 < var7 && (var4 + var6) > var7 && var8 > (var12 - 13) && var12 + 3 > var8) {
                    var9 = var10;
                }
            } else {
                int var11 = var5 + ((class275.field4399 - var10 + -1) * 15) + 31;
                if (var4 < var7 && var4 + var6 > var7 && var8 > var11 - 13 && var11 + 3 > var8) {
                    var9 = var10;
                }
            }
        }
        if (var9 != -1) {
            class19.method137(false, var9);
        }
        class248.field4074 = false;
        class264.method1750(class127.field2244, class95.field1641, class144.field2469, class22.field340, (byte) -29);
        return;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLdl;)Z")
    public static final boolean method28(byte arg0, class46 arg1) {
        if (arg0 != 93) {
            method29(-57);
        }
        field60++;
        if (arg1.field777 == 205) {
            class206.field3428 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
    public static void method29(int arg0) {
        field61 = null;
        if (arg0 != -3) {
            field61 = null;
        }
        field63 = null;
    }
}
