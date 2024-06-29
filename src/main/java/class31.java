import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class31 implements class653 {

    @OriginalMember(owner = "client!tfa", name = "e", descriptor = "I")
    public int field481;

    @OriginalMember(owner = "client!tfa", name = "k", descriptor = "I")
    public int field487;

    @OriginalMember(owner = "client!tfa", name = "f", descriptor = "I")
    public int field482;

    @OriginalMember(owner = "client!tfa", name = "i", descriptor = "Lut;")
    public class109 field485;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "I")
    public int field477;

    @OriginalMember(owner = "client!tfa", name = "h", descriptor = "I")
    public int field484;

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "I")
    public int field480;

    @OriginalMember(owner = "client!tfa", name = "m", descriptor = "I")
    public int field489;

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "Lgi;")
    public class630 field479;

    @OriginalMember(owner = "client!tfa", name = "g", descriptor = "Ljava/lang/String;")
    public static String field483 = null;

    @OriginalMember(owner = "client!tfa", name = "l", descriptor = "Lnea;")
    public static class664 field488 = new class664(48, -2);

    @OriginalMember(owner = "client!tfa", name = "o", descriptor = "Luc;")
    public static class27 field491 = new class27("", 12);

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!tfa", name = "n", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!tfa", name = "p", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!tfa", name = "r", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!tfa", name = "q", descriptor = "Lnr;")
    public static class53 field493;

    @OriginalMember(owner = "client!tfa", name = "j", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field486;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(B)Lrw;", line = 7)
    public class703 method351(byte arg0) {
        if (arg0 < 73) {
            this.field489 = 12;
        }
        field492++;
        return null;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)V", line = 25)
    public static void method352(int arg0) {
        field488 = null;
        field486 = null;
        if (arg0 != -31483) {
            field486 = null;
        }
        field493 = null;
        field483 = null;
        field491 = null;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IIIII)V", line = 41)
    public static final void method353(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class574.field8079 == 1) {
            class580.field8176[class141.field2080 / 100].method3916(class569.field8013 - 8, class635.field8980 + -8);
        }
        field490++;
        if (class574.field8079 == 2) {
            class580.field8176[class141.field2080 / 100 + 4].method3916(class569.field8013 - 8, class635.field8980 + -8);
        }
        class330.method2076(arg3 ^ arg3);
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(B)V", line = 62)
    public static final void method354(byte arg0) {
        if (class493.field7016 == null || class453.field6514 == null) {
            class453.field6514 = new int[256];
            class493.field7016 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class493.field7016[var1] = (int) (Math.sin(var2) * 4096.0D);
                class453.field6514[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 <= 21) {
            method352(46);
        }
        field478++;
    }

    @OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Lut;Lgi;IIIIIII)V", line = 107)
    public class31(class109 arg0, class630 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field481 = arg3;
        this.field487 = arg4;
        this.field482 = arg6;
        this.field485 = arg0;
        this.field477 = arg8;
        this.field484 = arg7;
        this.field480 = arg5;
        this.field489 = arg2;
        this.field479 = arg1;
    }
}
