import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class190 {

    @OriginalMember(owner = "client!va", name = "b", descriptor = "Lsd;")
    public static class166 field3618 = class135.method935("auf der Hautpseite)3", 0);

    @OriginalMember(owner = "client!va", name = "f", descriptor = "[I")
    public static int[] field3622 = new int[] { 0, -2, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 4, -1, 0, 2, 0, -2, 0, 7, 5, 4, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, -2, -1, 0, 0, -2, 0, 0, 6, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 2, 0, 6, 0, 1, 5, 0, 10, 0, 0, 0, 0, 0, 0, 0, -2, 8, 0, 0, 4, 0, 0, 0, 0, 3, 6, 0, 0, 6, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 15, 11, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 11, 6, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, -2, 0, 7, 0, 0, 0, 0, 2, 0, -2, 0, 5, 0, 8, 0, 2, 0, 0, 0, 0, 0, -1, 0, -2, 0, 0, 14, -2, 0, 6, 0, 0, 0, 7, 0, 10, 0, 0, 0, 0, 6, 0, 2, 0, 0, 6, 0, 6, -2, 0, 0, 0, 0, 0, -1, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 1, 1, 0, 0, 0, 0, 2, 0, 6, -1, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 20, 0, -2, 12 };

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "[[[B")
    public static byte[][][] field3620;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public static final void method1272(int arg0) {
        field3619++;
        if (arg0 != -10818) {
            return;
        }
        for (int var1 = 0; var1 < class38.field691; var1++) {
            int var10002 = class46.field833[var1]--;
            if (class46.field833[var1] >= -10) {
                class152 var3 = class129.field2536[var1];
                if (var3 == null) {
                    var3 = class152.method1030(class142.field2764, class200.field3974[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class46.field833[var1] += var3.method1028();
                    class129.field2536[var1] = var3;
                }
                if (class46.field833[var1] < 0) {
                    int var10;
                    if (class189.field3584[var1] == 0) {
                        var10 = class151.field2934;
                    } else {
                        int var4 = (class189.field3584[var1] & 0xFF) * 128;
                        int var5 = class189.field3584[var1] >> 16 & 0xFF;
                        int var6 = var5 * 128 + 64 - class41.field728.field3526;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var7 = class189.field3584[var1] >> 8 & 0xFF;
                        int var8 = var7 * 128 + 64 - class41.field728.field3513;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var6 + var8 - 128;
                        if (var4 < var9) {
                            class46.field833[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class57.field1115 / var4;
                    }
                    if (var10 > 0) {
                        class13 var11 = var3.method1029().method78(class140.field2735);
                        class44 var12 = class44.method328(var11, 100, var10);
                        var12.method329(class154.field2970[var1] - 1);
                        class11.field206.method1012(var12);
                    }
                    class46.field833[var1] = -100;
                }
            } else {
                class38.field691--;
                for (int var2 = var1; var2 < class38.field691; var2++) {
                    class200.field3974[var2] = class200.field3974[var2 + 1];
                    class129.field2536[var2] = class129.field2536[var2 + 1];
                    class154.field2970[var2] = class154.field2970[var2 + 1];
                    class46.field833[var2] = class46.field833[var2 + 1];
                    class189.field3584[var2] = class189.field3584[var2 + 1];
                }
                var1--;
            }
        }
        if (class49.field913 && !class143.method977((byte) 90)) {
            if (class79.field1622 != 0 && class185.field3567 != -1) {
                class79.method647(0, false, (byte) 87, class11.field213, class185.field3567, class79.field1622);
            }
            class49.field913 = false;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
    public static void method1273(int arg0) {
        if (arg0 != 0) {
            method1274(false, -116);
        }
        field3618 = null;
        field3620 = null;
        field3622 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)V")
    public static final void method1274(boolean arg0, int arg1) {
        field3621++;
        class121.method872(false);
        class111.field2145++;
        if (class111.field2145 < 50 && !arg0) {
            return;
        }
        class111.field2145 = 0;
        if (arg1 >= -98) {
            field3620 = null;
        }
        if (class16.field278 || class47.field861 == null) {
            return;
        }
        class157.field3000++;
        class156.field2989.method705(118, (byte) 9);
        try {
            class47.field861.method15(class156.field2989.field1000, 0, (byte) -69, class156.field2989.field988);
            class156.field2989.field1000 = 0;
        } catch (IOException var2) {
            class16.field278 = true;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILf;I)[Lkf;")
    public static final class96[] method1275(int arg0, int arg1, class47 arg2, int arg3) {
        if (arg0 != 0) {
            field3620 = null;
        }
        field3617++;
        return class146.method1003(arg1, arg3, arg2, false) ? class12.method73((byte) 106) : null;
    }
}
