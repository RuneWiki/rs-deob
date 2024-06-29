import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class132 extends class21 {

    @OriginalMember(owner = "client!l", name = "X", descriptor = "I")
    public static int field2239 = 0;

    @OriginalMember(owner = "client!l", name = "R", descriptor = "I")
    public static int field2233 = -1;

    @OriginalMember(owner = "client!l", name = "N", descriptor = "I")
    private int field2229;

    @OriginalMember(owner = "client!l", name = "O", descriptor = "I")
    private int field2230;

    @OriginalMember(owner = "client!l", name = "P", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!l", name = "S", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!l", name = "T", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!l", name = "V", descriptor = "I")
    private int field2237;

    @OriginalMember(owner = "client!l", name = "W", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!l", name = "U", descriptor = "Loj;")
    public static class283 field2236;

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V", line = 14)
    public class132() {
        this(0);
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(I)V", line = 18)
    private class132(int arg0) {
        super(0, false);
        this.method868(-373719964, arg0);
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V", line = 28)
    public static void method867(int arg0) {
        if (arg0 == -1) {
            field2236 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(IB)[[I", line = 40)
    public final int[][] method175(int arg0, byte arg1) {
        if (arg1 <= 16) {
            return (int[][]) ((int[][]) null);
        }
        field2234++;
        int[][] var3 = this.field441.method220(arg0, 17433);
        if (this.field441.field532) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            for (int var7 = 0; var7 < class294.field4489; var7++) {
                var4[var7] = this.field2230;
                var6[var7] = this.field2237;
                var5[var7] = this.field2229;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IILag;)V", line = 82)
    public final void method178(int arg0, int arg1, class202 arg2) {
        if (arg0 != -318) {
            this.method178(-61, -92, (class202) null);
        }
        if (arg1 == 0) {
            this.method868(-373719964, arg2.method1352((byte) 117));
        }
        field2231++;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(II)V", line = 107)
    private final void method868(int arg0, int arg1) {
        this.field2237 = arg1 >> 4 & 0xFF0;
        if (arg0 == -373719964) {
            this.field2230 = (arg1 & 0xFF0000) >> 12;
            field2238++;
            this.field2229 = (arg1 & 0xFF) << 4;
        }
    }
}
