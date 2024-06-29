import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class class4 {

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "Ldj;")
    public static class44 field54 = class89.method650(255, "sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "[I")
    public static int[] field50 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "Ldj;")
    private static class44 field55 = class89.method650(255, "Username: ");

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "[I")
    public static int[] field58 = new int[32];

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "[I")
    public static int[] field57 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "Ldj;")
    public static class44 field49 = field55;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "[[Lvc;")
    public static class223[][] field52;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BII)I")
    public abstract int method25(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    public static final void method26(byte arg0) {
        int var1 = -68 % ((-arg0 - 17) / 33);
        field56++;
        for (int var2 = 0; var2 < class158.field2755; var2++) {
            int var3 = class158.field2751[var2];
            class121 var4 = class170.field2960[var3];
            if (var4 != null) {
                class103.method761(var4.field2156.field3620, var4, -16934);
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static final void method27(int arg0) {
        field53++;
        if (arg0 != 9385) {
            field58 = null;
        }
        class74.field1416.method1179((byte) -126);
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
    public abstract void method28(int arg0);

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
    public static void method29(int arg0) {
        field55 = null;
        field54 = null;
        field49 = null;
        field50 = null;
        field58 = null;
        if (arg0 == 0) {
            field57 = null;
            field52 = null;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field58[var1] = var0 - 1;
            var0 += var0;
        }
        field59 = 0;
    }
}
