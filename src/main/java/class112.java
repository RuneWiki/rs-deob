import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class112 {

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "Lsb;")
    public static class98 field1988 = class47.method368(" x ", 0);

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field1995 = 0;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "[Lsb;")
    public static class98[] field1994 = new class98[500];

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "Lsb;")
    private static class98 field1997 = class47.method368("Loading config )2 ", 0);

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "Lsb;")
    public static class98 field1985 = field1997;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public static int field1998 = 0;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "Llj;")
    public static class216 field1991;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "[I")
    public static int[] field1990;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public static final void method840(int arg0) {
        field1993++;
        Object var1 = class265.field4634;
        synchronized (class265.field4634) {
            if (class134.field2368 != 0) {
                class134.field2368 = 1;
                try {
                    class265.field4634.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        if (arg0 != -31640) {
            method841(-16);
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
    public static final void method841(int arg0) {
        if (arg0 != 0) {
            field1997 = null;
        }
        class164.field2952.method1565(-1);
        field1992++;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method842(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1996++;
        int var8 = class47.method369(2, arg7, class116.field2077, class215.field3666);
        int var9 = class47.method369(2, arg2, class116.field2077, class215.field3666);
        int var10 = class47.method369(2, arg3, class229.field3933, class106.field1899);
        int var11 = class47.method369(2, arg6, class229.field3933, class106.field1899);
        int var12 = class47.method369(2, arg7 + arg1, class116.field2077, class215.field3666);
        int var13 = class47.method369(2, arg2 - arg1, class116.field2077, class215.field3666);
        for (int var14 = var8; var14 < var12; var14++) {
            class37.method305(-7, class43.field721[var14], var11, arg0, var10);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class37.method305(-7, class43.field721[var15], var11, arg0, var10);
        }
        int var16 = class47.method369(2, arg1 + arg3, class229.field3933, class106.field1899);
        int var17 = class47.method369(2, arg6 - arg1, class229.field3933, class106.field1899);
        if (arg4 >= -83) {
            field1990 = null;
        }
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class43.field721[var18];
            class37.method305(-7, var19, var16, arg0, var10);
            class37.method305(-7, var19, var17, arg5, var16);
            class37.method305(-7, var19, var11, arg0, var17);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILtg;II)[Lnj;")
    public static final class82[] method843(int arg0, class75 arg1, int arg2, int arg3) {
        field1987++;
        if (class43.method341(arg1, -1, arg3, arg0)) {
            return arg2 <= 3 ? null : class87.method651((byte) -80);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)V")
    public static final void method844(int arg0, int arg1, int arg2) {
        field1989++;
        if (arg2 != 1) {
            field1990 = null;
        }
        class191 var3 = class163.method1177(arg0, 20913);
        int var4 = var3.field3314;
        int var5 = var3.field3310;
        int var6 = class85.field1489[var4 - var5];
        if (arg1 < 0 || var6 < arg1) {
            arg1 = 0;
        }
        int var7 = var6 << var5;
        int var8 = var3.field3303;
        class111.method839(class68.field1086[var8] & ~var7 | arg1 << var5 & var7, 0, var8);
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
    public static void method845(int arg0) {
        field1990 = null;
        field1991 = null;
        if (arg0 >= -72) {
            method842(-71, 14, -120, 81, -55, -105, 91, -79);
        }
        field1988 = null;
        field1997 = null;
        field1994 = null;
        field1985 = null;
    }
}
