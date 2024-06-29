import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public abstract class class129 {

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "Lva;")
    private static class121 field2967 = class107.method797("Loaded wordpack", -10983);

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "Lva;")
    public static class121 field2968 = field2967;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "Lva;")
    public static class121 field2973 = class107.method797("Mem:", -10983);

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "Li;")
    public static class48 field2970 = new class48(64);

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "Li;")
    public static class48 field2975 = new class48(100);

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "Lw;")
    public static class125 field2969;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "Leb;")
    public static class27 field2974;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "Lhe;")
    public static class47 field2976;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "[Lub;")
    public static class117[] field2964;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V", line = 3)
    public static void method1003(byte arg0) {
        field2968 = null;
        field2973 = null;
        field2967 = null;
        field2974 = null;
        field2975 = null;
        field2976 = null;
        field2970 = null;
        field2969 = null;
        field2964 = null;
        if (arg0 <= 107) {
            field2975 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZZZ)I", line = 22)
    public static final int method1004(boolean arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            return 114;
        }
        int var3 = 0;
        if (arg2) {
            var3 += class99.field2214 + class124.field2831;
        }
        field2971++;
        if (arg0) {
            var3 += client.field428 + class48.field1142;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIILva;I)V", line = 63)
    public static final void method1005(int arg0, int arg1, int arg2, int arg3, class121 arg4, int arg5) {
        if (arg5 > -38) {
            method1006(64);
        }
        field2966++;
        if (class26.field654 >= 500) {
            return;
        }
        class21.field564[class26.field654] = arg4;
        class35.field844[class26.field654] = arg2;
        class41.field933[class26.field654] = arg3;
        class46.field1074[class26.field654] = arg1;
        class25.field635[class26.field654] = arg0;
        class26.field654++;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V", line = 120)
    public static final void method1006(int arg0) {
        class96.field2151.method347(true);
        int var1 = -5 % ((arg0 - 56) / 38);
        field2965++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I[BIZ)V")
    public abstract void method139(int arg0, byte[] arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public abstract void method141(int arg0);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIB)V")
    public abstract void method143(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)V")
    public abstract void method142(int arg0, byte arg1);

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
    public abstract void method145(int arg0);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
    public abstract void method140(boolean arg0);
}
