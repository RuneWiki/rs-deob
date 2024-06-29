import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class class190 extends class27 {

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "S")
    public short field2632;

    @OriginalMember(owner = "client!ia", name = "N", descriptor = "I")
    public static int field2639 = 0;

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "I")
    public static int field2640 = 0;

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!ia", name = "M", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "Ljava/awt/Frame;")
    public static Frame field2630;

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "[I")
    public static int[] field2629;

    @OriginalMember(owner = "client!ia", name = "L", descriptor = "[[B")
    public static byte[][] field2637;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "(I)V", line = 8)
    public static void method1249(int arg0) {
        field2630 = null;
        field2637 = null;
        field2629 = null;
        if (arg0 != 2) {
            method1252((byte) 66);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)I", line = 22)
    public static final int method1250(int arg0, int arg1) {
        if (arg0 != -22670) {
            field2637 = null;
        }
        ++field2631;
        return arg1 & 255;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 33)
    public static final String method1251(String arg0, byte arg1) {
        ++field2634;
        if (class58.field736.startsWith("win")) {
            return arg0 + ".dll";
        } else if (class58.field736.startsWith("linux")) {
            return "lib" + arg0 + ".so";
        } else if (class58.field736.startsWith("mac")) {
            return "lib" + arg0 + ".dylib";
        } else {
            if (arg1 >= -18) {
                method1250(65, -120);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(B)[Lfn;", line = 57)
    public static final class286[] method1252(byte arg0) {
        ++field2628;
        if (arg0 < 75) {
            field2639 = -41;
        }
        return new class286[] { class461.field6037, class409.field5371, class668.field9492 };
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([Lqea;B)I", line = 69)
    public final int method170(class392[] arg0, byte arg1) {
        ++field2636;
        int var3 = super.field398 >> class62.field762;
        int var4 = super.field397 >> class62.field762;
        int var5 = 0;
        if (class501.field6888 == var3) {
            ++var5;
        } else if (var3 > class501.field6888) {
            var5 += 2;
        }
        if (~class377.field4997 == ~var4) {
            var5 += 3;
        } else if (~var4 > ~class377.field4997) {
            var5 += 6;
        }
        int var6 = class478.field6647[var5];
        if ((this.field2632 & var6) != 0) {
            return this.method178(var3, arg0, 1, var4);
        } else if (~this.field2632 == -2 && var3 > 0) {
            return this.method178(var3 + -1, arg0, 1, var4);
        } else if (this.field2632 == 4 && ~var3 >= ~class329.field4421) {
            return this.method178(var3 - -1, arg0, 1, var4);
        } else if (~this.field2632 == -9 && ~var4 < -1) {
            return this.method178(var3, arg0, 1, var4 + -1);
        } else if (~this.field2632 == -3 && ~class641.field8846 <= ~var4) {
            return this.method178(var3, arg0, 1, var4 + 1);
        } else {
            if (arg1 < 9) {
                method1251((String) null, (byte) -5);
            }
            if (this.field2632 == 16 && ~var3 < -1 && ~class641.field8846 <= ~var4) {
                return this.method178(var3 + -1, arg0, 1, var4 - -1);
            } else if (~this.field2632 == -33 && class329.field4421 >= var3 && ~class641.field8846 <= ~var4) {
                return this.method178(var3 + 1, arg0, 1, var4 - -1);
            } else if (~this.field2632 == -129 && var3 > 0 && ~var4 < -1) {
                return this.method178(var3 + -1, arg0, 1, var4 + -1);
            } else if (~this.field2632 == -65 && ~class329.field4421 <= ~var3 && ~var4 < -1) {
                return this.method178(var3 + 1, arg0, 1, var4 + -1);
            } else {
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)Z", line = 151)
    public final boolean method171(boolean arg0) {
        ++field2641;
        if (arg0) {
            this.field2632 = 90;
        }
        return class165.field2371[(super.field398 >> class62.field762) + class312.field4204 - class501.field6888][(super.field397 >> class62.field762) - class377.field4997 + class312.field4204];
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Llr;ZZIBILlr;)I", line = 164)
    public static final int method1253(class277 arg0, boolean arg1, boolean arg2, int arg3, byte arg4, int arg5, class277 arg6) {
        ++field2633;
        if (arg4 < 33) {
            field2639 = 86;
        }
        int var7 = class97.method547(arg2, arg0, arg5, arg6, -24532);
        if (var7 != 0) {
            return !arg2 ? var7 : -var7;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var8 = class97.method547(arg1, arg0, arg3, arg6, -24532);
            return !arg1 ? var8 : -var8;
        }
    }

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "(I)Z", line = 195)
    public final boolean method164(int arg0) {
        int var2 = -50 / ((-42 - arg0) / 58);
        ++field2635;
        return class426.method2413(super.field386, super.field398 >> class62.field762, false, super.field397 >> class62.field762, this);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZ)V", line = 207)
    public static final void method1254(int arg0, boolean arg1) {
        ++field2638;
        if (~arg0 != 0) {
            if (class4.field29[arg0]) {
                class419.field5508.method1957((byte) -68, arg0);
                class124.field1729[arg0] = null;
                class651.field9139[arg0] = null;
                class4.field29[arg0] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(IIIIII)V", line = 224)
    public class190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2632 = (short) arg5;
        super.field386 = (byte) arg4;
        super.field385 = (byte) arg3;
        super.field398 = arg0;
        super.field388 = arg1;
        super.field397 = arg2;
    }
}
