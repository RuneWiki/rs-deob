import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class373 {

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "I")
    public static int field5019 = 50;

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "[I")
    public static int[] field5020 = new int[field5019];

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "[I")
    public static int[] field5021 = new int[field5019];

    @OriginalMember(owner = "client!qba", name = "e", descriptor = "[I")
    public static int[] field5023 = new int[field5019];

    @OriginalMember(owner = "client!qba", name = "i", descriptor = "[I")
    public static int[] field5027 = new int[field5019];

    @OriginalMember(owner = "client!qba", name = "k", descriptor = "[I")
    public static int[] field5029 = new int[field5019];

    @OriginalMember(owner = "client!qba", name = "g", descriptor = "[I")
    public static int[] field5025 = new int[field5019];

    @OriginalMember(owner = "client!qba", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field5028 = new String[field5019];

    @OriginalMember(owner = "client!qba", name = "l", descriptor = "[Lkk;")
    public static class173[] field5030 = new class173[4];

    @OriginalMember(owner = "client!qba", name = "f", descriptor = "Lwo;")
    public static class690 field5024 = new class690(108, -1);

    @OriginalMember(owner = "client!qba", name = "d", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!qba", name = "h", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)V")
    public static void method2174(int arg0) {
        field5025 = null;
        field5020 = null;
        field5024 = null;
        field5028 = null;
        int var1 = 90 % ((-arg0 - 73) / 48);
        field5029 = null;
        field5023 = null;
        field5027 = null;
        field5021 = null;
        field5030 = null;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(III)Z")
    public static final boolean method2175(int arg0, int arg1, int arg2) {
        if (arg0 != 1024) {
            field5024 = null;
        }
        field5026++;
        return (arg1 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(Lqm;Lr;Z)I")
    public static final int method2176(class128 arg0, class165 arg1, boolean arg2) {
        field5022++;
        if (!arg2) {
            method2175(-67, -72, -89);
        }
        if (arg0.field1639 != -1) {
            return arg0.field1639;
        }
        if (arg0.field1634 != -1) {
            class352 var3 = arg1.field2023.method397(arg0.field1634, (byte) 115);
            if (!var3.field4706) {
                return var3.field4713;
            }
        }
        return arg0.field1627;
    }
}
