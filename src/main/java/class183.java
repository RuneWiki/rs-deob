import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class183 {

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public int field2393;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public int field2394;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    public int field2402;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    private int field2404;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "B")
    public byte field2398;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "[I")
    public static int[] field2392 = new int[1];

    @OriginalMember(owner = "client!al", name = "k", descriptor = "[[F")
    public static float[][] field2400 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!al", name = "r", descriptor = "[S")
    public static short[] field2407 = new short[256];

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public int field2390;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public int field2395;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public int field2396;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    public int field2397;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    public int field2399;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    public int field2403;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    public int field2405;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    public int field2406;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "I")
    public int field2409;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "Lal;")
    public class183 field2408;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V", line = 5)
    public static void method1169(int arg0) {
        field2407 = null;
        field2392 = null;
        if (arg0 != 1) {
            field2407 = null;
        }
        field2400 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)Lhd;", line = 22)
    public final class332 method1170(byte arg0) {
        field2401++;
        if (arg0 != 88) {
            this.method1171(-113, 85, -48, -100);
        }
        return class543.method3090(0, this.field2404);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIII)Lal;", line = 52)
    public final class183 method1171(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 1) {
            method1169(15);
        }
        field2391++;
        return new class183(this.field2404, arg3, arg0, arg1, this.field2398);
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(IIIIB)V", line = 69)
    public class183(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field2393 = arg1;
        this.field2394 = arg2;
        this.field2402 = arg3;
        this.field2404 = arg0;
        this.field2398 = arg4;
    }
}
