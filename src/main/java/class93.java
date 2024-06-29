import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public abstract class class93 extends class129 {

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field1632 = new String[500];

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "[I")
    public static int[] field1633 = new int[1000];

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "Ljava/lang/String;")
    public static String field1637 = "Loaded defaults";

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field1636 = new String[500];

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "J")
    public static volatile long field1640 = 0L;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "Lwc;")
    public static class207 field1638;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method597(byte arg0);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III[II)V")
    public static final void method598(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        arg2--;
        field1631++;
        int var6 = arg1 - 1;
        int var5 = arg0 + var6;
        while (var5 > arg2) {
            int var7 = arg2 + 1;
            arg3[var7] = arg4;
            int var8 = var7 + 1;
            arg3[var8] = arg4;
            int var9 = var8 + 1;
            arg3[var9] = arg4;
            int var10 = var9 + 1;
            arg3[var10] = arg4;
            int var11 = var10 + 1;
            arg3[var11] = arg4;
            int var12 = var11 + 1;
            arg3[var12] = arg4;
            int var13 = var12 + 1;
            arg3[var13] = arg4;
            arg2 = var13 + 1;
            arg3[arg2] = arg4;
        }
        while (var6 > arg2) {
            arg2++;
            arg3[arg2] = arg4;
        }
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)V")
    public static final void method599(int arg0) {
        field1634++;
        class159.field2664.method53(true);
        if (arg0 != 0) {
            method600((class108) null, (byte) -63, (class108) null);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lvh;BLvh;)V")
    public static final void method600(class108 arg0, byte arg1, class108 arg2) {
        class267.field4318 = class153.method1049(arg0, (byte) -19, class182.field2970, 0, arg2);
        class45.field634 = (class64) class267.field4318;
        class112.field2018 = class153.method1049(arg0, (byte) -19, class110.field1989, 0, arg2);
        field1639++;
        if (arg1 > 94) {
            class290.field4636 = class153.method1049(arg0, (byte) -19, class239.field3918, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V")
    public static final void method601(boolean arg0) {
        class163.field2694.method53(true);
        field1630++;
        if (arg0) {
            field1635 = 8;
        }
    }

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "(I)Z")
    public abstract boolean method602(int arg0);

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(B)V")
    public static void method603(byte arg0) {
        field1636 = null;
        field1637 = null;
        field1633 = null;
        field1632 = null;
        int var1 = 89 / ((-arg0 - 13) / 59);
        field1638 = null;
    }
}
