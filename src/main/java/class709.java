import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class709 {

    @OriginalMember(owner = "client!nfa", name = "m", descriptor = "Ljda;")
    private class239 field9942 = new class239(64);

    @OriginalMember(owner = "client!nfa", name = "n", descriptor = "Ljda;")
    public class239 field9943 = new class239(60);

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "Laj;")
    public class333 field9931;

    @OriginalMember(owner = "client!nfa", name = "f", descriptor = "Laj;")
    private class333 field9935;

    @OriginalMember(owner = "client!nfa", name = "l", descriptor = "I")
    public static int field9941 = -1;

    @OriginalMember(owner = "client!nfa", name = "g", descriptor = "F")
    public static float field9936;

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "I")
    public static int field9930;

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "I")
    public static int field9932;

    @OriginalMember(owner = "client!nfa", name = "d", descriptor = "I")
    public static int field9933;

    @OriginalMember(owner = "client!nfa", name = "e", descriptor = "I")
    public static int field9934;

    @OriginalMember(owner = "client!nfa", name = "h", descriptor = "I")
    public static int field9937;

    @OriginalMember(owner = "client!nfa", name = "i", descriptor = "I")
    public static int field9938;

    @OriginalMember(owner = "client!nfa", name = "j", descriptor = "I")
    public static int field9939;

    @OriginalMember(owner = "client!nfa", name = "k", descriptor = "I")
    public static int field9940;

    @OriginalMember(owner = "client!nfa", name = "o", descriptor = "I")
    public int field9944;

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(B)V")
    public final void method3967(byte arg0) {
        if (arg0 != 100) {
            return;
        }
        class239 var2 = this.field9942;
        synchronized (this.field9942) {
            this.field9942.method1552(115);
        }
        field9940++;
        class239 var3 = this.field9943;
        synchronized (this.field9943) {
            this.field9943.method1552(arg0 ^ 0x38);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IB)V")
    public final void method3968(int arg0, byte arg1) {
        field9934++;
        this.field9944 = arg0;
        class239 var3 = this.field9943;
        synchronized (this.field9943) {
            if (arg1 >= -26) {
                field9936 = -1.262201F;
            }
            this.field9943.method1555((byte) -3);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Z)V")
    public final void method3969(boolean arg0) {
        if (arg0) {
            return;
        }
        field9932++;
        class239 var2 = this.field9942;
        synchronized (this.field9942) {
            this.field9942.method1555((byte) -3);
        }
        class239 var3 = this.field9943;
        synchronized (this.field9943) {
            this.field9943.method1555((byte) -3);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I)[Lcf;")
    public static final class631[] method3970(int arg0) {
        if (arg0 != -1) {
            method3970(32);
        }
        field9933++;
        return new class631[] { class62.field890, class572.field7685, class180.field2395 };
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIIB)Z")
    public static final boolean method3971(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field9930++;
        if (!class522.field7164 || !class791.field10882) {
            return false;
        } else if (class592.field7964 < 100) {
            return false;
        } else if (class267.method1744(arg2, arg1, arg3, 19322)) {
            int var5 = arg2 << class26.field388;
            int var6 = arg1 << class26.field388;
            if (class600.method3337(class528.field7227[arg3].method1880(arg2, false, arg1), arg0, class48.field722, class48.field722, -7515, var6, var5)) {
                class337.field4880++;
                return true;
            } else {
                int var7 = -14 % ((7 - arg4) / 37);
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(BI)V")
    public final void method3972(byte arg0, int arg1) {
        class239 var3 = this.field9942;
        synchronized (this.field9942) {
            this.field9942.method1546(arg1, (byte) -8);
            if (arg0 != -25) {
                field9941 = 47;
            }
        }
        field9938++;
        class239 var4 = this.field9943;
        synchronized (this.field9943) {
            this.field9943.method1546(arg1, (byte) -8);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "(BI)Lht;")
    public final class608 method3973(byte arg0, int arg1) {
        field9939++;
        class239 var3 = this.field9942;
        class608 var4;
        synchronized (this.field9942) {
            var4 = (class608) this.field9942.method1541(-10, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class333 var5 = this.field9935;
        byte[] var6;
        synchronized (this.field9935) {
            var6 = this.field9935.method2095(class307.method1943(arg1, (byte) 107), class488.method2833(arg1, 115), 1);
        }
        class608 var7 = new class608();
        var7.field8275 = this;
        if (arg0 <= 77) {
            field9941 = -39;
        }
        var7.field8270 = arg1;
        if (var6 != null) {
            var7.method3366(new class376(var6), true);
        }
        class239 var8 = this.field9942;
        synchronized (this.field9942) {
            this.field9942.method1544(true, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(Lgia;ILaj;Laj;)V")
    public class709(class285 arg0, int arg1, class333 arg2, class333 arg3) {
        this.field9931 = arg3;
        this.field9935 = arg2;
        int var5 = this.field9935.method2094((byte) -115) - 1;
        this.field9935.method2090(var5, false);
    }
}
