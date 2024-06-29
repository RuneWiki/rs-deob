import java.awt.Component;
import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class199 {

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public int field3472 = -1;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "Lmh;")
    public static class128 field3467 = class22.method156(126, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "Lmh;")
    public static class128 field3470 = class22.method156(127, "Opened titlescreen)3");

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "Z")
    public static boolean field3476 = false;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "[Z")
    public static boolean[] field3468 = new boolean[100];

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public int field3466;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public int field3469;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public int field3471;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public int field3474;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public int field3475;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public int field3478;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
    public int field3479;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public int field3481;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "Ljava/awt/Font;")
    public static Font field3477;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIILjava/awt/Component;)Lwk;", line = 11)
    public static final class165 method1379(int arg0, int arg1, int arg2, Component arg3) {
        field3473++;
        int var4 = -9 % ((arg1 + 25) / 43);
        try {
            Class var5 = Class.forName("uf");
            class165 var6 = (class165) var5.getDeclaredConstructor().newInstance();
            var6.method150(false, arg2, arg3, arg0);
            return var6;
        } catch (Throwable var9) {
            class257 var8 = new class257();
            var8.method150(false, arg2, arg3, arg0);
            return var8;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 34)
    public static void method1380(int arg0) {
        if (arg0 >= 5) {
            field3467 = null;
            field3468 = null;
            field3477 = null;
            field3470 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIII)V", line = 86)
    public static final void method1381(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        class314.method2138(arg2 + arg3, true, arg4, class219.field3850[arg5], arg2 - arg3);
        field3480++;
        int var7 = arg0;
        int var8 = arg0 * arg0;
        int var9 = var8 << 1;
        int var10 = arg3 * arg3;
        int var11 = arg0 << 1;
        int var12 = (1 - var11) * var10 + var9;
        int var13 = var8 << 2;
        int var14 = var10 << 1;
        int var15 = ((var6 << 1) + 3) * var9;
        int var16 = var10 << 2;
        int var17 = var8 - ((var11 - 1) * var14);
        int var18 = (var6 + 1) * var13;
        int var19 = ((arg0 << 1) - 3) * var14;
        int var20 = (arg0 - 1) * var16;
        while (var7 > 0) {
            if (var12 < 0) {
                while (var12 < 0) {
                    var12 += var15;
                    var15 += var13;
                    var6++;
                    var17 += var18;
                    var18 += var13;
                }
            }
            var7--;
            int var21 = arg5 + var7;
            int var22 = arg5 - var7;
            if (var17 < 0) {
                var12 += var15;
                var17 += var18;
                var15 += var13;
                var6++;
                var18 += var13;
            }
            var12 += -var20;
            var17 += -var19;
            var20 -= var16;
            int var23 = arg2 + var6;
            var19 -= var16;
            int var24 = arg2 - var6;
            class314.method2138(var23, true, arg4, class219.field3850[var22], var24);
            class314.method2138(var23, true, arg4, class219.field3850[var21], var24);
        }
        int var25 = 107 / ((-arg1 - 67) / 37);
    }
}
