import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class181 {

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "Lqe;")
    private class149 field3524 = new class149();

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "Luh;")
    private class188 field3538 = new class188();

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    private int field3536;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    private int field3537;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "Lsa;")
    private class163 field3539;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field3528 = -1;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Lsg;")
    public static class169 field3526 = class165.method1060("Stufe)2", 1536);

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field3527 = 0;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "Lwh;")
    public static class206 field3531;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "[I")
    public static int[] field3521;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "[I")
    public static int[] field3532;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static void method1202(int arg0) {
        field3521 = null;
        field3526 = null;
        int var1 = -97 / ((-arg0 - 47) / 56);
        field3532 = null;
        field3531 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Z")
    public static final boolean method1203(int arg0, int arg1) {
        field3535++;
        if (arg1 < 32) {
            return false;
        }
        if (arg0 != -160) {
            method1203(93, -63);
        }
        if (arg1 == 127) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(JI)V")
    public final void method1204(long arg0, int arg1) {
        if (arg1 != 0) {
            method1202(31);
        }
        field3530++;
        class149 var4 = (class149) this.field3539.method1045(arg0, (byte) -77);
        if (var4 != null) {
            var4.method1213(9104);
            var4.method973(11076);
            this.field3537++;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
    public final void method1205(boolean arg0) {
        field3525++;
        while (true) {
            class149 var2 = this.field3538.method1236((byte) 80);
            if (var2 == null) {
                if (!arg0) {
                    this.field3539 = null;
                }
                this.field3537 = this.field3536;
                return;
            }
            var2.method1213(9104);
            var2.method973(11076);
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(JI)Lqe;")
    public final class149 method1206(long arg0, int arg1) {
        if (arg1 != -24742) {
            return null;
        }
        class149 var4 = (class149) this.field3539.method1045(arg0, (byte) -77);
        if (var4 != null) {
            this.field3538.method1237(var4, arg1 + 24778);
        }
        field3533++;
        return var4;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)Lub;")
    public final class182 method1207(int arg0) {
        if (arg0 < 3) {
            return null;
        } else {
            field3523++;
            return this.field3539.method1042((byte) 104);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(JILqe;)V")
    public final void method1208(long arg0, int arg1, class149 arg2) {
        field3529++;
        int var5 = 53 % ((arg1 - 9) / 38);
        if (this.field3537 == 0) {
            class149 var6 = this.field3538.method1236((byte) 80);
            var6.method1213(9104);
            var6.method973(11076);
            if (this.field3524 == var6) {
                class149 var7 = this.field3538.method1236((byte) 80);
                var7.method1213(9104);
                var7.method973(11076);
            }
        } else {
            this.field3537--;
        }
        this.field3539.method1044(arg0, true, arg2);
        this.field3538.method1237(arg2, 68);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)Lub;")
    public final class182 method1209(byte arg0) {
        if (arg0 >= -34) {
            this.method1207(17);
        }
        field3522++;
        return this.field3539.method1047((byte) 64);
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(I)V")
    public class181(int arg0) {
        this.field3536 = arg0;
        this.field3537 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field3539 = new class163(var2);
    }
}
