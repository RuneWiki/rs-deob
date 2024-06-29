import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class348 extends class758 {

    @OriginalMember(owner = "client!kw", name = "q", descriptor = "Ljava/net/Socket;")
    private Socket field4950;

    @OriginalMember(owner = "client!kw", name = "k", descriptor = "Ldk;")
    private class90 field4944;

    @OriginalMember(owner = "client!kw", name = "n", descriptor = "Ljq;")
    private class600 field4947;

    @OriginalMember(owner = "client!kw", name = "t", descriptor = "[I")
    public static int[] field4953 = new int[14];

    @OriginalMember(owner = "client!kw", name = "p", descriptor = "Lwi;")
    public static class202 field4949 = new class202();

    @OriginalMember(owner = "client!kw", name = "h", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!kw", name = "i", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!kw", name = "j", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!kw", name = "l", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!kw", name = "m", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!kw", name = "o", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!kw", name = "r", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!kw", name = "s", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIB[B)V")
    public final void method2221(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        field4945++;
        if (arg2 != -1) {
            this.method2224(-103);
        }
        this.field4947.method3425(arg0, arg2 + 48, arg1, arg3);
    }

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "(B)V")
    public static void method2222(byte arg0) {
        field4953 = null;
        if (arg0 <= 3) {
            field4953 = null;
        }
        field4949 = null;
    }

    @OriginalMember(owner = "client!kw", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field4946++;
        this.method2226((byte) 95);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(BI)Z")
    public final boolean method2223(byte arg0, int arg1) throws IOException {
        field4952++;
        if (arg0 > -71) {
            method2225(false, null, null, 89, -19);
        }
        return this.field4944.method622((byte) -87, arg1);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)V")
    public final void method2224(int arg0) {
        field4948++;
        this.field4944.method623(-16808);
        if (arg0 != 97) {
            this.method2224(-109);
        }
        this.field4947.method3427(2);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZLvi;Lvi;II)I")
    public static final int method2225(boolean arg0, class370 arg1, class370 arg2, int arg3, int arg4) {
        field4941++;
        if (arg4 == 1) {
            int var5 = arg2.field6040;
            int var6 = arg1.field6040;
            if (!arg0) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg4 == 2) {
            return class529.method3145(class120.field1576, arg2.method2322(false).field10196, arg1.method2322(false).field10196, -1);
        } else if (arg4 == 3) {
            if (arg2.field5221.equals("-")) {
                if (arg1.field5221.equals("-")) {
                    return 0;
                } else if (arg0) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field5221.equals("-")) {
                return arg0 ? 1 : -1;
            } else {
                return class529.method3145(class120.field1576, arg2.field5221, arg1.field5221, -1);
            }
        } else if (arg4 == 4) {
            if (arg2.method2672(8)) {
                return arg1.method2672(8) ? 0 : 1;
            } else if (arg1.method2672(8)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 < 2) {
            return -7;
        } else if (arg4 == 5) {
            if (arg2.method2674(false)) {
                return arg1.method2674(false) ? 0 : 1;
            } else if (arg1.method2674(false)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 6) {
            if (arg2.method2671((byte) 46)) {
                return arg1.method2671((byte) 46) ? 0 : 1;
            } else if (arg1.method2671((byte) 46)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 7) {
            if (arg2.method2673(126)) {
                return arg1.method2673(-1) ? 0 : 1;
            } else if (arg1.method2673(126)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 8) {
            int var7 = arg2.field5225;
            int var8 = arg1.field5225;
            if (arg0) {
                if (var7 == 1000) {
                    var7 = -1;
                }
                if (var8 == 1000) {
                    var8 = -1;
                }
            } else {
                if (var7 == -1) {
                    var7 = 1000;
                }
                if (var8 == -1) {
                    var8 = 1000;
                }
            }
            return var7 - var8;
        } else {
            return arg2.field5222 - arg1.field5222;
        }
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class348(Socket arg0, int arg1) throws IOException {
        this.field4950 = arg0;
        this.field4950.setSoTimeout(30000);
        this.field4950.setTcpNoDelay(true);
        this.field4944 = new class90(this.field4950.getInputStream(), arg1);
        this.field4947 = new class600(this.field4950.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(B)V")
    public final void method2226(byte arg0) {
        field4951++;
        int var2 = 80 % ((18 - arg0) / 34);
        try {
            this.field4950.close();
        } catch (IOException var3) {
        }
        this.field4944.method618((byte) 117);
        this.field4947.method3426(2);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "([BIIB)I")
    public final int method2227(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        field4943++;
        return arg3 == 23 ? this.field4944.method621(31364, arg1, arg0, arg2) : 77;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIB[BLjava/lang/String;I)I")
    public static final int method2228(int arg0, int arg1, byte arg2, byte[] arg3, String arg4, int arg5) {
        field4942++;
        if (arg2 >= -114) {
            method2225(false, null, null, -34, 24);
        }
        int var6 = arg1 - arg0;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg4.charAt(arg0 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg3[arg5 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg3[arg5 + var7] = -128;
            } else if (var8 == '‚') {
                arg3[arg5 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg3[arg5 + var7] = -125;
            } else if (var8 == '„') {
                arg3[arg5 + var7] = -124;
            } else if (var8 == '…') {
                arg3[arg5 + var7] = -123;
            } else if (var8 == '†') {
                arg3[arg5 + var7] = -122;
            } else if (var8 == '‡') {
                arg3[arg5 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg3[arg5 + var7] = -120;
            } else if (var8 == '‰') {
                arg3[arg5 + var7] = -119;
            } else if (var8 == 'Š') {
                arg3[arg5 + var7] = -118;
            } else if (var8 == '‹') {
                arg3[arg5 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg3[arg5 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg3[arg5 + var7] = -114;
            } else if (var8 == '‘') {
                arg3[arg5 + var7] = -111;
            } else if (var8 == '’') {
                arg3[arg5 + var7] = -110;
            } else if (var8 == '“') {
                arg3[arg5 + var7] = -109;
            } else if (var8 == '”') {
                arg3[arg5 + var7] = -108;
            } else if (var8 == '•') {
                arg3[arg5 + var7] = -107;
            } else if (var8 == '–') {
                arg3[arg5 + var7] = -106;
            } else if (var8 == '—') {
                arg3[arg5 + var7] = -105;
            } else if (var8 == '˜') {
                arg3[arg5 + var7] = -104;
            } else if (var8 == '™') {
                arg3[arg5 + var7] = -103;
            } else if (var8 == 'š') {
                arg3[arg5 + var7] = -102;
            } else if (var8 == '›') {
                arg3[arg5 + var7] = -101;
            } else if (var8 == 'œ') {
                arg3[arg5 + var7] = -100;
            } else if (var8 == 'ž') {
                arg3[arg5 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg3[arg5 + var7] = -97;
            } else {
                arg3[arg5 + var7] = 63;
            }
        }
        return var6;
    }
}
