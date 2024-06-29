import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class579 extends class691 implements class129 {

    @OriginalMember(owner = "client!lq", name = "z", descriptor = "I")
    public static int field7884 = 0;

    @OriginalMember(owner = "client!lq", name = "x", descriptor = "B")
    private byte field7882;

    @OriginalMember(owner = "client!lq", name = "y", descriptor = "I")
    public static int field7883;

    @OriginalMember(owner = "client!lq", name = "A", descriptor = "I")
    public static int field7885;

    @OriginalMember(owner = "client!lq", name = "B", descriptor = "I")
    public static int field7886;

    @OriginalMember(owner = "client!lq", name = "C", descriptor = "I")
    public static int field7887;

    @OriginalMember(owner = "client!lq", name = "E", descriptor = "I")
    public static int field7888;

    @OriginalMember(owner = "client!lq", name = "F", descriptor = "I")
    public static int field7889;

    @OriginalMember(owner = "client!lq", name = "H", descriptor = "I")
    public static int field7890;

    @OriginalMember(owner = "client!lq", name = "I", descriptor = "I")
    public static int field7891;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IB)I", line = 3)
    public static final int method3337(int arg0, byte arg1) {
        int var2 = 104 / ((-58 - arg1) / 56);
        ++field7885;
        return arg0 & 127;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)I", line = 15)
    public final int method276(byte arg0) {
        ++field7890;
        int var2 = 74 % ((87 - arg0) / 35);
        return super.method276((byte) 126);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Ljaclib/memory/Source;IBI)Z", line = 25)
    public final boolean method272(Source arg0, int arg1, byte arg2, int arg3) {
        this.field7882 = (byte) arg3;
        ++field7887;
        super.method3861(14926, arg1, arg0);
        if (arg2 != 34) {
            field7884 = -82;
        }
        return true;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IBI)Z", line = 40)
    public final boolean method273(int arg0, byte arg1, int arg2) {
        ++field7883;
        this.field7882 = (byte) arg2;
        super.method2529(106, arg0);
        return arg1 == 125;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;", line = 59)
    public final Buffer method271(boolean arg0, byte arg1) {
        int var3 = -37 % ((arg1 - -66) / 48);
        ++field7891;
        return super.method3857(super.field9410.field5885, arg0, 124);
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)V", line = 75)
    public final void method274(byte arg0) {
        super.method274((byte) 95);
        ++field7889;
        int var2 = -103 % ((-40 - arg0) / 36);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)Z", line = 86)
    public final boolean method275(int arg0) {
        if (arg0 != 22022) {
            method3337(-112, (byte) -32);
        }
        ++field7886;
        return super.method3863((byte) -40, super.field9410.field5885);
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(B)I", line = 101)
    public final int method3338(byte arg0) {
        ++field7888;
        if (arg0 < 33) {
            this.method276((byte) -33);
        }
        return this.field7882;
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lnv;Z)V", line = 114)
    public class579(class439 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }
}
