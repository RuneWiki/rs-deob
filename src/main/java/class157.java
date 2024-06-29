import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class157 extends class268 {

    @OriginalMember(owner = "client!vh", name = "y", descriptor = "I")
    private int field2387;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    private int field2378;

    @OriginalMember(owner = "client!vh", name = "C", descriptor = "I")
    private int field2391;

    @OriginalMember(owner = "client!vh", name = "B", descriptor = "I")
    private int field2390;

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "I")
    private int field2385;

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "I")
    private int field2388;

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "I")
    private int field2386;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    private int field2381;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "Z")
    public static boolean field2380 = true;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "Lec;")
    public static class99 field2383 = new class99(50);

    @OriginalMember(owner = "client!vh", name = "E", descriptor = "[Lpa;")
    public static class163[] field2393 = new class163[0];

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!vh", name = "D", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!vh", name = "A", descriptor = "[[[I")
    public static int[][][] field2389;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V", line = 6)
    public static void method1183(int arg0) {
        field2389 = (int[][][]) null;
        if (arg0 < 32) {
            field2383 = (class99) null;
        }
        field2393 = null;
        field2383 = null;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(III)V", line = 21)
    public final void method400(int arg0, int arg1, int arg2) {
        int var4 = -78 % ((-arg1 - 74) / 43);
        field2382++;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V", line = 41)
    public final void method406(int arg0, int arg1, int arg2) {
        field2379++;
        int var4 = this.field2387 * arg2 >> 12;
        int var5 = this.field2381 * arg0 >> 12;
        int var6 = this.field2390 * arg2 >> 12;
        int var7 = this.field2391 * arg0 >> 12;
        int var8 = this.field2388 * arg0 >> 12;
        int var9 = this.field2385 * arg2 >> 12;
        if (arg1 == 219) {
            int var10 = this.field2378 * arg0 >> 12;
            int var11 = this.field2386 * arg2 >> 12;
            class218.method1553(this.field4173, var5, 0, var8, var11, var6, var4, var7, var10, var9);
        }
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(III)V", line = 75)
    public final void method405(int arg0, int arg1, int arg2) {
        field2377++;
        if (arg2 < 63) {
            this.method405(64, 65, 83);
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 85)
    public class157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2387 = arg1;
        this.field2378 = arg6;
        this.field2391 = arg2;
        this.field2390 = arg3;
        this.field2385 = arg5;
        this.field2388 = arg4;
        this.field2386 = arg7;
        this.field2381 = arg0;
    }
}
