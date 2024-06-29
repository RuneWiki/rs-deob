import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class443 extends class96 {

    @OriginalMember(owner = "client!ev", name = "N", descriptor = "I")
    private int field6163;

    @OriginalMember(owner = "client!ev", name = "L", descriptor = "I")
    public static int field6161 = -1;

    @OriginalMember(owner = "client!ev", name = "O", descriptor = "[I")
    public static int[] field6164 = new int[14];

    @OriginalMember(owner = "client!ev", name = "K", descriptor = "Lpi;")
    public static class340 field6160 = new class340(6, 14);

    @OriginalMember(owner = "client!ev", name = "M", descriptor = "I")
    public static int field6162;

    @OriginalMember(owner = "client!ev", name = "P", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!ev", name = "Q", descriptor = "I")
    public static int field6166;

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        ++field6166;
        if (arg1 != 255) {
            this.method37(31, -53);
        }
        int[] var3 = super.field1331.method397((byte) -110, arg0);
        if (super.field1331.field863) {
            class526.method3111(var3, 0, class269.field3403, this.field6163);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "()V")
    public class443() {
        this(4096);
    }

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "(I)V")
    public static void method2635(int arg0) {
        if (arg0 > -96) {
            field6160 = null;
        }
        field6164 = null;
        field6160 = null;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IILbt;)V")
    public final void method31(int arg0, int arg1, class88 arg2) {
        ++field6162;
        if (arg0 == 0) {
            this.field6163 = (arg2.method617(arg1 ^ -3) << 12) / 255;
        }
        if (arg1 != -1) {
            field6160 = null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(I)V")
    public class443(int arg0) {
        super(0, true);
        this.field6163 = 4096;
        this.field6163 = arg0;
    }
}
