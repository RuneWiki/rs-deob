import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class52 {

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field912 = 0;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field915 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "[I")
    public static int[] field909 = new int[4096];

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "Ljava/lang/String;")
    public static String field918;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "[I")
    public static int[] field916;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "[Lcj;")
    public static class74[] field919;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLga;)I")
    public static final int method326(byte arg0, class141 arg1) {
        field913++;
        class208 var2 = arg1.field2421;
        if (var2.field3521 != null) {
            var2 = var2.method1402((byte) -113);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field3520;
        if (arg0 > -52) {
            return -83;
        }
        class37 var4 = arg1.method533(-1);
        if (arg1.field1421 == var4.field531) {
            var3 = var2.field3512;
        } else if (arg1.field1421 == var4.field540 || arg1.field1421 == var4.field534 || arg1.field1421 == var4.field549 || arg1.field1421 == var4.field519) {
            var3 = var2.field3507;
        } else if (arg1.field1421 == var4.field551 || arg1.field1421 == var4.field525 || arg1.field1421 == var4.field542 || arg1.field1421 == var4.field541) {
            var3 = var2.field3524;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IBIIZILvh;)V")
    public static final void method327(int arg0, byte arg1, int arg2, int arg3, boolean arg4, int arg5, class108 arg6) {
        class146.field2484 = 1;
        class82.field1503 = arg5;
        class268.field4330 = arg2;
        field908++;
        class90.field1588 = arg3;
        class286.field4533 = arg0;
        class122.field2151 = arg4;
        int var7 = -77 / ((35 - arg1) / 40);
        class169.field2791 = arg6;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public static void method328(int arg0) {
        field918 = null;
        field915 = null;
        field916 = null;
        int var1 = -54 / ((-arg0 - 63) / 32);
        field909 = null;
        field919 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)I")
    public static int method329(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
    public class52() {
        new class21();
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field909[var0] = class181.method1195(6485, var0);
        }
        field918 = "Created gameworld";
        field916 = new int[8];
        field917 = 0;
    }
}
