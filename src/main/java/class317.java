import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class317 {

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "Lku;")
    private class232 field4590 = new class232(16);

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "Lb;")
    private class201 field4591;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "[B")
    public static byte[] field4594 = new byte[2048];

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field4596 = 0;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "Llh;")
    public static class337 field4601;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIILtb;I)Lhe;")
    public final class229 method2029(int arg0, int arg1, int arg2, int arg3, class251 arg4, int arg5) {
        if (arg3 <= 67) {
            field4598 = 84;
        }
        field4599++;
        class82[] var7 = null;
        class476 var8 = this.method2035(arg2, 29);
        if (var8.field6682 != null) {
            var7 = new class82[var8.field6682.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class277 var10 = arg4.method1566(true, var8.field6682[var9]);
                var7[var9] = new class82(var10.field4077, var10.field4080, var10.field4073, var10.field4075, var10.field4072, var10.field4078, var10.field4071, var10.field4074);
            }
        }
        return new class229(var8.field6684, var7, var8.field6681, arg1, arg0, arg5);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public final void method2030(byte arg0) {
        if (arg0 != -121) {
            this.method2030((byte) 125);
        }
        field4595++;
        class232 var2 = this.field4590;
        synchronized (this.field4590) {
            this.field4590.method1475(0);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)I")
    public static final int method2031(byte arg0, int arg1) {
        field4597++;
        if (arg0 != 105) {
            field4594 = null;
        }
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V")
    public static void method2032(boolean arg0) {
        field4594 = null;
        if (arg0) {
            field4601 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)V")
    public final void method2033(int arg0, int arg1) {
        class232 var3 = this.field4590;
        synchronized (this.field4590) {
            this.field4590.method1486(438127120, arg1);
            if (arg0 != -6028) {
                this.method2034(-59);
            }
        }
        field4602++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public final void method2034(int arg0) {
        field4600++;
        class232 var2 = this.field4590;
        synchronized (this.field4590) {
            int var3 = -123 % ((arg0 - 52) / 38);
            this.field4590.method1478((byte) -106);
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)Lfm;")
    private final class476 method2035(int arg0, int arg1) {
        field4593++;
        class232 var3 = this.field4590;
        class476 var4;
        synchronized (this.field4590) {
            var4 = (class476) this.field4590.method1479(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4591.method1257(arg0, arg1, 24558);
        class476 var6 = new class476();
        if (var5 != null) {
            var6.method2790(arg1 ^ 0x78, new class276(var5));
        }
        class232 var7 = this.field4590;
        synchronized (this.field4590) {
            this.field4590.method1473(var6, (long) arg0, -41);
            return var6;
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lea;ILb;)V")
    public class317(class353 arg0, int arg1, class201 arg2) {
        this.field4591 = arg2;
        this.field4591.method1235(0, 29);
    }
}
