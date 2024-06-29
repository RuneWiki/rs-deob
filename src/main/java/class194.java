import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class194 extends class264 {

    @OriginalMember(owner = "client!qga", name = "l", descriptor = "[Lib;")
    public static class162[] field2859 = new class162[0];

    @OriginalMember(owner = "client!qga", name = "k", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!qga", name = "m", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!qga", name = "n", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!qga", name = "o", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!qga", name = "p", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!qga", name = "q", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "([Lsf;II)V")
    public static final void method1410(class547[] arg0, int arg1, int arg2) {
        if (arg1 < arg2) {
            int var3 = (arg1 + arg2) / 2;
            int var4 = arg1;
            class547 var5 = arg0[var3];
            arg0[var3] = arg0[arg2];
            arg0[arg2] = var5;
            int var6 = var5.field7722;
            for (int var7 = arg1; var7 < arg2; ++var7) {
                if (arg0[var7].field7722 < (var7 & 1) + var6) {
                    class547 var8 = arg0[var7];
                    arg0[var7] = arg0[var4];
                    arg0[var4++] = var8;
                }
            }
            arg0[arg2] = arg0[var4];
            arg0[var4] = var5;
            method1410(arg0, arg1, var4 - 1);
            method1410(arg0, var4 + 1, arg2);
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(BI)I")
    public final int method666(byte arg0, int arg1) {
        ++field2862;
        if (arg0 != 112) {
            field2859 = null;
        }
        return super.field3731.method3634(arg0 + -112).method2858(arg0 ^ 2311) < 96 ? 3 : 1;
    }

    @OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(ILmfa;)V")
    public class194(int arg0, class640 arg1) {
        super(arg0, arg1);
        class782.method4287(super.field3733, 0);
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(BI)V")
    public final void method659(byte arg0, int arg1) {
        ++field2864;
        if (arg0 > -114) {
            method1411(-1);
        }
        super.field3733 = arg1;
        class782.method4287(super.field3733, 0);
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(I)V")
    public final void method660(int arg0) {
        int var2 = -99 / ((arg0 - 1) / 41);
        ++field2858;
        if (super.field3731.method3634(0).method2858(2423) < 96) {
            super.field3733 = 0;
        }
        if (~super.field3733 > -1 || ~super.field3733 < -3) {
            super.field3733 = this.method663((byte) -38);
        }
    }

    @OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(Lmfa;)V")
    public class194(class640 arg0) {
        super(arg0);
        class782.method4287(super.field3733, 0);
    }

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "(I)V")
    public static final void method1411(int arg0) {
        class197.field2884 = arg0;
        for (int var1 = 0; var1 < class151.field2074; ++var1) {
            for (int var2 = 0; var2 < class12.field249; ++var2) {
                if (class378.field5427[arg0][var1][var2] == null) {
                    class378.field5427[arg0][var1][var2] = new class379(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)I")
    public final int method663(byte arg0) {
        ++field2861;
        if (arg0 != -38) {
            method1411(-30);
        }
        return ~super.field3731.method3634(arg0 + 38).method2858(2423) > -97 ? 0 : 2;
    }

    @OriginalMember(owner = "client!qga", name = "d", descriptor = "(I)Z")
    public final boolean method1412(int arg0) {
        ++field2863;
        if (arg0 != 14996) {
            field2859 = null;
        }
        return super.field3731.method3634(arg0 + -14996).method2858(2423) >= 96;
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(B)I")
    public final int method1413(byte arg0) {
        if (arg0 >= -31) {
            return 72;
        } else {
            ++field2860;
            return super.field3733;
        }
    }

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "(B)V")
    public static void method1414(byte arg0) {
        field2859 = null;
        if (arg0 <= 28) {
            field2859 = null;
        }
    }
}
