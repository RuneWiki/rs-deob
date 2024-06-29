import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class94 {

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "Ltd;")
    public static class136 field2199 = class145.method1172("nav", 45);

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field2202 = -1;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "Ltd;")
    public static class136 field2204 = class145.method1172("b12_full", 45);

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "Ltd;")
    public static class136 field2207 = class145.method1172("<)4col>", 45);

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "Ltd;")
    public static class136 field2200 = class145.method1172("::rect_debug", 45);

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "Ltd;")
    public static class136 field2212 = class145.method1172(" <col=00ff80>", 45);

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "[Z")
    public static boolean[] field2206 = new boolean[100];

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "Lke;")
    public static class74 field2203;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "[[Lke;")
    public static class74[][] field2201;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)Ldf;")
    public static final class28 method699(int arg0, int arg1) {
        field2205++;
        class28 var2 = (class28) class47.field1087.method1162((long) arg0, true);
        int var3 = 111 % ((-arg1 - 62) / 42);
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class118.field2687.method669(arg0, 1, -14);
        class28 var5 = new class28();
        if (var4 != null) {
            var5.method241(false, arg0, new class127(var4));
        }
        var5.method240(-26);
        class47.field1087.method1164((long) arg0, var5, (byte) 127);
        return var5;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static void method700(byte arg0) {
        field2212 = null;
        int var1 = -94 / ((32 - arg0) / 57);
        field2204 = null;
        field2203 = null;
        field2206 = null;
        field2200 = null;
        field2199 = null;
        field2207 = null;
        field2201 = null;
    }
}
