import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class18 extends class180 {

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    private int field299 = -32768;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    private int field308 = 0;

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "Z")
    public boolean field320 = false;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "I")
    private int field319 = 0;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    private int field301;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
    public int field304;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "I")
    public int field316;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
    public int field311;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    public int field313;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
    public int field315;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "Lqe;")
    private class51 field300;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "Lub;")
    public static class227 field309 = class257.method1749("Lade Schrifts-=tze )2 ", 17263);

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "Lub;")
    private static class227 field310 = class257.method1749("FULL", 17263);

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "Lub;")
    public static class227 field314 = field310;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "[I")
    public static int[] field317 = new int[100];

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
    public static int field318 = 3353893;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BI)V")
    public final void method83(byte arg0, int arg1) {
        if (arg0 != -26) {
            method86(-96);
        }
        field312++;
        if (this.field320) {
            return;
        }
        this.field319 += arg1;
        while (this.field319 > this.field300.field899[this.field308]) {
            this.field319 -= this.field300.field899[this.field308];
            this.field308++;
            if (this.field300.field910.length <= this.field308) {
                this.field320 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)Lbf;")
    private final class48 method84(int arg0) {
        field307++;
        class145 var2 = class179.method1149(this.field301, -106);
        if (arg0 != -1) {
            return null;
        }
        class48 var3;
        if (this.field320) {
            var3 = var2.method914(arg0 ^ 0xFFFFFF7F, -1);
        } else {
            var3 = var2.method914(arg0 ^ 0xFFFFFF7F, this.field308);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class48 var11 = this.method84(-1);
        field303++;
        if (var11 != null) {
            var11.method85(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field299 = var11.method88();
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
    public static void method86(int arg0) {
        field310 = null;
        field314 = null;
        field317 = null;
        field309 = null;
        if (arg0 >= -103) {
            field310 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V")
    public static final void method87(int arg0, int arg1) {
        class197.field3375.method1727(true, arg0);
        if (arg1 != 0) {
            field317 = null;
        }
        field306++;
        class171.field2866.method1727(true, arg0);
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "()I")
    public final int method88() {
        field305++;
        return this.field299;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(IIIIIII)V")
    public class18(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field301 = arg0;
        this.field304 = arg5 + arg6;
        this.field316 = arg4;
        this.field311 = arg3;
        this.field313 = arg1;
        this.field315 = arg2;
        int var8 = class179.method1149(this.field301, -79).field2501;
        if (var8 == -1) {
            this.field320 = true;
        } else {
            this.field320 = false;
            this.field300 = class25.method127(true, var8);
        }
    }
}
