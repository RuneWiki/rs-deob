import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class755 {

    @OriginalMember(owner = "client!eca", name = "h", descriptor = "I")
    public int field10542;

    @OriginalMember(owner = "client!eca", name = "g", descriptor = "I")
    public int field10541;

    @OriginalMember(owner = "client!eca", name = "i", descriptor = "Lfh;")
    public static class652 field10543 = new class652("WTI", 5);

    @OriginalMember(owner = "client!eca", name = "m", descriptor = "[I")
    public static int[] field10547 = new int[64];

    @OriginalMember(owner = "client!eca", name = "j", descriptor = "Lkf;")
    public static class255 field10544 = new class255();

    @OriginalMember(owner = "client!eca", name = "q", descriptor = "Ljr;")
    public static class112 field10551 = new class112(32);

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "I")
    public int field10535;

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "I")
    public int field10536;

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "I")
    public int field10537;

    @OriginalMember(owner = "client!eca", name = "d", descriptor = "I")
    public static int field10538;

    @OriginalMember(owner = "client!eca", name = "e", descriptor = "I")
    public static int field10539;

    @OriginalMember(owner = "client!eca", name = "f", descriptor = "I")
    public static int field10540;

    @OriginalMember(owner = "client!eca", name = "n", descriptor = "I")
    public static int field10548;

    @OriginalMember(owner = "client!eca", name = "o", descriptor = "Lbca;")
    public class661 field10549;

    @OriginalMember(owner = "client!eca", name = "k", descriptor = "Leca;")
    public class755 field10545;

    @OriginalMember(owner = "client!eca", name = "l", descriptor = "Ljava/awt/Image;")
    public static Image field10546;

    @OriginalMember(owner = "client!eca", name = "p", descriptor = "[[I")
    public static int[][] field10550;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)V")
    public static void method4212(int arg0) {
        field10543 = null;
        field10550 = null;
        if (arg0 > 5) {
            field10544 = null;
            field10547 = null;
            field10551 = null;
            field10546 = null;
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lcs;Llga;IIILha;IILii;)V")
    public static final void method4213(class342 arg0, class710 arg1, int arg2, int arg3, int arg4, class59 arg5, int arg6, int arg7, class553 arg8) {
        if (arg3 != 64) {
            return;
        }
        field10539++;
        int var9 = arg2 - arg7 / 2 - 5;
        int var10 = arg6 + 2;
        if (arg8.field7647 != 0) {
            arg5.method624(arg7 + 10, (byte) -125, var9, var10, arg6 + (arg0.method2162() * arg4) - (var10 - 1), arg8.field7647);
        }
        if (arg8.field7649 != 0) {
            arg5.method623(arg7 + 10, var10, arg8.field7649, var9, arg4 * arg0.method2162() + arg6 - (var10 + -1), 92);
        }
        int var11 = arg8.field7625;
        if (arg1.field9630 && arg8.field7612 != -1) {
            var11 = arg8.field7612;
        }
        for (int var12 = 0; var12 < arg4; var12++) {
            String var13 = class745.field10133[var12];
            if (arg4 - 1 > var12) {
                var13 = var13.substring(0, var13.length() - 4);
            }
            arg0.method2160(arg5, var13, arg2, arg6, var11, true);
            arg6 += arg0.method2162();
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IF)F")
    public static final float method4214(int arg0, float arg1) {
        if (arg0 != 6) {
            field10544 = null;
        }
        field10548++;
        return arg1 * arg1 * arg1 * ((arg1 * 6.0F - 15.0F) * arg1 + 10.0F);
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(B)Lpo;")
    public final class558 method4215(byte arg0) {
        if (arg0 != -13) {
            method4213(null, null, -120, 35, -33, null, 90, 71, null);
        }
        field10540++;
        return class513.method3003(false, this.field10542);
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "()V")
    public static final void method4216() {
        for (int var0 = class53.field1096; var0 < class510.field7094; var0++) {
            for (int var1 = 0; var1 < class434.field6208; var1++) {
                for (int var2 = 0; var2 < class432.field6185; var2++) {
                    class384 var3 = class649.field8928[var0][var1][var2];
                    if (var3 != null) {
                        class100 var4 = var3.field5577;
                        class100 var5 = var3.field5574;
                        if (var4 != null && var4.method35(-121)) {
                            class441.method2656(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method35(-125)) {
                                class441.method2656(var5, var0, var1, var2, 1, 1);
                                var5.method33(class44.field982, 0, false, var4, 0, (byte) -110, 0);
                                var5.method44(true);
                            }
                            var4.method44(true);
                        }
                        for (class474 var6 = var3.field5567; var6 != null; var6 = var6.field6621) {
                            class494 var8 = var6.field6623;
                            if (var8 != null && var8.method35(-71)) {
                                class441.method2656(var8, var0, var1, var2, var8.field6839 + 1 - var8.field6831, var8.field6835 - var8.field6838 + 1);
                                var8.method44(true);
                            }
                        }
                        class177 var7 = var3.field5573;
                        if (var7 != null && var7.method35(-85)) {
                            class168.method1266(var7, var0, var1, var2);
                            var7.method44(true);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(BI)Leca;")
    public final class755 method4217(byte arg0, int arg1) {
        field10538++;
        return arg0 < 61 ? null : new class755(this.field10542, arg1);
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(II)V")
    public class755(int arg0, int arg1) {
        this.field10542 = arg0;
        this.field10541 = arg1;
    }
}
