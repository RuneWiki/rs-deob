import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class366 extends class425 {

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field5231 = new String[200];

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "Lpm;")
    public static class349 field5238 = new class349("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "Z")
    public static boolean field5240 = false;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "J")
    public long field5232;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "Lvj;")
    public static class256 field5235;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "Lwa;")
    public class366 field5229;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "Lwa;")
    public class366 field5237;

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "[[[I")
    public static int[][][] field5241;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)Z")
    public final boolean method2361(boolean arg0) {
        field5230++;
        if (this.field5237 == null) {
            return false;
        } else {
            if (arg0) {
                field5238 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static void method2362(int arg0) {
        field5231 = null;
        field5241 = null;
        field5238 = null;
        field5235 = null;
        if (arg0 != -1) {
            method2362(47);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIII)I")
    public static final int method2363(int arg0, int arg1, int arg2, int arg3) {
        field5236++;
        int var4 = arg0 / arg3;
        int var5 = arg3 - 1 & arg0;
        if (arg1 >= -70) {
            method2363(-102, -36, -86, 106);
        }
        int var6 = arg2 / arg3;
        int var7 = arg2 & arg3 - 1;
        int var8 = class25.method134(var4, (byte) 102, var6);
        int var9 = class25.method134(var4 + 1, (byte) 102, var6);
        int var10 = class25.method134(var4, (byte) 102, var6 + 1);
        int var11 = class25.method134(var4 + 1, (byte) 102, var6 + 1);
        int var12 = class311.method2080(var8, var9, var5, (byte) 46, arg3);
        int var13 = class311.method2080(var10, var11, var5, (byte) 46, arg3);
        return class311.method2080(var12, var13, var7, (byte) 46, arg3);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ltj;ZLtj;Ltj;)V")
    public static final void method2364(class108 arg0, boolean arg1, class108 arg2, class108 arg3) {
        class393.field5532 = arg0;
        field5233++;
        class241.method1645(arg1, arg3, arg2);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(Z)V")
    public final void method2365(boolean arg0) {
        if (!arg0) {
            field5240 = false;
        }
        field5234++;
        if (this.field5237 != null) {
            this.field5237.field5229 = this.field5229;
            this.field5229.field5237 = this.field5237;
            this.field5237 = null;
            this.field5229 = null;
        }
    }
}
