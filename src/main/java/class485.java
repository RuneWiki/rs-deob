import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class485 extends class244 {

    @OriginalMember(owner = "client!tm", name = "F", descriptor = "[F")
    public static float[] field6861 = new float[4];

    @OriginalMember(owner = "client!tm", name = "G", descriptor = "Lkl;")
    public static class468 field6862 = new class468(1);

    @OriginalMember(owner = "client!tm", name = "B", descriptor = "I")
    public static int field6857;

    @OriginalMember(owner = "client!tm", name = "C", descriptor = "I")
    public static int field6858;

    @OriginalMember(owner = "client!tm", name = "D", descriptor = "I")
    public static int field6859;

    @OriginalMember(owner = "client!tm", name = "H", descriptor = "I")
    public static int field6863;

    @OriginalMember(owner = "client!tm", name = "E", descriptor = "[B")
    private byte[] field6860;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(IIII)[B")
    public final byte[] method2785(int arg0, int arg1, int arg2, int arg3) {
        this.field6860 = new byte[arg0 * arg3 * arg2 * 2];
        field6857++;
        if (arg1 >= -124) {
            method2786(74, -91, 105);
        }
        this.method1864(arg3, (byte) 15, arg2, arg0);
        return this.field6860;
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(III)Lao;")
    public static final class367 method2786(int arg0, int arg1, int arg2) {
        class184 var3 = class277.field4051[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2672;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZIII)I")
    public static final int method2787(boolean arg0, int arg1, int arg2, int arg3) {
        field6863++;
        class217 var4 = class132.method1024(arg1, arg2, arg0);
        if (var4 == null) {
            return 0;
        } else if (arg3 >= 0 && var4.field3277.length > arg3) {
            return var4.field3277[arg3];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "()V")
    public class485() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BIZ)V")
    public final void method1548(byte arg0, int arg1, boolean arg2) {
        field6858++;
        int var4 = arg1 * 2;
        byte var5 = (byte) (((arg0 & 0xFF) >> 1) + 127);
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field6860[var10001] = var5;
        this.field6860[var6] = var5;
        if (!arg2) {
            field6861 = null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)V")
    public static void method2788(boolean arg0) {
        if (!arg0) {
            method2786(102, 49, -47);
        }
        field6862 = null;
        field6861 = null;
    }
}
