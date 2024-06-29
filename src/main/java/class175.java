import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class175 extends class34 {

    @OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
    private int field2559 = -1;

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "I")
    public static int field2557 = 0;

    @OriginalMember(owner = "client!ag", name = "T", descriptor = "I")
    public static int field2558 = -1;

    @OriginalMember(owner = "client!ag", name = "ab", descriptor = "I")
    public static int field2565 = 0;

    @OriginalMember(owner = "client!ag", name = "V", descriptor = "Lla;")
    public static class167 field2560 = new class167(0, 0);

    @OriginalMember(owner = "client!ag", name = "eb", descriptor = "Ljava/lang/String;")
    public static String field2569 = "red:";

    @OriginalMember(owner = "client!ag", name = "fb", descriptor = "I")
    public static int field2570 = 0;

    @OriginalMember(owner = "client!ag", name = "gb", descriptor = "Ljava/lang/String;")
    public static String field2571 = "Loaded textures";

    @OriginalMember(owner = "client!ag", name = "P", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!ag", name = "W", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!ag", name = "X", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!ag", name = "Z", descriptor = "I")
    private int field2564;

    @OriginalMember(owner = "client!ag", name = "bb", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!ag", name = "cb", descriptor = "I")
    private int field2567;

    @OriginalMember(owner = "client!ag", name = "db", descriptor = "Lpe;")
    public static class253 field2568;

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "[I")
    public static int[] field2555;

    @OriginalMember(owner = "client!ag", name = "Y", descriptor = "[I")
    private int[] field2563;

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
    public class175() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)I")
    public final int method233(int arg0) {
        ++field2554;
        return arg0 != -1 ? -128 : this.field2559;
    }

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "(I)V")
    public static void method1160(int arg0) {
        field2569 = null;
        if (arg0 <= 83) {
            field2558 = -112;
        }
        field2571 = null;
        field2555 = null;
        field2568 = null;
        field2560 = null;
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(B)Z")
    private final boolean method1161(byte arg0) {
        if (arg0 != -74) {
            return false;
        } else {
            ++field2562;
            if (this.field2563 != null) {
                return true;
            } else if (this.field2559 >= 0) {
                int var2 = class226.field3527;
                int var3 = class259.field3965;
                int var4 = !class59.field974.method491(this.field2559, arg0 + -14).field3620 ? 128 : 64;
                this.field2563 = class59.field974.method489(1.0F, false, this.field2559, var4, var4, arg0 + 74);
                this.field2567 = var4;
                this.field2564 = var4;
                class7.method63(var2, 32, var3);
                return this.field2563 != null;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        if (~arg1 == -1) {
            this.field2559 = arg2.method423(arg0 ^ 99);
        }
        if (arg0 != 6) {
            this.method52((byte) 51, -5);
        }
        ++field2556;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        ++field2566;
        int[][] var3 = super.field618.method91(22, arg1);
        if (super.field618.field211 && this.method1161((byte) -74)) {
            int var4 = (~class259.field3965 == ~this.field2564 ? arg1 : this.field2564 * arg1 / class259.field3965) * this.field2567;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class226.field3527 != this.field2567) {
                for (int var8 = 0; ~var8 > ~class226.field3527; ++var8) {
                    int var9 = this.field2567 * var8 / class226.field3527;
                    int var10 = this.field2563[var4 + var9];
                    var7[var8] = class131.method904(var10 << 4, 4080);
                    var6[var8] = class131.method904(65280, var10) >> 4;
                    var5[var8] = class131.method904(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; ~class226.field3527 < ~var11; ++var11) {
                    int var12 = this.field2563[var4++];
                    var7[var11] = class131.method904(255, var12) << 4;
                    var6[var11] = class131.method904(65280, var12) >> 4;
                    var5[var11] = class131.method904(var12, 16711680) >> 12;
                }
            }
        }
        int var13 = 68 / ((-54 - arg0) / 44);
        return var3;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)V")
    public final void method217(int arg0) {
        super.method217(arg0);
        ++field2561;
        this.field2563 = null;
    }
}
