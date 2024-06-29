import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class128 extends class390 {

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public int field1795;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    public int field1803;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "Z")
    public boolean field1798;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public int field1797;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public int field1796;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public int field1793;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "Z")
    public static boolean field1791 = false;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "[[I")
    public static int[][] field1802 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "Z")
    public static boolean field1806;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "F")
    public static float field1799;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "Z")
    public static boolean field1804;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "[I")
    public static int[] field1805;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method875(int arg0, String arg1) {
        field1800++;
        int var2 = arg1.length();
        int var3 = 0;
        if (arg0 != -1) {
            return null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)V")
    public static void method876(byte arg0) {
        field1805 = null;
        field1802 = null;
        if (arg0 < 76) {
            method876((byte) 25);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I[Lsg;)V")
    public static final void method877(int arg0, class226[] arg1) {
        field1792++;
        class29.field488 = arg1.length;
        class157.field2217 = new int[class29.field488 + 10];
        class305.field4210 = new class226[class29.field488 + 10];
        class36.method343(arg1, 0, class305.field4210, 0, class29.field488);
        if (arg0 <= 2) {
            return;
        }
        for (int var2 = 0; var2 < class29.field488; var2++) {
            class157.field2217[var2] = class305.field4210[var2].method596();
        }
        for (int var3 = class29.field488; var3 < class305.field4210.length; var3++) {
            class157.field2217[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIIIIIIIZ)Z")
    public static final boolean method878(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        field1801++;
        int var11 = class420.method2639(arg10, class59.field813, class412.field5841.method942(false), class145.field2064, arg2, arg0, arg5, arg9, arg1, arg4, arg3, 48, arg7, arg6, class426.field5999[class142.field2034]);
        if (var11 < 1) {
            return false;
        }
        class50.field697 = class145.field2064[var11 - 1];
        class251.field3547 = class59.field813[arg8 + var11];
        class376.field5371 = false;
        class280.method1827(true);
        return true;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(IIIIIZ)V")
    public class128(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field1795 = arg4;
        this.field1803 = arg2;
        this.field1798 = arg5;
        this.field1797 = arg0;
        this.field1796 = arg3;
        this.field1793 = arg1;
    }

    static {
        new class442("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
        field1806 = true;
    }
}
