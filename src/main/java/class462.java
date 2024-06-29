import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class462 extends class195 {

    @OriginalMember(owner = "client!lm", name = "F", descriptor = "Lor;")
    public class594 field6905 = new class594();

    @OriginalMember(owner = "client!lm", name = "H", descriptor = "Lvt;")
    public class278 field6907 = new class278();

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "Lqk;")
    private class16 field6899;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field6896 = new Rectangle[100];

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "[Lcw;")
    public static class165[] field6902;

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "Lvg;")
    public static class49 field6900;

    @OriginalMember(owner = "client!lm", name = "I", descriptor = "[I")
    public static int[] field6908;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
    public static int field6894;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    public static int field6895;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    public static int field6897;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
    public static int field6898;

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "I")
    public static int field6901;

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "I")
    public static int field6903;

    @OriginalMember(owner = "client!lm", name = "E", descriptor = "I")
    public static int field6904;

    @OriginalMember(owner = "client!lm", name = "G", descriptor = "I")
    public static int field6906;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field6896[var0] = new Rectangle();
        }
        field6902 = new class165[300];
        field6900 = new class49(4);
        field6908 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "()Leq;", line = 3)
    public final class195 method219() {
        field6897++;
        class168 var1 = (class168) this.field6905.method3465((byte) 108);
        if (var1 == null) {
            return null;
        } else if (var1.field2839 == null) {
            return this.method220();
        } else {
            return var1.field2839;
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V", line = 20)
    public static void method2891(int arg0) {
        field6896 = null;
        if (arg0 <= -56) {
            field6900 = null;
            field6908 = null;
            field6902 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "()Leq;", line = 34)
    public final class195 method220() {
        field6895++;
        class168 var1;
        do {
            var1 = (class168) this.field6905.method3469(0);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2839 == null);
        return var1.field2839;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIII[ILefa;)V", line = 57)
    private final void method2892(int arg0, int arg1, int arg2, int arg3, int[] arg4, class168 arg5) {
        if ((this.field6899.field222[arg5.field2821] & 0x4) != arg0 && arg5.field2833 < 0) {
            int var7 = this.field6899.field243[arg5.field2821] / class41.field581;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field2823) / var7;
                if (arg1 < var8) {
                    arg5.field2823 += arg1 * var7;
                    break;
                }
                arg5.field2839.method240(arg4, arg3, var8);
                arg5.field2823 += var7 * var8 - 1048576;
                arg1 -= var8;
                arg3 += var8;
                int var9 = class41.field581 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class169 var11 = arg5.field2839;
                if (this.field6899.field229[arg5.field2821] == 0) {
                    arg5.field2839 = class169.method1391(arg5.field2831, var11.method1367(), var11.method1378(), var11.method1380());
                } else {
                    arg5.field2839 = class169.method1391(arg5.field2831, var11.method1367(), 0, var11.method1380());
                    this.field6899.method230(arg5.field2835.field9574[arg5.field2840] < 0, (byte) -65, arg5);
                    arg5.field2839.method1388(var9, var11.method1378());
                }
                if (arg5.field2835.field9574[arg5.field2840] < 0) {
                    arg5.field2839.method1381(-1);
                }
                var11.method1385(var9);
                var11.method240(arg4, arg3, arg2 - arg3);
                if (var11.method1400()) {
                    this.field6907.method1990(var11);
                }
            }
        }
        field6898++;
        arg5.field2839.method240(arg4, arg3, arg1);
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)V", line = 129)
    public static final void method2893(int arg0) {
        field6906++;
        class49 var1 = class567.field8140;
        synchronized (class567.field8140) {
            class567.field8140.method569(0);
        }
        class49 var2 = class393.field6137;
        synchronized (class393.field6137) {
            class393.field6137.method569(arg0 ^ arg0);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V", line = 142)
    public final void method235(int arg0) {
        field6901++;
        this.field6907.method235(arg0);
        for (class168 var2 = (class168) this.field6905.method3465((byte) 122); var2 != null; var2 = (class168) this.field6905.method3469(0)) {
            if (!this.field6899.method223(-1, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field2817 >= var3) {
                        this.method2894(var2, var3, true);
                        var2.field2817 -= var3;
                        break;
                    }
                    this.method2894(var2, var2.field2817, true);
                    var3 -= var2.field2817;
                } while (!this.field6899.method213(var3, 0, null, 8830, var2));
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "([III)V", line = 178)
    public final void method240(int[] arg0, int arg1, int arg2) {
        field6904++;
        this.field6907.method240(arg0, arg1, arg2);
        for (class168 var4 = (class168) this.field6905.method3465((byte) 122); var4 != null; var4 = (class168) this.field6905.method3469(0)) {
            if (!this.field6899.method223(-1, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field2817 >= var5) {
                        this.method2892(0, var5, var5 + var6, var6, arg0, var4);
                        var4.field2817 -= var5;
                        break;
                    }
                    this.method2892(0, var4.field2817, var6 + var5, var6, arg0, var4);
                    var5 -= var4.field2817;
                    var6 += var4.field2817;
                } while (!this.field6899.method213(var5, var6, arg0, 8830, var4));
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "()I", line = 220)
    public final int method215() {
        field6903++;
        return 0;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lefa;IZ)V", line = 232)
    private final void method2894(class168 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.method235(-72);
        }
        field6894++;
        if ((this.field6899.field222[arg0.field2821] & 0x4) != 0 && arg0.field2833 < 0) {
            int var4 = this.field6899.field243[arg0.field2821] / class41.field581;
            int var5 = (var4 + 1048575 - arg0.field2823) / var4;
            arg0.field2823 = arg1 * var4 + arg0.field2823 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field6899.field229[arg0.field2821] == 0) {
                    arg0.field2839 = class169.method1391(arg0.field2831, arg0.field2839.method1367(), arg0.field2839.method1378(), arg0.field2839.method1380());
                } else {
                    arg0.field2839 = class169.method1391(arg0.field2831, arg0.field2839.method1367(), 0, arg0.field2839.method1380());
                    this.field6899.method230(arg0.field2835.field9574[arg0.field2840] < 0, (byte) -65, arg0);
                }
                if (arg0.field2835.field9574[arg0.field2840] < 0) {
                    arg0.field2839.method1381(-1);
                }
                arg1 = arg0.field2823 / var4;
            }
        }
        arg0.field2839.method235(arg1);
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lqk;)V", line = 287)
    public class462(class16 arg0) {
        this.field6899 = arg0;
    }
}
