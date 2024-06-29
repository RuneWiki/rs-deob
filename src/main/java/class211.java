import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class211 {

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "Leda;")
    private class14 field3514 = new class14(64);

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "Leda;")
    public class14 field3516 = new class14(60);

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "Lla;")
    private class422 field3515;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "Lla;")
    public class422 field3506;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "Z")
    public static boolean field3507 = false;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "Lcb;")
    public static class631 field3502 = new class631(70, -1);

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    public int field3517;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "[Ls;")
    public static class339[] field3511;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static void method1526(int arg0) {
        field3511 = null;
        if (arg0 == 70) {
            field3502 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)Lnaa;")
    public static final class630 method1527(byte arg0) {
        field3513++;
        if (arg0 != 18) {
            method1534(68, -86);
        }
        return method1534(1, 60);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V")
    public final void method1528(boolean arg0) {
        class14 var2 = this.field3514;
        synchronized (this.field3514) {
            this.field3514.method76(66);
        }
        field3510++;
        class14 var3 = this.field3516;
        synchronized (this.field3516) {
            if (arg0) {
                field3502 = null;
            }
            this.field3516.method76(51);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BI)Ldu;")
    public final class417 method1529(byte arg0, int arg1) {
        field3512++;
        if (arg0 < 1) {
            return null;
        }
        class14 var3 = this.field3514;
        class417 var4;
        synchronized (this.field3514) {
            var4 = (class417) this.field3514.method80((byte) -128, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class422 var5 = this.field3515;
        byte[] var6;
        synchronized (this.field3515) {
            var6 = this.field3515.method2624(0, class685.method3820(arg1, 67), class487.method2959(81, arg1));
        }
        class417 var7 = new class417();
        var7.field6133 = this;
        var7.field6128 = arg1;
        if (var6 != null) {
            var7.method2564(0, new class301(var6));
        }
        class14 var8 = this.field3514;
        synchronized (this.field3514) {
            this.field3514.method67((long) arg1, var7, -6772);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIII)V")
    public static final void method1530(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 << 3;
        if (arg2 != -1) {
            return;
        }
        field3509++;
        int var5 = arg0 << 3;
        int var6 = arg1 << 3;
        class490.field7077 = var4;
        if (class639.field8978 == 2) {
            class608.field8587 = var6;
            class81.field1167 = var4;
            class40.field714 = var5;
        }
        class261.field4064 = var6;
        class632.method3582((byte) 60);
        class218.field3575 = true;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V")
    public final void method1531(int arg0, int arg1) {
        class14 var3 = this.field3514;
        synchronized (this.field3514) {
            this.field3514.method68(arg0 - 28601, arg1);
        }
        field3504++;
        class14 var4 = this.field3516;
        synchronized (this.field3516) {
            if (arg0 != 11723) {
                field3511 = null;
            }
            this.field3516.method68(-16878, arg1);
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(BI)V")
    public final void method1532(byte arg0, int arg1) {
        field3508++;
        this.field3517 = arg1;
        class14 var3 = this.field3516;
        synchronized (this.field3516) {
            this.field3516.method76(-122);
            int var4 = 35 / ((-arg0 - 54) / 40);
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(Z)V")
    public final void method1533(boolean arg0) {
        field3503++;
        class14 var2 = this.field3514;
        synchronized (this.field3514) {
            this.field3514.method71((byte) 44);
        }
        class14 var3 = this.field3516;
        synchronized (this.field3516) {
            this.field3516.method71((byte) 44);
            if (arg0) {
                this.method1528(false);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)Lnaa;")
    private static final class630 method1534(int arg0, int arg1) {
        field3505++;
        if (arg1 != 60) {
            field3502 = null;
        }
        return new class630(arg0, false);
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lcr;ILla;Lla;)V")
    public class211(class292 arg0, int arg1, class422 arg2, class422 arg3) {
        this.field3515 = arg2;
        this.field3506 = arg3;
        int var5 = this.field3515.method2628(67) - 1;
        this.field3515.method2615(0, var5);
    }
}
