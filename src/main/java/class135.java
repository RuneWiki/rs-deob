import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class135 extends class47 {

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "I")
    private int field1877;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "Lcf;")
    public static class92 field1887;

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "[Lit;")
    public class471[] field1878;

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "[[B")
    private byte[][] field1888;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)Z")
    public final boolean method998(int arg0, byte arg1) {
        int var3 = -104 % ((arg1 + 90) / 35);
        field1881++;
        return this.field1878[arg0].field6637;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)Z")
    public final boolean method999(int arg0, int arg1) {
        if (arg0 == 0) {
            field1882++;
            return this.field1878[arg1].field6631;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)V")
    public static void method1000(int arg0) {
        if (arg0 != 0) {
            method1000(-35);
        }
        field1887 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1001(byte arg0, String arg1) {
        field1880++;
        System.out.println("Error: " + class466.method2776(arg1, "\n", 0, "%0a"));
        if (arg0 >= -33) {
            field1876 = 113;
        }
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)Z")
    public final boolean method1002(int arg0) {
        field1886++;
        if (this.field1878 != null) {
            return true;
        }
        if (this.field1888 == null) {
            if (!class125.field1699.method2630(-1, this.field1877)) {
                return false;
            }
            int[] var2 = class125.field1699.method2655(0, this.field1877);
            this.field1888 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field1888[var3] = class125.field1699.method2633(this.field1877, var2[var3], 83);
            }
        }
        boolean var4 = true;
        if (arg0 <= 44) {
            field1879 = 37;
        }
        for (int var5 = 0; var5 < this.field1888.length; var5++) {
            byte[] var14 = this.field1888[var5];
            int var15 = var14[0] & 0xFF << 8 | var14[1] & 0xFF;
            var4 &= class22.field253.method2627((byte) 36, var15);
        }
        if (!var4) {
            return false;
        }
        class92 var6 = new class92();
        int var7 = class125.field1699.method2638(1, this.field1877);
        this.field1878 = new class471[var7];
        int[] var8 = class125.field1699.method2655(0, this.field1877);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field1888[var9];
            int var11 = var10[1] & 0xFF | var10[0] & 0xFF << 8;
            class61 var12 = null;
            for (class61 var13 = (class61) var6.method775(1); var13 != null; var13 = (class61) var6.method763(0)) {
                if (var13.field891 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class61(var11, class22.field253.method2650((byte) -72, var11));
                var6.method766(var12, -1);
            }
            this.field1878[var8[var9]] = new class471(var10, var12);
        }
        this.field1888 = null;
        return true;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(I)V")
    public class135(int arg0) {
        this.field1877 = arg0;
    }

    static {
        new class151("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
        field1876 = 0;
        field1883 = 0;
        field1879 = 500;
        field1885 = -1;
    }
}
