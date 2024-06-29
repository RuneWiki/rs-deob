import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class410 {

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "[[I")
    public static int[][] field6109 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "Lnn;")
    public static class151 field6110 = new class151("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!vs", name = "k", descriptor = "Lep;")
    public static class273 field6112 = new class273();

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "I")
    public int field6102;

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "I")
    public int field6103;

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "I")
    public static int field6104;

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "I")
    public int field6105;

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "I")
    public int field6106;

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "I")
    public int field6107;

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "I")
    public int field6111;

    @OriginalMember(owner = "client!vs", name = "l", descriptor = "Los;")
    public static class341 field6113;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V")
    public static void method2572(byte arg0) {
        field6110 = null;
        field6112 = null;
        if (arg0 != -86) {
            method2574(31, -120);
        }
        field6109 = null;
        field6113 = null;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)V")
    public static final void method2573(int arg0, int arg1) {
        field6104++;
        int var2 = 75 / ((arg0 + 34) / 42);
        class32 var3 = class136.method854(10, (byte) 116, arg1);
        var3.method192(-17451);
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(II)V")
    public static final void method2574(int arg0, int arg1) {
        class241 var2 = class80.field1055;
        synchronized (class80.field1055) {
            int var3 = -46 / ((arg1 + 18) / 33);
            class80.field1055.method1485(-22032);
            class80.field1055 = new class241(arg0);
        }
        field6108++;
    }
}
