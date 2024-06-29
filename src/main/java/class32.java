import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!qa")
public class class32 {

    @OriginalMember(owner = "mapview!qa", name = "c", descriptor = "[I")
    private int[] field450;

    @OriginalMember(owner = "mapview!qa", name = "b", descriptor = "Lr;")
    public static class33 field449 = class29.method192("Staff Shop", (byte) 126);

    @OriginalMember(owner = "mapview!qa", name = "f", descriptor = "Lr;")
    public static class33 field453 = class29.method192("Loading )3)3)3", (byte) 126);

    @OriginalMember(owner = "mapview!qa", name = "h", descriptor = "Lr;")
    public static class33 field455 = class29.method192("Fishing Spot", (byte) 126);

    @OriginalMember(owner = "mapview!qa", name = "e", descriptor = "Lr;")
    public static class33 field452 = class29.method192("100(U", (byte) 126);

    @OriginalMember(owner = "mapview!qa", name = "j", descriptor = "I")
    public static volatile int field457 = -1;

    @OriginalMember(owner = "mapview!qa", name = "i", descriptor = "Lr;")
    public static class33 field456 = class29.method192("Guide", (byte) 126);

    @OriginalMember(owner = "mapview!qa", name = "k", descriptor = "Lr;")
    public static class33 field458 = class29.method192("mapfunction", (byte) 126);

    @OriginalMember(owner = "mapview!qa", name = "g", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "mapview!qa", name = "d", descriptor = "Ll;")
    public static class22 field451;

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "[[B")
    public static byte[][] field448;

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(B)V", line = 21)
    public static void method205(byte arg0) {
        field451 = null;
        field456 = null;
        if (arg0 <= 19) {
            return;
        }
        field452 = null;
        field453 = null;
        field449 = null;
        field455 = null;
        field458 = null;
        field448 = null;
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(BI)I", line = 40)
    public final int method206(byte arg0, int arg1) {
        int var3 = this.field450.length - 2;
        if (arg0 != -89) {
            this.method206((byte) 20, -44);
        }
        int var4 = arg1 << 1 & var3;
        while (true) {
            int var5 = this.field450[var4];
            if (arg1 == var5) {
                return this.field450[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var3 & var4 + 2;
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(I[B)[B", line = 72)
    public static final byte[] method207(int arg0, byte[] arg1) {
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        if (arg0 > -46) {
            return (byte[]) null;
        } else {
            class34.method234(arg1, 0, var3, 0, var2);
            return var3;
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "<init>", descriptor = "([I)V", line = 111)
    public class32(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field450 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field450[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field450[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field450[var5 + var5] = arg0[var4];
            this.field450[var5 + var5 + 1] = var4++;
        }
    }
}
