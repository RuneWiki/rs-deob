import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class426 {

    @OriginalMember(owner = "client!v", name = "b", descriptor = "Lsh;")
    public static class472 field6084 = new class472(61, 2);

    @OriginalMember(owner = "client!v", name = "h", descriptor = "Lo;")
    public static class332 field6090 = new class332("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public static int field6092 = 2;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field6093 = 0;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field6083;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public int field6085;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public int field6086;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field6087;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public int field6088;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public int field6089;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field6091;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V", line = 4)
    public static void method2507(int arg0) {
        field6084 = null;
        int var1 = 67 / ((arg0 - 69) / 34);
        field6090 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZLje;I)V", line = 20)
    public static final void method2508(boolean arg0, class178 arg1, int arg2) {
        field6087++;
        int var3 = arg1.field2560 == 0 ? arg1.field2595 : arg1.field2560;
        int var4 = arg1.field2601 == 0 ? arg1.field2589 : arg1.field2601;
        class315.method1947(var3, arg1.field2631, var4, arg2 ^ arg2, arg0, class467.field6572[arg1.field2631 >> 16]);
        if (arg1.field2548 != null) {
            class315.method1947(var3, arg1.field2631, var4, 0, arg0, arg1.field2548);
        }
        class468 var5 = (class468) class466.field6564.method2305((long) arg1.field2631, (byte) 25);
        if (var5 != null) {
            class351.method2169(var4, arg0, (byte) 103, var5.field6584, var3);
        }
    }
}
