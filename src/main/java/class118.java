import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class118 {

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public int field1500;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public int field1504;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "Ljw;")
    public static class259 field1502 = new class259(13, 3);

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "Lsj;")
    public static class666 field1507 = new class666();

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "J")
    public static long field1511 = -1L;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "F")
    public static float field1508;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public int field1501;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public int field1503;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public int field1506;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "Lfk;")
    public class118 field1499;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "Lq;")
    public class487 field1494;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "Lmg;")
    public static class695 field1510;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IB)Lfk;", line = 9)
    public final class118 method687(int arg0, byte arg1) {
        if (arg1 >= -82) {
            this.method687(-37, (byte) -120);
        }
        field1505++;
        return new class118(this.field1500, arg0);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V", line = 21)
    public static void method688(byte arg0) {
        field1502 = null;
        field1507 = null;
        field1510 = null;
        if (arg0 <= 108) {
            field1502 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)V", line = 35)
    public static final void method689(byte arg0) {
        for (class501 var1 = (class501) class217.field2853.method1303(0); var1 != null; var1 = (class501) class217.field2853.method1303(0)) {
            class538.method3026(var1, 1);
        }
        field1495++;
        if (arg0 >= -60) {
            return;
        }
        int var2;
        int var3;
        if (class602.field8408.method3554(class618.field8566, (byte) -118)) {
            var2 = 3;
            var3 = 0;
        } else {
            var2 = class32.field454;
            var3 = class32.field454;
        }
        client.method3852();
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method3863();
            client.method3851(var4);
            client.method3857(var4);
        }
        client.method3856();
        client.method3853();
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(B)Lvi;", line = 78)
    public final class632 method690(byte arg0) {
        if (arg0 < 69) {
            method691(124, 27, -95, 61, (byte) -76, -37, 32);
        }
        field1496++;
        return class627.method3477(this.field1500, 0);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIBII)V", line = 90)
    public static final void method691(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field1498++;
        for (class33 var7 = (class33) class110.field1298.method1298((byte) 40); var7 != null; var7 = (class33) class110.field1298.method1305((byte) -112)) {
            if (var7.field464 <= class327.field4404) {
                var7.method3499(12151);
            } else {
                class418.method2365(var7.field463, arg3 >> 1, arg5, var7.field458 * 2, arg0, arg1 >> 1, -12139, (var7.field466 << 9) + 256, (var7.field462 << 9) + 256);
                class622.field8625.method2323(37, 0, class289.field3821[0] + arg2, var7.field459 | 0xFF000000, var7.field467, class289.field3821[1] + arg6);
            }
        }
        int var8 = -60 / ((arg4 + 13) / 59);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;I)[B", line = 119)
    public static final byte[] method692(String arg0, int arg1) {
        field1497++;
        if (arg1 != -733) {
            return null;
        }
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(II)V", line = 256)
    public class118(int arg0, int arg1) {
        this.field1500 = arg0;
        this.field1504 = arg1;
    }
}
