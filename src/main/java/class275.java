import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class275 {

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    private int field3929 = 0;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    private int field3933 = -1;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "Lum;")
    private class347 field3925 = new class347();

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "Z")
    public boolean field3939 = false;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    private int field3931;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    private int field3930;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "[[[I")
    private int[][][] field3938;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "[Lsa;")
    private class130[] field3932;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "Liu;")
    public static class390 field3936;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "Lhe;")
    public static class239 field3937;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    public static void method1689(byte arg0) {
        field3937 = null;
        if (arg0 == 73) {
            field3936 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public final void method1690(int arg0) {
        field3935++;
        for (int var2 = arg0; var2 < this.field3930; var2++) {
            this.field3938[var2][0] = null;
            this.field3938[var2][1] = null;
            this.field3938[var2][2] = null;
            this.field3938[var2] = null;
        }
        this.field3938 = null;
        this.field3932 = null;
        this.field3925.method2089(328);
        this.field3925 = null;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)[[[I")
    public final int[][][] method1691(int arg0) {
        field3926++;
        int var2 = -50 / ((arg0 + 39) / 37);
        if (this.field3931 != this.field3930) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var3 = 0; var3 < this.field3930; var3++) {
            this.field3932[var3] = class420.field6203;
        }
        return this.field3938;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)[[I")
    public final int[][] method1692(int arg0, int arg1) {
        if (arg1 <= 13) {
            return null;
        }
        field3928++;
        if (this.field3931 == this.field3930) {
            this.field3939 = this.field3932[arg0] == null;
            this.field3932[arg0] = class420.field6203;
            return this.field3938[arg0];
        } else if (this.field3930 == 1) {
            this.field3939 = this.field3933 != arg0;
            this.field3933 = arg0;
            return this.field3938[0];
        } else {
            class130 var3 = this.field3932[arg0];
            if (var3 == null) {
                this.field3939 = true;
                if (this.field3929 < this.field3930) {
                    var3 = new class130(arg0, this.field3929);
                    this.field3929++;
                } else {
                    class130 var4 = (class130) this.field3925.method2094(8);
                    var3 = new class130(arg0, var4.field1652);
                    this.field3932[var4.field1654] = null;
                    var4.method536(false);
                }
                this.field3932[arg0] = var3;
            } else {
                this.field3939 = false;
            }
            this.field3925.method2092(-115, var3);
            return this.field3938[var3.field1652];
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BC)Z")
    public static final boolean method1693(byte arg0, char arg1) {
        field3927++;
        if (arg0 <= 59) {
            field3936 = null;
        }
        return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(III)V")
    public class275(int arg0, int arg1, int arg2) {
        this.field3931 = arg1;
        this.field3930 = arg0;
        this.field3938 = new int[this.field3930][3][arg2];
        this.field3932 = new class130[this.field3931];
    }

    static {
        new class194("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
        field3936 = new class390(19, 0);
    }
}
