import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BKJQHSVH")
public class class6 {

    @OriginalMember(owner = "BKJQHSVH", name = "g", descriptor = "I")
    public int field64 = -1;

    @OriginalMember(owner = "BKJQHSVH", name = "i", descriptor = "[I")
    public int[] field66 = new int[6];

    @OriginalMember(owner = "BKJQHSVH", name = "j", descriptor = "[I")
    public int[] field67 = new int[6];

    @OriginalMember(owner = "BKJQHSVH", name = "k", descriptor = "I")
    public int field68 = 128;

    @OriginalMember(owner = "BKJQHSVH", name = "l", descriptor = "I")
    public int field69 = 128;

    @OriginalMember(owner = "BKJQHSVH", name = "a", descriptor = "Z")
    private static boolean field58 = true;

    @OriginalMember(owner = "BKJQHSVH", name = "b", descriptor = "Z")
    private static boolean field59 = true;

    @OriginalMember(owner = "BKJQHSVH", name = "p", descriptor = "LDMOAMUBS;")
    public static class14 field73 = new class14(30, true);

    @OriginalMember(owner = "BKJQHSVH", name = "c", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "BKJQHSVH", name = "e", descriptor = "I")
    public int field62;

    @OriginalMember(owner = "BKJQHSVH", name = "f", descriptor = "I")
    public int field63;

    @OriginalMember(owner = "BKJQHSVH", name = "m", descriptor = "I")
    public int field70;

    @OriginalMember(owner = "BKJQHSVH", name = "n", descriptor = "I")
    public int field71;

    @OriginalMember(owner = "BKJQHSVH", name = "o", descriptor = "I")
    public int field72;

    @OriginalMember(owner = "BKJQHSVH", name = "h", descriptor = "LMJVHTYCA;")
    public class45 field65;

    @OriginalMember(owner = "BKJQHSVH", name = "d", descriptor = "[LBKJQHSVH;")
    public static class6[] field61;

    @OriginalMember(owner = "BKJQHSVH", name = "a", descriptor = "(ZLMJLXHQTQ;)V")
    public static void method14(boolean arg0, class44 arg1) {
        class69 var2 = new class69(arg1.method317("spotanim.dat", null), -82);
        if (!arg0) {
            field59 = !field59;
        }
        field60 = var2.method467();
        if (field61 == null) {
            field61 = new class6[field60];
        }
        for (int var3 = 0; var3 < field60; var3++) {
            if (field61[var3] == null) {
                field61[var3] = new class6();
            }
            field61[var3].field62 = var3;
            field61[var3].method15(field58, var2);
        }
    }

    @OriginalMember(owner = "BKJQHSVH", name = "a", descriptor = "(ZLXGRGMPUQ;)V")
    public void method15(boolean arg0, class69 arg1) {
        if (!arg0) {
            field58 = !field58;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method465();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field63 = arg1.method467();
                } else if (var3 == 2) {
                    this.field64 = arg1.method467();
                    if (class45.field1187 != null) {
                        this.field65 = class45.field1187[this.field64];
                    }
                } else if (var3 == 4) {
                    this.field68 = arg1.method467();
                } else if (var3 == 5) {
                    this.field69 = arg1.method467();
                } else if (var3 == 6) {
                    this.field70 = arg1.method467();
                } else if (var3 == 7) {
                    this.field71 = arg1.method465();
                } else if (var3 == 8) {
                    this.field72 = arg1.method465();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field66[var3 - 40] = arg1.method467();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field67[var3 - 50] = arg1.method467();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "BKJQHSVH", name = "a", descriptor = "()LVYUQHOMO;")
    public class66 method16() {
        class66 var1 = (class66) field73.method193((long) this.field62);
        if (var1 != null) {
            return var1;
        }
        class66 var2 = class66.method407(this.field63);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field66[0] != 0) {
                var2.method421(this.field66[var3], this.field67[var3]);
            }
        }
        field73.method194((long) this.field62, (byte) -80, var2);
        return var2;
    }
}
