import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class778 {

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "Ltq;")
    private class536 field10628 = new class536(64);

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "Ltq;")
    private class536 field10634 = new class536(100);

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "Lwm;")
    private class30 field10623;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public static int field10629 = 0;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "Z")
    public static boolean field10632 = false;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field10624;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field10625;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field10626;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field10627;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field10630;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public static int field10631;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "Lwm;")
    public static class30 field10633;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)Z", line = 5)
    public static final boolean method4262(int arg0, int arg1) {
        int var2 = -29 % ((42 - arg1) / 57);
        field10625++;
        return arg0 == 2 || arg0 == 3;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V", line = 16)
    public final void method4263(int arg0) {
        field10630++;
        if (arg0 != 2) {
            this.method4265(true, 62);
        }
        class536 var2 = this.field10628;
        synchronized (this.field10628) {
            this.field10628.method2932((byte) 80);
        }
        class536 var3 = this.field10634;
        synchronized (this.field10634) {
            this.field10634.method2932((byte) 80);
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(II)Lis;", line = 34)
    public final class350 method4264(int arg0, int arg1) {
        field10624++;
        class536 var3 = this.field10634;
        class350 var4;
        synchronized (this.field10634) {
            var4 = (class350) this.field10634.method2931((long) arg1, (byte) -113);
            if (var4 == null) {
                var4 = new class350(arg1);
                this.field10634.method2918((long) arg1, var4, arg0 - 26410);
            }
            if (!var4.method2024(arg0 ^ 0xFFFF9849)) {
                return null;
            }
        }
        if (arg0 != 26510) {
            this.method4264(-124, 69);
        }
        return var4;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZI)Ljba;", line = 63)
    public final class11 method4265(boolean arg0, int arg1) {
        field10631++;
        class536 var3 = this.field10628;
        class11 var4;
        synchronized (this.field10628) {
            var4 = (class11) this.field10628.method2931((long) arg1, (byte) -112);
        }
        if (var4 != null) {
            return var4;
        }
        class30 var5 = this.field10623;
        byte[] var6;
        synchronized (this.field10623) {
            var6 = this.field10623.method139(class468.method2650(-1540390873, arg1), (byte) -94, class217.method1430(arg1, arg0));
        }
        class11 var7 = new class11();
        var7.field91 = this;
        var7.field113 = arg1;
        if (var6 != null) {
            var7.method52(new class234(var6), -33);
        }
        if (!arg0) {
            this.method4268(0);
        }
        var7.method51(2);
        class536 var8 = this.field10628;
        synchronized (this.field10628) {
            this.field10628.method2918((long) arg1, var7, 111);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)V", line = 95)
    public final void method4266(byte arg0, int arg1) {
        class536 var3 = this.field10628;
        synchronized (this.field10628) {
            this.field10628.method2928(true, arg1);
        }
        int var4 = -82 / ((arg0 - 65) / 50);
        field10626++;
        class536 var5 = this.field10634;
        synchronized (this.field10634) {
            this.field10634.method2928(true, arg1);
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V", line = 111)
    public static void method4267(int arg0) {
        if (arg0 != 3350) {
            method4267(-55);
        }
        field10633 = null;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lega;ILwm;Lwm;Lwm;)V", line = 142)
    public class778(class473 arg0, int arg1, class30 arg2, class30 arg3, class30 arg4) {
        this.field10623 = arg2;
        if (this.field10623 != null) {
            int var6 = this.field10623.method143((byte) 106) - 1;
            this.field10623.method138(0, var6);
        }
        class774.method4225(0, arg3, 2, arg4);
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V", line = 167)
    public final void method4268(int arg0) {
        field10627++;
        class536 var2 = this.field10628;
        synchronized (this.field10628) {
            this.field10628.method2919(0);
        }
        class536 var3 = this.field10634;
        synchronized (this.field10634) {
            this.field10634.method2919(arg0 ^ arg0);
        }
    }
}
