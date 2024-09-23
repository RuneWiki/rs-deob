import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QOKQYKHB")
public class class40 {

    @OriginalMember(owner = "QOKQYKHB", name = "i", descriptor = "Z")
    public boolean field1287 = false;

    @OriginalMember(owner = "QOKQYKHB", name = "j", descriptor = "Z")
    public boolean field1288 = true;

    @OriginalMember(owner = "QOKQYKHB", name = "l", descriptor = "Z")
    public boolean field1290 = false;

    @OriginalMember(owner = "QOKQYKHB", name = "o", descriptor = "Z")
    public boolean field1293 = false;

    @OriginalMember(owner = "QOKQYKHB", name = "p", descriptor = "I")
    public int field1294 = -1;

    @OriginalMember(owner = "QOKQYKHB", name = "a", descriptor = "I")
    private static int field1279 = -302;

    @OriginalMember(owner = "QOKQYKHB", name = "b", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "QOKQYKHB", name = "d", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "QOKQYKHB", name = "g", descriptor = "I")
    public int field1285;

    @OriginalMember(owner = "QOKQYKHB", name = "h", descriptor = "I")
    public int field1286;

    @OriginalMember(owner = "QOKQYKHB", name = "k", descriptor = "I")
    public int field1289;

    @OriginalMember(owner = "QOKQYKHB", name = "m", descriptor = "I")
    public int field1291;

    @OriginalMember(owner = "QOKQYKHB", name = "n", descriptor = "I")
    public int field1292;

    @OriginalMember(owner = "QOKQYKHB", name = "f", descriptor = "Ljava/lang/String;")
    public String field1284;

    @OriginalMember(owner = "QOKQYKHB", name = "e", descriptor = "[I")
    public static int[] field1283;

    @OriginalMember(owner = "QOKQYKHB", name = "c", descriptor = "[LQOKQYKHB;")
    public static class40[] field1281;

    @OriginalMember(owner = "QOKQYKHB", name = "a", descriptor = "(LLYZBHNJP;I)V")
    public static void method377(class31 arg0, int arg1) {
        class69 var2 = new class69(arg0.method290("varp.dat", null), field1279);
        field1282 = 0;
        field1280 = var2.method549();
        if (arg1 != 0) {
            return;
        }
        if (field1281 == null) {
            field1281 = new class40[field1280];
        }
        if (field1283 == null) {
            field1283 = new int[field1280];
        }
        for (int var3 = 0; var3 < field1280; var3++) {
            if (field1281[var3] == null) {
                field1281[var3] = new class40();
            }
            field1281[var3].method378(var3, 8588, var2);
        }
        if (var2.field1699.length != var2.field1700) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "QOKQYKHB", name = "a", descriptor = "(IILZOMNSJJM;)V")
    public void method378(int arg0, int arg1, class69 arg2) {
        if (arg1 != 8588) {
            return;
        }
        while (true) {
            int var4 = arg2.method547();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1285 = arg2.method547();
            } else if (var4 == 2) {
                this.field1286 = arg2.method547();
            } else if (var4 == 3) {
                this.field1287 = true;
                field1283[field1282++] = arg0;
            } else if (var4 == 4) {
                this.field1288 = false;
            } else if (var4 == 5) {
                this.field1289 = arg2.method549();
            } else if (var4 == 6) {
                this.field1290 = true;
            } else if (var4 == 7) {
                this.field1291 = arg2.method552();
            } else if (var4 == 8) {
                this.field1292 = 1;
                this.field1293 = true;
            } else if (var4 == 10) {
                this.field1284 = arg2.method554();
            } else if (var4 == 11) {
                this.field1293 = true;
            } else if (var4 == 12) {
                this.field1294 = arg2.method552();
            } else if (var4 == 13) {
                this.field1292 = 2;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
