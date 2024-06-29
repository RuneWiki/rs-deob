import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class786 {

    @OriginalMember(owner = "client!sw", name = "l", descriptor = "I")
    public int field11468;

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "S")
    public short field11477;

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "I")
    public int field11480;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "I")
    public int field11473;

    @OriginalMember(owner = "client!sw", name = "i", descriptor = "S")
    public short field11475;

    @OriginalMember(owner = "client!sw", name = "f", descriptor = "S")
    public short field11469;

    @OriginalMember(owner = "client!sw", name = "j", descriptor = "I")
    public int field11471;

    @OriginalMember(owner = "client!sw", name = "e", descriptor = "Z")
    public boolean field11470;

    @OriginalMember(owner = "client!sw", name = "h", descriptor = "B")
    public byte field11472;

    @OriginalMember(owner = "client!sw", name = "m", descriptor = "I")
    public int field11474;

    @OriginalMember(owner = "client!sw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11481 = new String[] { method5695(method5694("9P?F\u0011")), method5695(method5694("9P?E\u0011")), method5695(method5694("$R}k")), method5695(method5694("9P?D\u0011")), method5695(method5694("1\t?)D")), method5695(method5694("9P?;P$Ne9\u0011")) };

    @OriginalMember(owner = "client!sw", name = "g", descriptor = "[[I")
    public static int[][] field11478 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "I")
    public static int field11476;

    @OriginalMember(owner = "client!sw", name = "k", descriptor = "I")
    public static int field11479;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)V", line = 11)
    public static void method5691(int arg0) {
        try {
            if (arg0 != 13398) {
                method5692((byte) -41);
            }
            field11478 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field11481[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(B)V", line = 25)
    public static final void method5692(byte arg0) {
        try {
            field11476++;
            if (!class752.field10948) {
                class597.field8773 = true;
                class459.field6688 += (-24.0F - class459.field6688) / 2.0F;
                if (arg0 <= 89) {
                    method5693(-15, 52, 91, null);
                }
                class752.field10948 = true;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field11481[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIILjava/lang/Object;)[B", line = 42)
    public static final byte[] method5693(int arg0, int arg1, int arg2, Object arg3) {
        try {
            field11479++;
            if (arg3 == null) {
                return null;
            } else if (arg3 instanceof byte[]) {
                byte[] var4 = (byte[]) arg3;
                return class37.method242(arg0, -88, arg1, var4);
            } else if (arg2 != 5) {
                return null;
            } else if (arg3 instanceof class307) {
                class307 var5 = (class307) arg3;
                return var5.method822((byte) 122, arg1, arg0);
            } else {
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field11481[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field11481[2] : field11481[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 84)
    public class786(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        try {
            this.field11468 = arg3;
            this.field11477 = (short) arg4;
            this.field11480 = arg0;
            this.field11473 = arg2;
            this.field11475 = (short) arg5;
            this.field11469 = (short) arg6;
            this.field11471 = arg1;
            this.field11470 = arg10;
            this.field11472 = (byte) arg8;
            this.field11474 = arg11;
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field11481[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!sw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5694(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x39);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5695(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 74;
                    break;
                case 1:
                    var10005 = 39;
                    break;
                case 2:
                    var10005 = 17;
                    break;
                case 3:
                    var10005 = 7;
                    break;
                default:
                    var10005 = 57;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
