import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!e")
public class class8 extends class33 {

    @OriginalMember(owner = "mapview!e", name = "h", descriptor = "Lta;")
    public static class37 field92 = class20.method87(-99, "(U");

    @OriginalMember(owner = "mapview!e", name = "i", descriptor = "Lta;")
    public static class37 field93 = class20.method87(-117, "fonts");

    @OriginalMember(owner = "mapview!e", name = "j", descriptor = "Lta;")
    public static class37 field94 = class20.method87(-111, "Staff Shop");

    @OriginalMember(owner = "mapview!e", name = "g", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "mapview!e", name = "c", descriptor = "(B)V", line = 14)
    public static void method34(byte arg0) {
        if (arg0 == -92) {
            field93 = null;
            field94 = null;
            field92 = null;
        }
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lj;", line = 43)
    public static final class18 method35(Throwable arg0, String arg1) {
        class18 var2;
        if (arg0 instanceof class18) {
            var2 = (class18) arg0;
            var2.field179 = var2.field179 + ' ' + arg1;
        } else {
            var2 = new class18(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(B[B)V", line = 69)
    public static final void method36(byte arg0, byte[] arg1) {
        if (arg0 <= 26) {
            method36((byte) -76, null);
        }
        class21 var2 = new class21(arg1);
        var2.field235 = arg1.length - 2;
        class2.field19 = var2.method98(-2);
        class11.field121 = new int[class2.field19];
        class38.field517 = new byte[class2.field19][];
        class20.field231 = new int[class2.field19];
        class12.field138 = new int[class2.field19];
        class37.field507 = new int[class2.field19];
        var2.field235 = arg1.length - class2.field19 * 8 - 7;
        class4.field48 = var2.method98(-2);
        field91 = var2.method98(-2);
        int var3 = (var2.method96(255) & 0xFF) + 1;
        for (int var4 = 0; var4 < class2.field19; var4++) {
            class37.field507[var4] = var2.method98(-2);
        }
        for (int var5 = 0; var5 < class2.field19; var5++) {
            class11.field121[var5] = var2.method98(-2);
        }
        for (int var6 = 0; var6 < class2.field19; var6++) {
            class12.field138[var6] = var2.method98(-2);
        }
        for (int var7 = 0; var7 < class2.field19; var7++) {
            class20.field231[var7] = var2.method98(-2);
        }
        var2.field235 = arg1.length - (var3 - 1) * 3 - class2.field19 * 8 - 7;
        class7.field78 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class7.field78[var8] = var2.method99(-16880);
            if (class7.field78[var8] == 0) {
                class7.field78[var8] = 1;
            }
        }
        var2.field235 = 0;
        for (int var9 = 0; var9 < class2.field19; var9++) {
            int var10 = class12.field138[var9];
            int var11 = class20.field231[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class38.field517[var9] = var13;
            int var14 = var2.method96(255);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method94(126);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var10; var16++) {
                    for (int var17 = 0; var17 < var11; var17++) {
                        var13[var10 * var17 + var16] = var2.method94(15);
                    }
                }
            }
        }
    }
}
