import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class52 {

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    private int field721 = -1;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    private int field726 = 0;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Lie;")
    private class2 field715 = new class2();

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "Z")
    public boolean field733 = false;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    private int field725;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "[[I")
    private int[][] field716;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    private int field728;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "[Llb;")
    private class221[] field717;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "[I")
    public static int[] field713 = new int[32];

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field714 = 1;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "[I")
    public static int[] field724 = new int[25];

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field722 = 0;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "Lpi;")
    public static class201 field712 = new class201(30);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V")
    public static final void method312(int arg0, int arg1) {
        field723++;
        if (arg1 == 255) {
            class268.field4311.method1416(arg0, 0);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static final void method313(int arg0) {
        class23.field251 = null;
        class293.field4664 = null;
        field720++;
        if (arg0 <= 54) {
            method320(-111, (byte) -98);
        }
        class305.field4935 = null;
        class165.field2537 = null;
        class26.field290 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZIIIIIIZIII)V")
    public static final void method314(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        field731++;
        if (class213.field3139.method1467(0) == 2) {
            class276.method1920(false, arg6, arg8, arg2, arg10, arg9, arg3, arg5, arg1, arg7, arg4);
        } else if (class213.field3139.method1467(0) > 2) {
            class208.method1471(arg9, arg8, arg1, arg10, arg5, (byte) 122, arg4, arg7, arg6, arg2, arg3, class213.field3139.method1467(0));
        } else {
            class200.method1414(arg9, arg8, arg4, arg7, arg5, arg6, 2883848, arg2, arg10, arg3, arg1);
        }
        if (arg0) {
            method322(-0.7015501355321414D, true);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method315(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 > -12) {
            method322(0.8795999984973261D, false);
        }
        field711++;
        if (class264.field4230 <= arg7 && class273.field4418 >= arg0 && arg1 >= class73.field1156 && arg6 <= class59.field859) {
            class149.method1109(arg4, arg1, false, arg3, arg6, arg0, arg7, arg5);
        } else {
            class137.method1039(arg4, arg7, arg5, 11974, arg6, arg3, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
    public static final void method316(byte arg0) {
        field730++;
        if (arg0 >= -41) {
            method323(1);
        }
        if (class113.field1879 != null) {
            class113.field1879.method2009(91);
        }
        if (class16.field170 != null) {
            class16.field170.method2009(104);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIB)I")
    public static final int method317(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 110) {
            field714 = 87;
        }
        int var4 = arg0 & 0x3;
        field718++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)[[I")
    public final int[][] method318(boolean arg0) {
        if (arg0) {
            return null;
        }
        field732++;
        if (this.field728 != this.field725) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field725; var2++) {
            this.field717[var2] = class203.field3008;
        }
        return this.field716;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZ)[I")
    public final int[] method319(int arg0, boolean arg1) {
        if (arg1) {
            method315(-61, -10, (byte) -51, -36, 38, -66, -124, -118);
        }
        field727++;
        if (this.field728 == this.field725) {
            this.field733 = this.field717[arg0] == null;
            this.field717[arg0] = class203.field3008;
            return this.field716[arg0];
        } else if (this.field725 == 1) {
            this.field733 = this.field721 != arg0;
            this.field721 = arg0;
            return this.field716[0];
        } else {
            class221 var3 = this.field717[arg0];
            if (var3 == null) {
                this.field733 = true;
                if (this.field725 > this.field726) {
                    var3 = new class221(arg0, this.field726);
                    this.field726++;
                } else {
                    class221 var4 = (class221) this.field715.method6(32);
                    var3 = new class221(arg0, var4.field3220);
                    this.field717[var4.field3218] = null;
                    var4.method1781(5250);
                }
                this.field717[arg0] = var3;
            } else {
                this.field733 = false;
            }
            this.field715.method9((byte) -90, var3);
            return this.field716[var3.field3220];
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IB)C")
    public static final char method320(int arg0, byte arg1) {
        field734++;
        int var2 = arg1 & 0xFF;
        if (arg0 != 1) {
            field713 = null;
        }
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class217.field3177[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V")
    public final void method321(byte arg0) {
        field719++;
        for (int var2 = 0; var2 < this.field725; var2++) {
            this.field716[var2] = null;
        }
        if (arg0 != -20) {
            method313(-52);
        }
        this.field716 = null;
        this.field717 = null;
        this.field715.method5(32);
        this.field715 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(DZ)V")
    public static final void method322(double arg0, boolean arg1) {
        field729++;
        if (class197.field2893 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class39.field523[var3] = var4 > 255 ? 255 : var4;
            }
            class197.field2893 = arg0;
        }
        if (arg1) {
            method316((byte) 104);
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
    public static void method323(int arg0) {
        field713 = null;
        if (arg0 >= -18) {
            method314(false, 122, 101, -48, -114, -109, 73, true, -90, 80, 65);
        }
        field712 = null;
        field724 = null;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(III)V")
    public class52(int arg0, int arg1, int arg2) {
        this.field725 = arg0;
        this.field716 = new int[this.field725][arg2];
        this.field728 = arg1;
        this.field717 = new class221[this.field728];
    }
}
