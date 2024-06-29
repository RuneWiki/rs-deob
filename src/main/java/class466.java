import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class466 {

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    private int field7144 = -1;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    private int field7151 = 0;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "Lft;")
    private class4 field7154 = new class4();

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "Z")
    public boolean field7156 = false;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
    private int field7152;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    private int field7146;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "[Lum;")
    private class348[] field7147;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "[[[I")
    private int[][][] field7145;

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "I")
    public static int field7157;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field7142;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public static int field7148;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    public static int field7149;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    public static int field7150;

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "I")
    public static int field7158;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "Lkt;")
    public static class103 field7153;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "Lrg;")
    public static class437 field7155;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "Liv;")
    public static class61 field7143;

    static {
        new class423("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
        field7157 = 0;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)[[I", line = 6)
    public final int[][] method2819(int arg0, int arg1) {
        field7142++;
        if (arg1 != 1) {
            method2822(false);
        }
        if (this.field7152 == this.field7146) {
            this.field7156 = this.field7147[arg0] == null;
            this.field7147[arg0] = class6.field73;
            return this.field7145[arg0];
        } else if (this.field7146 == 1) {
            this.field7156 = this.field7144 != arg0;
            this.field7144 = arg0;
            return this.field7145[0];
        } else {
            class348 var3 = this.field7147[arg0];
            if (var3 == null) {
                this.field7156 = true;
                if (this.field7146 <= this.field7151) {
                    class348 var4 = (class348) this.field7154.method9((byte) -124);
                    var3 = new class348(arg0, var4.field5136);
                    this.field7147[var4.field5135] = null;
                    var4.method1121(false);
                } else {
                    var3 = new class348(arg0, this.field7151);
                    this.field7151++;
                }
                this.field7147[arg0] = var3;
            } else {
                this.field7156 = false;
            }
            this.field7154.method11(arg1 - 123, var3);
            return this.field7145[var3.field5136];
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)[[[I", line = 73)
    public final int[][][] method2820(boolean arg0) {
        field7149++;
        if (this.field7152 != this.field7146) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field7146; var2++) {
            this.field7147[var2] = class6.field73;
        }
        if (arg0) {
            this.field7151 = -76;
        }
        return this.field7145;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V", line = 95)
    public final void method2821(byte arg0) {
        for (int var2 = 0; var2 < this.field7146; var2++) {
            this.field7145[var2][0] = null;
            this.field7145[var2][1] = null;
            this.field7145[var2][2] = null;
            this.field7145[var2] = null;
        }
        field7150++;
        this.field7145 = null;
        this.field7147 = null;
        this.field7154.method13(false);
        if (arg0 < -126) {
            this.field7154 = null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(Z)V", line = 124)
    public static final void method2822(boolean arg0) {
        field7148++;
        class491.field7457.method2367(8);
        int var1 = class491.field7457.method2364(8, true);
        if (var1 < class352.field5175) {
            for (int var2 = var1; var2 < class352.field5175; var2++) {
                class24.field311[class98.field1763++] = class437.field6440[var2];
            }
        }
        if (var1 > class352.field5175) {
            throw new RuntimeException("gnpov1");
        }
        if (arg0) {
            method2823((byte) 101);
        }
        class352.field5175 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class437.field6440[var3];
            class249 var5 = class195.field3085[var4];
            int var6 = class491.field7457.method2364(1, true);
            if (var6 == 0) {
                class437.field6440[class352.field5175++] = var4;
                var5.field2216 = class369.field5424;
            } else {
                int var7 = class491.field7457.method2364(2, !arg0);
                if (var7 == 0) {
                    class437.field6440[class352.field5175++] = var4;
                    var5.field2216 = class369.field5424;
                    class158.field2489[class451.field6951++] = var4;
                } else if (var7 == 1) {
                    class437.field6440[class352.field5175++] = var4;
                    var5.field2216 = class369.field5424;
                    int var8 = class491.field7457.method2364(3, !arg0);
                    var5.method1506(var8, 1, 0);
                    int var9 = class491.field7457.method2364(1, true);
                    if (var9 == 1) {
                        class158.field2489[class451.field6951++] = var4;
                    }
                } else if (var7 == 2) {
                    class437.field6440[class352.field5175++] = var4;
                    var5.field2216 = class369.field5424;
                    if (class491.field7457.method2364(1, !arg0) == 1) {
                        int var10 = class491.field7457.method2364(3, true);
                        var5.method1506(var10, 2, 0);
                        int var11 = class491.field7457.method2364(3, true);
                        var5.method1506(var11, 2, 0);
                    } else {
                        int var12 = class491.field7457.method2364(3, !arg0);
                        var5.method1506(var12, 0, 0);
                    }
                    int var13 = class491.field7457.method2364(1, true);
                    if (var13 == 1) {
                        class158.field2489[class451.field6951++] = var4;
                    }
                } else if (var7 == 3) {
                    class24.field311[class98.field1763++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)V", line = 243)
    public static void method2823(byte arg0) {
        field7155 = null;
        field7153 = null;
        field7143 = null;
        int var1 = -119 % ((arg0 - 23) / 50);
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(III)V", line = 284)
    public class466(int arg0, int arg1, int arg2) {
        this.field7152 = arg1;
        this.field7146 = arg0;
        this.field7147 = new class348[this.field7152];
        this.field7145 = new int[this.field7146][3][arg2];
    }
}
