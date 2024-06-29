import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class240 extends class316 implements class601 {

    @OriginalMember(owner = "client!oba", name = "H", descriptor = "I")
    public static int field3802 = 0;

    @OriginalMember(owner = "client!oba", name = "M", descriptor = "I")
    public static int field3807 = 0;

    @OriginalMember(owner = "client!oba", name = "w", descriptor = "B")
    private byte field3791;

    @OriginalMember(owner = "client!oba", name = "y", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!oba", name = "z", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!oba", name = "A", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!oba", name = "B", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!oba", name = "C", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!oba", name = "D", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!oba", name = "E", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!oba", name = "F", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!oba", name = "G", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!oba", name = "I", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!oba", name = "J", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!oba", name = "L", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!oba", name = "N", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!oba", name = "K", descriptor = "Lq;")
    public static class393 field3805;

    @OriginalMember(owner = "client!oba", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field3792;

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "(I)Z", line = 7)
    public final boolean method1722(int arg0) {
        if (arg0 != -23181) {
            return true;
        } else {
            ++field3798;
            return super.method2156((byte) 43, super.field4976.field3434);
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(Ljaclib/memory/Source;III)Z", line = 21)
    public final boolean method1723(Source arg0, int arg1, int arg2, int arg3) {
        ++field3796;
        this.field3791 = (byte) arg2;
        if (arg1 != 18869) {
            field3792 = null;
        }
        super.method2160((byte) -31, arg0, arg3);
        return true;
    }

    @OriginalMember(owner = "client!oba", name = "d", descriptor = "(I)I", line = 38)
    public final int method429(int arg0) {
        ++field3801;
        if (arg0 != 34962) {
            this.method1727(-1);
        }
        return super.method429(34962);
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IB)V", line = 50)
    public static final void method1724(int arg0, byte arg1) {
        class665.field9421 = 2;
        if (arg1 == 79) {
            ++field3804;
            class700.field9878 = arg0;
            long var2 = 0L;
            if (class234.field3704 == null) {
                class235.method1702(35, (byte) 112);
            } else {
                class6 var4 = new class6(class496.method3018(class339.method2322(class234.field3704, (byte) 63), (byte) -63));
                long var5 = var4.method69(1282265952);
                class658.field9172 = var4.method69(arg1 ^ 1282265903);
                class136.method1182("", (byte) -125, true, class357.method2398(var5, -15775));
            }
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)V", line = 79)
    public final void method431(int arg0) {
        ++field3795;
        super.method431(arg0);
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(Lbea;Z)V", line = 90)
    public class240(class205 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(BII)Z", line = 93)
    public final boolean method1725(byte arg0, int arg1, int arg2) {
        int var4 = 103 / ((arg0 - -23) / 62);
        ++field3799;
        this.field3791 = (byte) arg2;
        super.method424((byte) -96, arg1);
        return true;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;", line = 109)
    public final Buffer method1726(boolean arg0, boolean arg1) {
        if (!arg1) {
            field3802 = 93;
        }
        ++field3806;
        return super.method2157(super.field4976.field3434, arg0, (byte) -121);
    }

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "(I)I", line = 126)
    public final int method1727(int arg0) {
        if (arg0 != -29095) {
            method1724(-94, (byte) -3);
        }
        ++field3797;
        return this.field3791;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(ZB)V", line = 139)
    public static final void method1728(boolean arg0, byte arg1) {
        if (class428.field6538 == null) {
            class428.field6538 = new byte[4][class275.field4426][class417.field6374];
        }
        ++field3793;
        if (!arg0) {
            method1728(false, (byte) -106);
        }
        for (int var2 = 0; ~var2 > -5; ++var2) {
            for (int var3 = 0; var3 < class275.field4426; ++var3) {
                for (int var4 = 0; class417.field6374 > var4; ++var4) {
                    class428.field6538[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "(B)J", line = 175)
    public static final long method1729(byte arg0) {
        ++field3803;
        if (arg0 != -46) {
            field3808 = -80;
        }
        return class11.field183.method445(121);
    }

    @OriginalMember(owner = "client!oba", name = "g", descriptor = "(I)V", line = 188)
    public static void method1730(int arg0) {
        if (arg0 == -9870) {
            field3805 = null;
            field3792 = null;
        }
    }
}
