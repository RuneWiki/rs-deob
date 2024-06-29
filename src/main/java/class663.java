import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class663 {

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "Loo;")
    public static class652 field9221 = new class652(32);

    @OriginalMember(owner = "client!tda", name = "g", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field9227 = new Rectangle[100];

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "I")
    public static int field9222;

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "I")
    public static int field9223;

    @OriginalMember(owner = "client!tda", name = "d", descriptor = "I")
    public static int field9224;

    @OriginalMember(owner = "client!tda", name = "e", descriptor = "I")
    public static int field9225;

    @OriginalMember(owner = "client!tda", name = "f", descriptor = "[[I")
    public static int[][] field9226;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIIIBII)Z")
    public static final boolean method3780(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field9225++;
        int var7 = arg2 + arg3;
        int var8 = arg1 + arg6;
        int var9 = arg0 + arg5;
        if (!class263.method1706(var8, var9, var8, arg5, arg2, var7, var8, -96, var9, arg2)) {
            return false;
        } else if (class263.method1706(var8, var9, var8, arg5, arg2, var7, var8, -54, arg5, var7)) {
            if (arg2 >= class502.field7116) {
                if (!class263.method1706(var8, var9, var8, var9, var7, var7, arg1, -88, arg5, var7)) {
                    return false;
                }
                if (!class263.method1706(arg1, arg5, var8, var9, var7, var7, arg1, -30, arg5, var7)) {
                    return false;
                }
            } else if (!class263.method1706(var8, var9, var8, var9, arg2, arg2, arg1, -39, arg5, arg2)) {
                return false;
            } else if (!class263.method1706(arg1, arg5, var8, var9, arg2, arg2, arg1, -97, arg5, arg2)) {
                return false;
            }
            if (arg4 <= 52) {
                field9221 = null;
            }
            if (class82.field906 > arg5) {
                if (!class263.method1706(var8, arg5, var8, arg5, arg2, var7, arg1, -71, arg5, arg2)) {
                    return false;
                }
                if (!class263.method1706(arg1, arg5, var8, arg5, arg2, var7, arg1, -90, arg5, var7)) {
                    return false;
                }
            } else if (!class263.method1706(var8, var9, var8, var9, arg2, var7, arg1, -46, var9, arg2)) {
                return false;
            } else if (!class263.method1706(arg1, var9, var8, var9, arg2, var7, arg1, -48, var9, var7)) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(B)V")
    public static void method3781(byte arg0) {
        if (arg0 <= 62) {
            field9227 = null;
        }
        field9227 = null;
        field9221 = null;
        field9226 = null;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method3782(byte arg0, String arg1) {
        field9222++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg1.length();
        while (var2 < var3 && class48.method340(arg1.charAt(var2), (byte) 117)) {
            var2++;
        }
        while (var3 > var2 && class48.method340(arg1.charAt(var3 - 1), (byte) 57)) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        if (arg0 < 60) {
            method3781((byte) 2);
        }
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class202.method1411(18581, var7)) {
                char var8 = class152.method1045((byte) 29, var7);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!tda", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9224++;
        throw new IllegalStateException();
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field9227[var0] = new Rectangle();
        }
    }
}
