import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class4 extends class476 {

    @OriginalMember(owner = "client!er", name = "B", descriptor = "Z")
    public static boolean field61 = false;

    @OriginalMember(owner = "client!er", name = "G", descriptor = "Lhi;")
    public static class45 field66 = new class45(63, 2);

    @OriginalMember(owner = "client!er", name = "K", descriptor = "[B")
    public static byte[] field70 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!er", name = "i", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!er", name = "j", descriptor = "I")
    public int field43;

    @OriginalMember(owner = "client!er", name = "k", descriptor = "I")
    public int field44;

    @OriginalMember(owner = "client!er", name = "l", descriptor = "I")
    public int field45;

    @OriginalMember(owner = "client!er", name = "m", descriptor = "I")
    public int field46;

    @OriginalMember(owner = "client!er", name = "n", descriptor = "I")
    public int field47;

    @OriginalMember(owner = "client!er", name = "o", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!er", name = "q", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!er", name = "r", descriptor = "I")
    public int field51;

    @OriginalMember(owner = "client!er", name = "s", descriptor = "I")
    public int field52;

    @OriginalMember(owner = "client!er", name = "t", descriptor = "I")
    public int field53;

    @OriginalMember(owner = "client!er", name = "u", descriptor = "I")
    public int field54;

    @OriginalMember(owner = "client!er", name = "v", descriptor = "I")
    public int field55;

    @OriginalMember(owner = "client!er", name = "w", descriptor = "I")
    public int field56;

    @OriginalMember(owner = "client!er", name = "x", descriptor = "I")
    public int field57;

    @OriginalMember(owner = "client!er", name = "y", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!er", name = "z", descriptor = "I")
    public int field59;

    @OriginalMember(owner = "client!er", name = "A", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!er", name = "C", descriptor = "I")
    public int field62;

    @OriginalMember(owner = "client!er", name = "D", descriptor = "I")
    public int field63;

    @OriginalMember(owner = "client!er", name = "H", descriptor = "I")
    public int field67;

    @OriginalMember(owner = "client!er", name = "L", descriptor = "I")
    public int field71;

    @OriginalMember(owner = "client!er", name = "F", descriptor = "Lhe;")
    public class174 field65;

    @OriginalMember(owner = "client!er", name = "E", descriptor = "Lsd;")
    public class264 field64;

    @OriginalMember(owner = "client!er", name = "p", descriptor = "Lhm;")
    public class380 field49;

    @OriginalMember(owner = "client!er", name = "J", descriptor = "Les;")
    public class477 field69;

    @OriginalMember(owner = "client!er", name = "I", descriptor = "[[S")
    public static short[][] field68;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V")
    public static void method25(int arg0) {
        field66 = null;
        if (arg0 == 7428) {
            field68 = null;
            field70 = null;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIBI)V")
    public static final void method26(int arg0, int arg1, byte arg2, int arg3) {
        field50++;
        int var4 = class110.field1775 + arg1;
        int var5 = class399.field5727 + arg0;
        if (class103.field1632 == null || arg1 < 0 || arg0 < 0 || arg1 >= class9.field111 || class192.field2809 <= arg0) {
            return;
        }
        long var6 = (long) (var5 << 14 | arg3 << 28 | var4);
        class292 var8 = (class292) class484.field6966.method1592((byte) -25, var6);
        if (var8 == null) {
            class374.method2240(arg3, arg1, arg0);
            return;
        }
        class170 var9 = (class170) var8.field3957.method3137(arg2);
        if (var9 == null) {
            class374.method2240(arg3, arg1, arg0);
            return;
        }
        class222 var10 = (class222) class374.method2240(arg3, arg1, arg0);
        if (var10 == null) {
            var10 = new class222();
        } else {
            var10.field3128 = var10.field3135 = -1;
        }
        var10.field3142 = var9.field2586;
        var10.field3137 = var9.field2589;
        label51: while (true) {
            class170 var11 = (class170) var8.field3957.method3132(0);
            if (var11 == null) {
                break;
            }
            if (var10.field3142 != var11.field2586) {
                var10.field3128 = var11.field2586;
                var10.field3130 = var11.field2589;
                while (true) {
                    class170 var12 = (class170) var8.field3957.method3132(arg2);
                    if (var12 == null) {
                        break label51;
                    }
                    if (var10.field3142 != var12.field2586 && var10.field3128 != var12.field2586) {
                        var10.field3132 = var12.field2589;
                        var10.field3135 = var12.field2586;
                    }
                }
            }
        }
        if (arg2 == 0) {
            int var13 = class123.method893((arg0 << 7) + 64, (arg1 << 7) + 64, (byte) -13, arg3);
            class24.method147(arg3, arg1, arg0, var13, var10);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method27(int arg0, byte[] arg1) {
        field58++;
        int var2 = 16 % ((arg0 + 22) / 34);
        if (arg1 == null) {
            return null;
        } else {
            byte[] var3 = new byte[arg1.length];
            class57.method372(arg1, 0, var3, 0, arg1.length);
            return var3;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(III)Z")
    public static final boolean method28(int arg0, int arg1, int arg2) {
        if (arg1 != -20179) {
            method27(-88, null);
        }
        field42++;
        return (arg0 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(B)V")
    public final void method29(byte arg0) {
        this.field69 = null;
        if (arg0 != 121) {
            field66 = null;
        }
        this.field65 = null;
        field48++;
        this.field64 = null;
        this.field49 = null;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IZJLjava/lang/String;)V")
    public static final void method30(int arg0, boolean arg1, long arg2, String arg3) {
        field60++;
        if (arg1) {
            class340.method2064(1);
            if (class154.field2375.equals("")) {
                class49.field703 = 39;
                return;
            }
        }
        class319 var5 = new class319(128);
        var5.method1891(false, 10);
        var5.method1857(561746448, (int) (Math.random() * 65535.0D));
        var5.method1859((byte) -128, arg2);
        var5.method1857(561746448, class387.field5536);
        var5.method1858((int) (Math.random() * 9.9999999E7D), (byte) -125);
        int var6 = -77 / ((arg0 - 9) / 49);
        var5.method1879(32767, arg3);
        var5.method1858((int) (Math.random() * 9.9999999E7D), (byte) -67);
        if (arg1) {
            var5.method1859((byte) -115, class329.method1942(false, class154.field2375));
            try {
                var5.method1859((byte) -127, Long.parseLong(class84.field1291));
            } catch (Exception var7) {
                class49.field703 = 39;
                return;
            }
        } else {
            var5.method1858((int) (Math.random() * 9.9999999E7D), (byte) -39);
            var5.method1858((int) (Math.random() * 9.9999999E7D), (byte) -83);
            var5.method1858((int) (Math.random() * 9.9999999E7D), (byte) -97);
            var5.method1858((int) (Math.random() * 9.9999999E7D), (byte) -120);
        }
        var5.method1858((int) (Math.random() * 9.9999999E7D), (byte) -41);
        var5.method1864(false, class515.field7540, class98.field1561);
        class17.field275.field4360 = 0;
        class17.field275.method1891(false, arg1 ? class88.field1440.field2102 : class88.field1437.field2102);
        class17.field275.method1857(561746448, var5.field4360 + 28);
        class17.field275.method1857(561746448, 599);
        class17.field275.method1891(false, class486.field6998);
        class17.field275.method1891(false, class152.field2343.field134);
        class234.method1431(class17.field275, 0);
        class17.field275.method1885(var5.field4360, 0, false, var5.field4336);
        class49.field703 = -3;
        class92.field1489 = 0;
        class221.field3126 = 0;
        class196.field2876 = 1;
    }
}
