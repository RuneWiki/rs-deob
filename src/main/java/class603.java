import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class603 extends class113 {

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "I")
    public static int field8552 = 0;

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "I")
    public static int field8549 = 0;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
    public static int field8542;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "I")
    public static int field8544;

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "I")
    public static int field8546;

    @OriginalMember(owner = "client!qs", name = "k", descriptor = "I")
    public static int field8547;

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "I")
    public static int field8550;

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "I")
    public static int field8551;

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "I")
    public static int field8553;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "Ljw;")
    public class280 field8541;

    @OriginalMember(owner = "client!qs", name = "l", descriptor = "Lla;")
    public static class423 field8548;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qs", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field8554;

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "Z")
    public boolean field8545;

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "[Lnl;")
    public class373[] field8543;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3515(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(BILha;I)Z", line = 6)
    public final boolean method3509(byte arg0, int arg1, class543 arg2, int arg3) {
        if (arg0 != -66) {
            field8549 = -61;
        }
        field8550++;
        int var5 = this.field8541.method1582(true);
        if (this.field8543 != null) {
            for (int var6 = 0; var6 < this.field8543.length; var6++) {
                this.field8543[var6].field5412 <<= var5;
                if (this.field8543[var6].method2323(arg1, arg3) && this.field8541.method594(arg3, arg1, arg0 ^ 0xFFFFFFBF, arg2)) {
                    this.field8543[var6].field5412 >>= var5;
                    return true;
                }
                this.field8543[var6].field5412 >>= var5;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V", line = 45)
    public static final void method3510(int arg0) {
        field8553++;
        if (class145.field1962 == null) {
            return;
        }
        class703.field9912 = new class201();
        class703.field9912.method1430(class145.field1962, class145.field1962.field6721.method3543(-24350, class45.field748), class105.field1474, class145.field1962.field6718, 255);
        class623.field8862 = new Thread(class703.field9912, "");
        if (arg0 != 17768) {
            method3513(54, 48, -54, -9);
        }
        class623.field8862.start();
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V", line = 63)
    public static void method3511(byte arg0) {
        if (arg0 != -49) {
            field8544 = 102;
        }
        field8548 = null;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIII)V", line = 73)
    public static final void method3512(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8547++;
        class503 var5 = class512.method3112(8, arg1, 0);
        var5.method3075((byte) 114);
        var5.field7312 = arg3;
        if (arg2 != 11693) {
            field8549 = -68;
        }
        var5.field7310 = arg0;
        var5.field7313 = arg4;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIII)Z", line = 91)
    public static final boolean method3513(int arg0, int arg1, int arg2, int arg3) {
        field8546++;
        class324 var4 = (class324) class256.method1707(arg1, arg3, arg2);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class710.method3975(var4, (byte) -128);
        }
        class324 var6 = (class324) class360.method2277(arg1, arg3, arg2, field8554 == null ? (field8554 = method3515("as")) : field8554);
        if (arg0 != 0) {
            return false;
        }
        if (var6 != null) {
            var5 &= class710.method3975(var6, (byte) -113);
        }
        class324 var7 = (class324) class388.method2384(arg1, arg3, arg2);
        if (var7 != null) {
            var5 &= class710.method3975(var7, (byte) -119);
        }
        return var5;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIIIIIZII)V", line = 132)
    public static final void method3514(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        field8542++;
        if (arg8 < 512 || arg6 < 512 || (class184.field2546 * 512 - 1024) < arg8 || arg6 > class240.field3555 * 512 - 1024) {
            class90.field1273[0] = class90.field1273[1] = -1;
            return;
        }
        int var10 = class530.method3211(arg6, 2, arg8, arg0) - arg2;
        if (class416.field5919) {
            class550.method3312(-124, true);
        } else {
            class182.field2510.method849(arg4, 0, 0);
            class211.field3164.method364(class182.field2510);
        }
        if (class100.field1447) {
            class211.field3164.method375(arg8, var10, arg6, class680.field9660, class90.field1273);
        } else {
            class211.field3164.method330(arg8, var10, arg6, class90.field1273);
        }
        if (class416.field5919) {
            class142.method1000(9);
        } else {
            class182.field2510.method849(-arg4, 0, 0);
            class211.field3164.method364(class182.field2510);
        }
        if (arg7) {
            field8549 = -86;
        }
    }
}
