import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class307 implements class15 {

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
    public int field4387;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "Lin;")
    public static class380 field4385 = new class380(37, 0);

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(III)V", line = 15)
    public static final void method1891(int arg0, int arg1, int arg2) {
        boolean var3 = class514.field7096[0][arg1][arg2] != null && class514.field7096[0][arg1][arg2].field2592 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class514.field7096[var4][arg1][arg2] == null) {
                class172 var5 = class514.field7096[var4][arg1][arg2] = new class172(var4);
                if (var3) {
                    var5.field2599++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V", line = 38)
    public static final void method1892(byte arg0) {
        field4388++;
        if (class100.field1492 == 0) {
            return;
        }
        try {
            if ((++class624.field8862) > 2000) {
                if (class600.field8551 != null) {
                    class600.field8551.method183((byte) 88);
                    class600.field8551 = null;
                }
                if (class578.field8333 >= 2) {
                    class100.field1492 = 0;
                    class657.field9273 = -5;
                    return;
                }
                class243.field3481.method2406(20);
                class578.field8333++;
                class100.field1492 = 1;
                class624.field8862 = 0;
            }
            if (class100.field1492 == 1) {
                class456.field6230 = class243.field3481.method2409(class336.field4775, (byte) -114);
                class100.field1492 = 2;
            }
            if (arg0 >= -59) {
                field4385 = null;
            }
            if (class100.field1492 == 2) {
                if (class456.field6230.field10365 == 2) {
                    throw new IOException();
                }
                if (class456.field6230.field10365 != 1) {
                    return;
                }
                class600.field8551 = class502.method2931((Socket) class456.field6230.field10371, 1894, 15000);
                class456.field6230 = null;
                class323.method1951(false);
                class100.field1492 = 4;
            }
            if (class100.field1492 == 4 && class600.field8551.method186(1, -126)) {
                class600.field8551.method185(1, class48.field674.field6002, 0, -35);
                int var1 = class48.field674.field6002[0] & 0xFF;
                class100.field1492 = 0;
                class657.field9273 = var1;
                class600.field8551.method183((byte) 88);
                class600.field8551 = null;
            }
        } catch (IOException var2) {
            if (class600.field8551 != null) {
                class600.field8551.method183((byte) 88);
                class600.field8551 = null;
            }
            if (class578.field8333 >= 2) {
                class657.field9273 = -4;
                class100.field1492 = 0;
            } else {
                class243.field3481.method2406(20);
                class100.field1492 = 1;
                class578.field8333++;
                class624.field8862 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 140)
    public class307(String arg0, int arg1) {
        this.field4387 = arg1;
    }

    @OriginalMember(owner = "client!ss", name = "toString", descriptor = "()Ljava/lang/String;", line = 150)
    public final String toString() {
        field4386++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V", line = 162)
    public static void method1893(int arg0) {
        field4385 = null;
        if (arg0 != 2) {
            method1893(65);
        }
    }
}
