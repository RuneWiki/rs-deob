import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public abstract class class111 {

    @OriginalMember(owner = "client!np", name = "e", descriptor = "Z")
    public static boolean field1411 = false;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "Lrb;")
    public static class352 field1407 = new class352(15, 0, 1, 0);

    @OriginalMember(owner = "client!np", name = "b", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lua;I)I")
    public static final int method660(class548 arg0, int arg1) {
        field1410++;
        String var2 = class105.method606((byte) 66, arg0);
        if (arg1 != -7775) {
            return 109;
        }
        int[] var3 = null;
        if (class647.method3732(arg0.field8163, (byte) -80)) {
            var3 = class216.field3204.method3357((int) arg0.field8171, (byte) -42).field5965;
        } else if (arg0.field8174 != -1) {
            var3 = class216.field3204.method3357(arg0.field8174, (byte) -74).field5965;
        } else if (class555.method3242(arg0.field8163, (byte) 86)) {
            class234 var4 = (class234) class627.field9185.method1333((long) ((int) arg0.field8171), false);
            if (var4 != null) {
                class383 var5 = var4.field3443;
                class429 var6 = var5.field5601;
                if (var6.field6238 != null) {
                    var6 = var6.method2629(class406.field5823, (byte) 120);
                }
                if (var6 != null) {
                    var3 = var6.field6253;
                }
            }
        } else if (class340.method2113((byte) -82, arg0.field8163)) {
            Object var7 = null;
            class158 var8;
            if (arg0.field8163 == 1006) {
                var8 = class312.field4690.method2004(false, (int) arg0.field8171);
            } else {
                var8 = class312.field4690.method2004(false, (int) (arg0.field8171 >>> 32 & 0x7FFFFFFFL));
            }
            if (var8.field2035 != null) {
                var8 = var8.method923(-125, class406.field5823);
            }
            if (var8 != null) {
                var3 = var8.field2104;
            }
        }
        if (var3 != null) {
            var2 = var2 + class148.method874(arg1 + 31740, var3);
        }
        int var9 = class511.field7585.method1051(var2, class465.field6720, (byte) 96);
        if (arg0.field8169) {
            var9 += class148.field1920.method718() + 4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
    public static void method661(int arg0) {
        int var1 = -84 % ((77 - arg0) / 33);
        field1407 = null;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ZLun;)Lun;")
    public abstract class152 method662(boolean arg0, class152 arg1);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IB)V")
    public static final void method663(int arg0, byte arg1) {
        class629.field9213 = arg0;
        field1409++;
        class325 var2 = class203.field3028;
        synchronized (class203.field3028) {
            class203.field3028.method2037(true);
        }
        if (arg1 != 62) {
            field1408 = 103;
        }
    }
}
