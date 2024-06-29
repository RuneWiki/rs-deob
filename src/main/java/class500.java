import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class500 {

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "I")
    public int field7325 = 128;

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "I")
    public int field7320 = 128;

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "I")
    public int field7326;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "I")
    public int field7317;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "I")
    public int field7319;

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "I")
    public int field7323;

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "Lkc;")
    public static class157 field7322 = new class157("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "[S")
    public static short[] field7327 = new short[256];

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "I")
    public static int field7318;

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "I")
    public static int field7321;

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "Laf;")
    public static class122 field7324;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)Loq;")
    public final class500 method2977(byte arg0) {
        field7318++;
        return arg0 == 68 ? new class500(this.field7326, this.field7325, this.field7320, this.field7317, this.field7323, this.field7319) : null;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)V")
    public static void method2978(int arg0) {
        field7322 = null;
        field7324 = null;
        field7327 = null;
        if (arg0 != 256) {
            method2978(-58);
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Loq;I)V")
    public final void method2979(class500 arg0, int arg1) {
        this.field7320 = arg0.field7320;
        this.field7325 = arg0.field7325;
        this.field7317 = arg0.field7317;
        this.field7319 = arg0.field7319;
        this.field7323 = arg0.field7323;
        field7321++;
        int var3 = 26 / ((arg1 + 59) / 40);
        this.field7326 = arg0.field7326;
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(I)V")
    public class500(int arg0) {
        this.field7326 = arg0;
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(IIIIII)V")
    private class500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7320 = arg2;
        this.field7326 = arg0;
        this.field7325 = arg1;
        this.field7317 = arg3;
        this.field7319 = arg5;
        this.field7323 = arg4;
    }
}
