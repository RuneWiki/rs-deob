import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public abstract class class567 extends class9 {

    @OriginalMember(owner = "client!rda", name = "x", descriptor = "Z")
    public volatile boolean field8322 = true;

    @OriginalMember(owner = "client!rda", name = "y", descriptor = "[I")
    public static int[] field8323 = new int[2];

    @OriginalMember(owner = "client!rda", name = "A", descriptor = "Z")
    public static boolean field8325 = false;

    @OriginalMember(owner = "client!rda", name = "B", descriptor = "I")
    public static int field8326 = 0;

    @OriginalMember(owner = "client!rda", name = "w", descriptor = "Z")
    public boolean field8321;

    @OriginalMember(owner = "client!rda", name = "z", descriptor = "Z")
    public boolean field8324;

    static {
        new class180("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(B)V", line = 4)
    public static void method3306(byte arg0) {
        field8323 = null;
        int var1 = -1 % ((arg0 - 8) / 36);
    }

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "(I)[B")
    public abstract byte[] method244(int arg0);

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Z)I")
    public abstract int method245(boolean arg0);
}
