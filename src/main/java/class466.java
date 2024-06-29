import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class466 {

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "Lda;")
    private class44 field6924;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "J")
    public long field6927;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "[I")
    public static int[] field6925 = new int[256];

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
    public static int field6928;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "[I")
    public static int[] field6931;

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "I")
    public static int field6932;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
    public static int field6926;

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "I")
    public static int field6930;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "Lno;")
    public static class499 field6929;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field6925[var0] = var1;
        }
        field6928 = 0;
        field6931 = new int[1];
        field6932 = 0;
    }

    @OriginalMember(owner = "client!rs", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() throws Throwable {
        this.field6924.method328(80, this.field6927);
        field6926++;
        super.finalize();
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V", line = 14)
    public static void method2794(int arg0) {
        field6929 = null;
        field6925 = null;
        if (arg0 != 31990) {
            method2794(63);
        }
        field6931 = null;
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lda;JI)V", line = 33)
    public class466(class44 arg0, long arg1, int arg2) {
        this.field6924 = arg0;
        this.field6927 = arg1;
    }
}
