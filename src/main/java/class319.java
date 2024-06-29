import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class319 {

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "[[I")
    public static int[][] field4408 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "[I")
    public static int[] field4411 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "Z")
    public static boolean field4412 = false;

    @OriginalMember(owner = "client!nq", name = "o", descriptor = "I")
    public static int field4419 = -1;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "I")
    public int field4405;

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "I")
    public int field4407;

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "I")
    public int field4413;

    @OriginalMember(owner = "client!nq", name = "j", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!nq", name = "k", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!nq", name = "l", descriptor = "I")
    public int field4416;

    @OriginalMember(owner = "client!nq", name = "m", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!nq", name = "n", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4406;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V", line = 7)
    public static final void method1805(int arg0) {
        if (arg0 != 2) {
            field4410 = 49;
        }
        class488.field7125.method1210(arg0 - 11616);
        field4415++;
        class332.field4528.method44(-114);
        if (class66.field911 != null) {
            class66.field911.method1678(8212, class474.field6924);
        }
        class407.field5639.method1317(arg0 ^ 0x79);
        class474.field6924.setBackground(Color.black);
        class482.field7070 = -1;
        class488.field7125 = class28.method197(true, class474.field6924);
        class332.field4528 = class335.method1855(true, class474.field6924, true);
        if (class66.field911 != null) {
            class66.field911.method1679(class474.field6924, -8794);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZBIII)Lqk;", line = 41)
    public static final class14 method1806(boolean arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= 124) {
            return null;
        }
        field4417++;
        class14 var5 = new class14();
        var5.field167 = arg3;
        var5.field166 = arg4;
        class269.field3690.method990((long) arg2, (byte) 80, var5);
        class188.method1126(10241, arg3);
        class295 var6 = class339.method1882((byte) 124, arg2);
        if (var6 != null) {
            class150.method952((byte) -20, var6);
        }
        if (class347.field4748 != null) {
            class150.method952((byte) -49, class347.field4748);
            class347.field4748 = null;
        }
        class17.method140((byte) -32);
        if (var6 != null) {
            class263.method1517((byte) -19, !arg0, var6);
        }
        if (!arg0) {
            class475.method2787(arg3);
        }
        if (!arg0 && field4419 != -1) {
            class368.method2131(1, field4419, false);
        }
        return var5;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)V", line = 82)
    public static void method1807(int arg0) {
        field4411 = null;
        field4406 = null;
        field4408 = null;
        if (arg0 != 9) {
            method1805(122);
        }
    }
}
