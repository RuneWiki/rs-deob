import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SXXYSOJW")
public class class52 {

    @OriginalMember(owner = "SXXYSOJW", name = "i", descriptor = "Z")
    public boolean field1356 = false;

    @OriginalMember(owner = "SXXYSOJW", name = "j", descriptor = "Z")
    public boolean field1357 = true;

    @OriginalMember(owner = "SXXYSOJW", name = "l", descriptor = "Z")
    public boolean field1359 = false;

    @OriginalMember(owner = "SXXYSOJW", name = "o", descriptor = "Z")
    public boolean field1362 = false;

    @OriginalMember(owner = "SXXYSOJW", name = "p", descriptor = "I")
    public int field1363 = -1;

    @OriginalMember(owner = "SXXYSOJW", name = "q", descriptor = "Z")
    public boolean field1364 = true;

    @OriginalMember(owner = "SXXYSOJW", name = "a", descriptor = "I")
    private int field1348;

    @OriginalMember(owner = "SXXYSOJW", name = "b", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "SXXYSOJW", name = "d", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "SXXYSOJW", name = "g", descriptor = "I")
    public int field1354;

    @OriginalMember(owner = "SXXYSOJW", name = "h", descriptor = "I")
    public int field1355;

    @OriginalMember(owner = "SXXYSOJW", name = "k", descriptor = "I")
    public int field1358;

    @OriginalMember(owner = "SXXYSOJW", name = "m", descriptor = "I")
    public int field1360;

    @OriginalMember(owner = "SXXYSOJW", name = "n", descriptor = "I")
    public int field1361;

    @OriginalMember(owner = "SXXYSOJW", name = "f", descriptor = "Ljava/lang/String;")
    public String field1353;

    @OriginalMember(owner = "SXXYSOJW", name = "e", descriptor = "[I")
    public static int[] field1352;

    @OriginalMember(owner = "SXXYSOJW", name = "c", descriptor = "[LSXXYSOJW;")
    public static class52[] field1350;

    @OriginalMember(owner = "SXXYSOJW", name = "a", descriptor = "(LBYZSQZUF;Z)V")
    public static void method462(class7 arg0, boolean arg1) {
        class24 var2 = new class24(0, arg0.method29("varp.dat", null));
        if (arg1) {
            return;
        }
        field1351 = 0;
        field1349 = var2.method240();
        if (field1350 == null) {
            field1350 = new class52[field1349];
        }
        if (field1352 == null) {
            field1352 = new int[field1349];
        }
        for (int var3 = 0; var3 < field1349; var3++) {
            if (field1350[var3] == null) {
                field1350[var3] = new class52();
            }
            field1350[var3].method463(var2, var3, 0);
        }
        if (var2.field831.length != var2.field832) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "SXXYSOJW", name = "a", descriptor = "(LIMUIZRAF;II)V")
    public void method463(class24 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.field1348 = 387;
        }
        while (true) {
            int var4 = arg0.method238();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1354 = arg0.method238();
            } else if (var4 == 2) {
                this.field1355 = arg0.method238();
            } else if (var4 == 3) {
                this.field1356 = true;
                field1352[field1351++] = arg1;
            } else if (var4 == 4) {
                this.field1357 = false;
            } else if (var4 == 5) {
                this.field1358 = arg0.method240();
            } else if (var4 == 6) {
                this.field1359 = true;
            } else if (var4 == 7) {
                this.field1360 = arg0.method243();
            } else if (var4 == 8) {
                this.field1361 = 1;
                this.field1362 = true;
            } else if (var4 == 10) {
                this.field1353 = arg0.method245();
            } else if (var4 == 11) {
                this.field1362 = true;
            } else if (var4 == 12) {
                this.field1363 = arg0.method243();
            } else if (var4 == 13) {
                this.field1361 = 2;
            } else if (var4 == 14) {
                this.field1364 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
