import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class506 extends class11 {

    @OriginalMember(owner = "client!rl", name = "H", descriptor = "I")
    private int field7449 = 1;

    @OriginalMember(owner = "client!rl", name = "K", descriptor = "I")
    private int field7452 = 204;

    @OriginalMember(owner = "client!rl", name = "S", descriptor = "I")
    private int field7460 = 1;

    @OriginalMember(owner = "client!rl", name = "G", descriptor = "[[I")
    public static int[][] field7448 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!rl", name = "L", descriptor = "Z")
    public static boolean field7453 = false;

    @OriginalMember(owner = "client!rl", name = "N", descriptor = "[Ljava/lang/String;")
    public static String[] field7455 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!rl", name = "Q", descriptor = "Lwj;")
    public static class270 field7458 = new class270(90, 8);

    @OriginalMember(owner = "client!rl", name = "I", descriptor = "I")
    public static int field7450;

    @OriginalMember(owner = "client!rl", name = "J", descriptor = "I")
    public static int field7451;

    @OriginalMember(owner = "client!rl", name = "O", descriptor = "I")
    public static int field7456;

    @OriginalMember(owner = "client!rl", name = "P", descriptor = "I")
    public static int field7457;

    @OriginalMember(owner = "client!rl", name = "R", descriptor = "I")
    public static int field7459;

    @OriginalMember(owner = "client!rl", name = "M", descriptor = "Ll;")
    public static class16 field7454;

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V")
    public class506() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(B)V")
    public static void method3018(byte arg0) {
        field7448 = null;
        field7454 = null;
        field7455 = null;
        field7458 = null;
        if (arg0 != 21) {
            field7454 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIII)V")
    public static final void method3019(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= -1) {
            method3020(-18, -89, -120, true, 114, -88, -4, 14, 109);
        }
        ++field7451;
        if (class20.field269.field7650 != 0 && ~arg2 != -1 && ~class228.field3242 > -51 && ~arg1 != 0) {
            class275.field3767[class228.field3242++] = new class233((byte) 1, arg1, arg2, arg3, arg4, 0);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIZIIIII)Z")
    public static final boolean method3020(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field7450;
        if (arg2 != -2096) {
            field7455 = null;
        }
        int var9 = class316.field4324.field1127[0];
        int var10 = class316.field4324.field1117[0];
        if (~var9 <= -1 && class527.field7799 > var9 && var10 >= 0 && var10 < class422.field6182) {
            if (~arg8 <= -1 && ~class527.field7799 < ~arg8 && ~arg6 <= -1 && arg6 < class422.field6182) {
                int var11 = class74.method598(arg3, class244.field3415, -33, class316.field4324.method626((byte) 120), class82.field1229[class316.field4324.field1738], arg7, arg1, var9, arg0, arg6, arg5, arg4, arg8, class502.field7386, var10);
                if (~var11 > -2) {
                    return false;
                } else {
                    class228.field3244 = class502.field7386[var11 + -1];
                    class285.field3961 = class244.field3415[var11 + -1];
                    class445.field6555 = false;
                    class520.method3104((byte) -104);
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lsi;II)V")
    public final void method43(class391 arg0, int arg1, int arg2) {
        ++field7456;
        if (arg1 <= -40) {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (~arg2 == -3) {
                        this.field7452 = arg0.method2353((byte) 109);
                    }
                } else {
                    this.field7460 = arg0.method2348(-2);
                }
            } else {
                this.field7449 = arg0.method2348(-2);
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method3021(int arg0, String arg1) {
        if (arg0 != -1453) {
            return 91L;
        } else {
            ++field7459;
            long var2 = 0L;
            int var4 = arg1.length();
            for (int var5 = 0; var5 < var4; ++var5) {
                var2 *= 37L;
                char var6 = arg1.charAt(var5);
                if (~var6 <= -66 && ~var6 >= -91) {
                    var2 += (long) (1 - (-var6 + 65));
                } else if (var6 >= 'a' && ~var6 >= -123) {
                    var2 += (long) (var6 + 1 + -97);
                } else if (var6 >= '0' && ~var6 >= -58) {
                    var2 += (long) (var6 + 27 + -48);
                }
                if (var2 >= 177917621779460413L) {
                    break;
                }
            }
            while (var2 % 37L == 0L && var2 != 0L) {
                var2 /= 37L;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        ++field7457;
        int[] var3 = super.field158.method1312(arg1, (byte) 74);
        if (arg0 >= -42) {
            this.method44(-124, -89);
        }
        if (super.field158.field2966) {
            for (int var4 = 0; var4 < class90.field1316; ++var4) {
                int var5 = class448.field6606[var4];
                int var6 = class328.field4484[arg1];
                int var7 = this.field7449 * var5 >> 12;
                int var8 = this.field7460 * var6 >> 12;
                int var9 = var5 % (4096 / this.field7449) * this.field7449;
                int var10 = var6 % (4096 / this.field7460) * this.field7460;
                if (this.field7452 > var10) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var9 > ~this.field7452) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field7452) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
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
