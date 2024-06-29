import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class245 extends class283 {

    @OriginalMember(owner = "client!f", name = "R", descriptor = "I")
    private int field4019 = 204;

    @OriginalMember(owner = "client!f", name = "Y", descriptor = "I")
    private int field4026 = 1;

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "I")
    private int field4018 = 1;

    @OriginalMember(owner = "client!f", name = "V", descriptor = "I")
    public static int field4023 = 0;

    @OriginalMember(owner = "client!f", name = "Z", descriptor = "I")
    public static int field4027 = 0;

    @OriginalMember(owner = "client!f", name = "T", descriptor = "[S")
    public static short[] field4021 = new short[256];

    @OriginalMember(owner = "client!f", name = "S", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!f", name = "U", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!f", name = "X", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!f", name = "W", descriptor = "Lfi;")
    public static class260 field4024;

    @OriginalMember(owner = "client!f", name = "P", descriptor = "[I")
    public static int[] field4017;

    @OriginalMember(owner = "client!f", name = "ab", descriptor = "[[I")
    public static int[][] field4028;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "(I)I", line = 16)
    public static final int method1688(int arg0) {
        field4020++;
        if (arg0 > -22) {
            field4021 = (short[]) null;
        }
        return 15;
    }

    @OriginalMember(owner = "client!f", name = "f", descriptor = "(B)V", line = 33)
    public static void method1689(byte arg0) {
        field4021 = null;
        field4024 = null;
        if (arg0 >= 30) {
            field4017 = null;
            field4028 = (int[][]) null;
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V", line = 45)
    public class245() {
        super(0, true);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILwa;Z)V", line = 55)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        field4022++;
        if (!arg2) {
            return;
        }
        if (arg0 == 0) {
            this.field4018 = arg1.method642((byte) -86);
        } else if (arg0 == 1) {
            this.field4026 = arg1.method642((byte) -118);
        } else if (arg0 == 2) {
            this.field4019 = arg1.method576(1);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)[I", line = 99)
    public final int[] method8(int arg0, byte arg1) {
        field4025++;
        int var3 = -24 / ((arg1 - 30) / 36);
        int[] var4 = this.field4733.method664(-16409, arg0);
        if (this.field4733.field1406) {
            for (int var5 = 0; var5 < class101.field1632; var5++) {
                int var6 = class13.field184[var5];
                int var7 = class59.field955[arg0];
                int var8 = this.field4018 * var6 >> 12;
                int var9 = this.field4026 * var7 >> 12;
                int var10 = var6 % (4096 / this.field4018) * this.field4018;
                int var11 = var7 % (4096 / this.field4026) * this.field4026;
                if (this.field4019 > var11) {
                    for (var8 -= var9; var8 < 0; var8 += 4) {
                    }
                    while (var8 > 3) {
                        var8 -= 4;
                    }
                    if (var8 != 1) {
                        var4[var5] = 0;
                        continue;
                    }
                    if (this.field4019 > var10) {
                        var4[var5] = 0;
                        continue;
                    }
                }
                if (var10 < this.field4019) {
                    int var12;
                    for (var12 = var8 - var9; var12 < 0; var12 += 4) {
                    }
                    while (var12 > 3) {
                        var12 -= 4;
                    }
                    if (var12 > 0) {
                        var4[var5] = 0;
                        continue;
                    }
                }
                var4[var5] = 4096;
            }
        }
        return var4;
    }
}
