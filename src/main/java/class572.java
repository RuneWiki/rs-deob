import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class572 {

    @OriginalMember(owner = "client!mfa", name = "f", descriptor = "Luf;")
    private class380 field7777 = new class380(256);

    @OriginalMember(owner = "client!mfa", name = "g", descriptor = "Lfa;")
    private class522 field7778;

    @OriginalMember(owner = "client!mfa", name = "k", descriptor = "Lag;")
    private class469 field7782;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "Leba;")
    public static class550 field7772 = new class550(56, 28);

    @OriginalMember(owner = "client!mfa", name = "e", descriptor = "I")
    public static int field7776 = 0;

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "I")
    public static int field7774;

    @OriginalMember(owner = "client!mfa", name = "d", descriptor = "I")
    public static int field7775;

    @OriginalMember(owner = "client!mfa", name = "h", descriptor = "I")
    public static int field7779;

    @OriginalMember(owner = "client!mfa", name = "i", descriptor = "I")
    public static int field7780;

    @OriginalMember(owner = "client!mfa", name = "j", descriptor = "I")
    public static int field7781;

    @OriginalMember(owner = "client!mfa", name = "l", descriptor = "I")
    public static int field7783;

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "Lkr;")
    public static class354 field7773;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Z)V")
    public final void method3155(boolean arg0) {
        if (!arg0) {
            this.field7777 = null;
        }
        this.field7777.method2168((byte) -110);
        field7783++;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I)V")
    public final void method3156(int arg0) {
        field7779++;
        this.field7777.method2179(false, arg0);
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ZI)Ldga;")
    public final class441 method3157(boolean arg0, int arg1) {
        field7775++;
        Object var3 = this.field7777.method2176(-125, (long) arg1);
        if (var3 != null) {
            return (class441) var3;
        } else if (this.field7778.method2961(arg0, arg1)) {
            class105 var4 = this.field7778.method2959(98, arg1);
            int var5 = var4.field1260 ? 64 : this.field7782.field6366;
            class441 var7;
            if (var4.field1251 && this.field7782.method1098()) {
                float[] var6 = this.field7778.method2960(var5, false, 25853, 0.7F, arg1, var5);
                var7 = new class441(this.field7782, 3553, 34842, var5, var5, var4.field1261 != 0, var6, 6408);
            } else {
                int[] var8;
                if (!var4.field1253 && class113.method668((byte) 68, var4.field1255)) {
                    var8 = this.field7778.method2964(arg1, (byte) 67, var5, true, 0.7F, var5);
                } else {
                    var8 = this.field7778.method2963(false, var5, true, var5, 0.7F, arg1);
                }
                var7 = new class441(this.field7782, 3553, 6408, var5, var5, var4.field1261 != 0, var8, false);
            }
            var7.method2495(var4.field1254, var4.field1264, (byte) -1);
            this.field7777.method2174(var7, (long) arg1, (byte) -113);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(B)V")
    public static void method3158(byte arg0) {
        if (arg0 != 79) {
            field7776 = -123;
        }
        field7772 = null;
        field7773 = null;
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(B)V")
    public static final void method3159(byte arg0) {
        class699.field9857 = true;
        field7780++;
        if (arg0 <= 5) {
            method3161(57, 0);
        }
    }

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "(B)V")
    public static final void method3160(byte arg0) {
        field7781++;
        class289.field3807.method3011(-1);
        int var1 = class289.field3807.method3008(false, 8);
        if (var1 < class289.field3820) {
            for (int var2 = var1; var2 < class289.field3820; var2++) {
                class651.field9044[class244.field3197++] = class389.field5220[var2];
            }
        }
        if (class289.field3820 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class289.field3820 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class389.field5220[var3];
            class351 var5 = ((class407) class296.field3921.method3057(1, (long) var4)).field5354;
            int var6 = class289.field3807.method3008(false, 1);
            if (var6 == 0) {
                class389.field5220[class289.field3820++] = var4;
                var5.field2998 = class327.field4404;
            } else {
                int var7 = class289.field3807.method3008(false, 2);
                if (var7 == 0) {
                    class389.field5220[class289.field3820++] = var4;
                    var5.field2998 = class327.field4404;
                    class284.field3738[class360.field4779++] = var4;
                } else if (var7 == 1) {
                    class389.field5220[class289.field3820++] = var4;
                    var5.field2998 = class327.field4404;
                    int var8 = class289.field3807.method3008(false, 3);
                    var5.method2075(var8, false, 1);
                    int var9 = class289.field3807.method3008(false, 1);
                    if (var9 == 1) {
                        class284.field3738[class360.field4779++] = var4;
                    }
                } else if (var7 == 2) {
                    class389.field5220[class289.field3820++] = var4;
                    var5.field2998 = class327.field4404;
                    if (class289.field3807.method3008(false, 1) == 1) {
                        int var11 = class289.field3807.method3008(false, 3);
                        var5.method2075(var11, false, 2);
                        int var12 = class289.field3807.method3008(false, 3);
                        var5.method2075(var12, false, 2);
                    } else {
                        int var10 = class289.field3807.method3008(false, 3);
                        var5.method2075(var10, false, 0);
                    }
                    int var13 = class289.field3807.method3008(false, 1);
                    if (var13 == 1) {
                        class284.field3738[class360.field4779++] = var4;
                    }
                } else if (var7 == 3) {
                    class651.field9044[class244.field3197++] = var4;
                }
            }
        }
        if (arg0 < 87) {
            method3158((byte) -65);
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(II)V")
    public static final void method3161(int arg0, int arg1) {
        field7774++;
        class256 var2 = class592.method3279((byte) -39, 2, arg0);
        if (arg1 == 5519) {
            var2.method1546((byte) 116);
        }
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Lag;Lfa;)V")
    public class572(class469 arg0, class522 arg1) {
        this.field7778 = arg1;
        this.field7782 = arg0;
    }
}
