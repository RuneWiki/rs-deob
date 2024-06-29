import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class280 extends class179 {

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "[I")
    public int[] field3748;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "[I")
    public int[] field3751;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    public static int field3752 = 0;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIZI)V", line = 16)
    public static final void method1778(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (class40.field626 != 0 && arg0 != 0 && class384.field5399 < 50 && arg4 != -1) {
            class191.field2751[class384.field5399] = arg4;
            class44.field705[class384.field5399] = arg0;
            class160.field2383[class384.field5399] = arg2;
            class339.field4627[class384.field5399] = null;
            class286.field3840[class384.field5399] = 0;
            class339.field4623[class384.field5399] = arg1;
            class384.field5399++;
        }
        field3749++;
        if (!arg3) {
            field3752 = -109;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIZ)I", line = 39)
    public static final int method1779(int arg0, int arg1, boolean arg2) {
        field3753++;
        int var3 = arg1 + (arg0 * 57);
        int var4 = var3 ^ var3 << 13;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        if (!arg2) {
            method1779(32, -102, true);
        }
        return (var5 & 0x7F9F87E) >> 19;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(II[I[I)V", line = 54)
    public class280(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field3748 = arg2;
        this.field3751 = arg3;
    }
}
