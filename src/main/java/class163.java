import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class163 extends class176 {

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "[B")
    public byte[] field3159;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "[[B")
    public static byte[][] field3152 = new byte[250][];

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "Lob;")
    private static class141 field3154 = class175.method1195(40, "RuneScape has been updated(Q");

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "Lob;")
    public static class141 field3155 = field3154;

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "[J")
    public static long[] field3156 = new long[32];

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)V")
    public static final void method1132(int arg0, int arg1) {
        field3157++;
        if (!class66.method443(true, arg1)) {
            return;
        }
        class170[] var2 = class224.field4232[arg1];
        int var3 = 0;
        if (arg0 != -19597) {
            field3151 = 36;
        }
        while (var3 < var2.length) {
            class170 var4 = var2[var3];
            if (var4 != null) {
                var4.field3345 = 0;
                var4.field3406 = 0;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZI)Lrd;")
    public static final class173 method1133(boolean arg0, int arg1) {
        field3153++;
        class173 var2 = (class173) class187.field3622.method1383((long) arg1, (byte) -98);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class221.field4193.method1065((byte) -82, arg1, 16);
        class173 var4 = new class173();
        if (var3 != null) {
            var4.method1190(true, new class146(var3));
        }
        if (arg0) {
            field3151 = 120;
        }
        class187.field3622.method1378(var4, (byte) -70, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)V")
    public static void method1134(int arg0) {
        field3156 = null;
        field3155 = null;
        int var1 = -30 % ((-arg0 - 12) / 44);
        field3152 = null;
        field3154 = null;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "([B)V")
    public class163(byte[] arg0) {
        this.field3159 = arg0;
    }
}
