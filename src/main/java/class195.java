import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class195 {

    @OriginalMember(owner = "client!o", name = "f", descriptor = "Lbe;")
    public static class283 field3329 = class153.method941(-37, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!o", name = "b", descriptor = "[I")
    public static int[] field3325 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!o", name = "h", descriptor = "Lbe;")
    public static class283 field3331 = class153.method941(126, ")3");

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field3330 = 0;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "Lkg;")
    public static class69 field3332;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "Z")
    public static boolean field3326;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B[B)[B", line = 11)
    public static final byte[] method1254(byte arg0, byte[] arg1) {
        int var2 = 71 % ((arg0 + 40) / 47);
        field3328++;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var3 = new byte[arg1.length];
            class136.method843(arg1, 0, var3, 0, arg1.length);
            return var3;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V", line = 26)
    public static void method1255(int arg0) {
        field3325 = null;
        field3331 = null;
        if (arg0 >= -64) {
            field3331 = (class283) null;
        }
        field3329 = null;
        field3332 = null;
    }
}
