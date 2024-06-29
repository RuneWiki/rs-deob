import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class214 extends class83 {

    @OriginalMember(owner = "client!vv", name = "m", descriptor = "I")
    private int field2748;

    @OriginalMember(owner = "client!vv", name = "r", descriptor = "I")
    private int field2753;

    @OriginalMember(owner = "client!vv", name = "n", descriptor = "I")
    private int field2749;

    @OriginalMember(owner = "client!vv", name = "l", descriptor = "I")
    private int field2747;

    @OriginalMember(owner = "client!vv", name = "p", descriptor = "Lkg;")
    public static class179 field2751 = new class179(20, 8);

    @OriginalMember(owner = "client!vv", name = "s", descriptor = "Lum;")
    public static class365 field2754 = new class365();

    @OriginalMember(owner = "client!vv", name = "t", descriptor = "I")
    public static int field2755 = 1403;

    @OriginalMember(owner = "client!vv", name = "j", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!vv", name = "k", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!vv", name = "o", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!vv", name = "q", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!vv", name = "u", descriptor = "[[B")
    public static byte[][] field2756;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(III)V")
    public final void method676(int arg0, int arg1, int arg2) {
        if (arg2 != 22742) {
            method1319((class47) null, false, -10, (String) null);
        }
        ++field2752;
        int var4 = this.field2748 * arg0 >> 12;
        int var5 = this.field2747 * arg0 >> 12;
        int var6 = this.field2749 * arg1 >> 12;
        int var7 = this.field2753 * arg1 >> 12;
        class178.method1139(super.field1048, super.field1044, var4, var7, var6, super.field1052, (byte) -83, var5);
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lqn;ZILjava/lang/String;)Lal;")
    public static final class66 method1319(class47 arg0, boolean arg1, int arg2, String arg3) {
        ++field2746;
        if (arg2 > -86) {
            field2755 = 51;
        }
        int var4 = arg0.method488(arg3, 105);
        if (var4 == -1) {
            return new class66(0);
        } else {
            int[] var5 = arg0.method456(var4, (byte) -123);
            class66 var6 = new class66(var5.length);
            int var7 = 0;
            int var8 = 0;
            while (true) {
                while (var7 < var6.field855) {
                    class463 var9 = new class463(arg0.method481(var4, var5[var8++], -115));
                    int var10 = var9.method2727(-93);
                    int var11 = var9.method2758((byte) 77);
                    int var12 = var9.method2737(false);
                    if (!arg1 && ~var12 == -2) {
                        --var6.field855;
                    } else {
                        var6.field851[var7] = var10;
                        var6.field856[var7] = var11;
                        ++var7;
                    }
                }
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(III)V")
    public final void method678(int arg0, int arg1, int arg2) {
        ++field2750;
        int var4 = this.field2748 * arg0 >> 12;
        int var5 = this.field2747 * arg0 >> 12;
        int var6 = this.field2749 * arg1 >> 12;
        int var7 = this.field2753 * arg1 >> 12;
        class506.method3037(super.field1048, var6, var5, var4, 107, var7);
        if (arg2 != 0) {
            method1319((class47) null, true, 93, (String) null);
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(IZI)V")
    public final void method679(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method1319((class47) null, true, 98, (String) null);
        }
        ++field2745;
        int var4 = this.field2748 * arg0 >> 12;
        int var5 = this.field2747 * arg0 >> 12;
        int var6 = this.field2749 * arg2 >> 12;
        int var7 = this.field2753 * arg2 >> 12;
        class306.method1795(var7, var6, super.field1044, var5, 5505, super.field1052, var4);
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(IIIIIII)V")
    public class214(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2748 = arg0;
        this.field2753 = arg3;
        this.field2749 = arg1;
        this.field2747 = arg2;
    }

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(I)V")
    public static void method1320(int arg0) {
        field2751 = null;
        if (arg0 >= 76) {
            field2754 = null;
            field2756 = null;
        }
    }
}
