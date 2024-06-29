import java.awt.Frame;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class182 {

    @OriginalMember(owner = "client!rfa", name = "m", descriptor = "I")
    public int field2577;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "S")
    public short field2565;

    @OriginalMember(owner = "client!rfa", name = "n", descriptor = "S")
    public short field2578;

    @OriginalMember(owner = "client!rfa", name = "e", descriptor = "I")
    public int field2569;

    @OriginalMember(owner = "client!rfa", name = "j", descriptor = "S")
    public short field2574;

    @OriginalMember(owner = "client!rfa", name = "g", descriptor = "I")
    public int field2571;

    @OriginalMember(owner = "client!rfa", name = "t", descriptor = "B")
    public byte field2584;

    @OriginalMember(owner = "client!rfa", name = "u", descriptor = "Z")
    public boolean field2585;

    @OriginalMember(owner = "client!rfa", name = "f", descriptor = "I")
    public int field2570;

    @OriginalMember(owner = "client!rfa", name = "d", descriptor = "I")
    public int field2568;

    @OriginalMember(owner = "client!rfa", name = "l", descriptor = "[I")
    public static int[] field2576 = new int[3];

    @OriginalMember(owner = "client!rfa", name = "i", descriptor = "[I")
    public static int[] field2573 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!rfa", name = "p", descriptor = "[I")
    public static int[] field2580 = new int[200];

    @OriginalMember(owner = "client!rfa", name = "o", descriptor = "Ldg;")
    public static class376 field2579 = new class376(51, 8);

    @OriginalMember(owner = "client!rfa", name = "v", descriptor = "Z")
    public static boolean field2586 = false;

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!rfa", name = "h", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!rfa", name = "k", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!rfa", name = "q", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!rfa", name = "s", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!rfa", name = "r", descriptor = "J")
    public static long field2582;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(III)Z", line = 8)
    public static final boolean method1225(int arg0, int arg1, int arg2) {
        field2583++;
        return arg1 <= 110 ? true : (class332.method2094(arg0, (byte) -115, arg2) | class36.method423((byte) -75, arg2, arg0) | class161.method1109(-63, arg0, arg2)) & class98.method799(true, arg2, arg0);
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ILjava/lang/String;)I", line = 22)
    public static final int method1226(int arg0, String arg1) {
        field2572++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 <= '\u007F') {
                var3++;
            } else if (var5 <= '߿') {
                var3 += 2;
            } else {
                var3 += 3;
            }
        }
        if (arg0 == -31370) {
            return var3;
        } else {
            return -43;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lft;ILjava/awt/Frame;)V", line = 61)
    public static final void method1227(class4 arg0, int arg1, Frame arg2) {
        field2575++;
        while (true) {
            class494 var3 = arg0.method30(8192, arg2);
            while (var3.field7024 == 0) {
                class561.method3202(10L, (byte) -125);
            }
            if (var3.field7024 == 1) {
                arg2.setVisible(false);
                if (arg1 != -5245) {
                    method1226(-59, null);
                }
                arg2.dispose();
                return;
            }
            class561.method3202(100L, (byte) -92);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)V", line = 86)
    public static void method1228(int arg0) {
        field2576 = null;
        if (arg0 != 0) {
            field2580 = null;
        }
        field2573 = null;
        field2580 = null;
        field2579 = null;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIB)I", line = 100)
    public static final int method1229(int arg0, int arg1, byte arg2) {
        field2566++;
        if (arg2 != 108) {
            method1229(80, -117, (byte) -11);
        }
        int var3 = class563.method3216(arg1 - 1, 255, arg0 - 1) + class563.method3216(arg1 - 1, 255, arg0 + 1) + class563.method3216(arg1 - -1, 255, arg0 + -1) + class563.method3216(arg1 - -1, arg2 + 147, arg0 + 1);
        int var4 = class563.method3216(arg1, 255, arg0 - 1) - (-class563.method3216(arg1, arg2 ^ 0x93, arg0 + 1) - class563.method3216(arg1 - 1, arg2 ^ 0x93, arg0) - class563.method3216(arg1 + 1, 255, arg0));
        int var5 = class563.method3216(arg1, 255, arg0);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IZII)V", line = 117)
    public static final void method1230(int arg0, boolean arg1, int arg2, int arg3) {
        field2567++;
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class465.field6683 = arg2;
        if (arg0 <= -50) {
            class617.field8597 = arg3;
            class22.field297 = arg1;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lft;BLjava/lang/Object;)V", line = 142)
    public static final void method1231(class4 arg0, byte arg1, Object arg2) {
        field2581++;
        if (arg0.field24 == null) {
            return;
        }
        if (arg1 != -86) {
            field2580 = null;
        }
        for (int var3 = 0; var3 < 50 && arg0.field24.peekEvent() != null; var3++) {
            class561.method3202(1L, (byte) -89);
        }
        try {
            if (arg2 != null) {
                arg0.field24.postEvent(new ActionEvent(arg2, 1001, "dummy"));
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 185)
    public class182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field2577 = arg2;
        this.field2565 = (short) arg5;
        this.field2578 = (short) arg4;
        this.field2569 = arg1;
        this.field2574 = (short) arg6;
        this.field2571 = arg3;
        this.field2584 = (byte) arg8;
        this.field2585 = arg10;
        this.field2570 = arg0;
        this.field2568 = arg11;
    }
}
