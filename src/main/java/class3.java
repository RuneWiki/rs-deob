import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class3 extends class27 {

    @OriginalMember(owner = "client!el", name = "M", descriptor = "I")
    private int field92 = 1024;

    @OriginalMember(owner = "client!el", name = "S", descriptor = "I")
    private int field98 = 2048;

    @OriginalMember(owner = "client!el", name = "ab", descriptor = "I")
    private int field106 = 3072;

    @OriginalMember(owner = "client!el", name = "V", descriptor = "I")
    public static int field101 = 0;

    @OriginalMember(owner = "client!el", name = "Z", descriptor = "Lth;")
    public static class57 field105 = new class57(30);

    @OriginalMember(owner = "client!el", name = "U", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!el", name = "W", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!el", name = "X", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!el", name = "K", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!el", name = "N", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!el", name = "O", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!el", name = "P", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!el", name = "Q", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!el", name = "R", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!el", name = "T", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!el", name = "Y", descriptor = "Lph;")
    public static class361 field104;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "(B)Z", line = 6)
    public static final boolean method15(byte arg0) {
        field95++;
        if (class141.field2031) {
            return true;
        } else {
            if (arg0 != 93) {
                method15((byte) -12);
            }
            return class11.field176;
        }
    }

    @OriginalMember(owner = "client!el", name = "g", descriptor = "(I)V", line = 21)
    public static final void method16(int arg0) {
        if (arg0 < 125) {
            field104 = (class361) null;
        }
        if (class308.field4598 != -1) {
            class186.method1290(-1, -1, false, (byte) 107, class308.field4598);
            class308.field4598 = -1;
        }
        field97++;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIZ)Ljava/lang/String;", line = 37)
    public static final String method17(int arg0, int arg1, int arg2, boolean arg3) {
        field99++;
        if (arg2 != 87) {
            return (String) null;
        } else if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        } else if (arg3 && arg1 >= 0) {
            int var4 = arg1 / arg0;
            int var5 = 2;
            while (var4 != 0) {
                var4 /= arg0;
                var5++;
            }
            char[] var6 = new char[var5];
            var6[0] = '+';
            for (int var7 = var5 - 1; var7 > 0; var7--) {
                int var8 = arg1;
                arg1 /= arg0;
                int var9 = var8 - arg0 * arg1;
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V", line = 216)
    public class3() {
        super(1, false);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IB)[I", line = 100)
    public final int[] method18(int arg0, byte arg1) {
        field91++;
        int[] var3 = this.field375.method2087(-59, arg0);
        if (arg1 != -62) {
            field105 = (class57) null;
        }
        if (this.field375.field4382) {
            int[] var4 = this.method164(arg0, 103, 0);
            for (int var5 = 0; var5 < class209.field3053; var5++) {
                var3[var5] = (var4[var5] * this.field98 >> 12) + this.field92;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)[[I", line = 128)
    public final int[][] method19(int arg0, int arg1) {
        field96++;
        int[][] var3 = this.field379.method668(arg1, 0);
        if (this.field379.field1171) {
            int[][] var4 = this.method168(0, 112, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[1];
            int[] var8 = var4[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class209.field3053; var11++) {
                var9[var11] = (var5[var11] * this.field98 >> 12) + this.field92;
                var7[var11] = (var8[var11] * this.field98 >> 12) + this.field92;
                var10[var11] = (var6[var11] * this.field98 >> 12) + this.field92;
            }
        }
        if (arg0 != -28941) {
            method24(-74, -126, -38, -27, -123);
        }
        return var3;
    }

    @OriginalMember(owner = "client!el", name = "f", descriptor = "(B)V", line = 179)
    public static void method20(byte arg0) {
        field105 = null;
        if (arg0 != -44) {
            method16(110);
        }
        field104 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 190)
    public static final void method21(byte arg0, Component arg1) {
        arg1.removeMouseListener(class255.field3805);
        field102++;
        arg1.removeMouseMotionListener(class255.field3805);
        if (arg0 == 50) {
            arg1.removeFocusListener(class255.field3805);
            class181.field2619 = 0;
        }
    }

    @OriginalMember(owner = "client!el", name = "f", descriptor = "(I)V", line = 205)
    public final void method22(int arg0) {
        field100++;
        if (arg0 > -63) {
            this.method22(5);
        }
        this.field98 = this.field106 - this.field92;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILsb;I)V", line = 235)
    public final void method23(int arg0, class190 arg1, int arg2) {
        if (arg2 == 0) {
            this.field92 = arg1.method1317((byte) 108);
        } else if (arg2 == 1) {
            this.field106 = arg1.method1317((byte) 45);
        } else if (arg2 == 2) {
            this.field376 = arg1.method1319(255) == 1;
        }
        if (arg0 != -5836) {
            this.field92 = -13;
        }
        field94++;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIII)V", line = 275)
    public static final void method24(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field103++;
        if (class355.field5452 <= arg2 && class348.field5378 >= arg2) {
            int var5 = class251.method1840((byte) 107, class261.field3911, class326.field4901, arg3);
            int var6 = class251.method1840((byte) 107, class261.field3911, class326.field4901, arg1);
            class310.method2179(arg2, 116, arg4, var6, var5);
        }
        if (arg0 != -30302) {
            field104 = (class361) null;
        }
    }
}
