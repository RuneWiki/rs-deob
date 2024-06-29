import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class2 extends class45 {

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "Ljava/lang/String;")
    public String field8;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field7 = -1;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "Ljl;")
    public static class332 field10 = new class332(20);

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "[Z")
    public static boolean[] field13 = new boolean[100];

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "Ljava/lang/String;")
    public static String field15 = "Loaded world list data";

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
    public static int field14 = 0;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "Lth;")
    public static class57 field9;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjava/util/Random;I)I", line = 8)
    public static final int method4(int arg0, Random arg1, int arg2) {
        field6++;
        int var3 = 90 / ((34 - arg2) / 60);
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class157.method1217(47, arg0)) {
            return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var4 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
            int var5;
            do {
                var5 = arg1.nextInt();
            } while (var4 <= var5);
            return class112.method847(var5, (byte) -36, arg0);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIII)V", line = 40)
    public static final void method5(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field11++;
        if (arg5 <= 84) {
            return;
        }
        if (arg1 >= class74.field1269 && class355.field5640 >= arg0 && arg4 >= class296.field4758 && class273.field4522 >= arg2) {
            if (arg3 == 1) {
                class277.method2056(arg4, arg6, -15065, arg0, arg1, arg2);
            } else {
                class189.method1494(65535, arg0, arg2, arg4, arg3, arg1, arg6);
            }
        } else if (arg3 == 1) {
            class131.method1004(arg2, 118, arg0, arg4, arg6, arg1);
        } else {
            class253.method1958(arg4, 114, arg1, arg3, arg0, arg2, arg6);
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(B)V", line = 72)
    public static void method6(byte arg0) {
        field10 = null;
        if (arg0 != -30) {
            method4(47, (Random) null, 50);
        }
        field13 = null;
        field9 = null;
        field15 = null;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V", line = 96)
    public class2() {
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZI)V", line = 100)
    public static final void method7(boolean arg0, int arg1) {
        field12++;
        if (arg1 <= 89) {
            field9 = (class57) null;
        }
        class167.method1305(class134.field2250, class327.field5213, class35.field518, class307.field4901);
        class167.method1299(class152.field2410, class189.field3041, arg0);
        class167.method1297((float) class122.field2096, (float) class111.field1811, (float) class98.field1634);
        class167.method1304();
        class276.field4562 = class130.field2203;
        class276.field4559 = class274.field4542;
        class276.field4552 = class260.field4384;
        class236.field3918 = class324.field5155;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 126)
    public class2(String arg0, int arg1) {
        this.field8 = arg0;
    }
}
