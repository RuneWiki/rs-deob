import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class42 {

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field572 = -1;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "[I")
    public static int[] field570 = new int[2];

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "Ljava/lang/String;")
    public static String field576 = "green:";

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field579 = 0;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field577 = 0;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "[[I")
    public static int[][] field573 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "Lvc;")
    public static class137 field581;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "Lwh;")
    public static class63 field583;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V", line = 5)
    public static void method340(boolean arg0) {
        field583 = null;
        field576 = null;
        if (!arg0) {
            field581 = null;
            field573 = (int[][]) null;
            field570 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)Lsj;", line = 24)
    public static final class205 method341(int arg0, int arg1) {
        field574++;
        class205 var2 = (class205) class4.field38.method1351((long) arg0, 63);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class39.field551.method1813(arg0, 34, true);
        class205 var4 = new class205();
        if (var3 != null) {
            var4.method1514(new class6(var3), -89, arg0);
        }
        class4.field38.method1347(var4, (long) arg0, (byte) -69);
        return arg1 < 25 ? (class205) null : var4;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)V", line = 60)
    public static final void method342(int arg0, int arg1) {
        if (class105.field1385 == null || arg1 > class105.field1385.length) {
            class105.field1385 = new int[arg1];
        }
        if (arg0 != -20247) {
            field581 = (class137) null;
        }
        field580++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZLdn;Lug;Lug;)V", line = 79)
    public static final void method343(boolean arg0, class228 arg1, class253 arg2, class253 arg3) {
        class318.field5032 = arg1;
        field571++;
        class279.field4297 = arg2;
        class60.field877 = arg3;
        if (class279.field4297 != null) {
            class257.field4061 = class279.field4297.method1826(0, 1);
        }
        if (class60.field877 != null) {
            class229.field3592 = class60.field877.method1826(0, 1);
        }
        if (arg0) {
            method344(-95, (byte) 89);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)V", line = 100)
    public static final void method344(int arg0, byte arg1) {
        if (arg1 < 102) {
            method340(true);
        }
        field578++;
        class34 var2 = class91.method656(arg0, -2, 10);
        var2.method306(13);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILug;)V", line = 118)
    public static final void method345(int arg0, class253 arg1) {
        class92.field1227 = arg1;
        field582++;
        if (arg0 >= -67) {
            field579 = -124;
        }
    }
}
