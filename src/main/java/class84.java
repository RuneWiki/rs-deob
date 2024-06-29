import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class84 {

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "J")
    public static long field1975 = 0L;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Lec;")
    public static class32 field1970 = class73.method594("::fpson", true);

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "[S")
    public static short[] field1978 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "Lec;")
    public static class32 field1971 = class73.method594("null", true);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
    public static void method655(byte arg0) {
        field1978 = null;
        field1970 = null;
        if (arg0 > -35) {
            field1975 = 14L;
        }
        field1971 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([Lec;IIB)Lec;")
    public static final class32 method656(class32[] arg0, int arg1, int arg2, byte arg3) {
        field1977++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg0[arg2 + var5] == null) {
                arg0[arg2 + var5] = class26.field479;
            }
            var4 += arg0[arg2 + var5].field674;
        }
        byte[] var6 = new byte[var4];
        if (arg3 > -123) {
            method656(null, 30, -93, (byte) -103);
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg1; var8++) {
            class32 var10 = arg0[arg2 + var8];
            class60.method458(var10.field618, 0, var6, var7, var10.field674);
            var7 += var10.field674;
        }
        class32 var9 = new class32();
        var9.field674 = var4;
        var9.field618 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method657(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1973++;
        if (class28.method192(arg3, -18020)) {
            class98.field2255 = null;
            class125.method981(1, arg6, arg4, class79.field1826[arg3], -1, arg2, arg8, arg5, arg0, arg7);
            if (class98.field2255 != null) {
                class125.method981(1, arg6, arg4, class98.field2255, -1412584499, class68.field1604, field1969, arg5, arg0, arg7);
                class98.field2255 = null;
            }
            if (arg1 != -101) {
                method657(-82, 72, -44, 59, 115, 101, -120, -122, -123);
            }
        } else if (arg5 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class145.field3299[var9] = true;
            }
        } else {
            class145.field3299[arg5] = true;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lf;I)Z")
    public static final boolean method658(class36 arg0, int arg1) {
        field1972++;
        if (arg0.field779 == null) {
            return false;
        }
        int var2 = 0;
        if (arg1 <= 46) {
            field1969 = 22;
        }
        while (var2 < arg0.field779.length) {
            int var3 = class157.method1220((byte) 23, arg0, var2);
            int var4 = arg0.field786[var2];
            if (arg0.field779[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg0.field779[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg0.field779[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
            var2++;
        }
        return true;
    }
}
