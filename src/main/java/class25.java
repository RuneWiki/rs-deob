import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!HGYXNEJH")
public class class25 {

    @OriginalMember(owner = "client!HGYXNEJH", name = "g", descriptor = "Z")
    public boolean field921 = false;

    @OriginalMember(owner = "client!HGYXNEJH", name = "h", descriptor = "I")
    public int field922 = -1;

    @OriginalMember(owner = "client!HGYXNEJH", name = "j", descriptor = "Z")
    public boolean field924 = true;

    @OriginalMember(owner = "client!HGYXNEJH", name = "a", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!HGYXNEJH", name = "d", descriptor = "I")
    public int field918;

    @OriginalMember(owner = "client!HGYXNEJH", name = "e", descriptor = "I")
    public int field919;

    @OriginalMember(owner = "client!HGYXNEJH", name = "f", descriptor = "I")
    public int field920;

    @OriginalMember(owner = "client!HGYXNEJH", name = "i", descriptor = "I")
    public int field923;

    @OriginalMember(owner = "client!HGYXNEJH", name = "c", descriptor = "Ljava/lang/String;")
    public String field917;

    @OriginalMember(owner = "client!HGYXNEJH", name = "b", descriptor = "[LHGYXNEJH;")
    public static class25[] field916;

    @OriginalMember(owner = "client!HGYXNEJH", name = "a", descriptor = "(BLXOJZVVDK;)V")
    public static void method257(byte arg0, class60 arg1) {
        if (arg0 != -82) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class41 var3 = new class41(888, arg1.method560("varbit.dat", null));
        field915 = var3.method342();
        if (field916 == null) {
            field916 = new class25[field915];
        }
        for (int var4 = 0; var4 < field915; var4++) {
            if (field916[var4] == null) {
                field916[var4] = new class25();
            }
            field916[var4].method258(-609, var3, var4);
            if (field916[var4].field921) {
                class6.field104[field916[var4].field918].field116 = true;
            }
        }
        if (var3.field1240.length != var3.field1241) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "client!HGYXNEJH", name = "a", descriptor = "(ILPQBRPYKE;I)V")
    public void method258(int arg0, class41 arg1, int arg2) {
        if (arg0 >= 0) {
            return;
        }
        while (true) {
            int var4 = arg1.method340();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field918 = arg1.method342();
                this.field919 = arg1.method340();
                this.field920 = arg1.method340();
            } else if (var4 == 10) {
                this.field917 = arg1.method347();
            } else if (var4 == 2) {
                this.field921 = true;
            } else if (var4 == 3) {
                this.field922 = arg1.method345();
            } else if (var4 == 4) {
                this.field923 = arg1.method345();
            } else if (var4 == 5) {
                this.field924 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
