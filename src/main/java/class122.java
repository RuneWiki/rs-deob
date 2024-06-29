import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class122 {

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "Llc;")
    public static class86 field1699 = new class86(20);

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "[I")
    public static int[] field1700 = new int[5];

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "[Ljb;")
    public static class276[] field1703 = new class276[4];

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1704 = "Cancel";

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field1701 = 127;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static void method799(int arg0) {
        field1703 = null;
        if (arg0 != -17256) {
            field1702 = -73;
        }
        field1704 = null;
        field1699 = null;
        field1700 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method800(int arg0, String arg1) {
        if (arg0 == 10) {
            field1697++;
            return class158.method1054(10, 0, arg1, true);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
    public static final String method801(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 <= 88) {
            field1702 = -73;
        }
        int var4 = 0;
        field1694++;
        char[] var5 = new char[arg2];
        for (int var6 = 0; var6 < arg2; var6++) {
            int var7 = arg1[arg3 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class40.field599[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var5[var4++] = (char) var7;
            }
        }
        return new String(var5, 0, var4);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public static final String method802(int arg0, boolean arg1) {
        field1696++;
        return arg1 ? (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF) : null;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)Lwf;")
    public static final class1 method803(int arg0) {
        field1695++;
        try {
            if (arg0 != 16850) {
                method801(11, (byte[]) null, 94, -93);
            }
            return (class1) Class.forName("ij").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(JI)V")
    public static final void method804(long arg0, int arg1) {
        if (!class297.field4681) {
            class68.field912 += (float) arg0 * class144.field1996 / 40.0F;
            class78.field1091 += (float) arg0 * class69.field935 / 40.0F;
        }
        field1698++;
        if (arg1 != 255) {
            field1703 = null;
        }
        int var3 = class163.field2263 + class217.field3280.field4019;
        int var4 = class207.field2887 + class217.field3280.field4085;
        if (class221.field3314 - var3 < -500 || class221.field3314 - var3 > 500 || (class240.field3679 - var4) < -500 || (class240.field3679 - var4) > 500) {
            class240.field3679 = var4;
            class221.field3314 = var3;
        }
        if (class240.field3679 != var4) {
            class240.field3679 = (int) ((long) (var4 - class240.field3679) * arg0 / 320L + (long) class240.field3679);
        }
        if (class221.field3314 != var3) {
            class221.field3314 = (int) ((long) (var3 - class221.field3314) * arg0 / 320L + (long) class221.field3314);
        }
        class104.method682((byte) -92);
    }
}
