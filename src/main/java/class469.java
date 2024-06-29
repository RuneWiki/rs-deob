import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class469 {

    @OriginalMember(owner = "client!os", name = "d", descriptor = "J")
    public long field6502;

    @OriginalMember(owner = "client!os", name = "g", descriptor = "Lpa;")
    private class391 field6505;

    @OriginalMember(owner = "client!os", name = "f", descriptor = "Lib;")
    public static class164 field6504 = new class164("WTQA", "office", "_qa", 2);

    @OriginalMember(owner = "client!os", name = "h", descriptor = "[F")
    public static float[] field6506 = new float[2];

    @OriginalMember(owner = "client!os", name = "a", descriptor = "I")
    public static int field6499;

    @OriginalMember(owner = "client!os", name = "b", descriptor = "I")
    public static int field6500;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "I")
    public static int field6501;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "I")
    public static int field6503;

    @OriginalMember(owner = "client!os", name = "i", descriptor = "Lao;")
    public static class304 field6507;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V", line = 4)
    public static void method2766(int arg0) {
        field6507 = null;
        if (arg0 != 17335) {
            field6504 = null;
        }
        field6504 = null;
        field6506 = null;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZIII)Laj;", line = 16)
    public static final class333 method2767(boolean arg0, int arg1, int arg2, int arg3) {
        field6500++;
        if (arg2 != 8379) {
            method2768(-109, true);
        }
        class364 var4 = null;
        if (class741.field10224 != null) {
            var4 = new class364(arg1, class741.field10224, class347.field5086[arg1], 1000000);
        }
        class391.field5761[arg1] = class62.field891.method2427((byte) 125, arg1, var4, class722.field10057);
        class391.field5761[arg1].method1965(arg2 ^ 0x20F2);
        return new class333(class391.field5761[arg1], arg0, arg3);
    }

    @OriginalMember(owner = "client!os", name = "finalize", descriptor = "()V", line = 37)
    protected final void finalize() throws Throwable {
        field6503++;
        this.field6505.method2481(256, this.field6502);
        super.finalize();
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IZ)V", line = 47)
    public static final void method2768(int arg0, boolean arg1) {
        if (arg1) {
            if (class69.field968 != -1) {
                class506.method2929(47, class69.field968);
            }
            for (class237 var2 = (class237) class609.field8283.method3960(0); var2 != null; var2 = (class237) class609.field8283.method3955((byte) 90)) {
                if (!var2.method790(1)) {
                    var2 = (class237) class609.field8283.method3960(0);
                    if (var2 == null) {
                        break;
                    }
                }
                class618.method3397(false, true, var2, -86709072);
            }
            class69.field968 = -1;
            class609.field8283 = new class706(8);
            class786.method4345(-40);
            class69.field968 = class604.field8207;
            class503.method2921(-39, false);
            class229.method1502(0);
            class173.method1226(class69.field968);
        }
        field6499++;
        class256.field3816 = true;
        int var3 = -106 / ((-arg0 - 84) / 39);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 95)
    public static final int method2769(String arg0, byte arg1) {
        if (arg1 <= 71) {
            return 113;
        } else {
            field6501++;
            return arg0.length() + 1;
        }
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lpa;J[Lqea;)V", line = 105)
    public class469(class391 arg0, long arg1, class138[] arg2) {
        this.field6502 = arg1;
        this.field6505 = arg0;
    }
}
