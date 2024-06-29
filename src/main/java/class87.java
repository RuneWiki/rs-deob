import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class87 extends class390 {

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public int field1214;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public int field1215;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "Ljava/lang/String;")
    public String field1218;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public int field1219;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "J")
    public long field1216;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public int field1217;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "Ljava/lang/String;")
    public String field1220;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "Lkn;")
    public static class442 field1221 = new class442("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    public static int field1222 = -1;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(B)V")
    public static void method618(byte arg0) {
        field1221 = null;
        int var1 = -76 / ((-arg0 - 17) / 54);
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJII)V")
    public class87(String arg0, String arg1, int arg2, int arg3, long arg4, int arg5, int arg6) {
        this.field1214 = arg6;
        this.field1215 = arg5;
        this.field1218 = arg0;
        this.field1219 = arg2;
        this.field1216 = arg4;
        this.field1217 = arg3;
        this.field1220 = arg1;
    }
}
