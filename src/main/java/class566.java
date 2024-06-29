import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class566 {

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    private int field7985;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "Z")
    private boolean field7990;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "Z")
    private boolean field7996;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    private int field7998;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field7984 = -1;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field7986 = 0;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "[I")
    public static int[] field7997 = new int[2];

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field7987;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field7988;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field7992;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public static int field7993;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public static int field7994;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public static int field7995;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "Lqn;")
    public static class65 field7989;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "[I")
    public static int[] field7991;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static final long method3184(byte arg0, String arg1) {
        field7993++;
        int var2 = arg1.length();
        long var3 = 0L;
        if (arg0 > -118) {
            return 54L;
        } else {
            for (int var5 = 0; var5 < var2; var5++) {
                var3 = (long) arg1.charAt(var5) + (var3 << 5) - var3;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public static void method3185(int arg0) {
        if (arg0 != -1) {
            method3186(-27, null);
        }
        field7989 = null;
        field7991 = null;
        field7997 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method3186(int arg0, String arg1) {
        field7995++;
        if (class37.field385.startsWith("win")) {
            return arg1 + ".dll";
        } else if (class37.field385.startsWith("linux")) {
            return "lib" + arg1 + ".so";
        } else if (class37.field385.startsWith("mac")) {
            return "lib" + arg1 + ".dylib";
        } else {
            int var2 = -104 / ((-arg0 - 5) / 50);
            return null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)Z")
    public final boolean method3187(boolean arg0) {
        field7992++;
        if (!arg0) {
            this.method3187(false);
        }
        return this.field7996;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(Z)Z")
    public final boolean method3188(boolean arg0) {
        if (arg0) {
            field7989 = null;
        }
        field7994++;
        return this.field7990;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)I")
    public final int method3189(int arg0) {
        if (arg0 == -1) {
            field7987++;
            return this.field7998;
        } else {
            return 72;
        }
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(I)I")
    public final int method3190(int arg0) {
        field7988++;
        if (arg0 != 32755) {
            field7991 = null;
        }
        return this.field7985;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(ZIIZ)V")
    public class566(boolean arg0, int arg1, int arg2, boolean arg3) {
        this.field7985 = arg2;
        this.field7990 = arg0;
        this.field7996 = arg3;
        this.field7998 = arg1;
    }
}
