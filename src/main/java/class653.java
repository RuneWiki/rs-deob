import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class653 extends class740 implements class545 {

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "I")
    public static int field9315 = 0;

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "Lpfa;")
    public static class295 field9319 = new class295(16);

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "B")
    private byte field9323;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
    public static int field9313;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "I")
    public static int field9314;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "I")
    public static int field9316;

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "I")
    public static int field9317;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "I")
    public static int field9318;

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "I")
    public static int field9320;

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "I")
    public static int field9321;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "I")
    public static int field9322;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)I")
    public final int method265(boolean arg0) {
        ++field9318;
        if (!arg0) {
            this.method265(true);
        }
        return super.method265(true);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)Z")
    public final boolean method3110(int arg0, int arg1, int arg2) {
        if (arg0 != 2501) {
            field9319 = null;
        }
        this.field9323 = (byte) arg1;
        ++field9317;
        super.method267(30903, arg2);
        return true;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)I")
    public final int method3704(byte arg0) {
        if (arg0 != -128) {
            field9315 = -85;
        }
        ++field9322;
        return this.field9323;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BII)V")
    public static final void method3705(byte arg0, int arg1, int arg2) {
        int var3 = -122 / ((-51 - arg0) / 43);
        ++field9320;
        class71 var4 = class97.field1020[arg2][arg1];
        if (var4 != null) {
            class679.field9614 = var4.field761;
            class203.field2404 = var4.field755;
            class77.field805 = var4.field756;
        }
        class211.method1253(-1678206238);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method3706(int arg0) {
        if (arg0 != 34962) {
            field9319 = null;
        }
        field9319 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
    public final void method262(boolean arg0) {
        super.method262(arg0);
        ++field9316;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    public final Buffer method3109(boolean arg0, int arg1) {
        if (arg1 != -22228) {
            return null;
        } else {
            ++field9313;
            return super.method4120(super.field10341.field8505, arg0, (byte) -37);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)Z")
    public final boolean method3107(byte arg0) {
        if (arg0 < 71) {
            return true;
        } else {
            ++field9314;
            return super.method4119(super.field10341.field8505, 0);
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lai;Z)V")
    public class653(class597 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljaclib/memory/Source;BII)Z")
    public final boolean method3106(Source arg0, byte arg1, int arg2, int arg3) {
        ++field9321;
        int var5 = -58 / ((arg1 - 87) / 36);
        this.field9323 = (byte) arg2;
        super.method4122(0, arg0, arg3);
        return true;
    }
}
