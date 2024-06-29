import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public abstract class class142 extends class51 {

    @OriginalMember(owner = "client!ng", name = "L", descriptor = "Z")
    public volatile boolean field2433 = true;

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "Lhi;")
    private static class82 field2430 = class95.method664((byte) -25, "Ok");

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "Lhi;")
    public static class82 field2429 = field2430;

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!ng", name = "M", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!ng", name = "O", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!ng", name = "N", descriptor = "Lrh;")
    public static class110 field2435;

    @OriginalMember(owner = "client!ng", name = "E", descriptor = "Z")
    public boolean field2426;

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "Z")
    public boolean field2432;

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "[I")
    public static int[] field2427;

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "[[[Lrk;")
    public static class16[][][] field2431;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(B)V", line = 20)
    public static final void method965(byte arg0) {
        field2428++;
        if (class191.field3188 == 0) {
            return;
        }
        try {
            if ((++class60.field953) > 2000) {
                if (class66.field1036 != null) {
                    class66.field1036.method2085(true);
                    class66.field1036 = null;
                }
                if (class202.field3473 >= 1) {
                    class19.field240 = -5;
                    class191.field3188 = 0;
                    return;
                }
                if (class92.field1643 == class39.field686) {
                    class39.field686 = class203.field3530;
                } else {
                    class39.field686 = class92.field1643;
                }
                class60.field953 = 0;
                class191.field3188 = 1;
                class202.field3473++;
            }
            if (arg0 != -59) {
                field2427 = (int[]) null;
            }
            if (class191.field3188 == 1) {
                class133.field2297 = class55.field881.method831(class39.field686, (byte) 118, class135.field2339);
                class191.field3188 = 2;
            }
            if (class191.field3188 == 2) {
                if (class133.field2297.field5121 == 2) {
                    throw new IOException();
                }
                if (class133.field2297.field5121 != 1) {
                    return;
                }
                class66.field1036 = new class302((Socket) class133.field2297.field5122, class55.field881);
                class133.field2297 = null;
                class66.field1036.method2083(true, class61.field957.field2611, class61.field957.field2598, 0);
                if (class67.field1048 != null) {
                    class67.field1048.method752((byte) -49);
                }
                if (field2435 != null) {
                    field2435.method752((byte) -81);
                }
                int var1 = class66.field1036.method2089(arg0 - 50);
                if (class67.field1048 != null) {
                    class67.field1048.method752((byte) -103);
                }
                if (field2435 != null) {
                    field2435.method752((byte) -74);
                }
                if (var1 != 21) {
                    class191.field3188 = 0;
                    class19.field240 = var1;
                    class66.field1036.method2085(true);
                    class66.field1036 = null;
                    return;
                }
                class191.field3188 = 3;
            }
            if (class191.field3188 == 3) {
                if (class66.field1036.method2088((byte) 91) < 1) {
                    return;
                }
                class66.field1032 = new class82[class66.field1036.method2089(arg0 ^ 0x47)];
                class191.field3188 = 4;
            }
            if (class191.field3188 == 4) {
                if (class66.field1036.method2088((byte) 91) < class66.field1032.length * 8) {
                    return;
                }
                class35.field545.field2611 = 0;
                class66.field1036.method2087(class66.field1032.length * 8, class35.field545.field2598, 0, (byte) 109);
                for (int var2 = 0; var2 < class66.field1032.length; var2++) {
                    class66.field1032[var2] = class56.method388(class35.field545.method1067(-1510872160), 0);
                }
                class191.field3188 = 0;
                class19.field240 = 21;
                class66.field1036.method2085(true);
                class66.field1036 = null;
                return;
            }
        } catch (IOException var4) {
            if (class66.field1036 != null) {
                class66.field1036.method2085(true);
                class66.field1036 = null;
            }
            if (class202.field3473 < 1) {
                if (class92.field1643 == class39.field686) {
                    class39.field686 = class203.field3530;
                } else {
                    class39.field686 = class92.field1643;
                }
                class191.field3188 = 1;
                class60.field953 = 0;
                class202.field3473++;
            } else {
                class191.field3188 = 0;
                class19.field240 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "(I)V", line = 181)
    public static void method966(int arg0) {
        field2435 = null;
        field2430 = null;
        field2427 = null;
        if (arg0 != 0) {
            field2435 = (class110) null;
        }
        field2431 = (class16[][][]) null;
        field2429 = null;
    }

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "(I)[B")
    public abstract byte[] method964(int arg0);

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "(I)I")
    public abstract int method967(int arg0);
}
