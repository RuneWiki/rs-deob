import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class739 {

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "B")
    public byte field9940;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "B")
    public byte field9943;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "B")
    public byte field9944;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "B")
    public byte field9947;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "B")
    public byte field9953;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "B")
    public byte field9955;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "B")
    public byte field9958;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public int field9942;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public int field9945;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public int field9948;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field9952;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public static int field9956;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "S")
    public short field9950;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "Z")
    public boolean field9941;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "Z")
    public boolean field9946;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "Z")
    public boolean field9949;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "Z")
    public boolean field9951;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "Z")
    public boolean field9954;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "Z")
    public boolean field9957;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "Z")
    public boolean field9959;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "Z")
    public boolean field9960;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIB)V", line = 12)
    public static final void method4062(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg0 < arg3) {
            class47.method550(-27, arg3, class691.field9345[arg2], arg0, arg1);
        } else {
            class47.method550(-27, arg0, class691.field9345[arg2], arg3, arg1);
        }
        field9956++;
        if (arg4 >= 20) {
            ;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B[[I)V", line = 35)
    public static final void method4063(byte arg0, int[][] arg1) {
        class691.field9345 = arg1;
        field9952++;
        if (arg0 != -40) {
            method4063((byte) 100, null);
        }
    }
}
