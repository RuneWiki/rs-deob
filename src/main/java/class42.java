import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class42 extends class186 {

    @OriginalMember(owner = "client!ea", name = "T", descriptor = "Z")
    public boolean field924 = false;

    @OriginalMember(owner = "client!ea", name = "fb", descriptor = "I")
    private int field936 = 0;

    @OriginalMember(owner = "client!ea", name = "mb", descriptor = "I")
    private int field943 = 0;

    @OriginalMember(owner = "client!ea", name = "kb", descriptor = "I")
    public int field941;

    @OriginalMember(owner = "client!ea", name = "cb", descriptor = "I")
    public int field933;

    @OriginalMember(owner = "client!ea", name = "S", descriptor = "I")
    private int field923;

    @OriginalMember(owner = "client!ea", name = "jb", descriptor = "I")
    public int field940;

    @OriginalMember(owner = "client!ea", name = "X", descriptor = "I")
    public int field928;

    @OriginalMember(owner = "client!ea", name = "O", descriptor = "I")
    public int field919;

    @OriginalMember(owner = "client!ea", name = "bb", descriptor = "Lca;")
    private class22 field932;

    @OriginalMember(owner = "client!ea", name = "P", descriptor = "[I")
    public static int[] field920 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ea", name = "V", descriptor = "I")
    public static int field926 = 0;

    @OriginalMember(owner = "client!ea", name = "W", descriptor = "I")
    public static int field927 = 1;

    @OriginalMember(owner = "client!ea", name = "hb", descriptor = "I")
    public static int field938 = 99;

    @OriginalMember(owner = "client!ea", name = "R", descriptor = "Ljd;")
    public static class92 field922 = class202.method1325((byte) 90, "und die Schaltfl-=che (WSpielkonto erstellen(W am");

    @OriginalMember(owner = "client!ea", name = "lb", descriptor = "[Z")
    public static boolean[] field942 = new boolean[100];

    @OriginalMember(owner = "client!ea", name = "eb", descriptor = "Ljd;")
    public static class92 field935 = class202.method1325((byte) 90, ")1 ");

    @OriginalMember(owner = "client!ea", name = "Q", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!ea", name = "U", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!ea", name = "Z", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!ea", name = "db", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!ea", name = "gb", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!ea", name = "ib", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!ea", name = "Y", descriptor = "J")
    public static long field929;

    @OriginalMember(owner = "client!ea", name = "ab", descriptor = "Lrh;")
    public static class169 field931;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V")
    public final void method263(int arg0, int arg1) {
        field939++;
        if (arg1 != 1) {
            this.method221(54);
        }
        if (this.field924) {
            return;
        }
        this.field936 += arg0;
        while (this.field932.field515[this.field943] < this.field936) {
            this.field936 -= this.field932.field515[this.field943];
            this.field943++;
            if (this.field932.field530.length <= this.field943) {
                this.field924 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(Z)V")
    public static void method264(boolean arg0) {
        field922 = null;
        field931 = null;
        if (!arg0) {
            field935 = null;
            field942 = null;
            field920 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IILjava/util/Random;)I")
    public static final int method265(int arg0, int arg1, Random arg2) {
        if (arg0 != -1) {
            return -120;
        }
        field937++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class92.method643(-91, arg1)) {
            return (int) ((long) arg1 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            return method266(var4, arg1, arg0 ^ 0xFFFFFFFE);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)I")
    private static final int method266(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 31 & arg1 - 1;
        if (arg2 != 1) {
            method265(110, -31, null);
        }
        field934++;
        return ((arg0 >>> 31) + arg0) % arg1 + var3;
    }

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)Ldg;")
    public final class38 method221(int arg0) {
        if (arg0 > -51) {
            this.method221(111);
        }
        field930++;
        class64 var2 = class102.method702((byte) -98, this.field923);
        class38 var3;
        if (this.field924) {
            var3 = var2.method383(-1, 10);
        } else {
            var3 = var2.method383(this.field943, 119);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(IIIIIII)V")
    public class42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field941 = arg3;
        this.field933 = arg2;
        this.field923 = arg0;
        this.field940 = arg5 + arg6;
        this.field928 = arg1;
        this.field919 = arg4;
        int var8 = class102.method702((byte) -98, this.field923).field1295;
        if (var8 == -1) {
            this.field924 = true;
        } else {
            this.field924 = false;
            this.field932 = class153.method978(var8, -117);
        }
    }
}
