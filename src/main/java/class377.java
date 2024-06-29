import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class377 {

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "S")
    public short field5677;

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "I")
    public int field5679;

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "I")
    public int field5680;

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "I")
    public int field5678;

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "I")
    public int field5676;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "Z")
    public boolean field5675;

    @OriginalMember(owner = "client!ru", name = "k", descriptor = "S")
    public short field5685;

    @OriginalMember(owner = "client!ru", name = "j", descriptor = "B")
    public byte field5684;

    @OriginalMember(owner = "client!ru", name = "h", descriptor = "B")
    public byte field5682;

    @OriginalMember(owner = "client!ru", name = "m", descriptor = "I")
    public int field5687;

    @OriginalMember(owner = "client!ru", name = "l", descriptor = "S")
    public short field5686;

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "I")
    public static int field5683 = 0;

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "Luv;")
    public static class2 field5681 = new class2(108, 2);

    @OriginalMember(owner = "client!ru", name = "n", descriptor = "[F")
    public static float[] field5688 = new float[4];

    @OriginalMember(owner = "client!ru", name = "o", descriptor = "[I")
    public static int[] field5689 = new int[5];

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Z)V", line = 18)
    public static void method2230(boolean arg0) {
        field5681 = null;
        field5688 = null;
        field5689 = null;
        if (arg0) {
            method2230(true);
        }
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 34)
    public class377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field5677 = (short) arg4;
        this.field5679 = arg1;
        this.field5680 = arg3;
        this.field5678 = arg0;
        this.field5676 = arg11;
        this.field5675 = arg10;
        this.field5685 = (short) arg6;
        this.field5684 = (byte) arg7;
        this.field5682 = (byte) arg8;
        this.field5687 = arg2;
        this.field5686 = (short) arg5;
    }
}
