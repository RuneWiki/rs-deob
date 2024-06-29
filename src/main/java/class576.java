import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class576 {

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "Lpn;")
    public static class776 field7867 = new class776("WIP", 2);

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "Llja;")
    public static class744 field7870 = new class744(17, 16);

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "I")
    public static int field7868;

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "I")
    public static int field7871;

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "I")
    public static int field7872;

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "Ljava/lang/String;")
    public static String field7869;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V")
    public static final void method3329(int arg0) {
        field7872++;
        class118.field1503.method4295(class118.field1503.field10676, 1, false);
        class118.field1503.method4295(class118.field1503.field10632, 1, false);
        class118.field1503.method4295(class118.field1503.field10652, 2, false);
        class118.field1503.method4295(class118.field1503.field10650, 2, false);
        class118.field1503.method4295(class118.field1503.field10649, 1, false);
        class118.field1503.method4295(class118.field1503.field10677, 1, false);
        class118.field1503.method4295(class118.field1503.field10659, 1, false);
        class118.field1503.method4295(class118.field1503.field10660, 1, false);
        class118.field1503.method4295(class118.field1503.field10664, 1, false);
        if (arg0 != -10) {
            method3332(true);
        }
        class118.field1503.method4295(class118.field1503.field10641, 1, false);
        class118.field1503.method4295(class118.field1503.field10672, 1, false);
        class118.field1503.method4295(class118.field1503.field10628, 1, false);
        class118.field1503.method4295(class118.field1503.field10675, 0, false);
        class118.field1503.method4295(class118.field1503.field10657, 1, false);
        class118.field1503.method4295(class118.field1503.field10631, 0, false);
        class118.field1503.method4295(class118.field1503.field10648, 0, false);
        class118.field1503.method4295(class118.field1503.field10643, 1, false);
        class118.field1503.method4295(class118.field1503.field10658, 0, false);
        class118.field1503.method4295(class118.field1503.field10667, 0, false);
        class573.method3325(arg0 + 9);
        class118.field1503.method4295(class118.field1503.field10639, 1, false);
        class118.field1503.method4295(class118.field1503.field10647, 3, false);
        class725.method4110((byte) 114);
        class185.method1233(-24497);
        class723.field10141 = true;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lkq;I)V")
    public static final void method3330(class620 arg0, int arg1) {
        if (class287.field3446 == arg0.field8510) {
            class255.field2977[arg0.field8436] = true;
        }
        if (arg1 == -1) {
            field7868++;
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIILjava/lang/String;I)V")
    public static final void method3331(int arg0, int arg1, int arg2, String arg3, int arg4) {
        field7871++;
        class620 var5 = class481.method2859(arg1, arg2, 16383);
        if (var5 == null) {
            return;
        }
        if (var5.field8434 != null) {
            class529 var6 = new class529();
            var6.field7473 = var5;
            var6.field7476 = arg3;
            var6.field7479 = arg4;
            var6.field7477 = var5.field8434;
            class142.method1045(var6);
        }
        if (class289.field3493 != 10 || !client.method1882(var5).method2320(arg4 - 1, (byte) -91)) {
            return;
        }
        if (arg4 == 1) {
            class241.field2846++;
            class336 var7 = class512.method3076(class450.field6352, class591.field8030, (byte) 119);
            class502.method2993(arg1, var5.field8438, 2, arg2, var7);
            class578.method3334(4, var7);
        }
        if (arg4 == 2) {
            class669.field9187++;
            class336 var8 = class512.method3076(class424.field5626, class591.field8030, (byte) 74);
            class502.method2993(arg1, var5.field8438, arg0 ^ 0xFFFFFFFA, arg2, var8);
            class578.method3334(4, var8);
        }
        if (arg4 == 3) {
            class786.field10844++;
            class336 var9 = class512.method3076(class645.field8784, class591.field8030, (byte) 79);
            class502.method2993(arg1, var5.field8438, 2, arg2, var9);
            class578.method3334(4, var9);
        }
        if (arg4 == 4) {
            class776.field10712++;
            class336 var10 = class512.method3076(class66.field910, class591.field8030, (byte) 98);
            class502.method2993(arg1, var5.field8438, 2, arg2, var10);
            class578.method3334(4, var10);
        }
        if (arg4 == 5) {
            class404.field5325++;
            class336 var11 = class512.method3076(class700.field9703, class591.field8030, (byte) 72);
            class502.method2993(arg1, var5.field8438, 2, arg2, var11);
            class578.method3334(arg0 ^ 0xFFFFFFFC, var11);
        }
        if (arg4 == 6) {
            class449.field6106++;
            class336 var12 = class512.method3076(class285.field3329, class591.field8030, (byte) 65);
            class502.method2993(arg1, var5.field8438, 2, arg2, var12);
            class578.method3334(4, var12);
        }
        if (~arg4 == arg0) {
            class704.field9913++;
            class336 var13 = class512.method3076(class491.field6848, class591.field8030, (byte) 72);
            class502.method2993(arg1, var5.field8438, 2, arg2, var13);
            class578.method3334(arg0 ^ 0xFFFFFFFC, var13);
        }
        if (arg4 == 8) {
            class713.field10014++;
            class336 var14 = class512.method3076(class785.field10834, class591.field8030, (byte) 79);
            class502.method2993(arg1, var5.field8438, arg0 ^ 0xFFFFFFFA, arg2, var14);
            class578.method3334(arg0 + 12, var14);
        }
        if (arg4 == 9) {
            class602.field8136++;
            class336 var15 = class512.method3076(class629.field8597, class591.field8030, (byte) 102);
            class502.method2993(arg1, var5.field8438, 2, arg2, var15);
            class578.method3334(4, var15);
        }
        if (arg4 == 10) {
            class30.field465++;
            class336 var16 = class512.method3076(class536.field7546, class591.field8030, (byte) 90);
            class502.method2993(arg1, var5.field8438, 2, arg2, var16);
            class578.method3334(4, var16);
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Z)V")
    public static void method3332(boolean arg0) {
        field7870 = null;
        field7869 = null;
        if (!arg0) {
            method3329(6);
        }
        field7867 = null;
    }
}
