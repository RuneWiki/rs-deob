import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class106 implements Runnable {

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "[Ltn;")
    public volatile class252[] field1596 = new class252[2];

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Z")
    public volatile boolean field1593 = false;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Z")
    public volatile boolean field1598 = false;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "[I")
    public static int[] field1591 = new int[256];

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field1592 = 0;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "Lve;")
    public static class227 field1599;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "Lua;")
    public class323 field1602;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1591[var0] = var1;
        }
        field1601 = 1;
        field1600 = 0;
        field1599 = new class227(0, -1);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIIII)V", line = 15)
    public static final void method916(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1597++;
        if (arg2 < 29) {
            field1600 = -98;
        }
        if (arg4 >= class43.field693 && class128.field2130 >= arg7 && class328.field5042 <= arg1 && class284.field4385 >= arg0) {
            class59.method584(arg5, arg6, arg1, arg7, arg4, true, arg3, arg0);
        } else {
            class86.method772(arg5, 91, arg0, arg4, arg3, arg1, arg6, arg7);
        }
    }

    @OriginalMember(owner = "client!qc", name = "run", descriptor = "()V", line = 33)
    public final void run() {
        field1594++;
        this.field1598 = true;
        try {
            while (!this.field1593) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class252 var2 = this.field1596[var1];
                    if (var2 != null) {
                        var2.method1878((byte) -105);
                    }
                }
                class188.method1443(10, 10L);
                class202.method1509(27949, this.field1602, (Object) null);
            }
        } catch (Exception var7) {
            client.method1023((byte) -101, (String) null, var7);
        } finally {
            this.field1598 = false;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V", line = 68)
    public static void method917(boolean arg0) {
        field1599 = null;
        if (!arg0) {
            method916(112, -26, 40, 53, -2, 65, -84, -119);
        }
        field1591 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lsd;Z)I", line = 116)
    public static final int method918(class244 arg0, boolean arg1) {
        field1595++;
        class130 var2 = arg0.field3802;
        if (var2.field2149 != null) {
            var2 = var2.method1120((byte) -128);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field2182;
        class109 var4 = arg0.method813((byte) -123);
        if (arg0.field1350 == var4.field1663) {
            var3 = var2.field2195;
        } else if (arg0.field1350 == var4.field1673 || arg0.field1350 == var4.field1660 || arg0.field1350 == var4.field1635 || arg0.field1350 == var4.field1652) {
            var3 = var2.field2210;
        } else if (arg0.field1350 == var4.field1666 || arg0.field1350 == var4.field1634 || arg0.field1350 == var4.field1656 || arg0.field1350 == var4.field1649) {
            var3 = var2.field2187;
        }
        return arg1 ? var3 : -81;
    }
}
