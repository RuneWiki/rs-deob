import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class356 extends class402 {

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "Lbja;")
    public static class34 field4419 = new class34(12, 0, 1, 0);

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "Lhu;")
    public static class143 field4422;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(IZ)V")
    public final void method176(int arg0, boolean arg1) {
        if (arg0 <= -32) {
            ++field4418;
            super.field5243.method3919(true, (byte) -35);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)V")
    public final void method183(int arg0, int arg1, int arg2) {
        if (arg0 != 64) {
            this.method178((byte) -59);
        }
        ++field4421;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)Z")
    public final boolean method178(byte arg0) {
        ++field4415;
        if (arg0 > -55) {
            this.method176(-50, false);
        }
        return true;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(IZ)V")
    public final void method184(int arg0, boolean arg1) {
        ++field4416;
        if (arg0 != 64) {
            this.method176(49, true);
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lpc;)V")
    public class356(class700 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZIJ)Ljava/lang/String;")
    public static final String method2089(int arg0, boolean arg1, int arg2, long arg3) {
        ++field4417;
        Calendar var5;
        if (arg1) {
            class570.method3293(true, arg3);
            var5 = class532.field7497;
        } else {
            class200.method1297(-30414, arg3);
            var5 = class532.field7493;
        }
        int var6 = var5.get(5);
        int var7 = var5.get(2);
        int var8 = var5.get(1);
        int var9 = var5.get(11);
        int var10 = var5.get(12);
        return ~arg2 == arg0 ? class93.method824(arg3, arg2, (byte) 105, arg1) : Integer.toString(var6 / 10) + var6 % 10 + "-" + class112.field1416[arg2][var7] + "-" + var8 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBLfha;)V")
    public final void method180(int arg0, byte arg1, class400 arg2) {
        if (arg1 < -103) {
            super.field5243.method3936(false, arg2);
            ++field4414;
            super.field5243.method3932(arg0, (byte) 99);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public final void method181(int arg0) {
        ++field4420;
        super.field5243.method3919(false, (byte) -64);
        if (arg0 != -1) {
            method2089(-98, true, 5, 11L);
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    public static void method2090(int arg0) {
        field4419 = null;
        field4422 = null;
        if (arg0 != 12) {
            method2090(111);
        }
    }
}
