import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class39 {

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public int field571 = -1;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "Lqd;")
    public static class37 field582 = new class37(260);

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field583 = 0;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "Ljava/lang/String;")
    public static String field585 = null;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "Ljava/lang/String;")
    public static String field586 = "Loaded wordpack";

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public int field573;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public int field574;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public int field576;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public int field577;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public int field578;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public int field579;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public int field580;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public int field584;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method268(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class71.field1104 * arg3 + class47.field663 * arg0 >> 16;
        int var6 = class47.field663 * arg3 - class71.field1104 * arg0 >> 16;
        int var7 = class148.field2113 * arg1 + class114.field1643 * var6 >> 16;
        int var8 = class114.field1643 * arg1 - class148.field2113 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class148.field2113 * arg2 + class114.field1643 * var6 >> 16;
        int var12 = class114.field1643 * arg2 - class148.field2113 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class51.field757 && var13 < class51.field757) {
            return false;
        } else if (var9 > class43.field622 && var13 > class43.field622) {
            return false;
        } else if (var10 < class132.field1941 && var14 < class132.field1941) {
            return false;
        } else {
            return var10 <= class152.field2191 || var14 <= class152.field2191;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    public static void method269(byte arg0) {
        field586 = null;
        field585 = null;
        if (arg0 != -72) {
            field582 = null;
        }
        field582 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "([BB)Lnj;")
    public static final class198 method270(byte[] arg0, byte arg1) {
        field572++;
        if (arg0 == null) {
            return null;
        } else {
            class241 var2 = new class241(arg0, class91.field1386, class211.field3035, class246.field3682, class282.field4500, class263.field3965);
            class290.method1935(0);
            int var3 = 115 / ((2 - arg1) / 54);
            return var2;
        }
    }
}
