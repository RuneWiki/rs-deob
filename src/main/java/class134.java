import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class134 {

    @OriginalMember(owner = "client!ut", name = "f", descriptor = "Log;")
    private class673 field1744;

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "J")
    public long field1743;

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "F")
    public static float field1745;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!ut", name = "h", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "Lcb;")
    public static class544 field1740;

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "Lre;")
    public static class625 field1742;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)Z")
    public static final boolean method950(int arg0, int arg1) {
        if (arg1 >= -35) {
            field1745 = 2.1084058F;
        }
        field1741++;
        if (arg0 == 21 || arg0 == 15 || arg0 == 22 || arg0 == 50 || arg0 == 4) {
            return true;
        } else {
            return arg0 == 3 || arg0 == 1012;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V")
    public static void method951(int arg0) {
        if (arg0 != 15) {
            method951(19);
        }
        field1740 = null;
        field1742 = null;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(BI)Lrh;")
    public static final class275 method952(byte arg0, int arg1) {
        if (arg0 != -101) {
            field1745 = 0.6012462F;
        }
        field1739++;
        class275[] var2 = class391.method2390(0);
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field3818 == arg1) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ut", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field1746++;
        this.field1744.method3815(this.field1743, 0);
        super.finalize();
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Log;JI)V")
    public class134(class673 arg0, long arg1, int arg2) {
        this.field1744 = arg0;
        this.field1743 = arg1;
    }
}
