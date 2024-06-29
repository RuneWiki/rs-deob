import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class11 extends class535 {

    @OriginalMember(owner = "client!vl", name = "M", descriptor = "Z")
    public static boolean field112 = false;

    @OriginalMember(owner = "client!vl", name = "N", descriptor = "Lqv;")
    public static class316 field113;

    @OriginalMember(owner = "client!vl", name = "F", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!vl", name = "G", descriptor = "I")
    private int field106;

    @OriginalMember(owner = "client!vl", name = "H", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!vl", name = "I", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!vl", name = "J", descriptor = "I")
    private int field109;

    @OriginalMember(owner = "client!vl", name = "K", descriptor = "I")
    private int field110;

    @OriginalMember(owner = "client!vl", name = "L", descriptor = "I")
    public static int field111;

    static {
        new class44("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
        field113 = new class316(37, 4);
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V", line = 3)
    public class11() {
        this(0);
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(II)V", line = 8)
    private final void method58(int arg0, int arg1) {
        this.field106 = (65280 & arg1) >> 4;
        this.field109 = arg1 << 4 & arg0;
        this.field110 = (16711680 & arg1) >> 12;
        ++field108;
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(I)V", line = 26)
    private class11(int arg0) {
        super(0, false);
        this.method58(4080, arg0);
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)V", line = 37)
    public static void method59(int arg0) {
        field113 = null;
        if (arg0 > -117) {
            field111 = -6;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILwn;I)V", line = 48)
    public final void method60(int arg0, class519 arg1, int arg2) {
        ++field105;
        if (~arg0 == -1) {
            this.method58(4080, arg1.method3040((byte) -3));
        }
        if (arg2 != -6232) {
            this.method60(-71, (class519) null, 63);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)[[I", line = 83)
    public final int[][] method61(int arg0, int arg1) {
        ++field107;
        int[][] var3 = super.field7879.method733(arg1, -16963);
        if (arg0 >= -116) {
            this.method60(-72, (class519) null, -63);
        }
        if (super.field7879.field1528) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class174.field2597; ++var7) {
                var4[var7] = this.field110;
                var5[var7] = this.field106;
                var6[var7] = this.field109;
            }
        }
        return var3;
    }
}
