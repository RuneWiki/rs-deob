import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public abstract class class448 extends class242 {

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public int field6224;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "S")
    public short field6221;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "S")
    public short field6229;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "Z")
    public boolean field6235;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "S")
    public short field6228;

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "S")
    public short field6238;

    @OriginalMember(owner = "client!oh", name = "D", descriptor = "I")
    public int field6241;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "B")
    public byte field6232;

    @OriginalMember(owner = "client!oh", name = "B", descriptor = "I")
    public int field6239;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "B")
    public byte field6220;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "[Lit;")
    public static class388[] field6223 = new class388[16];

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "I")
    public static int field6237 = 0;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    public static int field6231 = 20;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field6222;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public static int field6225;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public static int field6226;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public int field6227;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "I")
    public static int field6234;

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!oh", name = "C", descriptor = "I")
    public static int field6240;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "Lpi;")
    public static class340 field6233;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "Lv;")
    public static class455 field6230;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)V", line = 3)
    public static void method2657(byte arg0) {
        field6223 = null;
        field6230 = null;
        if (arg0 <= -127) {
            field6233 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "(I)V", line = 17)
    public void method1428(int arg0) {
        field6222++;
        if (arg0 != 31867) {
            method2659(true, 88, -4, -11, -117, -17);
        }
    }

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "(I)V", line = 34)
    public static final void method2658(int arg0) {
        for (int var1 = arg0; var1 < class405.field5433; var1++) {
            class449 var2 = class46.field673[var1];
            if (var2.field6253 == 2) {
                if (var2.field6259 == null) {
                    var2.field6258 = Integer.MIN_VALUE;
                } else {
                    class18.field313.method1890(var2.field6259);
                }
            }
        }
        field6225++;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZIIIII)V", line = 74)
    public static final void method2659(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6226++;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg4 * arg4;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg5 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg5 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg5 - 1) * var15;
        class183.method1212(arg3, class333.field4265[arg2], arg0, arg1 - arg4, arg1 + arg4);
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var17 += var16;
                    var6++;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var6++;
                var19 += var16;
                var17 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            var18 -= var15;
            var20 -= var15;
            var7--;
            int var21 = arg2 - var7;
            int var22 = arg2 + var7;
            int var23 = arg1 + var6;
            int var24 = arg1 - var6;
            class183.method1212(arg3, class333.field4265[var21], true, var24, var23);
            class183.method1212(arg3, class333.field4265[var22], true, var24, var23);
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(IIIIIIIIZB)V", line = 163)
    public class448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field6224 = arg2;
        this.field6221 = (short) arg7;
        this.field6229 = (short) arg5;
        this.field6235 = arg8;
        this.field6228 = (short) arg6;
        this.field6238 = (short) arg4;
        this.field6241 = arg3;
        this.field6232 = arg9;
        this.field6239 = arg1;
        this.field6220 = (byte) arg0;
    }

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "(I)I")
    public abstract int method180(int arg0);
}
