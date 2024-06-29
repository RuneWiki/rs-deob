import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public abstract class class229 {

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field3624 = 0;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field3626 = 0;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "Ln;")
    public static class282 field3638 = new class282(64);

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "[I")
    public static int[] field3639 = new int[32];

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "F")
    public static float field3640;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public int field3632;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public int field3634;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
    public int field3637;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "[[[I")
    public static int[][][] field3631;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "[[[I")
    public static int[][][] field3635;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)Z", line = 13)
    public static final boolean method1539(int arg0, int arg1) {
        field3628++;
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        }
        int var2 = 52 % ((56 - arg1) / 43);
        if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lld;", line = 37)
    public static final class122 method1540(Throwable arg0, String arg1) {
        class122 var2;
        if ((arg0 instanceof class122)) {
            var2 = (class122) arg0;
            var2.field1904 = var2.field1904 + ' ' + arg1;
        } else {
            var2 = new class122(arg0, arg1);
        }
        field3627++;
        return var2;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)Ldf;", line = 53)
    public static final class164 method1541(int arg0, int arg1, int arg2) {
        class55 var3 = class36.field585[arg0][arg1][arg2];
        return var3 == null ? null : var3.field889;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([JII[II)V", line = 61)
    public static final void method1542(long[] arg0, int arg1, int arg2, int[] arg3, int arg4) {
        if (arg4 != -24337) {
            method1540((Throwable) null, (String) null);
        }
        if (arg1 < arg2) {
            int var5 = arg1;
            int var6 = (arg1 + arg2) / 2;
            long var7 = arg0[var6];
            arg0[var6] = arg0[arg2];
            arg0[arg2] = var7;
            int var9 = arg3[var6];
            arg3[var6] = arg3[arg2];
            arg3[arg2] = var9;
            for (int var10 = arg1; var10 < arg2; var10++) {
                if (arg0[var10] < var7 + ((long) (var10 & 0x1))) {
                    long var11 = arg0[var10];
                    arg0[var10] = arg0[var5];
                    arg0[var5] = var11;
                    int var13 = arg3[var10];
                    arg3[var10] = arg3[var5];
                    arg3[var5++] = var13;
                }
            }
            arg0[arg2] = arg0[var5];
            arg0[var5] = var7;
            arg3[arg2] = arg3[var5];
            arg3[var5] = var9;
            method1542(arg0, arg1, var5 - 1, arg3, -24337);
            method1542(arg0, var5 + 1, arg2, arg3, -24337);
        }
        field3629++;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)Z", line = 120)
    public final boolean method1543(int arg0) {
        if (arg0 != 8) {
            this.method1543(15);
        }
        field3625++;
        return (this.field3637 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V", line = 132)
    public static void method1544(byte arg0) {
        field3639 = null;
        field3638 = null;
        field3635 = (int[][][]) null;
        if (arg0 >= -82) {
            method1544((byte) 3);
        }
        field3631 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)Z", line = 157)
    public final boolean method1545(boolean arg0) {
        field3636++;
        if (arg0) {
            return false;
        } else {
            return (this.field3637 & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V", line = 169)
    public static final void method1546(int arg0) {
        class281.method1973(0, 0, 0);
        field3633++;
        if (arg0 != 97) {
            method1541(-108, 80, 18);
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)Z", line = 183)
    public final boolean method1547(int arg0) {
        field3623++;
        if (arg0 >= -106) {
            field3640 = -0.6283864F;
        }
        return (this.field3637 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(I)Z", line = 203)
    public final boolean method1548(int arg0) {
        if (arg0 != 64) {
            this.field3637 = 51;
        }
        field3630++;
        return (this.field3637 & 0x2) != 0;
    }
}
