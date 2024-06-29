import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public abstract class class243 {

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(BLjava/lang/String;ZLic;)Lbh;")
    public static final class28 method1630(byte arg0, String arg1, boolean arg2, class491 arg3) {
        field3577++;
        int var4 = arg3.method2940(arg1, false);
        if (var4 == -1) {
            return new class28(0);
        }
        int[] var5 = arg3.method2951(var4, false);
        if (arg0 != 82) {
            return null;
        }
        class28 var6 = new class28(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var7 < var6.field288) {
                class209 var9 = new class209(arg3.method2945(var4, var5[var8++], true));
                int var10 = var9.method1452(arg0 ^ 0xFF52);
                int var11 = var9.method1450((byte) 45);
                int var12 = var9.method1428(32122);
                if (!arg2 && var12 == 1) {
                    var6.field288--;
                } else {
                    var6.field295[var7] = var10;
                    var6.field290[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(III[FFIFFZIF)V")
    public abstract void method134(int arg0, int arg1, int arg2, float[] arg3, float arg4, int arg5, float arg6, float arg7, boolean arg8, int arg9, float arg10);
}
