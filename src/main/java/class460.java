import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class460 {

    @OriginalMember(owner = "client!it", name = "f", descriptor = "I")
    public static int field6853 = 0;

    @OriginalMember(owner = "client!it", name = "e", descriptor = "Z")
    public static boolean field6852 = false;

    @OriginalMember(owner = "client!it", name = "h", descriptor = "I")
    public static int field6855 = 0;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "Ls;")
    public static class186 field6850 = new class186(65, 3);

    @OriginalMember(owner = "client!it", name = "k", descriptor = "I")
    public static int field6858 = 0;

    @OriginalMember(owner = "client!it", name = "i", descriptor = "Los;")
    public static class309 field6856 = new class309("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!it", name = "l", descriptor = "Lcd;")
    public static class208 field6859 = new class208("", 17);

    @OriginalMember(owner = "client!it", name = "j", descriptor = "F")
    public static float field6857;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "I")
    public static int field6848;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!it", name = "g", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!it", name = "m", descriptor = "[I")
    public static int[] field6860;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IB)I", line = 5)
    public static final int method2768(int arg0, byte arg1) {
        field6851++;
        int var2 = 63 / ((arg1 - 56) / 33);
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "([Ljava/lang/Object;[JI)V", line = 18)
    public static final void method2769(Object[] arg0, long[] arg1, int arg2) {
        int var3 = 120 / ((-arg2 - 23) / 41);
        class322.method2060(arg1, arg0, 113, 0, arg1.length - 1);
        field6854++;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Z)V", line = 29)
    public static void method2770(boolean arg0) {
        if (arg0) {
            field6859 = null;
            field6856 = null;
            field6850 = null;
            field6860 = null;
        }
    }
}
