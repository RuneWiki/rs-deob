import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class237 extends class16 {

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "Ljk;")
    public class76 field3780 = new class76();

    @OriginalMember(owner = "client!oc", name = "F", descriptor = "Ln;")
    public class222 field3794 = new class222();

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "Lbd;")
    private class82 field3785;

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "Luf;")
    public static class168 field3789 = class148.method1019(-1720, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "[[B")
    public static byte[][] field3787 = new byte[250][];

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
    public static int field3786 = 0;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "[I")
    public static int[] field3782 = new int[200];

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!oc", name = "B", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!oc", name = "C", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!oc", name = "D", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!oc", name = "E", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!oc", name = "G", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!oc", name = "H", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V", line = 5)
    public static void method1593(boolean arg0) {
        field3782 = null;
        field3789 = null;
        field3787 = (byte[][]) null;
        if (arg0) {
            method1596((int[]) null, 69, (long[]) null);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)Lse;", line = 21)
    public static final class91 method1594(int arg0, int arg1, int arg2) {
        class127 var3 = class92.field1424[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1970; var4++) {
            class91 var5 = var3.field1971[var4];
            if ((var5.field1407 >> 29 & 0x3L) == 2L && var5.field1410 == arg1 && var5.field1412 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZLwb;I)V", line = 42)
    private final void method1595(boolean arg0, class77 arg1, int arg2) {
        field3793++;
        if ((this.field3785.field1200[arg1.field1048] & 0x4) != 0 && arg1.field1037 < 0) {
            int var4 = this.field3785.field1198[arg1.field1048] / class62.field820;
            int var5 = (1048575 - (arg1.field1058 - var4)) / var4;
            arg1.field1058 = arg1.field1058 + (arg2 * var4) & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field3785.field1193[arg1.field1048] == 0) {
                    arg1.field1047 = class260.method1793(arg1.field1055, arg1.field1047.method1809(), arg1.field1047.method1792(), arg1.field1047.method1786());
                } else {
                    arg1.field1047 = class260.method1793(arg1.field1055, arg1.field1047.method1809(), 0, arg1.field1047.method1786());
                    this.field3785.method520(arg1.field1061.field4417[arg1.field1035] < 0, arg1, -118);
                }
                if (arg1.field1061.field4417[arg1.field1035] < 0) {
                    arg1.field1047.method1787(-1);
                }
                arg2 = arg1.field1058 / var4;
            }
        }
        arg1.field1047.method68(arg2);
        if (arg0) {
            field3787 = (byte[][]) ((byte[][]) null);
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V", line = 84)
    public final void method68(int arg0) {
        this.field3794.method68(arg0);
        for (class77 var2 = (class77) this.field3780.method442(65293); var2 != null; var2 = (class77) this.field3780.method440(3)) {
            if (!this.field3785.method518((byte) -30, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field1060 >= var3) {
                        this.method1595(false, var2, var3);
                        var2.field1060 -= var3;
                        break;
                    }
                    this.method1595(false, var2, var2.field1060);
                    var3 -= var2.field1060;
                } while (!this.field3785.method543((int[]) null, var3, -120, var2, 0));
            }
        }
        field3790++;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "()Lrh;", line = 122)
    public final class16 method71() {
        field3791++;
        class77 var1;
        do {
            var1 = (class77) this.field3780.method440(3);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1047 == null);
        return var1.field1047;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([II[J)V", line = 143)
    public static final void method1596(int[] arg0, int arg1, long[] arg2) {
        class144.method986(0, arg0, arg2, arg2.length - 1, 0);
        int var3 = 33 % ((arg1 - 7) / 63);
        field3795++;
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "()Lrh;", line = 154)
    public final class16 method72() {
        field3781++;
        class77 var1 = (class77) this.field3780.method442(65293);
        if (var1 == null) {
            return null;
        } else if (var1.field1047 == null) {
            return this.method71();
        } else {
            return var1.field1047;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lwb;III[II)V", line = 174)
    private final void method1597(class77 arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
        field3783++;
        if ((this.field3785.field1200[arg0.field1048] & 0x4) != 0 && arg0.field1037 < 0) {
            int var7 = this.field3785.field1198[arg0.field1048] / class62.field820;
            while (true) {
                int var8 = (var7 + 1048575 - arg0.field1058) / var7;
                if (var8 > arg1) {
                    arg0.field1058 += arg1 * var7;
                    break;
                }
                arg0.field1047.method73(arg4, arg3, var8);
                arg3 += var8;
                int var9 = class62.field820 / 100;
                arg1 -= var8;
                arg0.field1058 += var7 * var8 - 1048576;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class260 var11 = arg0.field1047;
                if (this.field3785.field1193[arg0.field1048] == 0) {
                    arg0.field1047 = class260.method1793(arg0.field1055, var11.method1809(), var11.method1792(), var11.method1786());
                } else {
                    arg0.field1047 = class260.method1793(arg0.field1055, var11.method1809(), 0, var11.method1786());
                    this.field3785.method520(arg0.field1061.field4417[arg0.field1035] < 0, arg0, -89);
                    arg0.field1047.method1802(var9, var11.method1792());
                }
                if (arg0.field1061.field4417[arg0.field1035] < 0) {
                    arg0.field1047.method1787(-1);
                }
                var11.method1789(var9);
                var11.method73(arg4, arg3, arg2 - arg3);
                if (var11.method1788()) {
                    this.field3794.method1527(var11);
                }
            }
        }
        arg0.field1047.method73(arg4, arg3, arg1);
        if (arg5 != 0) {
            this.field3785 = (class82) null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "([III)V", line = 242)
    public final void method73(int[] arg0, int arg1, int arg2) {
        field3788++;
        this.field3794.method73(arg0, arg1, arg2);
        for (class77 var4 = (class77) this.field3780.method442(65293); var4 != null; var4 = (class77) this.field3780.method440(3)) {
            if (!this.field3785.method518((byte) -30, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field1060) {
                        this.method1597(var4, var5, var5 + var6, var6, arg0, 0);
                        var4.field1060 -= var5;
                        break;
                    }
                    this.method1597(var4, var4.field1060, var5 + var6, var6, arg0, 0);
                    var6 += var4.field1060;
                    var5 -= var4.field1060;
                } while (!this.field3785.method543(arg0, var5, -115, var4, var6));
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lbd;)V", line = 305)
    public class237(class82 arg0) {
        this.field3785 = arg0;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIZIII)V", line = 287)
    public static final void method1598(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        class83.field1259 = arg1;
        if (arg2) {
            return;
        }
        class79.field1134 = arg4;
        class297.field5024 = arg3;
        field3796++;
        class87.field1340 = arg0;
        class288.field4850 = arg5;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "()I", line = 317)
    public final int method67() {
        field3784++;
        return 0;
    }
}
