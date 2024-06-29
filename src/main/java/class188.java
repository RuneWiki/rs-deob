import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public abstract class class188 {

    @OriginalMember(owner = "client!aba", name = "h", descriptor = "Lai;")
    public class626 field2510;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!aba", name = "e", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!aba", name = "f", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!aba", name = "g", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(B)V")
    public void method1302(byte arg0) {
        field2505++;
        int var2 = -118 / ((arg0 + 16) / 47);
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)Z")
    public abstract boolean method956(int arg0);

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIZ)V")
    public abstract void method958(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(B)V")
    public static final void method1303(byte arg0) {
        if (arg0 >= -58) {
            method1303((byte) -106);
        }
        field2503++;
        if (class268.field3949 == 0) {
            return;
        }
        try {
            if (++class378.field5531 > 2000) {
                if (class457.field6340 != null) {
                    class457.field6340.method3027(2);
                    class457.field6340 = null;
                }
                if (class418.field5997 >= 2) {
                    class268.field3949 = 0;
                    class275.field4090 = -5;
                    return;
                }
                class691.field9698.method680(43594);
                class378.field5531 = 0;
                class418.field5997++;
                class268.field3949 = 1;
            }
            if (class268.field3949 == 1) {
                class434.field6144 = class691.field9698.method677((byte) 104, class730.field10124);
                class268.field3949 = 2;
            }
            if (class268.field3949 == 2) {
                if (class434.field6144.field8321 == 2) {
                    throw new IOException();
                }
                if (class434.field6144.field8321 != 1) {
                    return;
                }
                class457.field6340 = class754.method4202(-98, (Socket) class434.field6144.field8318, 15000);
                class434.field6144 = null;
                class101.method793((byte) -99);
                class268.field3949 = 4;
            }
            if (class268.field3949 == 4 && class457.field6340.method3025(1, 55)) {
                class457.field6340.method3028(-78, 1, class89.field1233.field5518, 0);
                int var1 = class89.field1233.field5518[0] & 0xFF;
                class268.field3949 = 0;
                class275.field4090 = var1;
                class457.field6340.method3027(2);
                class457.field6340 = null;
            }
        } catch (IOException var2) {
            if (class457.field6340 != null) {
                class457.field6340.method3027(2);
                class457.field6340 = null;
            }
            if (class418.field5997 < 2) {
                class691.field9698.method680(43594);
                class268.field3949 = 1;
                class378.field5531 = 0;
                class418.field5997++;
            } else {
                class268.field3949 = 0;
                class275.field4090 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "(B)V")
    public void method1304(byte arg0) {
        field2507++;
        if (arg0 != -56) {
            this.method1307(18);
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IZ)V")
    public abstract void method962(int arg0, boolean arg1);

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "(B)V")
    public void method1305(byte arg0) {
        if (arg0 >= -126) {
            this.method1302((byte) -112);
        }
        field2504++;
    }

    @OriginalMember(owner = "client!aba", name = "e", descriptor = "(B)V")
    public void method1306(byte arg0) {
        if (arg0 == -36) {
            field2509++;
        }
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(I)V")
    public void method1307(int arg0) {
        if (arg0 < 70) {
            this.method959(-101, (byte) 56, null);
        }
        field2506++;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(ZI)V")
    public abstract void method961(boolean arg0, int arg1);

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "(I)V")
    public void method1308(int arg0) {
        field2508++;
        if (arg0 != 1) {
            this.method962(-7, false);
        }
    }

    @OriginalMember(owner = "client!aba", name = "f", descriptor = "(B)V")
    public abstract void method955(byte arg0);

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IBLbm;)V")
    public abstract void method959(int arg0, byte arg1, class123 arg2);

    @OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(Lai;)V")
    public class188(class626 arg0) {
        this.field2510 = arg0;
    }
}
