import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class466 extends class430 implements class462 {

    @OriginalMember(owner = "client!taa", name = "h", descriptor = "Z")
    public static boolean field6631 = false;

    @OriginalMember(owner = "client!taa", name = "p", descriptor = "Llc;")
    public static class435 field6639 = new class435(62, -1);

    @OriginalMember(owner = "client!taa", name = "t", descriptor = "Lmr;")
    public static class611 field6643 = new class611();

    @OriginalMember(owner = "client!taa", name = "r", descriptor = "C")
    public char field6641;

    @OriginalMember(owner = "client!taa", name = "u", descriptor = "F")
    public static float field6644;

    @OriginalMember(owner = "client!taa", name = "g", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!taa", name = "i", descriptor = "I")
    public static int field6632;

    @OriginalMember(owner = "client!taa", name = "j", descriptor = "I")
    public int field6633;

    @OriginalMember(owner = "client!taa", name = "k", descriptor = "I")
    public int field6634;

    @OriginalMember(owner = "client!taa", name = "l", descriptor = "I")
    public static int field6635;

    @OriginalMember(owner = "client!taa", name = "m", descriptor = "I")
    public static int field6636;

    @OriginalMember(owner = "client!taa", name = "n", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!taa", name = "q", descriptor = "I")
    public static int field6640;

    @OriginalMember(owner = "client!taa", name = "s", descriptor = "I")
    public int field6642;

    @OriginalMember(owner = "client!taa", name = "o", descriptor = "J")
    public long field6638;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(Ljava/lang/String;I)[B")
    public static final byte[] method2819(String arg0, int arg1) {
        field6632++;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        if (arg1 != -129) {
            return null;
        }
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

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(B)I")
    public final int method2800(byte arg0) {
        if (arg0 != -110) {
            field6644 = -0.39182213F;
        }
        field6636++;
        return this.field6633;
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(I)C")
    public final char method2802(int arg0) {
        field6640++;
        if (arg0 != -17007) {
            method2819(null, -107);
        }
        return this.field6641;
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(B)I")
    public final int method2803(byte arg0) {
        int var2 = -76 / ((arg0 + 61) / 53);
        field6635++;
        return this.field6642;
    }

    @OriginalMember(owner = "client!taa", name = "d", descriptor = "(B)V")
    public static void method2820(byte arg0) {
        field6643 = null;
        field6639 = null;
        if (arg0 != -128) {
            field6639 = null;
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)J")
    public final long method2801(int arg0) {
        field6637++;
        if (arg0 != 8458) {
            field6644 = 0.57188046F;
        }
        return this.field6638;
    }

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "(I)I")
    public final int method2804(int arg0) {
        if (arg0 != -10523) {
            this.method2804(-50);
        }
        field6630++;
        return this.field6634;
    }
}
