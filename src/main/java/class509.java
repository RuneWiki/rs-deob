import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class509 extends class508 {

    @OriginalMember(owner = "client!sp", name = "u", descriptor = "I")
    public int field7471;

    @OriginalMember(owner = "client!sp", name = "r", descriptor = "I")
    public int field7468;

    @OriginalMember(owner = "client!sp", name = "t", descriptor = "[Z")
    public boolean[] field7470;

    @OriginalMember(owner = "client!sp", name = "p", descriptor = "[I")
    public int[] field7466;

    @OriginalMember(owner = "client!sp", name = "q", descriptor = "[I")
    public int[] field7467;

    @OriginalMember(owner = "client!sp", name = "s", descriptor = "[[I")
    public int[][] field7469;

    @OriginalMember(owner = "client!sp", name = "v", descriptor = "[Ljm;")
    public static class208[] field7472;

    @OriginalMember(owner = "client!sp", name = "x", descriptor = "I")
    public static int field7474;

    @OriginalMember(owner = "client!sp", name = "w", descriptor = "I")
    public static int field7473;

    @OriginalMember(owner = "client!sp", name = "y", descriptor = "I")
    public static int field7475;

    static {
        new class169("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
        field7472 = new class208[8];
        field7474 = 0;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)Lcc;", line = 11)
    public static final class343 method3024(int arg0) {
        if (arg0 <= 123) {
            return null;
        }
        field7475++;
        if (class230.field2953 == null || class63.field804 == null) {
            return null;
        }
        for (class343 var1 = (class343) class63.field804.method466(-257); var1 != null; var1 = (class343) class63.field804.method466(-257)) {
            class429 var2 = class230.field2950.method1093(var1.field4371, 97);
            if (var2 != null && var2.field5902 && var2.method2544(class230.field2944, -84)) {
                return var1;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(I[B)V", line = 45)
    public class509(int arg0, byte[] arg1) {
        this.field7471 = arg0;
        class88 var3 = new class88(arg1);
        this.field7468 = var3.method617(2);
        this.field7470 = new boolean[this.field7468];
        this.field7466 = new int[this.field7468];
        this.field7467 = new int[this.field7468];
        this.field7469 = new int[this.field7468][];
        for (int var4 = 0; var4 < this.field7468; var4++) {
            this.field7467[var4] = var3.method617(2);
        }
        for (int var5 = 0; var5 < this.field7468; var5++) {
            this.field7470[var5] = var3.method617(2) == 1;
        }
        for (int var6 = 0; var6 < this.field7468; var6++) {
            this.field7466[var6] = var3.method568((byte) 110);
        }
        for (int var7 = 0; var7 < this.field7468; var7++) {
            this.field7469[var7] = new int[var3.method617(2)];
        }
        for (int var8 = 0; var8 < this.field7468; var8++) {
            for (int var9 = 0; var9 < this.field7469[var8].length; var9++) {
                this.field7469[var8][var9] = var3.method617(2);
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "(B)V", line = 108)
    public static void method3025(byte arg0) {
        field7472 = null;
        if (arg0 > -92) {
            field7473 = 0;
        }
    }
}
