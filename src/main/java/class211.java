import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class211 {

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public int field3237;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public int field3240;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "S")
    public short field3231;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "B")
    public byte field3229;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "S")
    public short field3228;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "S")
    public short field3236;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public int field3235;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "Z")
    public boolean field3234;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public int field3238;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public int field3233;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Lqfa;")
    public static class85 field3232 = new class85(113, -1);

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "[I")
    public static int[] field3239 = new int[4];

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static void method1476(int arg0) {
        field3232 = null;
        int var1 = -6 % ((arg0 + 30) / 42);
        field3239 = null;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field3237 = arg3;
        this.field3240 = arg2;
        this.field3231 = (short) arg4;
        this.field3229 = (byte) arg8;
        this.field3228 = (short) arg5;
        this.field3236 = (short) arg6;
        this.field3235 = arg11;
        this.field3234 = arg10;
        this.field3238 = arg1;
        this.field3233 = arg0;
    }
}
