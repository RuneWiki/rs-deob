import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public abstract class class425 extends class496 {

    @OriginalMember(owner = "client!u", name = "i", descriptor = "Lrb;")
    public static class352 field6067 = new class352(6, 0, 4, 2);

    @OriginalMember(owner = "client!u", name = "m", descriptor = "[Lso;")
    public static class256[] field6071 = new class256[6];

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public static int field6072 = 0;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field6069;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "Lcaa;")
    public static class51 field6073;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)I")
    public static final int method2513(byte arg0, int arg1) {
        field6068++;
        if (arg1 == 6406) {
            return 1;
        } else if (arg1 == 6409) {
            return 1;
        } else if (arg1 == 32841) {
            return 1;
        } else if (arg1 == 6410) {
            return 2;
        } else if (arg1 == 6407) {
            return 3;
        } else if (arg1 == 6408) {
            return 4;
        } else {
            int var2 = 16 % ((16 - arg0) / 43);
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public static final void method2514(byte arg0) {
        field6070++;
        int var1 = 19 % ((arg0 + 66) / 52);
        class604.field8896.method987(((float) class94.field1158.field287 * 0.1F + 0.7F) * 1.1523438F);
        class604.field8896.method1008(class228.field3347, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
        class604.field8896.method974(class239.field3492, -1, 256);
        class604.field8896.method962(class445.field6487);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public static void method2515(int arg0) {
        field6067 = null;
        field6073 = null;
        if (arg0 != 12911) {
            field6071 = null;
        }
        field6071 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZI)Z")
    public static final boolean method2516(boolean arg0, int arg1) {
        field6069++;
        if (arg0) {
            return arg1 == 2 || arg1 == 15 || arg1 == 1001 || arg1 == 18 || arg1 == 13;
        } else {
            return true;
        }
    }
}
