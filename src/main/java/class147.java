import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class147 extends class513 {

    @OriginalMember(owner = "client!ada", name = "j", descriptor = "I")
    public int field1795;

    @OriginalMember(owner = "client!ada", name = "l", descriptor = "I")
    public int field1797;

    @OriginalMember(owner = "client!ada", name = "m", descriptor = "I")
    public static int field1798 = -1;

    @OriginalMember(owner = "client!ada", name = "q", descriptor = "[[I")
    public static int[][] field1802 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!ada", name = "s", descriptor = "[I")
    public static int[] field1804 = new int[14];

    @OriginalMember(owner = "client!ada", name = "r", descriptor = "[[I")
    public static int[][] field1803 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!ada", name = "n", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!ada", name = "o", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!ada", name = "k", descriptor = "Lhca;")
    public static class455 field1796;

    @OriginalMember(owner = "client!ada", name = "p", descriptor = "[Lte;")
    public static class568[] field1801;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)V", line = 9)
    public static void method943(int arg0) {
        field1804 = null;
        field1796 = null;
        field1801 = null;
        if (arg0 >= 82) {
            field1802 = null;
            field1803 = null;
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(JI)V", line = 28)
    public static final void method944(long arg0, int arg1) {
        if (class281.field3808 != null) {
            if (class586.field8507 == 1 || class586.field8507 == 5) {
                class363.method2075((byte) 26, arg0);
            } else if (class586.field8507 == 4) {
                class405.method2452(-127, arg0);
            }
        }
        field1799++;
        class537.method3155((byte) -120, (long) class543.field7882, class68.field1045);
        if (class127.field1619 != arg1) {
            class591.method3430(arg1 + 71, class127.field1619);
        }
        for (int var3 = 0; var3 < class643.field9183; var3++) {
            if (class89.field1253[var3]) {
                class325.field4339[var3] = true;
            }
            class404.field5699[var3] = class89.field1253[var3];
            class89.field1253[var3] = false;
        }
        class353.field4716 = class543.field7882;
        if (class127.field1619 != -1) {
            class643.field9183 = 0;
            class336.method1938(~arg1);
        }
        class68.field1045.method249();
        class286.method1707(-95, class68.field1045);
        int var4 = class686.method3885((byte) -108);
        if (var4 == -1) {
            var4 = class10.field99;
        }
        if (var4 == -1) {
            var4 = class208.field2540;
        }
        class257.method1565(-1, var4);
        int var5 = class206.field2472.method1284((byte) -124) << 8;
        class558.method3259(class456.field6422, class206.field2472.field531 + var5, class206.field2472.field530 + var5, class206.field2472.field532, -85);
        class456.field6422 = 0;
    }

    @OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(II)V", line = 87)
    public class147(int arg0, int arg1) {
        this.field1795 = arg0;
        this.field1797 = arg1;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IZI)Z", line = 101)
    public static final boolean method945(int arg0, boolean arg1, int arg2) {
        field1800++;
        if (arg1) {
            method944(-119L, -125);
        }
        return class467.method2745(arg2, (byte) -74, arg0) || class681.method3861(arg0, arg2, (byte) -106);
    }
}
