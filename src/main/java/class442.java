import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class442 {

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "Liu;")
    public static class517 field6462 = new class517(32, 0);

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "[I")
    public static int[] field6467;

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "[J")
    public static long[] field6466;

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "[Lbs;")
    public static class200[] field6469;

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "F")
    public static float field6465;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
    public static int field6458;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
    public static int field6459;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
    public static int field6460;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "I")
    public static int field6461;

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
    public static int field6468;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "Lgp;")
    public static class561 field6463;

    static {
        new class567("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
        field6467 = new int[5];
        field6466 = new long[256];
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field6466[var0] = var1;
        }
        field6469 = new class200[75];
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V", line = 4)
    public static void method2614(byte arg0) {
        field6463 = null;
        if (arg0 != -90) {
            field6467 = null;
        }
        field6467 = null;
        field6466 = null;
        field6462 = null;
        field6469 = null;
    }

    @OriginalMember(owner = "client!sq", name = "toString", descriptor = "()Ljava/lang/String;", line = 22)
    public final String toString() {
        field6458++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)I", line = 31)
    public static final int method2615(int arg0, int arg1) {
        int var2 = -77 / ((arg1 + 63) / 59);
        field6459++;
        return arg0 == 16711935 ? -1 : class278.method1789(arg0, (byte) 82);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lod;[[BI)V", line = 60)
    public static final void method2616(class568 arg0, byte[][] arg1, int arg2) {
        field6461++;
        int var3 = class563.field8070.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg1[var4];
            if (var5 != null) {
                int var6 = (class43.field584[var4] >> 8) * 64 - class382.field5687;
                int var7 = (class43.field584[var4] & 0xFF) * 64 - class597.field8500;
                class547.method3064((byte) 111);
                arg0.method3228(class268.field3916, class159.field2378, var6, var5, (byte) 54, var7);
            }
        }
        if (arg2 != 1567680040) {
            field6465 = 0.23283818F;
        }
    }
}
