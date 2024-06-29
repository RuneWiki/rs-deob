import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public abstract class class87 extends class90 {

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "Z")
    public volatile boolean field1339 = true;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "Lve;")
    public static class233 field1340;

    @OriginalMember(owner = "client!wc", name = "H", descriptor = "Lve;")
    public static class233 field1342;

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "Z")
    public boolean field1343;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "Z")
    public boolean field1346;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "(I)V")
    public static void method593(int arg0) {
        field1342 = null;
        field1340 = null;
        if (arg0 < 77) {
            method593(-99);
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)[B")
    public abstract byte[] method594(boolean arg0);

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "(I)I")
    public static final int method595(int arg0) {
        int var1 = -35 % ((73 - arg0) / 51);
        field1344++;
        return class39.field582.method254((byte) 109);
    }

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "(I)I")
    public abstract int method596(int arg0);
}
