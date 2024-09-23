import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CIVOPMKV")
public class class9 {

    @OriginalMember(owner = "CIVOPMKV", name = "g", descriptor = "I")
    public int field139 = -1;

    @OriginalMember(owner = "CIVOPMKV", name = "i", descriptor = "[I")
    public int[] field141 = new int[6];

    @OriginalMember(owner = "CIVOPMKV", name = "j", descriptor = "[I")
    public int[] field142 = new int[6];

    @OriginalMember(owner = "CIVOPMKV", name = "k", descriptor = "I")
    public int field143 = 128;

    @OriginalMember(owner = "CIVOPMKV", name = "l", descriptor = "I")
    public int field144 = 128;

    @OriginalMember(owner = "CIVOPMKV", name = "a", descriptor = "I")
    private static int field133 = 8;

    @OriginalMember(owner = "CIVOPMKV", name = "b", descriptor = "I")
    private static int field134 = 25292;

    @OriginalMember(owner = "CIVOPMKV", name = "p", descriptor = "LWMYPWVZI;")
    public static class62 field148 = new class62(30, 267);

    @OriginalMember(owner = "CIVOPMKV", name = "c", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "CIVOPMKV", name = "e", descriptor = "I")
    public int field137;

    @OriginalMember(owner = "CIVOPMKV", name = "f", descriptor = "I")
    public int field138;

    @OriginalMember(owner = "CIVOPMKV", name = "m", descriptor = "I")
    public int field145;

    @OriginalMember(owner = "CIVOPMKV", name = "n", descriptor = "I")
    public int field146;

    @OriginalMember(owner = "CIVOPMKV", name = "o", descriptor = "I")
    public int field147;

    @OriginalMember(owner = "CIVOPMKV", name = "h", descriptor = "LZKWMIVTX;")
    public class71 field140;

    @OriginalMember(owner = "CIVOPMKV", name = "d", descriptor = "[LCIVOPMKV;")
    public static class9[] field136;

    @OriginalMember(owner = "CIVOPMKV", name = "a", descriptor = "(LBYZSQZUF;Z)V")
    public static void method30(class7 arg0, boolean arg1) {
        class24 var2 = new class24(0, arg0.method29("spotanim.dat", null));
        if (arg1) {
            field134 = 0;
        }
        field135 = var2.method240();
        if (field136 == null) {
            field136 = new class9[field135];
        }
        for (int var3 = 0; var3 < field135; var3++) {
            if (field136[var3] == null) {
                field136[var3] = new class9();
            }
            field136[var3].field137 = var3;
            field136[var3].method31(field133, var2);
        }
    }

    @OriginalMember(owner = "CIVOPMKV", name = "a", descriptor = "(ILIMUIZRAF;)V")
    public void method31(int arg0, class24 arg1) {
        if (arg0 < 8 || arg0 > 8) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method238();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field138 = arg1.method240();
                } else if (var4 == 2) {
                    this.field139 = arg1.method240();
                    if (class71.field1705 != null) {
                        this.field140 = class71.field1705[this.field139];
                    }
                } else if (var4 == 4) {
                    this.field143 = arg1.method240();
                } else if (var4 == 5) {
                    this.field144 = arg1.method240();
                } else if (var4 == 6) {
                    this.field145 = arg1.method240();
                } else if (var4 == 7) {
                    this.field146 = arg1.method238();
                } else if (var4 == 8) {
                    this.field147 = arg1.method238();
                } else if (var4 >= 40 && var4 < 50) {
                    this.field141[var4 - 40] = arg1.method240();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field142[var4 - 50] = arg1.method240();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "CIVOPMKV", name = "a", descriptor = "()LYABPKWWG;")
    public class67 method32() {
        class67 var1 = (class67) field148.method525((long) this.field137);
        if (var1 != null) {
            return var1;
        }
        class67 var2 = class67.method548(this.field138, (byte) -27);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field141[0] != 0) {
                var2.method562(this.field141[var3], this.field142[var3]);
            }
        }
        field148.method526((long) this.field137, 5, var2);
        return var2;
    }
}
