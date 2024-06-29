import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class375 extends class264 {

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "J")
    public long field5480;

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "Z")
    public boolean field5478;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "I")
    public int field5474;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public int field5468;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "I")
    public int field5476;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "Ljava/lang/String;")
    public String field5477;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "Ljava/lang/String;")
    public String field5467;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public int field5469;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "Z")
    public boolean field5470;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    public static int field5472 = -1;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
    public static int field5473;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZZ)V", line = 10)
    public static final void method2374(int arg0, boolean arg1, boolean arg2) {
        if (arg0 != -1) {
            return;
        }
        if (arg2) {
            class282.field4148++;
            class274.method1869((byte) -21);
        }
        field5479++;
        if (arg1) {
            class252.field3710++;
            class393.method2470(-1);
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(ILct;)V", line = 34)
    public static final void method2375(int arg0, class104 arg1) {
        if (arg0 != -3394) {
            field5473 = -71;
        }
        class294.field4279 = arg1;
        field5475++;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIB)V", line = 57)
    public static final void method2376(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != -63) {
            field5473 = 62;
        }
        class63.field838 = arg1;
        class9.field128 = arg0;
        class146.field1978 = arg3;
        class248.field3659 = arg2;
        field5471++;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJIIZZ)V", line = 72)
    public class375(String arg0, String arg1, int arg2, int arg3, long arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.field5480 = arg4;
        this.field5478 = arg7;
        this.field5474 = arg2;
        this.field5468 = arg6;
        this.field5476 = arg5;
        this.field5477 = arg1;
        this.field5467 = arg0;
        this.field5469 = arg3;
        this.field5470 = arg8;
    }
}
