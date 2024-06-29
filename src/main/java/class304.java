import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public abstract class class304 extends class5 {

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "[Lua;")
    public class304[] field4667;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "Z")
    public boolean field4652;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public static int field4647 = 0;

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "I")
    public static int field4656 = -1;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "I")
    public int field4659;

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "Lrn;")
    public class115 field4663;

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "Lpg;")
    public class335 field4669;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "Ljd;")
    public static class95 field4665;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "Lclient;")
    public static client field4654;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "[I")
    public static int[] field4666;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V", line = 16)
    public void method100(boolean arg0) {
        field4655++;
        if (!arg0) {
            field4666 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)V", line = 26)
    public static void method2081(byte arg0) {
        field4654 = null;
        if (arg0 < -126) {
            field4665 = null;
            field4666 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V", line = 40)
    public void method1250(int arg0) {
        if (arg0 >= -99) {
            this.field4659 = -85;
        }
        if (this.field4652) {
            this.field4669.method2337(0);
            this.field4669 = null;
        } else {
            this.field4663.method885((byte) -63);
            this.field4663 = null;
        }
        field4662++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IBI)[[I", line = 65)
    public final int[][] method2082(int arg0, byte arg1, int arg2) {
        if (arg1 > -64) {
            return (int[][]) ((int[][]) null);
        }
        field4661++;
        if (this.field4667[arg0].field4652) {
            int[] var4 = this.field4667[arg0].method71(7, arg2);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field4667[arg0].method75(arg2, 0);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lwm;II)V", line = 109)
    public void method69(class254 arg0, int arg1, int arg2) {
        field4649++;
        if (arg2 != -2828) {
            field4665 = (class95) null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZLmn;)Z", line = 123)
    public static final boolean method2083(boolean arg0, class161 arg1) {
        field4651++;
        if (arg1.field2580 == null) {
            return false;
        }
        if (!arg0) {
            method2081((byte) -41);
        }
        for (int var2 = 0; var2 < arg1.field2580.length; var2++) {
            int var3 = class40.method305(-1, var2, arg1);
            int var4 = arg1.field2554[var2];
            if (arg1.field2580[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg1.field2580[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg1.field2580[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)[I", line = 178)
    public int[] method71(int arg0, int arg1) {
        if (arg0 != 7) {
            field4656 = 18;
        }
        field4648++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)[[I", line = 189)
    public int[][] method75(int arg0, int arg1) {
        field4660++;
        if (arg1 != 0) {
            this.method69((class254) null, 15, 31);
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(B)I", line = 200)
    public int method1249(byte arg0) {
        field4657++;
        int var2 = 3 / ((26 - arg0) / 48);
        return -1;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([[IIIZZ[ZZ[[I[IZII[[FI[[FILfn;I[[FZIB)V", line = 216)
    public static final void method2084(int[][] arg0, int arg1, int arg2, boolean arg3, boolean arg4, boolean[] arg5, boolean arg6, int[][] arg7, int[] arg8, boolean arg9, int arg10, int arg11, float[][] arg12, int arg13, float[][] arg14, int arg15, class58 arg16, int arg17, float[][] arg18, boolean arg19, int arg20, byte arg21) {
        field4650++;
        int var22 = (arg19 ? 255 : 0) + (arg17 << 8);
        int var23 = (arg4 ? 255 : 0) + (arg13 << 8);
        int var24 = (arg20 << 8) + (arg9 ? 255 : 0);
        int var25 = (arg6 ? 255 : 0) + (arg10 << 8);
        int[] var26 = new int[arg8.length / 2];
        for (int var27 = 0; var27 < var26.length; var27++) {
            int var28 = arg8[var27 + var27];
            int[][] var29 = arg0 == null || arg5 == null || !arg5[var27] ? arg7 : arg0;
            int var30 = arg8[var27 + var27 + 1];
            var26[var27] = class142.method1088(var22, arg14, (float) arg11, var28, arg16, arg12, arg2, false, var23, var25, arg1, arg0, arg21, 1628, var30, arg18, var24, var29);
        }
        arg16.method412(arg15, arg1, arg2, var26, (int[]) null, arg3);
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(III)V", line = 255)
    public final void method2085(int arg0, int arg1, int arg2) {
        field4658++;
        if (arg0 <= 95) {
            method2083(false, (class161) null);
        }
        int var4 = this.field4659 == 255 ? arg1 : this.field4659;
        if (this.field4652) {
            this.field4669 = new class335(var4, arg1, arg2);
        } else {
            this.field4663 = new class115(var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)I", line = 275)
    public int method1545(int arg0) {
        int var2 = -117 / ((-arg0 - 24) / 62);
        field4664++;
        return -1;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(IZ)V", line = 288)
    public class304(int arg0, boolean arg1) {
        this.field4667 = new class304[arg0];
        this.field4652 = arg1;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIB)[I", line = 308)
    public final int[] method2086(int arg0, int arg1, byte arg2) {
        field4653++;
        if (arg2 != 112) {
            this.method75(-101, 102);
        }
        return this.field4667[arg1].field4652 ? this.field4667[arg1].method71(7, arg0) : this.field4667[arg1].method75(arg0, arg2 ^ 0x70)[0];
    }
}
