import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class127 {

    @OriginalMember(owner = "client!le", name = "a", descriptor = "Lhi;")
    public static class82 field2226 = class95.method664((byte) -64, ":clanreq:");

    @OriginalMember(owner = "client!le", name = "e", descriptor = "Lhi;")
    public static class82 field2230 = class95.method664((byte) -26, "Vous ne pouvez pas ajouter votre nom -9 votre liste noire)3");

    @OriginalMember(owner = "client!le", name = "h", descriptor = "Z")
    public static boolean field2233 = false;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "Lei;")
    public static class70 field2234;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "Z")
    public static boolean field2231;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 4)
    public static void method892(int arg0) {
        field2226 = null;
        field2230 = null;
        field2234 = null;
        if (arg0 > -52) {
            method895((byte) -118, 21);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z[F)[F", line = 32)
    public static final float[] method893(boolean arg0, float[] arg1) {
        if (arg0) {
            method895((byte) 95, 62);
        }
        field2227++;
        if (arg1 == null) {
            return null;
        } else {
            float[] var2 = new float[arg1.length];
            class190.method1325(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(III)V", line = 59)
    public static final void method894(int arg0, int arg1, int arg2) {
        if (arg2 != 29728) {
            field2233 = false;
        }
        field2232++;
        class227 var3 = class215.method1531(arg2 - 29729, 6, arg1);
        var3.method1616(64);
        var3.field3923 = arg0;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BI)Z", line = 81)
    public static final boolean method895(byte arg0, int arg1) {
        field2229++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            int var2 = 72 / ((arg0 - 31) / 49);
            return arg1 >= 48 && arg1 <= 57;
        }
    }
}
