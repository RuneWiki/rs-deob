import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class430 extends class96 {

    @OriginalMember(owner = "client!jk", name = "J", descriptor = "Lgq;")
    public class339 field6322;

    @OriginalMember(owner = "client!jk", name = "B", descriptor = "Ldj;")
    public class218 field6314;

    @OriginalMember(owner = "client!jk", name = "L", descriptor = "[Ljl;")
    public static class168[] field6324 = new class168[14];

    @OriginalMember(owner = "client!jk", name = "M", descriptor = "Lwt;")
    public static class194 field6325;

    @OriginalMember(owner = "client!jk", name = "C", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!jk", name = "D", descriptor = "I")
    public int field6316;

    @OriginalMember(owner = "client!jk", name = "E", descriptor = "I")
    public int field6317;

    @OriginalMember(owner = "client!jk", name = "F", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!jk", name = "G", descriptor = "I")
    public int field6319;

    @OriginalMember(owner = "client!jk", name = "H", descriptor = "I")
    public int field6320;

    @OriginalMember(owner = "client!jk", name = "I", descriptor = "I")
    public static int field6321;

    @OriginalMember(owner = "client!jk", name = "K", descriptor = "I")
    public int field6323;

    @OriginalMember(owner = "client!jk", name = "N", descriptor = "I")
    public static int field6326;

    static {
        new class194("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
        field6325 = new class194("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2554(int arg0) {
        field6315++;
        int var1 = 0;
        for (int var2 = 0; var2 < class362.field5442; var2++) {
            for (int var3 = 0; var3 < class203.field2813; var3++) {
                if (class426.method2542(true, var2, (byte) 92, var1, var3, class358.field5312)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
        if (arg0 != -29907) {
            field6326 = 109;
        }
    }

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "(B)V", line = 38)
    public static void method2555(byte arg0) {
        field6325 = null;
        int var1 = -14 / (arg0 / 58);
        field6324 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IILeq;IIII)Lva;", line = 50)
    public static final class327 method2556(int arg0, int arg1, class134 arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = -34 / ((-arg0 - 77) / 37);
        field6321++;
        long var8 = (long) arg1;
        class327 var10 = (class327) class28.field488.method40(0, var8);
        short var11 = 2055;
        if (var10 == null) {
            class499 var12 = class319.method1920(arg1, 3424, class212.field3005, 0);
            if (var12 == null) {
                return null;
            }
            if (var12.field7615 < 13) {
                var12.method2993(0, (byte) -15);
            }
            var10 = arg2.method737(var12, var11, class96.field1293, 64, 768);
            class28.field488.method36(-20960, var10, var8);
        }
        class327 var13 = var10.method194((byte) 2, var11, true);
        if (arg5 != 0) {
            var13.method171(arg5);
        }
        if (arg3 != 0) {
            var13.method189(arg3);
        }
        if (arg4 != 0) {
            var13.method166(arg4);
        }
        if (arg6 != 0) {
            var13.method207(0, arg6, 0);
        }
        return var13;
    }

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "(I)V", line = 108)
    public final void method2557(int arg0) {
        field6318++;
        this.field6319 = this.field6322.field4939;
        this.field6320 = this.field6322.field4936;
        this.field6323 = this.field6322.field4938;
        if (this.field6322.field4940 != null) {
            this.field6322.field4940.method271(this.field6314.field3063, this.field6314.field3055, this.field6314.field3065, class410.field6018);
        }
        this.field6317 = class410.field6018[0];
        this.field6316 = class410.field6018[arg0];
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lgq;Lko;)V", line = 126)
    public class430(class339 arg0, class332 arg1) {
        this.field6322 = arg0;
        this.field6314 = this.field6322.method2056(true);
        this.method2557(2);
    }
}
