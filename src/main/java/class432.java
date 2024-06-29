import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class432 extends class589 {

    @OriginalMember(owner = "client!qm", name = "F", descriptor = "Ltha;")
    public static class372 field6028 = new class372();

    @OriginalMember(owner = "client!qm", name = "I", descriptor = "Lgw;")
    public static class690 field6030 = new class690(20);

    @OriginalMember(owner = "client!qm", name = "L", descriptor = "[Lro;")
    public static class526[] field6033 = new class526[14];

    @OriginalMember(owner = "client!qm", name = "M", descriptor = "[I")
    public static int[] field6034 = new int[1];

    @OriginalMember(owner = "client!qm", name = "J", descriptor = "I")
    public static int field6031 = 0;

    @OriginalMember(owner = "client!qm", name = "D", descriptor = "I")
    public static int field6026;

    @OriginalMember(owner = "client!qm", name = "E", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!qm", name = "K", descriptor = "Luu;")
    public static class237 field6032;

    @OriginalMember(owner = "client!qm", name = "H", descriptor = "[B")
    private byte[] field6029;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V")
    public static void method2668(int arg0) {
        field6033 = null;
        field6030 = null;
        if (arg0 != 9847) {
            method2668(-82);
        }
        field6032 = null;
        field6034 = null;
        field6028 = null;
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(IIII)[B")
    public final byte[] method2669(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 39 % ((-arg3 - 3) / 35);
        this.field6029 = new byte[arg0 * arg1 * arg2 * 2];
        field6027++;
        this.method3139(arg2, arg0, -17059, arg1);
        return this.field6029;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BII)V")
    public final void method2670(byte arg0, int arg1, int arg2) {
        field6026++;
        int var4 = arg1 * 2;
        byte var5 = (byte) (((arg0 & 0xFF) >> 1) + 127);
        if (arg2 != -13461) {
            this.method2670((byte) 85, 4, -97);
        }
        this.field6029[var4++] = var5;
        this.field6029[var4] = var5;
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V")
    public class432() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
