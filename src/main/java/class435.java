import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class435 {

    @OriginalMember(owner = "client!im", name = "d", descriptor = "J")
    private long field6037;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "I")
    private int field6038;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "[Z")
    public static boolean[] field6034 = new boolean[100];

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)Lgd;", line = 4)
    public final class382 method2607(int arg0, int arg1) {
        if (arg0 != 5000) {
            this.method2608(null, 25);
        }
        field6036++;
        return class382.method2380(this.method2612(arg1, -10901), (byte) -95);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lgd;I)V", line = 15)
    private final void method2608(class382 arg0, int arg1) {
        if (arg1 == 2) {
            field6035++;
            this.field6037 |= (arg0.field5474 << class382.field5480 * this.field6038++);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V", line = 28)
    public static void method2609(byte arg0) {
        if (arg0 != 45) {
            method2610(null, -77, 24, -30, 86, 77, -54, false, false);
        }
        field6034 = null;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lha;IIIIIIZZ)V", line = 38)
    public static final void method2610(class473 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class139.field1781 = arg0;
        class749.field10337 = arg1;
        class753.field10384 = class749.field10337 > 1 && class139.field1781.method162();
        class732.field10110 = arg2;
        class179.field2263 = 0x1 << class732.field10110;
        class760.field10442 = class179.field2263 >> 1;
        Math.sqrt((double) (class760.field10442 * class760.field10442 + class760.field10442 * class760.field10442));
        class266.field3869 = arg3;
        class414.field5796 = arg4;
        class704.field9799 = arg5;
        class270.field3904 = arg6;
        class416.field5805 = class83.method629(-4540);
        class648.method3715((byte) 58);
        class545.field7583 = new class472[arg3][class414.field5796][class704.field9799];
        class95.field1115 = new class418[arg3];
        if (arg7) {
            class120.field1598 = new int[class414.field5796][class704.field9799];
            class516.field7086 = new byte[class414.field5796][class704.field9799];
            class57.field668 = new short[class414.field5796][class704.field9799];
            class530.field7302 = new class472[1][class414.field5796][class704.field9799];
            class594.field8355 = new class418[1];
        } else {
            class120.field1598 = null;
            class516.field7086 = null;
            class57.field668 = null;
            class530.field7302 = null;
            class594.field8355 = null;
        }
        if (arg8) {
            class182.field2291 = new long[arg3][arg4][arg5];
            class205.field2880 = new class555[65535];
            class419.field5837 = new boolean[65535];
            class392.field5587 = 0;
        } else {
            class182.field2291 = null;
            class205.field2880 = null;
            class419.field5837 = null;
            class392.field5587 = 0;
        }
        class111.method810(false);
        class226.field3436 = new class230[2];
        class689.field9618 = new class230[2];
        class289.field4265 = new class230[2];
        class112.field1361 = new class230[10000];
        class74.field827 = 0;
        class728.field10067 = new class230[5000];
        class565.field7980 = 0;
        class313.field4484 = new class253[5000];
        class586.field8275 = 0;
        class592.field8338 = new boolean[class270.field3904 + class270.field3904 + 1][class270.field3904 + class270.field3904 + 1];
        class450.field6289 = new boolean[class270.field3904 + class270.field3904 + 2][class270.field3904 + class270.field3904 + 2];
        class223.field3151 = new int[class270.field3904 + class270.field3904 + 2];
        class539.field7444 = class539.field7451;
        if (class753.field10384) {
            class158.field2049 = new boolean[arg3][class270.field3904 + class270.field3904 + 1][class270.field3904 + class270.field3904 + 1];
            class152.field1994 = new boolean[arg3][][];
            if (class449.field6282 != null) {
                class381.method2378();
            }
            class449.field6282 = new class437[class749.field10337];
            class139.field1781.method195(class449.field6282.length + 1);
            class139.field1781.method170(0);
            for (int var9 = 0; var9 < class449.field6282.length; var9++) {
                class449.field6282[var9] = new class437(var9 + 1, class139.field1781);
                (new Thread(class449.field6282[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class749.field10337 == 2) {
                var10 = 4;
                class791.field10844 = 2;
            } else if (class749.field10337 == 3) {
                var10 = 6;
                class791.field10844 = 3;
            } else {
                var10 = 8;
                class791.field10844 = 4;
            }
            class393.field5594 = new class560[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                class393.field5594[var11] = new class560(class730.field10103[class749.field10337 - 2][var11]);
            }
        } else {
            class791.field10844 = 1;
        }
        class362.field5227 = new int[class791.field10844 - 1];
        class718.field9947 = new int[class791.field10844 - 1];
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(B)I", line = 165)
    public final int method2611(byte arg0) {
        field6039++;
        return arg0 > -34 ? -42 : this.field6038;
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(II)I", line = 177)
    private final int method2612(int arg0, int arg1) {
        if (arg1 == -10901) {
            field6041++;
            return (int) (this.field6037 >> class382.field5480 * arg0) & 0xF;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lgd;)V", line = 189)
    public class435(class382 arg0) {
        this.field6037 = arg0.field5474;
        this.field6038 = 1;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "([Lgd;)V", line = 197)
    public class435(class382[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method2608(arg0[var2], 2);
        }
    }
}
