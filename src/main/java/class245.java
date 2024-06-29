import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class245 extends class159 {

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public int field3205;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public int field3202;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public int field3201;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public int field3204;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "Z")
    public boolean field3208;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
    public int field3207;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field3200 = 0;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "[I")
    public static int[] field3203 = new int[1000];

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "[I")
    public static int[] field3206 = new int[1024];

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "[Lbba;")
    public static class124[] field3209;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static void method1526(int arg0) {
        field3209 = null;
        field3203 = null;
        if (arg0 == 3073) {
            field3206 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(IIIIIZ)V")
    public class245(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field3205 = arg3;
        this.field3202 = arg4;
        this.field3201 = arg0;
        this.field3204 = arg2;
        this.field3208 = arg5;
        this.field3207 = arg1;
    }
}
