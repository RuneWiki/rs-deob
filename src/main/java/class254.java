import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class254 {

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "Lcc;")
    public static class209 field4578 = class95.method669(117, "Stufe: ");

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Lcc;")
    public static class209 field4575 = class95.method669(81, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field4581 = 0;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "Z")
    public static boolean field4574 = false;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "Lcc;")
    private static class209 field4579 = class95.method669(101, "Connecting to update server");

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public static int field4587 = 2;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    public static int field4590 = 0;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "Lcc;")
    public static class209 field4591 = field4579;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "Lcc;")
    private static class209 field4583 = class95.method669(121, "white:");

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "Lcc;")
    public static class209 field4585 = field4583;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "Lcc;")
    public static class209 field4582 = class95.method669(100, ")4l=");

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "Lcc;")
    public static class209 field4580 = field4583;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "Lal;")
    public static class231 field4593;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "Lfe;")
    public class254 field4576;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "Lfe;")
    public class254 field4584;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "[Lal;")
    public static class231[] field4577;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZLcc;)I")
    public static final int method1750(boolean arg0, class209 arg1) {
        field4592++;
        return arg0 ? arg1.method1486(5) + 1 : -94;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static void method1751(int arg0) {
        field4578 = null;
        field4577 = null;
        field4585 = null;
        field4593 = null;
        field4582 = null;
        if (arg0 <= 0) {
            return;
        }
        field4591 = null;
        field4583 = null;
        field4579 = null;
        field4575 = null;
        field4580 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILtf;)V")
    public static final void method1752(int arg0, class106 arg1) {
        if (class136.field2561 != null) {
            try {
                class136.field2561.method243(true, 0L);
                class136.field2561.method245(arg1.field2085, -10181, arg1.field2108, 24);
            } catch (Exception var2) {
            }
        }
        if (arg0 < -68) {
            arg1.field2085 += 24;
            field4586++;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZZIJ)Lcc;")
    public static final class209 method1753(boolean arg0, boolean arg1, int arg2, long arg3) {
        field4588++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        if (!arg1) {
            field4585 = null;
        }
        int var5 = 1;
        long var6 = arg3 / (long) arg2;
        while (var6 != 0L) {
            var6 /= (long) arg2;
            var5++;
        }
        int var8 = var5;
        if (arg3 < 0L || arg0) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg3 < 0L) {
            var9[0] = 45;
        } else if (arg0) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var12 = (int) (arg3 % (long) arg2);
            arg3 /= (long) arg2;
            if (var12 < 0) {
                var12 = -var12;
            }
            if (var12 > 9) {
                var12 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var12 + 48);
        }
        class209 var11 = new class209();
        var11.field3811 = var8;
        var11.field3786 = var9;
        return var11;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
    public final void method1754(int arg0) {
        if (arg0 >= -19) {
            field4593 = null;
        }
        field4589++;
        if (this.field4584 != null) {
            this.field4584.field4576 = this.field4576;
            this.field4576.field4584 = this.field4584;
            this.field4584 = null;
            this.field4576 = null;
        }
    }
}
