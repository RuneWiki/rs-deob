import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class288 {

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "I")
    private int field3988 = 0;

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "I")
    private int field3998 = -1;

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "Lar;")
    private class479 field3995 = new class479();

    @OriginalMember(owner = "client!nv", name = "n", descriptor = "Z")
    public boolean field4001 = false;

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "I")
    private int field3997;

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "I")
    private int field3989;

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "[Lo;")
    private class24[] field3990;

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "[[[I")
    private int[][][] field3994;

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "Lqp;")
    public static class466 field3996 = new class466("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!nv", name = "m", descriptor = "Lwj;")
    public static class270 field4000 = new class270(3, -2);

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "Lmh;")
    public static class444 field3999;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V", line = 6)
    public final void method1717(int arg0) {
        for (int var2 = 0; var2 < this.field3989; var2++) {
            this.field3994[var2][0] = null;
            this.field3994[var2][1] = null;
            this.field3994[var2][2] = null;
            this.field3994[var2] = null;
        }
        field3992++;
        this.field3990 = null;
        this.field3994 = null;
        this.field3995.method2814((byte) 120);
        int var3 = -42 % ((-arg0 - 88) / 37);
        this.field3995 = null;
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)V", line = 38)
    public static void method1718(int arg0) {
        field3999 = null;
        if (arg0 > 123) {
            field3996 = null;
            field4000 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(II)[[I", line = 51)
    public final int[][] method1719(int arg0, int arg1) {
        field3991++;
        if (arg1 != 3) {
            return null;
        } else if (this.field3997 == this.field3989) {
            this.field4001 = this.field3990[arg0] == null;
            this.field3990[arg0] = class125.field1858;
            return this.field3994[arg0];
        } else if (this.field3989 == 1) {
            this.field4001 = this.field3998 != arg0;
            this.field3998 = arg0;
            return this.field3994[0];
        } else {
            class24 var3 = this.field3990[arg0];
            if (var3 == null) {
                this.field4001 = true;
                if (this.field3989 <= this.field3988) {
                    class24 var4 = (class24) this.field3995.method2811(2);
                    var3 = new class24(arg0, var4.field317);
                    this.field3990[var4.field319] = null;
                    var4.method1565(0);
                } else {
                    var3 = new class24(arg0, this.field3988);
                    this.field3988++;
                }
                this.field3990[arg0] = var3;
            } else {
                this.field4001 = false;
            }
            this.field3995.method2817(var3, true);
            return this.field3994[var3.field317];
        }
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(III)V", line = 164)
    public class288(int arg0, int arg1, int arg2) {
        this.field3997 = arg1;
        this.field3989 = arg0;
        this.field3990 = new class24[this.field3997];
        this.field3994 = new int[this.field3989][3][arg2];
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(I)[[[I", line = 124)
    public final int[][][] method1720(int arg0) {
        field3993++;
        if (this.field3997 != this.field3989) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 == -13702) {
            for (int var2 = 0; var2 < this.field3989; var2++) {
                this.field3990[var2] = class125.field1858;
            }
            return this.field3994;
        } else {
            return null;
        }
    }
}
