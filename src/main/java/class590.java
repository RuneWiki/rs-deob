import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class590 {

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "Lwg;")
    private class58 field8531 = new class58(64);

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "Lkr;")
    private class329 field8526;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public int field8527;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field8520;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field8521;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field8522;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field8523;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field8524;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field8525;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field8528;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field8529;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public static int field8530;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)V")
    public static final void method3402(int arg0, int arg1, int arg2) {
        boolean var3 = class199.field2605[0][arg1][arg2] != null && class199.field2605[0][arg1][arg2].field7893 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class199.field2605[var4][arg1][arg2] == null) {
                class563 var5 = class199.field2605[var4][arg1][arg2] = new class563(var4, arg1, arg2);
                if (var3) {
                    var5.field7886++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
    public final void method3403(byte arg0) {
        if (arg0 <= 5) {
            method3402(16, -13, -21);
        }
        field8522++;
        class58 var2 = this.field8531;
        synchronized (this.field8531) {
            this.field8531.method317((byte) 21);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZI)Lqe;")
    public final class606 method3404(boolean arg0, int arg1) {
        field8525++;
        class58 var3 = this.field8531;
        class606 var4;
        synchronized (this.field8531) {
            var4 = (class606) this.field8531.method323((long) arg1, -19814);
            if (arg0) {
                this.field8531 = null;
            }
        }
        if (var4 != null) {
            return var4;
        }
        class329 var5 = this.field8526;
        byte[] var6;
        synchronized (this.field8526) {
            var6 = this.field8526.method2054(true, 16, arg1);
        }
        class606 var7 = new class606();
        if (var6 != null) {
            var7.method3470(new class551(var6), (byte) 123);
        }
        class58 var8 = this.field8531;
        synchronized (this.field8531) {
            this.field8531.method316((long) arg1, (byte) -112, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V")
    public final void method3405(boolean arg0) {
        if (arg0) {
            this.field8527 = -11;
        }
        field8528++;
        class58 var2 = this.field8531;
        synchronized (this.field8531) {
            this.field8531.method315(1);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIB)V")
    public static final void method3406(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (class501.field6954.field7856 != 0 && arg0 != 0 && class369.field5138 < 50 && arg3 != -1) {
            class172.field2225[class369.field5138++] = new class201((byte) 1, arg3, arg0, arg2, arg1, 0);
        }
        if (arg4 < 41) {
            field8521 = -94;
        }
        field8530++;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)V")
    public final void method3407(int arg0, int arg1) {
        class58 var3 = this.field8531;
        synchronized (this.field8531) {
            this.field8531.method320(arg1, -306674912);
        }
        if (arg0 != 16) {
            field8520 = -27;
        }
        field8523++;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)V")
    public static final void method3408(int arg0, int arg1) {
        field8529++;
        int var2 = -41 % ((arg0 - 30) / 35);
        class632 var3 = class641.method3699(-117, 8, arg1);
        var3.method3655(0);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(CB)Z")
    public static final boolean method3409(char arg0, byte arg1) {
        field8524++;
        int var2 = -77 % ((arg1 - 28) / 60);
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            char[] var3 = class149.field1935;
            for (int var4 = 0; var4 < var3.length; var4++) {
                char var5 = var3[var4];
                if (arg0 == var5) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lg;ILkr;)V")
    public class590(class513 arg0, int arg1, class329 arg2) {
        this.field8526 = arg2;
        if (this.field8526 == null) {
            this.field8527 = 0;
        } else {
            this.field8527 = this.field8526.method2064(0, 16);
        }
    }
}
