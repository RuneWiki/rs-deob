import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class715 extends class239 {

    @OriginalMember(owner = "client!lu", name = "p", descriptor = "I")
    private int field10064;

    @OriginalMember(owner = "client!lu", name = "o", descriptor = "I")
    private int field10063;

    @OriginalMember(owner = "client!lu", name = "t", descriptor = "I")
    private int field10068;

    @OriginalMember(owner = "client!lu", name = "s", descriptor = "I")
    private int field10067;

    @OriginalMember(owner = "client!lu", name = "q", descriptor = "I")
    private int field10065;

    @OriginalMember(owner = "client!lu", name = "r", descriptor = "I")
    private int field10066;

    @OriginalMember(owner = "client!lu", name = "l", descriptor = "Lwu;")
    private class373 field10060;

    @OriginalMember(owner = "client!lu", name = "n", descriptor = "I")
    public static int field10062;

    @OriginalMember(owner = "client!lu", name = "m", descriptor = "Lpf;")
    private class584 field10061;

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(B)Lpf;")
    public final class584 method1582(byte arg0) {
        int var2 = -15 % ((1 - arg0) / 48);
        field10062++;
        if (this.field10061 == null) {
            class523.field7483[0] = this.field10068;
            class523.field7483[5] = this.field10066;
            class523.field7483[3] = this.field10063;
            class523.field7483[1] = this.field10064;
            class523.field7483[4] = this.field10065;
            class151 var3 = this.field10060.field849;
            class523.field7483[2] = this.field10067;
            byte var4 = 0;
            int var5 = 0;
            for (int var6 = 0; var6 < 6; var6++) {
                if (!var3.method1121(-30695, class523.field7483[var6])) {
                    return null;
                }
                class293 var8 = var3.method1124((byte) -89, class523.field7483[var6]);
                int var9 = var8.field4174 ? 64 : 128;
                if (var8.field4180 > 0) {
                    var4 = 1;
                }
                if (var5 < var9) {
                    var5 = var9;
                }
            }
            for (int var7 = 0; var7 < 6; var7++) {
                class606.field8552[var7] = var3.method1123((byte) 72, 1.0F, false, class523.field7483[var7], var5, var5);
            }
            this.field10061 = this.field10060.method2424(class606.field8552, var5, var4 != 0, true);
        }
        return this.field10061;
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lwu;IIIIII)V")
    public class715(class373 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field10064 = arg2;
        this.field10063 = arg4;
        this.field10068 = arg1;
        this.field10067 = arg3;
        this.field10065 = arg5;
        this.field10066 = arg6;
        this.field10060 = arg0;
    }
}
