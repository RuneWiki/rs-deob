import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class530 {

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "I")
    private int field7756 = 0;

    @OriginalMember(owner = "client!ms", name = "k", descriptor = "I")
    private int field7766 = -1;

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "Lpk;")
    private class133 field7757 = new class133();

    @OriginalMember(owner = "client!ms", name = "o", descriptor = "Z")
    public boolean field7770 = false;

    @OriginalMember(owner = "client!ms", name = "g", descriptor = "I")
    private int field7762;

    @OriginalMember(owner = "client!ms", name = "m", descriptor = "I")
    private int field7768;

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "[Lgd;")
    private class225[] field7761;

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "[[[I")
    private int[][][] field7759;

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "Lbg;")
    public static class324 field7760 = new class324(102, 5);

    @OriginalMember(owner = "client!ms", name = "l", descriptor = "[I")
    public static int[] field7767 = new int[14];

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "I")
    public static int field7758;

    @OriginalMember(owner = "client!ms", name = "h", descriptor = "I")
    public static int field7763;

    @OriginalMember(owner = "client!ms", name = "i", descriptor = "I")
    public static int field7764;

    @OriginalMember(owner = "client!ms", name = "j", descriptor = "I")
    public static int field7765;

    @OriginalMember(owner = "client!ms", name = "n", descriptor = "I")
    public static int field7769;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(BI)[[I")
    public final int[][] method3127(byte arg0, int arg1) {
        field7763++;
        int var3 = 119 % ((arg0 + 51) / 48);
        if (this.field7768 == this.field7762) {
            this.field7770 = this.field7761[arg1] == null;
            this.field7761[arg1] = class186.field2599;
            return this.field7759[arg1];
        } else if (this.field7762 == 1) {
            this.field7770 = this.field7766 != arg1;
            this.field7766 = arg1;
            return this.field7759[0];
        } else {
            class225 var4 = this.field7761[arg1];
            if (var4 == null) {
                this.field7770 = true;
                if (this.field7756 >= this.field7762) {
                    class225 var5 = (class225) this.field7757.method1017(-85);
                    var4 = new class225(arg1, var5.field3296);
                    this.field7761[var5.field3294] = null;
                    var5.method1525((byte) -99);
                } else {
                    var4 = new class225(arg1, this.field7756);
                    this.field7756++;
                }
                this.field7761[arg1] = var4;
            } else {
                this.field7770 = false;
            }
            this.field7757.method1011(1245184, var4);
            return this.field7759[var4.field3296];
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)[[[I")
    public final int[][][] method3128(byte arg0) {
        field7765++;
        if (this.field7768 != this.field7762) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field7762; var2++) {
            this.field7761[var2] = class186.field2599;
        }
        if (arg0 < 108) {
            this.field7759 = null;
        }
        return this.field7759;
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(B)V")
    public static void method3129(byte arg0) {
        field7760 = null;
        int var1 = 41 / ((arg0 + 1) / 47);
        field7767 = null;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(ILya;II)V")
    public static final void method3130(int arg0, class38 arg1, int arg2, int arg3) {
        class435.field6370 = new class196[arg2][arg0];
        field7758++;
        class326.field4576 = arg1;
        if (class154.field2184 != null) {
            class162.field2294 = class178.method1253(class154.field2184[4], class154.field2184[2], class154.field2184[5], class154.field2184[0], class154.field2184[3], class154.field2184[1], -1101853054);
        }
        class206.field3000 = new class196();
        int var4 = 24 / ((arg3 - 6) / 58);
        class162.method1139((byte) 60);
    }

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "(B)V")
    public final void method3131(byte arg0) {
        if (arg0 != 56) {
            return;
        }
        for (int var2 = 0; var2 < this.field7762; var2++) {
            this.field7759[var2][0] = null;
            this.field7759[var2][1] = null;
            this.field7759[var2][2] = null;
            this.field7759[var2] = null;
        }
        field7764++;
        this.field7759 = null;
        this.field7761 = null;
        this.field7757.method1016(-63);
        this.field7757 = null;
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(III)V")
    public class530(int arg0, int arg1, int arg2) {
        this.field7762 = arg0;
        this.field7768 = arg1;
        this.field7761 = new class225[this.field7768];
        this.field7759 = new int[this.field7762][3][arg2];
    }
}
