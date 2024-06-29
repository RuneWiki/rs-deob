import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class15 extends class186 {

    @OriginalMember(owner = "client!kh", name = "B", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!kh", name = "C", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!kh", name = "D", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(FB)V", line = 4)
    public final void method73(float arg0, byte arg1) {
        super.field2703 = arg0;
        if (arg1 == -111) {
            ++field153;
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(IIIIIF)V", line = 17)
    public class15(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIB)V", line = 23)
    public final void method74(int arg0, int arg1, int arg2, byte arg3) {
        super.field2708 = arg1;
        super.field2701 = arg0;
        int var5 = -20 / ((arg3 - 20) / 57);
        ++field155;
        super.field2699 = arg2;
    }
}
