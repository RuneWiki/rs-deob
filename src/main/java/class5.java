import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 {

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    private int field43 = -1;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    private int field53 = 0;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "Lsr;")
    private class167 field42 = new class167();

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "Z")
    public boolean field57 = false;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    private int field49;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    private int field44;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "[Lbv;")
    private class202[] field51;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "[[[I")
    private int[][][] field56;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "[Lkv;")
    public static class178[] field46 = new class178[16];

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "[[I")
    public static int[][] field54;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method27(int arg0) {
        field47++;
        if (this.field49 != this.field44) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field49; var2++) {
            this.field51[var2] = class325.field4323;
        }
        return this.field56;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)[[I")
    public final int[][] method28(byte arg0, int arg1) {
        int var3 = -88 / ((-arg0 - 6) / 52);
        field48++;
        if (this.field49 == this.field44) {
            this.field57 = this.field51[arg1] == null;
            this.field51[arg1] = class325.field4323;
            return this.field56[arg1];
        } else if (this.field49 == 1) {
            this.field57 = this.field43 != arg1;
            this.field43 = arg1;
            return this.field56[0];
        } else {
            class202 var4 = this.field51[arg1];
            if (var4 == null) {
                this.field57 = true;
                if (this.field53 < this.field49) {
                    var4 = new class202(arg1, this.field53);
                    this.field53++;
                } else {
                    class202 var5 = (class202) this.field42.method981(106);
                    var4 = new class202(arg1, var5.field2687);
                    this.field51[var5.field2684] = null;
                    var5.method2674(true);
                }
                this.field51[arg1] = var4;
            } else {
                this.field57 = false;
            }
            this.field42.method971(12, var4);
            return this.field56[var4.field2687];
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public static void method29(int arg0) {
        int var1 = 35 % ((-arg0 - 62) / 44);
        field46 = null;
        field54 = null;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
    public static final void method30(int arg0) {
        field45++;
        try {
            if (class97.field1260 == 1) {
                int var1 = class246.field3235.method590(arg0 - 107);
                if (var1 > 0 && class246.field3235.method575(false)) {
                    int var2 = var1 - class337.field4464;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class246.field3235.method595(var2, 10542);
                    return;
                }
                class246.field3235.method593(16256);
                class246.field3235.method598(-21547);
                class385.field5597 = null;
                if (class476.field7045 == null) {
                    class97.field1260 = 0;
                } else {
                    class97.field1260 = 2;
                }
                class462.field6888 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class246.field3235.method593(16256);
            class476.field7045 = null;
            class97.field1260 = 0;
            class385.field5597 = null;
            class462.field6888 = null;
        }
        if (arg0 != 0) {
            field46 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
    public final void method31(int arg0) {
        field50++;
        if (arg0 != 22531) {
            method29(18);
        }
        for (int var2 = 0; var2 < this.field49; var2++) {
            this.field56[var2][0] = null;
            this.field56[var2][1] = null;
            this.field56[var2][2] = null;
            this.field56[var2] = null;
        }
        this.field56 = null;
        this.field51 = null;
        this.field42.method984(false);
        this.field42 = null;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(III)V")
    public class5(int arg0, int arg1, int arg2) {
        this.field49 = arg0;
        this.field44 = arg1;
        this.field51 = new class202[this.field44];
        this.field56 = new int[this.field49][3][arg2];
    }
}
