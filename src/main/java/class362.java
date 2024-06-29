import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class362 extends class27 {

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "J")
    public static long field5741 = 0L;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "I")
    public static int field5742 = -1;

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "B")
    public static byte field5748;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V", line = 4)
    public class362() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIB)V", line = 10)
    public static final void method2545(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (class355.field5452 <= (arg1 - arg2) && class348.field5378 >= (arg1 + arg2) && (arg0 - arg2) >= class326.field4901 && arg0 + arg2 <= class261.field3911) {
            class353.method2460(arg0, arg4 - 4, arg3, arg1, arg2);
        } else {
            class55.method450(arg3, arg2, 8257, arg0, arg1);
        }
        if (arg4 == 5) {
            field5743++;
        }
    }

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)I", line = 27)
    public static final int method2546(int arg0) {
        field5747++;
        if (class240.field3566) {
            return 0;
        } else if (class3.method15((byte) 93)) {
            if (arg0 != 1) {
                field5741 = -3L;
            }
            return class197.field2863 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)[I", line = 61)
    public final int[] method18(int arg0, byte arg1) {
        int[] var3 = this.field375.method2087(-111, arg0);
        field5745++;
        if (this.field375.field4382) {
            class84.method690(var3, 0, class209.field3053, class215.field3175[arg0]);
        }
        if (arg1 != -62) {
            method2545(111, -54, 100, -87, (byte) 22);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(III)Z", line = 78)
    public static final boolean method2547(int arg0, int arg1, int arg2) {
        int var3 = class272.field4125[arg0][arg1][arg2];
        if (-class252.field3742 == var3) {
            return false;
        } else if (class252.field3742 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class175.method1224(var4 + 1, class132.field1930[arg0][arg1][arg2], var5 + 1) && class175.method1224(var4 + 128 - 1, class132.field1930[arg0][arg1 + 1][arg2], var5 + 1) && class175.method1224(var4 + 128 - 1, class132.field1930[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class175.method1224(var4 + 1, class132.field1930[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class272.field4125[arg0][arg1][arg2] = class252.field3742;
                return true;
            } else {
                class272.field4125[arg0][arg1][arg2] = -class252.field3742;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "(I)V", line = 109)
    public static final void method2548(int arg0) {
        field5744++;
        class342.method2387(class93.field1299, 86);
        int var1 = (class272.field4123 >> 3) + (class137.field1991 >> 10);
        int var2 = (class166.field2385 >> 10) + (class202.field2968 >> 3);
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 18;
        class296.field4445 = new byte[var5][];
        class85.field1201 = new int[var5];
        class208.field3041 = new byte[var5][];
        byte var6 = 8;
        class178.field2560 = new byte[var5][];
        class57.field842 = new int[var5];
        class312.field4655 = new int[var5];
        class333.field5155 = new byte[var5][];
        class219.field3275 = new byte[var5][];
        class57.field830 = new int[var5][4];
        class98.field1390 = new int[var5];
        class312.field4642 = new int[var5];
        class12.field185 = new int[var5];
        int var7 = 0;
        for (int var8 = (arg0 + var1) / 8; var8 <= ((var1 + 6) / 8); var8++) {
            for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                int var10 = (var8 << 8) + var9;
                class85.field1201[var7] = var10;
                class312.field4655[var7] = class244.field3640.method2505("m" + var8 + "_" + var9, (byte) -84);
                class12.field185[var7] = class244.field3640.method2505("l" + var8 + "_" + var9, (byte) 127);
                class312.field4642[var7] = class244.field3640.method2505("n" + var8 + "_" + var9, (byte) 120);
                class98.field1390[var7] = class244.field3640.method2505("um" + var8 + "_" + var9, (byte) 117);
                class57.field842[var7] = class244.field3640.method2505("ul" + var8 + "_" + var9, (byte) -80);
                if (class312.field4642[var7] == -1) {
                    class312.field4655[var7] = -1;
                    class12.field185[var7] = -1;
                    class98.field1390[var7] = -1;
                    class57.field842[var7] = -1;
                }
                var7++;
            }
        }
        for (int var11 = var7; var11 < class312.field4642.length; var11++) {
            class312.field4642[var11] = -1;
            class312.field4655[var11] = -1;
            class12.field185[var11] = -1;
            class98.field1390[var11] = -1;
            class57.field842[var11] = -1;
        }
        class321.method2236(var4, true, var1, false, var6, var3, var2, -92);
    }
}
