import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class334 extends class317 {

    @OriginalMember(owner = "client!qm", name = "K", descriptor = "I")
    private int field5037 = 1;

    @OriginalMember(owner = "client!qm", name = "Q", descriptor = "I")
    private int field5042 = 1;

    @OriginalMember(owner = "client!qm", name = "N", descriptor = "I")
    private int field5039 = 204;

    @OriginalMember(owner = "client!qm", name = "T", descriptor = "Z")
    public static boolean field5045 = false;

    @OriginalMember(owner = "client!qm", name = "J", descriptor = "Lhi;")
    public static class192 field5036 = new class192();

    @OriginalMember(owner = "client!qm", name = "W", descriptor = "I")
    public static int field5048 = -1;

    @OriginalMember(owner = "client!qm", name = "X", descriptor = "[I")
    public static int[] field5049 = new int[500];

    @OriginalMember(owner = "client!qm", name = "Y", descriptor = "I")
    public static volatile int field5050 = 0;

    @OriginalMember(owner = "client!qm", name = "M", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!qm", name = "O", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!qm", name = "P", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!qm", name = "R", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!qm", name = "S", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!qm", name = "U", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!qm", name = "V", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!qm", name = "Z", descriptor = "[[[I")
    public static int[][][] field5051;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(II)Lvm;", line = 6)
    public static final class297 method2320(int arg0, int arg1) {
        field5046++;
        if (arg1 != 1) {
            field5048 = -110;
        }
        return (class297) class122.field1656.method111(-120, (long) arg0);
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V", line = 16)
    public class334() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lcg;II)V", line = 33)
    public final void method60(class316 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field5037 = arg0.method2219(16448);
        } else if (arg2 == 1) {
            this.field5042 = arg0.method2219(16448);
        } else if (arg2 == 2) {
            this.field5039 = arg0.method2220((byte) 100);
        }
        int var5 = -28 % ((arg1 + 17) / 40);
        field5038++;
    }

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "(B)V", line = 66)
    public static void method2321(byte arg0) {
        field5036 = null;
        if (arg0 > -86) {
            field5045 = true;
        }
        field5051 = (int[][][]) null;
        field5049 = null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)V", line = 82)
    public static final void method2322(int arg0, byte arg1) {
        field5043++;
        if (arg1 > 95 && class202.field2895 == arg0 && arg0 != 0) {
            class177 var2 = class257.field3786[arg0];
            var2.method29(class288.field4284);
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)[I", line = 104)
    public final int[] method140(int arg0, int arg1) {
        field5040++;
        int[] var3 = this.field4847.method1387(arg1, (byte) -126);
        if (this.field4847.field2751) {
            for (int var4 = 0; var4 < class326.field4933; var4++) {
                int var5 = class51.field693[arg1];
                int var6 = class99.field1360[var4];
                int var7 = this.field5042 * var5 >> 12;
                int var8 = var6 % (4096 / this.field5037) * this.field5037;
                int var9 = this.field5037 * var6 >> 12;
                int var10 = var5 % (4096 / this.field5042) * this.field5042;
                if (var10 < this.field5039) {
                    for (var9 -= var7; var9 < 0; var9 += 4) {
                    }
                    while (var9 > 3) {
                        var9 -= 4;
                    }
                    if (var9 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var8 < this.field5039) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var8 < this.field5039) {
                    int var11;
                    for (var11 = var9 - var7; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        if (arg0 != 542) {
            field5036 = (class192) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIII)I", line = 187)
    public static final int method2323(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5047++;
        int var5 = arg4 & 0xF;
        if (arg1 == 3) {
            int var6 = var5 >= 8 ? arg0 : arg3;
            int var7 = var5 < 4 ? arg0 : (var5 == 12 || var5 == 14 ? arg3 : arg2);
            return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
        } else {
            return -52;
        }
    }

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "(I)V", line = 204)
    public static final void method2324(int arg0) {
        if (arg0 != -1) {
            field5048 = -96;
        }
        if (class211.field3045 != -1) {
            class204.method1442(-8724, class211.field3045, -1, -1);
            class211.field3045 = -1;
        }
        field5041++;
    }
}
