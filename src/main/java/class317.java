import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public abstract class class317 extends class183 {

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "[Llf;")
    public class317[] field4842;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "Z")
    public boolean field4835;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
    public static int field4837 = -1;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "Ljava/lang/String;")
    public static String field4846 = "Created gameworld";

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "[I")
    public static int[] field4851 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public int field4830;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "Loj;")
    public class196 field4847;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "Lgl;")
    public class236 field4840;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "[I")
    public static int[] field4836;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V", line = 7)
    public static final void method2221(int arg0) {
        field4831++;
        if (!class275.field4130) {
            return;
        }
        class290.field4336 = null;
        class103.field1405 = null;
        if (arg0 != 14513) {
            field4851 = (int[]) null;
        }
        class275.field4130 = false;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)J", line = 30)
    public static final long method2222(int arg0, int arg1, int arg2) {
        class202 var3 = class142.field1940[arg0][arg1][arg2];
        return var3 == null || var3.field2869 == null ? 0L : var3.field2869.field4580;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V", line = 39)
    public static void method2223(int arg0) {
        field4846 = null;
        field4836 = null;
        if (arg0 != 21150) {
            method2228((byte) 36);
        }
        field4851 = null;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)I", line = 56)
    public int method990(int arg0) {
        field4841++;
        return arg0 >= -100 ? -35 : -1;
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V", line = 68)
    public void method546(int arg0) {
        if (arg0 != -21522) {
            method2226((byte) 98, (String) null);
        }
        field4838++;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZII)V", line = 82)
    public final void method2224(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.field4830 = 101;
        }
        int var4 = this.field4830 == 255 ? arg2 : this.field4830;
        field4845++;
        if (this.field4835) {
            this.field4847 = new class196(var4, arg2, arg1);
        } else {
            this.field4840 = new class236(var4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lcg;II)V", line = 103)
    public void method60(class316 arg0, int arg1, int arg2) {
        field4844++;
        int var4 = -28 / ((-arg1 - 17) / 40);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BII)[I", line = 121)
    public final int[] method2225(byte arg0, int arg1, int arg2) {
        if (arg0 != 66) {
            field4837 = -55;
        }
        field4843++;
        return this.field4842[arg1].field4835 ? this.field4842[arg1].method140(542, arg2) : this.field4842[arg1].method53(-97, arg2)[0];
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLjava/lang/String;)V", line = 142)
    public static final void method2226(byte arg0, String arg1) {
        System.out.println("Error: " + class103.method761(-6399, arg1, "\n", "%0a"));
        if (arg0 <= 62) {
            method2223(-12);
        }
        field4852++;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)[[I", line = 157)
    public int[][] method53(int arg0, int arg1) {
        field4848++;
        int var3 = 117 % ((-arg0 - 31) / 37);
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)[I", line = 169)
    public int[] method140(int arg0, int arg1) {
        field4849++;
        if (arg0 != 542) {
            this.field4830 = -61;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)I", line = 180)
    public int method377(int arg0) {
        if (arg0 != 14118) {
            this.method60((class316) null, -123, 122);
        }
        field4833++;
        return -1;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(III)[[I", line = 199)
    public final int[][] method2227(int arg0, int arg1, int arg2) {
        field4834++;
        if (arg1 <= 9) {
            field4837 = -128;
        }
        if (!this.field4842[arg0].field4835) {
            return this.field4842[arg0].method53(108, arg2);
        }
        int[][] var4 = new int[3][];
        int[] var5 = this.field4842[arg0].method140(542, arg2);
        var4[2] = var5;
        var4[0] = var5;
        var4[1] = var5;
        return var4;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V", line = 234)
    public void method379(boolean arg0) {
        field4850++;
        if (!arg0) {
            return;
        }
        if (this.field4835) {
            this.field4847.method1384(-23561);
            this.field4847 = null;
        } else {
            this.field4840.method1626((byte) 88);
            this.field4840 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)Lth;", line = 261)
    public static final class143 method2228(byte arg0) {
        field4832++;
        if (arg0 != -60) {
            field4846 = (String) null;
        }
        class143 var1 = (class143) class315.field4745.method442(-74);
        if (var1 != null) {
            var1.method1274((byte) -26);
            var1.method206(arg0 ^ 0x3B);
            return var1;
        }
        class143 var2;
        do {
            var2 = (class143) class187.field2581.method442(-80);
            if (var2 == null) {
                return null;
            }
            if (var2.method1039(76) > class29.method174(27763)) {
                return null;
            }
            var2.method1274((byte) -26);
            var2.method206(arg0 ^ 0x3B);
        } while ((var2.field414 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(IZ)V", line = 300)
    public class317(int arg0, boolean arg1) {
        this.field4842 = new class317[arg0];
        this.field4835 = arg1;
    }
}
