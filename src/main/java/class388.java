import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class388 {

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public int field5836;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "[I")
    public static int[] field5842 = new int[13];

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "Z")
    public static boolean field5841 = false;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "F")
    public static float field5837;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field5838;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "[[Lmq;")
    public static class350[][] field5835;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)V")
    public static final void method2394(int arg0, int arg1) {
        field5843++;
        class13.method87(0);
        class183.method1284((byte) -128);
        class236.method1554(true, arg1, 2);
        class478.method2855(class76.field1270, 9700, class151.field2407, class4.field109);
        class474.method2846(class4.field109, class151.field2407, 93);
        class526.method3129(true, class35.field675);
        class425.method2558((byte) -77);
        if (arg0 != 25) {
            method2395(98, -44, -1, (byte) 127, 66, 53, 120, -55, -37, -61);
        }
        class511.method3061(22843);
        if (class281.field4023 == 10) {
            class319.method2078((byte) -99, false);
        } else if (class281.field4023 == 30) {
            class244.method1590(25, (byte) 50);
        } else if (class281.field4023 == 5) {
            class386.method2390(class4.field109, class151.field2407, 5);
            return;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIBIIIIII)V")
    public static final void method2395(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = 25 % ((arg3 - 70) / 56);
        if (arg9 >= class315.field4754 && arg9 <= class156.field2455 && class315.field4754 <= arg6 && class156.field2455 >= arg6 && arg2 >= class315.field4754 && arg2 <= class156.field2455 && arg7 >= class315.field4754 && class156.field2455 >= arg7 && arg5 >= class70.field1213 && arg5 <= class389.field5859 && class70.field1213 <= arg0 && arg0 <= class389.field5859 && arg8 >= class70.field1213 && class389.field5859 >= arg8 && arg1 >= class70.field1213 && class389.field5859 >= arg1) {
            class28.method326(16417, arg2, arg8, arg0, arg4, arg1, arg5, arg9, arg7, arg6);
        } else {
            class196.method1359(124, arg8, arg0, arg9, arg5, arg4, arg6, arg7, arg1, arg2);
        }
        field5839++;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
    public static void method2396(int arg0) {
        if (arg0 == 13721) {
            field5835 = null;
            field5842 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5840++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(I)V")
    public class388(int arg0) {
        this.field5836 = arg0;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILcu;)Lbo;")
    public static final class511 method2397(int arg0, class145 arg1) {
        field5844++;
        class511 var2 = new class511();
        if (arg0 >= -106) {
            method2394(-65, 19);
        }
        var2.field7537 = arg1.method1069((byte) -77);
        var2.field7545 = class474.field7099.method1473(true, var2.field7537);
        return var2;
    }
}
