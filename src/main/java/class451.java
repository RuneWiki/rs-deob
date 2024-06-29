import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class451 extends class238 {

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "Z")
    public boolean field6231;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "Z")
    public boolean field6233;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "J")
    public long field6235;

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "Ljava/lang/String;")
    public String field6246;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
    public int field6236;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
    public int field6247;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
    public int field6234;

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "I")
    public int field6245;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "I")
    public int field6239;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "Ljava/lang/String;")
    public String field6229;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "I")
    public static int field6238 = 0;

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field6243 = new String[100];

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "Ldk;")
    public static class326 field6230 = new class326("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
    public static int field6232;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "I")
    public static int field6237;

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "I")
    public static int field6242;

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
    public static int field6248;

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "Ltr;")
    public static class176 field6240;

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "Ljava/awt/Font;")
    public static Font field6249;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cj", name = "G", descriptor = "Ljava/lang/Class;")
    public static Class field6250;

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "[Lff;")
    public static class9[] field6241;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIILuj;Luj;)V")
    public static final void method2629(int arg0, int arg1, int arg2, class237 arg3, class237 arg4) {
        class88 var5 = class257.method1605(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field1078 = arg3;
            var5.field1082 = arg4;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIII)Z")
    public static final boolean method2630(int arg0, int arg1, int arg2, int arg3) {
        field6242++;
        class106 var4 = (class106) class50.method320(arg1, arg3, arg0);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class41.method265(var4, 28989);
        }
        class106 var6 = (class106) class231.method1470(arg1, arg3, arg0, field6250 == null ? (field6250 = method2635("gg")) : field6250);
        if (var6 != null) {
            var5 &= class41.method265(var6, 28989);
        }
        class106 var7 = (class106) class149.method941(arg1, arg3, arg0);
        if (var7 != null) {
            var5 &= class41.method265(var7, 28989);
        }
        if (arg2 <= 81) {
            field6230 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILkm;)V")
    public static final void method2631(int arg0, class216 arg1) {
        field6232++;
        if (arg0 != 1721537889) {
            field6237 = -108;
        }
        for (class342 var2 = (class342) class114.field1459.method2843(1123227612); var2 != null; var2 = (class342) class114.field1459.method2842(arg0 ^ 0x5233BEF)) {
            if (var2.field4966 == arg1) {
                if (var2.field4984 != null) {
                    class59.field796.method2561(var2.field4984);
                    var2.field4984 = null;
                }
                var2.method1510((byte) -13);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZB)V")
    public static final void method2632(boolean arg0, byte arg1) {
        if (arg1 >= 93) {
            class161.method1003(arg0, class144.field1900, class244.field3634, class36.field472, (byte) 80);
            field6244++;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIB)I")
    public static final int method2633(int arg0, int arg1, byte arg2) {
        field6248++;
        int var3 = class222.method1425(arg0 + 91923, arg2 ^ 0x1DD3, 4, arg1 + 45365) - (-(class222.method1425(arg0 + 37821, arg2 ^ 0x1DD3, 2, arg1 - -10294) - 128 >> 1) - (class222.method1425(arg0, arg2 + 7475, 1, arg1) - 128 >> 2)) - 128;
        if (arg2 != 88) {
            method2631(97, (class216) null);
        }
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(B)V")
    public static void method2634(byte arg0) {
        field6249 = null;
        field6230 = null;
        field6243 = null;
        field6240 = null;
        field6241 = null;
        if (arg0 <= 43) {
            method2634((byte) -94);
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
    public class451(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field6231 = arg8;
        this.field6233 = arg9;
        this.field6235 = arg5;
        this.field6246 = arg1;
        this.field6236 = arg6;
        this.field6247 = arg4;
        this.field6234 = arg7;
        this.field6245 = arg3;
        this.field6239 = arg2;
        this.field6229 = arg0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2635(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
