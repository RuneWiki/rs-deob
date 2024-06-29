import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class286 extends class383 implements class196 {

    @OriginalMember(owner = "client!kp", name = "D", descriptor = "Llf;")
    public class383 field4270;

    @OriginalMember(owner = "client!kp", name = "q", descriptor = "[I")
    public static int[] field4257 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!kp", name = "t", descriptor = "I")
    public static int field4260 = -1;

    @OriginalMember(owner = "client!kp", name = "w", descriptor = "Z")
    public static boolean field4263 = false;

    @OriginalMember(owner = "client!kp", name = "y", descriptor = "I")
    public static int field4265 = -1;

    @OriginalMember(owner = "client!kp", name = "s", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field4259 = new Rectangle[100];

    @OriginalMember(owner = "client!kp", name = "z", descriptor = "Lvr;")
    public static class306 field4266 = new class306();

    @OriginalMember(owner = "client!kp", name = "G", descriptor = "I")
    public static int field4273 = -1;

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!kp", name = "o", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!kp", name = "p", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!kp", name = "r", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!kp", name = "u", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!kp", name = "v", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!kp", name = "x", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!kp", name = "A", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!kp", name = "B", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!kp", name = "C", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!kp", name = "E", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!kp", name = "F", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!kp", name = "H", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIILqa;)Z", line = 6)
    public final boolean method56(int arg0, int arg1, int arg2, class496 arg3) {
        field4262++;
        if (arg1 != 3) {
            this.field4270 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "(I)Z", line = 20)
    public final boolean method49(int arg0) {
        if (arg0 == 7) {
            field4268++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "(I)V", line = 31)
    public final void method57(int arg0) {
        if (arg0 != -5077) {
            method1861((byte) 113);
        }
        field4272++;
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(B)Z", line = 41)
    public final boolean method60(byte arg0) {
        field4271++;
        return arg0 > -108;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lqv;BLqa;IZII)V", line = 53)
    public final void method61(class49 arg0, byte arg1, class496 arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg1 == 118) {
            field4252++;
        }
    }

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "(I)V", line = 66)
    public static final void method1858(int arg0) {
        field4274++;
        if (arg0 != 29217) {
            method1859(-47);
        }
        for (class309 var1 = (class309) class255.field3530.method1970(64); var1 != null; var1 = (class309) class255.field3530.method1960(24)) {
            if (var1.field4626 > 0) {
                var1.field4626--;
            }
            if (var1.field4626 != 0) {
                if (var1.field4631 > 0) {
                    var1.field4631--;
                }
                if (var1.field4631 == 0 && var1.field4623 >= 1 && var1.field4636 >= 1 && (class96.field1403 - 2) >= var1.field4623 && (class485.field7122 - 2) >= var1.field4636 && (var1.field4637 < 0 || class415.method2518((byte) -13, var1.field4633, var1.field4637))) {
                    class309.method1991(-1, var1.field4636, var1.field4632, var1.field4624, var1.field4637, var1.field4633, var1.field4635, var1.field4623, -29070);
                    var1.field4631 = -1;
                    if (var1.field4637 == var1.field4634 && var1.field4634 == -1) {
                        var1.method2785((byte) -120);
                    } else if (var1.field4637 == var1.field4634 && var1.field4632 == var1.field4629 && var1.field4633 == var1.field4628) {
                        var1.method2785((byte) -120);
                    }
                }
            } else if (var1.field4634 < 0 || class415.method2518((byte) -13, var1.field4628, var1.field4634)) {
                class309.method1991(-1, var1.field4636, var1.field4629, var1.field4624, var1.field4634, var1.field4628, var1.field4635, var1.field4623, -29070);
                var1.method2785((byte) -120);
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "(I)V", line = 123)
    public static void method1859(int arg0) {
        if (arg0 > -53) {
            field4265 = -119;
        }
        field4257 = null;
        field4266 = null;
        field4259 = null;
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)I", line = 136)
    public final int method66(int arg0) {
        field4261++;
        return arg0 == -7234 ? 0 : 61;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)I", line = 151)
    public final int method63(byte arg0) {
        if (arg0 == 63) {
            field4255++;
            return 0;
        } else {
            return 114;
        }
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(BLqa;)V", line = 165)
    public final void method62(byte arg0, class496 arg1) {
        if (arg0 == -126) {
            field4269++;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(BLqa;)V", line = 176)
    public final void method55(byte arg0, class496 arg1) {
        if (arg0 >= -31) {
            this.method62((byte) 41, null);
        }
        field4256++;
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(B)V", line = 199)
    public final void method59(byte arg0) {
        field4254++;
        int var2 = 118 % ((27 - arg0) / 63);
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(IIILlf;)V", line = 213)
    public class286(int arg0, int arg1, int arg2, class383 arg3) {
        super(arg0, arg1, arg2, false, false);
        this.field4270 = arg3;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILqa;)V", line = 221)
    public final void method67(int arg0, class496 arg1) {
        int var3 = 67 / ((59 - arg0) / 60);
        field4253++;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)I", line = 230)
    public static int method1860(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)I", line = 237)
    public final int method50(int arg0) {
        if (arg0 == 25707) {
            field4258++;
            return 0;
        } else {
            return 60;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILqa;B)Lc;", line = 248)
    public final class201 method53(int arg0, class496 arg1, byte arg2) {
        field4264++;
        int var4 = -64 / ((arg2 + 62) / 39);
        return null;
    }

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "(B)J", line = 258)
    public static final long method1861(byte arg0) {
        field4251++;
        int var1 = 59 / ((arg0 - 57) / 39);
        return class211.field2976.method334((byte) 56);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lqa;I)Lpj;", line = 269)
    public final class507 method51(class496 arg0, int arg1) {
        if (arg1 != -150) {
            this.method60((byte) 107);
        }
        field4267++;
        return null;
    }
}
