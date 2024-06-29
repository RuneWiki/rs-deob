import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class41 {

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "Ler;")
    private class157 field630 = new class157(64);

    @OriginalMember(owner = "client!rv", name = "o", descriptor = "Ler;")
    public class157 field638 = new class157(64);

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "Lns;")
    public class438 field626;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "Lns;")
    private class438 field624;

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "[I")
    public static int[] field631 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "Lgl;")
    public static class432 field625 = new class432("", 16);

    @OriginalMember(owner = "client!rv", name = "n", descriptor = "Lpg;")
    public static class492 field637 = new class492(39, -2);

    @OriginalMember(owner = "client!rv", name = "p", descriptor = "Lcm;")
    public static class449 field639 = new class449(57, 3);

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!rv", name = "j", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!rv", name = "k", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!rv", name = "m", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!rv", name = "l", descriptor = "[Lf;")
    public static class191[] field635;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(II)V")
    public final void method321(int arg0, int arg1) {
        class157 var3 = this.field630;
        synchronized (this.field630) {
            this.field630.method1016(arg0, (byte) 126);
            if (arg1 != 3) {
                this.method321(-16, 88);
            }
        }
        field636++;
        class157 var4 = this.field638;
        synchronized (this.field638) {
            this.field638.method1016(arg0, (byte) 116);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V")
    public final void method322(int arg0) {
        if (arg0 <= 50) {
            field631 = null;
        }
        class157 var2 = this.field630;
        synchronized (this.field630) {
            this.field630.method1015((byte) 105);
        }
        field627++;
        class157 var3 = this.field638;
        synchronized (this.field638) {
            this.field638.method1015((byte) 84);
        }
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(II)I")
    public static int method323(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "([[[Ldr;I)V")
    public static final void method324(class420[][][] arg0, int arg1) {
        field628++;
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class420[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class420 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field6260 instanceof class196) {
                            ((class196) var6.field6260).method59((byte) 112);
                        }
                        if (var6.field6277 instanceof class196) {
                            ((class196) var6.field6277).method59((byte) -68);
                        }
                        if (var6.field6283 instanceof class196) {
                            ((class196) var6.field6283).method59((byte) 96);
                        }
                        if (var6.field6261 instanceof class196) {
                            ((class196) var6.field6261).method59((byte) -65);
                        }
                        if (var6.field6271 instanceof class196) {
                            ((class196) var6.field6271).method59((byte) 121);
                        }
                        for (class115 var7 = var6.field6273; var7 != null; var7 = var7.field1600) {
                            class153 var8 = var7.field1594;
                            if (var8 instanceof class196) {
                                ((class196) var8).method59((byte) -39);
                            }
                        }
                    }
                }
            }
        }
        if (arg1 >= -75) {
            method327(-33);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Z)V")
    public final void method325(boolean arg0) {
        class157 var2 = this.field630;
        synchronized (this.field630) {
            if (!arg0) {
                this.method321(-9, -89);
            }
            this.field630.method1022((byte) -34);
        }
        field629++;
        class157 var3 = this.field638;
        synchronized (this.field638) {
            this.field638.method1022((byte) -34);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIIZ)V")
    public static final void method326(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class80.field1080 = 0L;
        field633++;
        int var5 = class320.method2074(-32190);
        if (arg3 == 3 || var5 == 3) {
            arg4 = true;
        }
        if (!class337.field5242.method1138()) {
            arg4 = true;
        }
        int var6 = 96 / ((45 - arg1) / 62);
        class190.method1328(arg4, var5, arg3, arg2, arg0, -7813);
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)V")
    public static void method327(int arg0) {
        field631 = null;
        field625 = null;
        if (arg0 >= -78) {
            field637 = null;
        }
        field637 = null;
        field639 = null;
        field635 = null;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BII)V")
    public final void method328(byte arg0, int arg1, int arg2) {
        this.field630 = new class157(arg2);
        field634++;
        if (arg0 != 29) {
            this.field626 = null;
        }
        this.field638 = new class157(arg1);
    }

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "(II)Let;")
    public final class498 method329(int arg0, int arg1) {
        field632++;
        class157 var3 = this.field630;
        class498 var4;
        synchronized (this.field630) {
            var4 = (class498) this.field630.method1013((long) arg0, (byte) -106);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 != -23316) {
            this.method325(true);
        }
        byte[] var5 = this.field624.method2650(arg0, -103, 34);
        class498 var6 = new class498();
        var6.field7266 = this;
        if (var5 != null) {
            var6.method2967(new class91(var5), (byte) 116);
        }
        class157 var7 = this.field630;
        synchronized (this.field630) {
            this.field630.method1012(-102, (long) arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lgo;ILns;Lns;)V")
    public class41(class331 arg0, int arg1, class438 arg2, class438 arg3) {
        this.field626 = arg3;
        this.field624 = arg2;
        this.field624.method2645(1, 34);
    }
}
