import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class457 extends class85 {

    @OriginalMember(owner = "client!pl", name = "I", descriptor = "I")
    public static int field6376 = 0;

    @OriginalMember(owner = "client!pl", name = "M", descriptor = "Loi;")
    public static class169 field6380;

    @OriginalMember(owner = "client!pl", name = "P", descriptor = "Loi;")
    public static class169 field6383;

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "I")
    public int field6369;

    @OriginalMember(owner = "client!pl", name = "B", descriptor = "I")
    public static int field6371;

    @OriginalMember(owner = "client!pl", name = "D", descriptor = "I")
    public int field6372;

    @OriginalMember(owner = "client!pl", name = "E", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!pl", name = "F", descriptor = "I")
    public int field6374;

    @OriginalMember(owner = "client!pl", name = "L", descriptor = "I")
    public int field6379;

    @OriginalMember(owner = "client!pl", name = "K", descriptor = "Lpb;")
    public class296 field6378;

    @OriginalMember(owner = "client!pl", name = "J", descriptor = "Lf;")
    public static class404 field6377;

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "Ljava/lang/String;")
    public String field6368;

    @OriginalMember(owner = "client!pl", name = "A", descriptor = "[I")
    public int[] field6370;

    @OriginalMember(owner = "client!pl", name = "G", descriptor = "[I")
    public int[] field6375;

    @OriginalMember(owner = "client!pl", name = "O", descriptor = "[Ljr;")
    public class357[] field6382;

    @OriginalMember(owner = "client!pl", name = "N", descriptor = "[Ljava/lang/String;")
    public String[] field6381;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(B)V")
    public static final void method2704(byte arg0) {
        int var1 = -100 % ((-arg0 - 21) / 52);
        class420.method2472((byte) -101, class227.field2926);
        class391.field5122++;
        field6373++;
        class319.field4112.method609(class504.field7414, -43);
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(II)V")
    public static final void method2705(int arg0, int arg1) {
        class448.field6231 = 1000 / arg1;
        field6371++;
        if (arg0 > -54) {
            method2705(-118, -28);
        }
    }

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "(B)V")
    public static void method2706(byte arg0) {
        field6383 = null;
        if (arg0 > -102) {
            method2706((byte) 35);
        }
        field6380 = null;
        field6377 = null;
    }

    static {
        new class169("From", "Von:", "De", "De");
        field6380 = new class169("Loading...", "Lade...", "Chargement en cours...", "Carregando...");
        field6383 = new class169("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");
    }
}
