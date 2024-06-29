import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class287 {

    @OriginalMember(owner = "client!rv", name = "n", descriptor = "Lqc;")
    private class325 field4227 = new class325(64);

    @OriginalMember(owner = "client!rv", name = "q", descriptor = "Lqc;")
    public class325 field4230 = new class325(50);

    @OriginalMember(owner = "client!rv", name = "t", descriptor = "Lqc;")
    public class325 field4233 = new class325(5);

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "Loda;")
    public class559 field4216;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "Ldda;")
    public class597 field4214;

    @OriginalMember(owner = "client!rv", name = "l", descriptor = "Ldda;")
    private class597 field4225;

    @OriginalMember(owner = "client!rv", name = "k", descriptor = "Z")
    public boolean field4224;

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "Z")
    public static boolean field4218 = false;

    @OriginalMember(owner = "client!rv", name = "p", descriptor = "I")
    public static int field4229 = 0;

    @OriginalMember(owner = "client!rv", name = "o", descriptor = "Lfo;")
    public static class22 field4228 = new class22(7, 2);

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!rv", name = "j", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!rv", name = "m", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!rv", name = "r", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!rv", name = "s", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!rv", name = "u", descriptor = "I")
    public int field4234;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "[I")
    public static int[] field4215;

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "[Lsa;")
    public static class543[] field4219;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V")
    public static void method1780(int arg0) {
        if (arg0 <= 49) {
            field4229 = 87;
        }
        field4215 = null;
        field4228 = null;
        field4219 = null;
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)V")
    public final void method1781(int arg0) {
        class325 var2 = this.field4227;
        synchronized (this.field4227) {
            this.field4227.method2037(true);
        }
        field4221++;
        class325 var3 = this.field4230;
        synchronized (this.field4230) {
            this.field4230.method2037(true);
            if (arg0 != 7) {
                this.field4233 = null;
            }
        }
        class325 var4 = this.field4233;
        synchronized (this.field4233) {
            this.field4233.method2037(true);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BI)V")
    public final void method1782(byte arg0, int arg1) {
        class325 var3 = this.field4227;
        synchronized (this.field4227) {
            this.field4227.method2028(arg1, true);
        }
        field4226++;
        class325 var4 = this.field4230;
        synchronized (this.field4230) {
            this.field4230.method2028(arg1, true);
        }
        class325 var5 = this.field4233;
        synchronized (this.field4233) {
            this.field4233.method2028(arg1, true);
        }
        if (arg0 != 109) {
            this.method1787(33);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(II)Lai;")
    public final class429 method1783(int arg0, int arg1) {
        field4223++;
        class325 var3 = this.field4227;
        class429 var4;
        synchronized (this.field4227) {
            var4 = (class429) this.field4227.method2025((long) arg1, 2);
        }
        if (var4 != null) {
            return var4;
        }
        class597 var5 = this.field4225;
        byte[] var6;
        synchronized (this.field4225) {
            var6 = this.field4225.method3486((byte) -55, class106.method624(arg0 - 29286, arg1), class476.method2892(arg1, 27515));
        }
        class429 var7 = new class429();
        var7.field6237 = arg1;
        var7.field6293 = this;
        if (var6 != null) {
            var7.method2637(new class428(var6), -5128);
        }
        var7.method2636((byte) -50);
        class325 var8 = this.field4227;
        synchronized (this.field4227) {
            this.field4227.method2029(false, var7, (long) arg1);
            if (arg0 != -1) {
                this.method1787(4);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(III)Lwaa;")
    public static final class33 method1784(int arg0, int arg1, int arg2) {
        class415 var3 = class526.field7777[arg0][arg1][arg2];
        return var3 == null || var3.field5976 == null ? null : var3.field5976;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IZ)V")
    public final void method1785(int arg0, boolean arg1) {
        this.field4234 = arg0;
        if (arg1) {
            this.method1783(-28, 60);
        }
        field4217++;
        class325 var3 = this.field4230;
        synchronized (this.field4230) {
            this.field4230.method2037(true);
        }
        class325 var4 = this.field4233;
        synchronized (this.field4233) {
            this.field4233.method2037(true);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZI)V")
    public final void method1786(boolean arg0, int arg1) {
        if (arg1 != -18098) {
            this.field4227 = null;
        }
        field4220++;
        if (arg0 != this.field4224) {
            this.field4224 = arg0;
            this.method1781(arg1 ^ 0xFFFFB949);
        }
    }

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "(I)V")
    public final void method1787(int arg0) {
        class325 var2 = this.field4230;
        synchronized (this.field4230) {
            if (arg0 != -1) {
                return;
            }
            this.field4230.method2037(true);
        }
        field4222++;
        class325 var3 = this.field4233;
        synchronized (this.field4233) {
            this.field4233.method2037(true);
        }
    }

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "(I)V")
    public final void method1788(int arg0) {
        class325 var2 = this.field4227;
        synchronized (this.field4227) {
            this.field4227.method2024((byte) -89);
        }
        field4231++;
        class325 var3 = this.field4230;
        synchronized (this.field4230) {
            this.field4230.method2024((byte) -109);
        }
        class325 var4 = this.field4233;
        synchronized (this.field4233) {
            this.field4233.method2024((byte) -115);
            if (arg0 != 50) {
                this.method1782((byte) -119, -32);
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Loda;IZLdda;Ldda;)V")
    public class287(class559 arg0, int arg1, boolean arg2, class597 arg3, class597 arg4) {
        this.field4216 = arg0;
        this.field4214 = arg4;
        this.field4225 = arg3;
        this.field4224 = arg2;
        if (this.field4225 != null) {
            int var6 = this.field4225.method3477(false) - 1;
            this.field4225.method3462(var6, 109);
        }
    }
}
