import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 {

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "[[I")
    public static int[][] field48 = new int[128][128];

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "J")
    public static long field50 = 0L;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "Ljw;")
    public static class581 field52 = new class581(25, 0);

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "[I")
    public static int[] field53 = new int[2];

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field54 = 0;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBI)Z")
    public static final boolean method35(int arg0, byte arg1, int arg2) {
        if (arg1 > -29) {
            method37((byte) 107, 27, 18);
        }
        field51++;
        return (class328.method2070(arg0, 113, arg2) | class577.method3217(arg0, arg2, 0) | class524.method3021(arg2, arg0, -66)) & class571.method3196(arg2, arg0, -32183);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(FFFI)I")
    public static final int method36(float arg0, float arg1, float arg2, int arg3) {
        field47++;
        if (arg3 != -12855) {
            method35(107, (byte) 55, 48);
        }
        float var4 = arg0 < 0.0F ? -arg0 : arg0;
        float var5 = arg1 < 0.0F ? -arg1 : arg1;
        float var6 = (arg2 < 0.0F) ? -arg2 : arg2;
        if (var4 < var5 && var5 > var6) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var6 > var4 && var5 < var6) {
            return arg2 > 0.0F ? 2 : 3;
        } else if ((arg0 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BII)Z")
    public static final boolean method37(byte arg0, int arg1, int arg2) {
        int var3 = 2 / ((-arg0 - 77) / 43);
        field49++;
        return (arg1 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public static void method38(byte arg0) {
        field48 = null;
        field52 = null;
        if (arg0 == -31) {
            field53 = null;
        }
    }
}
