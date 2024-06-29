import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QMAVGSSV")
public class class47 {

    @OriginalMember(owner = "client!QMAVGSSV", name = "g", descriptor = "Z")
    public boolean field1410 = false;

    @OriginalMember(owner = "client!QMAVGSSV", name = "h", descriptor = "I")
    public int field1411 = -1;

    @OriginalMember(owner = "client!QMAVGSSV", name = "j", descriptor = "Z")
    public boolean field1413 = true;

    @OriginalMember(owner = "client!QMAVGSSV", name = "a", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!QMAVGSSV", name = "d", descriptor = "I")
    public int field1407;

    @OriginalMember(owner = "client!QMAVGSSV", name = "e", descriptor = "I")
    public int field1408;

    @OriginalMember(owner = "client!QMAVGSSV", name = "f", descriptor = "I")
    public int field1409;

    @OriginalMember(owner = "client!QMAVGSSV", name = "i", descriptor = "I")
    public int field1412;

    @OriginalMember(owner = "client!QMAVGSSV", name = "c", descriptor = "Ljava/lang/String;")
    public String field1406;

    @OriginalMember(owner = "client!QMAVGSSV", name = "b", descriptor = "[LQMAVGSSV;")
    public static class47[] field1405;

    @OriginalMember(owner = "client!QMAVGSSV", name = "a", descriptor = "(BLIEMHZJLX;)V")
    public static void method486(byte arg0, class23 arg1) {
        class38 var2 = new class38(0, arg1.method242("varbit.dat", null));
        field1404 = var2.method359();
        if (field1405 == null) {
            field1405 = new class47[field1404];
        }
        for (int var3 = 0; var3 < field1404; var3++) {
            if (field1405[var3] == null) {
                field1405[var3] = new class47();
            }
            field1405[var3].method487(var3, var2, (byte) 1);
            if (field1405[var3].field1410) {
                class51.field1440[field1405[var3].field1407].field1452 = true;
            }
        }
        if (arg0 != 8) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (var2.field1160.length != var2.field1161) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "client!QMAVGSSV", name = "a", descriptor = "(ILMVHXDWGI;B)V")
    public void method487(int arg0, class38 arg1, byte arg2) {
        if (arg2 != 1) {
            return;
        }
        boolean var4 = false;
        while (true) {
            int var5 = arg1.method357();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field1407 = arg1.method359();
                this.field1408 = arg1.method357();
                this.field1409 = arg1.method357();
            } else if (var5 == 10) {
                this.field1406 = arg1.method364();
            } else if (var5 == 2) {
                this.field1410 = true;
            } else if (var5 == 3) {
                this.field1411 = arg1.method362();
            } else if (var5 == 4) {
                this.field1412 = arg1.method362();
            } else if (var5 == 5) {
                this.field1413 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
