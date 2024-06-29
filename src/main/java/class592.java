import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class592 extends class175 {

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "I")
    private int field8085 = 0;

    @OriginalMember(owner = "client!kj", name = "F", descriptor = "I")
    private int field8082 = 4096;

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "I")
    private int field8088 = 8192;

    @OriginalMember(owner = "client!kj", name = "Q", descriptor = "I")
    private int field8093 = 2048;

    @OriginalMember(owner = "client!kj", name = "R", descriptor = "I")
    private int field8094 = 0;

    @OriginalMember(owner = "client!kj", name = "N", descriptor = "I")
    private int field8090 = 2048;

    @OriginalMember(owner = "client!kj", name = "P", descriptor = "I")
    private int field8092 = 12288;

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "[I")
    public static int[] field8086 = new int[500];

    @OriginalMember(owner = "client!kj", name = "M", descriptor = "Ljb;")
    public static class519 field8089 = new class519(64, -2);

    @OriginalMember(owner = "client!kj", name = "E", descriptor = "I")
    public static int field8081;

    @OriginalMember(owner = "client!kj", name = "G", descriptor = "I")
    public static int field8083;

    @OriginalMember(owner = "client!kj", name = "H", descriptor = "I")
    public static int field8084;

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "I")
    public static int field8087;

    @OriginalMember(owner = "client!kj", name = "O", descriptor = "I")
    public static int field8091;

    @OriginalMember(owner = "client!kj", name = "T", descriptor = "I")
    public static int field8096;

    @OriginalMember(owner = "client!kj", name = "U", descriptor = "Ljava/awt/Image;")
    public static Image field8097;

    @OriginalMember(owner = "client!kj", name = "S", descriptor = "[I")
    public static int[] field8095;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IBI)Z")
    private final boolean method3328(int arg0, byte arg1, int arg2) {
        ++field8087;
        int var4 = (arg0 + arg2) * this.field8092 >> 12;
        int var5 = class10.field123[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field8092;
        int var7 = (var6 << 12) / this.field8088;
        int var8 = this.field8082 * var7 >> 12;
        int var9 = 90 % ((arg1 - 21) / 60);
        return var8 > -arg0 + arg2 && -var8 < -arg0 + arg2;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZI)[I")
    public final int[] method47(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        } else {
            ++field8083;
            int[] var3 = super.field2310.method91(0, arg1);
            if (super.field2310.field169) {
                int var4 = class456.field6536[arg1] + -2048;
                for (int var5 = 0; ~var5 > ~class598.field8136; ++var5) {
                    int var6 = class693.field9221[var5] - 2048;
                    int var7 = var6 - -this.field8090;
                    int var8 = var7 >= -2048 ? var7 : var7 + 4096;
                    int var9 = ~var8 >= -2049 ? var8 : var8 - 4096;
                    int var10 = this.field8094 + var4;
                    int var11 = var10 >= -2048 ? var10 : var10 - -4096;
                    int var12 = var11 <= 2048 ? var11 : var11 + -4096;
                    int var13 = this.field8085 + var6;
                    int var14 = var13 < -2048 ? var13 + 4096 : var13;
                    int var15 = ~var14 < -2049 ? var14 + -4096 : var14;
                    int var16 = var4 - -this.field8093;
                    int var17 = ~var16 > 2047 ? var16 + 4096 : var16;
                    int var18 = var17 <= 2048 ? var17 : var17 + -4096;
                    var3[var5] = !this.method3331((byte) 87, var12, var9) && !this.method3328(var15, (byte) 83, var18) ? 0 : 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILdt;Z)V")
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        ++field8084;
        if (!arg2) {
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (~arg0 != -3) {
                        if (arg0 != 3) {
                            if (arg0 != 4) {
                                if (~arg0 != -6) {
                                    if (arg0 == 6) {
                                        this.field8088 = arg1.method1728((byte) 90);
                                    }
                                } else {
                                    this.field8082 = arg1.method1728((byte) 87);
                                }
                            } else {
                                this.field8092 = arg1.method1728((byte) 86);
                            }
                        } else {
                            this.field8093 = arg1.method1728((byte) 81);
                        }
                    } else {
                        this.field8085 = arg1.method1728((byte) 64);
                    }
                } else {
                    this.field8094 = arg1.method1728((byte) 26);
                }
            } else {
                this.field8090 = arg1.method1728((byte) 108);
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(Z)V")
    public static void method3329(boolean arg0) {
        field8095 = null;
        if (!arg0) {
            field8097 = null;
            field8089 = null;
            field8086 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method3330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg6 == 13962) {
            ++field8096;
            class497.method2918(arg4, arg7, arg3, arg5, arg2, arg8, arg1, arg0, 0, (byte) 94);
        }
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
    public class592() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V")
    public final void method46(int arg0) {
        class647.method3595((byte) -99);
        if (arg0 == -8) {
            ++field8091;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BII)Z")
    private final boolean method3331(byte arg0, int arg1, int arg2) {
        ++field8081;
        int var4 = (arg1 - arg2) * this.field8092 >> 12;
        int var5 = class10.field123[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field8092;
        int var7 = (var6 << 12) / this.field8088;
        int var8 = this.field8082 * var7 >> 12;
        if (arg0 != 87) {
            this.field8085 = -8;
        }
        return arg1 + arg2 < var8 && ~(arg2 - -arg1) < ~(-var8);
    }
}
