import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public abstract class class267 {

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4000 = "Started 3d Library";

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
    public static int field4002 = 0;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "J")
    public static long field4001 = 0L;

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field4005 = new String[100];

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    public int field3999;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
    public int field4008;

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "I")
    public int field4010;

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)Z")
    public final boolean method1903(byte arg0) {
        if (arg0 != -28) {
            this.field4010 = -4;
        }
        field4003++;
        return (this.field4010 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
    public static void method1904(int arg0) {
        field4005 = null;
        field4000 = null;
        if (arg0 < 44) {
            method1907(false, (byte) -101);
        }
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)Z")
    public final boolean method1905(int arg0) {
        field4007++;
        if (arg0 != -27936) {
            this.method1906(false);
        }
        return (this.field4010 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)Z")
    public final boolean method1906(boolean arg0) {
        if (arg0) {
            this.method1906(false);
        }
        field4006++;
        return (this.field4010 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZB)V")
    public static final void method1907(boolean arg0, byte arg1) {
        for (class324 var2 = (class324) class127.field2075.method157((byte) -125); var2 != null; var2 = (class324) class127.field2075.method145(-103)) {
            if (var2.field4690 != null) {
                class220.field3275.method511(var2.field4690);
                var2.field4690 = null;
            }
            if (var2.field4679 != null) {
                class220.field3275.method511(var2.field4679);
                var2.field4679 = null;
            }
            var2.method251(117);
        }
        if (arg1 != 0) {
            field4004 = 68;
        }
        field4011++;
        if (!arg0) {
            return;
        }
        for (class324 var3 = (class324) class30.field441.method157((byte) -125); var3 != null; var3 = (class324) class30.field441.method145(4)) {
            if (var3.field4690 != null) {
                class220.field3275.method511(var3.field4690);
                var3.field4690 = null;
            }
            var3.method251(93);
        }
        for (class324 var4 = (class324) class356.field5056.method1222(5656); var4 != null; var4 = (class324) class356.field5056.method1224((byte) -104)) {
            if (var4.field4690 != null) {
                class220.field3275.method511(var4.field4690);
                var4.field4690 = null;
            }
            var4.method251(6);
        }
    }

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "(I)Z")
    public final boolean method1908(int arg0) {
        if (arg0 != 0) {
            field4001 = 55L;
        }
        field4009++;
        return (this.field4010 & 0x2) != 0;
    }
}
