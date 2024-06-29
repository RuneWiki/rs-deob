import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class137 {

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public int field2472 = 0;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public int field2474 = 0;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Z")
    public boolean field2475 = false;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Lmk;")
    public class288 field2470;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field2473;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "[I")
    public static int[] field2471;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZLgf;I)Lud;", line = 9)
    public static final class279 method1063(boolean arg0, class8 arg1, int arg2) {
        if (arg0) {
            method1066(48, 28, (class149) null, 114);
        }
        field2469++;
        if (!client.method1798(arg1).method1756(arg2, -89) && arg1.field233 == null) {
            return null;
        } else if (arg1.field273 == null || arg2 >= arg1.field273.length || arg1.field273[arg2] == null || arg1.field273[arg2].method2006((byte) 112).method1984(8) == 0) {
            return class205.field3641 ? class115.method929(new class279[] { class205.field3644, class191.method1447(5, arg2) }, (byte) 60) : null;
        } else {
            return arg1.field273[arg2];
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V", line = 37)
    public static void method1064(int arg0) {
        if (arg0 != 0) {
            field2471 = (int[]) null;
        }
        field2471 = null;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V", line = 47)
    public static final void method1065(int arg0) {
        field2477++;
        class8.field155.method1338((byte) -101);
        class169.field3058.method1338((byte) -95);
        if (arg0 >= -61) {
            method1065(-53);
        }
        class283.field5052.method1338((byte) -99);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILok;I)Z", line = 73)
    public static final boolean method1066(int arg0, int arg1, class149 arg2, int arg3) {
        field2476++;
        byte[] var4 = arg2.method1192(arg1 ^ arg1, arg3, arg0);
        if (var4 == null) {
            return false;
        } else {
            class304.method2152((byte) -56, var4);
            return true;
        }
    }
}
