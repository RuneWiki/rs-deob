import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public abstract class class517 {

    @OriginalMember(owner = "client!re", name = "b", descriptor = "Lh;")
    public static class571 field7255 = new class571(64);

    @OriginalMember(owner = "client!re", name = "d", descriptor = "[I")
    public static int[] field7257 = new int[32];

    @OriginalMember(owner = "client!re", name = "c", descriptor = "[I")
    public static int[] field7256 = new int[128];

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field7259;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field7254;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field7258;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2983(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7254++;
        int var7 = arg3 - arg5;
        int var8 = arg5 + arg6;
        for (int var9 = arg6; var9 < var8; var9++) {
            class266.method1742(26844, class182.field2580[var9], arg1, arg4, arg2);
        }
        for (int var10 = arg3; var10 > var7; var10--) {
            class266.method1742(26844, class182.field2580[var10], arg1, arg4, arg2);
        }
        int var11 = arg1 - arg5;
        int var12 = arg2 + arg5;
        if (arg0 < 111) {
            field7255 = null;
        }
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class182.field2580[var13];
            class266.method1742(26844, var14, var12, arg4, arg2);
            class266.method1742(26844, var14, arg1, arg4, var11);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)Laca;")
    public abstract class620 method2695(int arg0);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)Z")
    public abstract boolean method2691(int arg0, int arg1);

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
    public static void method2984(int arg0) {
        field7257 = null;
        if (arg0 == 97) {
            field7256 = null;
            field7255 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V")
    public abstract void method2697(int arg0);

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(I)V")
    public abstract void method2698(int arg0);

    static {
        for (int var0 = 0; var0 < field7256.length; var0++) {
            field7256[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field7256[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field7256[var2] = var2 + 26 - 97;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field7256[var3] = var3 + 52 - 48;
        }
        field7256[45] = field7256[47] = 63;
        field7256[42] = field7256[43] = 62;
        new class104("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
        field7259 = 0;
    }
}
