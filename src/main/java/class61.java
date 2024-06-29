import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class61 extends class23 {

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
    public static int field1123 = 0;

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "[I")
    public static int[] field1121 = new int[100];

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "Ldc;")
    public static class37 field1125 = class185.method1233((byte) 86, "k");

    @OriginalMember(owner = "client!ff", name = "P", descriptor = "Ldc;")
    public static class37 field1124 = class185.method1233((byte) 86, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!ff", name = "S", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "Lce;")
    public static class28 field1122;

    @OriginalMember(owner = "client!ff", name = "T", descriptor = "Lde;")
    public static class39 field1128;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(B)V")
    public static void method457(byte arg0) {
        field1122 = null;
        if (arg0 != 74) {
            method458(111, 2, 35, 59L);
        }
        field1124 = null;
        field1121 = null;
        field1128 = null;
        field1125 = null;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
    public class61() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        ++field1120;
        int[] var3 = super.field405.method1461(arg1, (byte) -118);
        if (super.field405.field4114) {
            class4.method32(var3, 0, class199.field3705, class167.field3196[arg1]);
        }
        if (arg0 != 0) {
            method458(-40, 74, 114, -116L);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method458(int arg0, int arg1, int arg2, long arg3) {
        class18 var5 = class180.field3354[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field292 != null && var5.field292.field3409 == arg3) {
            return true;
        } else if (var5.field299 != null && var5.field299.field1081 == arg3) {
            return true;
        } else if (var5.field295 != null && var5.field295.field2819 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field290; ++var6) {
                if (var5.field289[var6].field1641 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1127;
        if (class39.method352(-10924, arg1)) {
            if (arg3 != 100) {
                field1122 = null;
            }
            class107.method701(-1, arg6, arg0, arg4, class177.field3344[arg1], arg7, arg5, arg3 ^ 51, arg2);
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)Luf;")
    public static final class223 method460(int arg0, int arg1) {
        ++field1126;
        class223 var2 = (class223) class120.field2145.method87(127, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class217.field4053.method1547(arg1, 0, arg0);
            class223 var4 = new class223();
            if (var3 != null) {
                var4.method1469(arg1, arg0 ^ -29709, new class28(var3));
            }
            class120.field2145.method92((long) arg1, var4, true);
            return var4;
        }
    }
}
