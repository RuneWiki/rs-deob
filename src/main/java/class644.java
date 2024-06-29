import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class644 {

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "Lhp;")
    private class277 field9285 = new class277(64);

    @OriginalMember(owner = "client!pn", name = "o", descriptor = "Lhp;")
    public class277 field9288 = new class277(30);

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "Lkea;")
    private class203 field9281;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "Lkea;")
    public class203 field9279;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    public static int field9276 = -1;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
    public static int field9282 = 0;

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "Lea;")
    public static class474 field9280 = new class474(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "Lig;")
    public static class206 field9287 = new class206(97, 8);

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "F")
    public static float field9286;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
    public static int field9274;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    public static int field9275;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    public static int field9277;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
    public static int field9278;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
    public static int field9283;

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
    public static int field9284;

    @OriginalMember(owner = "client!pn", name = "p", descriptor = "I")
    public int field9289;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)V", line = 6)
    public final void method3661(boolean arg0) {
        class277 var2 = this.field9285;
        synchronized (this.field9285) {
            this.field9285.method1805(44);
        }
        field9275++;
        if (arg0) {
            class277 var3 = this.field9288;
            synchronized (this.field9288) {
                this.field9288.method1805(-105);
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)V", line = 23)
    public final void method3662(int arg0, int arg1) {
        class277 var3 = this.field9285;
        synchronized (this.field9285) {
            this.field9285.method1811((byte) 106, arg0);
        }
        if (arg1 != 64) {
            this.method3666((byte) -99);
        }
        field9274++;
        class277 var4 = this.field9288;
        synchronized (this.field9288) {
            this.field9288.method1811((byte) 109, arg0);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lkea;III)Lcq;", line = 44)
    public static final class402 method3663(class203 arg0, int arg1, int arg2, int arg3) {
        field9284++;
        if (arg1 < 33) {
            field9287 = null;
        }
        byte[] var4 = arg0.method1286(arg2, arg3, (byte) -49);
        return var4 == null ? null : new class402(var4);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BI)V", line = 65)
    public final void method3664(byte arg0, int arg1) {
        this.field9289 = arg1;
        field9277++;
        class277 var3 = this.field9288;
        synchronized (this.field9288) {
            this.field9288.method1810(false);
        }
        int var4 = -91 / ((arg0 - 79) / 32);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V", line = 78)
    public static void method3665(int arg0) {
        if (arg0 <= 37) {
            field9286 = -1.3783144F;
        }
        field9280 = null;
        field9287 = null;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V", line = 93)
    public final void method3666(byte arg0) {
        class277 var2 = this.field9285;
        synchronized (this.field9285) {
            this.field9285.method1810(false);
        }
        field9278++;
        class277 var3 = this.field9288;
        synchronized (this.field9288) {
            this.field9288.method1810(false);
            if (arg0 < 34) {
                method3663(null, -11, -1, 22);
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZI)Llw;", line = 110)
    public final class576 method3667(boolean arg0, int arg1) {
        field9283++;
        class277 var3 = this.field9285;
        class576 var4;
        synchronized (this.field9285) {
            var4 = (class576) this.field9285.method1801(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class203 var5 = this.field9281;
        byte[] var6;
        synchronized (this.field9281) {
            var6 = this.field9281.method1286(class606.method3529(arg1, (byte) 111), class114.method717((byte) 115, arg1), (byte) -49);
        }
        class576 var7 = new class576();
        var7.field8312 = arg1;
        var7.field8313 = this;
        if (arg0) {
            return null;
        }
        if (var6 != null) {
            var7.method3346(-1, new class194(var6));
        }
        class277 var8 = this.field9285;
        synchronized (this.field9285) {
            this.field9285.method1808((long) arg1, var7, (byte) -41);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lcda;ILkea;Lkea;)V", line = 161)
    public class644(class149 arg0, int arg1, class203 arg2, class203 arg3) {
        this.field9281 = arg2;
        this.field9279 = arg3;
        int var5 = this.field9281.method1282(-49) - 1;
        this.field9281.method1309(1675886592, var5);
    }
}
