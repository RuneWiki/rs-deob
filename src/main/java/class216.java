import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class216 {

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "Lab;")
    public static class148 field3257 = new class148();

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public int field3253;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public int field3254;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public int field3262;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "Lke;")
    public static class110 field3260;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "Lhc;")
    public static class235 field3261;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "[[I")
    public static int[][] field3264;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
    public static final void method1404(boolean arg0) {
        if (arg0) {
            field3261 = null;
        }
        field3263++;
        if (class221.field3310 < class179.field2513) {
            class221.field3310 = (float) ((double) class221.field3310 / 30.0D + (double) class221.field3310);
            if (class179.field2513 < class221.field3310) {
                class221.field3310 = class179.field2513;
            }
            class143.method956(-1);
        } else if (class179.field2513 < class221.field3310) {
            class221.field3310 = (float) ((double) class221.field3310 - (double) class221.field3310 / 30.0D);
            if (class179.field2513 > class221.field3310) {
                class221.field3310 = class179.field2513;
            }
            class143.method956(-1);
        }
        if (class75.field1054 == -1 || class67.field906 == -1) {
            return;
        }
        int var1 = class67.field906 - class234.field3529;
        int var2 = class75.field1054 - client.field2181;
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        class234.field3529 += var1;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        client.field2181 -= -var2;
        if (var2 == 0 && var1 == 0) {
            class67.field906 = -1;
            class75.field1054 = -1;
        }
        class143.method956(-1);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILql;)V")
    public final void method1405(int arg0, class224 arg1) {
        while (true) {
            int var3 = arg1.method1453((byte) -128);
            if (var3 == 0) {
                if (arg0 <= 92) {
                    return;
                }
                field3265++;
                return;
            }
            this.method1407(arg1, -96, var3);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static void method1406(int arg0) {
        field3261 = null;
        field3264 = null;
        if (arg0 != 0) {
            field3264 = null;
        }
        field3260 = null;
        field3257 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lql;II)V")
    private final void method1407(class224 arg0, int arg1, int arg2) {
        field3256++;
        if (arg2 == 1) {
            this.field3262 = arg0.method1445(false);
            this.field3254 = arg0.method1453((byte) -128);
            this.field3253 = arg0.method1453((byte) -127);
        }
        int var4 = -119 % ((-arg1 - 14) / 37);
    }
}
