import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class177 extends class43 {

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "Lss;")
    public static class295 field2509 = null;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "C")
    public char field2520;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public int field2510;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
    public int field2516;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "J")
    public long field2514;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "Lkg;")
    public class177 field2519;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "Z")
    public boolean field2511;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)I", line = 3)
    public final int method272(int arg0) {
        field2518++;
        if (arg0 <= 21) {
            this.field2510 = -108;
        }
        return this.field2510;
    }

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "(I)V", line = 14)
    public static void method1083(int arg0) {
        if (arg0 != -1814) {
            method1085((byte) -77);
        }
        field2509 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)Z", line = 26)
    public final boolean method271(boolean arg0) {
        field2515++;
        if (!arg0) {
            this.field2510 = 108;
        }
        return this.field2511;
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)J", line = 42)
    public final long method278(int arg0) {
        if (arg0 != 29480) {
            this.field2511 = true;
        }
        field2517++;
        return this.field2514;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIZIIII)V", line = 55)
    public static final void method1084(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        class527.field7742 = arg6;
        if (!arg2) {
            method1083(-75);
        }
        class267.field3661 = arg3;
        class105.field1437 = arg1;
        class205.field2905 = arg0;
        field2507++;
        class86.field1185 = arg5;
        class112.field1518 = arg4;
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(B)Z", line = 73)
    public static final boolean method1085(byte arg0) {
        field2512++;
        int var1 = -51 % ((14 - arg0) / 59);
        if (class205.field2911) {
            try {
                class484.method2855(class282.field3804.field5516, "showVideoAd", -29222);
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)I", line = 94)
    public final int method276(byte arg0) {
        if (arg0 >= -16) {
            return 35;
        } else {
            field2508++;
            return this.field2516;
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)C", line = 109)
    public final char method274(int arg0) {
        int var2 = -107 % ((arg0 + 30) / 39);
        field2506++;
        return this.field2520;
    }
}
