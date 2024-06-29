import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class7 {

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "I")
    public int field58;

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "I")
    public int field55;

    @OriginalMember(owner = "client!kw", name = "q", descriptor = "I")
    private int field69;

    @OriginalMember(owner = "client!kw", name = "j", descriptor = "B")
    public byte field62;

    @OriginalMember(owner = "client!kw", name = "m", descriptor = "I")
    public int field65;

    @OriginalMember(owner = "client!kw", name = "o", descriptor = "Ldc;")
    public static class303 field67 = new class303(0, 2, 2, 1);

    @OriginalMember(owner = "client!kw", name = "v", descriptor = "I")
    public static int field74 = 0;

    @OriginalMember(owner = "client!kw", name = "w", descriptor = "[I")
    public static int[] field75 = new int[128];

    @OriginalMember(owner = "client!kw", name = "r", descriptor = "F")
    public static float field70;

    @OriginalMember(owner = "client!kw", name = "t", descriptor = "F")
    public static float field72;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "I")
    public int field53;

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "I")
    public int field54;

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "I")
    public int field56;

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "I")
    public int field57;

    @OriginalMember(owner = "client!kw", name = "g", descriptor = "I")
    public int field59;

    @OriginalMember(owner = "client!kw", name = "h", descriptor = "I")
    public int field60;

    @OriginalMember(owner = "client!kw", name = "i", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!kw", name = "l", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!kw", name = "n", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!kw", name = "p", descriptor = "I")
    public int field68;

    @OriginalMember(owner = "client!kw", name = "s", descriptor = "I")
    public int field71;

    @OriginalMember(owner = "client!kw", name = "u", descriptor = "I")
    public int field73;

    @OriginalMember(owner = "client!kw", name = "k", descriptor = "Lkw;")
    public class7 field63;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)V")
    public static void method27(int arg0) {
        field75 = null;
        field67 = null;
        if (arg0 != 97) {
            field70 = -0.48346934F;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIB)Lkw;")
    public final class7 method28(int arg0, int arg1, int arg2, byte arg3) {
        field66++;
        if (arg3 != -19) {
            this.method30(93);
        }
        return new class7(this.field69, arg0, arg1, arg2, this.field62);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZI)V")
    public static final void method29(boolean arg0, int arg1) {
        field61++;
        class154.method1159(class597.field8633, class465.field6689, arg1 - 22740, class557.field8146, arg0);
        if (arg1 != 22739) {
            field70 = 0.95065695F;
        }
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(IIIIB)V")
    public class7(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field58 = arg1;
        this.field55 = arg3;
        this.field69 = arg0;
        this.field62 = arg4;
        this.field65 = arg2;
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(I)Lgi;")
    public final class571 method30(int arg0) {
        if (arg0 == 2) {
            field64++;
            return class127.method1008(this.field69, 29127);
        } else {
            return null;
        }
    }

    static {
        for (int var0 = 0; var0 < field75.length; var0++) {
            field75[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field75[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field75[var2] = var2 + 26 - 97;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field75[var3] = var3 + 52 - 48;
        }
        field75[45] = field75[47] = 63;
        field75[42] = field75[43] = 62;
    }
}
