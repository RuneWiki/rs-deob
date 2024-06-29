import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class85 extends class115 {

    @OriginalMember(owner = "client!as", name = "O", descriptor = "I")
    private int field952 = 4096;

    @OriginalMember(owner = "client!as", name = "U", descriptor = "I")
    private int field958 = 8192;

    @OriginalMember(owner = "client!as", name = "R", descriptor = "I")
    private int field955 = 2048;

    @OriginalMember(owner = "client!as", name = "S", descriptor = "I")
    private int field956 = 12288;

    @OriginalMember(owner = "client!as", name = "N", descriptor = "I")
    private int field951 = 0;

    @OriginalMember(owner = "client!as", name = "Z", descriptor = "I")
    private int field963 = 0;

    @OriginalMember(owner = "client!as", name = "Y", descriptor = "I")
    private int field962 = 2048;

    @OriginalMember(owner = "client!as", name = "J", descriptor = "Ljava/lang/String;")
    public static String field948 = "scroll:";

    @OriginalMember(owner = "client!as", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field964 = "glow2:";

    @OriginalMember(owner = "client!as", name = "bb", descriptor = "I")
    public static int field965 = -60;

    @OriginalMember(owner = "client!as", name = "K", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!as", name = "P", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!as", name = "Q", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!as", name = "T", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!as", name = "V", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!as", name = "W", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!as", name = "X", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!as", name = "M", descriptor = "Ljava/lang/String;")
    public static String field950;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(II)[I", line = 3)
    public final int[] method57(int arg0, int arg1) {
        ++field954;
        int[] var3 = super.field1340.method14(arg1 + 28, arg0);
        if (super.field1340.field35) {
            int var4 = class193.field2634[arg0] - 2048;
            for (int var5 = 0; var5 < class218.field2979; ++var5) {
                int var6 = class43.field530[var5] + -2048;
                int var7 = this.field955 + var6;
                int var8 = var7 >= -2048 ? var7 : var7 + 4096;
                int var9 = var8 > 2048 ? var8 + -4096 : var8;
                int var10 = this.field963 + var4;
                int var11 = ~var10 > 2047 ? var10 + 4096 : var10;
                int var12 = var11 > 2048 ? var11 - 4096 : var11;
                int var13 = var6 - -this.field951;
                int var14 = var13 >= -2048 ? var13 : var13 + 4096;
                int var15 = ~var14 < -2049 ? var14 + -4096 : var14;
                int var16 = this.field962 + var4;
                int var17 = var16 >= -2048 ? var16 : var16 - -4096;
                int var18 = var17 > 2048 ? var17 + -4096 : var17;
                var3[var5] = !this.method465(var9, 82, var12) && !this.method463(var15, var18, -1) ? 0 : 4096;
            }
        }
        if (arg1 != 0) {
            this.method149((byte) -102, (class211) null, 57);
        }
        return var3;
    }

    @OriginalMember(owner = "client!as", name = "h", descriptor = "(I)V", line = 54)
    public static void method461(int arg0) {
        field950 = null;
        field964 = null;
        if (arg0 != 0) {
            method462(103);
        }
        field948 = null;
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "()V", line = 70)
    public class85() {
        super(0, true);
    }

    @OriginalMember(owner = "client!as", name = "i", descriptor = "(I)I", line = 75)
    public static final int method462(int arg0) {
        ++field949;
        if (arg0 != -2048) {
            field948 = null;
        }
        return class257.field3507;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(III)Z", line = 97)
    private final boolean method463(int arg0, int arg1, int arg2) {
        ++field957;
        int var4 = (arg0 + arg1) * this.field956 >> 12;
        int var5 = class63.field726[var4 * 255 >> 12 & 255];
        if (arg2 != -1) {
            method464(19);
        }
        int var6 = (var5 << 12) / this.field956;
        int var7 = (var6 << 12) / this.field958;
        int var8 = this.field952 * var7 >> 12;
        return -arg0 + arg1 < var8 && -var8 < -arg0 + arg1;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(BLbk;I)V", line = 121)
    public final void method149(byte arg0, class211 arg1, int arg2) {
        ++field960;
        if (arg0 < 83) {
            this.method57(8, -8);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (arg2 == 6) {
                                    this.field958 = arg1.method1355(32136);
                                }
                            } else {
                                this.field952 = arg1.method1355(32136);
                            }
                        } else {
                            this.field956 = arg1.method1355(32136);
                        }
                    } else {
                        this.field962 = arg1.method1355(32136);
                    }
                } else {
                    this.field951 = arg1.method1355(32136);
                }
            } else {
                this.field963 = arg1.method1355(32136);
            }
        } else {
            this.field955 = arg1.method1355(32136);
        }
    }

    @OriginalMember(owner = "client!as", name = "d", descriptor = "(I)V", line = 199)
    public final void method140(int arg0) {
        if (arg0 == 0) {
            class170.method1131(arg0 + 256);
            ++field959;
        }
    }

    @OriginalMember(owner = "client!as", name = "j", descriptor = "(I)V", line = 212)
    public static final void method464(int arg0) {
        class331 var1 = client.field2307;
        synchronized (client.field2307) {
            client.field2307.method2043(-58);
        }
        if (arg0 != 2047) {
            field950 = null;
        }
        ++field961;
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(III)Z", line = 225)
    private final boolean method465(int arg0, int arg1, int arg2) {
        ++field953;
        if (arg1 < 20) {
            return false;
        } else {
            int var4 = (-arg0 + arg2) * this.field956 >> 12;
            int var5 = class63.field726[255 & var4 * 255 >> 12];
            int var6 = (var5 << 12) / this.field956;
            int var7 = (var6 << 12) / this.field958;
            int var8 = this.field952 * var7 >> 12;
            return ~(arg0 + arg2) > ~var8 && -var8 < arg0 + arg2;
        }
    }
}
