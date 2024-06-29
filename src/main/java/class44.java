import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public abstract class class44 extends class81 {

    @OriginalMember(owner = "client!bj", name = "J", descriptor = "I")
    public static int field1035 = 0;

    @OriginalMember(owner = "client!bj", name = "N", descriptor = "Lsg;")
    public static class30 field1038 = class167.method1221((byte) 33, "null");

    @OriginalMember(owner = "client!bj", name = "L", descriptor = "Lsg;")
    private static class30 field1036 = class167.method1221((byte) 33, "Loaded config");

    @OriginalMember(owner = "client!bj", name = "T", descriptor = "Lsg;")
    private static class30 field1044 = class167.method1221((byte) 33, "flash2:");

    @OriginalMember(owner = "client!bj", name = "W", descriptor = "Lsg;")
    public static class30 field1047 = field1036;

    @OriginalMember(owner = "client!bj", name = "I", descriptor = "Lsg;")
    public static class30 field1034 = field1044;

    @OriginalMember(owner = "client!bj", name = "M", descriptor = "Lsg;")
    public static class30 field1037 = field1044;

    @OriginalMember(owner = "client!bj", name = "H", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!bj", name = "O", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!bj", name = "P", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!bj", name = "R", descriptor = "I")
    public int field1042;

    @OriginalMember(owner = "client!bj", name = "S", descriptor = "I")
    public int field1043;

    @OriginalMember(owner = "client!bj", name = "U", descriptor = "I")
    public int field1045;

    @OriginalMember(owner = "client!bj", name = "V", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!bj", name = "X", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!bj", name = "Y", descriptor = "I")
    public int field1049;

    @OriginalMember(owner = "client!bj", name = "Z", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!bj", name = "ab", descriptor = "I")
    public int field1051;

    @OriginalMember(owner = "client!bj", name = "bb", descriptor = "I")
    public int field1052;

    @OriginalMember(owner = "client!bj", name = "Q", descriptor = "[[B")
    public static byte[][] field1041;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(II)V")
    public abstract void method446(int arg0, int arg1);

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIZZ[Ldl;)V")
    public static final void method447(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, class31[] arg5) {
        for (int var6 = 0; var6 < arg5.length; var6++) {
            class31 var7 = arg5[var6];
            if (var7 != null && var7.field798 == arg0) {
                class97.method797(var7, arg2, arg1, arg3, -31014);
                class268.method1839(var7, arg2, arg1, -2398);
                if ((var7.field704 - var7.field728) < var7.field734) {
                    var7.field734 = var7.field704 - var7.field728;
                }
                if (var7.field734 < 0) {
                    var7.field734 = 0;
                }
                if (var7.field736 > (var7.field743 - var7.field670)) {
                    var7.field736 = var7.field743 - var7.field670;
                }
                if (var7.field736 < 0) {
                    var7.field736 = 0;
                }
                if (var7.field655 == 0) {
                    class112.method875((byte) 106, var7, arg3);
                }
            }
        }
        if (arg4) {
            method451((int[][]) null, -90);
        }
        field1048++;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIII)V")
    public abstract void method448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIII)V")
    public abstract void method449(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(II)V")
    public abstract void method450(int arg0, int arg1);

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([[II)V")
    public static final void method451(int[][] arg0, int arg1) {
        field1039++;
        if (arg1 == 0) {
            class121.field2390 = arg0;
        }
    }

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "(I)V")
    public static void method452(int arg0) {
        field1044 = null;
        field1036 = null;
        field1047 = null;
        field1034 = null;
        field1038 = null;
        field1037 = null;
        field1041 = null;
        int var1 = 97 % ((13 - arg0) / 46);
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(III)V")
    public abstract void method453(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIII)V")
    public static final void method454(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1040++;
        class196.field3553.field146 = 0;
        class196.field3553.method76(5305, 9);
        class196.field3553.method76(5305, arg1);
        class196.field3553.method76(5305, arg4);
        class196.field3553.method97(arg2, (byte) -2);
        class196.field3553.method97(arg3, (byte) -2);
        class227.field4065 = -3;
        class119.field2322 = 1;
        class190.field3456 = 0;
        class254.field4493 = arg0;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILaa;)V")
    public static final void method455(int arg0, class8 arg1) {
        field1033++;
        for (int var2 = 0; var2 < class114.field2257; var2++) {
            int var3 = arg1.method45(false);
            int var4 = arg1.method65((byte) 109);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class236.field4223[var3] != null) {
                class236.field4223[var3].field2178 = var4;
            }
        }
        if (arg0 <= 23) {
            method454(23, -116, 38, -115, -59);
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(IIIII)V")
    public abstract void method456(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(IIIII)V")
    public final void method457(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field1045 << 3;
        int var7 = this.field1042 << 3;
        int var8 = (arg4 << 4) + (var7 & 0xF);
        int var9 = (arg1 << 4) + (var6 & 0xF);
        if (arg3 != -10351) {
            this.field1049 = -46;
        }
        this.method448(var6, var7, var9, var8, arg2, arg0);
        field1046++;
    }
}
