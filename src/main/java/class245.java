import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class245 extends class235 {

    @OriginalMember(owner = "client!jl", name = "E", descriptor = "I")
    private int field4451 = -32768;

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "Lqk;")
    public static class207 field4445 = class24.method212(255, ":clan:");

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "I")
    public static int field4443 = 0;

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "Lqk;")
    private static class207 field4444 = class24.method212(255, "shake:");

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "Lqk;")
    public static class207 field4442 = field4444;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "Lqk;")
    public static class207 field4449 = class24.method212(255, ":duelstake:");

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "[I")
    public static int[] field4435 = new int[50];

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "Lqk;")
    public static class207 field4439 = class24.method212(255, "blinken2:");

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    public static int field4437 = 0;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "[Lml;")
    public static class287[] field4440 = new class287[14];

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "Lqk;")
    public static class207 field4448 = field4444;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "I")
    public int field4447;

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!jl", name = "G", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "I")
    public int field4453;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "()I")
    public final int method80() {
        field4452++;
        return this.field4451;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IILpk;ZII)V")
    public static final void method1723(int arg0, int arg1, class99 arg2, boolean arg3, int arg4, int arg5) {
        class138.field2386 = arg5;
        class92.field1636 = arg0;
        class288.field5147 = arg1;
        class78.field1417 = arg3;
        if (arg4 > -111) {
            method1726(-1);
        }
        class221.field4065 = 1;
        class88.field1597 = arg2;
        class165.field2924 = 10000;
        field4441++;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIII)V")
    public final void method81(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4438++;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)[Lob;")
    public static final class130[] method1724(byte arg0) {
        if (arg0 != 33) {
            return null;
        }
        field4436++;
        class130[] var1 = new class130[class280.field4928];
        for (int var2 = 0; var2 < class280.field4928; var2++) {
            var1[var2] = new class130(class242.field4406, class230.field4224, class287.field5127[var2], class170.field3021[var2], class107.field1895[var2], class241.field4402[var2], class185.field3286[var2], class243.field4421);
        }
        class116.method821((byte) -125);
        return var1;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIIIIJILe;)V")
    public final void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class64 arg10) {
        field4446++;
        class166 var13 = class117.method829(this.field4447, (byte) 58).method1238(0, -1, (class65) null, 14444, 0, this.field4453);
        if (var13 != null) {
            var13.method87(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field4451 = var13.method80();
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(IIIII)V")
    public static final void method1725(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4450++;
        for (int var5 = arg3; var5 < class110.field1930; var5++) {
            if (class68.field1209[var5] + class43.field852[var5] > arg4 && arg0 + arg4 > class43.field852[var5] && arg2 < class128.field2229[var5] + class111.field1941[var5] && (arg2 + arg1) > class111.field1941[var5]) {
                class140.field2431[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)V")
    public static void method1726(int arg0) {
        field4440 = null;
        field4449 = null;
        field4444 = null;
        field4442 = null;
        field4435 = null;
        field4448 = null;
        int var1 = -128 % ((7 - arg0) / 40);
        field4439 = null;
        field4445 = null;
    }
}
