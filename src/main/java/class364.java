import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class364 implements class379 {

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public int field5281;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public int field5282;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public int field5283;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
    public int field5288;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
    public int field5289;

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
    public int field5290;

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "Lki;")
    public static class510 field5293;

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "Z")
    public boolean field5296;

    static {
        new class44("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
        field5294 = 0;
        field5295 = -2;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Ltp;I)Z", line = 4)
    public final boolean method2241(class379 arg0, int arg1) {
        field5286++;
        if (!(arg0 instanceof class364)) {
            return false;
        }
        class364 var3 = (class364) arg0;
        if (this.field5281 != var3.field5281) {
            return false;
        } else if (this.field5283 != var3.field5283) {
            return false;
        } else if (this.field5290 != var3.field5290) {
            return false;
        } else if (this.field5282 != var3.field5282) {
            return false;
        } else if (this.field5289 != var3.field5289) {
            return false;
        } else if (this.field5288 != var3.field5288) {
            return false;
        } else if (this.field5296 == var3.field5296) {
            if (arg1 != -22538) {
                method2243(-65);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Ljava/lang/String;B)[B", line = 48)
    public static final byte[] method2242(String arg0, byte arg1) {
        field5285++;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        if (arg1 > -19) {
            field5295 = 3;
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

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V", line = 192)
    public static final void method2243(int arg0) {
        if (arg0 >= -125) {
            method2242(null, (byte) -27);
        }
        class170.method1206(1, 10);
        field5291++;
        class296.method1903(false);
        System.gc();
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IILtf;)Ljava/lang/String;", line = 207)
    public static final String method2244(int arg0, int arg1, class198 arg2) {
        if (arg0 != 20438) {
            field5295 = -57;
        }
        field5292++;
        if (!client.method1395(arg2).method1885(arg1, -44) && arg2.field3020 == null) {
            return null;
        } else if (arg2.field2949 == null || arg2.field2949.length <= arg1 || arg2.field2949[arg1] == null || arg2.field2949[arg1].trim().length() == 0) {
            return class65.field1107 ? "Hidden-" + arg1 : null;
        } else {
            return arg2.field2949[arg1];
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(B)V", line = 230)
    public static void method2245(byte arg0) {
        field5293 = null;
        if (arg0 != -125) {
            method2245((byte) -125);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIII)I", line = 240)
    public static final int method2246(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= -84) {
            return -24;
        }
        field5287++;
        int var5 = arg1 & 0xF;
        int var6 = var5 >= 8 ? arg4 : arg0;
        int var7 = var5 < 4 ? arg4 : (var5 == 12 || var5 == 14 ? arg0 : arg2);
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)J", line = 260)
    public final long method2247(byte arg0) {
        field5284++;
        long[] var2 = class539.field7928;
        long var3 = -1L;
        long var5 = var2[(int) ((var3 ^ (long) this.field5281) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var2[(int) ((var5 ^ (long) (this.field5283 >> 8)) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var7 >>> 8 ^ var2[(int) ((var7 ^ (long) this.field5283) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var2[(int) (((long) (this.field5290 >> 24) ^ var9) & 0xFFL)];
        long var13 = var2[(int) ((var11 ^ (long) (this.field5290 >> 16)) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var2[(int) (((long) (this.field5290 >> 8) ^ var13) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var2[(int) ((var15 ^ (long) this.field5290) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var17 >>> 8 ^ var2[(int) (((long) this.field5282 ^ var17) & 0xFFL)];
        long var21 = var19 >>> 8 ^ var2[(int) (((long) (this.field5289 >> 24) ^ var19) & 0xFFL)];
        long var23 = var2[(int) (((long) (this.field5289 >> 16) ^ var21) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var2[(int) ((var23 ^ (long) (this.field5289 >> 8)) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var2[(int) (((long) this.field5289 ^ var25) & 0xFFL)] ^ var25 >>> 8;
        if (arg0 != 63) {
            method2245((byte) -104);
        }
        long var29 = var2[(int) (((long) this.field5288 ^ var27) & 0xFFL)] ^ var27 >>> 8;
        return var2[(int) ((var29 ^ (long) (this.field5296 ? 1 : 0)) & 0xFFL)] ^ var29 >>> 8;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(FIIIZIII)[I", line = 303)
    public static final int[] method2248(float arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field5280++;
        int[] var8 = new int[arg1];
        class442 var9 = new class442();
        var9.field6295 = arg7;
        var9.field6291 = arg3;
        var9.field6302 = arg5;
        var9.field6289 = arg4;
        var9.field6308 = arg6;
        var9.field6299 = (int) (arg0 * 4096.0F);
        var9.method66((byte) 123);
        class203.method1401((byte) 55, arg1, arg2);
        var9.method2603(var8, 0, arg2 ^ 0xFFFFFF96);
        return var8;
    }
}
