import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class134 {

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "Z")
    public static boolean field3047 = false;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "Lr;")
    private static class118 field3050 = class153.method1136(105, "You are standing in a members)2only area)3");

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "Lr;")
    public static class118 field3054 = field3050;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "Lr;")
    public static class118 field3051 = class153.method1136(76, "scrollbar");

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3048 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "Lr;")
    public static class118 field3057 = class153.method1136(82, "da dieser Computer gegen unsere ");

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "[I")
    public static int[] field3056 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "Lr;")
    public static class118 field3058 = class153.method1136(101, ":duelreq:");

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "[Lfc;")
    public static class39[] field3059 = new class39[50];

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "Lr;")
    public static class118 field3061 = class153.method1136(94, "Keine Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public static int field3055 = 0;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Llc;")
    public static class79 field3052;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
    public static final void method1025(boolean arg0) {
        if (!arg0) {
            return;
        }
        field3046++;
        field3052.method660(-6646);
        for (int var1 = 0; var1 < 32; var1++) {
            class56.field1318[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class131.field2983[var2] = 0L;
        }
        class125.field2865 = 0;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)Z")
    public static final boolean method1026(int arg0, int arg1, int arg2) {
        field3053++;
        if (arg2 != 32) {
            method1026(-83, 24, -5);
        }
        return (arg1 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static void method1027(int arg0) {
        field3048 = null;
        field3058 = null;
        field3057 = null;
        field3050 = null;
        field3056 = null;
        field3061 = null;
        if (arg0 != 916) {
            field3051 = null;
        }
        field3052 = null;
        field3054 = null;
        field3051 = null;
        field3059 = null;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)Lsb;")
    public static final class127 method1028(int arg0) {
        if (arg0 >= -81) {
            method1026(47, 45, -27);
        }
        field3060++;
        try {
            return (class127) Class.forName("ae").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }
}
