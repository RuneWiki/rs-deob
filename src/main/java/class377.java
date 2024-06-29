import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class377 {

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public int field5580;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "S")
    public short field5583;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public int field5572;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public int field5573;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "S")
    public short field5584;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public int field5571;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "S")
    public short field5575;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public int field5582;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "B")
    public byte field5577;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "Z")
    public boolean field5578;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "B")
    public byte field5576;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "Lbg;")
    public static class324 field5579 = new class324(48, 3);

    @OriginalMember(owner = "client!j", name = "o", descriptor = "I")
    public static int field5585 = 0;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "Lgk;")
    public static class331 field5586 = new class331("M", "M", "M", "M");

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "Lva;")
    public static class342 field5588;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "[I")
    public static int[] field5587;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/lang/String;IIII[B)I")
    public static final int method2312(String arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field5581++;
        int var6 = arg2 - arg1;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg0.charAt(arg1 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg5[arg3 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg5[arg3 + var7] = -128;
            } else if (var8 == '‚') {
                arg5[arg3 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg5[arg3 + var7] = -125;
            } else if (var8 == '„') {
                arg5[arg3 + var7] = -124;
            } else if (var8 == '…') {
                arg5[arg3 + var7] = -123;
            } else if (var8 == '†') {
                arg5[arg3 + var7] = -122;
            } else if (var8 == '‡') {
                arg5[arg3 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg5[arg3 + var7] = -120;
            } else if (var8 == '‰') {
                arg5[arg3 + var7] = -119;
            } else if (var8 == 'Š') {
                arg5[arg3 + var7] = -118;
            } else if (var8 == '‹') {
                arg5[arg3 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg5[arg3 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg5[arg3 + var7] = -114;
            } else if (var8 == '‘') {
                arg5[arg3 + var7] = -111;
            } else if (var8 == '’') {
                arg5[arg3 + var7] = -110;
            } else if (var8 == '“') {
                arg5[arg3 + var7] = -109;
            } else if (var8 == '”') {
                arg5[arg3 + var7] = -108;
            } else if (var8 == '•') {
                arg5[arg3 + var7] = -107;
            } else if (var8 == '–') {
                arg5[arg3 + var7] = -106;
            } else if (var8 == '—') {
                arg5[arg3 + var7] = -105;
            } else if (var8 == '˜') {
                arg5[arg3 + var7] = -104;
            } else if (var8 == '™') {
                arg5[arg3 + var7] = -103;
            } else if (var8 == 'š') {
                arg5[arg3 + var7] = -102;
            } else if (var8 == '›') {
                arg5[arg3 + var7] = -101;
            } else if (var8 == 'œ') {
                arg5[arg3 + var7] = -100;
            } else if (var8 == 'ž') {
                arg5[arg3 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg5[arg3 + var7] = -97;
            } else {
                arg5[arg3 + var7] = 63;
            }
        }
        if (arg4 >= -37) {
            method2312(null, -8, -68, -120, 58, null);
        }
        return var6;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
    public static void method2313(byte arg0) {
        field5587 = null;
        field5588 = null;
        field5586 = null;
        field5579 = null;
        if (arg0 >= -26) {
            method2313((byte) -101);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)Z")
    public static final boolean method2314(int arg0, int arg1) {
        field5574++;
        if (arg1 >= -47) {
            method2312(null, 1, 62, -45, 56, null);
        }
        return arg0 == 2 || arg0 == 3;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field5580 = arg1;
        this.field5583 = (short) arg4;
        this.field5572 = arg3;
        this.field5573 = arg11;
        this.field5584 = (short) arg6;
        this.field5571 = arg0;
        this.field5575 = (short) arg5;
        this.field5582 = arg2;
        this.field5577 = (byte) arg7;
        this.field5578 = arg10;
        this.field5576 = (byte) arg8;
    }

    static {
        new class523("", 73);
    }
}
