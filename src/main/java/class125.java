import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class125 {

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static int field1976 = 0;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "Z")
    public static boolean field1975 = false;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    public static int field1979 = 500;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "Lci;")
    public static class250 field1968 = new class250(0, 0);

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "Lgd;")
    public static class76 field1974;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)I")
    public static final int method866(boolean arg0) {
        field1969++;
        if ((double) class155.field2412 == 3.0D) {
            return 37;
        }
        if (arg0) {
            field1976 = -2;
        }
        if ((double) class155.field2412 == 4.0D) {
            return 50;
        } else if ((double) class155.field2412 == 6.0D) {
            return 75;
        } else if ((double) class155.field2412 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BLhc;)V")
    public static final void method867(byte arg0, class235 arg1) {
        if (arg0 == 95) {
            class248.field4008 = arg1.method1603(-106, "titlebg");
            class22.field312 = arg1.method1603(arg0 - 209, "logo");
            field1971++;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lsl;Lsl;I)V")
    public static final void method868(class18 arg0, class18 arg1, int arg2) {
        int var3 = 65 / ((arg2 - 35) / 50);
        field1970++;
        if (arg1.field278 != null) {
            arg1.method174(31388);
        }
        arg1.field278 = arg0;
        arg1.field276 = arg0.field276;
        arg1.field278.field276 = arg1;
        arg1.field276.field278 = arg1;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public static void method869(int arg0) {
        if (arg0 == 11617) {
            field1968 = null;
            field1974 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)V")
    public static final void method870(int arg0, int arg1) {
        if (arg1 == 0) {
            field1977++;
            class75.field1251.method1897(true, arg0);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method871(String arg0, boolean arg1) {
        field1973++;
        if (!arg1) {
            field1974 = null;
        }
        return arg0.length() + 1;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZIIII)V")
    public static final void method872(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!arg0) {
            field1975 = true;
        }
        field1980++;
        if (arg3 <= arg4) {
            for (int var5 = arg3; var5 < arg4; var5++) {
                class154.field2406[var5][arg1] = arg2;
            }
        } else {
            for (int var6 = arg4; var6 < arg3; var6++) {
                class154.field2406[var6][arg1] = arg2;
            }
        }
    }
}
