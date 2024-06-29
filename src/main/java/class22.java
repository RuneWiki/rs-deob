import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class22 extends class605 {

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
    public static int field461 = 0;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "[B")
    private byte[] field467;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "[Lfe;")
    public static class597[] field466;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZI)V")
    public static final void method148(boolean arg0, int arg1) {
        if (arg1 != 1572442825) {
            method150(true);
        }
        field463++;
        if (arg0) {
            if (class359.field4911 != -1) {
                class657.method3694(class359.field4911, true);
            }
            for (class637 var2 = (class637) class186.field2881.method335(arg1 ^ 0xA2461CBC); var2 != null; var2 = (class637) class186.field2881.method336(95)) {
                if (!var2.method1208(-121)) {
                    var2 = (class637) class186.field2881.method335(-29067);
                    if (var2 == null) {
                        break;
                    }
                }
                class305.method1954(true, var2, false, (byte) -24);
            }
            class359.field4911 = -1;
            class186.field2881 = new class46(8);
            class413.method2442((byte) 74);
            class359.field4911 = class434.field5913;
            class386.method2349(0, false);
            class622.method3506(111);
            class76.method656(class359.field4911);
        }
        class550.field7473 = "";
        class184.field2862 = "";
        class753.field10403 = false;
        class522.method2967(21);
        class335.field4516 = -1;
        class391.method2367(class84.field1154, arg1 - 1572442951);
        class235.field3379 = new class771();
        class235.field3379.field7398 = class65.field926 * 512 / 2;
        class235.field3379.field7396 = class483.field6515 * 512 / 2;
        class235.field3379.field5304[0] = class483.field6515 / 2;
        class450.field6172 = 0;
        class733.field10131 = 0;
        class235.field3379.field5308[0] = class65.field926 / 2;
        if (class536.field7291 == 2) {
            class733.field10131 = class152.field2496 << 9;
            class450.field6172 = class113.field2114 << 9;
        } else {
            class504.method2879((byte) -124);
        }
        class596.method3394(9);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)I")
    public static final int method149(int arg0, int arg1, int arg2) {
        field465++;
        if (arg0 != -30052) {
            field466 = null;
        }
        int var3 = arg2 + (arg1 * 57);
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return (var5 & 0x7F8566F) >> 19;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(Z)V")
    public static void method150(boolean arg0) {
        if (!arg0) {
            field461 = 77;
        }
        field466 = null;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(IIII)[B")
    public final byte[] method151(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 5066) {
            this.field467 = null;
        }
        field464++;
        this.field467 = new byte[arg0 * 2 * arg1 * arg2];
        this.method4164(arg3 - 4811, arg2, arg1, arg0);
        return this.field467;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BIB)V")
    public final void method152(byte arg0, int arg1, byte arg2) {
        field462++;
        int var4 = arg1 * 2;
        byte var5 = (byte) (((arg2 & 0xFF) >> 1) + 127);
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field467[var10001] = var5;
        this.field467[var6] = var5;
        if (arg0 != 69) {
            field466 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    public class22() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
