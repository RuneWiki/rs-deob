import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class484 {

    @OriginalMember(owner = "client!vfa", name = "e", descriptor = "Laf;")
    private class39 field6697 = new class39(64);

    @OriginalMember(owner = "client!vfa", name = "i", descriptor = "Lae;")
    private class283 field6701;

    @OriginalMember(owner = "client!vfa", name = "k", descriptor = "Llo;")
    public class450 field6703;

    @OriginalMember(owner = "client!vfa", name = "d", descriptor = "[I")
    public static int[] field6696 = new int[3];

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "Ljn;")
    public static class134 field6694 = new class134(124, 10);

    @OriginalMember(owner = "client!vfa", name = "j", descriptor = "[I")
    public static int[] field6702 = new int[3];

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "I")
    public static int field6695;

    @OriginalMember(owner = "client!vfa", name = "f", descriptor = "I")
    public static int field6698;

    @OriginalMember(owner = "client!vfa", name = "g", descriptor = "I")
    public static int field6699;

    @OriginalMember(owner = "client!vfa", name = "h", descriptor = "I")
    public static int field6700;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Loq;ZZ)V", line = 3)
    public static final void method2874(class230 arg0, boolean arg1, boolean arg2) {
        arg0.field3468 = arg2;
        if (!class753.field10384) {
            class695.method3930(arg0, class565.field7981);
        } else if (arg1) {
            class393.field5594[class393.field5594.length - 1].method3302(29319, arg0);
        } else {
            int var3 = class546.method3230(arg0.field3465);
            int var4 = class555.field7697[2] * arg0.method89(-32) / arg0.field3471;
            int var5 = class546.method3230(arg0.field3465 - var4);
            int var6 = class546.method3230(arg0.field3465 + var4);
            if (var5 == var6) {
                class393.field5594[var3].method3302(29319, arg0);
            } else if (var6 - var5 == 1) {
                class393.field5594[class791.field10844 + var5].method3302(29319, arg0);
            } else {
                class393.field5594[class393.field5594.length - 1].method3302(29319, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(BI)V", line = 38)
    public final void method2875(byte arg0, int arg1) {
        class39 var3 = this.field6697;
        synchronized (this.field6697) {
            this.field6697.method308(-1, arg1);
        }
        field6698++;
        if (arg0 != -42) {
            field6694 = null;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(B)V", line = 52)
    public final void method2876(byte arg0) {
        if (arg0 != 43) {
            return;
        }
        field6699++;
        class39 var2 = this.field6697;
        synchronized (this.field6697) {
            this.field6697.method314(-2);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)V", line = 67)
    public static void method2877(int arg0) {
        field6694 = null;
        if (arg0 == 3471) {
            field6702 = null;
            field6696 = null;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "(I)V", line = 86)
    public final void method2878(int arg0) {
        field6700++;
        class39 var2 = this.field6697;
        synchronized (this.field6697) {
            this.field6697.method319(-31);
        }
        if (arg0 > -18) {
            method2877(72);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "(BI)Lwl;", line = 101)
    public final class148 method2879(byte arg0, int arg1) {
        field6693++;
        class39 var3 = this.field6697;
        class148 var4;
        synchronized (this.field6697) {
            var4 = (class148) this.field6697.method312(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class283 var5 = this.field6701;
        byte[] var6;
        synchronized (this.field6701) {
            var6 = this.field6701.method1849(arg1, (byte) 60, 32);
        }
        int var7 = 117 % ((4 - arg0) / 61);
        class148 var8 = new class148();
        var8.field1907 = this;
        if (var6 != null) {
            var8.method983(new class511(var6), 2048);
        }
        class39 var9 = this.field6697;
        synchronized (this.field6697) {
            this.field6697.method305(var8, (long) arg1, 18320);
            return var8;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(Ljk;ILae;Llo;)V", line = 143)
    public class484(class788 arg0, int arg1, class283 arg2, class450 arg3) {
        this.field6701 = arg2;
        this.field6701.method1867(32, (byte) 49);
        this.field6703 = arg3;
    }
}
