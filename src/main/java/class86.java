import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class86 {

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "Lhe;")
    public static class47 field1335 = new class47();

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "S")
    public static short field1343 = 1;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field1342 = 0;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "Z")
    public static boolean field1340 = false;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "Lqe;")
    public static class168 field1339 = class66.method448("Fallen lassen", 58);

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "Lsc;")
    public static class75 field1341;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1337;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)I")
    public static final int method569(int arg0, int arg1, int arg2) {
        field1336++;
        if (arg0 >= -34) {
            field1343 = 40;
        }
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg2 >>= 0x1;
        }
        if (arg2 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V")
    public static void method570(byte arg0) {
        field1337 = null;
        if (arg0 > -104) {
            method572(78, null, true);
        }
        field1335 = null;
        field1341 = null;
        field1339 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)I")
    public static int method571(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILgj;Z)V")
    public static final void method572(int arg0, class239 arg1, boolean arg2) {
        if (arg0 != 0) {
            method572(-91, null, true);
        }
        field1338++;
        if (arg2) {
            class132.field2323 = 3;
            class176.method1160(false, (byte) 68);
            class98.field1551 = false;
            class247.field4284 = false;
            class227.field3870 = 0;
            class227.field3866 = false;
            class207.field3593 = false;
            class191.field3333 = 0;
            class253.field4382 = false;
            class101.field1601 = false;
            class166.field2828 = 127;
            class137.field2416 = 0;
            class153.field2651 = false;
            class112.field1781 = 0;
            class62.field847 = 127;
            class177.field3117 = false;
            class93.field1464 = 255;
            class17.field149 = false;
            class249.field4315 = false;
            class3.field34 = false;
            class200.method1277(arg1, (byte) 38);
            return;
        }
        class132.field2323 = 3;
        class176.method1160(true, (byte) 68);
        class3.field34 = true;
        class166.field2828 = 127;
        class137.field2416 = 0;
        class98.field1551 = true;
        class20 var3 = null;
        class153.field2651 = true;
        class101.field1601 = true;
        class177.field3117 = true;
        class227.field3866 = true;
        class227.field3870 = 0;
        class253.field4382 = true;
        class62.field847 = 127;
        class247.field4284 = true;
        class191.field3333 = 0;
        class207.field3593 = true;
        class249.field4315 = true;
        class17.field149 = true;
        class93.field1464 = 255;
        class112.field1781 = 2;
        try {
            class5 var4 = arg1.method1556("runescape", (byte) 76);
            while (var4.field57 == 0) {
                class38.method259(1L, 31644);
            }
            if (var4.field57 == 1) {
                var3 = (class20) var4.field59;
                byte[] var5 = new byte[(int) var3.method106(0)];
                int var7;
                for (int var6 = 0; var6 < var5.length; var6 += var7) {
                    var7 = var3.method105(var5, 0, var5.length - var6, var6);
                    if (var7 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class47.method313(arg0 ^ 0x13, new class112(var5));
            }
        } catch (Exception var9) {
        }
        try {
            if (var3 != null) {
                var3.method104(-119);
            }
        } catch (Exception var8) {
        }
    }
}
