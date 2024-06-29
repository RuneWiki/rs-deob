import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class25 {

    @OriginalMember(owner = "client!e", name = "n", descriptor = "Z")
    public boolean field497 = true;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public int field490;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public int field493;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public int field485;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public int field488;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public int field491;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public int field498;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field489 = 0;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    public static int field495 = 1;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "Z")
    public static boolean field486 = false;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "Lkc;")
    public static class63 field487 = new class63(100);

    @OriginalMember(owner = "client!e", name = "r", descriptor = "Lmc;")
    private static class75 field501 = class30.method234(true, "Private chat");

    @OriginalMember(owner = "client!e", name = "p", descriptor = "Lmc;")
    public static class75 field499 = field501;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "Lkc;")
    public static class63 field500 = new class63(50);

    @OriginalMember(owner = "client!e", name = "u", descriptor = "I")
    public static int field504 = 0;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "Lmc;")
    private static class75 field505 = class30.method234(true, "button near the top of that page)3");

    @OriginalMember(owner = "client!e", name = "t", descriptor = "Lmc;")
    public static class75 field503 = class30.method234(true, "Chat panel redrawn");

    @OriginalMember(owner = "client!e", name = "x", descriptor = "Lmc;")
    private static class75 field507 = class30.method234(true, "Could not complete login)3");

    @OriginalMember(owner = "client!e", name = "y", descriptor = "Lmc;")
    public static class75 field508 = field507;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "Lmc;")
    public static class75 field506 = class30.method234(true, "sideicons");

    @OriginalMember(owner = "client!e", name = "z", descriptor = "I")
    public static int field509 = 0;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "Lmc;")
    private static class75 field510 = class30.method234(true, "M");

    @OriginalMember(owner = "client!e", name = "B", descriptor = "Lmc;")
    public static class75 field511 = field505;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "Lmc;")
    public static class75 field502 = field510;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([BIIII[Lba;Led;IIII)V", line = 10)
    public static final void method169(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class8[] arg5, class29 arg6, int arg7, int arg8, int arg9, int arg10) {
        field492++;
        class61 var11 = new class61(arg0);
        int var12 = arg10;
        while (true) {
            int var13 = var11.method498(arg10 ^ 0x80);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method498(-129);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var11.method494(arg10 ^ 0xFFFFB008);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg2 == var18 && arg3 <= var17 && arg3 + 8 > var17 && arg8 <= var16 && var16 < arg8 + 8) {
                    class59 var22 = class50.method387(-26274, var12);
                    int var23 = class37.method287(arg10 - 97, var16 & 0x7, var21, arg4, var22.field1530, var22.field1525, var17 & 0x7) + arg9;
                    int var24 = arg7 + class61.method504(var22.field1525, var22.field1530, (byte) 113, var21, var17 & 0x7, arg4, var16 & 0x7);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        int var25 = arg1;
                        class8 var26 = null;
                        if ((class74.field1836[1][var23][var24] & 0x2) == 2) {
                            var25 = arg1 - 1;
                        }
                        if (var25 >= 0) {
                            var26 = arg5[var25];
                        }
                        class5.method25((byte) -100, var20, var26, var24, var23, arg4 + var21 & 0x3, arg1, var12, arg6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I[BIB)Lmc;", line = 93)
    public static final class75 method170(int arg0, byte[] arg1, int arg2, byte arg3) {
        field484++;
        class75 var4 = new class75();
        if (arg3 != -53) {
            field511 = null;
        }
        var4.field1912 = new byte[arg2];
        var4.field1869 = 0;
        for (int var5 = arg0; var5 < arg0 + arg2; var5++) {
            if (arg1[var5] != 0) {
                var4.field1912[var4.field1869++] = arg1[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V", line = 128)
    public static void method171(int arg0) {
        field510 = null;
        field506 = null;
        field487 = null;
        field507 = null;
        field505 = null;
        field502 = null;
        field508 = null;
        field500 = null;
        if (arg0 != 14171) {
            method170(-66, null, -62, (byte) 79);
        }
        field503 = null;
        field501 = null;
        field511 = null;
        field499 = null;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(IIIIIIZ)V", line = 170)
    public class25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field490 = arg0;
        this.field493 = arg1;
        this.field485 = arg3;
        this.field488 = arg2;
        this.field491 = arg4;
        this.field497 = arg6;
        this.field498 = arg5;
    }
}
