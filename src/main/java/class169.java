import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class169 {

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public int field2620 = 0;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    public int field2632 = 0;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "Lrp;")
    private class288 field2623 = new class288(64);

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "Lhm;")
    private class140 field2633 = null;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "Llt;")
    private class458 field2624;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "Llt;")
    private class458 field2627;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "[Z")
    public static boolean[] field2628 = new boolean[5];

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "Lwa;")
    public static class418 field2626 = new class418("WIP", 2);

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2630 = new CRC32();

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lhi;I[IJ)Ljava/lang/String;", line = 8)
    public final String method1061(class131 arg0, int arg1, int[] arg2, long arg3) {
        if (arg1 < 87) {
            this.method1061(null, 10, null, 27L);
        }
        field2621++;
        if (this.field2633 != null) {
            String var6 = this.field2633.method932(arg3, arg0, arg2, 0);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg3);
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(ILlt;Llt;Lhm;)V", line = 223)
    public class169(int arg0, class458 arg1, class458 arg2, class140 arg3) {
        this.field2633 = arg3;
        this.field2624 = arg2;
        this.field2627 = arg1;
        if (this.field2627 != null) {
            this.field2632 = this.field2627.method2726((byte) 113, 1);
        }
        if (this.field2624 != null) {
            this.field2620 = this.field2624.method2726((byte) 113, 1);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIIIII)Z", line = 33)
    public static final boolean method1062(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2625++;
        if (arg7 < (arg0 + arg5) && arg2 + arg7 > arg5) {
            if (arg1 != 21264) {
                method1062(-55, 75, 109, 47, -38, -22, -10, -34, -123);
            }
            return arg4 + arg6 > arg3 && (arg3 + arg8) > arg6;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)Ldq;", line = 52)
    public final class472 method1063(int arg0, int arg1) {
        field2622++;
        class472 var3 = (class472) this.field2623.method1752(arg0, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 >= 32768) {
            var4 = this.field2624.method2715(arg1 & 0x7FFF, 1, false);
        } else {
            var4 = this.field2627.method2715(arg1, 1, false);
        }
        class472 var5 = new class472();
        var5.field7217 = this;
        if (var4 != null) {
            var5.method2841(new class40(var4), 0);
        }
        if (arg1 >= 32768) {
            var5.method2836(200);
        }
        this.field2623.method1758(1, var5, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 85)
    public static final void method1064(String arg0, byte arg1) {
        field2629++;
        int var2 = 39 / ((56 - arg1) / 36);
        if (arg0 == null) {
            return;
        }
        if (!(class7.field79 < 100 || class137.field2256) || class7.field79 >= 200) {
            class499.method3000((byte) -48, class326.field4883.method2473(class406.field5898, -114));
            return;
        }
        String var3 = class290.method1768(arg0, false);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class7.field79; var4++) {
            String var8 = class290.method1768(class51.field767[var4], false);
            if (var8 != null && var8.equals(var3)) {
                class499.method3000((byte) -48, arg0 + class244.field3670.method2473(class406.field5898, -103));
                return;
            }
            if (class472.field7212[var4] != null) {
                String var9 = class290.method1768(class472.field7212[var4], false);
                if (var9 != null && var9.equals(var3)) {
                    class499.method3000((byte) -48, arg0 + class244.field3670.method2473(class406.field5898, -74));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class170.field2651; var5++) {
            String var6 = class290.method1768(class107.field1868[var5], false);
            if (var6 != null && var6.equals(var3)) {
                class499.method3000((byte) -48, class196.field3098.method2473(class406.field5898, -87) + arg0 + class392.field5738.method2473(class406.field5898, -105));
                return;
            }
            if (class178.field2791[var5] != null) {
                String var7 = class290.method1768(class178.field2791[var5], false);
                if (var7 != null && var7.equals(var3)) {
                    class499.method3000((byte) -48, class196.field3098.method2473(class406.field5898, -93) + arg0 + class392.field5738.method2473(class406.field5898, -89));
                    return;
                }
            }
        }
        if (class290.method1768(class286.field4329.field685, false).equals(var3)) {
            class499.method3000((byte) -48, class232.field3519.method2473(class406.field5898, -106));
        } else {
            class400.method2379((byte) -75, class269.field4066);
            class326.field4900++;
            class230.field3508.method221(-1, class220.method1343(arg0, (byte) -82));
            class230.field3508.method240(arg0, 127);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V", line = 188)
    public static void method1065(int arg0) {
        field2626 = null;
        field2628 = null;
        if (arg0 != 20970) {
            field2630 = null;
        }
        field2630 = null;
    }
}
