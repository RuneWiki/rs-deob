import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class596 {

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "I")
    private int field8381 = 0;

    @OriginalMember(owner = "client!oca", name = "f", descriptor = "I")
    private int field8383 = -1;

    @OriginalMember(owner = "client!oca", name = "e", descriptor = "Lae;")
    private class40 field8382 = new class40();

    @OriginalMember(owner = "client!oca", name = "o", descriptor = "Z")
    public boolean field8392 = false;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "I")
    private int field8378;

    @OriginalMember(owner = "client!oca", name = "k", descriptor = "I")
    private int field8388;

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "[Lpu;")
    private class236[] field8379;

    @OriginalMember(owner = "client!oca", name = "l", descriptor = "[[I")
    private int[][] field8389;

    @OriginalMember(owner = "client!oca", name = "g", descriptor = "I")
    public static int field8384 = 0;

    @OriginalMember(owner = "client!oca", name = "n", descriptor = "Lrga;")
    public static class280 field8391 = new class280(9, 2);

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "I")
    public static int field8380;

    @OriginalMember(owner = "client!oca", name = "i", descriptor = "I")
    public static int field8386;

    @OriginalMember(owner = "client!oca", name = "j", descriptor = "I")
    public static int field8387;

    @OriginalMember(owner = "client!oca", name = "m", descriptor = "Lbfa;")
    public static class145 field8390;

    @OriginalMember(owner = "client!oca", name = "h", descriptor = "Lf;")
    public static class536 field8385;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IZ)[I")
    public final int[] method3280(int arg0, boolean arg1) {
        field8386++;
        if (!arg1) {
            return null;
        } else if (this.field8388 == this.field8378) {
            this.field8392 = this.field8379[arg0] == null;
            this.field8379[arg0] = class230.field2869;
            return this.field8389[arg0];
        } else if (this.field8378 == 1) {
            this.field8392 = this.field8383 != arg0;
            this.field8383 = arg0;
            return this.field8389[0];
        } else {
            class236 var3 = this.field8379[arg0];
            if (var3 == null) {
                this.field8392 = true;
                if (this.field8378 <= this.field8381) {
                    class236 var4 = (class236) this.field8382.method248(false);
                    var3 = new class236(arg0, var4.field2952);
                    this.field8379[var4.field2950] = null;
                    var4.method1871(-80);
                } else {
                    var3 = new class236(arg0, this.field8381);
                    this.field8381++;
                }
                this.field8379[arg0] = var3;
            } else {
                this.field8392 = false;
            }
            this.field8382.method236(var3, (byte) 7);
            return this.field8389[var3.field2952];
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(B)V")
    public final void method3281(byte arg0) {
        field8387++;
        for (int var2 = 0; var2 < this.field8378; var2++) {
            this.field8389[var2] = null;
        }
        this.field8379 = null;
        if (arg0 != 96) {
            this.method3282(false);
        }
        this.field8389 = null;
        this.field8382.method247(2);
        this.field8382 = null;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(Z)[[I")
    public final int[][] method3282(boolean arg0) {
        field8380++;
        if (this.field8388 != this.field8378) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0) {
            this.field8378 = -15;
        }
        for (int var2 = 0; var2 < this.field8378; var2++) {
            this.field8379[var2] = class230.field2869;
        }
        return this.field8389;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)V")
    public static void method3283(int arg0) {
        if (arg0 != -5518) {
            field8390 = null;
        }
        field8391 = null;
        field8385 = null;
        field8390 = null;
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(III)V")
    public class596(int arg0, int arg1, int arg2) {
        this.field8378 = arg0;
        this.field8388 = arg1;
        this.field8379 = new class236[this.field8388];
        this.field8389 = new int[this.field8378][arg2];
    }
}
