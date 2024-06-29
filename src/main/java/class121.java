import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class121 extends class153 {

    @OriginalMember(owner = "client!gf", name = "E", descriptor = "Lke;")
    public class106 field2134;

    @OriginalMember(owner = "client!gf", name = "F", descriptor = "I")
    public static int field2135 = 0;

    @OriginalMember(owner = "client!gf", name = "K", descriptor = "Lpj;")
    public static class237 field2140 = class33.method353("Spieler kann nicht gefunden werden: ", 21);

    @OriginalMember(owner = "client!gf", name = "N", descriptor = "[I")
    public static int[] field2143 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!gf", name = "P", descriptor = "Z")
    public static boolean field2145 = true;

    @OriginalMember(owner = "client!gf", name = "O", descriptor = "I")
    public static int field2144 = -1;

    @OriginalMember(owner = "client!gf", name = "S", descriptor = "Lpj;")
    private static class237 field2148 = class33.method353("K", 96);

    @OriginalMember(owner = "client!gf", name = "H", descriptor = "Lpj;")
    public static class237 field2137 = field2148;

    @OriginalMember(owner = "client!gf", name = "Q", descriptor = "Lpj;")
    public static class237 field2146 = field2148;

    @OriginalMember(owner = "client!gf", name = "R", descriptor = "Lpj;")
    private static class237 field2147 = class33.method353("Members object", 55);

    @OriginalMember(owner = "client!gf", name = "G", descriptor = "Lpj;")
    public static class237 field2136 = field2147;

    @OriginalMember(owner = "client!gf", name = "I", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!gf", name = "J", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!gf", name = "L", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!gf", name = "M", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "(I)V")
    public static void method869(int arg0) {
        if (arg0 != 8) {
            field2147 = null;
        }
        field2146 = null;
        field2147 = null;
        field2137 = null;
        field2143 = null;
        field2140 = null;
        field2136 = null;
        field2148 = null;
    }

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "(I)V")
    public static final void method870(int arg0) {
        field2142++;
        int var1 = class65.field1288.method358(200, 8);
        if (var1 < class258.field4439) {
            for (int var2 = var1; var2 < class258.field4439; var2++) {
                class15.field252[class124.field2179++] = class126.field2202[var2];
            }
        }
        if (class258.field4439 < var1) {
            throw new RuntimeException("gppov1");
        } else if (arg0 <= -5) {
            class258.field4439 = 0;
            for (int var3 = 0; var3 < var1; var3++) {
                int var4 = class126.field2202[var3];
                class271 var5 = class232.field4025[var4];
                int var6 = class65.field1288.method358(200, 1);
                if (var6 == 0) {
                    class126.field2202[class258.field4439++] = var4;
                    var5.field3692 = class241.field4246;
                } else {
                    int var7 = class65.field1288.method358(200, 2);
                    if (var7 == 0) {
                        class126.field2202[class258.field4439++] = var4;
                        var5.field3692 = class241.field4246;
                        class117.field2062[class155.field2752++] = var4;
                    } else if (var7 == 1) {
                        class126.field2202[class258.field4439++] = var4;
                        var5.field3692 = class241.field4246;
                        int var8 = class65.field1288.method358(200, 3);
                        var5.method1442(var8, 0, false);
                        int var9 = class65.field1288.method358(200, 1);
                        if (var9 == 1) {
                            class117.field2062[class155.field2752++] = var4;
                        }
                    } else if (var7 == 2) {
                        class126.field2202[class258.field4439++] = var4;
                        var5.field3692 = class241.field4246;
                        int var10 = class65.field1288.method358(200, 3);
                        var5.method1442(var10, 0, true);
                        int var11 = class65.field1288.method358(200, 3);
                        var5.method1442(var11, 0, true);
                        int var12 = class65.field1288.method358(200, 1);
                        if (var12 == 1) {
                            class117.field2062[class155.field2752++] = var4;
                        }
                    } else if (var7 == 3) {
                        class15.field252[class124.field2179++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lke;)V")
    public class121(class106 arg0) {
        this.field2134 = arg0;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method871(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2138++;
        if (class47.method434(arg2 + 17476, arg3)) {
            if (arg2 != -17476) {
                field2136 = null;
            }
            client.method1044(class22.field406[arg3], -1, arg0, arg7, arg1, arg6, arg5, arg4);
        }
    }
}
