import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class27 {

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "[I")
    public int[] field358 = new int[4];

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "B")
    public byte field348;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "[I")
    public int[] field357;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "B")
    public byte field351;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "[I")
    public int[] field352;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "S")
    public short field356;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "S")
    public short field349;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "S")
    public short field350;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "[S")
    public short[] field353;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "S")
    public short field347;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "[S")
    public short[] field354;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "[S")
    public short[] field346;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
    public class27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field348 = (byte) arg1;
        this.field357 = new int[4];
        this.field351 = (byte) arg0;
        this.field352 = new int[4];
        this.field357[2] = arg4;
        this.field357[3] = arg5;
        this.field357[1] = arg3;
        this.field357[0] = arg2;
        this.field358[3] = arg9;
        this.field358[0] = arg6;
        this.field358[1] = arg7;
        this.field358[2] = arg8;
        this.field352[2] = arg12;
        this.field356 = (short) (arg2 >> class509.field7106);
        this.field352[1] = arg11;
        this.field352[3] = arg13;
        this.field352[0] = arg10;
        this.field349 = (short) (arg4 >> class509.field7106);
        this.field350 = (short) (arg10 >> class509.field7106);
        this.field353 = new short[4];
        this.field347 = (short) (arg12 >> class509.field7106);
        this.field354 = new short[4];
        this.field346 = new short[4];
    }
}
