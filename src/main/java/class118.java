import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class118 extends class138 {

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
    private final int field2097;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    private final int field2088;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    private final int field2093;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    private final int field2092;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
    private final int field2094;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
    private final int field2096;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    private final int field2083;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    private final int field2090;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "Lvf;")
    public static class265 field2081 = class87.method582(-46, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "[S")
    public static short[] field2079 = new short[500];

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field2087 = 128;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "Lfl;")
    public static class192 field2080;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "[Lck;")
    public static class201[] field2082;

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2097 = arg5;
        this.field2088 = arg7;
        this.field2093 = arg3;
        this.field2092 = arg2;
        this.field2094 = arg0;
        this.field2096 = arg1;
        this.field2083 = arg4;
        this.field2090 = arg6;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)V")
    public final void method380(int arg0, int arg1, int arg2) {
        ++field2085;
        int var4 = this.field2094 * arg0 >> 12;
        int var5 = this.field2096 * arg2 >> 12;
        if (arg1 == 10) {
            int var6 = this.field2093 * arg2 >> 12;
            int var7 = this.field2092 * arg0 >> 12;
            int var8 = this.field2083 * arg0 >> 12;
            int var9 = this.field2097 * arg2 >> 12;
            int var10 = this.field2090 * arg0 >> 12;
            int var11 = this.field2088 * arg2 >> 12;
            class192.method1324(var11, (byte) 125, var10, var4, var7, var9, var5, var6, var8, super.field2527);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIZ)V")
    public final void method378(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method798(-26, 81);
        }
        ++field2089;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
    public static void method795(int arg0) {
        field2080 = null;
        field2079 = null;
        field2082 = null;
        field2081 = null;
        if (arg0 != 0) {
            field2080 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBI)V")
    public final void method375(int arg0, byte arg1, int arg2) {
        ++field2095;
        if (arg1 >= -21) {
            field2087 = -11;
        }
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V")
    public static final void method796(int arg0) {
        ++field2091;
        if (class25.field695) {
            class6 var1 = class12.method98(class192.field3457, class26.field703, (byte) -124);
            if (var1 != null && var1.field188 != null) {
                class277 var2 = new class277();
                var2.field4883 = var1.field188;
                var2.field4901 = var1;
                class192.method1318(var2, arg0 ^ -223258);
            }
            class25.field695 = false;
            class227.field4033 = -1;
            if (arg0 != -25946) {
                method798(-109, 89);
            }
            class176.method1145((byte) 118, var1);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)Z")
    public static final boolean method797(byte arg0, int arg1) {
        ++field2086;
        if (arg0 >= -35) {
            return true;
        } else {
            return (1 & arg1 >> 28) != 0;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)Lvf;")
    public static final class265 method798(int arg0, int arg1) {
        ++field2099;
        if (arg1 != 1927674668) {
            return null;
        } else {
            return ~class40.field924[arg0].method1808((byte) -15) >= -1 ? class206.field3717[arg0] : class148.method1022(10, new class265[] { class206.field3717[arg0], class210.field3779, class40.field924[arg0] });
        }
    }
}
