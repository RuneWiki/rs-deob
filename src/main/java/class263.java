import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class263 {

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "Lmo;")
    private class336 field3793 = new class336(64);

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "Lnl;")
    private class435 field3782;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
    public static int field3789 = -1;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "[I")
    public static int[] field3783 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "[I")
    public static int[] field3784 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "[[Lae;")
    public static class172[][] field3787;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)Lie;", line = 4)
    public final class389 method1773(int arg0, int arg1) {
        field3792++;
        class336 var3 = this.field3793;
        class389 var4;
        synchronized (this.field3793) {
            var4 = (class389) this.field3793.method2113(0, (long) arg0);
            if (arg1 != -24562) {
                this.field3793 = null;
            }
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3782.method2633(32, arg0, arg1 + 24528);
        class389 var6 = new class389();
        if (var5 != null) {
            var6.method2362((byte) -23, new class161(var5));
        }
        class336 var7 = this.field3793;
        synchronized (this.field3793) {
            this.field3793.method2116((long) arg0, (byte) -34, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(II)V", line = 33)
    public final void method1774(int arg0, int arg1) {
        class336 var3 = this.field3793;
        synchronized (this.field3793) {
            this.field3793.method2120((byte) 58, arg1);
        }
        if (arg0 >= -75) {
            this.method1776(11);
        }
        field3791++;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II[Ljava/lang/String;I)Ljava/lang/String;", line = 49)
    public static final String method1775(int arg0, int arg1, String[] arg2, int arg3) {
        field3786++;
        if (~arg3 == arg1) {
            return "";
        } else if (arg3 == 1) {
            String var4 = arg2[arg0];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg3;
            int var6 = 0;
            for (int var7 = arg0; var7 < var5; var7++) {
                String var11 = arg2[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg0; var9 < var5; var9++) {
                String var10 = arg2[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V", line = 109)
    public final void method1776(int arg0) {
        field3785++;
        class336 var2 = this.field3793;
        synchronized (this.field3793) {
            this.field3793.method2119(arg0 ^ arg0);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(BJ)V", line = 120)
    public static final void method1777(byte arg0, long arg1) {
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        field3790++;
        if (arg0 != -26) {
            field3789 = 4;
        }
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)V", line = 142)
    public static void method1778(int arg0) {
        field3784 = null;
        if (arg0 != 99) {
            method1775(67, -60, (String[]) null, 91);
        }
        field3787 = null;
        field3783 = null;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Llo;ILnl;)V", line = 167)
    public class263(class280 arg0, int arg1, class435 arg2) {
        this.field3782 = arg2;
        this.field3782.method2638(1, 32);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V", line = 182)
    public final void method1779(byte arg0) {
        field3788++;
        class336 var2 = this.field3793;
        synchronized (this.field3793) {
            this.field3793.method2109(-1);
        }
        if (arg0 > -6) {
            method1777((byte) -17, 69L);
        }
    }
}
