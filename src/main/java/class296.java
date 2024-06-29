import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class296 {

    @OriginalMember(owner = "client!un", name = "n", descriptor = "Lkn;")
    public static class530 field4353 = new class530("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    public int field4340;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "I")
    public int field4341;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "I")
    public int field4342;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "I")
    public int field4343;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    public int field4344;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "I")
    public int field4346;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "I")
    public int field4347;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "I")
    public int field4348;

    @OriginalMember(owner = "client!un", name = "j", descriptor = "I")
    public int field4349;

    @OriginalMember(owner = "client!un", name = "k", descriptor = "I")
    public int field4350;

    @OriginalMember(owner = "client!un", name = "l", descriptor = "I")
    public int field4351;

    @OriginalMember(owner = "client!un", name = "m", descriptor = "I")
    public int field4352;

    @OriginalMember(owner = "client!un", name = "o", descriptor = "I")
    public int field4354;

    @OriginalMember(owner = "client!un", name = "p", descriptor = "I")
    public int field4355;

    @OriginalMember(owner = "client!un", name = "q", descriptor = "I")
    public int field4356;

    @OriginalMember(owner = "client!un", name = "r", descriptor = "I")
    public int field4357;

    @OriginalMember(owner = "client!un", name = "s", descriptor = "I")
    public int field4358;

    @OriginalMember(owner = "client!un", name = "t", descriptor = "I")
    public int field4359;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ZIII)I", line = 11)
    public static final int method1821(boolean arg0, int arg1, int arg2, int arg3) {
        field4345++;
        class167 var4 = class119.method803(arg0, arg2, arg1 ^ arg1);
        if (var4 == null) {
            return 0;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field2433.length; var6++) {
                if (var4.field2432[var6] == arg3) {
                    var5 += var4.field2433[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIII)Z", line = 41)
    public static final boolean method1822(int arg0, int arg1, int arg2, int arg3) {
        if (class422.method2503(arg0, arg1, arg2)) {
            int var4 = arg1 << class493.field6970;
            int var5 = arg2 << class493.field6970;
            return class395.method2299(var4 + 1, class330.field4818[arg0].method10(arg1, arg2) + arg3, var5 + 1) && class395.method2299(class169.field2463 + var4 - 1, class330.field4818[arg0].method10(arg1 + 1, arg2) + arg3, var5 + 1) && class395.method2299(class169.field2463 + var4 - 1, class330.field4818[arg0].method10(arg1 + 1, arg2 + 1) + arg3, class169.field2463 + var5 - 1) && class395.method2299(var4 + 1, class330.field4818[arg0].method10(arg1, arg2 + 1) + arg3, class169.field2463 + var5 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V", line = 59)
    public static void method1823(int arg0) {
        field4353 = null;
        if (arg0 != 4853) {
            method1822(-92, -20, -51, 9);
        }
    }
}
