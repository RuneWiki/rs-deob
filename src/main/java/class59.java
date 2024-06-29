import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public abstract class class59 {

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "Lwm;")
    public static class152 field897 = class157.method1048("Liste des serveurs charg-Be", 122);

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "Lwm;")
    public static class152 field901 = class157.method1048(":duelstake:", 121);

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "Lne;")
    public static class235 field900 = new class235(64);

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field902 = 0;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "Lwm;")
    public static class152 field905 = class157.method1048("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", 119);

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public static int field906 = 0;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Lwm;")
    public static class152 field904 = class157.method1048("V-Brification des mises -9 jour )2 ", 105);

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZIBIII)V", line = 13)
    public static final void method389(boolean arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 1) {
            arg3 = 1;
        }
        field899++;
        if (arg5 < 1) {
            arg5 = 1;
        }
        if (class217.field3516) {
            int var6 = arg3 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = (class121.field1715 - class290.field4927) * var6 / 100 + class290.field4927;
            if (class118.field1676 > var7) {
                var7 = class118.field1676;
            } else if (class213.field3480 < var7) {
                var7 = class213.field3480;
            }
            int var8 = arg3 * var7 * 512 / (arg5 * 334);
            if (var8 < class159.field2534) {
                short var12 = class159.field2534;
                var7 = var12 * 334 * arg5 / (arg3 * 512);
                if (var7 > class213.field3480) {
                    var7 = class213.field3480;
                    int var13 = var7 * 512 * arg3 / (var12 * 334);
                    int var14 = (arg5 - var13) / 2;
                    if (arg0) {
                        class13.method81();
                        class13.method78(arg4, arg1, var14, arg3, 0);
                        class13.method78(arg4 + arg5 - var14, arg1, var14, arg3, 0);
                    }
                    arg4 += var14;
                    arg5 -= var14 * 2;
                }
            } else if (var8 > class74.field1073) {
                short var9 = class74.field1073;
                var7 = arg5 * var9 * 334 / (arg3 * 512);
                if (var7 < class118.field1676) {
                    var7 = class118.field1676;
                    int var10 = var9 * 334 * arg5 / (var7 * 512);
                    int var11 = (arg3 - var10) / 2;
                    if (arg0) {
                        class13.method81();
                        class13.method78(arg4, arg1, arg5, var11, 0);
                        class13.method78(arg4, arg3 + arg1 - var11, arg5, var11, 0);
                    }
                    arg1 += var11;
                    arg3 -= var11 * 2;
                }
            }
            class114.field1619 = arg3 * var7 / 334;
        }
        class277.field4750 = arg1;
        class308.field5291 = (short) arg3;
        class254.field4393 = (short) arg5;
        class226.field3667 = arg4;
        if (arg2 != -38) {
            field904 = (class152) null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)Lwm;", line = 122)
    public static final class152 method391(int arg0, int arg1) {
        field896++;
        return arg1 > arg0 ? class38.method280(118, arg0) : class86.field1214;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(II)V", line = 141)
    public static final void method393(int arg0, int arg1) {
        field898++;
        class106.field1507.method1617(arg1, arg0 - 284);
        if (arg0 != 334) {
            field905 = (class152) null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V", line = 169)
    public static final void method395(int arg0) {
        field894++;
        if (arg0 < 43) {
            method396(-43);
        }
        class89.method587(0, 0, -40);
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V", line = 183)
    public static final void method396(int arg0) {
        class254.field4394.method1619(11300);
        if (arg0 < 75) {
            field897 = (class152) null;
        }
        field895++;
        class194.field3087.method1619(11300);
        class152.field2430.method1619(11300);
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)V", line = 196)
    public static void method397(int arg0) {
        if (arg0 != 0) {
            method391(85, 114);
        }
        field901 = null;
        field904 = null;
        field897 = null;
        field905 = null;
        field900 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)[B")
    public abstract byte[] method388(int arg0, int arg1);

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)I")
    public abstract int method390(byte arg0, int arg1);

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)Lsg;")
    public abstract class37 method392(int arg0);

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(BI)V")
    public abstract void method394(byte arg0, int arg1);
}
