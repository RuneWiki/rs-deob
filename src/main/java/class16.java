import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class16 extends class227 {

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "[I")
    private int[] field222 = new int[this.field3612];

    @OriginalMember(owner = "client!ml", name = "M", descriptor = "Lba;")
    public static class53 field230 = new class53(128);

    @OriginalMember(owner = "client!ml", name = "O", descriptor = "S")
    public static short field231 = 32767;

    @OriginalMember(owner = "client!ml", name = "P", descriptor = "Ljava/lang/String;")
    public static String field232 = "Select";

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "I")
    private int field221;

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "I")
    private int field224;

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!ml", name = "J", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!ml", name = "K", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!ml", name = "L", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "[B")
    private byte[] field225;

    @OriginalMember(owner = "client!ml", name = "Q", descriptor = "[I")
    public static int[] field233;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IB)V", line = 8)
    public void method130(int arg0, byte arg1) {
        field227++;
        this.field225[this.field221++] = (byte) (class270.method1860(127, arg1 >> 1) + 127);
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V", line = 17)
    public final void method131(int arg0) {
        this.field221 = 0;
        field220++;
        this.field224 = 0;
        int var2 = -52 / ((79 - arg0) / 35);
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(IIIIIF)V", line = 27)
    public class16(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field3612; var7++) {
            this.field222[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V", line = 46)
    public static void method132(int arg0) {
        field233 = null;
        if (arg0 == 1) {
            field230 = null;
            field232 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILl;)V", line = 59)
    public static final void method133(int arg0, class133 arg1) {
        if (arg0 == 1) {
            field226++;
            class192.field2882 = arg1;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(III)V", line = 73)
    public final void method134(int arg0, int arg1, int arg2) {
        this.field224 += this.field222[arg0] * arg2 >> 12;
        if (arg1 <= 44) {
            field231 = -95;
        }
        field223++;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIII)Z", line = 83)
    public static final boolean method135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class201.field3010[arg0][var8][var9] == -class331.field5159) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class218.field3321[arg0][arg1][arg3] + arg5;
            if (!class216.method1528(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class216.method1528(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class216.method1528(var10, var12, var14)) {
                return false;
            } else if (class216.method1528(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class338.method2351(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class216.method1528(var6 + 1, class218.field3321[arg0][arg1][arg3] + arg5, var7 + 1) && class216.method1528(var6 + 128 - 1, class218.field3321[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class216.method1528(var6 + 128 - 1, class218.field3321[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class216.method1528(var6 + 1, class218.field3321[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)V", line = 144)
    public final void method136(int arg0) {
        this.field224 = Math.abs(this.field224);
        field229++;
        if (this.field224 >= 4096) {
            this.field224 = 4095;
        }
        this.method130(this.field221++, (byte) (this.field224 >> 4));
        if (arg0 != -26370) {
            this.field221 = 41;
        }
        this.field224 = 0;
    }
}
