import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class431 {

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "I")
    public int field6113 = 8;

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "I")
    public int field6114 = 16777215;

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "F")
    public static float field6111 = 0.25F;

    @OriginalMember(owner = "client!ou", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field6120 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "I")
    public int field6112;

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "I")
    public int field6115;

    @OriginalMember(owner = "client!ou", name = "g", descriptor = "I")
    public int field6116;

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "I")
    public static int field6117;

    @OriginalMember(owner = "client!ou", name = "i", descriptor = "I")
    public static int field6118;

    @OriginalMember(owner = "client!ou", name = "j", descriptor = "I")
    public static int field6119;

    @OriginalMember(owner = "client!ou", name = "l", descriptor = "I")
    public static int field6121;

    @OriginalMember(owner = "client!ou", name = "m", descriptor = "I")
    public int field6122;

    @OriginalMember(owner = "client!ou", name = "n", descriptor = "I")
    public int field6123;

    @OriginalMember(owner = "client!ou", name = "o", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!ou", name = "p", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "Z")
    public boolean field6110;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IILfh;)V")
    private final void method2521(int arg0, int arg1, class463 arg2) {
        field6117++;
        if (arg0 != 2) {
            method2522(110);
        }
        if (arg1 == 1) {
            this.field6113 = arg2.method2758((byte) 116);
        } else if (arg1 == 2) {
            this.field6110 = true;
        } else if (arg1 == 3) {
            this.field6122 = arg2.method2791(true);
            this.field6115 = arg2.method2791(true);
            this.field6123 = arg2.method2791(true);
        } else if (arg1 == 4) {
            this.field6116 = arg2.method2737(false);
            return;
        } else if (arg1 == 5) {
            this.field6112 = arg2.method2758((byte) 119);
            return;
        } else if (arg1 == 6) {
            this.field6114 = arg2.method2738(-67);
            return;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V")
    public static final void method2522(int arg0) {
        field6124++;
        for (int var1 = 0; var1 < 5; var1++) {
            class229.field2926[var1] = false;
        }
        class60.field784 = -1;
        class125.field1670 = 0;
        class52.field700 = class80.field1030;
        class524.field7754 = -1;
        class320.field4063 = 0;
        if (arg0 != 22876) {
            method2524((byte) -71);
        }
        class21.field291 = class365.field4747;
        class111.field1489 = class310.field3971;
        class363.field4727 = class163.field2065;
        class142.field1835 = 5;
        class51.field672 = class286.field3665;
        class496.field7206 = class193.field2500;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lfh;I)V")
    public final void method2523(class463 arg0, int arg1) {
        if (arg1 >= -114) {
            this.field6114 = -123;
        }
        while (true) {
            int var3 = arg0.method2737(false);
            if (var3 == 0) {
                field6121++;
                return;
            }
            this.method2521(2, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)V")
    public static void method2524(byte arg0) {
        field6120 = null;
        if (arg0 != -41) {
            field6120 = null;
        }
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(B)V")
    public static final void method2525(byte arg0) {
        field6119++;
        class449 var1 = class161.field2047;
        synchronized (class161.field2047) {
            class161.field2047.method2642(arg0 + 73);
        }
        if (arg0 != -73) {
            method2522(-125);
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(ZII)B")
    public static final byte method2526(boolean arg0, int arg1, int arg2) {
        field6125++;
        if (!arg0) {
            field6120 = null;
        }
        if (arg2 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }
}
