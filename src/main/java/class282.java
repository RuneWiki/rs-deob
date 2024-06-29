import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class282 {

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "[S")
    public static short[] field4367 = new short[256];

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "Lvd;")
    public static class4 field4364 = new class4(16);

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "Z")
    public static boolean field4371 = false;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "Lab;")
    public static class148 field4370 = new class148();

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static final void method1892(int arg0) {
        if (arg0 > -96) {
            field4364 = null;
        }
        field4372++;
        if (class202.field2795 > 0) {
            class22.method162((byte) -109);
        } else {
            class197.field2738 = class290.field4567;
            class290.field4567 = null;
            class145.method977(-42, 40);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
    public static final Object method1893(int arg0, byte[] arg1, boolean arg2) {
        field4365++;
        int var3 = 84 % ((72 - arg0) / 53);
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class204.field2843) {
            try {
                class232 var4 = (class232) Class.forName("mg").getDeclaredConstructor().newInstance();
                var4.method1533(arg1, -3);
                return var4;
            } catch (Throwable var5) {
                class204.field2843 = true;
            }
        }
        return arg2 ? class261.method1724(arg1, -24259) : arg1;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IBLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public static final void method1894(int arg0, byte arg1, String arg2, String arg3, String arg4) {
        field4368++;
        if (arg1 != 68) {
            method1893(-44, (byte[]) null, true);
        }
        class88.method562(arg3, arg2, arg0, -1, true, arg4);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)I")
    public static final int method1895(int arg0, int arg1) {
        if (arg1 != 256) {
            method1893(-103, (byte[]) null, true);
        }
        class216 var2 = class71.method442(arg1 ^ 0x108, arg0);
        int var3 = var2.field3262;
        field4363++;
        int var4 = var2.field3254;
        int var5 = var2.field3253;
        int var6 = class75.field1052[var5 - var4];
        return class120.field1688[var3] >> var4 & var6;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
    public static void method1896(int arg0) {
        field4367 = null;
        field4370 = null;
        if (arg0 != 256) {
            method1892(4);
        }
        field4364 = null;
    }
}
