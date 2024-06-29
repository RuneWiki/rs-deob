import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class283 extends class2 implements class243 {

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "Z")
    private boolean field4492 = false;

    @OriginalMember(owner = "client!sh", name = "M", descriptor = "I")
    private int field4508 = 50;

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "Lsb;")
    private class124 field4493;

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "Lsb;")
    private class124 field4490;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "Lf;")
    private class227 field4488;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "Lf;")
    private class227 field4495;

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "[I")
    public static int[] field4496 = new int[32];

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
    public static int field4489 = 0;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!sh", name = "F", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!sh", name = "G", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!sh", name = "H", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!sh", name = "I", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!sh", name = "J", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!sh", name = "K", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!sh", name = "L", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!sh", name = "N", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!sh", name = "O", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "Lek;")
    public static class239 field4487;

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "Ljava/awt/Image;")
    public static Image field4499;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZFIZ)Lwf;")
    public final class17 method1610(int arg0, boolean arg1, float arg2, int arg3, boolean arg4) {
        class284 var6 = this.method1898(0, arg0);
        field4502++;
        if (arg1) {
            return null;
        } else if (var6 != null && var6.method1907(this, this.field4493)) {
            return arg4 ? var6.field4514.method253((double) arg2, false, this.field4493, arg3, this, arg3, 82) : var6.field4514.method248((double) arg2, this, false, (byte) -49, this.field4493, arg3, arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)V")
    public final void method1897(boolean arg0) {
        field4498++;
        this.field4488.method1519(arg0);
        if (this.field4495 != null) {
            this.field4495.method1519(true);
        }
        class284.field4520 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(FII)[I")
    public final int[] method1614(float arg0, int arg1, int arg2) {
        field4486++;
        class284 var4 = this.method1898(0, arg1);
        if (var4 == null) {
            return null;
        }
        if (arg2 <= 61) {
            method1900((class124) null, 54, (class17[]) null);
        }
        var4.field4511 = true;
        return var4.method1906(this, this.field4493, arg0, this.field4492 || this.method7(105, arg1).field1314);
    }

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "(II)Lmf;")
    public final class28 method11(int arg0, int arg1) {
        if (arg0 > -99) {
            return null;
        } else {
            field4494++;
            class284 var3 = this.method1898(0, arg1);
            return var3 == null ? null : var3.field4514;
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(II)I")
    public final int method1612(int arg0, int arg1) {
        if (arg0 > -47) {
            return -127;
        } else {
            field4501++;
            return this.method7(115, arg1).field1311 & 0xFFFF;
        }
    }

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "(II)Lc;")
    private final class284 method1898(int arg0, int arg1) {
        field4509++;
        class284 var3 = (class284) this.field4488.method1518((long) arg1, 115);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field4490.method900(arg1, arg0, false);
        if (var4 == null) {
            return null;
        } else {
            class284 var5 = new class284(new class136(var4));
            this.field4488.method1514(false, var5, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lsb;Lsb;Lsb;IZ)V")
    public class283(class124 arg0, class124 arg1, class124 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field4493 = arg2;
        this.field4492 = arg4;
        this.field4490 = arg0;
        this.field4508 = arg3;
        this.field4488 = new class227(this.field4508);
        this.field4495 = null;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
    public static void method1899(int arg0) {
        field4496 = null;
        if (arg0 != 0) {
            field4487 = null;
        }
        field4499 = null;
        field4487 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)Z")
    public final boolean method1609(int arg0, int arg1) {
        field4507++;
        if (arg1 != 65535) {
            this.field4495 = null;
        }
        return this.field4492 || this.method7(arg1 - 65465, arg0).field1314;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)Z")
    public final boolean method1611(int arg0, int arg1) {
        field4506++;
        int var3 = 84 / ((arg0 - 34) / 59);
        return !this.method7(56, arg1).field1312;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lsb;I[Lwf;)V")
    public static final void method1900(class124 arg0, int arg1, class17[] arg2) {
        class170.field2776 = arg0;
        client.field4577 = arg2;
        class157.field2555 = new boolean[client.field4577.length];
        class81.field1337.method1060(-112);
        field4505++;
        int var3 = class170.field2776.method889("details", -1);
        int[] var4 = class170.field2776.method910(arg1, var3);
        for (int var5 = 0; var5 < var4.length; var5++) {
            class81.field1337.method1064(class119.method870(var4[var5], 0, new class136(class170.field2776.method900(var3, var4[var5], false))), (long) var4[var5], (byte) -122);
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(Z)V")
    public static final void method1901(boolean arg0) {
        class247.field3887 = null;
        if (arg0) {
            field4487 = null;
        }
        class194.field3181 = null;
        class178.field2966 = null;
        field4500++;
        class128.field2114 = null;
        class101.field1549 = null;
    }

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "(II)V")
    public final void method1902(int arg0, int arg1) {
        if (arg0 != -8975) {
            return;
        }
        for (class284 var3 = (class284) this.field4488.method1515(arg0 + 8975); var3 != null; var3 = (class284) this.field4488.method1517(-51)) {
            if (var3.field4511) {
                var3.method1908(arg1);
                var3.field4511 = false;
            }
        }
        field4491++;
    }

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "(II)V")
    public static final void method1903(int arg0, int arg1) {
        class233.field3697.method1163(arg1, false);
        if (arg0 != 16914) {
            method1901(true);
        }
        class211.field3389.method1163(arg1, false);
        field4504++;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZ)Z")
    public final boolean method1613(int arg0, boolean arg1) {
        field4510++;
        if (!arg1) {
            this.method1898(-76, -60);
        }
        return this.method7(110, arg0).field1318;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(IZ)V")
    public final void method1904(int arg0, boolean arg1) {
        this.field4492 = arg1;
        field4497++;
        this.method1897(true);
        if (arg0 != 32227) {
            this.method11(83, 107);
        }
    }
}
