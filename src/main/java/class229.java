import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class229 {

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Lpm;")
    public static class349 field3393 = new class349("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!je", name = "f", descriptor = "[[I")
    public static int[][] field3398 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field3400 = 0;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field3399 = 0;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field3396 = 0;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "Ltj;")
    public static class108 field3395;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "Ltj;")
    public static class108 field3397;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([BB)[B", line = 9)
    public static final byte[] method1593(byte[] arg0, byte arg1) {
        field3394++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        if (arg1 != -28) {
            method1593((byte[]) null, (byte) 104);
        }
        class271.method1853(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V", line = 26)
    public static void method1594(boolean arg0) {
        field3395 = null;
        field3393 = null;
        if (arg0) {
            field3398 = null;
            field3397 = null;
        }
    }
}
