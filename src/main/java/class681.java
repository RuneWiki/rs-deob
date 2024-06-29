import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class681 extends class616 {

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "Leb;")
    public class577 field9752;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "[Lbg;")
    public static class431[] field9746 = null;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public static int field9751 = -60;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "[[Ljava/lang/String;")
    public static String[][] field9745 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public static int field9748;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public static int field9749;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    public static int field9750;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "Lwo;")
    public static class690 field9744;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "Ljava/applet/Applet;")
    public static Applet field9747;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3861(int arg0, int arg1, byte arg2) {
        field9748++;
        if (class309.method1818(arg0, -25365, arg1)) {
            int var3 = -30 / ((arg2 - 56) / 58);
            return class467.method2745(arg1, (byte) -74, arg0) | (arg0 & 0x9000) != 0 | class426.method2567(arg1, -117, arg0) ? true : (arg1 & 0x37) == 0 & ((arg0 & 0x2000) != 0 | class215.method1316(arg0, 25782, arg1) | class262.method1592(arg1, -83, arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
    public static void method3862(int arg0) {
        field9744 = null;
        field9747 = null;
        field9745 = null;
        field9746 = null;
        int var1 = 10 % ((arg0 + 21) / 57);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II[F)[F")
    public static final float[] method3863(int arg0, int arg1, float[] arg2) {
        field9750++;
        float[] var3 = new float[arg1];
        if (arg0 != 55) {
            method3863(105, 112, null);
        }
        class252.method1541(arg2, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lkga;II[B)V")
    public class681(class506 arg0, int arg1, int arg2, byte[] arg3) {
        this.field9752 = class703.method3942(arg1, false, arg2, 6406, arg0, 6406, arg3, -127);
        this.field9752.method1767(false, false, 10242);
    }
}
