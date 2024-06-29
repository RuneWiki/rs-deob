import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class736 implements class418 {

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "Ljava/lang/String;")
    private String field10194;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "Luu;")
    private class237 field10193;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    public static int field10189;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    public static int field10190;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public static int field10191;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
    public static int field10192;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "I")
    public static int field10195;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZ[S)[S")
    public static final short[] method4099(int arg0, boolean arg1, short[] arg2) {
        field10190++;
        if (arg1) {
            return null;
        } else {
            short[] var3 = new short[arg0];
            class245.method1652(arg2, 0, var3, 0, arg0);
            return var3;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)I")
    public static final int method4100(int arg0, int arg1) {
        field10191++;
        if (arg0 != 127) {
            method4099(89, true, null);
        }
        return arg1 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)V")
    public static final void method4101(int arg0) {
        class365.field5189.method3615((byte) 119);
        if (arg0 >= -42) {
            method4101(-125);
        }
        field10189++;
        class721.field10031 = 0;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)I")
    public final int method1338(byte arg0) {
        field10195++;
        if (arg0 >= -107) {
            this.field10194 = null;
        }
        return this.field10193.method1580(this.field10194, -1) ? 100 : this.field10193.method1603(this.field10194, (byte) -127);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)Lcca;")
    public final class464 method1337(int arg0) {
        field10192++;
        if (arg0 != 4790) {
            this.field10194 = null;
        }
        return class464.field6459;
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Luu;Ljava/lang/String;)V")
    public class736(class237 arg0, String arg1) {
        this.field10194 = arg1;
        this.field10193 = arg0;
    }
}
