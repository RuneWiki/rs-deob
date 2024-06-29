import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public abstract class class355 extends class90 {

    @OriginalMember(owner = "client!kp", name = "y", descriptor = "Z")
    public volatile boolean field5386 = true;

    @OriginalMember(owner = "client!kp", name = "u", descriptor = "[[I")
    public static int[][] field5382 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!kp", name = "v", descriptor = "[I")
    public static int[] field5383 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!kp", name = "s", descriptor = "Lsh;")
    public static class472 field5380 = new class472(22, 6);

    @OriginalMember(owner = "client!kp", name = "t", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!kp", name = "x", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!kp", name = "w", descriptor = "Ldp;")
    public static class319 field5384;

    @OriginalMember(owner = "client!kp", name = "z", descriptor = "Z")
    public boolean field5387;

    @OriginalMember(owner = "client!kp", name = "A", descriptor = "Z")
    public boolean field5388;

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "(I)I")
    public abstract int method138(int arg0);

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "(I)[B")
    public abstract byte[] method133(int arg0);

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IBI)I")
    public static final int method2186(int arg0, byte arg1, int arg2) {
        if (arg1 == 79) {
            field5381++;
            return arg2 == 4 || arg2 == 5 ? class485.field6813[arg0 & 0x3] : 256;
        } else {
            return 108;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZI)V")
    public static final void method2187(boolean arg0, int arg1) {
        if (arg1 != -1) {
            field5384 = null;
        }
        class351.method2169(class233.field3411, arg0, (byte) 103, class279.field4220, class342.field5115);
        field5385++;
    }

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "(I)V")
    public static void method2188(int arg0) {
        field5380 = null;
        field5384 = null;
        if (arg0 == -13176) {
            field5382 = null;
            field5383 = null;
        }
    }
}
