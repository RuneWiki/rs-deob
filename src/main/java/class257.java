import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class257 extends InputStream {

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "Lkc;")
    public static class157 field3493 = new class157("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "[Lwh;")
    public static class420[] field3496 = new class420[14];

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field3494 = -2;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "F")
    public static float field3497;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1529(int arg0) {
        field3492++;
        if (arg0 == -1538950112) {
            class216.method1359();
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILbn;BI)J", line = 17)
    public static final long method1530(int arg0, class303 arg1, byte arg2, int arg3) {
        field3491++;
        if (arg2 <= 85) {
            field3494 = 126;
        }
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class103 var10 = class452.field6629.method603((byte) 107, arg1.method170((byte) 49));
        long var11 = (long) (arg0 | arg3 << 7 | arg1.method159(124) << 14 | arg1.method157((byte) -22) << 20 | 0x40000000);
        if (var10.field1697 == 0) {
            var11 |= var8;
        }
        if (var10.field1668 == 1) {
            var11 |= var4;
        }
        if (var10.field1643) {
            var11 |= var6;
        }
        return var11 | (long) arg1.method170((byte) 43) << 32;
    }

    @OriginalMember(owner = "client!vd", name = "read", descriptor = "()I", line = 49)
    public final int read() {
        field3490++;
        class334.method2047(30000L, 0);
        return -1;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V", line = 64)
    public static void method1531(int arg0) {
        if (arg0 < -83) {
            field3496 = null;
            field3493 = null;
        }
    }
}
