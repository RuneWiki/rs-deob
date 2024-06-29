import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class507 extends class153 {

    @OriginalMember(owner = "client!wn", name = "D", descriptor = "Lqp;")
    public static class466 field7463 = new class466("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!wn", name = "G", descriptor = "I")
    public static int field7466 = 0;

    @OriginalMember(owner = "client!wn", name = "H", descriptor = "[I")
    public static int[] field7467 = new int[13];

    @OriginalMember(owner = "client!wn", name = "B", descriptor = "I")
    public static int field7461;

    @OriginalMember(owner = "client!wn", name = "C", descriptor = "I")
    public static int field7462;

    @OriginalMember(owner = "client!wn", name = "E", descriptor = "I")
    public static int field7464;

    @OriginalMember(owner = "client!wn", name = "F", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(IIIIIF)V", line = 6)
    public class507(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IF)V", line = 9)
    public final void method1024(int arg0, float arg1) {
        ++field7462;
        if (arg0 == -2) {
            super.field2339 = arg1;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIB)V", line = 20)
    public final void method1028(int arg0, int arg1, int arg2, byte arg3) {
        ++field7465;
        super.field2350 = arg2;
        int var5 = 117 % ((8 - arg3) / 40);
        super.field2347 = arg0;
        super.field2340 = arg1;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIIII)V", line = 38)
    public static final void method3022(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7461;
        class371[] var7 = class218.field3046;
        for (int var8 = arg3; ~var7.length < ~var8; ++var8) {
            class371 var9 = var7[var8];
            if (var9 != null && var9.field5433 == 2) {
                class97.method713(var9.field5422, (byte) 121, arg1 >> 1, arg6, var9.field5423, arg0 >> 1, var9.field5424 * 2, arg2, var9.field5425);
                if (~class52.field637[0] < 0 && class441.field6516 % 20 < 10) {
                    class528.field7802[var9.field5435].method85(class52.field637[0] + arg5 + -12, arg4 - -class52.field637[1] + -28);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "(I)V", line = 69)
    public static void method3023(int arg0) {
        field7463 = null;
        field7467 = null;
        if (arg0 != -28) {
            method3022(65, -21, -29, 14, -83, 43, 92);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZI)Lru;", line = 82)
    public static final class128 method3024(int arg0, boolean arg1, int arg2) {
        if (arg2 != Integer.MIN_VALUE) {
            field7467 = null;
        }
        ++field7464;
        long var3 = (long) (arg0 | (!arg1 ? 0 : Integer.MIN_VALUE));
        return (class128) class423.field6197.method1492(var3, 6340);
    }
}
