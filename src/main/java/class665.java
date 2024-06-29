import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class665 {

    @OriginalMember(owner = "client!mga", name = "e", descriptor = "Lhm;")
    private class208 field9030 = new class208(64);

    @OriginalMember(owner = "client!mga", name = "j", descriptor = "I")
    public int field9035 = 0;

    @OriginalMember(owner = "client!mga", name = "f", descriptor = "Lpfa;")
    private class275 field9031;

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "I")
    public int field9028;

    @OriginalMember(owner = "client!mga", name = "h", descriptor = "[I")
    public static int[] field9033 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "[I")
    public static int[] field9026 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "I")
    public static int field9027 = 0;

    @OriginalMember(owner = "client!mga", name = "d", descriptor = "I")
    public static int field9029;

    @OriginalMember(owner = "client!mga", name = "g", descriptor = "I")
    public static int field9032;

    @OriginalMember(owner = "client!mga", name = "i", descriptor = "I")
    public static int field9034;

    @OriginalMember(owner = "client!mga", name = "k", descriptor = "I")
    public static int field9036;

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)V", line = 4)
    public static void method3698(int arg0) {
        field9033 = null;
        if (arg0 == -1) {
            field9026 = null;
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(B)V", line = 15)
    public final void method3699(byte arg0) {
        field9032++;
        class208 var2 = this.field9030;
        synchronized (this.field9030) {
            this.field9030.method1224(false);
            if (arg0 <= 40) {
                this.method3699((byte) 12);
            }
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(II)Lvi;", line = 32)
    public final class505 method3700(int arg0, int arg1) {
        field9029++;
        class208 var3 = this.field9030;
        class505 var4;
        synchronized (this.field9030) {
            var4 = (class505) this.field9030.method1221((long) arg1, true);
        }
        if (var4 != null) {
            return var4;
        }
        class275 var5 = this.field9031;
        byte[] var6;
        synchronized (this.field9031) {
            var6 = this.field9031.method1659(104, arg1, arg0);
        }
        class505 var7 = new class505();
        var7.field6312 = this;
        var7.field6296 = arg1;
        if (var6 != null) {
            var7.method2754((byte) 99, new class572(var6));
        }
        var7.method2758(965778184);
        class208 var8 = this.field9030;
        synchronized (this.field9030) {
            this.field9030.method1230((byte) 69, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(Lbs;ILpfa;)V", line = 110)
    public class665(class643 arg0, int arg1, class275 arg2) {
        this.field9031 = arg2;
        this.field9028 = this.field9031.method1655(4, (byte) -82);
    }

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "(I)V", line = 71)
    public final void method3701(int arg0) {
        int var2 = 103 % ((65 - arg0) / 35);
        class208 var3 = this.field9030;
        synchronized (this.field9030) {
            this.field9030.method1218(127);
        }
        field9036++;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(BI)V", line = 84)
    public final void method3702(byte arg0, int arg1) {
        class208 var3 = this.field9030;
        synchronized (this.field9030) {
            this.field9030.method1222(14564, arg1);
            if (arg0 != 24) {
                this.field9031 = null;
            }
        }
        field9034++;
    }
}
