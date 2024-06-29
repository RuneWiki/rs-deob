import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public class class638 {

    @OriginalMember(owner = "client!cia", name = "j", descriptor = "Ldaa;")
    public static class12 field8598 = new class12(0);

    @OriginalMember(owner = "client!cia", name = "l", descriptor = "Lg;")
    public static class166 field8600 = new class166(1);

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "I")
    public static int field8589;

    @OriginalMember(owner = "client!cia", name = "c", descriptor = "I")
    public static int field8591;

    @OriginalMember(owner = "client!cia", name = "d", descriptor = "I")
    private int field8592;

    @OriginalMember(owner = "client!cia", name = "e", descriptor = "I")
    public static int field8593;

    @OriginalMember(owner = "client!cia", name = "f", descriptor = "I")
    public int field8594;

    @OriginalMember(owner = "client!cia", name = "g", descriptor = "I")
    public static int field8595;

    @OriginalMember(owner = "client!cia", name = "h", descriptor = "I")
    public static int field8596;

    @OriginalMember(owner = "client!cia", name = "i", descriptor = "I")
    public int field8597;

    @OriginalMember(owner = "client!cia", name = "m", descriptor = "Luq;")
    public static class172 field8601;

    @OriginalMember(owner = "client!cia", name = "b", descriptor = "Ljda;")
    public class239 field8590;

    @OriginalMember(owner = "client!cia", name = "k", descriptor = "Lcj;")
    public static class720 field8599;

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(Ldt;BI)V", line = 5)
    private final void method3509(class254 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field8592 = arg0.method1728((byte) 44);
        } else if (arg2 == 2) {
            this.field8594 = arg0.method1731((byte) 64);
            this.field8597 = arg0.method1731((byte) 64);
        }
        if (arg1 == -11) {
            field8596++;
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(I)Lvf;", line = 30)
    public final synchronized class162 method3510(int arg0) {
        field8595++;
        class162 var2 = (class162) this.field8590.field3172.method3109((byte) 120, (long) this.field8592);
        if (var2 != null) {
            return var2;
        }
        class162 var3 = class162.method1115(this.field8590.field3167, this.field8592, 0);
        if (var3 != null) {
            this.field8590.field3172.method3108((long) this.field8592, arg0 ^ 0xFFFF9FE8, var3);
        }
        return arg0 == -24519 ? var3 : null;
    }

    @OriginalMember(owner = "client!cia", name = "b", descriptor = "(I)V", line = 50)
    public static void method3511(int arg0) {
        if (arg0 != 1) {
            method3514(null, 39, (byte) -122);
        }
        field8600 = null;
        field8601 = null;
        field8598 = null;
        field8599 = null;
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(ILqba;)V", line = 69)
    public static final void method3512(int arg0, class425 arg1) {
        field8591++;
        boolean var2 = false;
        if (class572.field7788 == arg1.field6104 || arg1.field6138 == -1 || arg1.field6183 != 0) {
            var2 = true;
        } else {
            class317 var3 = class693.field9223.method2388(arg1.field6138, 0);
            if (var3.field4474 || arg1.field6157 + 1 > var3.field4485[arg1.field6150]) {
                var2 = true;
            }
        }
        if (arg0 >= -126) {
            field8599 = null;
        }
        if (var2) {
            int var4 = arg1.field6104 - arg1.field6165;
            int var5 = class572.field7788 - arg1.field6165;
            int var6 = arg1.field6105 * 512 + (arg1.method2563(-12840) * 256);
            int var7 = arg1.field6126 * 512 + (arg1.method2563(-12840) * 256);
            int var8 = arg1.field6154 * 512 + (arg1.method2563(-12840) * 256);
            int var9 = arg1.field6102 * 512 + arg1.method2563(-12840) * 256;
            arg1.field2810 = ((var4 - var5) * var7 + var5 * var9) / var4;
            arg1.field2802 = ((var4 - var5) * var6 + (var5 * var8)) / var4;
        }
        arg1.field6199 = 0;
        if (arg1.field6107 == 0) {
            arg1.method2561(false, false, 8192);
        }
        if (arg1.field6107 == 1) {
            arg1.method2561(false, false, 12288);
        }
        if (arg1.field6107 == 2) {
            arg1.method2561(false, false, 0);
        }
        if (arg1.field6107 == 3) {
            arg1.method2561(false, false, 4096);
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(ZLdt;)V", line = 127)
    public final void method3513(boolean arg0, class254 arg1) {
        if (!arg0) {
            this.method3509(null, (byte) -80, -124);
        }
        while (true) {
            int var3 = arg1.method1731((byte) 64);
            if (var3 == 0) {
                field8593++;
                return;
            }
            this.method3509(arg1, (byte) -11, var3);
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(Ljava/lang/String;IB)I", line = 153)
    public static final int method3514(String arg0, int arg1, byte arg2) {
        field8589++;
        int var3 = -86 % ((41 - arg2) / 40);
        return class101.method786(55, arg0, true, arg1);
    }
}
