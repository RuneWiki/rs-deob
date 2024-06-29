import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class50 extends class51 {

    @OriginalMember(owner = "client!fb", name = "Z", descriptor = "Led;")
    public static class43 field1002 = class191.method1219("<col=ff9040>", false);

    @OriginalMember(owner = "client!fb", name = "eb", descriptor = "[S")
    public static short[] field1007 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!fb", name = "cb", descriptor = "Ln;")
    public static class118 field1005 = new class118();

    @OriginalMember(owner = "client!fb", name = "gb", descriptor = "Led;")
    private static class43 field1009 = class191.method1219("flash3:", false);

    @OriginalMember(owner = "client!fb", name = "ib", descriptor = "Led;")
    public static class43 field1011 = field1009;

    @OriginalMember(owner = "client!fb", name = "hb", descriptor = "Led;")
    public static class43 field1010 = field1009;

    @OriginalMember(owner = "client!fb", name = "kb", descriptor = "I")
    public static int field1013 = 0;

    @OriginalMember(owner = "client!fb", name = "jb", descriptor = "Lbf;")
    public static class17 field1012 = new class17(4096);

    @OriginalMember(owner = "client!fb", name = "lb", descriptor = "[I")
    public static int[] field1014 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!fb", name = "mb", descriptor = "Led;")
    public static class43 field1015 = class191.method1219("RuneScape wurde aktualisiert(Q", false);

    @OriginalMember(owner = "client!fb", name = "nb", descriptor = "I")
    public static int field1016 = 0;

    @OriginalMember(owner = "client!fb", name = "ab", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!fb", name = "bb", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!fb", name = "db", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!fb", name = "fb", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!fb", name = "ob", descriptor = "[Ltg;")
    public static class179[] field1017;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        if (arg0 != 16) {
            this.method99(-120, (byte) 113);
        }
        ++field1004;
        int[] var3 = super.field1025.method39(arg1, (byte) 39);
        if (super.field1025.field154) {
            int[] var4 = this.method314(0, (byte) -121, arg1);
            for (int var5 = 0; ~var5 > ~class122.field2442; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)V")
    public static void method305(int arg0) {
        field1017 = null;
        field1014 = null;
        field1015 = null;
        field1011 = null;
        field1010 = null;
        if (arg0 != 2) {
            method305(79);
        }
        field1009 = null;
        field1005 = null;
        field1012 = null;
        field1007 = null;
        field1002 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        if (~arg2 == -1) {
            super.field1029 = ~arg0.method538((byte) -58) == -2;
        }
        ++field1003;
        if (arg1 != 0) {
            this.method27(121, -127);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)[[I")
    public final int[][] method99(int arg0, byte arg1) {
        int[][] var3 = super.field1027.method1087(arg0, arg1 ^ 92);
        if (super.field1027.field3428) {
            int[][] var4 = this.method306(0, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class122.field2442; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var10[var11] = 4096 - var6[var11];
                var9[var11] = -var7[var11] + 4096;
            }
        }
        ++field1008;
        if (arg1 != -94) {
            this.method24((class89) null, -65, 33);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
    public class50() {
        super(1, false);
    }
}
