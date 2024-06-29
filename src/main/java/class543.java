import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class543 extends class370 {

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
    public static int field7184 = 0;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "F")
    private float field7178;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "F")
    private float field7188;

    @OriginalMember(owner = "client!lb", name = "D", descriptor = "F")
    public static float field7192;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field7177;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    private int field7179;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    private int field7181;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public static int field7182;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
    public static int field7185;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
    public static int field7186;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
    public static int field7187;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
    public static int field7190;

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "Lvm;")
    public static class687 field7191;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "Ljava/lang/String;")
    private String field7183;

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "Ljava/lang/String;")
    private String field7189;

    @OriginalMember(owner = "client!lb", name = "E", descriptor = "Ljava/lang/String;")
    private String field7193;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "[[B")
    public static byte[][] field7180;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)Ljava/lang/String;")
    public final String method3039(byte arg0) {
        if (arg0 >= -29) {
            field7180 = null;
        }
        ++field7182;
        return this.field7193;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)F")
    public final float method3040(int arg0) {
        ++field7187;
        return arg0 != 0 ? -0.24812438F : this.field7188;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public final void method1226(byte arg0) {
        ++field7177;
        if (arg0 >= -81) {
            field7184 = 101;
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class543(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
    public static void method3041(int arg0) {
        field7191 = null;
        field7180 = null;
        if (arg0 != -15626) {
            field7192 = 0.2581241F;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;Z)V")
    public final void method1225(OggPacket arg0, boolean arg1) {
        ++field7186;
        if (super.field5162 <= 0 || "SUB".equals(this.field7183)) {
            class677 var3 = new class677(arg0.getData());
            if (arg1) {
                this.field7183 = null;
            }
            int var4 = var3.method3821((byte) -125);
            if (super.field5162 > 8) {
                if (var4 == 0) {
                    long var5 = var3.method3830((byte) 13);
                    long var7 = var3.method3830((byte) 13);
                    long var9 = var3.method3830((byte) 13);
                    if (~var5 > -1L || ~var7 > -1L || var9 < 0L || ~var5 > ~var9) {
                        throw new IllegalStateException();
                    }
                    this.field7178 = (float) ((long) this.field7179 * var5) / (float) this.field7181;
                    this.field7188 = (float) ((var5 + var7) * (long) this.field7179) / (float) this.field7181;
                    int var11 = var3.method3800((byte) -127);
                    if (var11 < 0 || ~var11 < ~(var3.field9399.length + -var3.field9419)) {
                        throw new IllegalStateException();
                    }
                    this.field7193 = class99.method734(var3.field9399, var11, var3.field9419, 102);
                }
                if ((128 | var4) != 0) {
                    return;
                }
            } else {
                if (~(128 | var4) == -1) {
                    throw new IllegalStateException();
                }
                if (super.field5162 != 0) {
                    return;
                }
                var3.field9419 += 23;
                this.field7181 = var3.method3800((byte) -127);
                this.field7179 = var3.method3800((byte) -127);
                if (this.field7181 == 0 || this.field7179 == 0) {
                    throw new IllegalStateException();
                }
                class677 var12 = new class677(16);
                var3.method3801(var12.field9399, 0, 16, 122);
                this.field7189 = var12.method3793(15598);
                var12.field9419 = 0;
                var3.method3801(var12.field9399, 0, 16, 80);
                this.field7183 = var12.method3793(15598);
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(B)F")
    public final float method3042(byte arg0) {
        ++field7190;
        return arg0 <= 48 ? -0.81959575F : this.field7178;
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(Z)Ljava/lang/String;")
    public final String method3043(boolean arg0) {
        if (arg0) {
            field7192 = 0.5894859F;
        }
        ++field7185;
        return this.field7189;
    }
}
