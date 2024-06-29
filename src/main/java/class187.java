import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class187 extends class405 {

    @OriginalMember(owner = "client!na", name = "k", descriptor = "[I")
    public int[] field2803;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "[I")
    public int[] field2805;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field2801 = 0;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "Lrc;")
    public static class108 field2800 = new class108(4, 3);

    @OriginalMember(owner = "client!na", name = "j", descriptor = "Z")
    public static boolean field2802 = false;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
    public static final void method1321(String arg0, boolean arg1, int arg2) {
        field2806++;
        class334 var3 = class352.method2172(arg2, 2, 16711935);
        var3.method2104(0);
        var3.field4645 = arg0;
        if (!arg1) {
            method1324((byte) -44, 'A');
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
    public static void method1322(int arg0) {
        field2800 = null;
        if (arg0 != -8225) {
            field2802 = true;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IBIIIFZII)[[I")
    public static final int[][] method1323(int arg0, byte arg1, int arg2, int arg3, int arg4, float arg5, boolean arg6, int arg7, int arg8) {
        field2799++;
        int[][] var9 = new int[arg3][arg0];
        class15 var10 = new class15();
        var10.field142 = arg2;
        var10.field127 = (int) (arg5 * 4096.0F);
        var10.field135 = arg4;
        var10.field134 = arg7;
        var10.field138 = arg6;
        var10.method95(-8);
        class168.method1219(arg0, arg3, (byte) -12);
        int var11 = 0;
        if (arg1 > -80) {
            method1321((String) null, true, 99);
        }
        while (var11 < arg3) {
            var10.method91(var9[var11], var11, -31157);
            var11++;
        }
        return var9;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BC)B")
    public static final byte method1324(byte arg0, char arg1) {
        if (arg0 != 110) {
            field2802 = false;
        }
        field2804++;
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

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(II[I[I)V")
    public class187(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field2803 = arg2;
        this.field2805 = arg3;
    }
}
