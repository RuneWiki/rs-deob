import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class36 {

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "[I")
    public static int[] field554 = new int[32];

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "Lbo;")
    public static class453 field553 = new class453(16);

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field556 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Lml;")
    public static class348 field555;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static final void method279(int arg0) {
        field552++;
        class136.field1761.method366(-92);
        class244.field3423.method366(arg0 - 9744);
        class238.field3332.method366(18);
        class117.field1523.method366(-121);
        class398.field5828.method366(arg0 - 9785);
        if (arg0 != 9685) {
            method281(-112, false, (String) null, 112);
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
    public static void method280(int arg0) {
        field555 = null;
        field553 = null;
        field556 = null;
        int var1 = 91 / ((84 - arg0) / 37);
        field554 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZLjava/lang/String;I)I")
    public static final int method281(int arg0, boolean arg1, String arg2, int arg3) {
        field551++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        if (arg3 >= -50) {
            method279(-20);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var11 >= arg0) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var6 + var11;
            if (var10 / arg0 != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var10;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }
}
