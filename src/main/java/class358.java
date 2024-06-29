import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class358 extends class32 implements Runnable {

    @OriginalMember(owner = "client!li", name = "o", descriptor = "Z")
    private boolean field5434 = true;

    @OriginalMember(owner = "client!li", name = "z", descriptor = "I")
    public int field5445 = -1;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "Ldk;")
    private class390 field5436;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "I")
    public static int field5435 = 0;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public static int field5437 = 0;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "I")
    public static int field5440 = 0;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "[I")
    public static int[] field5441 = new int[1000];

    @OriginalMember(owner = "client!li", name = "y", descriptor = "I")
    public static int field5444 = 0;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "I")
    public static int field5438;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "I")
    public static int field5443;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
    public final void method2202(int arg0) {
        (new Thread(this, "a")).start();
        field5443++;
        if (arg0 <= 5) {
            this.run();
        }
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V")
    public final void method2203(int arg0) {
        if (arg0 == 22874) {
            this.field5434 = false;
            field5442++;
        }
    }

    @OriginalMember(owner = "client!li", name = "run", descriptor = "()V")
    public final void run() {
        field5433++;
        while (this.field5434) {
            this.field5436.method2352(this, -25993);
        }
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(I)V")
    public static void method2204(int arg0) {
        if (arg0 != -1) {
            method2205(111, (Object[]) null, -118, -78, (long[]) null);
        }
        field5441 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I[Ljava/lang/Object;II[J)V")
    public static final void method2205(int arg0, Object[] arg1, int arg2, int arg3, long[] arg4) {
        if (arg0 != 1) {
            method2205(-41, (Object[]) null, -28, -112, (long[]) null);
        }
        if (arg3 < arg2) {
            int var5 = (arg3 + arg2) / 2;
            int var6 = arg3;
            long var7 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var7;
            Object var9 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var9;
            for (int var10 = arg3; var10 < arg2; var10++) {
                if (arg4[var10] < ((long) (var10 & 0x1) + var7)) {
                    long var11 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6] = var11;
                    Object var13 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var13;
                }
            }
            arg4[arg2] = arg4[var6];
            arg4[var6] = var7;
            arg1[arg2] = arg1[var6];
            arg1[var6] = var9;
            method2205(arg0, arg1, var6 - 1, arg3, arg4);
            method2205(1, arg1, arg2, var6 + 1, arg4);
        }
        field5439++;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Ldk;)V")
    public class358(class390 arg0) {
        this.field5436 = arg0;
    }
}
