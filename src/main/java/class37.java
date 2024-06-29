import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class37 {

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public int field983 = 0;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public int field981 = 0;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "Lcb;")
    public static class15 field982 = new class15(10);

    @OriginalMember(owner = "client!g", name = "l", descriptor = "La;")
    public static class1 field990 = class113.method934(-11538, "(Z");

    @OriginalMember(owner = "client!g", name = "q", descriptor = "[I")
    public static int[] field995 = new int[500];

    @OriginalMember(owner = "client!g", name = "s", descriptor = "Lkc;")
    public static class63 field997 = new class63();

    @OriginalMember(owner = "client!g", name = "u", descriptor = "I")
    public static int field999 = 0;

    @OriginalMember(owner = "client!g", name = "w", descriptor = "La;")
    private static class1 field1001 = class113.method934(-11538, "Public chat");

    @OriginalMember(owner = "client!g", name = "x", descriptor = "Z")
    public static boolean field1002 = false;

    @OriginalMember(owner = "client!g", name = "A", descriptor = "I")
    public static int field1005 = 0;

    @OriginalMember(owner = "client!g", name = "C", descriptor = "La;")
    public static class1 field1007 = field1001;

    @OriginalMember(owner = "client!g", name = "D", descriptor = "Z")
    public static boolean field1008 = false;

    @OriginalMember(owner = "client!g", name = "B", descriptor = "La;")
    public static class1 field1006 = class113.method934(-11538, "@gr3@");

    @OriginalMember(owner = "client!g", name = "y", descriptor = "I")
    public int field1003;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public int field980;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public int field984;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public int field985;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public int field988;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public int field989;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public int field991;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public int field992;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public int field993;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    public int field996;

    @OriginalMember(owner = "client!g", name = "t", descriptor = "I")
    public int field998;

    @OriginalMember(owner = "client!g", name = "v", descriptor = "Lbd;")
    public static class11 field1000;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "Lvb;")
    public class128 field986;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "Lwc;")
    public static class134 field994;

    @OriginalMember(owner = "client!g", name = "z", descriptor = "[[[B")
    public static byte[][][] field1004;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([BZII)La;", line = 11)
    public static final class1 method420(byte[] arg0, boolean arg1, int arg2, int arg3) {
        field979++;
        class1 var4 = new class1();
        var4.field26 = 0;
        var4.field38 = new byte[arg3];
        if (!arg1) {
            field1007 = null;
        }
        for (int var5 = arg2; var5 < arg2 + arg3; var5++) {
            if (arg0[var5] != 0) {
                var4.field38[var4.field26++] = arg0[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V", line = 94)
    public static void method421(boolean arg0) {
        field1007 = null;
        field1006 = null;
        field994 = null;
        field1001 = null;
        field997 = null;
        field1004 = null;
        field982 = null;
        field990 = null;
        if (!arg0) {
            method421(false);
        }
        field995 = null;
        field1000 = null;
    }
}
