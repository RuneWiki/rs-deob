import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class324 implements class226 {

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "Lbba;")
    private class99 field4751;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "Lqfa;")
    public static class85 field4756 = new class85(82, 6);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Lom;")
    public static class344 field4757;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
    public final void method1400(byte arg0) {
        field4752++;
        if (arg0 != -10) {
            this.method1400((byte) 4);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZZ)V")
    public final void method1432(boolean arg0, boolean arg1) {
        if (arg0) {
            class623.field9017.method4(0, 0, class506.field7173, class310.field4626, this.field4751.field1770, 0);
        }
        if (arg1) {
            field4755 = 9;
        }
        field4750++;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)Z")
    public final boolean method1398(byte arg0) {
        if (arg0 < 112) {
            this.method1432(false, false);
        }
        field4754++;
        return true;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III[BLjava/lang/String;I)I")
    public static final int method2096(int arg0, int arg1, int arg2, byte[] arg3, String arg4, int arg5) {
        if (arg0 > -38) {
            return 118;
        }
        field4753++;
        int var6 = arg5 - arg1;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg4.charAt(arg1 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg3[arg2 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg3[arg2 + var7] = -128;
            } else if (var8 == '‚') {
                arg3[arg2 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg3[arg2 + var7] = -125;
            } else if (var8 == '„') {
                arg3[arg2 + var7] = -124;
            } else if (var8 == '…') {
                arg3[arg2 + var7] = -123;
            } else if (var8 == '†') {
                arg3[arg2 + var7] = -122;
            } else if (var8 == '‡') {
                arg3[arg2 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg3[arg2 + var7] = -120;
            } else if (var8 == '‰') {
                arg3[arg2 + var7] = -119;
            } else if (var8 == 'Š') {
                arg3[arg2 + var7] = -118;
            } else if (var8 == '‹') {
                arg3[arg2 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg3[arg2 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg3[arg2 + var7] = -114;
            } else if (var8 == '‘') {
                arg3[arg2 + var7] = -111;
            } else if (var8 == '’') {
                arg3[arg2 + var7] = -110;
            } else if (var8 == '“') {
                arg3[arg2 + var7] = -109;
            } else if (var8 == '”') {
                arg3[arg2 + var7] = -108;
            } else if (var8 == '•') {
                arg3[arg2 + var7] = -107;
            } else if (var8 == '–') {
                arg3[arg2 + var7] = -106;
            } else if (var8 == '—') {
                arg3[arg2 + var7] = -105;
            } else if (var8 == '˜') {
                arg3[arg2 + var7] = -104;
            } else if (var8 == '™') {
                arg3[arg2 + var7] = -103;
            } else if (var8 == 'š') {
                arg3[arg2 + var7] = -102;
            } else if (var8 == '›') {
                arg3[arg2 + var7] = -101;
            } else if (var8 == 'œ') {
                arg3[arg2 + var7] = -100;
            } else if (var8 == 'ž') {
                arg3[arg2 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg3[arg2 + var7] = -97;
            } else {
                arg3[arg2 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V")
    public static void method2097(boolean arg0) {
        field4757 = null;
        if (!arg0) {
            field4755 = -28;
        }
        field4756 = null;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lbba;)V")
    public class324(class99 arg0) {
        this.field4751 = arg0;
    }
}
