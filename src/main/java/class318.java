import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class318 extends class134 {

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "Lef;")
    public class343 field4604;

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lge;II[B)V")
    private class318(class104 arg0, int arg1, int arg2, byte[] arg3) {
        this.field4604 = class343.method2209(false, 6406, 6406, arg3, arg0, 3553, arg1, arg2);
        this.field4604.method1574(false, false);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "([ILge;II[II)Lfn;")
    public static final class318 method2133(int[] arg0, class104 arg1, int arg2, int arg3, int[] arg4, int arg5) {
        byte[] var6 = new byte[arg2 * arg3];
        for (int var7 = arg5; var7 < arg2; var7++) {
            int var8 = arg3 * var7 + arg0[var7];
            for (int var9 = 0; var9 < arg4[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class318(arg1, arg3, arg2, var6);
    }
}
