import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class341 {

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "Ltl;")
    public class440 field5066 = new class440();

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "Z")
    public boolean field5075 = false;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
    public static int field5067 = 0;

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "J")
    public static long field5071 = -1L;

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "Lak;")
    public static class234 field5070 = new class234("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
    public int field5072;

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "I")
    public int field5073;

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "Lul;")
    public static class406 field5069;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "Ljava/lang/String;")
    public static String field5068;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "[Z")
    public static boolean[] field5065;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V", line = 19)
    public static void method2145(int arg0) {
        if (arg0 != 0) {
            method2145(12);
        }
        field5069 = null;
        field5065 = null;
        field5070 = null;
        field5068 = null;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZZIII)V", line = 37)
    public static final void method2146(boolean arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class522.method3110(1, arg3, 0, arg1, class210.field3428.length - 1, arg0, arg2);
        field5074++;
        class398.field5951 = 0;
        if (arg4 != 10316) {
            field5065 = null;
        }
        class232.field3749 = null;
    }
}
