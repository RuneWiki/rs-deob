import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class613 {

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "Lhp;")
    private class277 field8921 = new class277(64);

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "Lkea;")
    public class203 field8918;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Lkea;")
    private class203 field8908;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Lhp;")
    public static class277 field8910 = new class277(4);

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "Lig;")
    public static class206 field8919 = new class206(30, 3);

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public static int field8923 = 0;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field8909;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field8911;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field8912;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field8913;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field8914;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field8915;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field8916;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field8917;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field8920;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public static int field8922;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)V", line = 10)
    public final void method3541(byte arg0, int arg1) {
        if (arg0 > -85) {
            field8910 = null;
        }
        class277 var3 = this.field8921;
        synchronized (this.field8921) {
            this.field8921.method1811((byte) 111, arg1);
        }
        field8909++;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBI)Z", line = 23)
    public static final boolean method3542(int arg0, byte arg1, int arg2) {
        int var3 = -8 / ((arg1 + 89) / 34);
        field8912++;
        return class504.method3003((byte) -110, arg2, arg0) & class445.method2776(arg2, (byte) -112, arg0);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V", line = 33)
    public static final void method3543(byte arg0) {
        field8916++;
        class297.field4403 = new class593[class515.field7512.method1282(-69)][];
        class114.field1431 = new class593[class515.field7512.method1282(-104)][];
        if (arg0 != -23) {
            method3542(6, (byte) -24, 97);
        }
        class119.field1484 = new boolean[class515.field7512.method1282(-87)];
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V", line = 50)
    public final void method3544(byte arg0) {
        class277 var2 = this.field8921;
        synchronized (this.field8921) {
            this.field8921.method1805(-13);
        }
        if (arg0 > 24) {
            field8911++;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V", line = 63)
    public final void method3545(int arg0) {
        field8917++;
        class277 var2 = this.field8921;
        synchronized (this.field8921) {
            if (arg0 != 3) {
                this.field8921 = null;
            }
            this.field8921.method1810(false);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IB)Ljg;", line = 84)
    public final class287 method3546(int arg0, byte arg1) {
        field8913++;
        if (arg1 >= -34) {
            return null;
        }
        class277 var3 = this.field8921;
        class287 var4;
        synchronized (this.field8921) {
            var4 = (class287) this.field8921.method1801(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class203 var5 = this.field8908;
        byte[] var6;
        synchronized (this.field8908) {
            var6 = this.field8908.method1286(arg0, 3, (byte) -49);
        }
        class287 var7 = new class287();
        var7.field3971 = this;
        if (var6 != null) {
            var7.method1862((byte) -58, new class194(var6));
        }
        class277 var8 = this.field8921;
        synchronized (this.field8921) {
            this.field8921.method1808((long) arg0, var7, (byte) -46);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lcda;ILkea;Lkea;)V", line = 118)
    public class613(class149 arg0, int arg1, class203 arg2, class203 arg3) {
        this.field8918 = arg3;
        this.field8908 = arg2;
        this.field8908.method1309(1675886592, 3);
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V", line = 134)
    public static void method3547(int arg0) {
        field8910 = null;
        if (arg0 != 64) {
            field8919 = null;
        }
        field8919 = null;
    }
}
