import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class146 {

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "Z")
    private static boolean field1845 = false;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    private static int field1847 = 0;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "Lrh;")
    private static class59 field1846 = new class59();

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLg;)V", line = 4)
    public static final synchronized void method989(byte arg0, class89 arg1) {
        if (field1845) {
            return;
        }
        if (arg0 != 89) {
            method993(38);
        }
        if (field1847 <= 0) {
            arg1.method80(false);
        } else {
            class515 var2 = new class515();
            var2.field7051 = arg1;
            field1846.method378(var2, arg0 + 31227);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)V", line = 28)
    public static final synchronized void method990(boolean arg0) {
        while (true) {
            class515 var1 = (class515) field1846.method368(83);
            if (var1 == null) {
                if (arg0) {
                    field1845 = true;
                    return;
                }
                return;
            }
            var1.field7051.method80(true);
            var1.method175(30604);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZI)V", line = 51)
    public static final synchronized void method991(boolean arg0, int arg1) {
        field1845 = arg0;
        if (arg1 < 34) {
            method992(18);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V", line = 71)
    public static final synchronized void method992(int arg0) {
        field1847--;
        if (field1847 == arg0) {
            method990(false);
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V", line = 84)
    public static final synchronized void method993(int arg0) {
        if (arg0 < -92) {
            field1847++;
        }
    }
}
