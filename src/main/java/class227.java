import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class227 {

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "Lph;")
    private class308 field3558 = new class308();

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "Lwg;")
    private class198 field3568 = new class198();

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    private int field3566;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "I")
    private int field3571;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "Lil;")
    private class4 field3563;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "Ljo;")
    public static class150 field3564 = new class150();

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
    public static int field3573 = 0;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IJLph;)V", line = 10)
    public final void method1538(int arg0, long arg1, class308 arg2) {
        field3565++;
        if (this.field3566 == 0) {
            class308 var5 = this.field3568.method1352(false);
            var5.method1131(8);
            var5.method2148((byte) 109);
            if (this.field3558 == var5) {
                class308 var6 = this.field3568.method1352(false);
                var6.method1131(8);
                var6.method2148((byte) 125);
            }
        } else {
            this.field3566--;
        }
        this.field3563.method37(false, arg2, arg1);
        this.field3568.method1353(-1, arg2);
        int var7 = 99 % ((-arg0 - 35) / 34);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IJ)Lph;", line = 40)
    public final class308 method1539(int arg0, long arg1) {
        if (arg0 >= -52) {
            method1541(-115, 80);
        }
        field3569++;
        class308 var4 = (class308) this.field3563.method29(arg1, 103);
        if (var4 != null) {
            this.field3568.method1353(-1, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 63)
    public static final String method1540(byte arg0, int arg1) {
        if (arg0 <= 91) {
            field3573 = -116;
        }
        field3559++;
        if (arg1 >= 100000) {
            return arg1 < 10000000 ? "<col=ffffff>" + arg1 / 1000 + class123.field1830 + "</col>" : "<col=00ff80>" + arg1 / 1000000 + class99.field1435 + "</col>";
        } else {
            return "<col=ffff00>" + arg1 + "</col>";
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)Ljm;", line = 84)
    public static final class328 method1541(int arg0, int arg1) {
        class328 var2 = (class328) class223.field3454.method1539(-113, (long) arg1);
        if (arg0 != 0) {
            field3573 = 10;
        }
        field3567++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class285.field4671.method1504(arg1 & 0x7FFF, true, 0);
        } else {
            var3 = class148.field2384.method1504(arg1, true, 0);
        }
        class328 var4 = new class328();
        if (var3 != null) {
            var4.method2338(new class313(var3), 122);
        }
        if (arg1 >= 32768) {
            var4.method2339((byte) -126);
        }
        class223.field3454.method1538(-117, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V", line = 115)
    public static void method1542(int arg0) {
        int var1 = -48 % ((arg0 - 56) / 40);
        field3564 = null;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(I)V", line = 240)
    public class227(int arg0) {
        this.field3566 = arg0;
        this.field3571 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field3563 = new class4(var2);
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)Lak;", line = 134)
    public final class159 method1543(int arg0) {
        if (arg0 != -32531) {
            this.field3566 = -83;
        }
        field3560++;
        return this.field3563.method27(arg0 ^ 0xFFFF8096);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)Lak;", line = 148)
    public final class159 method1544(boolean arg0) {
        field3572++;
        if (!arg0) {
            method1540((byte) -16, -90);
        }
        return this.field3563.method34(8);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lpl;I)Z", line = 165)
    public static final boolean method1545(class312 arg0, int arg1) {
        field3570++;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field5077) {
            return false;
        } else if (!arg0.method2179(11902)) {
            return false;
        } else if (class48.field689.method29((long) arg0.field5101, 103) == null) {
            if (arg1 <= 90) {
                method1546(114, 9L);
            }
            return class91.field1311.method29((long) arg0.field5095, 103) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(IJ)V", line = 197)
    public static final void method1546(int arg0, long arg1) {
        field3562++;
        if (arg0 != -1) {
            method1545((class312) null, -5);
        }
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V", line = 217)
    public final void method1547(int arg0) {
        int var2 = 109 / ((arg0 - 24) / 34);
        field3561++;
        this.field3568.method1354((byte) -41);
        this.field3563.method31(false);
        this.field3558 = new class308();
        this.field3566 = this.field3571;
    }
}
