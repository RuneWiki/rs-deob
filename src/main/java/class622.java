import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class622 extends class66 {

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
    public int field8785;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
    public int field8786;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
    public int field8784;

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "Z")
    public boolean field8787;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    public int field8780;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    public int field8783;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "Lko;")
    public static class466 field8779 = new class466();

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "Z")
    public static boolean field8788 = false;

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "I")
    public static int field8790 = 0;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public static int field8777;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    public static int field8778;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
    public static int field8781;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
    public static int field8782;

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "[[B")
    public static byte[][] field8789;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZIIZLjava/lang/String;Ljava/lang/String;I)V")
    public static final void method3606(boolean arg0, int arg1, int arg2, boolean arg3, String arg4, String arg5, int arg6) {
        class304.field4755.field1555 = 1;
        field8777++;
        String var7 = arg5.toLowerCase();
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (arg6 != -1) {
            class638 var11 = class610.field8680.method3566(arg6, -14724);
            if (var11 == null || var11.method3707((byte) -121) != arg3) {
                return;
            }
            if (var11.method3707((byte) -121)) {
                var10 = var11.field8955;
            } else {
                var9 = var11.field8960;
            }
        }
        int var12 = 0;
        for (int var13 = 0; var13 < class91.field1083.field6809; var13++) {
            class117 var16 = class91.field1083.method2859(var13, (byte) 124);
            if ((!arg0 || var16.field1824) && var16.field1815 == -1 && var16.field1879 == -1 && var16.field1820 == 0 && var16.field1869.toLowerCase().indexOf(var7) != -1) {
                if (arg6 != -1) {
                    if (arg3) {
                        if (!arg4.equals(var16.method1055(arg6, -99, var10))) {
                            continue;
                        }
                    } else if (arg2 != var16.method1054(var9, -2, arg6)) {
                        continue;
                    }
                }
                if (var12 >= 250) {
                    class649.field9098 = null;
                    class661.field9221 = -1;
                    return;
                }
                if (var12 >= var8.length) {
                    short[] var17 = new short[var8.length * 2];
                    for (int var18 = 0; var18 < var12; var18++) {
                        var17[var18] = var8[var18];
                    }
                    var8 = var17;
                }
                var8[var12++] = (short) var13;
            }
        }
        class661.field9221 = var12;
        class589.field8379 = 0;
        class649.field9098 = var8;
        if (arg1 < 108) {
            method3608(33);
        }
        String[] var14 = new String[class661.field9221];
        for (int var15 = 0; var15 < class661.field9221; var15++) {
            var14[var15] = class91.field1083.method2859(var8[var15], (byte) 123).field1869;
        }
        class319.method2173(-32, var14, class649.field9098);
        class304.field4755.method929(99);
        class304.field4755.field1555 = 2;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static void method3607(byte arg0) {
        field8789 = null;
        if (arg0 == 62) {
            field8779 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)[Lws;")
    public static final class328[] method3608(int arg0) {
        if (arg0 < 102) {
            return null;
        } else {
            field8781++;
            return new class328[] { class126.field2058, class644.field9058, class147.field2458, class606.field8605, class429.field6542, class180.field3030, class588.field8350, class70.field891, class39.field528, class72.field914, class216.field3558, class499.field7320, class589.field8363, class458.field6851, class161.field2739 };
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
    public static final void method3609(int arg0) {
        field8782++;
        if (class267.field4340 != null) {
            try {
                class267.field4340.close();
            } catch (IOException var1) {
            }
        }
        if (arg0 == 52) {
            class267.field4340 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)I")
    public static final int method3610(byte arg0, int arg1) {
        field8778++;
        int var2 = 0;
        if (arg0 > -124) {
            field8789 = null;
        }
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(IIIIIZ)V")
    public class622(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field8785 = arg3;
        this.field8786 = arg1;
        this.field8784 = arg4;
        this.field8787 = arg5;
        this.field8780 = arg2;
        this.field8783 = arg0;
    }
}
