import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public abstract class class503 {

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "Lgk;")
    public static class331 field7461 = new class331("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "[I")
    public static int[] field7465 = new int[64];

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "[I")
    public static int[] field7462 = new int[4];

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "[J")
    public static long[] field7463 = new long[256];

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "[[I")
    public static int[][] field7466 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field7459;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "[S")
    public static short[] field7464;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field7463[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method3010(int arg0) {
        if (arg0 <= 99) {
            field7464 = null;
        }
        field7459++;
        return this.method1269(2) || this.method1282((byte) 77) || this.method1271(1);
    }

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "(I)V", line = 18)
    public static void method3011(int arg0) {
        field7465 = null;
        field7462 = null;
        if (arg0 > -13) {
            method3012(-91, 35);
        }
        field7464 = null;
        field7463 = null;
        field7466 = null;
        field7461 = null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V", line = 39)
    public static final void method3012(int arg0, int arg1) {
        if (arg0 != 1) {
            method3011(107);
        }
        class164.field2333 = arg1;
        field7460++;
        class156 var2 = class484.field7118;
        synchronized (class484.field7118) {
            class484.field7118.method1105(false);
        }
        class156 var3 = class100.field1370;
        synchronized (class100.field1370) {
            class100.field1370.method1105(false);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V")
    public abstract void method1281(boolean arg0);

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)Z")
    public abstract boolean method1271(int arg0);

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(I)I")
    public abstract int method1280(int arg0);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)Los;")
    public abstract class306 method1284(byte arg0);

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(B)I")
    public abstract int method1268(byte arg0);

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "(I)Z")
    public abstract boolean method1269(int arg0);

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "(I)V")
    public abstract void method1275(int arg0);

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(B)Z")
    public abstract boolean method1282(byte arg0);
}
