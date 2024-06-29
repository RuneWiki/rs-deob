import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class246 {

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3805 = "Loading fonts - ";

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lf;I)Ljh;")
    public static final class291 method1661(class37 arg0, int arg1) {
        field3806++;
        return arg1 > -50 ? null : new class291(arg0.method306(56), arg0.method306(110), arg0.method306(44), arg0.method306(95), arg0.method336(23362), arg0.method336(23362), arg0.method333((byte) -59));
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIII)V")
    public static final void method1662(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 < 24) {
            return;
        }
        field3808++;
        int var6 = arg4 - arg2;
        int var7 = arg1 - arg0;
        if (var6 == 0) {
            if (var7 != 0) {
                class64.method505(arg3, arg1, arg0, arg2, (byte) 0);
            }
        } else if (var7 == 0) {
            class133.method928(arg0, arg4, 3668, arg2, arg3);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 < var7;
            if (var8) {
                int var9 = arg2;
                arg2 = arg0;
                arg0 = var9;
                int var10 = arg4;
                arg4 = arg1;
                arg1 = var10;
            }
            if (arg2 > arg4) {
                int var11 = arg0;
                int var12 = arg2;
                arg0 = arg1;
                arg1 = var11;
                arg2 = arg4;
                arg4 = var12;
            }
            int var13 = arg0;
            int var14 = arg1 - arg0;
            int var15 = arg4 - arg2;
            if (var14 < 0) {
                var14 = -var14;
            }
            int var16 = -(var15 >> 1);
            int var17 = arg0 >= arg1 ? -1 : 1;
            if (var8) {
                for (int var19 = arg2; var19 <= arg4; var19++) {
                    var16 += var14;
                    class156.field2379[var19][var13] = arg3;
                    if (var16 > 0) {
                        var16 -= var15;
                        var13 += var17;
                    }
                }
            } else {
                for (int var18 = arg2; var18 <= arg4; var18++) {
                    class156.field2379[var13][var18] = arg3;
                    var16 += var14;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var15;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILag;)V")
    public static final void method1663(int arg0, class188 arg1) {
        field3807++;
        if (arg0 != 255) {
            field3805 = null;
        }
        if (class153.field2348 == arg1.field2960) {
            class37.field632[arg1.field2839] = true;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([BIII)Ljava/lang/String;")
    public static final String method1664(byte[] arg0, int arg1, int arg2, int arg3) {
        field3804++;
        if (arg2 != 14439) {
            return null;
        }
        char[] var4 = new char[arg3];
        int var5 = 0;
        for (int var6 = 0; var6 < arg3; var6++) {
            int var7 = arg0[arg1 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class241.field3733[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
    public static void method1665(boolean arg0) {
        if (arg0) {
            method1663(84, (class188) null);
        }
        field3805 = null;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
    public class246() {
        new class78();
    }
}
