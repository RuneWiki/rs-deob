import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pja")
public class class40 extends class459 {

    @OriginalMember(owner = "client!pja", name = "y", descriptor = "I")
    public int field450 = 12800;

    @OriginalMember(owner = "client!pja", name = "v", descriptor = "I")
    public int field448 = 0;

    @OriginalMember(owner = "client!pja", name = "x", descriptor = "I")
    public int field453 = 12800;

    @OriginalMember(owner = "client!pja", name = "H", descriptor = "Z")
    public boolean field459 = true;

    @OriginalMember(owner = "client!pja", name = "E", descriptor = "I")
    public int field464 = 0;

    @OriginalMember(owner = "client!pja", name = "z", descriptor = "I")
    public int field465 = -1;

    @OriginalMember(owner = "client!pja", name = "C", descriptor = "I")
    public int field462 = -1;

    @OriginalMember(owner = "client!pja", name = "P", descriptor = "Ljava/lang/String;")
    public String field451;

    @OriginalMember(owner = "client!pja", name = "K", descriptor = "I")
    public int field455;

    @OriginalMember(owner = "client!pja", name = "w", descriptor = "Ljava/lang/String;")
    public String field456;

    @OriginalMember(owner = "client!pja", name = "A", descriptor = "I")
    public int field457;

    @OriginalMember(owner = "client!pja", name = "L", descriptor = "Lat;")
    public class398 field449;

    @OriginalMember(owner = "client!pja", name = "Q", descriptor = "[Ljava/lang/String;")
    private static final String[] field468 = new String[] { method385(method384("\u0017#9Su")), method385(method384("\u001cgvSJD")), method385(method384("\u0002x{\u0011")), method385(method384("\u001cgvS4\u0005c~\t6D")), method385(method384("\u001cgvSLD")), method385(method384("\u001cgvSMD")), method385(method384("\u001cgvSKD")), method385(method384("\u001cgvSID")), method385(method384("\u001cgvSND")) };

    @OriginalMember(owner = "client!pja", name = "I", descriptor = "Lpe;")
    public static class636 field460 = new class636(8, 0, 4, 1);

    @OriginalMember(owner = "client!pja", name = "B", descriptor = "I")
    public static int field463 = -1;

    @OriginalMember(owner = "client!pja", name = "N", descriptor = "Z")
    public static boolean field466 = false;

    @OriginalMember(owner = "client!pja", name = "O", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!pja", name = "J", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!pja", name = "F", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!pja", name = "D", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!pja", name = "M", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!pja", name = "G", descriptor = "Lgda;")
    public static class58 field467;

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(I)V")
    public final void method378(int arg0) {
        try {
            this.field448 = arg0;
            this.field453 = 12800;
            this.field464 = 0;
            this.field450 = 12800;
            field461++;
            for (class579 var2 = (class579) this.field449.method3228(11); var2 != null; var2 = (class579) this.field449.method3216(true)) {
                if (this.field453 > var2.field8334) {
                    this.field453 = var2.field8334;
                }
                if (this.field448 < var2.field8335) {
                    this.field448 = var2.field8335;
                }
                if (this.field450 > var2.field8328) {
                    this.field450 = var2.field8328;
                }
                if (var2.field8326 > this.field464) {
                    this.field464 = var2.field8326;
                }
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field468[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(III)Z")
    public final boolean method379(int arg0, int arg1, int arg2) {
        try {
            if (arg2 >= -77) {
                method382(81);
            }
            field454++;
            for (class579 var4 = (class579) this.field449.method3228(11); var4 != null; var4 = (class579) this.field449.method3216(true)) {
                if (var4.method4242(arg0, (byte) -89, arg1)) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field468[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(IIB[I)Z")
    public final boolean method380(int arg0, int arg1, byte arg2, int[] arg3) {
        try {
            field458++;
            class579 var5 = (class579) this.field449.method3228(11);
            if (arg2 >= -106) {
                method382(35);
            }
            while (var5 != null) {
                if (var5.method4242(arg1, (byte) -69, arg0)) {
                    var5.method4238(arg0, -112, arg1, arg3);
                    return true;
                }
                var5 = (class579) this.field449.method3216(true);
            }
            return false;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field468[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field468[2] : field468[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(IIII[I)Z")
    public final boolean method381(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        try {
            field452++;
            if (arg0 != -1) {
                this.method381(-98, -48, 32, 48, null);
            }
            for (class579 var6 = (class579) this.field449.method3228(11); var6 != null; var6 = (class579) this.field449.method3216(true)) {
                if (var6.method4240(arg0 ^ 0xFFFFFFFD, arg2, arg3, arg1)) {
                    var6.method4238(arg1, -104, arg3, arg4);
                    return true;
                }
            }
            return false;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field468[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field468[2] : field468[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!pja", name = "c", descriptor = "(I)V")
    public static void method382(int arg0) {
        try {
            field467 = null;
            int var1 = 62 % ((arg0 + 58) / 35);
            field460 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field468[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(I[III)Z")
    public final boolean method383(int arg0, int[] arg1, int arg2, int arg3) {
        try {
            field447++;
            for (class579 var5 = (class579) this.field449.method3228(arg2 - 12789); var5 != null; var5 = (class579) this.field449.method3216(true)) {
                if (var5.method4241((byte) -74, arg3, arg0)) {
                    var5.method4239(arg0, arg3, arg1, arg2 ^ 0x2044);
                    return true;
                }
            }
            if (arg2 != 12800) {
                field460 = null;
            }
            return false;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field468[1] + arg0 + ',' + (arg1 == null ? field468[2] : field468[0]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!pja", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class40(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        try {
            this.field465 = arg6;
            this.field462 = arg4;
            this.field451 = arg1;
            this.field455 = arg0;
            this.field456 = arg2;
            this.field457 = arg3;
            this.field459 = arg5;
            if (this.field465 == 255) {
                this.field465 = 0;
            }
            this.field449 = new class398();
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field468[3] + arg0 + ',' + (arg1 == null ? field468[2] : field468[0]) + ',' + (arg2 == null ? field468[2] : field468[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!pja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method384(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x8);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method385(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 108;
                    break;
                case 1:
                    var10005 = 13;
                    break;
                case 2:
                    var10005 = 23;
                    break;
                case 3:
                    var10005 = 125;
                    break;
                default:
                    var10005 = 8;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
