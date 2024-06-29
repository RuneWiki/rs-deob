import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class215 {

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "Leda;")
    private class14 field3551 = new class14(64);

    @OriginalMember(owner = "client!mu", name = "i", descriptor = "Lla;")
    private class422 field3557;

    @OriginalMember(owner = "client!mu", name = "k", descriptor = "[S")
    public static short[] field3559 = new short[256];

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "Llw;")
    public static class233 field3556 = new class233(1);

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "[I")
    public static int[] field3560 = new int[14];

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V")
    public final void method1547(int arg0) {
        field3555++;
        int var2 = -71 / ((arg0 - 7) / 45);
        class14 var3 = this.field3551;
        synchronized (this.field3551) {
            this.field3551.method71((byte) 44);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(II)Lpfa;")
    public final class228 method1548(int arg0, int arg1) {
        field3554++;
        if (arg0 >= -89) {
            method1551(-49);
        }
        class14 var3 = this.field3551;
        class228 var4;
        synchronized (this.field3551) {
            var4 = (class228) this.field3551.method80((byte) -127, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class422 var5 = this.field3557;
        byte[] var6;
        synchronized (this.field3557) {
            var6 = this.field3557.method2624(0, 32, arg1);
        }
        class228 var7 = new class228();
        if (var6 != null) {
            var7.method1591((byte) 83, new class301(var6));
        }
        class14 var8 = this.field3551;
        synchronized (this.field3551) {
            this.field3551.method67((long) arg1, var7, -6772);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)V")
    public final void method1549(int arg0) {
        class14 var2 = this.field3551;
        synchronized (this.field3551) {
            this.field3551.method76(-98);
        }
        field3553++;
        if (arg0 != 32) {
            field3556 = null;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(BILraa;I)V")
    public static final void method1550(byte arg0, int arg1, class353 arg2, int arg3) {
        field3552++;
        if (arg2 == null) {
            return;
        }
        if (arg2.field5209 != null) {
            class700 var4 = new class700();
            var4.field9902 = arg2;
            var4.field9891 = arg2.field5209;
            class464.method2838(var4);
        }
        class400.field5936 = arg2.field5360;
        class553.field7869 = arg3;
        class552.field7867 = true;
        class711.field10004 = arg2.field5349;
        class493.field7149 = arg1;
        class289.field4444 = arg2.field5328;
        class436.field6364 = arg2.field5352;
        if (arg0 != -75) {
            field3559 = null;
        }
        class618.field8708 = arg2.field5338;
        class717.method3960(arg2, (byte) 123);
    }

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)V")
    public static final void method1551(int arg0) {
        for (class180 var1 = (class180) class26.field263.method3772(true); var1 != null; var1 = (class180) class26.field263.method3780(23774)) {
            if (var1.field3056 > 1) {
                var1.field3056 = 0;
                class206.field3455.method67(((class208) var1.field3055.field9552.field3449).field3476, var1, -6772);
                var1.field3055.method3773((byte) -98);
            }
        }
        field3549++;
        class124.field1898 = arg0;
        class608.field8588 = 0;
        class344.field5093.method3465(0);
        class88.field1289.method3517(arg0 ^ 0xFFFFFFAE);
        class26.field263.method3773((byte) -52);
        class153.method1160(class82.field1185, 34);
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(II)V")
    public final void method1552(int arg0, int arg1) {
        if (arg0 > -93) {
            field3558 = -123;
        }
        field3550++;
        class14 var3 = this.field3551;
        synchronized (this.field3551) {
            this.field3551.method68(-16878, arg1);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Z)V")
    public static void method1553(boolean arg0) {
        field3560 = null;
        field3556 = null;
        if (arg0) {
            method1551(34);
        }
        field3559 = null;
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lcr;ILla;)V")
    public class215(class292 arg0, int arg1, class422 arg2) {
        this.field3557 = arg2;
        this.field3557.method2615(0, 32);
    }
}
