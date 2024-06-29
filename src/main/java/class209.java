import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class209 {

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field3405 = 0;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "Ltl;")
    private static class59 field3407 = class85.method639("Connected to update server", 9588);

    @OriginalMember(owner = "client!og", name = "b", descriptor = "Ltl;")
    public static class59 field3404 = field3407;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "[Lel;")
    public static class3[] field3410 = new class3[27];

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "Lki;")
    public static class166 field3413;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V", line = 5)
    public static final void method1470(byte arg0) {
        field3403++;
        class43.method294();
        for (int var1 = 0; var1 < 4; var1++) {
            class41.field612[var1].method198(31407);
        }
        if (arg0 <= 61) {
            method1474(-118);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V", line = 39)
    public static void method1471(byte arg0) {
        if (arg0 != -16) {
            method1472(-28, -84);
        }
        field3407 = null;
        field3413 = null;
        field3404 = null;
        field3410 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)V", line = 54)
    public static final void method1472(int arg0, int arg1) {
        field3412++;
        if (arg0 == arg1 && !class254.field4219) {
            class19.method126((byte) 126);
        } else if (arg0 != -1 && (class211.field3454 != arg0 || !class160.method1143((byte) -123)) && class99.field1600 != 0 && !class254.field4219) {
            class212.method1487(true, 2, 0, arg0, false, class98.field1573, class99.field1600);
        }
        class211.field3454 = arg0;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)Lsk;", line = 85)
    public static final class201 method1473(int arg0, int arg1, int arg2) {
        class245 var3 = class120.field2010[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class201 var4 = var3.field4098;
            var3.field4098 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V", line = 101)
    public static final void method1474(int arg0) {
        class21.field282 = 0;
        class255.field4242 = 0;
        field3409++;
        class82.method625(1);
        if (arg0 != -1085) {
            method1473(-32, -10, -125);
        }
        class78.method610(-100);
        class30.method202((byte) -45);
        class133.method971((byte) 110);
        for (int var1 = 0; var1 < class21.field282; var1++) {
            int var2 = class38.field583[var1];
            if (class30.field420 != class211.field3438[var2].field1761) {
                if (class211.field3438[var2].field1679 > 0) {
                    class46.method323(class211.field3438[var2], true);
                }
                class211.field3438[var2] = null;
            }
        }
        if (class146.field2387 != class18.field236.field2787) {
            throw new RuntimeException("gpp1 pos:" + class18.field236.field2787 + " psize:" + class146.field2387);
        }
        for (int var3 = 0; var3 < class29.field385; var3++) {
            if (class211.field3438[class243.field4060[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class29.field385);
            }
        }
    }
}
