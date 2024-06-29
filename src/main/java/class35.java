import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class35 extends class277 {

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "Lpq;")
    private class159 field350;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "Lcb;")
    public static class318 field342 = new class318(93, 12);

    @OriginalMember(owner = "client!sm", name = "w", descriptor = "Z")
    public static boolean field356 = false;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
    private int field346;

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "Lxa;")
    private class424 field344;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "Lxa;")
    private class424 field345;

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "Lxa;")
    private class424 field347;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "Lxa;")
    private class424 field348;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "Lxa;")
    private class424 field349;

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "Lxa;")
    private class424 field353;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIZ)V", line = 3)
    public final void method190(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg0 > 124) {
            ++field355;
            if (arg3) {
                int[] var5 = new int[4];
                class9.field103.method1910(var5);
                class9.field103.method1908(arg1, arg2, arg1 - -super.field3746.field7517, super.field3746.field7519 + arg2);
                int var6 = this.field348.method1160();
                int var7 = this.field348.method1157();
                int var8 = this.field347.method1160();
                int var9 = this.field347.method1157();
                this.field348.method2450(arg1, (-var7 + super.field3746.field7519) / 2 + arg2);
                this.field347.method2450(super.field3746.field7517 + arg1 + -var8, arg2 - -((super.field3746.field7519 - var9) / 2));
                class9.field103.method1908(arg1, arg2, super.field3746.field7517 + arg1, this.field353.method1157() + arg2);
                this.field353.method2452(arg1 + var6, arg2, -var6 + -var8 + super.field3746.field7517, super.field3746.field7519);
                int var10 = this.field349.method1157();
                class9.field103.method1908(arg1, super.field3746.field7519 + arg2 + -var10, arg1 - -super.field3746.field7517, super.field3746.field7519 + arg2);
                this.field349.method2452(arg1 + var6, super.field3746.field7519 + arg2 + -var10, -var6 + -var8 + super.field3746.field7517, super.field3746.field7519);
                class9.field103.method1908(var5[0], var5[1], var5[2], var5[3]);
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 39)
    public static final void method208(String arg0, int arg1) {
        System.exit(1);
        ++field343;
        if (arg1 < 42) {
            field356 = false;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IZII)V", line = 53)
    public final void method192(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1 || class556.field7597 != this.field346) {
            this.field346 = class556.field7597;
            int var5 = arg2 + this.field348.method1160();
            int var6 = super.field3746.field7517 + arg2 + -this.field347.method1160();
            int var7 = this.field353.method1157() + arg3;
            int var8 = arg3 - (-super.field3746.field7519 + this.field349.method1157());
            int var9 = -var5 + var6;
            int var10 = -var7 + var8;
            int var11 = class556.field7597 * var9 / 100;
            int[] var12 = new int[4];
            class9.field103.method1910(var12);
            class9.field103.method1908(var5, var7, var5 - -var11, var8);
            this.field345.method2452(var5, var7, var9, var10);
            class9.field103.method1908(var5 - -var11, var7, var6, var8);
            this.field344.method2452(var5, var7, var9, var10);
            class9.field103.method1908(var12[0], var12[1], var12[2], var12[3]);
        }
        if (arg0 >= -72) {
            method208((String) null, 0);
        }
        ++field340;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)I", line = 90)
    public static final int method209(int arg0, int arg1, int arg2) {
        ++field354;
        if (arg0 != 12231) {
            return -27;
        } else {
            return ~arg1 != -5 && ~arg1 != -6 ? 256 : class3.field28[3 & arg2];
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V", line = 106)
    public final void method191(byte arg0) {
        ++field339;
        class118 var2 = (class118) super.field3746;
        this.field345 = class506.method2866(this.field350.method1082((byte) 33, var2.field1521), (byte) -24);
        this.field344 = class506.method2866(this.field350.method1082((byte) 33, var2.field1516), (byte) 126);
        this.field348 = class506.method2866(this.field350.method1082((byte) 33, var2.field1514), (byte) 32);
        this.field347 = class506.method2866(this.field350.method1082((byte) 33, var2.field1515), (byte) 122);
        this.field353 = class506.method2866(this.field350.method1082((byte) 33, var2.field1517), (byte) -51);
        this.field349 = class506.method2866(this.field350.method1082((byte) 33, var2.field1518), (byte) 124);
        if (arg0 > -5) {
            this.field344 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Z)V", line = 124)
    public static void method210(boolean arg0) {
        field342 = null;
        if (!arg0) {
            field342 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILoa;IIIII)Lba;", line = 135)
    public static final class629 method211(int arg0, class689 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field351;
        long var7 = (long) arg5;
        class629 var9 = (class629) class669.field9511.method3134(var7, -111);
        short var10 = 2055;
        if (var9 == null) {
            class238 var11 = class646.method3591(class284.field3839, arg5, arg4 ^ 3744, 0);
            if (var11 == null) {
                return null;
            }
            if (~var11.field3136 > -14) {
                var11.method1474(2, (byte) 69);
            }
            var9 = arg1.method1784(var11, var10, class323.field4728, 64, 768);
            class669.field9511.method3130(var7, true, var9);
        }
        class629 var12 = var9.method659((byte) 2, var10, true);
        if (~arg6 != -1) {
            var12.method691(arg6);
        }
        if (arg4 != 3744) {
            method208((String) null, 8);
        }
        if (~arg0 != -1) {
            var12.method650(arg0);
        }
        if (arg3 != 0) {
            var12.method645(arg3);
        }
        if (~arg2 != -1) {
            var12.method693(0, arg2, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)Z", line = 183)
    public final boolean method193(int arg0) {
        ++field352;
        class118 var2 = (class118) super.field3746;
        if (arg0 != -29581) {
            method211(-70, (class689) null, -20, -60, -108, -103, 89);
        }
        if (!this.field350.method1086((byte) 121, var2.field1521)) {
            return false;
        } else if (!this.field350.method1086((byte) 113, var2.field1516)) {
            return false;
        } else if (!this.field350.method1086((byte) 120, var2.field1514)) {
            return false;
        } else if (!this.field350.method1086((byte) 114, var2.field1515)) {
            return false;
        } else if (!this.field350.method1086((byte) 123, var2.field1517)) {
            return false;
        } else {
            return this.field350.method1086((byte) 114, var2.field1515);
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lpq;Lrda;)V", line = 226)
    public class35(class159 arg0, class118 arg1) {
        super(arg1);
        this.field350 = arg0;
    }
}
