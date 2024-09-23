import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SRLFLGUY")
public class class51 {

    @OriginalMember(owner = "SRLFLGUY", name = "h", descriptor = "Z")
    public boolean field1333 = false;

    @OriginalMember(owner = "SRLFLGUY", name = "i", descriptor = "I")
    public int field1334 = -1;

    @OriginalMember(owner = "SRLFLGUY", name = "k", descriptor = "Z")
    public boolean field1336 = true;

    @OriginalMember(owner = "SRLFLGUY", name = "a", descriptor = "I")
    private static int field1326 = -23379;

    @OriginalMember(owner = "SRLFLGUY", name = "b", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "SRLFLGUY", name = "e", descriptor = "I")
    public int field1330;

    @OriginalMember(owner = "SRLFLGUY", name = "f", descriptor = "I")
    public int field1331;

    @OriginalMember(owner = "SRLFLGUY", name = "g", descriptor = "I")
    public int field1332;

    @OriginalMember(owner = "SRLFLGUY", name = "j", descriptor = "I")
    public int field1335;

    @OriginalMember(owner = "SRLFLGUY", name = "d", descriptor = "Ljava/lang/String;")
    public String field1329;

    @OriginalMember(owner = "SRLFLGUY", name = "c", descriptor = "[LSRLFLGUY;")
    public static class51[] field1328;

    @OriginalMember(owner = "SRLFLGUY", name = "a", descriptor = "(ILBBMKAXRK;)V")
    public static void method447(int arg0, class6 arg1) {
        class17 var2 = new class17(arg1.method30("varbit.dat", null), -26583);
        field1327 = var2.method226();
        if (arg0 >= 0) {
            field1326 = 308;
        }
        if (field1328 == null) {
            field1328 = new class51[field1327];
        }
        for (int var3 = 0; var3 < field1327; var3++) {
            if (field1328[var3] == null) {
                field1328[var3] = new class51();
            }
            field1328[var3].method448(var3, var2, 0);
            if (field1328[var3].field1333) {
                class28.field963[field1328[var3].field1330].field975 = true;
            }
        }
        if (var2.field778.length != var2.field779) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "SRLFLGUY", name = "a", descriptor = "(ILEILHLJCE;I)V")
    public void method448(int arg0, class17 arg1, int arg2) {
        if (arg2 < 0 || arg2 > 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg1.method224();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field1330 = arg1.method226();
                this.field1331 = arg1.method224();
                this.field1332 = arg1.method224();
            } else if (var5 == 10) {
                this.field1329 = arg1.method231();
            } else if (var5 == 2) {
                this.field1333 = true;
            } else if (var5 == 3) {
                this.field1334 = arg1.method229();
            } else if (var5 == 4) {
                this.field1335 = arg1.method229();
            } else if (var5 == 5) {
                this.field1336 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
