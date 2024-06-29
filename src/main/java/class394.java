import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public abstract class class394 {

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "[I")
    public static int[] field5190 = new int[128];

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "[Lpu;")
    public static class772[] field5191;

    static {
        for (int var0 = 0; var0 < field5190.length; var0++) {
            field5190[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field5190[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field5190[var2] = var2 + 26 - 97;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field5190[var3] = var3 + 52 - 48;
        }
        field5190[42] = field5190[43] = 62;
        field5190[45] = field5190[47] = 63;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V", line = 12)
    public static void method2282(byte arg0) {
        field5190 = null;
        field5191 = null;
        if (arg0 != -33) {
            method2282((byte) -76);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)Lmr;")
    public abstract class637 method270(int arg0);

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BI)Z")
    public abstract boolean method271(byte arg0, int arg1);

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)V")
    public abstract void method274(boolean arg0);

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)V")
    public abstract void method276(byte arg0);
}
