import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class191 extends class276 {

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public int field2970;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "I")
    public int field2976;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "[Z")
    public boolean[] field2969;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "[I")
    public int[] field2967;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "[I")
    public int[] field2973;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "[[I")
    public int[][] field2975;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "Lvv;")
    public static class313 field2966 = new class313(58, -1);

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "Z")
    public static boolean field2977 = false;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
    public static int field2974 = 0;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "Lqs;")
    public static class496 field2968;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIZIII)V")
    public static final void method1287(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class251.field4286 = arg0;
        class475.field7031 = arg1;
        if (arg6 != 128) {
            field2966 = null;
        }
        class423.field6386 = arg5;
        class49.field790 = arg4;
        field2965++;
        class318.field4998 = arg2;
        if (arg3 && class423.field6386 >= 100) {
            class48.field764 = class475.field7031 * 128 + 64;
            class473.field7021 = class49.field790 * 128 + 64;
            class130.field2234 = class81.method592(class473.field7021, class48.field764, arg6 ^ 0x24A3, class93.field1556) - class318.field4998;
        }
        class190.field2963 = 2;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZLhd;Lhd;ZII)I")
    public static final int method1288(int arg0, boolean arg1, class239 arg2, class239 arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 <= 55) {
            field2972 = -116;
        }
        field2971++;
        int var7 = class118.method941(arg3, arg1, arg2, arg6, 0);
        if (var7 != 0) {
            return arg1 ? -var7 : var7;
        } else if (arg5 == -1) {
            return 0;
        } else {
            int var8 = class118.method941(arg3, arg4, arg2, arg5, 0);
            return arg4 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static void method1289(int arg0) {
        field2968 = null;
        int var1 = -111 / ((arg0 + 4) / 49);
        field2966 = null;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(I[B)V")
    public class191(int arg0, byte[] arg1) {
        this.field2970 = arg0;
        class23 var3 = new class23(arg1);
        this.field2976 = var3.method126((byte) -101);
        this.field2969 = new boolean[this.field2976];
        this.field2967 = new int[this.field2976];
        this.field2973 = new int[this.field2976];
        this.field2975 = new int[this.field2976][];
        for (int var4 = 0; var4 < this.field2976; var4++) {
            this.field2967[var4] = var3.method126((byte) -87);
        }
        for (int var5 = 0; var5 < this.field2976; var5++) {
            this.field2969[var5] = var3.method126((byte) -81) == 1;
        }
        for (int var6 = 0; var6 < this.field2976; var6++) {
            this.field2973[var6] = var3.method132(119);
        }
        for (int var7 = 0; var7 < this.field2976; var7++) {
            this.field2975[var7] = new int[var3.method126((byte) -85)];
        }
        for (int var8 = 0; var8 < this.field2976; var8++) {
            for (int var9 = 0; var9 < this.field2975[var8].length; var9++) {
                this.field2975[var8][var9] = var3.method126((byte) -84);
            }
        }
    }
}
