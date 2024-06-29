import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class420 extends class184 {

    @OriginalMember(owner = "client!nu", name = "D", descriptor = "I")
    private int field5948 = 1;

    @OriginalMember(owner = "client!nu", name = "M", descriptor = "I")
    private int field5955 = 1;

    @OriginalMember(owner = "client!nu", name = "N", descriptor = "I")
    private int field5956 = 204;

    @OriginalMember(owner = "client!nu", name = "F", descriptor = "Ldq;")
    public static class493 field5949 = new class493(39, -1);

    @OriginalMember(owner = "client!nu", name = "G", descriptor = "I")
    public static int field5950;

    @OriginalMember(owner = "client!nu", name = "H", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!nu", name = "J", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!nu", name = "K", descriptor = "I")
    public static int field5953;

    @OriginalMember(owner = "client!nu", name = "L", descriptor = "[Ll;")
    public static class16[] field5954;

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "(I)V", line = 7)
    public static void method2467(int arg0) {
        field5954 = null;
        if (arg0 <= 58) {
            field5954 = null;
        }
        field5949 = null;
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V", line = 18)
    public class420() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "([S[Ljava/lang/String;I)V", line = 21)
    public static final void method2468(short[] arg0, String[] arg1, int arg2) {
        if (arg2 != 1) {
            field5954 = null;
        }
        method2469(arg0, arg1, 0, arg1.length + -1, (byte) -92);
        ++field5953;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(BILfh;)V", line = 38)
    public final void method7(byte arg0, int arg1, class463 arg2) {
        int var4 = 68 % ((arg0 - -13) / 51);
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field5956 = arg2.method2758((byte) 123);
                }
            } else {
                this.field5955 = arg2.method2737(false);
            }
        } else {
            this.field5948 = arg2.method2737(false);
        }
        ++field5951;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "([S[Ljava/lang/String;IIB)V", line = 80)
    private static final void method2469(short[] arg0, String[] arg1, int arg2, int arg3, byte arg4) {
        if (arg2 < arg3) {
            int var5 = (arg2 + arg3) / 2;
            int var6 = arg2;
            String var7 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var7;
            short var8 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var8;
            for (int var9 = arg2; ~arg3 < ~var9; ++var9) {
                if (var7 == null || arg1[var9] != null && (1 & var9) > arg1[var9].compareTo(var7)) {
                    String var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    short var11 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6++] = var11;
                }
            }
            arg1[arg3] = arg1[var6];
            arg1[var6] = var7;
            arg0[arg3] = arg0[var6];
            arg0[var6] = var8;
            method2469(arg0, arg1, arg2, var6 + -1, (byte) -92);
            method2469(arg0, arg1, var6 + 1, arg3, (byte) -92);
        }
        ++field5950;
        if (arg4 != -92) {
            field5954 = null;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)[I", line = 142)
    public final int[] method6(int arg0, int arg1) {
        ++field5952;
        if (arg1 != 578) {
            return null;
        } else {
            int[] var3 = super.field2409.method248(arg0, 16776960);
            if (super.field2409.field436) {
                for (int var4 = 0; ~class245.field3167 < ~var4; ++var4) {
                    int var5 = class347.field4461[var4];
                    int var6 = class334.field4218[arg0];
                    int var7 = this.field5948 * var5 >> 12;
                    int var8 = this.field5955 * var6 >> 12;
                    int var9 = var5 % (4096 / this.field5948) * this.field5948;
                    int var10 = var6 % (4096 / this.field5955) * this.field5955;
                    if (this.field5956 > var10) {
                        for (var7 -= var8; var7 < 0; var7 += 4) {
                        }
                        while (~var7 < -4) {
                            var7 -= 4;
                        }
                        if (~var7 != -2) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (this.field5956 > var9) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (var9 < this.field5956) {
                        int var11;
                        for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                        }
                        while (~var11 < -4) {
                            var11 -= 4;
                        }
                        if (var11 > 0) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    var3[var4] = 4096;
                }
            }
            return var3;
        }
    }
}
