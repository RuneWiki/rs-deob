import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public abstract class class466 extends class656 {

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "[I")
    public static int[] field6414 = new int[32];

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field6412;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "Lwu;")
    public static class376 field6413;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "[I")
    public static int[] field6415;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)I")
    public abstract int method1097(int arg0);

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)J")
    public abstract long method1096(int arg0);

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)I")
    public abstract int method1099(byte arg0);

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V")
    public static final void method2638(int arg0) {
        if (arg0 != -4) {
            field6413 = null;
        }
        if (class381.field5297 != null) {
            class206[] var1 = class381.field5297;
            for (int var2 = 0; var2 < var1.length; var2++) {
                class206 var3 = var1[var2];
                var3.method1373((byte) -2);
            }
        }
        field6412++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILha;)V")
    public static final void method2639(int arg0, class59 arg1) {
        class68.field833 = new class507[class595.field7748.length];
        field6411++;
        for (int var2 = arg0; var2 < class595.field7748.length; var2++) {
            int var3 = class595.field7748[var2];
            class539 var4 = class165.method1184(class629.field8381, 13580, var3);
            class60 var5 = arg1.method425(var4, class720.method4046(class517.field6905, var3), true);
            class68.field833[var2] = new class507(var5, var4);
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)I")
    public abstract int method1100(int arg0);

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(B)V")
    public static void method2640(byte arg0) {
        field6414 = null;
        field6413 = null;
        if (arg0 != 120) {
            field6414 = null;
        }
        field6415 = null;
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)I")
    public abstract int method1098(int arg0);
}
