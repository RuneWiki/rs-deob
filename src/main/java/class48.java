import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class48 {

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "[I")
    public static int[] field731 = new int[2];

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "I")
    public static int field743 = -1;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "B")
    public byte field723;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "B")
    public byte field727;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "B")
    public byte field728;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "B")
    public byte field730;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "B")
    public byte field732;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "B")
    public byte field740;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "B")
    public byte field744;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public int field738;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
    public int field742;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "S")
    public short field737;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "Z")
    public boolean field724;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "Z")
    public boolean field725;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Z")
    public boolean field726;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "Z")
    public boolean field729;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "Z")
    public boolean field733;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "Z")
    public boolean field734;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "Z")
    public boolean field735;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "Z")
    public boolean field739;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "Z")
    public boolean field745;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static void method343(int arg0) {
        if (arg0 > 37) {
            field731 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method344(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = -36 % ((arg2 + 15) / 35);
        if ((arg0 - arg4) >= class355.field5296 && arg0 + arg4 <= class320.field4818 && class248.field3808 <= arg1 - arg4 && arg1 + arg4 <= class478.field7310) {
            class96.method730(arg5, arg1, -22, arg0, arg6, arg3, arg4);
        } else {
            class145.method953(-126, arg3, arg6, arg1, arg4, arg5, arg0);
        }
        field736++;
    }
}
