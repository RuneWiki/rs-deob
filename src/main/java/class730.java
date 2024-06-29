import java.awt.Canvas;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class730 {

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "[Z")
    public static boolean[] field10211 = new boolean[100];

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field10212 = new BigInteger("8ec751c370413db79c187a9a3438c82d7a4966290b1067b1960d9b3d8f8e63c63ca5fa905c274b8ed06fbaddcb0b2d8df64928ac618accc4494fb34e641232cb", 16);

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "Ldh;")
    public static class320 field10215 = new class320(55, 8);

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public static int field10216 = 0;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field10210;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field10213;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field10214;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "Loh;")
    public static class404 field10217;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IC)Z", line = 8)
    public static final boolean method4070(int arg0, char arg1) {
        if (arg0 > -59) {
            method4070(-67, '&');
        }
        field10210++;
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IILjava/awt/Canvas;I)Lqca;", line = 22)
    public static final class115 method4071(int arg0, int arg1, Canvas arg2, int arg3) {
        field10214++;
        if (arg0 != 14444) {
            field10215 = null;
        }
        try {
            Class var4 = Class.forName("cda");
            class115 var5 = (class115) var4.getDeclaredConstructor().newInstance();
            var5.method760(arg2, arg3, true, arg1);
            return var5;
        } catch (Throwable var7) {
            class513 var6 = new class513();
            var6.method760(arg2, arg3, true, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIZII)V", line = 54)
    public static final void method4072(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field10213++;
        long var6 = (long) (arg0 | (arg3 ? Integer.MIN_VALUE : 0));
        if (arg5 >= -77) {
            method4072(66, -73, -78, true, -23, 6);
        }
        class755 var8 = (class755) class469.field6700.method1754(false, var6);
        if (var8 == null) {
            var8 = new class755();
            class469.field6700.method1751(var8, 3970, var6);
        }
        if (arg2 >= var8.field10531.length) {
            int[] var9 = new int[arg2 + 1];
            int[] var10 = new int[arg2 + 1];
            for (int var11 = 0; var11 < var8.field10531.length; var11++) {
                var9[var11] = var8.field10531[var11];
                var10[var11] = var8.field10534[var11];
            }
            for (int var12 = var8.field10531.length; var12 < arg2; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field10531 = var9;
            var8.field10534 = var10;
        }
        var8.field10531[arg2] = arg4;
        var8.field10534[arg2] = arg1;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V", line = 119)
    public static void method4073(int arg0) {
        field10215 = null;
        field10217 = null;
        if (arg0 >= -92) {
            method4073(-90);
        }
        field10212 = null;
        field10211 = null;
    }
}
