import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class622 {

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field8955;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field8956;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)V")
    public static final void method3566(byte arg0, int arg1) {
        if (arg0 < -71) {
            field8956++;
            class632 var2 = class641.method3699(-123, 2, arg1);
            var2.method3655(0);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III[B)[B")
    public static final byte[] method3567(int arg0, int arg1, int arg2, byte[] arg3) {
        field8955++;
        byte[] var4;
        if (arg1 > 0) {
            var4 = new byte[arg0];
            for (int var5 = 0; var5 < arg0; var5++) {
                var4[var5] = arg3[arg1 + var5];
            }
        } else {
            var4 = arg3;
        }
        int var6 = -73 / ((-arg2 - 28) / 43);
        class522 var7 = new class522();
        var7.method2918(7);
        var7.method2914(var4, 255, (long) (arg0 * 8));
        byte[] var8 = new byte[64];
        var7.method2917(0, (byte) 53, var8);
        return var8;
    }
}
