import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DPQEBGAZ")
public class class7 {

    @OriginalMember(owner = "client!DPQEBGAZ", name = "h", descriptor = "Z")
    public boolean field615 = false;

    @OriginalMember(owner = "client!DPQEBGAZ", name = "i", descriptor = "I")
    public int field616 = -1;

    @OriginalMember(owner = "client!DPQEBGAZ", name = "k", descriptor = "Z")
    public boolean field618 = true;

    @OriginalMember(owner = "client!DPQEBGAZ", name = "a", descriptor = "I")
    private static int field608;

    @OriginalMember(owner = "client!DPQEBGAZ", name = "b", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!DPQEBGAZ", name = "e", descriptor = "I")
    public int field612;

    @OriginalMember(owner = "client!DPQEBGAZ", name = "f", descriptor = "I")
    public int field613;

    @OriginalMember(owner = "client!DPQEBGAZ", name = "g", descriptor = "I")
    public int field614;

    @OriginalMember(owner = "client!DPQEBGAZ", name = "j", descriptor = "I")
    public int field617;

    @OriginalMember(owner = "client!DPQEBGAZ", name = "d", descriptor = "Ljava/lang/String;")
    public String field611;

    @OriginalMember(owner = "client!DPQEBGAZ", name = "c", descriptor = "[LDPQEBGAZ;")
    public static class7[] field610;

    @OriginalMember(owner = "client!DPQEBGAZ", name = "a", descriptor = "(BLESUFCMYV;)V")
    public static void method202(byte arg0, class11 arg1) {
        class53 var2 = new class53(arg1.method205("varbit.dat", null), (byte) -17);
        if (arg0 == 6) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        field609 = var2.method457();
        if (field610 == null) {
            field610 = new class7[field609];
        }
        for (int var5 = 0; var5 < field609; var5++) {
            if (field610[var5] == null) {
                field610[var5] = new class7();
            }
            field610[var5].method203(var2, var5, field608);
            if (field610[var5].field615) {
                class60.field1597[field610[var5].field612].field1609 = true;
            }
        }
        if (var2.field1538.length != var2.field1539) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "client!DPQEBGAZ", name = "a", descriptor = "(LRGCGKKUR;II)V")
    public void method203(class53 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            return;
        }
        while (true) {
            int var4 = arg0.method455();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field612 = arg0.method457();
                this.field613 = arg0.method455();
                this.field614 = arg0.method455();
            } else if (var4 == 10) {
                this.field611 = arg0.method462();
            } else if (var4 == 2) {
                this.field615 = true;
            } else if (var4 == 3) {
                this.field616 = arg0.method460();
            } else if (var4 == 4) {
                this.field617 = arg0.method460();
            } else if (var4 == 5) {
                this.field618 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
