import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class110 {

    @OriginalMember(owner = "client!th", name = "d", descriptor = "Lcc;")
    public static class209 field2223 = class95.method669(126, "clignotant2:");

    @OriginalMember(owner = "client!th", name = "e", descriptor = "Lcc;")
    public static class209 field2224 = class95.method669(105, "<col=ffffff>");

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field2227 = 0;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field2220 = -1;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "Z")
    public static boolean field2221 = false;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "[I")
    public static int[] field2229 = new int[1000];

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field2225 = 0;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "[I")
    public static int[] field2226;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "[[[B")
    public static byte[][][] field2222;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIII)I")
    public static final int method794(int arg0, int arg1, int arg2, int arg3) {
        field2230++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg0;
        } else if (arg3 == var4) {
            return 7 - arg2;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
    public static void method795(byte arg0) {
        field2229 = null;
        field2223 = null;
        int var1 = -52 / ((arg0 + 3) / 44);
        field2224 = null;
        field2226 = null;
        field2222 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method796(int arg0, int arg1) {
        field2228++;
        if (arg0 == 100 && class18.field367 > 0) {
            byte[] var2 = class249.field4487[--class18.field367];
            class249.field4487[class18.field367] = null;
            return var2;
        }
        if (arg1 != 24512) {
            method794(-53, -50, 121, -38);
        }
        if (arg0 == 5000 && class262.field4728 > 0) {
            byte[] var3 = class35.field614[--class262.field4728];
            class35.field614[class262.field4728] = null;
            return var3;
        } else if (arg0 == 30000 && class253.field4550 > 0) {
            byte[] var4 = class132.field2529[--class253.field4550];
            class132.field2529[class253.field4550] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }
}
