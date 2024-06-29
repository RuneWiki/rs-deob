import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class302 {

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "S")
    public short field4285;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public int field4282;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "S")
    public short field4287;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "B")
    public byte field4284;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "B")
    public byte field4292;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public int field4294;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "S")
    public short field4289;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Z")
    public boolean field4283;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Lqe;")
    public static class469 field4286 = new class469(50, -1);

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "[Lpk;")
    public static class198[] field4293;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIZ)I", line = 9)
    public static final int method1907(int arg0, int arg1, int arg2, boolean arg3) {
        field4288++;
        class384 var4 = class529.method3090(arg3, (byte) 63, arg0);
        if (arg2 != -28889) {
            field4286 = null;
        }
        if (var4 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var4.field5809.length) {
            return var4.field5809[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II[BIIII)Z", line = 32)
    public static final boolean method1908(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
        field4290++;
        int var7 = arg3 % arg1;
        if (arg6 != 50) {
            field4286 = null;
        }
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg1 - var7;
        }
        int var9 = -((arg4 - (1 - arg1)) / arg1);
        int var10 = -((arg3 + arg1 - 1) / arg1);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg2[arg5] == 0) {
                    return true;
                }
                arg5 += arg1;
            }
            int var13 = arg5 - var8;
            if (arg2[var13 - 1] == 0) {
                return true;
            }
            arg5 = arg0 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 83)
    public static void method1909(int arg0) {
        field4286 = null;
        field4293 = null;
        if (arg0 > -87) {
            method1909(35);
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(IIIIIIIIIZI)V", line = 102)
    public class302(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        this.field4285 = (short) arg4;
        this.field4282 = arg0;
        this.field4287 = (short) arg5;
        this.field4284 = (byte) arg7;
        this.field4292 = (byte) arg8;
        this.field4294 = arg10;
        this.field4289 = (short) arg6;
        this.field4283 = arg9;
    }
}
