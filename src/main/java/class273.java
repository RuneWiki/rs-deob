import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public class class273 extends class416 {

    @OriginalMember(owner = "client!gia", name = "B", descriptor = "Lbw;")
    public static class689 field3803 = new class689(true);

    @OriginalMember(owner = "client!gia", name = "x", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!gia", name = "y", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!gia", name = "A", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!gia", name = "C", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!gia", name = "D", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!gia", name = "F", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!gia", name = "z", descriptor = "Ldu;")
    private class360 field3801;

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(ILee;)V")
    public final void method1636(int arg0, class677 arg1) {
        field3802++;
        while (true) {
            int var3 = arg1.method3821((byte) 77);
            if (var3 == 0) {
                if (arg0 == -2) {
                    return;
                } else {
                    method1640(-110, -58, -26);
                    return;
                }
            }
            this.method1638(0, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(B)V")
    public static final void method1637(byte arg0) {
        field3806++;
        int var1 = 0;
        int var2 = 0;
        int var3 = 91 / ((1 - arg0) / 54);
        while (var2 < class719.field10004) {
            for (int var4 = 0; var4 < class107.field1453; var4++) {
                if (class733.method4102(var1, var4, true, var2, class660.field8718, 0)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(ILee;I)V")
    private final void method1638(int arg0, class677 arg1, int arg2) {
        field3804++;
        if (arg0 != 0 || arg2 != 249) {
            return;
        }
        int var4 = arg1.method3821((byte) -46);
        if (this.field3801 == null) {
            int var5 = class737.method4119(var4, (byte) -128);
            this.field3801 = new class360(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg1.method3821((byte) -74) == 1;
            int var8 = arg1.method3833(255);
            class656 var9;
            if (var7) {
                var9 = new class248(arg1.method3793(15598));
            } else {
                var9 = new class651(arg1.method3799(false));
            }
            this.field3801.method2143(-1, var9, (long) var8);
        }
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(IBLjava/lang/String;)Ljava/lang/String;")
    public final String method1639(int arg0, byte arg1, String arg2) {
        field3805++;
        if (this.field3801 == null) {
            return arg2;
        }
        if (arg1 >= -47) {
            field3803 = null;
        }
        class248 var4 = (class248) this.field3801.method2135((long) arg0, (byte) 31);
        return var4 == null ? arg2 : var4.field3436;
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(III)V")
    public static final void method1640(int arg0, int arg1, int arg2) {
        class701 var3 = class660.field8718[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class495.method2796(var3.field9737);
        class495.method2796(var3.field9735);
        if (var3.field9737 != null) {
            var3.field9737 = null;
        }
        if (var3.field9735 != null) {
            var3.field9735 = null;
        }
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(I)V")
    public static final void method1641(int arg0) {
        if (arg0 != -15074) {
            method1640(-109, 61, -5);
        }
        class66.method566(11, arg0 - 5961);
        field3799++;
        class762.method4238(arg0 ^ 0x3A9F);
        System.gc();
    }

    @OriginalMember(owner = "client!gia", name = "d", descriptor = "(Z)V")
    public static void method1642(boolean arg0) {
        if (arg0) {
            field3803 = null;
        }
        field3803 = null;
    }

    @OriginalMember(owner = "client!gia", name = "b", descriptor = "(III)I")
    public final int method1643(int arg0, int arg1, int arg2) {
        field3800++;
        if (this.field3801 == null) {
            return arg0;
        }
        class651 var4 = (class651) this.field3801.method2135((long) arg2, (byte) 31);
        if (arg1 != 0) {
            this.method1638(-59, null, 85);
        }
        return var4 == null ? arg0 : var4.field8636;
    }
}
