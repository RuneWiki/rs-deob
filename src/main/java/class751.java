import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public abstract class class751 {

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "[S")
    public static short[] field10498 = new short[256];

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "Lega;")
    public static class713 field10504 = new class713();

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    public int field10496;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    public static int field10497;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    public int field10500;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "I")
    public static int field10501;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "I")
    public static int field10502;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "I")
    public int field10503;

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
    public static int field10505;

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "I")
    public static int field10506;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "[S")
    public static short[] field10499;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)Z", line = 6)
    public final boolean method4189(byte arg0) {
        field10501++;
        if (arg0 >= -62) {
            method4191((byte) -118);
        }
        return (this.field10496 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)Z", line = 20)
    public final boolean method4190(int arg0) {
        field10506++;
        if (arg0 == 1) {
            return (this.field10496 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(B)V", line = 32)
    public static void method4191(byte arg0) {
        field10498 = null;
        field10504 = null;
        if (arg0 < 15) {
            method4191((byte) 1);
        }
        field10499 = null;
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(B)Z", line = 59)
    public final boolean method4192(byte arg0) {
        field10502++;
        if (arg0 == 53) {
            return (this.field10496 & 0x8) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)Z", line = 70)
    public final boolean method4193(int arg0) {
        field10505++;
        if (arg0 != 2014) {
            field10499 = null;
        }
        return (this.field10496 & 0x2) != 0;
    }
}
