import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class21 extends class7 {

    @OriginalMember(owner = "client!o", name = "x", descriptor = "I")
    public int field261 = -1;

    @OriginalMember(owner = "client!o", name = "C", descriptor = "I")
    public int field266 = -1;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "I")
    public int field259 = 12800;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "I")
    public int field264 = 12800;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "Z")
    public boolean field278 = true;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
    public int field280 = 0;

    @OriginalMember(owner = "client!o", name = "U", descriptor = "I")
    public int field284 = 0;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "Ljava/lang/String;")
    public String field273;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "Ljava/lang/String;")
    public String field267;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "I")
    public int field269;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "I")
    public int field279;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "Lbd;")
    public class37 field277;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "Z")
    public static boolean field270 = true;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field262 = new String[100];

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    public static int field274 = 0;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "[Ljava/lang/String;")
    public static String[] field282 = new String[100];

    @OriginalMember(owner = "client!o", name = "z", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!o", name = "T", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "Lwd;")
    public static class148 field260;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I[IIB)Z")
    public final boolean method150(int arg0, int[] arg1, int arg2, byte arg3) {
        field268++;
        for (class367 var5 = (class367) this.field277.method253((byte) -6); var5 != null; var5 = (class367) this.field277.method247((byte) 2)) {
            if (var5.method2355(arg0, -1, arg2)) {
                var5.method2360(48, arg1, arg2, arg0);
                return true;
            }
        }
        if (arg3 >= -49) {
            method154(127, (class447) null, 1, (byte) -128);
        }
        return false;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V")
    public final void method151(byte arg0) {
        if (arg0 < 76) {
            return;
        }
        this.field280 = 0;
        this.field264 = 12800;
        this.field284 = 0;
        this.field259 = 12800;
        field283++;
        for (class367 var2 = (class367) this.field277.method253((byte) -6); var2 != null; var2 = (class367) this.field277.method247((byte) -123)) {
            if (this.field284 < var2.field5564) {
                this.field284 = var2.field5564;
            }
            if (this.field264 > var2.field5568) {
                this.field264 = var2.field5568;
            }
            if (var2.field5569 > this.field280) {
                this.field280 = var2.field5569;
            }
            if (this.field259 > var2.field5562) {
                this.field259 = var2.field5562;
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIB[I)Z")
    public final boolean method152(int arg0, int arg1, int arg2, byte arg3, int[] arg4) {
        field265++;
        if (arg3 > -25) {
            this.method156(107, (int[]) null, 69, 14);
        }
        for (class367 var6 = (class367) this.field277.method253((byte) -6); var6 != null; var6 = (class367) this.field277.method247((byte) -123)) {
            if (var6.method2356(arg0, arg1, 100, arg2)) {
                var6.method2358(19, arg2, arg4, arg1);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IBII)I")
    public static final int method153(int arg0, byte arg1, int arg2, int arg3) {
        field272++;
        if (arg1 >= -67) {
            return 50;
        } else if (arg3 > arg0) {
            return arg3;
        } else if (arg0 > arg2) {
            return arg2;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILmo;IB)Lg;")
    public static final class86 method154(int arg0, class447 arg1, int arg2, byte arg3) {
        field263++;
        if (arg3 != 34) {
            field276 = -82;
        }
        byte[] var4 = arg1.method2771(arg0, arg2, 3);
        return var4 == null ? null : new class86(var4);
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(B)V")
    public static void method155(byte arg0) {
        field262 = null;
        if (arg0 != 14) {
            field262 = null;
        }
        field282 = null;
        field260 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I[III)Z")
    public final boolean method156(int arg0, int[] arg1, int arg2, int arg3) {
        field275++;
        if (arg3 != 100) {
            return true;
        }
        for (class367 var5 = (class367) this.field277.method253((byte) -6); var5 != null; var5 = (class367) this.field277.method247((byte) 11)) {
            if (var5.method2362(arg0, arg2, 26470)) {
                var5.method2358(94, arg2, arg1, arg0);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)Z")
    public final boolean method157(int arg0, int arg1, int arg2) {
        field271++;
        for (class367 var4 = (class367) this.field277.method253((byte) -6); var4 != null; var4 = (class367) this.field277.method247((byte) -122)) {
            if (var4.method2362(arg2, arg1, 26470)) {
                return true;
            }
        }
        if (arg0 != 12800) {
            this.field277 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
    public class21(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field273 = arg1;
        this.field261 = arg6;
        this.field267 = arg2;
        this.field269 = arg3;
        this.field266 = arg4;
        this.field279 = arg0;
        this.field278 = arg5;
        if (this.field261 == 255) {
            this.field261 = 0;
        }
        this.field277 = new class37();
    }
}
