import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class181 extends class194 {

    @OriginalMember(owner = "client!aj", name = "M", descriptor = "I")
    private int field2104 = 585;

    @OriginalMember(owner = "client!aj", name = "R", descriptor = "Z")
    public static boolean field2109 = false;

    @OriginalMember(owner = "client!aj", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field2108 = new String[8];

    @OriginalMember(owner = "client!aj", name = "W", descriptor = "I")
    public static int field2114 = 0;

    @OriginalMember(owner = "client!aj", name = "I", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!aj", name = "J", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!aj", name = "K", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!aj", name = "N", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!aj", name = "O", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!aj", name = "T", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!aj", name = "V", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!aj", name = "S", descriptor = "Lph;")
    public static class315 field2110;

    @OriginalMember(owner = "client!aj", name = "P", descriptor = "Lod;")
    public static class399 field2107;

    @OriginalMember(owner = "client!aj", name = "U", descriptor = "Ljava/awt/Image;")
    public static Image field2112;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)V", line = 10)
    public static void method1130(byte arg0) {
        field2108 = null;
        field2110 = null;
        if (arg0 == -8) {
            field2107 = null;
            field2112 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(Z)V", line = 24)
    public static final void method1131(boolean arg0) {
        if (arg0) {
            method1130((byte) 67);
        }
        ++field2101;
        class387.field5287.method2298(0);
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V", line = 82)
    public class181() {
        super(0, true);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIBLwo;)Lfa;", line = 40)
    public static final class347 method1132(int arg0, int arg1, byte arg2, class285 arg3) {
        ++field2105;
        byte[] var4 = arg3.method1794(5860, arg0, arg1);
        if (arg2 != 45) {
            method1133(-84, (byte) -59, -16, 32, -14, 92, -102, 19);
        }
        return var4 == null ? null : new class347(var4);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IILbg;)V", line = 57)
    public final void method54(int arg0, int arg1, class242 arg2) {
        int var4 = 93 / ((arg1 - 52) / 61);
        if (arg0 == 0) {
            this.field2104 = arg2.method1587((byte) -102);
        }
        ++field2106;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IBIIIIII)V", line = 86)
    public static final void method1133(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2103;
        if (arg1 == -122) {
            if (class295.field3937 <= arg6 && ~arg5 >= ~class427.field5844 && ~class53.field624 >= ~arg2 && arg3 <= class118.field1356) {
                class76.method448(arg3, arg0, arg2, arg6, arg4, arg7, 1, arg5);
            } else {
                class208.method1271(arg4, arg5, arg3, 1778909736, arg2, arg7, arg6, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZB)V", line = 114)
    public static final void method1134(boolean arg0, byte arg1) {
        ++field2111;
        int var2 = -37 % ((-76 - arg1) / 44);
        class270.field3485 = arg0;
        class18.field208 = !class98.method602(65280);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)[I", line = 129)
    public final int[] method55(int arg0, int arg1) {
        ++field2102;
        int[] var3 = super.field2292.method1781(arg0, false);
        int var4 = -92 % ((57 - arg1) / 46);
        if (super.field2292.field3708) {
            int var5 = class249.field3283[arg0];
            for (int var6 = 0; var6 < class138.field1579; ++var6) {
                int var7 = class277.field3585[var6];
                if (this.field2104 < var7 && ~(-this.field2104 + 4096) < ~var7 && var5 > -this.field2104 + 2048 && var5 < 2048 - -this.field2104) {
                    int var8 = -var7 + 2048;
                    int var9 = var8 >= 0 ? var8 : -var8;
                    int var10 = var9 << 12;
                    int var11 = var10 / (2048 - this.field2104);
                    var3[var6] = -var11 + 4096;
                } else if (2048 - this.field2104 < var7 && ~var7 > ~(this.field2104 + 2048)) {
                    int var12 = var5 + -2048;
                    int var13 = var12 >= 0 ? var12 : -var12;
                    int var14 = var13 - this.field2104;
                    int var15 = var14 << 12;
                    var3[var6] = var15 / (-this.field2104 + 2048);
                } else if (~this.field2104 >= ~var5 && var5 <= -this.field2104 + 4096) {
                    if (this.field2104 <= var7 && -this.field2104 + 4096 >= var7) {
                        var3[var6] = 0;
                    } else {
                        int var16 = -var5 + 2048;
                        int var17 = var16 < 0 ? -var16 : var16;
                        int var18 = var17 << 12;
                        int var19 = var18 / (-this.field2104 + 2048);
                        var3[var6] = -var19 + 4096;
                    }
                } else {
                    int var20 = var7 - 2048;
                    int var21 = var20 < 0 ? -var20 : var20;
                    int var22 = var21 - this.field2104;
                    int var23 = var22 << 12;
                    var3[var6] = var23 / (-this.field2104 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IB)I", line = 208)
    public static final int method1135(int arg0, byte arg1) {
        ++field2113;
        if (arg1 > -125) {
            field2110 = null;
        }
        return 127 & arg0;
    }
}
