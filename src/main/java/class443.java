import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class443 extends class189 {

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "[I")
    public static int[] field6573 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!sk", name = "C", descriptor = "[I")
    public static int[] field6579 = new int[8];

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "I")
    public static int field6572;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!sk", name = "A", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!sk", name = "B", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!sk", name = "D", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "Lfq;")
    public static class137 field6575;

    @OriginalMember(owner = "client!sk", name = "E", descriptor = "Lmn;")
    private class249 field6581;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2634(int arg0) {
        field6574++;
        if (!class142.field2356) {
            return;
        }
        class229.field3552 = null;
        class142.field2356 = false;
        if (arg0 == 4) {
            class396.field6025 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)V", line = 21)
    public static final void method2635(int arg0) {
        field6576++;
        class477.field7051.method1614((byte) -24);
        if (arg0 != 11764) {
            method2637(94);
        }
        class20.field318.method783((byte) -104);
        class150.field2465.method783((byte) -104);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIB)I", line = 38)
    public final int method2636(int arg0, int arg1, byte arg2) {
        field6577++;
        if (this.field6581 == null) {
            return arg0;
        }
        class100 var4 = (class100) this.field6581.method1622((long) arg1, -102);
        if (var4 == null) {
            return arg0;
        } else {
            if (arg2 < 1) {
                this.method2636(-118, 11, (byte) -36);
            }
            return var4.field1923;
        }
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)V", line = 60)
    public static void method2637(int arg0) {
        field6579 = null;
        if (arg0 != -250) {
            method2637(64);
        }
        field6573 = null;
        field6575 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILnn;)V", line = 72)
    private final void method2638(int arg0, int arg1, class289 arg2) {
        if (arg0 != 8743) {
            field6573 = null;
        }
        if (arg1 == 249) {
            int var4 = arg2.method1858(-3256);
            if (this.field6581 == null) {
                int var5 = class184.method1256(var4, (byte) 80);
                this.field6581 = new class249(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method1858(-3256) == 1;
                int var8 = arg2.method1863(100);
                class261 var9;
                if (var7) {
                    var9 = new class268(arg2.method1834(-17823));
                } else {
                    var9 = new class100(arg2.method1815((byte) -115));
                }
                this.field6581.method1618(var9, (long) var8, -1);
            }
        }
        field6578++;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;", line = 125)
    public final String method2639(String arg0, int arg1, int arg2) {
        field6580++;
        if (this.field6581 == null) {
            return arg0;
        }
        if (arg2 != 8) {
            this.method2640((byte) -38, null);
        }
        class268 var4 = (class268) this.field6581.method1622((long) arg1, -113);
        return var4 == null ? arg0 : var4.field4061;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BLnn;)V", line = 145)
    public final void method2640(byte arg0, class289 arg1) {
        field6572++;
        while (true) {
            int var3 = arg1.method1858(-3256);
            if (var3 == 0) {
                if (arg0 <= 10) {
                    method2637(85);
                    return;
                } else {
                    return;
                }
            }
            this.method2638(8743, var3, arg1);
        }
    }
}
