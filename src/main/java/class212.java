import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class212 extends class20 {

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    private int field3369;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    private int field3365;

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "I")
    private int field3371;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "I")
    private int field3370;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "J")
    public static long field3361 = 0L;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "[I")
    public static int[] field3373 = new int[1000];

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "[I")
    public static int[] field3368 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "Z")
    public static boolean field3367 = false;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "[[Ljn;")
    public static class123[][] field3364;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V", line = 8)
    public static void method1533(byte arg0) {
        field3368 = null;
        field3364 = (class123[][]) null;
        if (arg0 > 97) {
            field3373 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(IIIIIII)V", line = 19)
    public class212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3369 = arg3;
        this.field3365 = arg0;
        this.field3371 = arg2;
        this.field3370 = arg1;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IBI)V", line = 31)
    public final void method143(int arg0, byte arg1, int arg2) {
        field3362++;
        int var4 = this.field3365 * arg2 >> 12;
        int var5 = this.field3371 * arg2 >> 12;
        int var6 = this.field3370 * arg0 >> 12;
        int var7 = this.field3369 * arg0 >> 12;
        if (arg1 <= -52) {
            class161.method1155(var5, this.field221, var6, var4, var7, -26488);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)V", line = 52)
    public final void method139(int arg0, int arg1, int arg2) {
        field3372++;
        if (arg2 != 0) {
            method1534(-10);
        }
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)V", line = 69)
    public static final void method1534(int arg0) {
        field3363++;
        class19.method135();
        class249.field3738 = new class8[7];
        class249.field3738[1] = new class300();
        if (arg0 != -9217) {
            method1535(98, -122, (String) null);
        }
        class249.field3738[2] = new class46();
        class249.field3738[3] = new class25();
        class249.field3738[4] = new class316();
        class249.field3738[5] = new class268();
        class249.field3738[6] = new class145();
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BII)V", line = 88)
    public final void method144(byte arg0, int arg1, int arg2) {
        field3374++;
        int var4 = this.field3371 * arg2 >> 12;
        int var5 = this.field3370 * arg1 >> 12;
        int var6 = this.field3365 * arg2 >> 12;
        int var7 = this.field3369 * arg1 >> 12;
        if (arg0 <= 116) {
            this.method143(31, (byte) 115, 49);
        }
        class302.method2113(this.field219, this.field224, (byte) -25, this.field221, var7, var6, var4, var5);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IILjava/lang/String;)I", line = 126)
    public static final int method1535(int arg0, int arg1, String arg2) {
        if (arg0 != 1000) {
            field3368 = (int[]) null;
        }
        field3366++;
        return class209.method1491(true, arg1, (byte) -8, arg2);
    }
}
