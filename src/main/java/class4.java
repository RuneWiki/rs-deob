import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class4 extends class102 {

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "I")
    private final int field69;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    private final int field57;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    private final int field63;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    private final int field60;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "Lqk;")
    public static class207 field56 = class24.method212(255, "blinken3:");

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "Lqk;")
    public static class207 field65 = class24.method212(255, ")0");

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "Lqk;")
    public static class207 field64 = class24.method212(255, "Continuer");

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "Lqk;")
    public static class207 field68 = class24.method212(255, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "Z")
    public static boolean field71 = false;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "Lwc;")
    public static class229 field67;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(III)V")
    public final void method22(int arg0, int arg1, int arg2) {
        ++field61;
        if (arg0 != 29635) {
            field65 = null;
        }
        int var4 = this.field63 * arg2 >> 12;
        int var5 = this.field57 * arg2 >> 12;
        int var6 = this.field60 * arg1 >> 12;
        int var7 = this.field69 * arg1 >> 12;
        class14.method82(super.field1844, (byte) 118, var5, var4, var6, var7);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZI)V")
    public final void method23(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field65 = null;
        }
        ++field62;
        int var4 = this.field63 * arg2 >> 12;
        int var5 = this.field57 * arg2 >> 12;
        int var6 = this.field69 * arg0 >> 12;
        int var7 = this.field60 * arg0 >> 12;
        class51.method395(var5, var7, super.field1838, super.field1844, var4, (byte) -83, super.field1834, var6);
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(IIIIIII)V")
    public class4(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field69 = arg1;
        this.field57 = arg0;
        this.field63 = arg2;
        this.field60 = arg3;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BZ)V")
    public static final void method24(byte arg0, boolean arg1) {
        int var2 = 124 / ((19 - arg0) / 50);
        ++field59;
        for (class79 var3 = (class79) class78.field1415.method922((byte) 77); var3 != null; var3 = (class79) class78.field1415.method928(78)) {
            if (var3.field1438 != null) {
                class65.field1177.method661(var3.field1438);
                var3.field1438 = null;
            }
            if (var3.field1434 != null) {
                class65.field1177.method661(var3.field1434);
                var3.field1434 = null;
            }
            var3.method1346((byte) -16);
        }
        if (arg1) {
            for (class79 var4 = (class79) class47.field942.method922((byte) 35); var4 != null; var4 = (class79) class47.field942.method928(116)) {
                if (var4.field1438 != null) {
                    class65.field1177.method661(var4.field1438);
                    var4.field1438 = null;
                }
                var4.method1346((byte) -16);
            }
            for (class79 var5 = (class79) class175.field3168.method1873((byte) 38); var5 != null; var5 = (class79) class175.field3168.method1866((byte) -54)) {
                if (var5.field1438 != null) {
                    class65.field1177.method661(var5.field1438);
                    var5.field1438 = null;
                }
                var5.method1346((byte) -16);
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)V")
    public final void method25(int arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            this.method22(13, -26, -3);
        }
        ++field58;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
    public static void method26(int arg0) {
        int var1 = 99 / ((arg0 - -38) / 59);
        field64 = null;
        field68 = null;
        field67 = null;
        field56 = null;
        field65 = null;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(III)Z")
    public static final boolean method27(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class151.field2643; ++var3) {
            class115 var4 = class79.field1442[var3];
            if (var4.field2004 == 1) {
                int var5 = var4.field1996 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field1978 * var5 >> 8) + var4.field1982;
                    int var7 = (var4.field1985 * var5 >> 8) + var4.field1994;
                    int var8 = (var4.field1988 * var5 >> 8) + var4.field1981;
                    int var9 = (var4.field1990 * var5 >> 8) + var4.field2000;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field2004 == 2) {
                int var10 = arg0 - var4.field1996;
                if (var10 > 0) {
                    int var11 = (var4.field1978 * var10 >> 8) + var4.field1982;
                    int var12 = (var4.field1985 * var10 >> 8) + var4.field1994;
                    int var13 = (var4.field1988 * var10 >> 8) + var4.field1981;
                    int var14 = (var4.field1990 * var10 >> 8) + var4.field2000;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field2004 == 3) {
                int var15 = var4.field1982 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field1999 * var15 >> 8) + var4.field1996;
                    int var17 = (var4.field2005 * var15 >> 8) + var4.field1986;
                    int var18 = (var4.field1988 * var15 >> 8) + var4.field1981;
                    int var19 = (var4.field1990 * var15 >> 8) + var4.field2000;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field2004 == 4) {
                int var20 = arg2 - var4.field1982;
                if (var20 > 0) {
                    int var21 = (var4.field1999 * var20 >> 8) + var4.field1996;
                    int var22 = (var4.field2005 * var20 >> 8) + var4.field1986;
                    int var23 = (var4.field1988 * var20 >> 8) + var4.field1981;
                    int var24 = (var4.field1990 * var20 >> 8) + var4.field2000;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field2004 == 5) {
                int var25 = arg1 - var4.field1981;
                if (var25 > 0) {
                    int var26 = (var4.field1999 * var25 >> 8) + var4.field1996;
                    int var27 = (var4.field2005 * var25 >> 8) + var4.field1986;
                    int var28 = (var4.field1978 * var25 >> 8) + var4.field1982;
                    int var29 = (var4.field1985 * var25 >> 8) + var4.field1994;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
