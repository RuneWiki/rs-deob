import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class427 extends class189 {

    @OriginalMember(owner = "client!q", name = "k", descriptor = "Ljava/lang/String;")
    public String field5991;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field5995 = new Hashtable();

    @OriginalMember(owner = "client!q", name = "p", descriptor = "[[Z")
    public static boolean[][] field5996 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public static int field5990;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public static int field5993;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "Lpea;")
    public static class724 field5994;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIZIII)Z")
    public static final boolean method2601(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field5992++;
        if (!arg5) {
            method2601(-103, 98, -127, -63, -76, false, 96, 109, 44);
        }
        if (arg0 + arg1 > arg7 && arg1 < (arg6 + arg7)) {
            return arg3 < arg4 + arg8 && arg8 < (arg2 + arg3);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)V")
    public static final void method2602(int arg0, int arg1) {
        class180 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class278 var4 = class588.field8292[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class365.field5171; var5++) {
                    for (int var6 = 0; var6 < class492.field6939; var6++) {
                        var2 = var4.method1822(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class660.field9038;
                            int var8 = var5 << class660.field9038;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class278 var10 = class588.field8292[var9];
                                if (var10 != null) {
                                    int var11 = var4.method1816((byte) -13, var5, var6) - var10.method1816((byte) 126, var5, var6);
                                    int var12 = var4.method1816((byte) 9, var5, var6 + 1) - var10.method1816((byte) 124, var5, var6 + 1);
                                    int var13 = var4.method1816((byte) 122, var5 + 1, var6 + 1) - var10.method1816((byte) 42, var5 + 1, var6 + 1);
                                    int var14 = var4.method1816((byte) -118, var5 + 1, var6) - var10.method1816((byte) -20, var5 + 1, var6);
                                    var10.method1811(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(B)V")
    public static void method2603(byte arg0) {
        field5994 = null;
        field5996 = null;
        field5995 = null;
        if (arg0 <= 89) {
            method2601(-28, -34, 26, 120, -123, false, 114, 41, 77);
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
    public class427() {
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IBIIZ)Lgp;")
    public static final class47 method2604(int arg0, byte arg1, int arg2, int arg3, boolean arg4) {
        field5993++;
        class47 var5 = new class47();
        var5.field550 = arg3;
        var5.field553 = arg2;
        class475.field6744.method1179((long) arg0, var5, (byte) -26);
        class172.method1108(arg3, (byte) -87);
        class493 var6 = class127.method854((byte) -103, arg0);
        if (var6 != null) {
            class543.method3149(var6, 1);
        }
        if (class486.field6819 != null) {
            class543.method3149(class486.field6819, 1);
            class486.field6819 = null;
        }
        class150.method1020(-65);
        if (arg1 >= -104) {
            method2604(-114, (byte) -52, -47, -97, false);
        }
        if (var6 != null) {
            class107.method765(!arg4, true, var6);
        }
        if (!arg4) {
            class241.method1536(arg3);
        }
        if (!arg4 && class457.field6447 != -1) {
            class118.method821(1, -93, class457.field6447);
        }
        return var5;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class427(String arg0) {
        this.field5991 = arg0;
    }
}
