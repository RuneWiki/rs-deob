import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class520 {

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "[[S")
    public static short[][] field7415 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "F")
    public static float field7416;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "I")
    public static int field7411;

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "I")
    public static int field7412;

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "I")
    public static int field7413;

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "Lkda;")
    public static class328 field7414;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(BLjava/lang/String;)V", line = 7)
    public static final void method3073(byte arg0, String arg1) {
        field7413++;
        if (arg1 == null) {
            return;
        }
        if (!(class304.field4180 < 100 || class100.field1459) || class304.field4180 >= 200) {
            class568.method3389(-113, class77.field1021.method3408(126, class63.field795));
            return;
        }
        String var2 = class533.method3214(-1, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class304.field4180; var3++) {
            String var8 = class533.method3214(-1, class538.field8010[var3]);
            if (var8 != null && var8.equals(var2)) {
                class568.method3389(85, arg1 + class430.field5770.method3408(114, class63.field795));
                return;
            }
            if (class349.field4781[var3] != null) {
                String var9 = class533.method3214(-1, class349.field4781[var3]);
                if (var9 != null && var9.equals(var2)) {
                    class568.method3389(81, arg1 + class430.field5770.method3408(80, class63.field795));
                    return;
                }
            }
        }
        int var4 = 72 % ((37 - arg0) / 52);
        for (int var5 = 0; var5 < class33.field402; var5++) {
            String var6 = class533.method3214(-1, class470.field6634[var5]);
            if (var6 != null && var6.equals(var2)) {
                class568.method3389(-116, class367.field5073.method3408(112, class63.field795) + arg1 + class526.field7528.method3408(113, class63.field795));
                return;
            }
            if (class59.field744[var5] != null) {
                String var7 = class533.method3214(-1, class59.field744[var5]);
                if (var7 != null && var7.equals(var2)) {
                    class568.method3389(-115, class367.field5073.method3408(79, class63.field795) + arg1 + class526.field7528.method3408(107, class63.field795));
                    return;
                }
            }
        }
        if (class533.method3214(-1, class541.field8119.field5138).equals(var2)) {
            class568.method3389(-105, class2.field9.method3408(84, class63.field795));
        } else {
            class518.field7378++;
            class402.method2367(class104.field1508, (byte) 114);
            class112.field1589.method1049(-1, class539.method3267(arg1, false));
            class112.field1589.method1050((byte) 32, arg1);
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(CZ)B", line = 102)
    public static final byte method3074(char arg0, boolean arg1) {
        if (!arg1) {
            method3074('\u0002', false);
        }
        field7412++;
        byte var2;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V", line = 228)
    public static void method3075(int arg0) {
        field7414 = null;
        field7415 = null;
        int var1 = -61 / ((6 - arg0) / 57);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lvp;I)V", line = 239)
    public static final void method3076(class162 arg0, int arg1) {
        field7411++;
        class162 var2 = class145.method982(arg0, (byte) 9);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class47.field562;
            var4 = class165.field2605;
        } else {
            var3 = var2.field2459;
            var4 = var2.field2527;
        }
        class46.method289(-5, false, var4, arg0, var3);
        if (arg1 < 107) {
            field7414 = null;
        }
        class120.method857(arg0, (byte) -108, var3, var4);
    }
}
