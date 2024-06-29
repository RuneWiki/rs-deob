import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class401 {

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "Lme;")
    private class668 field5121 = new class668(128);

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "Lme;")
    public class668 field5125 = new class668(64);

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "Lpe;")
    public class615 field5112;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "Lpe;")
    private class615 field5115;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field5118 = 0;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "J")
    public static long field5122 = 0L;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "Lsga;")
    public static class547 field5111;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "[I")
    public static int[] field5117;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)Z")
    public static final boolean method2285(byte arg0, int arg1) {
        int var2 = -48 % ((arg0 + 34) / 44);
        field5120++;
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public static void method2286(int arg0) {
        field5111 = null;
        field5117 = null;
        if (arg0 != 22050) {
            field5118 = -36;
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
    public final void method2287(int arg0) {
        if (arg0 != 10618) {
            this.field5112 = null;
        }
        field5124++;
        class668 var2 = this.field5121;
        synchronized (this.field5121) {
            this.field5121.method3658(arg0 - 10618);
        }
        class668 var3 = this.field5125;
        synchronized (this.field5125) {
            this.field5125.method3658(0);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V")
    public static final void method2288(boolean arg0) {
        field5116++;
        class698.method3812(0);
        class452.method2552(class260.field3509.field1294, 22050, (byte) 117, 2);
        class266.field3566 = class553.method2966(class524.field6827, class688.field9413, 22050, 0, -21435);
        class266.field3566.method1783((byte) 6, class2.field13);
        if (!arg0) {
            class445.field5731 = class553.method2966(class524.field6827, class688.field9413, 2048, 1, -21435);
            class445.field5731.method1783((byte) 6, class690.field9426);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V")
    public final void method2289(int arg0, int arg1) {
        class668 var3 = this.field5121;
        synchronized (this.field5121) {
            this.field5121.method3659(-103, arg0);
        }
        field5123++;
        if (arg1 <= 89) {
            this.method2287(-39);
        }
        class668 var4 = this.field5125;
        synchronized (this.field5125) {
            this.field5125.method3659(-121, arg0);
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)V")
    public final void method2290(int arg0) {
        field5114++;
        class668 var2 = this.field5121;
        synchronized (this.field5121) {
            this.field5121.method3656((byte) 0);
        }
        class668 var3 = this.field5125;
        synchronized (this.field5125) {
            this.field5125.method3656((byte) 0);
            if (arg0 != 1) {
                this.field5125 = null;
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(BI)Ldt;")
    public final class576 method2291(byte arg0, int arg1) {
        field5113++;
        if (arg0 < 112) {
            this.method2291((byte) -15, 112);
        }
        class668 var3 = this.field5121;
        class576 var4;
        synchronized (this.field5121) {
            var4 = (class576) this.field5121.method3655(-126, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class615 var5 = this.field5115;
        byte[] var6;
        synchronized (this.field5115) {
            var6 = this.field5115.method3346(-1, 36, arg1);
        }
        class576 var7 = new class576();
        var7.field7825 = this;
        var7.field7810 = arg1;
        if (var6 != null) {
            var7.method3154(true, new class418(var6));
        }
        var7.method3150(-28790);
        class668 var8 = this.field5121;
        synchronized (this.field5121) {
            this.field5121.method3650((long) arg1, -125, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)V")
    public final void method2292(int arg0, int arg1, int arg2) {
        if (arg0 > -112) {
            field5118 = -112;
        }
        field5119++;
        this.field5121 = new class668(arg2);
        this.field5125 = new class668(arg1);
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lvd;ILpe;Lpe;)V")
    public class401(class635 arg0, int arg1, class615 arg2, class615 arg3) {
        this.field5112 = arg3;
        this.field5115 = arg2;
        this.field5115.method3341(36, -19046);
    }
}
