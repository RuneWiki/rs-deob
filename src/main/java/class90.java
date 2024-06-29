import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class90 {

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field1702 = 0;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "Ldj;")
    public static class44 field1703 = class89.method650(255, "<col=80ff00>");

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "[I")
    public static int[] field1700 = new int[4096];

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "Ldj;")
    private static class44 field1705;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "Ldj;")
    public static class44 field1707;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "Lri;")
    public static class189 field1704;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "[Z")
    public static boolean[] field1708;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static void method655(int arg0) {
        field1707 = null;
        field1708 = null;
        field1703 = null;
        if (arg0 > 115) {
            field1705 = null;
            field1704 = null;
            field1700 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)[B")
    public static final synchronized byte[] method656(int arg0, byte arg1) {
        field1698++;
        if (arg0 == 100 && class38.field679 > 0) {
            byte[] var2 = class173.field3006[--class38.field679];
            class173.field3006[class38.field679] = null;
            return var2;
        } else if (arg0 == 5000 && class97.field1792 > 0) {
            byte[] var3 = class42.field777[--class97.field1792];
            class42.field777[class97.field1792] = null;
            return var3;
        } else if (arg0 == 30000 && class225.field4206 > 0) {
            byte[] var4 = class208.field3739[--class225.field4206];
            class208.field3739[class225.field4206] = null;
            return var4;
        } else {
            if (arg1 != 89) {
                field1706 = 108;
            }
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
    public static final void method657(boolean arg0) {
        class33.field583 = arg0;
        field1701++;
        class219.field3965 = false;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field1700[var0] = class21.method158(var0, 15288);
        }
        field1706 = 0;
        field1705 = class89.method650(255, "Loaded textures");
        field1707 = field1705;
        field1704 = new class189(64);
        field1708 = new boolean[8];
    }
}
