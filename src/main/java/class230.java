import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class230 extends class188 {

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3822 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "Lph;")
    public static class229 field3826 = class266.method1858("null", 0);

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "[I")
    public static int[] field3825 = new int[25];

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "Lce;")
    public static class209 field3820;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "Lph;")
    public static class229 field3828;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "[Lph;")
    public static class229[] field3827;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "[[Z")
    public static boolean[][] field3819;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IJ)V", line = 16)
    public static final void method1647(int arg0, long arg1) {
        if (arg0 != 1471) {
            return;
        }
        field3817++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class103.field1752 < 100 || class26.field360) || class103.field1752 >= 200) {
            class205.method1439(class196.field3277, true, 0, class134.field2172);
            return;
        }
        class229 var3 = class100.method767((byte) 105, arg1).method1628(-32);
        for (int var4 = 0; var4 < class103.field1752; var4++) {
            if (class98.field1658[var4] == arg1) {
                class205.method1439(class248.method1746(8528, new class229[] { var3, class203.field3353 }), true, 0, class134.field2172);
                return;
            }
        }
        for (int var5 = 0; var5 < class216.field3555; var5++) {
            if (class282.field4682[var5] == arg1) {
                class205.method1439(class248.method1746(8528, new class229[] { class85.field1466, var3, class105.field1785 }), true, 0, class134.field2172);
                return;
            }
        }
        if (var3.method1618(false, field3820.field3463)) {
            class205.method1439(class118.field1990, true, 0, class134.field2172);
            return;
        }
        class133.field2170[class103.field1752] = var3;
        class98.field1658[class103.field1752] = arg1;
        class320.field5404++;
        class70.field1162[class103.field1752] = 0;
        class178.field2937[class103.field1752] = class134.field2172;
        class52.field739[class103.field1752] = 0;
        class110.field1859[class103.field1752] = false;
        class103.field1752++;
        class198.field3295 = class129.field2125;
        class121.field2033.method37(79, 26);
        class121.field2033.method1208((byte) -6, arg1);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)Lmb;", line = 109)
    public static final class145 method1648(int arg0, int arg1) {
        int var2 = 10 / ((arg0 - 20) / 34);
        field3818++;
        class145 var3 = (class145) class208.field3419.method1413((long) arg1, true);
        if (var3 != null) {
            return var3;
        }
        class145 var4 = class255.method1778(-15138, false, class7.field95, class116.field1956, arg1);
        if (var4 != null) {
            class208.field3419.method1419((long) arg1, 5216, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V", line = 127)
    public static void method1649(byte arg0) {
        field3820 = null;
        field3822 = null;
        if (arg0 <= 101) {
            method1647(106, 54L);
        }
        field3828 = null;
        field3819 = (boolean[][]) null;
        field3827 = null;
        field3826 = null;
        field3825 = null;
    }
}
