import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public class class533 {

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "Z")
    public static boolean field7714 = false;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "[B")
    public static byte[] field7711;

    @OriginalMember(owner = "client!pga", name = "f", descriptor = "I")
    public static int field7716;

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "I")
    public static int field7712;

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "I")
    public static int field7713;

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "I")
    public static int field7715;

    static {
        int var0 = 0;
        field7711 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field7711[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field7716 = 1407;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)V", line = 7)
    public static final void method3129(int arg0) {
        if (client.field3743 == null) {
            client.field3743 = class593.method3388((byte) 124);
            class92.field959 = client.field3743[0];
            class98.field1024 = class652.method3700(-1);
        }
        field7713++;
        if (class188.field2237 == null) {
            class287.method1711((byte) -67);
        }
        if (arg0 > -120) {
            field7716 = -7;
        }
        class593 var1 = class92.field959;
        int var2 = class752.method4191(true);
        if (class92.field959 == var1) {
            class323.field4125 = class92.field959.field8356.method2936(class489.field6978, -81);
            if (class92.field959.field8353) {
                class529.field7531 = (class92.field959.field8351 - class92.field959.field8349) * var2 / 100 + class92.field959.field8349;
            }
            if (class92.field959.field8358) {
                class323.field4125 = class323.field4125 + class529.field7531 + "%";
            }
        } else if (class92.field959 == class593.field8381) {
            class188.field2237 = null;
            class313.method1860(true, 3);
        } else {
            class323.field4125 = var1.field8357.method2936(class489.field6978, -86);
            class529.field7531 = var1.field8351;
            if (class92.field959.field8358) {
                class323.field4125 = class323.field4125 + var1.field8351 + "%";
            }
            if (class92.field959.field8353 || var1.field8353) {
                class98.field1024 = class652.method3700(-1);
            }
        }
        if (class188.field2237 == null) {
            return;
        }
        class188.field2237.method4051(class92.field959, class529.field7531, class98.field1024, (byte) -41, class323.field4125);
        if (class87.field917 == null) {
            return;
        }
        for (int var3 = class461.field6570 + 1; var3 < class87.field917.length; var3++) {
            if (class87.field917[var3].method1186(31867) >= 100 && var3 - 1 == class461.field6570 && class392.field5397 >= 1 && class188.field2237.method4047(105)) {
                try {
                    class87.field917[var3].method1197((byte) -3);
                } catch (Exception var4) {
                    class87.field917 = null;
                    return;
                }
                class188.field2237.method4046(class87.field917[var3], -127);
                class461.field6570++;
                if ((class87.field917.length - 1) <= class461.field6570 && class87.field917.length > 1) {
                    class461.field6570 = class311.field3861.method1080((byte) 96) ? 0 : -1;
                }
            }
        }
        return;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(ILrp;IIFFFIIFFI[B)V", line = 105)
    public static final void method3130(int arg0, class435 arg1, int arg2, int arg3, float arg4, float arg5, float arg6, int arg7, int arg8, float arg9, float arg10, int arg11, byte[] arg12) {
        field7715++;
        for (int var13 = arg3; var13 < arg8; var13++) {
            class221.method1287(arg7, arg1, arg9, arg8, arg0, arg10, arg11, arg12, arg2, arg5, var13, arg4, arg6, 109);
            arg2 += arg7 * arg11;
        }
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(I)V", line = 122)
    public static void method3131(int arg0) {
        field7711 = null;
        if (arg0 != -1) {
            field7714 = false;
        }
    }

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "(I)V", line = 161)
    public static final void method3132(int arg0) {
        field7712++;
        class82.field858.method360(((float) class654.field9334.field9832.method2441(89) * 0.1F + 0.7F) * 1.1523438F);
        class82.field858.method325(class221.field2544, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
        class82.field858.method342(class66.field673, -1, arg0);
        class82.field858.method348(class231.field2699);
    }
}
