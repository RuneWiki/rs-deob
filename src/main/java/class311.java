import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public abstract class class311 {

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "Lpia;")
    public static class94 field3858 = new class94(44, 8);

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "[B")
    public static byte[] field3859 = new byte[2048];

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "F")
    public static float field3862;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "Lgg;")
    public static class174 field3861;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
    public abstract void method1691(int arg0);

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)I")
    public static final int method1848(int arg0, int arg1) {
        if (arg0 != -34845) {
            return -21;
        }
        field3857++;
        if (arg1 == 6407 || arg1 == 34843 || arg1 == 34837) {
            return 6407;
        } else if (arg1 == 6408 || arg1 == 34842 || arg1 == 34836) {
            return 6408;
        } else if (arg1 == 6406 || arg1 == 34844) {
            return 6406;
        } else if (arg1 == 6409 || arg1 == 34846) {
            return 6409;
        } else if (arg1 == 6410 || arg1 == 34847) {
            return 6410;
        } else if (arg1 == 6402) {
            return 6402;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "([BIII)I")
    public abstract int method1692(byte[] arg0, int arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
    public static final void method1849(byte arg0) {
        if (arg0 != 7) {
            return;
        }
        for (class177 var1 = (class177) class331.field4291.method2067(arg0 + 22455); var1 != null; var1 = (class177) class331.field4291.method2066(arg0 ^ 0x7)) {
            if (var1.field2078 > 1) {
                var1.field2078 = 0;
                class511.field7291.method3537(-62, ((class649) var1.field2081.field4488.field8923).field9266, var1);
                var1.field2081.method2062(false);
            }
        }
        field3856++;
        class736.field10289 = 0;
        class343.field4449 = 0;
        class265.field3289.method1728(29632);
        class534.field7720.method1758(124);
        class331.field4291.method2062(false);
        class149.field1652 = false;
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
    public static void method1850(int arg0) {
        field3858 = null;
        field3861 = null;
        if (arg0 != -34847) {
            field3858 = null;
        }
        field3859 = null;
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)V")
    public abstract void method1696(int arg0);

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "([BIII)V")
    public abstract void method1695(byte[] arg0, int arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(II)Z")
    public abstract boolean method1694(int arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1851(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3860++;
        class752 var10 = null;
        for (class752 var11 = (class752) class572.field8135.method1719(65280); var11 != null; var11 = (class752) class572.field8135.method1723(-20665)) {
            if (var11.field10515 == arg5 && var11.field10512 == arg3 && var11.field10517 == arg8 && var11.field10514 == arg2) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class752();
            var10.field10515 = arg5;
            var10.field10514 = arg2;
            var10.field10517 = arg8;
            var10.field10512 = arg3;
            if (arg3 >= 0 && arg8 >= 0 && arg3 < class489.field6976 && arg8 < class153.field1677) {
                class211.method1251(false, var10);
            }
            class572.field8135.method1721((byte) 112, var10);
        }
        var10.field10521 = arg9;
        if (arg4 == -18898) {
            var10.field10522 = arg7;
            var10.field10519 = arg6;
            var10.field10509 = arg1;
            var10.field10518 = arg0;
        }
    }
}
