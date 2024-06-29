import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class187 extends class1 {

    @OriginalMember(owner = "client!je", name = "K", descriptor = "I")
    public static int field2832 = 0;

    @OriginalMember(owner = "client!je", name = "ab", descriptor = "I")
    public static int field2847 = 0;

    @OriginalMember(owner = "client!je", name = "db", descriptor = "Ljava/lang/String;")
    public static String field2850 = "glow1:";

    @OriginalMember(owner = "client!je", name = "W", descriptor = "I")
    public static int field2843 = 0;

    @OriginalMember(owner = "client!je", name = "H", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!je", name = "I", descriptor = "I")
    public int field2830;

    @OriginalMember(owner = "client!je", name = "J", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!je", name = "M", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!je", name = "O", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!je", name = "P", descriptor = "I")
    public int field2837;

    @OriginalMember(owner = "client!je", name = "R", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!je", name = "S", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!je", name = "U", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!je", name = "V", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!je", name = "X", descriptor = "I")
    public int field2844;

    @OriginalMember(owner = "client!je", name = "Y", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!je", name = "Z", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!je", name = "bb", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!je", name = "cb", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!je", name = "eb", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!je", name = "fb", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!je", name = "N", descriptor = "Ljava/lang/String;")
    public String field2835;

    @OriginalMember(owner = "client!je", name = "G", descriptor = "[[I")
    public static int[][] field2828;

    @OriginalMember(owner = "client!je", name = "L", descriptor = "[[S")
    public static short[][] field2833;

    @OriginalMember(owner = "client!je", name = "Q", descriptor = "[[[B")
    public static byte[][][] field2838;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(I)J")
    public final long method1159(int arg0) {
        if (arg0 != 28965) {
            method1161(59, (class248) null);
        }
        ++field2851;
        return Long.MAX_VALUE & super.field15;
    }

    @OriginalMember(owner = "client!je", name = "g", descriptor = "(I)V")
    public static void method1160(int arg0) {
        field2828 = null;
        field2833 = null;
        if (arg0 == 1) {
            field2850 = null;
            field2838 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILfl;)Ltg;")
    public static final class185 method1161(int arg0, class248 arg1) {
        ++field2845;
        arg1.method1593((byte) 27);
        if (arg0 != -5285) {
            field2832 = 34;
        }
        int var2 = arg1.method1593((byte) 27);
        class185 var3 = class228.method1463(121, var2);
        var3.field2806 = arg1.method1593((byte) 27);
        int var4 = arg1.method1593((byte) 27);
        for (int var5 = 0; var4 > var5; ++var5) {
            int var6 = arg1.method1593((byte) 27);
            var3.method27(var6, arg1, arg0 ^ 3184);
        }
        var3.method30(-9);
        return var3;
    }

    @OriginalMember(owner = "client!je", name = "h", descriptor = "(I)V")
    public final void method1162(int arg0) {
        ++field2849;
        if (arg0 != 1) {
            method1160(-122);
        }
        super.field15 = 500L + class263.method1754(arg0 ^ 15) | Long.MIN_VALUE & super.field15;
        class32.field468.method363(this, arg0 + -106);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/Throwable;Z)Ljava/lang/String;")
    public static final String method1163(Throwable arg0, boolean arg1) throws IOException {
        ++field2852;
        String var3;
        if (arg0 instanceof class209) {
            class209 var2 = (class209) arg0;
            var3 = var2.field3149 + " | ";
            arg0 = var2.field3146;
        } else {
            var3 = "";
        }
        if (arg1) {
            field2841 = 123;
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (~var10 == 0) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var3 + var15;
            if (~var10 != 0 && ~var11 != 0) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!je", name = "i", descriptor = "(I)V")
    public static final void method1164(int arg0) {
        class287.field4298.method1782(arg0 ^ arg0);
        ++field2846;
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(B)I")
    public final int method1165(byte arg0) {
        ++field2840;
        return arg0 <= 7 ? -124 : (int) (super.field1321 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(II)V")
    public class187(int arg0, int arg1) {
        super.field1321 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method1166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        if (arg6 != -66) {
            field2850 = null;
        }
        ++field2829;
        if (class294.method1943((byte) 125, arg2)) {
            client.method965(class234.field3532[arg2], -1, arg5, arg1, arg0, arg4, arg3, arg7);
        }
    }

    @OriginalMember(owner = "client!je", name = "j", descriptor = "(I)V")
    public final void method1167(int arg0) {
        ++field2848;
        super.field15 |= Long.MIN_VALUE;
        if (~this.method1159(28965) == -1L) {
            class272.field4089.method363(this, -105);
        }
        if (arg0 >= -116) {
            field2833 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "k", descriptor = "(I)I")
    public final int method1168(int arg0) {
        ++field2839;
        if (arg0 != 32) {
            field2838 = null;
        }
        return (int) super.field1321;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z[B)[B")
    public static final byte[] method1169(boolean arg0, byte[] arg1) {
        ++field2842;
        if (arg0) {
            method1166(-67, 70, 47, -19, -26, 78, (byte) 97, -55);
        }
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class193.method1210(arg1, 0, var3, 0, var2);
        return var3;
    }
}
