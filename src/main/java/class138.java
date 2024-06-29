import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class138 {

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "[I")
    private int[] field3367;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field3365 = 7759444;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "Loa;")
    public static class98 field3375 = class38.method349(255, "Regelversto-8 melden");

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "Loa;")
    private static class98 field3377 = class38.method349(255, "Error connecting to server)3");

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "Loa;")
    public static class98 field3378 = field3377;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "Loa;")
    private static class98 field3371 = class38.method349(255, "Message");

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Loa;")
    public static class98 field3368 = field3371;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "[I")
    public static int[] field3380 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "Loa;")
    private static class98 field3381 = class38.method349(255, "Hide");

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "Loa;")
    public static class98 field3376 = field3381;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "Ld;")
    public static class22 field3373;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "[[B")
    public static byte[][] field3382;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "[[[B")
    public static byte[][][] field3366;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)I")
    public final int method1119(int arg0, int arg1) {
        if (arg1 != -20127) {
            this.method1119(106, 24);
        }
        field3372++;
        int var3 = this.field3367.length - 2;
        int var4 = arg0 << 1 & var3;
        while (true) {
            int var5 = this.field3367[var4];
            if (arg0 == var5) {
                return this.field3367[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var3 & var4 + 2;
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "([I)V")
    public class138(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field3367 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field3367[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field3367[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field3367[var5 + var5] = arg0[var4];
            this.field3367[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)I")
    public static final int method1120(int arg0, int arg1, int arg2) {
        if (arg1 > -57) {
            return -62;
        }
        field3370++;
        if (arg2 >= 2) {
            int var3 = method1120(arg0 * arg0, -96, arg2 >> 1);
            if ((arg2 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            return var3;
        } else if (arg2 == 1) {
            return arg0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method1121(int arg0) {
        field3368 = null;
        field3378 = null;
        field3371 = null;
        field3366 = null;
        field3376 = null;
        field3375 = null;
        field3381 = null;
        field3380 = null;
        field3382 = null;
        field3373 = null;
        field3377 = null;
        if (arg0 != -9975) {
            method1121(46);
        }
    }
}
