import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class620 {

    @OriginalMember(owner = "client!kq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8962 = new String[] { method4533(method4532("&BU\u0014Y")), method4533(method4532("6\u001dUy\f")), method4533(method4532("3\u0019\u0017V")), method4533(method4532("6\u001dUx\f")), method4533(method4532("6\u001dU{\f")), method4533(method4532("6\u001dU~\f")) };

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "[I")
    public static int[] field8956 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!kq", name = "k", descriptor = "Leea;")
    public static class140 field8959 = null;

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "Lko;")
    public static class532 field8957 = new class532("", 11);

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "[I")
    public static int[] field8961 = new int[13];

    @OriginalMember(owner = "client!kq", name = "j", descriptor = "I")
    public static int field8952;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
    public static int field8954;

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
    public static int field8955;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
    public static int field8958;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "Lwm;")
    public static class591 field8960;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "Ljava/awt/Font;")
    public static Font field8951;

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "[[B")
    public static byte[][] field8953;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
    public static void method4528(int arg0) {
        try {
            field8959 = null;
            if (arg0 != -17701) {
                method4530(-59, 106, null, null);
            }
            field8951 = null;
            field8960 = null;
            field8956 = null;
            field8957 = null;
            field8961 = null;
            field8953 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8962[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IBILjava/lang/String;I[B)I")
    public static final int method4529(int arg0, byte arg1, int arg2, String arg3, int arg4, byte[] arg5) {
        try {
            field8958++;
            int var6 = arg4 - arg0;
            if (arg1 > -43) {
                field8960 = null;
            }
            for (int var7 = 0; var7 < var6; var7++) {
                char var8 = arg3.charAt(arg0 + var7);
                if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                    arg5[arg2 + var7] = (byte) var8;
                } else if (var8 == '€') {
                    arg5[arg2 + var7] = -128;
                } else if (var8 == '‚') {
                    arg5[arg2 + var7] = -126;
                } else if (var8 == 'ƒ') {
                    arg5[arg2 + var7] = -125;
                } else if (var8 == '„') {
                    arg5[arg2 + var7] = -124;
                } else if (var8 == '…') {
                    arg5[arg2 + var7] = -123;
                } else if (var8 == '†') {
                    arg5[arg2 + var7] = -122;
                } else if (var8 == '‡') {
                    arg5[arg2 + var7] = -121;
                } else if (var8 == 'ˆ') {
                    arg5[arg2 + var7] = -120;
                } else if (var8 == '‰') {
                    arg5[arg2 + var7] = -119;
                } else if (var8 == 'Š') {
                    arg5[arg2 + var7] = -118;
                } else if (var8 == '‹') {
                    arg5[arg2 + var7] = -117;
                } else if (var8 == 'Œ') {
                    arg5[arg2 + var7] = -116;
                } else if (var8 == 'Ž') {
                    arg5[arg2 + var7] = -114;
                } else if (var8 == '‘') {
                    arg5[arg2 + var7] = -111;
                } else if (var8 == '’') {
                    arg5[arg2 + var7] = -110;
                } else if (var8 == '“') {
                    arg5[arg2 + var7] = -109;
                } else if (var8 == '”') {
                    arg5[arg2 + var7] = -108;
                } else if (var8 == '•') {
                    arg5[arg2 + var7] = -107;
                } else if (var8 == '–') {
                    arg5[arg2 + var7] = -106;
                } else if (var8 == '—') {
                    arg5[arg2 + var7] = -105;
                } else if (var8 == '˜') {
                    arg5[arg2 + var7] = -104;
                } else if (var8 == '™') {
                    arg5[arg2 + var7] = -103;
                } else if (var8 == 'š') {
                    arg5[arg2 + var7] = -102;
                } else if (var8 == '›') {
                    arg5[arg2 + var7] = -101;
                } else if (var8 == 'œ') {
                    arg5[arg2 + var7] = -100;
                } else if (var8 == 'ž') {
                    arg5[arg2 + var7] = -98;
                } else if (var8 == 'Ÿ') {
                    arg5[arg2 + var7] = -97;
                } else {
                    arg5[arg2 + var7] = 63;
                }
            }
            return var6;
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field8962[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field8962[2] : field8962[0]) + ',' + arg4 + ',' + (arg5 == null ? field8962[2] : field8962[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)I")
    public static final int method4530(int arg0, int arg1, String arg2, String arg3) {
        try {
            field8955++;
            int var4 = arg3.length();
            int var5 = arg2.length();
            int var6 = 0;
            int var7 = 0;
            char var8 = 0;
            char var9 = 0;
            while (var6 - var8 < var4 || var5 > var7 - var9) {
                if (var6 - var8 >= var4) {
                    return -1;
                }
                if ((var7 - var9) >= var5) {
                    return 1;
                }
                char var10;
                if (var8 == '\u0000') {
                    var10 = arg3.charAt(var6++);
                } else {
                    var10 = var8;
                    boolean var11 = false;
                }
                char var12;
                if (var9 == '\u0000') {
                    var12 = arg2.charAt(var7++);
                } else {
                    var12 = var9;
                    boolean var13 = false;
                }
                var8 = class123.method1192(arg0 + 256, var10);
                var9 = class123.method1192(256, var12);
                char var14 = class232.method2021(var10, arg1, (byte) 126);
                char var15 = class232.method2021(var12, arg1, (byte) 95);
                if (var14 != var15 && Character.toUpperCase(var14) != Character.toUpperCase(var15)) {
                    char var16 = Character.toLowerCase(var14);
                    char var17 = Character.toLowerCase(var15);
                    if (var16 != var17) {
                        return class535.method3989(var16, (byte) 70, arg1) - class535.method3989(var17, (byte) 70, arg1);
                    }
                }
            }
            int var18 = Math.min(var4, var5);
            for (int var19 = 0; var19 < var18; var19++) {
                int var20;
                int var21;
                if (arg1 == 2) {
                    var21 = var4 - var19 - 1;
                    var20 = var5 - var19 - 1;
                } else {
                    var20 = var19;
                    var21 = var19;
                }
                char var22 = arg3.charAt(var21);
                char var23 = arg2.charAt(var20);
                if (var22 != var23 && Character.toUpperCase(var22) != Character.toUpperCase(var23)) {
                    char var24 = Character.toLowerCase(var22);
                    char var25 = Character.toLowerCase(var23);
                    if (var24 != var25) {
                        return class535.method3989(var24, (byte) 70, arg1) - class535.method3989(var25, (byte) 70, arg1);
                    }
                }
            }
            int var26 = var4 - var5;
            if (arg0 != var26) {
                return var26;
            }
            for (int var27 = 0; var27 < var18; var27++) {
                char var28 = arg3.charAt(var27);
                char var29 = arg2.charAt(var27);
                if (var28 != var29) {
                    return class535.method3989(var28, (byte) 70, arg1) - class535.method3989(var29, (byte) 70, arg1);
                }
            }
            return 0;
        } catch (RuntimeException var31) {
            throw class590.method4333(var31, field8962[1] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field8962[2] : field8962[0]) + ',' + (arg3 == null ? field8962[2] : field8962[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(III)Z")
    public static final boolean method4531(int arg0, int arg1, int arg2) {
        try {
            field8954++;
            if (arg0 != 0) {
                method4530(13, -115, null, null);
            }
            return (arg1 & 0x180) != 0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8962[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4532(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x24);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4533(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 93;
                    break;
                case 1:
                    var10005 = 108;
                    break;
                case 2:
                    var10005 = 123;
                    break;
                case 3:
                    var10005 = 58;
                    break;
                default:
                    var10005 = 36;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
