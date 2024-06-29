import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class370 {

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "Ltn;")
    public static class80 field4996;

    @OriginalMember(owner = "client!jba", name = "e", descriptor = "[Lnga;")
    public static class480[] field4997;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)V")
    public static void method2177(int arg0) {
        if (arg0 != 0) {
            method2178(true, 8, -71, -53, -56, (byte) -92);
        }
        field4997 = null;
        field4996 = null;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(ZIIIIB)V")
    public static final void method2178(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (class216.field3087 != null && (arg3 != 3 || class344.field4718.field5462 != arg2 || class344.field4718.field5447 != arg4)) {
            class232.method1450(class216.field3087, class688.field9669, 3);
            class216.field3087 = null;
        }
        field4994++;
        if (arg3 == 3 && class216.field3087 == null) {
            class216.field3087 = class705.method3895(0, false, arg4, 0, arg2, class688.field9669);
            if (class216.field3087 != null) {
                class344.field4718.field5447 = arg4;
                class344.field4718.field5462 = arg2;
                class344.field4718.method1562(-102, class688.field9669);
            }
        }
        if (arg3 == 3 && class216.field3087 == null) {
            method2178(true, arg1, -1, class344.field4718.field5439, -1, (byte) 119);
            return;
        }
        Container var6;
        if (class216.field3087 != null) {
            class559.field7427 = arg2;
            var6 = class216.field3087;
            class164.field2569 = arg4;
        } else if (class490.field6611 == null) {
            if (class486.field6574 == null) {
                var6 = class619.field8207;
            } else {
                var6 = class486.field6574;
            }
            class559.field7427 = var6.getSize().width;
            class164.field2569 = var6.getSize().height;
        } else {
            Insets var7 = class490.field6611.getInsets();
            class559.field7427 = class490.field6611.getSize().width - var7.right - var7.left;
            class164.field2569 = class490.field6611.getSize().height - var7.bottom - var7.top;
            var6 = class490.field6611;
        }
        if (arg3 == 1) {
            class627.field8461 = class641.field8619;
            class149.field2387 = class305.field4229;
            class367.field4976 = (class559.field7427 - class641.field8619) / 2;
            class251.field3464 = 0;
        } else {
            class702.method3885((byte) -98);
        }
        if (class616.field8169 != class137.field2222) {
            boolean var10000;
            if (class627.field8461 < 1024 && class149.field2387 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg0) {
            class352.method2100(-2);
        } else {
            class443.field6072.setSize(class627.field8461, class149.field2387);
            class10.field197.method447(class443.field6072);
            if (class490.field6611 == var6) {
                Insets var8 = class490.field6611.getInsets();
                class443.field6072.setLocation(class367.field4976 + var8.left, class251.field3464 + var8.top);
            } else {
                class443.field6072.setLocation(class367.field4976, class251.field3464);
            }
        }
        if (arg3 < 2) {
            class31.field498 = false;
        } else {
            class31.field498 = true;
        }
        if (class251.field3463 != -1) {
            class476.method2670((byte) -40, true);
        }
        if (field4996 != null && class530.method2958(class32.field525, -91)) {
            class620.method3394((byte) 48);
        }
        int var9 = 82 / ((37 - arg5) / 53);
        for (int var10 = 0; var10 < 100; var10++) {
            class511.field6834[var10] = true;
        }
        class617.field8185 = true;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIIII)V")
    public static final void method2179(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 2) {
            return;
        }
        field4995++;
        if (arg1 < arg0) {
            class475.method2668(arg4, arg0, 7, class236.field3325[arg3], arg1);
        } else {
            class475.method2668(arg4, arg1, 7, class236.field3325[arg3], arg0);
        }
    }
}
