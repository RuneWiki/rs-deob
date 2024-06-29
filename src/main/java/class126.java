import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public abstract class class126 extends class28 {

    @OriginalMember(owner = "client!jj", name = "H", descriptor = "Lvf;")
    public static class265 field2250 = class87.method582(-46, "hitmarks");

    @OriginalMember(owner = "client!jj", name = "K", descriptor = "Lvf;")
    public static class265 field2253 = class87.method582(-46, "leuchten2:");

    @OriginalMember(owner = "client!jj", name = "N", descriptor = "Lvf;")
    public static class265 field2256 = class87.method582(-46, ")3");

    @OriginalMember(owner = "client!jj", name = "M", descriptor = "Lvf;")
    public static class265 field2255 = class87.method582(-46, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!jj", name = "O", descriptor = "Lvf;")
    public static class265 field2257 = class87.method582(-46, "Chargement des interfaces )2 ");

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "Lch;")
    public static class117 field2249 = new class117();

    @OriginalMember(owner = "client!jj", name = "T", descriptor = "I")
    public static int field2262 = 0;

    @OriginalMember(owner = "client!jj", name = "S", descriptor = "Ldg;")
    public static class276 field2261 = new class276(50);

    @OriginalMember(owner = "client!jj", name = "I", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!jj", name = "J", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!jj", name = "P", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!jj", name = "Q", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!jj", name = "U", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!jj", name = "R", descriptor = "Lrd;")
    public static class145 field2260;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BIIII)V")
    public static final void method840(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class55.field1133.field2449 = 0;
        class55.field1133.method903((byte) 36, 7);
        field2254++;
        class55.field1133.method903((byte) 36, arg1);
        class55.field1133.method903((byte) 36, arg3);
        class55.field1133.method921(101, arg4);
        class55.field1133.method921(124, arg2);
        int var5 = 3 % ((arg0 + 71) / 33);
        class56.field1146 = 0;
        class277.field4892 = -3;
        class212.field3813 = 0;
        class141.field2626 = 1;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZBLgk;)V")
    public static final void method841(boolean arg0, byte arg1, class6 arg2) {
        int var3 = -42 % ((23 - arg1) / 56);
        int var4 = arg2.field195 == 0 ? arg2.field84 : arg2.field195;
        field2258++;
        int var5 = arg2.field223 == 0 ? arg2.field89 : arg2.field223;
        class147.method1012(class178.field3174[arg2.field219 >> 16], var5, arg2.field219, arg0, var4, (byte) -66);
        if (arg2.field160 != null) {
            class147.method1012(arg2.field160, var5, arg2.field219, arg0, var4, (byte) -55);
        }
        class181 var6 = (class181) class49.field1042.method1842(-1, (long) arg2.field219);
        if (var6 != null) {
            class59.method441(var6.field3217, arg0, var5, var4, 0);
        }
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(I)Z")
    public abstract boolean method337(int arg0);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public abstract Object method341(boolean arg0);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)I")
    public static final int method842(int arg0, int arg1) {
        if (arg0 != 32008) {
            field2255 = null;
        }
        field2252++;
        return (arg1 & 0x1EB758) >> 18;
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(I)V")
    public static void method843(int arg0) {
        field2256 = null;
        if (arg0 != -1563050798) {
            method841(false, (byte) 118, (class6) null);
        }
        field2253 = null;
        field2255 = null;
        field2249 = null;
        field2260 = null;
        field2250 = null;
        field2261 = null;
        field2257 = null;
    }
}
