import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class756 {

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    private int field10526 = 0;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "Lqp;")
    private class715 field10520;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field10525 = -1;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field10521;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field10523;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field10524;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field10527;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Lqm;")
    private class430 field10522;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)Lqm;", line = 4)
    public final class430 method4198(int arg0) {
        if (arg0 != 1) {
            method4199(null, null, -81);
        }
        field10524++;
        if (this.field10526 > 0 && this.field10520.field10088[this.field10526 - 1] != this.field10522) {
            class430 var2 = this.field10522;
            this.field10522 = var2.field6189;
            return var2;
        }
        while (this.field10520.field10086 > this.field10526) {
            class430 var3 = this.field10520.field10088[this.field10526++].field6189;
            if (this.field10520.field10088[this.field10526 - 1] != var3) {
                this.field10522 = var3.field6189;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lsl;Ljava/lang/String;I)I", line = 38)
    public static final int method4199(class479 arg0, String arg1, int arg2) {
        if (arg2 != -1) {
            field10521 = 89;
        }
        field10527++;
        int var3 = arg0.field6864;
        byte[] var4 = class466.method2819(arg1, -129);
        arg0.method2875(var4.length, false);
        arg0.field6864 += class461.field6566.method2761(0, -75, var4.length, var4, arg0.field6800, arg0.field6864);
        return arg0.field6864 - var3;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([Ljw;II)V", line = 57)
    public static final void method4200(class280[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class280 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field3926;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field3926 < (var7 & 0x1) + var6) {
                class280 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method4200(arg0, arg1, var4 - 1);
        method4200(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)Lqm;", line = 94)
    public final class430 method4201(boolean arg0) {
        field10523++;
        if (arg0) {
            this.method4201(true);
        }
        this.field10526 = 0;
        return this.method4198(1);
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V", line = 114)
    public class756() {
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lqp;)V", line = 119)
    public class756(class715 arg0) {
        this.field10520 = arg0;
    }
}
