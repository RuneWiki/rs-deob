import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class436 {

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "Loo;")
    private class652 field5890 = new class652(16);

    @OriginalMember(owner = "client!nn", name = "l", descriptor = "Lwia;")
    private class791 field5891;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "[I")
    public static int[] field5881 = new int[2048];

    @OriginalMember(owner = "client!nn", name = "m", descriptor = "I")
    public static int field5892 = 0;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(BZIII)Llja;")
    public static final class744 method2604(byte arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field5885++;
        class744 var5 = new class744();
        var5.field10314 = arg3;
        var5.field10312 = arg4;
        class11.field217.method2241(127, (long) arg2, var5);
        class446.method2660(arg3, 1);
        class451 var6 = class166.method1238((byte) -114, arg2);
        if (var6 != null) {
            class564.method3329(var6, arg0 ^ 0xFFFFDFE4);
        }
        if (class274.field3954 != null) {
            class564.method3329(class274.field3954, 8195);
            class274.field3954 = null;
        }
        class104.method735(0);
        if (arg0 != -25) {
            return null;
        }
        if (var6 != null) {
            class679.method3849(85, var6, !arg1);
        }
        if (!arg1) {
            class379.method2356(arg3);
        }
        if (!arg1 && class371.field5137 != -1) {
            class614.method3563(class371.field5137, 1, (byte) 47);
        }
        return var5;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(BIIII)V")
    public static final void method2605(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= -82) {
            return;
        }
        field5887++;
        if (arg2 != 8 && arg2 != 16) {
            class46 var5 = class767.field10562[arg1][arg3][arg4];
            if (var5 != null) {
                if (arg2 == 1) {
                    var5.field588 = 0;
                } else if (arg2 == 2) {
                    var5.field593 = 0;
                }
            }
            class260.method1694(9016);
            return;
        }
        for (int var6 = 0; var6 < class296.field4300; var6++) {
            class478 var7 = class626.field8776[var6];
            if (var7.field6708 == arg2 && var7.field6710 == arg3 && var7.field6715 == arg4 || var7.field6718 == arg3 && var7.field6715 == arg4) {
                if (class296.field4300 != var6) {
                    class595.method3472(class626.field8776, var6 + 1, class626.field8776, var6, class626.field8776.length - var6 - 1);
                }
                class296.field4300--;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
    public final void method2606(int arg0) {
        class652 var2 = this.field5890;
        synchronized (this.field5890) {
            this.field5890.method3743(8);
        }
        if (arg0 != 3) {
            field5884 = -81;
        }
        field5886++;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)V")
    public final void method2607(int arg0, int arg1) {
        class652 var3 = this.field5890;
        synchronized (this.field5890) {
            this.field5890.method3741(arg1, arg0);
        }
        field5888++;
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)V")
    public final void method2608(int arg0) {
        class652 var2 = this.field5890;
        synchronized (this.field5890) {
            this.field5890.method3735(arg0 ^ 0xFFFFAE88);
        }
        if (arg0 != -20854) {
            this.method2606(97);
        }
        field5880++;
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(II)Lln;")
    public final class398 method2609(int arg0, int arg1) {
        field5889++;
        class652 var3 = this.field5890;
        class398 var4;
        synchronized (this.field5890) {
            var4 = (class398) this.field5890.method3742((byte) 67, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class791 var5 = this.field5891;
        byte[] var6;
        synchronized (this.field5891) {
            var6 = this.field5891.method4339(arg0, 0, 30);
        }
        class398 var7 = new class398();
        if (var6 != null) {
            var7.method2454(new class494(var6), true);
        }
        class652 var8 = this.field5890;
        synchronized (this.field5890) {
            this.field5890.method3739((long) arg0, (byte) 77, var7);
            if (arg1 > -72) {
                this.method2609(6, 93);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V")
    public static void method2610(byte arg0) {
        field5881 = null;
        if (arg0 != -67) {
            method2605((byte) 78, -110, 16, -125, 10);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIIIII)I")
    public static final int method2611(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5882++;
        int var7 = arg6 & 0x3;
        if ((arg1 & 0x1) == 1) {
            int var8 = arg3;
            arg3 = arg5;
            arg5 = var8;
        }
        if (arg4 != 23058) {
            field5884 = 120;
        }
        if (var7 == 0) {
            return arg2;
        } else if (var7 == 1) {
            return arg0;
        } else if (var7 == 2) {
            return 7 + 1 - arg2 - arg3;
        } else {
            return 7 - arg0 - (arg5 + -1);
        }
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Ldt;ILwia;)V")
    public class436(class252 arg0, int arg1, class791 arg2) {
        this.field5891 = arg2;
        this.field5891.method4353(30, true);
    }
}
