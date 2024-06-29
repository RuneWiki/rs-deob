import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class376 extends class366 {

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
    private int field5359;

    @OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
    private int field5358;

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "I")
    private int field5360;

    @OriginalMember(owner = "client!fs", name = "k", descriptor = "I")
    private int field5356;

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "Lsd;")
    public static class74 field5361;

    @OriginalMember(owner = "client!fs", name = "r", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
    public static int field5355;

    @OriginalMember(owner = "client!fs", name = "l", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!fs", name = "q", descriptor = "I")
    public static int field5362;

    static {
        new class40((String) null, "Dieses System darf nicht missbraucht werden!", (String) null, (String) null);
        field5361 = new class74(86, 6);
        field5363 = 127;
        new class40((String) null, "bevor du die Option 'Regelverstoß melden' benutzt.", (String) null, (String) null);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ZII)V", line = 8)
    public final void method374(boolean arg0, int arg1, int arg2) {
        ++field5354;
        if (arg0) {
            field5362 = 31;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)V", line = 18)
    public static void method2266(byte arg0) {
        if (arg0 != 11) {
            method2266((byte) 41);
        }
        field5361 = null;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(BII)V", line = 31)
    public final void method375(byte arg0, int arg1, int arg2) {
        ++field5357;
        int var4 = this.field5358 * arg1 >> 12;
        int var5 = this.field5359 * arg1 >> 12;
        if (arg0 < 44) {
            this.field5358 = 109;
        }
        int var6 = this.field5356 * arg2 >> 12;
        int var7 = this.field5360 * arg2 >> 12;
        class83.method420(var7, var4, super.field5242, 13, var6, var5);
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(IIIIIII)V", line = 51)
    public class376(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field5359 = arg2;
        this.field5358 = arg0;
        this.field5360 = arg3;
        this.field5356 = arg1;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIZ)V", line = 62)
    public final void method370(int arg0, int arg1, boolean arg2) {
        ++field5353;
        int var4 = this.field5358 * arg0 >> 12;
        if (!arg2) {
            this.method370(-114, 62, false);
        }
        int var5 = this.field5359 * arg0 >> 12;
        int var6 = this.field5356 * arg1 >> 12;
        int var7 = this.field5360 * arg1 >> 12;
        class154.method742(var6, var7, var5, super.field5242, super.field5241, 457854448, var4, super.field5239);
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)V", line = 83)
    public static final void method2267(byte arg0) {
        ++field5355;
        if (!class400.field5697) {
            class83.field1010 = true;
            int var1 = -49 / ((arg0 - 5) / 42);
            class400.field5697 = true;
            if (!class92.field1146) {
                class184.field2404 += (-class184.field2404 + 24.0F) / 2.0F;
            } else {
                class349.field5021 = (float) (-128 & (int) class349.field5021 + 191);
            }
        }
    }
}
