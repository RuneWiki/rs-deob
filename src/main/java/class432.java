import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class432 extends class389 {

    @OriginalMember(owner = "client!cp", name = "u", descriptor = "I")
    private int field6107;

    @OriginalMember(owner = "client!cp", name = "q", descriptor = "I")
    private int field6103;

    @OriginalMember(owner = "client!cp", name = "t", descriptor = "I")
    private int field6106;

    @OriginalMember(owner = "client!cp", name = "v", descriptor = "I")
    private int field6108;

    @OriginalMember(owner = "client!cp", name = "n", descriptor = "[Lwd;")
    public static class149[] field6100 = new class149[5];

    @OriginalMember(owner = "client!cp", name = "w", descriptor = "Lms;")
    public static class453 field6109;

    @OriginalMember(owner = "client!cp", name = "x", descriptor = "Laq;")
    public static class90 field6110;

    @OriginalMember(owner = "client!cp", name = "o", descriptor = "I")
    public static int field6101;

    @OriginalMember(owner = "client!cp", name = "p", descriptor = "I")
    public static int field6102;

    @OriginalMember(owner = "client!cp", name = "r", descriptor = "I")
    public static int field6104;

    @OriginalMember(owner = "client!cp", name = "s", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!cp", name = "A", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!cp", name = "y", descriptor = "Lnq;")
    public static class268 field6111;

    @OriginalMember(owner = "client!cp", name = "z", descriptor = "[S")
    public static short[] field6112;

    static {
        for (int var0 = 0; ~field6100.length < ~var0; ++var0) {
            field6100[var0] = new class149();
        }
        field6109 = null;
        field6110 = new class90();
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(III)V", line = 6)
    public final void method553(int arg0, int arg1, int arg2) {
        int var4 = 108 / ((arg0 - -24) / 35);
        ++field6102;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V", line = 16)
    public static void method2722(int arg0) {
        field6112 = null;
        field6110 = null;
        field6100 = null;
        field6111 = null;
        if (arg0 == 4218) {
            field6109 = null;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(III)V", line = 36)
    public final void method552(int arg0, int arg1, int arg2) {
        if (arg0 != 32546) {
            this.method552(-62, -39, -79);
        }
        ++field6113;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IZI)V", line = 46)
    public final void method554(int arg0, boolean arg1, int arg2) {
        ++field6104;
        int var4 = this.field6107 * arg2 >> 12;
        int var5 = this.field6106 * arg2 >> 12;
        int var6 = this.field6103 * arg0 >> 12;
        if (!arg1) {
            this.field6107 = -102;
        }
        int var7 = this.field6108 * arg0 >> 12;
        class314.method2029(var7, -93, super.field5582, var6, var4, var5);
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(IIIIII)V", line = 68)
    public class432(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field6107 = arg0;
        this.field6103 = arg1;
        this.field6106 = arg2;
        this.field6108 = arg3;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZLnq;BILnq;)V", line = 80)
    public static final void method2723(boolean arg0, class268 arg1, byte arg2, int arg3, class268 arg4) {
        class123.field1706 = arg4;
        class204.field2813 = arg1;
        ++field6105;
        class395.field5660 = arg0;
        class54.field756 = arg3;
        int var5 = -3 / ((20 - arg2) / 45);
    }
}
