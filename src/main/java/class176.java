import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class176 extends class151 implements class416 {

    @OriginalMember(owner = "client!wn", name = "t", descriptor = "I")
    private int field2597;

    @OriginalMember(owner = "client!wn", name = "o", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!wn", name = "p", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!wn", name = "q", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!wn", name = "r", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!wn", name = "v", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!wn", name = "w", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!wn", name = "u", descriptor = "Lhw;")
    public static class395 field2598;

    @OriginalMember(owner = "client!wn", name = "s", descriptor = "Ljava/awt/Frame;")
    public static Frame field2596;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)I", line = 5)
    public final int method1199(int arg0) {
        ++field2592;
        if (arg0 != 30995) {
            this.method1093(-10);
        }
        return this.field2597;
    }

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "(I)V", line = 20)
    public final void method1093(int arg0) {
        super.field2298.method1599(34963, this);
        if (arg0 < 8) {
            this.field2597 = 27;
        }
        ++field2595;
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)J", line = 34)
    public final long method1200(int arg0) {
        if (arg0 != -21691) {
            method1202(-66);
        }
        ++field2594;
        return 0L;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(BII[B)V", line = 45)
    public final void method1201(byte arg0, int arg1, int arg2, byte[] arg3) {
        ++field2599;
        this.method1091(arg3, 1, arg2);
        if (arg0 < -8) {
            this.field2597 = arg1;
        }
    }

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "(I)V", line = 58)
    public static void method1202(int arg0) {
        field2598 = null;
        field2596 = null;
        int var1 = 87 % ((arg0 - -5) / 33);
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lvd;I[BIZ)V", line = 69)
    public class176(class258 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field2597 = arg1;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILok;)V", line = 78)
    public static final void method1203(int arg0, class74 arg1) {
        class171.field2517 = arg1;
        if (arg0 != 34963) {
            method1203(-38, (class74) null);
        }
        ++field2600;
    }

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "(I)I", line = 92)
    public final int method1204(int arg0) {
        ++field2593;
        if (arg0 != -1124) {
            method1202(22);
        }
        return super.field2296;
    }
}
