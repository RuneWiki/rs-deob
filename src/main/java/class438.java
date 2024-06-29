import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class438 {

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Ldda;")
    private class349 field6255;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "J")
    public long field6257;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "Lfca;")
    public static class75 field6259 = new class75(1);

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "[I")
    public static int[] field6260 = new int[3];

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "Lgda;")
    public static class50 field6262;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "[[[Z")
    public static boolean[][][] field6261;

    @OriginalMember(owner = "client!ka", name = "finalize", descriptor = "()V", line = 11)
    protected final void finalize() throws Throwable {
        field6256++;
        this.field6255.method1989(false, this.field6257);
        super.finalize();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V", line = 23)
    public static void method2616(byte arg0) {
        field6261 = null;
        field6260 = null;
        if (arg0 != -4) {
            method2616((byte) 110);
        }
        field6262 = null;
        field6259 = null;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Ldda;J[Lav;)V", line = 38)
    public class438(class349 arg0, long arg1, class591[] arg2) {
        this.field6255 = arg0;
        this.field6257 = arg1;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)I", line = 50)
    public static final int method2617(int arg0, int arg1) {
        return class16.field315 == null ? 0 : class16.field315[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)Z", line = 53)
    public static final boolean method2618(int arg0, int arg1, int arg2) {
        int var3 = 3 % ((-arg2 - 43) / 47);
        field6258++;
        return (arg1 & 0x20) != 0;
    }
}
