import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class258 {

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "Z")
    public boolean field4423 = false;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public int field4426 = 0;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public int field4432 = 0;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field4422 = -1;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "[S")
    public static short[] field4424 = new short[] { 6, 20, 50, 30, 37, 35, 8, 13 };

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "[I")
    public static int[] field4430 = new int[4096];

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "Lwm;")
    public static class152 field4425 = class157.method1048("p11_full", 119);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "Lpj;")
    public class182 field4433;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field4428;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lah;I)V", line = 7)
    public static final void method1795(class205 arg0, int arg1) {
        field4421++;
        class77.field1089 = arg0;
        class297.field5076 = class77.field1089.method1375(4, arg1 ^ arg1);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)Ll;", line = 19)
    public static final class295 method1796(byte arg0) {
        int var1 = -127 / ((arg0 - 10) / 61);
        field4427++;
        return class140.field2122 < class262.field4456.length ? class262.field4456[class140.field2122++] : null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIII)V", line = 31)
    public static final void method1797(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var9 = arg4 + 1;
        class275.method1885(arg3, class179.field2843[arg4], arg1, arg0, -2611);
        if (arg5 != 35) {
            method1797(-39, 126, 23, 96, -72, 110);
        }
        int var8 = arg2 - 1;
        class275.method1885(arg3, class179.field2843[arg2], arg1, arg0, -2611);
        field4431++;
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class179.field2843[var6];
            var7[arg1] = var7[arg0] = arg3;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)V", line = 87)
    public static void method1798(byte arg0) {
        field4424 = null;
        field4430 = null;
        int var1 = -23 / ((60 - arg0) / 36);
        field4425 = null;
    }
}
