import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class59 {

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public int field907 = 16777215;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public int field910 = 8;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "Ljava/lang/String;")
    public static String field904 = null;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Ljava/lang/String;")
    public static String field896 = "Please remove ";

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public int field897;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public int field900;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public int field901;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public int field905;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public int field911;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "Z")
    public boolean field908;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lma;II)V")
    public final void method366(class202 arg0, int arg1, int arg2) {
        field899++;
        if (arg1 != -3) {
            field898 = 56;
        }
        while (true) {
            int var4 = arg0.method1420((byte) 0);
            if (var4 == 0) {
                return;
            }
            this.method370((byte) 127, var4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)[Lea;")
    public static final class38[] method367(boolean arg0) {
        field902++;
        class38[] var1 = new class38[class230.field3697];
        int var2 = 0;
        if (arg0) {
            return null;
        }
        while (var2 < class230.field3697) {
            int var3 = class263.field4341[var2] * class184.field2854[var2];
            byte[] var4 = class56.field758[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class12.field157[class10.method53(var4[var6], 255)];
            }
            var1[var2] = new class38(class196.field3118, class268.field4396, class239.field3781[var2], class272.field4457[var2], class184.field2854[var2], class263.field4341[var2], var5);
            var2++;
        }
        class270.method1856(91);
        return var1;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIIBI)Z")
    public static final boolean method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field906++;
        if (arg7 > -96) {
            method367(true);
        }
        if ((arg0 + arg8) > arg5 && arg1 + arg5 > arg0) {
            return arg3 < arg2 + arg6 && arg3 + arg4 > arg2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static void method369(int arg0) {
        if (arg0 != 6) {
            method367(false);
        }
        field896 = null;
        field904 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BIILma;)V")
    private final void method370(byte arg0, int arg1, int arg2, class202 arg3) {
        if (arg0 != 127) {
            method369(18);
        }
        if (arg1 == 1) {
            this.field910 = arg3.method1419(arg0 - 10);
        } else if (arg1 == 2) {
            this.field908 = true;
        } else if (arg1 == 3) {
            this.field901 = arg3.method1442(-1970239824);
            this.field900 = arg3.method1442(-1970239824);
            this.field911 = arg3.method1442(arg0 - 1970239951);
        } else if (arg1 == 4) {
            this.field905 = arg3.method1420((byte) 0);
        } else if (arg1 == 5) {
            this.field897 = arg3.method1419(127);
        } else if (arg1 == 6) {
            this.field907 = arg3.method1401((byte) -99);
        }
        field909++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method371(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field903++;
        if (arg1 > -123) {
            field898 = 42;
        }
        if (class53.field711 <= arg6 && arg2 <= class87.field1356 && arg0 >= class63.field941 && class75.field1180 >= arg3) {
            class168.method1113(arg6, arg4, (byte) 100, arg0, arg5, arg3, arg7, arg2);
        } else {
            class87.method575(arg5, arg2, (byte) 36, arg4, arg3, arg0, arg7, arg6);
        }
    }
}
