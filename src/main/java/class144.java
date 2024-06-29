import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class144 extends class175 {

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "Lij;")
    public static class50 field2505 = null;

    @OriginalMember(owner = "client!qh", name = "P", descriptor = "Lij;")
    public static class50 field2509 = class78.method578(122, "<)4col>");

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "Lij;")
    public static class50 field2507 = class78.method578(123, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!qh", name = "O", descriptor = "Lij;")
    public static class50 field2508 = class78.method578(126, "sl_arrows");

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "[[I")
    public static int[][] field2504 = new int[104][104];

    @OriginalMember(owner = "client!qh", name = "V", descriptor = "[Z")
    public static boolean[] field2515 = new boolean[5];

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!qh", name = "Q", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!qh", name = "R", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!qh", name = "S", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!qh", name = "T", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!qh", name = "U", descriptor = "Ljava/awt/Image;")
    public static Image field2514;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)[I")
    public final int[] method29(int arg0, int arg1) {
        ++field2510;
        if (arg1 != -27746) {
            field2514 = null;
        }
        int[] var3 = super.field2941.method1427(-21281, arg0);
        if (super.field2941.field3565) {
            int[][] var4 = this.method1206(0, arg0, (byte) 64);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class211.field3514 < ~var8; ++var8) {
                var3[var8] = (var5[var8] + var7[var8] + var6[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLwd;)Lva;")
    public static final class34 method1006(byte arg0, class217 arg1) {
        if (arg0 < 124) {
            method1008((byte) -79, true, true);
        }
        ++field2513;
        return new class34(arg1.method1438(-126), arg1.method1438(-116), arg1.method1438(-107), arg1.method1438(-121), arg1.method1447(-5), arg1.method1447(113), arg1.method1487(255));
    }

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "(I)V")
    public static void method1007(int arg0) {
        field2507 = null;
        field2504 = null;
        field2514 = null;
        field2505 = null;
        field2509 = null;
        if (arg0 == 0) {
            field2515 = null;
            field2508 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BZZ)I")
    public static final int method1008(byte arg0, boolean arg1, boolean arg2) {
        if (arg0 > -39) {
            field2508 = null;
        }
        ++field2512;
        int var3 = 0;
        if (arg1) {
            var3 += class125.field2190 + class122.field2151;
        }
        if (arg2) {
            var3 += class239.field4108 + class160.field2752;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
    public class144() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method1009(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (class97.field1816 >= arg0 && class100.field1855 <= arg3) {
            boolean var6;
            if (~arg1 > ~class177.field2953) {
                var6 = false;
                arg1 = class177.field2953;
            } else if (arg1 <= class224.field3773) {
                var6 = true;
            } else {
                arg1 = class224.field3773;
                var6 = false;
            }
            boolean var7;
            if (~class177.field2953 >= ~arg2) {
                if (~class224.field3773 <= ~arg2) {
                    var7 = true;
                } else {
                    arg2 = class224.field3773;
                    var7 = false;
                }
            } else {
                arg2 = class177.field2953;
                var7 = false;
            }
            if (class100.field1855 > arg0) {
                arg0 = class100.field1855;
            } else {
                class155.method1090(class177.field2963[arg0++], arg1, arg4, 160, arg2);
            }
            if (~arg3 < ~class97.field1816) {
                arg3 = class97.field1816;
            } else {
                class155.method1090(class177.field2963[arg3--], arg1, arg4, 160, arg2);
            }
            if (var6 && var7) {
                for (int var8 = arg0; ~arg3 <= ~var8; ++var8) {
                    int[] var9 = class177.field2963[var8];
                    var9[arg1] = var9[arg2] = arg4;
                }
            } else if (!var6) {
                if (var7) {
                    for (int var10 = arg0; ~var10 >= ~arg3; ++var10) {
                        class177.field2963[var10][arg2] = arg4;
                    }
                }
            } else {
                for (int var11 = arg0; ~arg3 <= ~var11; ++var11) {
                    class177.field2963[var11][arg1] = arg4;
                }
            }
        }
        if (arg5) {
            field2509 = null;
        }
        ++field2506;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(JI[IZ)Lij;")
    public static final class50 method1010(long arg0, int arg1, int[] arg2, boolean arg3) {
        ++field2511;
        if (class96.field1793 != null) {
            class50 var5 = class96.field1793.method140(arg1, arg2, 2, arg0);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg3) {
            return null;
        } else {
            return arg1 == 5 ? class223.method1533((byte) -30, arg0).method375(!arg3) : class178.method1218(arg0, true);
        }
    }
}
