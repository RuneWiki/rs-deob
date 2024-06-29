import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class167 extends class126 {

    @OriginalMember(owner = "client!de", name = "P", descriptor = "Luh;")
    public class198 field2800 = new class198();

    @OriginalMember(owner = "client!de", name = "T", descriptor = "Lf;")
    public class82 field2804 = new class82();

    @OriginalMember(owner = "client!de", name = "S", descriptor = "Ltb;")
    private class253 field2803;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "Lub;")
    public static class227 field2787 = class257.method1749("Speicher wird zugewiesen)3", 17263);

    @OriginalMember(owner = "client!de", name = "z", descriptor = "Lub;")
    public static class227 field2784 = class257.method1749("zap", 17263);

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "[Lub;")
    public static class227[] field2801 = new class227[100];

    @OriginalMember(owner = "client!de", name = "D", descriptor = "Z")
    public static boolean field2788 = false;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "[Lhe;")
    public static class230[] field2795 = new class230[5000];

    @OriginalMember(owner = "client!de", name = "U", descriptor = "[Lub;")
    public static class227[] field2805 = new class227[100];

    @OriginalMember(owner = "client!de", name = "A", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!de", name = "B", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!de", name = "F", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!de", name = "G", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!de", name = "H", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!de", name = "J", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!de", name = "L", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!de", name = "O", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!de", name = "R", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "Lnf;")
    public static class213 field2798;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "Z")
    public static boolean field2797;

    @OriginalMember(owner = "client!de", name = "I", descriptor = "[I")
    public static int[] field2793;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BILh;)V")
    private final void method1027(byte arg0, int arg1, class101 arg2) {
        if (arg0 < 12) {
            this.method1029((int[]) null, -81, -76, (class101) null, -73, 96);
        }
        if ((this.field2803.field4382[arg2.field1760] & 0x4) != 0 && arg2.field1781 < 0) {
            int var4 = this.field2803.field4395[arg2.field1760] / class195.field3316;
            int var5 = (var4 + 1048575 - arg2.field1777) / var4;
            arg2.field1777 = arg1 * var4 + arg2.field1777 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field2803.field4390[arg2.field1760] == 0) {
                    arg2.field1773 = class170.method1065(arg2.field1784, arg2.field1773.method1054(), arg2.field1773.method1075(), arg2.field1773.method1073());
                } else {
                    arg2.field1773 = class170.method1065(arg2.field1784, arg2.field1773.method1054(), 0, arg2.field1773.method1073());
                    this.field2803.method1706(arg2, arg2.field1763.field1730[arg2.field1789] < 0, 127);
                }
                if (arg2.field1763.field1730[arg2.field1789] < 0) {
                    arg2.field1773.method1076(-1);
                }
                arg1 = arg2.field1777 / var4;
            }
        }
        field2786++;
        arg2.field1773.method478(arg1);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lub;I)I")
    public static final int method1028(class227 arg0, int arg1) {
        field2785++;
        int var2 = -109 / ((-arg1 - 66) / 49);
        return arg0.method1521((byte) 62) + 1;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "()Lib;")
    public final class126 method475() {
        field2799++;
        class101 var1 = (class101) this.field2800.method1277(105);
        if (var1 == null) {
            return null;
        } else if (var1.field1773 == null) {
            return this.method477();
        } else {
            return var1.field1773;
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
    public final void method478(int arg0) {
        this.field2804.method478(arg0);
        field2790++;
        for (class101 var2 = (class101) this.field2800.method1277(92); var2 != null; var2 = (class101) this.field2800.method1271(250)) {
            if (!this.field2803.method1696(false, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1762) {
                        this.method1027((byte) 126, var3, var2);
                        var2.field1762 -= var3;
                        break;
                    }
                    this.method1027((byte) 59, var2.field1762, var2);
                    var3 -= var2.field1762;
                } while (!this.field2803.method1697(0, (int[]) null, var3, var2, 0));
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([IIILh;II)V")
    private final void method1029(int[] arg0, int arg1, int arg2, class101 arg3, int arg4, int arg5) {
        if (arg4 != 18423) {
            field2789 = 56;
        }
        field2792++;
        if ((this.field2803.field4382[arg3.field1760] & 0x4) != 0 && arg3.field1781 < 0) {
            int var7 = this.field2803.field4395[arg3.field1760] / class195.field3316;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field1777) / var7;
                if (var8 > arg2) {
                    arg3.field1777 += arg2 * var7;
                    break;
                }
                arg2 -= var8;
                int var9 = 262144 / var7;
                arg3.field1773.method485(arg0, arg5, var8);
                int var10 = class195.field3316 / 100;
                class170 var11 = arg3.field1773;
                if (var10 > var9) {
                    var10 = var9;
                }
                arg3.field1777 += var7 * var8 - 1048576;
                arg5 += var8;
                if (this.field2803.field4390[arg3.field1760] == 0) {
                    arg3.field1773 = class170.method1065(arg3.field1784, var11.method1054(), var11.method1075(), var11.method1073());
                } else {
                    arg3.field1773 = class170.method1065(arg3.field1784, var11.method1054(), 0, var11.method1073());
                    this.field2803.method1706(arg3, arg3.field1763.field1730[arg3.field1789] < 0, 112);
                    arg3.field1773.method1055(var10, var11.method1075());
                }
                if (arg3.field1763.field1730[arg3.field1789] < 0) {
                    arg3.field1773.method1076(-1);
                }
                var11.method1067(var10);
                var11.method485(arg0, arg5, arg1 - arg5);
                if (var11.method1084()) {
                    this.field2804.method480(var11);
                }
            }
        }
        arg3.field1773.method485(arg0, arg5, arg2);
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "()Lib;")
    public final class126 method477() {
        field2802++;
        class101 var1;
        do {
            var1 = (class101) this.field2800.method1271(250);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1773 == null);
        return var1.field1773;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "()I")
    public final int method486() {
        field2794++;
        return 0;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "([III)V")
    public final void method485(int[] arg0, int arg1, int arg2) {
        this.field2804.method485(arg0, arg1, arg2);
        field2791++;
        for (class101 var4 = (class101) this.field2800.method1277(87); var4 != null; var4 = (class101) this.field2800.method1271(250)) {
            if (!this.field2803.method1696(false, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field1762) {
                        this.method1029(arg0, var5 + var6, var6, var4, 18423, var5);
                        var4.field1762 -= var6;
                        break;
                    }
                    this.method1029(arg0, var5 + var6, var4.field1762, var4, 18423, var5);
                    var6 -= var4.field1762;
                    var5 += var4.field1762;
                } while (!this.field2803.method1697(var5, arg0, var6, var4, 0));
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIILfh;IJZ)Z")
    public static final boolean method1030(int arg0, int arg1, int arg2, int arg3, int arg4, class180 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class250.method1674(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(B)V")
    public static void method1031(byte arg0) {
        field2805 = null;
        field2798 = null;
        field2795 = null;
        field2793 = null;
        field2801 = null;
        if (arg0 >= 91) {
            field2787 = null;
            field2784 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Ltb;)V")
    public class167(class253 arg0) {
        this.field2803 = arg0;
    }
}
