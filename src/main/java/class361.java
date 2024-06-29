import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class361 implements class380 {

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "I")
    public int field4923;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
    public int field4922;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "[F")
    public float[] field4924;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
    public static int field4919 = 0;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)I", line = 4)
    public static final int method2217(int arg0, int arg1, int arg2) {
        field4921++;
        if (arg0 != 38348543) {
            field4925 = -77;
        }
        int var3 = arg2 - 1 & arg1 >> 31;
        return ((arg1 >>> 31) + arg1) % arg2 + var3;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "([I[II)V", line = 19)
    public static final void method2218(int[] arg0, int[] arg1, int arg2) {
        field4920++;
        if (arg0 == null || arg1 == null) {
            class278.field3848 = null;
            class652.field9028 = null;
            class658.field9110 = null;
            return;
        }
        class652.field9028 = arg0;
        class658.field9110 = new int[arg0.length];
        class278.field3848 = new byte[arg0.length][][];
        for (int var3 = arg2; var3 < class652.field9028.length; var3++) {
            class278.field3848[var3] = new byte[arg1[var3]][];
        }
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(II)V", line = 55)
    public class361(int arg0, int arg1) {
        this.field4923 = arg1;
        this.field4922 = arg0;
        this.field4924 = new float[arg0 * arg1];
    }
}
