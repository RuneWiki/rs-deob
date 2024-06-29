import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class467 {

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field6729;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "[B")
    public byte[] field6730;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "[S")
    public short[] field6731;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "[S")
    public short[] field6732;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "[S")
    public short[] field6733;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIZ)I")
    public static final int method2758(int arg0, int arg1, int arg2, boolean arg3) {
        field6729++;
        class464 var4 = class175.method1082(arg3, arg0, (byte) 20);
        if (var4 == null) {
            return -1;
        } else if (~arg2 <= arg1 && var4.field6715.length > arg2) {
            return var4.field6715[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)Z")
    public static final boolean method2759(int arg0, int arg1, int arg2) {
        field6728++;
        return arg0 != 6509;
    }
}
