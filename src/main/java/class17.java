import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class17 {

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public int field301 = 2048;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public int field304 = 0;

    @OriginalMember(owner = "client!an", name = "i", descriptor = "I")
    public int field309 = 0;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "I")
    public int field308 = 2048;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "[Lfn;")
    public static class73[] field303 = new class73[128];

    @OriginalMember(owner = "client!an", name = "g", descriptor = "Lkn;")
    public static class442 field307 = new class442("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!an", name = "k", descriptor = "I")
    public static int field311 = -1;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "Ljava/lang/String;")
    public static String field312 = "";

    @OriginalMember(owner = "client!an", name = "b", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!an", name = "j", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!an", name = "m", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!an", name = "n", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!an", name = "o", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIIII)V", line = 3)
    public static final void method243(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field302++;
        int var9 = arg3 + 1;
        class295.method1924(3289650, class296.field4138[arg3], arg5, arg0, arg1);
        int var8 = arg2 - 1;
        class295.method1924(3289650, class296.field4138[arg2], arg5, arg0, arg1);
        if (arg4 == 1) {
            for (int var6 = var9; var6 <= var8; var6++) {
                int[] var7 = class296.field4138[var6];
                var7[arg1] = var7[arg5] = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIII)V", line = 27)
    public static final void method244(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field315++;
        class239 var5 = class436.method2740(8, arg2, -323285792);
        int var6 = -28 / ((-arg0 - 7) / 41);
        var5.method1622(68);
        var5.field3399 = arg3;
        var5.field3397 = arg1;
        var5.field3408 = arg4;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Loo;I)V", line = 47)
    public static final void method245(class374 arg0, int arg1) {
        field310++;
        int var2 = arg0.field5293 - class276.field3837;
        int var3 = arg0.field5309 * 128 + (arg0.method942(false) * 64);
        int var4 = arg0.field5263 * 128 + (arg0.method942(false) * 64);
        arg0.field6262 += (var3 - arg0.field6262) / var2;
        arg0.field5339 = 0;
        arg0.field6266 += (var4 - arg0.field6266) / var2;
        if (arg0.field5249 == 0) {
            arg0.method2385(15141, 8192);
        }
        if (arg1 != 25481) {
            method246((byte) -14);
        }
        if (arg0.field5249 == 1) {
            arg0.method2385(arg1 ^ 0x58AC, 12288);
        }
        if (arg0.field5249 == 2) {
            arg0.method2385(15141, 0);
        }
        if (arg0.field5249 == 3) {
            arg0.method2385(15141, 4096);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V", line = 97)
    public static void method246(byte arg0) {
        field312 = null;
        field307 = null;
        field303 = null;
        if (arg0 <= 88) {
            method246((byte) -79);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lkh;II)V", line = 109)
    public final void method247(class11 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method172((byte) 52);
            if (var4 == 0) {
                if (arg2 != -1) {
                    return;
                }
                field306++;
                return;
            }
            this.method248(arg1, 0, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IILkh;I)V", line = 129)
    private final void method248(int arg0, int arg1, class11 arg2, int arg3) {
        field305++;
        if (arg3 == 1) {
            this.field304 = arg2.method172((byte) 52);
        } else if (arg3 == 2) {
            this.field308 = arg2.method174(255);
        } else if (arg3 == 3) {
            this.field301 = arg2.method174(255);
        } else if (arg3 == 4) {
            this.field309 = arg2.method207(7124);
        }
        if (arg1 != 0) {
            method245((class374) null, 40);
        }
    }
}
