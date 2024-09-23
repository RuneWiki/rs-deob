import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BRGDZOWQ")
public class class4 {

    @OriginalMember(owner = "BRGDZOWQ", name = "a", descriptor = "I")
    private int field12 = 22486;

    @OriginalMember(owner = "BRGDZOWQ", name = "g", descriptor = "I")
    public int field18 = -1;

    @OriginalMember(owner = "BRGDZOWQ", name = "i", descriptor = "[I")
    public int[] field20 = new int[6];

    @OriginalMember(owner = "BRGDZOWQ", name = "j", descriptor = "[I")
    public int[] field21 = new int[6];

    @OriginalMember(owner = "BRGDZOWQ", name = "k", descriptor = "I")
    public int field22 = 128;

    @OriginalMember(owner = "BRGDZOWQ", name = "l", descriptor = "I")
    public int field23 = 128;

    @OriginalMember(owner = "BRGDZOWQ", name = "p", descriptor = "LLSQNLJTA;")
    public static class42 field27 = new class42(30, (byte) 17);

    @OriginalMember(owner = "BRGDZOWQ", name = "b", descriptor = "I")
    private int field13;

    @OriginalMember(owner = "BRGDZOWQ", name = "c", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "BRGDZOWQ", name = "e", descriptor = "I")
    public int field16;

    @OriginalMember(owner = "BRGDZOWQ", name = "f", descriptor = "I")
    public int field17;

    @OriginalMember(owner = "BRGDZOWQ", name = "m", descriptor = "I")
    public int field24;

    @OriginalMember(owner = "BRGDZOWQ", name = "n", descriptor = "I")
    public int field25;

    @OriginalMember(owner = "BRGDZOWQ", name = "o", descriptor = "I")
    public int field26;

    @OriginalMember(owner = "BRGDZOWQ", name = "h", descriptor = "LIUTBNGPH;")
    public class32 field19;

    @OriginalMember(owner = "BRGDZOWQ", name = "d", descriptor = "[LBRGDZOWQ;")
    public static class4[] field15;

    @OriginalMember(owner = "BRGDZOWQ", name = "a", descriptor = "(LVSUYIIVA;I)V")
    public static void method9(class62 arg0, int arg1) {
        class8 var2 = new class8(arg0.method570("spotanim.dat", null), 792);
        if (arg1 <= 0) {
            return;
        }
        field14 = var2.method32();
        if (field15 == null) {
            field15 = new class4[field14];
        }
        for (int var3 = 0; var3 < field14; var3++) {
            if (field15[var3] == null) {
                field15[var3] = new class4();
            }
            field15[var3].field16 = var3;
            field15[var3].method10(var2, 22486);
        }
    }

    @OriginalMember(owner = "BRGDZOWQ", name = "a", descriptor = "(LCFARFRSG;I)V")
    public void method10(class8 arg0, int arg1) {
        if (this.field12 != arg1) {
            this.field12 = 338;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method30();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field17 = arg0.method32();
                } else if (var3 == 2) {
                    this.field18 = arg0.method32();
                    if (class32.field816 != null) {
                        this.field19 = class32.field816[this.field18];
                    }
                } else if (var3 == 4) {
                    this.field22 = arg0.method32();
                } else if (var3 == 5) {
                    this.field23 = arg0.method32();
                } else if (var3 == 6) {
                    this.field24 = arg0.method32();
                } else if (var3 == 7) {
                    this.field25 = arg0.method30();
                } else if (var3 == 8) {
                    this.field26 = arg0.method30();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field20[var3 - 40] = arg0.method32();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field21[var3 - 50] = arg0.method32();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "BRGDZOWQ", name = "a", descriptor = "()LLFTMDGKK;")
    public class37 method11() {
        class37 var1 = (class37) field27.method369((long) this.field16);
        if (var1 != null) {
            return var1;
        }
        class37 var2 = class37.method341(this.field17, this.field13);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field20[0] != 0) {
                var2.method355(this.field20[var3], this.field21[var3]);
            }
        }
        field27.method370(var2, 0, (long) this.field16);
        return var2;
    }
}
