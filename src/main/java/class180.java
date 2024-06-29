import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class180 extends class512 {

    @OriginalMember(owner = "client!cp", name = "K", descriptor = "Lvv;")
    public static class313 field2852 = new class313(107, 3);

    @OriginalMember(owner = "client!cp", name = "Q", descriptor = "[S")
    public static short[] field2858 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!cp", name = "P", descriptor = "Lui;")
    public static class378 field2857 = new class378("LIVE", 0);

    @OriginalMember(owner = "client!cp", name = "R", descriptor = "[I")
    public static int[] field2859 = new int[14];

    @OriginalMember(owner = "client!cp", name = "G", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!cp", name = "H", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!cp", name = "I", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!cp", name = "J", descriptor = "I")
    private int field2851;

    @OriginalMember(owner = "client!cp", name = "L", descriptor = "I")
    private int field2853;

    @OriginalMember(owner = "client!cp", name = "M", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!cp", name = "N", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!cp", name = "O", descriptor = "I")
    private int field2856;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Ljava/lang/String;BZI)I", line = 5)
    public static final int method1214(String arg0, byte arg1, boolean arg2, int arg3) {
        ++field2848;
        if (arg3 >= 2 && arg3 <= 36) {
            if (arg1 > -81) {
                return -2;
            } else {
                boolean var4 = false;
                boolean var5 = false;
                int var6 = 0;
                int var7 = arg0.length();
                for (int var8 = 0; ~var8 > ~var7; ++var8) {
                    char var9 = arg0.charAt(var8);
                    if (~var8 == -1) {
                        if (var9 == '-') {
                            var4 = true;
                            continue;
                        }
                        if (var9 == '+' && arg2) {
                            continue;
                        }
                    }
                    int var11;
                    if (~var9 <= -49 && ~var9 >= -58) {
                        var11 = var9 - '0';
                    } else if (var9 >= 'A' && var9 <= 'Z') {
                        var11 = var9 - '7';
                    } else {
                        if (~var9 > -98 || var9 > 'z') {
                            throw new NumberFormatException();
                        }
                        var11 = var9 - 'W';
                    }
                    if (~var11 <= ~arg3) {
                        throw new NumberFormatException();
                    }
                    if (var4) {
                        var11 = -var11;
                    }
                    int var10 = arg3 * var6 + var11;
                    if (~(var10 / arg3) != ~var6) {
                        throw new NumberFormatException();
                    }
                    var5 = true;
                    var6 = var10;
                }
                if (!var5) {
                    throw new NumberFormatException();
                } else {
                    return var6;
                }
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(I)V", line = 85)
    private class180(int arg0) {
        super(0, false);
        this.method1216(99, arg0);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZILia;)V", line = 95)
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        if (arg1 == 0) {
            this.method1216(114, arg2.method181(107));
        }
        if (!arg0) {
            field2852 = null;
        }
        ++field2849;
    }

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "(I)V", line = 122)
    public static void method1215(int arg0) {
        field2859 = null;
        if (arg0 != -21488) {
            method1214((String) null, (byte) 71, true, -113);
        }
        field2858 = null;
        field2852 = null;
        field2857 = null;
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(II)[[I", line = 135)
    public final int[][] method278(int arg0, int arg1) {
        ++field2855;
        int[][] var3 = super.field7496.method2777(arg1, 0);
        int var4 = -30 / ((arg0 - -40) / 47);
        if (super.field7496.field6942) {
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class402.field6113; ++var8) {
                var5[var8] = this.field2851;
                var6[var8] = this.field2853;
                var7[var8] = this.field2856;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V", line = 172)
    public class180() {
        this(0);
    }

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "(II)V", line = 179)
    private final void method1216(int arg0, int arg1) {
        ++field2850;
        this.field2856 = 4080 & arg1 << 4;
        this.field2851 = arg1 >> 12 & 4080;
        this.field2853 = 4080 & arg1 >> 4;
        if (arg0 < 12) {
            method1215(-106);
        }
    }

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "(II)Lrr;", line = 198)
    public static final class280 method1217(int arg0, int arg1) {
        ++field2854;
        class280[] var2 = class24.method184(-34);
        for (int var3 = arg1; ~var3 > ~var2.length; ++var3) {
            if (var2[var3].field4586 == arg0) {
                return var2[var3];
            }
        }
        return null;
    }
}
