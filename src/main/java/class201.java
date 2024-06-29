import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class201 {

    @OriginalMember(owner = "client!f", name = "l", descriptor = "I")
    public int field3270;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "[I")
    public int[] field3269;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "[B")
    public byte[] field3268;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "[Ljava/lang/String;")
    public String[] field3262;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "[I")
    public int[] field3261;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field3266 = 0;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "Lhh;")
    public static class169 field3267 = new class169();

    @OriginalMember(owner = "client!f", name = "m", descriptor = "I")
    public static int field3271 = 0;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "Ljava/lang/String;")
    public static String field3275 = "";

    @OriginalMember(owner = "client!f", name = "r", descriptor = "F")
    public static float field3276 = 0.0F;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "Lak;")
    public static class172 field3273;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "Loc;")
    public static class291 field3274;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "[[[B")
    public static byte[][][] field3272;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)I", line = 4)
    public final int method1467(int arg0, boolean arg1) {
        if (!arg1) {
            this.method1468(false, 99);
        }
        field3263++;
        return this.field3268[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZI)Z", line = 18)
    public final boolean method1468(boolean arg0, int arg1) {
        field3260++;
        if (arg0) {
            field3274 = (class291) null;
        }
        return (this.field3268[arg1] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V", line = 29)
    public static void method1469(byte arg0) {
        field3267 = null;
        field3274 = null;
        field3273 = null;
        field3275 = null;
        if (arg0 < -33) {
            field3272 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)Z", line = 52)
    public final boolean method1470(int arg0, int arg1) {
        if (arg1 < 65) {
            this.method1468(true, 91);
        }
        field3259++;
        return (this.field3268[arg0] & 0x8) != 0;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(II)Z", line = 65)
    public final boolean method1471(int arg0, int arg1) {
        if (arg0 == 0) {
            field3265++;
            return (this.field3268[arg1] & 0x10) == 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(I)V", line = 80)
    public class201(int arg0) {
        this.field3270 = arg0;
        this.field3269 = new int[this.field3270];
        this.field3268 = new byte[this.field3270];
        this.field3262 = new String[this.field3270];
        this.field3261 = new int[this.field3270];
    }
}
