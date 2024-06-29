import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class179 {

    @OriginalMember(owner = "client!su", name = "c", descriptor = "Lhp;")
    private class277 field2201 = new class277(16);

    @OriginalMember(owner = "client!su", name = "a", descriptor = "Lkea;")
    private class203 field2199;

    @OriginalMember(owner = "client!su", name = "b", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!su", name = "d", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!su", name = "e", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!su", name = "f", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!su", name = "g", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)V", line = 9)
    public final void method1021(int arg0) {
        class277 var2 = this.field2201;
        synchronized (this.field2201) {
            this.field2201.method1805(-89);
        }
        field2203++;
        int var3 = 39 / ((arg0 - 22) / 58);
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(II)V", line = 24)
    public final void method1022(int arg0, int arg1) {
        field2200++;
        class277 var3 = this.field2201;
        synchronized (this.field2201) {
            this.field2201.method1811((byte) 114, arg0);
        }
        if (arg1 != 30) {
            this.method1021(-92);
        }
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(II)Leq;", line = 38)
    public final class180 method1023(int arg0, int arg1) {
        field2205++;
        class277 var3 = this.field2201;
        class180 var4;
        synchronized (this.field2201) {
            var4 = (class180) this.field2201.method1801(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class203 var5 = this.field2199;
        byte[] var6;
        synchronized (this.field2199) {
            var6 = this.field2199.method1286(arg0, 30, (byte) -49);
        }
        class180 var7 = new class180();
        int var8 = 94 / ((-arg1 - 19) / 42);
        if (var6 != null) {
            var7.method1027(new class194(var6), -1);
        }
        class277 var9 = this.field2201;
        synchronized (this.field2201) {
            this.field2201.method1808((long) arg0, var7, (byte) -85);
            return var7;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V", line = 67)
    public final void method1024(byte arg0) {
        field2204++;
        class277 var2 = this.field2201;
        synchronized (this.field2201) {
            this.field2201.method1810(false);
            if (arg0 >= -43) {
                this.method1024((byte) -41);
            }
        }
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lcda;ILkea;)V", line = 85)
    public class179(class149 arg0, int arg1, class203 arg2) {
        this.field2199 = arg2;
        this.field2199.method1309(1675886592, 30);
    }
}
