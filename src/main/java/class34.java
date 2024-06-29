import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class34 {

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "Lak;")
    public static class128 field600 = new class128(0, 0);

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "Lmb;")
    private static class96 field602 = class243.method1708("flash1:", (byte) 118);

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "Lmb;")
    public static class96 field603 = field602;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "Lmb;")
    public static class96 field601 = field602;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "Luc;")
    public static class11 field604 = new class11(50);

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "Ldf;")
    public static class146 field606 = new class146(8);

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "[[I")
    public static int[][] field605;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)V")
    public static void method259(boolean arg0) {
        field602 = null;
        if (arg0) {
            field606 = null;
        }
        field605 = null;
        field600 = null;
        field606 = null;
        field603 = null;
        field601 = null;
        field604 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)V")
    public static final void method260(int arg0, int arg1) {
        if (arg1 != -4) {
            field601 = null;
        }
        class210 var2 = class194.field3345;
        synchronized (class194.field3345) {
            class55.field949 = arg0;
        }
        field598++;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lw;IIII)V")
    public static final void method261(class107 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != -19078) {
            field604 = null;
        }
        field597++;
        if (class159.field2803 >= 3) {
            class84.method611(arg3, arg1, 0, arg0.field1891, arg0.field1973);
        } else {
            ((class174) class144.field2568).method1054(arg3, arg1, arg0.field1856, arg0.field1919, class144.field2568.field4266 / 2, class144.field2568.field4271 / 2, class235.field4033, 256, arg0.field1891, arg0.field1973);
        }
        class19.field317[arg2] = true;
    }
}
