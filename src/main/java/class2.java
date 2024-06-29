import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 {

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "[I")
    private int[] field39;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "Z")
    public static boolean field40 = false;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "[Lr;")
    public static class118[] field43 = new class118[1000];

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "Lr;")
    public static class118 field35 = class153.method1136(114, "oberen Rand der Webseite ausw-=hlen)3");

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field38 = -1;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public static int field46 = 0;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "[I")
    public static int[] field37 = new int[1000];

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "Lr;")
    public static class118 field47 = class153.method1136(76, "Mem:");

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "Lr;")
    public static class118 field48 = class153.method1136(117, "<col=00ff80>");

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Lr;")
    private static class118 field36 = class153.method1136(110, "Password: ");

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Lr;")
    public static class118 field33 = field36;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "I")
    public static int field51 = 0;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "Lr;")
    public static class118 field50 = class153.method1136(104, "Nehmen");

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "Lr;")
    public static class118 field49 = class153.method1136(106, "mapedge");

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "Lbd;")
    public static class12 field44;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "[I")
    public static int[] field41;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIZ)I")
    public static final int method8(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method8(42, 118, false);
        }
        int var3 = arg0 >>> 31;
        field34++;
        return (arg0 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "([I)V")
    public class2(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field39 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field39[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field39[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field39[var5 + var5] = arg0[var4];
            this.field39[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public static void method9(byte arg0) {
        if (arg0 > -49) {
            field47 = null;
        }
        field36 = null;
        field33 = null;
        field41 = null;
        field43 = null;
        field37 = null;
        field35 = null;
        field50 = null;
        field48 = null;
        field44 = null;
        field49 = null;
        field47 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)I")
    public final int method10(byte arg0, int arg1) {
        field42++;
        if (arg0 >= -18) {
            method8(-57, 52, true);
        }
        int var3 = (this.field39.length >> 1) - 1;
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field39[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field39[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }
}
