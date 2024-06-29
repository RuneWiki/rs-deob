import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TRINWBEO")
public class class58 {

    @OriginalMember(owner = "client!TRINWBEO", name = "h", descriptor = "Z")
    public boolean field1547 = false;

    @OriginalMember(owner = "client!TRINWBEO", name = "i", descriptor = "Z")
    public boolean field1548 = true;

    @OriginalMember(owner = "client!TRINWBEO", name = "k", descriptor = "Z")
    public boolean field1550 = false;

    @OriginalMember(owner = "client!TRINWBEO", name = "n", descriptor = "Z")
    public boolean field1553 = false;

    @OriginalMember(owner = "client!TRINWBEO", name = "o", descriptor = "I")
    public int field1554 = -1;

    @OriginalMember(owner = "client!TRINWBEO", name = "p", descriptor = "Z")
    public boolean field1555 = true;

    @OriginalMember(owner = "client!TRINWBEO", name = "a", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!TRINWBEO", name = "c", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!TRINWBEO", name = "f", descriptor = "I")
    public int field1545;

    @OriginalMember(owner = "client!TRINWBEO", name = "g", descriptor = "I")
    public int field1546;

    @OriginalMember(owner = "client!TRINWBEO", name = "j", descriptor = "I")
    public int field1549;

    @OriginalMember(owner = "client!TRINWBEO", name = "l", descriptor = "I")
    public int field1551;

    @OriginalMember(owner = "client!TRINWBEO", name = "m", descriptor = "I")
    public int field1552;

    @OriginalMember(owner = "client!TRINWBEO", name = "e", descriptor = "Ljava/lang/String;")
    public String field1544;

    @OriginalMember(owner = "client!TRINWBEO", name = "d", descriptor = "[I")
    public static int[] field1543;

    @OriginalMember(owner = "client!TRINWBEO", name = "b", descriptor = "[LTRINWBEO;")
    public static class58[] field1541;

    @OriginalMember(owner = "client!TRINWBEO", name = "a", descriptor = "(LAWEEREDT;I)V")
    public static void method499(class2 arg0, int arg1) {
        if (arg1 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class25 var3 = new class25(arg0.method14("varp.dat", null), 713);
        field1542 = 0;
        field1540 = var3.method247();
        if (field1541 == null) {
            field1541 = new class58[field1540];
        }
        if (field1543 == null) {
            field1543 = new int[field1540];
        }
        for (int var4 = 0; var4 < field1540; var4++) {
            if (field1541[var4] == null) {
                field1541[var4] = new class58();
            }
            field1541[var4].method500(var3, var4, -224);
        }
        if (var3.field836.length != var3.field837) {
            System.out.println("varptype load mismatch");
        } else if (class71.field1729) {
        }
    }

    @OriginalMember(owner = "client!TRINWBEO", name = "a", descriptor = "(LIUVBENCV;II)V")
    public void method500(class25 arg0, int arg1, int arg2) {
        if (arg2 >= 0) {
            return;
        }
        while (true) {
            int var4 = arg0.method245();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1545 = arg0.method245();
            } else if (var4 == 2) {
                this.field1546 = arg0.method245();
            } else if (var4 == 3) {
                this.field1547 = true;
                field1543[field1542++] = arg1;
            } else if (var4 == 4) {
                this.field1548 = false;
            } else if (var4 == 5) {
                this.field1549 = arg0.method247();
            } else if (var4 == 6) {
                this.field1550 = true;
            } else if (var4 == 7) {
                this.field1551 = arg0.method250();
            } else if (var4 == 8) {
                this.field1552 = 1;
                this.field1553 = true;
            } else if (var4 == 10) {
                this.field1544 = arg0.method252();
            } else if (var4 == 11) {
                this.field1553 = true;
            } else if (var4 == 12) {
                this.field1554 = arg0.method250();
            } else if (var4 == 13) {
                this.field1552 = 2;
                this.field1553 = true;
            } else if (var4 == 14) {
                this.field1555 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
