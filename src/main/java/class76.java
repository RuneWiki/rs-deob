import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class76 extends class264 {

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    public int field964;

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "Z")
    public boolean field973;

    @OriginalMember(owner = "client!sj", name = "E", descriptor = "I")
    public int field976;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "I")
    public int field962;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
    public int field965;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
    public int field963;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "Z")
    public static boolean field961 = false;

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "Z")
    public static boolean field968 = false;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
    public static int field966 = 0;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "Z")
    public static boolean field969 = true;

    @OriginalMember(owner = "client!sj", name = "D", descriptor = "Lbn;")
    public static class160 field975 = new class160(80, 7);

    @OriginalMember(owner = "client!sj", name = "F", descriptor = "I")
    public static int field977 = 0;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!sj", name = "C", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "[[B")
    public static byte[][] field972;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([J[IB)V")
    public static final void method532(long[] arg0, int[] arg1, byte arg2) {
        class271.method1857(arg0, arg0.length - 1, arg1, 0, 13973);
        if (arg2 > 104) {
            field974++;
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)V")
    public static void method533(byte arg0) {
        if (arg0 != 63) {
            field975 = null;
        }
        field972 = null;
        field975 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lat;Ljava/lang/String;I)I")
    public static final int method534(class256 arg0, String arg1, int arg2) {
        field970++;
        int var3 = arg0.field3762;
        byte[] var4 = method535((byte) 121, arg1);
        arg0.method1765(var4.length, (byte) 64);
        if (arg2 < 10) {
            method534((class256) null, (String) null, 20);
        }
        arg0.field3762 += class36.field518.method2688(arg0.field3762, var4, 0, (byte) 51, var4.length, arg0.field3764);
        return arg0.field3762 - var3;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLjava/lang/String;)[B")
    private static final byte[] method535(byte arg0, String arg1) {
        field967++;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        int var4 = 21 / ((arg0 - 81) / 40);
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg1.charAt(var5);
            if (var6 > '\u0000' && var6 < '\u0080' || var6 >= ' ' && var6 <= 'ÿ') {
                var3[var5] = (byte) var6;
            } else if (var6 == '€') {
                var3[var5] = -128;
            } else if (var6 == '‚') {
                var3[var5] = -126;
            } else if (var6 == 'ƒ') {
                var3[var5] = -125;
            } else if (var6 == '„') {
                var3[var5] = -124;
            } else if (var6 == '…') {
                var3[var5] = -123;
            } else if (var6 == '†') {
                var3[var5] = -122;
            } else if (var6 == '‡') {
                var3[var5] = -121;
            } else if (var6 == 'ˆ') {
                var3[var5] = -120;
            } else if (var6 == '‰') {
                var3[var5] = -119;
            } else if (var6 == 'Š') {
                var3[var5] = -118;
            } else if (var6 == '‹') {
                var3[var5] = -117;
            } else if (var6 == 'Œ') {
                var3[var5] = -116;
            } else if (var6 == 'Ž') {
                var3[var5] = -114;
            } else if (var6 == '‘') {
                var3[var5] = -111;
            } else if (var6 == '’') {
                var3[var5] = -110;
            } else if (var6 == '“') {
                var3[var5] = -109;
            } else if (var6 == '”') {
                var3[var5] = -108;
            } else if (var6 == '•') {
                var3[var5] = -107;
            } else if (var6 == '–') {
                var3[var5] = -106;
            } else if (var6 == '—') {
                var3[var5] = -105;
            } else if (var6 == '˜') {
                var3[var5] = -104;
            } else if (var6 == '™') {
                var3[var5] = -103;
            } else if (var6 == 'š') {
                var3[var5] = -102;
            } else if (var6 == '›') {
                var3[var5] = -101;
            } else if (var6 == 'œ') {
                var3[var5] = -100;
            } else if (var6 == 'ž') {
                var3[var5] = -98;
            } else if (var6 == 'Ÿ') {
                var3[var5] = -97;
            } else {
                var3[var5] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZLjava/lang/String;ZLdf;)V")
    public static final void method536(boolean arg0, String arg1, boolean arg2, class85 arg3) {
        field971++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        if (arg2) {
            field975 = null;
        }
        int var7 = class328.field4885.method2328(250, arg1, (class285[]) null, (byte) -56);
        int var8 = class328.field4885.method2325(arg1, (class285[]) null, 250, (byte) 27) * 13;
        class74.field942.method164(var5 - var4, -var4 + var6, var4 + var4 + var7, var4 + var8 + var4, -16777216, 0);
        class74.field942.method156(var5 - var4, var6 - var4, var4 + var7 + var4, var4 + var8 + var4, -1, 0);
        arg3.method567(-1, var6, 0, 0, 1, (int[]) null, true, -1, 0, (class285[]) null, var5, var7, (class195) null, var8, arg1, 1);
        class3.method23(var6 - var4, var5 - var4, var4 + var8 + var4, var4 + var4 + var7, 255);
        if (arg0) {
            class74.field942.method158();
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(IIIIIZ)V")
    public class76(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field964 = arg1;
        this.field973 = arg5;
        this.field976 = arg0;
        this.field962 = arg4;
        this.field965 = arg2;
        this.field963 = arg3;
    }
}
