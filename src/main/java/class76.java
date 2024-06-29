import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class76 extends class535 {

    @OriginalMember(owner = "client!bm", name = "H", descriptor = "I")
    private int field1245 = 4;

    @OriginalMember(owner = "client!bm", name = "W", descriptor = "I")
    private int field1257 = 4;

    @OriginalMember(owner = "client!bm", name = "G", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1244 = new CRC32();

    @OriginalMember(owner = "client!bm", name = "J", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!bm", name = "L", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!bm", name = "O", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!bm", name = "P", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!bm", name = "Q", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!bm", name = "R", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!bm", name = "S", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!bm", name = "T", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!bm", name = "U", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!bm", name = "V", descriptor = "Lqa;")
    public static class167 field1256;

    @OriginalMember(owner = "client!bm", name = "F", descriptor = "Lci;")
    public static class320 field1243;

    @OriginalMember(owner = "client!bm", name = "M", descriptor = "Lci;")
    public static class320 field1248;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)[[I")
    public final int[][] method61(int arg0, int arg1) {
        if (arg0 >= -116) {
            method588(-6, 63);
        }
        ++field1253;
        int[][] var3 = super.field7879.method733(arg1, -16963);
        if (super.field7879.field1528) {
            int var4 = class174.field2597 / this.field1257;
            int var5 = class362.field5263 / this.field1245;
            int[][] var6;
            if (var5 <= 0) {
                var6 = this.method3157((byte) 67, 0, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method3157((byte) 67, class362.field5263 * var7 / var5, 0);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; class174.field2597 > var14; ++var14) {
                int var16;
                if (~var4 < -1) {
                    int var15 = var14 % var4;
                    var16 = class174.field2597 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(II)[I")
    public final int[] method65(int arg0, int arg1) {
        ++field1249;
        int[] var3 = super.field7885.method974(arg1 ^ -30532, arg0);
        if (super.field7885.field2086) {
            int var4 = class174.field2597 / this.field1257;
            int var5 = class362.field5263 / this.field1245;
            int[] var6;
            if (~var5 >= -1) {
                var6 = this.method3158(113, 0, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method3158(-67, 0, class362.field5263 * var7 / var5);
            }
            for (int var8 = 0; ~class174.field2597 < ~var8; ++var8) {
                if (var4 <= 0) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class174.field2597 * var9 / var4];
                }
            }
        }
        if (arg1 != 1) {
            method585((byte) -84);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V")
    public class76() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "(B)V")
    public static void method585(byte arg0) {
        field1244 = null;
        int var1 = -23 % ((arg0 - 45) / 45);
        field1243 = null;
        field1256 = null;
        field1248 = null;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIII)V")
    public static final void method586(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1250;
        class275 var5 = class213.method1433((byte) 50, 4, arg2);
        var5.method1778(arg3);
        var5.field4113 = arg1;
        var5.field4106 = arg0;
        var5.field4104 = arg4;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method587(long arg0, byte arg1) {
        ++field1246;
        if (~arg0 < -1L && ~arg0 > -6582952005840035282L) {
            if (~(arg0 % 37L) == -1L) {
                return null;
            } else {
                int var3 = 0;
                long var4 = arg0;
                while (var4 != 0L) {
                    var4 /= 37L;
                    ++var3;
                }
                if (arg1 != -53) {
                    return null;
                } else {
                    StringBuffer var6 = new StringBuffer(var3);
                    while (arg0 != 0L) {
                        long var7 = arg0;
                        arg0 /= 37L;
                        var6.append(class288.field4271[(int) (-(arg0 * 37L) + var7)]);
                    }
                    return var6.reverse().toString();
                }
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(II)Z")
    public static final boolean method588(int arg0, int arg1) {
        ++field1254;
        if (arg0 != 0) {
            return true;
        } else {
            return arg1 >= 4 && arg1 <= 8;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILwn;I)V")
    public final void method60(int arg0, class519 arg1, int arg2) {
        if (arg2 == -6232) {
            if (arg0 != 0) {
                if (arg0 == 1) {
                    this.field1245 = arg1.method3072((byte) -123);
                }
            } else {
                this.field1257 = arg1.method3072((byte) -127);
            }
            ++field1251;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IILjava/lang/String;BIIII)V")
    public static final void method589(int arg0, int arg1, String arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1252;
        class230 var8 = new class230();
        var8.field3447 = arg5;
        var8.field3454 = arg0;
        var8.field3457 = arg1;
        var8.field3458 = class24.field349 + arg7;
        var8.field3451 = arg2;
        var8.field3444 = arg6;
        var8.field3446 = arg4;
        if (arg3 != -100) {
            field1248 = null;
        }
        class27.field379.method905(var8, arg3 + 100);
    }
}
