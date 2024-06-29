import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class179 extends class4 {

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "Z")
    public boolean field2674 = false;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
    private int field2682 = -1;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "I")
    private int field2681 = -32768;

    @OriginalMember(owner = "client!vj", name = "D", descriptor = "I")
    private int field2691 = 0;

    @OriginalMember(owner = "client!vj", name = "A", descriptor = "I")
    private int field2688 = 0;

    @OriginalMember(owner = "client!vj", name = "E", descriptor = "Z")
    private boolean field2692 = false;

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "I")
    public int field2687;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public int field2675;

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "I")
    private int field2686;

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "I")
    public int field2690;

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "I")
    public int field2685;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public int field2670;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "Loe;")
    private class76 field2676;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
    public static int field2680 = 0;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!vj", name = "B", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "Llc;")
    public static class270 field2671;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "Lui;")
    private class88 field2683;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZI)V")
    public final void method1268(boolean arg0, int arg1) {
        field2673++;
        if (this.field2674) {
            return;
        }
        this.field2688 += arg1;
        while (this.field2676.field1194[this.field2691] < this.field2688) {
            this.field2688 -= this.field2676.field1194[this.field2691];
            this.field2691++;
            if (this.field2676.field1191.length <= this.field2691) {
                this.field2674 = true;
                break;
            }
        }
        if (!this.field2674) {
            class32.method208(this.field2670, this.field2691, arg0, false, this.field2675, this.field2676);
        }
        if (!arg0) {
            this.method16(-108, -11, 37, -39, -13, 59, -77, 15, -13L, -101, (class88) null);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "()I")
    public final int method17() {
        field2678++;
        return this.field2681;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)Lmg;")
    private final class58 method1269(int arg0) {
        field2672++;
        int var2 = 106 / ((arg0 - 44) / 40);
        class120 var3 = class152.method1126(this.field2686, (byte) -1);
        class58 var4;
        if (this.field2674) {
            var4 = var3.method895(0, -1, (byte) -91, -1);
        } else {
            var4 = var3.method895(this.field2688, this.field2682, (byte) -113, this.field2691);
        }
        return var4 == null ? null : var4;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lmg;B)V")
    private final void method1270(class58 arg0, byte arg1) {
        class257 var3 = (class257) arg0;
        if ((this.field2683 == null || this.field2683.field1407) && (var3.field3885 != null || var3.field3909 != null)) {
            this.field2683 = new class88(class199.field2930, 1, 1);
        }
        if (this.field2683 != null) {
            this.field2683.method660(var3.field3885, var3.field3909, false, var3.field3896, var3.field3888, var3.field3899);
        }
        if (arg1 < -119) {
            this.field2692 = true;
            field2684++;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIII)V")
    public final void method15(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2689++;
        if (!this.field2692) {
            class58 var6 = this.method1269(-39);
            if (var6 == null) {
                return;
            }
            this.method1270(var6, (byte) -128);
        }
        if (this.field2683 != null) {
            this.field2683.method650(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIIIIJILui;)V")
    public final void method16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class88 arg10) {
        field2679++;
        class58 var13 = this.method1269(-75);
        if (var13 != null) {
            this.method1270(var13, (byte) -121);
            var13.method16(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2683);
            this.field2681 = var13.method17();
        }
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V")
    public static void method1271(int arg0) {
        if (arg0 == -1) {
            field2671 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(IIIIIII)V")
    public class179(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2687 = arg5 + arg6;
        this.field2675 = arg3;
        this.field2686 = arg0;
        this.field2690 = arg1;
        this.field2685 = arg4;
        this.field2670 = arg2;
        int var8 = class152.method1126(this.field2686, (byte) -1).field1944;
        if (var8 == -1) {
            this.field2674 = true;
        } else {
            this.field2674 = false;
            this.field2676 = class232.method1609((byte) -32, var8);
        }
        if (this.field2687 == arg6) {
            class32.method208(this.field2670, this.field2691, true, false, this.field2675, this.field2676);
        }
    }
}
