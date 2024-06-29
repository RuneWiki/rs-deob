import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class72 {

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    private int field855 = 0;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Lc;")
    private class284 field858;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "Lrc;")
    public static class9 field857 = new class9(64);

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "Lbh;")
    public static class234 field865 = new class234();

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field867 = 20;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "[I")
    public static int[] field868 = new int[256];

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "Lbc;")
    public static class282 field853;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "Lnh;")
    private class288 field861;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)Lnh;")
    public final class288 method443(int arg0) {
        if (arg0 < 15) {
            this.field855 = 103;
        }
        field856++;
        if (this.field855 > 0 && this.field858.field4351[this.field855 - 1] != this.field861) {
            class288 var2 = this.field861;
            this.field861 = var2.field4487;
            return var2;
        }
        while (this.field858.field4357 > this.field855) {
            class288 var3 = this.field858.field4351[this.field855++].field4487;
            if (this.field858.field4351[this.field855 - 1] != var3) {
                this.field861 = var3.field4487;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BIII)V")
    public static final void method444(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -68) {
            return;
        }
        field859++;
        int var4 = class137.field1989 * arg2 >> 8;
        if (var4 != 0 && arg3 != -1) {
            class172.method1121(0, arg3, class235.field3393, 62, var4, false);
            class19.field240 = true;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
    public static void method445(boolean arg0) {
        field857 = null;
        field868 = null;
        if (!arg0) {
            field865 = null;
            field853 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)Lnh;")
    public final class288 method446(int arg0) {
        if (arg0 == 5915) {
            field864++;
            this.field855 = 0;
            return this.method443(21);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZIILhl;III)V")
    public static final void method447(boolean arg0, int arg1, int arg2, class137 arg3, int arg4, int arg5, int arg6) {
        if (arg0) {
            field867 = 39;
        }
        field854++;
        long var7 = 0L;
        if (arg1 == 0) {
            var7 = class255.method1634(arg2, arg6, arg5);
        } else if (arg1 == 1) {
            var7 = class157.method1043(arg2, arg6, arg5);
        } else if (arg1 == 2) {
            var7 = class168.method1103(arg2, arg6, arg5);
        } else if (arg1 == 3) {
            var7 = class268.method1719(arg2, arg6, arg5);
        }
        boolean var9 = false;
        boolean var10 = true;
        boolean var11 = false;
        int var12 = (int) var7 >> 20 & 0x3;
        int var13 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        int var14 = ((int) var7 & 0x7EAE8) >> 14;
        class273 var15 = class164.method1081(0, var13);
        if (var15.method1756((byte) 28)) {
            class203.method1311(arg5, var15, 75, arg2, arg6);
        }
        if (var7 == 0L) {
            return;
        }
        if (arg1 == 0) {
            class178.method1156(arg2, arg6, arg5);
            if (var15.field4016 != 0) {
                arg3.method892(var14, var12, arg6, -49, !var15.field4043, arg5, var15.field4063);
            }
        } else if (arg1 == 1) {
            class204.method1315(arg2, arg6, arg5);
        } else if (arg1 == 2) {
            class108.method678(arg2, arg6, arg5);
            if (var15.field4016 != 0 && var15.field4008 + arg6 < 104 && (arg5 + var15.field4008) < 104 && var15.field4023 + arg6 < 104 && (var15.field4023 + arg5) < 104) {
                arg3.method893(arg5, var12, !var15.field4043, var15.field4023, arg6, 102, var15.field4063, var15.field4008);
            }
        } else if (arg1 == 3) {
            class196.method1266(arg2, arg6, arg5);
            if (var15.field4016 == 1) {
                arg3.method889((byte) 39, arg5, arg6);
            }
        }
        if (var15.field3991 != null) {
            class273 var20 = var15.method1751(-23199);
            return;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILbc;Lbc;)V")
    public static final void method448(int arg0, class282 arg1, class282 arg2) {
        class167.field2405 = arg2;
        class26.field312 = arg1;
        if (arg0 == 64) {
            field860++;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)Lkf;")
    public static final class118 method449(int arg0, int arg1, int arg2) {
        class133 var3 = class6.field94[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1927;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZI)I")
    public static final int method450(boolean arg0, int arg1) {
        field862++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        if (!arg0) {
            method450(false, 13);
        }
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lc;)V")
    public class72(class284 arg0) {
        this.field858 = arg0;
    }
}
