import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class396 {

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "Lwh;")
    private class148 field5940;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "J")
    public long field5944;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "[I")
    public static int[] field5943 = new int[2];

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "Lqe;")
    public static class469 field5939 = new class469(76, 0);

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "Lbh;")
    public static class37 field5945 = new class37("LOCAL", "", "local", 4);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
    public static int field5946;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "Lom;")
    public static class374 field5947;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public static final void method2527(int arg0, Canvas arg1) {
        field5941++;
        Dimension var2 = arg1.getSize();
        class74.method624(var2.width, var2.height, 46);
        if (class22.field234 == arg0) {
            class502.field7152.method417(arg1, class519.field7421, class589.field8349);
        } else {
            class502.field7152.method417(arg1, class443.field6590, class164.field2604);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public static void method2528(int arg0) {
        field5943 = null;
        field5939 = null;
        int var1 = -80 % ((arg0 - 68) / 36);
        field5945 = null;
        field5947 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIII)V")
    public static final void method2529(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5942++;
        if (arg0 != 2) {
            method2528(124);
        }
        if (class497.field7073 <= arg2 && class391.field5895 >= arg2) {
            int var5 = class462.method2818(class432.field6446, class166.field2622, arg4, 8373);
            int var6 = class462.method2818(class432.field6446, class166.field2622, arg1, 8373);
            class559.method3267(var5, var6, arg3, true, arg2);
        }
    }

    @OriginalMember(owner = "client!wj", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field5938++;
        this.field5940.method1077(this.field5944, (byte) -109);
        super.finalize();
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lwh;JI)V")
    public class396(class148 arg0, long arg1, int arg2) {
        this.field5940 = arg0;
        this.field5944 = arg1;
    }
}
