import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class62 extends class362 {

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "[J")
    public static long[] field854 = new long[10];

    @OriginalMember(owner = "client!mk", name = "G", descriptor = "I")
    public static int field859 = 1;

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!mk", name = "D", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!mk", name = "F", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!mk", name = "E", descriptor = "[Lnf;")
    public static class604[] field857;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lfca;II)V", line = 7)
    public final void method154(class93 arg0, int arg1, int arg2) {
        ++field851;
        if (~arg1 == arg2) {
            super.field4929 = ~arg0.method793((byte) 71) == -2;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IILkh;)Ljava/lang/String;", line = 18)
    public static final String method430(int arg0, int arg1, class17 arg2) {
        ++field852;
        if (!client.method2010(arg2).method3887(arg1, arg0 ^ 56916) && arg2.field246 == null) {
            return null;
        } else if (arg2.field324 != null && ~arg1 > ~arg2.field324.length && arg2.field324[arg1] != null && ~arg2.field324[arg1].trim().length() != -1) {
            if (arg0 != 65532) {
                field857 = null;
            }
            return arg2.field324[arg1];
        } else {
            return class178.field2814 ? "Hidden-" + arg1 : null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BLkh;II)V", line = 42)
    public static final void method431(byte arg0, class17 arg1, int arg2, int arg3) {
        ++field855;
        class514 var4 = arg1.method102(class95.field1472, -256);
        int var5 = -89 / ((arg0 - -64) / 50);
        if (var4 != null) {
            class95.field1472.method512(arg2, arg3, arg2 - -arg1.field347, arg1.field330 + arg3);
            if (~class442.field5989 <= -4) {
                class95.field1472.method511(-16777216, var4, arg2, arg3);
            } else {
                class783.field10756.method3434((float) arg1.field347 / 2.0F + (float) arg2, (float) arg1.field330 / 2.0F + (float) arg3, 4096, 65532 & (int) (-class53.field763) << 2, var4, arg2, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)[I", line = 70)
    public final int[] method156(int arg0, int arg1) {
        ++field858;
        int[] var3 = super.field4927.method808(-123, arg1);
        if (super.field4927.field1471) {
            int[] var4 = this.method2221(0, arg1, arg0 + 2026769189);
            for (int var5 = 0; ~var5 > ~class769.field10597; ++var5) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        if (arg0 != -2026769311) {
            field856 = -120;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)V", line = 102)
    public static void method432(int arg0) {
        field854 = null;
        field857 = null;
        if (arg0 != -4) {
            method430(-114, -109, (class17) null);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IB)[[I", line = 113)
    public final int[][] method153(int arg0, byte arg1) {
        ++field853;
        if (arg1 < 57) {
            field857 = null;
        }
        int[][] var3 = super.field4938.method3199(arg0, (byte) 103);
        if (super.field4938.field7848) {
            int[][] var4 = this.method2222(0, arg0, 28008);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class769.field10597 < ~var11; ++var11) {
                var8[var11] = 4096 - var5[var11];
                var9[var11] = 4096 - var6[var11];
                var10[var11] = 4096 - var7[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V", line = 160)
    public class62() {
        super(1, false);
    }
}
