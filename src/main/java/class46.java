import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class46 extends class217 {

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public static volatile int field1016 = 0;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "[Ljd;")
    public static class86[] field1022 = new class86[500];

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "Ljd;")
    public static class86 field1017 = class122.method868("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", true);

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "I")
    public static int field1021 = 0;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "I")
    public static int field1026 = -1;

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "Z")
    public static boolean field1025 = false;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "Lbj;")
    public static class151 field1020;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "Log;")
    public static class210 field1024;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLjd;Z)V")
    public static final void method361(byte arg0, class86 arg1, boolean arg2) {
        field1018++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class211.field3820.method1749(arg1, 250);
        int var7 = class211.field3820.method1757(arg1, 250) * 13;
        class131.method927(var5 - var3, -var3 + var4, var3 + var6 + var3, var3 + var3 + var7, 0);
        class131.method932(var5 - var3, -var3 + var4, var3 + var6 + var3, var3 + var7 + var3, 16777215);
        if (arg0 > -29) {
            field1026 = -113;
        }
        class211.field3820.method1762(arg1, var5, var4, var6, var7, 16777215, -1, 1, 1, 0);
        class186.method1280(var5 - var3, true, var4 - var3, var3 - -var3 + var7, var3 + var6 + var3);
        if (!arg2) {
            class134.method961(var6, 0, var7, var5, var4);
            return;
        }
        try {
            Graphics var8 = class50.field1057.getGraphics();
            class107.field2055.method158(0, var8, 0, false);
        } catch (Exception var9) {
            class50.field1057.repaint();
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
    public static final byte[] method362(boolean arg0, Object arg1, int arg2) {
        field1023++;
        if (arg1 == null) {
            return null;
        }
        if (arg2 != -24258) {
            field1019 = 51;
        }
        if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class135.method969(var3, 0) : var3;
        } else if (arg1 instanceof class61) {
            class61 var4 = (class61) arg1;
            return var4.method435(0);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIILeh;IJ)Z")
    public static final boolean method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class80 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class30.method201(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V")
    public static void method364(boolean arg0) {
        field1024 = null;
        field1020 = null;
        field1017 = null;
        field1022 = null;
        if (!arg0) {
            method361((byte) 82, (class86) null, false);
        }
    }
}
