import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class85 extends class665 {

    @OriginalMember(owner = "client!al", name = "s", descriptor = "I")
    public int field1402;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "I")
    public int field1403;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "Z")
    public boolean field1399;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    public int field1394;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    public int field1401;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    public int field1398;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "[Lsk;")
    public static class576[] field1395 = new class576[100];

    @OriginalMember(owner = "client!al", name = "m", descriptor = "[I")
    public static int[] field1396 = new int[1024];

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!al", name = "w", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "Lbga;")
    public static class324 field1405;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III)Z", line = 9)
    public static final boolean method746(int arg0, int arg1, int arg2) {
        if (arg1 < 24) {
            method747((byte) 96);
        }
        field1400++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V", line = 26)
    public static void method747(byte arg0) {
        if (arg0 == -106) {
            field1405 = null;
            field1395 = null;
            field1396 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BIII)V", line = 42)
    public static final void method748(byte arg0, int arg1, int arg2, int arg3) {
        field1397++;
        if (arg0 < 74) {
            method750(null, null, (byte) 103);
        }
        String var4 = "tele " + arg2 + "," + (arg1 >> 6) + "," + (arg3 >> 6) + "," + (arg1 & 0x3F) + "," + (arg3 & 0x3F);
        System.out.println(var4);
        class78.method715(false, 118, var4, true);
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(IIIIIZ)V", line = 61)
    public class85(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field1402 = arg1;
        this.field1403 = arg4;
        this.field1399 = arg5;
        this.field1394 = arg2;
        this.field1401 = arg3;
        this.field1398 = arg0;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 74)
    public static final byte[] method749(int arg0, String arg1) {
        field1404++;
        if (arg0 != 8211) {
            method748((byte) -33, 118, -38, -70);
        }
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
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

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/awt/Canvas;Lfa;B)Lr;", line = 213)
    public static final class166 method750(Canvas arg0, class209 arg1, byte arg2) {
        field1406++;
        if (arg2 != 76) {
            method747((byte) 31);
        }
        return new class214(arg0, arg1);
    }
}
