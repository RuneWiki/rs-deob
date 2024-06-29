import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class59 extends class17 {

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "Lmb;")
    public static class84 field1466 = class79.method672(true, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "Lmb;")
    public static class84 field1468 = class79.method672(true, " )2> @whi@");

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "Lmb;")
    public static class84 field1472 = class79.method672(true, "gelb:");

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "Lmb;")
    private static class84 field1475 = class79.method672(true, "Walk here");

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "Lmb;")
    public static class84 field1470 = field1475;

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "Z")
    public static volatile boolean field1476 = false;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "J")
    public static volatile long field1473 = 0L;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    public int field1455;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "I")
    public int field1456;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "I")
    public int field1457;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
    public int field1459;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "I")
    public int field1460;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "I")
    public int field1465;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
    public int field1467;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
    public int field1469;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "I")
    public int field1477;

    @OriginalMember(owner = "client!ic", name = "X", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!ic", name = "Y", descriptor = "I")
    public int field1481;

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "Lf;")
    public class36 field1461;

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "Lge;")
    public static class47 field1462;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "Lie;")
    public class61 field1454;

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "Lie;")
    public class61 field1478;

    @OriginalMember(owner = "client!ic", name = "W", descriptor = "[I")
    public int[] field1479;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(Z)I")
    public static final int method516(boolean arg0) {
        field1464++;
        return arg0 ? class68.field1646++ : -64;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)V")
    public static void method517(byte arg0) {
        field1470 = null;
        field1466 = null;
        field1468 = null;
        field1472 = null;
        field1475 = null;
        field1462 = null;
        if (arg0 > -36) {
            method517((byte) -105);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([BBZ)Ljava/lang/Object;")
    public static final Object method518(byte[] arg0, byte arg1, boolean arg2) {
        field1458++;
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class83.field2036) {
            try {
                class41 var3 = (class41) Class.forName("ff").getDeclaredConstructor().newInstance();
                var3.method314(arg0, 9896);
                return var3;
            } catch (Throwable var4) {
                class83.field2036 = true;
            }
        }
        if (arg1 != 78) {
            method516(true);
        }
        return arg2 ? class49.method352(arg0, arg1 ^ 0x4E) : arg0;
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(Z)V")
    public final void method519(boolean arg0) {
        field1480++;
        int var2 = this.field1457;
        if (!arg0) {
            this.field1454 = null;
        }
        class36 var3 = this.field1461.method269(-1);
        if (var3 == null) {
            this.field1460 = 0;
            this.field1479 = null;
            this.field1457 = -1;
            this.field1467 = 0;
            this.field1469 = 0;
        } else {
            this.field1467 = var3.field760;
            this.field1479 = var3.field768;
            this.field1469 = var3.field783;
            this.field1457 = var3.field792;
            this.field1460 = var3.field800 * 128;
        }
        if (this.field1457 != var2 && this.field1478 != null) {
            class60.field1490.method1080(this.field1478);
            this.field1478 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method520(byte arg0, Component arg1) {
        arg1.removeKeyListener(class107.field2598);
        int var2 = -9 / ((-arg0 - 45) / 44);
        field1474++;
        arg1.removeFocusListener(class107.field2598);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lmb;ILmb;Lsd;IZ)V")
    public static final void method521(class84 arg0, int arg1, class84 arg2, class122 arg3, int arg4, boolean arg5) {
        field1471++;
        if (arg1 != 0) {
            method516(true);
        }
        int var6 = arg3.method997(49, arg0);
        int var7 = arg3.method1004(false, arg2, var6);
        class76.method653(arg3, var6, arg5, arg4, var7, (byte) 95);
    }
}
