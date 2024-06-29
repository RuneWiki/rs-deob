import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class101 {

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public int field1447 = 2048;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public int field1445 = 0;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public int field1450 = 0;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public int field1443 = 2048;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "[Z")
    public static boolean[] field1452 = new boolean[200];

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "Lss;")
    public static class213 field1444 = new class213("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "Lbi;")
    public static class104 field1453 = new class104(88, 7);

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
    public static void method680(int arg0) {
        field1453 = null;
        field1452 = null;
        if (arg0 == 3) {
            field1444 = null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lhw;I)V")
    public final void method681(class208 arg0, int arg1) {
        field1449++;
        while (true) {
            int var3 = arg0.method1445(arg1 - 15520);
            if (var3 == 0) {
                if (arg1 == 15411) {
                    return;
                } else {
                    field1444 = null;
                    return;
                }
            }
            this.method683(var3, false, arg0);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([Lgi;IIIIZ)V")
    public static final void method682(class437[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        for (int var6 = 0; var6 < arg0.length; var6++) {
            class437 var7 = arg0[var6];
            if (var7 != null && var7.field6599 == arg3) {
                class170.method1075(arg4, arg1, var7, (byte) 25, arg5);
                class84.method591(var7, 87, arg1, arg4);
                if ((var7.field6693 - var7.field6615) < var7.field6649) {
                    var7.field6649 = var7.field6693 - var7.field6615;
                }
                if (var7.field6649 < 0) {
                    var7.field6649 = 0;
                }
                if (var7.field6613 > (var7.field6647 - var7.field6730)) {
                    var7.field6613 = var7.field6647 - var7.field6730;
                }
                if (var7.field6613 < 0) {
                    var7.field6613 = 0;
                }
                if (var7.field6729 == 0) {
                    class235.method1662(true, arg5, var7);
                }
            }
        }
        field1451++;
        if (arg2 != -1) {
            method682(null, 60, -40, 40, -111, true);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZLhw;)V")
    private final void method683(int arg0, boolean arg1, class208 arg2) {
        if (arg0 == 1) {
            this.field1445 = arg2.method1445(-118);
        } else if (arg0 == 2) {
            this.field1447 = arg2.method1455(-3387);
        } else if (arg0 == 3) {
            this.field1443 = arg2.method1455(-3387);
        } else if (arg0 == 4) {
            this.field1450 = arg2.method1456(13329);
        }
        field1448++;
        if (arg1) {
            this.field1450 = 122;
        }
    }
}
