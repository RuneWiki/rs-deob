import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class142 extends class179 {

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "Lsk;")
    public static class423 field2309 = new class423("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "I")
    public static int field2311 = -1;

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "[I")
    public static int[] field2310 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public int field2291;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public int field2293;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public int field2294;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public int field2295;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public int field2296;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public int field2297;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    public int field2298;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public int field2299;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    public int field2300;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    public int field2301;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
    public int field2302;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    public int field2303;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
    public int field2304;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "I")
    public int field2307;

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "I")
    public int field2308;

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "Lig;")
    public static class154 field2313;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "Lll;")
    public static class235 field2312;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qb", name = "H", descriptor = "Ljava/lang/Class;")
    public static Class field2314;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method939(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZLqq;I)Lcd;", line = 4)
    public final class198 method936(boolean arg0, class318 arg1, int arg2) {
        field2292++;
        int var4 = class369.field5422[this.field2303];
        if (arg0) {
            this.field2298 = 28;
        }
        if (var4 == 0) {
            class455 var5 = class307.method1842(this.field2297, this.field2295, this.field2300);
            if (var5 instanceof class220) {
                class220 var6 = (class220) var5;
                if (var6.field3378 != null) {
                    return ((class185) var6.field3378).method167(arg1, false, arg2);
                }
            }
        } else if (var4 == 1) {
            class431 var11 = class98.method741(this.field2297, this.field2295, this.field2300);
            if (var11 instanceof class175) {
                class175 var12 = (class175) var11;
                if (var12.field2745 != null) {
                    return ((class185) var12.field2745).method167(arg1, false, arg2);
                }
            }
        } else if (var4 == 2) {
            class205 var9 = class86.method607(this.field2297, this.field2295, this.field2300, field2314 == null ? (field2314 = method939("tf")) : field2314);
            if (var9 instanceof class290) {
                class290 var10 = (class290) var9;
                if (var10.field4385 != null) {
                    return ((class185) var10.field4385).method167(arg1, false, arg2);
                }
            }
        } else if (var4 == 3) {
            class376 var7 = class368.method2232(this.field2297, this.field2295, this.field2300);
            if (var7 instanceof class31) {
                class31 var8 = (class31) var7;
                if (var8.field413 != null) {
                    return ((class185) var8.field413).method167(arg1, false, arg2);
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V", line = 87)
    public static void method937(int arg0) {
        field2313 = null;
        field2312 = null;
        if (arg0 != 2) {
            method937(13);
        }
        field2309 = null;
        field2310 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Llt;I)I", line = 119)
    public static final int method938(class458 arg0, int arg1) {
        if (arg1 != 31882) {
            method938(null, -117);
        }
        field2305++;
        int var2 = 0;
        if (arg0.method2729(class382.field5563, arg1 ^ 0xFFFFA02B)) {
            var2++;
        }
        if (arg0.method2729(class183.field2915, -9055)) {
            var2++;
        }
        if (arg0.method2729(class376.field5489, arg1 - 40937)) {
            var2++;
        }
        if (arg0.method2729(class220.field3392, -9055)) {
            var2++;
        }
        if (arg0.method2729(class50.field761, -9055)) {
            var2++;
        }
        if (arg0.method2729(class237.field3589, arg1 - 40937)) {
            var2++;
        }
        if (arg0.method2729(class35.field491, -9055)) {
            var2++;
        }
        if (arg0.method2729(class78.field1389, arg1 - 40937)) {
            var2++;
        }
        if (arg0.method2729(class341.field5093, -9055)) {
            var2++;
        }
        if (arg0.method2729(class420.field6039, -9055)) {
            var2++;
        }
        if (arg0.method2729(class63.field1048, -9055)) {
            var2++;
        }
        if (arg0.method2729(class161.field2526, -9055)) {
            var2++;
        }
        if (arg0.method2729(class75.field1349, -9055)) {
            var2++;
        }
        if (arg0.method2729(class446.field6868, -9055)) {
            var2++;
        }
        if (arg0.method2729(class40.field570, -9055)) {
            var2++;
        }
        if (arg0.method2729(class284.field4303, -9055)) {
            var2++;
        }
        return var2;
    }
}
