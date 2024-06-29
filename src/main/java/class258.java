import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class258 {

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "J")
    public static long field3475 = -1L;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "Lmv;")
    public static class297 field3473 = new class297(2, 4, 4, 0);

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "Ltea;")
    public static class708 field3482 = new class708(128);

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "Lffa;")
    public static class562 field3483 = new class562();

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "F")
    public static float field3476;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "I")
    public static int field3480;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ro", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field3484;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "[B")
    public byte[] field3477;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "[S")
    public short[] field3478;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "[S")
    public short[] field3479;

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "[S")
    public short[] field3481;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZLtca;)V")
    public static final void method1615(boolean arg0, class549 arg1) {
        field3474++;
        if (class483.field6438 == null) {
            return;
        }
        class620 var2 = null;
        if (arg1.field7126 == 0) {
            var2 = (class620) class549.method2909(arg1.field7123, arg1.field7116, arg1.field7125);
        }
        if (arg1.field7126 == 1) {
            var2 = (class620) class186.method1237(arg1.field7123, arg1.field7116, arg1.field7125);
        }
        if (!arg0) {
            field3480 = -92;
        }
        if (arg1.field7126 == 2) {
            var2 = (class620) class47.method432(arg1.field7123, arg1.field7116, arg1.field7125, field3484 == null ? (field3484 = method1617("ut")) : field3484);
        }
        if (arg1.field7126 == 3) {
            var2 = (class620) class377.method2155(arg1.field7123, arg1.field7116, arg1.field7125);
        }
        if (var2 == null) {
            arg1.field7119 = 0;
            arg1.field7122 = 0;
            arg1.field7115 = -1;
        } else {
            arg1.field7115 = var2.method76((byte) -98);
            arg1.field7122 = var2.method66((byte) -42);
            arg1.field7119 = var2.method70(true);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V")
    public static void method1616(byte arg0) {
        field3473 = null;
        field3482 = null;
        if (arg0 == 59) {
            field3483 = null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1617(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
