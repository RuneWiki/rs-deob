import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 {

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    private int field51 = 0;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    private int field54 = -1;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Lef;")
    private class513 field47 = new class513();

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "Z")
    public boolean field57 = false;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    private int field43;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    private int field55;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "[[I")
    private int[][] field48;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "[Leg;")
    private class118[] field56;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field58 = new String[] { method37(method36("\u001f\u001aBCI")), method37(method36("\u001f\u001aB>\b\u0015\u0010\u0018<I")), method37(method36("\u001f\u001aBAI")), method37(method36("\u001f\u001aB@I")), method37(method36("8\u0018\u0002\"\u000e\u0015\u0015\u0015\"\u0013\u001e\r\u001ek\u0004\r\u001cLcA\u001d\f\u0000nA\u0012\u0014\re\u0004[\u001a\ra\t\u001e")), method37(method36("\u001f\u001aBGI")), method37(method36("\u001f\u001aBFI")) };

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "Liga;")
    public static class481 field46;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public static void method31(int arg0) {
        try {
            field46 = null;
            if (arg0 != 2) {
                field45 = -39;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field58[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)[[I")
    public final int[][] method32(int arg0) {
        try {
            field50++;
            if (this.field55 != this.field43) {
                throw new RuntimeException(field58[4]);
            }
            for (int var2 = 0; var2 < this.field43; var2++) {
                this.field56[var2] = class108.field1261;
            }
            if (arg0 != -13509) {
                this.method34((byte) -18, 17);
            }
            return this.field48;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field58[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public final void method33(int arg0) {
        try {
            field49++;
            for (int var2 = 0; var2 < this.field43; var2++) {
                this.field48[var2] = null;
            }
            int var3 = -98 % ((64 - arg0) / 37);
            this.field48 = null;
            this.field56 = null;
            this.field47.method3879(87);
            this.field47 = null;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field58[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)[I")
    public final int[] method34(byte arg0, int arg1) {
        try {
            field53++;
            if (arg0 != -64) {
                this.field54 = 88;
            }
            if (this.field55 == this.field43) {
                this.field57 = this.field56[arg1] == null;
                this.field56[arg1] = class108.field1261;
                return this.field48[arg1];
            } else if (this.field43 == 1) {
                this.field57 = this.field54 != arg1;
                this.field54 = arg1;
                return this.field48[0];
            } else {
                class118 var3 = this.field56[arg1];
                if (var3 == null) {
                    this.field57 = true;
                    if (this.field43 <= this.field51) {
                        class118 var4 = (class118) this.field47.method3871(true);
                        var3 = new class118(arg1, var4.field1402);
                        this.field56[var4.field1404] = null;
                        var4.method1824(1);
                    } else {
                        var3 = new class118(arg1, this.field51);
                        this.field51++;
                    }
                    this.field56[arg1] = var3;
                } else {
                    this.field57 = false;
                }
                this.field47.method3876(false, var3);
                return this.field48[var3.field1402];
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field58[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIII)I")
    public static final int method35(int arg0, int arg1, int arg2, int arg3) {
        try {
            field44++;
            if ((class184.field2545[arg1][arg2][arg3] & 0x8) != 0) {
                return 0;
            } else if (arg1 <= 0 || (class184.field2545[1][arg2][arg3] & 0x2) == 0) {
                int var4 = -19 % ((12 - arg0) / 56);
                return arg1;
            } else {
                return arg1 - 1;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field58[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(III)V")
    public class5(int arg0, int arg1, int arg2) {
        try {
            this.field43 = arg0;
            this.field55 = arg1;
            this.field48 = new int[this.field43][arg2];
            this.field56 = new class118[this.field55];
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field58[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method36(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x61);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method37(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 123;
                    break;
                case 1:
                    var10005 = 121;
                    break;
                case 2:
                    var10005 = 108;
                    break;
                case 3:
                    var10005 = 2;
                    break;
                default:
                    var10005 = 97;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
