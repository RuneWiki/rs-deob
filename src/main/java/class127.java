import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class127 {

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    private int field1727 = 0;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
    private int field1729 = -1;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "Lcf;")
    private class92 field1725 = new class92();

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "Z")
    public boolean field1732 = false;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
    private int field1728;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    private int field1726;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "[Lal;")
    private class114[] field1724;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "[[I")
    private int[][] field1723;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "Lch;")
    public static class151 field1722 = new class151("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "Lap;")
    public static class310 field1733 = new class310(70, 8);

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "I")
    public static int field1735 = 0;

    @OriginalMember(owner = "client!vn", name = "q", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "I")
    public static int field1736;

    static {
        new class151("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
        field1737 = 0;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V", line = 3)
    public static void method955(int arg0) {
        int var1 = -118 / ((arg0 + 64) / 59);
        field1733 = null;
        field1722 = null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Z)V", line = 17)
    public static final void method956(boolean arg0) {
        field1734++;
        if (!arg0) {
            method955(-98);
        }
        class442.field6276.method1101((byte) 95);
        class267.field3838.method1101((byte) 82);
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)[[I", line = 36)
    public final int[][] method957(int arg0) {
        field1731++;
        if (this.field1728 != this.field1726) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field1726; var2++) {
            this.field1724[var2] = class166.field2419;
        }
        return this.field1723;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(BI)[I", line = 55)
    public final int[] method958(byte arg0, int arg1) {
        field1730++;
        if (arg0 < 13) {
            return null;
        } else if (this.field1728 == this.field1726) {
            this.field1732 = this.field1724[arg1] == null;
            this.field1724[arg1] = class166.field2419;
            return this.field1723[arg1];
        } else if (this.field1726 == 1) {
            this.field1732 = this.field1729 != arg1;
            this.field1729 = arg1;
            return this.field1723[0];
        } else {
            class114 var3 = this.field1724[arg1];
            if (var3 == null) {
                this.field1732 = true;
                if (this.field1726 <= this.field1727) {
                    class114 var4 = (class114) this.field1725.method777(106);
                    var3 = new class114(arg1, var4.field1603);
                    this.field1724[var4.field1597] = null;
                    var4.method2714(-49);
                } else {
                    var3 = new class114(arg1, this.field1727);
                    this.field1727++;
                }
                this.field1724[arg1] = var3;
            } else {
                this.field1732 = false;
            }
            this.field1725.method774(var3, (byte) 123);
            return this.field1723[var3.field1603];
        }
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(III)V", line = 165)
    public class127(int arg0, int arg1, int arg2) {
        this.field1728 = arg1;
        this.field1726 = arg0;
        this.field1724 = new class114[this.field1728];
        this.field1723 = new int[this.field1726][arg2];
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)V", line = 129)
    public final void method959(int arg0) {
        field1721++;
        if (arg0 != 70) {
            this.field1725 = null;
        }
        for (int var2 = 0; var2 < this.field1726; var2++) {
            this.field1723[var2] = null;
        }
        this.field1724 = null;
        this.field1723 = null;
        this.field1725.method773(-1568);
        this.field1725 = null;
    }
}
