import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CNLXCYXM")
public class class4 {

    @OriginalMember(owner = "CNLXCYXM", name = "b", descriptor = "I")
    private int field548 = -732;

    @OriginalMember(owner = "CNLXCYXM", name = "c", descriptor = "B")
    private byte field549 = 2;

    @OriginalMember(owner = "CNLXCYXM", name = "k", descriptor = "Z")
    public boolean field557 = false;

    @OriginalMember(owner = "CNLXCYXM", name = "l", descriptor = "Z")
    public boolean field558 = true;

    @OriginalMember(owner = "CNLXCYXM", name = "n", descriptor = "Z")
    public boolean field560 = false;

    @OriginalMember(owner = "CNLXCYXM", name = "q", descriptor = "Z")
    public boolean field563 = false;

    @OriginalMember(owner = "CNLXCYXM", name = "r", descriptor = "I")
    public int field564 = -1;

    @OriginalMember(owner = "CNLXCYXM", name = "d", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "CNLXCYXM", name = "f", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "CNLXCYXM", name = "i", descriptor = "I")
    public int field555;

    @OriginalMember(owner = "CNLXCYXM", name = "j", descriptor = "I")
    public int field556;

    @OriginalMember(owner = "CNLXCYXM", name = "m", descriptor = "I")
    public int field559;

    @OriginalMember(owner = "CNLXCYXM", name = "o", descriptor = "I")
    public int field561;

    @OriginalMember(owner = "CNLXCYXM", name = "p", descriptor = "I")
    public int field562;

    @OriginalMember(owner = "CNLXCYXM", name = "h", descriptor = "Ljava/lang/String;")
    public String field554;

    @OriginalMember(owner = "CNLXCYXM", name = "a", descriptor = "Z")
    private static boolean field547;

    @OriginalMember(owner = "CNLXCYXM", name = "g", descriptor = "[I")
    public static int[] field553;

    @OriginalMember(owner = "CNLXCYXM", name = "e", descriptor = "[LCNLXCYXM;")
    public static class4[] field551;

    @OriginalMember(owner = "CNLXCYXM", name = "a", descriptor = "(LCXFTMSCH;B)V")
    public static void method162(class8 arg0, byte arg1) {
        if (arg1 != 51) {
            field547 = !field547;
        }
        class33 var2 = new class33(true, arg0.method176("varp.dat", null));
        field552 = 0;
        field550 = var2.method327();
        if (field551 == null) {
            field551 = new class4[field550];
        }
        if (field553 == null) {
            field553 = new int[field550];
        }
        for (int var3 = 0; var3 < field550; var3++) {
            if (field551[var3] == null) {
                field551[var3] = new class4();
            }
            field551[var3].method163((byte) 2, var3, var2);
        }
        if (var2.field944.length != var2.field945) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "CNLXCYXM", name = "a", descriptor = "(BILMQZHAILV;)V")
    public void method163(byte arg0, int arg1, class33 arg2) {
        if (this.field549 != arg0) {
            this.field548 = -58;
        }
        while (true) {
            int var4 = arg2.method325();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field555 = arg2.method325();
            } else if (var4 == 2) {
                this.field556 = arg2.method325();
            } else if (var4 == 3) {
                this.field557 = true;
                field553[field552++] = arg1;
            } else if (var4 == 4) {
                this.field558 = false;
            } else if (var4 == 5) {
                this.field559 = arg2.method327();
            } else if (var4 == 6) {
                this.field560 = true;
            } else if (var4 == 7) {
                this.field561 = arg2.method330();
            } else if (var4 == 8) {
                this.field562 = 1;
                this.field563 = true;
            } else if (var4 == 10) {
                this.field554 = arg2.method332();
            } else if (var4 == 11) {
                this.field563 = true;
            } else if (var4 == 12) {
                this.field564 = arg2.method330();
            } else if (var4 == 13) {
                this.field562 = 2;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
