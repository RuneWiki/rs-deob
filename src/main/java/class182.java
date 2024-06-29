import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class182 {

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "I")
    public static int field2499 = 0;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2496 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "I")
    public static int field2501;

    static {
        new class206("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lnh;IIIB)V", line = 5)
    public static final void method1066(class487 arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2500++;
        int var5 = arg0.field1193[0];
        int var6 = arg0.field1197[0];
        if (arg1 != -3880 || var5 < 0 || class295.field3947 <= var5 || var6 < 0 || class39.field567 <= var6 || arg2 < 0 || class295.field3947 <= arg2 || arg3 < 0 || class39.field567 <= arg3) {
            return;
        }
        int var7 = class30.method175(true, class93.field1361, 0, -4, 1, 0, 0, class60.field805[arg0.field6502], var5, 0, arg2, class193.field2613, arg0.method545(false), arg3, var6);
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < (var7 - 1); var8++) {
                arg0.method2834((byte) -52, class193.field2613[var8], arg4, class93.field1361[var8]);
            }
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(BI)I", line = 42)
    public static final int method1067(byte arg0, int arg1) {
        field2498++;
        double var2 = (double) ((arg1 & 0xFF80AE) >> 16) / 256.0D;
        double var4 = (double) ((arg1 & 0xFF6A) >> 8) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        int var8 = -108 / ((arg0 - 55) / 36);
        double var9 = var2;
        if (var2 > var4) {
            var9 = var4;
        }
        if (var9 > var6) {
            var9 = var6;
        }
        double var11 = var2;
        if (var4 > var2) {
            var11 = var4;
        }
        if (var11 < var6) {
            var11 = var6;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var2 == var11) {
                var13 = (var4 - var6) / (var11 - var9);
            } else if (var4 == var11) {
                var13 = (var6 - var2) / (var11 - var9) + 2.0D;
            } else if (var6 == var11) {
                var13 = (var2 - var4) / (var11 - var9) + 4.0D;
            }
        }
        double var19 = var13 / 6.0D;
        int var21 = (int) (var19 * 256.0D);
        int var22 = (int) (var15 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = (int) (var17 * 256.0D);
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        if (var23 > 243) {
            var22 >>= 0x4;
        } else if (var23 > 217) {
            var22 >>= 0x3;
        } else if (var23 > 192) {
            var22 >>= 0x2;
        } else if (var23 > 179) {
            var22 >>= 0x1;
        }
        return ((var21 & 0xFF) >> 2 << 10) + (var22 >> 5 << 7) + (var23 >> 1);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V", line = 141)
    public static void method1068(int arg0) {
        if (arg0 > 43) {
            field2496 = null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIIII)V", line = 152)
    public static final void method1069(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2501++;
        class106 var5 = class250.method1400(arg3, -94, arg0);
        var5.method658(0);
        var5.field1590 = arg4;
        var5.field1584 = arg1;
        var5.field1589 = arg2;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lkf;IIILjd;ILnk;B)V", line = 168)
    public static final void method1070(class152 arg0, int arg1, int arg2, int arg3, class139 arg4, int arg5, class464 arg6, byte arg7) {
        field2497++;
        if (arg4 == null) {
            return;
        }
        int var8;
        if (class56.field772 == 4) {
            var8 = (int) class270.field3610 & 0x3FFF;
        } else {
            var8 = (int) class270.field3610 + class150.field2119 & 0x3FFF;
        }
        int var9 = Math.max(arg6.field6308 / 2, arg6.field6340 / 2) + 10;
        int var10 = arg1 * arg1 + arg3 * arg3;
        if (var10 > var9 * var9) {
            return;
        }
        int var11 = -11 % ((arg7 + 26) / 54);
        int var12 = class364.field4994[var8];
        int var13 = class364.field4992[var8];
        if (class56.field772 != 4) {
            var13 = var13 * 256 / (class429.field5795 + 256);
            var12 = var12 * 256 / (class429.field5795 + 256);
        }
        int var14 = arg3 * var12 + (arg1 * var13) >> 15;
        int var15 = arg3 * var13 - arg1 * var12 >> 15;
        arg4.method770(var14 + (arg2 - (arg4.method777() / 2 - (arg6.field6308 / 2))), arg6.field6340 / 2 + -var15 + arg5 + -(arg4.method774() / 2), arg0, arg2, arg5);
    }
}
