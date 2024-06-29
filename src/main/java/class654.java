import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class654 {

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public int field8663 = class741.method4127((byte) -57);

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "Ljava/lang/String;")
    public String field8666;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "Ljava/lang/String;")
    public String field8662;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "Ljava/lang/String;")
    public String field8657;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
    public int field8673;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "Ljava/lang/String;")
    public String field8669;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public int field8664;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public int field8661;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public int field8660;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "Ljava/lang/String;")
    public String field8668;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "Lee;")
    public static class677 field8665 = new class677(1350);

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "Lmha;")
    public static class419 field8672 = new class419(5, 1);

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field8658;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field8659;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public static int field8667;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    public static int field8671;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "Lwu;")
    public static class376 field8670;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V")
    public static void method3558(boolean arg0) {
        field8665 = null;
        field8670 = null;
        if (arg0) {
            field8672 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public final void method3559(String arg0, int arg1, int arg2, int arg3, String arg4, int arg5, String arg6, String arg7, String arg8) {
        this.field8663 = class741.method4127((byte) -118);
        field8671++;
        this.field8657 = arg4;
        this.field8669 = arg0;
        this.field8661 = class29.field474;
        if (arg5 != 1350) {
            this.field8666 = null;
        }
        this.field8668 = arg8;
        this.field8673 = arg3;
        this.field8664 = arg2;
        this.field8662 = arg7;
        this.field8660 = arg1;
        this.field8666 = arg6;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
    public static final void method3560(byte arg0) {
        field8658++;
        class574 var1 = null;
        try {
            var1 = class192.method1307((byte) -91, "2");
            if (arg0 > -81) {
                method3561(null, null, null, -2);
            }
            class677 var2 = new class677((class679.field9481 * 6) + 3);
            var2.method3823(-27, 1);
            var2.method3831(1182, class679.field9481);
            for (int var3 = 0; var3 < class540.field7160.length; var3++) {
                if (class763.field10629[var3]) {
                    var2.method3831(1182, var3);
                    var2.method3798(27695, class540.field7160[var3]);
                }
            }
            var1.method3161(3874, 0, var2.field9419, var2.field9399);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method3157(-124);
            }
        } catch (Exception var4) {
        }
        class640.field8487 = class375.method2193(116);
        class464.field6381 = false;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lpda;Lha;Ldh;I)V")
    public static final void method3561(class630 arg0, class59 arg1, class325 arg2, int arg3) {
        field8667++;
        class133 var4 = arg2.method1967(false, arg1);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method1042();
        if (var5 < var4.method1043()) {
            var5 = var4.method1043();
        }
        byte var6 = 10;
        int var7 = arg0.field8389;
        int var8 = arg0.field8393;
        int var9 = 0;
        if (arg3 != 6983) {
            method3561(null, null, null, 8);
        }
        int var10 = 0;
        int var11 = 0;
        if (arg2.field4657 != null) {
            var9 = class304.field4337.method3006(arg2.field4657, 174, null, class557.field7343, null);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class557.field7343[var12];
                if ((var9 - 1) > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class565.field7435.method2042(var13);
                if (var10 < var14) {
                    var10 = var14;
                }
            }
            var11 = class565.field7435.method2041() * var9 + (class565.field7435.method2040() / 2);
        }
        int var15 = var5 / 2 + arg0.field8389;
        int var16 = arg0.field8393;
        if (var7 < (class744.field10366 + var5)) {
            var7 = class744.field10366;
            var15 = var10 / 2 + class744.field10366 + (var5 / 2) + (var6 - -5);
        } else if ((class744.field10368 - var5) < var7) {
            var7 = class744.field10368 - var5;
            var15 = class744.field10368 - (var10 / 2) - var6 - var5 / 2 - 5;
        }
        if ((class744.field10372 + var5) > var8) {
            var16 = class744.field10372 + var6 + (var5 / 2);
            var8 = class744.field10372;
        } else if (var8 > (class744.field10358 - var5)) {
            var16 = class744.field10358 - (var5 / 2) - var11 - var6;
            var8 = class744.field10358 - var5;
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg0.field8389), (double) (var8 - arg0.field8393)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method1029((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg2.field4657 != null) {
            var19 = var16;
            var18 = var15 - var10 / 2 - 5;
            var20 = var18 + var10 + 10;
            var21 = class565.field7435.method2041() * var9 + var16 + 3;
            if (arg2.field4617 != 0) {
                arg1.method489(var20 - var18, arg3 ^ 0x1B7B, var21 - var16, var16, var18, arg2.field4617);
            }
            if (arg2.field4633 != 0) {
                arg1.method434(var21 - var16, arg2.field4633, var20 - var18, arg3 + -6873, var16, var18);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class557.field7343[var22];
                if (var9 - 1 > var22) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class565.field7435.method2044(arg1, var23, var15, var16, arg2.field4650, true);
                var16 += class565.field7435.method2041();
            }
        }
        if (arg2.field4615 == -1 && arg2.field4657 == null) {
            return;
        }
        class621 var24 = new class621(arg0);
        int var25 = var5 >> 1;
        var24.field8281 = var21;
        var24.field8271 = var8 - var25;
        var24.field8279 = var18;
        var24.field8272 = var19;
        var24.field8277 = var8 + var25;
        var24.field8274 = var7 + var25;
        var24.field8278 = var20;
        var24.field8270 = var7 - var25;
        class668.field9127.method11(var24, -88);
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public class654(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field8666 = arg7;
        this.field8662 = arg2;
        this.field8657 = arg4;
        this.field8673 = arg0;
        this.field8669 = arg5;
        this.field8664 = arg1;
        this.field8661 = class29.field474;
        this.field8660 = arg6;
        this.field8668 = arg3;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IBLjava/net/Socket;)Lgn;")
    public static final class702 method3562(int arg0, byte arg1, Socket arg2) throws IOException {
        field8659++;
        if (arg1 >= 0) {
            field8672 = null;
        }
        return new class225(arg2, arg0);
    }
}
