import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 extends class381 {

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "[I")
    public int[] field105;

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "[I")
    public int[] field107;

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "Lpi;")
    public static class342 field108 = new class342("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!ft", name = "i", descriptor = "Z")
    public static boolean field110 = false;

    @OriginalMember(owner = "client!ft", name = "k", descriptor = "Lop;")
    public static class124 field112 = new class124("WTI", 5);

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "Lqa;")
    public static class162 field109;

    @OriginalMember(owner = "client!ft", name = "j", descriptor = "Lqj;")
    public static class351 field111;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(B[I[J)V")
    public static final void method32(byte arg0, int[] arg1, long[] arg2) {
        if (arg0 < -17) {
            class263.method1697(arg1, (byte) 117, 0, arg2.length - 1, arg2);
            field106++;
        }
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(II[I[I)V")
    public class4(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field105 = arg2;
        this.field107 = arg3;
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(II)I")
    public static final int method33(int arg0, int arg1) {
        return class407.field6111 == null ? 0 : class407.field6111[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V")
    public static void method34(int arg0) {
        field112 = null;
        field111 = null;
        if (arg0 > -75) {
            method32((byte) 79, null, null);
        }
        field108 = null;
        field109 = null;
    }
}
