import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class28 {

    @OriginalMember(owner = "client!df", name = "a", descriptor = "Lec;")
    private static class32 field505 = class73.method594("Please wait 1 minute and try again)3", true);

    @OriginalMember(owner = "client!df", name = "d", descriptor = "Lec;")
    public static class32 field508 = field505;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "Lec;")
    public static class32 field509 = field505;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "[I")
    public static int[] field512 = new int[100];

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field506 = 0;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "Lec;")
    private static class32 field513 = class73.method594("Take", true);

    @OriginalMember(owner = "client!df", name = "l", descriptor = "Lec;")
    public static class32 field516 = class73.method594("leuchten3:", true);

    @OriginalMember(owner = "client!df", name = "c", descriptor = "Lec;")
    public static class32 field507 = field513;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "[Lh;")
    public static class49[] field515;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)Lec;")
    public static final class32 method191(int arg0, int arg1) {
        if (arg0 > -98) {
            field513 = null;
        }
        field517++;
        return class52.method403(new class32[] { class159.method1230(arg1 >> 24 & 0xFF, 0), class64.field1478, class159.method1230(arg1 >> 16 & 0xFF, 0), class64.field1478, class159.method1230(arg1 >> 8 & 0xFF, 0), class64.field1478, class159.method1230(arg1 & 0xFF, 0) }, (byte) -20);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(II)Z")
    public static final boolean method192(int arg0, int arg1) {
        field514++;
        if (class92.field2121[arg0]) {
            return true;
        }
        if (arg1 != -18020) {
            method191(-22, -52);
        }
        if (!class85.field1992.method203(arg0, 24624)) {
            return false;
        }
        int var2 = class85.field1992.method200((byte) 53, arg0);
        if (var2 == 0) {
            class92.field2121[arg0] = true;
            return true;
        }
        if (class79.field1826[arg0] == null) {
            class79.field1826[arg0] = new class36[var2];
        }
        for (int var3 = 0; var3 < var2; var3++) {
            if (class79.field1826[arg0][var3] == null) {
                byte[] var4 = class85.field1992.method206(arg0, var3, -121);
                if (var4 != null) {
                    class79.field1826[arg0][var3] = new class36();
                    class79.field1826[arg0][var3].field744 = (arg0 << 16) + var3;
                    if (var4[0] == -1) {
                        class79.field1826[arg0][var3].method312(new class66(var4), -65536);
                    } else {
                        class79.field1826[arg0][var3].method309(new class66(var4), (byte) 115);
                    }
                }
            }
        }
        class92.field2121[arg0] = true;
        return true;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILea;II)Z")
    public static final boolean method193(int arg0, class30 arg1, int arg2, int arg3) {
        field510++;
        if (arg2 != -308039560) {
            return false;
        }
        byte[] var4 = arg1.method206(arg0, arg3, arg2 + 308039462);
        if (var4 == null) {
            return false;
        } else {
            class54.method428(false, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public static void method194(int arg0) {
        if (arg0 != -7798) {
            return;
        }
        field509 = null;
        field508 = null;
        field515 = null;
        field512 = null;
        field505 = null;
        field516 = null;
        field507 = null;
        field513 = null;
    }
}
