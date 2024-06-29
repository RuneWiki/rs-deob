import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class314 {

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "Ldk;")
    public static class326 field4439 = new class326("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "Lug;")
    public static class363 field4442;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "Lvc;")
    public static class190 field4438;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V")
    public static final void method1942(int arg0, int arg1, int arg2, int arg3) {
        int var4 = field4438.field5794 * arg1 >> 8;
        field4436++;
        if (arg2 <= 68) {
            field4439 = null;
        }
        if (var4 != 0 && arg0 != -1) {
            class273.method1674(var4, class157.field2337, 122, arg0, false, 0);
            class420.field5875 = true;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method1943(int arg0) {
        field4438 = null;
        field4442 = null;
        if (arg0 == -23420) {
            field4439 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lb;BLnp;)V")
    public static final void method1944(class201 arg0, byte arg1, class313 arg2) {
        field4440++;
        class72[] var3 = class72.method432(arg0, class257.field3764, 0);
        class134.field1751 = new class176[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class134.field1751[var4] = arg2.method644(var3[var4], true);
        }
        class72[] var5 = class72.method432(arg0, class467.field6580, 0);
        class218.field3264 = new class176[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class218.field3264[var6] = arg2.method644(var5[var6], true);
        }
        class72[] var7 = class72.method432(arg0, class236.field3548, 0);
        class80.field983 = new class176[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class80.field983[var8] = arg2.method644(var7[var8], true);
        }
        if (arg1 < 119) {
            field4439 = null;
        }
        class72[] var9 = class72.method432(arg0, class258.field3789, 0);
        class115.field1467 = new class176[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class115.field1467[var10] = arg2.method644(var9[var10], true);
        }
        class72[] var11 = class72.method432(arg0, class329.field4758, 0);
        class295.field4276 = new class176[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class295.field4276[var12] = arg2.method644(var11[var12], true);
        }
        class72[] var13 = class72.method432(arg0, class15.field180, 0);
        class375.field5397 = new class176[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class375.field5397[var14] = arg2.method644(var13[var14], true);
        }
        class72[] var15 = class72.method432(arg0, class124.field1560, 0);
        class280.field4126 = new class176[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class280.field4126[var16] = arg2.method644(var15[var16], true);
        }
        class72[] var17 = class72.method432(arg0, class222.field3380, 0);
        class231.field3496 = new class176[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class231.field3496[var18] = arg2.method644(var17[var18], true);
        }
        class72[] var19 = class72.method432(arg0, class124.field1564, 0);
        class273.field3976 = new class176[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class273.field3976[var20] = arg2.method644(var19[var20], true);
        }
        class72[] var21 = class72.method432(arg0, class171.field2492, 0);
        class311.field4397 = new class176[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class311.field4397[var22] = arg2.method644(var21[var22], true);
        }
        class72[] var23 = class72.method432(arg0, class293.field4251, 0);
        class333.field4844 = new class176[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class333.field4844[var24] = arg2.method644(var23[var24], true);
        }
        class72[] var25 = class72.method432(arg0, class306.field4361, 0);
        class243.field3627 = new class176[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class243.field3627[var26] = arg2.method644(var25[var26], true);
        }
        class214.field3217 = arg2.method644(class72.method423(arg0, class238.field3577, 0), true);
        class190.field2816 = arg2.method644(class72.method423(arg0, class37.field481, 0), true);
        class72[] var27 = class72.method432(arg0, class144.field1903, 0);
        class306.field4362 = new class176[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class306.field4362[var28] = arg2.method644(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZZLmj;Ljava/lang/String;)V")
    public static final void method1945(int arg0, boolean arg1, boolean arg2, class430 arg3, String arg4) {
        field4437++;
        if (arg0 < 125) {
            method1942(108, 30, -16, -13);
        }
        if (!arg1) {
            class491.method2880(arg3, 3, arg4, -4);
            return;
        }
        if (class430.field6011.startsWith("win") && class430.field6023 != 3) {
            String var5 = null;
            if (arg3.field6021 != null) {
                var5 = arg3.field6021.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class366 var6 = class491.method2880(arg3, 0, arg4, -4);
                class277.field4085 = arg4;
                class277.field4076 = arg3;
                class164.field2427 = var6;
                return;
            }
        }
        if (class430.field6011.startsWith("mac")) {
            String var7 = null;
            if (arg3.field6021 != null) {
                var7 = arg3.field6021.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg2) {
                class491.method2880(arg3, 1, arg4, -4);
                return;
            }
        }
        class491.method2880(arg3, 2, arg4, -4);
    }

    static {
        new class326("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        field4442 = class458.method2681((byte) -80);
    }
}
