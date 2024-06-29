import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class49 {

    @OriginalMember(owner = "client!gda", name = "f", descriptor = "I")
    public int field573 = 128;

    @OriginalMember(owner = "client!gda", name = "m", descriptor = "I")
    public int field580 = 128;

    @OriginalMember(owner = "client!gda", name = "g", descriptor = "I")
    public int field574;

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "I")
    public int field571;

    @OriginalMember(owner = "client!gda", name = "k", descriptor = "I")
    public int field578;

    @OriginalMember(owner = "client!gda", name = "l", descriptor = "I")
    public int field579;

    @OriginalMember(owner = "client!gda", name = "j", descriptor = "I")
    public static int field577 = -1;

    @OriginalMember(owner = "client!gda", name = "i", descriptor = "I")
    public static int field576 = -1;

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "Ltt;")
    public static class338 field569 = new class338(77, -1);

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!gda", name = "e", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!gda", name = "h", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)V")
    public static final void method259(int arg0) {
        class618.field8581.method249(false);
        field570++;
        for (int var1 = 0; var1 < 32; var1++) {
            class311.field4197[var1] = 0L;
        }
        int var2 = -114 % ((arg0 - 19) / 62);
        for (int var3 = 0; var3 < 32; var3++) {
            class451.field5952[var3] = 0L;
        }
        class310.field4190 = 0;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Z)V")
    public static void method260(boolean arg0) {
        if (!arg0) {
            field576 = -60;
        }
        field569 = null;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lgda;I)V")
    public final void method261(class49 arg0, int arg1) {
        field568++;
        this.field571 = arg0.field571;
        if (arg1 != -33) {
            return;
        }
        this.field573 = arg0.field573;
        this.field574 = arg0.field574;
        this.field578 = arg0.field578;
        this.field579 = arg0.field579;
        this.field580 = arg0.field580;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(III)I")
    public static final int method262(int arg0, int arg1, int arg2) {
        field572++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (arg0 != 128) {
            method259(64);
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(B)Lgda;")
    public final class49 method263(byte arg0) {
        if (arg0 >= -5) {
            this.field574 = -3;
        }
        field575++;
        return new class49(this.field574, this.field573, this.field580, this.field571, this.field578, this.field579);
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(I)V")
    public class49(int arg0) {
        this.field574 = arg0;
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(IIIIII)V")
    private class49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field574 = arg0;
        this.field573 = arg1;
        this.field571 = arg3;
        this.field578 = arg4;
        this.field579 = arg5;
        this.field580 = arg2;
    }
}
