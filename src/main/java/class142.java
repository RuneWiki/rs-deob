import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class142 {

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public int field2297;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public int field2299;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public int field2292;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public int field2298;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "S")
    public short field2296;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "Z")
    public boolean field2293;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "B")
    public byte field2295;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public int field2290;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "S")
    public short field2294;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "S")
    public short field2289;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)Lrba;", line = 10)
    public static final class402 method1037(int arg0) {
        field2288++;
        class402 var1 = class456.method2604(-1);
        var1.field5350 = 0;
        if (arg0 == 17916) {
            var1.field5347 = null;
            var1.field5354 = new class201(5000);
            return var1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 36)
    public class142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field2297 = arg2;
        this.field2299 = arg1;
        this.field2292 = arg0;
        this.field2298 = arg11;
        this.field2296 = (short) arg5;
        this.field2293 = arg10;
        this.field2295 = (byte) arg8;
        this.field2290 = arg3;
        this.field2294 = (short) arg4;
        this.field2289 = (short) arg6;
    }
}
