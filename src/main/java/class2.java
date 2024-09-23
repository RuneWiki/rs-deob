import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("AFWJXAMU")
public class class2 {

    @OriginalMember(owner = "AFWJXAMU", name = "a", descriptor = "Z")
    private boolean field10 = true;

    @OriginalMember(owner = "AFWJXAMU", name = "h", descriptor = "Z")
    public boolean field17 = false;

    @OriginalMember(owner = "AFWJXAMU", name = "i", descriptor = "I")
    public int field18 = -1;

    @OriginalMember(owner = "AFWJXAMU", name = "k", descriptor = "Z")
    public boolean field20 = true;

    @OriginalMember(owner = "AFWJXAMU", name = "b", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "AFWJXAMU", name = "e", descriptor = "I")
    public int field14;

    @OriginalMember(owner = "AFWJXAMU", name = "f", descriptor = "I")
    public int field15;

    @OriginalMember(owner = "AFWJXAMU", name = "g", descriptor = "I")
    public int field16;

    @OriginalMember(owner = "AFWJXAMU", name = "j", descriptor = "I")
    public int field19;

    @OriginalMember(owner = "AFWJXAMU", name = "d", descriptor = "Ljava/lang/String;")
    public String field13;

    @OriginalMember(owner = "AFWJXAMU", name = "c", descriptor = "[LAFWJXAMU;")
    public static class2[] field12;

    @OriginalMember(owner = "AFWJXAMU", name = "a", descriptor = "(LBYZSQZUF;Z)V")
    public static void method6(class7 arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        class24 var2 = new class24(0, arg0.method29("varbit.dat", null));
        field11 = var2.method240();
        if (field12 == null) {
            field12 = new class2[field11];
        }
        for (int var3 = 0; var3 < field11; var3++) {
            if (field12[var3] == null) {
                field12[var3] = new class2();
            }
            field12[var3].method7(var2, var3, 0);
            if (field12[var3].field17) {
                class52.field1350[field12[var3].field14].field1362 = true;
            }
        }
        if (var2.field831.length != var2.field832) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "AFWJXAMU", name = "a", descriptor = "(LIMUIZRAF;II)V")
    public void method7(class24 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.field10 = !this.field10;
        }
        while (true) {
            int var4 = arg0.method238();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field14 = arg0.method240();
                this.field15 = arg0.method238();
                this.field16 = arg0.method238();
            } else if (var4 == 10) {
                this.field13 = arg0.method245();
            } else if (var4 == 2) {
                this.field17 = true;
            } else if (var4 == 3) {
                this.field18 = arg0.method243();
            } else if (var4 == 4) {
                this.field19 = arg0.method243();
            } else if (var4 == 5) {
                this.field20 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
