import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class70 {

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
    private int field854 = -1;

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "I")
    private int field862 = 0;

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "Ltu;")
    private class7 field858 = new class7();

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "Z")
    public boolean field863 = false;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
    private int field850;

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "I")
    private int field859;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "[[I")
    private int[][] field852;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "[Lpu;")
    private class176[] field855;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "Loi;")
    public static class169 field857 = new class169("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "Ljd;")
    public static class408 field861 = new class408(11, 0, 1, 2);

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
    public static void method396(int arg0) {
        field857 = null;
        field861 = null;
        if (arg0 != 0) {
            method396(-87);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(BI)[I")
    public final int[] method397(byte arg0, int arg1) {
        field853++;
        if (arg0 != -110) {
            this.field862 = -23;
        }
        if (this.field859 == this.field850) {
            this.field863 = this.field855[arg1] == null;
            this.field855[arg1] = class444.field6167;
            return this.field852[arg1];
        } else if (this.field850 == 1) {
            this.field863 = this.field854 != arg1;
            this.field854 = arg1;
            return this.field852[0];
        } else {
            class176 var3 = this.field855[arg1];
            if (var3 == null) {
                this.field863 = true;
                if (this.field850 > this.field862) {
                    var3 = new class176(arg1, this.field862);
                    this.field862++;
                } else {
                    class176 var4 = (class176) this.field858.method39(true);
                    var3 = new class176(arg1, var4.field2254);
                    this.field855[var4.field2252] = null;
                    var4.method3021(-120);
                }
                this.field855[arg1] = var3;
            } else {
                this.field863 = false;
            }
            this.field858.method41(-792385400, var3);
            return this.field852[var3.field2254];
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)[[I")
    public final int[][] method398(int arg0) {
        field851++;
        if (this.field859 != this.field850) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 == 12054) {
            for (int var2 = 0; var2 < this.field850; var2++) {
                this.field855[var2] = class444.field6167;
            }
            return this.field852;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(III)I")
    public static final int method399(int arg0, int arg1, int arg2) {
        if (arg2 < 120) {
            method396(96);
        }
        field856++;
        return arg1 == 1 || arg1 == 3 ? class115.field1624[arg0 & 0x3] : class171.field2219[arg0 & 0x3];
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V")
    public final void method400(byte arg0) {
        field860++;
        for (int var2 = 0; var2 < this.field850; var2++) {
            this.field852[var2] = null;
        }
        this.field852 = null;
        this.field855 = null;
        if (arg0 != 4) {
            this.field850 = 115;
        }
        this.field858.method47(0);
        this.field858 = null;
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(III)V")
    public class70(int arg0, int arg1, int arg2) {
        this.field850 = arg0;
        this.field859 = arg1;
        this.field852 = new int[this.field850][arg2];
        this.field855 = new class176[this.field859];
    }
}
