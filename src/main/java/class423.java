import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class423 extends class329 {

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "S")
    public short field5313;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "Lf;")
    public static class536 field5310;

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V")
    public class423() {
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lks;I)V")
    public static final void method2245(class30 arg0, int arg1) {
        field5312++;
        arg0.method207(arg1 + 8);
        int var2 = class167.field2200;
        class514 var3 = class376.field4748 = class351.field4490[var2] = new class514();
        var3.field9676 = var2;
        int var4 = arg0.method200(false, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (var4 & 0xFFFCD27) >> 14;
        var3.field9758[0] = var6 - class145.field1879;
        int var7 = var4 & 0x3FFF;
        var3.field6461 = (var3.field9758[0] << 9) + (var3.method2785(-1) << 8);
        var3.field9754[arg1] = var7 - class630.field8817;
        var3.field6464 = (var3.field9754[0] << 9) + (var3.method2785(-1) << 8);
        class476.field6039 = var3.field6470 = var3.field6456 = var5;
        if (class3.method22(var3.field9754[0], var3.field9758[0], 5706)) {
            var3.field6456++;
        }
        if (class476.field6042[var2] != null) {
            var3.method2783(-1, class476.field6042[var2]);
        }
        class596.field8384 = 0;
        class354.field4521[class596.field8384++] = var2;
        class481.field6395[var2] = 0;
        class561.field7807 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg0.method200(false, 18);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 0xFF;
                int var12 = var9 & 0xFF;
                class654 var13 = class359.field4571[var8] = new class654();
                var13.field9225 = -1;
                var13.field9223 = false;
                var13.field9228 = (var10 << 28) - (-(var11 << 14) - var12);
                var13.field9224 = 0;
                class392.field4943[class561.field7807++] = var8;
                class481.field6395[var8] = 0;
            }
        }
        arg0.method206((byte) -76);
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(S)V")
    public class423(short arg0) {
        this.field5313 = arg0;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5311++;
        class62 var10 = null;
        class62 var11 = (class62) class467.field5934.method237(arg0 ^ 0xFFFFFFAA);
        if (arg0 != -1) {
            method2245(null, 12);
        }
        while (var11 != null) {
            if (var11.field844 == arg2 && var11.field845 == arg8 && var11.field835 == arg7 && var11.field839 == arg9) {
                var10 = var11;
                break;
            }
            var11 = (class62) class467.field5934.method245((byte) 50);
        }
        if (var10 == null) {
            var10 = new class62();
            var10.field845 = arg8;
            var10.field835 = arg7;
            var10.field839 = arg9;
            var10.field844 = arg2;
            if (arg8 >= 0 && arg7 >= 0 && arg8 < class431.field5395 && arg7 < class452.field5802) {
                class44.method270(var10, arg0 ^ 0x7B);
            }
            class467.field5934.method239(var10, (byte) 93);
        }
        var10.field838 = arg5;
        var10.field836 = arg4;
        var10.field843 = arg1;
        var10.field837 = arg6;
        var10.field846 = arg3;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    public static void method2247(int arg0) {
        field5310 = null;
        if (arg0 != 1201566057) {
            field5310 = null;
        }
    }
}
