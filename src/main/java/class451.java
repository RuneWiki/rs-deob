import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class451 {

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public int field6515 = -1;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "[I")
    public static int[] field6512 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "Laj;")
    public static class71 field6514 = new class71(64);

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "[I")
    public static int[] field6521 = new int[14];

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field6511;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field6513;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public static int field6517;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field6518;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "Ldd;")
    public class213 field6516;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "[I")
    public int[] field6519;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "[Ljava/lang/String;")
    public String[] field6520;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public static void method2805(int arg0) {
        int var1 = 46 % ((arg0 - 15) / 54);
        field6512 = null;
        field6514 = null;
        field6521 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2806(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 < -96) {
            field6511++;
            if (class15.method76(6, arg1)) {
                client.method1650(class291.field3949[arg1], -1, arg2, arg3, arg7, arg0, arg4, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lgd;III)J")
    public static final long method2807(class111 arg0, int arg1, int arg2, int arg3) {
        field6517++;
        int var4 = 66 / ((arg2 - 40) / 55);
        long var5 = 4194304L;
        long var7 = 2147483648L;
        long var9 = Long.MIN_VALUE;
        class372 var11 = class10.method53(arg0.method582((byte) 22), true);
        long var12 = (long) (arg0.method575(-15863) | 0x10000 << 14 | arg1 << 7 | arg3 | arg0.method580(24493) << 20);
        if (var11.field5204 == 0) {
            var12 |= var9;
        }
        if (var11.field5142 == 1) {
            var12 |= var5;
        }
        if (var11.field5159) {
            var12 |= var7;
        }
        return var12 | (long) arg0.method582((byte) 22) << 32;
    }
}
