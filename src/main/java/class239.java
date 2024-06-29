import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class class239 {

    @OriginalMember(owner = "client!rga", name = "j", descriptor = "Lof;")
    private class620 field2846 = new class620(64);

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "Loh;")
    private class404 field2838;

    @OriginalMember(owner = "client!rga", name = "e", descriptor = "Ldh;")
    public static class320 field2841 = new class320(93, -2);

    @OriginalMember(owner = "client!rga", name = "h", descriptor = "Lpia;")
    public static class94 field2844 = new class94(65, 7);

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!rga", name = "c", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!rga", name = "d", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!rga", name = "f", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!rga", name = "g", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!rga", name = "i", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!rga", name = "k", descriptor = "Lgh;")
    public static class546 field2847;

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(II)V")
    public final void method1406(int arg0, int arg1) {
        if (arg1 != 7) {
            return;
        }
        field2843++;
        class620 var3 = this.field2846;
        synchronized (this.field2846) {
            this.field2846.method3539((byte) 117, arg0);
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(I)V")
    public final void method1407(int arg0) {
        if (arg0 != -1) {
            field2844 = null;
        }
        field2840++;
        class620 var2 = this.field2846;
        synchronized (this.field2846) {
            this.field2846.method3541(-647);
        }
    }

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "(II)Lmu;")
    public final class300 method1408(int arg0, int arg1) {
        field2845++;
        class620 var3 = this.field2846;
        class300 var4;
        synchronized (this.field2846) {
            var4 = (class300) this.field2846.method3538((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class404 var5 = this.field2838;
        byte[] var6;
        synchronized (this.field2838) {
            var6 = this.field2838.method2481(class329.method1964(arg1, 31), class248.method1495(arg1, arg0 + 1016), (byte) 114);
        }
        class300 var7 = new class300();
        if (arg0 != 7) {
            field2844 = null;
        }
        if (var6 != null) {
            var7.method1772(new class244(var6), arg0 ^ 0x6C37);
        }
        class620 var8 = this.field2846;
        synchronized (this.field2846) {
            this.field2846.method3537(arg0 ^ 0x6A, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "(I)V")
    public final void method1409(int arg0) {
        int var2 = -52 / ((arg0 + 67) / 52);
        field2837++;
        class620 var3 = this.field2846;
        synchronized (this.field2846) {
            this.field2846.method3549(0);
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(BI)V")
    public final void method1410(byte arg0, int arg1) {
        field2839++;
        if (arg0 != 96) {
            this.field2846 = null;
        }
        class620 var3 = this.field2846;
        synchronized (this.field2846) {
            this.field2846.method3549(arg0 - 96);
            this.field2846 = new class620(arg1);
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;")
    public static final Class method1411(String arg0, boolean arg1) throws ClassNotFoundException {
        field2842++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else {
            if (!arg1) {
                method1412(32);
            }
            if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else if (arg0.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!rga", name = "c", descriptor = "(I)V")
    public static void method1412(int arg0) {
        field2844 = null;
        field2841 = null;
        if (arg0 != 64) {
            field2847 = null;
        }
        field2847 = null;
    }

    @OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(Lnb;ILoh;)V")
    public class239(class301 arg0, int arg1, class404 arg2) {
        this.field2838 = arg2;
        if (this.field2838 != null) {
            int var4 = this.field2838.method2478((byte) 54) - 1;
            this.field2838.method2482(0, var4);
        }
    }
}
