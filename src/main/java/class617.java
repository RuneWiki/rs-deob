import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class617 extends class211 {

    @OriginalMember(owner = "client!vs", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field9075 = new String[] { method4599(method4598("^\u001c\u00175W")), method4599(method4598("SA\u0017R\u0002")), method4599(method4598("^\u001c\u0017=W")), method4599(method4598("F\u001aU\u0010")), method4599(method4598("^\u001c\u0017>W")), method4599(method4598("^\u001c\u0017?W")), method4599(method4598("^\u001c\u00178W")) };

    @OriginalMember(owner = "client!vs", name = "I", descriptor = "I")
    public static int field9071 = 1;

    @OriginalMember(owner = "client!vs", name = "F", descriptor = "I")
    public static int field9068 = 0;

    @OriginalMember(owner = "client!vs", name = "E", descriptor = "I")
    public static int field9067;

    @OriginalMember(owner = "client!vs", name = "G", descriptor = "I")
    public static int field9069;

    @OriginalMember(owner = "client!vs", name = "H", descriptor = "I")
    public static int field9070;

    @OriginalMember(owner = "client!vs", name = "K", descriptor = "I")
    public static int field9072;

    @OriginalMember(owner = "client!vs", name = "J", descriptor = "I")
    public static int field9074;

    @OriginalMember(owner = "client!vs", name = "D", descriptor = "Lnu;")
    public static class618 field9073;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lot;ZB)V", line = 3)
    public static final void method4596(class616 arg0, boolean arg1, byte arg2) {
        try {
            class646.field9353.method4052((byte) 31, arg0);
            ++field9072;
            if (arg1) {
                class66.method528(class227.field3474, class571.field8452, class647.field9368, 16, class646.field9353, arg0);
            }
            if (arg2 != -105) {
                field9068 = 107;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9075[2] + (arg0 != null ? field9075[1] : field9075[3]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(II)[I", line = 21)
    public final int[] method197(int arg0, int arg1) {
        try {
            ++field9067;
            int[] var3 = super.field3231.method34((byte) -64, arg1);
            if (arg0 != 8217) {
                return null;
            } else {
                if (super.field3231.field57) {
                    int[] var4 = this.method1856(0, arg1, 41);
                    for (int var5 = 0; var5 < class343.field5332; ++var5) {
                        var3[var5] = 4096 - var4[var5];
                    }
                }
                return var3;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field9075[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "()V", line = 60)
    public class617() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "(I)V", line = 63)
    public static void method4597(int arg0) {
        try {
            if (arg0 < 118) {
                method4597(-86);
            }
            field9073 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9075[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)[[I", line = 73)
    public final int[][] method234(int arg0, int arg1) {
        try {
            if (arg1 > -38) {
                field9074 = 28;
            }
            ++field9070;
            int[][] var3 = super.field3230.method5463((byte) -8, arg0);
            if (super.field3230.field10931) {
                int[][] var4 = this.method1853(0, 0, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class343.field5332 < ~var11; ++var11) {
                    var8[var11] = 4096 - var5[var11];
                    var9[var11] = 4096 - var6[var11];
                    var10[var11] = -var7[var11] + 4096;
                }
            }
            return var3;
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field9075[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(BILib;)V", line = 121)
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            if (arg1 == 0) {
                super.field3235 = ~arg2.method1455((byte) 62) == -2;
            }
            if (arg0 < 67) {
                method4596((class616) null, true, (byte) 63);
            }
            ++field9069;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field9075[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9075[1] : field9075[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!vs", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4598(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 127);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vs", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4599(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 40;
                    break;
                case 1:
                    var10005 = 111;
                    break;
                case 2:
                    var10005 = 57;
                    break;
                case 3:
                    var10005 = 124;
                    break;
                default:
                    var10005 = 127;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
