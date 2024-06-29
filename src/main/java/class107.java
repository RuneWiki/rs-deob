import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class107 {

    @OriginalMember(owner = "client!as", name = "a", descriptor = "Lhn;")
    public static class509 field1499 = new class509(106, 3);

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "Lfm;")
    public static class518 field1502;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "[Ll;")
    public static class16[] field1503;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(B)V")
    public static final void method826(byte arg0) {
        int var1 = -17 % ((arg0 + 43) / 48);
        field1500++;
        class415.field6196.method93((byte) 77);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIII)V")
    public static final void method827(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg0; var5 < class109.field1529; var5++) {
            Rectangle var6 = class273.field4183[var5];
            if (var6.x + var6.width > arg3 && var6.x < (arg2 + arg3) && arg1 < var6.y + var6.height && (arg1 + arg4) > var6.y) {
                class277.field4219[var5] = true;
            }
        }
        field1501++;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)V")
    public static void method828(boolean arg0) {
        field1502 = null;
        field1499 = null;
        if (arg0) {
            field1503 = null;
        }
        field1503 = null;
    }
}
