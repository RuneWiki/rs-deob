import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class498 {

    @OriginalMember(owner = "client!et", name = "e", descriptor = "Z")
    public boolean field7268 = false;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "[I")
    public static int[] field7264 = new int[4096];

    @OriginalMember(owner = "client!et", name = "h", descriptor = "Lui;")
    public static class375 field7271 = new class375("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!et", name = "m", descriptor = "[J")
    public static long[] field7276 = new long[32];

    @OriginalMember(owner = "client!et", name = "o", descriptor = "Lcm;")
    public static class449 field7278 = new class449(81, 3);

    @OriginalMember(owner = "client!et", name = "r", descriptor = "I")
    public static int field7281 = 0;

    @OriginalMember(owner = "client!et", name = "q", descriptor = "Lcm;")
    public static class449 field7280 = new class449(50, 7);

    @OriginalMember(owner = "client!et", name = "b", descriptor = "I")
    public static int field7265;

    @OriginalMember(owner = "client!et", name = "d", descriptor = "I")
    public static int field7267;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "I")
    public static int field7269;

    @OriginalMember(owner = "client!et", name = "g", descriptor = "I")
    public int field7270;

    @OriginalMember(owner = "client!et", name = "i", descriptor = "I")
    public static int field7272;

    @OriginalMember(owner = "client!et", name = "j", descriptor = "I")
    public int field7273;

    @OriginalMember(owner = "client!et", name = "k", descriptor = "I")
    public static int field7274;

    @OriginalMember(owner = "client!et", name = "n", descriptor = "I")
    public static int field7277;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "Lrv;")
    public class41 field7266;

    @OriginalMember(owner = "client!et", name = "l", descriptor = "Lns;")
    public static class438 field7275;

    @OriginalMember(owner = "client!et", name = "p", descriptor = "Lclient;")
    public static client field7279;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)I", line = 5)
    public static final int method2963(byte arg0) {
        field7267++;
        class496 var1 = class337.field5242;
        boolean var2 = false;
        if (class441.field6563 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class496.method2951(0, arg0 ^ 0x6040, null, null, var3, 0);
        }
        if (arg0 != 55) {
            method2963((byte) 22);
        }
        long var4 = class264.method1698(true);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method1098(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class264.method1698(true) - var4);
        var1.method2952(100, 100, 0, -16777216, (byte) -53, 0);
        if (var2) {
            var1.method2954((byte) -102);
        }
        return var7;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ILqa;ZI)Lf;", line = 46)
    public final class191 method2964(int arg0, class496 arg1, boolean arg2, int arg3) {
        field7272++;
        long var5 = (long) (arg1.field7242 << 19 | arg3 << 16 | this.field7273 | (arg2 ? 262144 : 0));
        class191 var7 = (class191) this.field7266.field638.method1013(var5, (byte) -106);
        if (var7 != null) {
            return var7;
        } else if (this.field7266.field626.method2624(-123, this.field7273)) {
            class476 var8 = class476.method2845(this.field7266.field626, this.field7273, 0);
            if (var8 != null) {
                var8.field6932 = var8.field6931 = var8.field6930 = var8.field6926 = 0;
                if (arg2) {
                    var8.method2850();
                }
                for (int var9 = 0; var9 < arg3; var9++) {
                    var8.method2844();
                }
            }
            if (arg0 > -91) {
                this.method2965(null, -124, -108);
            }
            class191 var10 = arg1.method1117(var8, true);
            if (var10 != null) {
                this.field7266.field638.method1012(-74, var5, var10);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Ltl;II)V", line = 97)
    private final void method2965(class91 arg0, int arg1, int arg2) {
        field7277++;
        if (arg2 == 1) {
            this.field7273 = arg0.method631(10494);
        } else if (arg2 == 2) {
            this.field7270 = arg0.method641(32455);
        } else if (arg2 == 3) {
            this.field7268 = true;
        } else if (arg2 == 4) {
            this.field7273 = -1;
        }
        if (arg1 != 32) {
            field7279 = null;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V", line = 130)
    public static void method2966(int arg0) {
        field7279 = null;
        if (arg0 != 7) {
            return;
        }
        field7264 = null;
        field7280 = null;
        field7278 = null;
        field7276 = null;
        field7275 = null;
        field7271 = null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Ltl;B)V", line = 147)
    public final void method2967(class91 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method618((byte) 100);
            if (var3 == 0) {
                if (arg1 < 106) {
                    return;
                }
                field7265++;
                return;
            }
            this.method2965(arg0, 32, var3);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)Z", line = 188)
    public final boolean method2968(boolean arg0) {
        field7274++;
        if (arg0) {
            method2963((byte) -127);
        }
        return this.field7266.field626.method2624(-102, this.field7273);
    }
}
