import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class196 {

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "[I")
    public static int[] field3186 = new int[5];

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "Z")
    public static boolean field3187 = false;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Llc;")
    public static class86 field3180;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "Llc;")
    public static class86 field3185;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "[I")
    public static int[] field3178;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lv;B)Lvg;")
    public static final class75 method1450(class152 arg0, byte arg1) {
        field3179++;
        if (arg1 <= 101) {
            method1453(-71, (byte[]) null);
        }
        class75 var2 = new class75();
        var2.field1086 = arg0.method1126(false);
        var2.field1084 = class288.method1958(-28264, var2.field1086);
        return var2;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
    public static void method1451(byte arg0) {
        field3178 = null;
        field3180 = null;
        field3186 = null;
        field3185 = null;
        if (arg0 != -51) {
            field3187 = false;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static final void method1452(int arg0) {
        field3188++;
        if (arg0 != 16138) {
            field3184 = -87;
        }
        int var1 = class50.field732.method554(8, -112);
        if (class121.field1772 > var1) {
            for (int var2 = var1; var2 < class121.field1772; var2++) {
                class115.field1668[class88.field1307++] = class207.field3326[var2];
            }
        }
        if (var1 > class121.field1772) {
            throw new RuntimeException("gppov1");
        }
        class121.field1772 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class207.field3326[var3];
            class29 var5 = class92.field1374[var4];
            int var6 = class50.field732.method554(1, arg0 ^ 0xFFFFC0C9);
            if (var6 == 0) {
                class207.field3326[class121.field1772++] = var4;
                var5.field1977 = class264.field4290;
            } else {
                int var7 = class50.field732.method554(2, -68);
                if (var7 == 0) {
                    class207.field3326[class121.field1772++] = var4;
                    var5.field1977 = class264.field4290;
                    class188.field3045[class121.field1773++] = var4;
                } else if (var7 == 1) {
                    class207.field3326[class121.field1772++] = var4;
                    var5.field1977 = class264.field4290;
                    int var8 = class50.field732.method554(3, -67);
                    var5.method924(1, true, var8);
                    int var9 = class50.field732.method554(1, -123);
                    if (var9 == 1) {
                        class188.field3045[class121.field1773++] = var4;
                    }
                } else if (var7 == 2) {
                    class207.field3326[class121.field1772++] = var4;
                    var5.field1977 = class264.field4290;
                    if (class50.field732.method554(1, arg0 ^ 0xFFFFC086) == 1) {
                        int var11 = class50.field732.method554(3, -63);
                        var5.method924(2, true, var11);
                        int var12 = class50.field732.method554(3, -84);
                        var5.method924(2, true, var12);
                    } else {
                        int var10 = class50.field732.method554(3, arg0 - 16216);
                        var5.method924(0, true, var10);
                    }
                    int var13 = class50.field732.method554(1, -69);
                    if (var13 == 1) {
                        class188.field3045[class121.field1773++] = var4;
                    }
                } else if (var7 == 3) {
                    class115.field1668[class88.field1307++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I[B)Z")
    public static final boolean method1453(int arg0, byte[] arg1) {
        field3183++;
        class152 var2 = new class152(arg1);
        int var3 = var2.method1111(255);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method1111(255) == 1;
        if (var4) {
            class159.method1185(-10388, var2);
        }
        if (arg0 == -5) {
            class117.method852(var2, (byte) 126);
            return true;
        } else {
            return false;
        }
    }
}
