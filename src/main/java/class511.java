import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class511 extends class120 {

    @OriginalMember(owner = "client!uca", name = "s", descriptor = "I")
    public int field7289;

    @OriginalMember(owner = "client!uca", name = "C", descriptor = "I")
    public int field7299;

    @OriginalMember(owner = "client!uca", name = "y", descriptor = "I")
    public int field7295;

    @OriginalMember(owner = "client!uca", name = "p", descriptor = "I")
    public int field7286;

    @OriginalMember(owner = "client!uca", name = "x", descriptor = "I")
    public int field7294;

    @OriginalMember(owner = "client!uca", name = "z", descriptor = "I")
    public int field7296;

    @OriginalMember(owner = "client!uca", name = "t", descriptor = "Z")
    public static boolean field7290 = false;

    @OriginalMember(owner = "client!uca", name = "u", descriptor = "Lof;")
    public static class620 field7291 = new class620(30);

    @OriginalMember(owner = "client!uca", name = "q", descriptor = "I")
    public static int field7287;

    @OriginalMember(owner = "client!uca", name = "r", descriptor = "I")
    public static int field7288;

    @OriginalMember(owner = "client!uca", name = "w", descriptor = "I")
    public static int field7293;

    @OriginalMember(owner = "client!uca", name = "A", descriptor = "I")
    public static int field7297;

    @OriginalMember(owner = "client!uca", name = "v", descriptor = "[Lhu;")
    public static class131[] field7292;

    @OriginalMember(owner = "client!uca", name = "B", descriptor = "[[Z")
    public static boolean[][] field7298;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(BLjava/lang/Object;Z)[B")
    public static final byte[] method3018(byte arg0, Object arg1, boolean arg2) {
        field7288++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg2 ? class158.method977(var3, -84) : var3;
        } else if (arg1 instanceof class13) {
            class13 var4 = (class13) arg1;
            return var4.method62((byte) 44);
        } else {
            if (arg0 != -72) {
                field7290 = true;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method3019(String arg0, byte arg1) {
        field7293++;
        String var2 = null;
        int var3 = arg0.indexOf("--> ");
        if (var3 >= 0) {
            var2 = arg0.substring(0, var3 + 4);
            arg0 = arg0.substring(var3 + 4);
        }
        if (arg0.startsWith("directlogin ")) {
            int var4 = arg0.indexOf(" ", "directlogin ".length());
            if (var4 >= 0) {
                int var5 = arg0.length();
                arg0 = arg0.substring(0, var4) + " ";
                for (int var6 = var4 + 1; var6 < var5; var6++) {
                    arg0 = arg0 + "*";
                }
            }
        }
        if (arg1 != -54) {
            field7298 = null;
        }
        return var2 == null ? arg0 : var2 + arg0;
    }

    @OriginalMember(owner = "client!uca", name = "e", descriptor = "(I)V")
    public static void method3020(int arg0) {
        field7292 = null;
        field7298 = null;
        field7291 = null;
        if (arg0 != -24874) {
            field7298 = null;
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(I)Lhs;")
    public class325 method777(int arg0) {
        field7287++;
        if (arg0 > -8) {
            this.field7299 = 65;
        }
        return class366.field4667;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(II)Luw;")
    public static final class416 method3021(int arg0, int arg1) {
        field7297++;
        if (arg1 > -118) {
            field7291 = null;
        }
        class416[] var2 = class395.method2420(0);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class416 var4 = var2[var3];
            if (var4.field5690 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!uca", name = "<init>", descriptor = "(Lkda;Lcu;IIIIIIIIIIIII)V")
    public class511(class388 arg0, class219 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field7289 = arg11;
        this.field7299 = arg9;
        this.field7295 = arg10;
        this.field7286 = arg13;
        this.field7294 = arg12;
        this.field7296 = arg14;
    }
}
