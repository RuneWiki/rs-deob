import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class103 {

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public int field1443;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    private int field1440;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "Ljg;")
    private class309 field1435;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public int field1444;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "Ljj;")
    public static class103 field1441 = new class103(0, 3, class309.field4275);

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "Ljj;")
    public static class103 field1442 = new class103(1, 3, class309.field4275);

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "Ljj;")
    public static class103 field1445 = new class103(2, 4, class309.field4271);

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "Ljj;")
    public static class103 field1446 = new class103(3, 1, class309.field4275);

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "Ljj;")
    public static class103 field1447 = new class103(4, 2, class309.field4275);

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "Ljj;")
    public static class103 field1448 = new class103(5, 3, class309.field4275);

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "Ljj;")
    public static class103 field1449 = new class103(6, 4, class309.field4275);

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public static int field1450 = class55.method457(24266, 16);

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "[S")
    public static short[] field1451 = new short[256];

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "Llh;")
    public static class487 field1452 = new class487(82, 1);

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "Lwo;")
    public static class691 field1454;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lla;)V", line = 6)
    public static final void method752(class417 arg0) {
        class469.field6441 = arg0;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V", line = 9)
    public static final void method753(int arg0) {
        field1437++;
        int var1 = 0;
        for (int var2 = arg0; var2 < class401.field5620; var2++) {
            for (int var3 = 0; var3 < class257.field3508; var3++) {
                if (class605.method3401(-1, var2, true, class295.field4051, var1, var3)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "toString", descriptor = "()Ljava/lang/String;", line = 42)
    public final String toString() {
        field1439++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V", line = 54)
    public static void method754(byte arg0) {
        field1442 = null;
        field1447 = null;
        field1449 = null;
        field1448 = null;
        field1446 = null;
        field1451 = null;
        field1445 = null;
        field1452 = null;
        field1454 = null;
        if (arg0 == 72) {
            field1441 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)Ljj;", line = 74)
    public static final class103 method755(int arg0, byte arg1) {
        field1436++;
        if (arg1 < 58) {
            field1446 = null;
        }
        if (arg0 == 0) {
            return field1441;
        } else if (arg0 == 1) {
            return field1442;
        } else if (arg0 == 2) {
            return field1445;
        } else if (arg0 == 3) {
            return field1446;
        } else if (arg0 == 4) {
            return field1447;
        } else if (arg0 == 5) {
            return field1448;
        } else if (arg0 == 6) {
            return field1449;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(IILjg;)V", line = 154)
    private class103(int arg0, int arg1, class309 arg2) {
        this.field1443 = arg0;
        this.field1440 = arg1;
        this.field1435 = arg2;
        this.field1444 = this.field1435.field4267 * this.field1440;
        if (this.field1443 >= 16) {
            throw new RuntimeException();
        }
    }
}
