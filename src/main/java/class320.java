import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class320 {

    @OriginalMember(owner = "client!nw", name = "d", descriptor = "Z")
    public boolean field4760 = false;

    @OriginalMember(owner = "client!nw", name = "e", descriptor = "Lqc;")
    private class325 field4761 = new class325(64);

    @OriginalMember(owner = "client!nw", name = "p", descriptor = "Lqc;")
    public class325 field4772 = new class325(500);

    @OriginalMember(owner = "client!nw", name = "q", descriptor = "Lqc;")
    public class325 field4773 = new class325(30);

    @OriginalMember(owner = "client!nw", name = "r", descriptor = "Lqc;")
    public class325 field4774 = new class325(50);

    @OriginalMember(owner = "client!nw", name = "k", descriptor = "Ldda;")
    private class597 field4767;

    @OriginalMember(owner = "client!nw", name = "o", descriptor = "Z")
    public boolean field4771;

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "Ldda;")
    public class597 field4759;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!nw", name = "f", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!nw", name = "g", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!nw", name = "h", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!nw", name = "i", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!nw", name = "j", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!nw", name = "l", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!nw", name = "n", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!nw", name = "s", descriptor = "I")
    public int field4775;

    @OriginalMember(owner = "client!nw", name = "m", descriptor = "Ldda;")
    public static class597 field4769;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)V")
    public final void method2003(int arg0) {
        field4770++;
        class325 var2 = this.field4761;
        synchronized (this.field4761) {
            this.field4761.method2037(true);
        }
        class325 var3 = this.field4772;
        synchronized (this.field4772) {
            this.field4772.method2037(true);
            if (arg0 != 64) {
                this.field4761 = null;
            }
        }
        class325 var4 = this.field4773;
        synchronized (this.field4773) {
            this.field4773.method2037(true);
        }
        class325 var5 = this.field4774;
        synchronized (this.field4774) {
            this.field4774.method2037(true);
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZI)Lih;")
    public final class158 method2004(boolean arg0, int arg1) {
        field4762++;
        class325 var3 = this.field4761;
        class158 var4;
        synchronized (this.field4761) {
            var4 = (class158) this.field4761.method2025((long) arg1, 2);
        }
        if (var4 != null) {
            return var4;
        }
        class597 var5 = this.field4767;
        byte[] var6;
        synchronized (this.field4767) {
            var6 = this.field4767.method3486((byte) -67, class280.method1768(arg1, 94), class414.method2473(2127328360, arg1));
        }
        class158 var7 = new class158();
        var7.field2042 = this;
        var7.field2010 = arg1;
        if (var6 != null) {
            var7.method912(-13846, new class428(var6));
        }
        var7.method915(-18432);
        if (!this.field4771 && var7.field2054) {
            var7.field2104 = null;
            var7.field2100 = null;
        }
        if (var7.field2038) {
            var7.field2059 = 0;
            var7.field2067 = false;
        }
        class325 var8 = this.field4761;
        synchronized (this.field4761) {
            this.field4761.method2029(arg0, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(II)V")
    public final void method2005(int arg0, int arg1) {
        this.field4775 = arg1;
        field4768++;
        class325 var3 = this.field4772;
        synchronized (this.field4772) {
            this.field4772.method2037(true);
        }
        class325 var4 = this.field4773;
        synchronized (this.field4773) {
            this.field4773.method2037(true);
        }
        class325 var5 = this.field4774;
        synchronized (this.field4774) {
            this.field4774.method2037(true);
            if (arg0 != 0) {
                this.method2009(-28, false);
            }
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(B)V")
    public static void method2006(byte arg0) {
        field4769 = null;
        if (arg0 > -67) {
            method2006((byte) -46);
        }
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(ZI)V")
    public final void method2007(boolean arg0, int arg1) {
        if (arg1 != 31799) {
            this.field4759 = null;
        }
        field4766++;
        if (arg0 != this.field4760) {
            this.field4760 = arg0;
            this.method2003(64);
        }
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(B)V")
    public final void method2008(byte arg0) {
        class325 var2 = this.field4761;
        synchronized (this.field4761) {
            if (arg0 != -117) {
                method2006((byte) 122);
            }
            this.field4761.method2024((byte) -103);
        }
        field4763++;
        class325 var3 = this.field4772;
        synchronized (this.field4772) {
            this.field4772.method2024((byte) -124);
        }
        class325 var4 = this.field4773;
        synchronized (this.field4773) {
            this.field4773.method2024((byte) -93);
        }
        class325 var5 = this.field4774;
        synchronized (this.field4774) {
            this.field4774.method2024((byte) -107);
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IZ)V")
    public final void method2009(int arg0, boolean arg1) {
        field4764++;
        if (arg1 != this.field4771) {
            this.field4771 = arg1;
            if (arg0 < -38) {
                this.method2003(64);
            }
        }
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(IZ)V")
    public final void method2010(int arg0, boolean arg1) {
        if (arg1) {
            field4758++;
            this.field4761 = new class325(arg0);
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(BI)V")
    public final void method2011(byte arg0, int arg1) {
        class325 var3 = this.field4761;
        synchronized (this.field4761) {
            this.field4761.method2028(arg1, true);
        }
        field4757++;
        class325 var4 = this.field4772;
        synchronized (this.field4772) {
            this.field4772.method2028(arg1, true);
            if (arg0 >= -72) {
                this.method2008((byte) 112);
            }
        }
        class325 var5 = this.field4773;
        synchronized (this.field4773) {
            this.field4773.method2028(arg1, true);
        }
        class325 var6 = this.field4774;
        synchronized (this.field4774) {
            this.field4774.method2028(arg1, true);
        }
    }

    @OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Loda;IZLdda;Ldda;)V")
    public class320(class559 arg0, int arg1, boolean arg2, class597 arg3, class597 arg4) {
        this.field4767 = arg3;
        this.field4771 = arg2;
        this.field4759 = arg4;
        if (this.field4767 != null) {
            int var6 = this.field4767.method3477(false) - 1;
            this.field4767.method3462(var6, -123);
        }
    }
}
