import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public abstract class class357 extends class529 {

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "Lna;")
    public class211 field5546;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "[Luv;")
    public static class17[] field5540 = new class17[50];

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "I")
    public static int field5545 = 0;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    public static int field5542;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "Z")
    public boolean field5541;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "[[Z")
    public static boolean[][] field5543;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
    public abstract void method2359(byte arg0);

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)Z")
    public final boolean method2360(byte arg0) {
        field5542++;
        return arg0 == -84 ? this.field5541 : false;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIZ)V")
    public abstract void method2361(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(B)V")
    public static void method2362(byte arg0) {
        field5540 = null;
        if (arg0 == -73) {
            field5543 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)Z")
    public static final boolean method2363(int arg0, int arg1) {
        field5539++;
        if (arg0 > -37) {
            return false;
        } else {
            return (arg1 & -arg1) == arg1;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILsa;ZLsa;)V")
    public abstract void method2364(int arg0, class532 arg1, boolean arg2, class532 arg3);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)Z")
    public abstract boolean method2365(int arg0);

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)I")
    public final int method2366(int arg0) {
        field5538++;
        if (arg0 != -24966) {
            field5536 = 35;
        }
        return 1;
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)Z")
    public abstract boolean method2367(int arg0);

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "(I)Z")
    public final boolean method2368(int arg0) {
        field5537++;
        if (arg0 != 1) {
            this.method2366(-119);
        }
        return false;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II[S[Ljava/lang/String;I)V")
    public static final void method2369(int arg0, int arg1, short[] arg2, String[] arg3, int arg4) {
        if (arg0 > arg4) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg4;
            String var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            short var8 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var8;
            for (int var9 = arg4; var9 < arg0; var9++) {
                if (var7 == null || arg3[var9] != null && arg3[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    short var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg2[arg0] = arg2[var6];
            arg2[var6] = var8;
            method2369(var6 - 1, 1, arg2, arg3, arg4);
            method2369(arg0, 1, arg2, arg3, var6 + 1);
        }
        field5547++;
        if (arg1 != 1) {
            method2362((byte) -5);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILtm;I)Lpc;")
    public static final class192 method2370(int arg0, class423 arg1, int arg2) {
        field5544++;
        class192 var3;
        if (class286.field4504 == null) {
            var3 = new class192();
        } else {
            var3 = class286.field4504;
            class286.field4504 = class286.field4504.field2841;
            class427.field6458--;
            var3.field2841 = null;
        }
        var3.field2845 = arg1;
        if (arg2 == 1) {
            var3.field2849 = arg0;
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "(I)I")
    public int method2371(int arg0) {
        field5535++;
        if (arg0 != 0) {
            this.method2367(117);
        }
        return 0;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)V")
    public abstract void method2372(byte arg0, int arg1);

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lna;)V")
    public class357(class211 arg0) {
        this.field5546 = arg0;
    }
}
