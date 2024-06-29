import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class525 implements class473 {

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field7731 = 0;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field7724;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field7725;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field7726;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field7727;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field7729;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "Lob;")
    public static class521 field7728;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Z")
    public static boolean field7730;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLjava/awt/Canvas;)Lwe;", line = 5)
    public static final class281 method3123(boolean arg0, Canvas arg1) {
        field7724++;
        try {
            Class var2 = Class.forName("or");
            class281 var3 = (class281) var2.getDeclaredConstructor().newInstance();
            var3.method1698(arg1, arg0);
            return var3;
        } catch (Throwable var5) {
            class347 var4 = new class347();
            var4.method1698(arg1, true);
            return var4;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZIIILfo;I)V", line = 26)
    public static final void method3124(boolean arg0, int arg1, int arg2, int arg3, class361 arg4, int arg5) {
        field7726++;
        class212.field2841 = arg3;
        class337.field4464 = 10000;
        class435.field6349 = arg2;
        class204.field2703 = arg5;
        class476.field7045 = arg4;
        class481.field7112 = arg0;
        class97.field1260 = arg1;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[ILsd;J)Ljava/lang/String;", line = 42)
    public final String method2888(int arg0, int[] arg1, class63 arg2, long arg3) {
        if (arg0 != 0) {
            field7730 = false;
        }
        field7727++;
        if (class454.field6795 == arg2) {
            class368 var6 = class106.field1449.method3068((byte) -102, arg1[0]);
            return var6.method2184((int) arg3, 101);
        } else if (class420.field6096 == arg2 || class116.field1519 == arg2) {
            class199 var7 = class237.field3158.method236(arg0 - 18315, (int) arg3);
            return var7.field2623;
        } else if (class306.field4080 == arg2 || class35.field356 == arg2 || class440.field6387 == arg2) {
            return class106.field1449.method3068((byte) -63, arg1[0]).method2184((int) arg3, 86);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILir;I)V", line = 76)
    public static final void method3125(int arg0, int arg1, class22 arg2, int arg3) {
        if (arg0 > -36) {
            field7728 = null;
        }
        if (arg2.field1196 == arg1 && arg1 != -1) {
            class260 var4 = class7.field97.method2951(arg1, -13765);
            int var5 = var4.field3475;
            if (var5 == 1) {
                arg2.field1203 = 0;
                arg2.field1182 = 1;
                arg2.field1197 = 0;
                arg2.field1152 = arg3;
                arg2.field1233 = 0;
                class276.method1678(var4, arg2.field3695, arg2.field3704, (byte) 92, arg2.field3694, false, arg2.field1233);
            }
            if (var5 == 2) {
                arg2.field1203 = 0;
            }
        } else if (arg1 == -1 || arg2.field1196 == -1 || class7.field97.method2951(arg1, -13765).field3478 >= class7.field97.method2951(arg2.field1196, -13765).field3478) {
            arg2.field1152 = arg3;
            arg2.field1257 = arg2.field1254;
            arg2.field1203 = 0;
            arg2.field1233 = 0;
            arg2.field1197 = 0;
            arg2.field1182 = 1;
            arg2.field1196 = arg1;
            if (arg2.field1196 != -1) {
                class276.method1678(class7.field97.method2951(arg2.field1196, -13765), arg2.field3695, arg2.field3704, (byte) 94, arg2.field3694, false, arg2.field1233);
            }
        }
        field7725++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V", line = 131)
    public static void method3126(int arg0) {
        if (arg0 != 1) {
            method3126(17);
        }
        field7728 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)I", line = 146)
    public static final int method3127(int arg0, int arg1) {
        field7729++;
        int var2 = arg0 >>> 1;
        if (arg1 != 1617667937) {
            return 109;
        }
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg0 & ~var7;
    }
}
