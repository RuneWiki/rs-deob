import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class231 {

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "[I")
    private int[] field3676;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "[I")
    public static int[] field3673 = new int[14];

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field3677 = 0;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3672 = "glow1:";

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "Z")
    public static boolean field3681 = true;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "Lak;")
    public static class172 field3683;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)V", line = 5)
    public static final void method1636(int arg0, byte arg1) {
        field3675++;
        int var2 = -21 % ((-arg1 - 91) / 32);
        if (arg0 >= 0 && class258.field4142.length > arg0) {
            class258.field4142[arg0] = !class258.field4142[arg0];
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V", line = 24)
    public static void method1637(int arg0) {
        field3673 = null;
        field3672 = null;
        if (arg0 != 8225) {
            method1640(80, (char) 65498);
        }
        field3683 = null;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V", line = 41)
    public static final void method1638(int arg0) {
        field3678++;
        class194.field3175.method2375(30, 0);
        class146.field2270++;
        if (arg0 <= 6) {
            method1637(-91);
        }
        for (class90 var1 = (class90) class243.field3842.method458((byte) -16); var1 != null; var1 = (class90) class243.field3842.method455((byte) 95)) {
            if (var1.field1247 == 0) {
                class58.method374(var1, true, (byte) 103);
            }
        }
        if (class52.field740 != null) {
            class320.method2252(class52.field740, 0);
            class52.field740 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "([I)V", line = 70)
    public class231(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field3676 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field3676[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field3676[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field3676[var5 + var5] = arg0[var4];
            this.field3676[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)I", line = 107)
    public final int method1639(int arg0, int arg1) {
        field3680++;
        int var3 = 37 % ((arg1 - 83) / 33);
        int var4 = (this.field3676.length >> 1) - 1;
        int var5 = var4 & arg0;
        while (true) {
            int var6 = this.field3676[var5 + var5 + 1];
            if (var6 == -1) {
                return -1;
            }
            if (this.field3676[var5 + var5] == arg0) {
                return var6;
            }
            var5 = var4 & var5 + 1;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IC)B", line = 138)
    public static final byte method1640(int arg0, char arg1) {
        if (arg0 >= -94) {
            return -18;
        }
        field3679++;
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

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)V", line = 272)
    public static final void method1641(int arg0) {
        class62.field909.method707(0);
        field3682++;
        if (arg0 > -48) {
            field3677 = -127;
        }
    }
}
