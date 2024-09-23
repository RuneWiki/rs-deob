import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HTWOTIWO")
public class class23 {

    @OriginalMember(owner = "HTWOTIWO", name = "c", descriptor = "I")
    private int field864 = 635;

    @OriginalMember(owner = "HTWOTIWO", name = "h", descriptor = "I")
    public int field869 = -1;

    @OriginalMember(owner = "HTWOTIWO", name = "j", descriptor = "[I")
    public int[] field871 = new int[6];

    @OriginalMember(owner = "HTWOTIWO", name = "k", descriptor = "[I")
    public int[] field872 = new int[6];

    @OriginalMember(owner = "HTWOTIWO", name = "l", descriptor = "I")
    public int field873 = 128;

    @OriginalMember(owner = "HTWOTIWO", name = "m", descriptor = "I")
    public int field874 = 128;

    @OriginalMember(owner = "HTWOTIWO", name = "a", descriptor = "Z")
    private static boolean field862 = true;

    @OriginalMember(owner = "HTWOTIWO", name = "q", descriptor = "LWIUIWDML;")
    public static class66 field878 = new class66(-99, 30);

    @OriginalMember(owner = "HTWOTIWO", name = "b", descriptor = "I")
    private int field863;

    @OriginalMember(owner = "HTWOTIWO", name = "d", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "HTWOTIWO", name = "f", descriptor = "I")
    public int field867;

    @OriginalMember(owner = "HTWOTIWO", name = "g", descriptor = "I")
    public int field868;

    @OriginalMember(owner = "HTWOTIWO", name = "n", descriptor = "I")
    public int field875;

    @OriginalMember(owner = "HTWOTIWO", name = "o", descriptor = "I")
    public int field876;

    @OriginalMember(owner = "HTWOTIWO", name = "p", descriptor = "I")
    public int field877;

    @OriginalMember(owner = "HTWOTIWO", name = "i", descriptor = "LDWUJPTWU;")
    public class14 field870;

    @OriginalMember(owner = "HTWOTIWO", name = "e", descriptor = "[LHTWOTIWO;")
    public static class23[] field866;

    @OriginalMember(owner = "HTWOTIWO", name = "a", descriptor = "(ILTXPLZUUI;)V")
    public static void method249(int arg0, class60 arg1) {
        if (arg0 != 3) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class43 var3 = new class43(arg1.method506("spotanim.dat", null), 0);
        field865 = var3.method332();
        if (field866 == null) {
            field866 = new class23[field865];
        }
        for (int var4 = 0; var4 < field865; var4++) {
            if (field866[var4] == null) {
                field866[var4] = new class23();
            }
            field866[var4].field867 = var4;
            field866[var4].method250(var3, field862);
        }
    }

    @OriginalMember(owner = "HTWOTIWO", name = "a", descriptor = "(LPKHWFJLM;Z)V")
    public void method250(class43 arg0, boolean arg1) {
        if (!arg1) {
            this.field863 = 161;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method330();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field868 = arg0.method332();
                } else if (var3 == 2) {
                    this.field869 = arg0.method332();
                    if (class14.field656 != null) {
                        this.field870 = class14.field656[this.field869];
                    }
                } else if (var3 == 4) {
                    this.field873 = arg0.method332();
                } else if (var3 == 5) {
                    this.field874 = arg0.method332();
                } else if (var3 == 6) {
                    this.field875 = arg0.method332();
                } else if (var3 == 7) {
                    this.field876 = arg0.method330();
                } else if (var3 == 8) {
                    this.field877 = arg0.method330();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field871[var3 - 40] = arg0.method332();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field872[var3 - 50] = arg0.method332();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "HTWOTIWO", name = "a", descriptor = "()LPSGMMDJS;")
    public class45 method251() {
        class45 var1 = (class45) field878.method519((long) this.field867);
        if (var1 != null) {
            return var1;
        }
        class45 var2 = class45.method410(this.field868);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field871[0] != 0) {
                var2.method424(this.field871[var3], this.field872[var3]);
            }
        }
        field878.method520(this.field864, (long) this.field867, var2);
        return var2;
    }
}
