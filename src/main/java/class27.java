import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class27 extends class405 implements class170 {

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    private int field261;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lur;I[BI)V")
    public class27(class377 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field261 = arg1;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)J")
    public final long method163(int arg0) {
        if (arg0 != -242) {
            return -64L;
        } else {
            ++field259;
            return super.field5831.method2728();
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)I")
    public final int method164(int arg0) {
        ++field260;
        if (arg0 != 19781) {
            field264 = 36;
        }
        return this.field261;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)I")
    public static final int method165(int arg0) {
        ++field258;
        if ((double) class416.field5996 == 3.0D) {
            return 37;
        } else if ((double) class416.field5996 == 4.0D) {
            return 50;
        } else if ((double) class416.field5996 == 6.0D) {
            return 75;
        } else if ((double) class416.field5996 == 8.0D) {
            return 100;
        } else {
            if (arg0 != -19769) {
                field264 = -43;
            }
            return 200;
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lur;ILjaggl/memory/NativeBuffer;)V")
    public class27(class377 arg0, int arg1, NativeBuffer arg2) {
        super(arg0, arg2);
        this.field261 = arg1;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)I")
    public final int method166(boolean arg0) {
        if (arg0) {
            field264 = 63;
        }
        ++field263;
        return 0;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[BII)V")
    public final void method167(int arg0, byte[] arg1, int arg2, int arg3) {
        this.method2487(arg1, arg3);
        ++field262;
        this.field261 = arg2;
        if (arg0 != -2115) {
            this.method164(100);
        }
    }
}
