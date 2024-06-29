import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class457 {

    @OriginalMember(owner = "client!og", name = "c", descriptor = "[I")
    public static int[] field6298 = new int[2];

    @OriginalMember(owner = "client!og", name = "a", descriptor = "Z")
    public static boolean field6296 = false;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "Z")
    public static boolean field6301 = false;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "[I")
    public static int[] field6300 = new int[1000];

    @OriginalMember(owner = "client!og", name = "b", descriptor = "Ljp;")
    public static class236 field6297 = new class236(4);

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "[[I")
    public static int[][] field6299;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
    public static void method2605(byte arg0) {
        field6299 = null;
        field6298 = null;
        int var1 = 72 % ((arg0 - 66) / 49);
        field6300 = null;
        field6297 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZIII)V")
    public static final void method2606(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (class166.field2414 == 0) {
            class148.method1023(true, false);
        } else {
            class318.field4166 = class166.field2414;
            class258.method1562(0, (byte) 111);
        }
        field6302++;
        class240.field3208 = arg3;
        class191.field2687 = arg1;
        class105.field1543 = arg2;
        if (arg0 == 9834) {
            class6.method55(arg4);
        }
    }
}
