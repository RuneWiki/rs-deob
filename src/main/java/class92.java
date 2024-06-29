import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public abstract class class92 {

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field1017 = 0;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "Lra;")
    public static class57 field1012;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "Lra;")
    public static class57 field1016;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1014;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B[I[Ljava/lang/Object;)V", line = 5)
    public static final void method494(byte arg0, int[] arg1, Object[] arg2) {
        if (arg0 == -105) {
            field1015++;
            class115.method633(arg2, false, arg1.length - 1, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V", line = 27)
    public static void method495(byte arg0) {
        field1016 = null;
        if (arg0 == 101) {
            field1014 = null;
            field1012 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(JI)V", line = 46)
    public static final void method496(long arg0, int arg1) {
        field1018++;
        if (class132.field1814 != null) {
            if (class231.field3128 == 1 || class231.field3128 == 5) {
                class344.method2204(arg0, (byte) 124);
            } else if (class231.field3128 == 2) {
                class247.method1557(true);
            } else if (class231.field3128 == 4) {
                class98.method528((byte) -118, arg0);
            } else {
                class160.method1050((byte) 115);
            }
        }
        class151.method903(class218.field2991, (long) class221.field3033, 0);
        if (class424.field6086 != -1) {
            class153.method917(arg1 ^ 0xFFFFFFFE, class424.field6086);
        }
        for (int var3 = 0; var3 < class262.field3646; var3++) {
            if (class266.field3723[var3]) {
                class270.field3817[var3] = true;
            }
            class350.field5115[var3] = class266.field3723[var3];
            class266.field3723[var3] = false;
        }
        if (arg1 != 1) {
            method496(36L, 63);
        }
        class216.field2933 = class221.field3033;
        if (class218.field2991.method996()) {
            class269.field3789 = true;
        }
        class66.field753 = null;
        if (class424.field6086 != -1) {
            class262.field3646 = 0;
            class334.method2152(-125);
        }
        class218.field2991.method957();
        class95.method516(class218.field2991, -125);
        int var4 = class224.method1451(14551);
        if (var4 == -1) {
            var4 = class225.field3076;
        }
        class326.method2009(var4, (byte) -126);
        class193.method1233(class390.field5715.field1311, class245.field3329, class410.field5931, arg1 ^ 0xFFFFFF9F, class390.field5715.field1304);
        class245.field3329 = 0;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILea;)Lea;")
    public abstract class324 method493(int arg0, class324 arg1);
}
