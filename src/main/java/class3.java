import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BYUDODIR")
public class class3 {

    @OriginalMember(owner = "BYUDODIR", name = "e", descriptor = "I")
    public int field44 = -1;

    @OriginalMember(owner = "BYUDODIR", name = "g", descriptor = "[I")
    public int[] field46 = new int[6];

    @OriginalMember(owner = "BYUDODIR", name = "h", descriptor = "[I")
    public int[] field47 = new int[6];

    @OriginalMember(owner = "BYUDODIR", name = "i", descriptor = "I")
    public int field48 = 128;

    @OriginalMember(owner = "BYUDODIR", name = "j", descriptor = "I")
    public int field49 = 128;

    @OriginalMember(owner = "BYUDODIR", name = "n", descriptor = "LVNWSQIXW;")
    public static class54 field53 = new class54(30, (byte) 8);

    @OriginalMember(owner = "BYUDODIR", name = "a", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "BYUDODIR", name = "c", descriptor = "I")
    public int field42;

    @OriginalMember(owner = "BYUDODIR", name = "d", descriptor = "I")
    public int field43;

    @OriginalMember(owner = "BYUDODIR", name = "k", descriptor = "I")
    public int field50;

    @OriginalMember(owner = "BYUDODIR", name = "l", descriptor = "I")
    public int field51;

    @OriginalMember(owner = "BYUDODIR", name = "m", descriptor = "I")
    public int field52;

    @OriginalMember(owner = "BYUDODIR", name = "f", descriptor = "LVYCKCNXO;")
    public class58 field45;

    @OriginalMember(owner = "BYUDODIR", name = "b", descriptor = "[LBYUDODIR;")
    public static class3[] field41;

    @OriginalMember(owner = "BYUDODIR", name = "a", descriptor = "(LDTIATKJO;I)V")
    public static void method16(class8 arg0, int arg1) {
        class14 var2 = new class14(-527, arg0.method168("spotanim.dat", null));
        field40 = var2.method204();
        if (field41 == null) {
            field41 = new class3[field40];
        }
        for (int var3 = 0; var3 < field40; var3++) {
            if (field41[var3] == null) {
                field41[var3] = new class3();
            }
            field41[var3].field42 = var3;
            field41[var3].method17(var2, 0);
        }
        if (arg1 != 1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "BYUDODIR", name = "a", descriptor = "(LGHHPHSRU;I)V")
    public void method17(class14 arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method202();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field43 = arg0.method204();
                } else if (var3 == 2) {
                    this.field44 = arg0.method204();
                    if (class58.field1560 != null) {
                        this.field45 = class58.field1560[this.field44];
                    }
                } else if (var3 == 4) {
                    this.field48 = arg0.method204();
                } else if (var3 == 5) {
                    this.field49 = arg0.method204();
                } else if (var3 == 6) {
                    this.field50 = arg0.method204();
                } else if (var3 == 7) {
                    this.field51 = arg0.method202();
                } else if (var3 == 8) {
                    this.field52 = arg0.method202();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field46[var3 - 40] = arg0.method204();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field47[var3 - 50] = arg0.method204();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "BYUDODIR", name = "a", descriptor = "()LOQIGXOFQ;")
    public class35 method18() {
        class35 var1 = (class35) field53.method507((long) this.field42);
        if (var1 != null) {
            return var1;
        }
        class35 var2 = class35.method391(this.field43);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field46[0] != 0) {
                var2.method405(this.field46[var3], this.field47[var3]);
            }
        }
        field53.method508(7, (long) this.field42, var2);
        return var2;
    }
}
