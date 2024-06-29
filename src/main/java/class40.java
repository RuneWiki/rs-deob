import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class40 {

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    private int field538 = -1;

    @OriginalMember(owner = "client!nr", name = "p", descriptor = "I")
    private int field551 = 0;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "Lwo;")
    private class522 field540 = new class522();

    @OriginalMember(owner = "client!nr", name = "s", descriptor = "Z")
    public boolean field554 = false;

    @OriginalMember(owner = "client!nr", name = "j", descriptor = "I")
    private int field545;

    @OriginalMember(owner = "client!nr", name = "o", descriptor = "I")
    private int field550;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "[Lju;")
    private class81[] field539;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "[[I")
    private int[][] field536;

    @OriginalMember(owner = "client!nr", name = "i", descriptor = "I")
    public static int field544 = 10;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "Lfg;")
    public static class83 field537 = new class83("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!nr", name = "r", descriptor = "F")
    public static float field553 = 0.0F;

    @OriginalMember(owner = "client!nr", name = "q", descriptor = "Ltk;")
    public static class228 field552 = new class228(9, 0, 4, 1);

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!nr", name = "k", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!nr", name = "l", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!nr", name = "m", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!nr", name = "n", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "Ljava/awt/Image;")
    public static Image field542;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
    public final void method252(int arg0) {
        field547++;
        for (int var2 = 0; var2 < this.field545; var2++) {
            this.field536[var2] = null;
        }
        this.field536 = null;
        this.field539 = null;
        this.field540.method3076((byte) -89);
        int var3 = -20 % ((arg0 - 26) / 37);
        this.field540 = null;
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)[[I")
    public final int[][] method253(int arg0) {
        field548++;
        if (this.field550 != this.field545) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field545; var2++) {
            this.field539[var2] = class186.field2584;
        }
        return this.field536;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILlh;I)Ljava/lang/String;")
    public static final String method254(int arg0, class365 arg1, int arg2) {
        field541++;
        try {
            if (arg0 != 9) {
                field552 = null;
            }
            int var3 = arg1.method2065(false);
            if (arg2 < var3) {
                var3 = arg2;
            }
            byte[] var4 = new byte[var3];
            arg1.field5069 += class245.field3415.method2197(arg1.field5069, var4, var3, -128, 0, arg1.field5073);
            return class49.method309(var4, 0, var3, 94);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)V")
    public static void method255(byte arg0) {
        field542 = null;
        field537 = null;
        if (arg0 != 88) {
            field542 = null;
        }
        field552 = null;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)[I")
    public final int[] method256(int arg0, int arg1) {
        if (arg1 != -30359) {
            this.method256(51, 75);
        }
        field546++;
        if (this.field550 == this.field545) {
            this.field554 = this.field539[arg0] == null;
            this.field539[arg0] = class186.field2584;
            return this.field536[arg0];
        } else if (this.field545 == 1) {
            this.field554 = this.field538 != arg0;
            this.field538 = arg0;
            return this.field536[0];
        } else {
            class81 var3 = this.field539[arg0];
            if (var3 == null) {
                this.field554 = true;
                if (this.field545 <= this.field551) {
                    class81 var4 = (class81) this.field540.method3077((byte) -79);
                    var3 = new class81(arg0, var4.field1144);
                    this.field539[var4.field1145] = null;
                    var4.method2946(-126);
                } else {
                    var3 = new class81(arg0, this.field551);
                    this.field551++;
                }
                this.field539[arg0] = var3;
            } else {
                this.field554 = false;
            }
            this.field540.method3069(var3, arg1 + 30361);
            return this.field536[var3.field1144];
        }
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(III)V")
    public class40(int arg0, int arg1, int arg2) {
        this.field545 = arg0;
        this.field550 = arg1;
        this.field539 = new class81[this.field550];
        this.field536 = new int[this.field545][arg2];
    }
}
