import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class289 extends class64 {

    @OriginalMember(owner = "client!va", name = "x", descriptor = "I")
    private int field4213;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "I")
    private int field4215;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "I")
    private int field4214;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    private int field4206;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "[B")
    public static byte[] field4203 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!va", name = "m", descriptor = "[[I")
    public static int[][] field4202 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!va", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field4207 = new String[100];

    @OriginalMember(owner = "client!va", name = "t", descriptor = "Z")
    public static boolean field4209 = false;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field4201 = 0;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "Z")
    public static boolean field4211 = false;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "[I")
    public static int[] field4210;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(III)V", line = 5)
    public final void method169(int arg0, int arg1, int arg2) {
        ++field4208;
        if (arg2 > -102) {
            this.field4206 = 87;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IZLjava/lang/String;I)Z", line = 16)
    public static final boolean method1968(int arg0, boolean arg1, String arg2, int arg3) {
        ++field4212;
        if (~arg3 <= -3 && ~arg3 >= -37) {
            if (arg0 != 5) {
                return false;
            } else {
                boolean var4 = false;
                boolean var5 = false;
                int var6 = 0;
                int var7 = arg2.length();
                for (int var8 = 0; ~var8 > ~var7; ++var8) {
                    char var9 = arg2.charAt(var8);
                    if (var8 == 0) {
                        if (~var9 == -46) {
                            var4 = true;
                            continue;
                        }
                        if (~var9 == -44 && arg1) {
                            continue;
                        }
                    }
                    int var11;
                    if (~var9 <= -49 && ~var9 >= -58) {
                        var11 = var9 - '0';
                    } else if (~var9 <= -66 && var9 <= 'Z') {
                        var11 = var9 - '7';
                    } else {
                        if (var9 < 'a' || var9 > 'z') {
                            return false;
                        }
                        var11 = var9 - 'W';
                    }
                    if (~var11 <= ~arg3) {
                        return false;
                    }
                    if (var4) {
                        var11 = -var11;
                    }
                    int var10 = arg3 * var6 + var11;
                    if (var10 / arg3 != var6) {
                        return false;
                    }
                    var5 = true;
                    var6 = var10;
                }
                return var5;
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(IIIIII)V", line = 101)
    public class289(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field4213 = arg2;
        this.field4215 = arg0;
        this.field4214 = arg3;
        this.field4206 = arg1;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V", line = 117)
    public static void method1969(int arg0) {
        field4202 = null;
        field4210 = null;
        field4203 = null;
        field4207 = null;
        if (arg0 != 18574) {
            method1968(95, true, (String) null, -113);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(III)V", line = 130)
    public final void method168(int arg0, int arg1, int arg2) {
        ++field4216;
        int var4 = this.field4215 * arg2 >> 12;
        int var5 = this.field4213 * arg2 >> 12;
        int var6 = this.field4206 * arg1 >> 12;
        int var7 = this.field4214 * arg1 >> 12;
        int var8 = 32 % ((arg0 - -30) / 46);
        class170.method1216((byte) -120, var6, super.field883, var7, var4, var5);
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(III)V", line = 148)
    public final void method173(int arg0, int arg1, int arg2) {
        ++field4204;
        if (arg0 != 200) {
            method1968(-121, false, (String) null, -79);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lbr;Lbr;B)V", line = 177)
    public static final void method1970(class223 arg0, class223 arg1, byte arg2) {
        ++field4217;
        class407.field5761.method2048(arg2 ^ 2023, 254);
        ++class306.field4468;
        class407.field5761.method849(arg1.field3227, (byte) -87);
        class407.field5761.method840(arg2 + 224, arg1.field3304);
        class407.field5761.method856(arg1.field3344, -1004744376);
        class407.field5761.method840(255, arg0.field3344);
        class407.field5761.method849(arg0.field3227, (byte) -123);
        if (arg2 == 31) {
            class407.field5761.method799(arg0.field3304, -85);
        }
    }
}
