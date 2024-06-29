import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class678 extends class205 {

    @OriginalMember(owner = "client!ffa", name = "z", descriptor = "I")
    public int field9563 = 0;

    @OriginalMember(owner = "client!ffa", name = "x", descriptor = "Z")
    public static boolean field9561 = false;

    @OriginalMember(owner = "client!ffa", name = "t", descriptor = "I")
    public static int field9557 = 0;

    @OriginalMember(owner = "client!ffa", name = "v", descriptor = "F")
    public static float field9559;

    @OriginalMember(owner = "client!ffa", name = "u", descriptor = "I")
    public static int field9558;

    @OriginalMember(owner = "client!ffa", name = "w", descriptor = "I")
    public static int field9560;

    @OriginalMember(owner = "client!ffa", name = "y", descriptor = "I")
    public static int field9562;

    @OriginalMember(owner = "client!ffa", name = "A", descriptor = "I")
    public static int field9564;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ILofa;)V", line = 8)
    public final void method3782(int arg0, class301 arg1) {
        if (arg0 != -1) {
            this.method3783(null, 69, 118);
        }
        field9562++;
        while (true) {
            int var3 = arg1.method1987(-3);
            if (var3 == 0) {
                return;
            }
            this.method3783(arg1, var3, -1);
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lofa;II)V", line = 28)
    private final void method3783(class301 arg0, int arg1, int arg2) {
        field9560++;
        if (arg1 == 2) {
            this.field9563 = arg0.method1989((byte) -91);
        }
        if (arg2 != -1) {
            field9561 = true;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)V", line = 48)
    public static final void method3784(int arg0) {
        if (arg0 >= -94) {
            field9561 = true;
        }
        field9564++;
        for (class748 var1 = (class748) class645.field9194.method3463((byte) -50); var1 != null; var1 = (class748) class645.field9194.method3469((byte) 107)) {
            class188 var2 = var1.field10449;
            if (var2.field3151 < class199.field3403) {
                var1.method636((byte) 97);
                var2.method1430(-1);
            } else if (class199.field3403 >= var2.field3176) {
                var2.method1426((byte) 124);
                if (var2.field3155 > 0) {
                    class53 var3 = (class53) class332.field4881.method3512(true, (long) (var2.field3155 - 1));
                    if (var3 != null) {
                        class461 var4 = var3.field847;
                        if (var4.field9477 >= 0 && var4.field9477 < (class191.field3229 * 512) && var4.field9475 >= 0 && (class314.field4720 * 512) > var4.field9475) {
                            var2.method1433(class199.field3403, var4.field9475, (byte) -113, var4.field9477, class232.method1611(var4.field9475, var4.field9477, var2.field9470, (byte) 100) - var2.field3163);
                        }
                    }
                }
                if (var2.field3155 < 0) {
                    int var5 = -var2.field3155 - 1;
                    class573 var6;
                    if (class673.field9516 == var5) {
                        var6 = class145.field2251;
                    } else {
                        var6 = class279.field4271[var5];
                    }
                    if (var6 != null && var6.field9477 >= 0 && class191.field3229 * 512 > var6.field9477 && var6.field9475 >= 0 && class314.field4720 * 512 > var6.field9475) {
                        var2.method1433(class199.field3403, var6.field9475, (byte) -110, var6.field9477, class232.method1611(var6.field9475, var6.field9477, var2.field9470, (byte) -124) - var2.field3163);
                    }
                }
                var2.method1428(class83.field1223, (byte) -99);
                class719.method3967(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "(II)Lsw;", line = 116)
    public static final class603 method3785(int arg0, int arg1) {
        field9558++;
        if (arg0 != 1) {
            field9557 = -114;
        }
        class603 var2 = (class603) class719.field10078.method3893(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class403.field5986.method2624(arg0 - 1, arg1, 0);
        if (var3 == null || var3.length <= 1) {
            return null;
        }
        class603 var4;
        try {
            var4 = class535.method3155(var3, (byte) -28);
        } catch (Exception var6) {
            throw new RuntimeException(var6.getMessage() + " S: " + arg1);
        }
        class719.field10078.method3894(var4, (long) arg1, arg0 - 1);
        return var4;
    }
}
