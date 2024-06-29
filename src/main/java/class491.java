import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class491 {

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "Lge;")
    private class511 field7072 = new class511(64);

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "Lge;")
    public class511 field7086 = new class511(64);

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "Lci;")
    private class320 field7079;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "Lci;")
    public class320 field7077;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field7073 = -1;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "Lqt;")
    public static class459 field7080 = new class459(29, -1);

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
    public static int field7085 = 0;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "F")
    public static float field7078;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field7074;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field7075;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field7076;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public static int field7081;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public static int field7082;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public static int field7083;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public static int field7084;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public final void method2875(int arg0) {
        field7081++;
        class511 var2 = this.field7072;
        synchronized (this.field7072) {
            this.field7072.method2980(-182819096);
        }
        class511 var3 = this.field7086;
        synchronized (this.field7086) {
            if (arg0 == -18659) {
                this.field7086.method2980(arg0 ^ 0xAE5D1F5);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIII)V")
    public static final void method2876(int arg0, int arg1, int arg2, int arg3) {
        int var4 = -108 / ((-arg0 - 63) / 37);
        int var5 = class220.field3371.field2569 * arg1 >> 8;
        field7075++;
        if (var5 != 0 && arg3 != -1) {
            class445.method2628(var5, arg3, false, class231.field3461, 10000, 0);
            class75.field1240 = true;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
    public final void method2877(int arg0) {
        field7083++;
        class511 var2 = this.field7072;
        synchronized (this.field7072) {
            this.field7072.method2990((byte) -67);
        }
        class511 var3 = this.field7086;
        synchronized (this.field7086) {
            this.field7086.method2990((byte) -127);
            if (arg0 > -24) {
                method2876(-78, -72, 20, 122);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V")
    public final void method2878(int arg0, int arg1, int arg2) {
        field7082++;
        if (arg0 != -1452084664) {
            this.method2881(-45, (byte) -30);
        }
        this.field7072 = new class511(arg2);
        this.field7086 = new class511(arg1);
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)V")
    public static void method2879(int arg0) {
        if (arg0 != 0) {
            method2876(31, -86, -69, -29);
        }
        field7080 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V")
    public final void method2880(int arg0, int arg1) {
        class511 var3 = this.field7072;
        synchronized (this.field7072) {
            this.field7072.method2989(false, arg1);
        }
        field7084++;
        if (arg0 != -1452084664) {
            method2879(31);
        }
        class511 var4 = this.field7086;
        synchronized (this.field7086) {
            this.field7086.method2989(false, arg1);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)Lcb;")
    public final class368 method2881(int arg0, byte arg1) {
        field7076++;
        class511 var3 = this.field7072;
        class368 var4;
        synchronized (this.field7072) {
            var4 = (class368) this.field7072.method2982(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class320 var5 = this.field7079;
        byte[] var6;
        synchronized (this.field7079) {
            if (arg1 != -52) {
                this.field7077 = null;
            }
            var6 = this.field7079.method2037(arg0, (byte) -124, 34);
        }
        class368 var7 = new class368();
        var7.field5313 = this;
        if (var6 != null) {
            var7.method2254(-79, new class519(var6));
        }
        class511 var8 = this.field7072;
        synchronized (this.field7072) {
            this.field7072.method2981(var7, 55, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lsn;ILci;Lci;)V")
    public class491(class453 arg0, int arg1, class320 arg2, class320 arg3) {
        this.field7079 = arg2;
        this.field7077 = arg3;
        this.field7079.method2030(-10914, 34);
    }
}
