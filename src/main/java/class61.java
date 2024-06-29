import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class61 {

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field751 = 0;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "Ljava/lang/String;")
    public static String field749 = "Prepared sound engine";

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "Llc;")
    public static class175 field748;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "Lhi;")
    public static class307 field752;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "[I")
    public static int[] field750;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "[I")
    public static int[] field754;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IB)Z", line = 9)
    public static final boolean method355(int arg0, byte arg1) {
        field755++;
        if (arg0 >= 0 && arg0 < class74.field960.length) {
            if (arg1 < 10) {
                field751 = -54;
            }
            return class74.field960[arg0];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)Lbi;", line = 24)
    public static final class91 method356(byte arg0) {
        field753++;
        int var1 = class54.field664[0] * class264.field4159[0];
        byte[] var2 = class153.field2105[0];
        int[] var3 = new int[var1];
        if (arg0 > -71) {
            method357(false);
        }
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class134.field1854[class229.method1613(255, var2[var4])];
        }
        class91 var5;
        if (class250.field3787) {
            var5 = new class202(class99.field1288, class78.field988, class120.field1681[0], class223.field3150[0], class54.field664[0], class264.field4159[0], var3);
        } else {
            var5 = new class189(class99.field1288, class78.field988, class120.field1681[0], class223.field3150[0], class54.field664[0], class264.field4159[0], var3);
        }
        class321.method2238(-100);
        return var5;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)V", line = 62)
    public static void method357(boolean arg0) {
        field754 = null;
        field748 = null;
        if (arg0) {
            method358(false);
        }
        field749 = null;
        field750 = null;
        field752 = null;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(Z)I", line = 90)
    public static final int method358(boolean arg0) {
        field757++;
        return arg0 ? 76 : class43.field509;
    }
}
