import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ATZMJNZU")
public class class5 {

    @OriginalMember(owner = "client!ATZMJNZU", name = "j", descriptor = "Z")
    public boolean field34 = false;

    @OriginalMember(owner = "client!ATZMJNZU", name = "k", descriptor = "Z")
    public boolean field35 = true;

    @OriginalMember(owner = "client!ATZMJNZU", name = "m", descriptor = "Z")
    public boolean field37 = false;

    @OriginalMember(owner = "client!ATZMJNZU", name = "p", descriptor = "Z")
    public boolean field40 = false;

    @OriginalMember(owner = "client!ATZMJNZU", name = "q", descriptor = "I")
    public int field41 = -1;

    @OriginalMember(owner = "client!ATZMJNZU", name = "r", descriptor = "Z")
    public boolean field42 = true;

    @OriginalMember(owner = "client!ATZMJNZU", name = "a", descriptor = "I")
    private static int field25 = 536;

    @OriginalMember(owner = "client!ATZMJNZU", name = "b", descriptor = "I")
    private static int field26 = 3;

    @OriginalMember(owner = "client!ATZMJNZU", name = "c", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!ATZMJNZU", name = "e", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ATZMJNZU", name = "h", descriptor = "I")
    public int field32;

    @OriginalMember(owner = "client!ATZMJNZU", name = "i", descriptor = "I")
    public int field33;

    @OriginalMember(owner = "client!ATZMJNZU", name = "l", descriptor = "I")
    public int field36;

    @OriginalMember(owner = "client!ATZMJNZU", name = "n", descriptor = "I")
    public int field38;

    @OriginalMember(owner = "client!ATZMJNZU", name = "o", descriptor = "I")
    public int field39;

    @OriginalMember(owner = "client!ATZMJNZU", name = "g", descriptor = "Ljava/lang/String;")
    public String field31;

    @OriginalMember(owner = "client!ATZMJNZU", name = "f", descriptor = "[I")
    public static int[] field30;

    @OriginalMember(owner = "client!ATZMJNZU", name = "d", descriptor = "[LATZMJNZU;")
    public static class5[] field28;

    @OriginalMember(owner = "client!ATZMJNZU", name = "a", descriptor = "(ILUUIGNTAD;)V")
    public static void method15(int arg0, class59 arg1) {
        if (field26 != arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class10 var3 = new class10(arg1.method545("varp.dat", null), field25);
        field29 = 0;
        field27 = var3.method196();
        if (field28 == null) {
            field28 = new class5[field27];
        }
        if (field30 == null) {
            field30 = new int[field27];
        }
        for (int var4 = 0; var4 < field27; var4++) {
            if (field28[var4] == null) {
                field28[var4] = new class5();
            }
            field28[var4].method16(var3, 527, var4);
        }
        if (var3.field645.length != var3.field646) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "client!ATZMJNZU", name = "a", descriptor = "(LCMGGUSPR;II)V")
    public void method16(class10 arg0, int arg1, int arg2) {
        int var4 = 21 / arg1;
        while (true) {
            int var5 = arg0.method194();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field32 = arg0.method194();
            } else if (var5 == 2) {
                this.field33 = arg0.method194();
            } else if (var5 == 3) {
                this.field34 = true;
                field30[field29++] = arg2;
            } else if (var5 == 4) {
                this.field35 = false;
            } else if (var5 == 5) {
                this.field36 = arg0.method196();
            } else if (var5 == 6) {
                this.field37 = true;
            } else if (var5 == 7) {
                this.field38 = arg0.method199();
            } else if (var5 == 8) {
                this.field39 = 1;
                this.field40 = true;
            } else if (var5 == 10) {
                this.field31 = arg0.method201();
            } else if (var5 == 11) {
                this.field40 = true;
            } else if (var5 == 12) {
                this.field41 = arg0.method199();
            } else if (var5 == 13) {
                this.field39 = 2;
                this.field40 = true;
            } else if (var5 == 14) {
                this.field42 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
