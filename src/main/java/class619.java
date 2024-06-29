import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class619 {

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "Lfc;")
    private class262 field8678 = new class262(256);

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "Luv;")
    private class367 field8680;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "Ld;")
    private class152 field8675;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "Z")
    public static boolean field8674 = false;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field8673 = 0;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "[I")
    public static int[] field8682 = new int[2048];

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "Z")
    public static boolean field8684 = false;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field8677;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public static int field8679;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    public static int field8681;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    public static int field8683;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "I")
    public static int field8685;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "[[Z")
    public static boolean[][] field8676;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
    public static void method3508(byte arg0) {
        field8682 = null;
        field8676 = null;
        if (arg0 < 79) {
            method3508((byte) -66);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
    public final void method3509(int arg0) {
        field8679++;
        if (arg0 != -3) {
            method3508((byte) 47);
        }
        this.field8678.method1563(arg0 + 80);
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Luv;Ld;)V")
    public class619(class367 arg0, class152 arg1) {
        this.field8680 = arg0;
        this.field8675 = arg1;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)Z")
    public static final boolean method3510(boolean arg0) {
        field8685++;
        if (class492.method2758("jaclib", (byte) -36)) {
            if (!arg0) {
                method3508((byte) 113);
            }
            return class492.method2758("hw3d", (byte) -36);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)Ljs;")
    public final class334 method3511(int arg0, int arg1) {
        field8681++;
        Object var3 = this.field8678.method1571(arg0 - 124, (long) arg1);
        if (var3 != null) {
            return (class334) var3;
        } else if (!this.field8675.method922(-5, arg1)) {
            return null;
        } else if (arg0 == 0) {
            class335 var4 = this.field8675.method925(arg1, arg0 - 28755);
            int var5 = var4.field4524 ? 64 : this.field8680.field5099;
            class334 var7;
            if (var4.field4519 && this.field8680.method377()) {
                float[] var6 = this.field8675.method924((byte) -117, false, arg1, var5, 0.7F, var5);
                var7 = this.field8680.method2183(class758.field10567, var4.field4536 != 0, var6, false, var5, var5);
            } else {
                int[] var8;
                if (var4.field4520 != 2 && class3.method7(arg0 ^ 0x1, var4.field4522)) {
                    var8 = this.field8675.method923(arg1, (byte) -116, var5, 0.7F, true, var5);
                } else {
                    var8 = this.field8675.method927(arg0 + 115, var5, arg1, 0.7F, false, var5);
                }
                var7 = this.field8680.method2150(var5, var5, (byte) 31, var8, var4.field4536 != 0);
            }
            var7.method1694(var4.field4528, var4.field4521, -97);
            this.field8678.method1574((long) arg1, var7, (byte) -80);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V")
    public final void method3512(int arg0) {
        this.field8678.method1569((byte) 62, 5);
        if (arg0 < -112) {
            field8677++;
        }
    }
}
