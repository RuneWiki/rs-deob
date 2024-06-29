import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class370 {

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public int field5038;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "[I")
    public int[] field5035;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "[I")
    public int[] field5039;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field5036 = 999999;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIII)V", line = 6)
    public static final void method2196(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class319.field4256.field4652 != 0 && arg4 != 0 && class347.field4621 < 50 && arg1 != -1) {
            class40.field429[class347.field4621++] = new class282((byte) 2, arg1, arg4, arg2, arg3, 0);
        }
        if (arg0 != -1094) {
            method2196(-79, -75, 34, -65, 16);
        }
        field5037++;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(I)V", line = 29)
    public class370(int arg0) {
        this.field5038 = arg0;
        this.field5035 = new int[this.field5038];
        this.field5039 = new int[this.field5038];
    }
}
