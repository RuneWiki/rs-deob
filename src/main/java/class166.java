import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class166 extends class409 {

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field2492 = 0;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "Ldh;")
    public static class216 field2494 = new class216(6, 7);

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "[Lmj;")
    public static class473[] field2502 = new class473[30];

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "B")
    public static byte field2493;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public int field2495;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public int field2496;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public int field2500;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "Lee;")
    public class487 field2501;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "[Lwc;")
    public class48[] field2497;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)V", line = 17)
    public static void method1189(boolean arg0) {
        field2502 = null;
        field2494 = null;
        if (arg0) {
            field2492 = 96;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIILqa;)Z", line = 28)
    public final boolean method1190(int arg0, int arg1, int arg2, class167 arg3) {
        field2498++;
        if (this.field2497 != null) {
            for (int var5 = 0; var5 < this.field2497.length; var5++) {
                if (this.field2497[var5].method441(arg0, arg2) && this.field2501.method553(arg2, arg0, 86, arg3)) {
                    return true;
                }
            }
        }
        int var6 = 104 % ((arg1 - 65) / 34);
        return false;
    }
}
