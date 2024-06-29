import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class435 {

    @OriginalMember(owner = "client!re", name = "a", descriptor = "J")
    public long field6111;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "Lih;")
    private class503 field6114;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "Z")
    public static boolean field6115 = false;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "Leh;")
    public static class246 field6116 = new class246(84, 6);

    @OriginalMember(owner = "client!re", name = "g", descriptor = "F")
    public static float field6117;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "F")
    public static float field6119;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "Lak;")
    public static class236 field6118;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
    public static final void method2561(byte arg0) {
        field6112++;
        class162.field2400 = new class28(8);
        class163.field2418 = 0;
        if (arg0 != 105) {
            method2561((byte) 7);
        }
        for (class351 var1 = (class351) class271.field4027.method2748(2); var1 != null; var1 = (class351) class271.field4027.method2751(-16195)) {
            var1.method2075();
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static void method2562(int arg0) {
        field6118 = null;
        if (arg0 != 8) {
            field6119 = -0.6592303F;
        }
        field6116 = null;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lih;J[Lkt;)V")
    public class435(class503 arg0, long arg1, class110[] arg2) {
        this.field6111 = arg1;
        this.field6114 = arg0;
    }

    @OriginalMember(owner = "client!re", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field6113++;
        this.field6114.method2946(true, this.field6111);
        super.finalize();
    }
}
