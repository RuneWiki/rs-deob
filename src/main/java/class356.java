import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class356 extends class98 {

    @OriginalMember(owner = "client!kda", name = "M", descriptor = "I")
    public int field5685;

    @OriginalMember(owner = "client!kda", name = "O", descriptor = "Ler;")
    private class92 field5687;

    @OriginalMember(owner = "client!kda", name = "I", descriptor = "J")
    private long field5681;

    @OriginalMember(owner = "client!kda", name = "J", descriptor = "[Lpea;")
    public static class675[] field5682 = new class675[14];

    @OriginalMember(owner = "client!kda", name = "K", descriptor = "[[[I")
    public static int[][][] field5683 = new int[2][][];

    @OriginalMember(owner = "client!kda", name = "Q", descriptor = "[I")
    public static int[] field5689 = new int[32];

    @OriginalMember(owner = "client!kda", name = "E", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!kda", name = "G", descriptor = "I")
    public static int field5679;

    @OriginalMember(owner = "client!kda", name = "H", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!kda", name = "L", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!kda", name = "P", descriptor = "I")
    public static int field5688;

    @OriginalMember(owner = "client!kda", name = "N", descriptor = "[[[S")
    public static short[][][] field5686;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(ZIIII)V", line = 4)
    public static final void method2392(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field5679++;
        class588.field8352 = 0L;
        int var5 = class33.method452(2);
        if (arg3 == 3 || var5 == 3) {
            arg0 = true;
        }
        if (!class627.field8857.method355()) {
            arg0 = true;
        }
        if (arg1 > -74) {
            method2395(-30, 20);
        }
        class71.method728(2, var5, arg3, arg0, arg4, arg2);
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)V", line = 30)
    private final void method2393(int arg0) {
        if (this.field5681 > 0L) {
            this.field5687.field1285.releasePbuffer(this.field5681);
            this.field5681 = 0L;
        }
        if (arg0 == 0) {
            field5678++;
        }
    }

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "(I)J", line = 55)
    public final long method2394(int arg0) {
        if (arg0 != -1738626585) {
            this.method2393(-42);
        }
        field5684++;
        return this.field5681;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(II)I", line = 68)
    public static final int method2395(int arg0, int arg1) {
        if (arg1 == -32762) {
            field5680++;
            return arg0 >>> 7;
        } else {
            return 80;
        }
    }

    @OriginalMember(owner = "client!kda", name = "finalize", descriptor = "()V", line = 83)
    protected final void finalize() throws Throwable {
        this.method2393(0);
        field5688++;
        super.finalize();
    }

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Ler;II)V", line = 91)
    public class356(class92 arg0, int arg1, int arg2) {
        this.field5685 = arg1 * arg2;
        this.field5687 = arg0;
        this.field5681 = this.field5687.field1285.createPbuffer(arg1, arg2);
    }

    @OriginalMember(owner = "client!kda", name = "g", descriptor = "(I)V", line = 106)
    public static void method2396(int arg0) {
        field5689 = null;
        if (arg0 < 77) {
            field5686 = null;
        }
        field5686 = null;
        field5682 = null;
        field5683 = null;
    }
}
