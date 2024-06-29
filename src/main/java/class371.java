import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class371 {

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "Liq;")
    public static class362 field5234;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "Lmm;")
    public class152 field5235;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "Lbk;")
    public class210 field5233;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "Lth;")
    public static class355 field5232;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILtq;Z)Lds;")
    public static final class10 method2362(int arg0, class376 arg1, boolean arg2) {
        if (arg2) {
            field5229 = 33;
        }
        field5231++;
        byte[] var3 = arg1.method2420(arg0, -1);
        return var3 == null ? null : new class10(var3);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)V")
    public static final void method2363(int arg0, int arg1) {
        class300.field4212 = new int[arg1];
        class237.field3367 = new int[arg1];
        class273.field3874 = new int[arg1];
        class18.field206 = new int[arg1];
        class237.field3380 = new int[arg1];
        field5230++;
        if (arg0 != 0) {
            field5229 = 25;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lwl;Z)Z")
    public static final boolean method2364(class233 arg0, boolean arg1) {
        boolean var2 = class399.field5693 == class161.field2122;
        int var3 = 0;
        arg0.method1209(0);
        if (arg0.field3268 < 0 || arg0.field3267 < 0 || arg0.field3275 >= class415.field5953 || arg0.field3271 >= class299.field4190) {
            return false;
        }
        for (int var4 = arg0.field3268; var4 <= arg0.field3275; var4++) {
            for (int var7 = arg0.field3267; var7 <= arg0.field3271; var7++) {
                int var8 = 0;
                if (var4 > arg0.field3268) {
                    var8++;
                }
                if (var4 < arg0.field3275) {
                    var8 += 4;
                }
                if (var7 > arg0.field3267) {
                    var8 += 8;
                }
                if (var7 < arg0.field3271) {
                    var8 += 2;
                }
                class313.method2069(arg0.field3285, var4, var7);
                class193 var9 = class250.field3570[arg0.field3285][var4][var7];
                class250 var10 = class370.method2358(-1, var8, arg0);
                class250 var11 = var9.field2779;
                if (var11 == null) {
                    var9.field2779 = var10;
                } else {
                    while (var11.field3568 != null) {
                        var11 = var11.field3568;
                    }
                    var11.field3568 = var10;
                }
                var9.field2770 = (byte) (var9.field2770 | var8);
                if (var2 && class87.field992[var4][var7] != 0) {
                    var3 = class87.field992[var4][var7];
                }
            }
        }
        if (var2 && var3 != 0) {
            for (int var5 = arg0.field3268; var5 <= arg0.field3275; var5++) {
                for (int var6 = arg0.field3267; var6 <= arg0.field3271; var6++) {
                    if (class87.field992[var5][var6] == 0) {
                        class87.field992[var5][var6] = var3;
                    }
                }
            }
        }
        if (arg1) {
            class97.field1168[class244.field3466++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
    public static void method2365(byte arg0) {
        if (arg0 != -11) {
            field5229 = -109;
        }
        field5232 = null;
        field5234 = null;
    }

    static {
        new class362("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        field5234 = new class362(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");
    }
}
