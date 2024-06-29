import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class199 extends class296 {

    @OriginalMember(owner = "client!vu", name = "B", descriptor = "I")
    public static int field2598 = -1;

    @OriginalMember(owner = "client!vu", name = "D", descriptor = "F")
    public static float field2600;

    @OriginalMember(owner = "client!vu", name = "C", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!vu", name = "E", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!vu", name = "F", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(II[BI)I")
    public static final int method1307(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field2601;
        int var4 = -1;
        for (int var5 = arg1; var5 < arg0; ++var5) {
            var4 = var4 >>> 8 ^ class431.field5572[255 & (var4 ^ arg2[var5])];
        }
        int var6 = ~var4;
        if (arg3 != -409282360) {
            field2598 = 87;
        }
        return var6;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(FI)V")
    public final void method1308(float arg0, int arg1) {
        super.field3873 = arg0;
        if (arg1 > 35) {
            ++field2602;
        }
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(IIIIIF)V")
    public class199(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(BIII)V")
    public final void method1309(byte arg0, int arg1, int arg2, int arg3) {
        ++field2599;
        super.field3876 = arg2;
        super.field3880 = arg3;
        super.field3878 = arg1;
        if (arg0 < 106) {
            this.method1309((byte) -106, 99, -49, 124);
        }
    }
}
