import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public abstract class class612 {

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "[I")
    public static int[] field8457 = new int[1000];

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "[I")
    public static int[] field8459 = new int[14];

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "F")
    public static float field8454;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field8453;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field8455;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field8456;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public int field8458;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field8460;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public static int field8461;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public int field8462;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public int field8464;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "Lclient;")
    public static client field8463;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    public static void method3343(int arg0) {
        if (arg0 != 11649) {
            field8457 = null;
        }
        field8457 = null;
        field8459 = null;
        field8463 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)Z")
    public final boolean method3344(boolean arg0) {
        field8455++;
        if (!arg0) {
            this.field8464 = -46;
        }
        return (this.field8458 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)Z")
    public final boolean method3345(int arg0) {
        int var2 = -43 % ((arg0 - 15) / 60);
        field8453++;
        return (this.field8458 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)Z")
    public final boolean method3346(int arg0) {
        int var2 = 40 % ((arg0 + 42) / 59);
        field8456++;
        return (this.field8458 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILkba;I)V")
    public static final void method3347(int arg0, class24 arg1, int arg2) {
        if (arg2 >= -62) {
            method3343(1);
        }
        field8461++;
        if (arg1.field408 == null) {
            return;
        }
        int var3 = arg1.field408[arg0 + 1];
        if (arg1.field376 == var3) {
            return;
        }
        arg1.field434 = arg1.field427;
        arg1.field385 = 1;
        arg1.field326 = 0;
        arg1.field346 = 0;
        arg1.field388 = 0;
        arg1.field376 = var3;
        if (arg1.field376 != -1) {
            class107.method729(arg1.field388, class646.field8903.method643(arg1.field376, -92), arg1, -4855);
            return;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)Z")
    public final boolean method3348(byte arg0) {
        field8460++;
        if (arg0 > -84) {
            this.method3348((byte) -12);
        }
        return (this.field8458 & 0x8) != 0;
    }
}
