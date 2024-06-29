import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class215 extends class195 {

    @OriginalMember(owner = "client!ig", name = "Z", descriptor = "I")
    private int field3429 = 0;

    @OriginalMember(owner = "client!ig", name = "V", descriptor = "I")
    private int field3425 = 2048;

    @OriginalMember(owner = "client!ig", name = "fb", descriptor = "I")
    private int field3435 = 10;

    @OriginalMember(owner = "client!ig", name = "bb", descriptor = "Lck;")
    private static class119 field3431 = class298.method1987((byte) 106, "OFF");

    @OriginalMember(owner = "client!ig", name = "jb", descriptor = "Lck;")
    public static class119 field3439 = field3431;

    @OriginalMember(owner = "client!ig", name = "W", descriptor = "I")
    public static int field3426 = 0;

    @OriginalMember(owner = "client!ig", name = "mb", descriptor = "I")
    public static int field3442 = 0;

    @OriginalMember(owner = "client!ig", name = "X", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!ig", name = "Y", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!ig", name = "ab", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!ig", name = "cb", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!ig", name = "eb", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!ig", name = "gb", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!ig", name = "hb", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!ig", name = "kb", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!ig", name = "ib", descriptor = "Lva;")
    public static class36 field3438;

    @OriginalMember(owner = "client!ig", name = "nb", descriptor = "Ljava/lang/String;")
    public static String field3443;

    @OriginalMember(owner = "client!ig", name = "U", descriptor = "[I")
    public static int[] field3424;

    @OriginalMember(owner = "client!ig", name = "db", descriptor = "[I")
    private int[] field3433;

    @OriginalMember(owner = "client!ig", name = "lb", descriptor = "[I")
    private int[] field3441;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lfj;II)V", line = 4)
    public final void method13(class3 arg0, int arg1, int arg2) {
        if (arg1 > -117) {
            this.method14(7);
        }
        field3427++;
        if (arg2 == 0) {
            this.field3435 = arg0.method64((byte) -98);
        } else if (arg2 == 1) {
            this.field3425 = arg0.method63((byte) 1);
        } else if (arg2 == 2) {
            this.field3429 = arg0.method64((byte) 118);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IZ)[I", line = 52)
    public final int[] method11(int arg0, boolean arg1) {
        field3428++;
        int[] var3 = this.field3106.method924(100, arg0);
        if (this.field3106.field2260) {
            int var4 = field3424[arg0];
            if (this.field3429 == 0) {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field3435; var12++) {
                    if (var4 >= this.field3441[var12] && this.field3441[var12 + 1] > var4) {
                        if (this.field3433[var12] > var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class213.method1340(var3, 0, class157.field2504, var11);
            } else {
                for (int var5 = 0; var5 < class157.field2504; var5++) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class157.field2505[var5];
                    int var9 = this.field3429;
                    if (var9 == 1) {
                        var6 = var8;
                    } else if (var9 == 2) {
                        var6 = (var8 + var4 - 4096 >> 1) + 2048;
                    } else if (var9 == 3) {
                        var6 = (var8 - var4 >> 1) + 2048;
                    }
                    for (int var10 = 0; var10 < this.field3435; var10++) {
                        if (this.field3441[var10] <= var6 && var6 < this.field3441[var10 + 1]) {
                            if (var6 < this.field3433[var10]) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            }
        }
        return arg1 ? (int[]) null : var3;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIII)I", line = 167)
    public static final int method1352(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3432++;
        if (arg2 != -1981784127) {
            field3438 = (class36) null;
        }
        int var5 = 65536 - class284.field4699[arg3 * 1024 / arg1] >> 1;
        return ((65536 - var5) * arg4 >> 16) + (arg0 * var5 >> 16);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lva;I)V", line = 185)
    public static final void method1353(class36 arg0, int arg1) {
        if (arg1 != 2048) {
            method1354((byte) 113);
        }
        field3430++;
        class197.field3156 = arg0;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V", line = 240)
    public class215() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(B)V", line = 203)
    public static void method1354(byte arg0) {
        if (arg0 != -95) {
            return;
        }
        field3439 = null;
        field3431 = null;
        field3443 = null;
        field3438 = null;
        field3424 = null;
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V", line = 218)
    public final void method14(int arg0) {
        field3434++;
        if (arg0 == 2048879374) {
            this.method1356((byte) -120);
        }
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(III)Lk;", line = 244)
    public static final class199 method1355(int arg0, int arg1, int arg2) {
        class104 var3 = class150.field2390[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class199 var4 = var3.field1598;
            var3.field1598 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(B)V", line = 263)
    private final void method1356(byte arg0) {
        if (arg0 > -103) {
            return;
        }
        int var2 = 4096 / this.field3435;
        int var3 = 0;
        field3436++;
        this.field3441 = new int[this.field3435 + 1];
        this.field3433 = new int[this.field3435 + 1];
        int var4 = this.field3425 * var2 >> 12;
        for (int var5 = 0; var5 < this.field3435; var5++) {
            this.field3441[var5] = var3;
            this.field3433[var5] = var3 + var4;
            var3 += var2;
        }
        this.field3441[this.field3435] = 4096;
        this.field3433[this.field3435] = this.field3433[0] + 4096;
    }
}
