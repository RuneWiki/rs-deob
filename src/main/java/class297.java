import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class297 {

    @OriginalMember(owner = "client!am", name = "d", descriptor = "[[[I")
    public static int[][][] field4692 = new int[2][][];

    @OriginalMember(owner = "client!am", name = "c", descriptor = "[Luj;")
    public static class264[] field4691 = new class264[4];

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public static int field4694 = 0;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "[Z")
    public static boolean[] field4703 = new boolean[200];

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static volatile int field4696 = 0;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public int field4693;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "Leg;")
    public class18 field4702;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "Lph;")
    public static class203 field4700;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "[I")
    public int[] field4689;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(III)V")
    public static final void method1987(int arg0, int arg1, int arg2) {
        field4698++;
        if (arg2 != -1599927416) {
            return;
        }
        int var3 = class274.field4382 * arg1 >> 8;
        if (arg0 == -1 && !class178.field2968) {
            class148.method1090(1);
        } else if (arg0 != -1 && (class235.field3726 != arg0 || !class189.method1302((byte) -21)) && var3 != 0 && !class178.field2968) {
            class167.method1202(arg2 + 1599927417, 0, var3, false, arg0, class10.field134, 2);
        }
        class235.field3726 = arg0;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lig;I)Ldh;")
    public static final class148 method1988(class136 arg0, int arg1) {
        if (arg1 == -28306) {
            field4697++;
            return new class148(arg0.method1027((byte) 64), arg0.method1027((byte) 64), arg0.method1027((byte) 64), arg0.method1027((byte) 64), arg0.method1009(89), arg0.method1009(109), arg0.method1012(4));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
    public static final void method1989(int arg0) {
        field4690++;
        if (class256.field4081 == 5) {
            class256.field4081 = arg0;
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V")
    public static void method1990(int arg0) {
        field4692 = null;
        if (arg0 == 24866) {
            field4703 = null;
            field4691 = null;
            field4700 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V")
    public static final void method1991(byte arg0) {
        class128.field2119 = new class114[class71.field1183.method905(-1)][];
        field4699++;
        class285.field4548 = new boolean[class71.field1183.method905(-1)];
        if (arg0 >= -9) {
            field4703 = null;
        }
    }
}
