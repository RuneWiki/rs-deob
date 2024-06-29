import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class429 extends class97 {

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "Lsf;")
    public class398 field6304 = new class398();

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
    public static int field6303 = 1;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "Lpf;")
    public static class425 field6299 = new class425(31, 3);

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "Lns;")
    public static class55 field6306 = new class55(1, 7);

    @OriginalMember(owner = "client!gl", name = "w", descriptor = "I")
    public static int field6308 = 2;

    @OriginalMember(owner = "client!gl", name = "y", descriptor = "Lnn;")
    public static class151 field6310 = new class151("Loading fonts - ", "Lade Schriftsätze - ", "Chargement des polices - ", "Carregando fontes - ");

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "I")
    public static int field6311 = 1;

    @OriginalMember(owner = "client!gl", name = "A", descriptor = "Lnn;")
    public static class151 field6312 = new class151("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!gl", name = "B", descriptor = "I")
    public static int field6313 = 0;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
    public static int field6305;

    @OriginalMember(owner = "client!gl", name = "x", descriptor = "Lkr;")
    public static class234 field6309;

    @OriginalMember(owner = "client!gl", name = "v", descriptor = "[Lfh;")
    public static class170[] field6307;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)I")
    public static final int method2637(int arg0) {
        if (arg0 > -90) {
            method2638((short[]) null, 85);
        }
        field6302++;
        return 16;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "([SI)[S")
    public static final short[] method2638(short[] arg0, int arg1) {
        field6301++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != -240) {
            field6309 = null;
        }
        short[] var2 = new short[arg0.length];
        class129.method764(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IZII)I")
    public static final int method2639(int arg0, boolean arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field6300++;
        if (var4 == 0) {
            return arg3;
        }
        if (arg1) {
            field6306 = null;
        }
        if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(I)V")
    public static void method2640(int arg0) {
        if (arg0 != 31) {
            return;
        }
        field6312 = null;
        field6310 = null;
        field6306 = null;
        field6307 = null;
        field6299 = null;
        field6309 = null;
    }
}
