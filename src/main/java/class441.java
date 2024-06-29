import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public abstract class class441 {

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "S")
    public static short field6321 = 1;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "[[I")
    public static int[][] field6326 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "F")
    public static float field6333 = 0.0F;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field6320;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field6322;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public int field6323;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field6324;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field6325;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public int field6330;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public int field6331;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "Lrp;")
    public static class250 field6327;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "Lji;")
    public static class365 field6334;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "[Llq;")
    public static class329[] field6328;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)Z", line = 3)
    public final boolean method2750(boolean arg0) {
        field6324++;
        if (arg0) {
            this.field6331 = 3;
        }
        return (this.field6330 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)Z", line = 23)
    public final boolean method2751(int arg0) {
        field6322++;
        if (arg0 != 0) {
            field6327 = null;
        }
        return (this.field6330 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)Z", line = 34)
    public final boolean method2752(int arg0) {
        field6325++;
        if (arg0 != -1959) {
            this.method2750(true);
        }
        return (this.field6330 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BI)V", line = 45)
    public static final void method2753(byte arg0, int arg1) {
        class237 var2 = class5.field84;
        synchronized (class5.field84) {
            class5.field84.method1629(arg1, 56);
        }
        int var3 = 105 % ((arg0 + 36) / 47);
        field6332++;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lon;II)I", line = 67)
    public static final int method2754(class184 arg0, int arg1, int arg2) {
        field6329++;
        int var3 = 96 % ((-arg1 - 87) / 37);
        if (!client.method1121(arg0).method1854(arg2, false) && arg0.field2589 == null) {
            return -1;
        } else if (arg0.field2663 == null || arg2 >= arg0.field2663.length) {
            return -1;
        } else {
            return arg0.field2663[arg2];
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)Z", line = 89)
    public final boolean method2755(byte arg0) {
        if (arg0 <= 2) {
            return true;
        } else {
            field6320++;
            return (this.field6330 & 0x8) != 0;
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(Z)V", line = 105)
    public static void method2756(boolean arg0) {
        field6327 = null;
        field6328 = null;
        if (!arg0) {
            field6328 = null;
        }
        field6334 = null;
        field6326 = null;
    }
}
