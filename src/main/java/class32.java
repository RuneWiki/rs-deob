import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class32 implements class708 {

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "Lk;")
    private class565 field420;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "[Luq;")
    private class159[] field413;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "[I")
    public static int[] field424 = new int[3];

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "Lha;")
    private class58 field414;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "Z")
    private boolean field417;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V")
    public final void method183(int arg0) {
        if (class268.field3831 != this.field414) {
            this.field417 = true;
            this.field414 = class268.field3831;
        }
        field423++;
        this.field414.method429(0);
        class159[] var2 = this.field413;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class159 var5 = var2[var3];
            if (var5 != null) {
                var5.method55(11133);
            }
        }
        int var4 = -119 % ((15 - arg0) / 44);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)I")
    public final int method184(int arg0) {
        field419++;
        int var2 = -110 % ((-arg0 - 16) / 47);
        int var3 = 0;
        class159[] var4 = this.field413;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class159 var6 = var4[var5];
            if (var6 == null || var6.method49(-32252)) {
                var3++;
            }
        }
        return var3 * 100 / this.field413.length;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(JI)Z")
    public final boolean method185(long arg0, int arg1) {
        if (arg1 != 14320) {
            field424 = null;
        }
        field416++;
        return class479.method2864((byte) -77) >= arg0 + ((long) this.field420.field8024);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIBIIIII)V")
    public static final void method186(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 < -17) {
            class712.method4006(arg1, (byte) -59, arg2, arg5, arg4, arg7, arg0, 0, arg6, arg8);
            field425++;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZI)V")
    public final void method187(boolean arg0, int arg1) {
        boolean var3 = true;
        field418++;
        class159[] var4 = this.field413;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class159 var6 = var4[var5];
            if (var6 != null) {
                var6.method1056(var3 || this.field417, -3340);
            }
        }
        if (arg1 != 13751) {
            this.method187(false, -23);
        }
        this.field417 = false;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)I")
    public final int method188(byte arg0) {
        field415++;
        return arg0 <= 114 ? 29 : this.field420.field8018;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)V")
    public static void method189(byte arg0) {
        if (arg0 != -86) {
            method191((byte) 3);
        }
        field424 = null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)V")
    public final void method190(boolean arg0) {
        if (arg0) {
            field421++;
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lk;Loo;)V")
    public class32(class565 arg0, class626 arg1) {
        this.field420 = arg0;
        this.field413 = new class159[this.field420.field8021.length];
        for (int var3 = 0; var3 < this.field413.length; var3++) {
            this.field413[var3] = arg1.method3514(5, this.field420.field8021[var3]);
        }
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(B)I")
    public static final int method191(byte arg0) {
        field422++;
        int var1 = 5 / ((-arg0 - 9) / 40);
        return class219.field2860;
    }
}
