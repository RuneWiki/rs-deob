import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class197 {

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public int field2536;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "[F")
    public static float[] field2534 = new float[4];

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field2533 = 0;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "Lql;")
    public static class187 field2532;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "Lvk;")
    public static class427 field2537;

    @OriginalMember(owner = "client!o", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2531++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Let;B)I")
    public static final int method1236(class718 arg0, byte arg1) {
        field2530++;
        String var2 = class554.method3151(arg0, false);
        if (arg1 <= 14) {
            method1237((byte) -31);
        }
        int[] var3 = null;
        if (class289.method1731(arg0.field10134, (byte) -32)) {
            var3 = class190.field2488.method3944(256, (int) arg0.field10137).field2141;
        } else if (arg0.field10129 != -1) {
            var3 = class190.field2488.method3944(256, arg0.field10129).field2141;
        } else if (class589.method3275(arg0.field10134, (byte) -88)) {
            class247 var6 = (class247) class563.field7875.method3248((long) ((int) arg0.field10137), 0);
            if (var6 != null) {
                class124 var7 = var6.field3158;
                class155 var8 = var7.field1486;
                if (var8.field1929 != null) {
                    var8 = var8.method968((byte) -76, class461.field6637);
                }
                if (var8 != null) {
                    var3 = var8.field1951;
                }
            }
        } else if (class638.method3464(arg0.field10134, 95)) {
            Object var4 = null;
            class290 var5;
            if (arg0.field10134 == 1002) {
                var5 = class358.field5112.method890((int) arg0.field10137, false);
            } else {
                var5 = class358.field5112.method890((int) (arg0.field10137 >>> 32 & 0x7FFFFFFFL), false);
            }
            if (var5.field3685 != null) {
                var5 = var5.method1739((byte) -120, class461.field6637);
            }
            if (var5 != null) {
                var3 = var5.field3734;
            }
        }
        if (var3 != null) {
            var2 = var2 + class162.method1000(25078, var3);
        }
        int var9 = class111.field1373.method445((byte) 94, class289.field3681, var2);
        if (arg0.field10126) {
            var9 += class270.field3426.method1895() + 4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
    public static final void method1237(byte arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class613.field8483[var1] = null;
        }
        if (arg0 != -41) {
            field2538 = 55;
        }
        field2539++;
        class125.field1502 = 0;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static void method1238(int arg0) {
        if (arg0 <= -91) {
            field2534 = null;
            field2532 = null;
            field2537 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lha;IBI)V")
    public static final void method1239(class454 arg0, int arg1, byte arg2, int arg3) {
        if (arg2 > -13) {
            return;
        }
        field2540++;
        class73.field960 = new class711[arg1][arg3];
        class518.field7289 = arg0;
        if (class756.field10529 != null) {
            class489.field6957 = class269.method1613((byte) -103, class756.field10529[2], class756.field10529[3], class756.field10529[5], class756.field10529[4], class756.field10529[0], class756.field10529[1]);
        }
        class636.field8805 = new class711();
        class261.method1582(112);
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(II)V")
    public class197(int arg0, int arg1) {
        this.field2536 = arg0;
    }
}
