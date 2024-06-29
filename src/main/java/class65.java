import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class65 {

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "B")
    private byte field961;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public int field962;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public int field960;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public int field963;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public int field965;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public int field957;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "Z")
    public static boolean field958 = false;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)I", line = 16)
    public final int method539(byte arg0) {
        field956++;
        if (arg0 != -87) {
            this.field957 = 116;
        }
        return this.field961 & 0x7;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)I", line = 28)
    public final int method540(int arg0) {
        if (arg0 <= 28) {
            this.method540(40);
        }
        field959++;
        return (this.field961 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V", line = 47)
    public class65() {
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lsb;)V", line = 49)
    public class65(class190 arg0) {
        this.field961 = arg0.method1322(9813);
        this.field962 = arg0.method1317((byte) 47);
        this.field960 = arg0.method1371(-4);
        this.field963 = arg0.method1371(-4);
        this.field965 = arg0.method1371(-4);
        this.field957 = arg0.method1371(-4);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([SI)[S", line = 63)
    public static final short[] method541(short[] arg0, int arg1) {
        field964++;
        if (arg0 == null) {
            return null;
        } else {
            short[] var2 = new short[arg0.length];
            class84.method686(arg0, 0, var2, arg1, arg0.length);
            return var2;
        }
    }
}
