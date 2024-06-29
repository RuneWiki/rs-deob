import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class356 {

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "Lh;")
    private class571 field4800 = new class571(128);

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "Lh;")
    public class571 field4811 = new class571(64);

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "Lan;")
    private class21 field4810;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "Lan;")
    public class21 field4802;

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "[I")
    public static int[] field4799;

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "[[[Lbo;")
    public static class622[][][] field4807;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(III)V")
    public final void method2132(int arg0, int arg1, int arg2) {
        field4804++;
        if (arg1 == -20773) {
            this.field4800 = new class571(arg0);
            this.field4811 = new class571(arg2);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V")
    public static void method2133(byte arg0) {
        int var1 = -53 / ((-arg0 - 32) / 35);
        field4807 = null;
        field4799 = null;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(B)V")
    public final void method2134(byte arg0) {
        class571 var2 = this.field4800;
        synchronized (this.field4800) {
            this.field4800.method3248(0);
        }
        field4806++;
        if (arg0 <= 67) {
            this.method2136(2, 21);
        }
        class571 var3 = this.field4811;
        synchronized (this.field4811) {
            this.field4811.method3248(0);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IB)V")
    public static final void method2135(int arg0, byte arg1) {
        if (arg1 < 122) {
            method2135(8, (byte) -112);
        }
        class571 var2 = class263.field3675;
        synchronized (class263.field3675) {
            class263.field3675.method3253(arg0, -128);
        }
        field4801++;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)Lj;")
    public final class463 method2136(int arg0, int arg1) {
        field4808++;
        class571 var3 = this.field4800;
        class463 var4;
        synchronized (this.field4800) {
            var4 = (class463) this.field4800.method3252((long) arg1, (byte) -105);
        }
        if (var4 != null) {
            return var4;
        }
        class21 var5 = this.field4810;
        byte[] var6;
        synchronized (this.field4810) {
            var6 = this.field4810.method240(36, arg1, (byte) -124);
        }
        if (arg0 >= -84) {
            this.method2137(-25);
        }
        class463 var7 = new class463();
        var7.field6535 = this;
        var7.field6533 = arg1;
        if (var6 != null) {
            var7.method2710(false, new class11(var6));
        }
        var7.method2707(-121);
        class571 var8 = this.field4800;
        synchronized (this.field4800) {
            this.field4800.method3243(var7, (long) arg1, -63);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
    public final void method2137(int arg0) {
        field4805++;
        class571 var2 = this.field4800;
        synchronized (this.field4800) {
            this.field4800.method3246(false);
        }
        int var3 = 125 % ((arg0 - 17) / 39);
        class571 var4 = this.field4811;
        synchronized (this.field4811) {
            this.field4811.method3246(false);
        }
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(II)V")
    public final void method2138(int arg0, int arg1) {
        field4803++;
        if (arg0 > -76) {
            this.field4802 = null;
        }
        class571 var3 = this.field4800;
        synchronized (this.field4800) {
            this.field4800.method3253(arg1, -123);
        }
        class571 var4 = this.field4811;
        synchronized (this.field4811) {
            this.field4811.method3253(arg1, -125);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2139(int arg0, int arg1, byte arg2) {
        field4809++;
        if (arg2 > -22) {
            method2135(37, (byte) 41);
        }
        return (arg0 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lhu;ILan;Lan;)V")
    public class356(class111 arg0, int arg1, class21 arg2, class21 arg3) {
        this.field4810 = arg2;
        this.field4802 = arg3;
        this.field4810.method231(36, -119);
    }
}
