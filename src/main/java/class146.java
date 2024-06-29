import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class146 extends class181 {

    @OriginalMember(owner = "client!hc", name = "I", descriptor = "I")
    public int field2767 = 0;

    @OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
    public static int field2774 = 0;

    @OriginalMember(owner = "client!hc", name = "Q", descriptor = "I")
    public static int field2775 = 0;

    @OriginalMember(owner = "client!hc", name = "R", descriptor = "Z")
    public static boolean field2776 = false;

    @OriginalMember(owner = "client!hc", name = "J", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!hc", name = "K", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!hc", name = "L", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!hc", name = "O", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!hc", name = "M", descriptor = "Lmh;")
    public static class114 field2771;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIII)V")
    public static final void method1041(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class58 var5 = (class58) class113.field2049.method1375(16259); var5 != null; var5 = (class58) class113.field2049.method1377(arg3 ^ 0xFFFFB3A4)) {
            class197.method1420(arg0, arg1, var5, arg4, -101, arg2);
        }
        for (class58 var6 = (class58) class157.field2979.method1375(16259); var6 != null; var6 = (class58) class157.field2979.method1377(arg3 ^ 0xFFFFB3A4)) {
            byte var10 = 1;
            if (var6.field1012.field2693 == var6.field1012.field2654) {
                var10 = 0;
            } else if (var6.field1012.field2667 == var6.field1012.field2654) {
                var10 = 2;
            }
            if (var6.field1015 != var10) {
                int var11 = class212.method1486(var6.field1012, -106);
                if (var6.field1029 != var11) {
                    if (var6.field1007 != null) {
                        class90.field1744.method802(var6.field1007);
                        var6.field1007 = null;
                    }
                    var6.field1029 = var11;
                }
                var6.field1015 = var10;
            }
            var6.field1032 = var6.field1012.field2694;
            var6.field1009 = var6.field1012.field2694 + (var6.field1012.method1014(-1) * 64);
            var6.field1023 = var6.field1012.field2687;
            var6.field1010 = var6.field1012.field2687 + (var6.field1012.method1014(-1) * 64);
            class197.method1420(arg0, arg1, var6, arg4, arg3 ^ 0xFFFFFF8F, arg2);
        }
        field2772++;
        for (class58 var7 = (class58) class262.field4641.method192(118); var7 != null; var7 = (class58) class262.field4641.method189(0)) {
            byte var8 = 1;
            if (var7.field1024.field2693 == var7.field1024.field2654) {
                var8 = 0;
            } else if (var7.field1024.field2667 == var7.field1024.field2654) {
                var8 = 2;
            }
            if (var7.field1015 != var8) {
                int var9 = class189.method1362(var7.field1024, true);
                if (var7.field1029 != var9) {
                    if (var7.field1007 != null) {
                        class90.field1744.method802(var7.field1007);
                        var7.field1007 = null;
                    }
                    var7.field1029 = var9;
                }
                var7.field1015 = var8;
            }
            var7.field1032 = var7.field1024.field2694;
            var7.field1009 = var7.field1024.field2694 + (var7.field1024.method1014(-1) * 64);
            var7.field1023 = var7.field1024.field2687;
            var7.field1010 = var7.field1024.field2687 + (var7.field1024.method1014(-1) * 64);
            class197.method1420(arg0, arg1, var7, arg4, arg3 - 118, arg2);
        }
        if (arg3 != 2) {
            method1045(-3, 3, 21, (Component) null);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLjd;)V")
    public final void method1042(byte arg0, class118 arg1) {
        field2777++;
        if (arg0 <= 80) {
            method1043(64);
        }
        while (true) {
            int var3 = arg1.method867(false);
            if (var3 == 0) {
                return;
            }
            this.method1046(-17446, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V")
    public static final void method1043(int arg0) {
        field2769++;
        int var1 = class82.field1608.method1843(class157.field2973);
        for (int var2 = arg0; var2 < class127.field2283; var2++) {
            int var6 = class82.field1608.method1843(class269.method1824((byte) 126, var2));
            if (var6 > var1) {
                var1 = var6;
            }
        }
        var1 += 8;
        int var3 = class127.field2283 * 15 + 21;
        int var4 = class48.field792;
        int var5 = class52.field861 - (var1 / 2);
        if (class148.field2796 < (var3 + var4)) {
            var4 = class148.field2796 - var3;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        if ((var1 + var5) > class204.field3738) {
            var5 = class204.field3738 - var1;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class200.field3671 == 1) {
            if (class63.field1100 == class52.field861 && class65.field1131 == class48.field792) {
                class112.field2027 = true;
                class110.field1977 = var1;
                class97.field1815 = class127.field2283 * 15 + (class176.field3218 ? 26 : 22);
                class200.field3671 = 0;
                class90.field1755 = var5;
                class199.field3651 = var4;
            }
        } else if (class52.field861 == class161.field3041 && class6.field136 == class48.field792) {
            class199.field3651 = var4;
            class97.field1815 = class127.field2283 * 15 + (class176.field3218 ? 26 : 22);
            class90.field1755 = var5;
            class200.field3671 = 0;
            class112.field2027 = true;
            class110.field1977 = var1;
        } else {
            class200.field3671 = 1;
            class63.field1100 = class161.field3041;
            class65.field1131 = class6.field136;
        }
    }

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "(I)V")
    public static void method1044(int arg0) {
        if (arg0 < -7) {
            field2771 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIILjava/awt/Component;)Led;")
    public static final class252 method1045(int arg0, int arg1, int arg2, Component arg3) {
        field2768++;
        try {
            Class var4 = Class.forName("wg");
            if (arg0 == 22) {
                class252 var5 = (class252) var4.getDeclaredConstructor().newInstance();
                var5.method276(arg2, arg3, arg0 ^ 0xFFFFFFEB, arg1);
                return var5;
            } else {
                return null;
            }
        } catch (Throwable var7) {
            class45 var6 = new class45();
            var6.method276(arg2, arg3, -3, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IILjd;)V")
    private final void method1046(int arg0, int arg1, class118 arg2) {
        if (arg1 == 2) {
            this.field2767 = arg2.method827(255);
        }
        if (arg0 != -17446) {
            field2776 = true;
        }
        field2770++;
    }
}
