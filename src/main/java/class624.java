import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class624 extends class658 {

    @OriginalMember(owner = "client!ls", name = "E", descriptor = "I")
    private int field8493;

    @OriginalMember(owner = "client!ls", name = "u", descriptor = "I")
    private int field8483;

    @OriginalMember(owner = "client!ls", name = "I", descriptor = "I")
    private int field8497;

    @OriginalMember(owner = "client!ls", name = "z", descriptor = "I")
    private int field8488;

    @OriginalMember(owner = "client!ls", name = "D", descriptor = "Z")
    public static boolean field8492 = false;

    @OriginalMember(owner = "client!ls", name = "A", descriptor = "[Lsl;")
    public static class245[] field8489 = new class245[4];

    @OriginalMember(owner = "client!ls", name = "s", descriptor = "Lnc;")
    public static class580 field8481 = new class580();

    @OriginalMember(owner = "client!ls", name = "o", descriptor = "I")
    public static int field8477;

    @OriginalMember(owner = "client!ls", name = "p", descriptor = "I")
    private int field8478;

    @OriginalMember(owner = "client!ls", name = "q", descriptor = "I")
    public static int field8479;

    @OriginalMember(owner = "client!ls", name = "r", descriptor = "I")
    private int field8480;

    @OriginalMember(owner = "client!ls", name = "t", descriptor = "I")
    public static int field8482;

    @OriginalMember(owner = "client!ls", name = "v", descriptor = "I")
    public static int field8484;

    @OriginalMember(owner = "client!ls", name = "w", descriptor = "I")
    public static int field8485;

    @OriginalMember(owner = "client!ls", name = "x", descriptor = "I")
    private int field8486;

    @OriginalMember(owner = "client!ls", name = "B", descriptor = "I")
    public static int field8490;

    @OriginalMember(owner = "client!ls", name = "C", descriptor = "I")
    public static int field8491;

    @OriginalMember(owner = "client!ls", name = "F", descriptor = "I")
    public static int field8494;

    @OriginalMember(owner = "client!ls", name = "G", descriptor = "I")
    private int field8495;

    @OriginalMember(owner = "client!ls", name = "y", descriptor = "[B")
    private byte[] field8487;

    @OriginalMember(owner = "client!ls", name = "H", descriptor = "[Liw;")
    public static class80[] field8496;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(BII)V", line = 7)
    public final void method2984(byte arg0, int arg1, int arg2) {
        field8485++;
        if (arg0 >= -93) {
            return;
        }
        if (arg1 == 0) {
            this.field8486 = this.field8483 - (arg2 >= 0 ? arg2 : -arg2);
            this.field8478 = 4096;
            this.field8486 = this.field8486 * this.field8486 >> 12;
            this.field8480 = this.field8486;
            return;
        }
        this.field8478 = this.field8493 * this.field8486 >> 12;
        if (this.field8478 < 0) {
            this.field8478 = 0;
        } else if (this.field8478 > 4096) {
            this.field8478 = 4096;
        }
        this.field8486 = this.field8483 - (arg2 >= 0 ? arg2 : -arg2);
        this.field8486 = this.field8486 * this.field8486 >> 12;
        this.field8486 = this.field8486 * this.field8478 >> 12;
        this.field8480 += this.field8488 * this.field8486 >> 12;
        this.field8488 = this.field8497 * this.field8488 >> 12;
    }

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "(B)V", line = 42)
    public final void method2986(byte arg0) {
        this.field8495 = 0;
        field8482++;
        this.field8480 = 0;
        if (arg0 >= -29) {
            field8489 = null;
        }
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)V", line = 54)
    public final void method2985(byte arg0) {
        field8494++;
        this.field8480 >>= 0x4;
        this.field8488 = this.field8497;
        if (arg0 != 92) {
            method3411(95);
        }
        if (this.field8480 < 0) {
            this.field8480 = 0;
        } else if (this.field8480 > 255) {
            this.field8480 = 255;
        }
        this.method249(this.field8495++, (byte) 97, (byte) this.field8480);
        this.field8480 = 0;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "([JI[Ljava/lang/Object;)V", line = 76)
    public static final void method3409(long[] arg0, int arg1, Object[] arg2) {
        class618.method3389(arg0, -106, arg0.length - 1, 0, arg2);
        field8484++;
        if (arg1 > -111) {
            method3412((byte) -118, -43L);
        }
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(IIIIIFFF)V", line = 88)
    public class624(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field8493 = (int) (arg7 * 4096.0F);
        this.field8483 = (int) (arg6 * 4096.0F);
        this.field8488 = this.field8497 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Ljava/awt/Canvas;Z)Lhb;", line = 100)
    public static final class7 method3410(Canvas arg0, boolean arg1) {
        field8477++;
        try {
            if (arg1) {
                Class var2 = Class.forName("ea");
                class7 var3 = (class7) var2.getDeclaredConstructor().newInstance();
                var3.method47(arg0, 22509);
                return var3;
            } else {
                return null;
            }
        } catch (Throwable var5) {
            class622 var4 = new class622();
            var4.method47(arg0, 22509);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IBB)V", line = 126)
    public void method249(int arg0, byte arg1, byte arg2) {
        if (arg1 == 97) {
            this.field8487[arg0] = arg2;
            field8491++;
        }
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)V", line = 141)
    public static void method3411(int arg0) {
        field8496 = null;
        if (arg0 != 0) {
            field8492 = true;
        }
        field8481 = null;
        field8489 = null;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(BJ)V", line = 158)
    public static final void method3412(byte arg0, long arg1) {
        field8490++;
        if (class145.field1841 != null) {
            if (class42.field546 == 1 || class42.field546 == 5) {
                class168.method1122((byte) 34, arg1);
            } else if (class42.field546 == 4) {
                class87.method491(16218, arg1);
            }
        }
        class572.method3231(class9.field103, true, (long) class430.field5984);
        if (class316.field4599 != -1) {
            class296.method1768(true, class316.field4599);
        }
        for (int var3 = 0; var3 < class264.field3629; var3++) {
            if (class200.field2630[var3]) {
                class224.field2912[var3] = true;
            }
            class643.field9112[var3] = class200.field2630[var3];
            class200.field2630[var3] = false;
        }
        class431.field5989 = class430.field5984;
        if (class9.field103.method1791()) {
            class187.field2296 = true;
        }
        if (class316.field4599 != -1) {
            class264.field3629 = 0;
            class267.method1650((byte) -66);
        }
        class9.field103.method1984();
        if (arg0 != -9) {
            return;
        }
        class373.method2278(2048, class9.field103);
        int var4 = class559.method3128((byte) -114);
        if (var4 == -1) {
            var4 = class664.field9413;
        }
        if (var4 == -1) {
            var4 = class141.field1802;
        }
        class87.method489(arg0 + 120, var4);
        class635.method3463(class596.field8164.field3929, class323.field4732, class596.field8164.field3917, arg0 ^ 0xFFFF83D6, class596.field8164.field3925);
        class323.field4732 = 0;
    }
}
