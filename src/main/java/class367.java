import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class367 extends class354 {

    @OriginalMember(owner = "client!pt", name = "J", descriptor = "I")
    private int field5501 = 20;

    @OriginalMember(owner = "client!pt", name = "K", descriptor = "I")
    private int field5502 = 1365;

    @OriginalMember(owner = "client!pt", name = "P", descriptor = "I")
    private int field5506 = 0;

    @OriginalMember(owner = "client!pt", name = "N", descriptor = "I")
    private int field5504 = 0;

    @OriginalMember(owner = "client!pt", name = "M", descriptor = "Lgf;")
    public static class180 field5503 = new class180("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!pt", name = "T", descriptor = "[Ljava/lang/String;")
    public static String[] field5510 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!pt", name = "R", descriptor = "[[I")
    public static int[][] field5508 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!pt", name = "I", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!pt", name = "O", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!pt", name = "Q", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!pt", name = "S", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!pt", name = "U", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!pt", name = "H", descriptor = "Llm;")
    public static class344 field5499;

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "()V", line = 5)
    public class367() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BIIIILds;IILoa;Lea;Ltn;Ljava/lang/String;)V", line = 11)
    public static final void method2361(byte arg0, int arg1, int arg2, int arg3, int arg4, class12 arg5, int arg6, int arg7, class488 arg8, class381 arg9, class58 arg10, String arg11) {
        ++field5505;
        int var12;
        if (~class403.field5944 != -5) {
            var12 = 16383 & (int) class66.field1161 - -class8.field114;
        } else {
            var12 = (int) class66.field1161 & 16383;
        }
        int var13 = Math.max(arg10.field925 / 2, arg10.field896 / 2) + 10;
        int var14 = arg3 * arg3 - -(arg7 * arg7);
        if (var13 * var13 >= var14) {
            int var15 = class324.field4966[var12];
            int var16 = class324.field4974[var12];
            if (arg0 >= -92) {
                method2362(true);
            }
            if (~class403.field5944 != -5) {
                var16 = var16 * 256 / (class43.field662 - -256);
                var15 = var15 * 256 / (class43.field662 + 256);
            }
            int var17 = arg3 * var16 + arg7 * var15 >> 15;
            int var18 = arg7 * var16 + -(arg3 * var15) >> 15;
            int var19 = arg5.method101((class528[]) null, arg11, 100, 0);
            int var20 = arg5.method104(-1, 100, 0, arg11, (class528[]) null);
            int var21 = var17 - var19 / 2;
            if (~var21 <= ~(-arg10.field925) && ~arg10.field925 <= ~var21 && ~(-arg10.field896) >= ~var18 && var18 <= arg10.field896) {
                arg8.method2915((class528[]) null, 1, var19, 50, (int[]) null, 0, (byte) 80, arg2, arg9, 0, arg11, arg6, arg10.field925 / 2 + arg2 + var21, 0, arg4, arg10.field896 / 2 + -var18 + arg6 + -var20 + -arg1);
            }
        }
    }

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "(Z)V", line = 65)
    public static void method2362(boolean arg0) {
        field5508 = null;
        field5510 = null;
        field5499 = null;
        field5503 = null;
        if (arg0) {
            method2361((byte) -122, -99, -58, -120, -40, (class12) null, 97, 89, (class488) null, (class381) null, (class58) null, (String) null);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILti;I)V", line = 78)
    public final void method206(int arg0, class303 arg1, int arg2) {
        if (arg0 != 15180) {
            field5508 = null;
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 == 3) {
                        this.field5506 = arg1.method1868(0);
                    }
                } else {
                    this.field5504 = arg1.method1868(0);
                }
            } else {
                this.field5501 = arg1.method1868(0);
            }
        } else {
            this.field5502 = arg1.method1868(0);
        }
        ++field5507;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IZI)V", line = 129)
    public static final void method2363(int arg0, boolean arg1, int arg2) {
        ++field5511;
        if (~class404.field5952 != ~arg0) {
            class154.field2358 = new int[arg0];
            for (int var3 = 0; var3 < arg0; ++var3) {
                class154.field2358[var3] = (var3 << 12) / arg0;
            }
            class404.field5952 = arg0;
            class430.field6258 = arg0 * 32;
            class168.field2527 = arg0 + -1;
        }
        if (~class337.field5146 != ~arg2) {
            if (class404.field5952 == arg2) {
                class278.field4009 = class154.field2358;
            } else {
                class278.field4009 = new int[arg2];
                for (int var4 = 0; ~arg2 < ~var4; ++var4) {
                    class278.field4009[var4] = (var4 << 12) / arg2;
                }
            }
            class337.field5146 = arg2;
            class30.field492 = arg2 + -1;
        }
        if (arg1) {
            method2362(false);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IB)[I", line = 185)
    public final int[] method253(int arg0, byte arg1) {
        ++field5500;
        if (arg1 != -95) {
            method2363(-76, true, -108);
        }
        int[] var3 = super.field5357.method861(true, arg0);
        if (super.field5357.field1869) {
            for (int var4 = 0; class404.field5952 > var4; ++var4) {
                int var5 = (class154.field2358[var4] << 12) / this.field5502 + this.field5504;
                int var6 = (class278.field4009[arg0] << 12) / this.field5502 + this.field5506;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (~(var11 - -var12) > -16385 && this.field5501 > var13) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = -var12 + var7 + var11;
                    var12 = var10 * var10 >> 12;
                    ++var13;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = this.field5501 - 1 <= var13 ? 0 : (var13 << 12) / this.field5501;
            }
        }
        return var3;
    }
}
