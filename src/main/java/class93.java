import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class93 {

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "[Lqp;")
    public class470[] field1311 = new class470[8];

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "[Llq;")
    public class389[] field1310 = new class389[100];

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "[I")
    public int[] field1309 = new int[100];

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "[I")
    public int[] field1315 = new int[3];

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Lak;")
    public static class234 field1313 = new class234("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field1316 = 0;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field1318 = new String[100];

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public int field1314;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field1312;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V")
    public static void method750(boolean arg0) {
        field1313 = null;
        field1318 = null;
        if (!arg0) {
            field1316 = 113;
        }
    }
}
