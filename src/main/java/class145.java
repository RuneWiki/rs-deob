import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class145 {

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Z")
    public static boolean field3517 = false;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Lwd;")
    public static class150 field3514 = class2.method9(true, ":tradereq:");

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "Lwd;")
    public static class150 field3516 = class2.method9(true, "runes");

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field3522 = 0;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "Lff;")
    public static class42 field3520;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "[I")
    public static int[] field3521;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method1088(int arg0, int arg1) {
        if (arg0 <= 57) {
            method1089(-116);
        }
        field3519++;
        if (arg1 == 100 && class50.field1345 > 0) {
            byte[] var2 = class15.field383[--class50.field1345];
            class15.field383[class50.field1345] = null;
            return var2;
        } else if (arg1 == 5000 && class40.field1065 > 0) {
            byte[] var3 = class128.field3033[--class40.field1065];
            class128.field3033[class40.field1065] = null;
            return var3;
        } else if (arg1 == 30000 && class29.field883 > 0) {
            byte[] var4 = class69.field1730[--class29.field883];
            class69.field1730[class29.field883] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static void method1089(int arg0) {
        field3516 = null;
        field3520 = null;
        field3514 = null;
        if (arg0 == -1) {
            field3521 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)Z")
    public static final boolean method1090(int arg0, int arg1) {
        field3515++;
        if (class26.field781[arg1]) {
            return true;
        } else if (class47.field1255.method328(0, arg1)) {
            int var2 = class47.field1255.method319((byte) 65, arg1);
            if (var2 == 0) {
                class26.field781[arg1] = true;
                return true;
            }
            if (class58.field1500[arg1] == null) {
                class58.field1500[arg1] = new class141[var2];
            }
            if (arg0 > -58) {
                field3521 = null;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class58.field1500[arg1][var3] == null) {
                    byte[] var4 = class47.field1255.method315(var3, true, arg1);
                    if (var4 != null) {
                        class58.field1500[arg1][var3] = new class141();
                        class58.field1500[arg1][var3].field3323 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            class58.field1500[arg1][var3].method1065(-1, new class148(var4));
                        } else {
                            class58.field1500[arg1][var3].method1057(new class148(var4), -2);
                        }
                    }
                }
            }
            class26.field781[arg1] = true;
            return true;
        } else {
            return false;
        }
    }
}
