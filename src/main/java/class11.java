import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FXNZCBPL")
public class class11 {

    @OriginalMember(owner = "FXNZCBPL", name = "f", descriptor = "I")
    public int field701 = -1;

    @OriginalMember(owner = "FXNZCBPL", name = "h", descriptor = "[I")
    public int[] field703 = new int[6];

    @OriginalMember(owner = "FXNZCBPL", name = "i", descriptor = "[I")
    public int[] field704 = new int[6];

    @OriginalMember(owner = "FXNZCBPL", name = "j", descriptor = "I")
    public int field705 = 128;

    @OriginalMember(owner = "FXNZCBPL", name = "k", descriptor = "I")
    public int field706 = 128;

    @OriginalMember(owner = "FXNZCBPL", name = "o", descriptor = "LZPNSJLZE;")
    public static class69 field710 = new class69(30, false);

    @OriginalMember(owner = "FXNZCBPL", name = "a", descriptor = "I")
    private int field696;

    @OriginalMember(owner = "FXNZCBPL", name = "b", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "FXNZCBPL", name = "d", descriptor = "I")
    public int field699;

    @OriginalMember(owner = "FXNZCBPL", name = "e", descriptor = "I")
    public int field700;

    @OriginalMember(owner = "FXNZCBPL", name = "l", descriptor = "I")
    public int field707;

    @OriginalMember(owner = "FXNZCBPL", name = "m", descriptor = "I")
    public int field708;

    @OriginalMember(owner = "FXNZCBPL", name = "n", descriptor = "I")
    public int field709;

    @OriginalMember(owner = "FXNZCBPL", name = "g", descriptor = "LPNPNYEVW;")
    public class42 field702;

    @OriginalMember(owner = "FXNZCBPL", name = "c", descriptor = "[LFXNZCBPL;")
    public static class11[] field698;

    @OriginalMember(owner = "FXNZCBPL", name = "a", descriptor = "(ILINOFEYKQ;)V")
    public static void method200(int arg0, class21 arg1) {
        class35 var2 = new class35((byte) -103, arg1.method277("spotanim.dat", null));
        field697 = var2.method351();
        if (field698 == null) {
            field698 = new class11[field697];
        }
        for (int var3 = 0; var3 < field697; var3++) {
            if (field698[var3] == null) {
                field698[var3] = new class11();
            }
            field698[var3].field699 = var3;
            field698[var3].method201(false, var2);
        }
        if (arg0 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "FXNZCBPL", name = "a", descriptor = "(ZLNHEPCMLW;)V")
    public void method201(boolean arg0, class35 arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method349();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field700 = arg1.method351();
                } else if (var3 == 2) {
                    this.field701 = arg1.method351();
                    if (class42.field1219 != null) {
                        this.field702 = class42.field1219[this.field701];
                    }
                } else if (var3 == 4) {
                    this.field705 = arg1.method351();
                } else if (var3 == 5) {
                    this.field706 = arg1.method351();
                } else if (var3 == 6) {
                    this.field707 = arg1.method351();
                } else if (var3 == 7) {
                    this.field708 = arg1.method349();
                } else if (var3 == 8) {
                    this.field709 = arg1.method349();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field703[var3 - 40] = arg1.method351();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field704[var3 - 50] = arg1.method351();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "FXNZCBPL", name = "a", descriptor = "()LCSGBDGDY;")
    public class4 method202() {
        class4 var1 = (class4) field710.method586((long) this.field699);
        if (var1 != null) {
            return var1;
        }
        class4 var2 = class4.method160(this.field700);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field703[0] != 0) {
                var2.method174(this.field703[var3], this.field704[var3]);
            }
        }
        field710.method587(var2, this.field696, (long) this.field699);
        return var2;
    }
}
