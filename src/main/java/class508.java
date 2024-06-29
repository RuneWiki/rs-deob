import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class508 {

    @OriginalMember(owner = "client!od", name = "e", descriptor = "Ljt;")
    private class106 field7240 = new class106(64);

    @OriginalMember(owner = "client!od", name = "h", descriptor = "Lvd;")
    private class39 field7243;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Z")
    public static boolean field7237 = false;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field7236;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field7238;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field7239;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field7241;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field7242;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Lnaa;")
    public final class72 method3008(int arg0, int arg1) {
        field7236++;
        class106 var3 = this.field7240;
        class72 var4;
        synchronized (this.field7240) {
            if (arg0 <= 91) {
                this.field7243 = null;
            }
            var4 = (class72) this.field7240.method803(111, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class39 var5 = this.field7243;
        byte[] var6;
        synchronized (this.field7243) {
            var6 = this.field7243.method211(true, class499.method2969(true, arg1), class422.method2648(-21303, arg1));
        }
        class72 var7 = new class72();
        if (var6 != null) {
            var7.method619(new class645(var6), 6);
        }
        class106 var8 = this.field7240;
        synchronized (this.field7240) {
            this.field7240.method801(1, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
    public final void method3009(byte arg0) {
        field7242++;
        class106 var2 = this.field7240;
        synchronized (this.field7240) {
            this.field7240.method800(104);
        }
        if (arg0 >= -31) {
            this.method3009((byte) -10);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)V")
    public final void method3010(int arg0, byte arg1) {
        field7238++;
        if (arg1 < 87) {
            field7237 = true;
        }
        class106 var3 = this.field7240;
        synchronized (this.field7240) {
            this.field7240.method809(true);
            this.field7240 = new class106(arg0);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public final void method3011(int arg0) {
        if (arg0 != -1) {
            this.field7240 = null;
        }
        class106 var2 = this.field7240;
        synchronized (this.field7240) {
            this.field7240.method809(true);
        }
        field7239++;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(IB)V")
    public final void method3012(int arg0, byte arg1) {
        field7241++;
        class106 var3 = this.field7240;
        synchronized (this.field7240) {
            if (arg1 <= 9) {
                this.method3009((byte) -123);
            }
            this.field7240.method807(arg0, -1);
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lqg;ILvd;)V")
    public class508(class464 arg0, int arg1, class39 arg2) {
        this.field7243 = arg2;
        if (this.field7243 != null) {
            int var4 = this.field7243.method222((byte) 127) - 1;
            this.field7243.method229(var4, 0);
        }
    }
}
