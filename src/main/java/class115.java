import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class115 {

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public int field1439 = class556.method3250(123);

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public int field1433;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "Ljava/lang/String;")
    public String field1436;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "Ljava/lang/String;")
    public String field1435;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    public int field1449;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "Ljava/lang/String;")
    public String field1450;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "Ljava/lang/String;")
    public String field1451;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public int field1440;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
    public int field1452;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "Lcea;")
    public static class180 field1434 = new class180("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "[I")
    public static int[] field1438;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "[I")
    public static int[] field1442;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "[I")
    public static int[] field1441;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field1444;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "[I")
    public static int[] field1448;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "[I")
    public static int[] field1446;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "[I")
    public static int[] field1447;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public static void method681(int arg0) {
        field1438 = null;
        if (arg0 != 50) {
            return;
        }
        field1442 = null;
        field1447 = null;
        field1444 = null;
        field1446 = null;
        field1441 = null;
        field1434 = null;
        field1448 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V")
    public static final void method682(int arg0, int arg1) {
        class184.field2230 = arg1;
        if (arg0 != 31982) {
            method681(18);
        }
        field1445++;
        class91.field1121 = 2;
        long var2 = 0L;
        if (class59.field562 == null) {
            class19.method130((byte) 105, 35);
        } else {
            class374 var4 = new class374(class384.method2217(class271.method1510(class59.field562, 100), (byte) -61));
            long var5 = var4.method2107(arg0 ^ 0x7CB6);
            class66.field637 = var4.method2107(99);
            class81.method476(true, arg0 - 32105, class589.method3418(var5, (byte) 53), "");
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V")
    public final void method683(int arg0, String arg1, int arg2, String arg3, String arg4, int arg5, String arg6, int arg7) {
        this.field1439 = class556.method3250(111);
        field1432++;
        this.field1435 = arg6;
        if (arg0 != -28388) {
            return;
        }
        this.field1451 = arg4;
        this.field1433 = arg5;
        this.field1440 = arg7;
        this.field1450 = arg1;
        this.field1452 = class335.field4358;
        this.field1436 = arg3;
        this.field1449 = arg2;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public class115(int arg0, int arg1, String arg2, String arg3, String arg4, int arg5, String arg6) {
        this.field1433 = arg5;
        this.field1436 = arg2;
        this.field1435 = arg3;
        this.field1449 = arg0;
        this.field1450 = arg6;
        this.field1451 = arg4;
        this.field1440 = arg1;
        this.field1452 = class335.field4358;
    }

    static {
        new class180("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
        field1437 = 50;
        field1438 = new int[field1437];
        field1442 = new int[field1437];
        field1441 = new int[field1437];
        field1444 = new String[field1437];
        field1448 = new int[field1437];
        field1446 = new int[field1437];
        field1447 = new int[field1437];
    }
}
