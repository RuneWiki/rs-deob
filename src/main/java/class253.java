import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class253 {

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field4157 = new String[100];

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "[I")
    public static int[] field4160 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "[I")
    public static int[] field4156 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field4164 = 0;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "Lli;")
    public static class245 field4161;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "Lsc;")
    public static class288 field4158;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "[[[Lee;")
    public static class312[][][] field4154;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 4)
    public static final boolean method1782(String arg0, byte arg1) {
        field4159++;
        int var2 = -88 / ((-arg1 - 40) / 36);
        if (arg0 == null) {
            return false;
        }
        for (int var3 = 0; var3 < class151.field2550; var3++) {
            if (arg0.equalsIgnoreCase(class91.field1610[var3])) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class96.field1750.field1779)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V", line = 46)
    public static void method1783(int arg0) {
        field4156 = null;
        field4158 = null;
        field4160 = null;
        field4157 = null;
        field4161 = null;
        field4154 = (class312[][][]) null;
        if (arg0 != 21792) {
            field4156 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILth;I)V", line = 69)
    public static final void method1784(int arg0, int arg1, class98 arg2, int arg3) {
        field4162++;
        int var4 = 91 % ((-arg0 - 42) / 61);
        if (arg2.field166 == arg3 && arg3 != -1) {
            class300 var5 = class258.method1807(arg3, 122);
            int var6 = var5.field4872;
            if (var6 == 1) {
                arg2.field220 = 0;
                arg2.field180 = arg1;
                arg2.field210 = 0;
                arg2.field191 = 0;
                arg2.field203 = 1;
                class347.method2479(class96.field1750 == arg2, (byte) -78, var5, arg2.field220, arg2.field199, arg2.field213);
            }
            if (var6 == 2) {
                arg2.field191 = 0;
            }
        } else if (arg3 == -1 || arg2.field166 == -1 || class258.method1807(arg3, 78).field4892 >= class258.method1807(arg2.field166, 90).field4892) {
            arg2.field166 = arg3;
            arg2.field191 = 0;
            arg2.field220 = 0;
            arg2.field180 = arg1;
            arg2.field210 = 0;
            arg2.field212 = arg2.field179;
            arg2.field203 = 1;
            if (arg2.field166 != -1) {
                class347.method2479(class96.field1750 == arg2, (byte) -90, class258.method1807(arg2.field166, 99), arg2.field220, arg2.field199, arg2.field213);
            }
        }
    }
}
