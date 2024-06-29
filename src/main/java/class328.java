import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class328 extends class259 {

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "Z")
    public boolean field5272 = true;

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "Len;")
    public static class49 field5282 = new class49(5000);

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!jc", name = "W", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field5287;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "[I")
    private int[] field5268;

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "[I")
    public int[] field5284;

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "[Ljava/lang/String;")
    private String[] field5279;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "[[I")
    private int[][] field5269;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BILlf;)V", line = 8)
    private final void method2277(byte arg0, int arg1, class143 arg2) {
        field5278++;
        if (arg0 < 1) {
            method2287(-66);
        }
        if (arg1 == 1) {
            this.field5279 = class60.method369('<', 1, arg2.method1040((byte) -128));
        } else if (arg1 == 2) {
            int var4 = arg2.method1043(true);
            this.field5284 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5284[var5] = arg2.method1051(1);
            }
        } else if (arg1 == 3) {
            int var6 = arg2.method1043(true);
            this.field5269 = new int[var6][];
            this.field5268 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg2.method1051(1);
                this.field5268[var7] = var8;
                this.field5269[var7] = new int[class205.field3109[var8]];
                for (int var9 = 0; var9 < class205.field3109[var8]; var9++) {
                    this.field5269[var7][var9] = arg2.method1051(1);
                }
            }
        } else if (arg1 == 4) {
            this.field5272 = false;
        }
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)I", line = 77)
    public final int method2278(int arg0) {
        int var2 = 114 / ((arg0 + 32) / 62);
        field5271++;
        return this.field5268 == null ? 0 : this.field5268.length;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Llf;I)Ljava/lang/String;", line = 90)
    public final String method2279(class143 arg0, int arg1) {
        field5281++;
        StringBuffer var3 = new StringBuffer(80);
        if (arg1 <= 46) {
            this.method2277((byte) -93, 44, (class143) null);
        }
        if (this.field5268 != null) {
            for (int var4 = 0; var4 < this.field5268.length; var4++) {
                var3.append(this.field5279[var4]);
                var3.append(class310.method2197(this.field5269[var4], (byte) 125, this.field5268[var4], arg0.method1033(class229.field3476[this.field5268[var4]], (byte) 11)));
            }
        }
        var3.append(this.field5279[this.field5279.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)V", line = 120)
    public static void method2280(int arg0) {
        if (arg0 < 69) {
            field5286 = -14;
        }
        field5287 = null;
        field5282 = null;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(Llf;I)V", line = 132)
    public final void method2281(class143 arg0, int arg1) {
        field5283++;
        while (true) {
            int var3 = arg0.method1043(true);
            if (var3 == 0) {
                if (arg1 != 80) {
                    this.method2278(-57);
                }
                return;
            }
            this.method2277((byte) 127, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIIII)Z", line = 153)
    public static final boolean method2282(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5276++;
        if ((arg0 + arg5) > arg8 && arg2 + arg8 > arg0) {
            if (arg7 != 0) {
                method2287(74);
            }
            return arg4 < arg3 + arg6 && arg3 < arg4 + arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIB)I", line = 171)
    public final int method2283(int arg0, int arg1, byte arg2) {
        if (arg2 != 62) {
            method2287(51);
        }
        field5280++;
        if (this.field5268 == null || arg1 < 0 || arg1 > this.field5268.length) {
            return -1;
        } else if (this.field5269[arg1] == null || arg0 < 0 || arg0 > this.field5269[arg1].length) {
            return -1;
        } else {
            return this.field5269[arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(II)I", line = 191)
    public final int method2284(int arg0, int arg1) {
        field5285++;
        if (arg0 == -16159) {
            return this.field5268 == null || arg1 < 0 || this.field5268.length < arg1 ? -1 : this.field5268[arg1];
        } else {
            return -3;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([ILlf;B)V", line = 215)
    public final void method2285(int[] arg0, class143 arg1, byte arg2) {
        field5270++;
        if (this.field5268 == null) {
            return;
        }
        for (int var4 = 0; this.field5268.length > var4 && var4 < arg0.length; var4++) {
            int var5 = class196.field2977[this.method2284(arg2 - 16263, var4)];
            if (var5 > 0) {
                arg1.method1056((long) arg0[var4], 8, var5);
            }
        }
        if (arg2 != 104) {
            field5287 = (Canvas) null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(B)Ljava/lang/String;", line = 246)
    public final String method2286(byte arg0) {
        StringBuffer var2 = new StringBuffer(80);
        field5275++;
        if (this.field5279 == null) {
            return "";
        }
        var2.append(this.field5279[0]);
        for (int var3 = 1; var3 < this.field5279.length; var3++) {
            var2.append("...");
            var2.append(this.field5279[var3]);
        }
        return arg0 == 12 ? var2.toString() : (String) null;
    }

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "(I)V", line = 278)
    public static final void method2287(int arg0) {
        field5277++;
        class223.field3374.method383((byte) -48);
        if (arg0 != 0) {
            method2287(-90);
        }
    }

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "(I)V", line = 297)
    public final void method2288(int arg0) {
        field5274++;
        if (arg0 != 1) {
            this.field5279 = (String[]) null;
        }
        if (this.field5284 != null) {
            for (int var2 = 0; var2 < this.field5284.length; var2++) {
                this.field5284[var2] = class77.method492(this.field5284[var2], 32768);
            }
        }
    }
}
