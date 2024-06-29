import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public abstract class class83 extends class78 {

    @OriginalMember(owner = "client!mt", name = "A", descriptor = "S")
    public short field1011;

    @OriginalMember(owner = "client!mt", name = "m", descriptor = "S")
    public short field997;

    @OriginalMember(owner = "client!mt", name = "y", descriptor = "B")
    public byte field1009;

    @OriginalMember(owner = "client!mt", name = "q", descriptor = "I")
    public int field1001;

    @OriginalMember(owner = "client!mt", name = "u", descriptor = "I")
    public int field1005;

    @OriginalMember(owner = "client!mt", name = "o", descriptor = "S")
    public short field999;

    @OriginalMember(owner = "client!mt", name = "t", descriptor = "S")
    public short field1004;

    @OriginalMember(owner = "client!mt", name = "j", descriptor = "B")
    public byte field994;

    @OriginalMember(owner = "client!mt", name = "p", descriptor = "Z")
    public boolean field1000;

    @OriginalMember(owner = "client!mt", name = "x", descriptor = "I")
    public int field1008;

    @OriginalMember(owner = "client!mt", name = "r", descriptor = "Lec;")
    public static class40 field1002 = new class40("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!mt", name = "z", descriptor = "Z")
    public static boolean field1010 = true;

    @OriginalMember(owner = "client!mt", name = "v", descriptor = "Lpn;")
    public static class72 field1006 = new class72(13, 8);

    @OriginalMember(owner = "client!mt", name = "w", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!mt", name = "C", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!mt", name = "i", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!mt", name = "k", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!mt", name = "l", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!mt", name = "n", descriptor = "I")
    public int field998;

    @OriginalMember(owner = "client!mt", name = "s", descriptor = "Lbd;")
    public static class327 field1003;

    @OriginalMember(owner = "client!mt", name = "B", descriptor = "Lg;")
    public static class470 field1012;

    @OriginalMember(owner = "client!mt", name = "D", descriptor = "[Lrg;")
    public static class395[] field1014;

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(Z)V", line = 16)
    public static void method419(boolean arg0) {
        field1006 = null;
        field1002 = null;
        field1014 = null;
        field1003 = null;
        if (arg0) {
            field1012 = null;
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIIII)V", line = 33)
    public static final void method420(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field996++;
        if (arg3 != 13) {
            method419(true);
        }
        if (arg0 == arg5) {
            class73.method376(arg4, -20535, arg5, arg2, arg1);
        } else if (arg1 - arg5 >= class75.field912 && class453.field6396 >= (arg1 + arg5) && (arg4 - arg0) >= class357.field5123 && (arg4 + arg0) <= class328.field4729) {
            class484.method2857(46, arg5, arg4, arg0, arg2, arg1);
        } else {
            class35.method179(arg0, arg2, arg4, arg5, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(ILvt;)Lqj;", line = 60)
    public static final class257 method421(int arg0, class179 arg1) {
        field993++;
        if (arg0 != 8) {
            field1010 = true;
        }
        class257 var2 = new class257();
        var2.field3713 = arg1.method916(21933);
        var2.field3717 = class276.method1683(arg0 ^ 0x521A, var2.field3713);
        return var2;
    }

    @OriginalMember(owner = "client!mt", name = "h", descriptor = "(I)V", line = 79)
    public void method422(int arg0) {
        int var2 = -65 % ((arg0 + 29) / 39);
        field1007++;
    }

    @OriginalMember(owner = "client!mt", name = "i", descriptor = "(I)V", line = 90)
    public static final void method423(int arg0) {
        class269.field3856.method236(3);
        field995++;
        if (arg0 != 8) {
            field1013 = 84;
        }
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(IIIIIIIIZB)V", line = 102)
    public class83(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field1011 = (short) arg5;
        this.field997 = (short) arg7;
        this.field1009 = arg9;
        this.field1001 = (short) arg2;
        this.field1005 = (short) arg3;
        this.field999 = (short) arg4;
        this.field1004 = (short) arg6;
        this.field994 = (byte) arg0;
        this.field1000 = arg8;
        this.field1008 = (short) arg1;
    }

    @OriginalMember(owner = "client!mt", name = "g", descriptor = "(I)I")
    public abstract int method17(int arg0);
}
