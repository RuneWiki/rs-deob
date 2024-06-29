import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class361 {

    @OriginalMember(owner = "client!oba", name = "g", descriptor = "B")
    public byte field5096;

    @OriginalMember(owner = "client!oba", name = "d", descriptor = "S")
    public short field5093;

    @OriginalMember(owner = "client!oba", name = "e", descriptor = "S")
    public short field5094;

    @OriginalMember(owner = "client!oba", name = "h", descriptor = "S")
    public short field5097;

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "I")
    public int field5091;

    @OriginalMember(owner = "client!oba", name = "i", descriptor = "B")
    public byte field5098;

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "Z")
    public boolean field5092;

    @OriginalMember(owner = "client!oba", name = "f", descriptor = "I")
    public int field5095;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "[I")
    public static int[] field5090 = new int[1000];

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)V", line = 10)
    public static void method2170(int arg0) {
        field5090 = null;
        if (arg0 != 1000) {
            field5090 = null;
        }
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(IIIIIIIIIZI)V", line = 29)
    public class361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        this.field5096 = (byte) arg8;
        this.field5093 = (short) arg4;
        this.field5094 = (short) arg6;
        this.field5097 = (short) arg5;
        this.field5091 = arg0;
        this.field5098 = (byte) arg7;
        this.field5092 = arg9;
        this.field5095 = arg10;
    }
}
