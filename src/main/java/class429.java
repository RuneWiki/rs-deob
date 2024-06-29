import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class429 {

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "B")
    public byte field6363 = 0;

    @OriginalMember(owner = "client!iq", name = "l", descriptor = "S")
    public short field6372;

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "B")
    public byte field6374;

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "B")
    public byte field6368;

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "S")
    public short field6375;

    @OriginalMember(owner = "client!iq", name = "r", descriptor = "Lef;")
    public static class335 field6378 = new class335(8, 0, 4, 1);

    @OriginalMember(owner = "client!iq", name = "A", descriptor = "Z")
    public static boolean field6387 = true;

    @OriginalMember(owner = "client!iq", name = "z", descriptor = "Liv;")
    public static class64 field6386 = new class64(90, -2);

    @OriginalMember(owner = "client!iq", name = "D", descriptor = "Lan;")
    public static class20 field6390 = new class20(8);

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "B")
    public byte field6369;

    @OriginalMember(owner = "client!iq", name = "m", descriptor = "B")
    public byte field6373;

    @OriginalMember(owner = "client!iq", name = "s", descriptor = "B")
    public byte field6379;

    @OriginalMember(owner = "client!iq", name = "v", descriptor = "B")
    public byte field6382;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "I")
    public static int field6361;

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "I")
    public static int field6362;

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!iq", name = "B", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "Lok;")
    public class166 field6364;

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "Leh;")
    public class241 field6365;

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "Leh;")
    public class241 field6370;

    @OriginalMember(owner = "client!iq", name = "C", descriptor = "Liq;")
    public class429 field6389;

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "Lag;")
    public class480 field6366;

    @OriginalMember(owner = "client!iq", name = "y", descriptor = "Lvm;")
    public class481 field6385;

    @OriginalMember(owner = "client!iq", name = "u", descriptor = "Lsh;")
    public class49 field6381;

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "Lrl;")
    public class506 field6367;

    @OriginalMember(owner = "client!iq", name = "t", descriptor = "Lrl;")
    public class506 field6380;

    @OriginalMember(owner = "client!iq", name = "x", descriptor = "S")
    public short field6384;

    @OriginalMember(owner = "client!iq", name = "k", descriptor = "Z")
    public boolean field6371;

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "Z")
    public boolean field6377;

    @OriginalMember(owner = "client!iq", name = "w", descriptor = "Z")
    public boolean field6383;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
    public static void method2569(int arg0) {
        field6378 = null;
        field6386 = null;
        if (arg0 != 18480) {
            method2570(null, -26);
        }
        field6390 = null;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Len;I)I")
    public static final int method2570(class208 arg0, int arg1) {
        field6361++;
        if (arg1 != -1) {
            field6378 = null;
        }
        String var2 = class170.method1247(arg0, 36096);
        int[] var3 = null;
        if (class2.method27(-45, arg0.field3005)) {
            var3 = class367.field5550.method1312((byte) 91, (int) arg0.field3012).field2126;
        } else if (arg0.field3009 != -1) {
            var3 = class367.field5550.method1312((byte) 91, arg0.field3009).field2126;
        } else if (class164.method1213(arg0.field3005, (byte) -65)) {
            class255 var4 = class34.field668[(int) arg0.field3012];
            if (var4 != null) {
                class42 var5 = var4.field3677;
                if (var5.field797 != null) {
                    var5 = var5.method427(class335.field5059, (byte) -87);
                }
                if (var5 != null) {
                    var3 = var5.field799;
                }
            }
        } else if (class338.method2169(arg0.field3005, 46)) {
            Object var6 = null;
            class79 var7;
            if (arg0.field3005 == 1011) {
                var7 = class319.field4807.method2874((int) arg0.field3012, -17045);
            } else {
                var7 = class319.field4807.method2874((int) (arg0.field3012 >>> 32 & 0x7FFFFFFFL), -17045);
            }
            if (var7.field1370 != null) {
                var7 = var7.method631(arg1 ^ 0xFFFFE651, class335.field5059);
            }
            if (var7 != null) {
                var3 = var7.field1374;
            }
        }
        if (var3 != null) {
            var2 = var2 + class58.method517(var3, 110);
        }
        int var8 = class501.field7392.method2133((byte) 78, class11.field186, var2);
        if (arg0.field3004) {
            var8 += class377.field5711.method96() + 4;
        }
        return var8;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)V")
    public final void method2571(int arg0) {
        if (arg0 != -1012) {
            return;
        }
        while (this.field6364 != null) {
            class166 var2 = this.field6364.field2572;
            this.field6364.method1226(0);
            this.field6364 = var2;
        }
        field6388++;
        this.field6363 = 0;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IC)B")
    public static final byte method2572(int arg0, char arg1) {
        field6376++;
        if (arg0 != -10707) {
            return 113;
        }
        byte var2;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(III)V")
    public class429(int arg0, int arg1, int arg2) {
        this.field6372 = (short) arg2;
        this.field6368 = this.field6374 = (byte) arg0;
        this.field6375 = (short) arg1;
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)V")
    public static final void method2573(int arg0) {
        class363.field5500 = 0;
        if (arg0 != 338) {
            field6387 = false;
        }
        field6362++;
        class339.field5122.method2419((byte) 126);
        class197.field2903 = false;
    }
}
