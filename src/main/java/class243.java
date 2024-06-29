import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class243 extends class86 {

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "I")
    public int field3407 = 0;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "Lui;")
    public static class375 field3410 = new class375("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "[Ljava/lang/String;")
    public static String[] field3412 = new String[100];

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "Lob;")
    public static class266 field3413;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILtl;)V", line = 5)
    public final void method1619(int arg0, class91 arg1) {
        while (true) {
            int var3 = arg1.method618((byte) 100);
            if (var3 == 0) {
                field3411++;
                if (arg0 != 458752) {
                    method1623(null, 43, 83, -8, 97, -72, -35);
                    return;
                }
                return;
            }
            this.method1622(var3, arg1, -3);
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V", line = 26)
    public static void method1620(int arg0) {
        field3410 = null;
        if (arg0 != 0) {
            field3410 = null;
        }
        field3413 = null;
        field3412 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBI)Z", line = 43)
    public static final boolean method1621(int arg0, byte arg1, int arg2) {
        if (arg1 >= -52) {
            method1620(38);
        }
        field3408++;
        return class277.method1755(arg2, true, arg0) | (arg2 & 0x70000) != 0 || class202.method1407(arg2, arg0, false);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILtl;I)V", line = 54)
    private final void method1622(int arg0, class91 arg1, int arg2) {
        field3409++;
        if (~arg0 == arg2) {
            this.field3407 = arg1.method631(10494);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([BIIIIII)Z", line = 69)
    public static final boolean method1623(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3406++;
        int var7 = arg1 % arg3;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg3 - var7;
        }
        int var9 = -((arg3 + arg4 + arg6) / arg3);
        int var10 = -((arg1 + arg3 - 1) / arg3);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg0[arg2] == 0) {
                    return true;
                }
                arg2 += arg3;
            }
            int var13 = arg2 - var8;
            if (arg0[var13 - 1] == 0) {
                return true;
            }
            arg2 = arg5 + var13;
        }
        return false;
    }
}
