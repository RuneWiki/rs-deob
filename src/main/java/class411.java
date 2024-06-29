import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class411 extends class324 {

    @OriginalMember(owner = "client!ap", name = "n", descriptor = "Ltt;")
    public class78 field6254;

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "Lfea;")
    public static class123 field6253 = new class123();

    @OriginalMember(owner = "client!ap", name = "o", descriptor = "I")
    public static int field6255 = 0;

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!ap", name = "p", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!ap", name = "q", descriptor = "I")
    public static int field6257;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IBIIII)V")
    public static final void method2602(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field6250++;
        int var6 = 0;
        int var7 = arg2;
        int var8 = arg4 * arg4;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg2 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        if (arg1 < 11) {
            method2604(null, true);
        }
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg2 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        class645.method3675(97, class402.field6087[arg3], arg0, arg5 - arg4, arg4 + arg5);
        int var20 = (arg2 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var17 += var16;
                    var19 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                var17 += var16;
                var6++;
            }
            var14 += -var18;
            var13 += -var20;
            var18 -= var15;
            var7--;
            var20 -= var15;
            int var21 = arg3 - var7;
            int var22 = arg3 + var7;
            int var23 = arg5 + var6;
            int var24 = arg5 - var6;
            class645.method3675(122, class402.field6087[var21], arg0, var24, var23);
            class645.method3675(107, class402.field6087[var22], arg0, var24, var23);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IB)V")
    public static final void method2603(int arg0, byte arg1) {
        field6256++;
        if (arg1 <= 102) {
            field6257 = -92;
        }
        class467 var2 = class541.method3144(arg0, (byte) -86, 16);
        var2.method2852(0);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method2604(String arg0, boolean arg1) {
        field6251++;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1) {
            field6255 = -23;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + class479.method2919(arg0.charAt(var4), -6030) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Ltt;)V")
    public class411(class78 arg0) {
        this.field6254 = arg0;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V")
    public static void method2605(int arg0) {
        if (arg0 != 7448) {
            field6253 = null;
        }
        field6253 = null;
    }
}
