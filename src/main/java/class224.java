import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class224 extends class42 {

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "S")
    public static short field3511 = 205;

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "B")
    public byte field3504;

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "I")
    public int field3509;

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "Lnn;")
    public class289 field3506;

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "[I")
    public static int[] field3505;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "[[[Lak;")
    public static class234[][][] field3513;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)[B")
    public final byte[] method259(int arg0) {
        ++field3512;
        if (!super.field582 && ~(this.field3506.field4408.length + -this.field3504) >= ~this.field3506.field4399) {
            int var2 = 64 / ((arg0 - 63) / 34);
            return this.field3506.field4408;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)V")
    public static void method1499(int arg0) {
        field3505 = null;
        field3513 = null;
        if (arg0 != 100) {
            method1499(-27);
        }
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)I")
    public final int method258(int arg0) {
        ++field3508;
        if (this.field3506 == null) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.method258(-14);
            }
            return this.field3506.field4399 * 100 / (this.field3506.field4408.length - this.field3504);
        }
    }
}
