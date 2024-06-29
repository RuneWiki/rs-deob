import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class539 {

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "Lpa;")
    private class387 field7572 = new class387(16);

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "Lcb;")
    private class544 field7566;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "Lke;")
    public static class622 field7570 = new class622(28, 3);

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "Lofa;")
    public static class345 field7574 = new class345(1);

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field7567;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public static int field7568;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public static int field7569;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field7571;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
    public static int field7573;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
    public static int field7575;

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
    public static int field7576;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(BI)Lvk;")
    private final class385 method3107(byte arg0, int arg1) {
        field7573++;
        class387 var3 = this.field7572;
        class385 var4;
        synchronized (this.field7572) {
            var4 = (class385) this.field7572.method2373((long) arg1, 103);
        }
        if (var4 != null) {
            return var4;
        }
        class544 var5 = this.field7566;
        byte[] var6;
        synchronized (this.field7566) {
            var6 = this.field7566.method3150(arg1, -66, 29);
        }
        class385 var7 = new class385();
        if (var6 != null) {
            var7.method2356(10496, new class120(var6));
        }
        class387 var8 = this.field7572;
        synchronized (this.field7572) {
            this.field7572.method2362(var7, 0, (long) arg1);
        }
        int var9 = 96 / ((-arg0 - 40) / 55);
        return var7;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)V")
    public final void method3108(int arg0, int arg1) {
        if (arg1 != 22039) {
            this.method3110(-10);
        }
        class387 var3 = this.field7572;
        synchronized (this.field7572) {
            this.field7572.method2366(arg0, 118);
        }
        field7575++;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
    public static void method3109(int arg0) {
        field7574 = null;
        if (arg0 != 0) {
            field7574 = null;
        }
        field7570 = null;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)V")
    public final void method3110(int arg0) {
        field7569++;
        if (arg0 <= 51) {
            field7574 = null;
        }
        class387 var2 = this.field7572;
        synchronized (this.field7572) {
            this.field7572.method2369(-1);
        }
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(I)V")
    public final void method3111(int arg0) {
        class387 var2 = this.field7572;
        synchronized (this.field7572) {
            this.field7572.method2364(1);
            if (arg0 != 29) {
                this.method3108(-28, -97);
            }
        }
        field7571++;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIZ)I")
    public static final int method3112(int arg0, int arg1, boolean arg2) {
        field7567++;
        if (arg2) {
            return 0;
        }
        class685 var3 = class26.method198(arg2, (byte) -19, arg1);
        if (var3 == null) {
            return class783.field10778.method3934(true, arg1).field9730;
        }
        int var4 = arg0;
        for (int var5 = 0; var5 < var3.field9723.length; var5++) {
            if (var3.field9723[var5] == -1) {
                var4++;
            }
        }
        return var4 + class783.field10778.method3934(true, arg1).field9730 - var3.field9723.length;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIILqh;II)Lfj;")
    public final class681 method3113(int arg0, int arg1, int arg2, class75 arg3, int arg4, int arg5) {
        field7568++;
        class620[] var7 = null;
        if (arg4 != 29) {
            return null;
        }
        class385 var8 = this.method3107((byte) 51, arg0);
        if (var8.field5487 != null) {
            var7 = new class620[var8.field5487.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class648 var10 = arg3.method586((byte) 127, var8.field5487[var9]);
                var7[var9] = new class620(var10.field9126, var10.field9123, var10.field9124, var10.field9120, var10.field9114, var10.field9128, var10.field9127, var10.field9122);
            }
        }
        return new class681(var8.field5490, var7, var8.field5489, arg5, arg2, arg1);
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Liv;ILcb;)V")
    public class539(class106 arg0, int arg1, class544 arg2) {
        this.field7566 = arg2;
        this.field7566.method3147(29, -56);
    }
}
