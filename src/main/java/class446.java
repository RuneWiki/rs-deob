import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class446 {

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "Lad;")
    private class669 field6449;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "J")
    public long field6453;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "[S")
    public static short[] field6455 = new short[256];

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "Leda;")
    public static class116 field6454 = new class116(6, 7);

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public static int field6456 = 0;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field6450;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field6451;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field6452;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)I", line = 8)
    public static final int method2602(int arg0, int arg1, int arg2) {
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        field6452++;
        if (var3 < arg2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V", line = 27)
    public static void method2603(int arg0) {
        if (arg0 != 28330) {
            field6454 = null;
        }
        field6454 = null;
        field6455 = null;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)I", line = 39)
    public static final int method2604(int arg0) {
        field6451++;
        if (arg0 < 75) {
            field6456 = -51;
        }
        return 16;
    }

    @OriginalMember(owner = "client!sk", name = "finalize", descriptor = "()V", line = 51)
    protected final void finalize() throws Throwable {
        this.field6449.method3775(this.field6453, -1);
        field6450++;
        super.finalize();
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lad;JI)V", line = 59)
    public class446(class669 arg0, long arg1, int arg2) {
        this.field6449 = arg0;
        this.field6453 = arg1;
    }
}
