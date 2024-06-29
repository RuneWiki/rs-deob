import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class117 extends class34 {

    @OriginalMember(owner = "client!db", name = "D", descriptor = "Lrb;")
    public static class283 field1843 = new class283(36, -1);

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "[I")
    public static int[] field1844;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)[I", line = 5)
    public final int[] method64(int arg0, byte arg1) {
        ++field1842;
        int[] var3 = super.field537.method1780(arg0, (byte) 81);
        if (super.field537.field4191) {
            int[][] var4 = this.method254(0, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; class383.field5502 > var8; ++var8) {
                var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
            }
        }
        int var9 = -78 % (-arg1 / 50);
        return var3;
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(B)V", line = 42)
    public static void method867(byte arg0) {
        field1844 = null;
        int var1 = -25 / ((arg0 - -39) / 53);
        field1843 = null;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V", line = 53)
    public class117() {
        super(1, true);
    }
}
