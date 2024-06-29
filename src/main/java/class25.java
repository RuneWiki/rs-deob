import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class25 {

    @OriginalMember(owner = "client!an", name = "e", descriptor = "Ljava/lang/String;")
    public String field389;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "Ljava/lang/String;")
    public String field385;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "Ljava/lang/String;")
    public String field386;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BII)Z", line = 3)
    public static final boolean method238(byte arg0, int arg1, int arg2) {
        field388++;
        if (arg0 == -78) {
            return (arg2 & 0x10) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IILaa;IILmea;IIJ)V", line = 16)
    public static final void method239(int arg0, int arg1, class511 arg2, int arg3, int arg4, class451 arg5, int arg6, int arg7, long arg8) {
        field387++;
        int var10 = arg0 * arg0 + arg4 * arg4;
        if (arg8 < (long) var10) {
            return;
        }
        int var11 = Math.min(arg5.field6290 / 2, arg5.field6288 / 2);
        if (arg1 > -85) {
            return;
        }
        if ((var11 * var11) >= var10) {
            class554.method3296(arg6, arg5, arg4, -28909, class703.field9801[arg3], arg2, arg0, arg7);
            return;
        }
        var11 -= 10;
        int var12;
        if (class416.field5704 == 4) {
            var12 = (int) class758.field10460 & 0x3FFF;
        } else {
            var12 = (int) class758.field10460 + class29.field416 & 0x3FFF;
        }
        int var13 = class376.field5186[var12];
        int var14 = class376.field5188[var12];
        if (class416.field5704 != 4) {
            var14 = var14 * 256 / (class347.field4853 + 256);
            var13 = var13 * 256 / (class347.field4853 + 256);
        }
        int var15 = arg0 * var13 + arg4 * var14 >> 14;
        int var16 = arg0 * var14 - arg4 * var13 >> 14;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var11 * Math.sin(var17));
        int var20 = (int) ((double) var11 * Math.cos(var17));
        class413.field5628[arg3].method1612((float) arg5.field6290 / 2.0F + (float) arg6 + (float) var19, (float) arg5.field6288 / 2.0F + (float) arg7 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 72)
    public class25(String arg0, String arg1, String arg2) {
        this.field389 = arg1;
        this.field385 = arg2;
        this.field386 = arg0;
    }
}
