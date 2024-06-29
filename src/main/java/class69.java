import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public abstract class class69 extends class28 {

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "Z")
    public volatile boolean field1315 = true;

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "Lvf;")
    public static class265 field1308 = class87.method582(-46, ")2");

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "[Z")
    public static boolean[] field1311 = new boolean[112];

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "Z")
    public boolean field1310;

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "Z")
    public boolean field1314;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "[I")
    public static int[] field1313;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)I")
    public abstract int method492(int arg0);

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)[B")
    public abstract byte[] method493(int arg0);

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "(I)V")
    public static void method494(int arg0) {
        field1313 = null;
        field1311 = null;
        field1308 = null;
        if (arg0 != 112) {
            method494(14);
        }
    }
}
