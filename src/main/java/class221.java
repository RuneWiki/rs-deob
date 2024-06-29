import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class221 extends class279 {

    @OriginalMember(owner = "client!td", name = "K", descriptor = "I")
    private int field3577 = 0;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "I")
    private int field3573 = 0;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "I")
    private int field3586 = 1;

    @OriginalMember(owner = "client!td", name = "L", descriptor = "Ltl;")
    public static class59 field3578 = class85.method639(")4p=", 9588);

    @OriginalMember(owner = "client!td", name = "S", descriptor = "Ltl;")
    public static class59 field3585 = class85.method639("mapflag", 9588);

    @OriginalMember(owner = "client!td", name = "M", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3579 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!td", name = "H", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!td", name = "J", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!td", name = "N", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!td", name = "O", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "Lda;")
    public static class179 field3582;

    @OriginalMember(owner = "client!td", name = "I", descriptor = "Lme;")
    public static class295 field3575;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "[[Lkj;")
    public static class32[][] field3587;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "()V", line = 11)
    public static final void method1530() {
        for (int var0 = 0; var0 < class269.field4672; var0++) {
            class165 var1 = class131.field2171[var0];
            class146.method1058(var1);
            class131.field2171[var0] = null;
        }
        class269.field4672 = 0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IILs;)V", line = 36)
    public final void method51(int arg0, int arg1, class170 arg2) {
        if (arg1 == 0) {
            this.field3573 = arg2.method1221(85);
        } else if (arg1 == 1) {
            this.field3577 = arg2.method1221(107);
        } else if (arg1 == 3) {
            this.field3586 = arg2.method1221(126);
        }
        if (arg0 > -125) {
            field3582 = (class179) null;
        }
        field3581++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V", line = 78)
    public final void method319(byte arg0) {
        if (arg0 <= -9) {
            field3584++;
            class162.method1155(0);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZI)[I", line = 91)
    public final int[] method44(boolean arg0, int arg1) {
        field3580++;
        int[] var3 = this.field4781.method165(arg1, (byte) -11);
        if (this.field4781.field354) {
            int var4 = class71.field1104[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class56.field835; var6++) {
                int var7 = class31.field430[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (this.field3573 == 0) {
                    var9 = (var7 - var4) * this.field3586;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field3586 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & 0xFFFFF000);
                if (this.field3577 == 0) {
                    var12 = class53.field787[(var12 & 0xFFD) >> 4] + 4096 >> 1;
                } else if (this.field3577 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        if (arg0) {
            this.field3586 = 30;
        }
        return var3;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(B)V", line = 165)
    public static void method1531(byte arg0) {
        int var1 = 29 / ((-arg0 - 11) / 57);
        field3587 = (class32[][]) null;
        field3575 = null;
        field3582 = null;
        field3585 = null;
        field3579 = null;
        field3578 = null;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V", line = 239)
    public class221() {
        super(0, true);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IILme;I)[Lhi;", line = 181)
    public static final class189[] method1532(int arg0, int arg1, class295 arg2, int arg3) {
        field3574++;
        if (class33.method222(6, arg0, arg1, arg2)) {
            if (arg3 != 2048) {
                field3582 = (class179) null;
            }
            return class145.method1050((byte) -108);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)Lrj;", line = 206)
    public static final class310 method1533(int arg0, byte arg1) {
        field3576++;
        class310 var2 = (class310) class9.field123.method1483((byte) -74, (long) arg0);
        if (var2 != null) {
            return var2;
        } else if (arg1 == -44) {
            byte[] var3 = class287.field4940.method2042(class290.method2013(arg0, false), class269.method1880(arg1 + 47, arg0), (byte) -123);
            class310 var4 = new class310();
            var4.field5260 = arg0;
            if (var3 != null) {
                var4.method2144(new class170(var3), false);
            }
            class9.field123.method1488((long) arg0, var4, 25838);
            return var4;
        } else {
            return (class310) null;
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(III)Lnh;", line = 232)
    public static final class222 method1534(int arg0, int arg1, int arg2) {
        class245 var3 = class120.field2010[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4104;
    }
}
