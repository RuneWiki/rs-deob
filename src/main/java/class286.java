import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class286 {

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    private int field3944 = -1;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    private int field3935 = 0;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "Ltc;")
    private class196 field3946 = new class196();

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "Z")
    public boolean field3950 = false;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "I")
    private int field3949;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    private int field3933;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "[[[I")
    private int[][][] field3936;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "[Lho;")
    private class82[] field3938;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public static int field3940 = 0;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field3937 = 0;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "[I")
    public static int[] field3941 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "Ltc;")
    public static class196 field3939 = new class196();

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "Lrg;")
    public static class383 field3947;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZLqj;)V")
    public static final void method1847(boolean arg0, class296 arg1) {
        if (!arg0) {
            method1847(false, (class296) null);
        }
        field3948++;
        class233.field3147 = arg1;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BI)[[I")
    public final int[][] method1848(byte arg0, int arg1) {
        if (arg0 != 63) {
            method1851((byte) 46);
        }
        field3934++;
        if (this.field3949 == this.field3933) {
            this.field3950 = this.field3938[arg1] == null;
            this.field3938[arg1] = class61.field923;
            return this.field3936[arg1];
        } else if (this.field3949 == 1) {
            this.field3950 = this.field3944 != arg1;
            this.field3944 = arg1;
            return this.field3936[0];
        } else {
            class82 var3 = this.field3938[arg1];
            if (var3 == null) {
                this.field3950 = true;
                if (this.field3935 < this.field3949) {
                    var3 = new class82(arg1, this.field3935);
                    this.field3935++;
                } else {
                    class82 var4 = (class82) this.field3946.method1313(-14122);
                    var3 = new class82(arg1, var4.field1262);
                    this.field3938[var4.field1263] = null;
                    var4.method2459(198);
                }
                this.field3938[arg1] = var3;
            } else {
                this.field3950 = false;
            }
            this.field3946.method1307(var3, -4);
            return this.field3936[var3.field1262];
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
    public final void method1849(byte arg0) {
        if (arg0 != 1) {
            return;
        }
        for (int var2 = 0; var2 < this.field3949; var2++) {
            this.field3936[var2][0] = null;
            this.field3936[var2][1] = null;
            this.field3936[var2][2] = null;
            this.field3936[var2] = null;
        }
        field3932++;
        this.field3938 = null;
        this.field3936 = null;
        this.field3946.method1315(120);
        this.field3946 = null;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)[[[I")
    public final int[][][] method1850(byte arg0) {
        if (arg0 >= -11) {
            method1851((byte) 109);
        }
        field3942++;
        if (this.field3949 != this.field3933) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field3949; var2++) {
            this.field3938[var2] = class61.field923;
        }
        return this.field3936;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(B)V")
    public static void method1851(byte arg0) {
        if (arg0 > -7) {
            field3939 = null;
        }
        field3941 = null;
        field3939 = null;
        field3947 = null;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(III)V")
    public class286(int arg0, int arg1, int arg2) {
        this.field3949 = arg0;
        this.field3933 = arg1;
        this.field3936 = new int[this.field3949][3][arg2];
        this.field3938 = new class82[this.field3933];
    }
}
