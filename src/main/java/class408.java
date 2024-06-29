import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class408 extends class184 {

    @OriginalMember(owner = "client!we", name = "m", descriptor = "Lqe;")
    public static class469 field6151 = new class469(2, -1);

    @OriginalMember(owner = "client!we", name = "x", descriptor = "[I")
    public static int[] field6162 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field6152;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public static int field6153;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public static int field6158;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    public static int field6159;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "J")
    public long field6154;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "Lwe;")
    public class408 field6156;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "Lwe;")
    public class408 field6157;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "[Z")
    public static boolean[] field6161;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;Z)[B", line = 12)
    public static final byte[] method2593(String arg0, boolean arg1) {
        field6152++;
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
        if (!arg1) {
            method2596((byte) -1, (byte) 14);
        }
        return var3;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V", line = 151)
    public static void method2594(byte arg0) {
        field6151 = null;
        field6162 = null;
        field6161 = null;
        if (arg0 != 50) {
            field6162 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)Z", line = 165)
    public final boolean method2595(int arg0) {
        field6153++;
        if (this.field6157 == null) {
            return false;
        } else {
            if (arg0 < 63) {
                field6162 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BB)V", line = 181)
    public static final void method2596(byte arg0, byte arg1) {
        if (class238.field3469 == null) {
            class238.field3469 = new byte[4][class194.field2946][class255.field3656];
        }
        field6155++;
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class194.field2946; var3++) {
                for (int var4 = 0; var4 < class255.field3656; var4++) {
                    class238.field3469[var2][var3][var4] = arg0;
                }
            }
        }
        if (arg1 >= -25) {
            field6161 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V", line = 217)
    public final void method2597(int arg0) {
        field6159++;
        if (this.field6157 == null) {
            return;
        }
        this.field6157.field6156 = this.field6156;
        this.field6156.field6157 = this.field6157;
        this.field6156 = null;
        int var2 = -92 / ((15 - arg0) / 52);
        this.field6157 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V", line = 238)
    public static final void method2598(int arg0, int arg1) {
        int var2 = -1 % ((-arg1 - 65) / 34);
        field6160++;
        class150 var3 = class676.method3885(1000, 2, arg0);
        var3.method1115(true);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjava/awt/Canvas;)V", line = 254)
    public static final void method2599(int arg0, Canvas arg1) {
        field6158++;
        Dimension var2 = arg1.getSize();
        class74.method624(var2.width, var2.height, 46);
        if (~class22.field234 == arg0) {
            class502.field7152.method455(arg1, class519.field7421, class589.field8349);
        } else {
            class502.field7152.method455(arg1, class443.field6590, class164.field2604);
        }
    }
}
