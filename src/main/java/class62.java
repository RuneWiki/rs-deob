import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class62 extends class337 {

    @OriginalMember(owner = "client!ps", name = "x", descriptor = "I")
    public int field944;

    @OriginalMember(owner = "client!ps", name = "o", descriptor = "I")
    public int field935;

    @OriginalMember(owner = "client!ps", name = "q", descriptor = "I")
    public int field937;

    @OriginalMember(owner = "client!ps", name = "u", descriptor = "I")
    public int field941;

    @OriginalMember(owner = "client!ps", name = "r", descriptor = "I")
    public int field938;

    @OriginalMember(owner = "client!ps", name = "y", descriptor = "Z")
    public boolean field945;

    @OriginalMember(owner = "client!ps", name = "t", descriptor = "I")
    public static int field940 = 0;

    @OriginalMember(owner = "client!ps", name = "z", descriptor = "Llt;")
    public static class475 field946 = new class475("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!ps", name = "p", descriptor = "F")
    public static float field936;

    @OriginalMember(owner = "client!ps", name = "s", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!ps", name = "v", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!ps", name = "w", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!ps", name = "B", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!ps", name = "C", descriptor = "Lbd;")
    public static class43 field949;

    @OriginalMember(owner = "client!ps", name = "A", descriptor = "Lf;")
    public static class529 field947;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIIIIIIIII)V", line = 5)
    public static final void method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 == arg6 && arg1 == arg5 && arg7 == arg8 && arg0 == arg9) {
            class385.method2356(arg7, arg1, arg6, arg3, -120, arg0);
        } else {
            int var10 = arg6;
            int var11 = arg1;
            int var12 = arg6 * 3;
            int var13 = arg1 * 3;
            int var14 = arg4 * 3;
            int var15 = arg5 * 3;
            int var16 = arg8 * 3;
            int var17 = arg9 * 3;
            int var18 = arg7 - var16 - (-var14 + arg6);
            int var19 = var15 + arg0 - var17 - arg1;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg6;
                int var34 = arg1 + (var28 + var30 + var32 >> 12);
                class385.method2356(var33, var11, var10, arg3, arg2 - 125, var34);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg2 != 3) {
            method364(3);
        }
        field948++;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V", line = 81)
    public static void method364(int arg0) {
        field947 = null;
        field946 = null;
        field949 = null;
        if (arg0 != -1422875028) {
            field946 = null;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIB)Z", line = 103)
    public static final boolean method365(int arg0, int arg1, byte arg2) {
        if (arg2 != -11) {
            method367(true);
        }
        field942++;
        return (arg1 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)V", line = 114)
    public static final void method366(int arg0, int arg1) {
        field939++;
        class338 var2 = class230.method1580(arg0, -1332166328, arg1);
        var2.method2052(100);
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(IIIIIZ)V", line = 126)
    public class62(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field944 = arg0;
        this.field935 = arg2;
        this.field937 = arg3;
        this.field941 = arg4;
        this.field938 = arg1;
        this.field945 = arg5;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Z)V", line = 146)
    public static final void method367(boolean arg0) {
        field943++;
        if (class357.field5480) {
            class357.field5480 = arg0;
            class464.field6868 = null;
            class403.field6057 = null;
        }
    }
}
