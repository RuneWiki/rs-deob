import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class239 {

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "Lhca;")
    private class418 field3441;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field3437;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field3445;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "Lje;")
    private class341 field3435;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "Lud;")
    private class32 field3446;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "[I")
    public static int[] field3444 = new int[14];

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "Lmt;")
    public static class336 field3438 = new class336("WTRC", 1);

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "F")
    public static float field3447;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "Lgw;")
    private class148 field3442;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "[Lfe;")
    private class490[] field3436;

    static {
        new class572(null, "geschickt werden.", null, null);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZLcw;ZLcw;)Lfe;", line = 3)
    private final class490 method1524(int arg0, boolean arg1, class157 arg2, boolean arg3, class157 arg4) {
        field3440++;
        if (this.field3442 == null) {
            throw new RuntimeException();
        } else if (arg0 < 0 || this.field3436.length <= arg0) {
            throw new RuntimeException();
        } else if (this.field3436[arg0] == null) {
            this.field3442.field2177 = arg0 * 72 + 6;
            int var6 = this.field3442.method1026(-917302120);
            if (!arg1) {
                return null;
            }
            int var7 = this.field3442.method1026(-917302120);
            byte[] var8 = new byte[64];
            this.field3442.method1060((byte) 52, var8, 0, 64);
            class490 var9 = new class490(arg0, arg2, arg4, this.field3441, this.field3435, var6, var8, var7, arg3);
            this.field3436[arg0] = var9;
            return var9;
        } else {
            return this.field3436[arg0];
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V", line = 51)
    public static void method1525(int arg0) {
        field3438 = null;
        if (arg0 != 23363) {
            method1525(72);
        }
        field3444 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lcw;ILcw;I)Lfe;", line = 62)
    public final class490 method1526(class157 arg0, int arg1, class157 arg2, int arg3) {
        field3434++;
        if (arg1 > -116) {
            field3438 = null;
        }
        return this.method1524(arg3, true, arg2, true, arg0);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)Z", line = 81)
    public final boolean method1527(byte arg0) {
        field3439++;
        if (this.field3442 != null) {
            return true;
        }
        if (arg0 > -100) {
            this.method1526(null, -60, null, -58);
        }
        if (this.field3446 == null) {
            if (this.field3441.method2458(97)) {
                return false;
            }
            this.field3446 = this.field3441.method2460(255, 255, true, (byte) 0, -59);
        }
        if (this.field3446.field3178) {
            return false;
        }
        class148 var2 = new class148(this.field3446.method207(192));
        var2.field2177 = 5;
        int var3 = var2.method1032((byte) -33);
        var2.field2177 += var3 * 72;
        byte[] var4 = new byte[var2.field2146.length - var2.field2177];
        var2.method1060((byte) 104, var4, 0, var4.length);
        byte[] var7;
        if (this.field3437 == null || this.field3445 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field3437, this.field3445);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class45.method286(var2.field2146, -18340, var2.field2177 - var4.length - 5, 5);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field3442 = var2;
        this.field3436 = new class490[var3];
        return true;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)V", line = 156)
    public final void method1528(boolean arg0) {
        field3443++;
        if (this.field3436 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3436.length; var2++) {
            if (this.field3436[var2] != null) {
                this.field3436[var2].method2929(arg0);
            }
        }
        for (int var3 = 0; var3 < this.field3436.length; var3++) {
            if (this.field3436[var3] != null) {
                this.field3436[var3].method2930(-118);
            }
        }
        if (!arg0) {
            this.method1528(true);
        }
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lhca;Lje;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", line = 203)
    public class239(class418 arg0, class341 arg1, BigInteger arg2, BigInteger arg3) {
        this.field3441 = arg0;
        this.field3437 = arg2;
        this.field3445 = arg3;
        this.field3435 = arg1;
        if (!this.field3441.method2458(-92)) {
            this.field3446 = this.field3441.method2460(255, 255, true, (byte) 0, -81);
        }
    }
}
