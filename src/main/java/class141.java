import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public abstract class class141 {

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public int field2478;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public int field2482;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public int field2485;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field2479 = 0;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "[I")
    public static int[] field2480 = new int[32768];

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Z")
    public static boolean field2477 = false;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Lke;")
    public static class256 field2474 = class316.method2202("Chargement de RuneScape en cours )2 veuillez patienter)3)3)3", 27626);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Lke;")
    public static class256 field2473 = class316.method2202("Shift)2click disabled)3", 27626);

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Lke;")
    public static class256 field2476 = class316.method2202("Votre liste d(Wamis est pleine (X100 noms maximum pour la version gratuite et 200 pour les abonn-Bs(Y)3", 27626);

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "[Lrd;")
    public static class135[] field2475;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B[B)Z", line = 28)
    public static final boolean method1034(byte arg0, byte[] arg1) {
        field2483++;
        class41 var2 = new class41(arg1);
        int var3 = 104 % ((19 - arg0) / 46);
        int var4 = var2.method357(false);
        if (var4 != 1) {
            return false;
        }
        boolean var5 = var2.method357(false) == 1;
        if (var5) {
            class99.method707(16835, var2);
        }
        class201.method1438(var2, -120);
        return true;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V", line = 54)
    public static void method1035(byte arg0) {
        field2476 = null;
        if (arg0 < 42) {
            field2479 = -19;
        }
        field2475 = null;
        field2480 = null;
        field2473 = null;
        field2474 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIII)I", line = 74)
    public static final int method1036(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 / arg1;
        field2484++;
        int var5 = arg1 - 1 & arg3;
        int var6 = arg1 - 1 & arg0;
        int var7 = arg0 / arg1;
        int var8 = class174.method1264(var7, arg2 ^ 0x3E, var4);
        int var9 = class174.method1264(var7, 65, var4 + 1);
        int var10 = class174.method1264(var7 + 1, 115, var4);
        int var11 = class174.method1264(arg2 + var7, arg2 + 83, var4 + 1);
        int var12 = class261.method1833(arg1, var8, var9, var5, arg2 - 119);
        int var13 = class261.method1833(arg1, var10, var11, var5, arg2 + 71);
        return class261.method1833(arg1, var12, var13, var6, 75);
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(III)V", line = 117)
    public class141(int arg0, int arg1, int arg2) {
        this.field2478 = arg2;
        this.field2482 = arg1;
        this.field2485 = arg0;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)V")
    public abstract void method629(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(III)V")
    public abstract void method630(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(III)V")
    public abstract void method634(int arg0, int arg1, int arg2);
}
