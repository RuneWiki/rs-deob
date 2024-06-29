import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class468 extends class424 {

    @OriginalMember(owner = "client!vj", name = "E", descriptor = "B")
    public byte field6492 = 5;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "[I")
    public static int[] field6484 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!vj", name = "D", descriptor = "I")
    public static int field6491 = 0;

    @OriginalMember(owner = "client!vj", name = "G", descriptor = "Z")
    public static boolean field6494 = false;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "Lmga;")
    public static class739 field6485 = new class739(1, 4);

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "I")
    public int field6486;

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "I")
    public int field6487;

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "I")
    public int field6488;

    @OriginalMember(owner = "client!vj", name = "A", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "I")
    public static int field6490;

    @OriginalMember(owner = "client!vj", name = "F", descriptor = "I")
    public int field6493;

    @OriginalMember(owner = "client!vj", name = "I", descriptor = "I")
    public int field6496;

    @OriginalMember(owner = "client!vj", name = "J", descriptor = "I")
    public int field6497;

    @OriginalMember(owner = "client!vj", name = "H", descriptor = "Luu;")
    public static class303 field6495;

    @OriginalMember(owner = "client!vj", name = "K", descriptor = "Z")
    public boolean field6498;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V")
    public static void method2763(int arg0) {
        int var1 = 10 / ((arg0 + 8) / 43);
        field6495 = null;
        field6485 = null;
        field6484 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)V")
    public static final void method2764(int arg0, int arg1) {
        class653.field9062 = 3;
        field6489++;
        class526.field7210 = 100;
        class258.field3853 = -1;
        class354.field5196 = arg1;
        if (arg0 > -73) {
            field6495 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BIIII)V")
    public static final void method2765(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field6490++;
        if (arg0 >= -96) {
            field6491 = 56;
        }
        if (class523.field7178 <= arg2 && class495.field6845 >= arg2) {
            int var5 = class573.method3204(arg4, class174.field2335, 124915076, class751.field10402);
            int var6 = class573.method3204(arg3, class174.field2335, 124915076, class751.field10402);
            class652.method3633(var5, var6, 30, arg1, arg2);
        }
    }
}
