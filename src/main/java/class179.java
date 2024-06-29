import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class179 extends class152 {

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "Lwh;")
    public class106 field3248;

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "Lhh;")
    public static class163 field3251 = class137.method1065("not yet implemented", 17);

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "Lhh;")
    public static class163 field3253 = class137.method1065("scrollbar", 17);

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "Lhh;")
    public static class163 field3254 = class137.method1065("hint_headicons", 17);

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)V")
    public static void method1317(int arg0) {
        field3251 = null;
        field3254 = null;
        if (arg0 != 63) {
            field3254 = null;
        }
        field3253 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lpg;Z)V")
    public static final void method1318(class81 arg0, boolean arg1) {
        if (!arg1) {
            method1317(117);
        }
        field3252++;
        while (true) {
            while (arg0.field1562.length > arg0.field1541) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method622(true) == 1) {
                    var2 = true;
                    var3 = arg0.method622(true);
                    var4 = arg0.method622(true);
                }
                int var5 = arg0.method622(true);
                int var6 = arg0.method622(true);
                int var7 = var5 * 64 - class54.field892;
                int var8 = class218.field3965 + (class58.field952 - 1) - var6 * 64;
                if (var7 >= 0 && (var8 - 63) >= 0 && class124.field2395 > var7 + 63 && class58.field952 > var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var3 * 8 <= var11 && var11 < (var3 * 8 + 8) && var12 >= (var4 * 8) && var12 < (var4 * 8 + 8)) {
                                byte var13 = arg0.method635(-65);
                                if (var13 != 0) {
                                    if (class38.field633[var9][var10] == null) {
                                        class38.field633[var9][var10] = new byte[4096];
                                    }
                                    class38.field633[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method635(-56);
                                    if (class151.field2828[var9][var10] == null) {
                                        class151.field2828[var9][var10] = new byte[4096];
                                    }
                                    class151.field2828[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method635(-34);
                        if (var16 != 0) {
                            arg0.field1541++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lwh;)V")
    public class179(class106 arg0) {
        this.field3248 = arg0;
    }
}
