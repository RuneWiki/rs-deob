import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OQOGSGFM")
public class class37 {

    @OriginalMember(owner = "OQOGSGFM", name = "a", descriptor = "I")
    private int field967 = -261;

    @OriginalMember(owner = "OQOGSGFM", name = "b", descriptor = "I")
    private int field968 = -548;

    @OriginalMember(owner = "OQOGSGFM", name = "g", descriptor = "I")
    public int field973 = -1;

    @OriginalMember(owner = "OQOGSGFM", name = "i", descriptor = "[I")
    public int[] field975 = new int[6];

    @OriginalMember(owner = "OQOGSGFM", name = "j", descriptor = "[I")
    public int[] field976 = new int[6];

    @OriginalMember(owner = "OQOGSGFM", name = "k", descriptor = "I")
    public int field977 = 128;

    @OriginalMember(owner = "OQOGSGFM", name = "l", descriptor = "I")
    public int field978 = 128;

    @OriginalMember(owner = "OQOGSGFM", name = "p", descriptor = "LECXUVDNP;")
    public static class12 field982 = new class12(0, 30);

    @OriginalMember(owner = "OQOGSGFM", name = "c", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "OQOGSGFM", name = "e", descriptor = "I")
    public int field971;

    @OriginalMember(owner = "OQOGSGFM", name = "f", descriptor = "I")
    public int field972;

    @OriginalMember(owner = "OQOGSGFM", name = "m", descriptor = "I")
    public int field979;

    @OriginalMember(owner = "OQOGSGFM", name = "n", descriptor = "I")
    public int field980;

    @OriginalMember(owner = "OQOGSGFM", name = "o", descriptor = "I")
    public int field981;

    @OriginalMember(owner = "OQOGSGFM", name = "h", descriptor = "LJFYFSKVR;")
    public class22 field974;

    @OriginalMember(owner = "OQOGSGFM", name = "d", descriptor = "[LOQOGSGFM;")
    public static class37[] field970;

    @OriginalMember(owner = "OQOGSGFM", name = "a", descriptor = "(LCXFTMSCH;B)V")
    public static void method364(class8 arg0, byte arg1) {
        class33 var2 = new class33(true, arg0.method176("spotanim.dat", null));
        field969 = var2.method327();
        if (arg1 != 51) {
            return;
        }
        if (field970 == null) {
            field970 = new class37[field969];
        }
        for (int var3 = 0; var3 < field969; var3++) {
            if (field970[var3] == null) {
                field970[var3] = new class37();
            }
            field970[var3].field971 = var3;
            field970[var3].method365(var2, -261);
        }
    }

    @OriginalMember(owner = "OQOGSGFM", name = "a", descriptor = "(LMQZHAILV;I)V")
    public void method365(class33 arg0, int arg1) {
        if (arg1 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg0.method325();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field972 = arg0.method327();
                } else if (var4 == 2) {
                    this.field973 = arg0.method327();
                    if (class22.field761 != null) {
                        this.field974 = class22.field761[this.field973];
                    }
                } else if (var4 == 4) {
                    this.field977 = arg0.method327();
                } else if (var4 == 5) {
                    this.field978 = arg0.method327();
                } else if (var4 == 6) {
                    this.field979 = arg0.method327();
                } else if (var4 == 7) {
                    this.field980 = arg0.method325();
                } else if (var4 == 8) {
                    this.field981 = arg0.method325();
                } else if (var4 >= 40 && var4 < 50) {
                    this.field975[var4 - 40] = arg0.method327();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field976[var4 - 50] = arg0.method327();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "OQOGSGFM", name = "a", descriptor = "()LYYHPBDED;")
    public class70 method366() {
        class70 var1 = (class70) field982.method221((long) this.field971);
        if (var1 != null) {
            return var1;
        }
        class70 var2 = class70.method551(this.field968, this.field972);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field975[0] != 0) {
                var2.method565(this.field975[var3], this.field976[var3]);
            }
        }
        field982.method222((long) this.field971, var2, -17668);
        return var2;
    }
}
