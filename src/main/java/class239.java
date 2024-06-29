import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class239 {

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "Lei;")
    private class175 field3826 = new class175();

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "La;")
    private class247 field3829 = new class247();

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    private int field3830;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    private int field3827;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "Lgg;")
    private class61 field3831;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field3819 = 0;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field3820 = 0;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "Z")
    public static boolean field3828 = false;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BI)Lkk;")
    public static final class210 method1576(byte arg0, int arg1) {
        field3825++;
        class210 var2 = (class210) class272.field4398.method1839((byte) 111, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        int var3 = -70 / ((arg0 + 15) / 33);
        byte[] var4 = class147.field2362.method940((byte) 46, 0, arg1);
        class210 var5 = new class210(var4);
        var5.method1129(class235.field3756, (int[]) null);
        class272.field4398.method1830((long) arg1, -95, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public final void method1577(int arg0) {
        if (arg0 != 0) {
            this.method1580((byte) -17);
        }
        field3824++;
        this.field3829.method1631((byte) -105);
        this.field3831.method458(77);
        this.field3826 = new class175();
        this.field3830 = this.field3827;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lei;JI)V")
    public final void method1578(class175 arg0, long arg1, int arg2) {
        if (this.field3830 == 0) {
            class175 var5 = this.field3829.method1633((byte) -71);
            var5.method544(110);
            var5.method1213(true);
            if (this.field3826 == var5) {
                class175 var6 = this.field3829.method1633((byte) -71);
                var6.method544(arg2 ^ 0xFFFFFFC3);
                var6.method1213(true);
            }
        } else {
            this.field3830--;
        }
        this.field3831.method466(arg1, arg0, (byte) 93);
        if (arg2 != 50) {
            this.method1581((byte) -26);
        }
        this.field3829.method1634((byte) 113, arg0);
        field3817++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(JI)Lei;")
    public final class175 method1579(long arg0, int arg1) {
        if (arg1 != 0) {
            this.method1578((class175) null, -82L, 109);
        }
        field3822++;
        class175 var4 = (class175) this.field3831.method457(arg0, (byte) -115);
        if (var4 != null) {
            this.field3829.method1634((byte) 63, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)Lwd;")
    public final class69 method1580(byte arg0) {
        field3818++;
        int var2 = 23 / ((arg0 + 28) / 45);
        return this.field3831.method461((byte) -13);
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)Lwd;")
    public final class69 method1581(byte arg0) {
        if (arg0 > -35) {
            field3819 = -107;
        }
        field3823++;
        return this.field3831.method465((byte) -105);
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(I)V")
    public class239(int arg0) {
        this.field3830 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field3827 = arg0;
        this.field3831 = new class61(var2);
    }
}
