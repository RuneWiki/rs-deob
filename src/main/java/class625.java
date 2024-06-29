import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class625 extends class108 {

    @OriginalMember(owner = "client!raa", name = "p", descriptor = "Z")
    public boolean field9043 = false;

    @OriginalMember(owner = "client!raa", name = "q", descriptor = "I")
    public int field9044 = -1;

    @OriginalMember(owner = "client!raa", name = "n", descriptor = "Lvt;")
    public static class344 field9041 = new class344("Loaded JACLIB", "JACLIB geladen", "JACLIB chargé", "JACLIB carregado");

    @OriginalMember(owner = "client!raa", name = "j", descriptor = "I")
    public static int field9037;

    @OriginalMember(owner = "client!raa", name = "k", descriptor = "I")
    public int field9038;

    @OriginalMember(owner = "client!raa", name = "l", descriptor = "I")
    public int field9039;

    @OriginalMember(owner = "client!raa", name = "m", descriptor = "I")
    public int field9040;

    @OriginalMember(owner = "client!raa", name = "o", descriptor = "I")
    public int field9042;

    @OriginalMember(owner = "client!raa", name = "t", descriptor = "I")
    public int field9047;

    @OriginalMember(owner = "client!raa", name = "r", descriptor = "Lde;")
    public static class15 field9045;

    @OriginalMember(owner = "client!raa", name = "s", descriptor = "[[[B")
    public static byte[][][] field9046;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "()V")
    public static final void method3604() {
        for (int var0 = 0; var0 < class548.field7628; var0++) {
            class450 var1 = class315.field4364[var0];
            class82.method462(var1);
            class315.field4364[var0] = null;
        }
        class548.field7628 = 0;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)V")
    public static void method3605(int arg0) {
        field9045 = null;
        field9041 = null;
        if (arg0 != -1) {
            field9045 = null;
        }
        field9046 = null;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(II)I")
    public static final int method3606(int arg0, int arg1) {
        int var2 = 23 % ((-arg1 - 56) / 54);
        field9037++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(I)V")
    public class625(int arg0) {
        this.field9044 = arg0;
    }
}
