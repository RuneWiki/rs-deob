import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class177 extends class115 {

    @OriginalMember(owner = "client!bg", name = "O", descriptor = "I")
    private int field2511 = 0;

    @OriginalMember(owner = "client!bg", name = "L", descriptor = "I")
    private int field2508 = 1;

    @OriginalMember(owner = "client!bg", name = "M", descriptor = "I")
    private int field2509 = 0;

    @OriginalMember(owner = "client!bg", name = "J", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!bg", name = "K", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!bg", name = "N", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!bg", name = "P", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!bg", name = "Q", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!bg", name = "R", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!bg", name = "S", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!bg", name = "T", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "(II)[I")
    public final int[] method116(int arg0, int arg1) {
        if (arg0 != 242152972) {
            return null;
        } else {
            ++field2513;
            int[] var3 = super.field1705.method463(arg1, false);
            if (super.field1705.field1072) {
                int var4 = class187.field2664[arg1];
                int var5 = var4 - 2048 >> 1;
                for (int var6 = 0; var6 < class77.field1178; ++var6) {
                    int var7 = class169.field2444[var6];
                    int var8 = var7 + -2048 >> 1;
                    int var9;
                    if (this.field2511 == 0) {
                        var9 = (-var4 + var7) * this.field2508;
                    } else {
                        int var10 = var8 * var8 - -(var5 * var5) >> 12;
                        int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                        var9 = (int) ((double) (this.field2508 * var11) * 3.141592653589793D);
                    }
                    int var12 = var9 - (var9 & -4096);
                    if (this.field2509 == 0) {
                        var12 = class32.field471[(var12 & 4082) >> 4] + 4096 >> 1;
                    } else if (this.field2509 == 2) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = 2048 - var12 << 1;
                    }
                    var3[var6] = var12;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V")
    public final void method170(byte arg0) {
        int var2 = 22 / ((78 - arg0) / 42);
        class276.method1856((byte) 48);
        ++field2507;
    }

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "(II)I")
    public static final int method1151(int arg0, int arg1) {
        ++field2515;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 + arg0;
        int var4 = 40960 - -(arg1 * var3 >> 12);
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
    public class177() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(IIII)I")
    public static final int method1152(int arg0, int arg1, int arg2, int arg3) {
        int var4 = -48 % ((arg3 - 68) / 38);
        ++field2510;
        if (arg2 >= arg0) {
            return arg2 <= arg1 ? arg2 : arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)V")
    public static final void method1153(int arg0) {
        class31.field445.method1222(0);
        int var1 = 65 % ((8 - arg0) / 57);
        class88.field1352.method1024(false);
        ++field2512;
        class258.field3912.method1024(false);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        ++field2506;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -4) {
                    this.field2508 = arg1.method760(false);
                }
            } else {
                this.field2509 = arg1.method760(false);
            }
        } else {
            this.field2511 = arg1.method760(false);
        }
        if (arg0 != -1) {
            this.field2508 = 92;
        }
    }
}
