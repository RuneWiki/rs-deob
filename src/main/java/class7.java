import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 {

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    private int field144 = 0;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    private int field149 = -1;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "Ln;")
    private class118 field141 = new class118();

    @OriginalMember(owner = "client!af", name = "v", descriptor = "Z")
    public boolean field154 = false;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "[[I")
    private int[][] field151;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    private int field136;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "[Lah;")
    private class9[] field150;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    private int field143;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "Led;")
    public static class43 field135 = class191.method1219("hel", false);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static volatile int field133 = 0;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Led;")
    private static class43 field137 = class191.method1219("Connecting to server)3)3)3", false);

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field145 = 99;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field140 = 0;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public static int field147 = 0;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field142 = 0;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "Led;")
    public static class43 field146 = field137;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "Ltg;")
    public static class179 field134;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)I")
    public static final int method37(int arg0) {
        if (arg0 < 116) {
            field145 = 48;
        }
        field139++;
        return 6;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)I")
    public static int method38(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IB)[I")
    public final int[] method39(int arg0, byte arg1) {
        if (arg1 != 39) {
            this.method42((byte) -45);
        }
        field138++;
        if (this.field143 == this.field136) {
            this.field154 = this.field150[arg0] == null;
            this.field150[arg0] = class119.field2369;
            return this.field151[arg0];
        } else if (this.field136 == 1) {
            this.field154 = this.field149 != arg0;
            this.field149 = arg0;
            return this.field151[0];
        } else {
            class9 var3 = this.field150[arg0];
            if (this.field154 = var3 == null) {
                if (this.field136 > this.field144) {
                    var3 = new class9(arg0, this.field144);
                    this.field144++;
                } else {
                    class9 var4 = (class9) this.field141.method749((byte) 90);
                    var3 = new class9(arg0, var4.field169);
                    this.field150[var4.field164] = null;
                    var4.method417(115);
                }
                this.field150[arg0] = var3;
            }
            this.field141.method752(var3, 22);
            return this.field151[var3.field169];
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
    public final void method40(int arg0) {
        field148++;
        for (int var2 = arg0; var2 < this.field136; var2++) {
            this.field151[var2] = null;
        }
        this.field150 = null;
        this.field151 = null;
        this.field141.method751(-15085);
        this.field141 = null;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)V")
    public static void method41(int arg0) {
        field134 = null;
        field137 = null;
        field135 = null;
        if (arg0 != 6) {
            field147 = 43;
        }
        field146 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)[[I")
    public final int[][] method42(byte arg0) {
        field153++;
        if (this.field143 != this.field136) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 >= -127) {
            field142 = 18;
        }
        for (int var2 = 0; var2 < this.field136; var2++) {
            this.field150[var2] = class119.field2369;
        }
        return this.field151;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(III)V")
    public class7(int arg0, int arg1, int arg2) {
        this.field151 = new int[arg0][arg2];
        this.field136 = arg0;
        this.field150 = new class9[arg1];
        this.field143 = arg1;
    }
}
