import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class542 implements class563 {

    @OriginalMember(owner = "client!dca", name = "e", descriptor = "Ljava/lang/String;")
    private String field7427;

    @OriginalMember(owner = "client!dca", name = "f", descriptor = "Lga;")
    private class332 field7428;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "I")
    public static int field7423;

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "I")
    public static int field7424;

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "I")
    public static int field7426;

    @OriginalMember(owner = "client!dca", name = "h", descriptor = "I")
    public static int field7430;

    @OriginalMember(owner = "client!dca", name = "i", descriptor = "I")
    public static int field7431;

    @OriginalMember(owner = "client!dca", name = "j", descriptor = "I")
    public static int field7432;

    @OriginalMember(owner = "client!dca", name = "g", descriptor = "J")
    public static long field7429;

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "Lga;")
    public static class332 field7425;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(B)I", line = 3)
    public static final int method3040(byte arg0) {
        if (arg0 != -16) {
            method3042(null, -32);
        }
        field7423++;
        return class399.field5292;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)Lrba;", line = 15)
    public final class67 method179(int arg0) {
        field7432++;
        return arg0 == -24832 ? class67.field822 : null;
    }

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "(I)I", line = 28)
    public final int method184(int arg0) {
        field7426++;
        if (this.field7428.method1961(this.field7427, false)) {
            return 100;
        } else {
            int var2 = 15 % ((47 - arg0) / 54);
            return this.field7428.method1964(this.field7427, (byte) -59);
        }
    }

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "(B)V", line = 42)
    public static void method3041(byte arg0) {
        field7425 = null;
        if (arg0 != -23) {
            field7424 = -60;
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 52)
    public static final long method3042(String arg0, int arg1) {
        field7430++;
        int var2 = arg0.length();
        int var3 = 122 % ((22 - arg1) / 43);
        long var4 = 0L;
        for (int var6 = 0; var6 < var2; var6++) {
            var4 = (long) arg0.charAt(var6) + (var4 << 5) - var4;
        }
        return var4;
    }

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "(I)Ler;", line = 78)
    public static final class6 method3043(int arg0) {
        if (arg0 != -24380) {
            method3040((byte) 87);
        }
        field7431++;
        try {
            return (class6) Class.forName("of").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(Lga;Ljava/lang/String;)V", line = 95)
    public class542(class332 arg0, String arg1) {
        this.field7427 = arg1;
        this.field7428 = arg0;
    }
}
