import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class30 extends class346 {

    @OriginalMember(owner = "client!al", name = "O", descriptor = "I")
    private int field490 = 12288;

    @OriginalMember(owner = "client!al", name = "S", descriptor = "I")
    private int field494 = 0;

    @OriginalMember(owner = "client!al", name = "T", descriptor = "I")
    private int field495 = 2048;

    @OriginalMember(owner = "client!al", name = "W", descriptor = "I")
    private int field498 = 4096;

    @OriginalMember(owner = "client!al", name = "Z", descriptor = "I")
    private int field501 = 8192;

    @OriginalMember(owner = "client!al", name = "bb", descriptor = "I")
    private int field503 = 0;

    @OriginalMember(owner = "client!al", name = "cb", descriptor = "I")
    private int field504 = 2048;

    @OriginalMember(owner = "client!al", name = "M", descriptor = "[Ljava/lang/String;")
    public static String[] field488 = new String[200];

    @OriginalMember(owner = "client!al", name = "H", descriptor = "I")
    public static int field484 = 0;

    @OriginalMember(owner = "client!al", name = "X", descriptor = "I")
    public static int field499 = -1;

    @OriginalMember(owner = "client!al", name = "V", descriptor = "Luc;")
    public static class51 field497 = new class51(64);

    @OriginalMember(owner = "client!al", name = "I", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!al", name = "K", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!al", name = "L", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!al", name = "N", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!al", name = "P", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!al", name = "Q", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!al", name = "R", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!al", name = "U", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!al", name = "Y", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!al", name = "ab", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lfb;ZI)V", line = 7)
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (~arg2 != -3) {
                        if (arg2 != 3) {
                            if (~arg2 != -5) {
                                if (arg2 != 5) {
                                    if (~arg2 == -7) {
                                        this.field501 = arg0.method2239(-1076227960);
                                    }
                                } else {
                                    this.field498 = arg0.method2239(-1076227960);
                                }
                            } else {
                                this.field490 = arg0.method2239(-1076227960);
                            }
                        } else {
                            this.field504 = arg0.method2239(-1076227960);
                        }
                    } else {
                        this.field494 = arg0.method2239(-1076227960);
                    }
                } else {
                    this.field503 = arg0.method2239(-1076227960);
                }
            } else {
                this.field495 = arg0.method2239(-1076227960);
            }
            ++field496;
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V", line = 113)
    public class30() {
        super(0, true);
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(BII)Z", line = 94)
    private final boolean method236(byte arg0, int arg1, int arg2) {
        ++field493;
        int var4 = (arg1 + arg2) * this.field490 >> 12;
        if (arg0 != -28) {
            return false;
        } else {
            int var5 = class72.field1021[var4 * 255 >> 12 & 255];
            int var6 = (var5 << 12) / this.field490;
            int var7 = (var6 << 12) / this.field501;
            int var8 = this.field498 * var7 >> 12;
            return ~(arg1 - arg2) > ~var8 && -var8 < arg1 - arg2;
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(II)[I", line = 124)
    public final int[] method45(int arg0, int arg1) {
        ++field485;
        if (arg1 != 3) {
            this.method236((byte) 68, -127, 70);
        }
        int[] var3 = super.field5152.method1409((byte) 48, arg0);
        if (super.field5152.field3004) {
            int var4 = class436.field6337[arg0] + -2048;
            for (int var5 = 0; class134.field1753 > var5; ++var5) {
                int var6 = class361.field5340[var5] + -2048;
                int var7 = this.field495 + var6;
                int var8 = var7 < -2048 ? var7 + 4096 : var7;
                int var9 = ~var8 >= -2049 ? var8 : var8 + -4096;
                int var10 = this.field503 + var4;
                int var11 = ~var10 > 2047 ? var10 + 4096 : var10;
                int var12 = ~var11 < -2049 ? var11 + -4096 : var11;
                int var13 = var6 - -this.field494;
                int var14 = ~var13 <= 2047 ? var13 : var13 + 4096;
                int var15 = var14 <= 2048 ? var14 : var14 - 4096;
                int var16 = this.field504 + var4;
                int var17 = var16 < -2048 ? var16 + 4096 : var16;
                int var18 = ~var17 >= -2049 ? var17 : var17 + -4096;
                var3[var5] = !this.method238(var9, var12, (byte) -89) && !this.method236((byte) -28, var18, var15) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(B)V", line = 183)
    public final void method237(byte arg0) {
        if (arg0 > -95) {
            field484 = -102;
        }
        ++field491;
        class431.method2689(256);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIB)Z", line = 195)
    private final boolean method238(int arg0, int arg1, byte arg2) {
        ++field486;
        int var4 = (-arg0 + arg1) * this.field490 >> 12;
        int var5 = -121 / ((-29 - arg2) / 44);
        int var6 = class72.field1021[255 & var4 * 255 >> 12];
        int var7 = (var6 << 12) / this.field490;
        int var8 = (var7 << 12) / this.field501;
        int var9 = this.field498 * var8 >> 12;
        return var9 > arg0 + arg1 && -var9 < arg0 + arg1;
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(Z)V", line = 215)
    public static void method239(boolean arg0) {
        if (!arg0) {
            field497 = null;
        }
        field497 = null;
        field488 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BIII)I", line = 226)
    public static final int method240(byte arg0, int arg1, int arg2, int arg3) {
        ++field502;
        if (arg2 == arg3) {
            return arg3;
        } else {
            int var4 = 75 / ((-20 - arg0) / 38);
            int var5 = -arg1 + 128;
            int var6 = (127 & arg2) * arg1 + (127 & arg3) * var5 >> 7;
            int var7 = (arg2 & 896) * arg1 + (896 & arg3) * var5 >> 7;
            int var8 = (64512 & arg3) * var5 - -((64512 & arg2) * arg1) >> 7;
            return var7 & 896 | var8 & 64512 | var6 & 127;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIII)V", line = 249)
    public static final void method241(int arg0, int arg1, int arg2, int arg3) {
        ++field492;
        String var4 = "tele " + arg2 + "," + (arg3 >> 6) + "," + (arg1 >> 6) + "," + (63 & arg3) + "," + (63 & arg1);
        int var5 = -70 / ((arg0 - -27) / 48);
        System.out.println(var4);
        class185.method1237(var4, true, -128);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "([BII)I", line = 266)
    public static final int method242(byte[] arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            return -61;
        } else {
            ++field500;
            return class9.method70(arg1 + 14133, arg0, arg2, 0);
        }
    }
}
