import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class651 extends class63 {

    @OriginalMember(owner = "client!ab", name = "E", descriptor = "S")
    public static short field9201 = 32767;

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "Lqk;")
    public static class148 field9205 = new class148(108, -1);

    @OriginalMember(owner = "client!ab", name = "K", descriptor = "Lts;")
    public static class220 field9207 = new class220(8);

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "I")
    public static int field9209 = 0;

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "B")
    public byte field9203;

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "I")
    public static int field9200;

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "I")
    public static int field9202;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "I")
    public int field9204;

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "I")
    public static int field9208;

    @OriginalMember(owner = "client!ab", name = "J", descriptor = "J")
    public static long field9206;

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "Lvj;")
    public class26 field9199;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "(I)V", line = 3)
    public static void method3767(int arg0) {
        field9207 = null;
        if (arg0 != 0) {
            method3767(125);
        }
        field9205 = null;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)I", line = 22)
    public final int method404(byte arg0) {
        ++field9202;
        if (arg0 <= 50) {
            return -36;
        } else {
            return this.field9199 == null ? 0 : this.field9199.field330 * 100 / (this.field9199.field279.length + -this.field9203);
        }
    }

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "(I)[B", line = 43)
    public final byte[] method406(int arg0) {
        ++field9200;
        if (!super.field846 && ~(this.field9199.field279.length + -this.field9203) >= ~this.field9199.field330) {
            int var2 = 64 / ((arg0 - -80) / 45);
            return this.field9199.field279;
        } else {
            throw new RuntimeException();
        }
    }
}
