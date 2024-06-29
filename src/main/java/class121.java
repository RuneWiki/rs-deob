import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class121 {

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "Lnga;")
    private class510 field1878 = new class510(64);

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "Leq;")
    private class209 field1876;

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "Lqaa;")
    public static class27 field1880 = new class27(55, 8);

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)V")
    public final void method963(byte arg0) {
        class510 var2 = this.field1878;
        synchronized (this.field1878) {
            this.field1878.method3050(false);
        }
        if (arg0 >= -83) {
            this.method965(-52, (byte) -76);
        }
        field1879++;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V")
    public final void method964(int arg0) {
        class510 var2 = this.field1878;
        synchronized (this.field1878) {
            this.field1878.method3048(false);
        }
        field1881++;
        if (arg0 != 35) {
            this.method965(86, (byte) -123);
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IB)V")
    public final void method965(int arg0, byte arg1) {
        field1877++;
        class510 var3 = this.field1878;
        synchronized (this.field1878) {
            this.field1878.method3049(arg0, (byte) 127);
        }
        int var4 = -30 % ((58 - arg1) / 56);
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)V")
    public static void method966(int arg0) {
        field1880 = null;
        if (arg0 != 1745) {
            method966(-126);
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)Lnb;")
    public final class301 method967(int arg0, int arg1) {
        field1875++;
        class510 var3 = this.field1878;
        class301 var4;
        synchronized (this.field1878) {
            var4 = (class301) this.field1878.method3054((byte) -124, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class209 var5 = this.field1876;
        byte[] var6;
        synchronized (this.field1876) {
            var6 = this.field1876.method1453(arg0, 38, 35);
        }
        class301 var7 = new class301();
        int var8 = 68 % ((37 - arg1) / 48);
        if (var6 != null) {
            var7.method1958(new class35(var6), (byte) 101);
        }
        var7.method1960(200);
        class510 var9 = this.field1878;
        synchronized (this.field1878) {
            this.field1878.method3047(false, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lcw;ILeq;)V")
    public class121(class179 arg0, int arg1, class209 arg2) {
        this.field1876 = arg2;
        if (this.field1876 != null) {
            this.field1876.method1477(0, 35);
        }
    }
}
