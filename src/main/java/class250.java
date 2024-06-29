import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class250 {

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3983 = "K";

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Lic;")
    public static class160 field3987 = new class160(64);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "Lsb;")
    public static class124 field3989;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "[I")
    public static int[] field3988;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "[Lbf;")
    public static class102[] field3982;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field3985;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1665(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg5 & 0x3;
        field3986++;
        if ((arg2 & 0x1) == 1) {
            int var8 = arg0;
            arg0 = arg1;
            arg1 = var8;
        }
        if (var7 == 0) {
            return arg6;
        } else if (var7 == 1) {
            return arg4;
        } else if (var7 == 2) {
            return 7 + 1 - arg6 - arg0;
        } else if (arg3 == 0) {
            return 7 + 1 - arg4 - arg1;
        } else {
            return -116;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
    public static void method1666(byte arg0) {
        field3983 = null;
        field3982 = null;
        field3985 = null;
        if (arg0 > 26) {
            field3988 = null;
            field3987 = null;
            field3989 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)V")
    public static final void method1667(byte arg0) {
        class38.field640 = 0;
        field3981++;
        class254.field4039 = 0;
        class156.method1125(2);
        class223.method1499(2013);
        class50.method427(86);
        for (int var1 = 0; var1 < class38.field640; var1++) {
            int var4 = class6.field80[var1];
            if (class207.field3336 != class3.field45[var4].field2846) {
                if (class3.field45[var4].field2321.method1197(0)) {
                    class6.method32(class3.field45[var4], false);
                }
                class3.field45[var4].method1038(-15565, (class165) null);
                class3.field45[var4] = null;
            }
        }
        if (class222.field3547 != class143.field2360.field2231) {
            throw new RuntimeException("gnp1 pos:" + class143.field2360.field2231 + " psize:" + class222.field3547);
        }
        for (int var2 = 0; var2 < class7.field88; var2++) {
            if (class3.field45[class287.field4587[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class7.field88);
            }
        }
        int var3 = -118 / ((arg0 - 60) / 39);
    }
}
