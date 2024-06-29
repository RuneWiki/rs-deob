import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class15 extends class60 {

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "[B")
    public byte[] field279;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "[I")
    public static int[] field278 = new int[2048];

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "Lub;")
    public static class227 field283 = class257.method1749("floorshadows", 17263);

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "Lub;")
    private static class227 field284 = class257.method1749("Created gameworld", 17263);

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "Lub;")
    public static class227 field287 = field284;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "Luh;")
    public static class198 field281 = new class198();

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)V")
    public static void method73(byte arg0) {
        field278 = null;
        field284 = null;
        field287 = null;
        field281 = null;
        field283 = null;
        if (arg0 != 22) {
            method73((byte) 110);
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "([B)V")
    public class15(byte[] arg0) {
        this.field279 = arg0;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZII)I")
    public static final int method74(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            int var3 = arg1 >>> 31;
            field286++;
            return (arg1 + var3) / arg2 - var3;
        } else {
            return 59;
        }
    }
}
