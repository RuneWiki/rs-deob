import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class378 extends class498 {

    @OriginalMember(owner = "client!tp", name = "n", descriptor = "Let;")
    public class429 field5353;

    @OriginalMember(owner = "client!tp", name = "p", descriptor = "[Lir;")
    public static class22[] field5355 = new class22[2048];

    @OriginalMember(owner = "client!tp", name = "o", descriptor = "Leh;")
    public static class246 field5354 = new class246(71, 3);

    @OriginalMember(owner = "client!tp", name = "q", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!tp", name = "r", descriptor = "Lhm;")
    public static class150 field5357;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V", line = 3)
    public static void method2207(int arg0) {
        field5355 = null;
        if (arg0 != 2048) {
            method2208(false);
        }
        field5354 = null;
        field5357 = null;
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Let;)V", line = 25)
    public class378(class429 arg0) {
        this.field5353 = arg0;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)V", line = 36)
    public static final void method2208(boolean arg0) {
        field5356++;
        if (class170.field2473 == 0) {
            return;
        }
        try {
            if ((++class526.field7740) > 2000) {
                if (class50.field608 != null) {
                    class50.field608.method1360((byte) 118);
                    class50.field608 = null;
                }
                if (class269.field3925 >= 1) {
                    class319.field4622 = -5;
                    class170.field2473 = 0;
                    return;
                }
                class526.field7740 = 0;
                class170.field2473 = 1;
                class269.field3925++;
                class489.field6837.field5880 = !class489.field6837.field5880;
            }
            if (class170.field2473 == 1) {
                class255.field3778 = class268.field3914.method959(-26521, class489.field6837.method2478(69), class489.field6837.field5883);
                class170.field2473 = 2;
            }
            if (!arg0) {
                field5357 = null;
            }
            if (class170.field2473 == 2) {
                if (class255.field3778.field5277 == 2) {
                    throw new IOException();
                }
                if (class255.field3778.field5277 != 1) {
                    return;
                }
                class50.field608 = class60.method487((Socket) class255.field3778.field5274, 5000, -93);
                class255.field3778 = null;
                class50.field608.method1357(class30.field357.field5663, (byte) 40, class30.field357.field5665, 0);
                class170.field2473 = 4;
            }
            if (class170.field2473 == 4) {
                if (!class50.field608.method1356(1, 103)) {
                    return;
                }
                class50.field608.method1358(0, (byte) -120, class264.field3874.field5663, 1);
                int var1 = class264.field3874.field5663[0] & 0xFF;
                if (var1 != 21) {
                    class319.field4622 = var1;
                    class170.field2473 = 0;
                    class50.field608.method1360((byte) 69);
                    class50.field608 = null;
                    return;
                }
                class170.field2473 = 5;
            }
            if (class170.field2473 == 5) {
                if (!class50.field608.method1356(1, 88)) {
                    return;
                }
                class50.field608.method1358(0, (byte) -90, class264.field3874.field5663, 1);
                class431.field6075 = new String[class264.field3874.field5663[0] & 0xFF];
                class170.field2473 = 6;
            }
            if (class170.field2473 == 6 && class50.field608.method1356(class431.field6075.length * 8, 109)) {
                class264.field3874.field5665 = 0;
                class50.field608.method1358(0, (byte) -111, class264.field3874.field5663, class431.field6075.length * 8);
                for (int var2 = 0; var2 < class431.field6075.length; var2++) {
                    class431.field6075[var2] = class269.method1693((byte) -127, class264.field3874.method2351(-128));
                }
                class319.field4622 = 21;
                class170.field2473 = 0;
                class50.field608.method1360((byte) -87);
                class50.field608 = null;
            }
        } catch (IOException var3) {
            if (class50.field608 != null) {
                class50.field608.method1360((byte) -115);
                class50.field608 = null;
            }
            if (class269.field3925 < 1) {
                class170.field2473 = 1;
                class526.field7740 = 0;
                class489.field6837.field5880 = !class489.field6837.field5880;
                class269.field3925++;
            } else {
                class319.field4622 = -4;
                class170.field2473 = 0;
            }
        }
    }
}
