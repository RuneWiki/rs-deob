import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class497 {

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "Lml;")
    public class408 field6949 = new class408();

    @OriginalMember(owner = "client!maa", name = "j", descriptor = "Z")
    public boolean field6956 = false;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "[[I")
    public static int[][] field6947 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!maa", name = "d", descriptor = "Z")
    public static boolean field6950 = false;

    @OriginalMember(owner = "client!maa", name = "i", descriptor = "S")
    public static short field6955 = 1;

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "I")
    public static int field6948;

    @OriginalMember(owner = "client!maa", name = "e", descriptor = "I")
    public static int field6951;

    @OriginalMember(owner = "client!maa", name = "f", descriptor = "I")
    public static int field6952;

    @OriginalMember(owner = "client!maa", name = "g", descriptor = "I")
    public static int field6953;

    @OriginalMember(owner = "client!maa", name = "k", descriptor = "I")
    public static int field6957;

    @OriginalMember(owner = "client!maa", name = "h", descriptor = "Lbt;")
    public static class48 field6954;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)V", line = 3)
    public final void method2935(int arg0) {
        field6952++;
        if (arg0 > -79) {
            field6951 = -116;
        }
        while (true) {
            class35 var2 = (class35) this.field6949.method2440(-44);
            if (var2 == null) {
                return;
            }
            var2.method892(50560);
            class548.method3224(var2, false);
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(Lrk;I)V", line = 24)
    public final void method2936(class35 arg0, int arg1) {
        field6953++;
        if (arg1 != 6) {
            return;
        }
        class61 var3 = arg0.field535;
        boolean var4 = true;
        class265[] var5 = arg0.field537;
        for (int var6 = 0; var6 < var5.length; var6++) {
            if (var5[var6].field3137) {
                var4 = false;
                break;
            }
        }
        if (var4) {
            return;
        }
        if (this.field6956) {
            for (class35 var7 = (class35) this.field6949.method2447(-101); var7 != null; var7 = (class35) this.field6949.method2439(-120)) {
                if (var7.field535 == var3) {
                    var7.method892(arg1 ^ 0xC586);
                    class548.method3224(var7, false);
                }
            }
        }
        for (class35 var8 = (class35) this.field6949.method2447(-125); var8 != null; var8 = (class35) this.field6949.method2439(-90)) {
            if (var8.field535.field816 <= var3.field816) {
                class81.method767(arg0, var8, arg1 ^ 0xFFFFFF89);
                return;
            }
        }
        this.field6949.method2444(11586, arg0);
    }

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Z)V", line = 156)
    public class497(boolean arg0) {
        this.field6956 = arg0;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(B)V", line = 101)
    public static void method2937(byte arg0) {
        field6947 = null;
        field6954 = null;
        if (arg0 <= 111) {
            field6947 = null;
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "([II[Ljava/lang/Object;)V", line = 117)
    public static final void method2938(int[] arg0, int arg1, Object[] arg2) {
        class227.method1398(arg0.length - 1, -61, arg1, arg2, arg0);
        field6948++;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(BIIZ)I", line = 127)
    public static final int method2939(byte arg0, int arg1, int arg2, boolean arg3) {
        field6957++;
        if (arg0 < 126) {
            method2938(null, -126, null);
        }
        class430 var4 = class105.method861(arg2, Integer.MIN_VALUE, arg3);
        if (var4 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var4.field5667.length) {
            return var4.field5667[arg1];
        } else {
            return 0;
        }
    }
}
