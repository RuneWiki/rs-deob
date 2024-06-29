import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public abstract class class299 {

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "Z")
    public static boolean field3959 = false;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "Lfr;")
    public static class282 field3958 = new class282(2);

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "Lvj;")
    public static class304 field3960 = new class304("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
    public static int field3962 = 1338;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "Z")
    public static boolean field3964 = false;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "Lff;")
    public static class9 field3963 = new class9(95, 3);

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "Lcu;")
    public static class145 field3965 = new class145(9, -1);

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V", line = 5)
    public static void method1746(int arg0) {
        field3965 = null;
        int var1 = -69 % ((arg0 - 4) / 62);
        field3963 = null;
        field3960 = null;
        field3958 = null;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "([[BILcd;)V", line = 34)
    public static final void method1747(byte[][] arg0, int arg1, class205 arg2) {
        field3961++;
        int var3 = class305.field4025.length;
        if (arg1 != 64) {
            field3958 = null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg0[var4];
            if (var5 != null) {
                int var6 = (class149.field2131[var4] >> 8) * 64 - class401.field5382;
                int var7 = (class149.field2131[var4] & 0xFF) * 64 - class421.field5762;
                class88.method641((byte) 127);
                arg2.method1315(var6, class120.field1754, var5, var7, class370.field4984, arg1 ^ 0x8);
            }
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)[B")
    public abstract byte[] method747(byte arg0);

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(B[B)V")
    public abstract void method748(byte arg0, byte[] arg1);

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(III)[B")
    public abstract byte[] method746(int arg0, int arg1, int arg2);
}
