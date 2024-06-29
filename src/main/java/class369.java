import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class369 extends class43 {

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
    public int field5032;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    public static int field5029 = 0;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "Lcq;")
    public static class72 field5024 = new class72("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "Lwo;")
    public static class285 field5026;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
    public static void method2324(int arg0) {
        field5026 = null;
        field5024 = null;
        if (arg0 != 7) {
            method2325(-23);
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)V")
    public static final void method2325(int arg0) {
        field5025++;
        class341.field4651 = 0;
        class238.field3146 = 0;
        class265.method1663(false);
        class18.method105((byte) -95);
        class143.method919(true);
        for (int var1 = 0; var1 < class238.field3146; var1++) {
            int var3 = class374.field5062[var1];
            if (class106.field1273 != class220.field2726[var3].field2427) {
                if (class220.field2726[var3].field3971.method1957(true)) {
                    class344.method2192(0, class220.field2726[var3]);
                }
                class220.field2726[var3].method1888((class307) null, arg0 ^ 0xEDCAECB);
                class220.field2726[var3] = null;
            }
        }
        if (class134.field1533 != class215.field2658.field3211) {
            throw new RuntimeException("gnp1 pos:" + class215.field2658.field3211 + " psize:" + class134.field1533);
        }
        if (arg0 != 249343683) {
            method2327(99, true);
        }
        for (int var2 = 0; var2 < class106.field1263; var2++) {
            if (class220.field2726[class437.field5984[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class106.field1263);
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIII)I")
    public static final int method2326(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field5030++;
        if (arg2 == var4) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZ)V")
    public static final void method2327(int arg0, boolean arg1) {
        field5027++;
        int var2 = 111 / ((25 - arg0) / 55);
        byte[][] var3;
        byte var4;
        if (arg1) {
            var3 = class431.field5881;
            var4 = 1;
        } else {
            var3 = class208.field2537;
            var4 = 4;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            class94.method589(-125);
            for (int var6 = 0; var6 < (class22.field232 >> 3); var6++) {
                for (int var7 = 0; var7 < class196.field2329 >> 3; var7++) {
                    int var8 = class225.field2848[var5][var6][var7];
                    if (var8 != -1) {
                        int var9 = (var8 & 0x3B17472) >> 24;
                        if (!arg1 || var9 == 0) {
                            int var10 = (var8 & 0x7) >> 1;
                            int var11 = (var8 & 0xFFD7B7) >> 14;
                            int var12 = (var8 & 0x3FFB) >> 3;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class358.field4867.length; var14++) {
                                if (class358.field4867[var14] == var13 && var3[var14] != null) {
                                    class12.method63(class156.field1815, var9, var6 * 8, var3[var14], false, (var11 & 0x7) * 8, var5, var10, arg1, (var12 & 0x7) * 8, class267.field3454, var7 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
    public class369() {
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(I)V")
    public class369(int arg0) {
        this.field5032 = arg0;
    }

    static {
        new class72("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
    }
}
