import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class693 extends class219 {

    @OriginalMember(owner = "client!aga", name = "M", descriptor = "Z")
    public boolean field9804 = true;

    @OriginalMember(owner = "client!aga", name = "t", descriptor = "I")
    public static int field9786;

    @OriginalMember(owner = "client!aga", name = "w", descriptor = "I")
    public static int field9789;

    @OriginalMember(owner = "client!aga", name = "x", descriptor = "I")
    public static int field9790;

    @OriginalMember(owner = "client!aga", name = "A", descriptor = "I")
    public static int field9793;

    @OriginalMember(owner = "client!aga", name = "B", descriptor = "I")
    public static int field9794;

    @OriginalMember(owner = "client!aga", name = "C", descriptor = "I")
    public static int field9795;

    @OriginalMember(owner = "client!aga", name = "E", descriptor = "I")
    public static int field9796;

    @OriginalMember(owner = "client!aga", name = "G", descriptor = "I")
    public static int field9798;

    @OriginalMember(owner = "client!aga", name = "H", descriptor = "I")
    public static int field9799;

    @OriginalMember(owner = "client!aga", name = "I", descriptor = "I")
    public static int field9800;

    @OriginalMember(owner = "client!aga", name = "J", descriptor = "I")
    public static int field9801;

    @OriginalMember(owner = "client!aga", name = "L", descriptor = "I")
    public static int field9803;

    @OriginalMember(owner = "client!aga", name = "z", descriptor = "Lem;")
    public class234 field9792;

    @OriginalMember(owner = "client!aga", name = "y", descriptor = "Ltia;")
    public static class277 field9791;

    @OriginalMember(owner = "client!aga", name = "v", descriptor = "[I")
    private int[] field9788;

    @OriginalMember(owner = "client!aga", name = "K", descriptor = "[I")
    public int[] field9802;

    @OriginalMember(owner = "client!aga", name = "u", descriptor = "[Ljava/lang/String;")
    private String[] field9787;

    @OriginalMember(owner = "client!aga", name = "F", descriptor = "[[I")
    private int[][] field9797;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIIIIIIIII)Z", line = 5)
    public static final boolean method3898(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field9798++;
        if (!class350.method2211(arg9, arg0, arg1, -105)) {
            return false;
        }
        int var10 = class296.field4463[0];
        int var11 = class296.field4463[1];
        int var12 = class296.field4463[2];
        if (!class350.method2211(arg3, arg2, arg6, -105)) {
            return false;
        }
        int var13 = class296.field4463[2];
        int var14 = class296.field4463[1];
        int var15 = class296.field4463[0];
        if (class350.method2211(arg4, arg5, arg8, -107)) {
            int var16 = class296.field4463[arg7];
            int var17 = class296.field4463[1];
            int var18 = class296.field4463[2];
            return class464.method2751(var14, (byte) -98, var11, var15, var17, var13, var10, var12, var16, var18);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(I)V", line = 34)
    public static void method3899(int arg0) {
        field9791 = null;
        if (arg0 != -1) {
            field9791 = null;
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lrv;I[I)V", line = 48)
    public final void method3900(class120 arg0, int arg1, int[] arg2) {
        field9790++;
        if (this.field9788 == null) {
            return;
        }
        if (arg1 > -93) {
            method3898(-99, -46, 73, 21, 66, -53, 105, -13, -109, 81);
        }
        for (int var4 = 0; var4 < this.field9788.length; var4++) {
            if (arg2.length <= var4) {
                return;
            }
            int var5 = this.method3901(-120, var4).field3817;
            if (var5 > 0) {
                arg0.method869(var5, (long) arg2[var4], 4589);
            }
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(II)Lrh;", line = 77)
    public final class275 method3901(int arg0, int arg1) {
        if (arg0 >= -30) {
            method3899(125);
        }
        field9795++;
        return this.field9788 == null || arg1 < 0 || this.field9788.length < arg1 ? null : class134.method952((byte) -101, this.field9788[arg1]);
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lrv;B)Ljava/lang/String;", line = 92)
    public final String method3902(class120 arg0, byte arg1) {
        field9803++;
        StringBuffer var3 = new StringBuffer(80);
        if (arg1 < 77) {
            return null;
        }
        if (this.field9788 != null) {
            for (int var4 = 0; var4 < this.field9788.length; var4++) {
                var3.append(this.field9787[var4]);
                var3.append(this.field9792.method1617(this.field9797[var4], arg0.method845(8, class134.method952((byte) -101, this.field9788[var4]).field3824), this.method3901(-91, var4), (byte) 123));
            }
        }
        var3.append(this.field9787[this.field9787.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(Z)Ljava/lang/String;", line = 124)
    public final String method3903(boolean arg0) {
        field9793++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field9787 == null) {
            return "";
        }
        var2.append(this.field9787[0]);
        for (int var3 = 1; var3 < this.field9787.length; var3++) {
            var2.append("...");
            var2.append(this.field9787[var3]);
        }
        if (arg0) {
            this.field9787 = null;
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IILrv;)V", line = 152)
    private final void method3904(int arg0, int arg1, class120 arg2) {
        field9789++;
        if (arg0 == 1) {
            this.field9787 = class29.method214('<', arg2.method861(true), -98);
        } else if (arg0 == 2) {
            int var9 = arg2.method842(2384);
            this.field9802 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field9802[var10] = arg2.method898((byte) -124);
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method842(2384);
            this.field9788 = new int[var4];
            this.field9797 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method898((byte) -119);
                class275 var7 = class134.method952((byte) -101, var6);
                if (var7 != null) {
                    this.field9788[var5] = var6;
                    this.field9797[var5] = new int[var7.field3820];
                    for (int var8 = 0; var8 < var7.field3820; var8++) {
                        this.field9797[var5][var8] = arg2.method898((byte) -121);
                    }
                }
            }
        } else if (arg0 == 4) {
            this.field9804 = false;
        }
        int var11 = 49 / ((-arg1 - 24) / 52);
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(B)I", line = 230)
    public final int method3905(byte arg0) {
        field9800++;
        if (arg0 == 92) {
            return this.field9788 == null ? 0 : this.field9788.length;
        } else {
            return 17;
        }
    }

    @OriginalMember(owner = "client!aga", name = "d", descriptor = "(B)Lrq;", line = 244)
    public static final class368 method3906(byte arg0) {
        int var1 = -65 / ((-arg0 - 48) / 35);
        field9794++;
        try {
            return (class368) Class.forName("jk").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(III)I", line = 261)
    public final int method3907(int arg0, int arg1, int arg2) {
        field9796++;
        if (this.field9788 == null || arg1 < 0 || arg1 > this.field9788.length) {
            return -1;
        } else if (this.field9797[arg1] == null || arg0 < 0 || arg0 > this.field9797[arg1].length) {
            return -1;
        } else {
            int var4 = 56 % ((-arg2 - 42) / 37);
            return this.field9797[arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(II)V", line = 279)
    public static final void method3908(int arg0, int arg1) {
        if (arg0 >= 116) {
            field9801++;
            class678 var2 = class630.method3597(29636, 3, (long) arg1);
            var2.method3836((byte) -109);
        }
    }

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "(I)V", line = 292)
    public final void method3909(int arg0) {
        if (this.field9802 != null) {
            for (int var2 = 0; var2 < this.field9802.length; var2++) {
                this.field9802[var2] = class281.method1904(this.field9802[var2], 32768);
            }
        }
        int var3 = -2 / ((arg0 + 39) / 50);
        field9799++;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lrv;I)V", line = 317)
    public final void method3910(class120 arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        field9786++;
        while (true) {
            int var3 = arg0.method842(arg1 + 2384);
            if (var3 == 0) {
                return;
            }
            this.method3904(var3, 114, arg0);
        }
    }
}
