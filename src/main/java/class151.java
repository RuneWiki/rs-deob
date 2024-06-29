import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class151 {

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Leb;")
    public static class230 field2685 = class68.method589(0, ")4a=");

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "J")
    public static long field2686 = 0L;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "Leb;")
    public static class230 field2688 = class68.method589(0, "");

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "Lde;")
    public static class107 field2684;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "[[[I")
    public static int[][][] field2682;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
    public static final void method1137(boolean arg0) {
        if (!arg0) {
            field2688 = null;
        }
        if (class129.field2324.toLowerCase().indexOf("microsoft") == -1) {
            class16.field363[46] = 72;
            class16.field363[44] = 71;
            class16.field363[93] = 43;
            class16.field363[91] = 42;
            class16.field363[92] = 74;
            class16.field363[61] = 27;
            class16.field363[59] = 57;
            class16.field363[45] = 26;
            class16.field363[47] = 73;
            if (class129.field2331 == null) {
                class16.field363[222] = 59;
                class16.field363[192] = 58;
            } else {
                class16.field363[192] = 28;
                class16.field363[222] = 58;
                class16.field363[520] = 59;
            }
        } else {
            class16.field363[219] = 42;
            class16.field363[222] = 59;
            class16.field363[188] = 71;
            class16.field363[221] = 43;
            class16.field363[186] = 57;
            class16.field363[191] = 73;
            class16.field363[190] = 72;
            class16.field363[192] = 58;
            class16.field363[187] = 27;
            class16.field363[223] = 28;
            class16.field363[220] = 74;
            class16.field363[189] = 26;
        }
        field2683++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static void method1138(int arg0) {
        field2688 = null;
        field2685 = null;
        int var1 = 82 / ((27 - arg0) / 51);
        field2684 = null;
        field2682 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lrb;Lrb;B)V")
    public static final void method1139(class255 arg0, class255 arg1, byte arg2) {
        field2689++;
        if (arg0.field4549 != null) {
            arg0.method1785(-116);
        }
        if (arg2 <= 102) {
            method1138(-75);
        }
        arg0.field4549 = arg1;
        arg0.field4539 = arg1.field4539;
        arg0.field4549.field4539 = arg0;
        arg0.field4539.field4549 = arg0;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    public static final void method1140(int arg0) {
        for (class191 var1 = (class191) class222.field3806.method839(128); var1 != null; var1 = (class191) class222.field3806.method834((byte) 82)) {
            if (var1.field3368 > 0) {
                var1.field3368--;
            }
            if (var1.field3368 != 0) {
                if (var1.field3366 > 0) {
                    var1.field3366--;
                }
                if (var1.field3366 == 0 && var1.field3381 >= 1 && var1.field3377 >= 1 && var1.field3381 <= 102 && var1.field3377 <= 102 && (var1.field3367 < 0 || class251.method1777(var1.field3367, var1.field3375, false))) {
                    class131.method1031(var1.field3377, var1.field3382, var1.field3381, var1.field3375, 102, var1.field3380, var1.field3367, var1.field3363);
                    var1.field3366 = -1;
                    if (var1.field3373 == var1.field3367 && var1.field3373 == -1) {
                        var1.method518(109);
                    } else if (var1.field3373 == var1.field3367 && var1.field3370 == var1.field3363 && var1.field3375 == var1.field3369) {
                        var1.method518(96);
                    }
                }
            } else if (var1.field3373 < 0 || class251.method1777(var1.field3373, var1.field3369, false)) {
                class131.method1031(var1.field3377, var1.field3382, var1.field3381, var1.field3369, 102, var1.field3380, var1.field3373, var1.field3370);
                var1.method518(102);
            }
        }
        if (arg0 <= 12) {
            method1139((class255) null, (class255) null, (byte) -124);
        }
        field2687++;
    }
}
