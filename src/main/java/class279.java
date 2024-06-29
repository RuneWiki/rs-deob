import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class279 {

    @OriginalMember(owner = "client!js", name = "c", descriptor = "Lhp;")
    private class277 field3888 = new class277(64);

    @OriginalMember(owner = "client!js", name = "n", descriptor = "Lhp;")
    public class277 field3899 = new class277(50);

    @OriginalMember(owner = "client!js", name = "o", descriptor = "Lhp;")
    public class277 field3900 = new class277(5);

    @OriginalMember(owner = "client!js", name = "f", descriptor = "Lkea;")
    public class203 field3891;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "Z")
    public boolean field3886;

    @OriginalMember(owner = "client!js", name = "e", descriptor = "Lcda;")
    public class149 field3890;

    @OriginalMember(owner = "client!js", name = "m", descriptor = "Lkea;")
    private class203 field3898;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!js", name = "d", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!js", name = "g", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!js", name = "h", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!js", name = "i", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!js", name = "j", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!js", name = "k", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!js", name = "l", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!js", name = "p", descriptor = "I")
    public int field3901;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)V", line = 4)
    public final void method1816(boolean arg0) {
        class277 var2 = this.field3888;
        synchronized (this.field3888) {
            this.field3888.method1805(87);
        }
        field3897++;
        class277 var3 = this.field3899;
        synchronized (this.field3899) {
            this.field3899.method1805(-103);
        }
        class277 var4 = this.field3900;
        synchronized (this.field3900) {
            this.field3900.method1805(-105);
            if (!arg0) {
                this.field3898 = null;
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(II)Lpl;", line = 23)
    public final class566 method1817(int arg0, int arg1) {
        field3895++;
        class277 var3 = this.field3888;
        class566 var4;
        synchronized (this.field3888) {
            var4 = (class566) this.field3888.method1801(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class203 var5 = this.field3898;
        byte[] var7;
        synchronized (this.field3898) {
            int var6 = 6 / ((arg0 - 38) / 56);
            var7 = this.field3898.method1286(class322.method2102(arg1, 127), class82.method539(arg1, (byte) 127), (byte) -49);
        }
        class566 var8 = new class566();
        var8.field8061 = this;
        var8.field8085 = arg1;
        if (var7 != null) {
            var8.method3285(new class194(var7), 38);
        }
        var8.method3282(-1);
        class277 var9 = this.field3888;
        synchronized (this.field3888) {
            this.field3888.method1808((long) arg1, var8, (byte) -68);
            return var8;
        }
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(II)V", line = 55)
    public final void method1818(int arg0, int arg1) {
        field3896++;
        this.field3901 = arg1;
        class277 var3 = this.field3899;
        synchronized (this.field3899) {
            this.field3899.method1810(false);
        }
        class277 var4 = this.field3900;
        synchronized (this.field3900) {
            this.field3900.method1810(false);
        }
        if (arg0 != 29348) {
            this.field3886 = false;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V", line = 78)
    public final void method1819(int arg0) {
        class277 var2 = this.field3888;
        synchronized (this.field3888) {
            this.field3888.method1810(false);
        }
        field3892++;
        class277 var3 = this.field3899;
        synchronized (this.field3899) {
            this.field3899.method1810(false);
            int var4 = -108 / ((35 - arg0) / 35);
        }
        class277 var5 = this.field3900;
        synchronized (this.field3900) {
            this.field3900.method1810(false);
        }
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V", line = 101)
    public final void method1820(int arg0) {
        class277 var2 = this.field3899;
        synchronized (this.field3899) {
            this.field3899.method1810(false);
        }
        field3889++;
        class277 var3 = this.field3900;
        synchronized (this.field3900) {
            this.field3900.method1810(false);
        }
        if (arg0 != -15773) {
            this.method1817(80, -30);
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ZI)V", line = 120)
    public final void method1821(boolean arg0, int arg1) {
        field3894++;
        if (this.field3886 == arg0) {
            return;
        }
        this.field3886 = arg0;
        this.method1819(122);
        if (arg1 != -1) {
            this.field3899 = null;
        }
    }

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(II)V", line = 137)
    public static final void method1822(int arg0, int arg1) {
        field3893++;
        if (!class595.field8694.field6522) {
            arg0 = -1;
        }
        if (class176.field2148 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class589 var2 = class281.field3925.method49(arg0, 33);
            class372 var3 = var2.method3441(true);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class20.field197.method3163(var3.method2406(), new Point(var2.field8466, var2.field8469), var3.method2401(), class30.field348, (byte) -127, var3.method2394());
                class176.field2148 = arg0;
            }
        }
        if (arg0 == arg1 && class176.field2148 != -1) {
            class20.field197.method3163(null, new Point(), -1, class30.field348, (byte) -113, -1);
            class176.field2148 = -1;
        }
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lcda;IZLkea;Lkea;)V", line = 206)
    public class279(class149 arg0, int arg1, boolean arg2, class203 arg3, class203 arg4) {
        this.field3891 = arg4;
        this.field3886 = arg2;
        this.field3890 = arg0;
        this.field3898 = arg3;
        if (this.field3898 != null) {
            int var6 = this.field3898.method1282(-50) - 1;
            this.field3898.method1309(1675886592, var6);
        }
    }

    @OriginalMember(owner = "client!js", name = "d", descriptor = "(II)V", line = 183)
    public final void method1823(int arg0, int arg1) {
        class277 var3 = this.field3888;
        synchronized (this.field3888) {
            this.field3888.method1811((byte) 116, arg0);
        }
        field3887++;
        class277 var4 = this.field3899;
        synchronized (this.field3899) {
            this.field3899.method1811((byte) 119, arg0);
            if (arg1 >= -96) {
                this.method1821(false, -112);
            }
        }
        class277 var5 = this.field3900;
        synchronized (this.field3900) {
            this.field3900.method1811((byte) 126, arg0);
        }
    }
}
