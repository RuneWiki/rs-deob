import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class669 extends class739 {

    @OriginalMember(owner = "client!gba", name = "I", descriptor = "I")
    public static int field9386 = -1;

    @OriginalMember(owner = "client!gba", name = "H", descriptor = "Lan;")
    public static class23 field9385 = new class23();

    @OriginalMember(owner = "client!gba", name = "M", descriptor = "[Ltq;")
    public static class630[] field9390 = new class630[100];

    @OriginalMember(owner = "client!gba", name = "E", descriptor = "I")
    public static int field9382;

    @OriginalMember(owner = "client!gba", name = "F", descriptor = "I")
    public static int field9383;

    @OriginalMember(owner = "client!gba", name = "G", descriptor = "I")
    public static int field9384;

    @OriginalMember(owner = "client!gba", name = "J", descriptor = "I")
    public static int field9387;

    @OriginalMember(owner = "client!gba", name = "K", descriptor = "I")
    public static int field9388;

    @OriginalMember(owner = "client!gba", name = "L", descriptor = "I")
    public static int field9389;

    @OriginalMember(owner = "client!gba", name = "N", descriptor = "I")
    public static int field9391;

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "()V", line = 3)
    public class669() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIII)V", line = 9)
    public static final void method3758(int arg0, int arg1, int arg2, int arg3) {
        ++field9383;
        class37 var4 = class636.method3571(arg3, arg2, arg3 ^ -98);
        var4.method232(-3);
        var4.field579 = arg1;
        var4.field582 = arg0;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(BI)[[I", line = 22)
    public final int[][] method223(byte arg0, int arg1) {
        ++field9389;
        int[][] var3 = super.field10312.method2191((byte) 52, arg1);
        if (arg0 < 26) {
            method3758(59, 108, 110, 61);
        }
        if (super.field10312.field4922) {
            int[][] var4 = this.method4119(2, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class29.field523 < ~var11; ++var11) {
                var8[var11] = 4096 - var5[var11];
                var9[var11] = 4096 - var6[var11];
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(BIIJZ)Ljava/lang/String;", line = 71)
    public static final String method3759(byte arg0, int arg1, int arg2, long arg3, boolean arg4) {
        ++field9382;
        int var6 = 37 / ((arg0 - -29) / 53);
        char var7 = ',';
        char var8 = '.';
        if (~arg2 == -1) {
            var8 = ',';
            var7 = '.';
        }
        if (arg2 == 2) {
            var8 = 160;
        }
        boolean var9 = false;
        if (~arg3 > -1L) {
            var9 = true;
            arg3 = -arg3;
        }
        StringBuffer var10 = new StringBuffer(26);
        if (~arg1 < -1) {
            for (int var11 = 0; ~var11 > ~arg1; ++var11) {
                int var12 = (int) arg3;
                arg3 /= 10L;
                var10.append((char) (-((int) arg3 * 10) + 48 - -var12));
            }
            var10.append(var7);
        }
        int var13 = 0;
        while (true) {
            int var14 = (int) arg3;
            arg3 /= 10L;
            var10.append((char) (48 - -var14 + -((int) arg3 * 10)));
            if (arg3 == 0L) {
                if (var9) {
                    var10.append('-');
                }
                return var10.reverse().toString();
            }
            if (arg4) {
                ++var13;
                if (var13 % 3 == 0) {
                    var10.append(var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(II)[I", line = 149)
    public final int[] method215(int arg0, int arg1) {
        ++field9391;
        int[] var3 = super.field10311.method2116(arg1, (byte) 116);
        if (arg0 != -23347) {
            field9386 = 34;
        }
        if (super.field10311.field4728) {
            int[] var4 = this.method4115(-122, arg1, 0);
            for (int var5 = 0; class29.field523 > var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lvda;I)V", line = 182)
    public static final void method3760(class184 arg0, int arg1) {
        ++field9384;
        if (arg1 == -23719) {
            arg0.method3615(54);
            boolean var2 = false;
            for (class184 var3 = (class184) class330.field4215.method118(-30553); var3 != null; var3 = (class184) class330.field4215.method111(22548)) {
                if (class454.method2549((byte) -104, var3.method1246((byte) 124), arg0.method1246((byte) 123))) {
                    class374.method2150(arg0, -53, var3);
                    var2 = true;
                    break;
                }
            }
            if (!var2) {
                class330.field4215.method116(arg0, arg1 + 23720);
            }
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lsl;II)V", line = 216)
    public final void method214(class461 arg0, int arg1, int arg2) {
        if (~arg1 == -1) {
            super.field10297 = ~arg0.method2600((byte) -126) == -2;
        }
        if (arg2 == -3) {
            ++field9388;
        }
    }

    @OriginalMember(owner = "client!gba", name = "e", descriptor = "(I)V", line = 229)
    public static void method3761(int arg0) {
        field9385 = null;
        if (arg0 != 0) {
            field9385 = null;
        }
        field9390 = null;
    }
}
