import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public abstract class class205 extends class59 {

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "S")
    public short field3220;

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "I")
    public int field3214;

    @OriginalMember(owner = "client!hs", name = "s", descriptor = "B")
    public byte field3226;

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "B")
    public byte field3217;

    @OriginalMember(owner = "client!hs", name = "o", descriptor = "I")
    public int field3222;

    @OriginalMember(owner = "client!hs", name = "r", descriptor = "S")
    public short field3225;

    @OriginalMember(owner = "client!hs", name = "t", descriptor = "S")
    public short field3227;

    @OriginalMember(owner = "client!hs", name = "p", descriptor = "Z")
    public boolean field3223;

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "S")
    public short field3219;

    @OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
    public int field3218;

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "Lbg;")
    public static class310 field3215 = new class310(76, -1);

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!hs", name = "n", descriptor = "I")
    public int field3221;

    @OriginalMember(owner = "client!hs", name = "q", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "(I)I")
    public abstract int method333(int arg0);

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I[S[Ljava/lang/String;)V")
    public static final void method1261(int arg0, short[] arg1, String[] arg2) {
        class10.method53(0, arg2.length - 1, arg1, arg2, (byte) -113);
        field3216++;
        if (arg0 != -30299) {
            field3215 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)V")
    public void method891(byte arg0) {
        if (arg0 != 64) {
            this.field3226 = -30;
        }
        field3224++;
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(B)V")
    public static void method1262(byte arg0) {
        field3215 = null;
        if (arg0 != -114) {
            method1261(36, null, null);
        }
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field3220 = (short) arg7;
        this.field3214 = arg2;
        this.field3226 = arg9;
        this.field3217 = (byte) arg0;
        this.field3222 = arg3;
        this.field3225 = (short) arg4;
        this.field3227 = (short) arg5;
        this.field3223 = arg8;
        this.field3219 = (short) arg6;
        this.field3218 = arg1;
    }
}
