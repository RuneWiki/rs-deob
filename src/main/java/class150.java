import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class150 {

    @OriginalMember(owner = "client!cga", name = "f", descriptor = "I")
    public int field1910 = -1;

    @OriginalMember(owner = "client!cga", name = "c", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!cga", name = "d", descriptor = "Lfba;")
    public class368 field1908;

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "[I")
    public int[] field1906;

    @OriginalMember(owner = "client!cga", name = "e", descriptor = "[J")
    public long[] field1909;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "[Ljava/lang/String;")
    public String[] field1905;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "([FBI)[F", line = 8)
    public static final float[] method853(float[] arg0, byte arg1, int arg2) {
        field1907++;
        float[] var3 = new float[arg2];
        class642.method3476(arg0, 0, var3, 0, arg2);
        return arg1 == 76 ? var3 : null;
    }
}
