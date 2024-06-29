import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RIRWXSOT")
public class class51 {

    @OriginalMember(owner = "client!RIRWXSOT", name = "h", descriptor = "Z")
    public boolean field1446 = false;

    @OriginalMember(owner = "client!RIRWXSOT", name = "i", descriptor = "Z")
    public boolean field1447 = true;

    @OriginalMember(owner = "client!RIRWXSOT", name = "k", descriptor = "Z")
    public boolean field1449 = false;

    @OriginalMember(owner = "client!RIRWXSOT", name = "n", descriptor = "Z")
    public boolean field1452 = false;

    @OriginalMember(owner = "client!RIRWXSOT", name = "o", descriptor = "I")
    public int field1453 = -1;

    @OriginalMember(owner = "client!RIRWXSOT", name = "p", descriptor = "Z")
    public boolean field1454 = true;

    @OriginalMember(owner = "client!RIRWXSOT", name = "a", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!RIRWXSOT", name = "c", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!RIRWXSOT", name = "f", descriptor = "I")
    public int field1444;

    @OriginalMember(owner = "client!RIRWXSOT", name = "g", descriptor = "I")
    public int field1445;

    @OriginalMember(owner = "client!RIRWXSOT", name = "j", descriptor = "I")
    public int field1448;

    @OriginalMember(owner = "client!RIRWXSOT", name = "l", descriptor = "I")
    public int field1450;

    @OriginalMember(owner = "client!RIRWXSOT", name = "m", descriptor = "I")
    public int field1451;

    @OriginalMember(owner = "client!RIRWXSOT", name = "e", descriptor = "Ljava/lang/String;")
    public String field1443;

    @OriginalMember(owner = "client!RIRWXSOT", name = "d", descriptor = "[I")
    public static int[] field1442;

    @OriginalMember(owner = "client!RIRWXSOT", name = "b", descriptor = "[LRIRWXSOT;")
    public static class51[] field1440;

    @OriginalMember(owner = "client!RIRWXSOT", name = "a", descriptor = "(BLIEMHZJLX;)V")
    public static void method493(byte arg0, class23 arg1) {
        class38 var2 = new class38(0, arg1.method242("varp.dat", null));
        field1441 = 0;
        field1439 = var2.method359();
        if (arg0 == 8) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (field1440 == null) {
            field1440 = new class51[field1439];
        }
        if (field1442 == null) {
            field1442 = new int[field1439];
        }
        for (int var5 = 0; var5 < field1439; var5++) {
            if (field1440[var5] == null) {
                field1440[var5] = new class51();
            }
            field1440[var5].method494(var5, var2, (byte) 1);
        }
        if (var2.field1160.length != var2.field1161) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "client!RIRWXSOT", name = "a", descriptor = "(ILMVHXDWGI;B)V")
    public void method494(int arg0, class38 arg1, byte arg2) {
        if (arg2 != 1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg1.method357();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field1444 = arg1.method357();
            } else if (var5 == 2) {
                this.field1445 = arg1.method357();
            } else if (var5 == 3) {
                this.field1446 = true;
                field1442[field1441++] = arg0;
            } else if (var5 == 4) {
                this.field1447 = false;
            } else if (var5 == 5) {
                this.field1448 = arg1.method359();
            } else if (var5 == 6) {
                this.field1449 = true;
            } else if (var5 == 7) {
                this.field1450 = arg1.method362();
            } else if (var5 == 8) {
                this.field1451 = 1;
                this.field1452 = true;
            } else if (var5 == 10) {
                this.field1443 = arg1.method364();
            } else if (var5 == 11) {
                this.field1452 = true;
            } else if (var5 == 12) {
                this.field1453 = arg1.method362();
            } else if (var5 == 13) {
                this.field1451 = 2;
                this.field1452 = true;
            } else if (var5 == 14) {
                this.field1454 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
