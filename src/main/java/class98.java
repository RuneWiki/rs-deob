import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class98 {

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "Lcga;")
    public static class449 field1263 = new class449(66, 3);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "F")
    public static float field1260;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 4)
    public static void method719(byte arg0) {
        int var1 = 89 % ((-arg0 - 56) / 42);
        field1263 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(FIIZIIII)[I", line = 15)
    public static final int[] method720(float arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        field1261++;
        int[] var8 = new int[arg7];
        class157 var9 = new class157();
        var9.field1847 = arg1;
        var9.field1856 = arg5;
        var9.field1845 = (int) (arg0 * 4096.0F);
        var9.field1839 = arg3;
        var9.field1849 = arg4;
        var9.field1850 = arg6;
        var9.method91((byte) 126);
        class527.method2848((byte) -112, arg7, arg2);
        var9.method964((byte) 84, 0, var8);
        return var8;
    }

    @OriginalMember(owner = "client!ra", name = "toString", descriptor = "()Ljava/lang/String;", line = 40)
    public final String toString() {
        field1262++;
        throw new IllegalStateException();
    }
}
